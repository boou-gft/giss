package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;


public class ReprocessamentoDependenciaProsseguirDTO implements Comparable<ReprocessamentoDependenciaProsseguirDTO> {
	
	private boolean radio;
	private String dependencia;
	private String municipio;
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
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof ReprocessamentoDependenciaProsseguirDTO)) {
			return false;
		}

		ReprocessamentoDependenciaProsseguirDTO other = (ReprocessamentoDependenciaProsseguirDTO) obj;
		return this.getDependencia().equals(other.getDependencia());
	}

	@Override
	public int hashCode() {
		return getDependencia().hashCode();
	}

	public int compareTo(ReprocessamentoDependenciaProsseguirDTO o) {
		return this.getDependencia().compareTo(o.getDependencia());
	}
}
