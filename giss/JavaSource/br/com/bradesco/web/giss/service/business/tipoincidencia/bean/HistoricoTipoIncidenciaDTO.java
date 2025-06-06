package br.com.bradesco.web.giss.service.business.tipoincidencia.bean;


public class HistoricoTipoIncidenciaDTO {
	
	private String codigo;
	private String descricao;
	private String atualizacao;
	private String exclusao;
	private String hrManutencaoRegistro;
	private String alteracao;
	private String codigoFuncional;
	
	public String getCodigoFuncional() {
		return codigoFuncional;
	}
	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	private int linha;
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
	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}
	public String getExclusao() {
		return exclusao;
	}
	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}
	public String getHrManutencaoRegistro() {
		return hrManutencaoRegistro;
	}
	public void setHrManutencaoRegistro(String hrManutencaoRegistro) {
		this.hrManutencaoRegistro = hrManutencaoRegistro;
	}
	public String getAlteracao() {
		return alteracao;
	}
	public void setAlteracao(String alteracao) {
		this.alteracao = alteracao;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
		


}
