package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListaIntermediariaBalancetesSaidaDTO {
	
	private Long codSolicitacaoBalancete;
    private Integer dtMesAnoApuracao;
    private String periodo;
    private Long codEmpresa;
    private String descEmpresa;
    private Integer codUf;
    private String siglaUf;
    private Long codMunicipio;
    private String descMunicipio;
    private Integer codDependencia;
    private String codDependenciaFormatado;

	public ListaIntermediariaBalancetesSaidaDTO() {
	
	}

	public ListaIntermediariaBalancetesSaidaDTO(Long codSolicitacaoBalancete, Integer dtMesAnoApuracao, String periodo, Long codEmpresa, String descEmpresa, Integer codUf, String siglaUf, Long codMunicipio, String descMunicipio, Integer codDependencia, String codDependenciaFormatado) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
		this.dtMesAnoApuracao = dtMesAnoApuracao;
		this.periodo = periodo;
		this.codEmpresa = codEmpresa;
		this.descEmpresa = descEmpresa;
		this.codUf = codUf;
		this.siglaUf = siglaUf;
		this.codMunicipio = codMunicipio;
		this.descMunicipio = descMunicipio;
		this.codDependencia = codDependencia;
		this.codDependenciaFormatado = codDependenciaFormatado;
	}

	public Long getCodSolicitacaoBalancete() {
		return codSolicitacaoBalancete;
	}

	public void setCodSolicitacaoBalancete(Long codSolicitacaoBalancete) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
	}

	public Integer getDtMesAnoApuracao() {
		return dtMesAnoApuracao;
	}

	public void setDtMesAnoApuracao(Integer dtMesAnoApuracao) {
		this.dtMesAnoApuracao = dtMesAnoApuracao;
	}

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getDescEmpresa() {
		return descEmpresa;
	}

	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	public Integer getCodUf() {
		return codUf;
	}

	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public Integer getCodDependencia() {
		return codDependencia;
	}

	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getCodDependenciaFormatado() {
		return codDependenciaFormatado;
	}

	public void setCodDependenciaFormatado(String codDependenciaFormatado) {
		this.codDependenciaFormatado = codDependenciaFormatado;
	}
}