/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/balancetesfiscalizacoesiss/impl/BalancetesFiscalizacoesIssServiceImpl.java,v $
 * $Id: BalancetesFiscalizacoesIssServiceImpl.java,v 1.1 2017/04/11 14:11:30 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: BalancetesFiscalizacoesIssServiceImpl.java,v $
 * Revision 1.1  2017/04/11 14:11:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssService;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssServiceConstants;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.IncluirExcluirBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListaIntermediariaBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesEntradaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesOcorrenciasSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesParametrizadosSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarEmpresasBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarEstadosBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarMunicipiosBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarPedidoBalancetesSaidaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirbalancete.request.ExcluirBalanceteRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirbalancete.response.ExcluirBalanceteResponse;
import br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.request.ExecutarBalanceteFiscalizacoesIssRequest;
import br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.response.ExecutarBalanceteFiscalizacoesIssResponse;
import br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.request.GerarBalanceteRequest;
import br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.response.GerarBalanceteResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirbalancete.request.IncluirBalanceteRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirbalancete.response.IncluirBalanceteResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaintermediariabalancetes.request.ListaIntermediariaBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaintermediariabalancetes.response.ListaIntermediariaBalancetesResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.ListarBalancetesResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetesparametrizados.request.ListarBalancetesParametrizadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetesparametrizados.response.ListarBalancetesParametrizadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarempresasbalancetes.request.ListarEmpresasBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarempresasbalancetes.response.ListarEmpresasBalancetesResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarestadosbalancetes.request.ListarEstadosBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarestadosbalancetes.response.ListarEstadosBalancetesResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.response.ListarMunicipiosBalancetesResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.ListarPedidoBalancetesResponse;
import br.com.bradesco.web.giss.utils.GissUtil;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: BalancetesFiscalizacoesIss
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class BalancetesFiscalizacoesIssServiceImpl implements IBalancetesFiscalizacoesIssService, IBalancetesFiscalizacoesIssServiceConstants {

	private FactoryAdapter factoryAdapter;

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	/**
	 * Construtor.
	 */
	public BalancetesFiscalizacoesIssServiceImpl() {
		// TODO: Implementação
	}
	
	public List<SelectItem> carregarComboEmpresasBalancetes() {
		List<SelectItem> listarEmpresasBalancetes = new ArrayList<SelectItem>();
		
		ListarEmpresasBalancetesSaidaDTO saida = new ListarEmpresasBalancetesSaidaDTO();

		ListarEmpresasBalancetesRequest request = new ListarEmpresasBalancetesRequest();
		ListarEmpresasBalancetesResponse response = new ListarEmpresasBalancetesResponse();

		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_50);

		response = getFactoryAdapter().getListarEmpresasBalancetesPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListarEmpresasBalancetesSaidaDTO();
			
			saida.setCodEmpresa(response.getOcorrencias(i).getCodEmpresa());
			saida.setDescEmpresa(response.getOcorrencias(i).getDescEmpresa());
			
			listarEmpresasBalancetes.add(new SelectItem(saida.getCodEmpresa(), saida.getCodEmpresa() + " - " + saida.getDescEmpresa()));
		}

		return listarEmpresasBalancetes;
	}
	
	public List<SelectItem> carregarComboEstadosBalancetes() {
		List<SelectItem> listarEstadosBalancetes = new ArrayList<SelectItem>();
		
		ListarEstadosBalancetesSaidaDTO saida = new ListarEstadosBalancetesSaidaDTO();

		ListarEstadosBalancetesRequest request = new ListarEstadosBalancetesRequest();
		ListarEstadosBalancetesResponse response = new ListarEstadosBalancetesResponse();

		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_50);

		response = getFactoryAdapter().getListarEstadosBalancetesPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListarEstadosBalancetesSaidaDTO();
			
			saida.setCodUf(response.getOcorrencias(i).getCodUf());
			saida.setSiglaUf(response.getOcorrencias(i).getSiglaUf());
			saida.setDescUf(response.getOcorrencias(i).getDescUf());
			
			listarEstadosBalancetes.add(new SelectItem(saida.getCodUf(), saida.getDescUf()));
		}
		
		Collections.sort (listarEstadosBalancetes, new Comparator<SelectItem> () {  
            public int compare (SelectItem p1, SelectItem p2) {  
                return p1.getLabel().compareTo (p2.getLabel());  
            }  
        });

		return listarEstadosBalancetes;
	}
	
	public List<SelectItem> carregarComboMunicipiosBalancetes(Integer codUf, Long codMunicipio) {
		List<SelectItem> listarMunicipiosBalancetes = new ArrayList<SelectItem>();
		
		ListarMunicipiosBalancetesSaidaDTO saida = new ListarMunicipiosBalancetesSaidaDTO();

		ListarMunicipiosBalancetesRequest request = new ListarMunicipiosBalancetesRequest();
		ListarMunicipiosBalancetesResponse response = new ListarMunicipiosBalancetesResponse();

		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_150);
		request.setCodUf(GissUtil.isEmptyOrNull(codUf) ? 0 : codUf);
		request.setCodMunicipio(GissUtil.isEmptyOrNull(codMunicipio) ? 0L : codMunicipio);

		response = getFactoryAdapter().getListarMunicipiosBalancetesPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListarMunicipiosBalancetesSaidaDTO();
			
			saida.setCodMunicipio(response.getOcorrencias(i).getCodMunicipio());
			saida.setDescMunicipio(response.getOcorrencias(i).getDescMunicipio());
			
			listarMunicipiosBalancetes.add(new SelectItem(saida.getCodMunicipio(), saida.getDescMunicipio()));
		}
		
		Collections.sort (listarMunicipiosBalancetes, new Comparator<SelectItem> () {  
            public int compare (SelectItem p1, SelectItem p2) {  
                return p1.getLabel().compareTo (p2.getLabel());  
            }  
        });

		return listarMunicipiosBalancetes;
	}
	
	public GerarBalanceteFiscalizacoesIssSaidaDTO executarBalancete(GerarBalanceteFiscalizacoesIssDTO entrada) {
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
		
		ExecutarBalanceteFiscalizacoesIssRequest request = new ExecutarBalanceteFiscalizacoesIssRequest();
		
		request.setCodEmpresa(GissUtil.isEmptyOrNull(entrada.getEmpresa()) ? 0 : entrada.getEmpresa());
        request.setCodDependencia(GissUtil.isEmptyOrNull(entrada.getDependencia()) ? 0 : entrada.getDependencia());
        request.setCodUf(GissUtil.isEmptyOrNull(entrada.getEstado()) ? 0 : entrada.getEstado());
        request.setCodMunicipio(GissUtil.isEmptyOrNull(entrada.getMunicipio()) ? 0 : entrada.getMunicipio());

        Integer mesInicio = GissUtil.isEmptyOrNull(entrada.getPeriodoMesInicial()) ? 0 : entrada.getPeriodoMesInicial();
        Integer anoInicio = GissUtil.isEmptyOrNull(entrada.getPeriodoAnoInicial()) ? 0 : entrada.getPeriodoAnoInicial();
        
        request.setDtPeriodoInicial(Integer.parseInt(mesInicio + "" + anoInicio));
        
        Integer mesFim = GissUtil.isEmptyOrNull(entrada.getPeriodoMesFinal()) ? 0 : entrada.getPeriodoMesFinal();
        Integer anoFim = GissUtil.isEmptyOrNull(entrada.getPeriodoAnoFinal()) ? 0 : entrada.getPeriodoAnoFinal();
        
        request.setDtPeriodoFinal(Integer.parseInt(mesFim + "" + anoFim));
        
        request.setIndFechadoSimulado(GissUtil.isEmptyOrNull(entrada.getFechadoSimulado()) ? "" : entrada.getFechadoSimulado());
        request.setIndConsolidado(entrada.isConsolidado() ? "S" : "N");
        request.setCodNivelConta(GissUtil.isEmptyOrNull(entrada.getNivelConta()) ? "" : entrada.getNivelConta().toString());
        request.setCodGrupoInicial(GissUtil.isEmptyOrNull(entrada.getGrupoContaInicial()) ? 0 : entrada.getGrupoContaInicial());
        request.setCodGrupoFinal(GissUtil.isEmptyOrNull(entrada.getGrupoContaFinal()) ? 0 : entrada.getGrupoContaFinal());

		ExecutarBalanceteFiscalizacoesIssResponse response = getFactoryAdapter().getExecutarBalanceteFiscalizacoesIssPDCAdapter().invokeProcess(request);

		saida.setCodMensagem(response.getCodMensagem());
		saida.setMensagem(response.getMensagem());
	
		return saida;
		
	}
	
	public List<ListarPedidoBalancetesSaidaDTO> listarPedidoBalancetes(Integer codTipoBalancete) {

		ListarPedidoBalancetesSaidaDTO saida;
		
		List<ListarPedidoBalancetesSaidaDTO> listaPedidoBalancetes = new ArrayList<ListarPedidoBalancetesSaidaDTO>();
		
		ListarPedidoBalancetesRequest request = new ListarPedidoBalancetesRequest();		
		
		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_50);
		request.setCodTipoBalancete(codTipoBalancete);

		ListarPedidoBalancetesResponse response = getFactoryAdapter().getListarPedidoBalancetesPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListarPedidoBalancetesSaidaDTO();
			
			saida.setCodSolicitacaoBalancete(response.getOcorrencias(i).getCodSolicitacaoBalancete());
            saida.setCodTipoBalancete(response.getOcorrencias(i).getCodTipoBalancete());
            saida.setDtInicioPesquisa(response.getOcorrencias(i).getDtInicioPesquisa());
            
            String dtPeriodoIni = "";
            String mesPeriodoIni = "";
            String anoPeriodoIni = "";
            
            if(saida.getDtInicioPesquisa() != null){
            	dtPeriodoIni = saida.getDtInicioPesquisa().toString();
            	
            	if(dtPeriodoIni.length() >= 5){
            		mesPeriodoIni = dtPeriodoIni.substring(4);
            		anoPeriodoIni = dtPeriodoIni.substring(0,4);
            		
            		saida.setPeriodoInicial(mesPeriodoIni + "/" + anoPeriodoIni);
            	}else{
            		dtPeriodoIni = "";
            		
            		saida.setPeriodoInicial(dtPeriodoIni);
            	}
            }
            
            saida.setDtFimPesquisa(response.getOcorrencias(i).getDtFimPesquisa());
            
            String dtPeriodoFim = "";
            String mesPeriodoFim = "";
            String anoPeriodoFim = "";
            
            if(saida.getDtFimPesquisa() != null){
            	dtPeriodoFim = saida.getDtFimPesquisa().toString();
            	
            	if(dtPeriodoFim.length() >= 5){
            		mesPeriodoFim = dtPeriodoFim.substring(4);
            		anoPeriodoFim = dtPeriodoFim.substring(0,4);
            		
            		saida.setPeriodoFinal(mesPeriodoFim + "/" + anoPeriodoFim);
            	}else{
            		dtPeriodoFim = "";
            		
            		saida.setPeriodoFinal(dtPeriodoFim);
            	}
            }
            saida.setDescUf(response.getOcorrencias(i).getDescUf());
            saida.setDescEmpresa(response.getOcorrencias(i).getDescEmpresa());
            saida.setDescMunicipio(response.getOcorrencias(i).getDescMunicipio());
            saida.setCodSituacaoPedido(response.getOcorrencias(i).getCodSituacaoPedido());
            saida.setDescSituacaoPedido(response.getOcorrencias(i).getDescSituacaoPedido());
            saida.setCodDependencia(response.getOcorrencias(i).getCodDependencia());
            
            saida.setCodDependenciaFormatado(saida.getCodDependencia() <= 0 ? "" : saida.getCodDependencia().toString());
            
            saida.setHrInclusaoPedido(response.getOcorrencias(i).getHrInclusaoPedido());
            
            String dtSolicitacao = "";
            String diaSolicitacao = "";
            String mesSolicitacao = "";
            String anoSolicitacao = "";
            
            if(saida.getHrInclusaoPedido() != null){
            	dtSolicitacao = saida.getHrInclusaoPedido().toString().replace("-", "");
            	
            	if(dtSolicitacao.length() >= 7){
            		diaSolicitacao = dtSolicitacao.substring(6);
            		mesSolicitacao = dtSolicitacao.substring(4,6);
            		anoSolicitacao = dtSolicitacao.substring(0,4);
            		
            		saida.setDataSolicitacao(diaSolicitacao + "/" + mesSolicitacao + "/" + anoSolicitacao);
            	}else{
            		dtSolicitacao = "";
            		
            		saida.setDataSolicitacao(dtSolicitacao);
            	}
            }

			listaPedidoBalancetes.add(saida);
		}

		return listaPedidoBalancetes;

	}
	
	public ListarBalancetesSaidaDTO listarBalancetes(ListarBalancetesEntradaDTO entrada) {

		ListarBalancetesSaidaDTO saida = new ListarBalancetesSaidaDTO();
		ListarBalancetesOcorrenciasSaidaDTO itemLista = new ListarBalancetesOcorrenciasSaidaDTO();
		
		List<ListarBalancetesOcorrenciasSaidaDTO> listaBalancetes = new ArrayList<ListarBalancetesOcorrenciasSaidaDTO>();
		
		ListarBalancetesRequest request = new ListarBalancetesRequest();		
		
		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_80);
		request.setCodSolicitacaoBalancete(entrada.getCodSolicitacaoBalancete());
		request.setCodMunicipio(entrada.getCodMunicipio());
		request.setDtMesAno(entrada.getDtMesAno());
		request.setCodDependencia(entrada.getCodDependencia());

		ListarBalancetesResponse response = getFactoryAdapter().getListarBalancetesPDCAdapter().invokeProcess(request);

		saida.setCodEmpresa(response.getCodEmpresa());
		saida.setDescEmpresa(response.getDescEmpresa());
		saida.setCpfCnpj(response.getCpfCnpj());
		saida.setControle(response.getControle());
		saida.setFilial(response.getFilial());
		saida.setCodGrupoInicio(response.getCodGrupoInicio());
		saida.setCodGrupoFim(response.getCodGrupoFim());
		saida.setCodNivelConta(response.getCodNivelConta());
		saida.setDescDependencia(response.getDescDependencia());
		saida.setDescMunicipio(response.getDescMunicipio());
		saida.setSiglaUf(response.getSiglaUf());
		saida.setCodTipoBalancete(response.getCodTipoBalancete());

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			itemLista = new ListarBalancetesOcorrenciasSaidaDTO();

			itemLista.setCodSolicitacaoBalancete(response.getOcorrencias(i).getCodSolicitacaoBalancete());
            itemLista.setSeqApuracaoBalancete(response.getOcorrencias(i).getSeqApuracaoBalancete());
            itemLista.setCodCosif(response.getOcorrencias(i).getCodCosif());
            itemLista.setCodGrupoContabil(response.getOcorrencias(i).getCodGrupoContabil());
            itemLista.setCodSubgrupoContabil(response.getOcorrencias(i).getCodSubgrupoContabil());
            itemLista.setCodConta(response.getOcorrencias(i).getCodConta());
            itemLista.setDigConta(response.getOcorrencias(i).getDigConta());
            itemLista.setSinalSaldoAnterior(response.getOcorrencias(i).getSinalSaldoAnterior());
            itemLista.setVlrSaldoAnterior(response.getOcorrencias(i).getVlrSaldoAnterior());
            itemLista.setVlrSaldoDebito(response.getOcorrencias(i).getVlrSaldoDebito());
            itemLista.setVlrSaldoCredito(response.getOcorrencias(i).getVlrSaldoCredito());
            itemLista.setSinalSaldoAtual(response.getOcorrencias(i).getSinalSaldoAtual());
            itemLista.setVlrSaldoAtual(response.getOcorrencias(i).getVlrSaldoAtual());
            itemLista.setNivelLancamento(response.getOcorrencias(i).getNivelLancamento());
            itemLista.setDescLancamento(response.getOcorrencias(i).getDescLancamento());

			listaBalancetes.add(itemLista);
		}
		
		saida.setListarBalancetesOcorrencias(listaBalancetes);

		return saida;

	}
	
	public List<ListaIntermediariaBalancetesSaidaDTO> listaIntermediariaBalancetes(Long codSolicitacaoBalancete, Integer codTipoBalancete) {

		ListaIntermediariaBalancetesSaidaDTO saida;
		
		List<ListaIntermediariaBalancetesSaidaDTO> listaIntermediariaBalancetes = new ArrayList<ListaIntermediariaBalancetesSaidaDTO>();
		
		ListaIntermediariaBalancetesRequest request = new ListaIntermediariaBalancetesRequest();		
		
		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_50);
		request.setCodSolicitacaoBalancete(codSolicitacaoBalancete);
		request.setCodTipoBalancete(codTipoBalancete);

		ListaIntermediariaBalancetesResponse response = getFactoryAdapter().getListaIntermediariaBalancetesPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListaIntermediariaBalancetesSaidaDTO();
			
			saida.setCodSolicitacaoBalancete(response.getOcorrencias(i).getCodSolicitacaoBalancete());
            saida.setDtMesAnoApuracao(response.getOcorrencias(i).getDtMesAnoApuracao());

            String dtIni = "";
            String mesIni = "";
            String anoIni = "";
            
            if(saida.getDtMesAnoApuracao() != null){
            	dtIni = saida.getDtMesAnoApuracao().toString();
            	
            	if(dtIni.length() > 5){
            		mesIni = dtIni.substring(4);
            		anoIni = dtIni.substring(0,4);
            		
            		saida.setPeriodo(mesIni + "/" + anoIni);
            	}else if(dtIni.length() == 5){
            		mesIni = "0" + dtIni.substring(4);
            		anoIni = dtIni.substring(0,4);
            		
            		saida.setPeriodo(mesIni + "/" + anoIni);
            	}else{
            		dtIni = "";
            		
            		saida.setPeriodo(dtIni);
            	}
            }
            
            saida.setCodEmpresa(response.getOcorrencias(i).getCodEmpresa());
            saida.setDescEmpresa(response.getOcorrencias(i).getDescEmpresa());
            saida.setCodUf(response.getOcorrencias(i).getCodUf());
            saida.setSiglaUf(response.getOcorrencias(i).getSiglaUf());
            saida.setCodMunicipio(response.getOcorrencias(i).getCodMunicipio());
            saida.setDescMunicipio(response.getOcorrencias(i).getDescMunicipio());
            saida.setCodDependencia(response.getOcorrencias(i).getCodDependencia());
            
            if("".equals(GissUtil.replaceAll(saida.getCodDependencia().toString(), "0", ""))){
            	saida.setCodDependenciaFormatado("CONSOLIDADO");
            }else{
            	saida.setCodDependenciaFormatado(saida.getCodDependencia().toString());
            }

            listaIntermediariaBalancetes.add(saida);
		}

		return listaIntermediariaBalancetes;

	}
	
	public List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados() {

		ListarBalancetesParametrizadosSaidaDTO saida;
		
		List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados = new ArrayList<ListarBalancetesParametrizadosSaidaDTO>();
		
		ListarBalancetesParametrizadosRequest request = new ListarBalancetesParametrizadosRequest();		
		
		request.setQtdeMaxOcorrencias(MAX_OCORRENCIA_100);

		ListarBalancetesParametrizadosResponse response = getFactoryAdapter().getListarBalancetesParametrizadosPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getOcorrenciasCount(); i++) {
			saida = new ListarBalancetesParametrizadosSaidaDTO();
			
			saida.setCodMunicipio(response.getOcorrencias(i).getCodMunicipio());
            saida.setCodGrupo(response.getOcorrencias(i).getCodGrupo());
            
            if("1".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("X");
            	saida.setCodGrupo8("");
            	saida.setCodDemaisGrupos("");
            }else if("2".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("");
            	saida.setCodGrupo8("X");
            	saida.setCodDemaisGrupos("");
            }else if("3".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("X");
            	saida.setCodGrupo8("X");
            	saida.setCodDemaisGrupos("");
            }else if("4".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("");
            	saida.setCodGrupo8("");
            	saida.setCodDemaisGrupos("X");
            }else if("5".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("X");
            	saida.setCodGrupo8("");
            	saida.setCodDemaisGrupos("X");
            }else if("6".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("");
            	saida.setCodGrupo8("X");
            	saida.setCodDemaisGrupos("X");
            }else if("7".equals(saida.getCodGrupo())){
            	saida.setCodGrupo7("X");
            	saida.setCodGrupo8("X");
            	saida.setCodDemaisGrupos("X");
            }else{
            	saida.setCodGrupo7("");
            	saida.setCodGrupo8("");
            	saida.setCodDemaisGrupos("");
            }
            
            saida.setSiglaUf(response.getOcorrencias(i).getSiglaUf());
            saida.setDescMunicipio(response.getOcorrencias(i).getDescMunicipio());

            listarBalancetesParametrizados.add(saida);
		}

		return listarBalancetesParametrizados;

	}
	
	public GerarBalanceteFiscalizacoesIssSaidaDTO incluirBalancete(IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada) {
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
		
		IncluirBalanceteRequest request = new IncluirBalanceteRequest();
		
        request.setCodMunicipio(GissUtil.isEmptyOrNull(entrada.getCodMunicipio()) ? 0 : entrada.getCodMunicipio());
        request.setCodGrupo(GissUtil.isEmptyOrNull(entrada.getCodGrupo()) ? "" : entrada.getCodGrupo());

        IncluirBalanceteResponse response = getFactoryAdapter().getIncluirBalancetePDCAdapter().invokeProcess(request);

		saida.setCodMensagem(response.getCodMensagem());
		saida.setMensagem(response.getMensagem());
	
		return saida;
		
	}
	
	public GerarBalanceteFiscalizacoesIssSaidaDTO excluirBalancete(IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada) {
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
		
		ExcluirBalanceteRequest request = new ExcluirBalanceteRequest();
		
        request.setCodMunicipio(GissUtil.isEmptyOrNull(entrada.getCodMunicipio()) ? 0 : entrada.getCodMunicipio());
        request.setCodGrupo(GissUtil.isEmptyOrNull(entrada.getCodGrupo()) ? "" : entrada.getCodGrupo());

        ExcluirBalanceteResponse response = getFactoryAdapter().getExcluirBalancetePDCAdapter().invokeProcess(request);

		saida.setCodMensagem(response.getCodMensagem());
		saida.setMensagem(response.getMensagem());
	
		return saida;
		
	}
	
	public GerarBalanceteFiscalizacoesIssSaidaDTO gerarBalancete(GerarBalanceteObrigacoesAcessoriasDTO entrada) {
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
		
		GerarBalanceteRequest request = new GerarBalanceteRequest();
		
		Integer mesInicial = 0;
		Integer anoInicial = 0;
		Integer mesFinal = 0;
		Integer anoFinal = 0;
		
		if(entrada.getPeriodoMesInicial() == null){
			mesInicial = 0;
		}else{
			mesInicial = entrada.getPeriodoMesInicial();
		}
		
		if(entrada.getPeriodoAnoInicial() == null){
			anoInicial = 0;
		}else{
			anoInicial = entrada.getPeriodoAnoInicial();
		}
		
		if(entrada.getPeriodoMesFinal() == null){
			mesFinal = 0;
		}else{
			mesFinal = entrada.getPeriodoMesFinal();
		}
		
		if(entrada.getPeriodoAnoFinal() == null){
			anoFinal = 0;
		}else{
			anoFinal = entrada.getPeriodoAnoFinal();
		}
		
		entrada.setPeriodoMesAnoInicial(Integer.parseInt(mesInicial + "" + anoInicial));
		entrada.setPeriodoMesAnoFinal(Integer.parseInt(mesFinal + "" + anoFinal));
		
        request.setDtMesAnoInicio(GissUtil.isEmptyOrNull(entrada.getPeriodoMesAnoInicial()) ? 0 : entrada.getPeriodoMesAnoInicial());
        request.setDtMesAnoFim(GissUtil.isEmptyOrNull(entrada.getPeriodoMesAnoFinal()) ? 0 : entrada.getPeriodoMesAnoFinal());
        request.setCodTipoBalancete(GissUtil.isEmptyOrNull(entrada.getFechadoSimulado()) ? "" : entrada.getFechadoSimulado());

        GerarBalanceteResponse response = getFactoryAdapter().getGerarBalancetePDCAdapter().invokeProcess(request);

		saida.setCodMensagem(response.getCodMensagem());
		saida.setMensagem(response.getMensagem());
	
		return saida;
		
	}
}