package br.com.bradesco.web.giss.view.bean.controller.cargamassivaaliquota;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.SituacaoRemessaEnum;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

import com.lowagie.text.DocumentException;

/**
 * @nome: CargaMassivaBean.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class CargaMassivaBean {
	
	/**
	 * Navegacao.
	 */
	private static final String CARGA_MASSIVA_CONSULTA_INTEGRACAO = "consultarCargaMassivaIntegracao";
	/**
	 * Navegacao.
	 */
	private static final String CARGA_MASSIVA_DETALHE_INTEGRACAO = "detalharCargaMassivaIntegracao";
	/**
	 * Navegacao.
	 */
	private static final String CARGA_MASSIVA_CONSULTA_ISS_GERENCIAL = "consultarCargaMassivaIssGerencial";
	/**
	 * Navegacao.
	 */
	private static final String CARGA_MASSIVA_DETALHE_ISS_GERENCIAL = "detalharCargaMassivaIssGerencial";
	
	/**
	 * Log.
	 */
	private ILogManager logManager;
	
	private ICargaMassivaAliquotaService cargaMassivaAliquotaServiceImpl;

	private List<SelectItem> listaControle;
	private List<RemessaAliquotaDTO> listaConsulta;
	private List<ItemRemessaAliquotaDTO> listaDetalhe;
	private List<ItemRemessaAliquotaDTO> listaModalIss;
	private Integer itemSelecionado;
	private ManterAliquotaFiltroDTO filtro;
	private RemessaAliquotaDTO dto;
	private Boolean exibirModal = false;
	private Boolean exibirInformacaoIssProprio = false;
	private Boolean exibirInformacaoIssGerencial = false;
	private Boolean exibirDivIssProprio = false;
	
	/**
	 * @nome: inicializarIntegracao
	 * @prop�sito: M�todo respons�vel por inicializarIntegracao.
	 *
	 * @return String
	 */
	public String inicializarIntegracao() {
		limpar();
		setExibirDivIssProprio(Boolean.TRUE);
		return navegarConsulta();
	}
	
	/**
	 * @nome: inicializarIssGerencial
	 * @prop�sito: M�todo respons�vel por inicializarIssGerencial.
	 *
	 * @return String
	 */
	public String inicializarIssGerencial() {
		limpar();
		setExibirDivIssProprio(Boolean.FALSE);
		return navegarConsulta();
	}

	/**
	 * @nome: pesquisar
	 * @prop�sito: M�todo respons�vel por pesquisar.
	 *
	 * @return String
	 */
	public String pesquisar() { 
		return consultar(Boolean.TRUE);
	}
	
	/**
	 * @nome: consultar
	 * @prop�sito: M�todo respons�vel por consultar.
	 *
	 * @param exibirMensagemErro Boolean
	 * @return String
	 */
	private String consultar(Boolean exibirMensagemErro) {
		try {
			setListaControle(new ArrayList<SelectItem>());
			setListaConsulta(new ArrayList<RemessaAliquotaDTO>());
			setItemSelecionado(null);
			if (validarPesquisa()) {
				List<RemessaAliquotaDTO> lista = new ArrayList<RemessaAliquotaDTO>();
				if (getExibirDivIssProprio()) {
					lista = getCargaMassivaAliquotaServiceImpl().listarCargaMassivaIssProprio(getFiltro());
				} else {
					lista = getCargaMassivaAliquotaServiceImpl().listarCargaMassivaIssGerencial(getFiltro());
				}
				
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
		return navegarConsulta();
	}
	
	/**
	 * @nome: solicitarRemessa
	 * @prop�sito: M�todo respons�vel por solicitarRemessa.
	 *
	 * @return CARGA_MASSIVA_CONSULTA_INTEGRACAO | CARGA_MASSIVA_CONSULTA_ISS_GERENCIAL
	 */
	public String solicitarRemessa() {
		try {
			String retorno = getCargaMassivaAliquotaServiceImpl().solicitarRemessa();
	
			BradescoFacesUtils.addInfoModalMessage(retorno, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return navegarConsulta();
	}

	/**
	 * @nome: detalhar
	 * @prop�sito: M�todo respons�vel por detalhar.
	 *
	 * @return String
	 */
	public String detalhar() {
		if(getItemSelecionado() == null) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
		} else {
			setDto(getListaConsulta().get(getItemSelecionado()));
			setListaDetalhe(new ArrayList<ItemRemessaAliquotaDTO>());
			setListaModalIss(new ArrayList<ItemRemessaAliquotaDTO>());
			setExibirModal(Boolean.FALSE);
			setExibirInformacaoIssGerencial(Boolean.FALSE);
			setExibirInformacaoIssProprio(Boolean.FALSE);			
			
			try {
				List<ItemRemessaAliquotaDTO> lista = new ArrayList<ItemRemessaAliquotaDTO>();
				
				if (getExibirDivIssProprio()) {
					lista = getCargaMassivaAliquotaServiceImpl().detalharCargaMassivaIssProprio(getDto());
				} else {
					lista = getCargaMassivaAliquotaServiceImpl().detalharCargaMassivaIssGerencial(getDto());
				}
				
				if (!GissUtil.isEmptyOrNull(lista)) {
					setListaDetalhe(lista);
					setListaModalIss(lista);
				}
				
				return navegarDetalhe();
			} catch (PdcAdapterFunctionalException p) {
				setItemSelecionado(null);
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
				getLogManager().error(this.getClass(), p);
			} catch (Exception e) {
				setItemSelecionado(null);
				GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
				getLogManager().error(this.getClass(), e);
			}
		}
		return navegarConsulta();
	}
	
	/**
	 * @nome: voltar
	 * @prop�sito: M�todo respons�vel por voltar.
	 *
	 * @return String
	 */
	public String voltar() {
		setItemSelecionado(null);
		setDto(new RemessaAliquotaDTO());
		return navegarConsulta();
	}
	
	/**
	 * @nome: exportarTxt
	 * @prop�sito: M�todo respons�vel por exportarTxt.
	 *
	 * @param ae ActionEvent
	 * @return String
	 * @throws DocumentException
	 * @throws IOException
	 */
	public String exportarTxt(ActionEvent ae) throws DocumentException, IOException {
		try {
			if(!GissUtil.isEmptyOrNull(getListaDetalhe())) {
				getCargaMassivaAliquotaServiceImpl().gerarRelatorioCargaMassivaTXT(getDto(), getListaDetalhe(), getExibirDivIssProprio(), FacesUtils.getServletResponse().getOutputStream());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista est� vazia", false);
				return "";
			}
			FacesUtils.getServletResponse().setContentType("application/txt");
			FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=cargaMassiva.txt");
			FacesUtils.getContext().responseComplete();
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: exportarExcel
	 * @prop�sito: M�todo respons�vel por exportarExcel.
	 *
	 * @param ae ActionEvent
	 * @return String
	 */
	public String exportarExcel(ActionEvent ae) {
		try {
			if(!GissUtil.isEmptyOrNull(getListaDetalhe())) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha Carga Massiva de Al�quotas", "PLANILHA_CARGA_MASSIVA");
				exportarPlanilha.planilhaCargaMassiva(getDto(), getListaDetalhe(), getExibirDivIssProprio()); 
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista est� vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: exibirDivergenciasIssGerencial
	 * @prop�sito: M�todo respons�vel por exibirDivergenciasIssGerencial.
	 *
	 * @return String
	 */
	public String exibirDivergenciasIssGerencial() {
		setExibirModal(Boolean.TRUE);
		setExibirInformacaoIssGerencial(Boolean.TRUE);
		setExibirInformacaoIssProprio(Boolean.FALSE);
		return navegarDetalhe();
	}
	
	/**
	 * @nome: exibirDivergenciasIssProprio
	 * @prop�sito: M�todo respons�vel por exibirDivergenciasIssProprio.
	 *
	 * @return String
	 */
	public String exibirDivergenciasIssProprio() {
		setExibirModal(Boolean.TRUE);
		setExibirInformacaoIssGerencial(Boolean.FALSE);
		setExibirInformacaoIssProprio(Boolean.TRUE);
		return navegarDetalhe();
	}
	
	/**
	 * @nome: ocultarDivergenciasIss
	 * @prop�sito: M�todo respons�vel por ocultarDivergenciasIss.
	 *
	 * @return String
	 */
	public String ocultarDivergenciasIss() {
		setExibirModal(Boolean.FALSE);
		setExibirInformacaoIssGerencial(Boolean.FALSE);
		setExibirInformacaoIssProprio(Boolean.FALSE);
		return navegarDetalhe();
	}
	
	/**
	 * @nome: rejeitar
	 * @prop�sito: M�todo respons�vel por rejeitar.
	 *
	 * @return String
	 */
	public String rejeitar() {
		try {
			String retorno = "";
			
			if (getExibirDivIssProprio()) {
				retorno = getCargaMassivaAliquotaServiceImpl().rejeitarIssProprio(getDto());
			} else {
				retorno = getCargaMassivaAliquotaServiceImpl().rejeitarIssGerencial(getDto());
			}
			
			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
			return consultar(Boolean.FALSE);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return navegarDetalhe();
	}
	
	/**
	 * @nome: conferir
	 * @prop�sito: M�todo respons�vel por conferir.
	 *
	 * @return String
	 */
	public String conferir() {
		try {
			String retorno = "";
			
			if (getExibirDivIssProprio()) {
				retorno = getCargaMassivaAliquotaServiceImpl().conferirIssProprio(getDto());
			} else {
				retorno = getCargaMassivaAliquotaServiceImpl().conferirIssGerencial(getDto());
			}
			
			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
			return consultar(Boolean.FALSE);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return navegarDetalhe();
	}
	
	/**
	 * @nome: aprovar
	 * @prop�sito: M�todo respons�vel por aprovar.
	 *
	 * @return String
	 */
	public String aprovar() {
		try {
			String retorno = "";
			
			if (getExibirDivIssProprio()) {
				retorno = getCargaMassivaAliquotaServiceImpl().aprovarIssProprio(getDto());
			} else {
				retorno = getCargaMassivaAliquotaServiceImpl().aprovarIssGerencial(getDto());
			}
	
			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
			return consultar(Boolean.FALSE);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return navegarDetalhe();
	}
	
	/**
	 * @nome: getDesabilitarBotaoRejeitar
	 * @prop�sito: M�todo respons�vel por getDesabilitarBotaoRejeitar.
	 *
	 * @return boolean
	 */
	public boolean getDesabilitarBotaoRejeitar() {
		boolean habilitarBotaoRejeitar = false;
		if (SituacaoRemessaEnum.APROVADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.APROVADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()) {
			habilitarBotaoRejeitar = true;
		}
		return habilitarBotaoRejeitar;
	}
	
	/**
	 * @nome: getDesabilitarBotaoConferir
	 * @prop�sito: M�todo respons�vel por getDesabilitarBotaoConferir.
	 *
	 * @return boolean
	 */
	public boolean getDesabilitarBotaoConferir() {
		boolean habilitarBotaoConferir = false;
		if (SituacaoRemessaEnum.CONFERIDA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.APROVADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.CONFERIDA_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.APROVADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()) {
			habilitarBotaoConferir = true;
		}
		return habilitarBotaoConferir;
	}
	
	/**
	 * @nome: getDesabilitarBotaoAprovar
	 * @prop�sito: M�todo respons�vel por getDesabilitarBotaoAprovar.
	 *
	 * @return boolean
	 */
	public boolean getDesabilitarBotaoAprovar() {
		boolean habilitarBotaoAprovar = false;
		if (SituacaoRemessaEnum.APROVADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.CONSISTENTE_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_PROPRIO == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.APROVADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.CONSISTENTE_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| SituacaoRemessaEnum.REJEITADA_ISS_GERENCIAL == getDto().getSituacaoRemessa()
			|| getDto().getUsuarioConferencia().getCodigo().equals(BradescoCommonServiceFactory.getSessionManager().getSecurityDataBean().getUserId())) {
			habilitarBotaoAprovar = true;
		}
		return habilitarBotaoAprovar;
	}
	
	/**
	 * @nome: validarPesquisa
	 * @prop�sito: M�todo respons�vel por validarPesquisa.
	 *
	 * @return boolean
	 */
	private boolean validarPesquisa() {
		if(GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getMesInicial()))) 
			|| GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getAnoInicial())))) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Compet�ncia Inicial!", false);
			return false;
		} 
		
		if(GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getMesFinal()))) 
			|| GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getAnoFinal())))) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Compet�ncia Final!", false);
			return false;
		}
		return true;
	}

	/**
	 * @nome: limpar
	 * @prop�sito: M�todo respons�vel por limpar.
	 */
	private void limpar() {
		setFiltro(new ManterAliquotaFiltroDTO());
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<RemessaAliquotaDTO>());
		setListaDetalhe(new ArrayList<ItemRemessaAliquotaDTO>());
		setListaModalIss(new ArrayList<ItemRemessaAliquotaDTO>());
		setItemSelecionado(null);
		setDto(new RemessaAliquotaDTO());
		setExibirModal(Boolean.FALSE);
	}
	
	/**
	 * @nome: navegarConsulta
	 * @prop�sito: M�todo respons�vel por navegarConsulta.
	 *
	 * @return String
	 */
	private String navegarConsulta() {
		if (getExibirDivIssProprio()) {
			return CARGA_MASSIVA_CONSULTA_INTEGRACAO;
		} else {
			return CARGA_MASSIVA_CONSULTA_ISS_GERENCIAL;
		}
	}
	
	/**
	 * @nome: navegarDetalhe
	 * @prop�sito: M�todo respons�vel por navegarDetalhe.
	 *
	 * @return String
	 */
	private String navegarDetalhe() {
		if (getExibirDivIssProprio()) {
			return CARGA_MASSIVA_DETALHE_INTEGRACAO;
		} else {
			return CARGA_MASSIVA_DETALHE_ISS_GERENCIAL;
		}
	}

	public ILogManager getLogManager() {
		return logManager;
	}

	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	public List<RemessaAliquotaDTO> getListaConsulta() {
		return listaConsulta;
	}

	public void setListaConsulta(List<RemessaAliquotaDTO> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

	public Integer getItemSelecionado() {
		return itemSelecionado;
	}

	public void setItemSelecionado(Integer itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}

	public ICargaMassivaAliquotaService getCargaMassivaAliquotaServiceImpl() {
		return cargaMassivaAliquotaServiceImpl;
	}

	public void setCargaMassivaAliquotaServiceImpl(
			ICargaMassivaAliquotaService cargaMassivaAliquotaServiceImpl) {
		this.cargaMassivaAliquotaServiceImpl = cargaMassivaAliquotaServiceImpl;
	}

	public RemessaAliquotaDTO getDto() {
		return dto;
	}

	public void setDto(RemessaAliquotaDTO dto) {
		this.dto = dto;
	}

	public List<ItemRemessaAliquotaDTO> getListaDetalhe() {
		return listaDetalhe;
	}

	public void setListaDetalhe(List<ItemRemessaAliquotaDTO> listaDetalhe) {
		this.listaDetalhe = listaDetalhe;
	}

	public ManterAliquotaFiltroDTO getFiltro() {
		return filtro;
	}

	public void setFiltro(ManterAliquotaFiltroDTO filtro) {
		this.filtro = filtro;
	}

	public Boolean getExibirInformacaoIssProprio() {
		return exibirInformacaoIssProprio;
	}

	public void setExibirInformacaoIssProprio(Boolean exibirInformacaoIssProprio) {
		this.exibirInformacaoIssProprio = exibirInformacaoIssProprio;
	}

	public List<ItemRemessaAliquotaDTO> getListaModalIss() {
		return listaModalIss;
	}

	public void setListaModalIss(List<ItemRemessaAliquotaDTO> listaModalIss) {
		this.listaModalIss = listaModalIss;
	}

	public Boolean getExibirInformacaoIssGerencial() {
		return exibirInformacaoIssGerencial;
	}

	public void setExibirInformacaoIssGerencial(Boolean exibirInformacaoIssGerencial) {
		this.exibirInformacaoIssGerencial = exibirInformacaoIssGerencial;
	}

	public Boolean getExibirModal() {
		return exibirModal;
	}

	public void setExibirModal(Boolean exibirModal) {
		this.exibirModal = exibirModal;
	}

	public Boolean getExibirDivIssProprio() {
		return exibirDivIssProprio;
	}

	public void setExibirDivIssProprio(Boolean exibirDivIssProprio) {
		this.exibirDivIssProprio = exibirDivIssProprio;
	}
}
