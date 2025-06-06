package br.com.bradesco.web.giss.service.business.issempresa.bean;

import java.util.ArrayList;
import java.util.List;


public class ContasISSDTO {

	private Integer codEmpresa;
	private Long contaReceita;
	private String descContaReceita;
	private String descContaReceitaInc;
	private Long cosif;
	private String cosifExibicao;
	private Integer codItemServicoLC;
	private String descItemServicoLC;
	private Integer numConsul; 
	private Integer contaResumo;
	private List<ContasISSDTO> listaContas = new ArrayList<ContasISSDTO>();
	/**
	 * @return the codEmpresa
	 */
	public Integer getCodEmpresa() {
		return codEmpresa;
	}
	/**
	 * @param codEmpresa the codEmpresa to set
	 */
	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	/**
	 * @return the contaReceita
	 */
	public Long getContaReceita() {
		return contaReceita;
	}
	/**
	 * @param contaReceita the contaReceita to set
	 */
	public void setContaReceita(Long contaReceita) {
		this.contaReceita = contaReceita;
	}
	/**
	 * @return the descContaReceita
	 */
	public String getDescContaReceita() {
		return descContaReceita;
	}
	/**
	 * @param descContaReceita the descContaReceita to set
	 */
	public void setDescContaReceita(String descContaReceita) {
		this.descContaReceita = descContaReceita;
	}
	/**
	 * @return the cosif
	 */
	public Long getCosif() {
		return cosif;
	}
	/**
	 * @param cosif the cosif to set
	 */
	public void setCosif(Long cosif) {
		this.cosif = cosif;
	}
	/**
	 * @return the codItemServicoLC
	 */
	public Integer getCodItemServicoLC() {
		return codItemServicoLC;
	}
	/**
	 * @param codItemServicoLC the codItemServicoLC to set
	 */
	public void setCodItemServicoLC(Integer codItemServicoLC) {
		this.codItemServicoLC = codItemServicoLC;
	}
	/**
	 * @return the numConsul
	 */
	public Integer getNumConsul() {
		return numConsul;
	}
	/**
	 * @param numConsul the numConsul to set
	 */
	public void setNumConsul(Integer numConsul) {
		this.numConsul = numConsul;
	}
	/**
	 * @return the contaResumo
	 */
	public Integer getContaResumo() {
		return contaResumo;
	}
	/**
	 * @param contaResumo the contaResumo to set
	 */
	public void setContaResumo(Integer contaResumo) {
		this.contaResumo = contaResumo;
	}
	/**
	 * @return the listaContas
	 */
	public List<ContasISSDTO> getListaContas() {
		return listaContas;
	}
	/**
	 * @param listaContas the listaContas to set
	 */
	public void setListaContas(List<ContasISSDTO> listaContas) {
		this.listaContas = listaContas;
	}
	/**
	 * @return the descItemServicoLC
	 */
	public String getDescItemServicoLC() {
		return descItemServicoLC;
	}
	/**
	 * @param descItemServicoLC the descItemServicoLC to set
	 */
	public void setDescItemServicoLC(String descItemServicoLC) {
		this.descItemServicoLC = descItemServicoLC;
	}
	/**
	 * @return the cosifExibicao
	 */
	public String getCosifExibicao() {
		return cosifExibicao;
	}
	/**
	 * @param cosifExibicao the cosifExibicao to set
	 */
	public void setCosifExibicao(String cosifExibicao) {
		this.cosifExibicao = cosifExibicao;
	}
	/**
	 * @return the descContaReceitaInc
	 */
	public String getDescContaReceitaInc() {
		return descContaReceitaInc;
	}
	/**
	 * @param descContaReceitaInc the descContaReceitaInc to set
	 */
	public void setDescContaReceitaInc(String descContaReceitaInc) {
		this.descContaReceitaInc = descContaReceitaInc;
	}



}