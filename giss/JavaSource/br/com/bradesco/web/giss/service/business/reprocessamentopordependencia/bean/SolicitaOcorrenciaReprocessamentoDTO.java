package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

public class SolicitaOcorrenciaReprocessamentoDTO {

	private Long codigoMunicipio;

    private Long codigoPessoaJuridica;

    private Integer numeroSequenciaUnidadeOrganizacional;

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

	public Integer getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}

	public void setNumeroSequenciaUnidadeOrganizacional(
			Integer numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}
}
