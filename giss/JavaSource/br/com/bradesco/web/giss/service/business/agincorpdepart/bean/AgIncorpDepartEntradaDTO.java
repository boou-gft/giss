package br.com.bradesco.web.giss.service.business.agincorpdepart.bean;

public class AgIncorpDepartEntradaDTO {
	
	private Integer quantidadeOcorrencias;
    private Integer mesAnoCompetencia;
    private Integer codDependencia;
    private Long codPessoaJurid;
    
    
	public AgIncorpDepartEntradaDTO(Integer quantidadeOcorrencias, Integer mesAnoCompetencia, Integer codDependencia, Long codPessoaJurid) {
		super();
		this.quantidadeOcorrencias = quantidadeOcorrencias;
		this.mesAnoCompetencia = mesAnoCompetencia;
		this.codDependencia = codDependencia;
		this.codPessoaJurid = codPessoaJurid;
	}
	public AgIncorpDepartEntradaDTO() {
		super();
	}
	public Integer getMesAnoCompetencia() {
		return mesAnoCompetencia;
	}
	public void setMesAnoCompetencia(Integer mesAnoCompetencia) {
		this.mesAnoCompetencia = mesAnoCompetencia;
	}
	public Integer getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}
	public void setQuantidadeOcorrencias(Integer quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}
	public Integer getCodDependencia() {
		return codDependencia;
	}
	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}
	public Long getCodPessoaJurid() {
		return codPessoaJurid;
	}
	public void setCodPessoaJurid(Long codPessoaJurid) {
		this.codPessoaJurid = codPessoaJurid;
	}
	
	}
