package br.com.bradesco.web.giss.service.business.saldosdivergentes.bean;

import java.math.BigDecimal;

public class SaldoDivergenteDependenciaDTO {

	private int dependencia;
	private String descricao;
	private BigDecimal apuracao;
	private BigDecimal contabil;
	
	

	public BigDecimal getApuracao() {
		return apuracao;
	}
	public void setApuracao(BigDecimal apuracao) {
		this.apuracao = apuracao;
	}
	public BigDecimal getContabil() {
		return contabil;
	}
	public void setContabil(BigDecimal contabil) {
		this.contabil = contabil;
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
	

	
	
}
