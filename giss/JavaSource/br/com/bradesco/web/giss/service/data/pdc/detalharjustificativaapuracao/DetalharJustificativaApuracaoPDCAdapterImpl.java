package br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.DetalharJustificativaApuracaoResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet/Intranet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: DetalharJustificativaApuracao
 * </p>
 * 
 * @author CPM Braxis S.A. <BR>
 *         Copyright Copyright (c) 2009 <BR>
 *         created  <BR>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class DetalharJustificativaApuracaoPDCAdapterImpl extends PdcBaseAdapter implements
        IDetalharJustificativaApuracaoPDCAdapter, IDetalharJustificativaApuracaoAdapterMapping {

	 /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.DetalharJustificativaApuracao.IDetalharJustificativaApuracaoPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.DetalharJustificativaApuracao.request.DetalharJustificativaApuracaoRequest)
     * @param message Objeto do tipo DetalharJustificativaApuracaoRequest 
                      que contém a informação necessária para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se é necessário um Id de sessão PDC para chamar o processo.
     * @return Objeto do tipo DetalharJustificativaApuracaoResponse 
               que contém o resultado da invocação do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exceção no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exceção no conector PDC.
     */
    public DetalharJustificativaApuracaoResponse invokeProcess(
            DetalharJustificativaApuracaoRequest message) 
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
     * @param message Objeto do tipo DetalharJustificativaApuracaoRequest 
     				  que contém a informação necessária para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(DetalharJustificativaApuracaoRequest message) {

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
     * objeto do tipo DetalharJustificativaApuracaoResponse.
     * 
	 * @param response Objeto do tipo DetalharJustificativaApuracaoResponse 
	 *         que contém a informação de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo DetalharJustificativaApuracaoResponse 
     *          que representa o resultado da invocação de um processo no PDC.
     */
    public DetalharJustificativaApuracaoResponse mappingResponse(String response) {

        DetalharJustificativaApuracaoResponse processResponse = new DetalharJustificativaApuracaoResponse();
        try {
            
            processResponse = 
            	(DetalharJustificativaApuracaoResponse) DetalharJustificativaApuracaoResponse.
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