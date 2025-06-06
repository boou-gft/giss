/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consaldosrec/IConSaldosRecService.java,v $
 * $Id: IConSaldosRecService.java,v 1.1 2017/04/11 14:13:11 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IConSaldosRecService.java,v $
 * Revision 1.1  2017/04/11 14:13:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:29  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consaldosrec;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.consaldosrec.bean.ControleSaldosRecolhimentoDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.DependenciasDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.MunicipioDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ConSaldosRec
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConSaldosRecService {

    public List<SelectItem> listarComboEstados();
    
    public List<MunicipioDTO> listarMunicipios(String codigo);
    
    public ControleSaldosRecolhimentoDTO listarDependenciasControleSaldoRecolhim(String codMunicipio, String competencia);

    public String enviarMensagem(DependenciasDTO dependencia);
}

