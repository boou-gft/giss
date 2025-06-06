package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.util.ArrayList;
import java.util.List;

public class PlanApuracaoIssEntradaDTO {
    private String codigoMunicipio;
    private Integer mesApuracaoContabilInicio;
    private Integer anoApuracaoContabilInicio;
    
    private Integer mesApuracaoContabilFim;
    private Integer anoApuracaoContabilFim;
    private Integer numeroSequencial;
    private Long codPessoaJuridica;
    private Integer codigoDependencia;
    private String codDepPa;
    private String filtroConta;
    
    private List<PlanApuracaoIssEntradaDTO> lista = new ArrayList<PlanApuracaoIssEntradaDTO>();

	/**
	 * Obtém o campo codPessoaJuridica
	 * @return codPessoaJuridica Integer 
	 */
	public Long getCodPessoaJuridica() {
		return codPessoaJuridica;
	}

	/**
	 * Define o campo codPessoaJuridica
	 * @param codPessoaJuridica Integer 
	 */
	public void setCodPessoaJuridica(Long codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}

	/**
	 * Obtém o campo numeroSequencial
	 * @return numeroSequencial Integer 
	 */
	public Integer getNumeroSequencial() {
		return numeroSequencial;
	}

	/**
	 * Define o campo numeroSequencial
	 * @param numeroSequencial Integer 
	 */
	public void setNumeroSequencial(Integer numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}

	/**
	 * Obtém o campo codigoMunicipio
	 * @return codigoMunicipio String 
	 */
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	/**
	 * Define o campo codigoMunicipio
	 * @param codigoMunicipio String 
	 */
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getMesApuracaoContabilInicio() {
		return mesApuracaoContabilInicio;
	}

	public void setMesApuracaoContabilInicio(Integer mesApuracaoContabilInicio) {
		this.mesApuracaoContabilInicio = mesApuracaoContabilInicio;
	}

	public Integer getAnoApuracaoContabilInicio() {
		return anoApuracaoContabilInicio;
	}

	public void setAnoApuracaoContabilInicio(Integer anoApuracaoContabilInicio) {
		this.anoApuracaoContabilInicio = anoApuracaoContabilInicio;
	}

	public Integer getMesApuracaoContabilFim() {
		return mesApuracaoContabilFim;
	}

	public void setMesApuracaoContabilFim(Integer mesApuracaoContabilFim) {
		this.mesApuracaoContabilFim = mesApuracaoContabilFim;
	}

	public Integer getAnoApuracaoContabilFim() {
		return anoApuracaoContabilFim;
	}

	public void setAnoApuracaoContabilFim(Integer anoApuracaoContabilFim) {
		this.anoApuracaoContabilFim = anoApuracaoContabilFim;
	}

	public Integer getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(Integer codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
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
	 * @return the filtroConta
	 */
	public String getFiltroConta() {
		return filtroConta;
	}

	/**
	 * @param filtroConta the filtroConta to set
	 */
	public void setFiltroConta(String filtroConta) {
		this.filtroConta = filtroConta;
	}

	/**
	 * @return the lista
	 */
	public List<PlanApuracaoIssEntradaDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<PlanApuracaoIssEntradaDTO> lista) {
		this.lista = lista;
	}

}