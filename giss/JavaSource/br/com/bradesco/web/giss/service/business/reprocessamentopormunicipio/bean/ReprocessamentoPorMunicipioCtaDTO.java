package br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean;

public class ReprocessamentoPorMunicipioCtaDTO {
	private String conta;
	private String descricao;
	private String aliquota;
	private int radioSelecionadoAliquota;
	
	
	public String getAliquota() {
		return aliquota;
	}
	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
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
	public int getRadioSelecionadoAliquota() {
		return radioSelecionadoAliquota;
	}
	public void setRadioSelecionadoAliquota(int radioSelecionadoAliquota) {
		this.radioSelecionadoAliquota = radioSelecionadoAliquota;
	}
	
	
	
	
	
	
}
