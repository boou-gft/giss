package br.com.bradesco.web.giss.service.business.issprocessarpagto.impl;

import static br.com.bradesco.web.giss.utils.GissUtil.notNull;

import java.math.BigDecimal;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.IProcessarPagtoISSService;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.bean.ProcessarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.exception.ProcessarPagtoISServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.request.ConsultarProcessarContabilidadeRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse;
import br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade;
import br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest;
import br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.ProcessarContabilidadeResponse;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ProcessarPagtoISSServiceImpl implements IProcessarPagtoISSService{
	private FactoryAdapter factoryAdapter;

	/**
	 * @return the factoryAdapter
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public ProcessarPagtoISSDTO ListaConsultarProcessar(ProcessarPagtoISSDTO dto)throws PdcAdapterException, ProcessarPagtoISServiceException {
		
		ConsultarProcessarContabilidadeRequest request = new ConsultarProcessarContabilidadeRequest();
		
		request.setAnoMes(0);
		request.setMaxOcorrencias(99);
		
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		ConsultarProcessarContabilidadeResponse response = factoryAdapter.getConsultarProcessarContabilidadePDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		int numConsul = 0;
		for (int i = 0; i < response.getListaConsultarProcessarContabilidadeCount(); i++) {
			ProcessarPagtoISSDTO dtoLocal = new ProcessarPagtoISSDTO();
			if(response.getListaConsultarProcessarContabilidade(i).getCodEmpresa() != 0){
				dtoLocal.setCodEmpresa(response.getListaConsultarProcessarContabilidade(i).getCodEmpresa());
				dtoLocal.setProduto(response.getListaConsultarProcessarContabilidade(i).getProduto());
				dtoLocal.setAnoMes(response.getListaConsultarProcessarContabilidade(i).getAnoMes());
				dtoLocal.setDataRecepcao(response.getListaConsultarProcessarContabilidade(i).getDataRecepcao());
				dtoLocal.setQtdeRegistro(response.getListaConsultarProcessarContabilidade(i).getQtdRegistros());
				dtoLocal.setCodIdenticacaoTransIss(response.getListaConsultarProcessarContabilidade(i).getDescEspresa());
				dtoLocal.setNApurcIssEmpresa(response.getListaConsultarProcessarContabilidade(i).getNapurcIssEmpresa());
				dtoLocal.setValorReceita(response.getListaConsultarProcessarContabilidade(i).getValorReceita());
				dtoLocal.setNumConsul(numConsul++);
				dto.getLista().add(dtoLocal);
			}
			
		}
		return dto;
	}
	
	
	public String BotaoConsultarProcessar(ProcessarPagtoISSDTO dto) throws PdcAdapterException,ProcessarPagtoISServiceException {
		
		ProcessarContabilidadeRequest request = new ProcessarContabilidadeRequest();
		
		request.setIndContabilizar(GissUtil.notNull(dto.getIndContabilizar()));
		request.setNumConsultas(100);
		
		ListaProcessarContabilidade[] lista = new ListaProcessarContabilidade[100];

		for (int i = 0; i < 100; i++) {
			ListaProcessarContabilidade dtoBotao = new ListaProcessarContabilidade();
			if (i < dto.getLista().size()) {
				dtoBotao.setAnoMes(notNull(dto.getLista().get(i).getAnoMes()));
				dtoBotao.setCodEmpresa(notNull(dto.getLista().get(i).getCodEmpresa()));
				dtoBotao.setCodIdentificadorTransIss(notNull(dto.getLista().get(i).getCodIdenticacaoTransIss()));
				dtoBotao.setNApurcIssEmpresa(notNull(dto.getLista().get(i).getNApurcIssEmpresa()));
				dtoBotao.setProducao(notNull(dto.getLista().get(i).getProduto()));
				dtoBotao.setDataRecepcao(notNull(dto.getLista().get(i).getDataRecepcao()));
				dtoBotao.setQtdRegistros(notNull(dto.getLista().get(i).getQtdeRegistro()));
				dtoBotao.setValorReceita(notNull(dto.getLista().get(i).getValorReceita()));
			}else{
				dtoBotao.setAnoMes(0);
				dtoBotao.setCodEmpresa(0);
				dtoBotao.setCodIdentificadorTransIss(0);
				dtoBotao.setNApurcIssEmpresa(0);
				dtoBotao.setProducao("");
				dtoBotao.setDataRecepcao("");
				dtoBotao.setQtdRegistros(0L);
				dtoBotao.setValorReceita(new BigDecimal(0));
			}
			lista[i] = dtoBotao;
		}
		request.setListaProcessarContabilidade(lista);
		/* **************************
		 * INVOCA PROCESSO PDC * *************************
		 */
		ProcessarContabilidadeResponse response = factoryAdapter.getProcessarContabilidadePDCAdapter().invokeProcess(request);
		/* **************************
		 * RESULTADO DA CONSULTA * *************************
		 */
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	

}
