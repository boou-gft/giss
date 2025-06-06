package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import java.util.ArrayList;


public class DetalharJustificativaApuracaoVO {
	
	private String maxOcorrencia;
	private String mesAno;
	private Integer numConsultas;
	private Integer competencia;
	
	private ArrayList<ListaJustificativaApuracaoVO> lista = new ArrayList<ListaJustificativaApuracaoVO>();

	public String getMaxOcorrencia() {
		return maxOcorrencia;
	}

	public void setMaxOcorrencia(String maxOcorrencia) {
		this.maxOcorrencia = maxOcorrencia;
	}

	public String getMesAno() {
		return mesAno;
	}

	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}

	public Integer getNumConsultas() {
		return numConsultas;
	}

	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public ArrayList<ListaJustificativaApuracaoVO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ListaJustificativaApuracaoVO> lista) {
		this.lista = lista;
	}
	
	
	
}