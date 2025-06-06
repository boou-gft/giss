/**
 * 
 */
package br.com.bradesco.web.giss.service.provider.intranet;

import br.com.bradesco.web.giss.service.provider.intranet.exception.AlterarSenhaException;

/**
 * @author edwin.costa
 * 
 */
public interface IAlterarSenhaService {
	public void trocarSenha(String usuario, String senhaAtual,
			String novaSenha, String confirmNovaSenha)
			throws AlterarSenhaException;
}
