/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.bean
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 28/04/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.bean;

/**
 * @nome: SituacaoContabilEnum.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public enum SituacaoContabilEnum {

	NAO_PROCESSADO(0, "Não Processado"),
	PROCESSADO(2, "Processado"),
	PAGAMENTO_LIBERADO(3, "Pagamento Liberado"),
	PAGAMENTO_LIBERADO_PARCIAL(4, "Pagamento Liberado Parcial"),
	RETIFICADO(5, "Retificado");
	
	private Integer codigo;
	private String descricao;
	
	/**
	 * Construtor.
	 */
	private SituacaoContabilEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * @nome: getByCodigo
	 * @propósito: Método responsável por getByCodigo.
	 *
	 * @param codigo String
	 * @return SituacaoContabilEnum
	 */
	public static SituacaoContabilEnum getByCodigo(Integer codigo) {
		SituacaoContabilEnum retorno = SituacaoContabilEnum.NAO_PROCESSADO;
		for (SituacaoContabilEnum item : SituacaoContabilEnum.values()) {
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
