package br.com.bradesco.web.giss.view.bean.model.municipio;

public class EstadosComboBean {
	
	private String codigo;
	private String sigla;
	private String nome;
	
	public EstadosComboBean() {
	
	}
	
	public EstadosComboBean(String codigo, String sigla, String nome) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
		
}
