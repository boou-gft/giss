package br.com.bradesco.web.giss.view.converters;

import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.bradesco.web.giss.view.converter.FormatarData;



public class TimestampPdcConverter implements Converter {
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 == null) {
			return null;
		}
		return FormatarData.formataTimestampToPdc((String) arg2);
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 == null) {
			return "";
		}
		return FormatarData.formataTimestampFromPdc((Date) arg2);
	}

}
