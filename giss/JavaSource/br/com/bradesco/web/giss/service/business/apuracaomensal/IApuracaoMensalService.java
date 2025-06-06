/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaomensal/IApuracaoMensalService.java,v $
 * $Id: IApuracaoMensalService.java,v 1.6 2018/06/06 17:08:55 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IApuracaoMensalService.java,v $
 * Revision 1.6  2018/06/06 17:08:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/04/06 14:01:43  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/03/12 11:23:53  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/09/19 18:34:50  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.2  2017/09/08 16:40:57  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:09:47  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:25  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.apuracaomensal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.lowagie.text.DocumentException;

import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.SaidaCampoValorVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ApuracaoMensal
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IApuracaoMensalService {
	
	public ApuracaoMensalDTO prosseguirApuracaoMensal();

    public DependenciaApuracaoMensalSaidaDTO listarDependenciaApuracaoMensal(DependenciaApuracaoMensalEntradaDTO apuracaoMensalEntradaDTO);

    public ApuracaoMensalTotalizadaSaidaDTO listarApuracaoMensalTotalizada(ApuracaoMensalTotalizadaEntradaDTO totalizadaEntradaDTO);
    
    public ApuracaoMensalDTO funcaoTela(String funcao, String botao, String diaDe, String diaAte);
    
    public TarifasCobradasVO consultarTarifasCobradas(TarifasCobradasVO parametro);
    
    public List<ListaGenericaVO> consultarRelacaoPa (TarifasCobradasVO parametro);
    
    public ApuracaoMensalDTO incluirApuracaoAjuste (ListaGenericaVO parametro);
    
    public List<ListaGenericaVO> consultaApuracaoParcialIss(TarifasCobradasVO entrada);
    
    public ApuracaoMensalDTO consultaApuracaoPa (String dataInicio, String dataFim);
    
    public SaidaCampoValorVO consultaConciliacaoApuracao (String competencia);
    
    public ApuracaoMensalTotalizadaSaidaDTO listarApuracaoMensalTotalizadaConta(ApuracaoMensalTotalizadaEntradaDTO totalizadaEntradaDTO);
    
    public ApuracaoMensalDTO incluirJustificativa (ListaGenericaVO parametro);
    
    public ConciliacaoApuracaoVo listarConciliacaoApuracao(String competencia);
    
    public DetalharJustificativaApuracaoVO detalharJustificativaApuracao(String competencia);
    
    public void gerarConciliacaoTXT(ConciliacaoApuracaoVo conciliacaoApuracaoVo, DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO, OutputStream outputStream) throws DocumentException, ReportException, IOException;
    
    public void gerarPlanilhaConciliacaoPDF(ConciliacaoApuracaoVo conciliacaoApuracaoVo, DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO, OutputStream outputStream) throws DocumentException;
}

