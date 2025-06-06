package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.math.BigDecimal;
import java.util.List;

public class ApuracaoMensalTotalizadaSaidaDTO {

	private BigDecimal percentualBaseCalculoTributo;
    private BigDecimal percentualAliquotaPadraoMunicipio;
    private String tipoIncidencia;
    private Integer numeroConsultas;
    private BigDecimal totalReceita;
    private BigDecimal totalReceitaTributo;
    private BigDecimal totalTributoApuracao;
    
    private List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> listaApuracaoMensalTotalizada;
	
    public List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> getListaApuracaoMensalTotalizada() {
		return listaApuracaoMensalTotalizada;
	}

	public void setListaApuracaoMensalTotalizada(
			List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> listaApuracaoMensalTotalizada) {
		this.listaApuracaoMensalTotalizada = listaApuracaoMensalTotalizada;
	}

	public ApuracaoMensalTotalizadaSaidaDTO() {
		super();
	}
	
    public Integer getNumeroConsultas() {
		return numeroConsultas;
	}
	public void setNumeroConsultas(Integer numeroConsultas) {
		this.numeroConsultas = numeroConsultas;
	}
	public BigDecimal getPercentualAliquotaPadraoMunicipio() {
		return percentualAliquotaPadraoMunicipio;
	}
	public void setPercentualAliquotaPadraoMunicipio(
			BigDecimal percentualAliquotaPadraoMunicipio) {
		this.percentualAliquotaPadraoMunicipio = percentualAliquotaPadraoMunicipio;
	}
	public BigDecimal getPercentualBaseCalculoTributo() {
		return percentualBaseCalculoTributo;
	}
	public void setPercentualBaseCalculoTributo(
			BigDecimal percentualBaseCalculoTributo) {
		this.percentualBaseCalculoTributo = percentualBaseCalculoTributo;
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

	public BigDecimal getTotalReceitaTributo() {
		return totalReceitaTributo;
	}

	public void setTotalReceitaTributo(BigDecimal totalReceitaTributo) {
		this.totalReceitaTributo = totalReceitaTributo;
	}

	public BigDecimal getTotalTributoApuracao() {
		return totalTributoApuracao;
	}

	public void setTotalTributoApuracao(BigDecimal totalTributoApuracao) {
		this.totalTributoApuracao = totalTributoApuracao;
	}
    
}
    
