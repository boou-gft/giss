package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class DetalhesDependenciasHistoricoEntradaDTO {
	
	private Long codigoPessoaJuridica;
    private Integer numeroSequencialUnidadeOrganizacional;
    private String timestamp;
	
    public DetalhesDependenciasHistoricoEntradaDTO() {
		super();
	}

	public DetalhesDependenciasHistoricoEntradaDTO(Long codigoPessoaJuridica, Integer numeroSequencialUnidadeOrganizacional, String timestamp) {
		super();
		this.codigoPessoaJuridica = codigoPessoaJuridica;
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
		this.timestamp = timestamp;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Integer getNumeroSequencialUnidadeOrganizacional() {
		return numeroSequencialUnidadeOrganizacional;
	}

	public void setNumeroSequencialUnidadeOrganizacional(
			Integer numeroSequencialUnidadeOrganizacional) {
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
	
	
}
