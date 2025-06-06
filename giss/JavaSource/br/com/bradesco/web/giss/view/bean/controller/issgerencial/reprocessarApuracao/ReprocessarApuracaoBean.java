/**
 * @nome: br.com.bradesco.web.giss.view.bean.controller.issgerencial.reprocessarApuracao
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 12/05/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.view.bean.controller.issgerencial.reprocessarApuracao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

/**
 * @nome: ReprocessarApuracaoBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ReprocessarApuracaoBean implements Serializable {

	/**
	 * Variável responsável por Serial.
	 */
	private static final long serialVersionUID = -3394073475658221634L;
	
	/**
	 * Navegacao.
	 */
	private String NAVEGACAO = "reprocessarApuracao";

	/**
	 * Log.
	 */
	private ILogManager logManager = null;
	
	private IMovimentoRetificadorService movimentoRetificadorServiceImpl;
	
	private IEmpresaISSService empresasISSServiceImpl = 
		(IEmpresaISSService) FacesUtils.getManagedBean("empresasISSServiceImpl");
	
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private EmpresaISSDTO dtoCombo = new EmpresaISSDTO();
	private MovimentoRetificadorFiltroDTO filtro = null;
	private List<SelectItem> listaControle = null;
	private List<MovimentoRetificadorDTO> listaConsulta = null;
	private Integer itemSelecionado = null;
	
	/**
	 * @nome: inicializar
	 * @propósito: Método responsável por inicializar.
	 *
	 * @return String
	 */
	public String inicializar() {
		setFiltro(new MovimentoRetificadorFiltroDTO());
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<MovimentoRetificadorDTO>());
		setItemSelecionado(null);
		carregarComboEmpresa();
		return NAVEGACAO;
	}
	
	/**
	 * @nome: pesquisar
	 * @propósito: Método responsável por pesquisar.
	 *
	 * @return String
	 */
	public String pesquisar() { 
		return consultar(Boolean.TRUE);
	}
	
	/**
	 * @nome: consultar
	 * @propósito: Método responsável por consultar.
	 *
	 * @param exibirMensagemErro
	 * @return String
	 */
	private String consultar(Boolean exibirMensagemErro) {
		try {
			setListaControle(new ArrayList<SelectItem>());
			setListaConsulta(new ArrayList<MovimentoRetificadorDTO>());
			setItemSelecionado(null);
			if (validarPesquisa()) {
				List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
				
				lista = getMovimentoRetificadorServiceImpl().listarReprocessarApuracao(getFiltro());

				if (!GissUtil.isEmptyOrNull(lista)) {
					setListaConsulta(lista);
					setListaControle(GissUtil.criarSelectItemList(getListaConsulta().size(), 0));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			if (exibirMensagemErro) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			}
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			if (exibirMensagemErro) {
				GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			}
		}
		return NAVEGACAO; 
	}
	
	/**
	 * @nome: reprocessar
	 * @propósito: Método responsável por reprocessar.
	 *
	 * @return String
	 */
	public String reprocessar() {
		String retorno = "";
		MovimentoRetificadorDTO movimentoRetificadorDTO = null;
		
		try {
			if(getItemSelecionado() == null){
				BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
			} else {
				movimentoRetificadorDTO = getListaConsulta().get(getItemSelecionado());
				
				setItemSelecionado(null);

				retorno = getMovimentoRetificadorServiceImpl().reprocessarApuracao(movimentoRetificadorDTO);

				BradescoFacesUtils.addInfoModalMessage(retorno, false);
				
				return consultar(Boolean.FALSE);
			}
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
		}
		return NAVEGACAO;
	}
	
	/**
	 * @nome: validarPesquisa
	 * @propósito: Método responsável por validarPesquisa.
	 *
	 * @return boolean
	 */
	private boolean validarPesquisa() {
		boolean pesquisaValida = true;
		
		if(GissUtil.isEmptyOrNull(getFiltro().getMesCompetencia()) 
			|| GissUtil.isEmptyOrNull(getFiltro().getAnoCompetencia())) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a competência!", false);
			pesquisaValida = false;
		} 
		if(pesquisaValida && GissUtil.isEmptyOrNull(getFiltro().getCodigoEmpresa())) {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar uma empresa!", false);
			pesquisaValida = false;
		}
		if(pesquisaValida && GissUtil.isEmptyOrNull(getFiltro().getCodigoProduto())) {
			BradescoFacesUtils.addInfoModalMessage("Obrigatório selecionar um Produto!", false);
			pesquisaValida = false;
		}
		return pesquisaValida;
	}
	
	/**
	 * @nome: carregarComboEmpresa
	 * @propósito: Método responsável por carregarComboEmpresa.
	 */
	private void carregarComboEmpresa() { 
    	listaEmpresa = new ArrayList<SelectItem>();
    	empresasISSServiceImpl.ListaEmpCadastro(dtoCombo);
    	for (int i = 0; i < dtoCombo.getLista().size(); i++) {
			listaEmpresa.add(new SelectItem(dtoCombo.getLista().get(i).getCodEmpresa(), 
				dtoCombo.getLista().get(i).getCnpjFormatado()+ " - "+dtoCombo.getLista().get(i).getDescEmpresa()));
		}
	}
	
	
	

	/**
	 * @return the logManager
	 */
	public ILogManager getLogManager() {
		return logManager;
	}

	/**
	 * @param logManager the logManager to set
	 */
	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	/**
	 * @return the listaEmpresa
	 */
	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	/**
	 * @param listaEmpresa the listaEmpresa to set
	 */
	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	/**
	 * @return the empresasISSServiceImpl
	 */
	public IEmpresaISSService getEmpresasISSServiceImpl() {
		return empresasISSServiceImpl;
	}

	/**
	 * @param empresasISSServiceImpl the empresasISSServiceImpl to set
	 */
	public void setEmpresasISSServiceImpl(IEmpresaISSService empresasISSServiceImpl) {
		this.empresasISSServiceImpl = empresasISSServiceImpl;
	}

	/**
	 * @return the dtoCombo
	 */
	public EmpresaISSDTO getDtoCombo() {
		return dtoCombo;
	}

	/**
	 * @param dtoCombo the dtoCombo to set
	 */
	public void setDtoCombo(EmpresaISSDTO dtoCombo) {
		this.dtoCombo = dtoCombo;
	}

	/**
	 * @return the movimentoRetificadorServiceImpl
	 */
	public IMovimentoRetificadorService getMovimentoRetificadorServiceImpl() {
		return movimentoRetificadorServiceImpl;
	}

	/**
	 * @param movimentoRetificadorServiceImpl the movimentoRetificadorServiceImpl to set
	 */
	public void setMovimentoRetificadorServiceImpl(
			IMovimentoRetificadorService movimentoRetificadorServiceImpl) {
		this.movimentoRetificadorServiceImpl = movimentoRetificadorServiceImpl;
	}

	/**
	 * @return the filtro
	 */
	public MovimentoRetificadorFiltroDTO getFiltro() {
		return filtro;
	}

	/**
	 * @param filtro the filtro to set
	 */
	public void setFiltro(MovimentoRetificadorFiltroDTO filtro) {
		this.filtro = filtro;
	}

	/**
	 * @return the listaControle
	 */
	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	/**
	 * @param listaControle the listaControle to set
	 */
	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	/**
	 * @return the listaConsulta
	 */
	public List<MovimentoRetificadorDTO> getListaConsulta() {
		return listaConsulta;
	}

	/**
	 * @param listaConsulta the listaConsulta to set
	 */
	public void setListaConsulta(List<MovimentoRetificadorDTO> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

	/**
	 * @return the itemSelecionado
	 */
	public Integer getItemSelecionado() {
		return itemSelecionado;
	}

	/**
	 * @param itemSelecionado the itemSelecionado to set
	 */
	public void setItemSelecionado(Integer itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}
}
