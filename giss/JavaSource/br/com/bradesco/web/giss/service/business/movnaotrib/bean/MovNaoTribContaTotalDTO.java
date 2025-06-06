package br.com.bradesco.web.giss.service.business.movnaotrib.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MovNaoTribContaTotalDTO {
	private List<MovNaoTribContaDTO> listaMovNaoTribContaDTO = new ArrayList<MovNaoTribContaDTO>();
	private BigDecimal baseCalculo;
	private BigDecimal aliquotaPadrao;
	private String tipoIncidencia;
	
	private BigDecimal totalMovimento;
	private BigDecimal totalReceita;
	
	
	
	
	
	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}
	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}
	public BigDecimal getAliquotaPadrao() {
		return aliquotaPadrao;
	}
	public void setAliquotaPadrao(BigDecimal aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}
	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}
	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}
	public List<MovNaoTribContaDTO> getListaMovNaoTribContaDTO() {
		return listaMovNaoTribContaDTO;
	}
	public void setListaMovNaoTribContaDTO(
			List<MovNaoTribContaDTO> listaMovNaoTribContaDTO) {
		this.listaMovNaoTribContaDTO = listaMovNaoTribContaDTO;
	}
	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}
	
	
	
	
}
