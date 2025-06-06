package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean;

public class ResultadoAliquotaZeradaEntradaDTO {

	
	
    private Integer maxOcorrencia;
    private Long codPessoa;
    private Integer numSequencial;
    private Integer dataApuracao;
    private Integer dataApuracaoFinal;
    private Long codigoMunicipio;
	private Integer dataSelecionada;
    
    public ResultadoAliquotaZeradaEntradaDTO() {
		// TODO Auto-generated constructor stub
	}
    
    public ResultadoAliquotaZeradaEntradaDTO(Integer maxOcorrencia, Long codPessoa, Integer numSequencial, Integer dataApuracao, Long codigoMunicipio, Integer dataApuracaoFinal, Integer dataSelecionada) {
		super();
		this.maxOcorrencia = maxOcorrencia;
		this.codPessoa = codPessoa;
		this.numSequencial = numSequencial;
		this.dataApuracao = dataApuracao;
		this.codigoMunicipio = codigoMunicipio;
		this.dataApuracaoFinal = dataApuracaoFinal;
		this.dataSelecionada = dataSelecionada;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public Long getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
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
	public Integer getNumSequencial() {
		return numSequencial;
	}
	public void setNumSequencial(Integer numSequencial) {
		this.numSequencial = numSequencial;
	}

	public Integer getDataApuracaoFinal() {
		return dataApuracaoFinal;
	}

	public void setDataApuracaoFinal(Integer dataApuracaoFinal) {
		this.dataApuracaoFinal = dataApuracaoFinal;
	}

	public Integer getDataSelecionada() {
		return dataSelecionada;
	}

	public void setDataSelecionada(Integer dataSelecionada) {
		this.dataSelecionada = dataSelecionada;
	}
    
    
    
}
