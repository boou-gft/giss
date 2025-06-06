package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.ListarApuracaoReprocessamentoResponse;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Interface que define os m�todos que devem ser implementados em cada adaptador.
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created 26-Jun-2006 <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com 
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public interface IListarApuracaoReprocessamentoPDCAdapter {
    
    /**
     * M�todo utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os par�metros necess�rios para invocar um processo no PDC.
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse 
     		   com o resultado da execu��o do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que se pode produzir no Conector.
     */
    ListarApuracaoReprocessamentoResponse invokeProcess(ListarApuracaoReprocessamentoRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ListarApuracaoReprocessamentoResponse invokeProcess(ListarApuracaoReprocessamentoRequest request, String stateID) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
    
    
     /**
     * M�todo utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
     ListarApuracaoReprocessamentoResponse[] invokeProcess(ListarApuracaoReprocessamentoRequest request, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ListarApuracaoReprocessamentoResponse[] invokeProcess(ListarApuracaoReprocessamentoRequest request, String stateID, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
}
