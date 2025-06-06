package br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.response.CancelarTedTransferenciaResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Interface que define os métodos que devem ser implementados em cada adaptador.
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created 26-Jun-2006 <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com 
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public interface ICancelarTedTransferenciaPDCAdapter {
    
    /**
     * Método utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os parâmetros necessários para invocar um processo no PDC.
     * @return Objeto do tipo CancelarTedTransferenciaResponse 
     		   com o resultado da execução do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que se pode produzir no Conector.
     */
    CancelarTedTransferenciaResponse invokeProcess(CancelarTedTransferenciaRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    CancelarTedTransferenciaResponse invokeProcess(CancelarTedTransferenciaRequest request, String stateID) 
    								throws PdcAdapterException, PdcConnectorException;

}
