package br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean;

public class DependeciasEncerradasDTO {
	
	private String codigoPessoaJuridica;
	private String numeroSequencial;
	private String codigoDependencia;
	private String nomeDependencia;
	private String codigoMunicipio;
	private String Municipio;
	private String nomeMunicipio;
	private String siglaUnidadeFederativa;
	private String dataExclusao;
	private String dataBaixa;
	private String horaManutencao;
	private String codigoDependenciaIncorporadora;
	private String nomeDependenciaIncorporadora;
	private int linha;
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getCodigoDependencia() {
		return codigoDependencia;
	}
	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}
	public String getCodigoDependenciaIncorporadora() {
		return codigoDependenciaIncorporadora;
	}
	public void setCodigoDependenciaIncorporadora(
			String codigoDependenciaIncorporadora) {
		this.codigoDependenciaIncorporadora = codigoDependenciaIncorporadora;
	}
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	public String getHoraManutencao() {
		return horaManutencao;
	}
	public void setHoraManutencao(String horaManutencao) {
		this.horaManutencao = horaManutencao;
	}
	public String getNomeDependencia() {
		return nomeDependencia;
	}
	public void setNomeDependencia(String nomeDependencia) {
		this.nomeDependencia = nomeDependencia;
	}
	public String getNomeDependenciaIncorporadora() {
		return nomeDependenciaIncorporadora;
	}
	public void setNomeDependenciaIncorporadora(String nomeDependenciaIncorporadora) {
		this.nomeDependenciaIncorporadora = nomeDependenciaIncorporadora;
	}
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public String getNumeroSequencial() {
		return numeroSequencial;
	}
	public void setNumeroSequencial(String numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}
	public String getSiglaUnidadeFederativa() {
		return siglaUnidadeFederativa;
	}
	public void setSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	public String getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(String dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	
}
