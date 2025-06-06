package br.com.bradesco.web.giss.service.business.issitemservicolc.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ItemServicoLcISSDTO {

	private Integer codItemLc;
	private String codItemLcFormatado;
	private String descItemLc;
	private Integer numConsul;
	private String status;
	private String codFuncional;
	private String dataHoraManutencao;
	private String dataHoraManutencaoFormatada;
	private String codIndTipoManutencao;
	private String dataInicioVigencia;
	private String dataFimVigencia;
	
	private Integer codItemLcAnterior;
	private String codItemLcFormatadoAnterior;
	private String descItemLcAnterior;
	private String statusAnterior;
	private String codFuncionalAnterior;
	private String dataHoraManutencaoAnterior;
	private String codIndTipoManutencaoAnterior;
	private String dataInicioVigenciaAnterior;
	private String dataFimVigenciaAnterior;
    
	private List<ItemServicoLcISSDTO> lista = new ArrayList<ItemServicoLcISSDTO>();
	
	/**
	 * @return the codItemLc
	 */
	public Integer getCodItemLc() {
		return codItemLc;
	}
	/**
	 * @param codItemLc the codItemLc to set
	 */
	public void setCodItemLc(Integer codItemLc) {
		this.codItemLc = codItemLc;
	}
	/**
	 * @return the descItemLc
	 */
	public String getDescItemLc() {
		return descItemLc;
	}
	/**
	 * @param descItemLc the descItemLc to set
	 */
	public void setDescItemLc(String descItemLc) {
		this.descItemLc = descItemLc;
	}
	/**
	 * @return the lista
	 */
	public List<ItemServicoLcISSDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<ItemServicoLcISSDTO> lista) {
		this.lista = lista;
	}
	/**
	 * @return the codItemLcFormatado
	 */
	public String getCodItemLcFormatado() {
		return codItemLcFormatado;
	}
	/**
	 * @param codItemLcFormatado the codItemLcFormatado to set
	 */
	public void setCodItemLcFormatado(String codItemLcFormatado) {
		this.codItemLcFormatado = codItemLcFormatado;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCodFuncional() {
		return codFuncional;
	}
	public void setCodFuncional(String codFuncional) {
		this.codFuncional = codFuncional;
	}
	/**
	 * @return the dataHoraManutencao
	 */
	public String getDataHoraManutencao() {
		return dataHoraManutencao;
	}
	/**
	 * @param dataHoraManutencao the dataHoraManutencao to set
	 */
	public void setDataHoraManutencao(String dataHoraManutencao) {
		this.dataHoraManutencao = dataHoraManutencao;
	}
	/**
	 * @return the codIndTipoManutencao
	 */
	public String getCodIndTipoManutencao() {
		return codIndTipoManutencao;
	}
	/**
	 * @param codIndTipoManutencao the codIndTipoManutencao to set
	 */
	public void setCodIndTipoManutencao(String codIndTipoManutencao) {
		this.codIndTipoManutencao = codIndTipoManutencao;
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
	/**
	 * @return the dataFimVigencia
	 */
	public String getDataFimVigencia() {
		return dataFimVigencia;
	}
	/**
	 * @param dataFimVigencia the dataFimVigencia to set
	 */
	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}
	/**
	 * @return the descItemLcAnterior
	 */
	public String getDescItemLcAnterior() {
		return descItemLcAnterior;
	}
	/**
	 * @param descItemLcAnterior the descItemLcAnterior to set
	 */
	public void setDescItemLcAnterior(String descItemLcAnterior) {
		this.descItemLcAnterior = descItemLcAnterior;
	}
	/**
	 * @return the statusAnterior
	 */
	public String getStatusAnterior() {
		return statusAnterior;
	}
	/**
	 * @param statusAnterior the statusAnterior to set
	 */
	public void setStatusAnterior(String statusAnterior) {
		this.statusAnterior = statusAnterior;
	}
	/**
	 * @return the codFuncionalAnterior
	 */
	public String getCodFuncionalAnterior() {
		return codFuncionalAnterior;
	}
	/**
	 * @param codFuncionalAnterior the codFuncionalAnterior to set
	 */
	public void setCodFuncionalAnterior(String codFuncionalAnterior) {
		this.codFuncionalAnterior = codFuncionalAnterior;
	}
	/**
	 * @return the dataHoraManutencaoAnterior
	 */
	public String getDataHoraManutencaoAnterior() {
		return dataHoraManutencaoAnterior;
	}
	/**
	 * @param dataHoraManutencaoAnterior the dataHoraManutencaoAnterior to set
	 */
	public void setDataHoraManutencaoAnterior(String dataHoraManutencaoAnterior) {
		this.dataHoraManutencaoAnterior = dataHoraManutencaoAnterior;
	}
	/**
	 * @return the codIndTipoManutencaoAnterior
	 */
	public String getCodIndTipoManutencaoAnterior() {
		return codIndTipoManutencaoAnterior;
	}
	/**
	 * @param codIndTipoManutencaoAnterior the codIndTipoManutencaoAnterior to set
	 */
	public void setCodIndTipoManutencaoAnterior(String codIndTipoManutencaoAnterior) {
		this.codIndTipoManutencaoAnterior = codIndTipoManutencaoAnterior;
	}
	/**
	 * @return the dataInicioVigenciaAnterior
	 */
	public String getDataInicioVigenciaAnterior() {
		return dataInicioVigenciaAnterior;
	}
	/**
	 * @param dataInicioVigenciaAnterior the dataInicioVigenciaAnterior to set
	 */
	public void setDataInicioVigenciaAnterior(String dataInicioVigenciaAnterior) {
		this.dataInicioVigenciaAnterior = dataInicioVigenciaAnterior;
	}
	/**
	 * @return the dataFimVigenciaAnterior
	 */
	public String getDataFimVigenciaAnterior() {
		return dataFimVigenciaAnterior;
	}
	/**
	 * @param dataFimVigenciaAnterior the dataFimVigenciaAnterior to set
	 */
	public void setDataFimVigenciaAnterior(String dataFimVigenciaAnterior) {
		this.dataFimVigenciaAnterior = dataFimVigenciaAnterior;
	}
	/**
	 * @return the codItemLcAnterior
	 */
	public Integer getCodItemLcAnterior() {
		return codItemLcAnterior;
	}
	/**
	 * @param codItemLcAnterior the codItemLcAnterior to set
	 */
	public void setCodItemLcAnterior(Integer codItemLcAnterior) {
		this.codItemLcAnterior = codItemLcAnterior;
	}
	/**
	 * @return the codItemLcFormatadoAnterior
	 */
	public String getCodItemLcFormatadoAnterior() {
		return codItemLcFormatadoAnterior;
	}
	/**
	 * @param codItemLcFormatadoAnterior the codItemLcFormatadoAnterior to set
	 */
	public void setCodItemLcFormatadoAnterior(String codItemLcFormatadoAnterior) {
		this.codItemLcFormatadoAnterior = codItemLcFormatadoAnterior;
	}
	/**
	 * @return the dataHoraManutencaoFormatada
	 */
	public String getDataHoraManutencaoFormatada() {
		return dataHoraManutencaoFormatada;
	}
	/**
	 * @param dataHoraManutencaoFormatada the dataHoraManutencaoFormatada to set
	 */
	public void setDataHoraManutencaoFormatada(String dataHoraManutencaoFormatada) {
		this.dataHoraManutencaoFormatada = dataHoraManutencaoFormatada;
	}
	/**
	 * @return the descStatus
	 */
	public String getDescStatus() {
		return GissUtil.notNull(status).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(status).equalsIgnoreCase("I")?"Inativo":"";
	}
	
	public String getDescStatusAnterior() {
		return GissUtil.notNull(statusAnterior).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(statusAnterior).equalsIgnoreCase("I")?"Inativo":"";
	}
	
}
