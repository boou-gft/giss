/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/mantermunicipio/IManterMunicipioService.java,v $
 * $Id: IManterMunicipioService.java,v 1.4 2017/06/09 11:56:21 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IManterMunicipioService.java,v $
 * Revision 1.4  2017/06/09 11:56:21  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/06/06 23:39:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:03  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:10:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2013/02/04 12:22:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:26  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.mantermunicipio;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.AlteracaoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.ContaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.exceptions.MunicipioServiceException;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;

import com.lowagie.text.DocumentException;

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
public interface IManterMunicipioService {

	public List<SelectItem> listarComboEstados();
	
	public List<SelectItem> listarComboTipoServico();
	
	public List<SelectItem> listarTipoIncidencia();
	
	public List<AgenciaDTO> listarAgenciasMunicipio(String codigoMunicipio);
	
	public DetalheMunicipioDTO excluirMunicipio(String codigoMunicipio);
	
	public DetalheMunicipioDTO alterarMunicipio(AlteracaoMunicipioDTO alteracaoMunicipioDTO);
	
	public List<ContaMunicipioDTO> listarContasPorTipoServico(String codigoMunicipio, String tipoServicoFiltro);
	
	public List<MunicipioDTO> listarMunicipios(String codigoEstado, Long codMunicipio);
	
	public MunicipioDTO listarMunicipiosManter(String codigoEstado, Long codMunicipio, Integer tipoPesquisa);
	
	public DetalheMunicipioDTO detalharMunicipio(String codigoMunicipio, Integer tipoPesquisa);

	public String atualizarAliquota(Integer codTipoServico, Long codMunicipio, String aliquota);
	
	public MunicipioDTO listarMunicipiosManterAll(String codigoEstado, Long codMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException; 
	
	public void gerarListaMunicipioTXT(List<MunicipioDTO> listaMunicipios, OutputStream outputStream) throws DocumentException, ReportException, IOException;
}

