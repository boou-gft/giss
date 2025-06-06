/**
 * 
 */
package br.com.bradesco.web.giss.service.provider.intranet.impl;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcConnectorException;
import br.com.bradesco.web.aq.application.security.intranet.service.IAuthenticationService;
import br.com.bradesco.web.aq.application.security.intranet.service.exception.AuthenticationServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest;
import br.com.bradesco.web.giss.service.provider.intranet.IAlterarSenhaService;
import br.com.bradesco.web.giss.service.provider.intranet.exception.AlterarSenhaException;

/**
 * @author edwin.costa
 * 
 */
public class AuthenticationServiceImpl implements IAuthenticationService,
		IAlterarSenhaService {

	/**
	 * Contém a instância do logManager
	 */
	private ILogManager logManager = null;

	/**
	 * Factory do Adaptador de segurança.
	 */
	private FactoryAdapter factoryAdapter = null;

	/**
	 * @see br.com.bradesco.web.aq.application.security.intranet.service.IAuthenticationService#authenticate(java.lang.String,
	 *      java.lang.String)
	 */
	public void authenticate(String userName, String password)
			throws AuthenticationServiceException {
		if (userName == null || userName.trim().equals("")) {
			throw new AuthenticationServiceException("usuario.nulo",
					"O usuário não pode ser nulo.");
		}
		if (password == null || password.trim().equals("")) {
			throw new AuthenticationServiceException("senha.nulo",
					"A senha não pode ser nula.");
		}
		try {
			LogonRequest request = new LogonRequest();
			request.setIdUsuario(userName);
			request.setSenhaAtual(password);
			request.setSenhaNova("");
			request.setSenhaConfirmacao("");
			request.setAtualizarSenha("N");
			getFactoryAdapter().getAuthenticationServicePDCAdapter().invokeProcess(request);
		} catch (PdcConnectorException e) {
			throw new AuthenticationServiceException(e.getCode(), e.getMessage(), e);
		} catch (PdcAdapterException e) {
			throw new AuthenticationServiceException(e.getCode(), e.getMessage(), e);
		}
	}

	/**
	 * @return the factoryAdapter
	 */
	protected FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter
	 *            the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	/**
	 * @return the logManager
	 */
	public ILogManager getLogManager() {
		return logManager;
	}

	/**
	 * @param logManager
	 *            the logManager to set
	 */
	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	/**
	 * @see br.com.bradesco.web.giss.service.provider.intranet.IAlterarSenhaService#trocarSenha(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String)
	 */
	public void trocarSenha(String usuario, String senhaAtual,
			String novaSenha, String confirmNovaSenha)
			throws AlterarSenhaException {
		if (usuario == null || usuario.trim().equals("")) {
			throw new AlterarSenhaException("usuario.nulo",
					"O usuário não pode ser nulo.");
		}
		if (senhaAtual == null || senhaAtual.trim().equals("")) {
			throw new AlterarSenhaException("senha.nulo",
					"A senha não pode ser nula.");
		}
		if (novaSenha == null || novaSenha.trim().equals("")) {
			throw new AlterarSenhaException("novaSenha.nulo",
					"O usuário não pode ser nulo.");
		}
		if (confirmNovaSenha == null || confirmNovaSenha.trim().equals("")) {
			throw new AlterarSenhaException("confirmNovaSenha.nulo",
					"A senha não pode ser nula.");
		}
		try {
			LogonRequest request = new LogonRequest();
			request.setIdUsuario(usuario);
			request.setSenhaAtual(senhaAtual);
			request.setSenhaNova(novaSenha);
			request.setSenhaConfirmacao(confirmNovaSenha);
			request.setAtualizarSenha("S");
			getFactoryAdapter().getAuthenticationServicePDCAdapter().invokeProcess(
					request);
		} catch (PdcConnectorException e) {
			throw new AlterarSenhaException("pdc.conection.exception", e,
					"Erro de conexão com o PDC.");
		} catch (PdcAdapterException e) {
			throw new AlterarSenhaException("pdc.general.exception", e,
					"Erro ao executar o processo PDC.");
		}
	}
}
