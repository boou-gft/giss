package br.com.bradesco.web.giss.service.business.dependencia.bean;

import java.util.ArrayList;
import java.util.List;

public class DependenciaDTO {

	private String codigoPessoaJuridica;
	private String seqUnidadeOrganizacional;
	private String codigoDependencia;
	private String descricaoDependencia;
	private String cnpj;
	private String dataAbertura;
	private String dataEncerramento;
	private String agenciaIncorporadora;
	private String agenciaIncorporadoraDepartamento;
	private String codAgenciaIncorporadoraDepartamento;
	private String descAgenciaIncorporadoraDepartamento;
	private String estadoMunicipioAgenIncorpDepto;
	private String codMunicipioAgenIncorpDepto;
	private String descMunicipioAgenIncorpDepto;
	private String logradouro;
	private String numero;
	private String cep;
	private String municipio;
	private String estado;
	private String pais;
	private String ccm;
	private String indTributavel;
	private String inscricaoMunicipal;
	private String tipoDepartamento;
	private String codigoDepartamentoAgenciaIncorporadora;
	private String descricaoDepartamentoAgenciaIncorporadora;
	private String codigoPessoaAgencIncorpDepto;
	private String numeroSequencAgencIncorpDepto;
	private Long codMunicipio;
	private String codMensagem;
	private String mensagem;
	private Integer codPaa;
	private String descPaa;
	private String uf;
	private Integer operacao;
	private boolean exibirCheckCont;
	private Integer linha;
	private Integer linhaCont;
	private String dataAtualizacao;
	private boolean exibirChecked;

	private List<DependenciaDTO> listaPaa = new ArrayList<DependenciaDTO>();
	private List<DependenciaDTO> listaPaaCon = new ArrayList<DependenciaDTO>();

	public String getCodMunicipioAgenIncorpDepto() {
		return codMunicipioAgenIncorpDepto;
	}

	public void setCodMunicipioAgenIncorpDepto(
			String codMunicipioAgenIncorpDepto) {
		this.codMunicipioAgenIncorpDepto = codMunicipioAgenIncorpDepto;
	}

	public String getDescMunicipioAgenIncorpDepto() {
		return descMunicipioAgenIncorpDepto;
	}

	public void setDescMunicipioAgenIncorpDepto(
			String descMunicipioAgenIncorpDepto) {
		this.descMunicipioAgenIncorpDepto = descMunicipioAgenIncorpDepto;
	}

	public String getEstadoMunicipioAgenIncorpDepto() {
		return estadoMunicipioAgenIncorpDepto;
	}

	public void setEstadoMunicipioAgenIncorpDepto(
			String estadoMunicipioAgenIncorpDepto) {
		this.estadoMunicipioAgenIncorpDepto = estadoMunicipioAgenIncorpDepto;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public String getSeqUnidadeOrganizacional() {
		return seqUnidadeOrganizacional;
	}

	public void setSeqUnidadeOrganizacional(String seqUnidadeOrganizacional) {
		this.seqUnidadeOrganizacional = seqUnidadeOrganizacional;
	}

	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public String getAgenciaIncorporadora() {
		return agenciaIncorporadora;
	}

	public void setAgenciaIncorporadora(String agenciaIncorporadora) {
		this.agenciaIncorporadora = agenciaIncorporadora;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}

	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCcm() {
		return ccm;
	}

	public void setCcm(String ccm) {
		this.ccm = ccm;
	}

	public String getIndTributavel() {
		return indTributavel;
	}

	public void setIndTributavel(String indTributavel) {
		this.indTributavel = indTributavel;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getCodAgenciaIncorporadoraDepartamento() {
		return codAgenciaIncorporadoraDepartamento;
	}

	public void setCodAgenciaIncorporadoraDepartamento(
			String codAgenciaIncorporadoraDepartamento) {
		this.codAgenciaIncorporadoraDepartamento = codAgenciaIncorporadoraDepartamento;
	}

	public String getDescAgenciaIncorporadoraDepartamento() {
		return descAgenciaIncorporadoraDepartamento;
	}

	public void setDescAgenciaIncorporadoraDepartamento(
			String descAgenciaIncorporadoraDepartamento) {
		this.descAgenciaIncorporadoraDepartamento = descAgenciaIncorporadoraDepartamento;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigoDepartamentoAgenciaIncorporadora() {
		return codigoDepartamentoAgenciaIncorporadora;
	}

	public void setCodigoDepartamentoAgenciaIncorporadora(
			String codigoDepartamentoAgenciaIncorporadora) {
		this.codigoDepartamentoAgenciaIncorporadora = codigoDepartamentoAgenciaIncorporadora;
	}

	public String getDescricaoDepartamentoAgenciaIncorporadora() {
		return descricaoDepartamentoAgenciaIncorporadora;
	}

	public void setDescricaoDepartamentoAgenciaIncorporadora(
			String descricaoDepartamentoAgenciaIncorporadora) {
		this.descricaoDepartamentoAgenciaIncorporadora = descricaoDepartamentoAgenciaIncorporadora;
	}

	public String getAgenciaIncorporadoraDepartamento() {
		return agenciaIncorporadoraDepartamento;
	}

	public void setAgenciaIncorporadoraDepartamento(
			String agenciaIncorporadoraDepartamento) {
		this.agenciaIncorporadoraDepartamento = agenciaIncorporadoraDepartamento;
	}

	public String getCodigoPessoaAgencIncorpDepto() {
		return codigoPessoaAgencIncorpDepto;
	}

	public void setCodigoPessoaAgencIncorpDepto(
			String codigoPessoaAgencIncorpDepto) {
		this.codigoPessoaAgencIncorpDepto = codigoPessoaAgencIncorpDepto;
	}

	public String getNumeroSequencAgencIncorpDepto() {
		return numeroSequencAgencIncorpDepto;
	}

	public void setNumeroSequencAgencIncorpDepto(
			String numeroSequencAgencIncorpDepto) {
		this.numeroSequencAgencIncorpDepto = numeroSequencAgencIncorpDepto;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	/**
	 * @return the listaPaa
	 */
	public List<DependenciaDTO> getListaPaa() {
		return listaPaa;
	}

	/**
	 * @param listaPaa
	 *            the listaPaa to set
	 */
	public void setListaPaa(List<DependenciaDTO> listaPaa) {
		this.listaPaa = listaPaa;
	}

	/**
	 * @return the codPaa
	 */
	public Integer getCodPaa() {
		return codPaa;
	}

	/**
	 * @param codPaa
	 *            the codPaa to set
	 */
	public void setCodPaa(Integer codPaa) {
		this.codPaa = codPaa;
	}

	/**
	 * @return the descPaa
	 */
	public String getDescPaa() {
		return descPaa;
	}

	/**
	 * @param descPaa
	 *            the descPaa to set
	 */
	public void setDescPaa(String descPaa) {
		this.descPaa = descPaa;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf
	 *            the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the operacao
	 */
	public Integer getOperacao() {
		return operacao;
	}

	/**
	 * @param operacao
	 *            the operacao to set
	 */
	public void setOperacao(Integer operacao) {
		this.operacao = operacao;
	}

	/**
	 * @return the listaPaaCon
	 */
	public List<DependenciaDTO> getListaPaaCon() {
		return listaPaaCon;
	}

	/**
	 * @param listaPaaCon
	 *            the listaPaaCon to set
	 */
	public void setListaPaaCon(List<DependenciaDTO> listaPaaCon) {
		this.listaPaaCon = listaPaaCon;
	}

	/**
	 * @return the exibirCheckCont
	 */
	public boolean isExibirCheckCont() {
		return exibirCheckCont;
	}

	/**
	 * @param exibirCheckCont
	 *            the exibirCheckCont to set
	 */
	public void setExibirCheckCont(boolean exibirCheckCont) {
		this.exibirCheckCont = exibirCheckCont;
	}

	/**
	 * @return the linha
	 */
	public Integer getLinha() {
		return linha;
	}

	/**
	 * @param linha
	 *            the linha to set
	 */
	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	/**
	 * @return the linhaCont
	 */
	public Integer getLinhaCont() {
		return linhaCont;
	}

	/**
	 * @param linhaCont
	 *            the linhaCont to set
	 */
	public void setLinhaCont(Integer linhaCont) {
		this.linhaCont = linhaCont;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public boolean isExibirChecked() {
		return exibirChecked;
	}

	public void setExibirChecked(boolean exibirChecked) {
		this.exibirChecked = exibirChecked;
	}

}
