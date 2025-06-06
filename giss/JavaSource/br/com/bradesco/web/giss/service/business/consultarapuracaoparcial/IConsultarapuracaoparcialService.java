/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoparcial/IConsultarapuracaoparcialService.java,v $
 * $Id: IConsultarapuracaoparcialService.java,v 1.2 2018/06/06 17:09:31 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IConsultarapuracaoparcialService.java,v $
 * Revision 1.2  2018/06/06 17:09:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:11:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/21 16:36:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:33  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaoparcial;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarApuracaoParcialFinalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarDependenciaParcialDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.exceptions.ConsultarapuracaoparcialServiceException;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Consultarapuracaoparcial
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConsultarapuracaoparcialService {
	
	 public List<SelectItem> listarComboEstados() throws PdcAdapterException, ConsultarapuracaoparcialServiceException;
	 
	 public List<ConsultarMunicipiosApuracaoParcialDTO> listarMunicipios(String codigoEstado);
	 
	 public ConsultarDependenciaParcialDTO listarDependenciaMunicipioResultado(long codigoMunicipio, long codPessoaJurid, int codDependencia);
	 
	 public List<ConsultarApuracaoParcialFinalDTO> listarApuracaoParcialFinal(String codigoMunicipio,int codigoPessoaJuridica,String numeroSequencialUnidade);
	 
	 public List<ConsultarApuracaoParcialFinalDTO> listarApuracaoParcialFinalConta(String codigoMunicipio,int codigoPessoaJuridica,Integer numeroSequencialUnidade, String razao, String cosif, String dataInicial, String dataFinal);
}