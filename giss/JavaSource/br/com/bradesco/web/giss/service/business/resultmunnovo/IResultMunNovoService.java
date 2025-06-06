/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/resultmunnovo/IResultMunNovoService.java,v $
 * $Id: IResultMunNovoService.java,v 1.4 2017/06/09 11:56:22 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IResultMunNovoService.java,v $
 * Revision 1.4  2017/06/09 11:56:22  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/06/06 23:39:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:11:37  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2012/12/21 16:36:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:10  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:35  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.resultmunnovo;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ContaDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.IncluirMunicipioDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultAgenciaMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.model.municipio.EstadosComboBean;

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
 * Interface do adaptador: ResultMunNovo
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IResultMunNovoService {

	public List<ResultMunicipiosNovosDTO> listarMunicipiosNovos(Long codMunicipio, Integer codUF, Integer tipoPesquisa);
    
	public List<EstadosComboBean> listagemEstados();
        
    public List<ResultMunicipiosNovosDTO> listarMunicipios(String codigoMunicipio);
    
    public List<ResultAgenciaMunicipiosNovosDTO> listarDependenciasMunicipio(String dependenciaMunicipioFiltro);
   
    public List<SelectItem> listarTipoServico();
    
    public List<SelectItem> listarTipoIncidencia();
    
    public List<ContaDTO> listarContasTipoServico(String codigoMunicipio,String codigoTipoServico);

    public DetalheMunicipioDTO detalharMunicipio(String codigoMunicipio, Integer tipoPesquisa);
    
    public DetalheMunicipioDTO incluirMunicipio(IncluirMunicipioDTO incluirMunicipioDTO);
    
    public DetalheMunicipioDTO incluirContasMunicipio(IncluirMunicipioDTO incluirMunicipioDTO);
    
    public String atualizarAliquota(Integer codTipoServico, Long codMunicipio, String aliquota);
    
    public List<ResultMunicipiosNovosDTO> listarMunicipiosNovosAll(Long codMunicipio, Integer codUF, Integer tipoPesquisa);
    
    public void gerarListaMunicipioTXT(List<ResultMunicipiosNovosDTO> listaMunicipios, OutputStream outputStream) throws DocumentException, ReportException, IOException;

    public List<HistoricoMunicipioDTO> listarMunicipiosSemConvenio(String codigoUf, BuscaMunicipioBean buscaMunicipioBean);
    
    public String incluirMunicipiosSemConvenio(List<HistoricoMunicipioDTO> listaMunicipios);
    
}

