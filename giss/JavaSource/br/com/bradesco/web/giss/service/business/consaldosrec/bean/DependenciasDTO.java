package br.com.bradesco.web.giss.service.business.consaldosrec.bean;

public class DependenciasDTO {
	
	private String dependencia;
	private Integer codUnidadeOrg;
	private String descricao;
	private String vencimento;
	private String saldo;
	private String situacao;
	private String email;
	private boolean checkGridSaldoRec;
	private boolean ativaCheckSaldoRec;
	private String dataAtual;
	private String dataProcessamento;
	private int linha;
		
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public DependenciasDTO() {
	
	}
	
	public DependenciasDTO(String dependencia, String descricao, String vencimento, String saldo, String situacao, String email) {
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

	public boolean isCheckGridSaldoRec() {
		return checkGridSaldoRec;
	}

	public void setCheckGridSaldoRec(boolean checkGridSaldoRec) {
		this.checkGridSaldoRec = checkGridSaldoRec;
	}

	public boolean isAtivaCheckSaldoRec() {
		return ativaCheckSaldoRec;
	}

	public void setAtivaCheckSaldoRec(boolean ativaCheckSaldoRec) {
		this.ativaCheckSaldoRec = ativaCheckSaldoRec;
	}

	public String getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(String dataAtual) {
		this.dataAtual = dataAtual;
	}

	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public Integer getCodUnidadeOrg() {
		return codUnidadeOrg;
	}

	public void setCodUnidadeOrg(Integer codUnidadeOrg) {
		this.codUnidadeOrg = codUnidadeOrg;
	}
	
}
