package br.com.bradesco.web.giss.view.bean.controller.municipio.manter;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.ConsultarMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.LegislacaoDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.service.business.mantermunicipio.IManterMunicipioService;
import br.com.bradesco.web.giss.service.business.mantermunicipio.IManterMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.AlteracaoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.ContaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.IObterDescDependenciaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.bean.ItemDependencia;
import br.com.bradesco.web.giss.service.business.resultmunnovo.IResultMunNovoService;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.IncluirMunicipioDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

import com.lowagie.text.DocumentException;

public class ManterMunicipioBean implements Serializable, BuscaMunicipioCallback{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IManterMunicipioService manterMunicipioImpl;																//referente a interface
	private ILogManager logger;																							//log
	private String estadoFiltro;																						//codigo do estado selecionado
	private String municipioFiltro;
	private String tipoServicoFiltro;																					//codigo do tipo de servico selecionado
	private String tipoIncidenciaFiltro;	
	private String formaPagamentoFiltro;
	private String diaUtilPagtoFiltro;
	private String itemSelecionadoLista;
	private boolean mostraMunicipios;																					//mostra ou não a lista dos municipios
	private boolean mostraAgencias;
	private boolean mostraContasTipoServico;
	private List<AgenciaDTO> listaAgencias = new ArrayList<AgenciaDTO>();												//lista de agências
	private List<MunicipioDTO> listaMunicipios = new ArrayList<MunicipioDTO>();											//lista de municipios
	private List<MunicipioDTO> listaMunicipiosAll = new ArrayList<MunicipioDTO>();
	private List<ContaMunicipioDTO> listaContasTipoServico = new ArrayList<ContaMunicipioDTO>();
	public List<SelectItem> listaEstados = new ArrayList<SelectItem>();													//lista do combo de estados	
	public List<SelectItem> listaTipoServico = new ArrayList<SelectItem>();												//lista do combo de tipo de serviço
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleTipoServicoCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaMunSelecaoControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaAgenciaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaTipoIncidencia = new ArrayList<SelectItem>();
	private List<SelectItem> lstLegislacao = new ArrayList<SelectItem>();
	//lista de componentes radio/check
	private String codListaPesquisar;																					//código da dependencia selecionada
	private String codListaPesquisarAgencia;
	private String codListaPesquisarMunicipio;
	private String codListaPesquisaConta;
	private boolean mostraBotoes;																						//mostra ou não botões de paginação
	private boolean municipioSelecionado;
	private String estado;
	private String municipio;
	
	private String codigoMunicipio;
	private String nomeMunicipio;
	private String nomeUnidadeFederativa;
	private String percentualAliquota;
	private String diaVencimento;
	private String pagtoDiaUtil;
	private String descFormaPagamento;
	private String percentualBaseCalculo;
	private String percentualAliquotaPadrao;
	private String descTipoIncidencia;
	private String descUnidadeFederativa;
	private String dependenciaCentralizadora;
	private String codigoMunicipioFiltro;
	
	private String tipoServico;
	private String codigoConta;
	private String razao;
	private String codigoTributo;
	private Date dataInicioVigencia;
	private Date dataFinalVigencia;
	private String aliquota;
	private String aliquotaConfirm;
	private String codigoTributoConfirm;
	private String codigoAgenciaIncorpDepto;
	private String nomeAgenciaIncorpDepto;

	private List<MunicipioDTO> listaMunicipiosSelecao = new ArrayList<MunicipioDTO>();
	private String estadoFiltroRecolhimento;
	private Integer codDependenciaCentralizadora;
	private String descDependenciaCentralizadora;
	private Long codMunicipioCentralizador;
	private String descMunicipioCentralizador;
	private String codPessoaCentralizadora;
	private String seqCentralizadora;
	private String estadoMunicIncorpDepto;
	private String codigoPessoaAgencIncorpDepto; 
	private DetalheMunicipioDTO detalheMunicipio = new DetalheMunicipioDTO();
	private IResultMunNovoService resultMunicNovoImpl;
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
	private String nroLei;
	private String descLei;
	private String inforComplementar;
	private Integer tipoPesquisa;
	private String percentualAliquotaMassa;
	private ConsultarMunicipiosNovosDTO entradaConsultarMunicipiosNovos = null;
	
	public String inicializaManterMunicipio(){
		codigoMunicipioFiltro = null;
		mostraMunicipios = false;
		mostraBotoes = false;
		estadoFiltro = "";
		estadoFiltroRecolhimento = "";
		listaMunicipios.clear();
		buscaMunicipio = new BuscaMunicipioBean();
		itemSelecionadoLista = "";
		listaTipoIncidencia = new ArrayList<SelectItem>();
		listaEmpresa = new ArrayList<SelectItem>();
		tipoPesquisa = 1;
		carregar();
		carregaComboEstados();		
		
		return "manterMunicipioInicial";
		
	}
	
	public void carregar(){
		listaTipoIncidencia = manterMunicipioImpl.listarTipoIncidencia();
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
	}
	
	public void buscaMunicipioIncorp(){
		tipo = "manterIncorp";
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
		if(tipo.equals("manter")){
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
	
	private void inicializa(){
//		listaMunicipios.clear();
		codListaPesquisarMunicipio = null;
		listaMunicipiosSelecao.clear();
		estadoResultDepNovasMun = null;
		codListaPesquisarAgencia = null;
		mostraMunicipiosIncorpora = false;
		buscaMunicipioIncorp = new BuscaMunicipioBean();
		codigoMunicipioIncorporada = null;
	}
	
	public String localizarDependenciaManter() {
		inicializa();
		return "manterAlteracaoRespRecolhimentoListaMunic";
	}
	
	public List<SelectItem> carregaComboEstados() {

		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}
	
	public void carregaListaMunicipios(){
		entradaConsultarMunicipiosNovos = new ConsultarMunicipiosNovosDTO();
		entradaConsultarMunicipiosNovos.setCdMunicipio(getBuscaMunicipio().getCodigo());
		entradaConsultarMunicipiosNovos.setCdTela("M");
		entradaConsultarMunicipiosNovos.setCdUf(GissUtil.verificaStringNulaInteger(getEstadoFiltro()));	
		entradaConsultarMunicipiosNovos.setTipoPesquisa(getTipoPesquisa());
		
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioManter();
			codigoMunicipio = buscaMunicipio.getCodigo().toString();
			codigoMunicipioFiltro = buscaMunicipio.getCodigo().toString();
			listarMunicipiosManter();
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioManter();
			return;
		}else if(!estadoFiltro.equals("") && estadoFiltro != null){
			codigoMunicipio = buscaMunicipio.getCodigo()!=null&&buscaMunicipio.getCodigo()!=0?buscaMunicipio.getCodigo().toString():"0";
			codigoMunicipioFiltro = buscaMunicipio.getCodigo()!=null&&buscaMunicipio.getCodigo()!=0?buscaMunicipio.getCodigo().toString():"0";
			listarMunicipiosManter();
		}else{			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
		}
	}
	
	public String carregaListaContasTipoServicoExclusao(){

		if(!codigoMunicipio.equals("") && tipoServicoFiltro != null){
			try {
				listarContasTipoServico();
				return "manterMunicipioContasExclusaoResultado";
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioContasExclusao", BradescoViewExceptionActionType.ACTION, false);
				setMostraContasTipoServico(false);
				return null;
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}else{
			setMostraContasTipoServico(false);
			BradescoFacesUtils.addInfoModalMessage("Selecione o Tipo de Serviço.", "manterMunicipioContasExclusao", BradescoViewExceptionActionType.ACTION, false);
		}
		
		return null;
	}
	
	public String carregaListaContasTipoServico(){

		if(!codigoMunicipio.equals("") && tipoServicoFiltro != null){
			try {
				listarContasTipoServico();
				return "manterMunicipioContasTipoServicoResultado";
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioContasTipoServico", BradescoViewExceptionActionType.ACTION, false);
				setMostraContasTipoServico(false);
				return null;
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}else{
			setMostraContasTipoServico(false);
			BradescoFacesUtils.addInfoModalMessage("Selecione o Tipo de Serviço.", "manterMunicipioContasTipoServico", BradescoViewExceptionActionType.ACTION, false);
		}
		
		return null;
	}

	public String  carregaConsultarMunicipioDetalhe(){
		
		if (carregaConsultarMunicipio("C")) {
			return "manterMunicipioDetalhes";
		}
		
		return "";
	}

	public boolean carregaConsultarMunicipio(String origem) {

		try {
			
			MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(itemSelecionadoLista));
			
			DetalheMunicipioDTO detalheMunicipioDTO = manterMunicipioImpl.detalharMunicipio(municipioDTO.getCodigo(), tipoPesquisa);
			setDetalheMunicipio(detalheMunicipioDTO);

			codigoMunicipio = municipioDTO.getCodigo();
			nomeMunicipio = municipioDTO.getNome();			
			nomeUnidadeFederativa =  GissUtil.procuraUnidadeFederativaSemCodigo(listaEstados, estadoFiltro);
			percentualAliquota = detalheMunicipioDTO.getPercentualAliquota();
			diaVencimento = detalheMunicipioDTO.getDiaVencimento();
			percentualBaseCalculo = detalheMunicipioDTO.getPercentualBaseCalculo();
			percentualAliquotaPadrao = detalheMunicipioDTO.getPercentualAliquotaPadrao();
			descUnidadeFederativa = nomeUnidadeFederativa;
			dependenciaCentralizadora = detalheMunicipioDTO.getDependenciaCentralizadora();
			codDependenciaCentralizadora = detalheMunicipioDTO.getCodigoDependRespRecolhimento();
			descDependenciaCentralizadora = detalheMunicipioDTO.getNomeDependRespRecolhimento();
			codMunicipioCentralizador = detalheMunicipioDTO.getCodigoMunicipioCentralizadora();
			descMunicipioCentralizador = detalheMunicipioDTO.getDescricaoMunicipio();
			codPessoaCentralizadora = detalheMunicipioDTO.getCodigoPessoaJuridica();
			seqCentralizadora = detalheMunicipioDTO.getNumeroSequencialCentralizadora();
			if(detalheMunicipioDTO.getNroLei() == null | "0".equals(detalheMunicipioDTO.getNroLei())){
				nroLei = "";
			}
			else{
				nroLei = detalheMunicipioDTO.getNroLei();
			}
			inforComplementar = detalheMunicipioDTO.getInfoComplementar();
			descLei = detalheMunicipioDTO.getDescLei();
			
			codDepIncorpora = detalheMunicipioDTO.getCodigoDependRespRecolhimento() != null && !detalheMunicipioDTO.getCodigoDependRespRecolhimento().equals("")?!detalheMunicipioDTO.getCodigoDependRespRecolhimento().equals("0")?Integer.valueOf(detalheMunicipioDTO.getCodigoDependRespRecolhimento()):null:null; //
			descDepIncorpora = detalheMunicipioDTO.getNomeDependRespRecolhimento(); //	
			estadoMunicIncorpDepto = nomeUnidadeFederativa;
			codigoPessoaAgencIncorpDepto = detalheMunicipioDTO.getCodigoPessoaJuridica();
			numSeqDepIncorpora = detalheMunicipioDTO.getNumeroSequencialCentralizadora() != null && !detalheMunicipioDTO.getNumeroSequencialCentralizadora().equals("")?Integer.valueOf(detalheMunicipioDTO.getNumeroSequencialCentralizadora()):0;

			setEstadoFiltroRecolhimento(GissUtil.procuraCodigoUnidadeFederativa(listaEstados, detalheMunicipioDTO.getNomeUnidadeFederativa()));

			if(origem.equals("C")){
				if(detalheMunicipioDTO.getPagtoDiaUtil().equals("S")){
					pagtoDiaUtil = IManterMunicipioServiceConstants.PAGAMENTO_DIA_UTIL_SIM;
				}else{
					pagtoDiaUtil = IManterMunicipioServiceConstants.PAGAMENTO_DIA_UTIL_NAO;
				}
			
				if(detalheMunicipioDTO.getDescFormaPagamento().equals("1")){
					descFormaPagamento = IManterMunicipioServiceConstants.FORMA_PAGAMENTO_ANTECIPA;
				}else{
					descFormaPagamento = IManterMunicipioServiceConstants.FORMA_PAGAMENTO_PRORROGA;
				}	
		
				descTipoIncidencia = detalheMunicipioDTO.getNomeTipoIncidencia();
				
			}else{
				if(detalheMunicipioDTO.getPagtoDiaUtil().equals("S")){
					pagtoDiaUtil = "1";
				}else{
					pagtoDiaUtil = "2";
				}
				descFormaPagamento = detalheMunicipioDTO.getDescFormaPagamento();
				
				descTipoIncidencia = detalheMunicipioDTO.getDescTipoIncidencia();
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioInicial", BradescoViewExceptionActionType.ACTION, false);
			return false;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return true;
	}
	
	public String carregaAlteracaoMunicipio() {

		if (carregaConsultarMunicipio("A")) {
			return "manterMunicipioDetalheAlteracao";
		}

		return "";
	}
	
	public String carregaExclusaoMunicipio() {

		if (carregaConsultarMunicipio("C")) {
			return "manterMunicipioDetalheExclusao";
		}
		
		return "";
	}
	
	private boolean listarMunicipios() {

		try {
			
			listaMunicipiosSelecao = manterMunicipioImpl.listarMunicipios(estadoResultDepNovasMun, 0L);

			if (listaMunicipiosSelecao != null) {
				preencherItemsMunicipioSelecao();

				if (listaMunicipiosSelecao.size() > IManterMunicipioServiceConstants.NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraMunicipios = true;
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioDetalheAlteracao", BradescoViewExceptionActionType.ACTION, false);
				return false;
		}
		return true;
	}
	
	private void listarMunicipiosManter() {

		try {
			
			MunicipioDTO municipioDTO = manterMunicipioImpl.listarMunicipiosManter(estadoFiltro, codigoMunicipioFiltro != null&&!codigoMunicipioFiltro.equals("")?Long.valueOf(codigoMunicipioFiltro):0L, tipoPesquisa);
			
//			MunicipioDTO municipioDTOAll = new MunicipioDTO();
//			municipioDTOAll= manterMunicipioImpl.listarMunicipiosManterAll(estadoFiltro, codigoMunicipioFiltro != null&&!codigoMunicipioFiltro.equals("")?Long.valueOf(codigoMunicipioFiltro):0L, tipoPesquisa);
			
			listaMunicipios = municipioDTO.getLstMunicipios();
//			listaMunicipiosAll = municipioDTOAll.getLstMunicipios();
			
			lstLegislacao = new ArrayList<SelectItem>();
			for(LegislacaoDTO legislacao : municipioDTO.getLstLegislacao()){
				lstLegislacao.add(new SelectItem(String.valueOf(legislacao.getCodLegislacao()), legislacao.getDescLegislacao()));
			}
			
			if (listaMunicipios != null) {
				preencherItemsMunicipio();

				if (listaMunicipios.size() > IManterMunicipioServiceConstants.NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraMunicipios = true;
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioInicial", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	private void listarContasTipoServico() {
			try {
				listaContasTipoServico = manterMunicipioImpl.listarContasPorTipoServico(codigoMunicipio, tipoServicoFiltro);
			} catch (PdcAdapterFunctionalException p) {
				setListaContasTipoServico(new ArrayList<ContaMunicipioDTO>());
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			}

			if (listaContasTipoServico != null) {
				listaControleTipoServicoCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < listaContasTipoServico.size(); i++) {
					listaControleTipoServicoCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaContasTipoServico.size() > IManterMunicipioServiceConstants.NUMERO_REGISTROS_LISTA_CONTASTIPO_SERVICO) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraContasTipoServico = true;
			}
	}

	public String prosseguirSelecaoDependencia() {
		if(codListaPesquisarMunicipio != null && !codListaPesquisarMunicipio.equals("")){
			MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codListaPesquisarMunicipio));
			setCodMunicipioCentralizador(Long.parseLong(municipioDTO.getCodigo()));
			setDescMunicipioCentralizador(municipioDTO.getNome());
		}else{
			setCodMunicipioCentralizador(codMunicipioIncorp);
		}

		AgenciaDTO agenciaDTO = listaAgencias.get(new Integer(codListaPesquisarAgencia));
		setCodDependenciaCentralizadora(Integer.parseInt(agenciaDTO.getCodigoDependencia()));
		setDescDependenciaCentralizadora(agenciaDTO.getDescricaoDependencia());
		setCodPessoaCentralizadora(agenciaDTO.getCodigoPessoaJuridica());
		setSeqCentralizadora(agenciaDTO.getNumeroSequencialDependencia());
		
		codDepIncorpora = Integer.parseInt(agenciaDTO.getCodigoDependencia());
		descDepIncorpora = agenciaDTO.getDescricaoDependencia();
		indiceComboEmpresaIncorpora = agenciaDTO.getCodigoPessoaJuridica();
		numSeqDepIncorpora = agenciaDTO.getNumeroSequencialDependencia()!=null&&!agenciaDTO.getNumeroSequencialDependencia().equals("")?Integer.valueOf(agenciaDTO.getNumeroSequencialDependencia()):0;

		return "manterMunicipioDetalheAlteracao";
	}

	public String voltarPaginaInicial() {

		preencherItemsMunicipio();
//		listarMunicipiosManter();
		limparDados();
			
		return "manterMunicipioInicial";
		
	}

	private void preencherItemsMunicipio() {
		listaControleCheckRadio = new ArrayList<SelectItem>();
		for (int i = 0; i < listaMunicipios.size(); i++) {
			listaControleCheckRadio.add(new SelectItem(i, " "));
		}
	}
	
	public String voltarPaginaDetalheConsulta(){
		
		listaContasTipoServico.clear();
		listaTipoServico.clear();
		tipoServicoFiltro = "";
		
		return "manterMunicipioDetalhes";
	}
	
	public String voltarPaginaDetalheExclusao(){
		
		listaContasTipoServico.clear();
		listaTipoServico.clear();
		tipoServicoFiltro = "";
		
		return "manterMunicipioExclusao";
	}

	public String voltarPaginaSelecionarMunicipio() {
		preencherItemsMunicipioSelecao();

		return "manterAlteracaoRespRecolhimentoListaMunic";
	}
	
	private void preencherItemsMunicipioSelecao() {
		listaMunSelecaoControleCheckRadio = new ArrayList<SelectItem>();
		for (int i = 0; i < listaMunicipiosSelecao.size(); i++) {
		    listaMunSelecaoControleCheckRadio.add(new SelectItem(i, " "));
		}
	}
	public String paginarManterListaMunicipio(ActionEvent evt) {
		listarMunicipiosManter();
		setListaMunicipios(listaMunicipios);
		return "resultadoMunicipiosNovos";
	}	
	
	public void paginarListaMunicipioSelecao(ActionEvent event){
		listarMunicipios();
	}
	
	public void paginarManterListaContasTipoServico(ActionEvent event){
		
		carregaListaContasTipoServico();
		setListaContasTipoServico(listaContasTipoServico);
		
	}
	
	public void paginarListaAgencias(ActionEvent event){
		try {
			listarContasTipoServico();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			setMostraContasTipoServico(false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		setListaAgencias(listaAgencias);
	}
		
	public String abreContasMunicipio(){
		
		//Chama classe de servico para preenchimento do combo de Tipo de Serviço
		listaTipoServico = manterMunicipioImpl.listarComboTipoServico();
		tipoServicoFiltro = "";
		mostraContasTipoServico = false;
		
		return "manterMunicipioContasTipoServico";
		
	}
	
	public String abreContasExcluirMunicipio(){
		
		//Chama classe de servico para preenchimento do combo de Tipo de Serviço
		listaTipoServico = manterMunicipioImpl.listarComboTipoServico();
		tipoServicoFiltro = "";
		mostraContasTipoServico = false;
			
		return "manterMunicipioContasExclusao";
		
	}

	public String abreAlterarRespRecolhimento() {
		setTipoServicoFiltro("");
		setListaContasTipoServico(new ArrayList<ContaMunicipioDTO>());
		setListaTipoServico(manterMunicipioImpl.listarComboTipoServico());

		return "manterAlteracaoRespRecolhimento";
	}

	public String pesquisarAgencia() {
		listarContasTipoServico();
		percentualAliquotaMassa = null;

		return null;
	}

	public void paginarListaContasTipoServico(ActionEvent actionEvent) {
		listarContasTipoServico();
	}

	public void executaExcluirMunicipio() {

		try {
			
			DetalheMunicipioDTO  detalheMunicipio = manterMunicipioImpl.excluirMunicipio(codigoMunicipio);

			BradescoFacesUtils.addInfoModalMessage(detalheMunicipio.getMensagemErro(), "manterMunicipioInicial", BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioInicial", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			limparDados();
		}

	}
	
	public String executaAlterarMunicipio() {

		try {
			
			if(!aliquotaConfirm.trim().equals("") && !codigoTributoConfirm.trim().equals("") && dataInicioVigencia != null){
					BigDecimal vlrAliquota = NumberUtils.convert(aliquotaConfirm);
					if (vlrAliquota.compareTo(new BigDecimal(100)) > 0) {
						BradescoFacesUtils.addInfoModalMessage("A alíquota não pode ser maior que 100.", "manterAlteracaoMunicipioContasConfirmacao", BradescoViewExceptionActionType.ACTION, false);
						return "manterAlteracaoRespRecolhimento";
					}

					if (!DateUtils.isCurrentDate(dataInicioVigencia) && dataInicioVigencia.before(new Date())) {
						BradescoFacesUtils.addInfoModalMessage("A data Inicial deve ser maior ou igual a data Corrente.", "manterAlteracaoMunicipioContasConfirmacao", BradescoViewExceptionActionType.ACTION, false);
						return "manterAlteracaoRespRecolhimento";
					}
					
						IncluirMunicipioDTO incluirMunicipioDTO = new IncluirMunicipioDTO();

						DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");   
						String strdataInicioVigencia = formatter.format(dataInicioVigencia);

						incluirMunicipioDTO.setAliquotaConta(aliquotaConfirm);
						incluirMunicipioDTO.setCodigoConta(codigoConta == null || "".equals(codigoConta) ? "0-0" : codigoConta.replace(".", ""));
						incluirMunicipioDTO.setCodigoMunicipio(codigoMunicipio);
						incluirMunicipioDTO.setCodigoTipoServico(tipoServicoFiltro);
						incluirMunicipioDTO.setCodigoTributo(codigoTributoConfirm);
						incluirMunicipioDTO.setDataFinalVigenciaConta("31/12/3999");
						incluirMunicipioDTO.setDataInicioVigenciaConta(strdataInicioVigencia);
						incluirMunicipioDTO.setRazao(razao);

						DetalheMunicipioDTO  detalheMunicipio = resultMunicNovoImpl.incluirContasMunicipio(incluirMunicipioDTO);

						listarContasTipoServico();

						BradescoFacesUtils.addInfoModalMessage(detalheMunicipio.getMensagemErro(), "manterAlteracaoRespRecolhimento", BradescoViewExceptionActionType.ACTION, false);
					
			}else{
				BradescoFacesUtils.addInfoModalMessage("Preencha todos os campos.", "manterAlteracaoMunicipioContasConfirmacao", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterAlteracaoMunicipioContasConfirmacao", BradescoViewExceptionActionType.ACTION, false);
		}

		return "manterAlteracaoRespRecolhimento";
	}
	
	public String executaAlterarMunicipioAntes() {

		try {
			
			if(!percentualAliquotaPadrao.equals("") && !percentualBaseCalculo.equals("") && !diaVencimento.equals("") && !pagtoDiaUtil.equals("") && !descFormaPagamento.equals("") && !descTipoIncidencia.equals("") && codDepIncorpora != null && codDepIncorpora > 0){
			
				if(Integer.valueOf(diaVencimento) > 31){
					BradescoFacesUtils.addInfoModalMessage("O dia de vencimento não pode ser maior que 31.", "manterMunicipioDetalheAlteracao", BradescoViewExceptionActionType.ACTION, false);			
				}else{
				
					if(Double.valueOf(percentualBaseCalculo.replace(",", ".")) > 100 || Double.valueOf(percentualAliquotaPadrao.replace(",", ".")) > 100){
						BradescoFacesUtils.addInfoModalMessage("Os campos de percentual devem ser menores ou igual a 100.", "manterMunicipioDetalheAlteracao", BradescoViewExceptionActionType.ACTION, false);
					}else{
					
						carregarDependenciaIncorporaDepNova();
						
						AlteracaoMunicipioDTO alteracaoMunicipioDTO = new AlteracaoMunicipioDTO();

						alteracaoMunicipioDTO.setCodigoFormaPagamento(descFormaPagamento);
						alteracaoMunicipioDTO.setCodigoMunicipio(codigoMunicipio);
						alteracaoMunicipioDTO.setCodigoTipoIncidencia(descTipoIncidencia);
						alteracaoMunicipioDTO.setCodigoUnidadeOrganizacional(indiceComboEmpresaIncorpora);
						alteracaoMunicipioDTO.setNumeroUnidadeOrganizacional(String.valueOf(numSeqDepIncorpora));
								
						alteracaoMunicipioDTO.setDiaVencimento(diaVencimento);
						alteracaoMunicipioDTO.setIndNecessidadePagtoDiaUtil(pagtoDiaUtil);
						alteracaoMunicipioDTO.setPercentualAliquotaPadrao(percentualAliquotaPadrao);
						alteracaoMunicipioDTO.setPercentualBaseAliquota(percentualBaseCalculo);
						if("".equals(nroLei)){
							nroLei = "0";
						}
						alteracaoMunicipioDTO.setNroLei(nroLei);
						alteracaoMunicipioDTO.setInforComplementar(inforComplementar);
			
						DetalheMunicipioDTO  detalheMunicipio = manterMunicipioImpl.alterarMunicipio(alteracaoMunicipioDTO);

//						listarMunicipiosManter();
//						limparDados();
						BradescoFacesUtils.addInfoModalMessage(detalheMunicipio.getMensagemErro(), "manterMunicipioInicial", BradescoViewExceptionActionType.ACTION, false);
					}	
				}
			}else{
				BradescoFacesUtils.addInfoModalMessage("Preencha todos os campos.", "manterMunicipioDetalheAlteracao", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipioDetalheAlteracao", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return "manterMunicipioInicial";
	}

	public String pesquisarMunicipioManterRecolhimento(){
		if(buscaMunicipioIncorp.getCodigo() != null && buscaMunicipioIncorp.getCodigo() != 0){
			buscaMunicipioIncorp();
			codMunicipioIncorp = buscaMunicipioIncorp.getCodigo();
			listarAgenciasPorMunicipio(String.valueOf(codMunicipioIncorp));
			GissUtil.retirarMensagemDuplicada(FacesContext.getCurrentInstance());
			listarMunicipios();
			return "manterMunSelecionarAgencia";
		}else if(buscaMunicipioIncorp.getDescricao() != null && !buscaMunicipioIncorp.getDescricao().equals("")){
			buscaMunicipioIncorp();
			return "";
		}else if (!estadoResultDepNovasMun.equals("")) {
			listaMunicipiosSelecao.clear();
			listarMunicipios();
			mostraMunicipiosIncorpora = true;
			return"";
		}else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou preencha o municipio.", false);
			return"";
		}
	}
	
	public String retornarManterDependenciasAgencia(){
		
		municipioSelecionado = true;
		
		MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(codListaPesquisarMunicipio));
		codigoMunicipio = municipioDTO.getCodigo();
		municipio = codigoMunicipio + " - " + municipioDTO.getNome();
		
		
		estado =  GissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);

		return "manterMunicipioDetalheAlteracao";
	}

	public String carregarListaAgencias(){
		MunicipioDTO municipioDTO = listaMunicipiosSelecao.get(new Integer(codListaPesquisarMunicipio));

		//lista agencias por municipio
		listarAgenciasPorMunicipio(municipioDTO.getCodigo());

		return "manterMunSelecionarAgencia";
	}

	public void carregarListaAgenciasPorMunicipio(ActionEvent event){
		
		//lista agencias por municipio
		listarAgenciasPorMunicipio(codigoMunicipio);
		
	}
	
	private void listarAgenciasPorMunicipio(String codMunicipio) {

		try {
			
			listaAgencias = manterMunicipioImpl.listarAgenciasMunicipio(codMunicipio);

			if (listaAgencias != null) {
				listaAgenciaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < listaAgencias.size(); i++) {
				    listaAgenciaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaAgencias.size() > IManterMunicipioServiceConstants.NUMERO_REGISTROS_LISTA_AGENCIAS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraAgencias = true;
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterAlteracaoRespRecolhimento", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public String voltarInformacoesMunicipioAlteracao(){
		
		municipioSelecionado = false;
		codListaPesquisarAgencia = "";
		codListaPesquisarMunicipio = "";
		listaAgencias.clear();
		estado = "";
		municipio = "";
		
		return "manterMunicipioDetalheAlteracao";
	}
	
	public String limparCamposInforRecolhimento(){
		
		listaAgencias.clear();
		mostraAgencias = false;
		estadoFiltro = "";
		listaMunicipios.clear();
		municipioSelecionado = false;
		codListaPesquisarMunicipio = "";
		
		return "manterAlteracaoRespRecolhimento";
	}
	
	public void limparCamposAlteracao(){
		
		diaVencimento = "";
		pagtoDiaUtil = "";
		descFormaPagamento = "";
		percentualBaseCalculo = "";
		percentualAliquotaPadrao = "";
		descTipoIncidencia = "";
		tipoIncidenciaFiltro = "";
		inforComplementar = "";
		nroLei = "";
		
	}
	
	public void limparCamposContasMunicipio(){
		
		listaContasTipoServico.clear();
		codListaPesquisaConta = "";
		mostraContasTipoServico = false;
		tipoServicoFiltro = "";
		
	}
	
	public String carregaAlteracaoMunicipioContas() {

		listaTipoServico.clear();
		listaContasTipoServico.clear();
		codListaPesquisaConta = "";
		mostraContasTipoServico = false;
				
		//seta variáveis para alteração Parte 3
		AgenciaDTO agenciaDTO = listaAgencias.get(new Integer(itemSelecionadoLista));
		codigoAgenciaIncorpDepto = agenciaDTO.getCodigoPessoaJuridica();
		nomeAgenciaIncorpDepto = agenciaDTO.getNumeroSequencialDependencia();

		//Chama classe de servico para preenchimento do combo de Tipo de Serviço
		listaTipoServico = manterMunicipioImpl.listarComboTipoServico();

		return "manterAlteracaoMunicipioContas";
	}
	
	public String voltarRespRecolhimentoMunicipio(){
		
		listaTipoServico.clear();
		listaContasTipoServico.clear();
		tipoServicoFiltro = "";
		codListaPesquisaConta = "";
		mostraContasTipoServico = false;
		
		return "manterAlteracaoRespRecolhimento";
	}
	
	public String carregaDetalheContaMunicipio(){
		
		ContaMunicipioDTO contasMunicDTO = listaContasTipoServico.get(Integer.valueOf(codListaPesquisaConta));
		
		tipoServico = GissUtil.procuraTipoServico(listaTipoServico, tipoServicoFiltro);
		codigoConta = contasMunicDTO.getConta();
		razao = contasMunicDTO.getRazao();
		codigoTributo = contasMunicDTO.getCodigoTributo();
		if (contasMunicDTO.getAliquota() != null) {
			aliquota = contasMunicDTO.getAliquota().replaceAll("\\.", ",");
		} else {
			aliquota = "";
		}
		aliquotaConfirm = aliquota;
		codigoTributoConfirm = codigoTributo;
		dataInicioVigencia = contasMunicDTO.getDtInicioVigencia();
		dataFinalVigencia = contasMunicDTO.getDtFinalVigencia();
		
		return "manterAlteracaoMunicipioContasConfirmacao";
	}
	
	public String voltarMunicipioContas(){
		
		dataInicioVigencia = null;
		dataFinalVigencia = null;
		
		return "manterAlteracaoRespRecolhimento";		
	}
	
	public String limparCamposContas(){
		
		aliquotaConfirm = "";
		codigoTributo = "";
		dataInicioVigencia = null;
		dataFinalVigencia = null;
		
		return "manterAlteracaoMunicipioContasConfirmacao";
	}
	
	public void limparDados(){
		
		codigoMunicipio = "";
		nomeMunicipio = "";
		nomeUnidadeFederativa = "";
		percentualAliquota = "";
		diaVencimento = "";
		pagtoDiaUtil = "";
		descFormaPagamento = "";
		percentualBaseCalculo = "";
		percentualAliquotaPadrao = "";
		descTipoIncidencia = "";
		descUnidadeFederativa = "";
		dependenciaCentralizadora = "";
		tipoServico = "";
		codigoConta = "";
		codigoTributo = "";
		dataInicioVigencia = new Date();
		dataFinalVigencia = new Date();
		aliquota = "";
		aliquotaConfirm = "";
		codigoTributoConfirm = "";
		
	}
	
	public void imprimir(ActionEvent ae){
	
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Razões do Município", "RAZOES_MUNICIPIOS");
		try {
			exportarPlanilha.razoesMunicipio(listaContasTipoServico);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "manterMunicipioContasTipoServicoResultado", BradescoViewExceptionActionType.ACTION, false);
		}
		
	}
	
	public String imprimirPlanilha(ActionEvent ae){
		try {
			if(listaMunicipios.size() >0){
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Manter Municípios", "MANTER_MUNICIPIOS");
				exportarPlanilha.planilhaMunicipios(listaMunicipios);
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
		if(listaMunicipios.size() >0){
			manterMunicipioImpl.gerarListaMunicipioTXT(listaMunicipios, FacesUtils.getServletResponse().getOutputStream());
		}else{
			BradescoFacesUtils.addInfoModalMessage("Lista de municipios vazia", false);
			return"";
		}
		FacesUtils.getServletResponse().setContentType("application/txt");
		FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.txt");
		FacesUtils.getContext().responseComplete();
		return null;
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
	
	public String getCodigoTributoConfirm() {
		return codigoTributoConfirm;
	}

	public void setCodigoTributoConfirm(String codigoTributoConfirm) {
		this.codigoTributoConfirm = codigoTributoConfirm;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public String getAliquotaConfirm() {
		return aliquotaConfirm;
	}

	public void setAliquotaConfirm(String aliquotaConfirm) {
		this.aliquotaConfirm = aliquotaConfirm;
	}

	public Date getDataFinalVigencia() {
		return dataFinalVigencia;
	}

	public void setDataFinalVigencia(Date dataFinalVigencia) {
		this.dataFinalVigencia = dataFinalVigencia;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public String getCodigoConta() {
		return codigoConta;
	}

	public void setCodigoConta(String codigoConta) {
		this.codigoConta = codigoConta;
	}

	public String getCodigoTributo() {
		return codigoTributo;
	}

	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getCodListaPesquisaConta() {
		return codListaPesquisaConta;
	}

	public void setCodListaPesquisaConta(String codListaPesquisaConta) {
		this.codListaPesquisaConta = codListaPesquisaConta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodListaPesquisarMunicipio() {
		return codListaPesquisarMunicipio;
	}

	public void setCodListaPesquisarMunicipio(String codListaPesquisarMunicipio) {
		this.codListaPesquisarMunicipio = codListaPesquisarMunicipio;
	}

	public String getCodListaPesquisarAgencia() {
		return codListaPesquisarAgencia;
	}

	public void setCodListaPesquisarAgencia(String codListaPesquisarAgencia) {
		this.codListaPesquisarAgencia = codListaPesquisarAgencia;
	}

	public List<AgenciaDTO> getListaAgencias() {
		return listaAgencias;
	}

	public void setListaAgencias(List<AgenciaDTO> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}

	public boolean isMostraAgencias() {
		return mostraAgencias;
	}

	public void setMostraAgencias(boolean mostraAgencias) {
		this.mostraAgencias = mostraAgencias;
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

	public String getDiaUtilPagtoFiltro() {
		return diaUtilPagtoFiltro;
	}

	public void setDiaUtilPagtoFiltro(String diaUtilPagtoFiltro) {
		this.diaUtilPagtoFiltro = diaUtilPagtoFiltro;
	}

	public String getFormaPagamentoFiltro() {
		return formaPagamentoFiltro;
	}

	public void setFormaPagamentoFiltro(String formaPagamentoFiltro) {
		this.formaPagamentoFiltro = formaPagamentoFiltro;
	}

	public String getTipoIncidenciaFiltro() {
		return tipoIncidenciaFiltro;
	}

	public void setTipoIncidenciaFiltro(String tipoIncidenciaFiltro) {
		this.tipoIncidenciaFiltro = tipoIncidenciaFiltro;
	}

	public boolean isMostraContasTipoServico() {
		return mostraContasTipoServico;
	}

	public void setMostraContasTipoServico(boolean mostraContasTipoServico) {
		this.mostraContasTipoServico = mostraContasTipoServico;
	}

	public List<ContaMunicipioDTO> getListaContasTipoServico() {
		return listaContasTipoServico;
	}

	public void setListaContasTipoServico(
			List<ContaMunicipioDTO> listaContasTipoServico) {
		this.listaContasTipoServico = listaContasTipoServico;
	}

	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public String getNomeUnidadeFederativa() {
		return nomeUnidadeFederativa;
	}

	public void setNomeUnidadeFederativa(String nomeUnidadeFederativa) {
		this.nomeUnidadeFederativa = nomeUnidadeFederativa;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDependenciaCentralizadora() {
		return dependenciaCentralizadora;
	}

	public void setDependenciaCentralizadora(String dependenciaCentralizadora) {
		this.dependenciaCentralizadora = dependenciaCentralizadora;
	}

	public String getDescFormaPagamento() {
		return descFormaPagamento;
	}

	public void setDescFormaPagamento(String descFormaPagamento) {
		this.descFormaPagamento = descFormaPagamento;
	}

	public String getDescTipoIncidencia() {
		return descTipoIncidencia;
	}

	public void setDescTipoIncidencia(String descTipoIncidencia) {
		this.descTipoIncidencia = descTipoIncidencia;
	}

	public String getDescUnidadeFederativa() {
		return descUnidadeFederativa;
	}

	public void setDescUnidadeFederativa(String descUnidadeFederativa) {
		this.descUnidadeFederativa = descUnidadeFederativa;
	}

	public String getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getPagtoDiaUtil() {
		return pagtoDiaUtil;
	}

	public void setPagtoDiaUtil(String pagtoDiaUtil) {
		this.pagtoDiaUtil = pagtoDiaUtil;
	}

	public String getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(String percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}

	public String getPercentualAliquotaPadrao() {
		return percentualAliquotaPadrao;
	}

	public void setPercentualAliquotaPadrao(String percentualAliquotaPadrao) {
		this.percentualAliquotaPadrao = percentualAliquotaPadrao;
	}

	public String getPercentualBaseCalculo() {
		return percentualBaseCalculo;
	}

	public void setPercentualBaseCalculo(String percentualBaseCalculo) {
		this.percentualBaseCalculo = percentualBaseCalculo;
	}

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public String getCodListaPesquisar() {
		return codListaPesquisar;
	}

	public void setCodListaPesquisar(String codListaPesquisar) {
		this.codListaPesquisar = codListaPesquisar;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<MunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<MunicipioDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public boolean isMostraMunicipios() {
		return mostraMunicipios;
	}

	public void setMostraMunicipios(boolean mostraMunicipios) {
		this.mostraMunicipios = mostraMunicipios;
	}

	public IManterMunicipioService getManterMunicipioImpl() {
		return manterMunicipioImpl;
	}
	public void setManterMunicipioImpl(IManterMunicipioService manterMunicipioImpl) {
		this.manterMunicipioImpl = manterMunicipioImpl;
	}

	public String getTipoServicoFiltro() {
		return tipoServicoFiltro;
	}

	public void setTipoServicoFiltro(String tipoServicoFiltro) {
		this.tipoServicoFiltro = tipoServicoFiltro;
	}

	public List<SelectItem> getListaTipoIncidencia() {
		return listaTipoIncidencia;
	}

	public void setListaTipoIncidencia(List<SelectItem> listaTipoIncidencia) {
		this.listaTipoIncidencia = listaTipoIncidencia;
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

	public void setNomeAgenciaIncorpDepto(String nomeAgenciaIncorpDepto) {
		this.nomeAgenciaIncorpDepto = nomeAgenciaIncorpDepto;
	}

	public DetalheMunicipioDTO getDetalheMunicipio() {
		return detalheMunicipio;
	}

	public void setDetalheMunicipio(DetalheMunicipioDTO detalheMunicipio) {
		this.detalheMunicipio = detalheMunicipio;
	}

	public String getEstadoFiltroRecolhimento() {
		return estadoFiltroRecolhimento;
	}

	public void setEstadoFiltroRecolhimento(String estadoFiltroRecolhimento) {
		this.estadoFiltroRecolhimento = estadoFiltroRecolhimento;
	}

	public Long getCodMunicipioCentralizador() {
		return codMunicipioCentralizador;
	}

	public void setCodMunicipioCentralizador(Long codMunicipioCentralizador) {
		this.codMunicipioCentralizador = codMunicipioCentralizador;
	}

	public String getDescDependenciaCentralizadora() {
		return descDependenciaCentralizadora;
	}

	public void setDescDependenciaCentralizadora(
			String descDependenciaCentralizadora) {
		this.descDependenciaCentralizadora = descDependenciaCentralizadora;
	}

	public String getDescMunicipioCentralizador() {
		return descMunicipioCentralizador;
	}

	public void setDescMunicipioCentralizador(String descMunicipioCentralizador) {
		this.descMunicipioCentralizador = descMunicipioCentralizador;
	}

	public Integer getCodDependenciaCentralizadora() {
		return codDependenciaCentralizadora;
	}

	public void setCodDependenciaCentralizadora(Integer codDependenciaCentralizadora) {
		this.codDependenciaCentralizadora = codDependenciaCentralizadora;
	}

	public IResultMunNovoService getResultMunicNovoImpl() {
		return resultMunicNovoImpl;
	}

	public void setResultMunicNovoImpl(IResultMunNovoService resultMunicNovoImpl) {
		this.resultMunicNovoImpl = resultMunicNovoImpl;
	}

	public String getCodPessoaCentralizadora() {
		return codPessoaCentralizadora;
	}

	public void setCodPessoaCentralizadora(String codPessoaCentralizadora) {
		this.codPessoaCentralizadora = codPessoaCentralizadora;
	}

	public String getSeqCentralizadora() {
		return seqCentralizadora;
	}

	public void setSeqCentralizadora(String seqCentralizadora) {
		this.seqCentralizadora = seqCentralizadora;
	}

	public List<MunicipioDTO> getListaMunicipiosSelecao() {
		return listaMunicipiosSelecao;
	}

	public void setListaMunicipiosSelecao(List<MunicipioDTO> listaMunicipiosSelecao) {
		this.listaMunicipiosSelecao = listaMunicipiosSelecao;
	}

	public List<SelectItem> getListaControleTipoServicoCheckRadio() {
		return listaControleTipoServicoCheckRadio;
	}

	public void setListaControleTipoServicoCheckRadio(
			List<SelectItem> listaControleTipoServicoCheckRadio) {
		this.listaControleTipoServicoCheckRadio = listaControleTipoServicoCheckRadio;
	}

	public List<SelectItem> getListaMunSelecaoControleCheckRadio() {
	    return listaMunSelecaoControleCheckRadio;
	}

	public void setListaMunSelecaoControleCheckRadio(List<SelectItem> listaMunSelecaoControleCheckRadio) {
	    this.listaMunSelecaoControleCheckRadio = listaMunSelecaoControleCheckRadio;
	}

	public List<SelectItem> getListaAgenciaControleCheckRadio() {
	    return listaAgenciaControleCheckRadio;
	}

	public void setListaAgenciaControleCheckRadio(List<SelectItem> listaAgenciaControleCheckRadio) {
	    this.listaAgenciaControleCheckRadio = listaAgenciaControleCheckRadio;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
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

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
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

	public ItemDependencia getDep() {
		return dep;
	}

	public void setDep(ItemDependencia dep) {
		this.dep = dep;
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

	public String getCodigoMunicipioFiltro() {
		return codigoMunicipioFiltro;
	}

	public void setCodigoMunicipioFiltro(String codigoMunicipioFiltro) {
		this.codigoMunicipioFiltro = codigoMunicipioFiltro;
	}

	public String getPercentualAliquotaMassa() {
		return percentualAliquotaMassa;
	}

	public void setPercentualAliquotaMassa(String percentualAliquotaMassa) {
		this.percentualAliquotaMassa = percentualAliquotaMassa;
	}

	public void atualizarAliquota() {
		String msg = "";
		try {

			if(percentualAliquotaMassa != null && !percentualAliquotaMassa.equals("")){
				msg = manterMunicipioImpl.atualizarAliquota(Integer.valueOf(tipoServicoFiltro), Long.valueOf(codigoMunicipio), percentualAliquotaMassa);
				listarContasTipoServico();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a aliquota.", false);
				return ;
			}
			//listaContas = resultMunicNovoImpl.listarContasTipoServico(String.valueOf(codMunicipioIncorp), tipoServico);
			
			
			//if (listaContas != null) {

			//	for (int i = 0; i <= listaContas.size(); i++) {
			//		listaControlePesquisaContas.add(new SelectItem(String.valueOf(i), " "));
			//	}

			//	if (listaContas.size() > IResultMunNovoServiceConstants.NUMERO_REGISTRO_PAGINA_MUNICIPIOS_NOVOS) {
			//		mostraBotoesContas = true;
			//	} else {
			//		mostraBotoesContas = false;
			//	}
			//	mostraContas = true;
			//}
			
			BradescoFacesUtils.addInfoModalMessage(msg, false);
		} catch (PdcAdapterFunctionalException p) {
			percentualAliquota = null;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "",BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
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

	public String getLeiComplementar() {
		if (this.nroLei == null || this.descLei == null) {
			return "";
		}

		return getNroLei() + " - " + getDescLei();
	}

	public String getDescLei() {
		return descLei;
	}

	public void setDescLei(String descLei) {
		this.descLei = descLei;
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
	 * @return the listaMunicipiosAll
	 */
	public List<MunicipioDTO> getListaMunicipiosAll() {
		return listaMunicipiosAll;
	}

	/**
	 * @param listaMunicipiosAll the listaMunicipiosAll to set
	 */
	public void setListaMunicipiosAll(List<MunicipioDTO> listaMunicipiosAll) {
		this.listaMunicipiosAll = listaMunicipiosAll;
	}
	
}
