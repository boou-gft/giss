package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class DependenciasEncerradasSaidaDTO {
	
	private String codMensagem;
	private String mensagem;
    private Integer quantidadeOcorrencias;
    private Integer numeroSequencialUnidadeOrganizacional;
    private Long codigoMunicipio;
    private String nomeMunicipio;
    private String siglaUnidadeFederativa;
    private String nomeUnidadeOrganizacionalResponsavel;
    private String dataExclusao;
    private String horaManutencaoRegistro;
	
    public DependenciasEncerradasSaidaDTO() {
		super();
	}

	public DependenciasEncerradasSaidaDTO(Integer numeroSequencialUnidadeOrganizacional, Long codigoMunicipio, String nomeMunicipio, String siglaUnidadeFederativa, String nomeUnidadeOrganizacionalResponsavel, String dataExclusao, String horaManutencaoRegistro) {
		super();
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
		this.codigoMunicipio = codigoMunicipio;
		this.nomeMunicipio = nomeMunicipio;
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
		this.nomeUnidadeOrganizacionalResponsavel = nomeUnidadeOrganizacionalResponsavel;
		this.dataExclusao = dataExclusao;
		this.horaManutencaoRegistro = horaManutencaoRegistro;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public String getDataExclusao() {
		return dataExclusao;
	}

	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}

	public String getHoraManutencaoRegistro() {
		return horaManutencaoRegistro;
	}

	public void setHoraManutencaoRegistro(String horaManutencaoRegistro) {
		this.horaManutencaoRegistro = horaManutencaoRegistro;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getNomeUnidadeOrganizacionalResponsavel() {
		return nomeUnidadeOrganizacionalResponsavel;
	}

	public void setNomeUnidadeOrganizacionalResponsavel(
			String nomeUnidadeOrganizacionalResponsavel) {
		this.nomeUnidadeOrganizacionalResponsavel = nomeUnidadeOrganizacionalResponsavel;
	}

	public Integer getNumeroSequencialUnidadeOrganizacional() {
		return numeroSequencialUnidadeOrganizacional;
	}

	public void setNumeroSequencialUnidadeOrganizacional(
			Integer numeroSequencialUnidadeOrganizacional) {
		this.numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
	}

	public Integer getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}

	public void setQuantidadeOcorrencias(Integer quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}

	public String getSiglaUnidadeFederativa() {
		return siglaUnidadeFederativa;
	}

	public void setSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
	}
     
    
}
