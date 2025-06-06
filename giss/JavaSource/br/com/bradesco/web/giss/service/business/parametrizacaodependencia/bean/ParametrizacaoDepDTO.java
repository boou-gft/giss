package br.com.bradesco.web.giss.service.business.parametrizacaodependencia.bean;

public class ParametrizacaoDepDTO {
	
	private String chaveSeguranca;
	private String url;
	private String codMensagem;
	private String mensagem;
	public String getChaveSeguranca() {
		return chaveSeguranca;
	}
	public void setChaveSeguranca(String chaveSeguranca) {
		this.chaveSeguranca = chaveSeguranca;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
