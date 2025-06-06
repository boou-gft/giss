/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/depmunicipio/IDepMunicipioService.java,v $
 * $Id: IDepMunicipioService.java,v 1.1 2017/04/11 14:12:20 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IDepMunicipioService.java,v $
 * Revision 1.1  2017/04/11 14:12:20  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:25  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.depmunicipio;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.depmunicipio.bean.DependenciaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.MunicipioDTO;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Depmunicipio
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IDepMunicipioService {

    /**
     * Método de exemplo.
     */
    public void sampleDepmunicipio();
    
    
    public List<SelectItem> listarComboEstados();
    
    
    public List<MunicipioDTO> listaGridDependenciaMunicipio(int codigoUnidadeFederativa, Long codMunicipio);

    
    public DependenciaMunicipioDTO listarDependenciaMunicipioResultado(int codigoMunicipio);
}

