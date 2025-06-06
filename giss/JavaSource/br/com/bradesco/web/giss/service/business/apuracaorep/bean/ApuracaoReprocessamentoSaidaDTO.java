package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

import java.util.Date;

public class ApuracaoReprocessamentoSaidaDTO {

	private Integer codigo;
	private Date dataSolicitacao;
	private String dataProcessamento;
	private Date dataInicioApuracao;
	private Date dataFimApuracao;
	private Integer linha;
	private Integer numConsultas;

	
	
	
	
	
	public ApuracaoReprocessamentoSaidaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ApuracaoReprocessamentoSaidaDTO(Integer codigo, Date dataSolicitacao, String dataProcessamento, Date dataInicioApuracao, Date dataFimApuracao, Integer linha) {
		super();
		this.codigo = codigo;
		this.dataSolicitacao = dataSolicitacao;
		this.dataProcessamento = dataProcessamento;
		this.dataInicioApuracao = dataInicioApuracao;
		this.dataFimApuracao = dataFimApuracao;
		this.linha = linha;
	}

	public Date getDataFimApuracao() {
		return dataFimApuracao;
	}
	public void setDataFimApuracao(Date dataFimApuracao) {
		this.dataFimApuracao = dataFimApuracao;
	}
	public Date getDataInicioApuracao() {
		return dataInicioApuracao;
	}
	public void setDataInicioApuracao(Date dataInicioApuracao) {
		this.dataInicioApuracao = dataInicioApuracao;
	}
	public String getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public Integer getLinha() {
		return linha;
	}
	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Integer getNumConsultas() {
		return numConsultas;
	}


	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}

	
	
}