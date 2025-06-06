package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import java.math.BigDecimal;

public class SaidaCampoValorVO {
	
	private BigDecimal totalApuracao = BigDecimal.ZERO;
	private BigDecimal valorReceita = BigDecimal.ZERO;
    private BigDecimal valorReceitaTotal = BigDecimal.ZERO;
    private BigDecimal valorReceitaDiferenca = BigDecimal.ZERO;
    private BigDecimal balancete = BigDecimal.ZERO;
    private BigDecimal aliquotaZerada = BigDecimal.ZERO;
    private BigDecimal oscilacaoNegativa = BigDecimal.ZERO;
    private BigDecimal subTotalUm = BigDecimal.ZERO;
    private BigDecimal subTotalDois = BigDecimal.ZERO;
    private BigDecimal ajuste = BigDecimal.ZERO;
    private BigDecimal conciliacaoFinal = BigDecimal.ZERO;
    
    
    // GETTERS AND SETTERS
	public BigDecimal getTotalApuracao() {
		return totalApuracao;
	}
	public void setTotalApuracao(BigDecimal totalApuracao) {
		this.totalApuracao = totalApuracao;
	}
	public BigDecimal getValorReceita() {
		return valorReceita;
	}
	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}
	public BigDecimal getValorReceitaTotal() {
		return valorReceitaTotal;
	}
	public void setValorReceitaTotal(BigDecimal valorReceitaTotal) {
		this.valorReceitaTotal = valorReceitaTotal;
	}
	public BigDecimal getValorReceitaDiferenca() {
		return valorReceitaDiferenca;
	}
	public void setValorReceitaDiferenca(BigDecimal valorReceitaDiferenca) {
		this.valorReceitaDiferenca = valorReceitaDiferenca;
	}
	public BigDecimal getBalancete() {
		return balancete;
	}
	public void setBalancete(BigDecimal balancete) {
		this.balancete = balancete;
	}
	public BigDecimal getAliquotaZerada() {
		return aliquotaZerada;
	}
	public void setAliquotaZerada(BigDecimal aliquotaZerada) {
		this.aliquotaZerada = aliquotaZerada;
	}
	public BigDecimal getOscilacaoNegativa() {
		return oscilacaoNegativa;
	}
	public void setOscilacaoNegativa(BigDecimal oscilacaoNegativa) {
		this.oscilacaoNegativa = oscilacaoNegativa;
	}
	public BigDecimal getSubTotalUm() {
		return subTotalUm;
	}
	public void setSubTotalUm(BigDecimal subTotalUm) {
		this.subTotalUm = subTotalUm;
	}
	public BigDecimal getSubTotalDois() {
		return subTotalDois;
	}
	public void setSubTotalDois(BigDecimal subTotalDois) {
		this.subTotalDois = subTotalDois;
	}
	public BigDecimal getAjuste() {
		return ajuste;
	}
	public void setAjuste(BigDecimal ajuste) {
		this.ajuste = ajuste;
	}
	public BigDecimal getConciliacaoFinal() {
		return conciliacaoFinal;
	}
	public void setConciliacaoFinal(BigDecimal conciliacaoFinal) {
		this.conciliacaoFinal = conciliacaoFinal;
	}
	
}
