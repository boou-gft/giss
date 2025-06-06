package br.com.bradesco.web.giss.view.bean.controller.apuracaoReprocessamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaorep.IApuracaoRepService;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ApuracaoReprocessamentoSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoReprocessamentoResultadoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoReprocessamentoResultadoTotalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarMunicipiosAposFechamentoDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;

/**
 * Back Bean da tela Processamento > Consultar > Apuracao Reprocessamento
 * 
 * 
 * @author renato.mariscal@brq.com
 * 
 */
public class ApuracaoRepBean extends FiltroGenericoGISSBean {
	private static final long serialVersionUID = 1L;

	private IConsultarApuracaoAposFechamentoService consultarApuracaoAposFechamentoImpl;
	private IApuracaoRepService apuracaoRepServiceImpl;
	private static final Integer MAX_OCORRENCIA = 100;
	private List<ApuracaoReprocessamentoSaidaDTO> listaReprocessamento;
	private List<ListarApuracaoReprocessamentoSaidaDTO> listaApuracao;

	private ListarApuracaoReprocessamentoSaidaDTO dtoListApuracao = new ListarApuracaoReprocessamentoSaidaDTO();

	private ConsultarApuracaoReprocessamentoResultadoTotalDTO consultaTotalApuracaoReproc = new ConsultarApuracaoReprocessamentoResultadoTotalDTO();
	private ConsultarApuracaoReprocessamentoResultadoDTO valoresTerceiraTela = new ConsultarApuracaoReprocessamentoResultadoDTO();
	private ConsultarMunicipiosAposFechamentoDTO dto;
	private List<ConsultarMunicipiosAposFechamentoDTO> listaMunicipio = new ArrayList<ConsultarMunicipiosAposFechamentoDTO>();
	private ApuracaoReprocessamentoSaidaDTO detalhes = new ApuracaoReprocessamentoSaidaDTO();

	private List<SelectItem> listaCtrlReprocessamento = new ArrayList<SelectItem>();
	private List<SelectItem> listaCtrlMunicipio = new ArrayList<SelectItem>();
	private List<SelectItem> listaCtrlTerceiraTela = new ArrayList<SelectItem>();

	private Integer radioMunicipio;
	private Integer radioReprocessamento;
	private Integer radioApuracao;

	private String mesFiltro;
	private String anoFiltro;

	private String estado;
	private String municipio;
	private String competencia;

	private String codigo;
	private Integer dependencia;
	private String descricao;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;

	private BigDecimal totalMovimento;
	private BigDecimal totalTributavel;
	private BigDecimal totalISS;

	private ILogManager logger;
	private boolean mostraBotoes;
	private boolean mostraBotoesMunicipio;
	private boolean mostraBotoesApuracao;
	private boolean mostraMunicipios;
	private String dataCompetenciaSaida;

	private Integer numeroSolicitacao;
	private Long contaContabil;
	private Long codigoPessoaJuridica;
	private Integer numeroSequenciaUnidadeOrganizacional;
	private Integer dataApuracao;

	private Integer maiorCodigoSolicitacao;
	private String tela;
	private boolean razaoExiste = true;

	/**
	 * Metodo utilizado para inicializar a primeira pagina
	 * 
	 * @return
	 */
	public String iniciaPagina() {
		super.inicializaFiltroGenerico();
		limparCampos();
		radioReprocessamento = null;
		radioMunicipio = null;
		radioApuracao = null;
		carregaListaReprocessamento(true);
		tela = "";
		return "apuracaoReprocessamento"; // apuracaoReprocLista.jsp
	}

	/*
	 * Efetua a limpeza dos campos da tela
	 */
	private void limparCampos() {
		this.setMaiorCodigoSolicitacao(null);
		this.radioReprocessamento = -1;
		this.radioMunicipio = -1;
		this.setMostraBotoes(false);
		this.setMostraBotoesMunicipio(false);
		this.setMostraBotoesApuracao(false);

		listaMunicipio = new ArrayList<ConsultarMunicipiosAposFechamentoDTO>();
		estadoFiltro = "";
		competencia = "";
		mesFiltro = "";
		anoFiltro = "";
		mostraMunicipios = false;
		dataCompetenciaSaida = "";
	}

	/*
	 * Carrega a lista
	 */
	private void carregaListaReprocessamento(boolean inicial) {
		try {
			listaReprocessamento = getApuracaoRepServiceImpl().buscarDadosPesquisa(MAX_OCORRENCIA);

			if (listaReprocessamento != null) {
				if (inicial && !listaReprocessamento.isEmpty()) {
					setMaiorCodigoSolicitacao(listaReprocessamento.get(0).getCodigo());
				}

				listaCtrlReprocessamento = new ArrayList<SelectItem>();
				for (int i = 0; i < this.getListaReprocessamento().size(); i++) {
					listaCtrlReprocessamento.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		}
	}

	/**
	 * Carrega a lista de municipios
	 */
	public void carregaListaMunicipio() {
		try {
			listaMunicipio = new ArrayList<ConsultarMunicipiosAposFechamentoDTO>();
			listaMunicipio = getConsultarApuracaoAposFechamentoImpl().listarMunicipios(estadoFiltro);
			listaCtrlMunicipio = new ArrayList<SelectItem>();
			for (int i = 0; i < this.getListaMunicipio().size(); i++) {
				listaCtrlMunicipio.add(new SelectItem(i, " "));
			}
			if (getListaMunicipio().size() > 10) {
				setMostraBotoesMunicipio(true);
			}
			mostraMunicipios = true;

		} catch (PdcAdapterFunctionalException p) {
			mostraMunicipios = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "erro", BradescoViewExceptionActionType.ACTION, false);
		}
	}

	/**
	 * Segue para a segunda pagina. Atribui os valores da primeira pagina para a seguinte.
	 */
	public String prosseguir() {
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
		
		if (this.getRadioReprocessamento() == null ) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um item na lista.", false);
			return null;
		}

		ApuracaoReprocessamentoSaidaDTO dto = getListaReprocessamento().get(this.getRadioReprocessamento());
		detalhes.setCodigo(dto.getCodigo());
		detalhes.setDataSolicitacao(dto.getDataSolicitacao());
		detalhes.setDataProcessamento(dto.getDataProcessamento());
		detalhes.setDataInicioApuracao(dto.getDataInicioApuracao());
		detalhes.setDataFimApuracao(dto.getDataFimApuracao());

		Date dCompetencia = DateUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro));
		if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataInicioApuracao()) < 0) {
			BradescoFacesUtils.addInfoModalMessage("A competência deve ser maior que o período inicial.", false);
			return null;
		}

		if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataFimApuracao()) > 0) {
			BradescoFacesUtils.addInfoModalMessage("A competência deve ser menor que o período final.", false);
			return null;
		}
		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				buscaMunicipioManter();
				setMunicipio(buscaMunicipio.getDescricao());
				setCodigo(buscaMunicipio.getCodigo().toString());
				setEstado(obterDescricaoEstado(estadoFiltro));
				competencia = mesFiltro + anoFiltro;
				dataCompetenciaSaida = mesFiltro + "/" + anoFiltro;
				preencheListaTerceiraPagina(buscaMunicipio.getCodigo(), 0L, 0);
				if (consultaTotalApuracaoReproc != null){
					tela = "apuracaoReprocLista";
					return "apuracaoReprocConDetalhada";
				}else{
					return "";
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
				setEstado(obterDescricaoEstado(estadoFiltro));
				competencia = mesFiltro + anoFiltro;
				dataCompetenciaSaida = mesFiltro + "/" + anoFiltro;
				carregaListaMunicipio();
				tela ="";
				return "PROSSEGUIR";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (codDepFiltro != null && codDepFiltro != 0) {
			competencia = mesFiltro + anoFiltro;
			dataCompetenciaSaida = mesFiltro + "/" + anoFiltro;
			preencheListaTerceiraPagina(0L, Long.valueOf(indiceComboEmpresaFiltro), codDepFiltro);
			if (consultaTotalApuracaoReproc != null){
				setMunicipio(consultaTotalApuracaoReproc.getDescMunicipio());
				setCodigo(consultaTotalApuracaoReproc.getCodMunicipio().toString());
				setEstado(consultaTotalApuracaoReproc.getDescUF());
				tela = "apuracaoReprocLista";
				return "apuracaoReprocConDetalhada";
			}else{
				return "";
			}
		} else
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		return "";

	}

	/**
	 * Carrega os dados da terceira pagina
	 */
	public String consultaDetalhada() {

		if (!mesFiltro.equals("") && !anoFiltro.equals("")) {
			dto = getListaMunicipio().get(radioMunicipio);
			setMunicipio(dto.getNome());
			setCodigo(dto.getCodigo());
			setEstado(obterDescricaoEstado(estadoFiltro));
			competencia = mesFiltro + anoFiltro;
			dataCompetenciaSaida = mesFiltro + "/" + anoFiltro;

			Date dCompetencia = DateUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro));
			if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataInicioApuracao()) < 0) {
				BradescoFacesUtils.addInfoModalMessage("A competência deve ser maior que o período inicial.", false);
				return null;
			}

			if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataFimApuracao()) > 0) {
				BradescoFacesUtils.addInfoModalMessage("A competência deve ser menor que o período final.", false);
				return null;
			}

			if (preencheListaTerceiraPagina(dto.getCodigo() != null && !dto.getCodigo().equals("") ? Long.valueOf(dto.getCodigo()) : 0, 0L, 0)) {
				return "CONSULTA_DETALHADA";
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Digite a competência.", "PESQUISAR", BradescoViewExceptionActionType.ACTION, false);
		}

		return "";
	}

	/**
	 * Preenche a lista da terceira pagina
	 * 
	 * @return
	 */

	public boolean preencheListaTerceiraPagina(Long codMunicipio, Long codPessoaJurid, Integer codDependencia) {
		try {
			setConsultaTotalApuracaoReproc(getConsultarApuracaoAposFechamentoImpl().listarDependenciaApuracaoMensalPesquisa(String.valueOf(GissUtil.notNull(codMunicipio)), detalhes.getCodigo(), competencia, codDependencia, codPessoaJurid));
			listaCtrlTerceiraTela = GissUtil.preencherSelectItemsMunicipio(getConsultaTotalApuracaoReproc().getListaApuracaoReprocessamento());
		} catch (PdcAdapterFunctionalException p) {
			setConsultaTotalApuracaoReproc(null);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return false;
		}
		return true;
	}

	public String consultar() {
		ConsultarApuracaoReprocessamentoResultadoDTO aposFechamentoDTO = getConsultaTotalApuracaoReproc().getListaApuracaoReprocessamento().get(radioApuracao);
		setDependencia(aposFechamentoDTO.getDependencia());
		setDescricao(aposFechamentoDTO.getDescricao());
		codigoPessoaJuridica = aposFechamentoDTO.getCodPessoa();
		numeroSequenciaUnidadeOrganizacional = aposFechamentoDTO.getNumSequencial();
		dataApuracao = NumberUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro));

		Date dCompetencia = DateUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro));
		if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataInicioApuracao()) < 0) {
			BradescoFacesUtils.addInfoModalMessage("A competência deve ser maior que o período inicial.", false);
			return null;
		}

		if (DateUtils.compareToCompetencia(dCompetencia, detalhes.getDataFimApuracao()) > 0) {
			BradescoFacesUtils.addInfoModalMessage("A competência deve ser menor que o período final.", false);
			return null;
		}

		if (this.carregaListaApuracao()) {
			return "CONSULTAR";
		}
		return null;
	}

	private boolean carregaListaApuracao() {
		try {
			ListarApuracaoReprocessamentoEntradaDTO apuracaoRepDTO = new ListarApuracaoReprocessamentoEntradaDTO();
			apuracaoRepDTO.setNumeroSolicitacao(detalhes.getCodigo());
			apuracaoRepDTO.setContaContabil(0L);
			apuracaoRepDTO.setCodigoPessoaJuridica(codigoPessoaJuridica);
			apuracaoRepDTO.setNumeroSequenciaUnidadeOrganizacional(numeroSequenciaUnidadeOrganizacional);
			apuracaoRepDTO.setCodigoMunicipio(Long.valueOf(codigo));
			apuracaoRepDTO.setDataApuracao(dataApuracao);

			listaApuracao = getApuracaoRepServiceImpl().listarApuracaoReprocessamento(apuracaoRepDTO);
			
			if (listaApuracao.size() > 0) {
				if (listaApuracao.get(0).getCodigoGrupo() <= 0 || listaApuracao.get(0).getCodigoSubgrupo() <= 0) {
					razaoExiste = false;
				}
				else{
					razaoExiste = true;
				}
			}
			
			baseCalculo = NumberUtils.format(listaApuracao.get(listaApuracao.size() - 1).getBaseCalculo()) + "%";
			aliquotaPadrao = NumberUtils.format(listaApuracao.get(listaApuracao.size() - 1).getAliquotaPadrao()) + "%";
			tipoIncidencia = listaApuracao.get(listaApuracao.size() - 1).getTipoIncidencia();
			totalISS = listaApuracao.get(listaApuracao.size() - 1).getTotalIss();
			totalMovimento = listaApuracao.get(listaApuracao.size() - 1).getTotalMovimento();
			totalTributavel = listaApuracao.get(listaApuracao.size() - 1).getTotalTributavel();
			return true;
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			radioApuracao = null;

		}
		return false;
	}

	private String obterDescricaoEstado(String codEstado) {
		if (codEstado != null && !codEstado.trim().equals("") && listaEstados != null) {
			for (SelectItem item : listaEstados) {
				if (item.getValue().equals(codEstado)) {
					return item.getLabel();
				}
			}
		}
		return "";
	}

	public String voltarProsseguir() {
		radioReprocessamento = null;
//		carregaListaReprocessamento(true);
		if(tela.equals("apuracaoReprocLista")){
			return tela ;
		}
		return "VOLTAR";
		
	}

	public String voltarConsultar() {
		radioReprocessamento = null;
		return "VOLTAR";
	}

	public void paginarTerceiraLista(ActionEvent event) {
		preencheListaTerceiraPagina(buscaMunicipio.getCodigo() != null && !buscaMunicipio.getCodigo().equals("") ? Long.valueOf(buscaMunicipio.getCodigo()) : 0, codDepFiltro != null && codDepFiltro != 0 ? Long.valueOf(indiceComboEmpresaFiltro) : 0L, GissUtil.notNull(codDepFiltro));
	}

	public void paginarReprocessamento(ActionEvent event) {
		carregaListaReprocessamento(false);
		setListaReprocessamento(listaReprocessamento);
	}

	public void paginarMunicipio(ActionEvent event) {
		carregaListaMunicipio();
		setListaMunicipio(listaMunicipio);
	}

	public void pesquisarApuracao(ActionEvent event) {
		carregaListaApuracao();
		setListaApuracao(listaApuracao);
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public List<SelectItem> getListaCtrlReprocessamento() {
		return listaCtrlReprocessamento;
	}

	public void setListaCtrlReprocessamento(List<SelectItem> listaCtrlReprocessamento) {
		this.listaCtrlReprocessamento = listaCtrlReprocessamento;
	}

	public List<ApuracaoReprocessamentoSaidaDTO> getListaReprocessamento() {
		return listaReprocessamento;
	}

	public void setListaReprocessamento(List<ApuracaoReprocessamentoSaidaDTO> listaReprocessamento) {
		this.listaReprocessamento = listaReprocessamento;
	}

	public Integer getRadioReprocessamento() {
		return radioReprocessamento;
	}

	public void setRadioReprocessamento(Integer radioReprocessamento) {
		this.radioReprocessamento = radioReprocessamento;
	}

	public List<SelectItem> getListaCtrlMunicipio() {
		return listaCtrlMunicipio;
	}

	public void setListaCtrlMunicipio(List<SelectItem> listaCtrlMunicipio) {
		this.listaCtrlMunicipio = listaCtrlMunicipio;
	}

	public List<ConsultarMunicipiosAposFechamentoDTO> getListaMunicipio() {
		return listaMunicipio;
	}

	public void setListaMunicipio(List<ConsultarMunicipiosAposFechamentoDTO> listaMunicipio) {
		this.listaMunicipio = listaMunicipio;
	}

	public Integer getRadioMunicipio() {
		return radioMunicipio;
	}

	public void setRadioMunicipio(Integer radioMunicipio) {
		this.radioMunicipio = radioMunicipio;
	}

	public boolean isMostraBotoesMunicipio() {
		return mostraBotoesMunicipio;
	}

	public void setMostraBotoesMunicipio(boolean mostraBotoesMunicipio) {
		this.mostraBotoesMunicipio = mostraBotoesMunicipio;
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

	public Integer getDependencia() {
		return dependencia;
	}

	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public boolean isMostraBotoesApuracao() {
		return mostraBotoesApuracao;
	}

	public void setMostraBotoesApuracao(boolean mostraBotoesApuracao) {
		this.mostraBotoesApuracao = mostraBotoesApuracao;
	}

	public BigDecimal getTotalISS() {
		return totalISS;
	}

	public void setTotalISS(BigDecimal totalISS) {
		this.totalISS = totalISS;
	}

	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public BigDecimal getTotalTributavel() {
		return totalTributavel;
	}

	public void setTotalTributavel(BigDecimal totalTributavel) {
		this.totalTributavel = totalTributavel;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Integer getRadioApuracao() {
		return radioApuracao;
	}

	public void setRadioApuracao(Integer radioApuracao) {
		this.radioApuracao = radioApuracao;
	}

	public ApuracaoReprocessamentoSaidaDTO getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(ApuracaoReprocessamentoSaidaDTO detalhes) {
		this.detalhes = detalhes;
	}

	public IConsultarApuracaoAposFechamentoService getConsultarApuracaoAposFechamentoImpl() {
		return consultarApuracaoAposFechamentoImpl;
	}

	public void setConsultarApuracaoAposFechamentoImpl(IConsultarApuracaoAposFechamentoService consultarApuracaoAposFechamentoImpl) {
		this.consultarApuracaoAposFechamentoImpl = consultarApuracaoAposFechamentoImpl;
	}

	public IApuracaoRepService getApuracaoRepServiceImpl() {
		return apuracaoRepServiceImpl;
	}

	public void setApuracaoRepServiceImpl(IApuracaoRepService apuracaoRepServiceImpl) {
		this.apuracaoRepServiceImpl = apuracaoRepServiceImpl;
	}

	public ConsultarMunicipiosAposFechamentoDTO getDto() {
		return dto;
	}

	public void setDto(ConsultarMunicipiosAposFechamentoDTO dto) {
		this.dto = dto;
	}

	public ConsultarApuracaoReprocessamentoResultadoDTO getValoresTerceiraTela() {
		return valoresTerceiraTela;
	}

	public void setValoresTerceiraTela(ConsultarApuracaoReprocessamentoResultadoDTO valoresTerceiraTela) {
		this.valoresTerceiraTela = valoresTerceiraTela;
	}

	public List<ListarApuracaoReprocessamentoSaidaDTO> getListaApuracao() {
		return listaApuracao;
	}

	public void setListaApuracao(List<ListarApuracaoReprocessamentoSaidaDTO> listaApuracao) {
		this.listaApuracao = listaApuracao;
	}

	public ListarApuracaoReprocessamentoSaidaDTO getDtoListApuracao() {
		return dtoListApuracao;
	}

	public void setDtoListApuracao(ListarApuracaoReprocessamentoSaidaDTO dtoListApuracao) {
		this.dtoListApuracao = dtoListApuracao;
	}

	public List<SelectItem> getListaCtrlTerceiraTela() {
		return listaCtrlTerceiraTela;
	}

	public void setListaCtrlTerceiraTela(List<SelectItem> listaCtrlTerceiraTela) {
		this.listaCtrlTerceiraTela = listaCtrlTerceiraTela;
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

	public boolean isMostraMunicipios() {
		return mostraMunicipios;
	}

	public void setMostraMunicipios(boolean mostraMunicipios) {
		this.mostraMunicipios = mostraMunicipios;
	}

	public ConsultarApuracaoReprocessamentoResultadoTotalDTO getConsultaTotalApuracaoReproc() {
		return consultaTotalApuracaoReproc;
	}

	public void setConsultaTotalApuracaoReproc(ConsultarApuracaoReprocessamentoResultadoTotalDTO consultaTotalApuracaoReproc) {
		this.consultaTotalApuracaoReproc = consultaTotalApuracaoReproc;
	}

	public String getDataCompetenciaSaida() {
		return dataCompetenciaSaida;
	}

	public void setDataCompetenciaSaida(String dataCompetenciaSaida) {
		this.dataCompetenciaSaida = dataCompetenciaSaida;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Long getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(Long contaContabil) {
		this.contaContabil = contaContabil;
	}

	public Integer getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public Integer getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}

	public void setNumeroSequenciaUnidadeOrganizacional(Integer numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}

	public Integer getNumeroSolicitacao() {
		return numeroSolicitacao;
	}

	public void setNumeroSolicitacao(Integer numeroSolicitacao) {
		this.numeroSolicitacao = numeroSolicitacao;
	}

	public Integer getMaiorCodigoSolicitacao() {
		return maiorCodigoSolicitacao;
	}

	public void setMaiorCodigoSolicitacao(Integer maiorCodigoSolicitacao) {
		this.maiorCodigoSolicitacao = maiorCodigoSolicitacao;
	}

	public boolean isRazaoExiste() {
		return razaoExiste;
	}

	public void setRazaoExiste(boolean razaoExiste) {
		this.razaoExiste = razaoExiste;
	}

}