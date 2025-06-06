package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ListarApuracaoReprocessamentoSaidaDTO {
	private String codMensagem;
	private String mensagem;
	private int linha;
	private BigDecimal baseCalculo;
	private BigDecimal aliquotaPadrao;
	private String tipoIncidencia;
	private Integer numConsultas;
	private String conta;
	private String movimentoSinal;
	private BigDecimal movimentoValor;
	private String aliquota;
	private String issSinal;
	private BigDecimal issValor;
	private String tributavelSinal;
	private BigDecimal tributavelValor;
	private BigDecimal totalMovimento;
	private BigDecimal totalIss;
	private BigDecimal totalTributavel;
	private String razao;



	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public BigDecimal getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(BigDecimal aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getIssSinal() {
		return issSinal;
	}

	public void setIssSinal(String issSinal) {
		this.issSinal = issSinal;
	}

	public BigDecimal getIssValor() {
		return issValor;
	}

	public void setIssValor(BigDecimal issValor) {
		this.issValor = issValor;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMovimentoSinal() {
		return movimentoSinal;
	}

	public void setMovimentoSinal(String movimentoSinal) {
		this.movimentoSinal = movimentoSinal;
	}

	public BigDecimal getMovimentoValor() {
		return movimentoValor;
	}

	public void setMovimentoValor(BigDecimal movimentoValor) {
		this.movimentoValor = movimentoValor;
	}

	public Integer getNumConsultas() {
		return numConsultas;
	}

	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public String getTributavelSinal() {
		return tributavelSinal;
	}

	public void setTributavelSinal(String tributavelSinal) {
		this.tributavelSinal = tributavelSinal;
	}

	public BigDecimal getTributavelValor() {
		return tributavelValor;
	}

	public void setTributavelValor(BigDecimal tributavelValor) {
		this.tributavelValor = tributavelValor;
	}

	public BigDecimal getTotalIss() {
		return totalIss;
	}

	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}

	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public BigDecimal getTotalTributavel() {
		return totalTributavel;
	}

	public void setTotalTributavel(BigDecimal totalTributavel) {
		this.totalTributavel = totalTributavel;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public Integer getCodigoGrupo() {
		return GissUtil.pegarCodigoGrupo(razao);
	}

	public Integer getCodigoSubgrupo() {
		return GissUtil.pegarCodigoSubgrupo(razao);
	}

}
