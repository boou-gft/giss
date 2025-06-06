package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.text.MaskFormatter;

public class ConciliacaoApuracaoVo {
	
	private Integer maxOcorrencias;
	private Integer mesAno;
	
	private Integer numConsultas;
	private String sinalReceitaTotalCCRS;
	private String valorReceitaTotalCCRS;
	private String sinalReceitaTotalGISS;
	private String valorReceitaTotalGISS;
	private String sinalAjusteTotal;
	private String valorAjusteTotal;
	private String sinalIssTotal;
	private String valorIssTotal;
	private String sinalAliquotaZeradaTotal;
	private String valorAliquotaZeradaTotal;
	private String sinalOscilacaoNegativaTotal;
	private String valorOscilacaoNegativaTotal;
	private String sinalRedutorTotal;
	private String valorRedutosTotal;
	
	private ArrayList<ListaConciliacaoApuracaoVo> lista = new ArrayList<ListaConciliacaoApuracaoVo>();

	
	private String mascaraValor(String valor, String sinal) {
		if(valor == null){
			return "";
		}
		
		if(valor.equals("0.00")){
			return "0,00";
		}
		
		BigDecimal x = new BigDecimal(valor);
		DecimalFormat dt = new DecimalFormat("#,###.00");
		String valorFormatado = dt.format(x);

		if(sinal.equals("-")){
			valorFormatado = sinal + valorFormatado;
		}
		
		return valorFormatado;
	}
	
	public String getValorReceitaTotalCCRSFormatado(){
		return mascaraValor(getValorReceitaTotalCCRS(), getSinalReceitaTotalCCRS());
	}
	public String getValorReceitaTotalGISSFormatado(){
		return mascaraValor(getValorReceitaTotalGISS(), getSinalReceitaTotalGISS());
	}
	public String getValorAjusteTotalFormatado(){
		return mascaraValor(getValorAjusteTotal(), getSinalAjusteTotal());
	}
	public String getValorIssTotalFormatado(){
		return mascaraValor(getValorIssTotal(), getSinalIssTotal());
	}
	public String getValorAliquotaZeradaTotalFormatado(){
		return mascaraValor(getValorAliquotaZeradaTotal(), getSinalAliquotaZeradaTotal());
	}
	public String getValorOscilacaoNegativaTotalFormatado(){
		return mascaraValor(getValorOscilacaoNegativaTotal(), getSinalOscilacaoNegativaTotal());
	}
	public String getValorRedutosTotalFormatado(){
		return mascaraValor(getValorRedutosTotal(), getSinalRedutorTotal());
	}
	
	public Integer getMaxOcorrencias() {
		return maxOcorrencias;
	}

	public void setMaxOcorrencias(Integer maxOcorrencias) {
		this.maxOcorrencias = maxOcorrencias;
	}

	public Integer getMesAno() {
		return mesAno;
	}

	public void setMesAno(Integer mesAno) {
		this.mesAno = mesAno;
	}

	public Integer getNumConsultas() {
		return numConsultas;
	}

	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}

	public String getSinalReceitaTotalCCRS() {
		return sinalReceitaTotalCCRS;
	}

	public void setSinalReceitaTotalCCRS(String sinalReceitaTotalCCRS) {
		this.sinalReceitaTotalCCRS = sinalReceitaTotalCCRS;
	}

	public String getValorReceitaTotalCCRS() {
		return valorReceitaTotalCCRS;
	}

	public void setValorReceitaTotalCCRS(String valorReceitaTotalCCRS) {
		this.valorReceitaTotalCCRS = valorReceitaTotalCCRS;
	}

	public String getSinalReceitaTotalGISS() {
		return sinalReceitaTotalGISS;
	}

	public void setSinalReceitaTotalGISS(String sinalReceitaTotalGISS) {
		this.sinalReceitaTotalGISS = sinalReceitaTotalGISS;
	}

	public String getValorReceitaTotalGISS() {
		return valorReceitaTotalGISS;
	}

	public void setValorReceitaTotalGISS(String valorReceitaTotalGISS) {
		this.valorReceitaTotalGISS = valorReceitaTotalGISS;
	}

	public String getSinalAjusteTotal() {
		return sinalAjusteTotal;
	}

	public void setSinalAjusteTotal(String sinalAjusteTotal) {
		this.sinalAjusteTotal = sinalAjusteTotal;
	}

	public String getValorAjusteTotal() {
		return valorAjusteTotal;
	}

	public void setValorAjusteTotal(String valorAjusteTotal) {
		this.valorAjusteTotal = valorAjusteTotal;
	}

	public String getSinalIssTotal() {
		return sinalIssTotal;
	}

	public void setSinalIssTotal(String sinalIssTotal) {
		this.sinalIssTotal = sinalIssTotal;
	}

	public String getValorIssTotal() {
		return valorIssTotal;
	}

	public void setValorIssTotal(String valorIssTotal) {
		this.valorIssTotal = valorIssTotal;
	}

	public String getSinalAliquotaZeradaTotal() {
		return sinalAliquotaZeradaTotal;
	}

	public void setSinalAliquotaZeradaTotal(String sinalAliquotaZeradaTotal) {
		this.sinalAliquotaZeradaTotal = sinalAliquotaZeradaTotal;
	}

	public String getValorAliquotaZeradaTotal() {
		return valorAliquotaZeradaTotal;
	}

	public void setValorAliquotaZeradaTotal(String valorAliquotaZeradaTotal) {
		this.valorAliquotaZeradaTotal = valorAliquotaZeradaTotal;
	}

	public String getSinalOscilacaoNegativaTotal() {
		return sinalOscilacaoNegativaTotal;
	}

	public void setSinalOscilacaoNegativaTotal(String sinalOscilacaoNegativaTotal) {
		this.sinalOscilacaoNegativaTotal = sinalOscilacaoNegativaTotal;
	}

	public String getValorOscilacaoNegativaTotal() {
		return valorOscilacaoNegativaTotal;
	}

	public void setValorOscilacaoNegativaTotal(String valorOscilacaoNegativaTotal) {
		this.valorOscilacaoNegativaTotal = valorOscilacaoNegativaTotal;
	}

	public String getSinalRedutorTotal() {
		return sinalRedutorTotal;
	}

	public void setSinalRedutorTotal(String sinalRedutorTotal) {
		this.sinalRedutorTotal = sinalRedutorTotal;
	}

	public String getValorRedutosTotal() {
		return valorRedutosTotal;
	}

	public void setValorRedutosTotal(String valorRedutosTotal) {
		this.valorRedutosTotal = valorRedutosTotal;
	}

	public ArrayList<ListaConciliacaoApuracaoVo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ListaConciliacaoApuracaoVo> lista) {
		this.lista = lista;
	}
	
	
}