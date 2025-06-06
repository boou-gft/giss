package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class AgenciaDTO {
	
	private String codigoPessoaJuridica;
	private String codigoDependencia;
	private String numeroSequencialDependencia;
	private String descricaoDependencia;
	private String dataAtualizacao;
	private String agenciaRelacionamento;
	
	//retirar em Municipios
	private String nome;
	private String agencia;
	//---------------------
	
	private int linha;
			
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getCodigoDependencia() {
		return codigoDependencia;
	}
	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getNumeroSequencialDependencia() {
		return numeroSequencialDependencia;
	}
	public void setNumeroSequencialDependencia(String numeroSequencialDependencia) {
		this.numeroSequencialDependencia = numeroSequencialDependencia;
	}
	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}
	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getAgenciaRelacionamento() {
		return agenciaRelacionamento;
	}
	public void setAgenciaRelacionamento(String agenciaRelacionamento) {
		this.agenciaRelacionamento = agenciaRelacionamento;
	}
}
