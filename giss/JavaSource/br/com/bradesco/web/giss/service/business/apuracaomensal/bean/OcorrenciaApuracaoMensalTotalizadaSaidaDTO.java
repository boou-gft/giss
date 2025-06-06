package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;


public class OcorrenciaApuracaoMensalTotalizadaSaidaDTO {

	private String conta;
    private String receitaApuracaoSinal;
    private BigDecimal receitaApuracaoValor;
    private String receitaTributoApuracaoSinal;
    private BigDecimal receitaTributoApuracaoValor;
    private BigDecimal percentualAliquotaApuracao;
    private String tributoApuracaoSinal;
    private BigDecimal tributoApuracaoValor;
    private String razao;
    private String cosif;
	private boolean razaoExiste = true;
	private int linha;

    public OcorrenciaApuracaoMensalTotalizadaSaidaDTO() {
		super();
	}
    
    GissUtil util = new GissUtil();
	
	public BigDecimal getPercentualAliquotaApuracao() {
		return percentualAliquotaApuracao;
	}
	public void setPercentualAliquotaApuracao(BigDecimal percentualAliquotaApuracao) {
		this.percentualAliquotaApuracao = percentualAliquotaApuracao;
	}
	public String getReceitaApuracaoSinal() {
		return receitaApuracaoSinal;
	}
	public void setReceitaApuracaoSinal(String receitaApuracaoSinal) {
		this.receitaApuracaoSinal = receitaApuracaoSinal;
	}
	public BigDecimal getReceitaApuracaoValor() {
		return receitaApuracaoValor;
	}
	public void setReceitaApuracaoValor(BigDecimal receitaApuracaoValor) {
		this.receitaApuracaoValor = receitaApuracaoValor;
	}
	public String getReceitaTributoApuracaoSinal() {
		return receitaTributoApuracaoSinal;
	}
	public void setReceitaTributoApuracaoSinal(String receitaTributoApuracaoSinal) {
		this.receitaTributoApuracaoSinal = receitaTributoApuracaoSinal;
	}
	public BigDecimal getReceitaTributoApuracaoValor() {
		return receitaTributoApuracaoValor;
	}
	public void setReceitaTributoApuracaoValor(
			BigDecimal receitaTributoApuracaoValor) {
		this.receitaTributoApuracaoValor = receitaTributoApuracaoValor;
	}
	public String getTributoApuracaoSinal() {
		return tributoApuracaoSinal;
	}
	public void setTributoApuracaoSinal(String tributoApuracaoSinal) {
		this.tributoApuracaoSinal = tributoApuracaoSinal;
	}
	public BigDecimal getTributoApuracaoValor() {
		return tributoApuracaoValor;
	}
	public void setTributoApuracaoValor(BigDecimal tributoApuracaoValor) {
		this.tributoApuracaoValor = tributoApuracaoValor;
	}
	
	public Integer getCodigoGrupo() {
	    return GissUtil.pegarCodigoGrupo(razao);
	}

	public Integer getCodigoSubGrupo() {
	    return GissUtil.pegarCodigoSubgrupo(razao);
	}
	
	public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
	public boolean isRazaoExiste() {
		return razaoExiste;
	}
	public void setRazaoExiste(boolean razaoExiste) {
		this.razaoExiste = razaoExiste;
	}
	public String getCosif() {
		return cosif;
	}
	public void setCosif(String cosif) {
		this.cosif = cosif;
	}
	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(int linha) {
		this.linha = linha;
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
    
