package br.com.bradesco.web.giss.service.business.tipoincidencia.bean;

import java.math.BigDecimal;

public class TipoIncidenciaFaixasDTO {
	
	private BigDecimal valorinicial;
	private BigDecimal valorfinal;
	private BigDecimal valoraliquota;
	private BigDecimal valorRedutor;
	private int numsequencial;
	
	public BigDecimal getValoraliquota() {
		return valoraliquota;
	}
	public void setValoraliquota(BigDecimal valoraliquota) {
		this.valoraliquota = valoraliquota;
	}
	public BigDecimal getValorfinal() {
		return valorfinal;
	}
	public void setValorfinal(BigDecimal valorfinal) {
		this.valorfinal = valorfinal;
	}
	public BigDecimal getValorinicial() {
		return valorinicial;
	}
	public void setValorinicial(BigDecimal valorinicial) {
		this.valorinicial = valorinicial;
	}
	public BigDecimal getValorRedutor() {
		return valorRedutor;
	}
	public void setValorRedutor(BigDecimal valorRedutor) {
		this.valorRedutor = valorRedutor;
	}
	public int getNumsequencial() {
		return numsequencial;
	}
	public void setNumsequencial(int numsequencial) {
		this.numsequencial = numsequencial;
	}
		
}
