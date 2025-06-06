/**
 * Nome: br.com.bradesco.web.cbpc.utils
 * Compilador: JDK 1.5
 * Propósito: INSERIR O PROPÓSITO DAS CLASSES DO PACOTE
 * Data da criação: <dd/MM/yyyy>
 * Parâmetros de compilação: -d
 */
package br.com.bradesco.web.giss.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Nome: CpfCnpjUtils
 * <p>
 * Propósito: Interface do adaptador CpfCnpjUtils
 * </p>.
 *
 * @author CPM Braxis / TI Melhorias - Arquitetura
 * @version 1.0
 */
public abstract class CpfCnpjUtils {

	/** Atributo FILIAL. */
	private static final String FILIAL = "0000";
	
	/** Atributo CONTROLE. */
	private static final String CONTROLE = "00";
	
	/** Atributo PRINCIPAL_CPF. */
	private static final String PRINCIPAL_CPF = "000,000,000";
	
	/** Atributo PRINCIPAL_CNPJ. */
	private static final String PRINCIPAL_CNPJ = "#00,000,000";
	
	/** Atributo PT_BR. */
	private static final Locale PT_BR = new Locale("pt", "BR");
	
	/** Atributo EN_US. */
	private static final Locale EN_US = new Locale("en", "US"); 

	/**
	 * Instancia um novo CpfCnpjUtils.
	 */
	private CpfCnpjUtils() {
		// Classes de utilidades não devem possuir um construtor público.
	}

	/**
	 * Nome: formatarCpfCnpj.
	 *
	 * @param cpfCpnj the cpf cpnj
	 * @param cpfCpnjFilial the cpf cpnj filial
	 * @param cpfCpnjControle the cpf cpnj controle
	 * @return the string
	 */
	public static String formatarCpfCnpj(Long cpfCpnj, Integer cpfCpnjFilial,
			Integer cpfCpnjControle) {

		if (cpfCpnj == null || cpfCpnj == 0 || cpfCpnjFilial == null
				|| cpfCpnjControle == null) {
			return "";
		}

		StringBuilder cStr = new StringBuilder();

		if (cpfCpnjFilial == 0) { // CPF
			cStr.append(NumberUtils.format(cpfCpnj, PRINCIPAL_CPF));
			cStr.append("-");
			cStr.append(NumberUtils.format(cpfCpnjControle, CONTROLE));

		} else { // CNPJ

			cStr.append(NumberUtils.format(cpfCpnj, PRINCIPAL_CNPJ));
			cStr.append("/");
			cStr.append(NumberUtils.format(cpfCpnjFilial, FILIAL));
			cStr.append("-");
			cStr.append(NumberUtils.format(cpfCpnjControle, CONTROLE));
		}

		return cStr.toString();
	}

	/**
	 * Nome: extraiCpfCnpjPrincipal.
	 *
	 * @param sdocumento the sdocumento
	 * @return the long
	 */
	public static Long extraiCpfCnpjPrincipal(String sdocumento) {
		if (sdocumento == null || sdocumento.trim().equals("")) {
			return 0L;
		}

		String documento = sdocumento;
		StringBuilder sb = new StringBuilder("0");
		StringBuilder resultado;

		documento = GissUtil.replaceAll(documento, ".", "");
		documento = GissUtil.replaceAll(documento, "/", "");
		documento = GissUtil.replaceAll(documento, "-", "");

		if (documento.length() == 14) {
			resultado = sb.append(documento);
			documento = resultado.toString();
		}

		return Long.parseLong(documento.substring(0, 9));
	}

	/**
	 * Nome: extraiCnpjFilial.
	 *
	 * @param sdocumento the sdocumento
	 * @return the integer
	 */
	public static Integer extraiCnpjFilial(String sdocumento) {

		if (sdocumento == null) {
			return 0;
		}

		String documento = sdocumento;
		documento = GissUtil.replaceAll(documento, ".", "");
		documento = GissUtil.replaceAll(documento, "/", "");
		documento = GissUtil.replaceAll(documento, "-", "");

		if (documento.length() == 11) {
			return 0;
		} else {
			return Integer.parseInt(documento.substring(8, 12));
		}
	}

	/**
	 * Nome: extraiCpfCnpjDigito.
	 *
	 * @param sdocumento the sdocumento
	 * @return the integer
	 */
	public static Integer extraiCpfCnpjDigito(String sdocumento) {

		if (sdocumento == null) {
			return 0;
		}

		String documento = sdocumento;
		documento = GissUtil.replaceAll(documento, ".", "");
		documento = GissUtil.replaceAll(documento, "/", "");
		documento = GissUtil.replaceAll(documento, "-", "");

		return Integer.parseInt(documento.substring(documento.length() - 2,
				documento.length()));
	}

	/**
	 * Nome: formatCpfCnpj.
	 *
	 * @param identificador the identificador
	 * @param codigo the codigo
	 * @return the string
	 */
	public static String formatCpfCnpj(Long identificador, Integer codigo) {

		if (identificador == null || codigo == null) {
			return "";
		}

		StringBuffer cnpjOuCpf = new StringBuffer();

		NumberFormat numberFormat = NumberFormat
				.getIntegerInstance(PT_BR);

		if (codigo.equals(1)) {
			String cpf = identificador.toString().substring(0, 9);
			String controle = identificador.toString().substring(9, 11);

			cnpjOuCpf.append(numberFormat.format(new Long(cpf)));
			cnpjOuCpf.append("-");
			cnpjOuCpf.append(controle);

			return cnpjOuCpf.toString();

		} else {
			String cnpj = identificador.toString().substring(0, 9);
			String filial = identificador.toString().substring(9, 13);
			String controle = identificador.toString().substring(13, 15);

			cnpjOuCpf.append(numberFormat.format(new Long(cnpj)));
			cnpjOuCpf.append("/");
			cnpjOuCpf.append(filial);
			cnpjOuCpf.append("-");
			cnpjOuCpf.append(controle);

			return cnpjOuCpf.toString();
		}
	}

	/**
	 * Nome: formatCpfCnpjCompleto.
	 *
	 * @param cnpjCpf the cnpj cpf
	 * @param filial the filial
	 * @param controle the controle
	 * @return the string
	 */
	public static String formatCpfCnpjCompleto(Long cnpjCpf, Integer filial,
			Integer controle) {

		if (cnpjCpf == null || filial == null || controle == null) {
			return "";
		}

		StringBuffer cnpjOuCpf = new StringBuffer();
		NumberFormat numberFormat = NumberFormat
				.getIntegerInstance(PT_BR);
		String cnpjCpfAux = numberFormat.format(cnpjCpf);
		String[] partesCnpj = cnpjCpfAux.split("\\.");

		if (partesCnpj.length >= 1 && partesCnpj[0] != null) {
			cnpjCpfAux = String.format("%03d", new Long(partesCnpj[0].trim()));
		} else {
			cnpjCpfAux = "000";
		}

		if (partesCnpj.length >= 2 && partesCnpj[1] != null) {
			cnpjCpfAux = cnpjCpfAux.concat(".").concat(
					String.format("%03d", new Long(partesCnpj[1].trim())));
		} else {
			cnpjCpfAux = cnpjCpfAux.concat(".").concat("000");
		}

		if (partesCnpj.length >= 3 && partesCnpj[2] != null) {
			cnpjCpfAux = cnpjCpfAux.concat(".").concat(
					String.format("%03d", new Long(partesCnpj[2].trim())));
		} else {
			cnpjCpfAux = cnpjCpfAux.concat(".").concat("000");
		}

		if (filial.equals(0)) {
			cnpjOuCpf.append(cnpjCpfAux);
			cnpjOuCpf.append("-");
			cnpjOuCpf.append(String.format("%02d", controle));
			return cnpjOuCpf.toString();
		} else {
			cnpjOuCpf.append(cnpjCpfAux);
			cnpjOuCpf.append("/");
			cnpjOuCpf.append(String.format("%04d", filial));
			cnpjOuCpf.append("-");
			cnpjOuCpf.append(String.format("%02d", controle));
			return cnpjOuCpf.toString();
		}
	}

	/**
	 * Nome: extrairCpfCnpjPrincipalLong.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the long
	 */
	public static Long extrairCpfCnpjPrincipalLong(Long cpfCnpj) {

		if (cpfCnpj == null) {
			return null;
		}

		if (cpfCnpj.toString().length() < 7) {
			return null;
		}

		String valorFormatado = String.valueOf(cpfCnpj);

		String corpoPrincipal = valorFormatado.substring(0, valorFormatado
				.length() - 6);

		return !corpoPrincipal.equals("") ? Long.parseLong(corpoPrincipal) : 0L;

	}

	/**
	 * Nome: extrairCpfCnpjFilialInteiro.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the integer
	 */
	public static Integer extrairCpfCnpjFilialInteiro(Long cpfCnpj) {

		if (cpfCnpj == null) {

			return null;
		}

		String valorFormatado = String.valueOf(cpfCnpj);
		String numFilial = valorFormatado.substring(
				valorFormatado.length() - 6, valorFormatado.length() - 2);

		return Integer.parseInt(numFilial);
	}

	/**
	 * Nome: extrairCpfCnpjDigitoControleInteiro.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the integer
	 */
	public static Integer extrairCpfCnpjDigitoControleInteiro(Long cpfCnpj) {

		if (cpfCnpj == null) {

			return null;
		}

		String valorFormatado = String.valueOf(cpfCnpj);
		String digitoControle = valorFormatado.substring(valorFormatado
				.length() - 2, valorFormatado.length());

		return Integer.parseInt(digitoControle);

	}

	/**
	 * Nome: removerFormatacaoCpfCnpj.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the long
	 */
	public static Long removerFormatacaoCpfCnpj(String cpfCnpj) {
		if ((cpfCnpj == null) || (cpfCnpj.equals(""))) {
			return null;
		}

		String documentoAux = cpfCnpj;

		documentoAux = documentoAux.replace(".", "");
		documentoAux = documentoAux.replace("/", "");
		documentoAux = documentoAux.replace("-", "");

		return Long.parseLong(documentoAux);
	}

	/**
	 * Nome: removerFormatacaoCpfCnpjString.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the string
	 */
	public static String removerFormatacaoCpfCnpjString(String cpfCnpj) {
		if ((cpfCnpj == null) || (cpfCnpj.equals(""))) {
			return "";
		}

		String documentoAux = cpfCnpj;

		documentoAux = documentoAux.replace(".", "");
		documentoAux = documentoAux.replace("/", "");
		documentoAux = documentoAux.replace("-", "");

		return documentoAux;
	}

	/**
	 * Nome: formatarCpfCnpjLong.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the long
	 */
	public static Long formatarCpfCnpjLong(String cpfCnpj) {

		if (cpfCnpj == null) {

			return null;
		}

		String valorFormatado = null;
		String cpfCnpjAux = cpfCnpj;

		if (cpfCnpjAux.indexOf('/') > -1) {

			if (cpfCnpjAux.length() == 18) {

				cpfCnpjAux = GissUtil.replaceAll(cpfCnpjAux, ".", "");
				cpfCnpjAux = GissUtil.replaceAll(cpfCnpjAux, "/", "");
				cpfCnpjAux = GissUtil.replaceAll(cpfCnpjAux, "-", "");
				valorFormatado = cpfCnpjAux;
			}

		} else {

			if (cpfCnpjAux.length() == 14) {

				cpfCnpjAux = GissUtil.replaceAll(cpfCnpjAux, ".", "");
				cpfCnpjAux = GissUtil.replaceAll(cpfCnpjAux, "-", "");

				StringBuilder sb = new StringBuilder(cpfCnpjAux);

				sb.insert(9, "0");
				sb.insert(10, "0");
				sb.insert(11, "0");
				sb.insert(12, "0");

				valorFormatado = sb.toString();
			}

		}
		return valorFormatado != null ? Long.parseLong(valorFormatado) : null;
	}

	/**
	 * Formatar cpf cnpj.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the string
	 */
	public static String formatarCpfCnpj(Long cpfCnpj) {
		Long valorCpfCnpj = cpfCnpj;
		if (cpfCnpj == null) {
			valorCpfCnpj = 0L;
		}
		String cpfCnpjCompleto = String.format("%015d", valorCpfCnpj);
		StringBuilder cpfCnpjFormatado = new StringBuilder();

		String filial = cpfCnpjCompleto.substring(9, 13);
		if (filial.equals("0000")) { // CPF
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(0, 3));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(3, 6));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(6, 9));
			cpfCnpjFormatado.append("-");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(13, 15));
		} else {
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(1, 3));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(3, 6));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(6, 9));
			cpfCnpjFormatado.append("/");
			cpfCnpjFormatado.append(filial);
			cpfCnpjFormatado.append("-");
			cpfCnpjFormatado.append(cpfCnpjCompleto.substring(13, 15));
		}
		
		return cpfCnpjFormatado.toString();
	}

	/**
	 * Nome: formatarCpfCnpjString.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the string
	 */
	public static String formatarCpfCnpjString(Long cpfCnpj) {

		if (cpfCnpj == null
				|| (cpfCnpj.toString().trim().length() != 11
						&& cpfCnpj.toString().trim().length() != 14 && cpfCnpj
						.toString().trim().length() != 15)) {

			return "";
		}

		String cpfCnpjFormatado = cpfCnpj.toString();

		if (cpfCnpjFormatado.trim().length() == 11
				|| cpfCnpjFormatado.trim().length() == 15) {

			StringBuilder builderCpf = new StringBuilder(cpfCnpjFormatado);

			if (builderCpf.length() == 15) {
				builderCpf.delete(9, 13);
			}

			builderCpf.insert(3, ".");
			builderCpf.insert(7, ".");
			builderCpf.insert(11, "-");

			cpfCnpjFormatado = builderCpf.toString();

		} else {

			if (cpfCnpjFormatado.trim().substring(
					cpfCnpjFormatado.trim().length() - 3,
					cpfCnpjFormatado.trim().length() - 2).equals("0")) {

				StringBuilder builderCpf = new StringBuilder("");

				String corpoCpf = cpfCnpjFormatado.trim().substring(0, 9);
				String digitoCpf = cpfCnpjFormatado.trim().substring(
						cpfCnpjFormatado.trim().length() - 2,
						cpfCnpjFormatado.trim().length());

				builderCpf.append(corpoCpf);
				builderCpf.append(digitoCpf);

				builderCpf.insert(3, ".");
				builderCpf.insert(7, ".");
				builderCpf.insert(11, "-");

				cpfCnpjFormatado = builderCpf.toString();

			} else {

				StringBuilder builderCnpj = new StringBuilder(cpfCnpjFormatado);

				builderCnpj.insert(2, ".");
				builderCnpj.insert(6, ".");
				builderCnpj.insert(10, "/");
				builderCnpj.insert(15, "-");

				cpfCnpjFormatado = builderCnpj.toString();
			}

		}

		return cpfCnpjFormatado;
	}

	/**
	 * Nome: formatarCpfCnpj.
	 *
	 * @param cpfCpnj the cpf cpnj
	 * @param cpfCpnjFilial the cpf cpnj filial
	 * @param cpfCpnjControle the cpf cpnj controle
	 * @return the string
	 */
	public static String formatarCpfCnpj(String cpfCpnj, String cpfCpnjFilial,
			String cpfCpnjControle) {
		return formatarCpfCnpj(GissUtil.verificaStringNulaLong(cpfCpnj),
				GissUtil.verificaStringNulaInteger(cpfCpnjFilial), GissUtil
						.verificaStringNulaInteger(cpfCpnjControle));
	}

	/**
     * Is cnpj.
     * 
     * @param numero
     *            the numero
     * @param filial
     *            the filial
     * @param controle
     *            the controle
     * @return true, if is cnpj
     */
	public static boolean isCnpj(Long numero, Integer filial, Integer controle) {
	    if (filial == null || filial == 0) {
	        return false;
	    }

	    return true;
	}

	/**
     * Formata cpf cnpj em partes.
     * 
     * @param numero
     *            the numero
     * @param filial
     *            the filial
     * @param controle
     *            the controle
     * @return the string[]
     */
	public static String[] formataCpfCnpjEmPartes(Long numero, Integer filial, Integer controle) {
	    if (numero == null || numero == 0) {
	        return new String[] {"", "", ""};
	    }

	    String[] cpfCnpjEmPartes = new String[3];

	    if (isCnpj(numero, filial, controle)) {
	        cpfCnpjEmPartes[0] = NumberUtils.format(numero, PRINCIPAL_CNPJ);
	        cpfCnpjEmPartes[1] = NumberUtils.format(filial, FILIAL);
	        cpfCnpjEmPartes[2] = NumberUtils.format(controle, CONTROLE);
	    } else {
	        cpfCnpjEmPartes[0] = NumberUtils.format(numero, PRINCIPAL_CPF);
            cpfCnpjEmPartes[1] = "";
            cpfCnpjEmPartes[2] = NumberUtils.format(controle, CONTROLE);
	    }

	    return cpfCnpjEmPartes;
	}
	
}
