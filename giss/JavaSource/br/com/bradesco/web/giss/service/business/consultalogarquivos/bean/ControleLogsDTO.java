package br.com.bradesco.web.giss.service.business.consultalogarquivos.bean;

public class ControleLogsDTO {
	
	private int index = 0;
	private long remessa = 0L;
	private long codMunicipio = 0L;
	private String municipio = "";
	private long empresa = 0L;
	private int codDependencia = 0;
	private String descDependencia = "";
	private int codTipoArquivo = 0;
	private String descTipoArquivo = "";
	private String nomeArquivo = "";
	private int codSitTransmissao = 0;// código da situação da transmissão do arquivo
	private String descSitTransmissao = "";
	private String dataRemessa = "";
	private String horaRemessa = "";
	private String mensagemRetornoPref = "";// mensagem de retorno da prefeitura
	private String codUsuarioInclusao = "";

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public long getRemessa() {
		return remessa;
	}
	public void setRemessa(long remessa) {
		this.remessa = remessa;
	}
	public long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public long getEmpresa() {
		return empresa;
	}
	public void setEmpresa(long empresa) {
		this.empresa = empresa;
	}
	public int getCodDependencia() {
		return codDependencia;
	}
	public void setCodDependencia(int codDependencia) {
		this.codDependencia = codDependencia;
	}
	public String getDescDependencia() {
		return descDependencia;
	}
	public void setDescDependencia(String descDependencia) {
		this.descDependencia = descDependencia;
	}
	public int getCodTipoArquivo() {
		return codTipoArquivo;
	}
	public void setCodTipoArquivo(int codTipoArquivo) {
		this.codTipoArquivo = codTipoArquivo;
	}
	public String getDescTipoArquivo() {
		return descTipoArquivo;
	}
	public void setDescTipoArquivo(String descTipoArquivo) {
		this.descTipoArquivo = descTipoArquivo;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public int getCodSitTransmissao() {
		return codSitTransmissao;
	}
	public void setCodSitTransmissao(int codSitTransmissao) {
		this.codSitTransmissao = codSitTransmissao;
	}
	public String getDescSitTransmissao() {
		return descSitTransmissao;
	}
	public void setDescSitTransmissao(String descSitTransmissao) {
		this.descSitTransmissao = descSitTransmissao;
	}
	public String getDataRemessa() {
		return dataRemessa;
	}
	public void setDataRemessa(String dataRemessa) {
		this.dataRemessa = dataRemessa;
	}
	public String getHoraRemessa() {
		return horaRemessa;
	}
	public void setHoraRemessa(String horaRemessa) {
		this.horaRemessa = horaRemessa;
	}
	public String getMensagemRetornoPref() {
		return mensagemRetornoPref;
	}
	public void setMensagemRetornoPref(String mensagemRetorno) {
		this.mensagemRetornoPref = mensagemRetorno;
	}
	public String getCodUsuarioInclusao() {
		return codUsuarioInclusao;
	}
	public void setCodUsuarioInclusao(String codUsuarioInclusao) {
		this.codUsuarioInclusao = codUsuarioInclusao;
	}

}
