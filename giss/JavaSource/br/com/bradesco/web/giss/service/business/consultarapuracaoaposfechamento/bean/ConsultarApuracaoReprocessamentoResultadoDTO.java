package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

import java.math.BigDecimal;

public class ConsultarApuracaoReprocessamentoResultadoDTO {

	private Long codPessoa;
	private Integer numSequencial;
	private Integer dataApuracao;
	private Integer dependencia;
	private String descricao;
	private BigDecimal receitaValor;
	private BigDecimal issValor;
	private int linha;

	public Long getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}
	public Integer getDataApuracao() {
		return dataApuracao;
	}
	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
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
	public BigDecimal getIssValor() {
		return issValor;
	}
	public void setIssValor(BigDecimal issValor) {
		this.issValor = issValor;
	}
	public Integer getNumSequencial() {
		return numSequencial;
	}
	public void setNumSequencial(Integer numSequencial) {
		this.numSequencial = numSequencial;
	}
	public BigDecimal getReceitaValor() {
		return receitaValor;
	}
	public void setReceitaValor(BigDecimal receitaValor) {
		this.receitaValor = receitaValor;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
}
