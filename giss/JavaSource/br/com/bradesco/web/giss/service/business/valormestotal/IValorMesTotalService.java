/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/valormestotal/IValorMesTotalService.java,v $
 * $Id: IValorMesTotalService.java,v 1.5 2018/06/06 17:08:56 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IValorMesTotalService.java,v $
 * Revision 1.5  2018/06/06 17:08:56  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/02/19 12:52:58  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/12/05 13:30:25  jaquelinebrito
 * Tela Valor Superior
 *
 * Revision 1.2  2017/07/28 14:09:20  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:13:06  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:21  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:51  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.valormestotal;

import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSTotalDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ValorMesTotal
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IValorMesTotalService {

	public DemonstrativoISSTotalDTO listarDemonstrativoISS(String mesAnoCompetencia, Integer filtro);
	public DemonstrativoISSTotalDTO listarDemonstrativoISSConta(String mesAnoCompetencia, Integer filtro, String razao, String cosif);
	
}

