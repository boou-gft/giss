package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class PlanApuracaoIssSaidaListaDTO  implements Comparable<PlanApuracaoIssSaidaListaDTO> {
	
	private Integer codMessagem;
	private String messagem;
	private Integer quantidadeOcorrencia;
	
	private Long codigoPessoaJuridica;
	private Integer numeroSequencial;
	private Integer dataCompetencia;
	private Long contaContabil;
	private String codigoDepedencia;
	private String descricaoDependencia;
	private String sinalReceita;
	private BigDecimal valorReceita;
	private String sinalTributoApuracao;
	private BigDecimal valorTributoApuracao;
	private BigDecimal totalMunicipioReceita;
	private BigDecimal totalMunicipiolIss;
	private String codPa;
	private String descPa;
	private int linha;
	private String razao;
	private String codDepPa;
	private String descDepPa;
	private Long qtdeAgencia;
	private Long qtdePa;
	private String competenciaConcatCodDepPa;
	private String uf;
	private String municipio;
	private String tragSemTrag;
	private Long codigoMunicipio;

	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public Long getContaContabil() {
		return contaContabil;
	}
	/**
	 * Obtém o campo codMessagem
	 * @return codMessagem Integer 
	 */
	public Integer getCodMessagem() {
		return codMessagem;
	}
	/**
	 * Define o campo codMessagem
	 * @param codMessagem Integer 
	 */
	public void setCodMessagem(Integer codMessagem) {
		this.codMessagem = codMessagem;
	}



	/**
	 * Obtém o campo codigoDepedencia
	 * @return codigoDepedencia String 
	 */
	public String getCodigoDepedencia() {
		return codigoDepedencia;
	}
	/**
	 * Define o campo codigoDepedencia
	 * @param codigoDepedencia String 
	 */
	public void setCodigoDepedencia(String codigoDepedencia) {
		this.codigoDepedencia = codigoDepedencia;
	}
	/**
	 * Obtém o campo codigoPessoaJuridica
	 * @return codigoPessoaJuridica Long 
	 */
	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	/**
	 * Define o campo codigoPessoaJuridica
	 * @param codigoPessoaJuridica Long 
	 */
	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	/**
	 * Obtém o campo dataCompetencia
	 * @return dataCompetencia Integer 
	 */
	public Integer getDataCompetencia() {
		return dataCompetencia;
	}
	/**
	 * Define o campo dataCompetencia
	 * @param dataCompetencia Integer 
	 */
	public void setDataCompetencia(Integer dataCompetencia) {
		this.dataCompetencia = dataCompetencia;
	}
	/**
	 * Obtém o campo descricaoDependencia
	 * @return descricaoDependencia String 
	 */
	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}
	/**
	 * Define o campo descricaoDependencia
	 * @param descricaoDependencia String 
	 */
	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}
	/**
	 * Obtém o campo messagem
	 * @return messagem String 
	 */
	public String getMessagem() {
		return messagem;
	}
	/**
	 * Define o campo messagem
	 * @param messagem String 
	 */
	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
	/**
	 * Obtém o campo numeroSequencial
	 * @return numeroSequencial Integer 
	 */
	public Integer getNumeroSequencial() {
		return numeroSequencial;
	}
	/**
	 * Define o campo numeroSequencial
	 * @param numeroSequencial Integer 
	 */
	public void setNumeroSequencial(Integer numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	/**
	 * Obtém o campo quantidadeOcorrencia
	 * @return quantidadeOcorrencia Integer 
	 */
	public Integer getQuantidadeOcorrencia() {
		return quantidadeOcorrencia;
	}
	/**
	 * Define o campo quantidadeOcorrencia
	 * @param quantidadeOcorrencia Integer 
	 */
	public void setQuantidadeOcorrencia(Integer quantidadeOcorrencia) {
		this.quantidadeOcorrencia = quantidadeOcorrencia;
	}
	/**
	 * Obtém o campo sinalReceita
	 * @return sinalReceita String 
	 */
	public String getSinalReceita() {
		return sinalReceita;
	}
	/**
	 * Define o campo sinalReceita
	 * @param sinalReceita String 
	 */
	public void setSinalReceita(String sinalReceita) {
		this.sinalReceita = sinalReceita;
	}
	/**
	 * Obtém o campo sinalTributoApuracao
	 * @return sinalTributoApuracao String 
	 */
	public String getSinalTributoApuracao() {
		return sinalTributoApuracao;
	}
	/**
	 * Define o campo sinalTributoApuracao
	 * @param sinalTributoApuracao String 
	 */
	public void setSinalTributoApuracao(String sinalTributoApuracao) {
		this.sinalTributoApuracao = sinalTributoApuracao;
	}
	/**
	 * Obtém o campo valorReceita
	 * @return valorReceita BigDecimal 
	 */
	public BigDecimal getValorReceita() {
		return valorReceita;
	}
	/**
	 * Define o campo valorReceita
	 * @param valorReceita BigDecimal 
	 */
	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}
	/**
	 * Obtém o campo valorTributoApuracao
	 * @return valorTributoApuracao BigDecimal 
	 */
	public BigDecimal getValorTributoApuracao() {
		return valorTributoApuracao;
	}
	/**
	 * Define o campo valorTributoApuracao
	 * @param valorTributoApuracao BigDecimal 
	 */
	public void setValorTributoApuracao(BigDecimal valorTributoApuracao) {
		this.valorTributoApuracao = valorTributoApuracao;
	}
	/**
	 * Define o campo contaContabil
	 * @param contaContabil Long 
	 */
	public void setContaContabil(Long contaContabil) {
		this.contaContabil = contaContabil;
	}
	public BigDecimal getTotalMunicipiolIss() {
		return totalMunicipiolIss;
	}
	public void setTotalMunicipiolIss(BigDecimal totalMunicipiolIss) {
		this.totalMunicipiolIss = totalMunicipiolIss;
	}
	public BigDecimal getTotalMunicipioReceita() {
		return totalMunicipioReceita;
	}
	public void setTotalMunicipioReceita(BigDecimal totalMunicipioReceita) {
		this.totalMunicipioReceita = totalMunicipioReceita;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public String getDataCompetenciaFormatada(){
		return GissUtil.formatarDataInvertida(this.dataCompetencia);
	}
	
	public String getDataCompetenciaNormalFormatada(){
		return GissUtil.formatarData(this.dataCompetencia);
	}
	
	public String getMesCompetencia(){
		return this.dataCompetencia.toString().substring(4);
	}
	public String getAnoCompetencia(){
		return this.dataCompetencia.toString().substring(0, 4);
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
	
	public int compareTo(PlanApuracaoIssSaidaListaDTO m) {
		return this.getCompetenciaConcatCodDepPa().compareTo(m.getCompetenciaConcatCodDepPa());
	}
	/**
	 * @return the competenciaConcatCodDepPa
	 */
	public String getCompetenciaConcatCodDepPa() {
		return competenciaConcatCodDepPa;
	}
	/**
	 * @param competenciaConcatCodDepPa the competenciaConcatCodDepPa to set
	 */
	public void setCompetenciaConcatCodDepPa(String competenciaConcatCodDepPa) {
		this.competenciaConcatCodDepPa = competenciaConcatCodDepPa;
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
	public String getTragSemTrag() {
		return tragSemTrag;
	}
	public void setTragSemTrag(String tragSemTrag) {
		this.tragSemTrag = tragSemTrag;
	}
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	
}
