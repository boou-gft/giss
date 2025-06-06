package br.com.bradesco.web.giss.service.business.agincorpdepart.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AgIncorpDepartSaidaTotalDTO {
	private BigDecimal totalReceita;
    private BigDecimal totalISSRecolher;
	private List<AgIncorpDepartSaidaDTO> listaAgIncorpDepartSaida = new ArrayList<AgIncorpDepartSaidaDTO>();
	
	
    
    public List<AgIncorpDepartSaidaDTO> getListaAgIncorpDepartSaida() {
		return listaAgIncorpDepartSaida;
	}
	public void setListaAgIncorpDepartSaida(
			List<AgIncorpDepartSaidaDTO> listaAgIncorpDepartSaida) {
		this.listaAgIncorpDepartSaida = listaAgIncorpDepartSaida;
	}
	public BigDecimal getTotalISSRecolher() {
		return totalISSRecolher;
	}
	public void setTotalISSRecolher(BigDecimal totalISSRecolher) {
		this.totalISSRecolher = totalISSRecolher;
	}
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}
    
    
    
    
}
