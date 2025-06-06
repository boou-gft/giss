package br.com.bradesco.web.giss.service.business.tiposervico.bean;



public class TipoServicoDTO {
	
	private String codigo;
	private String descricao;
	private String funcao;
	private String dtAtualizacao;
	private int numeroRegistro;
	private String codMensagem;
	private String mensagem;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(String dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int totalRegistros) {
		this.numeroRegistro = totalRegistros;
	}
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
