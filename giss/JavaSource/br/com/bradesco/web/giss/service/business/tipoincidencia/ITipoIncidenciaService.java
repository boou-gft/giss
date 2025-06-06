/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/tipoincidencia/ITipoIncidenciaService.java,v $
 * $Id: ITipoIncidenciaService.java,v 1.1 2017/04/11 14:11:14 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ITipoIncidenciaService.java,v $
 * Revision 1.1  2017/04/11 14:11:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:28  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.tipoincidencia;

import java.util.Date;
import java.util.List;

import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.HistoricoTipoIncidenciaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.TipoIncidenciaDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: TipoIncidencia
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface ITipoIncidenciaService {

    public List<TipoIncidenciaDTO> listaGridTipoIncidencia();
    
    public List<HistoricoTipoIncidenciaDTO> listaHistoricoTipoIncidencia(Date dataInicialHist, Date dataFinalHist);
    
    public TipoIncidenciaDTO incluirTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO);
    
    public TipoIncidenciaDTO alterarTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO);
    
    public TipoIncidenciaDTO excluirTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO);

	public TipoIncidenciaDTO consultarTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO);
	
	public boolean validaInclusaoTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO);
	
	public TipoIncidenciaDTO consultarHistoricoTipoIncidencia(String codigo, String descricao, Date dataInicioHist, Date dataFinalHist, String hrManutencaoRegistro);
    
}

