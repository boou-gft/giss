package br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal;

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
 * Interface que define os m�todos que dever�o ser implementados em cada adaptador para realizar
 * o mapping dos par�metros de request/response.
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com 
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a>
 */
public interface IListaApuracaoParcialFinalAdapterMapping {

    //TODO possibilidade de realizar um throw de PdcMappingException.
    /**
     * M�todo que realiza o mapping dos objetos request.
     * 
     * @param message
     *            Objeto que representa a request necess�ria para chamar um
     *            processo no PDC.
     * @return Objeto do tipo ExecuteProcessRequest que representa request
     *         necess�ria para invocar um processo no PDC.
     */
    String mappingRequest(ListaApuracaoParcialFinalRequest message);

    /**
     * M�todo que realiza o mapping dos objetos response.
     * 
     * @param response
     *            Objeto que representa o resultado da chamada de um
     *            processo no PDC
     * @return Objeto do tipo ListaApuracaoParcialFinalResponse 
     * 		   que representa o resultado da chamada do processo no PDC
     */
    ListaApuracaoParcialFinalResponse mappingResponse(String response);

}
