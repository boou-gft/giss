package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

/**
 * @author m82611
 *
 */
public class GerarBalanceteObrigacoesAcessoriasDTO {
	
	private List<SelectItem> listarEstadosBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listarMunicipiosBalancetes = new ArrayList<SelectItem>();
	private List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados = new ArrayList<ListarBalancetesParametrizadosSaidaDTO>();
	private List<SelectItem> listaControleBalancetesParametrizados = new ArrayList<SelectItem>();
	private Integer itemSelecionadoListarBalancetesParametrizados;
	private Long empresa = 0L;
	private String descEmpresa;
	private Integer estado;
	private Long codMunicipio;
	private Long municipio;
	private Integer periodoMesInicial;
	private Integer periodoAnoInicial;
	private Integer periodoMesAnoInicial;
	private Integer periodoMesFinal;
	private Integer periodoAnoFinal;
	private Integer periodoMesAnoFinal;
	private String fechadoSimulado;
	private boolean grupo7;
	private boolean grupo8;
	private boolean todosGrupos;
	private String condicaoIncluirExcluir;

	public List<SelectItem> getListarEstadosBalancetes() {
		return listarEstadosBalancetes;
	}

	public void setListarEstadosBalancetes(List<SelectItem> listarEstadosBalancetes) {
		this.listarEstadosBalancetes = listarEstadosBalancetes;
	}

	public Long getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}

	public Long getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public List<SelectItem> getListarMunicipiosBalancetes() {
		return listarMunicipiosBalancetes;
	}

	public void setListarMunicipiosBalancetes(
			List<SelectItem> listarMunicipiosBalancetes) {
		this.listarMunicipiosBalancetes = listarMunicipiosBalancetes;
	}

	public Integer getPeriodoMesInicial() {
		return periodoMesInicial;
	}

	public void setPeriodoMesInicial(Integer periodoMesInicial) {
		this.periodoMesInicial = periodoMesInicial;
	}

	public Integer getPeriodoAnoInicial() {
		return periodoAnoInicial;
	}

	public void setPeriodoAnoInicial(Integer periodoAnoInicial) {
		this.periodoAnoInicial = periodoAnoInicial;
	}

	public Integer getPeriodoMesFinal() {
		return periodoMesFinal;
	}

	public void setPeriodoMesFinal(Integer periodoMesFinal) {
		this.periodoMesFinal = periodoMesFinal;
	}

	public Integer getPeriodoAnoFinal() {
		return periodoAnoFinal;
	}

	public void setPeriodoAnoFinal(Integer periodoAnoFinal) {
		this.periodoAnoFinal = periodoAnoFinal;
	}

	public String getFechadoSimulado() {
		return fechadoSimulado;
	}

	public void setFechadoSimulado(String fechadoSimulado) {
		this.fechadoSimulado = fechadoSimulado;
	}

	public String getDescEmpresa() {
		return descEmpresa;
	}

	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	public boolean isGrupo7() {
		return grupo7;
	}

	public void setGrupo7(boolean grupo7) {
		this.grupo7 = grupo7;
	}

	public boolean isGrupo8() {
		return grupo8;
	}

	public void setGrupo8(boolean grupo8) {
		this.grupo8 = grupo8;
	}

	public boolean isTodosGrupos() {
		return todosGrupos;
	}

	public void setTodosGrupos(boolean todosGrupos) {
		this.todosGrupos = todosGrupos;
	}

	public List<ListarBalancetesParametrizadosSaidaDTO> getListarBalancetesParametrizados() {
		return listarBalancetesParametrizados;
	}

	public void setListarBalancetesParametrizados(
			List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados) {
		this.listarBalancetesParametrizados = listarBalancetesParametrizados;
	}

	public List<SelectItem> getListaControleBalancetesParametrizados() {
		return listaControleBalancetesParametrizados;
	}

	public void setListaControleBalancetesParametrizados(
			List<SelectItem> listaControleBalancetesParametrizados) {
		this.listaControleBalancetesParametrizados = listaControleBalancetesParametrizados;
	}

	public Integer getItemSelecionadoListarBalancetesParametrizados() {
		return itemSelecionadoListarBalancetesParametrizados;
	}

	public void setItemSelecionadoListarBalancetesParametrizados(
			Integer itemSelecionadoListarBalancetesParametrizados) {
		this.itemSelecionadoListarBalancetesParametrizados = itemSelecionadoListarBalancetesParametrizados;
	}

	public String getCondicaoIncluirExcluir() {
		return condicaoIncluirExcluir;
	}

	public void setCondicaoIncluirExcluir(String condicaoIncluirExcluir) {
		this.condicaoIncluirExcluir = condicaoIncluirExcluir;
	}

	public Integer getPeriodoMesAnoInicial() {
		return periodoMesAnoInicial;
	}

	public void setPeriodoMesAnoInicial(Integer periodoMesAnoInicial) {
		this.periodoMesAnoInicial = periodoMesAnoInicial;
	}

	public Integer getPeriodoMesAnoFinal() {
		return periodoMesAnoFinal;
	}

	public void setPeriodoMesAnoFinal(Integer periodoMesAnoFinal) {
		this.periodoMesAnoFinal = periodoMesAnoFinal;
	}
}