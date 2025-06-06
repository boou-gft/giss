package br.com.bradesco.web.giss.service.business.dependencia.bean;

import java.util.List;


public class MunicipioDTO {
	
	private String nome;
	private String codigo;
	private String sigla;
	private String dataAtualizacao;
	private String horaAtualizacao;
	private String dataExclusao;
	private Integer tipoPesquisa;
	private int linha;
	private List<LegislacaoDTO> lstLegislacao;
	private List<MunicipioDTO> lstMunicipios;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}
	public void setHoraAtualizacao(String horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}
	public List<LegislacaoDTO> getLstLegislacao() {
		return lstLegislacao;
	}
	public void setLstLegislacao(List<LegislacaoDTO> lstLegislacao) {
		this.lstLegislacao = lstLegislacao;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof MunicipioDTO)) {
			return false;
		}

		MunicipioDTO other = (MunicipioDTO) obj;
		return this.getCodigo().equals(other.getCodigo());
	}

	@Override
	public int hashCode() {
		int hashCode = 7;
		hashCode = hashCode + getCodigo().hashCode();
		return hashCode;
	}
	public List<MunicipioDTO> getLstMunicipios() {
		return lstMunicipios;
	}
	public void setLstMunicipios(List<MunicipioDTO> lstMunicipios) {
		this.lstMunicipios = lstMunicipios;
	}
	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}
	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

}
