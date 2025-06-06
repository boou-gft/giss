package br.com.bradesco.web.giss.service.business.municipio.bean;

public class ContaMunicipioDTO {
	private String conta;
	private String descricao;
	private String aliquota;
	private String codigoTributo;	
	private int linha;
	
	
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
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
	public String getCodigoTributo() {
		return codigoTributo;
	}
	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
