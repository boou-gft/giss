package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import java.util.Date;

public class TarifasCobradasVO {
	
	private Date calendarioAte;
	private Date calendarioDe;
	private Integer codigoPa;
	private String nomePa;
	private String municipioPa;
	private String ufPa;
	private String juncao;
	private String nome;
	private String municipio;
	private String uf;
	private Integer codigoSelecionado;
	private Long codMunicipio;
	private Integer agencia;
	private Long codMunicipioPa;
	private String codigoMensagem;
	private String mensagem;
	private String codigoMunicipio;
	private String descricaoMunicipio;
	private Integer codigoSimNao;
	private Integer cdJuncao;
	private Integer cdUfJuncao;
	private Integer cdTipoPesquisa;
	private Long cdMunicipioJuncao;
	private String cdTipoRelatorio;
	
	
	
	/**
     * 
     * Nome: iniciar
     * 
     * Propósito: Iniciar dados da tela
     * 
     * @return : String de navegação
     *
     * @see : Referencias externas.
     *
     *      Registro de Manutenção: 13/03/2017 - Autor: BRQ - Responsavel: Equipe Web - Adequação ao padrão hexavision.
     */
    public void iniciar() {
    	calendarioAte = new Date();
    	calendarioDe = new Date();
    	codigoPa = 0;
    	nomePa = "";
    	municipioPa = "";
    	ufPa = "";
    	juncao = "";
    	nome = "";
    	municipio = "";
    	uf = "";
    	codigoSelecionado = 0;
    	codigoMensagem = "";
    	mensagem = "";
    	codigoMunicipio = "";
    	descricaoMunicipio = "";
    	codigoSimNao = 0;
    }
	
	public Date getCalendarioAte() {
		return calendarioAte;
	}
	public void setCalendarioAte(Date calendarioAte) {
		this.calendarioAte = calendarioAte;
	}
	public Date getCalendarioDe() {
		return calendarioDe;
	}
	public void setCalendarioDe(Date calendarioDe) {
		this.calendarioDe = calendarioDe;
	}
	public Integer getCodigoPa() {
		return codigoPa;
	}
	public void setCodigoPa(Integer codigoPa) {
		this.codigoPa = codigoPa;
	}
	public String getNomePa() {
		return nomePa;
	}
	public void setNomePa(String nomePa) {
		this.nomePa = nomePa;
	}
	public String getMunicipioPa() {
		return municipioPa;
	}
	public void setMunicipioPa(String municipioPa) {
		this.municipioPa = municipioPa;
	}
	public String getUfPa() {
		return ufPa;
	}
	public void setUfPa(String ufPa) {
		this.ufPa = ufPa;
	}
	public String getJuncao() {
		return juncao;
	}
	public void setJuncao(String juncao) {
		this.juncao = juncao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getCodigoSelecionado() {
		return codigoSelecionado;
	}
	public void setCodigoSelecionado(Integer codigoSelecionado) {
		this.codigoSelecionado = codigoSelecionado;
	}
	public String getCodigoMensagem() {
		return codigoMensagem;
	}
	public void setCodigoMensagem(String codigoMensagem) {
		this.codigoMensagem = codigoMensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDescricaoMunicipio() {
		return descricaoMunicipio;
	}

	public void setDescricaoMunicipio(String descricaoMunicipio) {
		this.descricaoMunicipio = descricaoMunicipio;
	}

	public Integer getCodigoSimNao() {
		return codigoSimNao;
	}

	public void setCodigoSimNao(Integer codigoSimNao) {
		this.codigoSimNao = codigoSimNao;
	}

	public Long getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Long getCodMunicipioPa() {
		return codMunicipioPa;
	}

	public void setCodMunicipioPa(Long codMunicipioPa) {
		this.codMunicipioPa = codMunicipioPa;
	}

	/**
	 * @return the cdJuncao
	 */
	public Integer getCdJuncao() {
		return cdJuncao;
	}

	/**
	 * @param cdJuncao the cdJuncao to set
	 */
	public void setCdJuncao(Integer cdJuncao) {
		this.cdJuncao = cdJuncao;
	}

	/**
	 * @return the cdUfJuncao
	 */
	public Integer getCdUfJuncao() {
		return cdUfJuncao;
	}

	/**
	 * @param cdUfJuncao the cdUfJuncao to set
	 */
	public void setCdUfJuncao(Integer cdUfJuncao) {
		this.cdUfJuncao = cdUfJuncao;
	}

	/**
	 * @return the cdTipoPesquisa
	 */
	public Integer getCdTipoPesquisa() {
		return cdTipoPesquisa;
	}

	/**
	 * @param cdTipoPesquisa the cdTipoPesquisa to set
	 */
	public void setCdTipoPesquisa(Integer cdTipoPesquisa) {
		this.cdTipoPesquisa = cdTipoPesquisa;
	}

	/**
	 * @return the cdMunicipioJuncao
	 */
	public Long getCdMunicipioJuncao() {
		return cdMunicipioJuncao;
	}

	/**
	 * @param cdMunicipioJuncao the cdMunicipioJuncao to set
	 */
	public void setCdMunicipioJuncao(Long cdMunicipioJuncao) {
		this.cdMunicipioJuncao = cdMunicipioJuncao;
	}
	

	public String getCdTipoRelatorio() {
		return cdTipoRelatorio;
	}

	public void setCdTipoRelatorio(String cdTipoRelatorio) {
		this.cdTipoRelatorio = cdTipoRelatorio;
	}
	
}
