/*
* =========================================================================
* 
* Client:       Bradesco (BR)
* Project:      Arquitectura Bradesco Canal Web
* Development:  GFT Iberia (http://www.gft.com)
* -------------------------------------------------------------------------
* Revision - Last:
* $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1�App/giss/JavaSource/br/com/bradesco/web/giss/exception/GissException.java,v $
* $Id: GissException.java,v 1.1 2017/04/11 14:12:33 gmichelini Exp $
* $State: Exp $
* -------------------------------------------------------------------------
* Revision - History:
* $Log: GissException.java,v $
* Revision 1.1  2017/04/11 14:12:33  gmichelini
* *** empty log message ***
*
* Revision 1.1  2012/11/22 15:40:29  gmichelini
* *** empty log message ***
*
* Revision 1.1  2012/10/01 15:14:51  gmichelini
* *** empty log message ***
*
* Revision 1.4  2009/05/13 21:16:38  cpm.com.br\heslei.silva
* organizacao da version 2 para o head
*
* Revision 1.2  2009/04/30 19:49:12  corporate\edwin.costa
* Alterado o diret�rio de fontes para JavaSource
*
* Revision 1.1  2009/03/16 16:18:55  corporate\marcio.alves
* Adicionando o PilotoIntranet ao CVS
*
*
* =========================================================================
*/

package br.com.bradesco.web.giss.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;
import br.com.bradesco.web.aq.application.error.ExceptionConstants;

/**
 * <p><b>Title:</b>        Arquitectura Bradesco Canal Web.</p>
 * <p><b>Description:</b></p>
 * <p>Insertar aqu� la descripci�n del Tipo.</p>
 * 
 * @author       GFT Iberia Solutions / Emagine <BR/>
 * copyright Copyright (c) 2006 <BR/>
 * created   01-ago-2006 <BR/>
 * @version      1.0
 */

public class GissException extends BradescoApplicationException {

	  /**
     * 
     * Construtor da exce��o.
     * 
     * @param message mensagem geral interna de erro.
     * @param code codigo identificativo da exce��o.
     */
    public GissException(String message, String code) {
       this(null, message, null, code);
    }
    
    /**
     * 
     * Construtor da exce��o.
     * 
     * @param camada camada a qual pertenece a exce��o.
     * @param message mensagem geral interno de exce��o.
     * @param code codigo identificativo da exce��o.
     */
    public GissException(String camada, String message, String code) {
        this(camada, message, null, code);
    }
    
    /**
     * 
     * Construtor da exce��o.
     * 
     * @param message mensagem geral interno de erro.
     * @param cause objeto Throwable que origina a apari��o desta exce��o.
     * @param code codigo identificativo da exce��o.
     */
    public GissException(String message, Throwable cause, String code) {
        this(null, message, cause, code);
    }
    
    /**
     /**
     * 
     * Construtor da exce��o.
     * 
     * @param camada camada na que � reportada a exce��o.
     * @param message mensaje general interno de excepcion.
     * @param cause objeto Throwable que origina a apari��o desta exce��o.
     * @param code codigo identificativo da exce��o.
     */
    public GissException(String camada, String message, Throwable cause, String code) {
        super(message, cause, code);
        if (camada == null) {
            setCamada(ExceptionConstants.CAMADA_APRESENTACAO_ID);
        } else {
            setCamada(camada);
        }    
        
        //Estabelece que n�o deve gerar tra�ado de log de tipo 'ERRO'.
        setLoggable(false);
    }
    
    /**
     * 
     * Construtor da exce��o.
     * 
     * @param message mensagem geral interno de erro.
     * @param code codigo identificativo da exce��o.
     * @param histBack booleano para voltar atr�s
     */
    public GissException(String message, String code, boolean histBack) {
       this(null, message, null, code, histBack);
    }
    
    /**
     * 
     * Construtor da exce��o.
     * 
     * @param camada camada a qual a exce��o pertence.
     * @param message mensagem geral interno de exce��o.
     * @param code codigo identificativo da exce��o.
     * @param histBack booleano para voltar atr�s
     */
    public GissException(String camada, String message, String code, boolean histBack) {
        this(camada, message, null, code, histBack);
    }
    
    /**
     * 
     * Construtor da exce��o.
     * 
     * @param message mensagem geral interno de erro.
     * @param cause objeto Throwable que origina a apari��o desta exce��o.
     * @param code codigo identificativo da exce��o.
     * @param histBack booleano para voltar atr�s
     */
    public GissException(String message, Throwable cause, String code, boolean histBack) {
        this(null, message, cause, code, histBack);
    }
    
     /**
     * 
     * Construtor da exce��o.
     * 
     * @param camada camada na que � reportada a exce��o.
     * @param message mensagem geral interno de exce��o.
     * @param cause objeto Throwable que origina a apari��o desta exce��o.
     * @param code codigo identificativo da exce��o.
     * @param histBack booleano para voltar atr�s
     */
    public GissException(String camada, String message, Throwable cause, String code, boolean histBack) {
        super(message, cause, code);
        if (camada == null) {
            setCamada(ExceptionConstants.CAMADA_APRESENTACAO_ID);
        } else {
            setCamada(camada);
        }    
        
        //Estabelece que n�o deve gerar tra�ado de log de tipo 'ERROR'.
        setLoggable(false);
    }

}
