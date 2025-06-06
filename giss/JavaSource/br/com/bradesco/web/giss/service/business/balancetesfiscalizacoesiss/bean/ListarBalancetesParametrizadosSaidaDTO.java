package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarBalancetesParametrizadosSaidaDTO {
	
    private Long codMunicipio;
    private String codGrupo;
    private String codGrupo7;
    private String codGrupo8;
    private String codDemaisGrupos;
    private String siglaUf;
    private String descMunicipio;

	public ListarBalancetesParametrizadosSaidaDTO() {
	
	}

	public ListarBalancetesParametrizadosSaidaDTO(Long codMunicipio, String codGrupo, String codGrupo7, String codGrupo8, String codDemaisGrupos, String siglaUf, String descMunicipio) {
		this.codMunicipio = codMunicipio;
		this.codGrupo = codGrupo;
		this.codGrupo7 = codGrupo7;
		this.codGrupo8 = codGrupo8;
		this.codDemaisGrupos = codDemaisGrupos;
		this.siglaUf = siglaUf;
		this.descMunicipio = descMunicipio;
	}

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

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public String getCodGrupo7() {
		return codGrupo7;
	}

	public void setCodGrupo7(String codGrupo7) {
		this.codGrupo7 = codGrupo7;
	}

	public String getCodGrupo8() {
		return codGrupo8;
	}

	public void setCodGrupo8(String codGrupo8) {
		this.codGrupo8 = codGrupo8;
	}

	public String getCodDemaisGrupos() {
		return codDemaisGrupos;
	}

	public void setCodDemaisGrupos(String codDemaisGrupos) {
		this.codDemaisGrupos = codDemaisGrupos;
	}
}