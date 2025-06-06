package br.com.bradesco.web.giss.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.error.config.IExceptionConfig;
import br.com.bradesco.web.aq.application.error.handler.BradescoApplicationExceptionHandler;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.view.bean.controller.exception.ExceptionBean;

public class GissViewExceptionHandler extends BradescoApplicationExceptionHandler {

	@Override
	protected boolean beforePerformForward(Exception exception, IExceptionConfig config) {
		StringWriter stackTrace = new StringWriter();
		exception.printStackTrace(new PrintWriter(stackTrace));

		ExceptionBean bean = (ExceptionBean) FacesUtils.getManagedBean("exceptionBean");
		bean.setDescricao(exception.getMessage());
		bean.setDetalhe(stackTrace.toString());

		BradescoFacesUtils.addErrorModalMessage(exception.getLocalizedMessage(), "appException", BradescoViewExceptionActionType.ACTION);

		return false;
	}
}
