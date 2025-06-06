package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class IncluirExcluirBalanceteObrigacoesAcessoriasDTO {
	
	private Long codMunicipio;
	private String codGrupo;

	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getCodGrupo() {
		return codGrupo;
	}
	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}
}