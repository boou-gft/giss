package br.com.bradesco.web.giss.service.business.percentualTransicao.bean;

import java.util.Date;

public class PercentualTransicaoDTO {

	private int numeroRegistro;
	private Date dataInicioVigencia;
	private Date dataFimVigencia;
	private String percentualMunicipioPrestador;
	private String percentualMunicipioTomador;
	private String usuario;
	private Date dataAlteracao;
	private int indicadorAprovacao;
	
	
	public PercentualTransicaoDTO() {
		super();
	}
	
	
	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}
	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}
	public Date getDataFimVigencia() {
		return dataFimVigencia;
	}
	public void setDataFimVigencia(Date dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}
	public String getPercentualMunicipioPrestador() {
		return percentualMunicipioPrestador;
	}
	public void setPercentualMunicipioPrestador(String percentualMunicipioPrestador) {
		this.percentualMunicipioPrestador = percentualMunicipioPrestador;
	}
	public String getPercentualMunicipioTomador() {
		return percentualMunicipioTomador;
	}
	public void setPercentualMunicipioTomador(String percentualMunicipioTomador) {
		this.percentualMunicipioTomador = percentualMunicipioTomador;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public int getIndicadorAprovacao() {
		return indicadorAprovacao;
	}

	public void setIndicadorAprovacao(int indicadorAprovacao) {
		this.indicadorAprovacao = indicadorAprovacao;
	}
}
