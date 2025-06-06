package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarEstadosBalancetesEntradaDTO {
	
	private Integer qtdeMaxOcorrencias;

	public ListarEstadosBalancetesEntradaDTO() {
	
	}
	
	public ListarEstadosBalancetesEntradaDTO(Integer qtdeMaxOcorrencias) {
		this.setQtdeMaxOcorrencias(qtdeMaxOcorrencias);
	}

	public Integer getQtdeMaxOcorrencias() {
		return qtdeMaxOcorrencias;
	}

	public void setQtdeMaxOcorrencias(Integer qtdeMaxOcorrencias) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
	}
}