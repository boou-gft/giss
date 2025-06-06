package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;


import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;

import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.ListarApuracaoReprocessamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet/Intranet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ListarApuracaoReprocessamento
 * </p>
 * 
 * @author CPM Braxis S.A. <BR>
 *         Copyright Copyright (c) 2009 <BR>
 *         created  <BR>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ListarApuracaoReprocessamentoPDCAdapterImpl extends PdcBaseAdapter implements
        IListarApuracaoReprocessamentoPDCAdapter, IListarApuracaoReprocessamentoAdapterMapping {

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarApuracaoReprocessamentoResponse invokeProcess(ListarApuracaoReprocessamentoRequest message) {
        return invokeProcess(message, true,null);
    }
    
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarApuracaoReprocessamentoResponse invokeProcess(ListarApuracaoReprocessamentoRequest message, String stateID) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID);
    }
    

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    private ListarApuracaoReprocessamentoResponse invokeProcess(
            ListarApuracaoReprocessamentoRequest message, 
            boolean isPDCSessionIdNeeded, String stateID) 
            		throws PdcAdapterException, PdcConnectorException {

        //Verifica��o se sess�o deve ser realizada antes da execu��o dos mappings
        checkSession(isPDCSessionIdNeeded);
        
        String request = mappingRequest(message);
        //Invocamos o processo por meio da classe pai.
        String response = invoke(request, isPDCSessionIdNeeded, stateID);
        //Se tudo foi realizado corretamente, realizar o mapping response e devolv�-lo
        return mappingResponse(response);
    }
    
    
    
    
    
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarApuracaoReprocessamentoResponse[] invokeProcess(ListarApuracaoReprocessamentoRequest message, int numItensWeb, int numItensMF) {
        return invokeProcess(message, true,null,numItensWeb, numItensMF);
    }
    
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarApuracaoReprocessamentoResponse[] invokeProcess(ListarApuracaoReprocessamentoRequest message, String stateID, int numItensWeb, int numItensMF) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID,numItensWeb, numItensMF);
    }
       
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC em regime multipaginas.
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    private ListarApuracaoReprocessamentoResponse[] invokeProcess(
            ListarApuracaoReprocessamentoRequest message, 
            boolean isPDCSessionIdNeeded, String stateID, int numItensWeb, int numItensMF) 
            		throws PdcAdapterException, PdcConnectorException {

        return null;
    }

    /**
     * Coment�rios: M�todo que gera o xml correspondente ao objeto request de entrada
     * 
     * @param message Objeto do tipo ListarApuracaoReprocessamentoRequest 
     				  que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ListarApuracaoReprocessamentoRequest message) {

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
     * objeto do tipo ListarApuracaoReprocessamentoResponse.
     * 
	 * @param response Objeto do tipo ListarApuracaoReprocessamentoResponse 
	 *         que cont�m a informa��o de retorno do processo PDC. 	     
     * @return Objeto do tipo ListarApuracaoReprocessamentoResponse 
     *          que representa o resultado da invoca��o de um processo no PDC.
     */
    public ListarApuracaoReprocessamentoResponse mappingResponse(String response) {

        ListarApuracaoReprocessamentoResponse processResponse = new ListarApuracaoReprocessamentoResponse();
        try {
            
            processResponse = 
            	(ListarApuracaoReprocessamentoResponse) ListarApuracaoReprocessamentoResponse.
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