package br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse;

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
public interface IListarHistoricoMunicipioPDCAdapter {
    
    /**
     * M�todo utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os par�metros necess�rios para invocar um processo no PDC.
     * @return Objeto do tipo ListarHistoricoMunicipioResponse 
     		   com o resultado da execu��o do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que se pode produzir no Conector.
     */
    ListarHistoricoMunicipioResponse invokeProcess(ListarHistoricoMunicipioRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
}
