package br.com.bradesco.web.giss.service.business.basic.bean;

public class BasicSaidaDTO {

	private String codMensagem;
	
	private String mensagem;
	
	public BasicSaidaDTO(String codMensagem, String mensagem) {
		super();
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
