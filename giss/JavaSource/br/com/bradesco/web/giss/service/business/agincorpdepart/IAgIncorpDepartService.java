/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * �ltima revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1�App/giss/JavaSource/br/com/bradesco/web/giss/service/business/agincorpdepart/IAgIncorpDepartService.java,v $
 * $Id: IAgIncorpDepartService.java,v 1.1 2017/04/11 14:09:24 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Hist�rico:
 * $Log: IAgIncorpDepartService.java,v $
 * Revision 1.1  2017/04/11 14:09:24  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:35  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:07  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.agincorpdepart;

import java.util.List;

import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartEntradaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaTotalDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorporaDepartAvancarTotalDTO;

/**
 * 
 * <p>
 * <b>T�tulo:</b>
 * </p>
 * <p>
 * <b>Descri�ao:</b>
 * </p>
 * <p>
 * Interface do adaptador: AgIncorpDepart
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IAgIncorpDepartService {

	public AgIncorpDepartSaidaTotalDTO listarAgenciaIncorpDepartamento(AgIncorpDepartEntradaDTO entrada);

	public AgIncorporaDepartAvancarTotalDTO consultarAgenciaIncorporaDepartamento(AgIncorpDepartSaidaDTO entrada);
}

