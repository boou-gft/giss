package br.com.bradesco.web.giss.service.business.historicomunicipio.bean;

public class HistoricoMunicipioContasDTO {
	
	private String conta;
	private String cosif;
	private String razao;
	private String descricaoDetalhe;
	private String codigoTributo;
	private int linha;
	
	public String getCodigoTributo() {
		return codigoTributo;
	}
	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDescricaoDetalhe() {
		return descricaoDetalhe;
	}
	public void setDescricaoDetalhe(String descricaoDetalhe) {
		this.descricaoDetalhe = descricaoDetalhe;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
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
