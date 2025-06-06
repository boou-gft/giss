package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConsultarApuracaoReprocessamentoResultadoTotalDTO {

	private BigDecimal receitaTotalMunicipio;

	private BigDecimal issTotalMunicipio;

	private BigDecimal receitaTotalGeral;

	private BigDecimal issTotalGeral;
	
	private Long codMunicipio;
	
	private String descMunicipio;
	
	private String codUF;
	
	private String descUF;
	
	private List<ConsultarApuracaoReprocessamentoResultadoDTO> listaApuracaoReprocessamento = new ArrayList<ConsultarApuracaoReprocessamentoResultadoDTO>();

	public BigDecimal getIssTotalGeral() {
		return issTotalGeral;
	}

	public void setIssTotalGeral(BigDecimal issTotalGeral) {
		this.issTotalGeral = issTotalGeral;
	}

	public BigDecimal getIssTotalMunicipio() {
		return issTotalMunicipio;
	}

	public void setIssTotalMunicipio(BigDecimal issTotalMunicipio) {
		this.issTotalMunicipio = issTotalMunicipio;
	}

	public BigDecimal getReceitaTotalGeral() {
		return receitaTotalGeral;
	}

	public void setReceitaTotalGeral(BigDecimal receitaTotalGeral) {
		this.receitaTotalGeral = receitaTotalGeral;
	}

	public BigDecimal getReceitaTotalMunicipio() {
		return receitaTotalMunicipio;
	}

	public void setReceitaTotalMunicipio(BigDecimal receitaTotalMunicipio) {
		this.receitaTotalMunicipio = receitaTotalMunicipio;
	}

	public List<ConsultarApuracaoReprocessamentoResultadoDTO> getListaApuracaoReprocessamento() {
		return listaApuracaoReprocessamento;
	}

	public void setListaApuracaoReprocessamento(
			List<ConsultarApuracaoReprocessamentoResultadoDTO> listaApuracaoReprocessamento) {
		this.listaApuracaoReprocessamento = listaApuracaoReprocessamento;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public String getCodUF() {
		return codUF;
	}

	public void setCodUF(String codUF) {
		this.codUF = codUF;
	}

	public String getDescUF() {
		return descUF;
	}

	public void setDescUF(String descUF) {
		this.descUF = descUF;
	}

}
