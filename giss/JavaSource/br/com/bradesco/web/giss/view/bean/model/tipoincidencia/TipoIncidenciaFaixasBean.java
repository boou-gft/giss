package br.com.bradesco.web.giss.view.bean.model.tipoincidencia;

public class TipoIncidenciaFaixasBean {
	
	private String valorinicial;
	private String valorfinal;
	private String valoraliquota;
	private String valorRedutor;
	private int numsequencial;
		
	public TipoIncidenciaFaixasBean() {
	
	}
	
	public TipoIncidenciaFaixasBean(String valorinicial, String valorfinal, String valoraliquota, String valorRedutor, int numsequencial) {
		this.valorinicial = valorinicial;
		this.valorfinal = valorfinal;
		this.valoraliquota = valoraliquota;
		this.valorRedutor = valorRedutor;
		this.numsequencial = numsequencial;
	}
	
	public String getValoraliquota() {
		return valoraliquota;
	}
	public void setValoraliquota(String valoraliquota) {
		this.valoraliquota = valoraliquota;
	}
	public String getValorfinal() {
		return valorfinal;
	}
	public void setValorfinal(String valorfinal) {
		this.valorfinal = valorfinal;
	}
	public String getValorinicial() {
		return valorinicial;
	}
	public void setValorinicial(String valorinicial) {
		this.valorinicial = valorinicial;
	}
	public String getValorRedutor() {
		return valorRedutor;
	}
	public void setValorRedutor(String valorRedutor) {
		this.valorRedutor = valorRedutor;
	}
	public int getNumsequencial() {
		return numsequencial;
	}
	public void setNumsequencial(int numsequencial) {
		this.numsequencial = numsequencial;
	}	
	
}
