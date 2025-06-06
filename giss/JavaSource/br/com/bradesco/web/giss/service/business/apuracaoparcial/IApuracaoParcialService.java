/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaoparcial/IApuracaoParcialService.java,v $
 * $Id: IApuracaoParcialService.java,v 1.2 2018/06/06 17:08:55 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IApuracaoParcialService.java,v $
 * Revision 1.2  2018/06/06 17:08:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:12:59  gmichelini
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

package br.com.bradesco.web.giss.service.business.apuracaoparcial;

import br.com.bradesco.web.giss.service.business.apuracaoparcial.bean.ApuracaoParcialDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ApuracaoParcial
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IApuracaoParcialService {

    public ApuracaoParcialDTO listaApuracaoParcial(String diaDe, String diaAte);

    public ApuracaoParcialDTO iniciarApuracaoParcial();
}

