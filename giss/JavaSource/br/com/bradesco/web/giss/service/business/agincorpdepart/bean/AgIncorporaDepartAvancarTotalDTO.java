package br.com.bradesco.web.giss.service.business.agincorpdepart.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AgIncorporaDepartAvancarTotalDTO {
	private BigDecimal totalSaldo;
	private BigDecimal totalIss;
	private List<AgIncorpDepartAvancarDTO> listaAgIncorpDepartAvancarDTO = new ArrayList<AgIncorpDepartAvancarDTO>();
	
	public BigDecimal getTotalIss() {
		return totalIss;
	}
	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}
	
	
	public BigDecimal getTotalSaldo() {
		return totalSaldo;
	}
	public void setTotalSaldo(BigDecimal totalSaldo) {
		this.totalSaldo = totalSaldo;
	}
	
	
	public List<AgIncorpDepartAvancarDTO> getListaAgIncorpDepartAvancarDTO() {
		return listaAgIncorpDepartAvancarDTO;
	}
	public void setListaAgIncorpDepartAvancarDTO(
			List<AgIncorpDepartAvancarDTO> listaAgIncorpDepartAvancarDTO) {
		this.listaAgIncorpDepartAvancarDTO = listaAgIncorpDepartAvancarDTO;
	}
	
	
	
	
}
