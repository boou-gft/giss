package br.com.bradesco.web.giss.service.business.consultalogarquivos.bean;

public class TransmissaoArquivoLogDTO {
	
	String tipoManutencao;
	Long numControleRemessaDep;
	Long codMunicipio;
	Long codEmpresa;
	Integer codDependencia;
	Integer codTipoArquivo;
	String nomeArquivo;
	Integer codSituacaoTransArquivo;
	String mensagemRetorno;
	public String getTipoManutencao() {
		return tipoManutencao;
	}
	public void setTipoManutencao(String tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}
	public Long getNumControleRemessaDep() {
		return numControleRemessaDep;
	}
	public void setNumControleRemessaDep(Long numControleRemessaDep) {
		this.numControleRemessaDep = numControleRemessaDep;
	}
	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public Long getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public Integer getCodDependencia() {
		return codDependencia;
	}
	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}
	public Integer getCodTipoArquivo() {
		return codTipoArquivo;
	}
	public void setCodTipoArquivo(Integer codTipoArquivo) {
		this.codTipoArquivo = codTipoArquivo;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public Integer getCodSituacaoTransArquivo() {
		return codSituacaoTransArquivo;
	}
	public void setCodSituacaoTransArquivo(Integer codSituacaoTransArquivo) {
		this.codSituacaoTransArquivo = codSituacaoTransArquivo;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
