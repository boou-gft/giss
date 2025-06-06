package br.com.bradesco.web.giss.service.business.issrelatorio.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;

public class HistoricoTransacoesRecusadasISSDTO {

	private String estado;
	private Long codMunicipio;
	private String descMunicipios;
	private Integer codigoUf;
	private String siglaUf;
	private String mesPeriodoInicial;
	private String anoPeriodoInicial;
	private String mesPeriodoFinal;
	private String anoPeriodoFinal;
	private Integer codProduto = 0;
	private Integer codEmpresa = 0;

	private List<MunicipioISSDTO> listaMunicipio = new ArrayList<MunicipioISSDTO>();
	private List<EmpresaISSDTO> listaEmpresa = new ArrayList<EmpresaISSDTO>();
	private List<RelatorioSaidaISSDTO> listaSaida = new ArrayList<RelatorioSaidaISSDTO>();

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
	 * @return the codMunicipio
	 */
	public Long getCodMunicipio() {
		return codMunicipio;
	}

	/**
	 * @param codMunicipio
	 *            the codMunicipio to set
	 */
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	/**
	 * @return the descMunicipios
	 */
	public String getDescMunicipios() {
		return descMunicipios;
	}

	/**
	 * @param descMunicipios
	 *            the descMunicipios to set
	 */
	public void setDescMunicipios(String descMunicipios) {
		this.descMunicipios = descMunicipios;
	}

	/**
	 * @return the codigoUf
	 */
	public Integer getCodigoUf() {
		return codigoUf;
	}

	/**
	 * @param codigoUf
	 *            the codigoUf to set
	 */
	public void setCodigoUf(Integer codigoUf) {
		this.codigoUf = codigoUf;
	}

	/**
	 * @return the siglaUf
	 */
	public String getSiglaUf() {
		return siglaUf;
	}

	/**
	 * @param siglaUf
	 *            the siglaUf to set
	 */
	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	/**
	 * @return the mesPeriodoInicial
	 */
	public String getMesPeriodoInicial() {
		return mesPeriodoInicial;
	}

	/**
	 * @param mesPeriodoInicial
	 *            the mesPeriodoInicial to set
	 */
	public void setMesPeriodoInicial(String mesPeriodoInicial) {
		this.mesPeriodoInicial = mesPeriodoInicial;
	}

	/**
	 * @return the anoPeriodoInicial
	 */
	public String getAnoPeriodoInicial() {
		return anoPeriodoInicial;
	}

	/**
	 * @param anoPeriodoInicial
	 *            the anoPeriodoInicial to set
	 */
	public void setAnoPeriodoInicial(String anoPeriodoInicial) {
		this.anoPeriodoInicial = anoPeriodoInicial;
	}

	/**
	 * @return the mesPeriodoFinal
	 */
	public String getMesPeriodoFinal() {
		return mesPeriodoFinal;
	}

	/**
	 * @param mesPeriodoFinal
	 *            the mesPeriodoFinal to set
	 */
	public void setMesPeriodoFinal(String mesPeriodoFinal) {
		this.mesPeriodoFinal = mesPeriodoFinal;
	}

	/**
	 * @return the anoPeriodoFinal
	 */
	public String getAnoPeriodoFinal() {
		return anoPeriodoFinal;
	}

	/**
	 * @param anoPeriodoFinal
	 *            the anoPeriodoFinal to set
	 */
	public void setAnoPeriodoFinal(String anoPeriodoFinal) {
		this.anoPeriodoFinal = anoPeriodoFinal;
	}

	/**
	 * @return the listaMunicipio
	 */
	public List<MunicipioISSDTO> getListaMunicipio() {
		return listaMunicipio;
	}

	/**
	 * @param listaMunicipio
	 *            the listaMunicipio to set
	 */
	public void setListaMunicipio(List<MunicipioISSDTO> listaMunicipio) {
		this.listaMunicipio = listaMunicipio;
	}

	/**
	 * @return the listaEmpresa
	 */
	public List<EmpresaISSDTO> getListaEmpresa() {
		return listaEmpresa;
	}

	/**
	 * @param listaEmpresa
	 *            the listaEmpresa to set
	 */
	public void setListaEmpresa(List<EmpresaISSDTO> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	/**
	 * @return the listaSaida
	 */
	public List<RelatorioSaidaISSDTO> getListaSaida() {
		return listaSaida;
	}

	/**
	 * @param listaSaida
	 *            the listaSaida to set
	 */
	public void setListaSaida(List<RelatorioSaidaISSDTO> listaSaida) {
		this.listaSaida = listaSaida;
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public void setCodEmpresa(Integer codEmpresaSelecionada) {
		this.codEmpresa = codEmpresaSelecionada;
	}

	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	
	
}