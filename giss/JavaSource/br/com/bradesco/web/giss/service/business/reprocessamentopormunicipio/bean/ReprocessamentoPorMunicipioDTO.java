package br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean;


public class ReprocessamentoPorMunicipioDTO implements Comparable<ReprocessamentoPorMunicipioDTO> {
	private String codigo;
	private String municipio;
	private int itemRadio;
	private boolean radio;
	private boolean selected;

	
	
	
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public int getItemRadio() {
		return itemRadio;
	}
	public void setItemRadio(int itemRadio) {
		this.itemRadio = itemRadio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof ReprocessamentoPorMunicipioDTO)) {
			return false;
		}

		ReprocessamentoPorMunicipioDTO other = (ReprocessamentoPorMunicipioDTO) obj;
		return this.getCodigo().equals(other.getCodigo());
	}

	@Override
	public int hashCode() {
		return getCodigo().hashCode();
	}

	public int compareTo(ReprocessamentoPorMunicipioDTO o) {
		return this.getCodigo().compareTo(o.getCodigo());
	}
}
