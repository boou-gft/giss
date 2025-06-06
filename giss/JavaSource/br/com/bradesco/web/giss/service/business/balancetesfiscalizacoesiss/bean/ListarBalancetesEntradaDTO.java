package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;


public class ListarBalancetesEntradaDTO {
	
	private Integer qtdeMaxOcorrencias;
    private Long codSolicitacaoBalancete;
    private Long codMunicipio;
    private Integer dtMesAno;
    private Integer codDependencia;
    
	public ListarBalancetesEntradaDTO() {
	
	}

	public ListarBalancetesEntradaDTO(Integer qtdeMaxOcorrencias, Long codSolicitacaoBalancete, Long codMunicipio, Integer dtMesAno, Integer codDependencia) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
		this.codMunicipio = codMunicipio;
		this.dtMesAno = dtMesAno;
		this.codDependencia = codDependencia;
	}

	public Integer getQtdeMaxOcorrencias() {
		return qtdeMaxOcorrencias;
	}

	public void setQtdeMaxOcorrencias(Integer qtdeMaxOcorrencias) {
		this.qtdeMaxOcorrencias = qtdeMaxOcorrencias;
	}

	public Long getCodSolicitacaoBalancete() {
		return codSolicitacaoBalancete;
	}

	public void setCodSolicitacaoBalancete(Long codSolicitacaoBalancete) {
		this.codSolicitacaoBalancete = codSolicitacaoBalancete;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Integer getDtMesAno() {
		return dtMesAno;
	}

	public void setDtMesAno(Integer dtMesAno) {
		this.dtMesAno = dtMesAno;
	}

	public Integer getCodDependencia() {
		return codDependencia;
	}

	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}
}