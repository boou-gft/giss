package br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada;

public class PesquisaProcessamentoApuracaoMensalDiferenciadaDTO {
	
	private int linha;
	private String dependencia;
	private String descricao;
	private String receita;
	private String iss;
	
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
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}

	
}
