package giss.processamento;

import br.com.bradesco.pdc.engine.exception.ProcessMessageException;
import br.com.bradesco.pdc.engine.process.action.ActionException;
import br.com.bradesco.pdc.engine.process.action.IActionContext;
import br.com.bradesco.pdc.engine.process.action.loop.ILoopAction;
import br.com.bradesco.pdc.engine.process.control.fwo.FWOUtils;

/**
 * FWO_COMBO
 * Arquivo gerado automaticamente em 04/06/25 16:57
 * 
 */
public class LpGissiacs implements ILoopAction {

    public boolean loop(IActionContext context, int iteration) 
    		throws ProcessMessageException, ActionException {

	    String codigoRetorno = context.getSession().getUserTransientStorage().get(FWOUtils.CODIGO_RETORNO);
    	
    	//Primeira execucao (nao existe codigo de retorno)
    	//Ou Codigo de retorno = 01 (existem mais dados) 
    	if ((codigoRetorno == null) 
    			|| (Integer.parseInt(codigoRetorno) == 1)) {
    		return true;
    	}
    	
    	return false;
    } 
}

