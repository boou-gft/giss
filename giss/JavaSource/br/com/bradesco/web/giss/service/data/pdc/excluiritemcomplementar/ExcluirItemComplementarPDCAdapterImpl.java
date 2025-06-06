package br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.response.ExcluirItemComplementarResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ExcluirItemComplementar
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ExcluirItemComplementarPDCAdapterImpl extends PdcBaseAdapter implements
        IExcluirItemComplementarPDCAdapter, IExcluirItemComplementarAdapterMapping {

    /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.IExcluirItemComplementarPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest)
     * @param message Objeto do tipo ExcluirItemComplementarRequest 
                      que contém a informação necessária para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se é necessário um Id de sessão PDC para chamar o processo.
     * @return Objeto do tipo ExcluirItemComplementarResponse 
               que contém o resultado da invocação do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exceção no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exceção no conector PDC.
     */
    public ExcluirItemComplementarResponse invokeProcess(
            ExcluirItemComplementarRequest message) 
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
     * @param message Objeto do tipo ExcluirItemComplementarRequest 
     				  que contém a informação necessária para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ExcluirItemComplementarRequest message) {

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
     * objeto do tipo ExcluirItemComplementarResponse.
     * 
	 * @param response Objeto do tipo ExcluirItemComplementarResponse 
	 *         que contém a informação de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo ExcluirItemComplementarResponse 
     *          que representa o resultado da invocação de um processo no PDC.
     */
    public ExcluirItemComplementarResponse mappingResponse(String response) {

        ExcluirItemComplementarResponse processResponse = new ExcluirItemComplementarResponse();
        try {
            
            processResponse = 
            	(ExcluirItemComplementarResponse) ExcluirItemComplementarResponse.
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