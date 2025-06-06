/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/contasnaoconstantesbase/impl/ContasNaoConstBaseServiceImpl.java,v $
 * $Id: ContasNaoConstBaseServiceImpl.java,v 1.1 2017/04/11 14:13:25 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ContasNaoConstBaseServiceImpl.java,v $
 * Revision 1.1  2017/04/11 14:13:25  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:43  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.IConNaoConstBaseServiceConstants;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.IContasNaoConstantesBaseService;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.bean.ContasNaoConstantesBaseDTO;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.exceptions.ConNaoConstBaseServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.IListarContasNaoConstantesBasePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.request.ListarContasNaoConstantesBaseRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.ListarContasNaoConstantesBaseResponse;
import br.com.bradesco.web.giss.utils.GissUtil;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: Contasnaoconstantesbase
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ContasNaoConstBaseServiceImpl implements IContasNaoConstantesBaseService {
	
	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ContasNaoConstBaseServiceImpl() {
        // TODO: Implementação
    }
    
    /**
     * Método de exemplo.
     *
     * @see br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.IContasnaoconstantesbase#sampleContasnaoconstantesbase()
     */
    public void sampleContasnaoconstantesbase() {
        // TODO: Implementaçao
    }

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	
	
	public List<ContasNaoConstantesBaseDTO> listarContasNaoConstantesBase() throws PdcAdapterException, ConNaoConstBaseServiceException {
		
		
		List<ContasNaoConstantesBaseDTO> listaContas = new ArrayList<ContasNaoConstantesBaseDTO>();
		ListarContasNaoConstantesBaseRequest IRequest = new ListarContasNaoConstantesBaseRequest();
		IRequest.setNumeroMaximoOcorrencia(IConNaoConstBaseServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONTAS_NAO_CONSTANTES_BASE);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarContasNaoConstantesBasePDCAdapter listaContasPDCAdapter = factoryAdapter.getListarContasNaoConstantesBasePDCAdapter();
		ListarContasNaoConstantesBaseResponse IResponse = listaContasPDCAdapter.invokeProcess(IRequest);
		
		GissUtil gissUtil = new GissUtil();

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		
		for(int i = 0; i < IResponse.getNumeroConsultas(); i++){
			ContasNaoConstantesBaseDTO contasNaoConstantesBaseLista = new ContasNaoConstantesBaseDTO();
			
			contasNaoConstantesBaseLista.setConta(GissUtil.mascaraContaContabil(String.valueOf(IResponse.getOcorrencias(i).getNumeroContaContabil()),"0-0"));
			contasNaoConstantesBaseLista.setDescricao(String.valueOf(IResponse.getOcorrencias(i).getNomeContaContabil()));
			listaContas.add(contasNaoConstantesBaseLista);
		}
		
			return listaContas;
		
	}
    
}

