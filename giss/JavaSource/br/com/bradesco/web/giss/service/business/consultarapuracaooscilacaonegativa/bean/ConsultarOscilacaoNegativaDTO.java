package br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ConsultarOscilacaoNegativaDTO implements Comparable<ConsultarOscilacaoNegativaDTO>{
	private String dependencia;
	private String municipio;
	private String municipioDepPa;
	private String uf;
	private BigDecimal anterior;
	private BigDecimal atual;
	private BigDecimal oscilacao;
	private BigDecimal vlrOscilacao;
	private BigDecimal vlrAtual;
	private BigDecimal vlrAnterior;
	private int numeroSequencial;
	private long codigoPessoaJuridica;
	private int itemRadio;		
	private BigDecimal totalOscilacao;
	private BigDecimal totalAnterior;
	private BigDecimal totalAtual;
	private BigDecimal totalAnteriorAcumulado;
	private BigDecimal totalAtualAcumulado;
	private BigDecimal totalOscilacaoAcumulado;
	private BigDecimal valorTotalAntAgencia;
	private BigDecimal valorTotalAtualAgencia;
	private BigDecimal valorTotalOscAgencia;
	private BigDecimal valorTotalAntPa;
	private BigDecimal valorTotalAtualPa;
	private BigDecimal valorTotalOscPa;
	private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	private Integer codGrupo;
	private Integer codSubGrupo;
	private String codPa;
	private String codDepPa;
	private ArrayList<ConsultarOscilacaoNegativaDTO> listaOscilacaoNeg = new ArrayList<ConsultarOscilacaoNegativaDTO>();
	
	public BigDecimal getAnterior() {
		return anterior;
	}
	public void setAnterior(BigDecimal anterior) {
		this.anterior = anterior;
	}
	public BigDecimal getAtual() {
		return atual;
	}
	public void setAtual(BigDecimal atual) {
		this.atual = atual;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public int getItemRadio() {
		return itemRadio;
	}
	public void setItemRadio(int itemRadio) {
		this.itemRadio = itemRadio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public BigDecimal getOscilacao() {
		return oscilacao;
	}
	public void setOscilacao(BigDecimal oscilacao) {
		this.oscilacao = oscilacao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public BigDecimal getVlrOscilacao() {
		return vlrOscilacao;
	}
	public void setVlrOscilacao(BigDecimal vlrOscilacao) {
		this.vlrOscilacao = vlrOscilacao;
	}
	public BigDecimal getVlrAnterior() {
		return vlrAnterior;
	}
	public void setVlrAnterior(BigDecimal vlrAnterior) {
		this.vlrAnterior = vlrAnterior;
	}
	public BigDecimal getVlrAtual() {
		return vlrAtual;
	}
	public void setVlrAtual(BigDecimal vlrAtual) {
		this.vlrAtual = vlrAtual;
	}
	public int getNumeroSequencial() {
		return numeroSequencial;
	}
	public void setNumeroSequencial(int numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	public long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public BigDecimal getTotalAnterior() {
		return totalAnterior;
	}
	public void setTotalAnterior(BigDecimal totalAnterior) {
		this.totalAnterior = totalAnterior;
	}
	public BigDecimal getTotalAtual() {
		return totalAtual;
	}
	public void setTotalAtual(BigDecimal totalAtual) {
		this.totalAtual = totalAtual;
	}
	public BigDecimal getTotalOscilacao() {
		return totalOscilacao;
	}
	public void setTotalOscilacao(BigDecimal totalOscilacao) {
		this.totalOscilacao = totalOscilacao;
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
	public ArrayList<ConsultarOscilacaoNegativaDTO> getListaOscilacaoNeg() {
		return listaOscilacaoNeg;
	}
	public void setListaOscilacaoNeg(ArrayList<ConsultarOscilacaoNegativaDTO> listaOscilacaoNeg) {
		this.listaOscilacaoNeg = listaOscilacaoNeg;
	}
	public BigDecimal getTotalAnteriorAcumulado() {
		return totalAnteriorAcumulado;
	}
	public void setTotalAnteriorAcumulado(BigDecimal totalAnteriorAcumulado) {
		this.totalAnteriorAcumulado = totalAnteriorAcumulado;
	}
	public BigDecimal getTotalAtualAcumulado() {
		return totalAtualAcumulado;
	}
	public void setTotalAtualAcumulado(BigDecimal totalAtualAcumulado) {
		this.totalAtualAcumulado = totalAtualAcumulado;
	}
	public BigDecimal getTotalOscilacaoAcumulado() {
		return totalOscilacaoAcumulado;
	}
	public void setTotalOscilacaoAcumulado(BigDecimal totalOscilacaoAcumulado) {
		this.totalOscilacaoAcumulado = totalOscilacaoAcumulado;
	}
	/**
	 * @return the codGrupo
	 */
	public Integer getCodGrupo() {
		return codGrupo;
	}
	/**
	 * @param codGrupo the codGrupo to set
	 */
	public void setCodGrupo(Integer codGrupo) {
		this.codGrupo = codGrupo;
	}
	/**
	 * @return the codSubGrupo
	 */
	public Integer getCodSubGrupo() {
		return codSubGrupo;
	}
	/**
	 * @param codSubGrupo the codSubGrupo to set
	 */
	public void setCodSubGrupo(Integer codSubGrupo) {
		this.codSubGrupo = codSubGrupo;
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
	
	public int compareTo(ConsultarOscilacaoNegativaDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
	}
	/**
	 * @return the valorTotalAntAgencia
	 */
	public BigDecimal getValorTotalAntAgencia() {
		return valorTotalAntAgencia;
	}
	/**
	 * @param valorTotalAntAgencia the valorTotalAntAgencia to set
	 */
	public void setValorTotalAntAgencia(BigDecimal valorTotalAntAgencia) {
		this.valorTotalAntAgencia = valorTotalAntAgencia;
	}
	/**
	 * @return the valorTotalAtualAgencia
	 */
	public BigDecimal getValorTotalAtualAgencia() {
		return valorTotalAtualAgencia;
	}
	/**
	 * @param valorTotalAtualAgencia the valorTotalAtualAgencia to set
	 */
	public void setValorTotalAtualAgencia(BigDecimal valorTotalAtualAgencia) {
		this.valorTotalAtualAgencia = valorTotalAtualAgencia;
	}
	/**
	 * @return the valorTotalOscAgencia
	 */
	public BigDecimal getValorTotalOscAgencia() {
		return valorTotalOscAgencia;
	}
	/**
	 * @param valorTotalOscAgencia the valorTotalOscAgencia to set
	 */
	public void setValorTotalOscAgencia(BigDecimal valorTotalOscAgencia) {
		this.valorTotalOscAgencia = valorTotalOscAgencia;
	}
	/**
	 * @return the valorTotalAntPa
	 */
	public BigDecimal getValorTotalAntPa() {
		return valorTotalAntPa;
	}
	/**
	 * @param valorTotalAntPa the valorTotalAntPa to set
	 */
	public void setValorTotalAntPa(BigDecimal valorTotalAntPa) {
		this.valorTotalAntPa = valorTotalAntPa;
	}
	/**
	 * @return the valorTotalAtualPa
	 */
	public BigDecimal getValorTotalAtualPa() {
		return valorTotalAtualPa;
	}
	/**
	 * @param valorTotalAtualPa the valorTotalAtualPa to set
	 */
	public void setValorTotalAtualPa(BigDecimal valorTotalAtualPa) {
		this.valorTotalAtualPa = valorTotalAtualPa;
	}
	/**
	 * @return the valorTotalOscPa
	 */
	public BigDecimal getValorTotalOscPa() {
		return valorTotalOscPa;
	}
	/**
	 * @param valorTotalOscPa the valorTotalOscPa to set
	 */
	public void setValorTotalOscPa(BigDecimal valorTotalOscPa) {
		this.valorTotalOscPa = valorTotalOscPa;
	}
	/**
	 * @return the municipioDepPa
	 */
	public String getMunicipioDepPa() {
		return municipioDepPa;
	}
	/**
	 * @param municipioDepPa the municipioDepPa to set
	 */
	public void setMunicipioDepPa(String municipioDepPa) {
		this.municipioDepPa = municipioDepPa;
	}
}
