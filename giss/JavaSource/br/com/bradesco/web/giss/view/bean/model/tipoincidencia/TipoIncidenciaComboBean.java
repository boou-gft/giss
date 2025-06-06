package br.com.bradesco.web.giss.view.bean.model.tipoincidencia;

public class TipoIncidenciaComboBean {
	
	private String codigoTipoIncidencia;
	private String descricaoTipoIncidencia;
	
	public TipoIncidenciaComboBean() {
	
	}

	public TipoIncidenciaComboBean(String codigoTipoIncidencia, String descricaoTipoIncidencia) {
		super();
		this.codigoTipoIncidencia = codigoTipoIncidencia;
		this.descricaoTipoIncidencia = descricaoTipoIncidencia;
	}

	public String getCodigoTipoIncidencia() {
		return codigoTipoIncidencia;
	}

	public void setCodigoTipoIncidencia(String codigoTipoIncidencia) {
		this.codigoTipoIncidencia = codigoTipoIncidencia;
	}

	public String getDescricaoTipoIncidencia() {
		return descricaoTipoIncidencia;
	}

	public void setDescricaoTipoIncidencia(String descricaoTipoIncidencia) {
		this.descricaoTipoIncidencia = descricaoTipoIncidencia;
	}
	
	
		
}
