package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarEstadosBalancetesSaidaDTO {
	
	private Integer codUf;
	private String siglaUf;
	private String descUf;

	public ListarEstadosBalancetesSaidaDTO() {
	
	}
	
	public ListarEstadosBalancetesSaidaDTO(Integer codUf, String siglaUf, String descUf) {
		this.setCodUf(codUf);
		this.setSiglaUf(siglaUf);
		this.setDescUf(descUf);
	}

	public Integer getCodUf() {
		return codUf;
	}

	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getDescUf() {
		return descUf;
	}

	public void setDescUf(String descUf) {
		this.descUf = descUf;
	}
}