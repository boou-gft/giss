package br.com.bradesco.web.giss.utils.exceptions;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;

public class GissFormatException extends BradescoApplicationException {

	private static final long serialVersionUID = 7695403584053933958L;

	public GissFormatException(String message, Throwable exception) {
		super(message, exception);
	}

	public GissFormatException(String message) {
		super(message);
	}
}
