package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class DependenciasNovasDTO {
	
	private String codPessoaJuridica;
	private String codigo;
	private String numUnidOrganiz;
	private String descricao;
	private String municipio;
	private String estado;
	private int numeroRegistro;
		
	
	public String getNumUnidOrganiz() {
		return numUnidOrganiz;
	}
	public void setNumUnidOrganiz(String numUnidOrganiz) {
		this.numUnidOrganiz = numUnidOrganiz;
	}
	public String getCodPessoaJuridica() {
		return codPessoaJuridica;
	}
	public void setCodPessoaJuridica(String codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
