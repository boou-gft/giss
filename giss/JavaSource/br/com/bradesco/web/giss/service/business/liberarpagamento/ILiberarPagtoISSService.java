package br.com.bradesco.web.giss.service.business.liberarpagamento;

import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.exceptions.LiberarPagtoISSServiceException;

/**
 * @nome: ILiberarPagtoISSService.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface ILiberarPagtoISSService {
	
	/**
	 * @nome: listarLiberarPagamento
	 * @propósito: Método responsável por listarLiberarPagamento.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public LiberarPagtoISSDTO listarLiberarPagamento(LiberarPagtoISSDTO dto)throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: liberarPagamento
	 * @propósito: Método responsável por liberarPagamento.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String liberarPagamento(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPagtosNaoGerados
	 * @propósito: Método responsável por listarPagtosNaoGerados.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPagtosNaoGerados(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPgtosVencidosComp
	 * @propósito: Método responsável por listarPgtosVencidosComp.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPgtosVencidosComp(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPgtosNaoElegiveis
	 * @propósito: Método responsável por listarPgtosNaoElegiveis.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPgtosNaoElegiveis(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarConsultaPagamentos
	 * @propósito: Método responsável por listarConsultaPagamentos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarConsultaPagamentos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;

	/**
	 * @nome: listarPagamentoManual
	 * @propósito: Método responsável por listarPagamentoManual.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPagamentoManual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: agendarPgtoIndividual
	 * @propósito: Método responsável por agendarPgtoIndividual.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String agendarPgtoIndividual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: agendarSelecionadosOuTodos
	 * @propósito: Método responsável por agendarSelecionadosOuTodos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String agendarSelecionadosOuTodos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: cancelarTedTransferencia
	 * @propósito: Método responsável por cancelarTedTransferencia.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @param selecionados List<LiberarPagtoISSDTO>
	 * @param todos Boolean
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String cancelarTedTransferencia(LiberarPagtoISSDTO dto, List<LiberarPagtoISSDTO> selecionados, Boolean todos) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: calcularSelecionadosOuTodos
	 * @propósito: Método responsável por calcularSelecionadosOuTodos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @param todos Boolean
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void calcularSelecionadosOuTodos(LiberarPagtoISSDTO dto, Boolean todos)throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarLiberarPagamentoRetificado
	 * @propósito: Método responsável por listarLiberarPagamentoRetificado.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return LiberarPagtoISSDTO
	 */
	public LiberarPagtoISSDTO listarLiberarPagamentoRetificado(LiberarPagtoISSDTO dto);
	
	/**
	 * @nome: liberarPagamentoRetificado
	 * @propósito: Método responsável por liberarPagamentoRetificado.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 */
	public String liberarPagamentoRetificado(LiberarPagtoISSDTO dto);
}
