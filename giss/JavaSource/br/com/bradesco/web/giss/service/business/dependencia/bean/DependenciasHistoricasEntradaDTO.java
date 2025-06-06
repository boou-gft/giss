package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class DependenciasHistoricasEntradaDTO {
	
	private Integer quantidadeOcorrencias;
    private Long codigoMunicipio;
	
    public DependenciasHistoricasEntradaDTO() {
		super();
	}
    
	public DependenciasHistoricasEntradaDTO(Integer quantidadeOcorrencias, Long codigoMunicipio) {
		super();
		this.quantidadeOcorrencias = quantidadeOcorrencias;
		this.codigoMunicipio = codigoMunicipio;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}

	public void setQuantidadeOcorrencias(Integer quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}
	
	
}
