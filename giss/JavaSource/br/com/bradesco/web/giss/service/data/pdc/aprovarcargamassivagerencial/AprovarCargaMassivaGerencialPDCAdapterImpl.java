package br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial;

import java.io.StringReader;
import java.io.StringWriter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import br.com.bradesco.web.aq.application.pdc.adapter.PdcAdapterConstants;
import br.com.bradesco.web.aq.application.pdc.adapter.base.PdcBaseAdapter;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.XmlMappingException;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.request.AprovarCargaMassivaGerencialRequest;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.response.AprovarCargaMassivaGerencialResponse;

/**
 * 
 * <p>
 * <b>Título:</b> Arquitetura Bradesco Canal Internet/Intranet.
 * </p>
 * <p>
 * <b>Descrição:</b>
 * </p>
 * <p>
 * Classe implementadora do adaptador: AprovarCargaMassivaGerencial
 * </p>
 * 
 * @author CPM Braxis S.A. <BR>
 *         Copyright Copyright (c) 2009 <BR>
 *         created  <BR>
 * @version 1.0
 * Esta classe foi automaticamente gerada com
 * <a href="http://www.bradesco.com.br">Gerador de Adaptadores</a> 
 */
public class AprovarCargaMassivaGerencialPDCAdapterImpl extends PdcBaseAdapter implements
        IAprovarCargaMassivaGerencialPDCAdapter, IAprovarCargaMassivaGerencialAdapterMapping {

    /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest que contém a informação necessária para invocar o processo PDC.
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
    public AprovarCargaMassivaGerencialResponse invokeProcess(AprovarCargaMassivaGerencialRequest message) {
        return invokeProcess(message, true,null);
    }
    
    
     /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest que contém a informação necessária para invocar o processo PDC.
     * @param stateID ID que identifica a sessão do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
    public AprovarCargaMassivaGerencialResponse invokeProcess(AprovarCargaMassivaGerencialRequest message, String stateID) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID);
    }
    

    /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC.
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest 
                      que contém a informação necessária para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se é necessário um Id de sessão PDC para chamar o processo.
     * @param stateID ID que identifica a sessão do PDC (caso ela tenha q manter o estado)
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse 
               que contém o resultado da invocação do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exceção no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exceção no conector PDC.
     */
    private AprovarCargaMassivaGerencialResponse invokeProcess(
            AprovarCargaMassivaGerencialRequest message, 
            boolean isPDCSessionIdNeeded, String stateID) 
            		throws PdcAdapterException, PdcConnectorException {

        //Verificação se sessão deve ser realizada antes da execução dos mappings
        checkSession(isPDCSessionIdNeeded);
        
        String request = mappingRequest(message);
        //Invocamos o processo por meio da classe pai.
        String response = invoke(request, isPDCSessionIdNeeded, stateID);
        //Se tudo foi realizado corretamente, realizar o mapping response e devolvê-lo
        return mappingResponse(response);
    }
    
    
    
    
    
    
     /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest que contém a informação necessária para invocar o processo PDC.
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
    public AprovarCargaMassivaGerencialResponse[] invokeProcess(AprovarCargaMassivaGerencialRequest message, int numItensWeb, int numItensMF) {
        return invokeProcess(message, true,null,numItensWeb, numItensMF);
    }
    
    
     /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC em regime de multipaginacao
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest que contém a informação necessária para invocar o processo PDC.
     * @param stateID ID que identifica a sessão do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse que contém o resultado de chamar o processo no PDC.
     * @throws PdcAdapterException Representa qualquer exceção que pode ser produzido no Adaptador.
     * @throws PdcConnectorException Representa qualquer exceção que pode ser produzido no Conector.
     */
    public AprovarCargaMassivaGerencialResponse[] invokeProcess(AprovarCargaMassivaGerencialRequest message, String stateID, int numItensWeb, int numItensMF) 
    	throws PdcAdapterException, PdcConnectorException {
    		return invokeProcess(message, true,stateID,numItensWeb, numItensMF);
    }
       
    
     /**
     * Método Sobreescrito - Comentários: Método utilizado para chamar um processo de PDC em regime multipaginas.
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest 
                      que contém a informação necessária para invocar o processo PDC.
     * @param isPDCSessionIdNeeded Flag que indica se é necessário um Id de sessão PDC para chamar o processo.
     * @param stateID ID que identifica a sessão do PDC (caso ela tenha q manter o estado)
     * @param numItensWeb numero de itens pretendidos na camada web (deve ser divisivel por numItensMF) 
     * @param numItensMF numero de itens retornados por chamada ao mainframe
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse 
               que contém o resultado da invocação do processo no PDC.
     * @throws PdcAdapterException Caso ocorra alguma exceção no adaptador PDC.
     * @throws PdcConnectorException Caso ocorra alguma exceção no conector PDC.
     */
    private AprovarCargaMassivaGerencialResponse[] invokeProcess(
            AprovarCargaMassivaGerencialRequest message, 
            boolean isPDCSessionIdNeeded, String stateID, int numItensWeb, int numItensMF) 
            		throws PdcAdapterException, PdcConnectorException {

        return null;
    }

    /**
     * Comentários: Método que gera o xml correspondente ao objeto request de entrada
     * 
     * @param message Objeto do tipo AprovarCargaMassivaGerencialRequest 
     				  que contém a informação necessária para invocar o processo PDC.
     * @return String que corresponde o xml do objeto request de entrada.
     */
    public String mappingRequest(AprovarCargaMassivaGerencialRequest message) {

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
     * objeto do tipo AprovarCargaMassivaGerencialResponse.
     * 
	 * @param response Objeto do tipo AprovarCargaMassivaGerencialResponse 
	 *         que contém a informação de retorno do processo PDC. 	     
     * @return Objeto do tipo AprovarCargaMassivaGerencialResponse 
     *          que representa o resultado da invocação de um processo no PDC.
     */
    public AprovarCargaMassivaGerencialResponse mappingResponse(String response) {

        AprovarCargaMassivaGerencialResponse processResponse = new AprovarCargaMassivaGerencialResponse();
        try {
            
            processResponse = 
            	(AprovarCargaMassivaGerencialResponse) AprovarCargaMassivaGerencialResponse.
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