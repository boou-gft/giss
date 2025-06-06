package br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse;

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
public interface IListaApuracaoParcialFinalPDCAdapter {
    
    /**
     * M�todo utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os par�metros necess�rios para invocar um processo no PDC.
     * @return Objeto do tipo ListaApuracaoParcialFinalResponse 
     		   com o resultado da execu��o do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que se pode produzir no Conector.
     */
    ListaApuracaoParcialFinalResponse invokeProcess(ListaApuracaoParcialFinalRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
}
