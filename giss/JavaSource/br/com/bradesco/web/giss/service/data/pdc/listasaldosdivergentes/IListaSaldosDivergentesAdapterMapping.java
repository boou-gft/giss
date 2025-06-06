package br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes;

import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.request.ListaSaldosDivergentesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.ListaSaldosDivergentesResponse;

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
public interface IListaSaldosDivergentesAdapterMapping {

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
    String mappingRequest(ListaSaldosDivergentesRequest message);

    /**
     * M�todo que realiza o mapping dos objetos response.
     * 
     * @param response
     *            Objeto que representa o resultado da chamada de um
     *            processo no PDC
     * @return Objeto do tipo ListaSaldosDivergentesResponse 
     * 		   que representa o resultado da chamada do processo no PDC
     */
    ListaSaldosDivergentesResponse mappingResponse(String response);

}
