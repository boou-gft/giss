package br.com.bradesco.web.giss.utils;

import javax.faces.model.SelectItem;

public interface CriadorSelectItem<T> {
	public SelectItem converte(T o);
}
