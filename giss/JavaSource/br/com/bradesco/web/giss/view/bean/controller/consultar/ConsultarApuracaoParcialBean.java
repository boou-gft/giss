package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarApuracaoParcialFinalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarDependenciaParcialDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class ConsultarApuracaoParcialBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String estadoFiltro; // codigo do estado selecionado
	private String municipioFiltro; // codigo do município selecionado
	public List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleCheckRadioConta = new ArrayList<SelectItem>();
	private boolean mostraEstado;
	private IConsultarapuracaoparcialService consultarApuracaoParcialImpl;
	private Integer radioTelaConsultar;
	private Integer radioTelaConta;
	private List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios;
	private boolean mostraBotoes;
	private boolean mostraBotoesConta;
	private boolean carregaMunicipios;
	private List<ConsultarDependenciaParcialDTO> listaDependenciaParcial;
	private String nomeEstado;
	private String codigoMunicipio;
	private String nomeMunicipio;
	private boolean carregaDependencias;
	private List<ConsultarApuracaoParcialFinalDTO> listaApuracaoParcial;
	private List<ConsultarApuracaoParcialFinalDTO> listaApuracaoParcialConta;
	private int codigoPessoaJuridica;
	private int numeroSequencialUnidade;
	private String competencia;
	private String dependencia;
	private String descricao;
	private String baseCalculo;
	private String tipoIncidencia;
	private String aliquotaPadrao;
	private String dataProcessamento;
	private String solicitacao;
	private String totalReceita;
	private String totalRecolher;
	private String totalReceitaPa;
	private String totalRecolherPa;
	private String totalReceitaGeral;
	private String totalRecolherGeral;
	private String totalISSFinal;
	private String totalMovimento;
	private String totalTributavel;
	private int radioTelaResultado;
	private String dataPeriodoInicial;
	private String dataPeridoFinal;
	private String dataPerido;
	private String dataSolicitacao;

	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private String indiceComboEmpresaFiltro;
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private Integer codDepFiltro;
	private String tipo;
	private String estado;
	private String municipio;
	private ConsultarDependenciaParcialDTO dependenciasMunicipios = new ConsultarDependenciaParcialDTO();

	private Boolean razaoExiste = true;
	private String totalMovimentoConta;
	private String totalISSFinalConta;
	private String totalTributavelConta;
	
	public String iniciaApuracaoParcial() {

		estadoFiltro = null;
		carregaDependencias = false;
		setListaMunicipios(null);
		mostraBotoes = false;
		carregaMunicipios = false;
		codDepFiltro = null;
		tipo = null;
		indiceComboEmpresaFiltro = "0";
		estadoFiltro = "";
		buscaMunicipio = new BuscaMunicipioBean();

		Date dataAtual = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataPeridoFinal = dateFormat.format(dataAtual);

		Date dataInicio = new Date();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		dataPeriodoInicial = dateFormat2.format(dataInicio);

		String dataSaida = dataPeriodoInicial.substring(3, 10);

		dataPerido = "01/" + dataSaida + " a " + dataPeridoFinal;
		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		carregaComboEstados();
		return "consultarApuracaoParcial";
//		BradescoFacesUtils.addInfoModalMessage("Tela em construção!", false);
//		return "";
		
	}

	public List<SelectItem> carregaComboEstados() {
		listaDosEstados = dependenciaImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
		mostraEstado = false;
		return listaEstados;
	}

	public void buscaMunicipioManter() {
		tipo = "manter";
		buscaMunicipio(estadoFiltro);
	}

	public void buscaMunicipio(String estado) {
		if (tipo.equals("manter")) {
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
	}

	public void processa() {
		if (tipo.equals("manter")) {
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		}
		// else if(tipo.equals("manterIncorp")){
		// estadoResultDepNovasMun = gissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipioIncorp.getUf());
		// }
	}

	public String avancarDependencia() {

		ConsultarMunicipiosApuracaoParcialDTO municipiosApuracaoParcialDTO = (ConsultarMunicipiosApuracaoParcialDTO) getListaMunicipios().get(new Integer(radioTelaConsultar));
		setCodigoMunicipio(municipiosApuracaoParcialDTO.getCodigo());
		setNomeMunicipio(municipiosApuracaoParcialDTO.getNome());
		nomeEstado = GissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);

		if (listarDependenciaParcial()) {
			return "AVANCAR_DEP_PARCIAL";
		}

		return null;
	}

	public String avancarApuracaoParcial() {

		competencia = GissUtil.geraDataCompetencia().trim();
		radioTelaConta = null;

		ConsultarDependenciaParcialDTO dependenciaParcialDTO = (ConsultarDependenciaParcialDTO) getListaDependenciaParcial().get(new Integer(radioTelaResultado));
		setDependencia(dependenciaParcialDTO.getDependencia().trim());
		setDescricao(dependenciaParcialDTO.getDescricao().trim());
		setNumeroSequencialUnidade(Integer.parseInt(dependenciaParcialDTO.getNumeroSequencial()));
		setCodigoPessoaJuridica(Integer.parseInt(dependenciaParcialDTO.getCodigoPessoaJuridica()));
		return listarApuracaoParcial();

	}
	
	public String avancarApuracaoParcialConta() {
		
		competencia = GissUtil.geraDataCompetencia().trim();
		
//		ConsultarDependenciaParcialDTO dependenciaParcialDTO = (ConsultarDependenciaParcialDTO) getListaDependenciaParcial()
//				.get(new Integer(radioTelaConta));
//
//		setDependencia(dependenciaParcialDTO.getDependencia().trim());
//		setDescricao(dependenciaParcialDTO.getDescricao().trim());
//		setNumeroSequencialUnidade(Integer.parseInt(dependenciaParcialDTO.getNumeroSequencial()));
//		setCodigoPessoaJuridica(Integer.parseInt(dependenciaParcialDTO.getCodigoPessoaJuridica()));
		
		
		return listarApuracaoParcialConta();
		
	}

	public boolean pesquisaMunicipios() {

		try {

			listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(estadoFiltro);
			
			
			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarApuracaoParcial", BradescoViewExceptionActionType.ACTION, false);
			return false;
		}

		return true;
	}

	public String carregarLista() {
		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				listaMunicipios = null;
				buscaMunicipioManter();
				nomeEstado = GissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);
				codigoMunicipio = buscaMunicipio.getCodigo().toString();
				nomeMunicipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
				// lista os municípios
				if (listarDependenciaParcial()) {
					return "AVANCAR_DEP_PARCIAL";
				}
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
		} else if (estadoFiltro != null && !estadoFiltro.equals("")) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				pesquisaMunicipios();
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (codDepFiltro != null && codDepFiltro != 0) {
			codigoMunicipio = "0";
			listaMunicipios = null;
			if (listarDependenciaParcial()) {
				estado = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, dependenciasMunicipios.getCodUF());
				nomeEstado = estado + " - " + dependenciasMunicipios.getDescUF();
				codigoMunicipio = dependenciasMunicipios.getCodMunicipio().toString();
				nomeMunicipio = codigoMunicipio + " - " + dependenciasMunicipios.getDescMunicipio();
				return "AVANCAR_DEP_PARCIAL";
			}
		} else
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		return "";

	}

	public boolean listarDependenciaParcial() {

		try {
			dependenciasMunicipios = consultarApuracaoParcialImpl.listarDependenciaMunicipioResultado(codigoMunicipio != null && !codigoMunicipio.equals("") ? Long.parseLong(codigoMunicipio) : 0, codDepFiltro != null?Long.valueOf(indiceComboEmpresaFiltro):0l, codDepFiltro != null ? codDepFiltro : 0);
			listaDependenciaParcial =new ArrayList<ConsultarDependenciaParcialDTO>();
			listaDependenciaParcial = dependenciasMunicipios.getLista();
			

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return false;
		}
		if (listaDependenciaParcial != null && listaDependenciaParcial.size()>0) {
			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciaParcial);

			totalReceita = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalReceita();
			totalRecolher = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalRecolher();
			totalReceitaPa = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalReceitaPa();
			totalRecolherPa = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalRecolherPa();
			totalReceitaGeral = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalReceitaGeral();
			totalRecolherGeral = listaDependenciaParcial.get(listaDependenciaParcial.size() - 1).getTotalRecolherGeral();
		}else
			return false;
		return true;
	}
	
	public String voltar(){
		if(listaMunicipios != null && listaMunicipios.size()>0)
			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipios);
		radioTelaConsultar =null;
		return "consultarApuracaoParcial";
	}

	public String listarApuracaoParcial() {

		try {

			listaApuracaoParcial = consultarApuracaoParcialImpl.listarApuracaoParcialFinal(String.valueOf(codigoMunicipio), codigoPessoaJuridica, String.valueOf(numeroSequencialUnidade));

			if (listaApuracaoParcial != null) {

				for (int i = 0; i <= listaApuracaoParcial.size(); i++) {

					listaControleCheckRadioConta.add(new SelectItem(String.valueOf(i), " "));
				}

				mostraBotoes = !listaApuracaoParcial.isEmpty();

				carregaDependencias = true;

				if(listaApuracaoParcial.size() > 0){
					if(listaApuracaoParcial.get(0).getCodigoGrupo() <= 0 && listaApuracaoParcial.get(0).getCodigoSubgrupo() <= 0){
						razaoExiste = false;
					}
					else{
						razaoExiste = true;
					}
				}
				
				baseCalculo = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getBaseCalculo();
				tipoIncidencia = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getTipoIncidencia();
				aliquotaPadrao = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getAliquotaPadrao();
				dataProcessamento = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getDataProcessamento();
				dataSolicitacao = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getDataSolicitacao();
				solicitacao = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getSolicitacao();
				totalMovimento = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getTotalMovimento();
				totalISSFinal = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getTotalISSFinal();
				totalTributavel = getListaApuracaoParcial().get(listaApuracaoParcial.size() - 1).getTotalTributavel();
			} else {
				throw new PdcAdapterFunctionalException("500", "Ocorreu um erro ao consultar apuracao parcial.");
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return "AVANCAR_DEP_PARCIAL";
		}
		
		return "AVANCAR_APURACAO_PARCIAL";

	}
	public String listarApuracaoParcialConta() {
		
		try {
			
			String data[] = dataPerido.split(" a ");
			listaApuracaoParcialConta = consultarApuracaoParcialImpl
					.listarApuracaoParcialFinalConta(
							codigoMunicipio,
							codigoPessoaJuridica,
							numeroSequencialUnidade,
							listaApuracaoParcial.get(radioTelaConta).getRazao(),
							listaApuracaoParcial.get(radioTelaConta).getCosif(),
							data[0], data[1]);

			if (listaApuracaoParcialConta != null) {
					
					for (int i = 0; i <= listaApuracaoParcialConta.size(); i++) {
						
						listaControleCheckRadioConta.add(new SelectItem(String.valueOf(i), " "));
					}
					
					mostraBotoesConta = !listaApuracaoParcialConta.isEmpty();
					
					carregaDependencias = true;
					
					if(listaApuracaoParcialConta.size() > 0){
						if(listaApuracaoParcialConta.get(0).getCodigoGrupo() <= 0 && listaApuracaoParcialConta.get(0).getCodigoSubgrupo() <= 0){
							razaoExiste = false;
						}
						else{
							razaoExiste = true;
						}
					}
					
				}
				totalMovimentoConta = getListaApuracaoParcial().get(listaApuracaoParcialConta.size() - 1).getTotalMovimento();
				totalISSFinalConta = getListaApuracaoParcial().get(listaApuracaoParcialConta.size() - 1).getTotalISSFinal();
				totalTributavelConta = getListaApuracaoParcial().get(listaApuracaoParcialConta.size() - 1).getTotalTributavel();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return "AVANCAR_APURACAO_PARCIAL";
		}
		
		return "AVANCAR_APURACAO_PARCIAL_CONTA";
		
	}

	public String carregaMunicipios(ActionEvent evt) {

		if (estadoFiltro.equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado.", "consultarApuracaoParcial", BradescoViewExceptionActionType.ACTION, false);
		} else {
			if (pesquisaMunicipios()) {
				return "consultarApuracaoParcial";
			}
		}
		return null;

	}

	public String paginacaoMunicipios(ActionEvent evt) {

		pesquisaMunicipios();
		setListaMunicipios(listaMunicipios);
		setMostraBotoes(true);
		return "consultarApuracaoParcial";
	}

	public String paginacaoDependencia(ActionEvent evt) {

		listarDependenciaParcial();
		setListaDependenciaParcial(listaDependenciaParcial);

		return "AVANCAR_DEP_PARCIAL";
	}

	public String paginacaoApuracaoParcial(ActionEvent evt) {

		listarApuracaoParcial();
		setListaApuracaoParcial(listaApuracaoParcial);
		return "AVANCAR_APURACAO_PARCIAL";
	}

	public String limparTelaIncial() {

		carregaDependencias = false;
		setListaMunicipios(null);
		mostraBotoes = false;
		carregaMunicipios = false;

		Date dataAtual = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataPeridoFinal = dateFormat.format(dataAtual);

		Date dataInicio = new Date();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		dataPeriodoInicial = dateFormat2.format(dataInicio);

		String dataSaida = dataPeriodoInicial.substring(3, 10);

		dataPerido = "01/" + dataSaida + " a " + dataPeridoFinal;

		carregaComboEstados();
		return "consultarApuracaoParcial";
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public String getMunicipioFiltro() {
		return municipioFiltro;
	}

	public void setMunicipioFiltro(String municipioFiltro) {
		this.municipioFiltro = municipioFiltro;
	}

	public boolean isMostraEstado() {
		return mostraEstado;
	}

	public void setMostraEstado(boolean mostraEstado) {
		this.mostraEstado = mostraEstado;
	}

	public IConsultarapuracaoparcialService getConsultarApuracaoParcialImpl() {
		return consultarApuracaoParcialImpl;
	}

	public void setConsultarApuracaoParcialImpl(IConsultarapuracaoparcialService consultarApuracaoParcialImpl) {
		this.consultarApuracaoParcialImpl = consultarApuracaoParcialImpl;
	}

	

	public List<ConsultarMunicipiosApuracaoParcialDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}

	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public List<ConsultarDependenciaParcialDTO> getListaDependenciaParcial() {
		return listaDependenciaParcial;
	}

	public void setListaDependenciaParcial(List<ConsultarDependenciaParcialDTO> listaDependenciaParcial) {
		this.listaDependenciaParcial = listaDependenciaParcial;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public boolean isCarregaDependencias() {
		return carregaDependencias;
	}

	public void setCarregaDependencias(boolean carregaDependencias) {
		this.carregaDependencias = carregaDependencias;
	}

	public List<ConsultarApuracaoParcialFinalDTO> getListaApuracaoParcial() {
		return listaApuracaoParcial;
	}

	public void setListaApuracaoParcial(List<ConsultarApuracaoParcialFinalDTO> listaApuracaoParcial) {
		this.listaApuracaoParcial = listaApuracaoParcial;
	}

	public int getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(int codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public int getNumeroSequencialUnidade() {
		return numeroSequencialUnidade;
	}

	public void setNumeroSequencialUnidade(int numeroSequencialUnidade) {
		this.numeroSequencialUnidade = numeroSequencialUnidade;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
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

	public String getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public String getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}

	public String getTotalReceitaGeral() {
		return totalReceitaGeral;
	}

	public void setTotalReceitaGeral(String totalReceitaGeral) {
		this.totalReceitaGeral = totalReceitaGeral;
	}

	public String getTotalRecolher() {
		return totalRecolher;
	}

	public void setTotalRecolher(String totalRecolher) {
		this.totalRecolher = totalRecolher;
	}

	public String getTotalRecolherGeral() {
		return totalRecolherGeral;
	}

	public void setTotalRecolherGeral(String totalRecolherGeral) {
		this.totalRecolherGeral = totalRecolherGeral;
	}

	public String getTotalISSFinal() {
		return totalISSFinal;
	}

	public void setTotalISSFinal(String totalISSFinal) {
		this.totalISSFinal = totalISSFinal;
	}

	public String getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(String totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public String getTotalTributavel() {
		return totalTributavel;
	}

	public void setTotalTributavel(String totalTributavel) {
		this.totalTributavel = totalTributavel;
	}

	public int getRadioTelaResultado() {
		return radioTelaResultado;
	}

	public void setRadioTelaResultado(int radioTelaResultado) {
		this.radioTelaResultado = radioTelaResultado;
	}

	public String getDataPerido() {
		return dataPerido;
	}

	public void setDataPerido(String dataPerido) {
		this.dataPerido = dataPerido;
	}

	public String getDataPeridoFinal() {
		return dataPeridoFinal;
	}

	public void setDataPeridoFinal(String dataPeridoFinal) {
		this.dataPeridoFinal = dataPeridoFinal;
	}

	public String getDataPeriodoInicial() {
		return dataPeriodoInicial;
	}

	public void setDataPeriodoInicial(String dataPeriodoInicial) {
		this.dataPeriodoInicial = dataPeriodoInicial;
	}

	public String getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
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

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public Integer getCodDepFiltro() {
		return codDepFiltro;
	}

	public void setCodDepFiltro(Integer codDepFiltro) {
		this.codDepFiltro = codDepFiltro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public Integer getRadioTelaConsultar() {
		return radioTelaConsultar;
	}

	public void setRadioTelaConsultar(Integer radioTelaConsultar) {
		this.radioTelaConsultar = radioTelaConsultar;
	}

	public Boolean getRazaoExiste() {
		return razaoExiste;
	}

	public void setRazaoExiste(Boolean razaoExiste) {
		this.razaoExiste = razaoExiste;
	}

	/**
	 * @return the totalReceitaPa
	 */
	public String getTotalReceitaPa() {
		return totalReceitaPa;
	}

	/**
	 * @param totalReceitaPa the totalReceitaPa to set
	 */
	public void setTotalReceitaPa(String totalReceitaPa) {
		this.totalReceitaPa = totalReceitaPa;
	}

	/**
	 * @return the totalRecolherPa
	 */
	public String getTotalRecolherPa() {
		return totalRecolherPa;
	}

	/**
	 * @param totalRecolherPa the totalRecolherPa to set
	 */
	public void setTotalRecolherPa(String totalRecolherPa) {
		this.totalRecolherPa = totalRecolherPa;
	}

	/**
	 * @return the listaControleCheckRadioConta
	 */
	public List<SelectItem> getListaControleCheckRadioConta() {
		return listaControleCheckRadioConta;
	}

	/**
	 * @param listaControleCheckRadioConta the listaControleCheckRadioConta to set
	 */
	public void setListaControleCheckRadioConta(List<SelectItem> listaControleCheckRadioConta) {
		this.listaControleCheckRadioConta = listaControleCheckRadioConta;
	}

	/**
	 * @return the radioTelaConta
	 */
	public Integer getRadioTelaConta() {
		return radioTelaConta;
	}

	/**
	 * @param radioTelaConta the radioTelaConta to set
	 */
	public void setRadioTelaConta(Integer radioTelaConta) {
		this.radioTelaConta = radioTelaConta;
	}

	/**
	 * @return the listaApuracaoParcialConta
	 */
	public List<ConsultarApuracaoParcialFinalDTO> getListaApuracaoParcialConta() {
		return listaApuracaoParcialConta;
	}

	/**
	 * @param listaApuracaoParcialConta the listaApuracaoParcialConta to set
	 */
	public void setListaApuracaoParcialConta(List<ConsultarApuracaoParcialFinalDTO> listaApuracaoParcialConta) {
		this.listaApuracaoParcialConta = listaApuracaoParcialConta;
	}

	/**
	 * @return the mostraBotoesConta
	 */
	public boolean isMostraBotoesConta() {
		return mostraBotoesConta;
	}

	/**
	 * @param mostraBotoesConta the mostraBotoesConta to set
	 */
	public void setMostraBotoesConta(boolean mostraBotoesConta) {
		this.mostraBotoesConta = mostraBotoesConta;
	}

	/**
	 * @return the totalMovimentoConta
	 */
	public String getTotalMovimentoConta() {
		return totalMovimentoConta;
	}

	/**
	 * @param totalMovimentoConta the totalMovimentoConta to set
	 */
	public void setTotalMovimentoConta(String totalMovimentoConta) {
		this.totalMovimentoConta = totalMovimentoConta;
	}

	/**
	 * @return the totalISSFinalConta
	 */
	public String getTotalISSFinalConta() {
		return totalISSFinalConta;
	}

	/**
	 * @param totalISSFinalConta the totalISSFinalConta to set
	 */
	public void setTotalISSFinalConta(String totalISSFinalConta) {
		this.totalISSFinalConta = totalISSFinalConta;
	}

	/**
	 * @return the totalTributavelConta
	 */
	public String getTotalTributavelConta() {
		return totalTributavelConta;
	}

	/**
	 * @param totalTributavelConta the totalTributavelConta to set
	 */
	public void setTotalTributavelConta(String totalTributavelConta) {
		this.totalTributavelConta = totalTributavelConta;
	}

}
