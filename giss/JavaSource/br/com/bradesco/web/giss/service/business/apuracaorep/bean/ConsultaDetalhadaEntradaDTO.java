package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

public class ConsultaDetalhadaEntradaDTO {

    private Integer maxOcorrencia;
    private Long codPessoa;
	private Integer numSolicitacao;
	private Integer dataApuracao;
	private Long codMunicipio;
	
	
	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
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
	public Integer getNumSolicitacao() {
		return numSolicitacao;
	}
	public void setNumSolicitacao(Integer numSolicitacao) {
		this.numSolicitacao = numSolicitacao;
	}
	
	
	

}

