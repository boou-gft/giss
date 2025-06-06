package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.request.ListarApuracaoParcialDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ListarApuracaoParcialDependencia
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ListarApuracaoParcialDependenciaPDCAdapterImpl extends PdcBaseAdapter implements
        IListarApuracaoParcialDependenciaPDCAdapter, IListarApuracaoParcialDependenciaAdapterMapping {

    /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.IListarApuracaoParcialDependenciaPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.request.ListarApuracaoParcialDependenciaRequest)
     * @param message Objeto do tipo ListarApuracaoParcialDependenciaRequest 
                      que contém a informação necessária para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se é necessário um Id de sessão PDC para chamar o processo.
     * @return Objeto do tipo ListarApuracaoParcialDependenciaResponse 
               que contém o resultado da invocação do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exceção no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exceção no conector PDC.
     */
    public ListarApuracaoParcialDependenciaResponse invokeProcess(
            ListarApuracaoParcialDependenciaRequest message) 
            		throws PdcAdapterException, PdcConnectorException {

        String request = mappingRequest(message);
        //Invocamos o processo por meio da classe pai.
        String response = invoke(request);
        //Se tudo foi realizado corretamente, realizar o mapping response e devolvê-lo
        return mappingResponse(response);
    }

    /**
     * Comentários: Método que gera o xml correspondente ao objeto request de entrada
     * 
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingRequest(br.com.bradesco.web.aq.adapter.customglobalposition.request.GetAccountsRequest)
     * @param message Objeto do tipo ListarApuracaoParcialDependenciaRequest 
     				  que contém a informação necessária para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ListarApuracaoParcialDependenciaRequest message) {

        StringWriter textMessage = new StringWriter();
        try {
            message.marshal(textMessage);
        } catch (ValidationException error) {
            throw new XmlMappingException(
            			getProcessName(),
            			PdcAdapterConstants.MAPPING_REQUEST_VALIDATION_EXCEPTION, 
            			"Error vaidating resquest.", error);
        } catch (MarshalException error) {
            throw new XmlMappingException(
            		getProcessName(),
            		PdcAdapterConstants.MAPPING_REQUEST_MARSHAL_EXCEPTION, 
            		"Error marshalling resquest.", error);
        }
        
        return textMessage.toString();
    }

    /**
     * Método Sobreescrito - Comentários: Método para converter os parâmetros de response a um 
     * objeto do tipo ListarApuracaoParcialDependenciaResponse.
     * 
	 * @param response Objeto do tipo ListarApuracaoParcialDependenciaResponse 
	 *         que contém a informação de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo ListarApuracaoParcialDependenciaResponse 
     *          que representa o resultado da invocação de um processo no PDC.
     */
    public ListarApuracaoParcialDependenciaResponse mappingResponse(String response) {

        ListarApuracaoParcialDependenciaResponse processResponse = new ListarApuracaoParcialDependenciaResponse();
        try {
            
            processResponse = 
            	(ListarApuracaoParcialDependenciaResponse) ListarApuracaoParcialDependenciaResponse.
            									unmarshal(new StringReader(response));
        } catch (ValidationException error) {
            throw new XmlMappingException(
            	getProcessName(),
            	PdcAdapterConstants.MAPPING_RESPONSE_VALIDATION_EXCEPTION, 
            	"Error vaidating reponse.", error);
        } catch (MarshalException error) {
            throw new XmlMappingException(
            	getProcessName(),
            	PdcAdapterConstants.MAPPING_RESPONSE_MARSHAL_EXCEPTION, 
            	"Error marshalling reponse.", error);
        }
        return processResponse;
    }
}