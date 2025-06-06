package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

public class ConsultarApuracaoAposFechamentoDTO {

	private String codigoSolicitacao;
	private String dataProcessamento;
	private String dataSolicitacao;
	private int linha;

	public String getCodigoSolicitacao() {
		return codigoSolicitacao;
	}
	public void setCodigoSolicitacao(String codigoSolicitacao) {
		this.codigoSolicitacao = codigoSolicitacao;
	}
	public String getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}

}
