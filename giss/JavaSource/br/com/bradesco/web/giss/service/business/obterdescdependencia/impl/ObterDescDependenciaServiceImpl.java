package br.com.bradesco.web.giss.service.business.obterdescdependencia.impl;

import br.com.bradesco.web.giss.service.business.obterdescdependencia.IObterDescDependenciaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.bean.ItemDependencia;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.request.ObterDescDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse;

public class ObterDescDependenciaServiceImpl implements IObterDescDependenciaService{

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public ObterDescDependenciaServiceImpl() {
		// TODO: Implementação
	}
	
	public ItemDependencia obterDescDependencia(Long codEmpresa, Integer codDependencia) {
		ItemDependencia dep = new ItemDependencia();
		ObterDescDependenciaRequest request = new ObterDescDependenciaRequest();
		ObterDescDependenciaResponse response = null;

		request.setCodDependencia(codDependencia);
		request.setCodEmpresa(codEmpresa);
	
		response = getFactoryAdapter().getObterDescDependenciaPDCAdapter().invokeProcess(request);
		dep.setCodEmpresa(response.getCodEmpresa());
		dep.setCodDependencia(response.getCodDependencia());
		dep.setDesDependencia(response.getDesDependencia());
		dep.setNumSeqDependencia(response.getNumSeqDependencia());

		return dep;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

