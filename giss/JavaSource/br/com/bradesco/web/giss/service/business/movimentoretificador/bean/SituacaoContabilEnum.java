/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.bean
 *
 * Compilador: JDK 1.6
 *
 * @prop�sito: .
 *
 * Data da Cria��o: 28/04/2021
 *
 * Par�metros de Compila��o:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.bean;

/**
 * @nome: SituacaoContabilEnum.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public enum SituacaoContabilEnum {

	NAO_PROCESSADO(0, "N�o Processado"),
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
	 * @prop�sito: M�todo respons�vel por getByCodigo.
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
