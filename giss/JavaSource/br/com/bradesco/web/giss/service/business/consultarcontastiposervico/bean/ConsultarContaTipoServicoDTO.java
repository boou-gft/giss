package br.com.bradesco.web.giss.service.business.consultarcontastiposervico.bean;

public class ConsultarContaTipoServicoDTO {

	public String conta;
	public String descricao;
	public String item;
	public String dataAtualizacao;
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}	
}
