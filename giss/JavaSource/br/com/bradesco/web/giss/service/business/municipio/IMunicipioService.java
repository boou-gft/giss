/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/municipio/IMunicipioService.java,v $
 * $Id: IMunicipioService.java,v 1.2 2017/06/06 12:32:05 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IMunicipioService.java,v $
 * Revision 1.2  2017/06/06 12:32:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:08:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.municipio;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.municipio.bean.MunicipioDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Mantermunicipio
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IMunicipioService {

    /**
     * Método de exemplo.
     * 
     * 
     */
	
	public List<SelectItem> listarComboEstados();
	
	public List<MunicipioDTO> listaGridMunicipio(int codigoUnidadeFederativa ,String origem, Long codMunicipio);
	
	public List<MunicipioDTO> listaGridMunicipioNovos(String origem, Long codMunicipio, Integer codUF, Integer tipoPesquisa);

}

