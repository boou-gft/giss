package br.com.bradesco.web.giss.service.business.resultmunnovo.bean;

public class ResultAgenciaMunicipiosNovosDTO {
	private int linha;
	private String agencia;
	private String nome;
	private Long codigoPessoaJuridica;
	private Integer numeroSequenciaDependencia;
	
	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public Integer getNumeroSequenciaDependencia() {
		return numeroSequenciaDependencia;
	}
	public void setNumeroSequenciaDependencia(Integer numeroSequenciaDependencia) {
		this.numeroSequenciaDependencia = numeroSequenciaDependencia;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
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
