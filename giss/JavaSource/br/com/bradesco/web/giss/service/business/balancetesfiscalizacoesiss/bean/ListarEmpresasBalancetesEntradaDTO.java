package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarEmpresasBalancetesEntradaDTO {
	
	private Integer qtdeMaxOcorrencias;
	private Long codEmpresa;

	public ListarEmpresasBalancetesEntradaDTO() {
	
	}
	
	public ListarEmpresasBalancetesEntradaDTO(Integer qtdeMaxOcorrencias, Long codEmpresa) {
		this.setQtdeMaxOcorrencias(qtdeMaxOcorrencias);
		this.setCodEmpresa(codEmpresa);
	}

	public Integer getQtdeMaxOcorrencias() {
		return qtdeMaxOcorrencias;
	}

	public void setQtdeMaxOcorrencias(Integer qtdeMaxOcorrencias) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
	}

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
}