package br.com.bradesco.web.giss.service.business.mantermunicipio.bean;

import java.util.Date;

public class ContaMunicipioDTO {
	private String conta;
	private String cosif;
	private String razao;
	private String descricao;
	private String aliquota;
	private String codigoTributo;	
	private Date dtInicioVigencia;
	private Date dtFinalVigencia;
	private int linha;
	
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getAliquota() {
		return aliquota;
	}
	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getCodigoTributo() {
		return codigoTributo;
	}
	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDtFinalVigencia() {
		return dtFinalVigencia;
	}
	public void setDtFinalVigencia(Date dtFinalVigencia) {
		this.dtFinalVigencia = dtFinalVigencia;
	}
	public Date getDtInicioVigencia() {
		return dtInicioVigencia;
	}
	public void setDtInicioVigencia(Date dtInicioVigencia) {
		this.dtInicioVigencia = dtInicioVigencia;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}

}
