package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

import java.util.ArrayList;
import java.util.List;

public class ReprocessamentoPorDependenciaEntradaDTO {

	private Long codMunicipio;

    private Integer competenciaInicial;

    private Integer competenciaFinal;

    private String usuario;

    private String criterioSelecao;
    
    private List<DependenciaDTO> dependencias = new ArrayList<DependenciaDTO>();

    private List<ContaDTO> contas = new ArrayList<ContaDTO>();

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Integer getCompetenciaFinal() {
		return competenciaFinal;
	}

	public void setCompetenciaFinal(Integer competenciaFinal) {
		this.competenciaFinal = competenciaFinal;
	}

	public Integer getCompetenciaInicial() {
		return competenciaInicial;
	}

	public void setCompetenciaInicial(Integer competenciaInicial) {
		this.competenciaInicial = competenciaInicial;
	}

	public String getCriterioSelecao() {
		return criterioSelecao;
	}

	public void setCriterioSelecao(String criterioSelecao) {
		this.criterioSelecao = criterioSelecao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<ContaDTO> getContas() {
		return contas;
	}

	public void setContas(List<ContaDTO> contas) {
		this.contas = contas;
	}

	public List<DependenciaDTO> getDependencias() {
		return dependencias;
	}

	public void setDependencias(List<DependenciaDTO> dependencias) {
		this.dependencias = dependencias;
	}

	public boolean addConta(ContaDTO o) {
		return contas.add(o);
	}

	public boolean addDependencia(DependenciaDTO o) {
		return dependencias.add(o);
	}
}
