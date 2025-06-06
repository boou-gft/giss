package br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif;

import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.request.ListaContasMunAliqDifRequest;
import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.ListaContasMunAliqDifResponse;

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
public interface IListaContasMunAliqDifAdapterMapping {

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
    String mappingRequest(ListaContasMunAliqDifRequest message);

    /**
     * Método que realiza o mapping dos objetos response.
     * 
     * @param response
     *            Objeto que representa o resultado da chamada de um
     *            processo no PDC
     * @return Objeto do tipo ListaContasMunAliqDifResponse 
     * 		   que representa o resultado da chamada do processo no PDC
     */
    ListaContasMunAliqDifResponse mappingResponse(String response);

}
