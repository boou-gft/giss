package br.com.bradesco.web.giss.service.business.parametrizardependencia.impl;

import br.com.bradesco.web.giss.service.business.parametrizacaodependencia.bean.ParametrizacaoDepDTO;
import br.com.bradesco.web.giss.service.business.parametrizardependencia.IParametrizarDependenciaService;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepalterar.IParametrizacaoDepAlterarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepalterar.request.ParametrizacaoDepAlterarRequest;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepalterar.response.ParametrizacaoDepAlterarResponse;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.IParametrizacaoDepConsultarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.request.ParametrizacaoDepConsultarRequest;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.response.ParametrizacaoDepConsultarResponse;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepexcluir.IParametrizacaoDepExcluirPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepexcluir.request.ParametrizacaoDepExcluirRequest;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepexcluir.response.ParametrizacaoDepExcluirResponse;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.IParametrizacaoDepIncluirPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.response.ParametrizacaoDepIncluirResponse;

public class ParametrizarDependenciaServiceImpl implements IParametrizarDependenciaService{
	
	private FactoryAdapter factoryAdapter;

	public ParametrizacaoDepDTO inserirParametrizacao(Long codMunicipio, Long codEmpresa, Integer codDependencia, String chavePrivada, String urlMunicipio) {
		
		ParametrizacaoDepIncluirRequest request = new ParametrizacaoDepIncluirRequest();
		request.setETipoDeManutenceo("I");
		request.setECmunBacen(codMunicipio);
		request.setECpssoaJurid(codEmpresa);
		request.setENseqUndOrgnz(codDependencia);
		request.setECchaveSegrcPreft(chavePrivada);
		request.setEEurlPreftMun(urlMunicipio);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IParametrizacaoDepIncluirPDCAdapter parametrizacaoDepIncluirPDCAdapter = factoryAdapter.getParametrizacaoDepIncluirPDCAdapter();
		ParametrizacaoDepIncluirResponse response = parametrizacaoDepIncluirPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		ParametrizacaoDepDTO dto = new ParametrizacaoDepDTO(); 
		dto.setCodMensagem(response.getCodMensagem());
		dto.setMensagem(response.getMensagem());
		
		return dto;
	}
	
	public ParametrizacaoDepDTO consultarParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg) {
		
		ParametrizacaoDepConsultarRequest request = new ParametrizacaoDepConsultarRequest();
		request.setETipoDeManutencao("C");
		request.setECmunBacen(codMunicipio);
		request.setECpssoaJurid(codEmpresa);
		request.setENseqUndOrgnz(nSeqUnOrg);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IParametrizacaoDepConsultarPDCAdapter parametrizacaoDepConsultarPDCAdapter = factoryAdapter.getParametrizacaoDepConsultarPDCAdapter();
		ParametrizacaoDepConsultarResponse response = parametrizacaoDepConsultarPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		ParametrizacaoDepDTO dto = new ParametrizacaoDepDTO(); 
		dto.setChaveSeguranca(response.getSCchaveSegrcPreft());
		dto.setUrl(response.getGISSW04SEURLPREFTMUN());
		dto.setCodMensagem(response.getCodMensagem());
		dto.setMensagem(response.getMensagem());
		
		return dto;
		
	}
	
	public ParametrizacaoDepDTO alterarParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg, String chavePrivada, String urlMunicipio) {
		
		ParametrizacaoDepAlterarRequest request = new ParametrizacaoDepAlterarRequest();
		request.setETipoDeManutencao("A");
		request.setECmunBacen(codMunicipio);
		request.setECpssoaJurid(codEmpresa);
		request.setENseqUndOrgnz(nSeqUnOrg);
		request.setECchaveSegrcPreft(chavePrivada);
		request.setEEurlPreftMun(urlMunicipio);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IParametrizacaoDepAlterarPDCAdapter parametrizacaoDepAlterarPDCAdapter = factoryAdapter.getParametrizacaoDepAlterarPDCAdapter();
		ParametrizacaoDepAlterarResponse response = parametrizacaoDepAlterarPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		ParametrizacaoDepDTO dto = new ParametrizacaoDepDTO(); 
		dto.setCodMensagem(response.getCodMensagem());
		dto.setMensagem(response.getMensagem());
		
		return dto;
	}
	
	public ParametrizacaoDepDTO excluirParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg) {
		
		ParametrizacaoDepExcluirRequest request = new ParametrizacaoDepExcluirRequest();
		request.setETipoDeManutencao("E");
		request.setECmunBacen(codMunicipio);
		request.setECpssoaJurid(codEmpresa);
		request.setENseqUndOrgnz(nSeqUnOrg);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IParametrizacaoDepExcluirPDCAdapter parametrizacaoDepExcluirPDCAdapter = factoryAdapter.getParametrizacaoDepExcluirPDCAdapter();
		ParametrizacaoDepExcluirResponse response = parametrizacaoDepExcluirPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		ParametrizacaoDepDTO dto = new ParametrizacaoDepDTO(); 
		dto.setCodMensagem(response.getCodMensagem());
		dto.setMensagem(response.getMensagem());
		
		return dto;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
}
