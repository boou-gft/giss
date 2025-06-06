package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

public class DependenciaDTO {

	private Long codigoPessoaJuridica;

    private Integer numeroSequenciaUnidadeOrganizacional;

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
