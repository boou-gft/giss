/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/reprocessamentopordependencia/IReprocessamentoPorDependenciaService.java,v $
 * $Id: IReprocessamentoPorDependenciaService.java,v 1.1 2017/04/11 14:10:58 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IReprocessamentoPorDependenciaService.java,v $
 * Revision 1.1  2017/04/11 14:10:58  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:36  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoPorDependenciaEntradaDTO;

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
public interface IReprocessamentoPorDependenciaService {

    public List<SelectItem> listarComboEstados();
    
    public List<ReprocessamentoDependenciaDTO> listarMunicipios(String codigoEstado);
    
    public List<SelectItem> listarComboTipoServico();
    
    public ReprocessamentoDependenciaAliquotaDTO listarReprocessamentoDependencia(String dataInicial, String dataFinal, String municipio);
    
    public List<ReprocessamentoMunicipioDTO> listarContasTipoServico(String municipio, String codTipoServico);
    
    public BasicSaidaDTO solicitarReprocessamentoPorDependencia(ReprocessamentoPorDependenciaEntradaDTO entradaDTO);
}

