package br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.request.ResultadoPesquisaOscilacaoNegativaRequest;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ResultadoPesquisaOscilacaoNegativa
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created  <BR/>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ResultadoPesquisaOscilacaoNegativaPDCAdapterImpl extends PdcBaseAdapter implements
        IResultadoPesquisaOscilacaoNegativaPDCAdapter, IResultadoPesquisaOscilacaoNegativaAdapterMapping {

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @see br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.IResultadoPesquisaOscilacaoNegativaPDCAdapter#
     *      invokeProcess(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.request.ResultadoPesquisaOscilacaoNegativaRequest)
     * @param message Objeto do tipo ResultadoPesquisaOscilacaoNegativaRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @return Objeto do tipo ResultadoPesquisaOscilacaoNegativaResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    public ResultadoPesquisaOscilacaoNegativaResponse invokeProcess(
            ResultadoPesquisaOscilacaoNegativaRequest message) 
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
     * @param message Objeto do tipo ResultadoPesquisaOscilacaoNegativaRequest 
     				  que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ResultadoPesquisaOscilacaoNegativaRequest message) {

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
     * objeto do tipo ResultadoPesquisaOscilacaoNegativaResponse.
     * 
	 * @param response Objeto do tipo ResultadoPesquisaOscilacaoNegativaResponse 
	 *         que cont�m a informa��o de retorno do processo PDC. 	     
     * @see br.com.bradesco.web.aq.adapter.customglobalposition.ICustomGlobalPositionAdapterMapping#
     *      mappingResponse(br.com.bradesco.pdc.controller.container.ExecuteProcessResponse)
     * @return Objeto do tipo ResultadoPesquisaOscilacaoNegativaResponse 
     *          que representa o resultado da invoca��o de um processo no PDC.
     */
    public ResultadoPesquisaOscilacaoNegativaResponse mappingResponse(String response) {

        ResultadoPesquisaOscilacaoNegativaResponse processResponse = new ResultadoPesquisaOscilacaoNegativaResponse();
        try {
            
            processResponse = 
            	(ResultadoPesquisaOscilacaoNegativaResponse) ResultadoPesquisaOscilacaoNegativaResponse.
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