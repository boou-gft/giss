package br.com.bradesco.web.giss.service.business.dependencia.bean;

import java.util.ArrayList;
import java.util.List;

public class DependenciasHistoricasSaidaDTO {
	private String codMensagem;
    private String mensagem;
    private Integer quantidadeOcorrencias;
    private Integer codigoUnidadeOrganizacional;
    private String descricaoUnidadeOrganizacional;
    private String dataAtualizacao;
    private String dataExclusao;
    private Long codigoPessoaJuridica;
    private Integer numSequencialUnidadeOrganizacional;
    private String timestamp;
    private List<DependenciasHistoricasSaidaDTO> depHistorico = new ArrayList<DependenciasHistoricasSaidaDTO>();
    private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	private String horaAtualizacao;
	private String codigoFuncional;
	private String tragSemTrag;
	
	public DependenciasHistoricasSaidaDTO() {
		super();
	}

	public DependenciasHistoricasSaidaDTO(Integer codigoUnidadeOrganizacional, String descricaoUnidadeOrganizacional, String dataAtualizacao, String dataExclusao, Long codigoPessoaJuridica, Integer numSequencialUnidadeOrganizacional, String timestamp,String horaAtualizacao, String codigoFuncional, String tragSemTrag) {
		super();
		this.codigoUnidadeOrganizacional = codigoUnidadeOrganizacional;
		this.descricaoUnidadeOrganizacional = descricaoUnidadeOrganizacional;
		this.dataAtualizacao = dataAtualizacao;
		this.dataExclusao = dataExclusao;
		this.codigoPessoaJuridica = codigoPessoaJuridica;
		this.numSequencialUnidadeOrganizacional = numSequencialUnidadeOrganizacional;
		this.timestamp = timestamp;
		this.horaAtualizacao= horaAtualizacao;
		this.codigoFuncional = codigoFuncional;
		this.tragSemTrag = tragSemTrag;
	}



	public Integer getCodigoUnidadeOrganizacional() {
		return codigoUnidadeOrganizacional;
	}

	public void setCodigoUnidadeOrganizacional(Integer codigoUnidadeOrganizacional) {
		this.codigoUnidadeOrganizacional = codigoUnidadeOrganizacional;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
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

	public String getDescricaoUnidadeOrganizacional() {
		return descricaoUnidadeOrganizacional;
	}

	public void setDescricaoUnidadeOrganizacional(
			String descricaoUnidadeOrganizacional) {
		this.descricaoUnidadeOrganizacional = descricaoUnidadeOrganizacional;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Integer getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}

	public void setQuantidadeOcorrencias(Integer quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Integer getNumSequencialUnidadeOrganizacional() {
		return numSequencialUnidadeOrganizacional;
	}

	public void setNumSequencialUnidadeOrganizacional(
			Integer numSequencialUnidadeOrganizacional) {
		this.numSequencialUnidadeOrganizacional = numSequencialUnidadeOrganizacional;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<DependenciasHistoricasSaidaDTO> getDepHistorico() {
		return depHistorico;
	}

	public void setDepHistorico(List<DependenciasHistoricasSaidaDTO> depHistorico) {
		this.depHistorico = depHistorico;
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

	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}

	public void setHoraAtualizacao(String horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}
	
	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	
	public String getTragSemTrag() {
		return tragSemTrag;
	}

	public void setTragSemTrag(String tragSemTrag) {
		this.tragSemTrag = tragSemTrag;
	}
    
}
