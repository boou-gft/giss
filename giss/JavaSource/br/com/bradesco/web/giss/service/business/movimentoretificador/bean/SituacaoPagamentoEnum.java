/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.bean
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 30/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.bean;


/**
 * @nome: SituacaoPagamentoEnum.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public enum SituacaoPagamentoEnum {

	SEM_STATUS(1, ""),
	PENDENTE_LIBERACAO(2, "Pendente de Liberação"),
	LIBERACAO_TOTAL(3, "Liberado Total"),
	LIBERACAO_PARCIAL(4, "Liberado Parcial");
	
	private Integer codigo;
	private String descricao;
	
	/**
	 * Construtor.
	 */
	private SituacaoPagamentoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * @nome: getByCodigo
	 * @propósito: Método responsável por getByCodigo.
	 *
	 * @param codigo String
	 * @return SituacaoPagamentoEnum
	 */
	public static SituacaoPagamentoEnum getByCodigo(Integer codigo) {
		SituacaoPagamentoEnum retorno = SituacaoPagamentoEnum.SEM_STATUS;
		for (SituacaoPagamentoEnum item : SituacaoPagamentoEnum.values()) {
			if (item.codigo == codigo) {
				retorno = item;
				break;
			}
		}
		return retorno;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
}
