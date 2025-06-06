package br.com.bradesco.web.giss.view.bean.controller.consultar.movimentoNaoTributavel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.impl.ManterMunicipioServiceImpl;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribContaTotalDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribProsseguirDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribProsseguirTotalDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.impl.MovNaoTribServiceImpl;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;

public class MovimentoNaoTributavelBean extends FiltroGenericoGISSBean {
	/**
	 * 
	 */
	private static final long							serialVersionUID						= 1L;
	private boolean												mostraTabela								= false;
	private List<MunicipioDTO>						listaMunicipio							= new ArrayList<MunicipioDTO>();
	private MovNaoTribServiceImpl					movimentoNaoTributavelImpl	= new MovNaoTribServiceImpl();
	private ManterMunicipioServiceImpl		manterMunicipioImpl;
	private List<SelectItem>							listaRadioMunicipio					= new ArrayList<SelectItem>();
	private List<SelectItem>							listaRadioDependencia				= new ArrayList<SelectItem>();
	private List<SelectItem>							listaRadioContas						= new ArrayList<SelectItem>();
	private String												itemSelecionadoLista;
	private String												municipio;
	private String												txtMesCompetencia;
	private String												txtAnoCompetencia;
	private boolean												mostraPaginacao;
	private boolean												mostraPaginacaoDependencia;
	private boolean												mostraPaginacaoContas;
	private String												estado;
	private String												dataFormatada;
	private MovNaoTribProsseguirTotalDTO	dependenciaTotal						= new MovNaoTribProsseguirTotalDTO();
	private String												itemSelecionadoListaDependencia;
	private String												descricao;
	private int														dependencia;

	private MovNaoTribContaTotalDTO				listaContas									= new MovNaoTribContaTotalDTO();
	private long													codPessoaJuridica;
	private int														nSeqUnidOrganizacional;

	private BigDecimal										baseCalculo;
	private BigDecimal										aliquotaPadrao;

	private String												tipoIncidencia;

	private BigDecimal										receitaTotalGeral;
	private BigDecimal										receitaTotalMunicipio;
	private BigDecimal										movimentoTotalGeral;
	private BigDecimal										movimentoTotalMunicipio;

	private String												dataCompetenciaString;
	private String												codigoMunicipio;
	private int														dataCompetencia;

	private BigDecimal										totalMovimento;
	private BigDecimal										totalReceita;

	private int														controleVoltar;

	private Boolean												razaoExiste									= true;
	private BigDecimal totalApurAgencia;
	private BigDecimal totalApurPa;

	public String inicializaMovimentoNaoTributavel() {

		super.inicializaFiltroGenerico();
		carregaEstados();
		limparMovimentoNaoTributavel();
		return "movimentoNaoTributavel";
	}

	public void limparMovimentoNaoTributavel() {

		setEstadoFiltro(null);
		setListaMunicipio(null);
		setTxtMesCompetencia("");
		setTxtAnoCompetencia("");
		setMostraTabela(false);
	}

	public String movimentoNaoTributavelProsseguir() {

		if (txtMesCompetencia.equals("") || txtAnoCompetencia.equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Digite a competência.", "movimentoNaoTributavel", BradescoViewExceptionActionType.ACTION, false);
		} else {
			MunicipioDTO linhaMunicipioSelecionada = listaMunicipio.get(new Integer(itemSelecionadoLista));
			municipio = linhaMunicipioSelecionada.getCodigo() + " - " + linhaMunicipioSelecionada.getNome();
			estado = labelEstado();
			dataFormatada = txtMesCompetencia + "/" + txtAnoCompetencia;
			dataCompetenciaString = txtMesCompetencia + txtAnoCompetencia;
			dataCompetencia = new Integer(txtMesCompetencia + txtAnoCompetencia);
			codigoMunicipio = linhaMunicipioSelecionada.getCodigo();
			carregaDependencias();
			return "consultarMovimentoNaoTributavelProsseguir";
		}
		return null;
	}

	public String voltarMovimentoNaoTributavel() {

		//pesquisarMunicipios();
		if (controleVoltar == 1) {
			setMostraTabela(true);
		} else if (controleVoltar == 2) {
			setMostraTabela(false);
		}
		return "movimentoNaoTributavel";
	}

	public String movimentoNaoTributavelConsultar() {

		MovNaoTribProsseguirDTO dependenciaDTO = dependenciaTotal.getListaMovNaoTribProsseguirDTO().get(new Integer(itemSelecionadoListaDependencia));
		dependencia = new Integer(dependenciaDTO.getDependencia());

		descricao = dependenciaDTO.getDescricao();
		codPessoaJuridica = dependenciaDTO.getCodigoPessoaJuridica();
		nSeqUnidOrganizacional = dependenciaDTO.getNumeroSequenciaUnidadeOrganizacional();
		carregaListaContas();
		return "movimentoNaoTributavelConsultar";
	}

	public String voltarMovimentoNaoTributavelProsseguir() {

		//carregaDependencias();
		if (dependenciaTotal != null) {
			setMostraPaginacaoDependencia(true);
			listaRadioDependencia = GissUtil.preencherSelectItemsMunicipio(dependenciaTotal.getListaMovNaoTribProsseguirDTO());
		}
		return "consultarMovimentoNaoTributavelProsseguir";
	}

	public void carregaEstados() {

		listaEstados = dependenciaImpl.listarComboEstados();
	}

	public void pesquisarMunicipios() {

		if (estadoFiltro.equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um Estado.", "movimentoNaoTributavel", BradescoViewExceptionActionType.ACTION, false);
		} else {
			try {
				listaMunicipio = manterMunicipioImpl.listarMunicipios(estadoFiltro, 0L);
			} catch (PdcAdapterFunctionalException e) {
				setMostraTabela(false);
				setMostraPaginacao(false);
				setListaMunicipio(null);
				throw e;
			}

			if (listaMunicipio != null) {
				setMostraPaginacao(true);
				listaRadioMunicipio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaMunicipio.size(); i++) {
					listaRadioMunicipio.add(new SelectItem(i, " "));
				}
			}
			setMostraTabela(true);
		}

	}

	public String carregaLista() {

		if (getTxtAnoCompetencia().equals("") || getTxtMesCompetencia().equals("")) {
			if (getTxtMesCompetencia().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Mês da competência.", false);
				return null;
			}
			if (getTxtAnoCompetencia().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Ano da competência.", false);
				return null;
			}
		}

		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			if (codDepFiltro == null || codDepFiltro == 0) {
				controleVoltar = 2;
				buscaMunicipioManter();
				codigoMunicipio = buscaMunicipio.getCodigo().toString();
				municipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
				estado = labelEstado();
				dataFormatada = txtMesCompetencia + "/" + txtAnoCompetencia;
				dataCompetenciaString = txtMesCompetencia + txtAnoCompetencia;
				dataCompetencia = new Integer(txtMesCompetencia + txtAnoCompetencia);
				listaMunicipio = null;
				listaRadioMunicipio = null;
				mostraTabela = false;
				carregaDependencias();
				return "consultarMovimentoNaoTributavelProsseguir";
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
				controleVoltar = 1;
				pesquisarMunicipios();
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
			}
		} else if (codDepFiltro != null && codDepFiltro != 0) {
			codigoMunicipio = "0";
			dataFormatada = txtMesCompetencia + "/" + txtAnoCompetencia;
			dataCompetenciaString = txtMesCompetencia + txtAnoCompetencia;
			dataCompetencia = new Integer(txtMesCompetencia + txtAnoCompetencia);
			listaMunicipio = null;
			listaRadioMunicipio = null;
			mostraTabela = false;
			carregaDependencias();
			codigoMunicipio = dependenciaTotal.getCodMunicipio() != null ? dependenciaTotal.getCodMunicipio().toString() : "0";
			municipio = codigoMunicipio + " - " + dependenciaTotal.getDescMunicipio();
			estado = dependenciaTotal.getCodUF() + " - " + dependenciaTotal.getDescUF();
			return "consultarMovimentoNaoTributavelProsseguir";
		} else
			BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		return "";
	}

	public String paginarListaMunicipio(ActionEvent e) {

		pesquisarMunicipios();
		setListaMunicipio(listaMunicipio);
		return "movimentoNaoTributavel";
	}

	public String paginarListaDependencia(ActionEvent e) {

		carregaDependencias();
		return "movimentoNaoTributavel";
	}

	public String paginarListaContas(ActionEvent e) {

		carregaListaContas();
		setListaContas(listaContas);
		return "movimentoNaoTributavel";
	}

	public void carregaDependencias() {

		dependenciaTotal = movimentoNaoTributavelImpl.listarDependencias(codigoMunicipio != null && !codigoMunicipio.equals("0") ? codigoMunicipio : "0", dataCompetenciaString, codDepFiltro != null && codDepFiltro != 0 ? Long.valueOf(indiceComboEmpresaFiltro) : 0l, codDepFiltro != null
				&& codDepFiltro != 0 ? codDepFiltro : 0);

		receitaTotalGeral = dependenciaTotal.getValorApuracaoTotalAg().add(dependenciaTotal.getValorApuracaoTotalPa());
		receitaTotalMunicipio = dependenciaTotal.getReceitaTotalMunicipio();
		movimentoTotalGeral = dependenciaTotal.getValorApuracaoTotalAg().add(dependenciaTotal.getValorApuracaoTotalPa());
		movimentoTotalMunicipio = dependenciaTotal.getMovimentoTotalMunicipio();
		totalApurAgencia = dependenciaTotal.getValorApuracaoTotalAg();
		totalApurPa = dependenciaTotal.getValorApuracaoTotalPa();

		if (dependenciaTotal != null) {
			setMostraPaginacaoDependencia(true);
			listaRadioDependencia = GissUtil.preencherSelectItemsMunicipio(dependenciaTotal.getListaMovNaoTribProsseguirDTO());
		}
	}

	public void carregaListaContas() {

		listaContas = movimentoNaoTributavelImpl.listarContas(codigoMunicipio, dataCompetencia, codPessoaJuridica, nSeqUnidOrganizacional);

		if (listaContas.getListaMovNaoTribContaDTO().size() > 0) {
			if (listaContas.getListaMovNaoTribContaDTO().get(0).getCodigoGrupo() <= 0 || listaContas.getListaMovNaoTribContaDTO().get(0).getCodigoSubgrupo() <= 0) {
				razaoExiste = false;
			}
			else{
				razaoExiste = true;
			}
		}

		baseCalculo = listaContas.getBaseCalculo();
		aliquotaPadrao = listaContas.getAliquotaPadrao();
		tipoIncidencia = listaContas.getTipoIncidencia();

		setTotalMovimento(listaContas.getTotalMovimento());
		setTotalReceita(listaContas.getTotalReceita());

		if (listaContas != null) {
			setMostraPaginacaoContas(true);
			listaRadioDependencia = new ArrayList<SelectItem>();
			for (int i = 0; i <= listaContas.getListaMovNaoTribContaDTO().size(); i++) {
				listaRadioDependencia.add(new SelectItem(i, " "));
			}
		}
	}

	public String labelEstado() {

		String sCodEstado = "";
		String sRetorno = "";

		for (int i = 0; i <= listaEstados.size() - 1; i++) {
			sCodEstado = listaEstados.get(i).getValue().toString();
			if (sCodEstado.equals(estadoFiltro)) {
				sRetorno = listaEstados.get(i).getLabel();
				break;
			}
		}
		return sRetorno;
	}

	// Getters e Setters

	public boolean isMostraTabela() {

		return mostraTabela;
	}

	public void setMostraTabela(boolean mostraTabela) {

		this.mostraTabela = mostraTabela;
	}

	public MovNaoTribServiceImpl getMovimentoNaoTributavelImpl() {

		return movimentoNaoTributavelImpl;
	}

	public void setMovimentoNaoTributavelImpl(MovNaoTribServiceImpl movimentoNaoTributavelImpl) {

		this.movimentoNaoTributavelImpl = movimentoNaoTributavelImpl;
	}

	public List<MunicipioDTO> getListaMunicipio() {

		return listaMunicipio;
	}

	public void setListaMunicipio(List<MunicipioDTO> listaMunicipio) {

		this.listaMunicipio = listaMunicipio;
	}

	public ManterMunicipioServiceImpl getManterMunicipioImpl() {

		return manterMunicipioImpl;
	}

	public void setManterMunicipioImpl(ManterMunicipioServiceImpl manterMunicipioImpl) {

		this.manterMunicipioImpl = manterMunicipioImpl;
	}

	public List<SelectItem> getListaRadioMunicipio() {

		return listaRadioMunicipio;
	}

	public void setListaRadioMunicipio(List<SelectItem> listaRadioMunicipio) {

		this.listaRadioMunicipio = listaRadioMunicipio;
	}

	public String getItemSelecionadoLista() {

		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {

		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public String getMunicipio() {

		return municipio;
	}

	public void setMunicipio(String municipio) {

		this.municipio = municipio;
	}

	public String getTxtAnoCompetencia() {

		return txtAnoCompetencia;
	}

	public void setTxtAnoCompetencia(String txtAnoCompetencia) {

		this.txtAnoCompetencia = txtAnoCompetencia;
	}

	public String getTxtMesCompetencia() {

		return txtMesCompetencia;
	}

	public void setTxtMesCompetencia(String txtMesCompetencia) {

		this.txtMesCompetencia = txtMesCompetencia;
	}

	public boolean isMostraPaginacao() {

		return mostraPaginacao;
	}

	public void setMostraPaginacao(boolean mostraPaginacao) {

		this.mostraPaginacao = mostraPaginacao;
	}

	public String getEstado() {

		return estado;
	}

	public void setEstado(String estado) {

		this.estado = estado;
	}

	public String getDataFormatada() {

		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {

		this.dataFormatada = dataFormatada;
	}

	public List<SelectItem> getListaRadioDependencia() {

		return listaRadioDependencia;
	}

	public void setListaRadioDependencia(List<SelectItem> listaRadioDependencia) {

		this.listaRadioDependencia = listaRadioDependencia;
	}

	public String getItemSelecionadoListaDependencia() {

		return itemSelecionadoListaDependencia;
	}

	public void setItemSelecionadoListaDependencia(String itemSelecionadoListaDependencia) {

		this.itemSelecionadoListaDependencia = itemSelecionadoListaDependencia;
	}

	public boolean isMostraPaginacaoDependencia() {

		return mostraPaginacaoDependencia;
	}

	public void setMostraPaginacaoDependencia(boolean mostraPaginacaoDependencia) {

		this.mostraPaginacaoDependencia = mostraPaginacaoDependencia;
	}

	public int getDependencia() {

		return dependencia;
	}

	public void setDependencia(int dependencia) {

		this.dependencia = dependencia;
	}

	public String getDescricao() {

		return descricao;
	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public MovNaoTribContaTotalDTO getListaContas() {

		return listaContas;
	}

	public void setListaContas(MovNaoTribContaTotalDTO listaContas) {

		this.listaContas = listaContas;
	}

	public List<SelectItem> getListaRadioContas() {

		return listaRadioContas;
	}

	public void setListaRadioContas(List<SelectItem> listaRadioContas) {

		this.listaRadioContas = listaRadioContas;
	}

	public boolean isMostraPaginacaoContas() {

		return mostraPaginacaoContas;
	}

	public void setMostraPaginacaoContas(boolean mostraPaginacaoContas) {

		this.mostraPaginacaoContas = mostraPaginacaoContas;
	}

	public long getCodPessoaJuridica() {

		return codPessoaJuridica;
	}

	public void setCodPessoaJuridica(long codPessoaJuridica) {

		this.codPessoaJuridica = codPessoaJuridica;
	}

	public int getNSeqUnidOrganizacional() {

		return nSeqUnidOrganizacional;
	}

	public void setNSeqUnidOrganizacional(int seqUnidOrganizacional) {

		nSeqUnidOrganizacional = seqUnidOrganizacional;
	}

	public BigDecimal getMovimentoTotalGeral() {

		return movimentoTotalGeral;
	}

	public void setMovimentoTotalGeral(BigDecimal movimentoTotalGeral) {

		this.movimentoTotalGeral = movimentoTotalGeral;
	}

	public BigDecimal getMovimentoTotalMunicipio() {

		return movimentoTotalMunicipio;
	}

	public void setMovimentoTotalMunicipio(BigDecimal movimentoTotalMunicipio) {

		this.movimentoTotalMunicipio = movimentoTotalMunicipio;
	}

	public BigDecimal getReceitaTotalGeral() {

		return receitaTotalGeral;
	}

	public void setReceitaTotalGeral(BigDecimal receitaTotalGeral) {

		this.receitaTotalGeral = receitaTotalGeral;
	}

	public BigDecimal getReceitaTotalMunicipio() {

		return receitaTotalMunicipio;
	}

	public void setReceitaTotalMunicipio(BigDecimal receitaTotalMunicipio) {

		this.receitaTotalMunicipio = receitaTotalMunicipio;
	}

	public String getCodigoMunicipio() {

		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {

		this.codigoMunicipio = codigoMunicipio;
	}

	public int getDataCompetencia() {

		return dataCompetencia;
	}

	public void setDataCompetencia(int dataCompetencia) {

		this.dataCompetencia = dataCompetencia;
	}

	public String getDataCompetenciaString() {

		return dataCompetenciaString;
	}

	public void setDataCompetenciaString(String dataCompetenciaString) {

		this.dataCompetenciaString = dataCompetenciaString;
	}

	public MovNaoTribProsseguirTotalDTO getDependenciaTotal() {

		return dependenciaTotal;
	}

	public void setDependenciaTotal(MovNaoTribProsseguirTotalDTO dependenciaTotal) {

		this.dependenciaTotal = dependenciaTotal;
	}

	public String getTipoIncidencia() {

		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {

		this.tipoIncidencia = tipoIncidencia;
	}

	public BigDecimal getAliquotaPadrao() {

		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(BigDecimal aliquotaPadrao) {

		this.aliquotaPadrao = aliquotaPadrao;
	}

	public BigDecimal getBaseCalculo() {

		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {

		this.baseCalculo = baseCalculo;
	}

	public BigDecimal getTotalMovimento() {

		return totalMovimento;
	}

	public void setTotalMovimento(BigDecimal totalMovimento) {

		this.totalMovimento = totalMovimento;
	}

	public BigDecimal getTotalReceita() {

		return totalReceita;
	}

	public void setTotalReceita(BigDecimal totalReceita) {

		this.totalReceita = totalReceita;
	}

	public Boolean getRazaoExiste() {

		return razaoExiste;
	}

	public void setRazaoExiste(Boolean razaoExiste) {

		this.razaoExiste = razaoExiste;
	}

	/**
	 * @return the totalApurAgencia
	 */
	public BigDecimal getTotalApurAgencia() {
		return totalApurAgencia;
	}

	/**
	 * @param totalApurAgencia the totalApurAgencia to set
	 */
	public void setTotalApurAgencia(BigDecimal totalApurAgencia) {
		this.totalApurAgencia = totalApurAgencia;
	}

	/**
	 * @return the totalApurPa
	 */
	public BigDecimal getTotalApurPa() {
		return totalApurPa;
	}

	/**
	 * @param totalApurPa the totalApurPa to set
	 */
	public void setTotalApurPa(BigDecimal totalApurPa) {
		this.totalApurPa = totalApurPa;
	}

}
