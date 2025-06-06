package br.com.bradesco.web.giss.service.business.movnaotrib.bean;

import java.math.BigDecimal;

public class MovNaoTribProsseguirDTO implements Comparable<MovNaoTribProsseguirDTO> {
	
	private int dependencia;
	private	String descricao;
	private BigDecimal movimento;
	private BigDecimal receita;
	private long codigoPessoaJuridica;
	private int numeroSequenciaUnidadeOrganizacional;
	private int linha;
	private Integer codPa;
	private	String descPa;
	private String codDepPa;
	private	String descDepPa;
	
	
	public int getDependencia() {
		return dependencia;
	}
	public void setDependencia(int dependencia) {
		this.dependencia = dependencia;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getMovimento() {
		return movimento;
	}
	public void setMovimento(BigDecimal movimento) {
		this.movimento = movimento;
	}
	public BigDecimal getReceita() {
		return receita;
	}
	public void setReceita(BigDecimal receita) {
		this.receita = receita;
	}
	public long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public int getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}
	public void setNumeroSequenciaUnidadeOrganizacional(
			int numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
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
	
	public int compareTo(MovNaoTribProsseguirDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
	}
	
}
