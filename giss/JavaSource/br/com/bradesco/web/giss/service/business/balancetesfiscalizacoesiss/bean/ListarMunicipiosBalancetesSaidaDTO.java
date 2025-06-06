package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarMunicipiosBalancetesSaidaDTO {
	
	private Long codMunicipio;
	private String descMunicipio;

	public ListarMunicipiosBalancetesSaidaDTO() {
	
	}
	
	public ListarMunicipiosBalancetesSaidaDTO(Long codMunicipio, String descMunicipio) {
		this.setCodMunicipio(codMunicipio);
		this.setDescMunicipio(descMunicipio);
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}
}