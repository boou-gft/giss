/**
 * Nome: br.com.bradesco.web.pgit.view.bean.CriptografiaBean
 * Compilador JDK 1.5
 * Prop�sito: Classes referentes aos Backing Beans da aplica��o.
 * Par�metros de Compila��o: 
 * Data da Cria��o: 06/07/2009
 *
 */
package br.com.bradesco.web.giss.view.bean;

import javax.faces.event.ActionEvent;

import org.apache.commons.lang.StringUtils;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.security.encryption.IBradescoCipher;

/**
 * Nome: CriptografiaBean
 * <p>
 * Prop�sito: Backing Bean para o exemplo de uso do mecanismo de 
 * Criptografia.
 * </p>
 * 
 * @author Alexandre Michetti Manduca <br/>
 *         Equipe: CPM Braxis / TI Melhorias - Arquitetura
 * 
 * @version 1.0
 */
public class CriptografiaBean {

	/**
	 * Valor para binding do texto que sera criptografado
	 */
	private String criptografarTextoPuro;
	
	/**
	 * Valor para binding do texto que foi criptografado
	 */
	private String criptografarTextoCriptografado;

	/**
	 * Valor para binding do texto que sera descriptografado
	 */
	private String descriptografarTextoPuro;
	
	/**
	 * Valor para binding do texto que foi descriptografado
	 */
	private String descriptografarTextoCriptografado;

	/**
	 * Instancia o mecanismo de criptografia.
	 * Esse mecanismo � configurado como um bean no contexto do Spring e 
	 * deve ser injetado atrav�s das configura��es do JSF (veja arquivo
	 * faces-managed-beans-config.xml e applicationContext-security.xml)
	 */
	private IBradescoCipher cipher;

	/**
	 * Nome: criptografar
	 * <p>Prop�sito: Action Listener para criptografar um texto.
	 * </p>
	 * 
	 * @param event
	 * 		Evento recebido por esse Action Listener.
	 */		
	public void criptografar(ActionEvent event) {
		if (StringUtils.isBlank(this.getCriptografarTextoPuro())) {
			throw new BradescoViewException("", "pages_criptografia_erro_texto_criptografar_nulo", "");
		}
		
		try {
			String encriptedText = cipher.encript(this.getCriptografarTextoPuro());
			this.setCriptografarTextoCriptografado(encriptedText);

		} catch (Exception ex) {
			throw new BradescoViewException(ex.getMessage(), "000", "");
		}
	}
	
	/**
	 * Nome: descriptografar
	 * <p>Prop�sito: Action Listener para descriptografar um texto.
	 * </p>
	 * 
	 * @param event
	 * 		Evento recebido por esse Action Listener.
	 */		
	public void descriptografar(ActionEvent event) {
		if (StringUtils.isBlank(this.getDescriptografarTextoCriptografado())) {
			throw new BradescoViewException("", "pages_criptografia_erro_texto_descriptografar_nulo", "");
		}
		
		try {
			this.setDescriptografarTextoPuro(new String(cipher.decript(this.getDescriptografarTextoCriptografado())));

		} catch (Exception ex) {
			throw new BradescoViewException(ex.getMessage(), "000", "");
		}
	}

	/**
	 * Nome: getProviderInfo
	 * <p>Prop�sito: Metodo para obter o parametro Info do Provider JCA.
	 * </p>
	 * 
	 * @return String
	 * 		Texto com informacoes do Provider JCA em uso.
	 */		
	public String getProviderInfo() {
		return this.cipher.getProviderInfo().get("Info");
	}

	/**
	 * Nome: getProviderName
	 * <p>Prop�sito: Metodo para obter o nome do Provider JCA.
	 * </p>
	 * 
	 * @return String
	 * 		Texto com o nome do Provider JCA em uso
	 */		
	
	public String getProviderName() {
		return this.cipher.getProviderInfo().get("Name");
	}

	/**
	 * Nome: getProviderVersion
	 * <p>Prop�sito: Metodo para obter a vers�o do Provider JCA.
	 * </p>
	 * 
	 * @return String
	 * 		Texto com a vers�o do Provider JCA em uso.
	 */		
	public String getProviderVersion() {
		return this.cipher.getProviderInfo().get("Version");
	}

	/**
	 * Nome: getAlgorithmInUse
	 * <p>Prop�sito: Metodo para obter o algoritmo de criptografia
	 * que est� sendo utilizado.
	 * </p>
	 * 
	 * @return String
	 * 		Texto com o nome do algoritmo de criptografia em uso.
	 */		
	public String getAlgorithmInUse() {
		return this.cipher.getAlgorithm();
	}	
	
	/**
	 * Nome: getCriptografarTextoPuro
	 * <p>Prop�sito: Metodo para obter o texto que sera criptografado. 
	 * </p>
	 * 
	 * @return String
	 * 		Texto que sera criptografado.
	 */		
	public String getCriptografarTextoPuro() {
		return criptografarTextoPuro;
	}

	/**
	 * Nome: setCriptografarTextoPuro
	 * <p>Prop�sito: Metodo para definir o texto que sera criptografado.
	 * </p>
	 * 
	 * @param criptografarTextoPuro
	 * 		Texto que ser� criptografado.
	 */		
	public void setCriptografarTextoPuro(String criptografarTextoPuro) {
		this.criptografarTextoPuro = criptografarTextoPuro;
	}

	/**
	 * Nome: getCriptografarTextoCriptografado
	 * <p>Prop�sito: Metodo para obter o texto criptografado. 
	 * </p>
	 * 
	 * @return String
	 * 		Texto com o texto criptografado.
	 */		
	public String getCriptografarTextoCriptografado() {
		return criptografarTextoCriptografado;
	}

	/**
	 * Nome: setCriptografarTextoCriptografado
	 * <p>Prop�sito: Metodo para definir o texto que foi criptografado.
	 * </p>
	 * 
	 * @param criptografarTextoCriptografado
	 * 		Texto que foi criptografado.
	 */		
	public void setCriptografarTextoCriptografado(String criptografarTextoCriptografado) {
		this.criptografarTextoCriptografado = criptografarTextoCriptografado;
	}

	/**
	 * Nome: getDescriptografarTextoPuro
	 * <p>Prop�sito: Metodo para obter o texto que ser� descriptografado. 
	 * </p>
	 * 
	 * @return String
	 * 		Texto que ser� descriptografado. 
	 */		
	public String getDescriptografarTextoPuro() {
		return descriptografarTextoPuro;
	}

	/**
	 * Nome: setDescriptografarTextoPuro
	 * <p>Prop�sito: Metodo para definir o texto que ser� descriptografado. 
	 * </p>
	 * 
	 * @param descriptografarTextoPuro
	 * 		Texto que ser� descriptografado.
	 */		
	public void setDescriptografarTextoPuro(String descriptografarTextoPuro) {
		this.descriptografarTextoPuro = descriptografarTextoPuro;
	}

	/**
	 * Nome: getDescriptografarTextoCriptografado
	 * <p>Prop�sito: Metodo para obter que foi descriptografado.
	 * </p>
	 * 
	 * @return String
	 * 		Texto que foi descriptografado.
	 */		
	public String getDescriptografarTextoCriptografado() {
		return descriptografarTextoCriptografado;
	}

	/**
	 * Nome: setDescriptografarTextoCriptografado
	 * <p>Prop�sito: Metodo para definir o texto que foi descriptografado.
	 * </p>
	 * 
	 * @param descriptografarTextoCriptografado
	 * 		Texto que foi descriptografado. 
	 */		
	public void setDescriptografarTextoCriptografado(String descriptografarTextoCriptografado) {
		this.descriptografarTextoCriptografado = descriptografarTextoCriptografado;
	}

	/**
	 * Nome: getCipher
	 * <p>Prop�sito: Metodo para obter o mecanismo de criptografia.
	 * </p>
	 * 
	 * @return IBradescoCipher
	 * 		Mecanismo de criptografia. 
	 */		
	public IBradescoCipher getCipher() {
		return cipher;
	}

	/**
	 * Nome: setCipher
	 * <p>Prop�sito: Metodo para definir o mecanismo de criptografia. 
	 * </p>
	 * 
	 * @parma cipher
	 * 		Mecanismo de criptografia. 
	 */		
	public void setCipher(IBradescoCipher cipher) {
		this.cipher = cipher;
	}

}
