package br.com.bradesco.web.giss.service.business.listamunicipio.bean;

/**
 * Representa um Item retornado pela busca municipios
 * 
 * @author Gian 
 */
public class ItemMunicipio {

	private static final long serialVersionUID = 1L;


	private Long codigoMunicipio;

	private String descricaoMuncipio;
	
	private String uf;
	
	

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDescricaoMuncipio() {
		return descricaoMuncipio;
	}

	public void setDescricaoMuncipio(String descricaoMuncipio) {
		this.descricaoMuncipio = descricaoMuncipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
