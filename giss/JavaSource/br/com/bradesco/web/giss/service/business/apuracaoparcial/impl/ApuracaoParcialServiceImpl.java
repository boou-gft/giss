/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaoparcial/impl/ApuracaoParcialServiceImpl.java,v $
 * $Id: ApuracaoParcialServiceImpl.java,v 1.2 2018/06/06 17:08:55 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ApuracaoParcialServiceImpl.java,v $
 * Revision 1.2  2018/06/06 17:08:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:13:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:28  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:58  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.apuracaoparcial.impl;

import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaoparcial.IApuracaoParcialService;
import br.com.bradesco.web.giss.service.business.apuracaoparcial.bean.ApuracaoParcialDTO;
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
 * Implementação do adaptador: ApuracaoParcial
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ApuracaoParcialServiceImpl implements IApuracaoParcialService {

	private FactoryAdapter factoryAdapter;

    /**
     * Construtor.
     */
    public ApuracaoParcialServiceImpl() {
        // TODO: Implementação
    }

    public ApuracaoParcialDTO listaApuracaoParcial(String diaDe, String diaAte) {
    	
	  	ApuracaoParcialDTO apuracaoParcialDTO = new ApuracaoParcialDTO();
    	
    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_PARCIAL);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_PROSSEGUIR);
    	lRequest.setDiaDe(diaDe);
    	lRequest.setDiaAte(diaAte);
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);
    	
    	apuracaoParcialDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoParcialDTO.setMensagem(lResponse.getMensagem());
    	
    	return apuracaoParcialDTO;
    	
    }

    public ApuracaoParcialDTO iniciarApuracaoParcial() {
	  	ApuracaoParcialDTO apuracaoParcialDTO = new ApuracaoParcialDTO();

    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_PARCIAL);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL);
    	lRequest.setDiaDe("");
    	lRequest.setDiaAte("");
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);

    	apuracaoParcialDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoParcialDTO.setMensagem(lResponse.getMensagem());
    	apuracaoParcialDTO.setCompetencia(lResponse.getCompetencia());

    	return apuracaoParcialDTO;
    	
    }

  	public FactoryAdapter getFactoryAdapter() {
  		return factoryAdapter;
  	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

