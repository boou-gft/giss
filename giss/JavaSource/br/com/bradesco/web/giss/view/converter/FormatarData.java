package br.com.bradesco.web.giss.view.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import br.com.bradesco.web.giss.exception.GissException;

public class FormatarData {

	private static final Locale LOCALE_BR = new Locale("pt","BR");

	private static final String DATE_FORMAT_PDC = "dd.MM.yyyy";

	private static final String DATE_FORMAT = "dd/MM/yyyy";

	private static final String TIMESTAMP_FORMAT_PDC = "yyyy-MM-dd-HH.mm.ss";

	private static final String TIMESTAMP_FORMAT = "dd/MM/yyyy - HH:mm";
	
	public String formataAnoMesDia(Date dataInteira){
       	return formataData(dataInteira, "yyyy/MM/dd");
    }

	public String formataDiaMesAno(Date dataInteira){
        return formataData(dataInteira, DATE_FORMAT);
    }

	public static String formataDiaMesAnoToPdc(Date dataInteira){
        return formataData(dataInteira, DATE_FORMAT_PDC);
    }

	public static Date formataDiaMesAnoFromPdc(String data) {   
        return formataData(data, DATE_FORMAT_PDC);   
    }

	public static Date formataStringData(String data) {   
        return formataData(data, DATE_FORMAT);
    }

	public static Date formataTimestampFromPdc(String data) {   
        return formataData(data, TIMESTAMP_FORMAT_PDC);
    }

	public static String formataTimestampFromPdc(Date data) {   
        return formataData(data, TIMESTAMP_FORMAT);
    }

	public static Date formataTimestampToPdc(String data) {   
        return formataData(data, TIMESTAMP_FORMAT);
    }

	public static String formataTimestampToPdc(Date data) {   
        return formataData(data, TIMESTAMP_FORMAT_PDC);
    }

	public static Date formataData(String data, String mask) {
		if (data == null || data.equals(""))   
            return null;

		Date date = null;   
        try {   
            DateFormat formatter = new SimpleDateFormat(mask, LOCALE_BR);   
            date = (java.util.Date)formatter.parse(data);   
        } catch (ParseException e) {               
            throw new GissException(e.getMessage(), e, "");   
        }
        return date;
	}

	public static String formataData(Date data, String mask){
       	if(data != null){
        	SimpleDateFormat formatoSaida = new SimpleDateFormat(mask, LOCALE_BR);
	        return formatoSaida.format(data);
       	}
        return "";
    }
}
