package br.com.bradesco.web.giss.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

/**
 * Classe responsável pela formatação dos campos.
 * 
 * @author Paloma
 *
 */
public class Formatacao{
	public static final String TIPO_CPF="1";
	public static final String TIPO_CNPJ="2";
	  private static Locale locale = new Locale("pt", "BR");
	
	/*
	 * TIPO DE DADO:
	 * 1 - CPF
	 * 2 - CNPJ
	 * 3 - CLUB
	 * 4 - NPessoa
	 * 7 - COEX
	 */		
	public static String formatarCampo(String tipoDado, String numero) {
		if(numero==null)return "";
		if (tipoDado.equals("1")) {
			//CPF
			numero = completeToLeft(numero, '0', 11);
			numero = formatarNumero("###.###.###-##", numero);
		} else if (tipoDado.equals("2")) {
			//CNPJ
			numero = completeToLeft(numero, '0', 14);
			numero = formatarNumero("##.###.###/####-##", numero);
		} else if (tipoDado.equals("7")) {
			//COEX
			numero = completeToLeft(numero, '0', 5);
		} else if (tipoDado.equals("3") || tipoDado.equals("4")) {
			//CLUB || NPessoa || COEX - Ainda nao existe máscara.
		}
		return numero.equals("0")?null:numero;
	}

	/*
	 * TIPO DE DADO:
	 * 1 - CPF
	 * 2 - CNPJ
	 * 3 - CLUB
	 * 4 - NPessoa
	 * 7 - COEX
	 */		
	public static String formatarTipoPessoa(String tipoDado) {
		if(tipoDado==null)return "";
		if (tipoDado.equals("1")) {
			return "Física";
		} else if (tipoDado.equals("2")) {
			return "Jurídica";
		} else if (tipoDado.equals("3")) {
			return "Club";
		} else if (tipoDado.equals("4")) {
			return "Número Pessoa";
		} else if (tipoDado.equals("7")) {
			return "Coex";
		} else {
			return "";
		}
	}
	
	/*
	 * Formata o numero de acordo com a máscara recebida
	 */
	protected static String formatarNumero(String mascara, String numero){
		String novoValor = "";
		int posicao = 0;
		
		char[] mascaras = mascara.toCharArray();
		char[] numeros = numero.toCharArray();
		for (int i = 0; mascaras.length > i; i++) {
			if (mascaras[i] == '#') {
				if (numero.length() > posicao) {
					novoValor = novoValor + numeros[posicao];
					posicao++;
				} else {
					break;
				}
			} else {
				if (numero.length() > posicao) {
					novoValor = novoValor + mascaras[i];
				} else {
					break;
				}
			}
		}
		return novoValor;
	}
    
	

	
	public static String formatarTelefone(String numero){
		if (numero == null) {
			return "";
		}
		if (numero.length()<9){
			numero = formataZerosEsquerda(numero, 9);
		}
		numero = formatarNumero("#####-####", numero);
		return numero;
	}
	
	public static String retirarMascaraTelefone(String numero){
		numero = replaceAll(numero, "-", "");
		return numero;
	}
	public static String retirarMascaraCNPJ(String numero){
		numero = numero.replaceAll("-", "");
		numero = numero.replaceAll("/", "");
		numero = numero.replaceAll("\\.", "");
		return numero;
	}
	
	public static String completeToLeft(String value, char c, int size) {   
        String result = value;   
  
        while (result.length() < size) {   
            result = c + result;   
        }   
  
        return result;   
    }

	public static String completeToRight(String value, char c, int size) {   
        String result = value;   
  
        while (result.length() < size) {   
            result = result + c ;   
        }   
  
        return result;   
    }

	public static BigDecimal retirarMascaraBigDecimal(String num) {
		if(num==null || "".equals(num))return BigDecimal.ZERO;
		num = num.replaceAll("\\.", "");
		num = num.replaceAll(",", "\\.");
		return new BigDecimal(num);	
    } 

	public static Double retirarMascaraDouble(String num) {
		if(num==null || "".equals(num))return 0.0;
		num = num.replaceAll("\\.", "");
		num = num.replaceAll(",", "\\.");
		return Double.valueOf(num);	
    }
	
	public static Double retirarMascaraDoubleCatalogo(String num) {
		if(num==null || "".equals(num))return 0.0;
		num = num.replaceAll(",", "");
		return Double.valueOf(num);	
    }

	/**
	 * Converte um double para o formato de numeros decimais utilizados na
	 * pagina.
	 * 
	 * @param valor
	 *            valor decimal a ser convertido
	 * @param decimais
	 *            numero de casas decimais
	 * @return
	 */
	public static String formatarValores(double valor, int decimais) {
		NumberFormat nf = NumberFormat.getNumberInstance(locale);
		nf.setMaximumFractionDigits(decimais);
		nf.setMinimumFractionDigits(decimais);
		return nf.format(valor);
	}
	
	  /**
	 * Converte um BigDecimal para o formato de numeros decimais utilizados na
	 * pagina.
	 * 
	 * @param valor
	 *            valor decimal a ser convertido
	 * @param decimais
	 *            numero de casas decimais
	 * @return
	 */
	public static String formatarValores(BigDecimal valor, int decimais) {
		DecimalFormat nf = (DecimalFormat) DecimalFormat.getInstance(locale);
		nf.setMaximumFractionDigits(decimais);
		nf.setMinimumFractionDigits(decimais);
		nf.setParseBigDecimal(true);
		return nf.format(valor);
	}
	
	public static String replaceAll(String val, String substituir, String substituto){

		   String ret ="";

		   String rest = val;

		   while(rest.indexOf(substituir)!=-1){

		      ret += rest.substring(0, rest.indexOf(substituir)) + substituto;

		      rest = rest.substring(rest.indexOf(substituir) + substituir.length());
		   }
		   return ret + rest;
		}

	public static String formatarValores(Double value) {

		String num = value.toString();
		
		String decimais = "", inteiros = num;

		if (num.indexOf(".") != -1 || num.indexOf(",") != -1) {
			decimais =
				","
					+ num.substring(
						(num.indexOf("") != -1 ? num.indexOf(".") : num.indexOf(",")) + 1,
						num.length());
			inteiros = num.substring(0, num.indexOf(".") != -1 ? num.indexOf(".") : num.indexOf(","));
		}

		String novoNum = "";

		int qtd = 0;
		for (int i = inteiros.length(); i >= 1; i--) {

			if (qtd == 3) {
				novoNum = "." + novoNum;
				qtd = 0;
			}
			novoNum = inteiros.substring(i - 1, i) + novoNum;
			qtd++;

		}
		//}
        if (decimais.equals("")){
			decimais = ",00";
        }else if (decimais.length() < 3){
			decimais = decimais + "0";
        }
		if (novoNum.equals("")){
			novoNum = "0";
		}
		return novoNum + decimais;
	} 

	public static String formatarValoresBig(BigDecimal value) {

		String num = value.toString();
		
		String decimais = "", inteiros = num;

		if (num.indexOf(".") != -1 || num.indexOf(",") != -1) {
			decimais =
				","
					+ num.substring(
						(num.indexOf(".") != -1 ? num.indexOf(".") : num.indexOf(",")) + 1,
						num.length());
			inteiros = num.substring(0, num.indexOf(".") != -1 ? num.indexOf(".") : num.indexOf(","));
		}

		String novoNum = "";

		int qtd = 0;
		for (int i = inteiros.length(); i >= 1; i--) {

			if (qtd == 3) {
				novoNum = "." + novoNum;
				qtd = 0;
			}
			novoNum = inteiros.substring(i - 1, i) + novoNum;
			qtd++;

		}
		//}
        if (decimais.equals("")){
			decimais = ",00";
        }else if (decimais.length() < 3){
			decimais = decimais + "0";
        }
		if (novoNum.equals("")){
			novoNum = "0";
		}
		return novoNum + decimais;
	} 	
	
	public static String formataZerosEsquerda(String s, int quantidade) {
		s = s.trim();
		if (s.length() < quantidade)
			for (int i = s.length(); i < quantidade; i++)
				s = "0" + s;

		return s;
	}
	
	public static String formatasPACESEsquerda(String s, int quantidade) {
		s = s.trim();
		if (s.length() < quantidade)
			for (int i = s.length(); i < quantidade; i++)
				s = " " + s;

		return s;
	}
	
	public static String formataSpacesDireita(String s, int quantidade) {
		s = s.trim();
		if (s.length() < quantidade)
			for (int i = s.length(); i < quantidade; i++)
				s = s + " ";

		return s;
	}
	
	public static String formatarValores(BigDecimal valor) {
		NumberFormat nf = new DecimalFormat("#,##0.00");
		return nf.format(valor);
	}
	
	/**
	 * Formata o cep
	 * @param cep
	 * @param complemento
	 * @return 
	 */
	public static String formataCEP(int cep, int complemento ){
		return new Formatter().format("%05d-%03d", cep, complemento).toString();
	}
	
	/**
	 * Retorna um int[] sendo:
	 *   [0] - cep
	 *   [1] - complemento 
	 * @param cep
	 * @return
	 */
	public static int[] lerCEP(String cep){
		int[] ret={0,0};
		if(cep==null)return ret;
		String[] s=cep.split("-");
		try{
			ret[0]=Integer.parseInt(s[0]);
			ret[1]=Integer.parseInt(s[1]);
		}catch(Exception e){} // Nao trata, pode ser 
		return ret;
	}
	
	public static String tabularADireita(String s, int quantidade){
		s = s.trim();
		quantidade += s.length();
		if (s.length() < quantidade)
			for (int i = s.length(); i < quantidade; i++)
				s = s + "\r\t";

		return s;
	}
	
	public static String tabularAEsquerda(String s, int quantidade) {
		s = s.trim();
		quantidade += s.length();
		if (s.length() < quantidade)
			for (int i = s.length(); i < quantidade; i++)
				s = "\r\t" + s;

		return s;
	}
	
	
}
