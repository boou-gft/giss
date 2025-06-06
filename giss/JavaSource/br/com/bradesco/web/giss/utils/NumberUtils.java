package br.com.bradesco.web.giss.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import br.com.bradesco.web.giss.utils.exceptions.GissFormatException;

public class NumberUtils {

	public static final String DEFAULT_DECIMAL_PATTERN = "#,##0.00";

	private static final String DEFAULT_CNPJ = "000000000000000";

	private static final String PRINCIPAL_CNPJ = "#00,000,000";
	
	 /**
     * Número 0.
     */
    public static final int  ZERO                    = 0;
    
    /**
     * Número 0, tipo long.
     */
    public static final long ZERO_L                  = 0L;

    /**
     * Número 1.
     */
    public static final int  UM                      = 1;

    /**
     * Número -2.
     */
    public static final int  MENOS_DOIS              = -2;

    /**
     * Número 2.
     */
    public static final int  DOIS                    = 2;

    /**
     * Número 3.
     */
    public static final int  TRES                    = 3;

    /**
     * Número 4.
     */
    public static final int  QUATRO                  = 4;

    /**
     * Número 5.
     */
    public static final int  CINCO                   = 5;

    /**
     * Número 6.
     */
    public static final int  SEIS                    = 6;

    /**
     * Número 7.
     */
    public static final int  SETE                    = 7;

    /**
     * Número 8.
     */
    public static final int  OITO                    = 8;

    /**
     * Número 9.
     */
    public static final int  NOVE                    = 9;

    /**
     * Número 10.
     */
    public static final int  DEZ                     = 10;

    /**
     * Número 10 Long.
     */
    public static final long DEZ_L                   = 10L;

    /**
     * Número 11.
     */
    public static final int  ONZE                    = 11;

    /**
     * Número 12.
     */
    public static final int  DOZE                    = 12;

    /**
     * Número -12.
     */
    public static final int  MENOS_DOZE              = -12;

    /**
     * Número 13.
     */
    public static final int  TREZE                   = 13;

    /**
     * Número 14.
     */
    public static final int  CATORZE                 = 14;

    /**
     * Número 15.
     */
    public static final int  QUINZE                  = 15;

    /**
     * Número 16.
     */
    public static final int  DEZESSEIS               = 16;

    /**
     * Número 17.
     */
    public static final int  DEZESSETE               = 17;

    /**
     * Número 18.
     */
    public static final int  DEZOITO                 = 18;

    /**
     * Número 19.
     */
    public static final int  DEZENOVE                = 19;

    /**
     * Número 20.
     */
    public static final int  VINTE                   = 20;

    /**
     * Número 30.
     */
    public static final int  TRINTA                  = 30;

    /**
     * Número 31.
     */
    public static final int  TRINTA_UM               = 31;

    /**
     * Número 35.
     */
    public static final int  TRINTA_CINCO            = 35;

    /**
     * Número 37.
     */
    public static final int  TRINTA_SETE             = 37;

    /**
     * Número 40.
     */
    public static final int  QUARENTA                = 40;

    /**
     * Número 41.
     */
    public static final int  QUARENTA_UM             = 41;

    /**
     * Número 43.
     */
    public static final int  QUARENTA_TRES           = 43;

    /**
     * Número 45.
     */
    public static final int  QUARENTA_CINCO          = 45;

    /**
     * Número 48.
     */
    public static final int  QUARENTA_OITO           = 48;

    /**
     * Número 48 Long.
     */
    public static final long QUARENTA_OITO_L         = 48L;

    /**
     * Número 50.
     */
    public static final int  CINQUENTA               = 50;

    /**
     * Número 55.
     */
    public static final int  CINQUENTA_CINCO         = 55;

    /**
     * Número 59.
     */
    public static final int  CINQUENTA_NOVE          = 59;

    /**
     * Número 60.
     */
    public static final int  SESSENTA                = 60;

    /**
     * Número 64. Número para o texto no comprovante de antenticação
     */
    public static final int  SESSENTA_QUATRO         = 64;

    /**
     * Número 68.
     */
    public static final int  SESSENTA_OITO           = 68;

    /**
     * Número 70.
     */
    public static final int  SETENTA                 = 70;

    /**
     * Número 72.
     */
    public static final int  SETENTA_DOIS            = 72;

    /**
     * Número 78.
     */
    public static final int  SETENTA_OITO            = 78;

    /**
     * Número 88.
     */
    public static final int  OITENTA_OITO            = 88;

    /**
     * Número 100.
     */
    public static final int  CEM                     = 100;

    /**
     * Número 128.
     */
    public static final int  CENTO_VINTE_OITO        = 128;

    /**
     * Número 132.
     */
    public static final int  CENTO_TRINTA_DOIS       = 132;

    /**
     * Número 144.
     */
    public static final int  CENTOQUARENTAQUATRO     = 144;

    /**
     * Número 215.
     */
    public static final int  DUZENTOSQUINZE          = 215;

    /**
     * Número 256.
     */
    public static final int  DUZENTOS_CINQUENTA_SEIS = 256;

    /**
     * Número 261.
     */
    public static final int  DUZENTOS_SESSENTA_UM    = 261;

    /**
     * Número 1000.
     */
    public static final int  UM_MIL                  = 1000;

    /**
     * Número 1900.
     */
    public static final int  UM_MIL_NOVECENTOS       = 1900;

    /**
     * Número 2000.
     */
    public static final int  DOIS_MIL                = 2000;

    /**
     * /** Número 7000. Número da Agência de Cliente Não Correntista.
     */
    public static final int  SETE_MIL                = 7000;

    /**
     * Método Construtor da classe (Vazio)
     */
   
    private NumberUtils(){
    	
    }

	
	public static Long parseLong(String number) {
		if (number == null || "".equals(number.trim())) {
			return null;
		}

		return Long.parseLong(number);
	}

	public static Integer parseInteger(String number) {
		if (number == null || "".equals(number.trim())) {
			return null;
		}

		return Integer.parseInt(number);
	}

	/**
	 * Concatena o mes e o ano
	 * @param mes
	 * @param ano
	 * @return
	 */
	public static Integer convertMesAno(Integer mes, Integer ano) {
		mes=GissUtil.notNull(mes);
		ano=GissUtil.notNull(ano);
		return mes*10000+ano;
	}
	
	public static String formatMesAno(Integer mes, Integer ano) {
		if (mes == null || ano == null) {
			return null;
		}

		String mesFormatado = format(mes, "00");
		String anoFormatado = format(ano, "0000");

		return mesFormatado + "/" + anoFormatado;
	}
	
	public static Integer formatAnoMesPdc(Integer mes, Integer ano) {
		if (mes == null || ano == null) {
			return 0;
		}
		
		String mesFormatado = format(mes, "00");
		String anoFormatado = format(ano, "0000");

		return Integer.parseInt(anoFormatado + mesFormatado);
	}

	public static BigDecimal applySignal(String signal, BigDecimal number) {
		if (number != null && signal != null) {
			if (signal.trim().equals("-")) {
				return number.negate();
			}
		}
		return number;
	}

	public static String format(Number number, String pattern) {
		if (number == null) {
			return "";
		}
		DecimalFormat formatter = getBrazilianNumberFormat();
		formatter.applyPattern(pattern);
		return formatter.format(number);
	}

	public static String format(Number number) {
		return format(number, DEFAULT_DECIMAL_PATTERN);
	}
	
	public static BigDecimal convert(String number) {
		return convert(number, DEFAULT_DECIMAL_PATTERN);
	}

	public static BigDecimal convert(String number, String pattern) {
		if (number == null || number.trim().equals("")) {
			return null;
		}
		DecimalFormat formatter = getBrazilianNumberFormat();
		formatter.applyPattern(pattern);
		formatter.setParseBigDecimal(true);
		try {
			return (BigDecimal) formatter.parse(number);
		} catch (ParseException e) {
			throw new GissFormatException("Erro parseando número: " + number, e);
		}
	}

	public static String formatCnpj(long cnpj) {
		if (cnpj <= 0) {
			return "";
		}

		String formatoCpfCnpj = NumberUtils.format(cnpj, DEFAULT_CNPJ);
		String principal = NumberUtils.format(NumberUtils.convert(formatoCpfCnpj.substring(0, 9)), PRINCIPAL_CNPJ);
		String filial = formatoCpfCnpj.substring(9, 13);
		String digitoControle = formatoCpfCnpj.substring(13, 15);
		return principal + "/" + filial + "-" + digitoControle;
	}

	private static DecimalFormat getBrazilianNumberFormat() {
		return (DecimalFormat) NumberFormat.getNumberInstance(new Locale("pt", "BR"));
	}
}
