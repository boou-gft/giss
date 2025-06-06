package br.com.bradesco.web.giss.view.bean.filtro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.listamunicipio.IListaMunicipioService;
import br.com.bradesco.web.giss.service.business.listamunicipio.bean.ItemMunicipio;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.utils.GissUtil;

/**
 * Bean referente à busca de Municipios
 * 
 * @author Gian
 * 
 */
public class BuscaMunicipioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	IListaMunicipioService listaMunicipioServiceImpl = (IListaMunicipioService) FacesUtils.getManagedBean("listaMunicipioServiceImpl");
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	private Integer selecionado;
	private Long codigo;
	private String descricao = "";
	private String estado;
	private List<ItemMunicipio> lista;
	private ListDataModel data;
	private List<SelectItem> selectItems = new ArrayList<SelectItem>();
	private boolean exibir = false;
	private BuscaMunicipioCallback callback;
	private String uf;
	private Long codigoPa;

	public void buscar() {
		buscar(null);
	}

	public void buscar(ActionEvent e) {
		exibir = false;
		if (codigo != null && codigo !=0) {
			ItemMunicipio itemMunicipio = listaMunicipioServiceImpl.buscarMunicipio(codigo, GissUtil.notNull(estado));
			carregar(itemMunicipio);
		} else {
			listar(e);
			exibir = true;
		}
	}
	
	public void listar(ActionEvent e) {
		if (estado != null && !estado.equals("")) {
			lista = listaMunicipioServiceImpl.buscarMunicipio(codigo, descricao, estado);
		} else {
			lista = listaMunicipioServiceImpl.buscarMunicipio(codigo, descricao, "");
		}
		data = new ListDataModel(lista);
		selectItems = GissUtil.criarSelectItemList(lista.size(), 0);
	}
	
	
	/*
	 * ************************** ISS GERENCIAL ************************* 
	 */
	public void buscarISS() {
		buscarISS(null);
	}
	public void buscarISS(ActionEvent e) {
		exibir = false;
		if (codigo != null && codigo !=0) {
			ItemMunicipio itemMunicipio = utilidadesServiceImpl.consultaLupaMunicipio(codigo, GissUtil.notNull(estado));
			carregar(itemMunicipio);
		} else {
			listarISS(e);
			exibir = true;
		}
	}
	
	public void listarISS(ActionEvent e) {
		if (estado != null && !estado.equals("")) {
			lista = utilidadesServiceImpl.consultaLupaMunicipio(codigo, descricao, estado);
		} else {
			lista = utilidadesServiceImpl.consultaLupaMunicipio(codigo, descricao, "");
		}
		data = new ListDataModel(lista);
		selectItems = GissUtil.criarSelectItemList(lista.size(), 0);
	}
	/*
	 * ************************** FINAL ************************* 
	 */
	
	public void cancelar() {
		exibir = false;
	}

	public void selecionar() {
		if (selecionado != null)
			carregar(lista.get(selecionado));
		else 
			return;
		exibir = false;
	}

	private void carregar(ItemMunicipio itemMunicipio) {
		codigo = itemMunicipio.getCodigoMunicipio();
		descricao = itemMunicipio.getDescricaoMuncipio();
		uf = itemMunicipio.getUf();
		if (callback != null) {
			callback.processa();
		}
	}

	/* Getters e Setters */
	public Integer getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(Integer selecionado) {
		this.selecionado = selecionado;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ItemMunicipio> getLista() {
		return lista;
	}

	public void setLista(List<ItemMunicipio> lista) {
		this.lista = lista;
	}

	public boolean isExibir() {
		return exibir;
	}

	public void setExibir(boolean exibir) {
		this.exibir = exibir;
	}

	public ListDataModel getData() {
		return data;
	}

	public void setData(ListDataModel data) {
		this.data = data;
	}

	public List<SelectItem> getSelectItems() {
		return selectItems;
	}

	public void setSelectItems(List<SelectItem> selectItems) {
		this.selectItems = selectItems;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public BuscaMunicipioCallback getCallback() {
		return callback;
	}

	public void setCallback(BuscaMunicipioCallback callback) {
		this.callback = callback;
	}

	public Long getCodigoPa() {
		return codigoPa;
	}

	public void setCodigoPa(Long codigoPa) {
		this.codigoPa = codigoPa;
	}

}
