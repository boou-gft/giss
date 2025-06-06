package br.com.bradesco.web.giss.service.data.pdc.authenticationservice;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.IntranetLoginPdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest;
import br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: AuthenticationService
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class AuthenticationServicePDCAdapterImpl extends IntranetLoginPdcBaseAdapter implements
        IAuthenticationServicePDCAdapter, IAuthenticationServiceAdapterMapping {

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.aplicacion1.model.pdc.customglobalposition.ICustomGlobalPositionPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.aplicacion1.model.pdc.customglobalposition.request.GetAccountsRequest)
     * @param message Objeto do tipo GetAccountsRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return Objeto do tipo GetAccountsResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public LogonResponse invokeProcess(LogonRequest message) {
        return invokeProcess(message, true);
    }

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.authenticationservice.IAuthenticationServicePDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest)
     * @param message Objeto do tipo LogonRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @return Objeto do tipo LogonResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    private LogonResponse invokeProcess(
            LogonRequest message, 
            boolean isPDCSessionIdNeeded) 
            		throws PdcAdapterException, PdcConnectorException {

        //Verifica��o se sess�o deve ser realizada antes da execu��o dos mappings
        checkSession(isPDCSessionIdNeeded);
        
        String request = mappingRequest(message);
        //Invocamos o processo por meio da classe pai.
        String response = invoke(request, isPDCSessionIdNeeded);
        //Se tudo foi realizado corretamente, realizar o mapping response e devolv�-lo
        return mappingResponse(response);
    }

    /**
     * Coment�rios: M�todo que gera o xml correspondente ao objeto request de entrada
     * 
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingRequest(br.com.bradesco.web.aq.adapter.customglobalposition.request.GetAccountsRequest)
     * @param message Objeto do tipo LogonRequest 
     				  que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(LogonRequest message) {

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
     * M�todo Sobreescrito - Coment�rios: M�todo para converter os par�metros de response a um 
     * objeto do tipo LogonResponse.
     * 
	 * @param response Objeto do tipo LogonResponse 
	 *         que cont�m a informa��o de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo LogonResponse 
     *          que representa o resultado da invoca��o de um processo no PDC.
     */
    public LogonResponse mappingResponse(String response) {

        LogonResponse processResponse = new LogonResponse();
        try {
            
            processResponse = 
            	(LogonResponse) LogonResponse.
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