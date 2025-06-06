package br.com.bradesco.web.giss.service.business.listarempresa.bean;

public class ItemEmpresa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer codEmpresa;

	private Long codigoEmpresa;

	private String codigoEmpresaS;
	
	private Long codHierEmpresa;

	private String nomeEmpresa;


	public Long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getCodigoEmpresaS() {
		return codigoEmpresaS;
	}

	public void setCodigoEmpresaS(String codigoEmpresaS) {
		this.codigoEmpresaS = codigoEmpresaS;
	}

	public Long getCodHierEmpresa() {
		return codHierEmpresa;
	}

	public void setCodHierEmpresa(Long codHierEmpresa) {
		this.codHierEmpresa = codHierEmpresa;
	}

}
