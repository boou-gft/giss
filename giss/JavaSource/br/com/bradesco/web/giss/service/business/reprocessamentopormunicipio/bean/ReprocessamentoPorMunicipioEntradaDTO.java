package br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.OcorrenciaReprocessamentoPorMunicipioDTO;

public class ReprocessamentoPorMunicipioEntradaDTO {

	private String criterioSelecao;

    private Integer competenciaInicial;

    private Integer competenciaFinal;
    
    private Integer codEstado;

    private List<OcorrenciaReprocessamentoPorMunicipioDTO> ocorrencias = new ArrayList<OcorrenciaReprocessamentoPorMunicipioDTO>();

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
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

	public List<OcorrenciaReprocessamentoPorMunicipioDTO> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(
			List<OcorrenciaReprocessamentoPorMunicipioDTO> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public boolean addOcorrencia(OcorrenciaReprocessamentoPorMunicipioDTO o) {
		return ocorrencias.add(o);
	}
}
