/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoaliquotazerada/IConsultarApuracaoAliquotaZeradaService.java,v $
 * $Id: IConsultarApuracaoAliquotaZeradaService.java,v 1.1 2017/04/11 14:13:00 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IConsultarApuracaoAliquotaZeradaService.java,v $
 * Revision 1.1  2017/04/11 14:13:00  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:23  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada;

import java.util.List;

import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultaAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultarAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaSaidaDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ConsultarApuracaoAliquotaZerada
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConsultarApuracaoAliquotaZeradaService {

	public ConsultaAliquotaZeradaSaidaDTO buscarDependenciaAliquotaZerada ( ConsultarAliquotaZeradaEntradaDTO entrada );
	public List<ResultadoAliquotaZeradaSaidaDTO> buscarResultadoAliquotaZerada(ResultadoAliquotaZeradaEntradaDTO entrada);

}

