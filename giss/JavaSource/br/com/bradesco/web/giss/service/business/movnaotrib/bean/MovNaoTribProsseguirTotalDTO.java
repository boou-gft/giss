package br.com.bradesco.web.giss.service.business.movnaotrib.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MovNaoTribProsseguirTotalDTO {
	private List<MovNaoTribProsseguirDTO> listaMovNaoTribProsseguirDTO = new ArrayList<MovNaoTribProsseguirDTO>();
	private BigDecimal receitaTotalGeral;
	private BigDecimal receitaTotalMunicipio;
	private BigDecimal movimentoTotalGeral;
	private BigDecimal movimentoTotalMunicipio;
	private BigDecimal valorApuracaoTotalAg;
	private BigDecimal valorApuracaoTotalPa;
	private Integer codMunicipio;
	private String descMunicipio;
	private Long codUF;
	private String descUF;
	
	
	public List<MovNaoTribProsseguirDTO> getListaMovNaoTribProsseguirDTO() {
		return listaMovNaoTribProsseguirDTO;
	}
	public void setListaMovNaoTribProsseguirDTO(
			List<MovNaoTribProsseguirDTO> listaMovNaoTribProsseguirDTO) {
		this.listaMovNaoTribProsseguirDTO = listaMovNaoTribProsseguirDTO;
	}
	
	
	public BigDecimal getMovimentoTotalGeral() {
		return movimentoTotalGeral;
	}
	public void setMovimentoTotalGeral(BigDecimal movimentoTotalGeral) {
		this.movimentoTotalGeral = movimentoTotalGeral;
	}
	
	
	public BigDecimal getMovimentoTotalMunicipio() {
		return movimentoTotalMunicipio;
	}
	public void setMovimentoTotalMunicipio(BigDecimal movimentoTotalMunicipio) {
		this.movimentoTotalMunicipio = movimentoTotalMunicipio;
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
	public Integer getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Integer codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getDescMunicipio() {
		return descMunicipio;
	}
	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}
	public Long getCodUF() {
		return codUF;
	}
	public void setCodUF(Long codUF) {
		this.codUF = codUF;
	}
	public String getDescUF() {
		return descUF;
	}
	public void setDescUF(String descUF) {
		this.descUF = descUF;
	}
	/**
	 * @return the valorApuracaoTotalAg
	 */
	public BigDecimal getValorApuracaoTotalAg() {
		return valorApuracaoTotalAg;
	}
	/**
	 * @param valorApuracaoTotalAg the valorApuracaoTotalAg to set
	 */
	public void setValorApuracaoTotalAg(BigDecimal valorApuracaoTotalAg) {
		this.valorApuracaoTotalAg = valorApuracaoTotalAg;
	}
	/**
	 * @return the valorApuracaoTotalPa
	 */
	public BigDecimal getValorApuracaoTotalPa() {
		return valorApuracaoTotalPa;
	}
	/**
	 * @param valorApuracaoTotalPa the valorApuracaoTotalPa to set
	 */
	public void setValorApuracaoTotalPa(BigDecimal valorApuracaoTotalPa) {
		this.valorApuracaoTotalPa = valorApuracaoTotalPa;
	}
	

}
