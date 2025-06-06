package br.com.bradesco.web.giss.view.bean.model.contacontabil;

public class ContasContabeisListaBean {
	
	private boolean checkbox;
	private String codigoconta;
	private String codigotiposervico;
	private long codigousuario;
	private String itemleicoplementar;
		
	public ContasContabeisListaBean() {
	
	}
	
	public ContasContabeisListaBean(boolean checkbox, String codigoconta, String codigotiposervico, long codigousuario, String itemleicoplementar) {
		this.checkbox = checkbox;
		this.codigoconta = codigoconta;
		this.codigotiposervico = codigotiposervico;
		this.codigousuario = codigousuario;
		this.itemleicoplementar = itemleicoplementar;
	}
	
	public boolean isCheckbox() {
		return checkbox;
	}

	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}

	public String getCodigoconta() {
		return codigoconta;
	}

	public void setCodigoconta(String codigoconta) {
		this.codigoconta = codigoconta;
	}

	public String getCodigotiposervico() {
		return codigotiposervico;
	}

	public void setCodigotiposervico(String codigotiposervico) {
		this.codigotiposervico = codigotiposervico;
	}

	public long getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(long codigousuario) {
		this.codigousuario = codigousuario;
	}

	public String getItemleicoplementar() {
		return itemleicoplementar;
	}

	public void setItemleicoplementar(String itemleicoplementar) {
		this.itemleicoplementar = itemleicoplementar;
	}

	
		
}
