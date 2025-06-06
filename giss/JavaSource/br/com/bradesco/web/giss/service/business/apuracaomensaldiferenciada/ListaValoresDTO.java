package br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada;

import java.math.BigDecimal;

public class ListaValoresDTO {
	private String faixaInicialSinal;
	private BigDecimal faixaInicialValor;
	private String faixaFinalSinal;
	private BigDecimal faixaFinalValor;
	private BigDecimal aliquotaFaixa;
	private String redutorSinal;
	private BigDecimal redutorValor;
	private String flagFaixaDiferencial;
	
	public String getFaixaInicialSinal() {
		return faixaInicialSinal;
	}
	public void setFaixaInicialSinal(String faixaInicialSinal) {
		this.faixaInicialSinal = faixaInicialSinal;
	}
	public BigDecimal getFaixaInicialValor() {
		return faixaInicialValor;
	}
	public void setFaixaInicialValor(BigDecimal faixaInicialValor) {
		this.faixaInicialValor = faixaInicialValor;
	}
	public BigDecimal getAliquotaFaixa() {
		return aliquotaFaixa;
	}
	public void setAliquotaFaixa(BigDecimal aliquotaFaixa) {
		this.aliquotaFaixa = aliquotaFaixa;
	}
	public String getFaixaFinalSinal() {
		return faixaFinalSinal;
	}
	public void setFaixaFinalSinal(String faixaFinalSinal) {
		this.faixaFinalSinal = faixaFinalSinal;
	}
	public BigDecimal getFaixaFinalValor() {
		return faixaFinalValor;
	}
	public void setFaixaFinalValor(BigDecimal faixaFinalValor) {
		this.faixaFinalValor = faixaFinalValor;
	}
	public String getFlagFaixaDiferencial() {
		return flagFaixaDiferencial;
	}
	public void setFlagFaixaDiferencial(String flagFaixaDiferencial) {
		this.flagFaixaDiferencial = flagFaixaDiferencial;
	}
	public String getRedutorSinal() {
		return redutorSinal;
	}
	public void setRedutorSinal(String redutorSinal) {
		this.redutorSinal = redutorSinal;
	}
	public BigDecimal getRedutorValor() {
		return redutorValor;
	}
	public void setRedutorValor(BigDecimal redutorValor) {
		this.redutorValor = redutorValor;
	}
	
	
}
