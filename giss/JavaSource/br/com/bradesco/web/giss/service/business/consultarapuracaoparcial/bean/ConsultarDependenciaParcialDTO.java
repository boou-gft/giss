package br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean;

import java.util.ArrayList;

public class ConsultarDependenciaParcialDTO implements Comparable<ConsultarDependenciaParcialDTO>{
	
	private String dependencia;
	private String descricao;
	private int linha;
	private String totalReceita;
	private String totalRecolher;
	private String totalReceitaPa;
	private String totalRecolherPa;
	private String totalReceitaGeral;
	private String totalRecolherGeral;
	private String codigoPessoaJuridica;
	private String numeroSequencial;
	private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	private String codPa;
	private String descPa;
	private String codDepPa;
	private String descDepPa;
	private String receita;
	private String ISSRecolher;
	
	private ArrayList<ConsultarDependenciaParcialDTO> lista = new ArrayList<ConsultarDependenciaParcialDTO>();
	
	

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}
	public String getTotalRecolher() {
		return totalRecolher;
	}
	public void setTotalRecolher(String totalRecolher) {
		this.totalRecolher = totalRecolher;
	}
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getNumeroSequencial() {
		return numeroSequencial;
	}
	public void setNumeroSequencial(String numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public String getTotalReceitaGeral() {
		return totalReceitaGeral;
	}
	public void setTotalReceitaGeral(String totalReceitaGeral) {
		this.totalReceitaGeral = totalReceitaGeral;
	}
	public String getTotalRecolherGeral() {
		return totalRecolherGeral;
	}
	public void setTotalRecolherGeral(String totalRecolherGeral) {
		this.totalRecolherGeral = totalRecolherGeral;
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
	public String getCodUF() {
		return codUF;
	}
	public void setCodUF(String codUF) {
		this.codUF = codUF;
	}
	public String getDescUF() {
		return descUF;
	}
	public void setDescUF(String descUF) {
		this.descUF = descUF;
	}
	public ArrayList<ConsultarDependenciaParcialDTO> getLista() {
		return lista;
	}
	public void setLista(ArrayList<ConsultarDependenciaParcialDTO> lista) {
		this.lista = lista;
	}
	/**
	 * @return the codPa
	 */
	public String getCodPa() {
		return codPa;
	}
	/**
	 * @param codPa the codPa to set
	 */
	public void setCodPa(String codPa) {
		this.codPa = codPa;
	}
	/**
	 * @return the descPa
	 */
	public String getDescPa() {
		return descPa;
	}
	/**
	 * @param descPa the descPa to set
	 */
	public void setDescPa(String descPa) {
		this.descPa = descPa;
	}
	/**
	 * @return the codDepPa
	 */
	public String getCodDepPa() {
		return codDepPa;
	}
	/**
	 * @param codDepPa the codDepPa to set
	 */
	public void setCodDepPa(String codDepPa) {
		this.codDepPa = codDepPa;
	}
	/**
	 * @return the descDepPa
	 */
	public String getDescDepPa() {
		return descDepPa;
	}
	/**
	 * @param descDepPa the descDepPa to set
	 */
	public void setDescDepPa(String descDepPa) {
		this.descDepPa = descDepPa;
	}
	public int compareTo(ConsultarDependenciaParcialDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
	}
	/**
	 * @return the totalReceitaPa
	 */
	public String getTotalReceitaPa() {
		return totalReceitaPa;
	}
	/**
	 * @param totalReceitaPa the totalReceitaPa to set
	 */
	public void setTotalReceitaPa(String totalReceitaPa) {
		this.totalReceitaPa = totalReceitaPa;
	}
	/**
	 * @return the totalRecolherPa
	 */
	public String getTotalRecolherPa() {
		return totalRecolherPa;
	}
	/**
	 * @param totalRecolherPa the totalRecolherPa to set
	 */
	public void setTotalRecolherPa(String totalRecolherPa) {
		this.totalRecolherPa = totalRecolherPa;
	}
	/**
	 * @return the receita
	 */
	public String getReceita() {
		return receita;
	}
	/**
	 * @param receita the receita to set
	 */
	public void setReceita(String receita) {
		this.receita = receita;
	}
	/**
	 * @return the iSSRecolher
	 */
	public String getISSRecolher() {
		return ISSRecolher;
	}
	/**
	 * @param iSSRecolher the iSSRecolher to set
	 */
	public void setISSRecolher(String iSSRecolher) {
		ISSRecolher = iSSRecolher;
	}
}
