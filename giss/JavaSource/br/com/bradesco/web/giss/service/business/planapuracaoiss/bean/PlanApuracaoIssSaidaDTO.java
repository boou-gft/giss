package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.util.List;

public class PlanApuracaoIssSaidaDTO {
	private String uf;
	private String municipio;
	private List<PlanApuracaoIssSaidaListaDTO> lista;
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public List<PlanApuracaoIssSaidaListaDTO> getLista() {
		return lista;
	}
	public void setLista(List<PlanApuracaoIssSaidaListaDTO> lista) {
		this.lista = lista;
	}
}
