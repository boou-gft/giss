package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.math.BigDecimal;

public class OcorrenciaDependenciaApuracaoMensalSaidaDTO implements Comparable<OcorrenciaDependenciaApuracaoMensalSaidaDTO>{

	private Long codigoPessoaJuridica;

    private Integer numeroSequenciaUnidadeOrganizacional;

    private Integer mesAnoApuracao;

    private Integer codigoDependencia;

    private String descricaoDependencia;

    private Integer codPa;
    
    private String descPa;

    private BigDecimal municipioReceitaValor;

    private BigDecimal geralReceitaValor;
    
    private String codDepPa;
    
    private String descDepPa;
    
    private Long codigoMunicipio;

    private String descMunicipio;
    
    private String codUF;
    
    private String descUF;
    
    private String tragSemTrag;


	public Integer getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(Integer codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}

	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}

	public BigDecimal getGeralReceitaValor() {
		return geralReceitaValor;
	}

	public void setGeralReceitaValor(BigDecimal geralReceitaValor) {
		this.geralReceitaValor = geralReceitaValor;
	}

	public Integer getMesAnoApuracao() {
		return mesAnoApuracao;
	}

	public void setMesAnoApuracao(Integer mesAnoApuracao) {
		this.mesAnoApuracao = mesAnoApuracao;
	}

	public BigDecimal getMunicipioReceitaValor() {
		return municipioReceitaValor;
	}

	public void setMunicipioReceitaValor(BigDecimal municipioReceitaValor) {
		this.municipioReceitaValor = municipioReceitaValor;
	}

	public Integer getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}

	public void setNumeroSequenciaUnidadeOrganizacional(
			Integer numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}

	/**
	 * @return the codPa
	 */
	public Integer getCodPa() {
		return codPa;
	}

	/**
	 * @param codPa the codPa to set
	 */
	public void setCodPa(Integer codPa) {
		this.codPa = codPa;
	}

	/**
	 * @return the descPa
	 */
	public String getDescPa() {
		return descPa;
	}

	/**
	 * @param descPa the descPa to set
	 */
	public void setDescPa(String descPa) {
		this.descPa = descPa;
	}

	/**
	 * @return the codDepPa
	 */
	public String getCodDepPa() {
		return codDepPa;
	}

	/**
	 * @param codDepPa the codDepPa to set
	 */
	public void setCodDepPa(String codDepPa) {
		this.codDepPa = codDepPa;
	}

	/**
	 * @return the descDepPa
	 */
	public String getDescDepPa() {
		return descDepPa;
	}

	/**
	 * @param descDepPa the descDepPa to set
	 */
	public void setDescDepPa(String descDepPa) {
		this.descDepPa = descDepPa;
	}
	
	public int compareTo(OcorrenciaDependenciaApuracaoMensalSaidaDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
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
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public String getTragSemTrag() {
		return tragSemTrag;
	}

	public void setTragSemTrag(String tragSemTrag) {
		this.tragSemTrag = tragSemTrag;
	}

}
