/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/saldosdivergentes/impl/SaldosDivergentesServiceImpl.java,v $
 * $Id: SaldosDivergentesServiceImpl.java,v 1.1 2017/04/11 14:13:12 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: SaldosDivergentesServiceImpl.java,v $
 * Revision 1.1  2017/04/11 14:13:12  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:29  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:02  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.saldosdivergentes.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.ISaldosDivergServiceConstants;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.ISaldosDivergentesService;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteContaDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteContaTotalDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteDependenciaDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteDependenciaTotalDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.exceptions.SaldosDivergServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.IListarDependenciasSaldoDivergentePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse;
import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.IListaSaldosDivergentesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.request.ListaSaldosDivergentesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.ListaSaldosDivergentesResponse;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: SaldosDivergentes
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class SaldosDivergentesServiceImpl implements ISaldosDivergentesService {

	private FactoryAdapter factoryAdapter;


	public SaldoDivergenteContaTotalDTO listarSaldoDivergenteConta(String competencia) throws PdcAdapterException, SaldosDivergServiceException {

		ListaSaldosDivergentesRequest lRequest = new ListaSaldosDivergentesRequest();
		lRequest.setNumeroMaximoOcorrencias(ISaldosDivergServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_SALDO_DIVERGENTES_CONTA);
		lRequest.setCompetencia(Integer.parseInt(competencia));

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListaSaldosDivergentesPDCAdapter listaSaldosDivergentesPDCAdapter = factoryAdapter.getListaSaldosDivergentesPDCAdapter();
		ListaSaldosDivergentesResponse lResponse = listaSaldosDivergentesPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		SaldoDivergenteContaTotalDTO saldoDivergenteContaDTO = new SaldoDivergenteContaTotalDTO();
		saldoDivergenteContaDTO.setTotalApuracao(lResponse.getValorTotalApuracao());
		if ("-".equals(lResponse.getSinalTotalApuracao())) {
			saldoDivergenteContaDTO.setTotalApuracao(lResponse.getValorTotalApuracao().negate());
		}
		
		
		saldoDivergenteContaDTO.setTotalContabil(lResponse.getValorTotalContabil());
		if ("-".equals(lResponse.getSinalTotalContabil())) {
			saldoDivergenteContaDTO.setTotalContabil(lResponse.getValorTotalContabil().negate());
		}
		
		
		List<SaldoDivergenteContaDTO> listaSaldoDivergenteContaDTO = new ArrayList<SaldoDivergenteContaDTO>();
		int cont = 0;
		for(int i = 0; i < lResponse.getNumeroConsultas(); i++){
			SaldoDivergenteContaDTO saldoDivergenteConta = new SaldoDivergenteContaDTO();
			
			saldoDivergenteConta.setConta(lResponse.getOcorrencias(i).getCodigoContaContabil());
			saldoDivergenteConta.setDescricao(lResponse.getOcorrencias(i).getContaContabil());
			
			saldoDivergenteConta.setApuracao(lResponse.getOcorrencias(i).getValorApuracao());
			if ("-".equals(lResponse.getOcorrencias(i).getSinalApuracao())) {
				saldoDivergenteConta.setApuracao(lResponse.getOcorrencias(i).getValorApuracao().negate());
			}
			
			
			saldoDivergenteConta.setContabil(lResponse.getOcorrencias(i).getValorContabil());
			if ("-".equals(lResponse.getOcorrencias(i).getSinalContabil())) {
				saldoDivergenteConta.setContabil(lResponse.getOcorrencias(i).getValorContabil().negate());
			}
			
			saldoDivergenteConta.setLinha(cont++);
			listaSaldoDivergenteContaDTO.add(saldoDivergenteConta);

		}
		saldoDivergenteContaDTO.setListaSaldoDivergenteContaDTO(listaSaldoDivergenteContaDTO);

		return saldoDivergenteContaDTO;

	}


	public SaldoDivergenteDependenciaTotalDTO listarSaldoDivergenteDependencia (long conta,String competencia) throws PdcAdapterException, SaldosDivergServiceException {
	

		ListarDependenciasSaldoDivergenteRequest lRequest = new ListarDependenciasSaldoDivergenteRequest();
		lRequest.setNumeroMaximoOcorrencias(ISaldosDivergServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_SALDO_DIVERGENTES_CONTA);
		lRequest.setCodigoContaContabil(conta);
		lRequest.setCompetencia(Integer.parseInt(competencia));
		

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		IListarDependenciasSaldoDivergentePDCAdapter listaDependenciasSaldosDivergentesPDCAdapter = factoryAdapter.getListarDependenciasSaldoDivergentePDCAdapter();
		ListarDependenciasSaldoDivergenteResponse lResponse = listaDependenciasSaldosDivergentesPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		SaldoDivergenteDependenciaTotalDTO saldoDivergenteDependenciaTotalDTO = new SaldoDivergenteDependenciaTotalDTO();
		saldoDivergenteDependenciaTotalDTO.setTotalApuracao(lResponse.getValorTotalApuracao());
		if ("-".equals(lResponse.getSinalTotalApuracao())) {
			saldoDivergenteDependenciaTotalDTO.setTotalApuracao(lResponse.getValorTotalApuracao().negate());
		}
		
		saldoDivergenteDependenciaTotalDTO.setTotalContabil(lResponse.getValorTotalContabil());
		if ("-".equals(lResponse.getSinalTotalContabil())) {
			saldoDivergenteDependenciaTotalDTO.setTotalContabil(lResponse.getValorTotalContabil().negate());
		}
		
		
		List<SaldoDivergenteDependenciaDTO> listaSaldoDivergenteDTO = new ArrayList<SaldoDivergenteDependenciaDTO>();
		for(int i = 0; i < lResponse.getNumeroConsultas(); i++){
			
			SaldoDivergenteDependenciaDTO saldoDivergenteDependencia = new SaldoDivergenteDependenciaDTO();
			
			if(lResponse.getOcorrencias(i).getSinalApuracao().equals("-")){
				saldoDivergenteDependencia.setApuracao(lResponse.getOcorrencias(i).getValorApuracao().negate());				
			}
			else{
				saldoDivergenteDependencia.setApuracao(lResponse.getOcorrencias(i).getValorApuracao());
			}
			
			if(lResponse.getOcorrencias(i).getSinalContabil().equals("-")){
				saldoDivergenteDependencia.setContabil(lResponse.getOcorrencias(i).getValorContabil().negate());
			}
			
			else{
				saldoDivergenteDependencia.setContabil(lResponse.getOcorrencias(i).getValorContabil());
			}
			
			saldoDivergenteDependencia.setDependencia(lResponse.getOcorrencias(i).getCodigoDependencia());
			saldoDivergenteDependencia.setDescricao(lResponse.getOcorrencias(i).getDescricaoDependencia());
			listaSaldoDivergenteDTO.add(saldoDivergenteDependencia);
		}	
		saldoDivergenteDependenciaTotalDTO.setListaSaldoDivergenteDependenciaDTO(listaSaldoDivergenteDTO);
		return saldoDivergenteDependenciaTotalDTO;
			


	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

