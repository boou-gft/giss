package br.com.bradesco.web.giss.view.bean.controller.issgerencial.liberarpagamento;


import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.issgerencial.consultarpagamentos.ConsultarPagamentosBean;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * @nome: LiberarPagtoISSBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class LiberarPagtoISSBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO = "liberarPagto";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_RETIFICADO = "liberarPagtoIssRetificado";
	private static final String MENSAGEM_LIBERAR_PAGAMENTO = 
		"Liberar Pagamentos ISS (Agendamentos TED/Transferência)";
	private static final String MENSAGEM_LIBERAR_PAGAMENTO_RETIFICADO = 
		"Liberar Pagamentos ISS - Movimento Retificador e Complementar";
	private static final String PLANILHA_LIBERAR_PAGAMENTO = "LIBERAR_PAGTO_ISS";
	private static final String PLANILHA_LIBERAR_PAGAMENTO_RETIFICADO = "LIBERAR_PAGTO_ISS_RET";
	
	
	private ILiberarPagtoISSService liberarPagtoISSServiceImpl; 
	
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private Integer[] codigosSelecionadosPgtosNaoGerados = new Integer[100];
	private LiberarPagtoISSDTO dto = new LiberarPagtoISSDTO();
	private LiberarPagtoISSDTO dtoLiberar = new LiberarPagtoISSDTO();
	private LiberarPagtoISSDTO dtoDetalhar = new LiberarPagtoISSDTO();
	private List<SelectItem> selectItem = new ArrayList<SelectItem>();
	private ListarPgtosVencidosCompBean  listarPgtosVencidosCompBean = new ListarPgtosVencidosCompBean();
	private ListarPgtosNaoGeradosBean listarPgtosNaoGeradosBean = new ListarPgtosNaoGeradosBean();
	private ListarPgtosNaoElegiveisBean listarPgtosNaoElegiveisBean = new ListarPgtosNaoElegiveisBean();
	private ConsultarPagamentosBean consultarPagamentosBean = new ConsultarPagamentosBean();
	private List<SelectItem> selectItemPgtosNaoGerados = new ArrayList<SelectItem>();

	private boolean hiddenProsseguir;
	private boolean checkTodos;
	
	private Boolean exibirMovimentoRetificacao;
	
	/**
	 * @nome: carregarLiberarPagto
	 * @propósito: Método responsável por carregarLiberarPagto.
	 *
	 * @return String
	 */
	public String carregarLiberarPagto() {
		return carregarDadosIniciais(Boolean.FALSE);
	}
	
	/**
	 * @nome: carregarLiberarPagtoRetificado
	 * @propósito: Método responsável por carregarLiberarPagtoRetificado.
	 *
	 * @return String
	 */
	public String carregarLiberarPagtoRetificado() {
		return carregarDadosIniciais(Boolean.TRUE);
	}
	
	/**
	 * @nome: carregarDadosIniciais
	 * @propósito: Método responsável por carregarDadosIniciais.
	 *
	 * @param exibirMovimento
	 * @return String
	 */
	private String carregarDadosIniciais(Boolean exibirMovimento) {
		dto = new LiberarPagtoISSDTO();
		setExibirMovimentoRetificacao(exibirMovimento);		

		codigosSelecionadosTabela = new Integer[100];
		selectItem = new ArrayList<SelectItem>();
		checkTodos = false;
		if (!getExibirMovimentoRetificacao()) {
			String dataCompetencia = GissUtil.geraDataCompetencia();
			dto.setMesPeriodoInicial(dataCompetencia.substring(0,2));
			dto.setAnoPeriodoInicial(dataCompetencia.substring(3));
		}
		return navegarConsulta();
	}
	
	/**
	 * @nome: navegarConsulta
	 * @propósito: Método responsável por navegarConsulta.
	 *
	 * @return String
	 */
	private String navegarConsulta() {
		if (getExibirMovimentoRetificacao()) {
			return NAVEGACAO_LIBERAR_PAGAMENTO_RETIFICADO;
		} else {
			return NAVEGACAO_LIBERAR_PAGAMENTO;
		}
	}
	
	/**
	 * @nome: gerarNomeFuncionalidade
	 * @propósito: Método responsável por gerarNomeFuncionalidade.
	 *
	 * @return String
	 */
	private String gerarNomeFuncionalidade() {
		if (getExibirMovimentoRetificacao()) {
			return MENSAGEM_LIBERAR_PAGAMENTO_RETIFICADO;
		} else {
			return MENSAGEM_LIBERAR_PAGAMENTO;
		}
	}
	
	/**
	 * @nome: gerarNomePlanilha
	 * @propósito: Método responsável por gerarNomePlanilha.
	 *
	 * @return String
	 */
	private String gerarNomePlanilha() {
		if (getExibirMovimentoRetificacao()) {
			return PLANILHA_LIBERAR_PAGAMENTO_RETIFICADO;
		} else {
			return PLANILHA_LIBERAR_PAGAMENTO;
		}
	}
	
	/**
	 * @nome: listar
	 * @propósito: Método responsável por listar.
	 * 
	 * @exception: BradescoViewException
	 */
	private void listar() {
		try {
			dto.setLista(new ArrayList<LiberarPagtoISSDTO>());
			selectItem = new ArrayList<SelectItem>();
			
			if (getExibirMovimentoRetificacao()) {
				dto = liberarPagtoISSServiceImpl.listarLiberarPagamentoRetificado(dto);
			} else {
				dto = liberarPagtoISSServiceImpl.listarLiberarPagamento(dto);
			}

			if (dto.getLista() != null) {
				selectItem = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectItem.add(new SelectItem(i, " "));
				}        
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addErrorModalMessage(p.getMessage());
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	/**
	 * @nome: pesquisar
	 * @propósito: Método responsável por pesquisar.
	 *
	 * @return String
	 */
	public String pesquisar() {
		if(dto.getMesPeriodoInicial().equals("") || dto.getAnoPeriodoInicial().equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Obrigatório preencher mês e ano da competência!", false);
			return "";
		}
		codigosSelecionadosTabela = new Integer[100];
		selectItem = new ArrayList<SelectItem>();
		checkTodos = false;
		listar();
		return "";
	}
	
	/**
	 * @nome: processar
	 * @propósito: Método responsável por processar.
	 *
	 * @return String
	 */
	public String processar() {
		if(dto.getLista().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Lista de " + gerarNomeFuncionalidade() + " vazia.", false);
			return "";
		} 
		
		if(codigosSelecionadosTabela.length > 0) {
			for(int i = 0; i < codigosSelecionadosTabela.length; i++) {
				if(dto.getLista().get(codigosSelecionadosTabela[i]).getStatusEmpresa() == 3) {
					BradescoFacesUtils.addInfoModalMessage("Não é possível liberar! " +
							"A Situação do(s) pagamento(s) já está como 'Liberado Total'.", false);
					return "";
				} 
			}
			
			GissUtil.copiarPropriedadesNaoNulas(dto, dtoLiberar);
			dtoLiberar.setLista(new ArrayList<LiberarPagtoISSDTO>());
			for (Integer check : codigosSelecionadosTabela) {
				dtoLiberar.getLista().add(dto.getLista().get(check));
			}
			String msg = "";
			
			if (getExibirMovimentoRetificacao()) {
				msg = liberarPagtoISSServiceImpl.liberarPagamentoRetificado(dtoLiberar);
			} else {
				msg = liberarPagtoISSServiceImpl.liberarPagamento(dtoLiberar);
			}
			
			BradescoFacesUtils.addInfoModalMessage(msg, false);
			return carregarLiberarPagto();
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
			return "";
		}
	}
	
	/**
	 * @nome: atribuirTodos
	 * @propósito: Método responsável por atribuirTodos.
	 */
	public void atribuirTodos() {
		if (checkTodos) {
			codigosSelecionadosTabela = new Integer[dto.getLista().size()];
			for (int i = 0; i < dto.getLista().size(); i++) {
				if(i == 100) {
					break;
				}
				codigosSelecionadosTabela[i] = i;
			}
		} else {
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @return String
	 */
	public String imprimirPlanilha() {
		try {
			if(dto.getLista().size() > 0) {
				ExportarPlanilha exportarPlanilha = 
					new ExportarPlanilha("Planilha " + gerarNomeFuncionalidade() + " ", gerarNomePlanilha());
				exportarPlanilha.planilhaLiberarPagamentoIss(dto.getLista());
			} else {
				BradescoFacesUtils.addInfoModalMessage(
						"Planilha de ' " + gerarNomeFuncionalidade() + "' vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}

	/**
	 * @nome: limparCheckTodos
	 * @propósito: Método responsável por limparCheckTodos.
	 *
	 * @return String
	 */
	public String limparCheckTodos() {
		checkTodos = false;
		return "";
	}

	/**
	 * @nome: listarPgtosNaoGerados
	 * @propósito: Método responsável por listarPgtosNaoGerados(Sem dados bancários).
	 *
	 * @return String
	 */
	public String listarPgtosNaoGerados() {
		if(dto.getLista().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Lista de " + gerarNomeFuncionalidade() + " vazia.", false);
			return "";
		} 
		
		if(codigosSelecionadosTabela.length != 1) { 
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item da lista!", false);
			return "";
		}	
		
		dtoDetalhar.setLista(new ArrayList<LiberarPagtoISSDTO>());
		dtoDetalhar.setEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getEmpresa());
		dtoDetalhar.setCodIdenticacaoTransIss(dto.getLista().get(codigosSelecionadosTabela[0]).getCodIdenticacaoTransIss());
		dtoDetalhar.setAnoMes(dto.getLista().get(codigosSelecionadosTabela[0]).getAnoMes());
		dtoDetalhar.setNApurcIssEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getNApurcIssEmpresa());
		
		liberarPagtoISSServiceImpl.listarPagtosNaoGerados(dtoDetalhar);
		
		return listarPgtosNaoGeradosBean.inicializar(dtoDetalhar, getExibirMovimentoRetificacao());
	}
	
	/**
	 * @nome: consultarNaoElegiveis
	 * @propósito: Método responsável por consultarNaoElegiveis.
	 *
	 * @return String
	 */
	public String consultarNaoElegiveis() {
		if(dto.getLista().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Lista de " + gerarNomeFuncionalidade() + " vazia.", false);
			return "";
		} 
		
		if(codigosSelecionadosTabela.length != 1) { 
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item da lista!", false);
			return "";
		}	
		
		dtoDetalhar.setLista(new ArrayList<LiberarPagtoISSDTO>());
		dtoDetalhar.setEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getEmpresa());
		dtoDetalhar.setCodIdenticacaoTransIss(dto.getLista().get(codigosSelecionadosTabela[0]).getCodIdenticacaoTransIss());
		dtoDetalhar.setAnoMes(dto.getLista().get(codigosSelecionadosTabela[0]).getAnoMes());
		dtoDetalhar.setNApurcIssEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getNApurcIssEmpresa());
		
		liberarPagtoISSServiceImpl.listarPgtosVencidosComp(dtoDetalhar);
		
		return listarPgtosNaoElegiveisBean.iniciarTela(dtoDetalhar, getExibirMovimentoRetificacao());
	}
	
	/**
	 * @nome: consultarVencidos
	 * @propósito: Método responsável por consultarVencidos.
	 *
	 * @return String
	 */
	public String consultarVencidos() {
		if(dto.getLista().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Lista de " + gerarNomeFuncionalidade() + " vazia.", false);
			return "";
		} 
		
		if(codigosSelecionadosTabela.length != 1) { 
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item da lista!", false);
			return "";
		}	

		dtoDetalhar.setLista(new ArrayList<LiberarPagtoISSDTO>());
		dtoDetalhar.setEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getEmpresa());
		dtoDetalhar.setCodIdenticacaoTransIss(dto.getLista().get(codigosSelecionadosTabela[0]).getCodIdenticacaoTransIss());
		dtoDetalhar.setAnoMes(dto.getLista().get(codigosSelecionadosTabela[0]).getAnoMes());
		dtoDetalhar.setNApurcIssEmpresa(dto.getLista().get(codigosSelecionadosTabela[0]).getNApurcIssEmpresa());
		
		liberarPagtoISSServiceImpl.listarPgtosNaoElegiveis(dtoDetalhar);
		
		return listarPgtosVencidosCompBean.iniciar(dtoDetalhar, getExibirMovimentoRetificacao());
	}
	
	/**
	 * @nome: voltarPagConPagtos
	 * @propósito: Método responsável por voltarPagConPagtos.
	 *
	 * @return String
	 */
	public String voltarPagConPagtos() {
		return "consultarPagamentos";
	}
	
	/**
	 * @nome: exportarTxt
	 * @propósito: Método responsável por exportarTxt.
	 *
	 * @return String
	 */
	public String exportarTxt() {
		return "";
	}

	/**
	 * @return the dto
	 */
	public LiberarPagtoISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(LiberarPagtoISSDTO dto) {
		this.dto = dto;
	}

	/**
	 * @return the hiddenProsseguir
	 */
	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}

	/**
	 * @param hiddenProsseguir the hiddenProsseguir to set
	 */
	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}

	/**
	 * @return the checkTodos
	 */
	public boolean isCheckTodos() {
		return checkTodos;
	}

	/**
	 * @param checkTodos the checkTodos to set
	 */
	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}

	/**
	 * @return the codigosSelecionadosTabela
	 */
	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}

	/**
	 * @param codigosSelecionadosTabela the codigosSelecionadosTabela to set
	 */
	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}

	/**
	 * @return the selectItem
	 */
	public List<SelectItem> getSelectItem() {
		return selectItem;
	}

	/**
	 * @param selectItem the selectItem to set
	 */
	public void setSelectItem(List<SelectItem> selectItem) {
		this.selectItem = selectItem;
	}

	/**
	 * @return the liberarPagtoISSServiceImpl
	 */
	public ILiberarPagtoISSService getLiberarPagtoISSServiceImpl() {
		return liberarPagtoISSServiceImpl;
	}

	/**
	 * @param liberarPagtoISSServiceImpl the liberarPagtoISSServiceImpl to set
	 */
	public void setLiberarPagtoISSServiceImpl(ILiberarPagtoISSService liberarPagtoISSServiceImpl) {
		this.liberarPagtoISSServiceImpl = liberarPagtoISSServiceImpl;
	}

	/**
	 * @return the dtoLiberar
	 */
	public LiberarPagtoISSDTO getDtoLiberar() {
		return dtoLiberar;
	}

	/**
	 * @param dtoLiberar the dtoLiberar to set
	 */
	public void setDtoLiberar(LiberarPagtoISSDTO dtoLiberar) {
		this.dtoLiberar = dtoLiberar;
	}

	public ListarPgtosVencidosCompBean getListarPgtosVencidosCompBean() {
		return listarPgtosVencidosCompBean;
	}

	public void setListarPgtosVencidosCompBean(
			ListarPgtosVencidosCompBean listarPgtosVencidosCompBean) {
		this.listarPgtosVencidosCompBean = listarPgtosVencidosCompBean;
	}

	public ListarPgtosNaoGeradosBean getListarPgtosNaoGeradosBean() {
		return listarPgtosNaoGeradosBean;
	}

	public void setListarPgtosNaoGeradosBean(
			ListarPgtosNaoGeradosBean listarPgtosNaoGeradosBean) {
		this.listarPgtosNaoGeradosBean = listarPgtosNaoGeradosBean;
	}

	public LiberarPagtoISSDTO getDtoDetalhar() {
		return dtoDetalhar;
	}

	public void setDtoDetalhar(LiberarPagtoISSDTO dtoDetalhar) {
		this.dtoDetalhar = dtoDetalhar;
	}

	public List<SelectItem> getSelectItemPgtosNaoGerados() {
		return selectItemPgtosNaoGerados;
	}

	public void setSelectItemPgtosNaoGerados(
			List<SelectItem> selectItemPgtosNaoGerados) {
		this.selectItemPgtosNaoGerados = selectItemPgtosNaoGerados;
	}

	public Integer[] getCodigosSelecionadosPgtosNaoGerados() {
		return codigosSelecionadosPgtosNaoGerados;
	}

	public void setCodigosSelecionadosPgtosNaoGerados(
			Integer[] codigosSelecionadosPgtosNaoGerados) {
		this.codigosSelecionadosPgtosNaoGerados = codigosSelecionadosPgtosNaoGerados;
	}

	public ListarPgtosNaoElegiveisBean getListarPgtosNaoElegiveisBean() {
		return listarPgtosNaoElegiveisBean;
	}

	public void setListarPgtosNaoElegiveisBean(
			ListarPgtosNaoElegiveisBean listarPgtosNaoElegiveisBean) {
		this.listarPgtosNaoElegiveisBean = listarPgtosNaoElegiveisBean;
	}

	public ConsultarPagamentosBean getConsultarPagamentosBean() {
		return consultarPagamentosBean;
	}

	public void setConsultarPagamentosBean(
			ConsultarPagamentosBean consultarPagamentosBean) {
		this.consultarPagamentosBean = consultarPagamentosBean;
	}

	/**
	 * @return the exibirMovimentoRetificacao
	 */
	public Boolean getExibirMovimentoRetificacao() {
		return exibirMovimentoRetificacao;
	}

	/**
	 * @param exibirMovimentoRetificacao the exibirMovimentoRetificacao to set
	 */
	public void setExibirMovimentoRetificacao(Boolean exibirMovimentoRetificacao) {
		this.exibirMovimentoRetificacao = exibirMovimentoRetificacao;
	}
}