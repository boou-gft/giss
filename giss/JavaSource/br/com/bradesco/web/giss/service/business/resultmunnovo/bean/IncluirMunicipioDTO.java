package br.com.bradesco.web.giss.service.business.resultmunnovo.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class IncluirMunicipioDTO {

	private String aliquotaConta;
	private String codigoConta;
	private String codigoFormaPagamento;
	private String codigoMunicipio;
	private String codigoTipoIncidencia;
	private String codigoTributo;
	private String codigoUnidadeOrganizacional;
	private String dataFinalVigenciaConta;
	private String dataInicioVigenciaConta;
	private String diaVencimento;
	private String indNecessidadePagtoDiaUtil;
	private String numeroUnidadeOrganizacional;
	private String percentualAliquota;
	private String percentualAliquotaPadrao;
	private String percentualBaseAliquota;
	private String codigoTipoServico;
	private String razao;
	private String nroLei;
	private String inforComplementar;

	public String getPercentualAliquota() {
		return percentualAliquota;
	}
	public void setPercentualAliquota(String percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}
	public String getAliquotaConta() {
		return aliquotaConta;
	}
	public void setAliquotaConta(String aliquotaConta) {
		this.aliquotaConta = aliquotaConta;
	}
	public String getCodigoConta() {
		return codigoConta;
	}
	public void setCodigoConta(String codigoConta) {
		this.codigoConta = codigoConta;
	}
	public String getCodigoFormaPagamento() {
		return codigoFormaPagamento;
	}
	public void setCodigoFormaPagamento(String codigoFormaPagamento) {
		this.codigoFormaPagamento = codigoFormaPagamento;
	}
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public String getCodigoTipoIncidencia() {
		return codigoTipoIncidencia;
	}
	public void setCodigoTipoIncidencia(String codigoTipoIncidencia) {
		this.codigoTipoIncidencia = codigoTipoIncidencia;
	}
	public String getCodigoTributo() {
		return codigoTributo;
	}
	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	public String getCodigoUnidadeOrganizacional() {
		return codigoUnidadeOrganizacional;
	}
	public void setCodigoUnidadeOrganizacional(String codigoUnidadeOrganizacional) {
		this.codigoUnidadeOrganizacional = codigoUnidadeOrganizacional;
	}
	public String getDataFinalVigenciaConta() {
		return dataFinalVigenciaConta;
	}
	public void setDataFinalVigenciaConta(String dataFinalVigenciaConta) {
		this.dataFinalVigenciaConta = dataFinalVigenciaConta;
	}
	public String getDataInicioVigenciaConta() {
		return dataInicioVigenciaConta;
	}
	public void setDataInicioVigenciaConta(String dataInicioVigenciaConta) {
		this.dataInicioVigenciaConta = dataInicioVigenciaConta;
	}
	public String getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public String getIndNecessidadePagtoDiaUtil() {
		return indNecessidadePagtoDiaUtil;
	}
	public void setIndNecessidadePagtoDiaUtil(String indNecessidadePagtoDiaUtil) {
		this.indNecessidadePagtoDiaUtil = indNecessidadePagtoDiaUtil;
	}
	public String getNumeroUnidadeOrganizacional() {
		return numeroUnidadeOrganizacional;
	}
	public void setNumeroUnidadeOrganizacional(String numeroUnidadeOrganizacional) {
		this.numeroUnidadeOrganizacional = numeroUnidadeOrganizacional;
	}
	public String getPercentualAliquotaPadrao() {
		return percentualAliquotaPadrao;
	}
	public void setPercentualAliquotaPadrao(String percentualAliquotaPadrao) {
		this.percentualAliquotaPadrao = percentualAliquotaPadrao;
	}
	public String getPercentualBaseAliquota() {
		return percentualBaseAliquota;
	}
	public void setPercentualBaseAliquota(String percentualBaseAliquota) {
		this.percentualBaseAliquota = percentualBaseAliquota;
	}
	public String getCodigoTipoServico() {
		return codigoTipoServico;
	}
	public void setCodigoTipoServico(String codigoTipoServico) {
		this.codigoTipoServico = codigoTipoServico;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public int getCodigoGrupo(){
		return GissUtil.pegarCodigoGrupo(razao);
	}
	public int getCodigoSubgrupo(){
		return GissUtil.pegarCodigoSubgrupo(razao);
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
}
