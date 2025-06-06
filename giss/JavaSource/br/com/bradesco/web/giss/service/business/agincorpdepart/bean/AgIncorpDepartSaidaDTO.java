package br.com.bradesco.web.giss.service.business.agincorpdepart.bean;

import java.math.BigDecimal;

public class AgIncorpDepartSaidaDTO {
    private Integer numeroSequencialUnidadeOrganizacional;
    private Integer mesAnoCompetencia;
    private Long codigoPessoaJuridica;
    private Integer codigoDependencia;
    private String descricaoDependencia;
    private String sinalReceita;
    private BigDecimal valorReceita;
    private String sinalISSRecolher;
    private BigDecimal valorISSRecolher;
    private int linha;
    
	public AgIncorpDepartSaidaDTO() {
		super();
	}
	
	public Integer getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(Integer codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}
	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}
	public Integer getMesAnoCompetencia() {
		return mesAnoCompetencia;
	}
	public void setMesAnoCompetencia(Integer mesAnoCompetencia) {
		this.mesAnoCompetencia = mesAnoCompetencia;
	}
	public Integer getNumeroSequencialUnidadeOrganizacional() {
		return numeroSequencialUnidadeOrganizacional;
	}
	public void setNumeroSequencialUnidadeOrganizacional(
			Integer numeroSequencialUnidadeOrganizacional) {
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
	}
	public String getSinalISSRecolher() {
		return sinalISSRecolher;
	}
	public void setSinalISSRecolher(String sinalISSRecolher) {
		this.sinalISSRecolher = sinalISSRecolher;
	}
	public String getSinalReceita() {
		return sinalReceita;
	}
	public void setSinalReceita(String sinalReceita) {
		this.sinalReceita = sinalReceita;
	}
	
	
	public BigDecimal getValorISSRecolher() {
		return valorISSRecolher;
	}

	public void setValorISSRecolher(BigDecimal valorISSRecolher) {
		this.valorISSRecolher = valorISSRecolher;
	}

	public BigDecimal getValorReceita() {
		return valorReceita;
	}

	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}

	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	
	
	
}
