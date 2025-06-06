package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

public class ManterAliquotaFiltroDTO {

	private String mesInicial;
	private String anoInicial;
	private String mesFinal;
	private String anoFinal;
	private Integer codigoItemServico;
	private String codigoEstado;
	private Long codigoMunicipio;
	private String indicadorPesquisa;
	
	
	
	public ManterAliquotaFiltroDTO() {
		super();
		setIndicadorPesquisa("GP");
	}
	
	
	
	public String getMesInicial() {
		return mesInicial;
	}
	public void setMesInicial(String mesInicial) {
		this.mesInicial = mesInicial;
	}
	public String getAnoInicial() {
		return anoInicial;
	}
	public void setAnoInicial(String anoInicial) {
		this.anoInicial = anoInicial;
	}
	public String getMesFinal() {
		return mesFinal;
	}
	public void setMesFinal(String mesFinal) {
		this.mesFinal = mesFinal;
	}
	public String getAnoFinal() {
		return anoFinal;
	}
	public void setAnoFinal(String anoFinal) {
		this.anoFinal = anoFinal;
	}
	public Integer getCodigoItemServico() {
		return codigoItemServico;
	}
	public void setCodigoItemServico(Integer codigoItemServico) {
		this.codigoItemServico = codigoItemServico;
	}
	public String getCodigoEstado() {
		return codigoEstado;
	}
	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}



	public String getIndicadorPesquisa() {
		return indicadorPesquisa;
	}



	public void setIndicadorPesquisa(String indicadorPesquisa) {
		this.indicadorPesquisa = indicadorPesquisa;
	}
	
	
}
