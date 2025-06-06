package br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.ManterAliquotaListaResponse;

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
public interface IManterAliquotaListaPDCAdapter {
    
    /**
     * Método utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os parâmetros necessários para invocar um processo no PDC.
     * @return Objeto do tipo ManterAliquotaListaResponse 
     		   com o resultado da execução do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que se pode produzir no Conector.
     */
    ManterAliquotaListaResponse invokeProcess(ManterAliquotaListaRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ManterAliquotaListaResponse invokeProcess(ManterAliquotaListaRequest request, String stateID) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
    
    
     /**
     * Método utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ManterAliquotaListaRequest que contém a informação necessária para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ManterAliquotaListaResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
     ManterAliquotaListaResponse[] invokeProcess(ManterAliquotaListaRequest request, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ManterAliquotaListaResponse[] invokeProcess(ManterAliquotaListaRequest request, String stateID, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
}
