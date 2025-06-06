package br.com.bradesco.web.giss.view.bean.model.contacontabil;

public class TipoServicoComboBean {
	
	private String codigo;
	private String descricao;
		
	public TipoServicoComboBean() {
	
	}
	
	public TipoServicoComboBean(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

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
		
}
