/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/planapuracaoiss/IPlanApuracaoIssService.java,v $
 * $Id: IPlanApuracaoIssService.java,v 1.2 2018/06/14 10:16:09 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IPlanApuracaoIssService.java,v $
 * Revision 1.2  2018/06/14 10:16:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:07:15  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:37:19  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2013/02/04 17:27:26  fabio.soares
 * *** empty log message ***
 *
 * Revision 1.5  2013/02/04 12:22:44  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2013/01/15 17:55:20  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2013/01/15 17:14:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/19 19:22:35  renato.mariscal
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:56  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:24  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.planapuracaoiss;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterTechnicalException;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssEntradaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssAllDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;

import com.lowagie.text.DocumentException;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: PlanApuracaoIss
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IPlanApuracaoIssService {

    public PlanApuracaoIssSaidaDTO planApuracaoListaSaida(PlanApuracaoIssEntradaDTO planApuracaoEntrada) throws PdcAdapterTechnicalException;

    public RelatorioApuracaoIssDTO listarPlanilhaApuracao(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta);

    public RelatorioApuracaoIssAllDTO listarPlanilhaApuracaoAll(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta);

    public RelatorioApuracaoIssDTO listarPlanilhaApuracaoAgencia(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta);

    public void gerarPlanilhaApuracaoTXT(List<RelatorioApuracaoIssDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException,ReportException, IOException ;
    
    public void gerarPlanilhaApuracaoAllTXT(List<RelatorioApuracaoIssAllDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException, ReportException, IOException;
    
    public void gerarPlanilhaApuracaoPDF(List<RelatorioApuracaoIssDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException;

    public void gerarPlanilhaApuracaoAllPDF(List<RelatorioApuracaoIssAllDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException;
    
    public String gerarPlaninlhaApuracaoEos(PlanApuracaoIssEntradaDTO planApuracaoEntrada, Boolean aberturaConta) throws PdcAdapterTechnicalException;
}

