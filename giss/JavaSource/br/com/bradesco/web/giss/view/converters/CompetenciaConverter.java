package br.com.bradesco.web.giss.view.converters;

import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import br.com.bradesco.web.giss.utils.DateUtils;

public class CompetenciaConverter implements Converter{

	public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
		if (value == null || value.trim().equals("")) {
			return null;
		}

		return DateUtils.convertDate(value);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
		if (value == null || !(value instanceof Date)) {
			return "";
		}

		return DateUtils.format((Date) value, "MM/yyyy");
	}
	
}
