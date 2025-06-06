/*
* =========================================================================
* 
* Client:       Bradesco (BR)
* Project:      Arquitectura Bradesco Canal Web
* Development:  GFT Iberia (http://www.gft.com)
* -------------------------------------------------------------------------
* Revision - Last:
* $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/exception/GissExceptionHandler.java,v $
* $Id: GissExceptionHandler.java,v 1.1 2017/04/11 14:12:33 gmichelini Exp $
* $State: Exp $
* -------------------------------------------------------------------------
* Revision - History:
* $Log: GissExceptionHandler.java,v $
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
* Alterado o diretório de fontes para JavaSource
*
* Revision 1.1  2009/03/16 16:18:55  corporate\marcio.alves
* Adicionando o PilotoIntranet ao CVS
*
*
* =========================================================================
*/

package br.com.bradesco.web.giss.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.bradesco.web.aq.application.error.BradescoBaseException;
import br.com.bradesco.web.aq.application.error.config.IExceptionConfig;
import br.com.bradesco.web.aq.application.error.handler.BradescoApplicationExceptionHandler;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;

/**
 * <p><b>Title:</b>        Arquitectura Bradesco Canal Web.</p>
 * <p><b>Description:</b></p>
 * <p>Insertar aquí la descripción del Tipo.</p>
 * 
 * @author       GFT Iberia Solutions / Emagine <BR/>
 * copyright Copyright (c) 2006 <BR/>
 * created   01-ago-2006 <BR/>
 * @version      1.0
 */

public class GissExceptionHandler extends BradescoApplicationExceptionHandler {


    public static final String MENSAGEM_CAUSE_ERRO_LABEL_KEY = "erro.mensagem.cause.label";

    public static final String CODIGO_ERRO_LABEL_KEY         = "erro.codigo.label";

    public static final String MENSAGEM_GERAL_LABEL_KEY      = "erro.mensagem.geral.label";

    public static final String MENSAGEM_DETALHADO_LABEL_KEY  = "erro.mensagem.detalhado.label";

    public static final String REDIRECT_MESSAGE_LABEL_KEY    = "erro.mensagem.redirect.label";

    public static final String TIPO_ERRO_LABEL_KEY           = "erro.tipo.label";

    public static final String STACK_ERRO_LABEL_KEY          = "erro.stack.label";

    public static final String CAMADA_ERRO_LABEL_KEY         = "erro.camada.label";

	
    /**
     * Nome do atributo na request onde será armazenada a exeção acontecida.
     */
    public static final String NOME_ATRIBUTO_REQ_ACAO_GISS_EXCECAO = "webFlowExcecao";

    /**
     * Comentários para o Construtor.
     * 
     */
    public GissExceptionHandler() {
        super();
    }

    @Override
	protected boolean beforePerformForward(Exception config, IExceptionConfig aException) {
		if (config instanceof BradescoBaseException) {
			addErrorMessageCode(((BradescoBaseException) config).getCode());
		}

		StringWriter stackTrace = new StringWriter();
		config.printStackTrace(new PrintWriter(stackTrace));
		BradescoFacesUtils.addGlobalErrorFacesMessage(config.getMessage(), stackTrace.toString());
        return true;
	}

	private void addErrorMessageCode(String messageCode) {
		FacesContext.getCurrentInstance().addMessage("messageCode", new FacesMessage(FacesMessage.SEVERITY_ERROR, messageCode, messageCode));
	}

}
