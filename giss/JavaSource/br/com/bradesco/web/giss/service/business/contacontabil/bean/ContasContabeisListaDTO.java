package br.com.bradesco.web.giss.service.business.contacontabil.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ContasContabeisListaDTO {
	
	private boolean checkbox;
	private String codigoconta;
	private Integer codigoTipoServico;
	private long codigousuario;
	private String itemleicoplementar;
	private String razao;
		
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
	public String getRazao() {
		return razao;
	} 
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public int getCodigoGrupo(){
		return GissUtil.pegarCodigoGrupo(razao);
	}
	public int getCodigoSubgrupo(){
		return GissUtil.pegarCodigoSubgrupo(razao);
	}
	/**
	 * @return the codigoTipoServico
	 */
	public Integer getCodigoTipoServico() {
		return codigoTipoServico;
	}
	/**
	 * @param codigoTipoServico the codigoTipoServico to set
	 */
	public void setCodigoTipoServico(Integer codigoTipoServico) {
		this.codigoTipoServico = codigoTipoServico;
	}
		
}
