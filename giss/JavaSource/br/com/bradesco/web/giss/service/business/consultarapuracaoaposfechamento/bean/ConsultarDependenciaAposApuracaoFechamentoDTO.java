package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

public class ConsultarDependenciaAposApuracaoFechamentoDTO implements Comparable<ConsultarDependenciaAposApuracaoFechamentoDTO>{
	
	private String dependecia;
	private String descricao;
	private String receita;
	private String ISSRecolher;
	private int linha;
	private String totalReceita;
	private String totalReceitaAg;
	private String totalReceitaPa;
	private String totalRecolher;
	private String totalRecolherAg;
	private String totalRecolherPa;
	private String codigoPessoaJuridica;
	private String numeroSequencial;
	private String dtProcessamento;
	private String codPa;
	private String descPa;
	private String codDepPa;
	private String descDepPa;
	private Long qtdeAgencia;
	private Long qtdePa;
	
	public String getDependecia() {
		return dependecia;
	}
	public void setDependecia(String dependecia) {
		this.dependecia = dependecia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getISSRecolher() {
		return ISSRecolher;
	}
	public void setISSRecolher(String recolher) {
		ISSRecolher = recolher;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	public String getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}
	public String getTotalRecolher() {
		return totalRecolher;
	}
	public void setTotalRecolher(String totalRecolher) {
		this.totalRecolher = totalRecolher;
	}
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getNumeroSequencial() {
		return numeroSequencial;
	}
	public void setNumeroSequencial(String numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	public String getDtProcessamento() {
		return dtProcessamento;
	}
	public void setDtProcessamento(String dtProcessamento) {
		this.dtProcessamento = dtProcessamento;
	}
	/**
	 * @return the codPa
	 */
	public String getCodPa() {
		return codPa;
	}
	/**
	 * @param codPa the codPa to set
	 */
	public void setCodPa(String codPa) {
		this.codPa = codPa;
	}
	/**
	 * @return the descPa
	 */
	public String getDescPa() {
		return descPa;
	}
	/**
	 * @param descPa the descPa to set
	 */
	public void setDescPa(String descPa) {
		this.descPa = descPa;
	}
	/**
	 * @return the codDepPa
	 */
	public String getCodDepPa() {
		return codDepPa;
	}
	/**
	 * @param codDepPa the codDepPa to set
	 */
	public void setCodDepPa(String codDepPa) {
		this.codDepPa = codDepPa;
	}
	/**
	 * @return the descDepPa
	 */
	public String getDescDepPa() {
		return descDepPa;
	}
	/**
	 * @param descDepPa the descDepPa to set
	 */
	public void setDescDepPa(String descDepPa) {
		this.descDepPa = descDepPa;
	}
	/**
	 * @return the totalReceitaAg
	 */
	public String getTotalReceitaAg() {
		return totalReceitaAg;
	}
	/**
	 * @param totalReceitaAg the totalReceitaAg to set
	 */
	public void setTotalReceitaAg(String totalReceitaAg) {
		this.totalReceitaAg = totalReceitaAg;
	}
	/**
	 * @return the totalReceitaPa
	 */
	public String getTotalReceitaPa() {
		return totalReceitaPa;
	}
	/**
	 * @param totalReceitaPa the totalReceitaPa to set
	 */
	public void setTotalReceitaPa(String totalReceitaPa) {
		this.totalReceitaPa = totalReceitaPa;
	}
	/**
	 * @return the totalRecolherAg
	 */
	public String getTotalRecolherAg() {
		return totalRecolherAg;
	}
	/**
	 * @param totalRecolherAg the totalRecolherAg to set
	 */
	public void setTotalRecolherAg(String totalRecolherAg) {
		this.totalRecolherAg = totalRecolherAg;
	}
	/**
	 * @return the totalRecolherPa
	 */
	public String getTotalRecolherPa() {
		return totalRecolherPa;
	}
	/**
	 * @param totalRecolherPa the totalRecolherPa to set
	 */
	public void setTotalRecolherPa(String totalRecolherPa) {
		this.totalRecolherPa = totalRecolherPa;
	}
	public int compareTo(ConsultarDependenciaAposApuracaoFechamentoDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
	}
	/**
	 * @return the qtdeAgencia
	 */
	public Long getQtdeAgencia() {
		return qtdeAgencia;
	}
	/**
	 * @param qtdeAgencia the qtdeAgencia to set
	 */
	public void setQtdeAgencia(Long qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}
	/**
	 * @return the qtdePa
	 */
	public Long getQtdePa() {
		return qtdePa;
	}
	/**
	 * @param qtdePa the qtdePa to set
	 */
	public void setQtdePa(Long qtdePa) {
		this.qtdePa = qtdePa;
	}
}
