/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.bean
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 25/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.bean;

/**
 * @nome: MovimentoRetificadorFiltroDTO.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class MovimentoRetificadorFiltroDTO {

	private String mesCompetencia;
	private String anoCompetencia;
	private String indicadorContabilizacao;
	private Integer codigoEmpresa;
	private Integer codigoProduto;
	
	
	/**
	 * Construtor.
	 */
	public MovimentoRetificadorFiltroDTO() {
		super();
		setIndicadorContabilizacao("M");
	}
	
	
	/**
	 * @return the mesCompetencia
	 */
	public String getMesCompetencia() {
		return mesCompetencia;
	}
	/**
	 * @param mesCompetencia the mesCompetencia to set
	 */
	public void setMesCompetencia(String mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}
	/**
	 * @return the anoCompetencia
	 */
	public String getAnoCompetencia() {
		return anoCompetencia;
	}
	/**
	 * @param anoCompetencia the anoCompetencia to set
	 */
	public void setAnoCompetencia(String anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	/**
	 * @return the indicadorContabilizacao
	 */
	public String getIndicadorContabilizacao() {
		return indicadorContabilizacao;
	}

	/**
	 * @param indicadorContabilizacao the indicadorContabilizacao to set
	 */
	public void setIndicadorContabilizacao(String indicadorContabilizacao) {
		this.indicadorContabilizacao = indicadorContabilizacao;
	}


	/**
	 * @return the codigoEmpresa
	 */
	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}


	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}


	/**
	 * @return the codigoProduto
	 */
	public Integer getCodigoProduto() {
		return codigoProduto;
	}


	/**
	 * @param codigoProduto the codigoProduto to set
	 */
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
}
