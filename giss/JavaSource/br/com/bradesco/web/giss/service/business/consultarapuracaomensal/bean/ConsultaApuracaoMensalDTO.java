package br.com.bradesco.web.giss.service.business.consultarapuracaomensal.bean;

public class ConsultaApuracaoMensalDTO {
	
	private int itemRadio;
	private String dependencia;
	private String descricao;
	private String receita;
	private String issRecolher;
	
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIssRecolher() {
		return issRecolher;
	}
	public void setIssRecolher(String issRecolher) {
		this.issRecolher = issRecolher;
	}
	public int getItemRadio() {
		return itemRadio;
	}
	public void setItemRadio(int linha) {
		this.itemRadio = linha;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	

}
