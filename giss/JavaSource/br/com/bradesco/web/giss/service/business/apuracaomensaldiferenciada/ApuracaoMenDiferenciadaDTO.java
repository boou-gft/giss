package br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ApuracaoMenDiferenciadaDTO {
	
	private int linha;
	private Integer dependencia;
	private String descricao;
	private BigDecimal receita;
	private BigDecimal issRecolher;
	private long codPessoaJuridica;
	private BigDecimal totalReceita;
	private BigDecimal totalISS;
	private int radioSelecionadoApuracao;
	private int numeroSeqUniOrg;
	private String valorReceTribSinal;
	private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	
	private ArrayList<ApuracaoMenDiferenciadaDTO> listaApurMenDif = new ArrayList<ApuracaoMenDiferenciadaDTO>();
	
	
	public long getCodPessoaJuridica() {
		return codPessoaJuridica;
	}
	public void setCodPessoaJuridica(long codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}
	public Integer getDependencia() {
		return dependencia;
	}
	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getIssRecolher() {
		return issRecolher;
	}
	public void setIssRecolher(BigDecimal issRecolher) {
		this.issRecolher = issRecolher;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getNumeroSeqUniOrg() {
		return numeroSeqUniOrg;
	}
	public void setNumeroSeqUniOrg(int numeroSeqUniOrg) {
		this.numeroSeqUniOrg = numeroSeqUniOrg;
	}
	public int getRadioSelecionadoApuracao() {
		return radioSelecionadoApuracao;
	}
	public void setRadioSelecionadoApuracao(int radioSelecionadoApuracao) {
		this.radioSelecionadoApuracao = radioSelecionadoApuracao;
	}
	public BigDecimal getReceita() {
		return receita;
	}
	public void setReceita(BigDecimal receita) {
		this.receita = receita;
	}
	public BigDecimal getTotalISS() {
		return totalISS;
	}
	public void setTotalISS(BigDecimal totalISS) {
		this.totalISS = totalISS;
	}
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}
	public String getValorReceTribSinal() {
		return valorReceTribSinal;
	}
	public void setValorReceTribSinal(String valorReceTribSinal) {
		this.valorReceTribSinal = valorReceTribSinal;
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
	public ArrayList<ApuracaoMenDiferenciadaDTO> getListaApurMenDif() {
		return listaApurMenDif;
	}
	public void setListaApurMenDif(ArrayList<ApuracaoMenDiferenciadaDTO> listaApurMenDif) {
		this.listaApurMenDif = listaApurMenDif;
	}

}
