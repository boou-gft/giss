package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ListarApuracaoReprocessamentoEntradaDTO {

	private Integer numeroSolicitacao;
	private Long contaContabil;
	private Long codigoPessoaJuridica;
	private Integer numeroSequenciaUnidadeOrganizacional;
	private Long codigoMunicipio;
	private Integer dataApuracao;
	private String razao;

	public ListarApuracaoReprocessamentoEntradaDTO() {
		super();
	}

	public ListarApuracaoReprocessamentoEntradaDTO(Integer numeroSolicitacao,
			Long contaContabil, Long codigoPessoaJuridica,
			Integer numeroSequenciaUnidadeOrganizacional, Long codigoMunicipio,
			Integer dataApuracao) {

		super();

		this.numeroSolicitacao = numeroSolicitacao;
		this.contaContabil = contaContabil;
		this.codigoPessoaJuridica = codigoPessoaJuridica;
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
		this.codigoMunicipio = codigoMunicipio;
		this.dataApuracao = dataApuracao;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Long getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(Long contaContabil) {
		this.contaContabil = contaContabil;
	}

	public Integer getDataApuracao() {
		return dataApuracao;
	}

	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
	}

	public Integer getNumeroSequenciaUnidadeOrganizacional() {
		return numeroSequenciaUnidadeOrganizacional;
	}

	public void setNumeroSequenciaUnidadeOrganizacional(
			Integer numeroSequenciaUnidadeOrganizacional) {
		this.numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
	}

	public Integer getNumeroSolicitacao() {
		return numeroSolicitacao;
	}

	public void setNumeroSolicitacao(Integer numeroSolicitacao) {
		this.numeroSolicitacao = numeroSolicitacao;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Integer getCodigoGrupo() {
		return GissUtil.pegarCodigoGrupo(razao);
	}

	public Integer getCodigoSubgrupo() {
		return GissUtil.pegarCodigoSubgrupo(razao);
	}

}
