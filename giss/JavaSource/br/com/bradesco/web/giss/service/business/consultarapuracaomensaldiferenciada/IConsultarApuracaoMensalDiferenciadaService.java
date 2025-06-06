/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaomensaldiferenciada/IConsultarApuracaoMensalDiferenciadaService.java,v $
 * $Id: IConsultarApuracaoMensalDiferenciadaService.java,v 1.1 2017/04/11 14:08:42 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IConsultarApuracaoMensalDiferenciadaService.java,v $
 * Revision 1.1  2017/04/11 14:08:42  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada;

import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ApuracaoMenDiferenciadaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ResultadoApuracaoMensalDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Consultarapuracaomensaldiferenciada
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConsultarApuracaoMensalDiferenciadaService {

    public ApuracaoMenDiferenciadaDTO listarResultadoPesqApuracaoMensalDiferenciada(int competencia, int codMunicipio, int codDependencia, long codPessoaJurid);
    public ResultadoApuracaoMensalDTO listarResultadoApuracaoMensalDiferenciada( int codMunicipio, long codPesJuridica,int numUnidOrganizal, Integer mesAno );
    

}

