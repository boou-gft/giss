package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class ConsultarMunicipiosNovosDTO {

	private Long cdMunicipio = null;
    private Integer cdUf = null; 
    private Integer tipoPesquisa = null;
    private String cdTela = null;
	
	/**
	 * 
	 */
	public ConsultarMunicipiosNovosDTO() {
		super();
	}

	/**
	 * @return the cdMunicipio
	 */
	public Long getCdMunicipio() {
		return cdMunicipio;
	}

	/**
	 * @param cdMunicipio the cdMunicipio to set
	 */
	public void setCdMunicipio(Long cdMunicipio) {
		this.cdMunicipio = cdMunicipio;
	}

	/**
	 * @return the cdUf
	 */
	public Integer getCdUf() {
		return cdUf;
	}

	/**
	 * @param cdUf the cdUf to set
	 */
	public void setCdUf(Integer cdUf) {
		this.cdUf = cdUf;
	}

	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}

	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	/**
	 * @return the cdTela
	 */
	public String getCdTela() {
		return cdTela;
	}

	/**
	 * @param cdTela the cdTela to set
	 */
	public void setCdTela(String cdTela) {
		this.cdTela = cdTela;
	}    
}
