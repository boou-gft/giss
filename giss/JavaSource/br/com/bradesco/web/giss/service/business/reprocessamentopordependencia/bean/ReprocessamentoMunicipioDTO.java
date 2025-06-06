package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

public class ReprocessamentoMunicipioDTO {
	
	private String codigoConta;
	private String conta;
	private String razao;
	private String descricao;
	private String aliquota;
	private int radioSelecionadoMunicipio;
	private boolean contaSelecionada;
	private String cosif;
	
	public String getCodigoConta() {
		return codigoConta;
	}
	public void setCodigoConta(String codigoConta) {
		this.codigoConta = codigoConta;
	}
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
	public int getRadioSelecionadoMunicipio() {
		return radioSelecionadoMunicipio;
	}
	public void setRadioSelecionadoMunicipio(int radioSelecionadoMunicipio) {
		this.radioSelecionadoMunicipio = radioSelecionadoMunicipio;
	}
	public boolean isContaSelecionada() {
		return contaSelecionada;
	}
	public void setContaSelecionada(boolean contaSelecionada) {
		this.contaSelecionada = contaSelecionada;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
}
