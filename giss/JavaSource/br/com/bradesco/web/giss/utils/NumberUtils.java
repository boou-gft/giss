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
     * N�mero 0.
     */
    public static final int  ZERO                    = 0;
    
    /**
     * N�mero 0, tipo long.
     */
    public static final long ZERO_L                  = 0L;

    /**
     * N�mero 1.
     */
    public static final int  UM                      = 1;

    /**
     * N�mero -2.
     */
    public static final int  MENOS_DOIS              = -2;

    /**
     * N�mero 2.
     */
    public static final int  DOIS                    = 2;

    /**
     * N�mero 3.
     */
    public static final int  TRES                    = 3;

    /**
     * N�mero 4.
     */
    public static final int  QUATRO                  = 4;

    /**
     * N�mero 5.
     */
    public static final int  CINCO                   = 5;

    /**
     * N�mero 6.
     */
    public static final int  SEIS                    = 6;

    /**
     * N�mero 7.
     */
    public static final int  SETE                    = 7;

    /**
     * N�mero 8.
     */
    public static final int  OITO                    = 8;

    /**
     * N�mero 9.
     */
    public static final int  NOVE                    = 9;

    /**
     * N�mero 10.
     */
    public static final int  DEZ                     = 10;

    /**
     * N�mero 10 Long.
     */
    public static final long DEZ_L                   = 10L;

    /**
     * N�mero 11.
     */
    public static final int  ONZE                    = 11;

    /**
     * N�mero 12.
     */
    public static final int  DOZE                    = 12;

    /**
     * N�mero -12.
     */
    public static final int  MENOS_DOZE              = -12;

    /**
     * N�mero 13.
     */
    public static final int  TREZE                   = 13;

    /**
     * N�mero 14.
     */
    public static final int  CATORZE                 = 14;

    /**
     * N�mero 15.
     */
    public static final int  QUINZE                  = 15;

    /**
     * N�mero 16.
     */
    public static final int  DEZESSEIS               = 16;

    /**
     * N�mero 17.
     */
    public static final int  DEZESSETE               = 17;

    /**
     * N�mero 18.
     */
    public static final int  DEZOITO                 = 18;

    /**
     * N�mero 19.
     */
    public static final int  DEZENOVE                = 19;

    /**
     * N�mero 20.
     */
    public static final int  VINTE                   = 20;

    /**
     * N�mero 30.
     */
    public static final int  TRINTA                  = 30;

    /**
     * N�mero 31.
     */
    public static final int  TRINTA_UM               = 31;

    /**
     * N�mero 35.
     */
    public static final int  TRINTA_CINCO            = 35;

    /**
     * N�mero 37.
     */
    public static final int  TRINTA_SETE             = 37;

    /**
     * N�mero 40.
     */
    public static final int  QUARENTA                = 40;

    /**
     * N�mero 41.
     */
    public static final int  QUARENTA_UM             = 41;

    /**
     * N�mero 43.
     */
    public static final int  QUARENTA_TRES           = 43;

    /**
     * N�mero 45.
     */
    public static final int  QUARENTA_CINCO          = 45;

    /**
     * N�mero 48.
     */
    public static final int  QUARENTA_OITO           = 48;

    /**
     * N�mero 48 Long.
     */
    public static final long QUARENTA_OITO_L         = 48L;

    /**
     * N�mero 50.
     */
    public static final int  CINQUENTA               = 50;

    /**
     * N�mero 55.
     */
    public static final int  CINQUENTA_CINCO         = 55;

    /**
     * N�mero 59.
     */
    public static final int  CINQUENTA_NOVE          = 59;

    /**
     * N�mero 60.
     */
    public static final int  SESSENTA                = 60;

    /**
     * N�mero 64. N�mero para o texto no comprovante de antentica��o
     */
    public static final int  SESSENTA_QUATRO         = 64;

    /**
     * N�mero 68.
     */
    public static final int  SESSENTA_OITO           = 68;

    /**
     * N�mero 70.
     */
    public static final int  SETENTA                 = 70;

    /**
     * N�mero 72.
     */
    public static final int  SETENTA_DOIS            = 72;

    /**
     * N�mero 78.
     */
    public static final int  SETENTA_OITO            = 78;

    /**
     * N�mero 88.
     */
    public static final int  OITENTA_OITO            = 88;

    /**
     * N�mero 100.
     */
    public static final int  CEM                     = 100;

    /**
     * N�mero 128.
     */
    public static final int  CENTO_VINTE_OITO        = 128;

    /**
     * N�mero 132.
     */
    public static final int  CENTO_TRINTA_DOIS       = 132;

    /**
     * N�mero 144.
     */
    public static final int  CENTOQUARENTAQUATRO     = 144;

    /**
     * N�mero 215.
     */
    public static final int  DUZENTOSQUINZE          = 215;

    /**
     * N�mero 256.
     */
    public static final int  DUZENTOS_CINQUENTA_SEIS = 256;

    /**
     * N�mero 261.
     */
    public static final int  DUZENTOS_SESSENTA_UM    = 261;

    /**
     * N�mero 1000.
     */
    public static final int  UM_MIL                  = 1000;

    /**
     * N�mero 1900.
     */
    public static final int  UM_MIL_NOVECENTOS       = 1900;

    /**
     * N�mero 2000.
     */
    public static final int  DOIS_MIL                = 2000;

    /**
     * /** N�mero 7000. N�mero da Ag�ncia de Cliente N�o Correntista.
     */
    public static final int  SETE_MIL                = 7000;

    /**
     * M�todo Construtor da classe (Vazio)
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
			throw new GissFormatException("Erro parseando n�mero: " + number, e);
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
