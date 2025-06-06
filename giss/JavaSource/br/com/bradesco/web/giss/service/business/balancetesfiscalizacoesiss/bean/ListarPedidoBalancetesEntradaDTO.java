package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarPedidoBalancetesEntradaDTO {
	
	private Integer qtdeMaxOcorrencias;
	private Integer codTipoBalancete;

	public ListarPedidoBalancetesEntradaDTO() {
	
	}
	
	public ListarPedidoBalancetesEntradaDTO(Integer qtdeMaxOcorrencias, Integer codTipoBalancete) {
		this.setQtdeMaxOcorrencias(qtdeMaxOcorrencias);
		this.setCodTipoBalancete(codTipoBalancete);
	}

	public Integer getQtdeMaxOcorrencias() {
		return qtdeMaxOcorrencias;
	}

	public void setQtdeMaxOcorrencias(Integer qtdeMaxOcorrencias) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
	}

	public Integer getCodTipoBalancete() {
		return codTipoBalancete;
	}

	public void setCodTipoBalancete(Integer codTipoBalancete) {
		this.codTipoBalancete = codTipoBalancete;
	}
}