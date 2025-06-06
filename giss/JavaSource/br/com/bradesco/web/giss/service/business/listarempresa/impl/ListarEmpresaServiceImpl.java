package br.com.bradesco.web.giss.service.business.listarempresa.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.service.business.listarempresa.bean.ItemEmpresa;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarempresa.response.ListarEmpresaResponse;
import br.com.bradesco.web.giss.utils.Formatacao;

public class ListarEmpresaServiceImpl implements IListarEmpresaService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public ListarEmpresaServiceImpl() {
		// TODO: Implementação
	}

	public List<SelectItem> carregarComboEmpresa() {
		List<SelectItem> empresas = new ArrayList<SelectItem>();
		List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
		ItemEmpresa empresa;

		ListarEmpresaRequest request = new ListarEmpresaRequest();
		ListarEmpresaResponse response = null;

		request.setCodigoEmpresa("");
		response = getFactoryAdapter().getListarEmpresaPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			empresa = new ItemEmpresa();
			if (response.getOcorrencias(i).getCodigoPessoaJuridica() == 2269651L) {
				empresa.setCodigoEmpresaS(Formatacao.formataZerosEsquerda(String.valueOf(response.getOcorrencias(i).getCodigoPessoaJuridica()), 10));
				String nome = response.getOcorrencias(i).getNomeEmpresa() + "                                         ";
				empresa.setNomeEmpresa(nome.substring(0, 40));
				listaEmpresa.add(new SelectItem(empresa.getCodigoEmpresaS(), empresa.getCodigoEmpresaS() + " - " + empresa.getNomeEmpresa()));
			} else {
				empresa.setCodigoEmpresaS(Formatacao.formataZerosEsquerda(String.valueOf(response.getOcorrencias(i).getCodigoPessoaJuridica()), 10));
				String nome = response.getOcorrencias(i).getNomeEmpresa() + "                                         ";
				empresa.setNomeEmpresa(nome.substring(0, 40));
				empresas.add(new SelectItem(empresa.getCodigoEmpresaS(), empresa.getCodigoEmpresaS() + " - " + empresa.getNomeEmpresa()));
			}
		}
		Collections.sort(empresas, new Comparator<SelectItem>() {
			public int compare(SelectItem item1, SelectItem item2) {
				return item1.getValue().toString().compareTo(item2.getValue().toString());
			}
		});
		for (int i = 1; i < empresas.size(); i++) {
			listaEmpresa.add(empresas.get(i));
		}

		return listaEmpresa;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}
