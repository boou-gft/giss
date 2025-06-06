/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/historicomunicipio/IHistoricoMunicipioService.java,v $
 * $Id: IHistoricoMunicipioService.java,v 1.1 2017/04/11 14:11:16 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IHistoricoMunicipioService.java,v $
 * Revision 1.1  2017/04/11 14:11:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:12  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:37  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.historicomunicipio;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.DetalheHistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistMunConResultadoDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioContasDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Historicomunicipio
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IHistoricoMunicipioService {
	
    public List<SelectItem> listarComboEstados();
    
    public List<HistoricoMunicipioDTO> listaGriHistoricoMunicipio(int codigoUnidadeFederativa, Long codMunicipio);
    
    public DetalheHistoricoMunicipioDTO listaDetalheMunicipio(int codigoMunicipio, String timestamp);

    public List<SelectItem> listarComboTipoServico();
    
    public List<HistoricoMunicipioContasDTO> listaDetalheMunicipioResultado(int codigoMunicipio,int codigoServico);
    
    public List<HistMunConResultadoDTO> listaHistoricoMunicipioContaResultado(int codigoMunicipio,int grupo, int subGrupo);
}

