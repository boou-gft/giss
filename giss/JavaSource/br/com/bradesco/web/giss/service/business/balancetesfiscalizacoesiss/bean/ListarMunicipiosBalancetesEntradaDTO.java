package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarMunicipiosBalancetesEntradaDTO {
	
	private Integer qtdeMaxOcorrencias;
	private Integer codUf;

	public ListarMunicipiosBalancetesEntradaDTO() {
	
	}
	
	public ListarMunicipiosBalancetesEntradaDTO(Integer qtdeMaxOcorrencias, Integer codUf) {
		this.setQtdeMaxOcorrencias(qtdeMaxOcorrencias);
	}

	public Integer getQtdeMaxOcorrencias() {
		return qtdeMaxOcorrencias;
	}

	public void setQtdeMaxOcorrencias(Integer qtdeMaxOcorrencias) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
	}

	public Integer getCodUf() {
		return codUf;
	}

	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}
}