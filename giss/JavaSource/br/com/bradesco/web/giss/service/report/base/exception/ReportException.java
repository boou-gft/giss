package br.com.bradesco.web.giss.service.report.base.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;

/**
 * Exceção lançada quando ocorre erro na geração de relatório.
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
