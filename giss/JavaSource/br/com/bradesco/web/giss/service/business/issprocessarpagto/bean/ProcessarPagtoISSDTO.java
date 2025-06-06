package br.com.bradesco.web.giss.service.business.issprocessarpagto.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcessarPagtoISSDTO {
	private String empresa;
	private String produto;
	private String codFinalidade;
	private Integer codEmpresa;
	private String descEmpresa;
	private String dataRecepcao;
	private String indContabilizar;
	private String statusArquivo;
	private Long qtdeRegistro;
	private BigDecimal valorReceita;
	private Integer numConsul;
	private Integer anoMes;
	private Integer codIdenticacaoTransIss;
	private Integer nApurcIssEmpresa;
	
	private List<ProcessarPagtoISSDTO> lista = new ArrayList<ProcessarPagtoISSDTO>();
	
	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the produto
	 */
	public String getProduto() {
		return produto;
	}

	/**
	 * @param produto
	 *            the produto to set
	 */
	public void setProduto(String produto) {
		this.produto = produto;
	}

	/**
	 * @return the lista
	 */
	public List<ProcessarPagtoISSDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista
	 *            the lista to set
	 */
	public void setLista(List<ProcessarPagtoISSDTO> lista) {
		this.lista = lista;
	}

	/**
	 * @return the codFinalidade
	 */
	public String getCodFinalidade() {
		return codFinalidade;
	}

	/**
	 * @param codFinalidade
	 *            the codFinalidade to set
	 */
	public void setCodFinalidade(String codFinalidade) {
		this.codFinalidade = codFinalidade;
	}

	/**
	 * @return the codEmpresa
	 */
	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	/**
	 * @param codEmpresa
	 *            the codEmpresa to set
	 */
	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	/**
	 * @return the descEmpresa
	 */
	public String getDescEmpresa() {
		return descEmpresa;
	}

	/**
	 * @param descEmpresa
	 *            the descEmpresa to set
	 */
	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	/**
	 * @return the dataRecepcao
	 */
	public String getDataRecepcao() {
		return dataRecepcao;
	}

	/**
	 * @param dataRecepcao
	 *            the dataRecepcao to set
	 */
	public void setDataRecepcao(String dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}

	/**
	 * @return the statusArquivo
	 */
	public String getStatusArquivo() {
		return statusArquivo;
	}

	/**
	 * @param statusArquivo
	 *            the statusArquivo to set
	 */
	public void setStatusArquivo(String statusArquivo) {
		this.statusArquivo = statusArquivo;
	}

	/**
	 * @return the valorReceita
	 */

	/**
	 * @return the numConsul
	 */
	public Integer getNumConsul() {
		return numConsul;
	}

	/**
	 * @param numConsul
	 *            the numConsul to set
	 */
	public void setNumConsul(Integer numConsul) {
		this.numConsul = numConsul;
	}

	/**
	 * @return the codIdenticacaoTransIss
	 */
	public Integer getCodIdenticacaoTransIss() {
		return codIdenticacaoTransIss;
	}

	/**
	 * @param codIdenticacaoTransIss
	 *            the codIdenticacaoTransIss to set
	 */
	public void setCodIdenticacaoTransIss(Integer codIdenticacaoTransIss) {
		this.codIdenticacaoTransIss = codIdenticacaoTransIss;
	}

	/**
	 * @return the nApurcIssEmpresa
	 */
	public Integer getNApurcIssEmpresa() {
		return nApurcIssEmpresa;
	}

	/**
	 * @param apurcIssEmpresa
	 *            the nApurcIssEmpresa to set
	 */
	public void setNApurcIssEmpresa(Integer apurcIssEmpresa) {
		nApurcIssEmpresa = apurcIssEmpresa;
	}

	/**
	 * @return the qtdeRegistro
	 */
	public Long getQtdeRegistro() {
		return qtdeRegistro;
	}

	/**
	 * @param qtdeRegistro
	 *            the qtdeRegistro to set
	 */
	public void setQtdeRegistro(Long qtdeRegistro) {
		this.qtdeRegistro = qtdeRegistro;
	}

	/**
	 * @return the valorReceita
	 */
	public BigDecimal getValorReceita() {
		return valorReceita;
	}

	/**
	 * @param valorReceita
	 *            the valorReceita to set
	 */
	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}

	/**
	 * @return the anoMes
	 */
	public Integer getAnoMes() {
		return anoMes;
	}

	/**
	 * @param anoMes
	 *            the anoMes to set
	 */
	public void setAnoMes(Integer anoMes) {
		this.anoMes = anoMes;
	}

	/**
	 * @return the indContabilizar
	 */
	public String getIndContabilizar() {
		return indContabilizar;
	}

	/**
	 * @param indContabilizar the indContabilizar to set
	 */
	public void setIndContabilizar(String indContabilizar) {
		this.indContabilizar = indContabilizar;
	}
	

}
