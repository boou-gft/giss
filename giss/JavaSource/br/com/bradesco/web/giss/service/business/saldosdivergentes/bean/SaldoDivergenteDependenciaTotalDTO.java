package br.com.bradesco.web.giss.service.business.saldosdivergentes.bean;

import java.math.BigDecimal;
import java.util.List;

public class SaldoDivergenteDependenciaTotalDTO {
	private BigDecimal totalApuracao;
	private BigDecimal totalContabil;
	private List<SaldoDivergenteDependenciaDTO> listaSaldoDivergenteDependenciaDTO;

	
	
	
	
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

	public List<SaldoDivergenteDependenciaDTO> getListaSaldoDivergenteDependenciaDTO() {
		return listaSaldoDivergenteDependenciaDTO;
	}

	public void setListaSaldoDivergenteDependenciaDTO(
			List<SaldoDivergenteDependenciaDTO> listaSaldoDivergenteDependenciaDTO) {
		this.listaSaldoDivergenteDependenciaDTO = listaSaldoDivergenteDependenciaDTO;
	}
	
	
}
