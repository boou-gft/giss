package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean;

public class ConsultarAliquotaZeradaEntradaDTO {
	
    private Integer maxOcorrencia;
    private Integer dataApuracao;
    private Long codigoMunicipio;
    private Integer codDependencia;
    private Long codPessoaJurid;
    private Integer dataApuracaoFinal;
	
    public ConsultarAliquotaZeradaEntradaDTO() {
    	super();
    }
    
    public ConsultarAliquotaZeradaEntradaDTO(Integer maxOcorrencia,  Integer dataApuracao, Long codigoMunicipio, Integer codDependencia, Long codPessoaJurid, Integer dataApuracaoFinal) {
		super();
		this.maxOcorrencia = maxOcorrencia;
		this.dataApuracao = dataApuracao;
		this.codigoMunicipio = codigoMunicipio;
		this.codDependencia = codDependencia;
		this.codPessoaJurid = codPessoaJurid;
		this.dataApuracaoFinal = dataApuracaoFinal;
	}
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public Integer getDataApuracao() {
		return dataApuracao;
	}
	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
	}
	public Integer getMaxOcorrencia() {
		return maxOcorrencia;
	}
	public void setMaxOcorrencia(Integer maxOcorrencia) {
		this.maxOcorrencia = maxOcorrencia;
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

	public Integer getDataApuracaoFinal() {
		return dataApuracaoFinal;
	}

	public void setDataApuracaoFinal(Integer dataApuracaoFinal) {
		this.dataApuracaoFinal = dataApuracaoFinal;
	}
	
}
