package br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ContasOscilacaoNegativaDTO {
	private String conta;
	private String cosif;
	private String razao;
	private String descricao;
	private BigDecimal anterior;
	private BigDecimal atual;
	private BigDecimal oscilacao;
	private BigDecimal totalAnterior;
	private BigDecimal totalAtual;
	private BigDecimal totalOscilacao;
	private BigDecimal totalAnteriorAcumulado;
	private BigDecimal totalAtualAcumulado;
	private BigDecimal totalOscilacaoAcumulado;
	
	public BigDecimal getAnterior() {
		return anterior;
	}
	public void setAnterior(BigDecimal anterior) {
		this.anterior = anterior;
	}
	public BigDecimal getAtual() {
		return atual;
	}
	public void setAtual(BigDecimal atual) {
		this.atual = atual;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getOscilacao() {
		return oscilacao;
	}
	public void setOscilacao(BigDecimal oscilacao) {
		this.oscilacao = oscilacao;
	}
	public BigDecimal getTotalAnterior() {
		return totalAnterior;
	}
	public void setTotalAnterior(BigDecimal totalAnterior) {
		this.totalAnterior = totalAnterior;
	}
	public BigDecimal getTotalAtual() {
		return totalAtual;
	}
	public void setTotalAtual(BigDecimal totalAtual) {
		this.totalAtual = totalAtual;
	}
	public BigDecimal getTotalOscilacao() {
		return totalOscilacao;
	}
	public void setTotalOscilacao(BigDecimal totalOscilacao) {
		this.totalOscilacao = totalOscilacao;
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

	public Integer getCodigoSubgrupo() {
		return GissUtil.pegarCodigoSubgrupo(razao);
	}
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
	public BigDecimal getTotalAnteriorAcumulado() {
		return totalAnteriorAcumulado;
	}
	public void setTotalAnteriorAcumulado(BigDecimal totalAnteriorAcumulado) {
		this.totalAnteriorAcumulado = totalAnteriorAcumulado;
	}
	public BigDecimal getTotalAtualAcumulado() {
		return totalAtualAcumulado;
	}
	public void setTotalAtualAcumulado(BigDecimal totalAtualAcumulado) {
		this.totalAtualAcumulado = totalAtualAcumulado;
	}
	public BigDecimal getTotalOscilacaoAcumulado() {
		return totalOscilacaoAcumulado;
	}
	public void setTotalOscilacaoAcumulado(BigDecimal totalOscilacaoAcumulado) {
		this.totalOscilacaoAcumulado = totalOscilacaoAcumulado;
	}
	
}
