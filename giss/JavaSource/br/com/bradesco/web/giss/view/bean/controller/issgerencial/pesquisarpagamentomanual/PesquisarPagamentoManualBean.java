package br.com.bradesco.web.giss.view.bean.controller.issgerencial.pesquisarpagamentomanual;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: PesquisarPagamentoManualBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class PesquisarPagamentoManualBean implements Serializable, BuscaMunicipioCallback {
	
	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Log.
	 */
	private ILogManager logManager = null;
	
	private Integer codigosSelecionadosRadio = null;
	private Integer codigosSelecionadosCheckbox = null;
	private List<SelectItem> selectItemPgtos = new ArrayList<SelectItem>();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private LiberarPagtoISSDTO dto = new LiberarPagtoISSDTO();
	private LiberarPagtoISSDTO dtoPgtoManualIndiv = new LiberarPagtoISSDTO();
	private LiberarPagtoISSDTO dtoPgtoLote = new LiberarPagtoISSDTO();
	private EmpresaISSDTO dtoCombo = new EmpresaISSDTO();
	private List<SelectItem> selectItemPgtoManual = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemPgtoLote = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemServicoLC = new ArrayList<SelectItem>();
	private List<CombosISSDTO> comboServico = new ArrayList<CombosISSDTO>(); 
	IUtilidadesService utilidadesServiceImpl = 
		(IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	IEmpresaISSService empresasISSServiceImpl = 
		(IEmpresaISSService) FacesUtils.getManagedBean("empresasISSServiceImpl");
	ILiberarPagtoISSService liberarPagtoISSServiceImpl = 
		(ILiberarPagtoISSService) FacesUtils.getManagedBean("liberarPagtoISSServiceImpl");
	
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private boolean checkTodos = false;
	private boolean mostrarLista = false;
	
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private List<SelectItem> selectlistaEmp = new ArrayList<SelectItem>();
	
	/**
	 * Navegacao.
	 */
	private String NAVEGACAO_PESQUISAR_PAGAMENTO_MANUAL = "pesquisarPagamentoManual";
	/**
	 * Navegacao.
	 */
	private String NAVEGACAO_DETALHAR_PAGAMENTO_MANUAL = "detalharPagtoManualIndividual";
	/**
	 * Navegacao.
	 */
	private String NAVEGACAO_CALCULAR_PAGAMENTO_MANUAL = "calcularPagamentoManual";
	
	
	/**
	 * @nome: inicializar
	 * @propósito: Método responsável por inicializar.
	 *
	 * @return String
	 */
	public String inicializar() {
		dto = new LiberarPagtoISSDTO();
		listaEstados.clear();
		listaDosEstados.clear();
		buscaMunicipio = new BuscaMunicipioBean();
		carregarComboEmpresa();
		carregaComboEstados();
		
		return NAVEGACAO_PESQUISAR_PAGAMENTO_MANUAL;
	}
	
	/**
	 * @nome: carregaComboEstados
	 * @propósito: Método responsável por carregaComboEstados.
	 */
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
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
	 * @nome: processa
	 * @propósito: Método responsável por processa.
	 */
	public void processa() {
		dto.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
	}
	
	/**
	 * @nome: pesquisarMunicipioPgtoManual
	 * @propósito: Método responsável por pesquisarMunicipioPgtoManual.
	 */
	public void pesquisarMunicipioPgtoManual() {
		pesquisarMunicipio();
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 */
	private void pesquisarMunicipio() {
		String uf = null;
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(dto.getEstado().equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	/**
	 * @nome: atribuirTodos
	 * @propósito: Método responsável por atribuirTodos.
	 */
	public void atribuirTodos() {
		if(checkTodos) {
			codigosSelecionadosTabela = new Integer[dto.getLista().size()];
			for (int i = 0; i < dto.getLista().size(); i++) {
				if(i== 100) {
					break;
				}
				codigosSelecionadosTabela[i] = i;
			}
		} else {
			codigosSelecionadosTabela = new Integer[100];
		}
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
			if(dto.getMesPeriodoInicial().equals("") || dto.getAnoPeriodoInicial().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a competência!", false);
				return "";
			} 
			if(dto.getEmpresa() == 0 || dto.getEmpresa() == null) {
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar uma empresa!", false);
				return "";
			}
			if(dto.getCodProduto() == null || dto.getCodProduto() == 0) {
				BradescoFacesUtils.addInfoModalMessage("Obrigatório selecionar um Produto!", false);
				return "";
			}
			
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				pesquisarMunicipioPgtoManual();
				dto.setCodMunicipio(buscaMunicipio.getCodigo());
			} else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
				pesquisarMunicipioPgtoManual();
				return "";
			} else {
				dto.setCodMunicipio(0l);
			}
	
			dto.setLista(new ArrayList<LiberarPagtoISSDTO>());
			selectItemPgtoManual = new ArrayList<SelectItem>();
			codigosSelecionadosTabela = new Integer[1000];
			liberarPagtoISSServiceImpl.listarPagamentoManual(dto);
			if(dto.getLista() != null) {
				selectItemPgtoManual = new ArrayList<SelectItem>();
				for(int i = 0; i < dto.getLista().size(); i++) {
					selectItemPgtoManual.add(new SelectItem(i, " "));
				}
			}
		
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			if (exibirMensagemErro) {
				BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			}
		}
		
		return NAVEGACAO_PESQUISAR_PAGAMENTO_MANUAL; 
	}
	
	/**
	 * @nome: calcularSelecionados
	 * @propósito: Método responsável por calcularSelecionados.
	 *
	 * @return NAVEGACAO_CALCULAR_PAGAMENTO_MANUAL
	 */
	public String calcularSelecionados() {
		if(codigosSelecionadosTabela.length > 0) {
			dto.setEmpresa(dto.getLista().get(0).getEmpresa());
			dto.setCompetencia(dto.getLista().get(0).getCompetencia());
			dto.setCodProduto(dto.getLista().get(0).getCodProduto());
			
			dto.setListaSelecionadosTabela(new ArrayList<LiberarPagtoISSDTO>());
			for(Integer check : codigosSelecionadosTabela) {
				dto.getListaSelecionadosTabela().add(dto.getLista().get(check));
			}
			dto.setQtdeOcorrencias(dto.getListaSelecionadosTabela().size());
			liberarPagtoISSServiceImpl.calcularSelecionadosOuTodos(dto, Boolean.FALSE);
			codigosSelecionadosTabela = new Integer[100];
			
			return NAVEGACAO_CALCULAR_PAGAMENTO_MANUAL; 
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens da lista para o cálculo!", false);
			return "";
		}
	}
	
	/**
	 * @nome: calcularTodos
	 * @propósito: Método responsável por calcularTodos.
	 *
	 * @return NAVEGACAO_CALCULAR_PAGAMENTO_MANUAL
	 */
	public String calcularTodos() {
		if(dto.getLista().size() < 1) {
			BradescoFacesUtils.addInfoModalMessage("Lista vazia! Não é possível realizar o cálculo!", false);
			return "";
		} else {
			dto.setEmpresa(dto.getLista().get(0).getEmpresa());
			dto.setCompetencia(dto.getLista().get(0).getCompetencia());
			dto.setCodProduto(dto.getLista().get(0).getCodProduto());
			
			liberarPagtoISSServiceImpl.calcularSelecionadosOuTodos(dto, Boolean.TRUE);
			codigosSelecionadosTabela = new Integer[100];
			
			return NAVEGACAO_CALCULAR_PAGAMENTO_MANUAL;
		}
	}
	
	/**
	 * @nome: iniciarTelaPgtoManualIndiv
	 * @propósito: Método responsável por Pagto individual.
	 *
	 * @return String
	 */
	public String iniciarTelaPgtoManualIndiv() {
		if(codigosSelecionadosTabela.length == 1) {	
			dtoPgtoManualIndiv = new LiberarPagtoISSDTO();		
			try {
				setDtoPgtoManualIndiv(dto.getLista().get(codigosSelecionadosTabela[0]));
				dto.getLista().add(dto.getLista().get(codigosSelecionadosTabela[0]));
			} catch (Exception e) {
				BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			}
			return NAVEGACAO_DETALHAR_PAGAMENTO_MANUAL;
			
		} else {
			BradescoFacesUtils.addInfoModalMessage("Para pagamento manual individual selecione um registro da lista!", false);
			return "";
		} 
	}
	
	/**
	 * @nome: agendarPgtoIndividual
	 * @propósito: Método responsável por agendarPgtoIndividual.
	 *
	 * @return String
	 */
	public String agendarPgtoIndividual() {
		String msg = liberarPagtoISSServiceImpl.agendarPgtoIndividual(dtoPgtoManualIndiv);
		BradescoFacesUtils.addInfoModalMessage(msg,false);		
		return "";
	}
	
	/**
	 * @nome: agendarSelecionados
	 * @propósito: Método responsável por Pagamento em Lote (agendar somente os selecionados).
	 *
	 * @return String
	 */
	public String agendarSelecionados() {
		if(codigosSelecionadosTabela.length > 0) {
			dto.setTipoAtualizacao("N");
			dto.setEmpresa(dto.getLista().get(0).getEmpresa());
			dto.setCompetencia(dto.getLista().get(0).getCompetencia());
			dto.setCodProduto(dto.getLista().get(0).getCodProduto());
			
			dto.setListaSelecionadosTabela(new ArrayList<LiberarPagtoISSDTO>());
			for(Integer check : codigosSelecionadosTabela) {
				dto.getListaSelecionadosTabela().add(dto.getLista().get(check));
			}
			dto.setQtdeOcorrencias(dto.getListaSelecionadosTabela().size());
			liberarPagtoISSServiceImpl.agendarSelecionadosOuTodos(dto);

			dto.setValorMulta("");
			dto.setValorJuros("");
			
			BradescoFacesUtils.addInfoModalMessage("VALOR(ES) ATUALIZADO(S) E PAGAMENTO(S) REAGENDADO(S) COM SUCESSO!",false);
			
			return consultar(Boolean.FALSE);
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens da lista para o agendamento!", false);
			return "";
		}
	}
	
	//agendar todos (tudo da lista)
	public String agendarTodos() {
		if(dto.getLista().size() < 1) {
			BradescoFacesUtils.addInfoModalMessage("Lista vazia! Não é possível realizar o agendamento!", false);
			return "";
		}
		
		dto.setTipoAtualizacao("S");
		dto.setQtdeOcorrencias(dto.getLista().size());
		dto.setEmpresa(dto.getLista().get(0).getEmpresa());
		dto.setCompetencia(dto.getLista().get(0).getCompetencia());
		dto.setCodProduto(dto.getLista().get(0).getCodProduto());
		
		liberarPagtoISSServiceImpl.agendarSelecionadosOuTodos(dto);
		
		dto.setValorMulta("");
		dto.setValorJuros("");
		
		BradescoFacesUtils.addInfoModalMessage("VALOR(ES) ATUALIZADO(S) E PAGAMENTO(S) REAGENDADO(S) COM SUCESSO!",false);
		
		return consultar(Boolean.FALSE);
	}

	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @return String
	 */
	public String imprimirPlanilha() {
		ExportarPlanilha exportarPlanilha = null;
		try {
			if(dto.getLista().size() >0) {
				exportarPlanilha = new ExportarPlanilha("Planilha Pesquisar Pagamento Manual ", "PESQ_PGTO_MANUAL");
				exportarPlanilha.planilhaPesquisarPagtoManual(dto.getLista());
			} else {
					BradescoFacesUtils.addInfoModalMessage("Lista de pagamento manual vazia", false);
					return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: imprimirPlanilhaCalculo
	 * @propósito: Método responsável por imprimirPlanilhaCalculo.
	 *
	 * @return
	 */
	public String imprimirPlanilhaCalculo() {
		try {
			if(dto.getLista().size() >0) {
				ExportarPlanilha exportarPlanilha = 
					new ExportarPlanilha("Planilha Pesquisar Pagamento Manual Calculo ", "PESQ_PGTO_MANUAL_CALC");
				exportarPlanilha.planilhaPesquisarPagtoManualCalculo(dto.getLista());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista de pagamento manual vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}

	/**
	 * @nome: voltar
	 * @propósito: Método responsável por voltar.
	 *
	 * @return String
	 */
	public String voltar() {
		return consultar(Boolean.FALSE);
	}


	
	public Integer getCodigosSelecionadosRadio() {
		return codigosSelecionadosRadio;
	}
	public void setCodigosSelecionadosRadio(Integer codigosSelecionadosRadio) {
		this.codigosSelecionadosRadio = codigosSelecionadosRadio;
	}
	public List<SelectItem> getSelectItemPgtos() {
		return selectItemPgtos;
	}
	public void setSelectItemPgtos(List<SelectItem> selectItemPgtos) {
		this.selectItemPgtos = selectItemPgtos;
	}
	public Integer getCodigosSelecionadosCheckbox() {
		return codigosSelecionadosCheckbox;
	}
	public void setCodigosSelecionadosCheckbox(Integer codigosSelecionadosCheckbox) {
		this.codigosSelecionadosCheckbox = codigosSelecionadosCheckbox;
	}
	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}
	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}
	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}
	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}
	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}
	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}
	public List<CombosISSDTO> getComboServico() {
		return comboServico;
	}
	public void setComboServico(List<CombosISSDTO> comboServico) {
		this.comboServico = comboServico;
	}
	public LiberarPagtoISSDTO getDto() {
		return dto;
	}
	public void setDto(LiberarPagtoISSDTO dto) {
		this.dto = dto;
	}
	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}
	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}
	public List<SelectItem> getSelectItemServicoLC() {
		return selectItemServicoLC;
	}
	public void setSelectItemServicoLC(List<SelectItem> selectItemServicoLC) {
		this.selectItemServicoLC = selectItemServicoLC;
	}
	public boolean isCheckTodos() {
		return checkTodos;
	}
	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}
	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}
	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}
	public List<SelectItem> getSelectlistaEmp() {
		return selectlistaEmp;
	}
	public void setSelectlistaEmp(List<SelectItem> selectlistaEmp) {
		this.selectlistaEmp = selectlistaEmp;
	}
	public EmpresaISSDTO getDtoCombo() {
		return dtoCombo;
	}
	public void setDtoCombo(EmpresaISSDTO dtoCombo) {
		this.dtoCombo = dtoCombo;
	}
	public boolean isMostrarLista() {
		return mostrarLista;
	}
	public void setMostrarLista(boolean mostrarLista) {
		this.mostrarLista = mostrarLista;
	}
	public LiberarPagtoISSDTO getDtoPgtoManualIndiv() {
		return dtoPgtoManualIndiv;
	}
	public void setDtoPgtoManualIndiv(LiberarPagtoISSDTO dtoPgtoManualIndiv) {
		this.dtoPgtoManualIndiv = dtoPgtoManualIndiv;
	}
	public List<SelectItem> getSelectItemPgtoManual() {
		return selectItemPgtoManual;
	}
	public void setSelectItemPgtoManual(List<SelectItem> selectItemPgtoManual) {
		this.selectItemPgtoManual = selectItemPgtoManual;
	}

	public LiberarPagtoISSDTO getDtoPgtoLote() {
		return dtoPgtoLote;
	}

	public void setDtoPgtoLote(LiberarPagtoISSDTO dtoPgtoLote) {
		this.dtoPgtoLote = dtoPgtoLote;
	}

	public List<SelectItem> getSelectItemPgtoLote() {
		return selectItemPgtoLote;
	}

	public void setSelectItemPgtoLote(List<SelectItem> selectItemPgtoLote) {
		this.selectItemPgtoLote = selectItemPgtoLote;
	}

	public ILogManager getLogManager() {
		return logManager;
	}

	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

}