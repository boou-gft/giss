package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class OcorrenciaApuracaoIssDTO {

	private String tipoRegistro;

	private Integer codigoTipoServico;

    private String descricaoTipoServico;

    private String contaContabil;

    private String nomeContaContabil;

    private String itemLeiComplementar;
    
    private Integer competencia;

    private BigDecimal percentualAliquota;

    private BigDecimal valorReceita;
    
    private BigDecimal valorTributo;
    
    private String cosif;
    private String conta;
    private String razao;

	public Integer getCodigoTipoServico() {
		return codigoTipoServico;
	}

	public void setCodigoTipoServico(Integer codigoTipoServico) {
		this.codigoTipoServico = codigoTipoServico;
	}

	public String getDescricaoTipoServico() {
		return descricaoTipoServico;
	}

	public void setDescricaoTipoServico(String descricaoTipoServico) {
		this.descricaoTipoServico = descricaoTipoServico;
	}

	public String getNomeContaContabil() {
		return nomeContaContabil;
	}

	public void setNomeContaContabil(String nomeContaContabil) {
		this.nomeContaContabil = nomeContaContabil;
	}

	public BigDecimal getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(BigDecimal percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}

	public BigDecimal getValorReceita() {
		return valorReceita;
	}

	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}

	public BigDecimal getValorTributo() {
		return valorTributo;
	}

	public void setValorTributo(BigDecimal valorTributo) {
		this.valorTributo = valorTributo;
	}

	public String getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(String contaContabil) {
		this.contaContabil = contaContabil;
	}

	public String getItemLeiComplementar() {
		return itemLeiComplementar;
	}

	public void setItemLeiComplementar(String itemLeiComplementar) {
		this.itemLeiComplementar = itemLeiComplementar;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public boolean isTotal() {
		return tipoRegistro != null && tipoRegistro.equals("T");
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
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

	/**
	 * @return the cosif
	 */
	public String getCosif() {
		return cosif;
	}

	/**
	 * @param cosif the cosif to set
	 */
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}

	/**
	 * @return the conta
	 */
	public String getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(String conta) {
		this.conta = conta;
	}
	
}
