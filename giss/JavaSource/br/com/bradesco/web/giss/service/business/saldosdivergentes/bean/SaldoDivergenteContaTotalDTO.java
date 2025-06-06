package br.com.bradesco.web.giss.service.business.saldosdivergentes.bean;

import java.math.BigDecimal;
import java.util.List;

public class SaldoDivergenteContaTotalDTO {
	private BigDecimal totalApuracao;
	private BigDecimal totalContabil;
	private List<SaldoDivergenteContaDTO> listaSaldoDivergenteContaDTO;
	
	
	
	public List<SaldoDivergenteContaDTO> getListaSaldoDivergenteContaDTO() {
		return listaSaldoDivergenteContaDTO;
	}
	public void setListaSaldoDivergenteContaDTO(
			List<SaldoDivergenteContaDTO> listaSaldoDivergenteContaDTO) {
		this.listaSaldoDivergenteContaDTO = listaSaldoDivergenteContaDTO;
	}
	public BigDecimal getTotalApuracao() {
		return totalApuracao;
	}
	public void setTotalApuracao(BigDecimal totalApuracao) {
		this.totalApuracao = totalApuracao;
	}
	public BigDecimal getTotalContabil() {
		return totalContabil;
	}
	public void setTotalContabil(BigDecimal totalContabil) {
		this.totalContabil = totalContabil;
	}
	
	
	
}
