package br.com.bradesco.web.giss.service.business.valormestotal.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemonstrativoISSTotalDTO {
	private BigDecimal totalReceita;
	private BigDecimal totalIss;
	private List<DemonstrativoISSDTO> listaDemonstrativoISSDTO = new ArrayList<DemonstrativoISSDTO>();
	private DemonstrativoISSTotalDTO demonstrativo;
	
	public List<DemonstrativoISSDTO> getListaDemonstrativoISSDTO() {
		return listaDemonstrativoISSDTO;
	}
	public void setListaDemonstrativoISSDTO(
			List<DemonstrativoISSDTO> listaDemonstrativoISSDTO) {
		this.listaDemonstrativoISSDTO = listaDemonstrativoISSDTO;
	}
	
	public BigDecimal getTotalIss() {
		return totalIss;
	}
	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}
	
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}
	public DemonstrativoISSTotalDTO getDemonstrativo() {
		return demonstrativo;
	}
	public void setDemonstrativo(DemonstrativoISSTotalDTO demonstrativo) {
		this.demonstrativo = demonstrativo;
	}

}
