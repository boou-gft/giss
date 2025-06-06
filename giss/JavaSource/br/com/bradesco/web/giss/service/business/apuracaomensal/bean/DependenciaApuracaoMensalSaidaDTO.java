package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DependenciaApuracaoMensalSaidaDTO {

	private String codMensagem;

    private String mensagem;

    private BigDecimal totalMunucipioReceitaValor;

    private BigDecimal totalMunucipioRecolherValor;

    private BigDecimal totalGeralReceitaValor;

    private BigDecimal totalGeralRecolherValor;

    private Integer numeroConsultas;
    
    private Long codigoMunicipio;

    private String descMunicipio;
    
    private String codUF;
    
    private String descUF;
    
    private Long qtdeAgencia;
    private BigDecimal totalAgenciaRecolherValor;
    private BigDecimal totalAgenciaReceitaValor;
    private Long qtdePa;
    private BigDecimal totalPaRecolherValor;
    private BigDecimal totalPaReceitaValor;

    private List<OcorrenciaDependenciaApuracaoMensalSaidaDTO> apuracoes = new ArrayList<OcorrenciaDependenciaApuracaoMensalSaidaDTO>();

    public Integer getTamanhoApuracoes(){
    	return apuracoes.size();
    }
    
	public List<OcorrenciaDependenciaApuracaoMensalSaidaDTO> getApuracoes() {
		return apuracoes;
	}

	public void setApuracoes(
			List<OcorrenciaDependenciaApuracaoMensalSaidaDTO> apuracoes) {
		this.apuracoes = apuracoes;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Integer getNumeroConsultas() {
		return numeroConsultas;
	}

	public void setNumeroConsultas(Integer numeroConsultas) {
		this.numeroConsultas = numeroConsultas;
	}

	public BigDecimal getTotalGeralReceitaValor() {
		return totalGeralReceitaValor;
	}

	public void setTotalGeralReceitaValor(BigDecimal totalGeralReceitaValor) {
		this.totalGeralReceitaValor = totalGeralReceitaValor;
	}

	public BigDecimal getTotalGeralRecolherValor() {
		return totalGeralRecolherValor;
	}

	public void setTotalGeralRecolherValor(BigDecimal totalGeralRecolherValor) {
		this.totalGeralRecolherValor = totalGeralRecolherValor;
	}

	public BigDecimal getTotalMunucipioReceitaValor() {
		return totalMunucipioReceitaValor;
	}

	public void setTotalMunucipioReceitaValor(BigDecimal totalMunucipioReceitaValor) {
		this.totalMunucipioReceitaValor = totalMunucipioReceitaValor;
	}

	public BigDecimal getTotalMunucipioRecolherValor() {
		return totalMunucipioRecolherValor;
	}

	public void setTotalMunucipioRecolherValor(
			BigDecimal totalMunucipioRecolherValor) {
		this.totalMunucipioRecolherValor = totalMunucipioRecolherValor;
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

	public Long getCodigoMunicipio() {
		return codigoMunicipio != null ? codigoMunicipio : 0L;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDescMunicipio() {
		return descMunicipio != null ? descMunicipio : "";
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	/**
	 * @return the qtdeAgencia
	 */
	public Long getQtdeAgencia() {
		return qtdeAgencia;
	}

	/**
	 * @param qtdeAgencia the qtdeAgencia to set
	 */
	public void setQtdeAgencia(Long qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}

	/**
	 * @return the totalAgenciaRecolherValor
	 */
	public BigDecimal getTotalAgenciaRecolherValor() {
		return totalAgenciaRecolherValor;
	}

	/**
	 * @param totalAgenciaRecolherValor the totalAgenciaRecolherValor to set
	 */
	public void setTotalAgenciaRecolherValor(BigDecimal totalAgenciaRecolherValor) {
		this.totalAgenciaRecolherValor = totalAgenciaRecolherValor;
	}

	/**
	 * @return the totalAgenciaReceitaValor
	 */
	public BigDecimal getTotalAgenciaReceitaValor() {
		return totalAgenciaReceitaValor;
	}

	/**
	 * @param totalAgenciaReceitaValor the totalAgenciaReceitaValor to set
	 */
	public void setTotalAgenciaReceitaValor(BigDecimal totalAgenciaReceitaValor) {
		this.totalAgenciaReceitaValor = totalAgenciaReceitaValor;
	}

	/**
	 * @return the qtdePa
	 */
	public Long getQtdePa() {
		return qtdePa;
	}

	/**
	 * @param qtdePa the qtdePa to set
	 */
	public void setQtdePa(Long qtdePa) {
		this.qtdePa = qtdePa;
	}

	/**
	 * @return the totalPaRecolherValor
	 */
	public BigDecimal getTotalPaRecolherValor() {
		return totalPaRecolherValor;
	}

	/**
	 * @param totalPaRecolherValor the totalPaRecolherValor to set
	 */
	public void setTotalPaRecolherValor(BigDecimal totalPaRecolherValor) {
		this.totalPaRecolherValor = totalPaRecolherValor;
	}

	/**
	 * @return the totalPaReceitaValor
	 */
	public BigDecimal getTotalPaReceitaValor() {
		return totalPaReceitaValor;
	}

	/**
	 * @param totalPaReceitaValor the totalPaReceitaValor to set
	 */
	public void setTotalPaReceitaValor(BigDecimal totalPaReceitaValor) {
		this.totalPaReceitaValor = totalPaReceitaValor;
	}

	

}
