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

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**@nome: LiberarPagamentoMovimentoBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class LiberarPagamentoMovimentoBean {

	private static final String LIBERAR_PAGAMENTO_CONSULTAR = "consultarLiberarPagamentoIss";

	private ILogManager logManager;
	
	private IMovimentoRetificadorService movimentoRetificadorServiceImpl;
	
	private MovimentoRetificadorFiltroDTO filtro;
	private List<SelectItem> listaControle;
	private List<MovimentoRetificadorDTO> listaConsulta;
	private Integer itemSelecionado;
	
	
	/**
	 * @nome: inicializar
	 * @propósito: Método responsável por inicializar.
	 *
	 * @return
	 */
	public String inicializar() {
		limpar();
		return LIBERAR_PAGAMENTO_CONSULTAR;
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
				
				lista = getMovimentoRetificadorServiceImpl().listarLiberarPagamento(getFiltro());

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
		return LIBERAR_PAGAMENTO_CONSULTAR;
	}
	
	/**
	 * @nome: liberar
	 * @propósito: Método responsável por liberar.
	 *
	 * @return String
	 */
	public String liberar() {
		try {
			if(getItemSelecionado() == null){
				BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
			} else {
				String retorno = "";
				
				MovimentoRetificadorDTO movimentoRetificadorDTO = getListaConsulta().get(getItemSelecionado());
				
				setItemSelecionado(null);

				retorno = getMovimentoRetificadorServiceImpl().liberarPagamentoIss(getFiltro(), movimentoRetificadorDTO);

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
		return LIBERAR_PAGAMENTO_CONSULTAR;
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @return String
	 */
	public String imprimirPlanilha(){
		try {
			if(getListaConsulta().size() > 0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha Liberar Pagamentos ISS - Movimento Retificador e Complementar ", "LIBERAR_PAGTO_ISS_MOV");
				exportarPlanilha.planilhaLiberarPagamentoIssMovimento(getListaConsulta());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Planilha de 'Liberar pagamentos ISS - Movimento Retificador e Complementar' vazia", false);
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
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<MovimentoRetificadorDTO>());
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
