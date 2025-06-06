package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

import java.util.List;

public class ReprocessamentoDependenciaAliquotaDTO {
	
	private double aliquota;
	private List<ReprocessamentoDependenciaProsseguirDTO> listaDependenciaDTO;
	
	
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	
	public List<ReprocessamentoDependenciaProsseguirDTO> getListaDependenciaDTO() {
		return listaDependenciaDTO;
	}
	public void setListaDependenciaDTO(
			List<ReprocessamentoDependenciaProsseguirDTO> listaDependenciaDTO) {
		this.listaDependenciaDTO = listaDependenciaDTO;
	}
	
	
}
