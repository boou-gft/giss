package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.faces.model.SelectItem;

public class ApuracaoDetalhamentoDependencia {

	private String mesCompetenciaFiltro;
	private String dependencia;
	private String descricao;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;
	private BigDecimal totalMovimento;
	private BigDecimal totalISS;
	private BigDecimal totalTributavel;
	private boolean razaoExiste = true;
	private Integer linha;
	private List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> listaApuracaoMensalTotalizada;
	private List<SelectItem> listaControleCheckRadioConta;
	
	public String getMesCompetenciaFiltro() {
		return mesCompetenciaFiltro;
	}
	public void setMesCompetenciaFiltro(String mesCompetenciaFiltro) {
		this.mesCompetenciaFiltro = mesCompetenciaFiltro;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getBaseCalculo() {
		return baseCalculo;
	}
	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}
	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}
	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}
	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> getListaApuracaoMensalTotalizada() {
		return listaApuracaoMensalTotalizada;
	}
	public void setListaApuracaoMensalTotalizada(
			List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> listaApuracaoMensalTotalizada) {
		this.listaApuracaoMensalTotalizada = listaApuracaoMensalTotalizada;
	}
	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}
	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}
	public BigDecimal getTotalISS() {
		return totalISS;
	}
	public void setTotalISS(BigDecimal totalISS) {
		this.totalISS = totalISS;
	}
	public BigDecimal getTotalTributavel() {
		return totalTributavel;
	}
	public void setTotalTributavel(BigDecimal totalTributavel) {
		this.totalTributavel = totalTributavel;
	}
	
    public boolean getRazaoExiste() {
        return razaoExiste;
    }

    public void setRazaoExiste(boolean razaoExiste) {
        this.razaoExiste = razaoExiste;
    }
	/**
	 * @return the listaControleCheckRadioConta
	 */
	public List<SelectItem> getListaControleCheckRadioConta() {
		return listaControleCheckRadioConta;
	}
	/**
	 * @param listaControleCheckRadioConta the listaControleCheckRadioConta to set
	 */
	public void setListaControleCheckRadioConta(List<SelectItem> listaControleCheckRadioConta) {
		this.listaControleCheckRadioConta = listaControleCheckRadioConta;
	}
	/**
	 * @return the linha
	 */
	public Integer getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(Integer linha) {
		this.linha = linha;
	}

}
