package br.com.bradesco.web.giss.service.business.resultmunnovo.bean;

public class ContaDTO {

	private int linha;
	private String conta;
	private String cosif;
	private String descricao;
	private String codigoTributo;
	private String percentualAliquota;
	private String inicioVigencia;
	private String finalVigencia;
	private String razao;
	
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

	public String getFinalVigencia() {
		return finalVigencia;
	}

	public void setFinalVigencia(String finalVigencia) {
		this.finalVigencia = finalVigencia;
	}

	public String getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(String inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public String getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(String percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
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
