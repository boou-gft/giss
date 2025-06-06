package br.com.bradesco.web.giss.service.business.liberarpagamento;

import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.exceptions.LiberarPagtoISSServiceException;

/**
 * @nome: ILiberarPagtoISSService.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface ILiberarPagtoISSService {
	
	/**
	 * @nome: listarLiberarPagamento
	 * @prop�sito: M�todo respons�vel por listarLiberarPagamento.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public LiberarPagtoISSDTO listarLiberarPagamento(LiberarPagtoISSDTO dto)throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: liberarPagamento
	 * @prop�sito: M�todo respons�vel por liberarPagamento.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String liberarPagamento(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPagtosNaoGerados
	 * @prop�sito: M�todo respons�vel por listarPagtosNaoGerados.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPagtosNaoGerados(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPgtosVencidosComp
	 * @prop�sito: M�todo respons�vel por listarPgtosVencidosComp.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPgtosVencidosComp(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarPgtosNaoElegiveis
	 * @prop�sito: M�todo respons�vel por listarPgtosNaoElegiveis.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPgtosNaoElegiveis(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarConsultaPagamentos
	 * @prop�sito: M�todo respons�vel por listarConsultaPagamentos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarConsultaPagamentos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;

	/**
	 * @nome: listarPagamentoManual
	 * @prop�sito: M�todo respons�vel por listarPagamentoManual.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void listarPagamentoManual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: agendarPgtoIndividual
	 * @prop�sito: M�todo respons�vel por agendarPgtoIndividual.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String agendarPgtoIndividual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: agendarSelecionadosOuTodos
	 * @prop�sito: M�todo respons�vel por agendarSelecionadosOuTodos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public String agendarSelecionadosOuTodos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: cancelarTedTransferencia
	 * @prop�sito: M�todo respons�vel por cancelarTedTransferencia.
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
	 * @prop�sito: M�todo respons�vel por calcularSelecionadosOuTodos.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @param todos Boolean
	 * @throws PdcAdapterException
	 * @throws LiberarPagtoISSServiceException
	 */
	public void calcularSelecionadosOuTodos(LiberarPagtoISSDTO dto, Boolean todos)throws PdcAdapterException, LiberarPagtoISSServiceException;
	
	/**
	 * @nome: listarLiberarPagamentoRetificado
	 * @prop�sito: M�todo respons�vel por listarLiberarPagamentoRetificado.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return LiberarPagtoISSDTO
	 */
	public LiberarPagtoISSDTO listarLiberarPagamentoRetificado(LiberarPagtoISSDTO dto);
	
	/**
	 * @nome: liberarPagamentoRetificado
	 * @prop�sito: M�todo respons�vel por liberarPagamentoRetificado.
	 *
	 * @param dto LiberarPagtoISSDTO
	 * @return String
	 */
	public String liberarPagamentoRetificado(LiberarPagtoISSDTO dto);
}
