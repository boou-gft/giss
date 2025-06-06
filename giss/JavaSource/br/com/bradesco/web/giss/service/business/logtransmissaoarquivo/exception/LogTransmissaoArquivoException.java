package br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;

public class LogTransmissaoArquivoException extends
		BradescoApplicationException {

	private static final long serialVersionUID = -8930339397675408589L;

	public LogTransmissaoArquivoException() {
		super();
	}

	public LogTransmissaoArquivoException(String message) {
		super(message);
	}
	
	public LogTransmissaoArquivoException(Throwable cause) {
		super(cause);
	}
	
	public LogTransmissaoArquivoException(String message, Throwable cause) {
		super(message, cause);
	}

}
