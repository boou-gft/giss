/**@nome: br.com.bradesco.web.giss.view.bean.controller.movimentoRetificador
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 25/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.view.bean.controller.movimentoRetificador;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * @nome: ProcessarContabilidadeMovimentoBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ProcessarContabilidadeMovimentoBean {
	
	private static final String PROCESSAR_CONTABILIDADE_CONSULTAR = "consultarProcessarContabilidade";
	private static final String PROCESSAR_CONTABILIDADE_DIFERENCA = "diferencaProcessarContabilidade";

	private ILogManager logManager;
	
	private IMovimentoRetificadorService movimentoRetificadorServiceImpl;
	
	private MovimentoRetificadorFiltroDTO filtro;
	private List<SelectItem> listaControle;
	private List<MovimentoRetificadorDTO> listaConsulta;
	private List<MovimentoRetificadorDTO> listaDetalhe;
	private Integer itemSelecionado;
	private MovimentoRetificadorDTO dto;
	
	
	/**
	 * @nome: inicializar
	 * @propósito: Método responsável por inicializar.
	 *
	 * @return
	 */
	public String inicializar() {
		limpar();
		return PROCESSAR_CONTABILIDADE_CONSULTAR;
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
	 * @param exibirMensagemErro Boolean
	 * @return String
	 */
	private String consultar(Boolean exibirMensagemErro) {
		try {
			setListaControle(new ArrayList<SelectItem>());
			setListaConsulta(new ArrayList<MovimentoRetificadorDTO>());
			setItemSelecionado(null);
			if (validarPesquisa()) {
				List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
				
				lista = getMovimentoRetificadorServiceImpl().listarProcessarContabilidade(getFiltro());

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
		return PROCESSAR_CONTABILIDADE_CONSULTAR;
	}
	
	/**
	 * @nome: processar
	 * @propósito: Método responsável por processar.
	 *
	 * @return String
	 */
	public String processar() {
		try {
			if(getItemSelecionado() == null) {
				BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
			} else {
				String retorno = "";
				
				MovimentoRetificadorDTO movimentoRetificadorDTO = getListaConsulta().get(getItemSelecionado());
				
				setItemSelecionado(null);

				retorno = getMovimentoRetificadorServiceImpl().processarContabilidade(getFiltro(), movimentoRetificadorDTO);

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
		return PROCESSAR_CONTABILIDADE_CONSULTAR;
	}
	
	/**
	 * @nome: gerarDiferencasContabeis
	 * @propósito: Método responsável por gerarDiferencasContabeis.
	 *
	 * @return String
	 */
	public String gerarDiferencasContabeis() {
		try {
			if(getItemSelecionado() == null) {
				BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
			} else {
				MovimentoRetificadorDTO movimentoRetificadorDTO = getListaConsulta().get(getItemSelecionado());
				List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
				
				setItemSelecionado(null);
				
				setDto(movimentoRetificadorDTO);

				lista = getMovimentoRetificadorServiceImpl().listarDiferencasContabeis(getFiltro(), getDto());
				
				if (!GissUtil.isEmptyOrNull(lista)) {
					setListaDetalhe(lista);
				}
				
				return PROCESSAR_CONTABILIDADE_DIFERENCA;
			}
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
		}
		return PROCESSAR_CONTABILIDADE_CONSULTAR;
	}
	
	/**
	 * @nome: voltar
	 * @propósito: Método responsável por voltar.
	 *
	 * @return String
	 */
	public String voltar() {
		setItemSelecionado(null);
		setDto(new MovimentoRetificadorDTO());
		setListaDetalhe(new ArrayList<MovimentoRetificadorDTO>());
		return PROCESSAR_CONTABILIDADE_CONSULTAR;
	}
	
	/**
	 * @nome: exportarExcel
	 * @propósito: Método responsável por exportarExcel.
	 *
	 * @param ae ActionEvent
	 * @return String
	 */
	public String exportarExcel(ActionEvent ae) {
		try {
			if(!GissUtil.isEmptyOrNull(getListaDetalhe())) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha Diferenças Contábeiis Movimento Retificado", "DIF_MOV_RETIFICADO");
				exportarPlanilha.planilhaDiferencaContabilMovimentoRetificado(getDto(), getListaDetalhe()); 
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista está vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}

	/**
	 * @nome: validarPesquisa
	 * @propósito: Método responsável por validarPesquisa.
	 *
	 * @return boolean
	 */
	private boolean validarPesquisa() {
		if(GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getMesCompetencia()))) 
			|| GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getAnoCompetencia())))) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Competência!", false);
			return false;
		}
		return true;
	}
	
	/**
	 * @nome: limpar
	 * @propósito: Método responsável por limpar.
	 */
	private void limpar() {
		setFiltro(new MovimentoRetificadorFiltroDTO());
		setDto(new MovimentoRetificadorDTO());
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<MovimentoRetificadorDTO>());
		setListaDetalhe(new ArrayList<MovimentoRetificadorDTO>());
		setItemSelecionado(null);
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
	 * @return the listaDetalhe
	 */
	public List<MovimentoRetificadorDTO> getListaDetalhe() {
		return listaDetalhe;
	}

	/**
	 * @param listaDetalhe the listaDetalhe to set
	 */
	public void setListaDetalhe(List<MovimentoRetificadorDTO> listaDetalhe) {
		this.listaDetalhe = listaDetalhe;
	}

	/**
	 * @return the dto
	 */
	public MovimentoRetificadorDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(MovimentoRetificadorDTO dto) {
		this.dto = dto;
	}
}
