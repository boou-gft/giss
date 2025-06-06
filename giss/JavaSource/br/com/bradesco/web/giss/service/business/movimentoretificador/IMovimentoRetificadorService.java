/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador
 *
 * Compilador: JDK 1.6
 *
 * @prop�sito: .
 *
 * Data da Cria��o: 26/03/2021
 *
 * Par�metros de Compila��o:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador;

import java.util.List;

import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;

/**
 * @nome: IMovimentoRetificadorService.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface IMovimentoRetificadorService {

	/**
	 * @nome: listarProcessarContabilidade
	 * @prop�sito: M�todo respons�vel por listarProcessarContabilidade.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarProcessarContabilidade(MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: processarContabilidade
	 * @prop�sito: M�todo respons�vel por processarContabilidade.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String processarContabilidade(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarLiberarPagamento
	 * @prop�sito: M�todo respons�vel por listarLiberarPagamento.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarLiberarPagamento(MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: liberarPagamentoIss
	 * @prop�sito: M�todo respons�vel por liberarPagamentoIss.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String liberarPagamentoIss(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarDiferencasContabeis
	 * @prop�sito: M�todo respons�vel por listarDiferencasContabeis.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarDiferencasContabeis(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarReprocessarApuracao
	 * @prop�sito: M�todo respons�vel por listarReprocessarApuracao.
	 *
	 * @param filtro
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarReprocessarApuracao(
			MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: reprocessarApuracao
	 * @prop�sito: M�todo respons�vel por reprocessarApuracao.
	 *
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String reprocessarApuracao(MovimentoRetificadorDTO movimentoRetificadorDTO);
}
