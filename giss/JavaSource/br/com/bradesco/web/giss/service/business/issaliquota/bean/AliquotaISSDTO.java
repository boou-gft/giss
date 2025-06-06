package br.com.bradesco.web.giss.service.business.issaliquota.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AliquotaISSDTO {

	private Long codMunicipio;
	private String codAliquota;
	private Integer codLeiCompl;
	private String descLeiCompl; 
	private String codDescLeiCompl;
	private String municipio;
	private String estado;
	private String aliquota;
	private String aliquotaPadrao;
	private String descMunicipio;
	private String descAliquota;
	private Integer codUf;
	private String siglaUf;
	private String dataInicioVigencia;
	private String dataFimVigencia;
	private String competencia;
	private String itemDeServico;
	private String porcentAliquotaMin;
	private String porcentAliquotaMax;
	private Date dataIncioVigenciaAliquota;
	private Date dataFimVigenciaAliquota;
	private String usuario;
	private String dataAlteracao;
	private Integer numParametro;
	
	private String mesPeriodoInicial;
	private String anoPeriodoInicial;
	private String mesPeriodoFinal;
	private String anoPeriodoFinal;

	private List<AliquotaISSDTO> listaAliqMunicipios = new ArrayList<AliquotaISSDTO>();
	private List<AliquotaISSDTO> listaAlterar = new ArrayList<AliquotaISSDTO>();
	private List<AliquotaISSDTO> lista = new ArrayList<AliquotaISSDTO>();

	/**
	 * @return the codAliquota
	 */
	public String getCodAliquota() {
		return codAliquota;
	}

	/**
	 * @param codAliquota
	 *            the codAliquota to set
	 */
	public void setCodAliquota(String codAliquota) {
		this.codAliquota = codAliquota;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio
	 *            the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the aliquotaPadrao
	 */
	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	/**
	 * @param aliquotaPadrao
	 *            the aliquotaPadrao to set
	 */
	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	/**
	 * @return the descMunicipio
	 */
	public String getDescMunicipio() {
		return descMunicipio;
	}

	/**
	 * @param descMunicipio
	 *            the descMunicipio to set
	 */
	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	/**
	 * @return the descAliquota
	 */
	public String getDescAliquota() {
		return descAliquota;
	}

	/**
	 * @param descAliquota
	 *            the descAliquota to set
	 */
	public void setDescAliquota(String descAliquota) {
		this.descAliquota = descAliquota;
	}

	/**
	 * @return the codLeiCompl
	 */
	public Integer getCodLeiCompl() {
		return codLeiCompl;
	}

	/**
	 * @param codLeiCompl
	 *            the codLeiCompl to set
	 */
	public void setCodLeiCompl(Integer codLeiCompl) {
		this.codLeiCompl = codLeiCompl;
	}

	/**
	 * @return the listaAlterar
	 */
	public List<AliquotaISSDTO> getListaAlterar() {
		return listaAlterar;
	}

	/**
	 * @param listaAlterar
	 *            the listaAlterar to set
	 */
	public void setListaAlterar(List<AliquotaISSDTO> listaAlterar) {
		this.listaAlterar = listaAlterar;
	}

	/**
	 * @return the listaAliqMunicipios
	 */
	public List<AliquotaISSDTO> getListaAliqMunicipios() {
		return listaAliqMunicipios;
	}

	/**
	 * @param listaAliqMunicipios
	 *            the listaAliqMunicipios to set
	 */
	public void setListaAliqMunicipios(List<AliquotaISSDTO> listaAliqMunicipios) {
		this.listaAliqMunicipios = listaAliqMunicipios;
	}

	/**
	 * @return the descLeiCompl
	 */
	public String getDescLeiCompl() {
		return descLeiCompl;
	}

	/**
	 * @param descLeiCompl
	 *            the descLeiCompl to set
	 */
	public void setDescLeiCompl(String descLeiCompl) {
		this.descLeiCompl = descLeiCompl;
	}

	/**
	 * @return the codDescLeiCompl
	 */
	public String getCodDescLeiCompl() {
		return codDescLeiCompl;
	}

	/**
	 * @param codDescLeiCompl the codDescLeiCompl to set
	 */
	public void setCodDescLeiCompl(String codDescLeiCompl) {
		this.codDescLeiCompl = codDescLeiCompl;
	}

	/**
	 * @return the codUf
	 */
	public Integer getCodUf() {
		return codUf;
	}

	/**
	 * @param codUf the codUf to set
	 */
	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}

	/**
	 * @return the siglaUf
	 */
	public String getSiglaUf() {
		return siglaUf;
	}

	/**
	 * @param siglaUf the siglaUf to set
	 */
	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	/**
	 * @return the codMunicipio
	 */
	public Long getCodMunicipio() {
		return codMunicipio;
	}

	/**
	 * @param codMunicipio the codMunicipio to set
	 */
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	/**
	 * @return the aliquota
	 */
	public String getAliquota() {
		return aliquota;
	}

	/**
	 * @param aliquota the aliquota to set
	 */
	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	/**
	 * @return the dataInicioVigencia
	 */
	public String getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	/**
	 * @param dataInicioVigencia the dataInicioVigencia to set
	 */
	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getItemDeServico() {
		return itemDeServico;
	}

	public void setItemDeServico(String itemDeServico) {
		this.itemDeServico = itemDeServico;
	}

	public String getPorcentAliquotaMin() {
		return porcentAliquotaMin;
	}

	public void setPorcentAliquotaMin(String porcentAliquotaMin) {
		this.porcentAliquotaMin = porcentAliquotaMin;
	}

	public String getPorcentAliquotaMax() {
		return porcentAliquotaMax;
	}

	public void setPorcentAliquotaMax(String porcentAliquotaMax) {
		this.porcentAliquotaMax = porcentAliquotaMax;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public List<AliquotaISSDTO> getLista() {
		return lista;
	}

	public void setLista(List<AliquotaISSDTO> lista) {
		this.lista = lista;
	}

	public Date getDataIncioVigenciaAliquota() {
		return dataIncioVigenciaAliquota;
	}

	public void setDataIncioVigenciaAliquota(Date dataIncioVigenciaAliquota) {
		this.dataIncioVigenciaAliquota = dataIncioVigenciaAliquota;
	}

	public Date getDataFimVigenciaAliquota() {
		return dataFimVigenciaAliquota;
	}

	public void setDataFimVigenciaAliquota(Date dataFimVigenciaAliquota) {
		this.dataFimVigenciaAliquota = dataFimVigenciaAliquota;
	}

	public Integer getNumParametro() {
		return numParametro;
	}

	public void setNumParametro(Integer numParametro) {
		this.numParametro = numParametro;
	}

	public String getMesPeriodoInicial() {
		return mesPeriodoInicial;
	}

	public void setMesPeriodoInicial(String mesPeriodoInicial) {
		this.mesPeriodoInicial = mesPeriodoInicial;
	}

	public String getAnoPeriodoInicial() {
		return anoPeriodoInicial;
	}

	public void setAnoPeriodoInicial(String anoPeriodoInicial) {
		this.anoPeriodoInicial = anoPeriodoInicial;
	}

	public String getMesPeriodoFinal() {
		return mesPeriodoFinal;
	}

	public void setMesPeriodoFinal(String mesPeriodoFinal) {
		this.mesPeriodoFinal = mesPeriodoFinal;
	}

	public String getAnoPeriodoFinal() {
		return anoPeriodoFinal;
	}

	public void setAnoPeriodoFinal(String anoPeriodoFinal) {
		this.anoPeriodoFinal = anoPeriodoFinal;
	}

}
