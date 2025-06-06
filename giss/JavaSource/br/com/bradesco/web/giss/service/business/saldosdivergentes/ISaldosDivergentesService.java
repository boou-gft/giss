/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/saldosdivergentes/ISaldosDivergentesService.java,v $
 * $Id: ISaldosDivergentesService.java,v 1.1 2017/04/11 14:09:14 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ISaldosDivergentesService.java,v $
 * Revision 1.1  2017/04/11 14:09:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:23  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.saldosdivergentes;

import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteContaTotalDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteDependenciaTotalDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: SaldosDivergentes
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface ISaldosDivergentesService {
	
	public SaldoDivergenteContaTotalDTO listarSaldoDivergenteConta(String competencia);
	
	public SaldoDivergenteDependenciaTotalDTO listarSaldoDivergenteDependencia (long conta, String competencia);
}

