package br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.bean;

import java.math.BigDecimal;

public class ApuracaoMensalDiferenciadaDTO {
	
	private int linha;
	private String dependencia;
	private String descricao;
	private String receita;
	private String issRecolher;
	private long codPessoaJuridica;
	private BigDecimal totalReceita;
	private BigDecimal totalISS;
	private int radioSelecionadoApuracao;
	private int numeroSeqUniOrg;
	
	


	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIssRecolher() {
		return issRecolher;
	}
	public void setIssRecolher(String issRecolher) {
		this.issRecolher = issRecolher;
	}
	public int getRadioSelecionadoApuracao() {
		return radioSelecionadoApuracao;
	}
	public void setRadioSelecionadoApuracao(int radioSelecionadoApuracao) {
		this.radioSelecionadoApuracao = radioSelecionadoApuracao;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	/**
	 * Obtém o campo totalISS
	 * @return totalISS Long 
	 */
	public BigDecimal getTotalISS() {
		return totalISS;
	}
	/**
	 * Define o campo totalISS
	 * @param totalISS Long 
	 */
	public void setTotalISS(BigDecimal totalISS) {
		this.totalISS = totalISS;
	}
	/**
	 * Obtém o campo totalReceita
	 * @return totalReceita Long 
	 */
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	/**
	 * Define o campo totalReceita
	 * @param totalReceita Long 
	 */
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public long getCodPessoaJuridica() {
		return codPessoaJuridica;
	}
	public void setCodPessoaJuridica(long codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}
	public int getNumeroSeqUniOrg() {
		return numeroSeqUniOrg;
	}
	public void setNumeroSeqUniOrg(int numeroSeqUniOrg) {
		this.numeroSeqUniOrg = numeroSeqUniOrg;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}


	
	

}
