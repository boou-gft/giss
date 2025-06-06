/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * �ltima revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1�App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaooscilacaonegativa/IConsultarApuracaoOscilacaoNegativaService.java,v $
 * $Id: IConsultarApuracaoOscilacaoNegativaService.java,v 1.1 2017/04/11 14:12:50 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Hist�rico:
 * $Log: IConsultarApuracaoOscilacaoNegativaService.java,v $
 * Revision 1.1  2017/04/11 14:12:50  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:53:39  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:15  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:41  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa;

import java.util.List;

import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ConsultarOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ContasOscilacaoNegativaDTO;

/**
 * 
 * <p>
 * <b>T�tulo:</b>
 * </p>
 * <p>
 * <b>Descri�ao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ConsultarApuracaoOscilacaoNegativa
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConsultarApuracaoOscilacaoNegativaService {

    public ConsultarOscilacaoNegativaDTO consultarOscilacaoNegativa(int dataCompetencia, int codDependencia, long codPessoaJuridica);
    
    public ConsultarOscilacaoNegativaDTO consultarOscilacaoNegativaPlanilha(int dataCompetencia, int codDependencia, long codPessoaJuridica);
    
    public List<ContasOscilacaoNegativaDTO> listarContasOscilacaoNegativa(int dataCompetencia,int numeroSequencial,long codigoPessoaJuridica, int codDependencia);

}

