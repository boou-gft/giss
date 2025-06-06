package br.com.bradesco.web.giss.service.business.apuracaoparcial.bean;

public class ApuracaoParcialDTO {

	private String mensagem;
	private String codigoMensagem;
	private String competencia;
	
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
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	
}
