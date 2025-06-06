package br.com.bradesco.web.giss.view.bean.controller.dependencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasHistoricasSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoEntradaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class HistoricoDependenciaBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manterEstadoFiltro;
	private ILogManager logger;
	private List<MunicipioDTO> listaPesquisaManter;
	private List<SelectItem> listaControlePesquisaManter = new ArrayList<SelectItem>();
	private List<DependenciaDTO> listaPesquisaProsseguir;

	public List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<MunicipioDTO> listaMunicipios = new ArrayList<MunicipioDTO>();
	private List<DependenciasHistoricasSaidaDTO> listaDependenciasMunicipio = new ArrayList<DependenciasHistoricasSaidaDTO>(); // lista dependencias por municipio
	private boolean mostraBotoesManter;
	private boolean mostraBotoesProsseguir;
	private String estado;
	private String municipio;
	private String dependencia;
	private String descricao;
	private String cnpj;
	private String dataAbertura;
	private String dataEncerramento;
	private String agenciaIncorporadora;
	private String logradouro;
	private String numero;
	private String cep;
	private String municipioEnd;
	private String estadoEnd;
	private String pais;
	private String ccm;
	private String tipoDepartamento;
	private String tipoDepartamentoAnt;
	private String inscricaoMunicipal;
	private String inscricaoMunicipalAnt;
	private String agenciaIncorporadoraDepartamento;
	private String codigoMunicipio;
	private String codigoDependencia;
	private String descricaoDependencia;
	private String codigoAgenciaIncorpDepto;
	private String codigoAgenciaIncorpDeptoAnt;
	private String nomeAgenciaIncorpDepto; 
	private String nomeAgenciaIncorpDeptoAnt; 
	private String numeroAgencia;
	private String nomeAgencia;
	private String estadoIncorporadora;
	private String municipioIncorporadora;
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String indiceComboEmpresaFiltro;
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private Integer codDepFiltro;
	private IDependenciaService dependenciaImpl;
	IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private int codListaProsseguir;
	private int codLista;
	private String itemParametro;
	private Integer itemParametroAvancar;
	Map<String, MunicipioDTO> itensMap = new HashMap<String, MunicipioDTO>();
	Map<String, DependenciasHistoricasSaidaDTO> itensMapDep = new HashMap<String, DependenciasHistoricasSaidaDTO>();
	private DependenciasHistoricasSaidaDTO dependenciasMunicipios = new DependenciasHistoricasSaidaDTO();
	
	private List<DependenciaDTO> listaPaaHist = new ArrayList<DependenciaDTO>();
	private ArrayList<SelectItem> selectItemLista = new ArrayList<SelectItem>();
	private ArrayList<SelectItem> selectItemListaCont = new ArrayList<SelectItem>();
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private Integer[] codigosSelecionadosTabelaCont = new Integer[100];

	public List<SelectItem> carregaComboEstados() {

		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}

	public void buscaMunicipioManter() {
		buscaMunicipio(manterEstadoFiltro);
	}

	public void buscaMunicipio(String estado) {
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (estado.equals(listaDosEstados.get(i).getCodigo()))
				uf = listaDosEstados.get(i).getSigla();
		}
		buscaMunicipio.setEstado(uf != null ? uf : "");
		buscaMunicipio.buscar();
	}

	public void processa() {
		manterEstadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
	}

	public String carregarListaMunicipiosManter() {
		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				buscaMunicipioManter();
				estado = GissUtil.procuraUnidadeFederativa(listaEstados, manterEstadoFiltro);
				codigoMunicipio = buscaMunicipio.getCodigo().toString();
				municipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
				// lista os municípios
				listarDependenciasPorMunicipio(codigoMunicipio, 0, "0");

				return "conHistoricoDependenciasAvancar";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				buscaMunicipioManter();
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (manterEstadoFiltro != null && !manterEstadoFiltro.equals("")) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				carregaListaManterDependencia();
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (codDepFiltro != null && codDepFiltro != 0) {
			listarDependenciasPorMunicipio("0", codDepFiltro, indiceComboEmpresaFiltro);
			if (listaDependenciasMunicipio == null) {
				return "";
			} else {
				estado = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, dependenciasMunicipios.getCodUF()) + " - " + dependenciasMunicipios.getDescUF();
				codigoMunicipio = dependenciasMunicipios.getCodMunicipio().toString();
				municipio = codigoMunicipio + " - " + dependenciasMunicipios.getDescMunicipio();
				return "conHistoricoDependenciasAvancar";
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		}
		return "";

	}

	public void carregaListaManterDependencia() {
		this.itemParametro = null;
		try {
			if (getManterEstadoFiltro().equals("")) {
				this.itemParametro = null;
				setListaMunicipios(null);
				return;
			}
			listaMunicipios = dependenciaImpl.listarHistMunicipiosPorEstado(this.manterEstadoFiltro);
			setListaMunicipios(listaMunicipios);

		} catch (PdcAdapterFunctionalException p) {
			this.itemParametro = null;
			this.itemParametroAvancar = null;
			this.setListaMunicipios(new ArrayList<MunicipioDTO>());
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "conHistoricoDependencias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			this.itemParametro = null;
			this.itemParametroAvancar = null;
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public List<SelectItem> getSelectItemParametros() {
		List<MunicipioDTO> listaParam = (List<MunicipioDTO>) listaMunicipios;
		List<SelectItem> itensParam = new ArrayList<SelectItem>();

		if (listaParam == null) {
			return itensParam;
		}

		for (MunicipioDTO saidaDTO : listaParam) {
			itensParam.add(new SelectItem(saidaDTO.getCodigo(), ""));
			itensMap.put(saidaDTO.getCodigo(), saidaDTO);
		}

		return itensParam;
	}

	public List<SelectItem> getSelectItemParametrosAvancar() {
		
		List<SelectItem> itensParam = new ArrayList<SelectItem>();
		for (int i = 0; i < listaDependenciasMunicipio.size(); i++) {
			itensParam.add(new SelectItem(i, " "));
		}

		return itensParam;
	}

	public void paginarPesquisa(ActionEvent event) {

		carregaListaManterDependencia();
		setListaMunicipios(listaMunicipios);

	}

	public void paginarPesquisaAvancar(ActionEvent event) {

		listarDependenciasPorMunicipio(codigoMunicipio, codDepFiltro != null && codDepFiltro != 0? codDepFiltro : 0, codDepFiltro != null && codDepFiltro != 0? indiceComboEmpresaFiltro : "0");
		setListaDependenciasMunicipio(listaDependenciasMunicipio);

	}

	public String iniciaTela() {
		listaMunicipios = null;
		itemParametro = null;
		this.setManterEstadoFiltro(null);
		buscaMunicipio = new BuscaMunicipioBean();
		carregaComboEstados();
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		codDepFiltro = null;
		return "conHistoricoDependencias";
	}

	@SuppressWarnings("unchecked")
	public String avancarHistoricoDependencias() {

		if (this.itemParametro == null) {
			return "conHistoricoDependencias";
		} else {
			for (Iterator iter = listaMunicipios.iterator(); iter.hasNext();) {
				MunicipioDTO element = (MunicipioDTO) iter.next();

				if (element.getCodigo().equals(this.itemParametro)) {
					codigoMunicipio = element.getCodigo();
					municipio = element.getCodigo() + " - " + element.getNome();
				}
			}
		}

		estado = GissUtil.procuraUnidadeFederativa(listaEstados, this.manterEstadoFiltro);

		listarDependenciasPorMunicipio(codigoMunicipio, 0, "0");

		return "conHistoricoDependenciasAvancar";
	}

	@SuppressWarnings("unchecked")
	public String detalharHistroicoDependencia() {

		DependenciasHistoricasSaidaDTO dependenciasMunicipioDTO = new DependenciasHistoricasSaidaDTO();

		if (this.itemParametroAvancar == null) {
			return "conHistoricoDependenciasavancar";
		}
	
		dependenciasMunicipioDTO.setNumSequencialUnidadeOrganizacional(listaDependenciasMunicipio.get(itemParametroAvancar).getNumSequencialUnidadeOrganizacional());
		dependenciasMunicipioDTO.setCodigoUnidadeOrganizacional(listaDependenciasMunicipio.get(itemParametroAvancar).getCodigoUnidadeOrganizacional());
		dependenciasMunicipioDTO.setDescricaoUnidadeOrganizacional(listaDependenciasMunicipio.get(itemParametroAvancar).getDescricaoUnidadeOrganizacional());
		dependenciasMunicipioDTO.setCodigoPessoaJuridica(listaDependenciasMunicipio.get(itemParametroAvancar).getCodigoPessoaJuridica());
		dependenciasMunicipioDTO.setTimestamp(listaDependenciasMunicipio.get(itemParametroAvancar).getTimestamp());
		consultarInformacoesDependencia(municipio, dependenciasMunicipioDTO);

		return "detalhesHistoricoDependencias";
	}

	public void consultarInformacoesDependencia(String nomeMunicipio, DependenciasHistoricasSaidaDTO dependenciasHistoricasSaidaDTO) {
		try {

			numeroAgencia = null;
			nomeAgencia = null;
			codigoDependencia = null;
			descricaoDependencia = null;
			cnpj = null;
			dataAbertura = null;
			dataEncerramento = null;
			logradouro = null;
			estado = null;
			cep = null;
			pais = null;
			ccm = null;
			tipoDepartamento = null;
			tipoDepartamentoAnt = null;
			estadoIncorporadora = null;
			ccm = null;
			inscricaoMunicipal = null;
			inscricaoMunicipalAnt = null;
			agenciaIncorporadora = null;
			codigoAgenciaIncorpDepto = null;
			codigoAgenciaIncorpDeptoAnt = null;
			nomeAgenciaIncorpDepto = null;
			nomeAgenciaIncorpDeptoAnt = null;
			municipioIncorporadora = null;

			DetalhesDependenciasHistoricoSaidaDTO dependenciaDTO = dependenciaImpl.consultaDependenciaHistorico(new DetalhesDependenciasHistoricoEntradaDTO(dependenciasHistoricasSaidaDTO.getCodigoPessoaJuridica(), dependenciasHistoricasSaidaDTO.getNumSequencialUnidadeOrganizacional(), dependenciasHistoricasSaidaDTO.getTimestamp()));

			String[] vetorMunicipio;

			vetorMunicipio = nomeMunicipio.split(" - ");
			
			selectItemLista  = new ArrayList<SelectItem>();
			selectItemListaCont  = new ArrayList<SelectItem>();
			codigosSelecionadosTabela = new Integer[100];
			codigosSelecionadosTabelaCont = new Integer[100];
			setListaPaaHist(new ArrayList<DependenciaDTO>());
			for (int i = 0; i < dependenciaDTO.getListaPaa().size(); i++) {
				selectItemLista.add(new SelectItem(i, " "));
				selectItemListaCont.add(new SelectItem(i, " "));
				if (dependenciaDTO.getListaPaa().get(i).getOperacao() == 1) {
					getListaPaaHist().add(dependenciaDTO.getListaPaa().get(i));
					codigosSelecionadosTabela[i] = i;
				}else if(dependenciaDTO.getListaPaa().get(i).getOperacao() == 3){
					getListaPaaHist().add(dependenciaDTO.getListaPaa().get(i));
					codigosSelecionadosTabela[i] = i;
					codigosSelecionadosTabelaCont[i] = i;
				}
			}
			
			setListaPaaHist(dependenciaDTO.getListaPaa());
			

			// seta variáveis para inclusão Parte 3

			numeroAgencia = dependenciaDTO.getNumeroAgenciaIncorporadora().toString();
			nomeAgencia = dependenciaDTO.getDescricaoDepartamentoAgenciaIncorporadora();

			codigoDependencia = String.valueOf(dependenciasHistoricasSaidaDTO.getCodigoUnidadeOrganizacional());
			descricaoDependencia = String.valueOf(dependenciasHistoricasSaidaDTO.getDescricaoUnidadeOrganizacional());
			cnpj = dependenciaDTO.getCnpj();
			dataAbertura = dependenciaDTO.getDataAbertura().replace(".", "/");
			dataEncerramento = dependenciaDTO.getDataEncerramento().replace(".", "/");

			logradouro = dependenciaDTO.getEnderecoAgenciaIncorporadora();
			estado = dependenciaDTO.getSiglaUFAgenciaIncorporadora();
			cep = GissUtil.mascaraCep(dependenciaDTO.getCepAgenciaIncorporadora().toString());
			pais = dependenciaDTO.getPaisAgenciaIncorporadora();
			ccm = dependenciaDTO.getCodigoCadastroContribuinteMobiliario().toString();
			inscricaoMunicipal = dependenciaDTO.getInscricaoMunicipal();
			inscricaoMunicipalAnt = dependenciaDTO.getInscricaoMunicipalAnt();
			tipoDepartamento = dependenciaDTO.getTipoDepartamento();
			tipoDepartamentoAnt = dependenciaDTO.getTipoDepartamentoAnt();
			estadoIncorporadora = dependenciaDTO.getEstadoIncorporaDepartamento();

			if (ccm.equals("0")) {
				ccm = "";
			}

			if (inscricaoMunicipal.equals("0")) {
				inscricaoMunicipal = "";
			}

			if (dependenciaDTO.getCodigoAgenciaIncorporadora() != null && dependenciaDTO.getCodigoAgenciaIncorporadora() > 0) {
				agenciaIncorporadora = dependenciaDTO.getCodigoAgenciaIncorporadora() + " - " + dependenciaDTO.getNomeAgenciaIncorporadora();
			} else {
				agenciaIncorporadora = "";
			}

			codigoAgenciaIncorpDepto = GissUtil.notNull(dependenciaDTO.getCodigoDepartamentoAgenciaIncorporadora()) > 0?dependenciaDTO.getCodigoDepartamentoAgenciaIncorporadora().toString():"";
			nomeAgenciaIncorpDepto = dependenciaDTO.getDescricaoDepartamentoAgenciaIncorporadora();
			codigoAgenciaIncorpDeptoAnt = GissUtil.notNull(dependenciaDTO.getCodigoDepartamentoAgenciaIncorporadoraAnt()) > 0?dependenciaDTO.getCodigoDepartamentoAgenciaIncorporadoraAnt().toString():"";
			nomeAgenciaIncorpDeptoAnt = dependenciaDTO.getDescricaoDepartamentoAgenciaIncorporadoraAnt();

			Integer codMunicipio = null;
			if (dependenciaDTO.getCodigoMunicipioIncorporaDepartamento() != null && !dependenciaDTO.getCodigoMunicipioIncorporaDepartamento().trim().equals("")) {
				codMunicipio = Integer.parseInt(dependenciaDTO.getCodigoMunicipioIncorporaDepartamento());
			}

			if (codMunicipio != null && codMunicipio > 0) {
				municipioIncorporadora = codMunicipio + " - " + dependenciaDTO.getDescricaoMunicipioIncorporaDepartamento();
			} else {
				municipioIncorporadora = "";
			}
		} catch (PdcAdapterFunctionalException p) {
			this.itemParametro = null;
			this.itemParametroAvancar = null;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "conHistoricoDependenciasAvancar", BradescoViewExceptionActionType.ACTION, false);
		}
	}

	private void listarDependenciasPorMunicipio(String codMunicipio, Integer codDependencia, String codPessoaJuridica) {
		this.itemParametroAvancar = null;
		listaDependenciasMunicipio = null;
		try {

			dependenciasMunicipios = dependenciaImpl.listarDependenciasMunicipioHistorico(codMunicipio, codDependencia, codPessoaJuridica);
			listaDependenciasMunicipio = dependenciasMunicipios.getDepHistorico();

		} catch (PdcAdapterFunctionalException p) {
			this.itemParametro = null;
			this.itemParametroAvancar = null;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "conHistoricoDependencias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			this.itemParametro = null;
			this.itemParametroAvancar = null;
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String getManterEstadoFiltro() {
		return manterEstadoFiltro;
	}

	public void setManterEstadoFiltro(String manterEstadoFiltro) {
		this.manterEstadoFiltro = manterEstadoFiltro;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public List<MunicipioDTO> getListaPesquisaManter() {
		return listaPesquisaManter;
	}

	public void setListaPesquisaManter(List<MunicipioDTO> listaPesquisaManter) {
		this.listaPesquisaManter = listaPesquisaManter;
	}

	public List<SelectItem> getListaControlePesquisaManter() {
		return listaControlePesquisaManter;
	}

	public void setListaControlePesquisaManter(List<SelectItem> listaControlePesquisaManter) {
		this.listaControlePesquisaManter = listaControlePesquisaManter;
	}

	public boolean isMostraBotoesManter() {
		return mostraBotoesManter;
	}

	public void setMostraBotoesManter(boolean mostraBotoesManter) {
		this.mostraBotoesManter = mostraBotoesManter;
	}

	public void limparPagina(ActionEvent evt) {
		logger.debug(this, "Iniciando a Limpeza da Página.");

		codListaProsseguir = -1;
		codLista = -1;

		setManterEstadoFiltro(null);
		setDependencia(null);
		setDescricao(null);
		setCnpj(null);
		setDataAbertura(null);
		setDataEncerramento(null);
		setAgenciaIncorporadora(null);
		setLogradouro(null);
		setNumero(null);
		setCep(null);
		setMunicipioEnd(null);
		setEstadoEnd(null);
		setPais(null);
		setCcm(null);
		setTipoDepartamento(null);
		setAgenciaIncorporadoraDepartamento(null);

		setListaPesquisaManter(null);
		setListaPesquisaProsseguir(null);

		logger.debug(this, "Finalizando a Limpeza da Página.");
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

	public int getCodLista() {
		return codLista;
	}

	public void setCodLista(int codLista) {
		this.codLista = codLista;
	}

	public int getCodListaProsseguir() {
		return codListaProsseguir;
	}

	public void setCodListaProsseguir(int codListaProsseguir) {
		this.codListaProsseguir = codListaProsseguir;
	}

	public List<DependenciaDTO> getListaPesquisaProsseguir() {
		return listaPesquisaProsseguir;
	}

	public void setListaPesquisaProsseguir(List<DependenciaDTO> listaPesquisaProsseguir) {
		this.listaPesquisaProsseguir = listaPesquisaProsseguir;
	}

	public boolean isMostraBotoesProsseguir() {
		return mostraBotoesProsseguir;
	}

	public void setMostraBotoesProsseguir(boolean mostraBotoesProsseguir) {
		this.mostraBotoesProsseguir = mostraBotoesProsseguir;
	}

	public String voltarPesquisar() {
		return "VOLTAR";
	}

	public String getAgenciaIncorporadora() {
		return agenciaIncorporadora;
	}

	public void setAgenciaIncorporadora(String agenciaIncorporadora) {
		this.agenciaIncorporadora = agenciaIncorporadora;
	}

	public String getAgenciaIncorporadoraDepartamento() {
		return agenciaIncorporadoraDepartamento;
	}

	public void setAgenciaIncorporadoraDepartamento(String agenciaIncorporadoraDepartamento) {
		this.agenciaIncorporadoraDepartamento = agenciaIncorporadoraDepartamento;
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

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstadoEnd() {
		return estadoEnd;
	}

	public void setEstadoEnd(String estadoEnd) {
		this.estadoEnd = estadoEnd;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getMunicipioEnd() {
		return municipioEnd;
	}

	public void setMunicipioEnd(String municipioEnd) {
		this.municipioEnd = municipioEnd;
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

	public String consultar() {

		return "CONSULTAR";
	}

	public String voltarProsseguir() {
		return "VOLTAR";
	}

	public IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
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

	public String getItemParametro() {
		return itemParametro;
	}

	public void setItemParametro(String itemParametro) {
		this.itemParametro = itemParametro;
	}

	public List<DependenciasHistoricasSaidaDTO> getListaDependenciasMunicipio() {
		return listaDependenciasMunicipio;
	}

	public void setListaDependenciasMunicipio(List<DependenciasHistoricasSaidaDTO> listaDependenciasMunicipio) {
		this.listaDependenciasMunicipio = listaDependenciasMunicipio;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getItemParametroAvancar() {
		return itemParametroAvancar;
	}

	public void setItemParametroAvancar(Integer itemParametroAvancar) {
		this.itemParametroAvancar = itemParametroAvancar;
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

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
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

	public String getEstadoIncorporadora() {
		return estadoIncorporadora;
	}

	public void setEstadoIncorporadora(String estadoIncorporadora) {
		this.estadoIncorporadora = estadoIncorporadora;
	}

	public String getMunicipioIncorporadora() {
		return municipioIncorporadora;
	}

	public void setMunicipioIncorporadora(String municipioIncorporadora) {
		this.municipioIncorporadora = municipioIncorporadora;
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

	public DependenciasHistoricasSaidaDTO getDependenciasMunicipios() {
		return dependenciasMunicipios;
	}

	public void setDependenciasMunicipios(DependenciasHistoricasSaidaDTO dependenciasMunicipios) {
		this.dependenciasMunicipios = dependenciasMunicipios;
	}

	/**
	 * @return the listaPaaHist
	 */
	public List<DependenciaDTO> getListaPaaHist() {
		return listaPaaHist;
	}

	/**
	 * @param listaPaaHist the listaPaaHist to set
	 */
	public void setListaPaaHist(List<DependenciaDTO> listaPaaHist) {
		this.listaPaaHist = listaPaaHist;
	}

	/**
	 * @return the tipoDepartamentoAnt
	 */
	public String getTipoDepartamentoAnt() {
		return tipoDepartamentoAnt;
	}

	/**
	 * @param tipoDepartamentoAnt the tipoDepartamentoAnt to set
	 */
	public void setTipoDepartamentoAnt(String tipoDepartamentoAnt) {
		this.tipoDepartamentoAnt = tipoDepartamentoAnt;
	}

	/**
	 * @return the inscricaoMunicipalAnt
	 */
	public String getInscricaoMunicipalAnt() {
		return inscricaoMunicipalAnt;
	}

	/**
	 * @param inscricaoMunicipalAnt the inscricaoMunicipalAnt to set
	 */
	public void setInscricaoMunicipalAnt(String inscricaoMunicipalAnt) {
		this.inscricaoMunicipalAnt = inscricaoMunicipalAnt;
	}

	/**
	 * @return the codigoAgenciaIncorpDeptoAnt
	 */
	public String getCodigoAgenciaIncorpDeptoAnt() {
		return codigoAgenciaIncorpDeptoAnt;
	}

	/**
	 * @param codigoAgenciaIncorpDeptoAnt the codigoAgenciaIncorpDeptoAnt to set
	 */
	public void setCodigoAgenciaIncorpDeptoAnt(String codigoAgenciaIncorpDeptoAnt) {
		this.codigoAgenciaIncorpDeptoAnt = codigoAgenciaIncorpDeptoAnt;
	}

	/**
	 * @return the nomeAgenciaIncorpDeptoAnt
	 */
	public String getNomeAgenciaIncorpDeptoAnt() {
		return nomeAgenciaIncorpDeptoAnt;
	}

	/**
	 * @param nomeAgenciaIncorpDeptoAnt the nomeAgenciaIncorpDeptoAnt to set
	 */
	public void setNomeAgenciaIncorpDeptoAnt(String nomeAgenciaIncorpDeptoAnt) {
		this.nomeAgenciaIncorpDeptoAnt = nomeAgenciaIncorpDeptoAnt;
	}

	/**
	 * @return the selectItemLista
	 */
	public ArrayList<SelectItem> getSelectItemLista() {
		return selectItemLista;
	}

	/**
	 * @param selectItemLista the selectItemLista to set
	 */
	public void setSelectItemLista(ArrayList<SelectItem> selectItemLista) {
		this.selectItemLista = selectItemLista;
	}

	/**
	 * @return the selectItemListaCont
	 */
	public ArrayList<SelectItem> getSelectItemListaCont() {
		return selectItemListaCont;
	}

	/**
	 * @param selectItemListaCont the selectItemListaCont to set
	 */
	public void setSelectItemListaCont(ArrayList<SelectItem> selectItemListaCont) {
		this.selectItemListaCont = selectItemListaCont;
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

}
