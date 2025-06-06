package br.com.bradesco.web.giss.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import br.com.bradesco.web.giss.exception.GissException;

/**
 * Classe utilitária para datas.
 *
 */
public class DateUtils {

	private static final Locale PT_BR = new Locale("pt", "BR");

	private static final String DATE_DEFAULT_FORMAT = "dd/MM/yyyy";
	
	private static final String DATE_DEFAULT_FORMAT_PDC = "dd.MM.yyyy";
	
	private static final String TIMESTAMP_DEFAULT_FORMAT_PDC = "yyyy-MM-dd-HH.mm.ss";
	
	/**
     * Obtém o primeiro dia do mês da data passada.
     * 
     * @param date
     * @return date.
     */
    public static Date getMinDateInMonth(Date date) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance(PT_BR);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
    
    /**
     * Formata data no formato padrão.
     * 
     * @param date
     * @return String que representa data no formato default.
     */
    public static String format(Date date) {
        if (date == null) {
            return "";
        }
        return getBrazilianSimpleDateFormat(DATE_DEFAULT_FORMAT).format(date);
    }
    
    /**
     * Formata data no formato padrão.
     * 
     * @param date
     * @return String que representa data no formato default.
     */
    public static String formatPdc(Date date) {
        if (date == null) {
            return "";
        }
        return getBrazilianSimpleDateFormat(DATE_DEFAULT_FORMAT_PDC).format(date);
    }
    
    /**
     * Formata data no formato passado.
     * 
     * @param date
     * @param pattern
     * @return String que representa data.
     */
    public static String format(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        return getBrazilianSimpleDateFormat(pattern).format(date);
    }

    /**
     * Converte data no formato do pdc para o formato Date.
     * @param data
     * @param mask
     * @return
     */
    public static Date convertDatePdc(String data) {
        return convertDate(data, DATE_DEFAULT_FORMAT_PDC);
	}
    
    /**
     * Converte data no formato do pdc para o formato Date.
     * @param data
     * @param mask
     * @return
     */
    public static Date convertTimestampPdc(String data) {
        return convertDate(data, TIMESTAMP_DEFAULT_FORMAT_PDC);
	}
    
    /**
     * Converte data para o formato Date.
     * @param data
     * @param mask
     * @return
     */
    public static Date convertDate(String data, String mask) {
		if (data == null || data.equals(""))   
            return null;

		Date date = null;   
        try {   
            DateFormat formatter = new SimpleDateFormat(mask, PT_BR);   
            date = formatter.parse(data);   
        } catch (ParseException e) {               
            throw new GissException(e.getMessage(), e, "");   
        }
        return date;
	}
    
    /**
     * Converte data para o formato default.
     * @param data
     * @return
     */
    public static Date convertDate(String data) {
		return convertDate(data, DATE_DEFAULT_FORMAT);
	}

    /**
     * Verifica se a data é hoje.
     * @param date
     * @return
     */
    public static boolean isCurrentDate(Date date) {
    	return isSameDay(new Date(), date);
    }

    /**
     * Verifica se é a mesma data.
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDay(Date date1, Date date2) {
    	if (date1 == null || date2 == null) {
    		return false;
    	}

    	return org.apache.commons.lang.time.DateUtils.isSameDay(date1, date2);
    }

    /**
     * Formata o período mês/ano no formato 01.MM.yyyy
     * @param mes
     * @param ano
     * @return
     */
    public static String formatMesAnoData(Integer mes, Integer ano) {
    	if (mes == null || ano == null) {
    		return "";
    	}

    	StringBuilder mesAnoData = new StringBuilder();
    	mesAnoData.append("01");
    	mesAnoData.append(".");
    	mesAnoData.append(NumberUtils.format(mes, "00"));
    	mesAnoData.append(".");
    	mesAnoData.append(NumberUtils.format(ano, "0000"));
    	return mesAnoData.toString();
    }
    
    /**
     * Formata o período mês/ano no formato MM/yyyy
     * @param mes
     * @param ano
     * @return
     */
    public static String formatMesAno(Integer mes, Integer ano) {
    	if (mes == null || ano == null) {
    		return "";
    	}

    	StringBuilder mesAno = new StringBuilder();
    	mesAno.append(NumberUtils.format(mes, "00"));
    	mesAno.append("/");
    	mesAno.append(NumberUtils.format(ano, "0000"));
    	return mesAno.toString();
    }

    /**
     * Converte a data a partir do mês e ano.
     * @param mes
     * @param ano
     * @return
     */
    public static Date convertMesAno(Integer mes, Integer ano) {
    	if (mes == null || ano == null) {
    		return null;
    	}

    	StringBuilder mesAno = new StringBuilder();
    	mesAno.append("01");
    	mesAno.append("/");
    	mesAno.append(NumberUtils.format(mes, "00"));
    	mesAno.append("/");
    	mesAno.append(NumberUtils.format(ano, "0000"));
    	return DateUtils.convertDate(mesAno.toString());
    }

    /**
     * Compara as duas competências.
     * @param dataCompetencia
     * @param dataComparacao
     * @return 0, se forem iguais. 1, se for maior. -1, se for menor.
     */
    public static int compareToCompetencia(Date dataCompetencia, Date dataComparacao) {
    	Date date1 = getMinDateInMonth(dataCompetencia);
    	Date date2 = getMinDateInMonth(dataComparacao);

    	if (isSameDay(date1, date2)) {
    		return 0;
    	}

    	return date1.compareTo(date2);
    }
    
    /**
     * Formator de data.
     * @param pattern
     * @return
     */
    private static SimpleDateFormat getBrazilianSimpleDateFormat(String pattern) {
    	return new SimpleDateFormat(pattern, PT_BR);
    }
}
