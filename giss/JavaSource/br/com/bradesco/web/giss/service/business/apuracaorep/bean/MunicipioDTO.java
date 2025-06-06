package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

public class MunicipioDTO {
	private String nome;
	private String codigo;
	private int linha;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}