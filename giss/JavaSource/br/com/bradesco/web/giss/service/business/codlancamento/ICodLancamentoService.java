/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/codlancamento/ICodLancamentoService.java,v $
 * $Id: ICodLancamentoService.java,v 1.4 2017/11/28 12:05:34 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ICodLancamentoService.java,v $
 * Revision 1.4  2017/11/28 12:05:34  gmichelini
 * Tela detalhe de historico.
 *
 * Revision 1.3  2017/06/01 11:41:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/05/10 21:12:59  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/05/02 17:01:00  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:12:51  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.codlancamento;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.CodLancamentoDTO;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.DetalheHistoricoDTO;
import br.com.bradesco.web.giss.service.business.codlancamento.exeptions.CodLancamentoServiceException;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ApuracaoRep
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface ICodLancamentoService {
	public CodLancamentoDTO listaCodLancamento(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException;
	public CodLancamentoDTO listaHistorico(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException;
	public String incluir(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException;
	public String alterar(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException;
	public String excluir(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException;
	public DetalheHistoricoDTO detalheHistorico(
			Integer cdLancamento, Integer paramLancamentoContabio, String horainclusaoRegistroHistorico) 
			throws PdcAdapterException, CodLancamentoServiceException;

}

