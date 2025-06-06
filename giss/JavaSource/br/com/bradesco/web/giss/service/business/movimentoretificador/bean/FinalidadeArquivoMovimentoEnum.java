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
 * @nome: FinalidadeArquivoMovimentoEnum.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public enum FinalidadeArquivoMovimentoEnum {

	INICIAL(1, "Movimento Inicial"),
	RETIFICADOR(2, "Movimento Retificador"),
	COMPLEMENTAR(3, "Movimento Complementar"),
	REPROCESSADO(4, "Movimento Reprocessado");
	
	private Integer codigo;
	private String descricao;
	
	/**
	 * Construtor.
	 */
	private FinalidadeArquivoMovimentoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * @nome: getByCodigo
	 * @prop�sito: M�todo respons�vel por getByCodigo.
	 *
	 * @param codigo String
	 * @return FinalidadeArquivoMovimentoEnum
	 */
	public static FinalidadeArquivoMovimentoEnum getByCodigo(Integer codigo) {
		FinalidadeArquivoMovimentoEnum retorno = FinalidadeArquivoMovimentoEnum.INICIAL;
		for (FinalidadeArquivoMovimentoEnum item : FinalidadeArquivoMovimentoEnum.values()) {
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
