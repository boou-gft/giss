package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ApuracaoMenDiferenciadaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ListaValoresDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.PesquisaApuracaoMensalDiferenciadaApuracaoDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ResultadoApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.IConsultarApuracaoMensalDiferenciadaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.bean.FaixaTributariaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;

/**
 * Back Bean da tela de Consulta > Apuracao Mensal Diferenciada
 * 
 * @author renato.mariscal@brq.com
 * 
 */
public class ApuracaoMensalDiferenciadaBean extends FiltroGenericoGISSBean {
	private static final long serialVersionUID = 1L;
	private List<ApuracaoMenDiferenciadaDTO> listaPesquisa = new ArrayList<ApuracaoMenDiferenciadaDTO>();
	private ApuracaoMenDiferenciadaDTO vo = new ApuracaoMenDiferenciadaDTO();
	private List<PesquisaApuracaoMensalDiferenciadaApuracaoDTO> listaApuracao = new ArrayList<PesquisaApuracaoMensalDiferenciadaApuracaoDTO>();
	private List<SelectItem> listaControleCheckRadio;
	private List<SelectItem> listaControleCheckRadioPesquisa = new ArrayList<SelectItem>();
	public List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios;
	private boolean mostraBotoes;
	private boolean carregaMunicipios;
	private String radioTelaConsultar;
	private String radioTelaDependencia;
	private String competencia;
	private String estado;
	private String municipio;
	private IConsultarapuracaoparcialService consultarApuracaoParcialImpl;
	private IConsultarApuracaoMensalDiferenciadaService consultarApuracaoMensalDiferenciadaImpl;
	private String mesFiltro;
	private String anoFiltro;
	private String descricao;
	private Integer dependencia;
	private String totalIss;
	private String totalReceita;
	private String codMunicipio;
	private long codPesJuridica;
	private BigDecimal baseCalculo;
	private BigDecimal aliquotaPadrao;
	private BigDecimal vlrMovimento;
	private BigDecimal vlrTributavel;
	private String tipoIncidencia;
	private String dataSolicitacao;
	private String dataProcessamento;
	private int solicitacao;
	private int numUnidOrganiza;
	private String valorReceTribSinal;
	private BigDecimal valorReceTribValor;
	private List<FaixaTributariaDTO> listaDados = new ArrayList<FaixaTributariaDTO>();
	private List<ListaValoresDTO> listarValores;
	private ResultadoApuracaoMensalDTO retorno;
	private List<ListaValoresDTO> valorInicial;
	private int controleVoltar;
	/**
	 * Chamada do Menu
	 * Inicializa os campos necessarios da tela.
	 * Efetua a limpeza de dados.
	 * 
	 * @return
	 */
	public String iniciarTela() {
		super.inicializaFiltroGenerico();
		limpar();
		return "apuracaoMensalDiferenciadaDadosPesquisa";
	}
	
	public String voltarProc() {
		//return "apuracaoMensalDiferenciadaDadosApuracao";
		if (controleVoltar == 1){
			try {
				vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()), Integer.parseInt(getCodMunicipio()), 0, 0L);
				setListaPesquisa(vo.getListaApurMenDif());
				listaControleCheckRadioPesquisa = GissUtil.preencherSelectItemsMunicipio(getListaPesquisa());
			} catch (PdcAdapterFunctionalException e) {
				BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
				return "";
			}
			return "apuracaoMensalDiferenciadaDadosApuracao";
		}else if (controleVoltar == 2){
			try {
				vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()),0, codDepFiltro, Long.valueOf(indiceComboEmpresaFiltro));
				setListaPesquisa(vo.getListaApurMenDif());
				listaControleCheckRadioPesquisa = GissUtil.preencherSelectItemsMunicipio(getListaPesquisa());
			} catch (PdcAdapterFunctionalException e) {
				BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
				return "";
			}
			return "apuracaoMensalDiferenciadaDadosApuracao";
		}
		return "";
	}

	public String voltar() {
		return "apuracaoMensalDiferenciadaDadosPesquisa";
	}

	public String consultar() {
		if (listarResultadoConsulta()) {
			return "apuracaoMensalDiferenciadaDadosConsulta";
		}
		return null;
	}

	public boolean listarResultadoConsulta() {
		ApuracaoMenDiferenciadaDTO apuracao = (ApuracaoMenDiferenciadaDTO) getListaPesquisa().get(new Integer(getRadioTelaDependencia()));
		setNumUnidOrganiza(apuracao.getNumeroSeqUniOrg());
		setDescricao(apuracao.getDescricao());
		setDependencia(apuracao.getDependencia());
		setCodPesJuridica(apuracao.getCodPessoaJuridica());
		setValorReceTribSinal(apuracao.getValorReceTribSinal());
		setValorReceTribValor(apuracao.getReceita());
		try {
			ResultadoApuracaoMensalDTO retorno = consultarApuracaoMensalDiferenciadaImpl.listarResultadoApuracaoMensalDiferenciada(Integer.parseInt(codMunicipio), codPesJuridica, numUnidOrganiza, Integer.parseInt(mesFiltro + anoFiltro));

			setBaseCalculo(retorno.getBaseCalculo());
			setAliquotaPadrao(retorno.getAliquotaPadrao());
			setVlrMovimento(retorno.getVlrMovimento());
			setVlrTributavel(retorno.getVlrTributavel());
			setTipoIncidencia(retorno.getTipoIncidencia());
			setSolicitacao(retorno.getSolicitacao());
			setDataSolicitacao(retorno.getDataSolicitacao().replace(".", "/"));
			setDataProcessamento(retorno.getDataProcessamento());
			setListarValores(retorno.getListaPesquisaApuracao());

			listaControleCheckRadioPesquisa.clear();
			for (int i = 0; i < getListaApuracao().size(); i++) {
				listaControleCheckRadioPesquisa.add(new SelectItem(String.valueOf(i), " "));
			}

			setMostraBotoes(!getListaApuracao().isEmpty());
		} catch (PdcAdapterFunctionalException e) {

			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "apuracaoMensalDiferenciadaDadosApuracao", BradescoViewExceptionActionType.ACTION, false);

			return false;
		}
		return true;
	}

	public String prosseguir() {
		if (getAnoFiltro().equals("") || getMesFiltro().equals("")) {
			if (getMesFiltro().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Mês da competência.", false);
				return "apuracaoMensalDiferenciadaDadosPesquisa";
			}
			if (getAnoFiltro().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Ano da competência.", false);
				return "apuracaoMensalDiferenciadaDadosPesquisa";
			}
		}
		if (listarResultadoPesquisa()) {
			return "apuracaoMensalDiferenciadaDadosApuracao";
		}
		return null;
	}
	
	
	public String carregaLista() {
		if (getAnoFiltro().equals("") || getMesFiltro().equals("")) {
			if (getMesFiltro().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Mês da competência.", false);
				return null;
			}
			if (getAnoFiltro().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Ano da competência.", false);
				return null;
			}
		}
		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				buscaMunicipioManter();
				setCompetencia(getMesFiltro() + "/" + getAnoFiltro());
				setEstado(GissUtil.procuraUnidadeFederativaSemCodigo(getListaEstados(), getEstadoFiltro()));
				setCodMunicipio(buscaMunicipio.getCodigo().toString());
				setMunicipio(buscaMunicipio.getDescricao());
				try {
					vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()), Integer.parseInt(getCodMunicipio()), 0, 0L);
					setListaPesquisa(vo.getListaApurMenDif());
					
					totalIss = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalISS());
					totalReceita = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalReceita());
					listaControleCheckRadioPesquisa = GissUtil.preencherSelectItemsMunicipio(getListaPesquisa());
				} catch (PdcAdapterFunctionalException e) {
					BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
					return "";
				}
				listaMunicipios = null;
				setCarregaMunicipios(false);
				radioTelaConsultar = null;
				controleVoltar = 1;
				return "apuracaoMensalDiferenciadaDadosApuracao";
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
				controleVoltar = 1;
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (codDepFiltro != null && codDepFiltro != 0) {
			try {
				vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()),0, codDepFiltro, Long.valueOf(indiceComboEmpresaFiltro));
				setListaPesquisa(vo.getListaApurMenDif());
				
				totalIss = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalISS());
				totalReceita = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalReceita());
				listaControleCheckRadioPesquisa = GissUtil.preencherSelectItemsMunicipio(getListaPesquisa());
				
				setCompetencia(getMesFiltro() + "/" + getAnoFiltro());
				setEstado(vo.getDescUF());
				setCodMunicipio(vo.getCodMunicipio().toString());
				setMunicipio(vo.getDescMunicipio());
			} catch (PdcAdapterFunctionalException e) {
				BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
				return "";
			}
			listaMunicipios = null;
			setCarregaMunicipios(false);
			radioTelaConsultar = null;
			controleVoltar = 2;
			return "apuracaoMensalDiferenciadaDadosApuracao";
		} else
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		return "";
	}

	public boolean listarResultadoPesquisa() {
		setCompetencia(getMesFiltro() + "/" + getAnoFiltro());
		setEstado(GissUtil.procuraUnidadeFederativaSemCodigo(getListaEstados(), getEstadoFiltro()));
		ConsultarMunicipiosApuracaoParcialDTO municipioSelecionado = listaMunicipios.get(Integer.valueOf(getRadioTelaConsultar()));
		setCodMunicipio(municipioSelecionado.getCodigo());
		setMunicipio(municipioSelecionado.getNome());

		try {
			vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()), Integer.parseInt(municipioSelecionado.getCodigo()),0,0L);
			setListaPesquisa(vo.getListaApurMenDif());
			totalIss = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalISS());
			totalReceita = NumberUtils.format((listaPesquisa.get(listaPesquisa.size() - 1)).getTotalReceita());
			listaControleCheckRadioPesquisa = GissUtil.preencherSelectItemsMunicipio(getListaPesquisa());

		} catch (PdcAdapterFunctionalException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "apuracaoMensalDiferenciadaDadosPesquisa", BradescoViewExceptionActionType.ACTION, false);
			return false;
		}

		return true;

	}

	

	public void pesquisaMunicipios() {
		if (getEstadoFiltro().equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "apuracaoMensalDiferenciadaDadosPesquisa", BradescoViewExceptionActionType.ACTION, false);
			return;
		}
		try {
			listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(getEstadoFiltro());

			if (listaMunicipios != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < listaMunicipios.size(); i++) {

					listaControleCheckRadio.add(new SelectItem(String.valueOf(i), " "));
				}

				setMostraBotoes(!listaMunicipios.isEmpty());
				setCarregaMunicipios(true);
			}
		} catch (PdcAdapterFunctionalException e) {
			setMostraBotoes(false);
			setCarregaMunicipios(false);
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "apuracaoMensalDiferenciadaDadosPesquisa", BradescoViewExceptionActionType.ACTION, false);

		}
	}

	public void paginarMunicipio(ActionEvent evt) {
		listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(getEstadoFiltro());
	}

	public void paginarResultadoPesqApuracaoMensalDiferenciada(ActionEvent evt) {
		vo = consultarApuracaoMensalDiferenciadaImpl.listarResultadoPesqApuracaoMensalDiferenciada(Integer.parseInt(getMesFiltro() + getAnoFiltro()), Integer.parseInt(getCodMunicipio()), 0, 0L);
		setListaPesquisa(vo.getListaApurMenDif());
	}

	public void limpar() {
		setMesFiltro(null);
		setAnoFiltro(null);
		setListaMunicipios(null);
		setCompetencia(null);
		setEstadoFiltro(null);
		setRadioTelaConsultar(null);
		setCarregaMunicipios(false);

	}

	public void listaMunicipio() {
		pesquisaMunicipios();
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

	public String getRadioTelaConsultar() {
		return radioTelaConsultar;
	}

	public void setRadioTelaConsultar(String radioTelaConsultar) {
		this.radioTelaConsultar = radioTelaConsultar;
	}


	public List<ApuracaoMenDiferenciadaDTO> getListaPesquisa() {
		return listaPesquisa;
	}

	public void setListaPesquisa(List<ApuracaoMenDiferenciadaDTO> listaPesquisa) {
		this.listaPesquisa = listaPesquisa;
	}

	public List<SelectItem> getListaControleCheckRadioPesquisa() {
		return listaControleCheckRadioPesquisa;
	}

	public void setListaControleCheckRadioPesquisa(List<SelectItem> listaControleCheckRadioPesquisa) {
		this.listaControleCheckRadioPesquisa = listaControleCheckRadioPesquisa;
	}

	public List<PesquisaApuracaoMensalDiferenciadaApuracaoDTO> getListaApuracao() {
		return listaApuracao;
	}

	public void setListaApuracao(List<PesquisaApuracaoMensalDiferenciadaApuracaoDTO> listaApuracao) {
		this.listaApuracao = listaApuracao;
	}

	public IConsultarapuracaoparcialService getConsultarApuracaoParcialImpl() {
		return consultarApuracaoParcialImpl;
	}

	public void setConsultarApuracaoParcialImpl(IConsultarapuracaoparcialService consultarApuracaoParcialImpl) {
		this.consultarApuracaoParcialImpl = consultarApuracaoParcialImpl;
	}

	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}

	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}

	public List<ConsultarMunicipiosApuracaoParcialDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
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

	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public List<FaixaTributariaDTO> getListaDados() {
		return listaDados;
	}

	public void setListaDados(List<FaixaTributariaDTO> listaDados) {
		this.listaDados = listaDados;
	}

	public IConsultarApuracaoMensalDiferenciadaService getConsultarApuracaoMensalDiferenciadaImpl() {
		return consultarApuracaoMensalDiferenciadaImpl;
	}

	public void setConsultarApuracaoMensalDiferenciadaImpl(IConsultarApuracaoMensalDiferenciadaService consultarApuracaoMensalDiferenciadaImpl) {
		this.consultarApuracaoMensalDiferenciadaImpl = consultarApuracaoMensalDiferenciadaImpl;
	}

	/**
	 * Obtém o campo descricao
	 * 
	 * @return descricao String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define o campo descricao
	 * 
	 * @param descricao
	 *            String
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Obtém o campo totalIss
	 * 
	 * @return totalIss String
	 */
	public String getTotalIss() {
		return totalIss;
	}

	/**
	 * Define o campo totalIss
	 * 
	 * @param totalIss
	 *            String
	 */
	public void setTotalIss(String totalIss) {
		this.totalIss = totalIss;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}

	public long getCodPesJuridica() {
		return codPesJuridica;
	}

	public void setCodPesJuridica(long codPesJuridica) {
		this.codPesJuridica = codPesJuridica;
	}

	public int getNumUnidOrganiza() {
		return numUnidOrganiza;
	}

	public void setNumUnidOrganiza(int numUnidOrganiza) {
		this.numUnidOrganiza = numUnidOrganiza;
	}

	public String getValorReceTribSinal() {
		return valorReceTribSinal;
	}

	public void setValorReceTribSinal(String valorReceTribSinal) {
		this.valorReceTribSinal = valorReceTribSinal;
	}

	public BigDecimal getValorReceTribValor() {
		return valorReceTribValor;
	}

	public void setValorReceTribValor(BigDecimal valorReceTribValor) {
		this.valorReceTribValor = valorReceTribValor;
	}

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public BigDecimal getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(BigDecimal aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public int getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(int solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public List<ListaValoresDTO> getListarValores() {
		return listarValores;
	}

	public void setListarValores(List<ListaValoresDTO> listarValores) {
		this.listarValores = listarValores;
	}

	public Integer getDependencia() {
		return dependencia;
	}

	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}

	public ResultadoApuracaoMensalDTO getRetorno() {
		return retorno;
	}

	public void setRetorno(ResultadoApuracaoMensalDTO retorno) {
		this.retorno = retorno;
	}

	public List<ListaValoresDTO> getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(List<ListaValoresDTO> valorInicial) {
		this.valorInicial = valorInicial;
	}

	public String getRadioTelaDependencia() {
		return radioTelaDependencia;
	}

	public void setRadioTelaDependencia(String radioTelaDependencia) {
		this.radioTelaDependencia = radioTelaDependencia;
	}

	public BigDecimal getVlrMovimento() {
		return vlrMovimento;
	}

	public void setVlrMovimento(BigDecimal vlrMovimento) {
		this.vlrMovimento = vlrMovimento;
	}

	public BigDecimal getVlrTributavel() {
		return vlrTributavel;
	}

	public void setVlrTributavel(BigDecimal vlrTributavel) {
		this.vlrTributavel = vlrTributavel;
	}

}
