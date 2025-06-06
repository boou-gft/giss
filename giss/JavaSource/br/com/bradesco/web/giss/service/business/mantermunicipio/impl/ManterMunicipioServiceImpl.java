/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/mantermunicipio/impl/ManterMunicipioServiceImpl.java,v $
 * $Id: ManterMunicipioServiceImpl.java,v 1.14 2018/06/14 10:16:11 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ManterMunicipioServiceImpl.java,v $
 * Revision 1.14  2018/06/14 10:16:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.13  2018/06/06 17:08:51  gmichelini
 * *** empty log message ***
 *
 * Revision 1.12  2018/05/04 10:29:41  gmichelini
 * *** empty log message ***
 *
 * Revision 1.11  2017/12/18 10:46:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.10  2017/12/14 17:46:42  gabrielmarani
 * *** empty log message ***
 *
 * Revision 1.9  2017/11/06 11:39:50  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2017/10/30 15:18:53  gabrielmarani
 * *** empty log message ***
 *
 * Revision 1.7  2017/08/14 20:08:42  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.6  2017/08/11 19:00:22  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.5  2017/06/12 18:20:26  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2017/06/09 11:56:20  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/06/06 23:39:07  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:10:43  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2013/02/04 12:22:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:31  gmichelini
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
 
package br.com.bradesco.web.giss.service.business.mantermunicipio.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.LegislacaoDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.IManterMunicipioService;
import br.com.bradesco.web.giss.service.business.mantermunicipio.IManterMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.AlteracaoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.ContaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.exceptions.MunicipioServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipio.IAlterarMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipio.request.AlterarMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipio.response.AlterarMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.response.AtualizarAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.IComboTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.response.ComboTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.response.ComboTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.IConsultarMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.request.ConsultarMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluirmunicipio.IExcluirMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirmunicipio.request.ExcluirMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirmunicipio.response.ExcluirMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.IListaMunicipiosEstadoManterPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.ListaMunicipiosEstadoManterResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.IListarContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.IListarDependenciasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.ListarDependenciasMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.IListarMunicipioManterAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.request.ListarMunicipioManterAllRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.integracao.mantermunicipio.ManterMunicipioReportTXT;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.contacontabil.TipoServicoComboBean;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;
import br.com.bradesco.web.giss.view.bean.model.tipoincidencia.TipoIncidenciaComboBean;

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
 * Implementação do adaptador: Mantermunicipio
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ManterMunicipioServiceImpl implements IManterMunicipioService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ManterMunicipioServiceImpl() {
        // TODO: Implementação
    }
    
    public List<SelectItem> listarComboEstados() throws PdcAdapterException, MunicipioServiceException {
		
		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IManterMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodigoUnidadeFederativa(IDependenciaServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
		lRequest.setNomeUnidadeFederativa("");
		lRequest.setSiglaUnidadeFederativa("");
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IComboEstadosPDCAdapter comboEstadosPDCAdapter = factoryAdapter.getComboEstadosPDCAdapter();
		ComboEstadosResponse lResponse = comboEstadosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeFederativa()));
			estadosCombo.setSigla(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
			estadosCombo.setNome(lResponse.getOcorrencias(i).getNomeUnidadeFederativa());
			comboEstadosList.add(new SelectItem(estadosCombo.getCodigo(),estadosCombo.getNome()));
		}
		
		return comboEstadosList;
	}    
    
    public List<SelectItem> listarComboTipoServico() throws PdcAdapterException, MunicipioServiceException {
		
    	List<SelectItem> comboTipoSetvicoList = new ArrayList<SelectItem>();
		ComboTipoServicoRequest lRequest = new ComboTipoServicoRequest();		
		lRequest.setTipoServico(0);
		lRequest.setNumeroMaximoOcorrencia(99);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IComboTipoServicoPDCAdapter comboTipoServicoPDCAdapter = factoryAdapter.getComboTipoServicoPDCAdapter();
		ComboTipoServicoResponse lResponse = comboTipoServicoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			TipoServicoComboBean tipoServCombo = new TipoServicoComboBean();
			tipoServCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoServico()));
			tipoServCombo.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoServico());
			comboTipoSetvicoList.add(new SelectItem(tipoServCombo.getCodigo(),tipoServCombo.getDescricao()));
		}
		
		return comboTipoSetvicoList;
	}
    
    public List<SelectItem> listarTipoIncidencia() throws PdcAdapterException, MunicipioServiceException {

		List<SelectItem> comboTipoIncidenciaList = new ArrayList<SelectItem>();
		ComboTipoIncidenciaRequest lRequest = new ComboTipoIncidenciaRequest();		
		lRequest.setQuantidadeOcorrencias(100);
		lRequest.setCodigoTipoIncidencia(0);


		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IComboTipoIncidenciaPDCAdapter comboTipoIncidenciaPDCAdapter = factoryAdapter.getComboTipoIncidenciaPDCAdapter();
		ComboTipoIncidenciaResponse lResponse = comboTipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			TipoIncidenciaComboBean tipoIncidenciaCombo = new TipoIncidenciaComboBean();
			tipoIncidenciaCombo.setCodigoTipoIncidencia(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoIncidencia()));
			tipoIncidenciaCombo.setDescricaoTipoIncidencia(lResponse.getOcorrencias(i).getDescricaoTipoIncidencia());
			comboTipoIncidenciaList.add(new SelectItem(tipoIncidenciaCombo.getCodigoTipoIncidencia(),tipoIncidenciaCombo.getDescricaoTipoIncidencia()));
		}

		return comboTipoIncidenciaList;
	}
        
    public List<MunicipioDTO> listarMunicipios(String codigoEstado, Long codMunicipio) throws PdcAdapterException, MunicipioServiceException {
    	
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
		lRequest.setQtdeRegistros(IManterMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodUF(Integer.valueOf(codigoEstado));
		lRequest.setCodMunicipio(codMunicipio);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarMunicipiosPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
		ListarMunicipiosResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQtdeReg(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio());
			municipioLista.setSigla(lResponse.getOcorrenciasMunicipios(i).getSiglaUF());
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		
		return municipiosListRetorno;
	}
    
    public MunicipioDTO listarMunicipiosManter(String codigoEstado, Long codMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {
    	
    	MunicipioDTO municipioDTO = new MunicipioDTO();
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
		ListarMunicipioManterAllRequest lRequest = new ListarMunicipioManterAllRequest();		
		lRequest.setQtdeOcorrencias(IManterMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodUf(Integer.valueOf(codigoEstado));
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setTipoPesquisa(tipoPesquisa);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarMunicipioManterAllPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getListarMunicipioManterAllPDCAdapter();
		ListarMunicipioManterAllResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getListaMunicipioCount(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getListaMunicipio(i).getCodMunicipio()));
			municipioLista.setNome(lResponse.getListaMunicipio(i).getDescMunicipio());
			municipioLista.setDataAtualizacao(lResponse.getListaMunicipio(i).getDataAtualizacao().replace(".", "/"));
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		municipioDTO.setLstMunicipios(municipiosListRetorno);
		
		municipioDTO.setLstLegislacao(buscarLegislacao(codigoEstado, codMunicipio, tipoPesquisa));
		
		return municipioDTO;
	}        
    private List<LegislacaoDTO> buscarLegislacao(String codigoEstado, Long codMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {
    	
    	ListaMunicipiosEstadoManterRequest lRequest = new ListaMunicipiosEstadoManterRequest();		
    	lRequest.setQtdeRegistro(IManterMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
    	lRequest.setCodUF(Integer.valueOf(codigoEstado));
    	lRequest.setCodMunicipio(codMunicipio);
    	lRequest.setTipoPesquisa(tipoPesquisa);
    	
    	/* **************************
    	 * 	INVOCA PROCESSO PDC		*
    	 * **************************/
    	
    	IListaMunicipiosEstadoManterPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getListaMunicipiosEstadoManterPDCAdapter();
    	ListaMunicipiosEstadoManterResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);
    	
    	List<LegislacaoDTO> lstLegislacao = new ArrayList<LegislacaoDTO>();
    	for(int i = 0 ; i < lResponse.getLegislacoesCount() ; i++){
    		if(lResponse.getLegislacoes(i).getCodigoLegislacao() != 0){
    			LegislacaoDTO legislacao = new LegislacaoDTO();
    			legislacao.setCodLegislacao(lResponse.getLegislacoes(i).getCodigoLegislacao());
    			legislacao.setDescLegislacao(lResponse.getLegislacoes(i).getDescLegislacao());
    			
    			lstLegislacao.add(legislacao);
    		}
    	}
    	
    	return lstLegislacao;
    }        
    
    public List<ContaMunicipioDTO> listarContasPorTipoServico(String codigoMunicipio, String codigoTipoServico) throws PdcAdapterException, MunicipioServiceException {
    	
    	List<ContaMunicipioDTO> municipiosListRetorno = new ArrayList<ContaMunicipioDTO>();
		ListarContasTipoServicoRequest lRequest = new ListarContasTipoServicoRequest();		
		lRequest.setNumeroMaximoOcorrencia(220);
		lRequest.setCodigoMunicipio(Long.valueOf(codigoMunicipio));
		lRequest.setCodigoTipoServicoV(Integer.valueOf(codigoTipoServico));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarContasTipoServicoPDCAdapter listarContasTipoServicoPDCAdapter = factoryAdapter.getListarContasTipoServicoPDCAdapter();
		ListarContasTipoServicoResponse lResponse = listarContasTipoServicoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencia(); i++) {
			ContaMunicipioDTO contaMunicipioLista = new ContaMunicipioDTO();
				contaMunicipioLista.setCodigoTributo(String.valueOf(lResponse.getListaContasTipoServico(i).getCodigoTributo()));
				contaMunicipioLista.setAliquota(NumberUtils.format(lResponse.getListaContasTipoServico(i).getPercentualAliquota()));
				contaMunicipioLista.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContasTipoServico(i).getCodGrupo() , lResponse.getListaContasTipoServico(i).getCodSubGrupo()));
				contaMunicipioLista.setConta(lResponse.getListaContasTipoServico(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaContasTipoServico(i).getNumeroConta()),7)+"-"+ lResponse.getListaContasTipoServico(i).getDigitoConta());
				contaMunicipioLista.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getListaContasTipoServico(i).getCodigoConta()),contaMunicipioLista.getRazao()));
				contaMunicipioLista.setDescricao(lResponse.getListaContasTipoServico(i).getDescricaoRazao());
				
				contaMunicipioLista.setDtInicioVigencia(DateUtils.convertDatePdc(lResponse.getListaContasTipoServico(i).getDtInicioVigencia()));
				contaMunicipioLista.setDtFinalVigencia(DateUtils.convertDatePdc(lResponse.getListaContasTipoServico(i).getDtFinalVigencia()));
				contaMunicipioLista.setLinha(cont++);
				municipiosListRetorno.add(contaMunicipioLista);
				
		}
		
		return municipiosListRetorno;
	}        
    
    public List<AgenciaDTO> listarAgenciasMunicipio(String codigoMunicipio) throws PdcAdapterException, MunicipioServiceException {
    	
    	List<AgenciaDTO> agenciasMunicipiosList = new ArrayList<AgenciaDTO>();
		ListarDependenciasMunicipioRequest lRequest = new ListarDependenciasMunicipioRequest();		
		lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
		lRequest.setCodMunicipio(Long.parseLong(codigoMunicipio));
		lRequest.setCodDependencia(0);
		lRequest.setCodPessoaJuridica(0);
		lRequest.setQtdDependenciasAtivas(0);
		lRequest.setQtdDependenciasEncer(0);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarDependenciasMunicipioPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarDependenciasMunicipioPDCAdapter();
		ListarDependenciasMunicipioResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			AgenciaDTO dependMunicipioDTO = new AgenciaDTO();
			dependMunicipioDTO.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrencias(i).getCodPessoaJuridica()));
			dependMunicipioDTO.setCodigoDependencia(String.valueOf(lResponse.getOcorrencias(i).getCodDependencia()));
			dependMunicipioDTO.setNumeroSequencialDependencia(String.valueOf(lResponse.getOcorrencias(i).getNumSeqPessoaJuridica()));
			dependMunicipioDTO.setDescricaoDependencia(lResponse.getOcorrencias(i).getDescDependencia());
			dependMunicipioDTO.setDataAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/"));
			dependMunicipioDTO.setLinha(cont++);
			agenciasMunicipiosList.add(dependMunicipioDTO);
		}
		
		return agenciasMunicipiosList;
    }    	
    
    public DetalheMunicipioDTO detalharMunicipio(String codigoMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {

    	DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();		
		ConsultarMunicipioRequest lRequest = new ConsultarMunicipioRequest();		
		
		lRequest.setCodMunicipio(Integer.valueOf(codigoMunicipio));
		lRequest.setTipoPesquisa(tipoPesquisa);
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarMunicipioPDCAdapter municipioPDCAdapter = factoryAdapter.getConsultarMunicipioPDCAdapter();
		ConsultarMunicipioResponse lResponse = municipioPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		detMunicipioDTORetorno.setPercentualAliquota(String.valueOf(lResponse.getPercentualAliquotaMunicipio()).replace(".", ","));
		detMunicipioDTORetorno.setPercentualAliquotaPadrao(String.valueOf(lResponse.getPercentualAliquotaPadrao()).replace(".", ","));		
		detMunicipioDTORetorno.setPercentualBaseCalculo(String.valueOf(lResponse.getPercentualBaseAliquota()).replace(".", ","));
		detMunicipioDTORetorno.setDiaVencimento(String.valueOf(lResponse.getDiaVencimentoTribut()));
		detMunicipioDTORetorno.setDescFormaPagamento(String.valueOf(lResponse.getCodigoFormaPagamento()));
		detMunicipioDTORetorno.setDescTipoIncidencia(String.valueOf(lResponse.getCodigoTipoIncidencia()));
		detMunicipioDTORetorno.setNomeTipoIncidencia(lResponse.getNomeTipoIncidencia());
		detMunicipioDTORetorno.setNomeUnidadeFederativa(lResponse.getDescricaoUF());
		detMunicipioDTORetorno.setPagtoDiaUtil(String.valueOf(lResponse.getIndNecessidadePagtoDiaUtil()));
		detMunicipioDTORetorno.setIndiceVigencia(lResponse.getIndiceVigencia());
		detMunicipioDTORetorno.setUfCentralizadora(lResponse.getUFCentralizadora());
		detMunicipioDTORetorno.setCodigoMunicipioCentralizadora(lResponse.getCodigoMunicipioCentralizadora());
		detMunicipioDTORetorno.setDescricaoMunicipio(lResponse.getDescricaoMunicipio());
		detMunicipioDTORetorno.setDependenciaCentralizadora(String.valueOf(lResponse.getCodigoDependenciaCentralizadora()) + " - " + lResponse.getDescricaoDependenciaCentralizadora());
		detMunicipioDTORetorno.setCodigoDependRespRecolhimento(lResponse.getCodigoDependenciaCentralizadora());
		detMunicipioDTORetorno.setNomeDependRespRecolhimento(lResponse.getDescricaoDependenciaCentralizadora());
		detMunicipioDTORetorno.setCodigoPessoaJuridica("" + lResponse.getCodigoPessoaJuridicaCentralizadora());
		detMunicipioDTORetorno.setNumeroSequencialCentralizadora("" + lResponse.getNumeroSequencialCentralizadora());
		detMunicipioDTORetorno.setNroLei("" + lResponse.getCodigoLegislacaoVigente());
		detMunicipioDTORetorno.setDescLei(lResponse.getDescLegislacaoVigente());
		detMunicipioDTORetorno.setInfoComplementar(lResponse.getItemComplementarLei());
		detMunicipioDTORetorno.setTipoPesquisa(lResponse.getTipoPesquisa());
		
		return detMunicipioDTORetorno;
	}
    
    public DetalheMunicipioDTO excluirMunicipio(String codigoMunicipio) throws PdcAdapterException, MunicipioServiceException {
		
    	DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();
		
		ExcluirMunicipioRequest excluirMunicipio = new ExcluirMunicipioRequest();
		excluirMunicipio.setCodigoMunicipio(Integer.valueOf(codigoMunicipio));

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IExcluirMunicipioPDCAdapter excluirMunicipioPDCAdapter = factoryAdapter.getExcluirMunicipioPDCAdapter();
		ExcluirMunicipioResponse lResponse = excluirMunicipioPDCAdapter.invokeProcess(excluirMunicipio);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		detMunicipioDTORetorno.setCodigoErro(lResponse.getCodMensagem());
		detMunicipioDTORetorno.setMensagemErro(lResponse.getMensagem());
	
		return detMunicipioDTORetorno;
		
    }
    
    public DetalheMunicipioDTO alterarMunicipio(AlteracaoMunicipioDTO alteracaoMunicipioDTO) throws PdcAdapterException, MunicipioServiceException {
		
    	DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();
		
		AlterarMunicipioRequest alterarMunicipio = new AlterarMunicipioRequest();
		
		if(alteracaoMunicipioDTO.getIndNecessidadePagtoDiaUtil().equals("1")){
			alterarMunicipio.setIndNecessidadePagtoDiaUtil("S");
		}else{
			alterarMunicipio.setIndNecessidadePagtoDiaUtil("N");
		}
		
		alterarMunicipio.setCodigoFormaPagamento(Integer.valueOf(alteracaoMunicipioDTO.getCodigoFormaPagamento()));
		alterarMunicipio.setCodigoMunicipio(Long.valueOf(alteracaoMunicipioDTO.getCodigoMunicipio()));
		alterarMunicipio.setCodigoTipoIncidencia(Integer.valueOf(alteracaoMunicipioDTO.getCodigoTipoIncidencia()));	
		alterarMunicipio.setCodigoUnidadeOrganizacional(Long.valueOf(alteracaoMunicipioDTO.getCodigoUnidadeOrganizacional()));
		alterarMunicipio.setDiaVencimento(Integer.valueOf(alteracaoMunicipioDTO.getDiaVencimento()));
		alterarMunicipio.setNumeroUnidadeOrganizacional(Integer.valueOf(alteracaoMunicipioDTO.getNumeroUnidadeOrganizacional()));
		alterarMunicipio.setPercentualAliquotaPadrao(new BigDecimal(alteracaoMunicipioDTO.getPercentualAliquotaPadrao().replace(",", ".")));
		alterarMunicipio.setPercentualBaseAliquota(new BigDecimal(alteracaoMunicipioDTO.getPercentualBaseAliquota().replace(",", ".")));
		alterarMunicipio.setCodigoLegislacaoVigente(Integer.parseInt(alteracaoMunicipioDTO.getNroLei()));
		alterarMunicipio.setItemComplementarLei(alteracaoMunicipioDTO.getInforComplementar());
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IAlterarMunicipioPDCAdapter alterarMunicipioPDCAdapter = factoryAdapter.getAlterarMunicipioPDCAdapter();
		AlterarMunicipioResponse lResponse = alterarMunicipioPDCAdapter.invokeProcess(alterarMunicipio);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		detMunicipioDTORetorno.setCodigoErro(lResponse.getCodMensagem());
		detMunicipioDTORetorno.setMensagemErro(lResponse.getMensagem());
	
		return detMunicipioDTORetorno;
		
    }

	public String atualizarAliquota(Integer codTipoServico, Long codMunicipio, String aliquota) throws PdcAdapterException, MunicipioServiceException {
		AtualizarAliquotaRequest request = new AtualizarAliquotaRequest();
		AtualizarAliquotaResponse response = null;
		
		request.setAliquota(Double.valueOf(aliquota.replace(",", ".")));
		request.setCodMunicipio(codMunicipio);
		request.setCodTipoServico(codTipoServico);

		/*************************** INVOCA PROCESSO PDC ****************************/

		response = factoryAdapter.getAtualizarAliquotaPDCAdapter().invokeProcess(request);

		/*************************** RESULTADO DA CONSULTA **************************/

		return response.getMensagem();

	}

    public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
	public MunicipioDTO listarMunicipiosManterAll(String codigoEstado, Long codMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {
    	
    	MunicipioDTO municipioDTO = new MunicipioDTO();
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
    	ListarMunicipioManterAllRequest lRequest = new ListarMunicipioManterAllRequest();		
		lRequest.setQtdeOcorrencias(IManterMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodUf(Integer.valueOf(codigoEstado));
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setTipoPesquisa(tipoPesquisa);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarMunicipioManterAllPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getListarMunicipioManterAllPDCAdapter();
		ListarMunicipioManterAllResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getListaMunicipioCount(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getListaMunicipio(i).getCodMunicipio()));
			municipioLista.setNome(lResponse.getListaMunicipio(i).getDescMunicipio());
			municipioLista.setDataAtualizacao(lResponse.getListaMunicipio(i).getDataAtualizacao().replace(".", "/"));
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		municipioDTO.setLstMunicipios(municipiosListRetorno);
		
		return municipioDTO;
	}        
	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarListaMunicipioTXT(List<MunicipioDTO> listaMunicipios, OutputStream outputStream) throws DocumentException, ReportException, IOException {
		new ManterMunicipioReportTXT(listaMunicipios,outputStream).gerar();
	}
    
}

