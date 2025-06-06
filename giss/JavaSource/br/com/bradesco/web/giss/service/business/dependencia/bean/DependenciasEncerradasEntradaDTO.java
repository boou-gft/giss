package br.com.bradesco.web.giss.service.business.dependencia.bean;

public class DependenciasEncerradasEntradaDTO {
	
	private Integer quantidadeOcorrencias;
	private Integer mes;
	private Integer ano;
	
    public DependenciasEncerradasEntradaDTO() {
		super();
	}

	public DependenciasEncerradasEntradaDTO(Integer mes, Integer ano) {
		super();
		this.mes = mes;
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}

	public void setQuantidadeOcorrencias(Integer quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}
    
	
	
}
