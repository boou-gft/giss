package br.com.bradesco.web.giss.service.business.saldosdivergentes.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class SaldoDivergenteContaDTO {

	private int linha;
	private long conta;
	private String descricao;
	private BigDecimal apuracao;
	private BigDecimal contabil;
	
	
	public BigDecimal getApuracao() {
		return apuracao;
	}
	public void setApuracao(BigDecimal apuracao) {
		this.apuracao = apuracao;
	}
	
	public long getConta() {
		return conta;
	}
	public void setConta(long conta) {
		this.conta = conta;
	}
	public BigDecimal getContabil() {
		return contabil;
	}
	public void setContabil(BigDecimal contabil) {
		this.contabil = contabil;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public String getContaFormatada(){
		return  GissUtil.mascaraContaContabil(String.valueOf(conta),"0-0");
	}
	
	
}
