package br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.request.ListarPercentualTransicaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse;

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
public interface IListarPercentualTransicaoPDCAdapter {
    
    /**
     * M�todo utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os par�metros necess�rios para invocar um processo no PDC.
     * @return Objeto do tipo ListarPercentualTransicaoResponse 
     		   com o resultado da execu��o do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que se pode produzir no Conector.
     */
    ListarPercentualTransicaoResponse invokeProcess(ListarPercentualTransicaoRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ListarPercentualTransicaoResponse invokeProcess(ListarPercentualTransicaoRequest request, String stateID) 
    								throws PdcAdapterException, PdcConnectorException;

}
