package br.com.bradesco.web.giss.view.bean.controller.dependencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasMunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasNovasDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean.DependeciasEncerradasDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.IObterDescDependenciaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.bean.ItemDependencia;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class DependenciaBean implements Serializable, BuscaMunicipioCallback {

	private static final long serialVersionUID = 1L;
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private BuscaMunicipioBean buscaMunicipioIncorp = new BuscaMunicipioBean();
	private ILogManager logger; // log
	private IDependenciaService dependenciaImpl; // referente a interface
	private String estadoFiltro; // codigo do estado selecionado
	private String municipioFiltro; // codigo do município selecionado
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	public List<SelectItem> listaEstados = new ArrayList<SelectItem>(); // lista do combo de estados
	public List<SelectItem> selectItemLista = new ArrayList<SelectItem>(); // lista do combo de estados
	public List<SelectItem> selectItemListaCont = new ArrayList<SelectItem>(); // lista do combo de estados
	public List<DependenciasNovasDTO> listaDependenciasNovas = new ArrayList<DependenciasNovasDTO>(); // lista de dependencias novas
	private List<DependenciasMunicipioDTO> listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>(); // lista dependencias por municipio
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>(); // lista de componentes radio/check
	private List<MunicipioDTO> listaMunicipios = new ArrayList<MunicipioDTO>(); // lista de municipios
	private List<AgenciaDTO> listaAgencias = new ArrayList<AgenciaDTO>(); // lista de agências
	private boolean mostraMunicipios; // mostra ou não a lista dos municipios
	private boolean mostraDependencias; // mostra ou não a lista das dependências novas
	private boolean mostraAgencias; // mostra ou não a lista das agências
	private boolean mostraBotoes; // mostra ou não botões de paginação
	private boolean municipioSelecionado; // municipio selecionado
	private String codListaPesquisar; // código da dependencia selecionada
	private String codListaPesquisarAgencia; // código da agencia selecionada
	private String codListaPesquisarMunicipio; // código do municipio selecionado
	private String codListaPesquisarMunicipioProx;
	private String codigoDependencia; // código da dependência
	private String descricaoDependencia; // descricao da dependência
	private String cnpj; // cnpj
	private String dataAbertura; // data de abertura
	private String dataAtualizacao;
	private String tragSemTrag = "N";
	private String dataEncerramento; // data de encerramento
	private String agenciaIncorporadora; // agencia incorporadora
	private String logradouro; // logradouro
	private String numero; // número
	private String municipio; // municipio
	private String municipioagencia;
	private String estado; // unidade federativa
	private String codigoMunicipio; // variavel auxiliar para guardar código do munipio
	private String codigoEstado; // variavel auxiliar para guardar codigo do estado
	private String nomeMunicipio; // variavel auxiliar para guardar nome do munipio
	private String nomeEstado; // variavel auxiliar para guardar nome do estado
	private String estadoMunicIncorpDepto;
	private String municIncorpDepto;
	private String cep; // cep
	private String pais; // país
	private String ccm; // ccm
	private String tipoDepartamento; // tipo de departamento
	private String codigoAgenciaIncorpDepto; // codigo agencia incorporadora departamento
	private String nomeAgenciaIncorpDepto; // nome agencia incorporadora departamento
	private String inscricaoMunicipal; // inscrição municipal
	private String codigoPessoaJuridica; // codigo pessoa juridica
	private String numeroUnidadeOrganizacional; // numero unidade organizacional
	private String codigoMunicipioManter; // variavel auxiliar para lista municipio
	private String numeroAgencia;
	private String nomeAgencia;
	private String codigoPessoaAgencIncorpDepto;
	private String numeroSequencAgencIncorpDepto;
	private int indTributavel; // indice tributavel departamento
	private String codigoMunicipioIncorporada;
	private MunicipioDTO municipioIncorporadoSelecionado;
	private String estadoFiltroAgIncorpora;
	private List<MunicipioDTO> listaMunicipiosAgIncorpora = new ArrayList<MunicipioDTO>();
	private String codListaMunicipioSelecionado;
	private String estadoConsulta;
	private boolean mostraMunicipiosIncorpora;
	IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private String indiceComboEmpresaFiltro;
	private String indiceComboEmpresaIncorpora;
	IObterDescDependenciaService obterDescDependenciaServiceImpl = (IObterDescDependenciaService) FacesUtils.getManagedBean("obterDescDependenciaServiceImpl");
	private Integer codDepFiltro; // código da dependência filtro
	private String descDepFiltro; // descricao da dependência filtro
	private Integer codDepIncorpora; // código da dependência filtro
	private String descDepIncorpora; // descricao da dependência filtro
	private Integer numSeqDepIncorpora;
	private Integer numSeqDepFiltro;
	private Long codMunicipioIncorp;
	private ItemDependencia dep = new ItemDependencia();
	private String estadoResultDepNovasMun; // codigo do estado selecionado
	private String tipo;
	private DependenciasMunicipioDTO dependenciasMunicipios = new DependenciasMunicipioDTO();
	private int flagErro;
	private DependenciaDTO dto = new DependenciaDTO();
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private Integer[] codigosSelecionadosTabelaCont = new Integer[100];
	private boolean checkTodos;
	private boolean disabledIndTrib;
	private Integer tipoPesquisa;
	private Integer indexCont;

	public DependenciaBean() {

	}

	public String inicializaIncluirDependencia() {
		setCodigoMunicipioIncorporada("");
		setMunicipioIncorporadoSelecionado(new MunicipioDTO());
		codDepFiltro = null;
		descDepFiltro = null;
		codDepIncorpora = null;
		descDepIncorpora = null;
		numSeqDepIncorpora = null;
		numSeqDepFiltro = null;
		codMunicipioIncorp = null;
		dep = new ItemDependencia();
		estadoResultDepNovasMun = null;
		tipo = null;
		dependenciasMunicipios = new DependenciasMunicipioDTO();
		indiceComboEmpresaFiltro = "0";
		indiceComboEmpresaIncorpora = "0";
		municipioSelecionado = false;
		mostraMunicipiosIncorpora = false;
		codigoDependencia = "";
		tipoDepartamento = "";
		ccm = "";
		cnpj = "";
		inscricaoMunicipal = "";
		codListaPesquisarMunicipio = "";
		estadoFiltro = "";
		estadoFiltroAgIncorpora = "";
		codListaMunicipioSelecionado = "";
		buscaMunicipio = new BuscaMunicipioBean();
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		indiceComboEmpresaFiltro = "0";
		codDepFiltro = null;
		descDepFiltro = null;
		numSeqDepFiltro = null;
		dep = new ItemDependencia();


		return "incluirDependencia";
	}

	public String inicializaManterDependencia() {
		codDepFiltro = null;
		descDepFiltro = null;
		codDepIncorpora = null;
		descDepIncorpora = null;
		numSeqDepIncorpora = null;
		numSeqDepFiltro = null;
		codMunicipioIncorp = null;
		dep = new ItemDependencia();
		estadoResultDepNovasMun = null;
		tipo = null;
		dependenciasMunicipios = new DependenciasMunicipioDTO();
		indiceComboEmpresaFiltro = "0";
		indiceComboEmpresaIncorpora = "0";
		municipioSelecionado = false;
		mostraMunicipiosIncorpora = false;
		mostraMunicipiosIncorpora = false;
		mostraMunicipios = false;
		mostraBotoes = false;
		estadoFiltro = "";
		estadoFiltroAgIncorpora = "";
		listaMunicipios.clear();
		listaMunicipiosAgIncorpora.clear();
		codListaMunicipioSelecionado = "";
		estadoConsulta = "";
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		carregaComboEstados();
		buscaMunicipio = new BuscaMunicipioBean();
		indiceComboEmpresaFiltro = "0";
		codDepFiltro = null;
		descDepFiltro = null;
		numSeqDepFiltro = null;
		dep = new ItemDependencia();


		return "manterDependencia";

	}

	public String inicializaDependenciasNovas() {
		codDepFiltro = null;
		descDepFiltro = null;
		codDepIncorpora = null;
		descDepIncorpora = null;
		numSeqDepIncorpora = null;
		numSeqDepFiltro = null;
		codMunicipioIncorp = null;
		dep = new ItemDependencia();
		estadoResultDepNovasMun = null;
		tipo = null;
		dependenciasMunicipios = new DependenciasMunicipioDTO();
		indiceComboEmpresaFiltro = "0";
		indiceComboEmpresaIncorpora = "0";
		municipioSelecionado = false;
		mostraMunicipiosIncorpora = false;
		setCodigoMunicipioIncorporada("");
		mostraMunicipiosIncorpora = false;
		setMunicipioIncorporadoSelecionado(new MunicipioDTO());
		estadoFiltro = "";
		estadoFiltroAgIncorpora = "";
		listaMunicipios.clear();
		listaMunicipiosAgIncorpora.clear();
		codListaMunicipioSelecionado = "";
		estadoConsulta = "";
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		carregaComboEstados();
		buscaMunicipio = new BuscaMunicipioBean();
		indiceComboEmpresaFiltro = "0";
		codDepFiltro = null;
		descDepFiltro = null;
		numSeqDepFiltro = null;
		dep = new ItemDependencia();
		mostraBotoes = false;
		mostraDependencias = false;
		listarDependenciasNovas("0", 0);


		return "resultadoDependenciasNovas";

	}

	public String voltarPesquisarIncluir() {
		return "incluirDependencia";
	}
	private void inicializa(){
		codListaPesquisarMunicipioProx = null;
		listaMunicipiosAgIncorpora.clear();
		estadoResultDepNovasMun = null;
		codListaPesquisarAgencia = null;
		mostraMunicipiosIncorpora = false;
		buscaMunicipioIncorp = new BuscaMunicipioBean();
		codigoMunicipioIncorporada = null;
	}
	
	public String localizarDependencia() {
		inicializa();
		return "lista_municipios_dependencias_novas";
	}
	
	public String localizarDependenciaManter() {
		inicializa();
		return "lista_municipios_manter_recolhimento";
	}

	public String localizarDependenciaIncluir() {
		inicializa();
		return "lista_municipios_incluir_dependencias";
	}
	
	public String pesquisarMunicipioIncorpora() {
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioDepNova();
			codMunicipioIncorp = buscaMunicipio.getCodigo();
			listarAgenciasPorMunicipio(String.valueOf(buscaMunicipio.getCodigo()));
			return "prosseguir_agencias_dependencias_novas";
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioDepNova();
			return "";
		}else if (!estadoResultDepNovasMun.equals("")) {
			listaMunicipios.clear();
			listaMunicipios = listarMunicipios("N", estadoResultDepNovasMun);
			mostraMunicipiosIncorpora = true;
			return"";
		}else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou preencha o municipio.", false);
			return"";
		}
	}
	
	public String pesquisarMunicipioIncorporaManter() {
		if(buscaMunicipioIncorp.getCodigo() != null && buscaMunicipioIncorp.getCodigo() != 0){
			buscaMunicipioIncorp();
			codMunicipioIncorp = buscaMunicipioIncorp.getCodigo();
			listarAgenciasPorMunicipio(String.valueOf(buscaMunicipioIncorp.getCodigo()));
			return "prosseguir_agencias_manter_dependencias";
		}else if(buscaMunicipioIncorp.getDescricao() != null && !buscaMunicipioIncorp.getDescricao().equals("")){
			buscaMunicipioIncorp();
			return "";
		}else if (!estadoResultDepNovasMun.equals("")) {
			listaMunicipiosAgIncorpora.clear();
			listaMunicipiosAgIncorpora = listarMunicipios("M", estadoResultDepNovasMun);
			mostraMunicipiosIncorpora = true;
			return"";
		}else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou preencha o municipio.", false);
			return"";
		}
	}
	
	public String pesquisarMunicipioIncorporaIncluir() {
		if(buscaMunicipioIncorp.getCodigo() != null && buscaMunicipioIncorp.getCodigo() != 0){
			buscaMunicipioIncorp();
			codMunicipioIncorp = buscaMunicipio.getCodigo();
			listarAgenciasPorMunicipio(String.valueOf(buscaMunicipioIncorp.getCodigo()));
			return "prosseguir_agencias_incluir_dependencias";
		}else if(buscaMunicipioIncorp.getDescricao() != null && !buscaMunicipioIncorp.getDescricao().equals("")){
			buscaMunicipioIncorp();
			return "";
		}else if (!estadoResultDepNovasMun.equals("")) {
			listaMunicipios.clear();
			listaMunicipios = listarMunicipios("I", estadoResultDepNovasMun);
			mostraMunicipiosIncorpora = true;
			return"";
		}else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou preencha o municipio.", false);
			return"";
		}
	}
	
	public void buscaMunicipioIncorp(){
		tipo = "manterIncorp";
		buscaMunicipio(estadoResultDepNovasMun);
	}
	
	public void buscaMunicipioDepNova(){
		tipo = "depNova";
		buscaMunicipio(estadoResultDepNovasMun);
	}
	
	public void buscaMunicipioManter(){
		tipo = "manter";
		buscaMunicipio(estadoFiltro);
	}
	
	public void buscaMunicipio(String estado){
		if(!tipo.equals("manterIncorp")){
			buscaMunicipio.setCallback(this);
			buscaMunicipio.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipio.setEstado(uf != null?uf:"");
			buscaMunicipio.buscar();
		}else{
			buscaMunicipioIncorp.setCallback(this);
			buscaMunicipioIncorp.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipioIncorp.setEstado(uf != null?uf:"");
			buscaMunicipioIncorp.buscar();
		}
	}
	
	public void processa() {
		if(tipo.equals("depNova")){
			estadoResultDepNovasMun = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		}else if(tipo.equals("manter")){
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		}else if(tipo.equals("manterIncorp")){
			estadoResultDepNovasMun = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipioIncorp.getUf());
		}
	}

	
	public void carregarDependenciaIncorporaDepNova(){
		carregarDependencia(indiceComboEmpresaIncorpora, codDepIncorpora);
		setNumSeqDepIncorpora(dep.getNumSeqDependencia());
		setCodDepIncorpora(dep.getCodDependencia());
		setDescDepIncorpora(dep.getDesDependencia());
	}
	
	public void carregarDependencia(String empresa, Integer codDep){
		if(codDep != null && codDep != 0){
			dep = obterDescDependenciaServiceImpl.obterDescDependencia(Long.valueOf(empresa), codDep);
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Dependencia.", false);
			return;
		}
			
	}

	public List<SelectItem> carregaComboEstados() {

		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}

	private void listarDependenciasNovas(String empresa, Integer codDependencia) {

		try {

			listaDependenciasNovas = dependenciaImpl.listarDependenciasNovas(empresa != null?Long.valueOf(empresa):0, codDependencia != null?codDependencia:0);

			if (listaDependenciasNovas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaDependenciasNovas.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaDependenciasNovas.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_DEPENDENCIAS_NOVAS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraDependencias = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoDependenciasNovas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public void paginarDependenciasNovas(ActionEvent event) {

		// responsável pelo restart da paginação
		listarDependenciasNovas(codDepFiltro != null && codDepFiltro != 0?indiceComboEmpresaFiltro:"0", codDepFiltro != null && codDepFiltro != 0?codDepFiltro:0);
		setListaDependenciasNovas(listaDependenciasNovas);

	}

	public void limpaVariaveis() {

		codigoPessoaJuridica = "";
		numeroUnidadeOrganizacional = "";
		codigoMunicipioManter = "";
		inscricaoMunicipal = "";
		codigoAgenciaIncorpDepto = "";
		nomeAgenciaIncorpDepto = "";
		ccm = "";
		tipoDepartamento = "";
		codListaPesquisarMunicipio = "";
		codListaPesquisarAgencia = "";

	}

	public String prosseguirDependenciasNovas() {

		String[] vetorMunicipio;

		limpaVariaveis();

		DependenciasNovasDTO dependenciasNovasDTO = listaDependenciasNovas.get(new Integer(codListaPesquisar));

		vetorMunicipio = dependenciasNovasDTO.getMunicipio().split(" - ");

		// seta variáveis para inclusão Parte 1
		codigoPessoaJuridica = dependenciasNovasDTO.getCodPessoaJuridica();
		numeroUnidadeOrganizacional = dependenciasNovasDTO.getNumUnidOrganiz();
		codigoMunicipioManter = vetorMunicipio[0];
		tipoDepartamento = "1";
		estadoFiltro = "";
		municipioSelecionado = false;

		// Chama classe de servico para preenchimento do combo de Estados
		carregaComboEstados();

		consultarInformacoesDependencia(dependenciasNovasDTO);

		return "carrega_informacoes_dependencias_novas";
	}

	public String prosseguirIncluirDependencia() {

		tipoDepartamento = "1";
		boolean resposta = consultaInformacoesDependenciaUnidadeOrganizacional(codigoDependencia);

		if (resposta != false) {

			DependeciasEncerradasDTO dependenciaDTO = new DependeciasEncerradasDTO();

			dependenciaDTO.setCodigoPessoaJuridica(codigoPessoaJuridica);
			dependenciaDTO.setNumeroSequencial(numeroUnidadeOrganizacional);
			consultarInformacoesDependencia(dependenciaDTO);

			municipioSelecionado = false;

			carregaComboEstados();
		} else {
			return "incluirDependencia";
		}

		return "carrega_informacoes_dependencias_incluir";
	}

	public boolean consultaInformacoesDependenciaUnidadeOrganizacional(String codDependencia) {
		try {
			DependenciaDTO dependenciaDTO = dependenciaImpl.consultarInformacoesDependenciaUnidOrgan(codDependencia);

			codigoPessoaJuridica = dependenciaDTO.getCodigoPessoaJuridica();
			numeroUnidadeOrganizacional = dependenciaDTO.getSeqUnidadeOrganizacional();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return false;
		}

		return true;
	}

	// consulta dependencia (incluir)
	public void consultarInformacoesDependencia(DependeciasEncerradasDTO dependenciasDTO) {
		try {

			DependenciaDTO dependenciaDTO = dependenciaImpl.consultarInformacoesDependencia(dependenciasDTO);

			codigoDependencia = dependenciaDTO.getCodigoDependencia();
			descricaoDependencia = dependenciaDTO.getDescricaoDependencia();
			cnpj = dependenciaDTO.getCnpj();
			dataAbertura = dependenciaDTO.getDataAbertura();
			dataEncerramento = dependenciaDTO.getDataEncerramento();
			agenciaIncorporadora = dependenciaDTO.getAgenciaIncorporadora();
			logradouro = dependenciaDTO.getLogradouro();
			ccm = dependenciaDTO.getCcm();
			inscricaoMunicipal = dependenciaDTO.getInscricaoMunicipal();
			pais = dependenciaDTO.getPais();
			cep = GissUtil.mascaraCep(dependenciaDTO.getCep());
			estado = dependenciaDTO.getEstado();
			municipio = dependenciaDTO.getMunicipio();
			codigoAgenciaIncorpDepto = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento(); //
			nomeAgenciaIncorpDepto = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento(); //	
			estadoMunicIncorpDepto = dependenciaDTO.getEstadoMunicipioAgenIncorpDepto();
			codigoPessoaAgencIncorpDepto = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();
			numeroSequencAgencIncorpDepto = dependenciaDTO.getNumeroSequencAgencIncorpDepto();
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, estadoMunicIncorpDepto);
			codigoMunicipioManter = dependenciaDTO.getCodMunicipio().toString();
			codDepIncorpora = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento() != null && !dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("")?!dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("0")?Integer.valueOf(dependenciaDTO.getCodAgenciaIncorporadoraDepartamento()):null:null; //
			descDepIncorpora = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento(); //	
			estadoMunicIncorpDepto = dependenciaDTO.getEstadoMunicipioAgenIncorpDepto();
			codigoPessoaAgencIncorpDepto = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();
			numSeqDepIncorpora = dependenciaDTO.getNumeroSequencAgencIncorpDepto() != null && !dependenciaDTO.getNumeroSequencAgencIncorpDepto().equals("")?Integer.valueOf(dependenciaDTO.getNumeroSequencAgencIncorpDepto()):0;
			descricaoDependencia = dependenciaDTO.getDescricaoDependencia();
			
			

			municIncorpDepto = "";
			if (dependenciaDTO.getCodMunicipioAgenIncorpDepto() != null && !dependenciaDTO.getCodMunicipioAgenIncorpDepto().trim().equals("")) {
				Long municipioIncorp = Long.parseLong(dependenciaDTO.getCodMunicipioAgenIncorpDepto());
				if (municipioIncorp > 0) {
					municIncorpDepto = municipioIncorp + " - " + dependenciaDTO.getDescMunicipioAgenIncorpDepto();
				}
			}

			tipoDepartamento = dependenciaDTO.getTipoDepartamento();
			if (tipoDepartamento.equals("TRIBUTAVEL")) {
				indTributavel = 1;
			} else {
				indTributavel = 2;
			}

			if (inscricaoMunicipal.equals("0")) {
				inscricaoMunicipal = "";
			}

			if (codigoAgenciaIncorpDepto.equals("0")) {
				codigoAgenciaIncorpDepto = "";
			}

			if (ccm.equals("0")) {
				ccm = "";
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "incluirDependencia", BradescoViewExceptionActionType.ACTION, false);
		}
	}

	// consulta dependencia (Resultado dependencias novas)
	public void consultarInformacoesDependencia(DependenciasNovasDTO dependenciasNovasDTO) {
		try {

			DependenciaDTO dependenciaDTO = dependenciaImpl.consultarInformacoesDependencia(dependenciasNovasDTO);

			codigoDependencia = dependenciasNovasDTO.getCodigo();
			descricaoDependencia = dependenciasNovasDTO.getDescricao();
			cnpj = dependenciaDTO.getCnpj();
			dataAbertura = dependenciaDTO.getDataAbertura();
			dataEncerramento = dependenciaDTO.getDataEncerramento();
			agenciaIncorporadora = dependenciaDTO.getAgenciaIncorporadora();
			logradouro = dependenciaDTO.getLogradouro();
			ccm = dependenciaDTO.getCcm();
			inscricaoMunicipal = dependenciaDTO.getInscricaoMunicipal();
			pais = dependenciaDTO.getPais();
			cep = GissUtil.mascaraCep(dependenciaDTO.getCep());
			estado = dependenciaDTO.getEstado();
			indiceComboEmpresaIncorpora = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();
			municipio = dependenciaDTO.getMunicipio();
			codDepIncorpora = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento() != null && !dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("")?!dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("0")?Integer.valueOf(dependenciaDTO.getCodAgenciaIncorporadoraDepartamento()):null:null; //
			descDepIncorpora = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento(); //	
			estadoMunicIncorpDepto = dependenciaDTO.getEstadoMunicipioAgenIncorpDepto();
			codigoPessoaAgencIncorpDepto = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();
			numSeqDepIncorpora = dependenciaDTO.getNumeroSequencAgencIncorpDepto() != null && !dependenciaDTO.getNumeroSequencAgencIncorpDepto().equals("")?Integer.valueOf(dependenciaDTO.getNumeroSequencAgencIncorpDepto()):0;
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, estadoMunicIncorpDepto);
			codigoMunicipioManter = dependenciaDTO.getCodMunicipio().toString();
			
			
			Long municipioIncorp = Long.parseLong(dependenciaDTO.getCodMunicipioAgenIncorpDepto());
			if (municipioIncorp > 0) {
				municIncorpDepto = municipioIncorp + " - " + dependenciaDTO.getDescMunicipioAgenIncorpDepto();
			} else {
				municIncorpDepto = "";
			}

			tipoDepartamento = dependenciaDTO.getTipoDepartamento();
			if (tipoDepartamento.equals("TRIBUTAVEL")) {
				indTributavel = 1;
			} else {
				indTributavel = 2;
			}

			if (inscricaoMunicipal.equals("0")) {
				inscricaoMunicipal = "";
			}

			if (codigoAgenciaIncorpDepto.equals("0")) {
				codigoAgenciaIncorpDepto = "";
			}

			if (ccm.equals("0")) {
				ccm = "";
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "resultadoDependenciasNovas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	// consulta dependencia (manter)
	private void consultarInformacoesDependencia(String nomeMunicipio, DependenciasMunicipioDTO dependenciasMunicipioDTO) {
		try {

			codigoDependencia = null;
			descricaoDependencia = null;
			numeroAgencia = null;
			nomeAgencia = null;
			cnpj = null;
			dataAbertura = null;
			dataEncerramento = null;
			agenciaIncorporadora = null;
			codigoAgenciaIncorpDepto = null;
			nomeAgenciaIncorpDepto = null;		
			logradouro = null;
			estadoConsulta = null;
			cep = null;
			pais = null;
			ccm = null;
			inscricaoMunicipal = null;
			tipoDepartamento = null;
			estadoMunicIncorpDepto = null;
			codigoPessoaAgencIncorpDepto = null;
			numeroSequencAgencIncorpDepto = null;
			estadoFiltroAgIncorpora = null;
			codigoMunicipioManter = null;
			codDepIncorpora = null;
			descDepIncorpora = null;
			numSeqDepIncorpora = null;
			indiceComboEmpresaIncorpora = null;
			municIncorpDepto = null;
			dataAtualizacao = null;
			tragSemTrag = "N";
			
			indTributavel = 1;
			ccm = null;
			inscricaoMunicipal = null;
			codigoAgenciaIncorpDepto = null;
			codigosSelecionadosTabela = new Integer[100];
			codigosSelecionadosTabelaCont = new Integer[100];
			checkTodos = false;
			indexCont=0;
			
			DependenciaDTO dependenciaDTO = dependenciaImpl.consultarInformacoesDependencia(nomeMunicipio, dependenciasMunicipioDTO.getNumeroSequencialDependencia(), dependenciasMunicipioDTO.getCodigoPessoaJuridica(), dependenciasMunicipioDTO.getDataAtualizacao());

			dto.setListaPaa(dependenciaDTO.getListaPaa());
			dto.setListaPaaCon(new ArrayList<DependenciaDTO>());
			selectItemLista = new ArrayList<SelectItem>();
			selectItemListaCont = new ArrayList<SelectItem>();
			codigosSelecionadosTabela = new Integer[100];
			codigosSelecionadosTabelaCont = new Integer[100];
			for (int i = 0; i < dto.getListaPaa().size(); i++) {
				selectItemLista.add(new SelectItem(i, " "));
				selectItemListaCont.add(new SelectItem(i, " "));
				if (dto.getListaPaa().get(i).getOperacao() == 1) {
					codigosSelecionadosTabela[i] = i;
				}else if(dto.getListaPaa().get(i).getOperacao() == 3){
					codigosSelecionadosTabela[i] = i;
					codigosSelecionadosTabelaCont[i] = i;
				}
				dto.getListaPaa().get(i).setOperacao(0);
			}
			codigoDependencia = dependenciasMunicipioDTO.getCodigoDependencia();
			descricaoDependencia = dependenciasMunicipioDTO.getDescricaoDependencia();
			numeroAgencia = dependenciasMunicipioDTO.getCodigoDependencia();
			nomeAgencia = dependenciasMunicipioDTO.getDescricaoDependencia();
			dataAtualizacao = dependenciasMunicipioDTO.getDataAtualizacao();
			tragSemTrag = dependenciasMunicipioDTO.getTragSemTrag();
			cnpj = dependenciaDTO.getCnpj();
			dataAbertura = dependenciaDTO.getDataAbertura();
			dataEncerramento = dependenciaDTO.getDataEncerramento();
			agenciaIncorporadora = dependenciaDTO.getAgenciaIncorporadora();
			codigoAgenciaIncorpDepto = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento(); //
			nomeAgenciaIncorpDepto = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento(); //		
			logradouro = dependenciaDTO.getLogradouro();
			estadoConsulta = dependenciaDTO.getEstado();
			municipio = dependenciaDTO.getMunicipio();
			cep = GissUtil.mascaraCep(dependenciaDTO.getCep());
			pais = dependenciaDTO.getPais();
			ccm = dependenciaDTO.getCcm();
			inscricaoMunicipal = dependenciaDTO.getInscricaoMunicipal();
			tipoDepartamento = dependenciaDTO.getTipoDepartamento().substring(1);
			estadoMunicIncorpDepto = dependenciaDTO.getEstadoMunicipioAgenIncorpDepto();
			codigoPessoaAgencIncorpDepto = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();
			numeroSequencAgencIncorpDepto = dependenciaDTO.getNumeroSequencAgencIncorpDepto();
			estadoFiltroAgIncorpora = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, estadoMunicIncorpDepto);
			codigoMunicipioManter = dependenciaDTO.getCodMunicipio().toString();
			codDepIncorpora = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento() != null && !dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("")?!dependenciaDTO.getCodAgenciaIncorporadoraDepartamento().equals("0")?Integer.valueOf(dependenciaDTO.getCodAgenciaIncorporadoraDepartamento()):null:null; //
			descDepIncorpora = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento();
			numSeqDepIncorpora = dependenciaDTO.getNumeroSequencAgencIncorpDepto()!=null&&!dependenciaDTO.getNumeroSequencAgencIncorpDepto().equals("")?Integer.valueOf(dependenciaDTO.getNumeroSequencAgencIncorpDepto()):0;
			indiceComboEmpresaIncorpora = dependenciaDTO.getCodigoPessoaAgencIncorpDepto();

			Long municipioIncorp = 
				dependenciaDTO.getCodMunicipioAgenIncorpDepto()!= null && dependenciaDTO.getCodMunicipioAgenIncorpDepto().equals("")?
					0:Long.parseLong(dependenciaDTO.getCodMunicipioAgenIncorpDepto());
			if (municipioIncorp > 0) {
				municIncorpDepto = municipioIncorp + " - " + dependenciaDTO.getDescMunicipioAgenIncorpDepto();
			} else {
				municIncorpDepto = "";
			}
			disabledIndTrib = GissUtil.notNull(dependenciaDTO.getTipoDepartamento()).substring(0, 1).equals("N");
			if (tipoDepartamento.equalsIgnoreCase("TRIBUTAVEL"))
				indTributavel = 1;
			else
				indTributavel = 2;

			if (ccm.equals("0")) {
				ccm = "";
			}

			if (inscricaoMunicipal.equals("0")) {
				inscricaoMunicipal = "";
			}

			if (codigoAgenciaIncorpDepto.equals("0")) {
				codigoAgenciaIncorpDepto = "";
			}
			
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "#{dependenciaBean.voltarManterAlterar}", BradescoViewExceptionActionType.ACTION, false);
			flagErro=1;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void verificarCheck() {
		
		for (int i = 0; i < codigosSelecionadosTabelaCont.length; i++) {
			boolean flegado = false;
			for (int j = 0; j < codigosSelecionadosTabela.length; j++) {
				if(codigosSelecionadosTabelaCont[i].equals(codigosSelecionadosTabela[j])){
					flegado = true;
					break;
				}
			}
			if(!flegado && codigosSelecionadosTabelaCont.length>0){
				codigosSelecionadosTabelaCont[i] = null;
			}
		}
		
	}

	public String limparCamposInformacoesDepNovas() {

		ccm = "";
		inscricaoMunicipal = "";
		estadoFiltro = "";
		estadoFiltroAgIncorpora = "";
		municipioSelecionado = false;
		numeroAgencia = "";
		nomeAgencia = "";
		municipio = "";

		return null;
	}

	public String prosseguirManterDependencia() {
		if(listaMunicipios!=null && listaMunicipios.size() != 0){
			MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codListaMunicipioSelecionado));
			
			estado = GissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);
			codigoMunicipio = municipioDTO.getCodigo();
			municipio = codigoMunicipio + " - " + municipioDTO.getNome();
			
		}
		// lista os municípios
		listarDependenciasPorMunicipio(codDepFiltro!=null?"0":codigoMunicipio, codDepFiltro != null && codDepFiltro != 0?codDepFiltro:0, codDepFiltro != null && codDepFiltro != 0?indiceComboEmpresaFiltro:"0");
		if (dependenciasMunicipios == null){
			return voltarManterDependencia();
		}else{
			return "lista_dependencias_municipio";
		}
		
	}

	private List<MunicipioDTO> listarMunicipiosManterDependencias(String estado) {

		try {

			List<MunicipioDTO> municipios = dependenciaImpl.listarMunicipios(estado);

			if (municipios != null) {
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(municipios);

				if (municipios.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraMunicipios = true;
			}

			return municipios;
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return new ArrayList<MunicipioDTO>();
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String carregarListaMunicipiosManter() {
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			if(codDepFiltro == null || codDepFiltro == 0){
				buscaMunicipioManter();
				estado = GissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);
				codigoMunicipio = buscaMunicipio.getCodigo().toString();
				municipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
				// lista os municípios
				listarDependenciasPorMunicipio(codigoMunicipio, 0, "0");
				mostraMunicipios = false;
				listaMunicipios.clear();
				return "lista_dependencias_municipio";
			}else{
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			if(codDepFiltro == null || codDepFiltro == 0){
				buscaMunicipioManter();
				return"";
			}else{
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		}else if(estadoFiltro != null && !estadoFiltro.equals("")){
			if(codDepFiltro == null || codDepFiltro == 0){
				mostraMunicipios = false;
				listaMunicipios = listarMunicipiosManterDependencias(estadoFiltro);
				return"";
			}else{
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		}else if (codDepFiltro != null && codDepFiltro != 0){
			listarDependenciasPorMunicipio("0", codDepFiltro, indiceComboEmpresaFiltro);
			mostraMunicipios = false;
			listaMunicipios.clear();
			estado = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, dependenciasMunicipios.getCodUF())+ " - " + dependenciasMunicipios.getDescUF();
			codigoMunicipio = dependenciasMunicipios.getCodMunicipio()!=null?dependenciasMunicipios.getCodMunicipio().toString():"";
			municipio = codigoMunicipio + " - " + dependenciasMunicipios.getDescMunicipio();
			return"lista_dependencias_municipio";
		}else 
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		return "";
	}
	
	public void carregarListaMunicipiosNovos(ActionEvent event) {

		// lista dependencias novas
		listarDependenciasNovas(codDepFiltro != null && codDepFiltro != 0?indiceComboEmpresaFiltro:"0", codDepFiltro != null && codDepFiltro != 0?codDepFiltro:0);

	}

	private void listarDependenciasPorMunicipio(String codMunicipio, Integer codDependencia, String codPessoaJuridica) {

		try {
			listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>();
			
			dependenciasMunicipios = dependenciaImpl.listarDependenciasMunicipio(codMunicipio!=null&&!codMunicipio.equals("")?codMunicipio:"0", codDependencia!=null?codDependencia:0, codPessoaJuridica!=null&&!codPessoaJuridica.equals("")?codPessoaJuridica:"0");
			listaDependenciasMunicipio = dependenciasMunicipios.getDepMunicipio();
			
			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciasMunicipio);
		} catch (PdcAdapterFunctionalException p) {
			listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>();
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterDependencia", BradescoViewExceptionActionType.ACTION, false);
			return;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String voltarManterDependencia() {
		codListaPesquisar = null;
		codListaMunicipioSelecionado = null;
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);
//		carregarListaMunicipiosManter(null);
		return "manterDependencia";
	}

	public String voltarManterAlterar() {
//		prosseguirManterDependencia();
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciasMunicipio);
		codListaPesquisar = null;
		return "lista_dependencias_municipio";
	}

	public String voltarManterExcluir() {
//		carregaComboEstados();
//		prosseguirManterDependencia();
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciasMunicipio);
		codListaPesquisar = null;
		return "lista_dependencias_municipio";
	}

	public String alterarDependenciaManter() {
		flagErro=0;
		dto = new DependenciaDTO();
		DependenciasMunicipioDTO dependenciasMunicipioDTO = listaDependenciasMunicipio.get(new Integer(codListaPesquisar));

		codigoPessoaJuridica = dependenciasMunicipioDTO.getCodigoPessoaJuridica();
		numeroUnidadeOrganizacional = dependenciasMunicipioDTO.getNumeroSequencialDependencia();

		tipoDepartamento = "1";
		estadoFiltroAgIncorpora = "";
		municipioSelecionado = false;

		// Chama classe de servico para preenchimento do combo de Estados
		carregaComboEstados();

		consultarInformacoesDependencia(municipio, dependenciasMunicipioDTO);

		return flagErro==0?"manter_alteracao":"";
	}

	public String excluirDependenciaManter() {
		flagErro=0;
		DependenciasMunicipioDTO dependenciasMunicipioDTO = listaDependenciasMunicipio.get(new Integer(codListaPesquisar));
		consultarInformacoesDependencia(municipio, dependenciasMunicipioDTO);
		
		return flagErro==0?"manter_exclusao":"";
		
	}

	public String prosseguirAgenciaDependenciasNovas() {

		if (tipoDepartamento != null && !inscricaoMunicipal.equals("") && !inscricaoMunicipal.equals("0") && !ccm.equals("") && !ccm.equals("0")) {

			estadoFiltro = "";
			listaEstados.clear();
			municipioSelecionado = false;
			codListaPesquisarAgencia = "";
			listaAgencias.clear();
			mostraAgencias = false;

			carregaComboEstados();

		} else {
			BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "carrega_informacoes_dependencias_novas", BradescoViewExceptionActionType.ACTION, false);
		}

		return "prosseguir_agencias_dependencias_novas";
	}

	public String prosseguirAgenciaIncluirDependencias() {

		if (tipoDepartamento != null && !inscricaoMunicipal.equals("") && !inscricaoMunicipal.equals("0") && !ccm.equals("") && !ccm.equals("0")) {

			estadoFiltro = "";
			listaEstados.clear();
			municipioSelecionado = false;
			codListaPesquisarAgencia = "";
			listaAgencias.clear();
			mostraAgencias = false;

			carregaComboEstados();
		} else {
			BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "carrega_informacoes_dependencias_incluir", BradescoViewExceptionActionType.ACTION, false);
		}

		return "prosseguir_agencias_incluir_dependencias";
	}

	public String pesquisarMunicipiodependenciasNovas() {

		if (!estadoFiltro.equals("")) {
			municipioFiltro = "";
			listaMunicipios.clear();

			listaMunicipios = listarMunicipios("N", estadoFiltro);

			return "lista_municipios_dependencias_novas";
		}

		BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "carrega_informacoes_dependencias_novas", BradescoViewExceptionActionType.ACTION, false);

		return null;
	}

	public String pesquisarMunicipioIncluirDependencias() {

		if (!estadoFiltro.equals("")) {
			municipioFiltro = "";
			listaMunicipios.clear();

			listaMunicipios = listarMunicipios("I", estadoFiltro);

			return "lista_municipios_incluir_dependencias";
		}

		BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", false);

		return null;
	}

	public String pesquisarMunicipioManterRecolhimento() {

		if (!estadoFiltroAgIncorpora.equals("")) {
			municipioFiltro = "";

			listaMunicipiosAgIncorpora = listarMunicipios("M", estadoFiltroAgIncorpora);

			return "lista_municipios_manter_recolhimento";
		}

		BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "manter_alteracao", BradescoViewExceptionActionType.ACTION, false);

		return null;
	}

	private List<MunicipioDTO> listarMunicipios(String origem, String estadoSelecionado) {

		try {
			List<MunicipioDTO> municipios = dependenciaImpl.listarMunicipios(estadoSelecionado);

			if (municipios != null) {
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(municipios);

				if (municipios.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraMunicipios = true;
			}

			return municipios;
		} catch (PdcAdapterFunctionalException p) {
			if (origem.equals("N")) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "prosseguir_agencias_dependencias_novas", BradescoViewExceptionActionType.ACTION, false);
				return new ArrayList<MunicipioDTO>();
			} else if (origem.equals("M")) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manter_alteracao", BradescoViewExceptionActionType.ACTION, false);
				return new ArrayList<MunicipioDTO>();
			} else {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "carrega_informacoes_dependencias_incluir", BradescoViewExceptionActionType.ACTION, false);
				return new ArrayList<MunicipioDTO>();
			}
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String retornarDependenciasNovasAgencia() {

		MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codigoMunicipioIncorporada));
		setMunicipioIncorporadoSelecionado(municipioDTO);
		codMunicipioIncorp = Long.valueOf(municipioDTO.getCodigo());
		// lista agencias por municipio
		listarAgenciasPorMunicipio(municipioDTO.getCodigo());

		return "prosseguir_agencias_dependencias_novas";
	}

	public String retornarManterDependenciasAgencia() {

		MunicipioDTO municipioDTO = listaMunicipiosAgIncorpora.get(new Integer(codListaPesquisarMunicipioProx));
		codigoMunicipio = municipioDTO.getCodigo();
		codMunicipioIncorp = Long.valueOf(municipioDTO.getCodigo());
		// lista agencias por municipio
		listarAgenciasPorMunicipio(codigoMunicipio);

		return "prosseguir_agencias_manter_dependencias";
	}

	public String retornarIncluirDependenciasAgencia() {

		MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codigoMunicipioIncorporada));
		setMunicipioIncorporadoSelecionado(municipioDTO);
		codMunicipioIncorp = Long.valueOf(municipioDTO.getCodigo());
		// lista agencias por municipio
		listarAgenciasPorMunicipio(municipioDTO.getCodigo());

		return "prosseguir_agencias_incluir_dependencias";
	}

	public void carregarListaAgenciasPorMunicipio(ActionEvent event) {

		// lista agencias por municipio
		listarAgenciasPorMunicipio(codigoMunicipio);

	}

	public void carregarListaAgenciasPorMunicipioIncluir(ActionEvent event) {

		// lista agencias por municipio
		listarAgenciasPorMunicipioIncluir(codigoMunicipio);

	}

	private void listarAgenciasPorMunicipio(String codMunicipio) {

		try {
			listaAgencias = null;
			listaAgencias = dependenciaImpl.listarAgenciasMunicipio(codMunicipio);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
			if (listaAgencias != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaAgencias.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaAgencias.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_AGENCIAS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraAgencias = true;
			}
		
	}

	private void listarAgenciasPorMunicipioIncluir(String codMunicipio) {

		try {

			listaAgencias = dependenciaImpl.listarAgenciasMunicipio(codMunicipio);

			if (listaAgencias != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaAgencias.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaAgencias.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_AGENCIAS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraAgencias = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "prosseguir_agencias_incluir_dependencias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String voltarInformacoesdependencias() {

		municipioSelecionado = false;

		return "carrega_informacoes_dependencias_novas";
	}

	public String voltarDependenciasMunicipios() {
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);
		codListaPesquisarMunicipioProx = null;
		return "lista_municipios_dependencias_novas";
	}

	public String voltarManterDependenciasMunicipios() {
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipiosAgIncorpora);
		codListaMunicipioSelecionado = null;
		return "lista_municipios_manter_recolhimento";
	}

	public String voltarIncluirDependenciasMunicipios() {
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);

		return "lista_municipios_incluir_dependencias";
	}

	public String voltarInformacoesIncluirdependencias() {

		municipioSelecionado = false;

		return "lista_municipios_dependencias_novas";
	}

	public void finalizaInclusaoDependenciaNova(ActionEvent event) {

		incluirDependenciaNova();

	}

	public void finalizaInclusaoDependencia(ActionEvent event) {

		incluirDependencia();

	}

	public void finalizaAlteracaoDependencia(ActionEvent event) {

		alterarDependencia();

	}

	public void finalizarExclusaoDependencia(ActionEvent event) {

		// seta variáveis para exclusao
		DependenciasMunicipioDTO dependMunicipioDTO = listaDependenciasMunicipio.get(new Integer(codListaPesquisar));
		codigoPessoaJuridica = dependMunicipioDTO.getCodigoPessoaJuridica().toString();
		numeroUnidadeOrganizacional = dependMunicipioDTO.getNumeroSequencialDependencia();

		excluirDependencia();

	}

	public String incluirDependenciaNova() {

		DependenciaDTO dependenciaDTO = new DependenciaDTO();

		if(codDepIncorpora != null && codDepIncorpora != 0){
			carregarDependenciaIncorporaDepNova();
		}else{
			numSeqDepIncorpora = 0;
		}
		
		try {
			if (indTributavel > 0) {

				dependenciaDTO = dependenciaImpl.incluirDependenciaNova(codigoPessoaJuridica, numeroUnidadeOrganizacional, codigoMunicipioManter, inscricaoMunicipal, indiceComboEmpresaIncorpora, String.valueOf(numSeqDepIncorpora), ccm, indTributavel);

				inicializaDependenciasNovas();

				BradescoFacesUtils.addInfoModalMessage(dependenciaDTO.getMensagem(), "resultadoDependenciasNovas", BradescoViewExceptionActionType.ACTION, false);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "carrega_informacoes_dependencias_novas", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "carrega_informacoes_dependencias_novas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}
	
	

	public String incluirDependencia() {

		DependenciaDTO dependenciaDTO = new DependenciaDTO();

		try {
			if (indTributavel > 0) {

				dependenciaDTO = dependenciaImpl.incluirDependencia(codigoPessoaJuridica, numeroUnidadeOrganizacional, codigoMunicipioManter, inscricaoMunicipal, indiceComboEmpresaIncorpora, String.valueOf(numSeqDepIncorpora), ccm, indTributavel);
				codigoDependencia = "";

				BradescoFacesUtils.addInfoModalMessage(dependenciaDTO.getMensagem(), "incluirDependencia", BradescoViewExceptionActionType.ACTION, false);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "carrega_informacoes_dependencias_incluir", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "carrega_informacoes_dependencias_incluir", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}

	public String excluirDependencia() {

		DependenciaDTO dependenciaDTO = new DependenciaDTO();

		try {
			dependenciaDTO = dependenciaImpl.excluirDependencia(codigoPessoaJuridica, numeroUnidadeOrganizacional);

			estadoFiltroAgIncorpora = "";

			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);

			BradescoFacesUtils.addInfoModalMessage(dependenciaDTO.getMensagem(), "#{dependenciaBean.prosseguirManterDependencia}", BradescoViewExceptionActionType.ACTION, false);

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manter_exclusao", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}
	
	public String recarregarLista() {
		listarDependenciasPorMunicipio(codDepFiltro!=null?"0":codigoMunicipio, codDepFiltro!=null?codDepFiltro:0, codDepFiltro != null && codDepFiltro != 0?indiceComboEmpresaFiltro:"0");
		return "lista_dependencias_municipio";
	}
	

	public String alterarDependencia() {

		DependenciaDTO dependenciaDTO = new DependenciaDTO();
		
		if(codDepIncorpora != null && codDepIncorpora != 0){
			carregarDependenciaIncorporaDepNova();
		}else{
			numSeqDepIncorpora = 0;
		}

		try {
			if (indTributavel > 0) {
				if(dto.getListaPaa().size()>0){
					for (int i = 0; i <dto.getListaPaa().size(); i++) {
						dto.getListaPaa().get(i).setOperacao(2);
					}
					for (Integer check : codigosSelecionadosTabela) {
						dto.getListaPaa().get(check).setOperacao(1);
					}
					for (Integer check2 : codigosSelecionadosTabelaCont) {
						dto.getListaPaa().get(check2).setOperacao(3);
					}
				}

				dependenciaDTO = dependenciaImpl.alterarDependencia(codigoPessoaJuridica, numeroUnidadeOrganizacional, codigoMunicipioManter, inscricaoMunicipal, indiceComboEmpresaIncorpora, String.valueOf(GissUtil.notNull(numSeqDepIncorpora)), ccm, indTributavel, dto);

				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciasMunicipio);

				BradescoFacesUtils.addInfoModalMessage(dependenciaDTO.getMensagem(), "lista_dependencias_municipio", BradescoViewExceptionActionType.ACTION, false);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "manter_alteracao", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manter_alteracao", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}

	public void paginarListaMunicipios(ActionEvent event) {

		listaMunicipios = listarMunicipios("", estadoFiltro);
		setListaMunicipios(listaMunicipios);

	}

	public void paginarListaDependenciasMunicipio(ActionEvent event) {

		listarDependenciasPorMunicipio(codDepFiltro!=null?"0":codigoMunicipio, codDepFiltro!=null?codDepFiltro:0, codDepFiltro != null && codDepFiltro != 0?indiceComboEmpresaFiltro:"0");
		setListaDependenciasMunicipio(listaDependenciasMunicipio);

	}

	public void paginarListaAgencias(ActionEvent event) {

		listarAgenciasPorMunicipio(codigoMunicipio);
		setListaAgencias(listaAgencias);
	}

	public void paginarListaMunicipiosManter(ActionEvent event) {
		listaMunicipios = listarMunicipiosManterDependencias(estadoFiltro);
	}

	public void paginarListaMunicipiosManterAgIncorpora(ActionEvent event) {
		listaMunicipiosAgIncorpora = listarMunicipiosManterDependencias(estadoResultDepNovasMun);
	}

	public String consultarDependenciaManter() {
		flagErro=0;
		DependenciasMunicipioDTO dependenciasMunicipioDTO = listaDependenciasMunicipio.get(new Integer(codListaPesquisar));
		consultarInformacoesDependencia(municipio, dependenciasMunicipioDTO);
		
		return flagErro==0?"manter_consulta":"";
			
	}

	public String manterVoltarConsultar() {

		tipoDepartamento = "";
		ccm = "";
		pais = "";
		cep = "";
		numero = "";
		logradouro = "";
		agenciaIncorporadora = "";
		dataAbertura = "";
		dataEncerramento = "";
		cnpj = "";
		descricaoDependencia = "";
		codigoDependencia = "";
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciasMunicipio);

//		prosseguirManterDependencia();
		return "lista_dependencias_municipio";
	}

	public String voltarInformacoesDependenciasNovas() {

		return "carrega_informacoes_dependencias_novas";
	}
	
	public String voltarTelaDependenciasNovas() {
		codListaPesquisar = null;
		return "resultadoDependenciasNovas";
	}
	
	public String voltarTelaDependenciasNovasMun() {
		codListaPesquisar = null;
		return "resultadoDependenciasNovas";
	}
	
	public String retornarInformacoesDependenciasNovasPreenchido() {

		retornarInformacoesDependencias();

		return "carrega_informacoes_dependencias_novas";
	}

	public String retornarInformacoesIncluirPreenchido() {

		retornarInformacoesDependencias();

		return "carrega_informacoes_dependencias_incluir";
	}

	private void retornarInformacoesDependencias() {
		municipioSelecionado = true;

		// seta variáveis para inclusão Parte 3
		AgenciaDTO agenciaDTO = listaAgencias.get(new Integer(codListaPesquisarAgencia));
		codDepIncorpora = agenciaDTO.getCodigoDependencia() != null && !agenciaDTO.getCodigoDependencia().equals("")?Integer.valueOf(agenciaDTO.getCodigoDependencia()):null;		
		numSeqDepIncorpora = agenciaDTO.getNumeroSequencialDependencia() != null && !agenciaDTO.getNumeroSequencialDependencia().equals("")?Integer.valueOf(agenciaDTO.getNumeroSequencialDependencia()):0;
		indiceComboEmpresaIncorpora = agenciaDTO.getCodigoPessoaJuridica();
		descDepIncorpora = agenciaDTO.getDescricaoDependencia();
		if(codListaPesquisarMunicipioProx != null && !codListaPesquisarMunicipioProx.equals("")&& !listaMunicipios.isEmpty()){
			MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codListaPesquisarMunicipioProx));
			municipioagencia = municipioDTO.getCodigo() + " - " + municipioDTO.getNome();
		}else{
			municipioagencia = String.valueOf(codMunicipioIncorp);
		}

		if (codigoMunicipioManter == null) {
			String vetorMunicipio[];
			vetorMunicipio = municipio.split(" - ");
			codigoMunicipioManter = vetorMunicipio[0];
		}

		
	}
	
	public void atribuirDependenciaTodos() {
		if(checkTodos){
			codigosSelecionadosTabela = new Integer[100];
			for (int i = 0; i < dto.getListaPaa().size(); i++) {
				codigosSelecionadosTabela[i+1] = i;
			}
		}else{
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	

	public String voltarIncluirDependenciasAgencia() {

		return "carrega_informacoes_dependencias_incluir";
	}

	public String voltarInformacoesManter() {

		return "manter_alteracao";
	}

	public String retornarInformacoesManterDependenciasPreenchido() {

		retornarInformacoesDependencias();

		return "manter_alteracao";
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
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

	public String getMunicipioFiltro() {
		return municipioFiltro;
	}

	public void setMunicipioFiltro(String municipioFiltro) {
		this.municipioFiltro = municipioFiltro;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}

	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}

	public String getAgenciaIncorporadora() {
		return agenciaIncorporadora;
	}

	public void setAgenciaIncorporadora(String agenciaIncorporadora) {
		this.agenciaIncorporadora = agenciaIncorporadora;
	}

	public String getCodigoAgenciaIncorpDepto() {
		return codigoAgenciaIncorpDepto;
	}

	public void setCodigoAgenciaIncorpDepto(String codigoAgenciaIncorpDepto) {
		this.codigoAgenciaIncorpDepto = codigoAgenciaIncorpDepto;
	}

	public String getCcm() {
		return ccm;
	}

	public void setCcm(String ccm) {
		this.ccm = ccm;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public String getCodListaPesquisar() {
		return codListaPesquisar;
	}

	public void setCodListaPesquisar(String codListaPesquisar) {
		this.codListaPesquisar = codListaPesquisar;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public List<DependenciasNovasDTO> getListaDependenciasNovas() {
		return listaDependenciasNovas;
	}

	public void setListaDependenciasNovas(List<DependenciasNovasDTO> listaDependenciasNovas) {
		this.listaDependenciasNovas = listaDependenciasNovas;
	}

	public boolean isMostraDependencias() {
		return mostraDependencias;
	}

	public void setMostraDependencias(boolean mostraDependencias) {
		this.mostraDependencias = mostraDependencias;
	}

	public List<MunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<MunicipioDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public void setMostraMunicipios(boolean mostraMunicipios) {
		this.mostraMunicipios = mostraMunicipios;
	}

	public boolean isMostraMunicipios() {
		return mostraMunicipios;
	}

	public boolean isMostraAgencias() {
		return mostraAgencias;
	}

	public void setMostraAgencias(boolean mostraAgencias) {
		this.mostraAgencias = mostraAgencias;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public String getNomeAgenciaIncorpDepto() {
		return nomeAgenciaIncorpDepto;
	}

	public void setNomeAgenciaIncorpDepto(String nomeAgenciaIncorpDepto) {
		this.nomeAgenciaIncorpDepto = nomeAgenciaIncorpDepto;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<AgenciaDTO> getListaAgencias() {
		return listaAgencias;
	}

	public void setListaAgencias(List<AgenciaDTO> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}

	public List<DependenciasMunicipioDTO> getListaDependenciasMunicipio() {
		return listaDependenciasMunicipio;
	}

	public void setListaDependenciasMunicipio(List<DependenciasMunicipioDTO> listaDependenciasMunicipio) {
		this.listaDependenciasMunicipio = listaDependenciasMunicipio;
	}

	public boolean isMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public String getCodigoMunicipioManter() {
		return codigoMunicipioManter;
	}

	public void setCodigoMunicipioManter(String codigoMunicipioManter) {
		this.codigoMunicipioManter = codigoMunicipioManter;
	}

	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public String getNumeroUnidadeOrganizacional() {
		return numeroUnidadeOrganizacional;
	}

	public void setNumeroUnidadeOrganizacional(String numeroUnidadeOrganizacional) {
		this.numeroUnidadeOrganizacional = numeroUnidadeOrganizacional;
	}

	public void setMunicipioSelecionado(boolean municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public String getCodListaPesquisarAgencia() {
		return codListaPesquisarAgencia;
	}

	public void setCodListaPesquisarAgencia(String codListaPesquisarAgencia) {
		this.codListaPesquisarAgencia = codListaPesquisarAgencia;
	}

	public String getCodListaPesquisarMunicipio() {
		return codListaPesquisarMunicipio;
	}

	public void setCodListaPesquisarMunicipio(String codListaPesquisarMunicipio) {
		this.codListaPesquisarMunicipio = codListaPesquisarMunicipio;
	}

	public int getIndTributavel() {
		return indTributavel;
	}

	public void setIndTributavel(int indTributavel) {
		this.indTributavel = indTributavel;
	}

	public IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
	}

	public String getCodigoMunicipioIncorporada() {
		return codigoMunicipioIncorporada;
	}

	public void setCodigoMunicipioIncorporada(String codigoMunicipioIncorporada) {
		this.codigoMunicipioIncorporada = codigoMunicipioIncorporada;
	}

	public MunicipioDTO getMunicipioIncorporadoSelecionado() {
		return municipioIncorporadoSelecionado;
	}

	public void setMunicipioIncorporadoSelecionado(MunicipioDTO municipioIncorporadoSelecionado) {
		this.municipioIncorporadoSelecionado = municipioIncorporadoSelecionado;
	}

	public String getCodListaPesquisarMunicipioProx() {
		return codListaPesquisarMunicipioProx;
	}

	public void setCodListaPesquisarMunicipioProx(String codListaPesquisarMunicipioProx) {
		this.codListaPesquisarMunicipioProx = codListaPesquisarMunicipioProx;
	}

	public String getMunicipioagencia() {
		return municipioagencia;
	}

	public void setMunicipioagencia(String municipioagencia) {
		this.municipioagencia = municipioagencia;
	}

	public String getMunicIncorpDepto() {
		return municIncorpDepto;
	}

	public void setMunicIncorpDepto(String municIncorpDepto) {
		this.municIncorpDepto = municIncorpDepto;
	}

	public String getEstadoMunicIncorpDepto() {
		return estadoMunicIncorpDepto;
	}

	public void setEstadoMunicIncorpDepto(String estadoMunicIncorpDepto) {
		this.estadoMunicIncorpDepto = estadoMunicIncorpDepto;
	}

	public String getCodigoPessoaAgencIncorpDepto() {
		return codigoPessoaAgencIncorpDepto;
	}

	public void setCodigoPessoaAgencIncorpDepto(String codigoPessoaAgencIncorpDepto) {
		this.codigoPessoaAgencIncorpDepto = codigoPessoaAgencIncorpDepto;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public String getNumeroSequencAgencIncorpDepto() {
		return numeroSequencAgencIncorpDepto;
	}

	public void setNumeroSequencAgencIncorpDepto(String numeroSequencAgencIncorpDepto) {
		this.numeroSequencAgencIncorpDepto = numeroSequencAgencIncorpDepto;
	}

	public String getEstadoFiltroAgIncorpora() {
		return estadoFiltroAgIncorpora;
	}

	public void setEstadoFiltroAgIncorpora(String estadoFiltroAgIncorpora) {
		this.estadoFiltroAgIncorpora = estadoFiltroAgIncorpora;
	}

	public List<MunicipioDTO> getListaMunicipiosAgIncorpora() {
		return listaMunicipiosAgIncorpora;
	}

	public void setListaMunicipiosAgIncorpora(List<MunicipioDTO> listaMunicipiosAgIncorpora) {
		this.listaMunicipiosAgIncorpora = listaMunicipiosAgIncorpora;
	}

	public String getCodListaMunicipioSelecionado() {
		return codListaMunicipioSelecionado;
	}

	public void setCodListaMunicipioSelecionado(String codListaMunicipioSelecionado) {
		this.codListaMunicipioSelecionado = codListaMunicipioSelecionado;
	}

	public String getEstadoConsulta() {
		return estadoConsulta;
	}

	public void setEstadoConsulta(String estadoConsulta) {
		this.estadoConsulta = estadoConsulta;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public String getIndiceComboEmpresaFiltro() {
		return indiceComboEmpresaFiltro;
	}

	public void setIndiceComboEmpresaFiltro(String indiceComboEmpresaFiltro) {
		this.indiceComboEmpresaFiltro = indiceComboEmpresaFiltro;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public Integer getCodDepFiltro() {
		return codDepFiltro;
	}

	public void setCodDepFiltro(Integer codDepFiltro) {
		this.codDepFiltro = codDepFiltro;
	}

	public String getDescDepFiltro() {
		return descDepFiltro;
	}

	public void setDescDepFiltro(String descDepFiltro) {
		this.descDepFiltro = descDepFiltro;
	}

	public ItemDependencia getDep() {
		return dep;
	}

	public void setDep(ItemDependencia dep) {
		this.dep = dep;
	}

	public Integer getNumSeqDepFiltro() {
		return numSeqDepFiltro;
	}

	public void setNumSeqDepFiltro(Integer numSeqDepFiltro) {
		this.numSeqDepFiltro = numSeqDepFiltro;
	}

	public boolean isMostraMunicipiosIncorpora() {
		return mostraMunicipiosIncorpora;
	}

	public void setMostraMunicipiosIncorpora(boolean mostraMunicipiosIncorpora) {
		this.mostraMunicipiosIncorpora = mostraMunicipiosIncorpora;
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

	public String getEstadoResultDepNovasMun() {
		return estadoResultDepNovasMun;
	}

	public void setEstadoResultDepNovasMun(String estadoResultDepNovasMun) {
		this.estadoResultDepNovasMun = estadoResultDepNovasMun;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BuscaMunicipioBean getBuscaMunicipioIncorp() {
		return buscaMunicipioIncorp;
	}

	public void setBuscaMunicipioIncorp(BuscaMunicipioBean buscaMunicipioIncorp) {
		this.buscaMunicipioIncorp = buscaMunicipioIncorp;
	}

	public Long getCodMunicipioIncorp() {
		return codMunicipioIncorp;
	}

	public void setCodMunicipioIncorp(Long codMunicipioIncorp) {
		this.codMunicipioIncorp = codMunicipioIncorp;
	}

	public int getFlagErro() {
		return flagErro;
	}

	public void setFlagErro(int flagErro) {
		this.flagErro = flagErro;
	}

	/**
	 * @return the dto
	 */
	public DependenciaDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(DependenciaDTO dto) {
		this.dto = dto;
	}

	/**
	 * @return the selectItemLista
	 */
	public List<SelectItem> getSelectItemLista() {
		return selectItemLista;
	}

	/**
	 * @param selectItemLista the selectItemLista to set
	 */
	public void setSelectItemLista(List<SelectItem> selectItemLista) {
		this.selectItemLista = selectItemLista;
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
	 * @return the selectItemListaCont
	 */
	public List<SelectItem> getSelectItemListaCont() {
		return selectItemListaCont;
	}

	/**
	 * @param selectItemListaCont the selectItemListaCont to set
	 */
	public void setSelectItemListaCont(List<SelectItem> selectItemListaCont) {
		this.selectItemListaCont = selectItemListaCont;
	}

	/**
	 * @return the codigosSelecionadosTabelaCont
	 */
	public Integer[] getCodigosSelecionadosTabelaCont() {
		return codigosSelecionadosTabelaCont;
	}

	/**
	 * @param codigosSelecionadosTabelaCont the codigosSelecionadosTabelaCont to set
	 */
	public void setCodigosSelecionadosTabelaCont(Integer[] codigosSelecionadosTabelaCont) {
		this.codigosSelecionadosTabelaCont = codigosSelecionadosTabelaCont;
	}

	/**
	 * @return the indexCont
	 */
	public Integer getIndexCont() {
		return indexCont;
	}

	/**
	 * @param indexCont the indexCont to set
	 */
	public void setIndexCont(Integer indexCont) {
		this.indexCont = indexCont;
	}

	/**
	 * @return the disabledIndTrib
	 */
	public boolean isDisabledIndTrib() {
		return disabledIndTrib;
	}

	/**
	 * @param disabledIndTrib the disabledIndTrib to set
	 */
	public void setDisabledIndTrib(boolean disabledIndTrib) {
		this.disabledIndTrib = disabledIndTrib;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getTragSemTrag() {
		return tragSemTrag;
	}

	public void setTragSemTrag(String tragSemTrag) {
		this.tragSemTrag = tragSemTrag;
	}
}
