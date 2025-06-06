/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaoaposfechamento/impl/ApuracaoAposFechamentoServiceImpl.java,v $
 * $Id: ApuracaoAposFechamentoServiceImpl.java,v 1.3 2018/06/06 17:09:41 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ApuracaoAposFechamentoServiceImpl.java,v $
 * Revision 1.3  2018/06/06 17:09:41  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2018/04/06 14:01:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:13:31  gmichelini
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
 
package br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.impl;

import br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.IApuracaoAposFechamentoService;
import br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.bean.ApuracaoAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.IListarApuracaoMensalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.response.ListarApuracaoMensalResponse;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ApuracaoAposFechamento
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ApuracaoAposFechamentoServiceImpl implements IApuracaoAposFechamentoService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ApuracaoAposFechamentoServiceImpl() {
        // TODO: Implementação
    }
    
    /**
     * Método de exemplo.
     *
     * @see br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.IApuracaoAposFechamento#sampleApuracaoAposFechamento()
     */
    public void sampleApuracaoAposFechamento() {
        // TODO: Implementaçao
    }
    
    public ApuracaoAposFechamentoDTO prosseguirApuracaoAposFechamento(){
    	
    	ApuracaoAposFechamentoDTO apuracaoAposFechamentoDTO = new ApuracaoAposFechamentoDTO();
    	
    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_PROSSEGUIR);
    	lRequest.setDiaDe("");
    	lRequest.setDiaAte("");
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);
    	
    	apuracaoAposFechamentoDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoAposFechamentoDTO.setMensagem(lResponse.getMensagem());
    	
    	return apuracaoAposFechamentoDTO;
    	
    }
    
    
    public ApuracaoAposFechamentoDTO listaApuracaoAposFechamento(){
    	
    	ApuracaoAposFechamentoDTO apuracaoAposFechamentoDTO = new ApuracaoAposFechamentoDTO();
    	
    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR);
    	lRequest.setDiaDe("");
    	lRequest.setDiaAte("");
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);
    	
    	apuracaoAposFechamentoDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoAposFechamentoDTO.setMensagem(lResponse.getMensagem());
    	
    	return apuracaoAposFechamentoDTO;
    	
    }
    
  public ApuracaoMensalDTO iniciarTela() {
    	
    	ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
    	
    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL);
    	lRequest.setDiaDe("");
    	lRequest.setDiaAte("");
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);

    	apuracaoMensalDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoMensalDTO.setMensagem(lResponse.getMensagem());
    	apuracaoMensalDTO.setExibeContabil(lResponse.getExibeContabil());
    	apuracaoMensalDTO.setCompetencia(lResponse.getCompetencia());

    	return apuracaoMensalDTO;
    	
    }
    

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
    
}

