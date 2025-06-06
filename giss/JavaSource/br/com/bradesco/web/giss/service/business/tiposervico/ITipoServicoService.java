/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/tiposervico/ITipoServicoService.java,v $
 * $Id: ITipoServicoService.java,v 1.1 2017/04/11 14:10:48 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ITipoServicoService.java,v $
 * Revision 1.1  2017/04/11 14:10:48  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:33  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:06  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.tiposervico;

import java.util.Date;
import java.util.List;

import br.com.bradesco.web.giss.service.business.tiposervico.bean.HistoricoTipoServicoDTO;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.TipoServicoDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: TipoServico
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface ITipoServicoService {

    /**
     * Método de exemplo.
     */
    
    public List<TipoServicoDTO> listaGridTipoServico();
    
    public List<HistoricoTipoServicoDTO> listaHistoricoTipoServico(Date dataInicialHist, Date dataFinalHist);
    
    public TipoServicoDTO manterTipoServico(TipoServicoDTO tipoServicoDTO);
    
}

