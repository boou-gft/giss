package br.com.bradesco.web.giss.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;
import emsg.api.exception.EmsgApiException;

public class EnvioMensagemException extends BradescoApplicationException {

	private static final long serialVersionUID = 323884637614931600L;
	
	private EmsgApiException emsgApiException = null;

	public EnvioMensagemException(EmsgApiException exception) {
		super(exception.getMessage(), exception);
		this.emsgApiException = exception;
	}

	public int getReasonCode() {
		return this.emsgApiException.getReasonCode();
	}

	public int getReturnCode() {
		return this.emsgApiException.getReturnCode();
	}

}
