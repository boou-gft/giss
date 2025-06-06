package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

import java.util.ArrayList;
import java.util.List;

public class SolicitaReprocessamentoEntradaDTO {

	private String indicadorSelecaoTodasDependencias;

    private String dataInicialPeriodoReprocessamento;

    private String dataFinalPeriodoReprocessamento;
    
    private Integer codEstado;

    private Long codigoContaContabil;

    private double percentualAliquota;

    private Integer numeroConsultas;
    
    private List<SolicitaOcorrenciaReprocessamentoDTO> ocorrencias = new ArrayList<SolicitaOcorrenciaReprocessamentoDTO>();

	public Long getCodigoContaContabil() {
		return codigoContaContabil;
	}

	public void setCodigoContaContabil(Long codigoContaContabil) {
		this.codigoContaContabil = codigoContaContabil;
	}

	public String getDataFinalPeriodoReprocessamento() {
		return dataFinalPeriodoReprocessamento;
	}

	public void setDataFinalPeriodoReprocessamento(
			String dataFinalPeriodoReprocessamento) {
		this.dataFinalPeriodoReprocessamento = dataFinalPeriodoReprocessamento;
	}

	public String getDataInicialPeriodoReprocessamento() {
		return dataInicialPeriodoReprocessamento;
	}

	public void setDataInicialPeriodoReprocessamento(
			String dataInicialPeriodoReprocessamento) {
		this.dataInicialPeriodoReprocessamento = dataInicialPeriodoReprocessamento;
	}

	public String getIndicadorSelecaoTodasDependencias() {
		return indicadorSelecaoTodasDependencias;
	}

	public void setIndicadorSelecaoTodasDependencias(
			String indicadorSelecaoTodasDependencias) {
		this.indicadorSelecaoTodasDependencias = indicadorSelecaoTodasDependencias;
	}

	public Integer getNumeroConsultas() {
		return numeroConsultas;
	}

	public void setNumeroConsultas(Integer numeroConsultas) {
		this.numeroConsultas = numeroConsultas;
	}

	public double getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(double percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}

	public List<SolicitaOcorrenciaReprocessamentoDTO> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(
			List<SolicitaOcorrenciaReprocessamentoDTO> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public boolean addOcorrencia(SolicitaOcorrenciaReprocessamentoDTO o) {
		return ocorrencias.add(o);
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

    
}
