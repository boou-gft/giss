package br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.request.ListarHistMunicEstadoDependenciasRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.ListarHistMunicEstadoDependenciasResponse;

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
public interface IListarHistMunicEstadoDependenciasPDCAdapter {
    
    /**
     * Método utilizado para invocar um processo PDC.
     * 
     * @param request Objeto com os parâmetros necessários para invocar um processo no PDC.
     * @return Objeto do tipo ListarHistMunicEstadoDependenciasResponse 
     		   com o resultado da execução do processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que se pode produzir no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que se pode produzir no Conector.
     */
    ListarHistMunicEstadoDependenciasResponse invokeProcess(ListarHistMunicEstadoDependenciasRequest request) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ListarHistMunicEstadoDependenciasResponse invokeProcess(ListarHistMunicEstadoDependenciasRequest request, String stateID) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
    
    
     /**
     * Método utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ListarHistMunicEstadoDependenciasRequest que contém a informação necessária para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarHistMunicEstadoDependenciasResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
     ListarHistMunicEstadoDependenciasResponse[] invokeProcess(ListarHistMunicEstadoDependenciasRequest request, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    ListarHistMunicEstadoDependenciasResponse[] invokeProcess(ListarHistMunicEstadoDependenciasRequest request, String stateID, int numItensWeb, int numItensMF) 
    								throws PdcAdapterException, PdcConnectorException;
    
    
    
}
