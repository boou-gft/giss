package br.com.bradesco.web.giss.service.business.movnaotrib.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class MovNaoTribContaDTO {
	
	private String conta;
	private String cosif;
	private String razao;
	private BigDecimal movimento;
	private BigDecimal receita;
	private int linha;
	
	
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public BigDecimal getMovimento() {
		return movimento;
	}
	public void setMovimento(BigDecimal movimento) {
		this.movimento = movimento;
	}
	public BigDecimal getReceita() {
		return receita;
	}
	public void setReceita(BigDecimal receita) {
		this.receita = receita;
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
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
}
