package br.com.bradesco.web.giss.view.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import br.com.bradesco.web.giss.utils.exceptions.GissFormatException;

public class DateBrazillianConverter implements Converter{

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2)
	throws ConverterException {
		if(arg2 == null || arg2.trim().equals("") || arg2.trim().equals("//")){
			return null;
		}

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy",new Locale("pt","BR"));
		Calendar dataFormatada = Calendar.getInstance();
		try {
			dataFormatada.setTime(data.parse(arg2));
			dataFormatada.set(Calendar.HOUR_OF_DAY, 0);
			dataFormatada.set(Calendar.MINUTE, 0);
			dataFormatada.set(Calendar.SECOND, 0);
			dataFormatada.set(Calendar.MILLISECOND, 0);

		} catch (ParseException e) {
			throw new GissFormatException(e.getMessage(), e);
		}

		return dataFormatada.getTime();
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2)
	throws ConverterException {

		if(arg2 == null){
			return null;
		}

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy",new Locale("pt","BR"));

		return data.format(arg2);
	}

}
