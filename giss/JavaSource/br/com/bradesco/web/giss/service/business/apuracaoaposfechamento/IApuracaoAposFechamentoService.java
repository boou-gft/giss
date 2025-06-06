/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaoaposfechamento/IApuracaoAposFechamentoService.java,v $
 * $Id: IApuracaoAposFechamentoService.java,v 1.1 2017/04/11 14:07:36 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IApuracaoAposFechamentoService.java,v $
 * Revision 1.1  2017/04/11 14:07:36  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:51:10  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:22  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.apuracaoaposfechamento;

import br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.bean.ApuracaoAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ApuracaoAposFechamento
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IApuracaoAposFechamentoService {

    /**
     * Método de exemplo.
     */
    public void sampleApuracaoAposFechamento();
    
    public ApuracaoAposFechamentoDTO listaApuracaoAposFechamento();
    
    public ApuracaoAposFechamentoDTO prosseguirApuracaoAposFechamento();
    
    public ApuracaoMensalDTO iniciarTela();

}

