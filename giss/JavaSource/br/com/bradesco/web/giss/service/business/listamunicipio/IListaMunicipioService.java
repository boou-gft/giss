package br.com.bradesco.web.giss.service.business.listamunicipio;

import java.util.List;

import br.com.bradesco.web.giss.service.business.listamunicipio.bean.ItemMunicipio;



public interface IListaMunicipioService {

    /**
     * Método de exemplo.
     * 
     * 
     */
	public ItemMunicipio buscarMunicipio(Long codigo, String estado);
	
	public List<ItemMunicipio> buscarMunicipio(Long codigo, String descricao, String estado);
}

