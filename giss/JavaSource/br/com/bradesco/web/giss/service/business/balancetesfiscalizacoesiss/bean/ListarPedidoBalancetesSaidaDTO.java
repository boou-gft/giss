package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

public class ListarPedidoBalancetesSaidaDTO {
	
	private Long codSolicitacaoBalancete;
    private String codTipoBalancete;
    private Integer dtInicioPesquisa;
    private Integer dtFimPesquisa;
    private String periodoInicial;
    private String periodoFinal;
    private String descUf;
    private String descEmpresa;
    private String descMunicipio;
    private String codSituacaoPedido;
    private String descSituacaoPedido;
    private String hrInclusaoPedido;
    private String dataSolicitacao;
    private Integer codDependencia;
    private String codDependenciaFormatado;

	public ListarPedidoBalancetesSaidaDTO() {
	
	}

	public ListarPedidoBalancetesSaidaDTO(Long codSolicitacaoBalancete, String codTipoBalancete, Integer dtInicioPesquisa, Integer dtFimPesquisa, String periodoInicial, String periodoFinal, String descUf, String descEmpresa, String descMunicipio, String codSituacaoPedido, String descSituacaoPedido, String hrInclusaoPedido, String dataSolicitacao, Integer codDependencia, String codDependenciaFormatado) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
		this.codTipoBalancete = codTipoBalancete;
		this.dtInicioPesquisa = dtInicioPesquisa;
		this.dtFimPesquisa = dtFimPesquisa;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
		this.descUf = descUf;
		this.descEmpresa = descEmpresa;
		this.descMunicipio = descMunicipio;
		this.codSituacaoPedido = codSituacaoPedido;
		this.descSituacaoPedido = descSituacaoPedido;
		this.hrInclusaoPedido = hrInclusaoPedido;
		this.dataSolicitacao = dataSolicitacao;
		this.codDependencia = codDependencia;
		this.codDependenciaFormatado = codDependenciaFormatado;
	}

	public Long getCodSolicitacaoBalancete() {
		return codSolicitacaoBalancete;
	}

	public void setCodSolicitacaoBalancete(Long codSolicitacaoBalancete) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
	}

	public String getCodTipoBalancete() {
		return codTipoBalancete;
	}

	public void setCodTipoBalancete(String codTipoBalancete) {
		this.codTipoBalancete = codTipoBalancete;
	}

	public Integer getDtInicioPesquisa() {
		return dtInicioPesquisa;
	}

	public void setDtInicioPesquisa(Integer dtInicioPesquisa) {
		this.dtInicioPesquisa = dtInicioPesquisa;
	}

	public Integer getDtFimPesquisa() {
		return dtFimPesquisa;
	}

	public void setDtFimPesquisa(Integer dtFimPesquisa) {
		this.dtFimPesquisa = dtFimPesquisa;
	}

	public String getDescUf() {
		return descUf;
	}

	public void setDescUf(String descUf) {
		this.descUf = descUf;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public String getCodSituacaoPedido() {
		return codSituacaoPedido;
	}

	public void setCodSituacaoPedido(String codSituacaoPedido) {
		this.codSituacaoPedido = codSituacaoPedido;
	}

	public String getHrInclusaoPedido() {
		return hrInclusaoPedido;
	}

	public void setHrInclusaoPedido(String hrInclusaoPedido) {
		this.hrInclusaoPedido = hrInclusaoPedido;
	}

	public String getDescSituacaoPedido() {
		return descSituacaoPedido;
	}

	public void setDescSituacaoPedido(String descSituacaoPedido) {
		this.descSituacaoPedido = descSituacaoPedido;
	}

	public String getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getDescEmpresa() {
		return descEmpresa;
	}

	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	public Integer getCodDependencia() {
		return codDependencia;
	}

	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}

	public String getPeriodoInicial() {
		return periodoInicial;
	}

	public void setPeriodoInicial(String periodoInicial) {
		this.periodoInicial = periodoInicial;
	}

	public String getPeriodoFinal() {
		return periodoFinal;
	}

	public void setPeriodoFinal(String periodoFinal) {
		this.periodoFinal = periodoFinal;
	}

	public String getCodDependenciaFormatado() {
		return codDependenciaFormatado;
	}

	public void setCodDependenciaFormatado(String codDependenciaFormatado) {
		this.codDependenciaFormatado = codDependenciaFormatado;
	}
}