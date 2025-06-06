package br.com.bradesco.web.giss.service.business.depmunicipio.bean;

public class MunicipioDTO {
	private String nome;
	private String codigo;
	private int linha;
	private String UnidadeFederativa;
	
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
	public String getUnidadeFederativa() {
		return UnidadeFederativa;
	}
	public void setUnidadeFederativa(String unidadeFederativa) {
		UnidadeFederativa = unidadeFederativa;
	}

	
	
	
	
}
