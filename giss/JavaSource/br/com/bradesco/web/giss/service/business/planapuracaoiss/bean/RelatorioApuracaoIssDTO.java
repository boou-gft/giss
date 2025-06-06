package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.utils.GissUtil;

public class RelatorioApuracaoIssDTO {

	private String codAgenciaDev;

	private String descAgenciaDev;

	private Long cnpj;

	private String inscricaoMunicipal;

	private String endereco;

	private Integer cep;

	private Integer complementoCep;

	private Integer codAgenciaCentralizadora;

	private String digitoAgenciaCentralizadora;

	private String descAgenciaCentralizadora;

	private Long codigoMunicipio;

	private String digitoMunicipio;

	private String siglaEstado;

	private String mesCompetencia;

	private Integer anoCompetencia;

	private Integer diaVencimento;

	private BigDecimal valorRedutor;

	private BigDecimal valorTotalReceita;

	private BigDecimal valorTotalIss;
	
	private String razao;

	private List<OcorrenciaApuracaoIssDTO> apuracoes = new ArrayList<OcorrenciaApuracaoIssDTO>();

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getComplementoCep() {
		return complementoCep;
	}

	public void setComplementoCep(Integer complementoCep) {
		this.complementoCep = complementoCep;
	}

	public Integer getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public Integer getAnoCompetencia() {
		return anoCompetencia;
	}

	public void setAnoCompetencia(Integer anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	public Integer getCodAgenciaCentralizadora() {
		return codAgenciaCentralizadora;
	}

	public void setCodAgenciaCentralizadora(Integer codAgenciaCentralizadora) {
		this.codAgenciaCentralizadora = codAgenciaCentralizadora;
	}

	public String getCodAgenciaDev() {
		return codAgenciaDev;
	}

	public void setCodAgenciaDev(String codAgenciaDev) {
		this.codAgenciaDev = codAgenciaDev;
	}

	public String getDescAgenciaCentralizadora() {
		return descAgenciaCentralizadora;
	}

	public void setDescAgenciaCentralizadora(String descAgenciaCentralizadora) {
		this.descAgenciaCentralizadora = descAgenciaCentralizadora;
	}

	public String getDescAgenciaDev() {
		return descAgenciaDev;
	}

	public void setDescAgenciaDev(String descAgenciaDev) {
		this.descAgenciaDev = descAgenciaDev;
	}

	public String getDigitoAgenciaCentralizadora() {
		return digitoAgenciaCentralizadora;
	}

	public void setDigitoAgenciaCentralizadora(String digitoAgenciaCentralizadora) {
		this.digitoAgenciaCentralizadora = digitoAgenciaCentralizadora;
	}

	public String getDigitoMunicipio() {
		return digitoMunicipio;
	}

	public void setDigitoMunicipio(String digitoMunicipio) {
		this.digitoMunicipio = digitoMunicipio;
	}

	public String getMesCompetencia() {
		return mesCompetencia;
	}

	public void setMesCompetencia(String mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	public BigDecimal getValorRedutor() {
		return valorRedutor;
	}

	public void setValorRedutor(BigDecimal valorRedutor) {
		this.valorRedutor = valorRedutor;
	}

	public BigDecimal getValorTotalIss() {
		return valorTotalIss;
	}

	public void setValorTotalIss(BigDecimal valorTotalIss) {
		this.valorTotalIss = valorTotalIss;
	}

	public BigDecimal getValorTotalReceita() {
		return valorTotalReceita;
	}

	public void setValorTotalReceita(BigDecimal valorTotalReceita) {
		this.valorTotalReceita = valorTotalReceita;
	}

	public List<OcorrenciaApuracaoIssDTO> getApuracoes() {
		return apuracoes;
	}

	public void setApuracoes(List<OcorrenciaApuracaoIssDTO> apuracoes) {
		this.apuracoes = apuracoes;
	}

	public boolean addApuracao(OcorrenciaApuracaoIssDTO o) {
		if (apuracoes == null) {
			apuracoes = new ArrayList<OcorrenciaApuracaoIssDTO>();
		}
		return apuracoes.add(o);
	}

	public String getCepFormatado() {
		return GissUtil.formatarCep(getCep(), getComplementoCep());
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
