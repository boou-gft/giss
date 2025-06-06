package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;


public class GerarBalanceteFiscalizacoesIssSaidaDTO {
	
	private String codMensagem;
	private String mensagem;

	public GerarBalanceteFiscalizacoesIssSaidaDTO() {

	}

	public GerarBalanceteFiscalizacoesIssSaidaDTO(String codMensagem, String mensagem) {
		this.codMensagem = codMensagem;
		this.mensagem = mensagem;
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