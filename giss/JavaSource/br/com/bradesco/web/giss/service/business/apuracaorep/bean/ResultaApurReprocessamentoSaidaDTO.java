package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

public class ResultaApurReprocessamentoSaidaDTO {

	private String conta;
	private String movimento;
	private String tributavel;
	private String aliquota;
	private String iss;
	private int linha;
	
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
	
	public String getIss() {
		return iss;
	}
	
	public void setIss(String iss) {
		this.iss = iss;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public String getMovimento() {
		return movimento;
	}
	
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	public String getTributavel() {
		return tributavel;
	}
	
	public void setTributavel(String tributavel) {
		this.tributavel = tributavel;
	}

}
