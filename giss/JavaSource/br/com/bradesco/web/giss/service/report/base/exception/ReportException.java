package br.com.bradesco.web.giss.service.report.base.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;

/**
 * Exce��o lan�ada quando ocorre erro na gera��o de relat�rio.
 *
 */
public class ReportException extends BradescoApplicationException {

	private static final long serialVersionUID = -2269918158182069085L;

	public ReportException(String message, Throwable exception) {
		super(message, exception);
	}

	public ReportException(Throwable exception) {
		super(exception);
	}

	public ReportException(String message) {
		super(message);
	}
}
