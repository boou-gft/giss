package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

public class ApuracaoMensalDTO {
	private String processamentosEnvolvidos;
	private String contabilizacaoEnvolvidos;
	private String mensagem;
	private String exibeContabil;
	private String competencia;
	private String codigoMensagem;
	
	
	public String getContabilizacaoEnvolvidos() {
		return contabilizacaoEnvolvidos;
	}
	public void setContabilizacaoEnvolvidos(String contabilizacaoEnvolvidos) {
		this.contabilizacaoEnvolvidos = contabilizacaoEnvolvidos;
	}
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
	public String getCompetencia(){
		return competencia;
	}
	public void setCompetencia(String competencia){
		this.competencia = competencia;
	}
	public String getExibeContabil() {
		return exibeContabil;
	}
	public void setExibeContabil(String exibeContabil) {
		this.exibeContabil = exibeContabil;
	}
	public boolean isSolicitacaoContabil() {
		return "S".equals(exibeContabil);
	}
}
