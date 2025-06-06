package br.com.bradesco.web.giss.service.business.mantermunicipio.bean;

public class DetalheMunicipioDTO {
	
	private String codigoMunicipio;
	private String nomeMunicipio;
	private String nomeUnidadeFederativa;
	private String nroLei;
	private String descLei;
	private String infoComplementar;
	private String percentualAliquota;
	private String diaVencimento;
	private String pagtoDiaUtil;
	private String indiceVigencia;
	private String descFormaPagamento;
	private String percentualBaseCalculo;
	private String percentualAliquotaPadrao;
	private String descTipoIncidencia;
	private String nomeTipoIncidencia;
	private String descUnidadeFederativa;
	private String dependenciaCentralizadora;
	private Integer codigoDependRespRecolhimento;
	private String nomeDependRespRecolhimento;
	private String codigoPessoaJuridica;
	private String numeroSequencialCentralizadora; 
	private String ufCentralizadora;
	private Long codigoMunicipioCentralizadora;
	private String descricaoMunicipio;
	private String codigoErro;
	private String mensagemErro;
	private Integer tipoPesquisa;
	
	
	public String getNomeTipoIncidencia() {
		return nomeTipoIncidencia;
	}
	public void setNomeTipoIncidencia(String nomeTipoIncidencia) {
		this.nomeTipoIncidencia = nomeTipoIncidencia;
	}
	public String getCodigoErro() {
		return codigoErro;
	}
	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}
	public String getMensagemErro() {
		return mensagemErro;
	}
	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
	public String getIndiceVigencia() {
		return indiceVigencia;
	}
	public void setIndiceVigencia(String indiceVigencia) {
		this.indiceVigencia = indiceVigencia;
	}
	public String getNomeUnidadeFederativa() {
		return nomeUnidadeFederativa;
	}
	public void setNomeUnidadeFederativa(String nomeUnidadeFederativa) {
		this.nomeUnidadeFederativa = nomeUnidadeFederativa;
	}
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public String getDependenciaCentralizadora() {
		return dependenciaCentralizadora;
	}
	public void setDependenciaCentralizadora(String dependenciaCentralizadora) {
		this.dependenciaCentralizadora = dependenciaCentralizadora;
	}
	public String getDescFormaPagamento() {
		return descFormaPagamento;
	}
	public void setDescFormaPagamento(String descFormaPagamento) {
		this.descFormaPagamento = descFormaPagamento;
	}
	public String getDescTipoIncidencia() {
		return descTipoIncidencia;
	}
	public void setDescTipoIncidencia(String descTipoIncidencia) {
		this.descTipoIncidencia = descTipoIncidencia;
	}
	public String getDescUnidadeFederativa() {
		return descUnidadeFederativa;
	}
	public void setDescUnidadeFederativa(String descUnidadeFederativa) {
		this.descUnidadeFederativa = descUnidadeFederativa;
	}
	public String getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public String getPagtoDiaUtil() {
		return pagtoDiaUtil;
	}
	public void setPagtoDiaUtil(String pagtoDiaUtil) {
		this.pagtoDiaUtil = pagtoDiaUtil;
	}
	public String getPercentualAliquota() {
		return percentualAliquota;
	}
	public void setPercentualAliquota(String percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
	}
	public String getPercentualAliquotaPadrao() {
		return percentualAliquotaPadrao;
	}
	public void setPercentualAliquotaPadrao(String percentualAliquotaPadrao) {
		this.percentualAliquotaPadrao = percentualAliquotaPadrao;
	}
	public String getPercentualBaseCalculo() {
		return percentualBaseCalculo;
	}
	public void setPercentualBaseCalculo(String percentualBaseCalculo) {
		this.percentualBaseCalculo = percentualBaseCalculo;
	}
	public Integer getCodigoDependRespRecolhimento() {
		return codigoDependRespRecolhimento;
	}
	public void setCodigoDependRespRecolhimento(Integer codigoDependRespRecolhimento) {
		this.codigoDependRespRecolhimento = codigoDependRespRecolhimento;
	}
	public String getNomeDependRespRecolhimento() {
		return nomeDependRespRecolhimento;
	}
	public void setNomeDependRespRecolhimento(String nomeDependRespRecolhimento) {
		this.nomeDependRespRecolhimento = nomeDependRespRecolhimento;
	}
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getNumeroSequencialCentralizadora() {
		return numeroSequencialCentralizadora;
	}
	public void setNumeroSequencialCentralizadora(
			String numeroSequencialCentralizadora) {
		this.numeroSequencialCentralizadora = numeroSequencialCentralizadora;
	}
		public Long getCodigoMunicipioCentralizadora() {
		return codigoMunicipioCentralizadora;
	}
	public void setCodigoMunicipioCentralizadora(Long codigoMunicipioCentralizadora) {
		this.codigoMunicipioCentralizadora = codigoMunicipioCentralizadora;
	}
	public String getDescricaoMunicipio() {
		return descricaoMunicipio;
	}
	public void setDescricaoMunicipio(String descricaoMunicipio) {
		this.descricaoMunicipio = descricaoMunicipio;
	}
	public String getUfCentralizadora() {
		return ufCentralizadora;
	}
	public void setUfCentralizadora(String ufCentralizadora) {
		this.ufCentralizadora = ufCentralizadora;
	}
	public String getNroLei() {
		return nroLei;
	}
	public void setNroLei(String nroLei) {
		this.nroLei = nroLei;
	}
	public String getInfoComplementar() {
		return infoComplementar;
	}
	public void setInfoComplementar(String infoComplementar) {
		this.infoComplementar = infoComplementar;
	}
	public String getDescLei() {
		return descLei;
	}
	public void setDescLei(String descLei) {
		this.descLei = descLei;
	}
	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}
	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
}
