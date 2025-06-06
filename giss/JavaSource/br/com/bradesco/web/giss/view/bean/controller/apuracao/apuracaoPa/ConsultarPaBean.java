package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;


public class ConsultarPaBean {
	
	private Integer codigoPa;
	private String nomePa;
	private String municipioPa;
	private String ufPa;
	private String juncao;
	private String nome;
	private String municipio;
	private String uf;
	private ListaParcialPaBean listaParcialPaBean = new ListaParcialPaBean();
	
	public String iniciaTela(){
		
		codigoPa = 0;
		nomePa = "";
		municipioPa = "";
		ufPa = "";
		juncao = "";
		nome = "";
		municipio = "";
		uf = "";
		return "consultaPa";
	}

	public String consultar(){
		return listaParcialPaBean.iniciaTelaApuracao("C");
	}
	
	// GETTERS AND SETTERS //

	public Integer getCodigoPa() {
		return codigoPa;
	}

	public void setCodigoPa(Integer codigoPa) {
		this.codigoPa = codigoPa;
	}

	public String getNomePa() {
		return nomePa;
	}

	public void setNomePa(String nomePa) {
		this.nomePa = nomePa;
	}

	public String getMunicipioPa() {
		return municipioPa;
	}

	public void setMunicipioPa(String municipioPa) {
		this.municipioPa = municipioPa;
	}

	public String getUfPa() {
		return ufPa;
	}

	public void setUfPa(String ufPa) {
		this.ufPa = ufPa;
	}



	public String getJuncao() {
		return juncao;
	}



	public void setJuncao(String juncao) {
		this.juncao = juncao;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}

	public ListaParcialPaBean getListaParcialPaBean() {
		return listaParcialPaBean;
	}

	public void setListaParcialPaBean(ListaParcialPaBean listaParcialPaBean) {
		this.listaParcialPaBean = listaParcialPaBean;
	}

}
