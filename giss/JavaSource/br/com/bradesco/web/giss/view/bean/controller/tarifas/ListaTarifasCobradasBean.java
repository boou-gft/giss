package br.com.bradesco.web.giss.view.bean.controller.tarifas;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;


public class ListaTarifasCobradasBean {
	
	private List<ListaGenericaVO> lista;
	private boolean checkTodosIncluir;	
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	
	public String iniciaTela(){
		listaControleCheckRadio = new ArrayList<SelectItem>();
		checkTodosIncluir = false;
		lista = new ArrayList<ListaGenericaVO>();
		
		return "listaTarifasCobradas";
	}

	// GETTERS AND SETTERS
	public List<ListaGenericaVO> getLista() {
		return lista;
	}

	public void setLista(List<ListaGenericaVO> lista) {
		this.lista = lista;
	}

	public boolean isCheckTodosIncluir() {
		return checkTodosIncluir;
	}

	public void setCheckTodosIncluir(boolean checkTodosIncluir) {
		this.checkTodosIncluir = checkTodosIncluir;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

}
