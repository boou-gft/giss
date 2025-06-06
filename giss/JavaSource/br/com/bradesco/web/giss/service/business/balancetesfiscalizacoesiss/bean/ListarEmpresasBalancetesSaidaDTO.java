package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarEmpresasBalancetesSaidaDTO {
	
	private Long codEmpresa;
	private String descEmpresa;

	public ListarEmpresasBalancetesSaidaDTO() {
	
	}
	
	public ListarEmpresasBalancetesSaidaDTO(Long codEmpresa, String descEmpresa) {
		this.setCodEmpresa(codEmpresa);
		this.setDescEmpresa(descEmpresa);
	}

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getDescEmpresa() {
		return descEmpresa;
	}

	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}
}