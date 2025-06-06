package br.com.bradesco.web.giss.service.business.listamunicipio.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.listamunicipio.IListaMunicipioService;
import br.com.bradesco.web.giss.service.business.listamunicipio.bean.ItemMunicipio;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipio.request.ListaMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ListaMunicipioServiceImpl implements Serializable, IListaMunicipioService {

	private static final long serialVersionUID = 1L;
	
	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public ListaMunicipioServiceImpl() {
		// TODO: Implementação
	}

	public ItemMunicipio buscarMunicipio(Long codigo, String estado) {
		List<ItemMunicipio> lista = buscarMunicipio(codigo, "", estado);
		return lista.size() == 0 ? new ItemMunicipio() : lista.get(0);
	}

	public List<ItemMunicipio> buscarMunicipio(Long codigo, String descricao, String estado) {
		descricao = GissUtil.notNull(descricao).toUpperCase();
		codigo = GissUtil.notNull(codigo);

		ListaMunicipioRequest request = new ListaMunicipioRequest();
		ListaMunicipioResponse response = null;
		ArrayList<ItemMunicipio> municipio = new ArrayList<ItemMunicipio>();
		
		request.setCodFuncao("C");
		request.setCodMunicipio(codigo);
		request.setDescMunicipio(descricao);
		request.setCodUf(estado);

		response = getFactoryAdapter().getListaMunicipioPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getQtdeRegistros(); i++) {
			ItemMunicipio itemMunicipio = new ItemMunicipio();
			OcorrenciasListaMunicipio ocorrencia = response.getOcorrenciasListaMunicipio(i);

			itemMunicipio.setCodigoMunicipio(ocorrencia.getCodMunicipioAgeo());
			itemMunicipio.setDescricaoMuncipio(ocorrencia.getDescMunicipio());
			itemMunicipio.setUf(ocorrencia.getSiglaEstado());
			municipio.add(itemMunicipio);
		}
		return municipio;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}
