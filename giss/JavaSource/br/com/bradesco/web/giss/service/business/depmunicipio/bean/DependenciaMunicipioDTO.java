package br.com.bradesco.web.giss.service.business.depmunicipio.bean;

import java.util.List;

public class DependenciaMunicipioDTO implements Comparable<DependenciaMunicipioDTO>{
	
	private String codigoPessoaJuridica;
	private String numeroSequenciaDependencia;
	private String situacaoDependencia;
	private String codigoDependencia;
	private String descricaoDependencia;
	private String dataAtualizacao;
	private int qtdeDependenciasAtivas;
	private int qtdeDependenciasEncerradas;
	private List<DependenciaMunicipioDTO> lstMunicipios;

	public String getCodigoDependencia() {
		return codigoDependencia;
	}
	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}
	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}
	public String getNumeroSequenciaDependencia() {
		return numeroSequenciaDependencia;
	}
	public void setNumeroSequenciaDependencia(String numeroSequenciaDependencia) {
		this.numeroSequenciaDependencia = numeroSequenciaDependencia;
	}
	public String getSituacaoDependencia() {
		return situacaoDependencia;
	}
	public void setSituacaoDependencia(String situacaoDependencia) {
		this.situacaoDependencia = situacaoDependencia;
	}
	public int getQtdeDependenciasAtivas() {
		return qtdeDependenciasAtivas;
	}
	public void setQtdeDependenciasAtivas(int qtdeDependenciasAtivas) {
		this.qtdeDependenciasAtivas = qtdeDependenciasAtivas;
	}
	public int getQtdeDependenciasEncerradas() {
		return qtdeDependenciasEncerradas;
	}
	public void setQtdeDependenciasEncerradas(int qtdeDependenciasEncerradas) {
		this.qtdeDependenciasEncerradas = qtdeDependenciasEncerradas;
	}
	public List<DependenciaMunicipioDTO> getLstMunicipios() {
		return lstMunicipios;
	}
	public void setLstMunicipios(List<DependenciaMunicipioDTO> lstMunicipios) {
		this.lstMunicipios = lstMunicipios;
	}
	
	public int compareTo(DependenciaMunicipioDTO m) {
		return this.getCodigoDependencia().compareTo(m.getCodigoDependencia());
	}

}
