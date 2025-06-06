package br.com.bradesco.web.giss.view.bean.model.controlerecolhimento;

public class DependenciasBean {
	
	private String dependencia;
	private String descricao;
	private String vencimento;
	private String saldo;
	private String situacao;
	private String email;
		
	public DependenciasBean() {
	
	}
	
	public DependenciasBean(String dependencia, String descricao, String vencimento, String saldo, String situacao, String email) {
		this.setDependencia(dependencia);
		this.setDescricao(descricao);
		this.setVencimento(vencimento);
		this.setSaldo(saldo);
		this.setSituacao(situacao);
		this.setEmail(email);
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
