package br.com.bradesco.web.giss.view.bean.controller.generico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @author renato.mariscal@brq.com
 *
 *Bean Generico com os dados necessarios dos filtros:
 * Estado/Municipio,Empresa
 * 
 */
public abstract class FiltroGenericoGISSBean implements Serializable, BuscaMunicipioCallback {
	private static final long serialVersionUID = 1L;
	protected BuscaMunicipioBean buscaMunicipio;
	protected List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	protected String indiceComboEmpresaFiltro;
	protected List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	protected Integer codDepFiltro;
	protected IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	protected String estadoFiltro;
	protected List<SelectItem> listaEstados;
	protected IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");


	/**
	 * Essa funcao precisa ser chamada na inicializacao do Bean 
	 * Na chamada que vem do menu.
	 */
	protected void inicializaFiltroGenerico(){
		estadoFiltro="";
		codDepFiltro=null;
		buscaMunicipio=new BuscaMunicipioBean();
		carregaComboEstados();
		listaEstados=dependenciaImpl.listarComboEstados();
		listaEmpresa=listarEmpresaServiceImpl.carregarComboEmpresa();
	}

	/**
	 * Implementacao do retorno da busca de municipio
	 */
	public void processa() {
		estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
	}
	/**
	 * Carrega o combo de estados
	 * @return
	 */
	public void carregaComboEstados() {
		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}

	public void buscaMunicipioManter(){
		buscaMunicipio(estadoFiltro);
	}
	
	public void buscaMunicipio(String estado){
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(estado.equals(listaDosEstados.get(i).getCodigo())){
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(GissUtil.notNull(uf));
		buscaMunicipio.buscar();

	}
	
	/*Getters e Setters*/
	public final BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}
	public final void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}
	public final List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}
	public final void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}
	public final String getIndiceComboEmpresaFiltro() {
		return indiceComboEmpresaFiltro;
	}
	public final void setIndiceComboEmpresaFiltro(String indiceComboEmpresaFiltro) {
		this.indiceComboEmpresaFiltro = indiceComboEmpresaFiltro;
	}
	public final List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}
	public final void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}
	public final Integer getCodDepFiltro() {
		return codDepFiltro;
	}
	public final void setCodDepFiltro(Integer codDepFiltro) {
		this.codDepFiltro = codDepFiltro;
	}
	public final IListarEmpresaService getListarEmpresaServiceImpl() {
		return listarEmpresaServiceImpl;
	}
	public final void setListarEmpresaServiceImpl(IListarEmpresaService listarEmpresaServiceImpl) {
		this.listarEmpresaServiceImpl = listarEmpresaServiceImpl;
	}

	public  final String getEstadoFiltro() {
		return estadoFiltro;
	}

	public  final void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public  final List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public  final void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public  final IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public  final void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
	}

}
