package br.com.bradesco.web.giss.service.business.histcontacontabil.bean;

public class HistContaContabilDTO {
	private String conta;
	private String descricao;
	private String servico;
	private String item;
	private String atualizacao;
	private String exclusao;
	private int linha;
	
	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
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
	public String getExclusao() {
		return exclusao;
	}
	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}

}
