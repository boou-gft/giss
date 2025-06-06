package br.com.bradesco.web.giss.service.business.dependencia.bean;

import java.util.ArrayList;

public class DependenciasMunicipioDTO {
	
	private String codigoPessoaJuridica;
	private String codigoDependencia;
	private String numeroSequencialDependencia;
	private String descricaoDependencia;
	private String dataAtualizacao;
	private String dataExclusao;
	private int linha;
	private ArrayList<DependenciasMunicipioDTO> depMunicipio = new ArrayList<DependenciasMunicipioDTO>();
	private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	private String tragSemTrag;
			
	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}
	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}
	public String getCodigoDependencia() {
		return codigoDependencia;
	}
	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getNumeroSequencialDependencia() {
		return numeroSequencialDependencia;
	}
	public void setNumeroSequencialDependencia(String numeroSequencialDependencia) {
		this.numeroSequencialDependencia = numeroSequencialDependencia;
	}
	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}
	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	public ArrayList<DependenciasMunicipioDTO> getDepMunicipio() {
		return depMunicipio;
	}
	public void setDepMunicipio(ArrayList<DependenciasMunicipioDTO> depMunicipio) {
		this.depMunicipio = depMunicipio;
	}
	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getDescMunicipio() {
		return descMunicipio;
	}
	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}
	public String getCodUF() {
		return codUF;
	}
	public void setCodUF(String codUF) {
		this.codUF = codUF;
	}
	public String getDescUF() {
		return descUF;
	}
	public void setDescUF(String descUF) {
		this.descUF = descUF;
	}
	public String getTragSemTrag() {
		return tragSemTrag;
	}
	public void setTragSemTrag(String tragSemTrag) {
		this.tragSemTrag = tragSemTrag;
	}
}
