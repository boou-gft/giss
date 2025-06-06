package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.model.SelectItem;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ConsultarBalanceteFiscalizacoesIssDTO {
	
	private List<ListarPedidoBalancetesSaidaDTO> listarPedidoBalancetes = new ArrayList<ListarPedidoBalancetesSaidaDTO>();
	private List<ListaIntermediariaBalancetesSaidaDTO> listaIntermediariaBalancetes = new ArrayList<ListaIntermediariaBalancetesSaidaDTO>();
	private ListarBalancetesSaidaDTO listarBalancetes = new ListarBalancetesSaidaDTO();
	private List<SelectItem> listaControlePedidoBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleIntermediariaBalancetes = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleBalancetes = new ArrayList<SelectItem>();
	private Integer itemSelecionadoListaPedidoBalancetes;
	private Integer itemSelecionadoListaIntermediariaBalancetes;
	private Integer itemSelecionadoListaBalancetes;
	private String diretorioRelatorio;
	private Object lstPdf;
	private Integer[] itemBalanceteSelecionado = null;

	public List<ListarPedidoBalancetesSaidaDTO> getListarPedidoBalancetes() {
		return listarPedidoBalancetes;
	}
	public void setListarPedidoBalancetes(
			List<ListarPedidoBalancetesSaidaDTO> listarPedidoBalancetes) {
		this.listarPedidoBalancetes = listarPedidoBalancetes;
	}
	public List<SelectItem> getListaControlePedidoBalancetes() {
		return listaControlePedidoBalancetes;
	}
	public void setListaControlePedidoBalancetes(
			List<SelectItem> listaControlePedidoBalancetes) {
		this.listaControlePedidoBalancetes = listaControlePedidoBalancetes;
	}
	public ListarBalancetesSaidaDTO getListarBalancetes() {
		return listarBalancetes;
	}
	public void setListarBalancetes(ListarBalancetesSaidaDTO listarBalancetes) {
		this.listarBalancetes = listarBalancetes;
	}
	public List<SelectItem> getListaControleBalancetes() {
		return listaControleBalancetes;
	}
	public void setListaControleBalancetes(List<SelectItem> listaControleBalancetes) {
		this.listaControleBalancetes = listaControleBalancetes;
	}
	public List<ListaIntermediariaBalancetesSaidaDTO> getListaIntermediariaBalancetes() {
		return listaIntermediariaBalancetes;
	}
	public void setListaIntermediariaBalancetes(
			List<ListaIntermediariaBalancetesSaidaDTO> listaIntermediariaBalancetes) {
		this.listaIntermediariaBalancetes = listaIntermediariaBalancetes;
	}
	public List<SelectItem> getListaControleIntermediariaBalancetes() {
		return listaControleIntermediariaBalancetes;
	}
	public void setListaControleIntermediariaBalancetes(
			List<SelectItem> listaControleIntermediariaBalancetes) {
		this.listaControleIntermediariaBalancetes = listaControleIntermediariaBalancetes;
	}
	public Integer getItemSelecionadoListaPedidoBalancetes() {
		return itemSelecionadoListaPedidoBalancetes;
	}
	public void setItemSelecionadoListaPedidoBalancetes(
			Integer itemSelecionadoListaPedidoBalancetes) {
		this.itemSelecionadoListaPedidoBalancetes = itemSelecionadoListaPedidoBalancetes;
	}
	public Integer getItemSelecionadoListaIntermediariaBalancetes() {
		return itemSelecionadoListaIntermediariaBalancetes;
	}
	public void setItemSelecionadoListaIntermediariaBalancetes(
			Integer itemSelecionadoListaIntermediariaBalancetes) {
		this.itemSelecionadoListaIntermediariaBalancetes = itemSelecionadoListaIntermediariaBalancetes;
	}
	public Integer getItemSelecionadoListaBalancetes() {
		return itemSelecionadoListaBalancetes;
	}
	public void setItemSelecionadoListaBalancetes(
			Integer itemSelecionadoListaBalancetes) {
		this.itemSelecionadoListaBalancetes = itemSelecionadoListaBalancetes;
	}
	public Object getLstPdf() {
		return lstPdf;
	}
	public void setLstPdf(Object lstPdf) {
		this.lstPdf = new JRBeanCollectionDataSource((Collection) lstPdf);
	}
	public String getDiretorioRelatorio() {
		return diretorioRelatorio;
	}
	public void setDiretorioRelatorio(String diretorioRelatorio) {
		this.diretorioRelatorio = diretorioRelatorio;
	}
	public Integer[] getItemBalanceteSelecionado() {
		return itemBalanceteSelecionado;
	}
	public void setItemBalanceteSelecionado(Integer[] itemBalanceteSelecionado) {
		this.itemBalanceteSelecionado = itemBalanceteSelecionado;
	}
}