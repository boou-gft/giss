/**
 * 
 */
package br.com.bradesco.web.giss.service.provider.intranet.exception;

import br.com.bradesco.web.aq.application.error.BradescoApplicationException;

/**
 * @author edwin.costa
 *
 */
public class AlterarSenhaException extends BradescoApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4634004017845645251L;

	/**
	 * 
	 */
	public AlterarSenhaException() {
		super();
	}

	/**
	 * @param message
	 * @param code
	 */
	public AlterarSenhaException(String message, String code) {
		super(message, code);
	}

	/**
	 * @param message
	 * @param cause
	 * @param code
	 */
	public AlterarSenhaException(String message, Throwable cause, String code) {
		super(message, cause, code);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AlterarSenhaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AlterarSenhaException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 * @param code
	 */
	public AlterarSenhaException(Throwable cause, String code) {
		super(cause, code);
	}

	/**
	 * @param cause
	 */
	public AlterarSenhaException(Throwable cause) {
		super(cause);
	}

}
