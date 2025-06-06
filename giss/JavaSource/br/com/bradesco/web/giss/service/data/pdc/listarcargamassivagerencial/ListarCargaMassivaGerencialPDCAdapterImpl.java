package br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.response.ListarCargaMassivaGerencialResponse;

/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet/Intranet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: ListarCargaMassivaGerencial
 * </p>
 * 
 * @author CPM Braxis S.A. <BR>
 *         Copyright Copyright (c) 2009 <BR>
 *         created  <BR>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class ListarCargaMassivaGerencialPDCAdapterImpl extends PdcBaseAdapter implements
        IListarCargaMassivaGerencialPDCAdapter, IListarCargaMassivaGerencialAdapterMapping {

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarCargaMassivaGerencialResponse invokeProcess(ListarCargaMassivaGerencialRequest message) {
        return invokeProcess(message, true,null);
    }
    
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarCargaMassivaGerencialResponse invokeProcess(ListarCargaMassivaGerencialRequest message, String stateID) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID);
    }
    

    /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    private ListarCargaMassivaGerencialResponse invokeProcess(
            ListarCargaMassivaGerencialRequest message, 
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
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarCargaMassivaGerencialResponse[] invokeProcess(ListarCargaMassivaGerencialRequest message, int numItensWeb, int numItensMF) {
        return invokeProcess(message, true,null,numItensWeb, numItensMF);
    }
    
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse que cont�m o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exce��o que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exce��o que pode ser produzido no Conector.
     */
    public ListarCargaMassivaGerencialResponse[] invokeProcess(ListarCargaMassivaGerencialRequest message, String stateID, int numItensWeb, int numItensMF) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID,numItensWeb, numItensMF);
    }
       
    
     /**
     * M�todo Sobreescrito - Coment�rios: M�todo utilizado para chamar um processo de PDC em regime multipaginas.
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest 
                      que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se � necess�rio um Id de sess�o PDC para chamar o processo.
     * @param stateID ID que identifica a sess�o do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse 
               que cont�m o resultado da invoca��o do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exce��o no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exce��o no conector PDC.
     */
    private ListarCargaMassivaGerencialResponse[] invokeProcess(
            ListarCargaMassivaGerencialRequest message, 
            boolean isPDCSessionIdNeeded, String stateID, int numItensWeb, int numItensMF) 
            		throws PdcAdapterException, PdcConnectorException {
        return null;
    }

    /**
     * Coment�rios: M�todo que gera o xml correspondente ao objeto request de entrada
     * 
     * @param message Objeto do tipo ListarCargaMassivaGerencialRequest 
     				  que cont�m a informa��o necess�ria para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(ListarCargaMassivaGerencialRequest message) {

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
     * objeto do tipo ListarCargaMassivaGerencialResponse.
     * 
	 * @param response Objeto do tipo ListarCargaMassivaGerencialResponse 
	 *         que cont�m a informa��o de retorno do processo PDC. 	     
     * @return Objeto do tipo ListarCargaMassivaGerencialResponse 
     *          que representa o resultado da invoca��o de um processo no PDC.
     */
    public ListarCargaMassivaGerencialResponse mappingResponse(String response) {

        ListarCargaMassivaGerencialResponse processResponse = new ListarCargaMassivaGerencialResponse();
        try {
            
            processResponse = 
            	(ListarCargaMassivaGerencialResponse) ListarCargaMassivaGerencialResponse.
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