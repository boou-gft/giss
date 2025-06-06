/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoaposfechamento/IConsultarApuracaoAposFechamentoService.java,v $
 * $Id: IConsultarApuracaoAposFechamentoService.java,v 1.2 2018/06/06 17:08:55 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IConsultarApuracaoAposFechamentoService.java,v $
 * Revision 1.2  2018/06/06 17:08:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:08:50  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:03  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoAposFechamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoFinalAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoReprocessamentoResultadoTotalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarDependenciaAposApuracaoFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarMunicipiosAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.exceptions.ConsultarApuracaoAposFechamentoServiceException;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ConsultarApuracaoAposFechamento
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConsultarApuracaoAposFechamentoService {

    public List<ConsultarApuracaoAposFechamentoDTO> listarPesquisaAposFechamento(String mesAnoApuracao) throws PdcAdapterException,ConsultarApuracaoAposFechamentoServiceException ;
    
    public List<SelectItem> listarComboEstados() throws PdcAdapterException, ConsultarApuracaoAposFechamentoServiceException; 
    
    public List<ConsultarMunicipiosAposFechamentoDTO> listarMunicipios(String codigoEstado);
    
    public List<ConsultarDependenciaAposApuracaoFechamentoDTO> listarDependenciaApuracaoAposFechamento(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO);
    
    public ConsultarApuracaoReprocessamentoResultadoTotalDTO listarDependenciaApuracaoMensalPesquisa(String codigoMunicipio, int codigoSolicitacao, String mesAnoApuracao, Integer codDependencia, Long codPessoaJurid);
    
    public List<ConsultarApuracaoFinalAposFechamentoDTO> listarApuracaoFinalAposFechamento(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO);
    
    public List<ConsultarApuracaoFinalAposFechamentoDTO> listarApuracaoFinalAposFechamentoConta(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO);
}

