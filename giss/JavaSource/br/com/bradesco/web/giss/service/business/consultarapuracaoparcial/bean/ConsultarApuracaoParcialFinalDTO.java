package br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ConsultarApuracaoParcialFinalDTO {
	
	private String cosif;
	private String conta;
	private String razao;
	private String movimento;
	private String tributavel;
	private String aliquota;
	private String valorIss;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;
	private String totalISSFinal;
	private String totalMovimento ;
	private String totalTributavel;
	private String dataProcessamento;
	private String solicitacao;
	private String dataSolicitacao;
	private int linha;
	
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
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
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
	/**
	 * @return the cosif
	 */
	public String getCosif() {
		return cosif;
	}
	/**
	 * @param cosif the cosif to set
	 */
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(int linha) {
		this.linha = linha;
	}


}
