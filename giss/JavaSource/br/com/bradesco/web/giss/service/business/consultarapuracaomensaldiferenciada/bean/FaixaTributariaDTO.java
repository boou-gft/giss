package br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.bean;

import java.text.DecimalFormat;

public class FaixaTributariaDTO {
	
	private double valorInicial;
	private double valorFinal;
	private double aliquota;
	private double redutor;
	
	private String valorInicialStr;
	private String valorFinalStr;
	private String redutorStr;
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	public double getRedutor() {
		return redutor;
	}
	public void setRedutor(double redutor) {
		this.redutor = redutor;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public String getRedutorStr() {		
		return df.format(getRedutor());
	}
	public void setRedutorStr(String redutorStr) {
		this.redutorStr = redutorStr;
	}
	public String getValorFinalStr() {
		return df.format(getValorFinal());
	}
	public void setValorFinalStr(String valorFinalStr) {
		this.valorFinalStr = valorFinalStr;
	}
	public String getValorInicialStr() {
		return df.format(getValorInicial());
	}
	public void setValorInicialStr(String valorInicialStr) {
		this.valorInicialStr = valorInicialStr;
	}
	
	
		
	

}
