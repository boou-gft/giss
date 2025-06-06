package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean;

public class ConsultarApuracaoAposFechamentoEntradaDTO {

	private Integer competencia;
	private Long codigoPessoaJuridica;
	private Integer numeroSequencialUnidadeOrganizacional;
	private Long codPessoaJuridica;
	private Integer codDependencia;
	private Integer filtro;
	private String cosif;
	private String razao;
	

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public Integer getNumeroSequencialUnidadeOrganizacional() {
		return numeroSequencialUnidadeOrganizacional;
	}

	public void setNumeroSequencialUnidadeOrganizacional(
			Integer numeroSequencialUnidadeOrganizacional) {
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
	}

	public Long getCodPessoaJuridica() {
		return codPessoaJuridica;
	}

	public void setCodPessoaJuridica(Long codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}

	public Integer getCodDependencia() {
		return codDependencia;
	}

	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}

	public Integer getFiltro() {
		return filtro;
	}

	public void setFiltro(Integer filtro) {
		this.filtro = filtro;
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
}
