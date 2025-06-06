package br.com.bradesco.web.giss.service.business.valormestotal.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class DemonstrativoISSDTO {
	
	private String cosif;
	private String conta;
	private String razao;
	private BigDecimal receita;
	private BigDecimal iss;
	private int linha;
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public BigDecimal getIss() {
		return iss;
	}
	public void setIss(BigDecimal iss) {
		this.iss = iss;
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
