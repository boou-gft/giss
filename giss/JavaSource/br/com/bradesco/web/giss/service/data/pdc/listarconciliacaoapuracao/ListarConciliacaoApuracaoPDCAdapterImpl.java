package br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.request.ListarConciliacaoApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet/Intranet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ListarConciliacaoApuracao
 * </p>
 * 
 * @author CPM Braxis S.A. <BR>
 *         Copyright Copyright (c) 2009 <BR>
 *         created  <BR>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ListarConciliacaoApuracaoPDCAdapterImpl extends PdcBaseAdapter implements
        IListarConciliacaoApuracaoPDCAdapter, IListarConciliacaoApuracaoAdapterMapping {

	  /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.ListarConciliacaoApuracao.IListarConciliacaoApuracaoPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.ListarConciliacaoApuracao.request.ListarConciliacaoApuracaoRequest)
     * @param message Objeto do tipo ListarConciliacaoApuracaoRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @return Objeto do tipo ListarConciliacaoApuracaoResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    public ListarConciliacaoApuracaoResponse invokeProcess(
            ListarConciliacaoApuracaoRequest message) 
            		throws PdcAdapterException, PdcConnectorException {

        String request = mappingRequest(message);
        //Invocamos o processo por meio da classe pai.
        String response = invoke(request);
        //Se tudo foi realizado corretamente, realizar o mapping response e devolv�-lo
        return mappingResponse(response);
    }

    /**
     * Coment�rios: M�todo que gera o xml correspondente ao objeto request de entrada
     * 
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingRequest(br.com.bradesco.web.aq.adapter.customglobalposition.request.GetAccountsRequest)
     * @param message Objeto do tipo ListarConciliacaoApuracaoRequest 
     				  que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ListarConciliacaoApuracaoRequest message) {

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
     * objeto do tipo ListarConciliacaoApuracaoResponse.
     * 
	 * @param response Objeto do tipo ListarConciliacaoApuracaoResponse 
	 *         que cont�m a informa��o de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo ListarConciliacaoApuracaoResponse 
     *          que representa o resultado da invoca��o de um processo no PDC.
     */
    public ListarConciliacaoApuracaoResponse mappingResponse(String response) {

        ListarConciliacaoApuracaoResponse processResponse = new ListarConciliacaoApuracaoResponse();
        try {
            
            processResponse = 
            	(ListarConciliacaoApuracaoResponse) ListarConciliacaoApuracaoResponse.
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