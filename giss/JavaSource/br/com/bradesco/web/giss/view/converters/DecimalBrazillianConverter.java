package br.com.bradesco.web.giss.view.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import br.com.bradesco.web.giss.utils.NumberUtils;

public class DecimalBrazillianConverter implements Converter {

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) throws ConverterException {
		if (arg2 == null || arg2.trim().equals("")) {
			return null;
		}

		return NumberUtils.convert(arg2);
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) throws ConverterException {
		if (arg2 == null) {
			return null;
		}

		return NumberUtils.format((Number) arg2);
	}

}
