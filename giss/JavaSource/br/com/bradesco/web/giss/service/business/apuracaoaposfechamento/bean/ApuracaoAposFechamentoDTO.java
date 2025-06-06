package br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.bean;

public class ApuracaoAposFechamentoDTO {
	
	private String mensagem;
	private String codigoMensagem;

	private String processamentosEnvolvidos;

	public String getProcessamentosEnvolvidos() {
		return processamentosEnvolvidos;
	}

	public void setProcessamentosEnvolvidos(String processamentosEnvolvidos) {
		this.processamentosEnvolvidos = processamentosEnvolvidos;
	}

	public String getCodigoMensagem() {
		return codigoMensagem;
	}

	public void setCodigoMensagem(String codigoMensagem) {
		this.codigoMensagem = codigoMensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
