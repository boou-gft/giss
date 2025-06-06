package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class GerarBalanceteFiscalizacoesIssDTO {
	
	private List<SelectItem> listarEmpresasBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listarEstadosBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listarMunicipiosBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listarNivelContas = new ArrayList<SelectItem>();
	private Long empresa = 0L;
	private Integer estado;
	private Long codMunicipio;
	private Long municipio;
	private Integer periodoMesInicial;
	private Integer periodoAnoInicial;
	private Integer periodoMesFinal;
	private Integer periodoAnoFinal;
	private Integer dependencia;
	private String fechadoSimulado;
	private boolean consolidado;
	private Integer nivelConta;
	private Integer grupoContaInicial;
	private Integer grupoContaFinal;

	public List<SelectItem> getListarEmpresasBalancetes() {
		return listarEmpresasBalancetes;
	}

	public void setListarEmpresasBalancetes(
			List<SelectItem> listarEmpresasBalancetes) {
		this.listarEmpresasBalancetes = listarEmpresasBalancetes;
	}

	public List<SelectItem> getListarEstadosBalancetes() {
		return listarEstadosBalancetes;
	}

	public void setListarEstadosBalancetes(List<SelectItem> listarEstadosBalancetes) {
		this.listarEstadosBalancetes = listarEstadosBalancetes;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public Long getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}

	public Integer getDependencia() {
		return dependencia;
	}

	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}
	public Integer getNivelConta() {
		return nivelConta;
	}

	public void setNivelConta(Integer nivelConta) {
		this.nivelConta = nivelConta;
	}

	public Integer getGrupoContaInicial() {
		return grupoContaInicial;
	}

	public void setGrupoContaInicial(Integer grupoContaInicial) {
		this.grupoContaInicial = grupoContaInicial;
	}

	public Integer getGrupoContaFinal() {
		return grupoContaFinal;
	}

	public void setGrupoContaFinal(Integer grupoContaFinal) {
		this.grupoContaFinal = grupoContaFinal;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public List<SelectItem> getListarMunicipiosBalancetes() {
		return listarMunicipiosBalancetes;
	}

	public void setListarMunicipiosBalancetes(
			List<SelectItem> listarMunicipiosBalancetes) {
		this.listarMunicipiosBalancetes = listarMunicipiosBalancetes;
	}

	public Integer getPeriodoMesInicial() {
		return periodoMesInicial;
	}

	public void setPeriodoMesInicial(Integer periodoMesInicial) {
		this.periodoMesInicial = periodoMesInicial;
	}

	public Integer getPeriodoAnoInicial() {
		return periodoAnoInicial;
	}

	public void setPeriodoAnoInicial(Integer periodoAnoInicial) {
		this.periodoAnoInicial = periodoAnoInicial;
	}

	public Integer getPeriodoMesFinal() {
		return periodoMesFinal;
	}

	public void setPeriodoMesFinal(Integer periodoMesFinal) {
		this.periodoMesFinal = periodoMesFinal;
	}

	public Integer getPeriodoAnoFinal() {
		return periodoAnoFinal;
	}

	public void setPeriodoAnoFinal(Integer periodoAnoFinal) {
		this.periodoAnoFinal = periodoAnoFinal;
	}

	public String getFechadoSimulado() {
		return fechadoSimulado;
	}

	public void setFechadoSimulado(String fechadoSimulado) {
		this.fechadoSimulado = fechadoSimulado;
	}

	public List<SelectItem> getListarNivelContas() {
		return listarNivelContas;
	}

	public void setListarNivelContas(List<SelectItem> listarNivelContas) {
		this.listarNivelContas = listarNivelContas;
	}

	public boolean isConsolidado() {
		return consolidado;
	}

	public void setConsolidado(boolean consolidado) {
		this.consolidado = consolidado;
	}
}