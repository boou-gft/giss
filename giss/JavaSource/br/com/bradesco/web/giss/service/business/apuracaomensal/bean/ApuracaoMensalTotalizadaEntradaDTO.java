package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

public class ApuracaoMensalTotalizadaEntradaDTO {

	private Integer numeroMaximoOcorrencias;
    private Long codigoMunicipio;
    private Long codigoPessoaJuridica;
    private Integer numeroSequenciaUnidadeOrganizacional;
    private Integer dataApuracao;
    private String razao;
    private String cosif;
   
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Integer getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public Integer getNumeroMaximoOcorrencias() {
		return numeroMaximoOcorrencias;
	}

	public void setNumeroMaximoOcorrencias(Integer numeroMaximoOcorrencias) {
		this.numeroMaximoOcorrencias = numeroMaximoOcorrencias;
	}

	public Integer getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}

	public void setNumeroSequenciaUnidadeOrganizacional(
			Integer numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}

	/**
	 * @return the razao
	 */
	public String getRazao() {
		return razao;
	}

	/**
	 * @param razao the razao to set
	 */
	public void setRazao(String razao) {
		this.razao = razao;
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
}
