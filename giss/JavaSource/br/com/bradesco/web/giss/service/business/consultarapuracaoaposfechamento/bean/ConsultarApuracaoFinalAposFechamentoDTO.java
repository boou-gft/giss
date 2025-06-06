package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ConsultarApuracaoFinalAposFechamentoDTO {
	
	private String conta;
	private String razao;
	private String movimento;
	private String tributavel;
	private String aliquota;
	private String valorIss;
	private String valorIssMensal;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String dataSolicitacao;
	private String tipoIncidencia;
	private String totalISSFinal;
	private String totalReceita;
	private String totalISSMensal;
	private String totalMovimento ;
	private String totalTributavel;
	private Integer codDependencia;
	private String descDependencia;
	private Long codMunicipio;
	private String descMunicipio;
	private String uf;
	private String cosif;
	private Integer linha;

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
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
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	public String getTributavel() {
		return tributavel;
	}
	public void setTributavel(String tributavel) {
		this.tributavel = tributavel;
	}
	public String getValorIss() {
		return valorIss;
	}
	public void setValorIss(String valorIss) {
		this.valorIss = valorIss;
	}
	public String getValorIssMensal() {
		return valorIssMensal;
	}
	public void setValorIssMensal(String valorIssMensal) {
		this.valorIssMensal = valorIssMensal;
	}

	public String getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}
	public String getTotalISSFinal() {
		return totalISSFinal;
	}
	public void setTotalISSFinal(String totalISSFinal) {
		this.totalISSFinal = totalISSFinal;
	}
	public String getTotalISSMensal() {
		return totalISSMensal;
	}
	public void setTotalISSMensal(String totalISSMensal) {
		this.totalISSMensal = totalISSMensal;
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
	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getDescMunicipio() {
		return descMunicipio;
	}
	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getCodDependencia() {
		return codDependencia;
	}
	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}
	public String getDescDependencia() {
		return descDependencia;
	}
	public void setDescDependencia(String descDependencia) {
		this.descDependencia = descDependencia;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public Integer getCodigoGrupo() {
		return GissUtil.pegarCodigoGrupo(razao);
	}
	public Integer getCodigoSubGrupo() {
		return GissUtil.pegarCodigoSubgrupo(razao);
	}
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
	/**
	 * @return the linha
	 */
	public Integer getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(Integer linha) {
		this.linha = linha;
	}	
}
