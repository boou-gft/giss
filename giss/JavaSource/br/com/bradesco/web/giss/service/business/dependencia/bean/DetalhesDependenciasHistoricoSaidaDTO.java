package br.com.bradesco.web.giss.service.business.dependencia.bean;

import java.util.ArrayList;
import java.util.List;

public class DetalhesDependenciasHistoricoSaidaDTO {
	
	private String codMensagem;
	private String mensagem;
	private String dataAbertura;
	private String dataEncerramento;
    private Integer codigoAgenciaIncorporadora;
	private String nomeAgenciaIncorporadora;
	private String enderecoAgenciaIncorporadora;
	private Integer numeroAgenciaIncorporadora;
	private Integer cepAgenciaIncorporadora;
    private String siglaUFAgenciaIncorporadora;
    private String paisAgenciaIncorporadora;
    private Long codigoCadastroContribuinteMobiliario;
    private Integer codigoDepartamentoAgenciaIncorporadora;
    private Integer codigoDepartamentoAgenciaIncorporadoraAnt;
    private String descricaoDepartamentoAgenciaIncorporadora;
    private String descricaoDepartamentoAgenciaIncorporadoraAnt;
    private String inscricaoMunicipal;
    private String inscricaoMunicipalAnt;
    private Integer indicadorTributavel;
    private String tipoDepartamento;
    private String tipoDepartamentoAnt;
    private String cnpj;
    private String estadoIncorporaDepartamento;
    private String codigoMunicipioIncorporaDepartamento;
    private String descricaoMunicipioIncorporaDepartamento;
    
    private List<DependenciaDTO> listaPaa = new ArrayList<DependenciaDTO>();

    public DetalhesDependenciasHistoricoSaidaDTO() {
		super();
	}

	public DetalhesDependenciasHistoricoSaidaDTO(String dataAbertura, String dataEncerramento, Integer codigoAgenciaIncorporadora, String nomeAgenciaIncorporadora, String enderecoAgenciaIncorporadora, Integer numeroAgenciaIncorporadora, Integer cepAgenciaIncorporadora, String siglaUFAgenciaIncorporadora, String paisAgenciaIncorporadora, Long codigoCadastroContribuinteMobiliario, Integer codigoDepartamentoAgenciaIncorporadora, Integer codigoDepartamentoAgenciaIncorporadoraAnt, String descricaoDepartamentoAgenciaIncorporadora, String descricaoDepartamentoAgenciaIncorporadoraAnt, String inscricaoMunicipal, String inscricaoMunicipalAnt, Integer indicadorTributavel, String tipoDepartamento, String tipoDepartamentoAnt, String cnpj, String estadoIncorporaDepartamento, String codigoMunicipioIncorporaDepartamento, String descricaoMunicipioIncorporaDepartamento) {
		super();
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.codigoAgenciaIncorporadora = codigoAgenciaIncorporadora;
		this.nomeAgenciaIncorporadora = nomeAgenciaIncorporadora;
		this.enderecoAgenciaIncorporadora = enderecoAgenciaIncorporadora;
		this.numeroAgenciaIncorporadora = numeroAgenciaIncorporadora;
		this.cepAgenciaIncorporadora = cepAgenciaIncorporadora;
		this.siglaUFAgenciaIncorporadora = siglaUFAgenciaIncorporadora;
		this.paisAgenciaIncorporadora = paisAgenciaIncorporadora;
		this.codigoCadastroContribuinteMobiliario = codigoCadastroContribuinteMobiliario;
		this.codigoDepartamentoAgenciaIncorporadora = codigoDepartamentoAgenciaIncorporadora;
		this.codigoDepartamentoAgenciaIncorporadoraAnt = codigoDepartamentoAgenciaIncorporadoraAnt;
		this.descricaoDepartamentoAgenciaIncorporadora = descricaoDepartamentoAgenciaIncorporadora;
		this.descricaoDepartamentoAgenciaIncorporadoraAnt = descricaoDepartamentoAgenciaIncorporadoraAnt;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoMunicipalAnt = inscricaoMunicipalAnt;
		this.indicadorTributavel = indicadorTributavel;
		this.tipoDepartamento = tipoDepartamento;
		this.tipoDepartamentoAnt = tipoDepartamentoAnt;
		this.cnpj = cnpj;
		this.estadoIncorporaDepartamento = estadoIncorporaDepartamento;
	    this.codigoMunicipioIncorporaDepartamento = codigoMunicipioIncorporaDepartamento;
	    this.descricaoMunicipioIncorporaDepartamento = descricaoMunicipioIncorporaDepartamento;
	}

	public Integer getCepAgenciaIncorporadora() {
		return cepAgenciaIncorporadora;
	}

	public void setCepAgenciaIncorporadora(Integer cepAgenciaIncorporadora) {
		this.cepAgenciaIncorporadora = cepAgenciaIncorporadora;
	}

	public Integer getCodigoAgenciaIncorporadora() {
		return codigoAgenciaIncorporadora;
	}

	public void setCodigoAgenciaIncorporadora(Integer codigoAgenciaIncorporadora) {
		this.codigoAgenciaIncorporadora = codigoAgenciaIncorporadora;
	}

	public Long getCodigoCadastroContribuinteMobiliario() {
		return codigoCadastroContribuinteMobiliario;
	}

	public void setCodigoCadastroContribuinteMobiliario(
			Long codigoCadastroContribuinteMobiliario) {
		this.codigoCadastroContribuinteMobiliario = codigoCadastroContribuinteMobiliario;
	}

	public Integer getCodigoDepartamentoAgenciaIncorporadora() {
		return codigoDepartamentoAgenciaIncorporadora;
	}

	public void setCodigoDepartamentoAgenciaIncorporadora(
			Integer codigoDepartamentoAgenciaIncorporadora) {
		this.codigoDepartamentoAgenciaIncorporadora = codigoDepartamentoAgenciaIncorporadora;
	}

	public String getCodMensagem() {
		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getDescricaoDepartamentoAgenciaIncorporadora() {
		return descricaoDepartamentoAgenciaIncorporadora;
	}

	public void setDescricaoDepartamentoAgenciaIncorporadora(
			String descricaoDepartamentoAgenciaIncorporadora) {
		this.descricaoDepartamentoAgenciaIncorporadora = descricaoDepartamentoAgenciaIncorporadora;
	}

	public String getEnderecoAgenciaIncorporadora() {
		return enderecoAgenciaIncorporadora;
	}

	public void setEnderecoAgenciaIncorporadora(String enderecoAgenciaIncorporadora) {
		this.enderecoAgenciaIncorporadora = enderecoAgenciaIncorporadora;
	}

	public Integer getIndicadorTributavel() {
		return indicadorTributavel;
	}

	public void setIndicadorTributavel(Integer indicadorTributavel) {
		this.indicadorTributavel = indicadorTributavel;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeAgenciaIncorporadora() {
		return nomeAgenciaIncorporadora;
	}

	public void setNomeAgenciaIncorporadora(String nomeAgenciaIncorporadora) {
		this.nomeAgenciaIncorporadora = nomeAgenciaIncorporadora;
	}

	public Integer getNumeroAgenciaIncorporadora() {
		return numeroAgenciaIncorporadora;
	}

	public void setNumeroAgenciaIncorporadora(Integer numeroAgenciaIncorporadora) {
		this.numeroAgenciaIncorporadora = numeroAgenciaIncorporadora;
	}

	public String getPaisAgenciaIncorporadora() {
		return paisAgenciaIncorporadora;
	}

	public void setPaisAgenciaIncorporadora(String paisAgenciaIncorporadora) {
		this.paisAgenciaIncorporadora = paisAgenciaIncorporadora;
	}

	public String getSiglaUFAgenciaIncorporadora() {
		return siglaUFAgenciaIncorporadora;
	}

	public void setSiglaUFAgenciaIncorporadora(String siglaUFAgenciaIncorporadora) {
		this.siglaUFAgenciaIncorporadora = siglaUFAgenciaIncorporadora;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigoMunicipioIncorporaDepartamento() {
		return codigoMunicipioIncorporaDepartamento;
	}

	public void setCodigoMunicipioIncorporaDepartamento(
			String codigoMunicipioIncorporaDepartamento) {
		this.codigoMunicipioIncorporaDepartamento = codigoMunicipioIncorporaDepartamento;
	}

	public String getDescricaoMunicipioIncorporaDepartamento() {
		return descricaoMunicipioIncorporaDepartamento;
	}

	public void setDescricaoMunicipioIncorporaDepartamento(
			String descricaoMunicipioIncorporaDepartamento) {
		this.descricaoMunicipioIncorporaDepartamento = descricaoMunicipioIncorporaDepartamento;
	}

	public String getEstadoIncorporaDepartamento() {
		return estadoIncorporaDepartamento;
	}

	public void setEstadoIncorporaDepartamento(String estadoIncorporaDepartamento) {
		this.estadoIncorporaDepartamento = estadoIncorporaDepartamento;
	}

	/**
	 * @return the codigoDepartamentoAgenciaIncorporadoraAnt
	 */
	public Integer getCodigoDepartamentoAgenciaIncorporadoraAnt() {
		return codigoDepartamentoAgenciaIncorporadoraAnt;
	}

	/**
	 * @param codigoDepartamentoAgenciaIncorporadoraAnt the codigoDepartamentoAgenciaIncorporadoraAnt to set
	 */
	public void setCodigoDepartamentoAgenciaIncorporadoraAnt(Integer codigoDepartamentoAgenciaIncorporadoraAnt) {
		this.codigoDepartamentoAgenciaIncorporadoraAnt = codigoDepartamentoAgenciaIncorporadoraAnt;
	}

	/**
	 * @return the descricaoDepartamentoAgenciaIncorporadoraAnt
	 */
	public String getDescricaoDepartamentoAgenciaIncorporadoraAnt() {
		return descricaoDepartamentoAgenciaIncorporadoraAnt;
	}

	/**
	 * @param descricaoDepartamentoAgenciaIncorporadoraAnt the descricaoDepartamentoAgenciaIncorporadoraAnt to set
	 */
	public void setDescricaoDepartamentoAgenciaIncorporadoraAnt(String descricaoDepartamentoAgenciaIncorporadoraAnt) {
		this.descricaoDepartamentoAgenciaIncorporadoraAnt = descricaoDepartamentoAgenciaIncorporadoraAnt;
	}

	/**
	 * @return the inscricaoMunicipalAnt
	 */
	public String getInscricaoMunicipalAnt() {
		return inscricaoMunicipalAnt;
	}

	/**
	 * @param inscricaoMunicipalAnt the inscricaoMunicipalAnt to set
	 */
	public void setInscricaoMunicipalAnt(String inscricaoMunicipalAnt) {
		this.inscricaoMunicipalAnt = inscricaoMunicipalAnt;
	}

	/**
	 * @return the tipoDepartamentoAnt
	 */
	public String getTipoDepartamentoAnt() {
		return tipoDepartamentoAnt;
	}

	/**
	 * @param tipoDepartamentoAnt the tipoDepartamentoAnt to set
	 */
	public void setTipoDepartamentoAnt(String tipoDepartamentoAnt) {
		this.tipoDepartamentoAnt = tipoDepartamentoAnt;
	}

	/**
	 * @return the listaPaa
	 */
	public List<DependenciaDTO> getListaPaa() {
		return listaPaa;
	}

	/**
	 * @param listaPaa the listaPaa to set
	 */
	public void setListaPaa(List<DependenciaDTO> listaPaa) {
		this.listaPaa = listaPaa;
	}
	
}
