package br.com.bradesco.web.giss.service.business.codlancamento.bean;

public class DetalheHistoricoDTO {
    private String codMensagem;
    private String mensagem;
    private String dsComplementar;
    private String dsComplementarAnterior;
    private String dsLancamentoAplicadoContabil;
    private String dsLancamentoAplicadoContabilAnterior;
   
    private Integer cdLancamento;
    private Integer cdLancamentoAnterior;
    private Integer grupoContabilAtual;
    private Integer grupoContabilAtualAnterior;
    private Integer grupoContabil;
    private Integer grupoContabilAnterior;
    private Integer digitoContaContabil;
    private Integer digitoContaContabilAnterior;
    private Integer cdItem;
    private Integer cdItemAnterior;

    private Long contaContabilTributo;
    private Long contaContabilTributoAnterior;
    private Long contaContabil;
    private Long contaContabilAnterior;
    
    public String getRazao() {
		return getGrupoContabilAtual() + " - " + getGrupoContabil();
	}
    
    public String getRazaoAnterior() {
    	return getGrupoContabilAtualAnterior() + " - " + getGrupoContabilAnterior();
    }
    
    
	/**
	 * @return the codMensagem
	 */
	public String getCodMensagem() {
		return codMensagem;
	}
	/**
	 * @param codMensagem the codMensagem to set
	 */
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	/**
	 * @return the dsComplementar
	 */
	public String getDsComplementar() {
		return dsComplementar;
	}
	/**
	 * @param dsComplementar the dsComplementar to set
	 */
	public void setDsComplementar(String dsComplementar) {
		this.dsComplementar = dsComplementar;
	}
	/**
	 * @return the dsComplementarAnterior
	 */
	public String getDsComplementarAnterior() {
		return dsComplementarAnterior;
	}
	/**
	 * @param dsComplementarAnterior the dsComplementarAnterior to set
	 */
	public void setDsComplementarAnterior(String dsComplementarAnterior) {
		this.dsComplementarAnterior = dsComplementarAnterior;
	}

	/**
	 * @return the cdLancamento
	 */
	public Integer getCdLancamento() {
		return cdLancamento;
	}
	/**
	 * @param cdLancamento the cdLancamento to set
	 */
	public void setCdLancamento(Integer cdLancamento) {
		this.cdLancamento = cdLancamento;
	}
	/**
	 * @return the cdLancamentoAnterior
	 */
	public Integer getCdLancamentoAnterior() {
		return cdLancamentoAnterior;
	}
	/**
	 * @param cdLancamentoAnterior the cdLancamentoAnterior to set
	 */
	public void setCdLancamentoAnterior(Integer cdLancamentoAnterior) {
		this.cdLancamentoAnterior = cdLancamentoAnterior;
	}
	/**
	 * @return the grupoContabilAtual
	 */
	public Integer getGrupoContabilAtual() {
		return grupoContabilAtual;
	}
	/**
	 * @param grupoContabilAtual the grupoContabilAtual to set
	 */
	public void setGrupoContabilAtual(Integer grupoContabilAtual) {
		this.grupoContabilAtual = grupoContabilAtual;
	}
	/**
	 * @return the grupoContabilAtualAnterior
	 */
	public Integer getGrupoContabilAtualAnterior() {
		return grupoContabilAtualAnterior;
	}
	/**
	 * @param grupoContabilAtualAnterior the grupoContabilAtualAnterior to set
	 */
	public void setGrupoContabilAtualAnterior(Integer grupoContabilAtualAnterior) {
		this.grupoContabilAtualAnterior = grupoContabilAtualAnterior;
	}
	/**
	 * @return the grupoContabil
	 */
	public Integer getGrupoContabil() {
		return grupoContabil;
	}
	/**
	 * @param grupoContabil the grupoContabil to set
	 */
	public void setGrupoContabil(Integer grupoContabil) {
		this.grupoContabil = grupoContabil;
	}
	/**
	 * @return the grupoContabilAnterior
	 */
	public Integer getGrupoContabilAnterior() {
		return grupoContabilAnterior;
	}
	/**
	 * @param grupoContabilAnterior the grupoContabilAnterior to set
	 */
	public void setGrupoContabilAnterior(Integer grupoContabilAnterior) {
		this.grupoContabilAnterior = grupoContabilAnterior;
	}
	/**
	 * @return the digitoContaContabil
	 */
	public Integer getDigitoContaContabil() {
		return digitoContaContabil;
	}
	/**
	 * @param digitoContaContabil the digitoContaContabil to set
	 */
	public void setDigitoContaContabil(Integer digitoContaContabil) {
		this.digitoContaContabil = digitoContaContabil;
	}
	/**
	 * @return the digitoContaContabilAnterior
	 */
	public Integer getDigitoContaContabilAnterior() {
		return digitoContaContabilAnterior;
	}
	/**
	 * @param digitoContaContabilAnterior the digitoContaContabilAnterior to set
	 */
	public void setDigitoContaContabilAnterior(Integer digitoContaContabilAnterior) {
		this.digitoContaContabilAnterior = digitoContaContabilAnterior;
	}
	/**
	 * @return the cdItem
	 */
	public Integer getCdItem() {
		return cdItem;
	}
	/**
	 * @param cdItem the cdItem to set
	 */
	public void setCdItem(Integer cdItem) {
		this.cdItem = cdItem;
	}
	/**
	 * @return the cdItemAnterior
	 */
	public Integer getCdItemAnterior() {
		return cdItemAnterior;
	}
	/**
	 * @param cdItemAnterior the cdItemAnterior to set
	 */
	public void setCdItemAnterior(Integer cdItemAnterior) {
		this.cdItemAnterior = cdItemAnterior;
	}
	/**
	 * @return the contaContabilTributo
	 */
	public Long getContaContabilTributo() {
		return contaContabilTributo;
	}
	/**
	 * @param contaContabilTributo the contaContabilTributo to set
	 */
	public void setContaContabilTributo(Long contaContabilTributo) {
		this.contaContabilTributo = contaContabilTributo;
	}
	/**
	 * @return the contaContabilTributoAnterior
	 */
	public Long getContaContabilTributoAnterior() {
		return contaContabilTributoAnterior;
	}
	/**
	 * @param contaContabilTributoAnterior the contaContabilTributoAnterior to set
	 */
	public void setContaContabilTributoAnterior(Long contaContabilTributoAnterior) {
		this.contaContabilTributoAnterior = contaContabilTributoAnterior;
	}
	/**
	 * @return the contaContabil
	 */
	public Long getContaContabil() {
		return contaContabil;
	}
	/**
	 * @param contaContabil the contaContabil to set
	 */
	public void setContaContabil(Long contaContabil) {
		this.contaContabil = contaContabil;
	}
	/**
	 * @return the contaContabilAnterior
	 */
	public Long getContaContabilAnterior() {
		return contaContabilAnterior;
	}
	/**
	 * @param contaContabilAnterior the contaContabilAnterior to set
	 */
	public void setContaContabilAnterior(Long contaContabilAnterior) {
		this.contaContabilAnterior = contaContabilAnterior;
	}

	/**
	 * @return the dsLancamentoAplicadoContabil
	 */
	public String getDsLancamentoAplicadoContabil() {
		return dsLancamentoAplicadoContabil;
	}

	/**
	 * @param dsLancamentoAplicadoContabil the dsLancamentoAplicadoContabil to set
	 */
	public void setDsLancamentoAplicadoContabil(String dsLancamentoAplicadoContabil) {
		this.dsLancamentoAplicadoContabil = dsLancamentoAplicadoContabil;
	}

	/**
	 * @return the dsLancamentoAplicadoContabilAnterior
	 */
	public String getDsLancamentoAplicadoContabilAnterior() {
		return dsLancamentoAplicadoContabilAnterior;
	}

	/**
	 * @param dsLancamentoAplicadoContabilAnterior the dsLancamentoAplicadoContabilAnterior to set
	 */
	public void setDsLancamentoAplicadoContabilAnterior(String dsLancamentoAplicadoContabilAnterior) {
		this.dsLancamentoAplicadoContabilAnterior = dsLancamentoAplicadoContabilAnterior;
	}
    
}
