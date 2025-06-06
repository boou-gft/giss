package br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao;

import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.DetalharJustificativaApuracaoResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Interface que define os métodos que deverão ser implementados em cada adaptador para realizar
 * o mapping dos parâmetros de request/response.
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com 
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a>
 */
public interface IDetalharJustificativaApuracaoAdapterMapping {

    //TODO possibilidade de realizar um throw de PdcMappingException.
    /**
     * Método que realiza o mapping dos objetos request.
     * 
     * @param message
     *            Objeto que representa a request necessária para chamar um
     *            processo no PDC.
     * @return Objeto do tipo ExecuteProcessRequest que representa request
     *         necessária para invocar um processo no PDC.
     */
    String mappingRequest(DetalharJustificativaApuracaoRequest message);

    /**
     * Método que realiza o mapping dos objetos response.
     * 
     * @param response
     *            Objeto que representa o resultado da chamada de um
     *            processo no PDC
     * @return Objeto do tipo DetalharJustificativaApuracaoResponse 
     * 		   que representa o resultado da chamada do processo no PDC
     */
    DetalharJustificativaApuracaoResponse mappingResponse(String response);

}
