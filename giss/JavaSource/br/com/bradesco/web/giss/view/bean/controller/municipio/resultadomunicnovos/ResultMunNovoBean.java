package br.com.bradesco.web.giss.view.bean.controller.municipio.resultadomunicnovos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.ConsultarMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.IObterDescDependenciaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.bean.ItemDependencia;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.IResultMunNovoService;
import br.com.bradesco.web.giss.service.business.resultmunnovo.IResultMunNovoServiceConstants;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ContaDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.IncluirMunicipioDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultAgenciaMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultMunicipiosNovosDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import com.lowagie.text.DocumentException;

public class ResultMunNovoBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IResultMunNovoService resultMunicNovoImpl; // referente a interface
	private ILogManager logger;
	private List<SelectItem> listaEstado = new ArrayList<SelectItem>();
	private List<ResultMunicipiosNovosDTO> listaMunicipio = new ArrayList<ResultMunicipiosNovosDTO>();
	private List<ResultMunicipiosNovosDTO> listaMunicipioAll = new ArrayList<ResultMunicipiosNovosDTO>();
	private List<SelectItem> listaControlePesquisaMunicipio = new ArrayList<SelectItem>();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<SelectItem> listaControlePesquisaDependenciaMunicipio = new ArrayList<SelectItem>();
	private List<ResultAgenciaMunicipiosNovosDTO> listaAgencia;
	private List<SelectItem> listaControlePesquisaAgencia = new ArrayList<SelectItem>();
	private List<SelectItem> listaTipoServico = new ArrayList<SelectItem>();
	private List<SelectItem> listaTipoIncidencia = new ArrayList<SelectItem>();
	private List<ContaDTO> listaContas = new ArrayList<ContaDTO>();
	private List<SelectItem> listaControlePesquisaContas = new ArrayList<SelectItem>();
	private List<ResultMunicipiosNovosDTO> listaMunicipioNovas;
	private List<ResultAgenciaMunicipiosNovosDTO> agenciaMunicipiosNovosDTO;
	private List<SelectItem> listaControlePesquisa = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> lstLegislacao = new ArrayList<SelectItem>();
	private int codListaPesquisaRadio;
	private Integer codListaPesquisaMunicipioRadio;
	private Integer codListaPesquisaRadioAgencia;
	private int codListaPesquisaRadioConta;
	private int linha;
	private Integer codMunicipioFiltro;
	private String municipioFiltro;
	private String radioMunicipioManter;
	private String codigo;
	private String nome;
	private String uf;
	private String vencimento;
	private String formaPagamento;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;
	private String estadoFiltro;
	private String estadoFiltroPesquisado;
	private String hiddenObrigatoriedade;
	private String tipoServico;
	private String tipoServicoSelecionado;
	private String conta;
	private String razao;
	private String aliquota;
	private String codigoTributo;
	private String dependenciaMunicipioFiltro;
	private String tipoServicoFinal;
	private String agencia;
	private String estadoRecolhimento;
	private String descricaoMunicipio;
	private boolean mostraBotoes;
	private boolean mostraTableAgencia = false;
	private boolean mostraBotoesPesqMunicipio;
	private boolean exibirLabel;
	private boolean exibirCampos;
	private boolean mostraBotoesListaAgencia = false;
	private boolean municipioSelecionado;
	private boolean mostraEstado;
	private boolean mostraBotoesContas;
	private boolean mostraBotoesListaConta;
	private boolean mostraContas;
	private Long codigoPessoaJuridica;
	private Integer pagtoDiaUtil;
	private Integer numeroSequenciaDependencia;
	private String dataVigenciaInicio;
	private String dataVigenciaFim;
	private String codigoAgenciaIncorpDepto;
	private String nomeAgenciaIncorpDepto;
	private String numeroAgencia;
	private String nomeAgencia;
	private String codigoMunicipioAgencia;
	private String descricaoMunicipioAgencia;
	private String municipioagencia;
	private String codigoTributoTela;
	private Long codMunicipioFiltroNovos;
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private BuscaMunicipioBean buscaMunicipioIncorp = new BuscaMunicipioBean();
	private Integer codDepIncorpora; // código da dependência filtro
	private String descDepIncorpora; // descricao da dependência filtro
	private Integer numSeqDepIncorpora;
	private String indiceComboEmpresaIncorpora;
	IObterDescDependenciaService obterDescDependenciaServiceImpl = (IObterDescDependenciaService) FacesUtils.getManagedBean("obterDescDependenciaServiceImpl");
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String estadoResultDepNovasMun; // codigo do estado selecionado
	private String tipo;
	private ItemDependencia dep = new ItemDependencia();
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private Boolean mostraMunicipiosIncorpora;
	private String codigoMunicipioIncorporada;
	private Long codMunicipioIncorp;
	private Long descMunicipioIncorp;
	private String percentualAliquota;
	private String nroLei;
	private String inforComplementar;
	private Integer tipoPesquisa;
	private ConsultarMunicipiosNovosDTO entradaConsultarMunicipiosNovos = null;
	private boolean ultimoRegistroLista;
	private Long codigoMunicipio; 
	private boolean carregaMunicipios = true;
	
	private List<HistoricoMunicipioDTO> listaMunicipiosSemConv = new ArrayList<HistoricoMunicipioDTO>();
	private Set<HistoricoMunicipioDTO> listaMunicipioSelecionados = new TreeSet<HistoricoMunicipioDTO>();
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private boolean checkTodosMunicipios = Boolean.FALSE;
	private boolean checkTodos;
	private Integer municipioLinhaSelecionada;
	
	private Map<Long, Boolean> checked = new HashMap<Long, Boolean>();
    
	
	public String prosseguir() {

		limparCamposIncluir();

		municipioSelecionado = false;

		listaTipoIncidencia = resultMunicNovoImpl.listarTipoIncidencia();
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		// Chama classe de servico para preenchimento do combo de Estados
		// limpa variaveis
		codigoMunicipioAgencia = "";
		descricaoMunicipioAgencia = "";
		municipioagencia = "";
		numeroAgencia = "";
		nomeAgencia = "";
		vencimento = "";
		pagtoDiaUtil = 0;
		formaPagamento = "";
		baseCalculo = "";
		aliquotaPadrao = "";
		tipoIncidencia = "";
		codDepIncorpora = null; // código da dependência filtro
		descDepIncorpora = ""; // descricao da dependência filtro
		numSeqDepIncorpora = 0;
		indiceComboEmpresaIncorpora = "0";
		mostraBotoes = false;
		estadoFiltro = "";
		buscaMunicipio = new BuscaMunicipioBean();
		tipoPesquisa = 1;

		carregaConsultarMunicipio();

		if(getListaMunicipioNovas().size() == 1){
			setUltimoRegistroLista(true);
		}else{
			setUltimoRegistroLista(false);
		}
		
		return "INCLUIR";
	}
	
	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}

	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}

	public void buscaMunicipioManter(){
		tipo = "manter";
		buscaMunicipio(estadoFiltro);
	}

	public void buscaMunicipioIncorp() {
		tipo = "manterIncorp";
		buscaMunicipio(estadoResultDepNovasMun);
	}
	
	public void buscaMunicipio(String estado){
		if(!tipo.equals("manterIncorp")){
			buscaMunicipio.setCallback(this);
			buscaMunicipio.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(estado.equals(listaDosEstados.get(i).getCodigo())) {
					uf = listaDosEstados.get(i).getSigla();
				}	
			}
			buscaMunicipio.setEstado(uf != null?uf:"");
			buscaMunicipio.buscar();
		}else{
			buscaMunicipioIncorp.setCallback(this);
			buscaMunicipioIncorp.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(estado.equals(listaDosEstados.get(i).getCodigo())) {
					uf = listaDosEstados.get(i).getSigla();
				}	
			}
			buscaMunicipioIncorp.setEstado(uf != null?uf:"");
			buscaMunicipioIncorp.buscar();
		}
	}
	
	public void processa() {
		if(tipo.equals("manter")){
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		}else if(tipo.equals("manterIncorp")){
			estadoResultDepNovasMun = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipioIncorp.getUf());
		}
	}

	public void carregarDependenciaIncorporaDepNova() {
		carregarDependencia(indiceComboEmpresaIncorpora, codDepIncorpora);
		setNumSeqDepIncorpora(dep.getNumSeqDependencia());
		setCodDepIncorpora(dep.getCodDependencia());
		setDescDepIncorpora(dep.getDesDependencia());
	}

	public void carregarDependencia(String empresa, Integer codDep) {
		if (codDep != null && codDep != 0) {
			dep = obterDescDependenciaServiceImpl.obterDescDependencia(Long.valueOf(empresa), codDep);
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Dependencia.", false);
			return;
		}

	}

	private void inicializa() {
		codListaPesquisaMunicipioRadio = null;
		listaMunicipio.clear();
		estadoResultDepNovasMun = null;
		codListaPesquisaRadioAgencia = null;
		mostraMunicipiosIncorpora = false;
		buscaMunicipioIncorp = new BuscaMunicipioBean();
		codigoMunicipioIncorporada = null;
		mostraMunicipiosIncorpora = false;
	}

	public String localizarDependenciaManter() {
		inicializa();
		return "PROSSEGUIR_MUNICIPIO";
	}

	public List<SelectItem> carregaComboEstados() {


		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}

	public String pesquisarMunicipioManterRecolhimento() {
		if (buscaMunicipioIncorp.getCodigo() != null && buscaMunicipioIncorp.getCodigo() != 0) {
			buscaMunicipioIncorp();
			codMunicipioIncorp = buscaMunicipioIncorp.getCodigo();
			pesquisarRecolhimento();
			mostraTableAgencia = true;
			return "lista_agencias_municipios_novos";
		} else if (buscaMunicipioIncorp.getDescricao() != null && !buscaMunicipioIncorp.getDescricao().equals("")) {
			buscaMunicipioIncorp();
			return "";
		} else if (!estadoResultDepNovasMun.equals("")) {
			codMunicipioIncorp = buscaMunicipioIncorp.getCodigo()!=null&&buscaMunicipioIncorp.getCodigo()!=0?buscaMunicipioIncorp.getCodigo():0;
			pesquisaMunicipios();
			setExibirCampos(true);
			mostraEstado = true;
			mostraMunicipiosIncorpora = true;
			return "";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou preencha o municipio.", false);
			return "";
		}
	}

	public String procuraCodigoUnidadeFederativaPorSigla(List<EstadosComboBean> listaEstados, String siglaEstado) {

		int tam = listaEstados.size() - 1;

		for (int i = 0; i <= tam; i++) {
			String sigla = listaEstados.get(i).getSigla();
			if (sigla.equals(siglaEstado)) {
				return listaEstados.get(i).getCodigo();
			}
		}

		return "0";
	}

	public void carregaConsultarMunicipio() {

		try {
			
			ResultMunicipiosNovosDTO municipiosNovosDTO = getListaMunicipioNovas().get(new Integer(radioMunicipioManter));

			DetalheMunicipioDTO detalheMunicipioDTO = resultMunicNovoImpl.detalharMunicipio(municipiosNovosDTO.getCodigo(),tipoPesquisa);

			codigo = municipiosNovosDTO.getCodigo();
			nome = municipiosNovosDTO.getNome();
			uf = municipiosNovosDTO.getUf();
			vencimento = detalheMunicipioDTO.getDiaVencimento();

			if (detalheMunicipioDTO.getPagtoDiaUtil().equals("S")) {
				pagtoDiaUtil = IResultMunNovoServiceConstants.PAGAMENTO_DIA_UTIL_SIM;
			} else {
				pagtoDiaUtil = IResultMunNovoServiceConstants.PAGAMENTO_DIA_UTIL_NAO;
			}

			if (detalheMunicipioDTO.getDescFormaPagamento().equals("1")) {
				formaPagamento = IResultMunNovoServiceConstants.FORMA_PAGAMENTO_ANTECIPA;
			} else {
				formaPagamento = IResultMunNovoServiceConstants.FORMA_PAGAMENTO_PRORROGA;
			}

			baseCalculo = detalheMunicipioDTO.getPercentualBaseCalculo();
			aliquotaPadrao = detalheMunicipioDTO.getPercentualAliquotaPadrao();
			tipoIncidencia = detalheMunicipioDTO.getDescTipoIncidencia();
			numeroAgencia = detalheMunicipioDTO.getCodigoDependRespRecolhimento().toString();
			nomeAgencia = detalheMunicipioDTO.getNomeDependRespRecolhimento();
			codigoMunicipioAgencia = detalheMunicipioDTO.getCodigoMunicipio();
			descricaoMunicipioAgencia = detalheMunicipioDTO.getNomeMunicipio();
			codigoPessoaJuridica = Long.valueOf(detalheMunicipioDTO.getCodigoPessoaJuridica());
			numeroSequenciaDependencia = Integer.valueOf(detalheMunicipioDTO.getNumeroSequencialCentralizadora());
			municipioagencia = codigoMunicipioAgencia + " - " + descricaoMunicipioAgencia;

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovos", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String confirmaInclusao() {

		if(!(aliquota != null && !aliquota.equals("") && !aliquota.equals("0") && !aliquota.equals("0,00"))){
			BradescoFacesUtils.addInfoModalMessage("O campo Alíquota é necessário", false);
			return null;
		}

		if (Double.valueOf(aliquota.replace(",", ".")) > 100 || Double.valueOf(aliquota.replace(",", ".")) > 100) {
			BradescoFacesUtils.addInfoModalMessage("Os campos de percentual devem ser menores ou igual a 100.", false);
			return null;
		}

		if (this.codigoTributo == null || this.codigoTributo.trim().equals("")) {
			BradescoFacesUtils.addInfoModalMessage("O campo Código Tributo é necessário", false);
			return null;
		}

		IncluirMunicipioDTO incluirConta = new IncluirMunicipioDTO();
		incluirConta.setAliquotaConta(aliquota);
		incluirConta.setCodigoConta(conta);
		incluirConta.setCodigoMunicipio(String.valueOf(codigo));
		incluirConta.setCodigoTipoServico(tipoServico);
		incluirConta.setCodigoTributo(codigoTributo);
		incluirConta.setDataInicioVigenciaConta(dataVigenciaInicio);
		incluirConta.setDataFinalVigenciaConta(dataVigenciaFim);
		incluirConta.setRazao(razao);

		try {
			DetalheMunicipioDTO detalhe = resultMunicNovoImpl.incluirContasMunicipio(incluirConta);
			listaContas = resultMunicNovoImpl.listarContasTipoServico(String.valueOf(codMunicipioIncorp), tipoServico);
			BradescoFacesUtils.addInfoModalMessage(detalhe.getMensagemErro(), "carrega_contas_municipios_novos", BradescoViewExceptionActionType.ACTION, false);

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "PROSSEGUIR_CONTAS_FINALIZAR", BradescoViewExceptionActionType.ACTION, false);

		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		carregarListaMunicipiosNovos();
		return "resultadoMunicipiosNovos";

	}

	public void iniciarPagina(ActionEvent e) {
		logger.debug(this, "Iniciando a Limpeza da Página.");
		setCodListaPesquisaRadio(-1);
		logger.debug(this, "Finalizando a Limpeza da Página.");
	}

	public String voltar() {
		limparCamposContas();
		carregarListaMunicipiosNovos();
		return "VOLTAR";
	}

	public String voltarNovoMunicipio() {

		limparCamposRecolhimento();

		return "voltar_pesquisa_municipios_novos";
	}

	public String voltarPesquisa() {

		return "voltar_detalhes_municipios_novos";
	}

	public String limparCamposIncluir() {
		setVencimento("");
		setPagtoDiaUtil(null);
		setFormaPagamento("");
		setBaseCalculo("");
		setAliquotaPadrao("");
		setTipoIncidencia("");

		return "LIMPAR_CAMPOS";
	}

	public String limparCamposInform() {

		setAliquota("");
		setCodigoTributo("");

		return "LIMPAR_CAMPOS";
	}

	public String pesquisarMunicipioRecolhimento(ActionEvent evt) {

		pesquisarRecolhimento();

		setAgenciaMunicipiosNovosDTO(agenciaMunicipiosNovosDTO);

		return "PROSSEGUIR";
	}

	public String retornarContasMunicipio() {

		codigoTributoTela = "";
		codigoTributo = "";
		aliquota = "";

		return "carrega_contas_municipios_novos";
	}

	public String finalizarAntes() {

		boolean resp = true;

		if (!vencimento.equals("") && !pagtoDiaUtil.equals("") && !formaPagamento.equals("") && !baseCalculo.equals("") && !aliquotaPadrao.equals("") && !tipoIncidencia.equals("")) {

			if (Double.valueOf(vencimento) > 31) {
				BradescoFacesUtils.addInfoModalMessage("O campo vencimento deve ser menor ou igual a 31.", "voltar_detalhes_municipios_novos", BradescoViewExceptionActionType.ACTION, false);
				return "resultadoMunicipiosNovos";
			} else if (Double.valueOf(baseCalculo.replace(",", ".")) > 100 || Double.valueOf(aliquotaPadrao.replace(",", ".")) > 100) {
				BradescoFacesUtils.addInfoModalMessage("Os campos de percentual devem ser menores ou igual a 100.", "voltar_detalhes_municipios_novos", BradescoViewExceptionActionType.ACTION, false);
				return "resultadoMunicipiosNovos";
			} else {

				municipioFiltro = null;
				listaAgencia = null;
				agenciaMunicipiosNovosDTO = null;
				tipoServico = null;
				listaTipoServico = null;
				carregaComboEstados();
				setExibirCampos(false);
				mostraTableAgencia = false;
				setTipoServico("");
				setListaContas(null);
				setAgenciaMunicipiosNovosDTO(null);
				mostraEstado = false;
				setCodListaPesquisaRadioConta(-1);
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Preencha todos os campos.", "voltar_detalhes_municipios_novos", BradescoViewExceptionActionType.ACTION, false);
			return "resultadoMunicipiosNovos";
		}

		if (resp == true) {

			// chama finalizar
			executaFinalizacaoAntes();

		} else {
			return "voltar_detalhes_municipios_novos";
		}
		return "";
	}

	public void executaFinalizacaoAntes() {

		try {

			IncluirMunicipioDTO incMunicipioDTO = new IncluirMunicipioDTO();

			String pagamentoDiaUtil;

			if (pagtoDiaUtil == 1) {
				pagamentoDiaUtil = "S";
			} else {
				pagamentoDiaUtil = "N";
			}

			incMunicipioDTO.setCodigoFormaPagamento(formaPagamento);
			incMunicipioDTO.setCodigoMunicipio(codigo);
			incMunicipioDTO.setCodigoTipoIncidencia(tipoIncidencia);
			incMunicipioDTO.setDiaVencimento(vencimento);
			incMunicipioDTO.setIndNecessidadePagtoDiaUtil(pagamentoDiaUtil);
			incMunicipioDTO.setCodigoUnidadeOrganizacional(indiceComboEmpresaIncorpora);
			incMunicipioDTO.setNumeroUnidadeOrganizacional(numSeqDepIncorpora.toString());
			incMunicipioDTO.setPercentualAliquotaPadrao(aliquotaPadrao);
			incMunicipioDTO.setPercentualBaseAliquota(baseCalculo);
			if(nroLei == null || "".equals(nroLei)){
				nroLei = "0";
			}
			incMunicipioDTO.setNroLei(nroLei);
			incMunicipioDTO.setInforComplementar(inforComplementar);

			DetalheMunicipioDTO detalheMunicipio = resultMunicNovoImpl.incluirMunicipio(incMunicipioDTO);

			if(!isUltimoRegistroLista()){
				BradescoFacesUtils.addInfoModalMessage(detalheMunicipio.getMensagemErro(), "#{resultMunicNovoBean.recarregaListaMunicipioNovas}", BradescoViewExceptionActionType.ACTION, false);				
			}else{
				BradescoFacesUtils.addInfoModalMessage(detalheMunicipio.getMensagemErro(), "#{resultMunicNovoBean.inicializaResultadoMunicipiosNovos}", BradescoViewExceptionActionType.ACTION, false);
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "INCLUIR", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String recarregaListaMunicipioNovas(){
		
		try {
			
			Integer cdEstado = getEstadoFiltroPesquisado() != null && !getEstadoFiltroPesquisado().equals("") ? 
					Integer.valueOf(getEstadoFiltroPesquisado()) : 0;
			
			listaMunicipioNovas = resultMunicNovoImpl.listarMunicipiosNovos(getCodigoMunicipio(), cdEstado, tipoPesquisa);
			listaMunicipioAll = new ArrayList<ResultMunicipiosNovosDTO>();
			if (listaMunicipioNovas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipioNovas);

				if (listaMunicipioNovas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
		} catch (PdcAdapterFunctionalException p) {
			listaMunicipioNovas = null;
			mostraBotoes = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		
		
		return "resultadoMunicipiosNovos";
	}
	
	public String pesquisaMunicipio() {

		return "SUCESSO_PESQUISAR_AGENCIA";
	}

	public void pesquisaMunicipios() {
		try {
			listaMunicipio = new ArrayList<ResultMunicipiosNovosDTO>();
			listaMunicipio = resultMunicNovoImpl.listarMunicipios(estadoResultDepNovasMun);

			if (listaMunicipio != null) {
				listaControlePesquisaMunicipio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaMunicipio.size(); i++) {
					listaControlePesquisaMunicipio.add(new SelectItem(String.valueOf(i), " "));
				}

				if (listaMunicipio.size() >= IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovosRecolhimento", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String pesquisarMunicipios(ActionEvent evt) {
		pesquisaMunicipios();
		setListaMunicipio(listaMunicipio);
		return "PROSSEGUIR";
	}

	public String prosseguirMunicipios() {
		ResultMunicipiosNovosDTO municipiosNovosDTO = getListaMunicipio().get(getCodListaPesquisaMunicipioRadio());
		setMunicipioFiltro(municipiosNovosDTO.getNome());
		setCodMunicipioFiltro(Integer.parseInt(municipiosNovosDTO.getCodigo()));

		return "PROSSEGUIR";
	}

	public String prosseguirMunicipio() {

		if (!estadoFiltro.equals("")) {
			pesquisaMunicipios();
			setExibirCampos(true);
			estadoRecolhimento = GissUtil.procuraUnidadeFederativa(listaEstado, estadoFiltro);
			ResultMunicipiosNovosDTO municipiosNovosDTO = getListaMunicipioNovas().get(getCodListaPesquisaMunicipioRadio());

			setMunicipioFiltro(municipiosNovosDTO.getNome());

			mostraEstado = true;

		} else {
			BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "voltar_detalhes_municipios_novos", BradescoViewExceptionActionType.ACTION, false);

		}

		return "PROSSEGUIR_MUNICIPIO";
	}

	public String carregaPesquisarRecolhimento() {

		ResultMunicipiosNovosDTO municipiosNovosDTO = getListaMunicipio().get(getCodListaPesquisaMunicipioRadio());
		codMunicipioIncorp = Long.parseLong(municipiosNovosDTO.getCodigo());
		mostraTableAgencia = false;

		pesquisarRecolhimento();

		return "lista_agencias_municipios_novos";
	}

	public void pesquisarRecolhimento() {
		try {

			agenciaMunicipiosNovosDTO = resultMunicNovoImpl.listarDependenciasMunicipio(String.valueOf(codMunicipioIncorp));

			if (agenciaMunicipiosNovosDTO != null) {
				setMostraTableAgencia(true);
				listaControlePesquisaDependenciaMunicipio = new ArrayList<SelectItem>();
				for (int i = 0; i <= agenciaMunicipiosNovosDTO.size(); i++) {
					listaControlePesquisaDependenciaMunicipio.add(new SelectItem(String.valueOf(i), " "));
				}
				this.mostraBotoesListaAgencia = true;

				for (ResultAgenciaMunicipiosNovosDTO municipiosDto : agenciaMunicipiosNovosDTO) {
					this.setCodigoPessoaJuridica(municipiosDto.getCodigoPessoaJuridica());
					this.setNumeroSequenciaDependencia(municipiosDto.getNumeroSequenciaDependencia());
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovosRecolhimento", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	public String limparCamposRecolhimento() {
		mostraTableAgencia = false;
		setTipoServico("");
		setListaContas(null);
		setAgenciaMunicipiosNovosDTO(null);
		mostraEstado = false;
		setCodListaPesquisaRadioConta(-1);
		municipioFiltro = null;
		estadoFiltro = "0";
		return "LIMPAR";
	}

	public String carregaPesquisaListaContas() {

		mostraContas = false;
		listaControlePesquisaContas = new ArrayList<SelectItem>();
		listaTipoServico = new ArrayList<SelectItem>();
		tipoServico = null;

		listaTipoServico = resultMunicNovoImpl.listarTipoServico();

		return "carrega_contas_municipios_novos";
	}

	public String pesquisarContas() {

		try {

			
			codMunicipioIncorp = codigo != null && !codigo.equals("")?Long.valueOf(codigo):0L;

			listaContas = resultMunicNovoImpl.listarContasTipoServico(String.valueOf(codMunicipioIncorp), tipoServico);

			if (listaContas != null) {

				for (int i = 0; i <= listaContas.size(); i++) {
					listaControlePesquisaContas.add(new SelectItem(String.valueOf(i), " "));
				}

				if (listaContas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoesContas = true;
				} else {
					mostraBotoesContas = false;
				}
				mostraContas = true;
			}
			percentualAliquota = null;
		} catch (PdcAdapterFunctionalException p) {
			tipoServico = "";
			mostraContas = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovosContas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return "carrega_contas_municipios_novos";
	}
	
	public void atualizarAliquota() {
		String msg = "";
		try {

			if(percentualAliquota != null && !percentualAliquota.equals("")) {
				msg = resultMunicNovoImpl.atualizarAliquota(Integer.valueOf(tipoServico), codMunicipioIncorp, percentualAliquota);
			}
			else{
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a aliquota.", false);
				return ;
			}
			listaContas = resultMunicNovoImpl.listarContasTipoServico(String.valueOf(codMunicipioIncorp), tipoServico);
			
			
			if (listaContas != null) {

				for (int i = 0; i <= listaContas.size(); i++) {
					listaControlePesquisaContas.add(new SelectItem(String.valueOf(i), " "));
				}

				if (listaContas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoesContas = true;
				} else {
					mostraBotoesContas = false;
				}
				mostraContas = true;
			}
			
			BradescoFacesUtils.addInfoModalMessage(msg, false);
		} catch (PdcAdapterFunctionalException p) {
			tipoServico = "";
			percentualAliquota = null;
			mostraContas = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovosContas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	public String pesquisaListaContas(ActionEvent event) {

		pesquisarContas();
		setListaContas(listaContas);

		return "PROSSEGUIR_CONTAS";
	}

	public String limparCamposContas() {
		setTipoServico("");
		setListaContas(null);
		setCodListaPesquisaRadioConta(-1);
		return "LIMPAR_CAMPOS";

	}

	public String carregaFinalizar() {

		ContaDTO contaDto = getListaContas().get(getCodListaPesquisaRadioConta());
		tipoServicoFinal = GissUtil.procuraTipoServico(listaTipoServico, tipoServico);

		conta = contaDto.getConta();
		codigoTributo = contaDto.getCodigoTributo();
		codigoTributoTela = codigoTributo;
		aliquota = contaDto.getPercentualAliquota();
		dataVigenciaInicio = contaDto.getInicioVigencia();
		dataVigenciaFim = contaDto.getFinalVigencia();
		razao = contaDto.getRazao();

		return "PROSSEGUIR_CONTAS_FINALIZAR";
	}

	public String prosseguirRecolhimento() {

		ResultAgenciaMunicipiosNovosDTO agenciaDto = getAgenciaMunicipiosNovosDTO().get(getCodListaPesquisaRadioAgencia());
		codigoAgenciaIncorpDepto = String.valueOf(agenciaDto.getCodigoPessoaJuridica());
		nomeAgenciaIncorpDepto = String.valueOf(agenciaDto.getNumeroSequenciaDependencia());
		codDepIncorpora = Integer.parseInt(agenciaDto.getAgencia());
		descDepIncorpora = agenciaDto.getNome();
		indiceComboEmpresaIncorpora = agenciaDto.getCodigoPessoaJuridica().toString();
		numSeqDepIncorpora = agenciaDto.getNumeroSequenciaDependencia()!=null?agenciaDto.getNumeroSequenciaDependencia():0;
		
		if(codListaPesquisaMunicipioRadio!=null){
			ResultMunicipiosNovosDTO resMunicipioDTO = listaMunicipio.get(new Integer(codListaPesquisaMunicipioRadio));
			codigoMunicipioAgencia = resMunicipioDTO.getCodigo();
			descricaoMunicipioAgencia = resMunicipioDTO.getNome();
			municipioagencia = codigoMunicipioAgencia + " - " + descricaoMunicipioAgencia;
			codMunicipioIncorp = Long.valueOf(resMunicipioDTO.getCodigo());
			descricaoMunicipioAgencia = resMunicipioDTO.getNome();
		}else{
			codigoMunicipioAgencia = buscaMunicipioIncorp.getCodigo().toString();
			descricaoMunicipioAgencia = buscaMunicipioIncorp.getDescricao();
			municipioagencia = codigoMunicipioAgencia + " - " + descricaoMunicipioAgencia;
			codMunicipioIncorp =  buscaMunicipioIncorp.getCodigo();
			descricaoMunicipioAgencia = buscaMunicipioIncorp.getDescricao();
		}

		numeroAgencia = agenciaDto.getAgencia();
		nomeAgencia = agenciaDto.getNome();

		inicializaContasMunicipios();

		municipioSelecionado = true;

		return "voltar_detalhes_municipios_novos";
	}

	public String limparGridListaContas() {
		setCodListaPesquisaRadioConta(-1);
		setListaContas(null);
		return "";
	}

	public String voltarContasMunicipios() {

		mostraTableAgencia = false;
		percentualAliquota = null;
		setTipoServico("");
		setListaContas(null);
		setAgenciaMunicipiosNovosDTO(null);
		mostraEstado = false;
		setCodListaPesquisaRadioConta(-1);
		municipioFiltro = null;
		estadoFiltro = "0";

		return "voltar_detalhes_municipios_novos";
	}

	public void limparCamposFinalizar() {
		setCodigoTributo("");
		setAliquota("");
	}

	private void listarDependenciasNovas() {

		try {

			listaMunicipioNovas = resultMunicNovoImpl.listarMunicipiosNovos(codMunicipioFiltroNovos != null?codMunicipioFiltroNovos:0L, estadoFiltro!=null&&!estadoFiltro.equals("")?Integer.valueOf(estadoFiltro):0, tipoPesquisa);
			listaMunicipioAll = new ArrayList<ResultMunicipiosNovosDTO>();

			if (listaMunicipioNovas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipioNovas);
				
				if (listaMunicipioNovas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovos", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	public void carregaListaMunicipios(){
		entradaConsultarMunicipiosNovos = new ConsultarMunicipiosNovosDTO();
		entradaConsultarMunicipiosNovos.setCdMunicipio(getBuscaMunicipio().getCodigo());
		entradaConsultarMunicipiosNovos.setCdTela("N");
		entradaConsultarMunicipiosNovos.setCdUf(GissUtil.verificaStringNulaInteger(getEstadoFiltro()));	
		entradaConsultarMunicipiosNovos.setTipoPesquisa(getTipoPesquisa());
		codMunicipioFiltroNovos = 0l;
		
		setCodigoMunicipio(buscaMunicipio.getCodigo());
		setEstadoFiltroPesquisado(getEstadoFiltro());
		
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioManter();
			codMunicipioFiltroNovos = buscaMunicipio.getCodigo();
			listarMunicipiosNovosFiltro();
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioManter();
			return;
		}else if(!estadoFiltro.equals("") && estadoFiltro != null){
			codMunicipioFiltroNovos = buscaMunicipio.getCodigo()!=null&&buscaMunicipio.getCodigo()!=0?buscaMunicipio.getCodigo():0;
			listarMunicipiosNovosFiltro();
		}else{			
			carregarListaMunicipiosNovos();
		}
	}
	
	public void listarMunicipiosNovosFiltro() {

		try {
			
			listaMunicipioNovas = resultMunicNovoImpl.listarMunicipiosNovos(codMunicipioFiltroNovos != null ? codMunicipioFiltroNovos : 0L, estadoFiltro != null && !estadoFiltro.equals("") ? Integer.valueOf(estadoFiltro) : 0, tipoPesquisa);
			listaMunicipioAll = new ArrayList<ResultMunicipiosNovosDTO>();
			if (listaMunicipioNovas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipioNovas);
				
				if (listaMunicipioNovas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoMunicipiosNovos", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public void pesquisarListaDependenciasNovas(ActionEvent evt) {
		listarDependenciasNovas();
		setListaMunicipioNovas(listaMunicipioNovas);
	}

	public void inicializaContasMunicipios() {
		listaTipoServico = resultMunicNovoImpl.listarTipoServico();
		carregaComboEstados();
		setExibirCampos(false);

	}

	public String inicializaResultadoMunicipiosNovos() {
		buscaMunicipioIncorp = new BuscaMunicipioBean();
		buscaMunicipio = new BuscaMunicipioBean();
		estadoFiltro = "0";
		codMunicipioFiltroNovos = null;
		listaMunicipioNovas = null;
		mostraBotoes = false;
		setExibirCampos(false);
		carregaComboEstados();
		tipoPesquisa = 1;
		return "resultadoMunicipiosNovos";
	}
	
	

	public List<ResultMunicipiosNovosDTO> carregarListaMunicipiosNovos() {
		listarDependenciasNovas2();

		return listaMunicipioNovas;
	}

	private void listarDependenciasNovas2() {

		try {

			listaMunicipioNovas = resultMunicNovoImpl.listarMunicipiosNovos(codMunicipioFiltroNovos != null?codMunicipioFiltroNovos:0L, estadoFiltro!=null&&!estadoFiltro.equals("")?Integer.valueOf(estadoFiltro):0, tipoPesquisa);
			listaMunicipioAll = new ArrayList<ResultMunicipiosNovosDTO>();
			if (listaMunicipioNovas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipioNovas);
				
				if (listaMunicipioNovas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
		} catch (PdcAdapterFunctionalException p) {
			listaMunicipioNovas = null;
			mostraBotoes = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public String gerarRelatorioEos(ActionEvent ae){
		try {
			
			String retorno = dependenciaImpl.ConsultarMunicipiosNovos(entradaConsultarMunicipiosNovos);
			
			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	public String imprimirPlanilha(ActionEvent ae){
		try {
			if(listaMunicipioNovas.size() >0){
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Resultado de Municípios Novos", "RESULTADO_MUNICIPIOS_NOVOS");
				exportarPlanilha.planilhaMunicipiosNovos(listaMunicipioNovas);
			}else{
				BradescoFacesUtils.addInfoModalMessage("Lista de municipios vazia", false);
				return"";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	public String consultarTXT() throws DocumentException, IOException {
		if(listaMunicipioNovas.size() >0){
			resultMunicNovoImpl.gerarListaMunicipioTXT(listaMunicipioNovas, FacesUtils.getServletResponse().getOutputStream());
		}else{
			BradescoFacesUtils.addInfoModalMessage("Lista de municipios vazia", false);
			return"";
		}
		FacesUtils.getServletResponse().setContentType("application/txt");
		FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.txt");
		FacesUtils.getContext().responseComplete();
		return null;
	}
	
	public String inicializaSelecMunicipiosSemConv() {
		buscaMunicipioIncorp = new BuscaMunicipioBean();
		buscaMunicipio = new BuscaMunicipioBean();
		estadoFiltro = "0";
		codMunicipioFiltroNovos = null;
		listaMunicipioNovas = null;
		mostraBotoes = false;
		checkTodosMunicipios = false;
		setExibirCampos(false);
		carregaComboEstados();
		tipoPesquisa = 1;
		pesquisarMunicipiosSemConv();
		return "filtroSelecMunicipiosSemConvenio";
	}
	
	public String pesquisarMunicipiosSemConv(){
		
		setCheckTodos(false);
		setListaMunicipioSelecionados(new TreeSet<HistoricoMunicipioDTO>());
		this.listaMunicipiosSemConv = new ArrayList<HistoricoMunicipioDTO>();
		this.listaMunicipiosSemConv = resultMunicNovoImpl.listarMunicipiosSemConvenio(estadoFiltro, buscaMunicipio);

		if (listaMunicipiosSemConv != null) {
			for (int i = 0; i <= listaMunicipiosSemConv.size(); i++) {
				if(i < listaMunicipiosSemConv.size()){
					checked.put(listaMunicipiosSemConv.get(i).getId(), listaMunicipiosSemConv.get(i).getFlagSituacaoMunicipio() ? Boolean.TRUE : Boolean.FALSE);
				}
			}
		}
		
		if (listaMunicipiosSemConv.size() > 0) {
			mostraBotoes = true;
		} else {
			mostraBotoes = false;
		}
		
		return "filtroSelecMunicipiosSemConvenio";
	}
	
	public String paginarMunicipiosSemConv(ActionEvent evt) {
		pesquisarMunicipiosSemConv();
		setListaMunicipiosSemConv(listaMunicipiosSemConv);
		return "filtroSelecMunicipiosSemConvenio";
	}	
	
	public void getFinishedBooks(HashMap<Long, Boolean> listaChecks) {
		setLogger(BradescoCommonServiceFactory.getLogManager());
		getLogger().info(this.getClass(), " passando pelo listaChecks.keySet size ");
		for (Long books : listaChecks.keySet()) {			
			if (books != null) {
				getLogger().info(listaChecks.size(), " passando pelo listaChecks size ");
				Boolean libValue = listaChecks.get(books);
				getLogger().info(listaMunicipiosSemConv.size(), " passando pelo listaMunicipiosSemConv size ");
				listaMunicipiosSemConv.get(getPosicaoPorId(books, listaChecks.size()))
						.setFlagSituacaoMunicipio(libValue ? "1" : "0");
			}
		}
	}
	
	/**
	 * getPosicaoPorId para o listaMunicipiosSemConv
	 * @param id Long da estrutura checked
	 * @return int com posicao da listaMunicipiosSemConv ou -1 se nao achar
	 */
	private int getPosicaoPorId(Long id, int size) {
		int t = listaMunicipiosSemConv.size();
		if (t > size) {
			t = size;
		}
		for(int i = 0; i < t; i++) {
			if(listaMunicipiosSemConv.get(i).getId().equals(id)) {
				return i;
			}
		}
		return 1;
	}
	
	public String incluirMunicipiosSemConv() {
		
		String resultado = "";
		
		getFinishedBooks((HashMap<Long, Boolean>) checked);
		
		resultado = resultMunicNovoImpl.incluirMunicipiosSemConvenio(listaMunicipiosSemConv);
				
		BradescoFacesUtils.addInfoModalMessage(resultado, "#{resultMunicNovoBean.inicializaSelecMunicipiosSemConv}", BradescoViewExceptionActionType.ACTION, false);
	
		return "filtroSelecMunicipiosSemConvenio";
	}	
	
	public void atribuirMunicipioTodos() {
		for (HistoricoMunicipioDTO reproc : getListaMunicipiosSemConv()) {
			reproc.setItemSelecionadoCheckLista(isCheckTodos());
		}
	}

	public void atribuirMunicipio() {
		int tamBlocoMunicipio = getListaMunicipiosSemConv().size();
		if (getMunicipioLinhaSelecionada() != null && getMunicipioLinhaSelecionada() >= 0 && getMunicipioLinhaSelecionada() < tamBlocoMunicipio) {

			HistoricoMunicipioDTO reproc = getListaMunicipiosSemConv().get(getMunicipioLinhaSelecionada());
			if (!reproc.getItemSelecionadoCheckLista()) {
				setCheckTodos(false);
			}
		}
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public List<ResultAgenciaMunicipiosNovosDTO> getAgenciaMunicipiosNovosDTO() {
		return agenciaMunicipiosNovosDTO;
	}

	public void setAgenciaMunicipiosNovosDTO(List<ResultAgenciaMunicipiosNovosDTO> agenciaMunicipiosNovosDTO) {
		this.agenciaMunicipiosNovosDTO = agenciaMunicipiosNovosDTO;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public String getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public String getCodigoTributo() {
		return codigoTributo;
	}

	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}

	public Integer getCodListaPesquisaMunicipioRadio() {
		return codListaPesquisaMunicipioRadio;
	}

	public void setCodListaPesquisaMunicipioRadio(Integer codListaPesquisaMunicipioRadio) {
		this.codListaPesquisaMunicipioRadio = codListaPesquisaMunicipioRadio;
	}

	public int getCodListaPesquisaRadio() {
		return codListaPesquisaRadio;
	}

	public void setCodListaPesquisaRadio(int codListaPesquisaRadio) {
		this.codListaPesquisaRadio = codListaPesquisaRadio;
	}

	public Integer getCodListaPesquisaRadioAgencia() {
		return codListaPesquisaRadioAgencia;
	}

	public int getCodListaPesquisaRadioConta() {
		return codListaPesquisaRadioConta;
	}

	public void setCodListaPesquisaRadioConta(int codListaPesquisaRadioConta) {
		this.codListaPesquisaRadioConta = codListaPesquisaRadioConta;
	}

	public Integer getCodMunicipioFiltro() {
		return codMunicipioFiltro;
	}

	public void setCodMunicipioFiltro(Integer codMunicipioFiltro) {
		this.codMunicipioFiltro = codMunicipioFiltro;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDataVigenciaFim() {
		return dataVigenciaFim;
	}

	public void setDataVigenciaFim(String dataVigenciaFim) {
		this.dataVigenciaFim = dataVigenciaFim;
	}

	public String getDataVigenciaInicio() {
		return dataVigenciaInicio;
	}

	public void setDataVigenciaInicio(String dataVigenciaInicio) {
		this.dataVigenciaInicio = dataVigenciaInicio;
	}

	public String getDependenciaMunicipioFiltro() {
		return dependenciaMunicipioFiltro;
	}

	public void setDependenciaMunicipioFiltro(String dependenciaMunicipioFiltro) {
		this.dependenciaMunicipioFiltro = dependenciaMunicipioFiltro;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public String getEstadoRecolhimento() {
		return estadoRecolhimento;
	}

	public void setEstadoRecolhimento(String estadoRecolhimento) {
		this.estadoRecolhimento = estadoRecolhimento;
	}

	public boolean isExibirCampos() {
		return exibirCampos;
	}

	public void setExibirCampos(boolean exibirCampos) {
		this.exibirCampos = exibirCampos;
	}

	public boolean isExibirLabel() {
		return exibirLabel;
	}

	public void setExibirLabel(boolean exibirLabel) {
		this.exibirLabel = exibirLabel;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getHiddenObrigatoriedade() {
		return hiddenObrigatoriedade;
	}

	public void setHiddenObrigatoriedade(String hiddenObrigatoriedade) {
		this.hiddenObrigatoriedade = hiddenObrigatoriedade;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public List<ResultAgenciaMunicipiosNovosDTO> getListaAgencia() {
		return listaAgencia;
	}

	public void setListaAgencia(List<ResultAgenciaMunicipiosNovosDTO> listaAgencia) {
		this.listaAgencia = listaAgencia;
	}

	public List<ContaDTO> getListaContas() {
		return listaContas;
	}

	public void setListaContas(List<ContaDTO> listaContas) {
		this.listaContas = listaContas;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public List<SelectItem> getListaControlePesquisa() {
		return listaControlePesquisa;
	}

	public void setListaControlePesquisa(List<SelectItem> listaControlePesquisa) {
		this.listaControlePesquisa = listaControlePesquisa;
	}

	public List<SelectItem> getListaControlePesquisaAgencia() {
		return listaControlePesquisaAgencia;
	}

	public void setListaControlePesquisaAgencia(List<SelectItem> listaControlePesquisaAgencia) {
		this.listaControlePesquisaAgencia = listaControlePesquisaAgencia;
	}

	public List<SelectItem> getListaControlePesquisaContas() {
		return listaControlePesquisaContas;
	}

	public void setListaControlePesquisaContas(List<SelectItem> listaControlePesquisaContas) {
		this.listaControlePesquisaContas = listaControlePesquisaContas;
	}

	public List<SelectItem> getListaControlePesquisaDependenciaMunicipio() {
		return listaControlePesquisaDependenciaMunicipio;
	}

	public void setListaControlePesquisaDependenciaMunicipio(List<SelectItem> listaControlePesquisaDependenciaMunicipio) {
		this.listaControlePesquisaDependenciaMunicipio = listaControlePesquisaDependenciaMunicipio;
	}

	public List<SelectItem> getListaControlePesquisaMunicipio() {
		return listaControlePesquisaMunicipio;
	}

	public void setListaControlePesquisaMunicipio(List<SelectItem> listaControlePesquisaMunicipio) {
		this.listaControlePesquisaMunicipio = listaControlePesquisaMunicipio;
	}

	public List<SelectItem> getListaEstado() {
		return listaEstado;
	}

	public void setListaEstado(List<SelectItem> listaEstado) {
		this.listaEstado = listaEstado;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<ResultMunicipiosNovosDTO> getListaMunicipio() {
		return listaMunicipio;
	}

	public void setListaMunicipio(List<ResultMunicipiosNovosDTO> listaMunicipio) {
		this.listaMunicipio = listaMunicipio;
	}

	public List<ResultMunicipiosNovosDTO> getListaMunicipioNovas() {
		return listaMunicipioNovas;
	}

	public void setListaMunicipioNovas(List<ResultMunicipiosNovosDTO> listaMunicipioNovas) {
		this.listaMunicipioNovas = listaMunicipioNovas;
	}

	public List<SelectItem> getListaTipoIncidencia() {
		return listaTipoIncidencia;
	}

	public void setListaTipoIncidencia(List<SelectItem> listaTipoIncidencia) {
		this.listaTipoIncidencia = listaTipoIncidencia;
	}

	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public boolean isMostraBotoesContas() {
		return mostraBotoesContas;
	}

	public void setMostraBotoesContas(boolean mostraBotoesContas) {
		this.mostraBotoesContas = mostraBotoesContas;
	}

	public boolean isMostraBotoesListaAgencia() {
		return mostraBotoesListaAgencia;
	}

	public void setMostraBotoesListaAgencia(boolean mostraBotoesListaAgencia) {
		this.mostraBotoesListaAgencia = mostraBotoesListaAgencia;
	}

	public boolean isMostraBotoesListaConta() {
		return mostraBotoesListaConta;
	}

	public void setMostraBotoesListaConta(boolean mostraBotoesListaConta) {
		this.mostraBotoesListaConta = mostraBotoesListaConta;
	}

	public boolean isMostraBotoesPesqMunicipio() {
		return mostraBotoesPesqMunicipio;
	}

	public void setMostraBotoesPesqMunicipio(boolean mostraBotoesPesqMunicipio) {
		this.mostraBotoesPesqMunicipio = mostraBotoesPesqMunicipio;
	}

	public boolean isMostraEstado() {
		return mostraEstado;
	}

	public void setMostraEstado(boolean mostraEstado) {
		this.mostraEstado = mostraEstado;
	}

	public boolean isMostraTableAgencia() {
		return mostraTableAgencia;
	}

	public void setMostraTableAgencia(boolean mostraTableAgencia) {
		this.mostraTableAgencia = mostraTableAgencia;
	}

	public String getMunicipioFiltro() {
		return municipioFiltro;
	}

	public void setMunicipioFiltro(String municipioFiltro) {
		this.municipioFiltro = municipioFiltro;
	}

	public boolean isMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public void setMunicipioSelecionado(boolean municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroSequenciaDependencia() {
		return numeroSequenciaDependencia;
	}

	public void setNumeroSequenciaDependencia(Integer numeroSequenciaDependencia) {
		this.numeroSequenciaDependencia = numeroSequenciaDependencia;
	}

	public Integer getPagtoDiaUtil() {
		return pagtoDiaUtil;
	}

	public void setPagtoDiaUtil(Integer pagtoDiaUtil) {
		this.pagtoDiaUtil = pagtoDiaUtil;
	}

	public String getRadioMunicipioManter() {
		return radioMunicipioManter;
	}

	public void setRadioMunicipioManter(String radioMunicipioManter) {
		this.radioMunicipioManter = radioMunicipioManter;
	}

	public IResultMunNovoService getResultMunicNovoImpl() {
		return resultMunicNovoImpl;
	}

	public void setResultMunicNovoImpl(IResultMunNovoService resultMunicNovoImpl) {
		this.resultMunicNovoImpl = resultMunicNovoImpl;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getTipoServicoFinal() {
		return tipoServicoFinal;
	}

	public void setTipoServicoFinal(String tipoServicoFinal) {
		this.tipoServicoFinal = tipoServicoFinal;
	}

	public String getTipoServicoSelecionado() {
		return tipoServicoSelecionado;
	}

	public void setTipoServicoSelecionado(String tipoServicoSelecionado) {
		this.tipoServicoSelecionado = tipoServicoSelecionado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getdescricaoMunicipio() {
		return descricaoMunicipio;
	}

	public void setDescricaoMunicipio(String descricaoMunicipio) {
		this.descricaoMunicipio = descricaoMunicipio;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getCodigoAgenciaIncorpDepto() {
		return codigoAgenciaIncorpDepto;
	}

	public void setCodigoAgenciaIncorpDepto(String codigoAgenciaIncorpDepto) {
		this.codigoAgenciaIncorpDepto = codigoAgenciaIncorpDepto;
	}

	public String getNomeAgenciaIncorpDepto() {
		return nomeAgenciaIncorpDepto;
	}

	public boolean isMostraContas() {
		return mostraContas;
	}

	public void setMostraContas(boolean mostraContas) {
		this.mostraContas = mostraContas;
	}

	public void setNomeAgenciaIncorpDepto(String nomeAgenciaIncorpDepto) {
		this.nomeAgenciaIncorpDepto = nomeAgenciaIncorpDepto;
	}

	public String getDescricaoMunicipio() {
		return descricaoMunicipio;
	}

	public String getCodigoTributoTela() {
		return codigoTributoTela;
	}

	public void setCodigoTributoTela(String codigoTributoTela) {
		this.codigoTributoTela = codigoTributoTela;
	}

	public String getCodigoMunicipioAgencia() {
		return codigoMunicipioAgencia;
	}

	public void setCodigoMunicipioAgencia(String codigoMunicipioAgencia) {
		this.codigoMunicipioAgencia = codigoMunicipioAgencia;
	}

	public String getDescricaoMunicipioAgencia() {
		return descricaoMunicipioAgencia;
	}

	public void setDescricaoMunicipioAgencia(String descricaoMunicipioAgencia) {
		this.descricaoMunicipioAgencia = descricaoMunicipioAgencia;
	}

	public String getMunicipioagencia() {
		return municipioagencia;
	}

	public void setMunicipioagencia(String municipioagencia) {
		this.municipioagencia = municipioagencia;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getCodMunicipioFiltroNovos() {
		return codMunicipioFiltroNovos;
	}

	public void setCodMunicipioFiltroNovos(Long codMunicipioFiltroNovos) {
		this.codMunicipioFiltroNovos = codMunicipioFiltroNovos;
	}

	public boolean isMostraMunicipiosIncorpora() {
		return mostraMunicipiosIncorpora;
	}

	public void setMostraMunicipiosIncorpora(boolean mostraMunicipiosIncorpora) {
		this.mostraMunicipiosIncorpora = mostraMunicipiosIncorpora;
	}

	public String getEstadoResultDepNovasMun() {
		return estadoResultDepNovasMun;
	}

	public void setEstadoResultDepNovasMun(String estadoResultDepNovasMun) {
		this.estadoResultDepNovasMun = estadoResultDepNovasMun;
	}

	public ItemDependencia getDep() {
		return dep;
	}

	public void setDep(ItemDependencia dep) {
		this.dep = dep;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public Boolean getMostraMunicipiosIncorpora() {
		return mostraMunicipiosIncorpora;
	}

	public void setMostraMunicipiosIncorpora(Boolean mostraMunicipiosIncorpora) {
		this.mostraMunicipiosIncorpora = mostraMunicipiosIncorpora;
	}

	public String getCodigoMunicipioIncorporada() {
		return codigoMunicipioIncorporada;
	}

	public void setCodigoMunicipioIncorporada(String codigoMunicipioIncorporada) {
		this.codigoMunicipioIncorporada = codigoMunicipioIncorporada;
	}

	public Long getCodMunicipioIncorp() {
		return codMunicipioIncorp;
	}

	public void setCodMunicipioIncorp(Long codMunicipioIncorp) {
		this.codMunicipioIncorp = codMunicipioIncorp;
	}

	public void setCodListaPesquisaRadioAgencia(Integer codListaPesquisaRadioAgencia) {
		this.codListaPesquisaRadioAgencia = codListaPesquisaRadioAgencia;
	}

	public BuscaMunicipioBean getBuscaMunicipioIncorp() {
		return buscaMunicipioIncorp;
	}

	public void setBuscaMunicipioIncorp(BuscaMunicipioBean buscaMunicipioIncorp) {
		this.buscaMunicipioIncorp = buscaMunicipioIncorp;
	}

	public Integer getCodDepIncorpora() {
		return codDepIncorpora;
	}

	public void setCodDepIncorpora(Integer codDepIncorpora) {
		this.codDepIncorpora = codDepIncorpora;
	}

	public String getDescDepIncorpora() {
		return descDepIncorpora;
	}

	public void setDescDepIncorpora(String descDepIncorpora) {
		this.descDepIncorpora = descDepIncorpora;
	}

	public Integer getNumSeqDepIncorpora() {
		return numSeqDepIncorpora;
	}

	public void setNumSeqDepIncorpora(Integer numSeqDepIncorpora) {
		this.numSeqDepIncorpora = numSeqDepIncorpora;
	}

	public String getIndiceComboEmpresaIncorpora() {
		return indiceComboEmpresaIncorpora;
	}

	public void setIndiceComboEmpresaIncorpora(String indiceComboEmpresaIncorpora) {
		this.indiceComboEmpresaIncorpora = indiceComboEmpresaIncorpora;
	}

	public Long getDescMunicipioIncorp() {
		return descMunicipioIncorp;
	}

	public void setDescMunicipioIncorp(Long descMunicipioIncorp) {
		this.descMunicipioIncorp = descMunicipioIncorp;
	}

	public String getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(String percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}

	public String getNroLei() {
		return nroLei;
	}

	public void setNroLei(String nroLei) {
		this.nroLei = nroLei;
	}

	public String getInforComplementar() {
		return inforComplementar;
	}

	public void setInforComplementar(String inforComplementar) {
		this.inforComplementar = inforComplementar;
	}

	public List<SelectItem> getLstLegislacao() {
		return lstLegislacao;
	}

	public void setLstLegislacao(List<SelectItem> lstLegislacao) {
		this.lstLegislacao = lstLegislacao;
	}

    /**
     * @return the razao
     */
    public String getRazao() {
        return razao;
    }

    /**
     * @param razao the razao to set
     */
    public void setRazao(String razao) {
        this.razao = razao;
    }

	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}

	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	/**
	 * @return the buscaMunicipio
	 */
	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	/**
	 * @param buscaMunicipio the buscaMunicipio to set
	 */
	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	/**
	 * @return the listaMunicipioAll
	 */
	public List<ResultMunicipiosNovosDTO> getListaMunicipioAll() {
		return listaMunicipioAll;
	}

	/**
	 * @param listaMunicipioAll the listaMunicipioAll to set
	 */
	public void setListaMunicipioAll(List<ResultMunicipiosNovosDTO> listaMunicipioAll) {
		this.listaMunicipioAll = listaMunicipioAll;
	}

	public boolean isUltimoRegistroLista() {
		return ultimoRegistroLista;
	}

	public void setUltimoRegistroLista(boolean ultimoRegistroLista) {
		this.ultimoRegistroLista = ultimoRegistroLista;
	}

	public ConsultarMunicipiosNovosDTO getEntradaConsultarMunicipiosNovos() {
		return entradaConsultarMunicipiosNovos;
	}

	public void setEntradaConsultarMunicipiosNovos(
			ConsultarMunicipiosNovosDTO entradaConsultarMunicipiosNovos) {
		this.entradaConsultarMunicipiosNovos = entradaConsultarMunicipiosNovos;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getEstadoFiltroPesquisado() {
		return estadoFiltroPesquisado;
	}

	public void setEstadoFiltroPesquisado(String estadoFiltroPesquisado) {
		this.estadoFiltroPesquisado = estadoFiltroPesquisado;
	}

	public List<HistoricoMunicipioDTO> getListaMunicipiosSemConv() {
		return listaMunicipiosSemConv;
	}

	public void setListaMunicipiosSemConv(List<HistoricoMunicipioDTO> listaMunicipiosSemConv) {
		this.listaMunicipiosSemConv = listaMunicipiosSemConv;
	}

	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}

	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}

	public boolean isCheckTodosMunicipios() {
		return checkTodosMunicipios;
	}

	public void setCheckTodosMunicipios(boolean checkTodosMunicipios) {
		this.checkTodosMunicipios = checkTodosMunicipios;
	}

	public Map<Long, Boolean> getChecked() {
		return checked;
	}

	public void setChecked(Map<Long, Boolean> checked) {
		this.checked = checked;
	}

	public boolean isCheckTodos() {
		return checkTodos;
	}

	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}

	public Set<HistoricoMunicipioDTO> getListaMunicipioSelecionados() {
		return listaMunicipioSelecionados;
	}

	public void setListaMunicipioSelecionados(
			Set<HistoricoMunicipioDTO> listaMunicipioSelecionados) {
		this.listaMunicipioSelecionados = listaMunicipioSelecionados;
	}

	public Integer getMunicipioLinhaSelecionada() {
		return municipioLinhaSelecionada;
	}

	public void setMunicipioLinhaSelecionada(Integer municipioLinhaSelecionada) {
		this.municipioLinhaSelecionada = municipioLinhaSelecionada;
	}
}
