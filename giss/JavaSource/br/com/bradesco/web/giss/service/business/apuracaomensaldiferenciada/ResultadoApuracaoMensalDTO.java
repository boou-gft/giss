package br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada;

import java.math.BigDecimal;
import java.util.List;

public class ResultadoApuracaoMensalDTO {
	private String codMensagem;
	private BigDecimal baseCalculo;
	private BigDecimal aliquotaPadrao;
	private String tipoIncidencia;
	private int solicitacao;
	private String dataSolicitacao;
	private String dataProcessamento;
	private BigDecimal vlrMovimento;
	private BigDecimal vlrTributavel;
	private List<ListaValoresDTO> listaPesquisaApuracao;
	
	
	
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}
	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}
	public BigDecimal getAliquotaPadrao() {
		return aliquotaPadrao;
	}
	public void setAliquotaPadrao(BigDecimal aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}
	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public int getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(int solicitacao) {
		this.solicitacao = solicitacao;
	}
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public String getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public List<ListaValoresDTO> getListaPesquisaApuracao() {
		return listaPesquisaApuracao;
	}
	public void setListaPesquisaApuracao(List<ListaValoresDTO> listaPesquisaApuracao) {
		this.listaPesquisaApuracao = listaPesquisaApuracao;
	}
	public BigDecimal getVlrMovimento() {
		return vlrMovimento;
	}
	public void setVlrMovimento(BigDecimal vlrMovimento) {
		this.vlrMovimento = vlrMovimento;
	}
	public BigDecimal getVlrTributavel() {
		return vlrTributavel;
	}
	public void setVlrTributavel(BigDecimal vlrTributavel) {
		this.vlrTributavel = vlrTributavel;
	}
	
}
