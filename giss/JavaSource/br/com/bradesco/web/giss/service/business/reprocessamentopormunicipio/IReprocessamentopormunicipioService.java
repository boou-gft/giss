/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/reprocessamentopormunicipio/IReprocessamentopormunicipioService.java,v $
 * $Id: IReprocessamentopormunicipioService.java,v 1.1 2017/04/11 14:12:10 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IReprocessamentopormunicipioService.java,v $
 * Revision 1.1  2017/04/11 14:12:10  gmichelini
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

package br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioEntradaDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Reprocessamentopormunicipio
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IReprocessamentopormunicipioService {

    public List<SelectItem> listarComboEstados();
    
    public List<SelectItem> listarComboTipoServico();
    
    public List<ReprocessamentoPorMunicipioDTO> listaMunicipioEstadoPeriodo(String codEstado, String dataInicial, String dataFinal);
 
    public List<ReprocessamentoPorMunicipioDTO> listarMunicipios(String codigoEstado);
    
    public List<ReprocessamentoMunicipioDTO> listarContasTipoServico(String municipio, String codTipoServico);

    public BasicSaidaDTO solicitarReprocessamentoPorMunicipio(ReprocessamentoPorMunicipioEntradaDTO entradaDTO);
}

