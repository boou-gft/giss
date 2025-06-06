package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import org.apache.commons.lang.StringUtils;


public class ListaConciliacaoApuracaoVo {
	
	private String cosif;
	private Integer grupoRazao;
	private Integer subGrupoRazao;
	private Integer conta;
	private String digitoConta;
	private String descContaRazao;
	private String sinalSaldoAnteriorCCRS; 
	private String valorSaldoAnteriorCCRS; 
	private String sinalDebitoCCRS;
	private String valorDebitoCCRS;
	private String sinalCreditoCCRS;
	private String valorCreditoCCRS;
	private String sinalSaldoAtualCCRS;
	private String valorSaldoAtualCCRS;
	private String sinalReceitaBalancete;
	private String valorReceitaBalancete;
	private String sinalReceitaGISS;
	private String valorReceitaGISS;
	private String sinalDifReceitaBalancete;
	private String valorDifReceitaBalancete;
	
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
	
	public String getGrupoRazaoFormatado() {
		return StringUtils.leftPad(grupoRazao.toString(), 2, "0") + "-" +StringUtils.leftPad(subGrupoRazao.toString(), 2, "0");
	}
	
	public String getContaFormatada() {
		return getConta() + "-" + getDigitoConta();
	}
	
	public Integer getGrupoRazao() {
		return grupoRazao;
	}
	public void setGrupoRazao(Integer grupoRazao) {
		this.grupoRazao = grupoRazao;
	}
	
	public String getSubGrupoRazaoFormatado() {
		return StringUtils.leftPad(subGrupoRazao.toString(), 2, "0");
	}
	
	public Integer getSubGrupoRazao() {
		return subGrupoRazao;
	}
	public void setSubGrupoRazao(Integer subGrupoRazao) {
		this.subGrupoRazao = subGrupoRazao;
	}
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public String getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}
	public String getDescContaRazao() {
		return descContaRazao;
	}
	public void setDescContaRazao(String descContaRazao) {
		this.descContaRazao = descContaRazao;
	}
	public String getSinalSaldoAnteriorCCRS() {
		return sinalSaldoAnteriorCCRS;
	}
	public void setSinalSaldoAnteriorCCRS(String sinalSaldoAnteriorCCRS) {
		this.sinalSaldoAnteriorCCRS = sinalSaldoAnteriorCCRS;
	}
	public String getValorSaldoAnteriorCCRS() {
		return valorSaldoAnteriorCCRS;
	}
	public void setValorSaldoAnteriorCCRS(String valorSaldoAnteriorCCRS) {
		this.valorSaldoAnteriorCCRS = valorSaldoAnteriorCCRS;
	}
	public String getSinalDebitoCCRS() {
		return sinalDebitoCCRS;
	}
	public void setSinalDebitoCCRS(String sinalDebitoCCRS) {
		this.sinalDebitoCCRS = sinalDebitoCCRS;
	}
	public String getValorDebitoCCRS() {
		return valorDebitoCCRS;
	}
	public void setValorDebitoCCRS(String valorDebitoCCRS) {
		this.valorDebitoCCRS = valorDebitoCCRS;
	}
	public String getSinalCreditoCCRS() {
		return sinalCreditoCCRS;
	}
	public void setSinalCreditoCCRS(String sinalCreditoCCRS) {
		this.sinalCreditoCCRS = sinalCreditoCCRS;
	}
	public String getValorCreditoCCRS() {
		return valorCreditoCCRS;
	}
	public void setValorCreditoCCRS(String valorCreditoCCRS) {
		this.valorCreditoCCRS = valorCreditoCCRS;
	}
	public String getSinalSaldoAtualCCRS() {
		return sinalSaldoAtualCCRS;
	}
	public void setSinalSaldoAtualCCRS(String sinalSaldoAtualCCRS) {
		this.sinalSaldoAtualCCRS = sinalSaldoAtualCCRS;
	}
	public String getValorSaldoAtualCCRS() {
		return valorSaldoAtualCCRS;
	}
	public void setValorSaldoAtualCCRS(String valorSaldoAtualCCRS) {
		this.valorSaldoAtualCCRS = valorSaldoAtualCCRS;
	}
	public String getSinalReceitaBalancete() {
		return sinalReceitaBalancete;
	}
	public void setSinalReceitaBalancete(String sinalReceitaBalancete) {
		this.sinalReceitaBalancete = sinalReceitaBalancete;
	}
	public String getValorReceitaBalancete() {
		return valorReceitaBalancete;
	}
	public void setValorReceitaBalancete(String valorReceitaBalancete) {
		this.valorReceitaBalancete = valorReceitaBalancete;
	}
	public String getSinalReceitaGISS() {
		return sinalReceitaGISS;
	}
	public void setSinalReceitaGISS(String sinalReceitaGISS) {
		this.sinalReceitaGISS = sinalReceitaGISS;
	}
	public String getValorReceitaGISS() {
		return valorReceitaGISS;
	}
	public void setValorReceitaGISS(String valorReceitaGISS) {
		this.valorReceitaGISS = valorReceitaGISS;
	}
	public String getSinalDifReceitaBalancete() {
		return sinalDifReceitaBalancete;
	}
	public void setSinalDifReceitaBalancete(String sinalDifReceitaBalancete) {
		this.sinalDifReceitaBalancete = sinalDifReceitaBalancete;
	}
	public String getValorDifReceitaBalancete() {
		return valorDifReceitaBalancete;
	}
	public void setValorDifReceitaBalancete(String valorDifReceitaBalancete) {
		this.valorDifReceitaBalancete = valorDifReceitaBalancete;
	}
}