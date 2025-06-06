package br.com.bradesco.web.giss.service.business.tiposervico.bean;


public class HistoricoTipoServicoDTO {
	
	private String tipo;
	private String descricao;
	private String atualizacao;
	private String exclusao;
	private String alteracao;
	private String codigoFuncional;
		
	public String getCodigoFuncional() {
		return codigoFuncional;
	}
	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getExclusao() {
		return exclusao;
	}
	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAlteracao() {
		return alteracao;
	}
	public void setAlteracao(String alteracao) {
		this.alteracao = alteracao;
	}
	
	
}
