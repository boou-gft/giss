package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ListarBalancetesOcorrenciasSaidaDTO {
	
	private Long codSolicitacaoBalancete;
    private Long seqApuracaoBalancete;
    private Long codCosif;
    private Integer codGrupoContabil;
    private Integer codSubgrupoContabil;
    private Long codConta;
    private String digConta;
    private String sinalSaldoAnterior;
    private BigDecimal vlrSaldoAnterior;
    private String vlrSaldoAnteriorFormatado;
    private BigDecimal vlrSaldoDebito;
    private String vlrSaldoDebitoFormatado;
    private BigDecimal vlrSaldoCredito;
    private String vlrSaldoCreditoFormatado;
    private String sinalSaldoAtual;
    private BigDecimal vlrSaldoAtual;
    private String vlrSaldoAtualFormatado;
    private Integer nivelLancamento;
    private String descLancamento;
    private String flagCosif;
    private String periodo;
    private String saldo;
    private String empresa;
    private String agencia;
    private String cnpj;
    private String uf;
    private String municipio;

	public ListarBalancetesOcorrenciasSaidaDTO() {
	
	}

	public ListarBalancetesOcorrenciasSaidaDTO(Long codSolicitacaoBalancete, Long seqApuracaoBalancete, Long codCosif, Integer codGrupoContabil, Integer codSubgrupoContabil, Long codConta, String digConta, String sinalSaldoAnterior, BigDecimal vlrSaldoAnterior, String vlrSaldoAnteriorFormatado, BigDecimal vlrSaldoDebito, String vlrSaldoDebitoFormatado, BigDecimal vlrSaldoCredito, String vlrSaldoCreditoFormatado, String sinalSaldoAtual, BigDecimal vlrSaldoAtual,  String vlrSaldoAtualFormatado, Integer nivelLancamento, String descLancamento, String flagCosif, String periodo, String saldo, String empresa, String agencia, String cnpj, String uf, String municipio) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
		this.seqApuracaoBalancete = seqApuracaoBalancete;
		this.codCosif = codCosif;
		this.codGrupoContabil = codGrupoContabil;
		this.codSubgrupoContabil = codSubgrupoContabil;
		this.codConta = codConta;
		this.digConta = digConta;
		this.sinalSaldoAnterior = sinalSaldoAnterior;
		this.vlrSaldoAnterior = vlrSaldoAnterior;
		this.vlrSaldoAnteriorFormatado = vlrSaldoAnteriorFormatado;
		this.vlrSaldoDebito = vlrSaldoDebito;
		this.vlrSaldoDebitoFormatado = vlrSaldoDebitoFormatado;
		this.vlrSaldoCredito = vlrSaldoCredito;
		this.vlrSaldoCreditoFormatado = vlrSaldoCreditoFormatado;
		this.sinalSaldoAtual = sinalSaldoAtual;
		this.vlrSaldoAtual = vlrSaldoAtual;
		this.vlrSaldoAtualFormatado = vlrSaldoAtualFormatado;
		this.nivelLancamento = nivelLancamento;
		this.descLancamento = descLancamento;
		this.flagCosif = flagCosif;
		this.periodo = periodo;
		this.saldo = saldo;
		this.empresa = empresa;
		this.agencia = agencia;
		this.cnpj = cnpj;
		this.uf = uf;
		this.municipio = municipio;
	}

	public Long getCodSolicitacaoBalancete() {
		return codSolicitacaoBalancete;
	}

	public void setCodSolicitacaoBalancete(Long codSolicitacaoBalancete) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
	}

	public Long getSeqApuracaoBalancete() {
		return seqApuracaoBalancete;
	}

	public void setSeqApuracaoBalancete(Long seqApuracaoBalancete) {
		this.seqApuracaoBalancete = seqApuracaoBalancete;
	}

	public Long getCodCosif() {
		return codCosif;
	}

	public void setCodCosif(Long codCosif) {
		this.codCosif = codCosif;
	}

	public Integer getCodGrupoContabil() {
		return codGrupoContabil;
	}

	public void setCodGrupoContabil(Integer codGrupoContabil) {
		this.codGrupoContabil = codGrupoContabil;
	}

	public Integer getCodSubgrupoContabil() {
		return codSubgrupoContabil;
	}

	public void setCodSubgrupoContabil(Integer codSubgrupoContabil) {
		this.codSubgrupoContabil = codSubgrupoContabil;
	}

	public Long getCodConta() {
		return codConta;
	}

	public void setCodConta(Long codConta) {
		this.codConta = codConta;
	}

	public String getSinalSaldoAnterior() {
		return sinalSaldoAnterior;
	}

	public void setSinalSaldoAnterior(String sinalSaldoAnterior) {
		this.sinalSaldoAnterior = sinalSaldoAnterior;
	}

	public BigDecimal getVlrSaldoAnterior() {
		return vlrSaldoAnterior;
	}

	public void setVlrSaldoAnterior(BigDecimal vlrSaldoAnterior) {
		this.vlrSaldoAnterior = vlrSaldoAnterior;
	}

	public BigDecimal getVlrSaldoDebito() {
		return vlrSaldoDebito;
	}

	public void setVlrSaldoDebito(BigDecimal vlrSaldoDebito) {
		this.vlrSaldoDebito = vlrSaldoDebito;
	}

	public BigDecimal getVlrSaldoCredito() {
		return vlrSaldoCredito;
	}

	public void setVlrSaldoCredito(BigDecimal vlrSaldoCredito) {
		this.vlrSaldoCredito = vlrSaldoCredito;
	}

	public String getSinalSaldoAtual() {
		return sinalSaldoAtual;
	}

	public void setSinalSaldoAtual(String sinalSaldoAtual) {
		this.sinalSaldoAtual = sinalSaldoAtual;
	}

	public BigDecimal getVlrSaldoAtual() {
		return vlrSaldoAtual;
	}

	public void setVlrSaldoAtual(BigDecimal vlrSaldoAtual) {
		this.vlrSaldoAtual = vlrSaldoAtual;
	}

	public String getDescLancamento() {
		return descLancamento;
	}

	public void setDescLancamento(String descLancamento) {
		this.descLancamento = descLancamento;
	}

	public String getVlrSaldoAnteriorFormatado() {
		return GissUtil.formatarValoresBig(vlrSaldoAnterior);
	}

	public void setVlrSaldoAnteriorFormatado(String vlrSaldoAnteriorFormatado) {
		this.vlrSaldoAnteriorFormatado = vlrSaldoAnteriorFormatado;
	}

	public String getVlrSaldoDebitoFormatado() {
		return GissUtil.formatarValoresBig(vlrSaldoDebito);
	}

	public void setVlrSaldoDebitoFormatado(String vlrSaldoDebitoFormatado) {
		this.vlrSaldoDebitoFormatado = vlrSaldoDebitoFormatado;
	}

	public String getVlrSaldoCreditoFormatado() {
		return GissUtil.formatarValoresBig(vlrSaldoCredito);
	}

	public void setVlrSaldoCreditoFormatado(String vlrSaldoCreditoFormatado) {
		this.vlrSaldoCreditoFormatado = vlrSaldoCreditoFormatado;
	}

	public String getVlrSaldoAtualFormatado() {
		return GissUtil.formatarValoresBig(vlrSaldoAtual);
	}

	public void setVlrSaldoAtualFormatado(String vlrSaldoAtualFormatado) {
		this.vlrSaldoAtualFormatado = vlrSaldoAtualFormatado;
	}

	public String getFlagCosif() {
		return flagCosif;
	}

	public void setFlagCosif(String flagCosif) {
		this.flagCosif = flagCosif;
	}

	public Integer getNivelLancamento() {
		return nivelLancamento;
	}

	public void setNivelLancamento(Integer nivelLancamento) {
		this.nivelLancamento = nivelLancamento;
	}

	public String getDigConta() {
		return digConta;
	}

	public void setDigConta(String digConta) {
		this.digConta = digConta;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}