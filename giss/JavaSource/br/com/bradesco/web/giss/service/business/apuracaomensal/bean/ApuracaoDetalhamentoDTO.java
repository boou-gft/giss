package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.util.List;


public class ApuracaoDetalhamentoDTO {
	
	private String enderecoImagem;
	private List<ApuracaoDetalhamentoDependencia> lstDetalDependencias;
	private List<ApuracaoDetalhamentoDTO> subRelatorio;
	
	public String getEnderecoImagem() {
		return enderecoImagem;
	}
	public void setEnderecoImagem(String enderecoImagem) {
		this.enderecoImagem = enderecoImagem;
	}
	public List<ApuracaoDetalhamentoDependencia> getLstDetalDependencias() {
		return lstDetalDependencias;
	}
	public void setLstDetalDependencias(
			List<ApuracaoDetalhamentoDependencia> lstDetalDependencias) {
		this.lstDetalDependencias = lstDetalDependencias;
	}
	public List<ApuracaoDetalhamentoDTO> getSubRelatorio() {
		return subRelatorio;
	}
	public void setSubRelatorio(List<ApuracaoDetalhamentoDTO> subRelatorio) {
		this.subRelatorio = subRelatorio;
	}
	
}
