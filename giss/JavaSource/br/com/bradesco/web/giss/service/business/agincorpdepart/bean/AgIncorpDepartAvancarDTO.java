package br.com.bradesco.web.giss.service.business.agincorpdepart.bean;

import java.math.BigDecimal;

public class AgIncorpDepartAvancarDTO {

	private String dependencia;
	private String descricao;
	private String sinalSaldo;
	private BigDecimal saldo;
	private String sinalIssRecolher;
	private BigDecimal issRecolher;
	private int linha;

	
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

	
	public BigDecimal getIssRecolher() {
		return issRecolher;
	}
	public void setIssRecolher(BigDecimal issRecolher) {
		this.issRecolher = issRecolher;
	}

	
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	
	public String getSinalIssRecolher() {
		return sinalIssRecolher;
	}
	public void setSinalIssRecolher(String sinalIssRecolher) {
		this.sinalIssRecolher = sinalIssRecolher;
	}
	
	
	public String getSinalSaldo() {
		return sinalSaldo;
	}
	public void setSinalSaldo(String sinalSaldo) {
		this.sinalSaldo = sinalSaldo;
	}
	
	
	
}
