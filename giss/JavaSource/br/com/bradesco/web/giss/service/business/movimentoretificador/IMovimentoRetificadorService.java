/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 26/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador;

import java.util.List;

import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;

/**
 * @nome: IMovimentoRetificadorService.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface IMovimentoRetificadorService {

	/**
	 * @nome: listarProcessarContabilidade
	 * @propósito: Método responsável por listarProcessarContabilidade.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarProcessarContabilidade(MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: processarContabilidade
	 * @propósito: Método responsável por processarContabilidade.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String processarContabilidade(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarLiberarPagamento
	 * @propósito: Método responsável por listarLiberarPagamento.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarLiberarPagamento(MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: liberarPagamentoIss
	 * @propósito: Método responsável por liberarPagamentoIss.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String liberarPagamentoIss(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarDiferencasContabeis
	 * @propósito: Método responsável por listarDiferencasContabeis.
	 *
	 * @param filtro MovimentoRetificadorFiltroDTO
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarDiferencasContabeis(MovimentoRetificadorFiltroDTO filtro, 
			MovimentoRetificadorDTO movimentoRetificadorDTO);

	/**
	 * @nome: listarReprocessarApuracao
	 * @propósito: Método responsável por listarReprocessarApuracao.
	 *
	 * @param filtro
	 * @return List<MovimentoRetificadorDTO>
	 */
	List<MovimentoRetificadorDTO> listarReprocessarApuracao(
			MovimentoRetificadorFiltroDTO filtro);

	/**
	 * @nome: reprocessarApuracao
	 * @propósito: Método responsável por reprocessarApuracao.
	 *
	 * @param movimentoRetificadorDTO MovimentoRetificadorDTO
	 * @return String
	 */
	String reprocessarApuracao(MovimentoRetificadorDTO movimentoRetificadorDTO);
}
