package br.com.bradesco.web.giss.exception;

import br.com.bradesco.web.aq.application.error.config.IExceptionConfig;
import br.com.bradesco.web.aq.application.error.handler.BradescoApplicationExceptionHandler;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;

public class GissModalExceptionHandler extends BradescoApplicationExceptionHandler {

	@Override
	protected boolean beforePerformForward(Exception exception, IExceptionConfig config) {
		return true;
	}

	@Override
	protected void performForward(Exception exception, IExceptionConfig config) {
		BradescoFacesUtils.addErrorModalMessage(exception.getLocalizedMessage());
	}
}
