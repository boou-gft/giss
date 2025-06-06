package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ConsultaAliquotaZeradaSaidaDTO implements Comparable<ConsultaAliquotaZeradaSaidaDTO>{
	
	private String mensagem;
	private String codMensagem;
	private BigDecimal receitaTotalGeralValor;
	private Integer numConsultas;
	private Long codPessoa;
	private Integer numeroSequencial;
	private Integer dependencia;
	private String descricao;
	private BigDecimal receitaValor;
	private BigDecimal receitaTotalValor;
	private BigDecimal apuracaoTotalValor;
	private int linha;
	private Long codMunicipio;
	private String descMunicipio;
	private String codUF;
	private String descUF;
	private String dataApuracao;
	private Integer codPa;
	private String descPa;
	private String codDepPa;
	private String descDepPa;
	private Long qtdePa;
	private Long qtdeAgencia;
	
	private ArrayList<ConsultaAliquotaZeradaSaidaDTO> listaAliqZerada = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	
	
	
	public ConsultaAliquotaZeradaSaidaDTO() {
		// TODO Auto-generated constructor stub
	}



	public ConsultaAliquotaZeradaSaidaDTO(BigDecimal receitaTotalGeralValor, Integer numConsultas, Long codPessoa, Integer numeroSequencial, Integer dependencia, String descricao, BigDecimal receitaValor,BigDecimal receitaTotalValor,Integer codPa, String descPa, String codDepPa, String descDepPa, int linha) {
		super();
		this.receitaTotalGeralValor = receitaTotalGeralValor;
		this.numConsultas = numConsultas;
		this.codPessoa = codPessoa;
		this.numeroSequencial = numeroSequencial;
		this.dependencia = dependencia;
		this.descricao = descricao;
		this.receitaValor = receitaValor;
		this.receitaTotalValor = receitaTotalValor;
		this.codPa = codPa;
		this.descPa = descPa;
		this.codDepPa = codDepPa;
		this.descDepPa = descDepPa;
		this.linha = linha;
	}



	public String getCodMensagem() {
		return codMensagem;
	}



	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}



	public Long getCodPessoa() {
		return codPessoa;
	}



	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}




	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getLinha() {
		return linha;
	}



	public void setLinha(int linha) {
		this.linha = linha;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}



	public Integer getNumConsultas() {
		return numConsultas;
	}



	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}



	public Integer getNumeroSequencial() {
		return numeroSequencial;
	}



	public void setNumeroSequencial(Integer numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}




	public BigDecimal getReceitaValor() {
		return receitaValor;
	}



	public void setReceitaValor(BigDecimal receitaValor) {
		this.receitaValor = receitaValor;
	}



	public BigDecimal getReceitaTotalGeralValor() {
		return receitaTotalGeralValor;
	}



	public void setReceitaTotalGeralValor(BigDecimal receitaTotalGeralValor) {
		this.receitaTotalGeralValor = receitaTotalGeralValor;
	}



	public BigDecimal getReceitaTotalValor() {
		return receitaTotalValor;
	}



	public void setReceitaTotalValor(BigDecimal receitaTotalValor) {
		this.receitaTotalValor = receitaTotalValor;
	}



	public Integer getDependencia() {
		return dependencia;
	}



	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}



	public ArrayList<ConsultaAliquotaZeradaSaidaDTO> getListaAliqZerada() {
		return listaAliqZerada;
	}



	public void setListaAliqZerada(ArrayList<ConsultaAliquotaZeradaSaidaDTO> listaAliqZerada) {
		this.listaAliqZerada = listaAliqZerada;
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



	public String getDataApuracao() {
		return dataApuracao;
	}



	public void setDataApuracao(String dataApuracao) {
		this.dataApuracao = dataApuracao;
	}



	/**
	 * @return the codPa
	 */
	public Integer getCodPa() {
		return codPa;
	}



	/**
	 * @param codPa the codPa to set
	 */
	public void setCodPa(Integer codPa) {
		this.codPa = codPa;
	}



	/**
	 * @return the descPa
	 */
	public String getDescPa() {
		return descPa;
	}



	/**
	 * @param descPa the descPa to set
	 */
	public void setDescPa(String descPa) {
		this.descPa = descPa;
	}



	/**
	 * @return the codDepPa
	 */
	public String getCodDepPa() {
		return codDepPa;
	}



	/**
	 * @param codDepPa the codDepPa to set
	 */
	public void setCodDepPa(String codDepPa) {
		this.codDepPa = codDepPa;
	}



	/**
	 * @return the descDepPa
	 */
	public String getDescDepPa() {
		return descDepPa;
	}



	/**
	 * @param descDepPa the descDepPa to set
	 */
	public void setDescDepPa(String descDepPa) {
		this.descDepPa = descDepPa;
	}



	/**
	 * @return the apuracaoTotalValor
	 */
	public BigDecimal getApuracaoTotalValor() {
		return apuracaoTotalValor;
	}



	/**
	 * @param apuracaoTotalValor the apuracaoTotalValor to set
	 */
	public void setApuracaoTotalValor(BigDecimal apuracaoTotalValor) {
		this.apuracaoTotalValor = apuracaoTotalValor;
	}



	/**
	 * @return the qtdePa
	 */
	public Long getQtdePa() {
		return qtdePa;
	}



	/**
	 * @param qtdePa the qtdePa to set
	 */
	public void setQtdePa(Long qtdePa) {
		this.qtdePa = qtdePa;
	}



	/**
	 * @return the qtdeAgencia
	 */
	public Long getQtdeAgencia() {
		return qtdeAgencia;
	}



	/**
	 * @param qtdeAgencia the qtdeAgencia to set
	 */
	public void setQtdeAgencia(Long qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}
	
	public int compareTo(ConsultaAliquotaZeradaSaidaDTO m) {
		return this.getCodDepPa().compareTo(m.getCodDepPa());
	}
}