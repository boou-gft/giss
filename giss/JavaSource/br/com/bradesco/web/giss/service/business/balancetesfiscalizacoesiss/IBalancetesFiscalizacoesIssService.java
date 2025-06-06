/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/balancetesfiscalizacoesiss/IBalancetesFiscalizacoesIssService.java,v $
 * $Id: IBalancetesFiscalizacoesIssService.java,v 1.1 2017/04/11 14:09:49 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IBalancetesFiscalizacoesIssService.java,v $
 * Revision 1.1  2017/04/11 14:09:49  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.IncluirExcluirBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListaIntermediariaBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesEntradaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesParametrizadosSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarPedidoBalancetesSaidaDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: BalancetesFiscalizacoesIss
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IBalancetesFiscalizacoesIssService {

	public List<SelectItem> carregarComboEmpresasBalancetes();
	public List<SelectItem> carregarComboEstadosBalancetes();
	public List<SelectItem> carregarComboMunicipiosBalancetes(Integer codUf, Long codMunicipio);
	public GerarBalanceteFiscalizacoesIssSaidaDTO executarBalancete(GerarBalanceteFiscalizacoesIssDTO entrada);
	public List<ListarPedidoBalancetesSaidaDTO> listarPedidoBalancetes(Integer codTipoBalancete);
	public List<ListaIntermediariaBalancetesSaidaDTO> listaIntermediariaBalancetes(Long codSolicitacaoBalancete, Integer codTipoBalancete);
	public ListarBalancetesSaidaDTO listarBalancetes(ListarBalancetesEntradaDTO entrada);
	public List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados();
	public GerarBalanceteFiscalizacoesIssSaidaDTO incluirBalancete(IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada);
	public GerarBalanceteFiscalizacoesIssSaidaDTO excluirBalancete(IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada);
	public GerarBalanceteFiscalizacoesIssSaidaDTO gerarBalancete(GerarBalanceteObrigacoesAcessoriasDTO entrada);

}