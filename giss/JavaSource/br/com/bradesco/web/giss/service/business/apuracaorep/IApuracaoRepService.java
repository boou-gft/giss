/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaorep/IApuracaoRepService.java,v $
 * $Id: IApuracaoRepService.java,v 1.1 2017/04/11 14:12:51 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IApuracaoRepService.java,v $
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

package br.com.bradesco.web.giss.service.business.apuracaorep;

import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ApuracaoReprocessamentoSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoSaidaDTO;

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
public interface IApuracaoRepService {

	public List<ApuracaoReprocessamentoSaidaDTO> buscarDadosPesquisa(Integer numSolicitacao);
	public List<ListarApuracaoReprocessamentoSaidaDTO> listarApuracaoReprocessamento(ListarApuracaoReprocessamentoEntradaDTO entrada);

}

