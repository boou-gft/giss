package br.com.bradesco.web.giss.service.business.movnaotrib.bean;

public class MovNaoTribDTO {

	private String codigo;
	private String nome;
	private int linha;

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
