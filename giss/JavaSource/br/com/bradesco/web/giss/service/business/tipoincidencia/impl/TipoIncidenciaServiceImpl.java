/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	GISS
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/tipoincidencia/impl/TipoIncidenciaServiceImpl.java,v $
 * $Id: TipoIncidenciaServiceImpl.java,v 1.4 2017/12/14 16:35:40 jaquelinebrito Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: TipoIncidenciaServiceImpl.java,v $
 * Revision 1.4  2017/12/14 16:35:40  jaquelinebrito
 * Ajuste fluxo
 *
 * Revision 1.3  2017/11/06 11:39:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/07/25 18:15:19  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:12:47  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:38:44  gmichelini
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

package br.com.bradesco.web.giss.service.business.tipoincidencia.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.tipoincidencia.ITipoIncidenciaService;
import br.com.bradesco.web.giss.service.business.tipoincidencia.ITipoIncidenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.HistoricoTipoIncidenciaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.TipoIncidenciaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.TipoIncidenciaFaixasDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.exceptions.TipoIncidenciaServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.IConsultarHistoricoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.request.ConsultarHistoricoTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.ConsultarHistoricoTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultartipoincidencia.IConsultarTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultartipoincidencia.request.ConsultarTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultartipoincidencia.response.ConsultarTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.IDetalharHistoricoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.response.DetalharHistoricoTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.IIncluirTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.response.IncluirTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.IListarTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.response.ListarTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.IManterTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.ManterTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.response.ManterTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.validainclusaotipoincidencia.IValidaInclusaoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.validainclusaotipoincidencia.request.ValidaInclusaoTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.validainclusaotipoincidencia.response.ValidaInclusaoTipoIncidenciaResponse;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: TipoIncidencia
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class TipoIncidenciaServiceImpl implements ITipoIncidenciaService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public TipoIncidenciaServiceImpl() {
		// TODO: Implementação
	}
	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoIncidencia' e retorna uma lista de TipoIncidencia
	 * 
	 * @return tipoIncidenciaList
	 */
	public List<TipoIncidenciaDTO> listaGridTipoIncidencia() throws PdcAdapterException, TipoIncidenciaServiceException {

		TipoIncidenciaDTO tipoIncidencia;
		List<TipoIncidenciaDTO> tipoIncidenciaList = new ArrayList<TipoIncidenciaDTO>();
		ListarTipoIncidenciaRequest lRequest = new ListarTipoIncidenciaRequest();		
		lRequest.setCodigoTipoIncidencia(0);
		lRequest.setDescricao("");
		lRequest.setFuncao("");

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarTipoIncidenciaPDCAdapter tipoIncidenciaPDCAdapter = factoryAdapter.getListarTipoIncidenciaPDCAdapter();
		ListarTipoIncidenciaResponse lResponse = tipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		int cont = 0;

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			tipoIncidencia = new TipoIncidenciaDTO();
			tipoIncidencia.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoIncidencia()));
			tipoIncidencia.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoIncidencia());
			tipoIncidencia.setDtAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao());
			tipoIncidencia.setNumeroRegistro(cont++);
			tipoIncidencia.setCodigoFuncional(lResponse.getOcorrencias(i).getCodigoFuncional());
			tipoIncidenciaList.add(tipoIncidencia);
		}

		return tipoIncidenciaList;

	}
	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoIncidencia Histórico' e retorna uma lista de TipoIncidencia
	 * 
	 * @return tipoIncidenciaList
	 */
	public List<HistoricoTipoIncidenciaDTO> listaHistoricoTipoIncidencia(Date dataInicial, Date dataFinal) throws PdcAdapterException, TipoIncidenciaServiceException {

		HistoricoTipoIncidenciaDTO histTipoIncidencia;
		List<HistoricoTipoIncidenciaDTO> histTipoIncidenciaList = new ArrayList<HistoricoTipoIncidenciaDTO>();
		ConsultarHistoricoTipoIncidenciaRequest lRequest = new ConsultarHistoricoTipoIncidenciaRequest();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

		String dataIni = dateFormat.format(dataInicial);
		String dataFim = dateFormat.format(dataFinal);
		
		lRequest.setQuantidadeOcorrencias(ITipoIncidenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_HISTORICO_TIPO_INCIDENCIA);
		lRequest.setDataInicial(Integer.valueOf(dataIni));
		lRequest.setDataFinal(Integer.valueOf(dataFim));

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarHistoricoTipoIncidenciaPDCAdapter histTipoIncidenciaPDCAdapter = factoryAdapter.getConsultarHistoricoTipoIncidenciaPDCAdapter();
		ConsultarHistoricoTipoIncidenciaResponse lResponse = histTipoIncidenciaPDCAdapter.invokeProcess(lRequest);
		int cont = 0;
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			histTipoIncidencia = new HistoricoTipoIncidenciaDTO();
			histTipoIncidencia.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoIncidencia()));
			histTipoIncidencia.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoIncidencia());
			histTipoIncidencia.setAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/"));
			histTipoIncidencia.setExclusao(lResponse.getOcorrencias(i).getDataExclusao().replace(".", "/"));
			histTipoIncidencia.setHrManutencaoRegistro(lResponse.getOcorrencias(i).getHrManutencaoRegistro());
			histTipoIncidencia.setAlteracao(lResponse.getOcorrencias(i).getHoraAtualizacao());
			histTipoIncidencia.setCodigoFuncional(lResponse.getOcorrencias(i).getCodUsuario());
			histTipoIncidencia.setLinha(cont++);
			histTipoIncidenciaList.add(histTipoIncidencia);
		}

		return histTipoIncidenciaList;

	}

	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoIncidencia' e retorna uma lista de TipoIncidencia
	 * 
	 * @return tipoIncidenciaList
	 */
	public TipoIncidenciaDTO consultarTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) throws PdcAdapterException, TipoIncidenciaServiceException {

		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();		
		List<TipoIncidenciaFaixasDTO> tipoIncidenciafaixasList = new ArrayList<TipoIncidenciaFaixasDTO>();
		ConsultarTipoIncidenciaRequest lRequest = new ConsultarTipoIncidenciaRequest();		
		
		lRequest.setCodigoTipoIncidencia(new Integer(tipoIncidenciaDTO.getCodigo()));
		lRequest.setDescricaoTipoIncidencia(tipoIncidenciaDTO.getDescricao());
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarTipoIncidenciaPDCAdapter tipoIncidenciaPDCAdapter = factoryAdapter.getConsultarTipoIncidenciaPDCAdapter();
		ConsultarTipoIncidenciaResponse lResponse = tipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		//retorno
		tipoIncidenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoIncidenciaDTORetorno.setMensagem(lResponse.getMensagem());
		
		tipoIncidenciaDTORetorno.setCodigo(String.valueOf(lResponse.getCodigoTipoIncidencia()));
		tipoIncidenciaDTORetorno.setDescricao(lResponse.getDescricaoTipoIncidencia());
		tipoIncidenciaDTORetorno.setDatainiciovigencia(lResponse.getDataInicioVigencia());
		tipoIncidenciaDTORetorno.setDatafinalvigencia(lResponse.getDataFinalVigencia());

		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			TipoIncidenciaFaixasDTO tipoIncidenciafaixas = new TipoIncidenciaFaixasDTO();
			tipoIncidenciafaixas.setValorinicial(lResponse.getOcorrencias(i).getValorInicial());
			tipoIncidenciafaixas.setValorfinal(lResponse.getOcorrencias(i).getValorFinal());
			tipoIncidenciafaixas.setValoraliquota(lResponse.getOcorrencias(i).getValorAliquota());
			tipoIncidenciafaixas.setValorRedutor(lResponse.getOcorrencias(i).getValorRedutor());
			tipoIncidenciafaixas.setNumsequencial(lResponse.getOcorrencias(i).getNumeroSequencial());
			tipoIncidenciafaixasList.add(tipoIncidenciafaixas);
		}
		
		tipoIncidenciaDTORetorno.setListaFaixasTipoIncidencia(tipoIncidenciafaixasList);
	
		return tipoIncidenciaDTORetorno;
	}

	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoIncidencia' e retorna uma lista de TipoIncidencia
	 * 
	 * @return tipoIncidenciaList - Exclusivo para a inclusão. Verifica se o tipo de incidencia já existe
	 */
	public boolean validaInclusaoTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) throws PdcAdapterException, TipoIncidenciaServiceException {
		
		boolean retorno = false;
		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();		
		ValidaInclusaoTipoIncidenciaRequest lRequest = new ValidaInclusaoTipoIncidenciaRequest();		
		
		lRequest.setCodigoTipoIncidencia(new Integer(tipoIncidenciaDTO.getCodigo()));
		lRequest.setDescricaoTipoIncidencia(tipoIncidenciaDTO.getDescricao());
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IValidaInclusaoTipoIncidenciaPDCAdapter tipoIncidenciaPDCAdapter = factoryAdapter.getValidaInclusaoTipoIncidenciaPDCAdapter();
		ValidaInclusaoTipoIncidenciaResponse lResponse = tipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		tipoIncidenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoIncidenciaDTORetorno.setMensagem(lResponse.getMensagem());
		
		if(lResponse.getCodMensagem().equals("GISS0019")){
			retorno = true;
		}
		
		return retorno;
	}

	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoIncidencia' e retorna uma lista de TipoIncidencia
	 * 
	 * @return tipoIncidenciaList
	 */
	public TipoIncidenciaDTO consultarHistoricoTipoIncidencia(String codigo, String descricao, Date dataInicio, Date dataFinal, String hrManutencaoRegistro) throws PdcAdapterException, TipoIncidenciaServiceException {

		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();		
		List<TipoIncidenciaFaixasDTO> tipoIncidenciafaixasList = new ArrayList<TipoIncidenciaFaixasDTO>();
		DetalharHistoricoTipoIncidenciaRequest lRequest = new DetalharHistoricoTipoIncidenciaRequest();		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

		String dataIni = dateFormat.format(dataInicio);
		String dataFim = dateFormat.format(dataFinal);
		
		lRequest.setCodigoTipoIncidencia(new Integer(codigo));
		lRequest.setDescricaoTipoIncidencia(descricao);
		lRequest.setDataInicio(dataIni);
		lRequest.setDataFinal(dataFim);
		lRequest.setHrManutencaoRegistro(hrManutencaoRegistro);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IDetalharHistoricoTipoIncidenciaPDCAdapter tipoIncidenciaPDCAdapter = factoryAdapter.getDetalharHistoricoTipoIncidenciaPDCAdapter();
		DetalharHistoricoTipoIncidenciaResponse lResponse = tipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		tipoIncidenciaDTORetorno.setCodigo(String.valueOf(lResponse.getCodigoTipoIncidencia()));
		tipoIncidenciaDTORetorno.setDescricao(lResponse.getDescricaoTipoIncidencia());
		tipoIncidenciaDTORetorno.setDatainiciovigencia(lResponse.getDataInicioVigencia());
		tipoIncidenciaDTORetorno.setDatafinalvigencia(lResponse.getDataFinalVigencia());

		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			TipoIncidenciaFaixasDTO tipoIncidenciafaixas = new TipoIncidenciaFaixasDTO();
			tipoIncidenciafaixas.setValorinicial(lResponse.getOcorrencias(i).getValorInicial());
			tipoIncidenciafaixas.setValorfinal(lResponse.getOcorrencias(i).getValorFinal());
			tipoIncidenciafaixas.setValoraliquota(lResponse.getOcorrencias(i).getPercentAliquota());
			tipoIncidenciafaixas.setValorRedutor(lResponse.getOcorrencias(i).getWvalorRedutor());
			tipoIncidenciafaixasList.add(tipoIncidenciafaixas);
		}
		
		tipoIncidenciaDTORetorno.setListaFaixasTipoIncidencia(tipoIncidenciafaixasList);
	
		return tipoIncidenciaDTORetorno;
	}
	
	
	public TipoIncidenciaDTO incluirTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) throws PdcAdapterException, TipoIncidenciaServiceException {
		
		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();
		
		IncluirTipoIncidenciaRequest request = new IncluirTipoIncidenciaRequest();
				
		request.setCodigoTipoIncidencia(new Integer(tipoIncidenciaDTO.getCodigo()));
		request.setDescricaoTipoIncidencia(tipoIncidenciaDTO.getDescricao());			
		request.setDataInicioVigencia(tipoIncidenciaDTO.getDatainiciovigencia());
		
		if(tipoIncidenciaDTO.getDatafinalvigencia().equals("") || tipoIncidenciaDTO.getDatafinalvigencia() == null){
			request.setDataFinalVigencia("31.12.3999");
		}else{
			request.setDataFinalVigencia(tipoIncidenciaDTO.getDatafinalvigencia());
		}
			
		int quantidade = tipoIncidenciaDTO.getListaFaixasTipoIncidencia().size();						
		request.setQuantidadeOcorrencias(quantidade);
			
		List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidencia = tipoIncidenciaDTO.getListaFaixasTipoIncidencia();
			
		br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[] ocorrencias = new br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[quantidade]; 
			
		for (int i = 0; i < quantidade; i++) {		
				
			br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias ocorrenciastipoincidenciafaixas = new br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias();
				
			ocorrenciastipoincidenciafaixas.setValorInicial(listaFaixasTipoIncidencia.get(i).getValorinicial());
			ocorrenciastipoincidenciafaixas.setValorFinal(listaFaixasTipoIncidencia.get(i).getValorfinal());
			ocorrenciastipoincidenciafaixas.setValorAliquota(listaFaixasTipoIncidencia.get(i).getValoraliquota());
			ocorrenciastipoincidenciafaixas.setValorRedutor(listaFaixasTipoIncidencia.get(i).getValorRedutor());
				
			ocorrencias[i] = ocorrenciastipoincidenciafaixas;
		}
							
		request.setOcorrencias(ocorrencias);
			
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
			
		IIncluirTipoIncidenciaPDCAdapter incluirTipoIncidenciaPDCAdapter = factoryAdapter.getIncluirTipoIncidenciaPDCAdapter();
		IncluirTipoIncidenciaResponse lResponse = incluirTipoIncidenciaPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
			
		tipoIncidenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoIncidenciaDTORetorno.setMensagem(lResponse.getMensagem());
		
		return tipoIncidenciaDTORetorno;
	}
		
	public TipoIncidenciaDTO alterarTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) throws PdcAdapterException, TipoIncidenciaServiceException {
			
		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();
		
		ManterTipoIncidenciaRequest request = new ManterTipoIncidenciaRequest();
			
		request.setCodigoTipoIncidencia(new Integer(tipoIncidenciaDTO.getCodigo()));
		request.setDescricaoTipoIncidencia(tipoIncidenciaDTO.getDescricao());			
		request.setDataInicioVigencia(tipoIncidenciaDTO.getDatainiciovigencia().replace("/", "."));
		request.setDataFinalVigencia(tipoIncidenciaDTO.getDatafinalvigencia().replace("/", "."));
		request.setFuncao(ITipoIncidenciaServiceConstants.COD_ALTERACAO);
			
		int quantidade = tipoIncidenciaDTO.getListaFaixasTipoIncidencia().size();						
		request.setQuantidadeOcorrencias(quantidade);
			
		List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidencia = tipoIncidenciaDTO.getListaFaixasTipoIncidencia();
			
		br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias[] ocorrencias = new br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias[quantidade]; 
			
		for (int i = 0; i < quantidade; i++) {		
				
			br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias ocorrenciastipoincidenciafaixas = new br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias();
				
			ocorrenciastipoincidenciafaixas.setValorInicial(listaFaixasTipoIncidencia.get(i).getValorinicial());
			ocorrenciastipoincidenciafaixas.setValorFinal(listaFaixasTipoIncidencia.get(i).getValorfinal());
			ocorrenciastipoincidenciafaixas.setValorAliquota(listaFaixasTipoIncidencia.get(i).getValoraliquota());
			ocorrenciastipoincidenciafaixas.setValorRedutor(listaFaixasTipoIncidencia.get(i).getValorRedutor());
			ocorrenciastipoincidenciafaixas.setNumeroSequencial(listaFaixasTipoIncidencia.get(i).getNumsequencial());
				
			ocorrencias[i] = ocorrenciastipoincidenciafaixas;
		}
							
		request.setOcorrencias(ocorrencias);
			
		/* **************************
		* 	INVOCA PROCESSO PDC		*
		* **************************/
			
		IManterTipoIncidenciaPDCAdapter manterTipoIncidenciaPDCAdapter = factoryAdapter.getManterTipoIncidenciaPDCAdapter();
		ManterTipoIncidenciaResponse lResponse = manterTipoIncidenciaPDCAdapter.invokeProcess(request);

		/* **************************
		* 	RESULTADO DA CONSULTA	*
		* **************************/
			
		tipoIncidenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoIncidenciaDTORetorno.setMensagem(lResponse.getMensagem());
			
		return tipoIncidenciaDTORetorno;			
	}
		
	public TipoIncidenciaDTO excluirTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) throws PdcAdapterException, TipoIncidenciaServiceException {
		
		TipoIncidenciaDTO tipoIncidenciaDTORetorno = new TipoIncidenciaDTO();
		
		ManterTipoIncidenciaRequest request = new ManterTipoIncidenciaRequest();
			
		request.setCodigoTipoIncidencia(new Integer(tipoIncidenciaDTO.getCodigo()));
		request.setDescricaoTipoIncidencia(tipoIncidenciaDTO.getDescricao());			
		request.setDataInicioVigencia(tipoIncidenciaDTO.getDatainiciovigencia().replace("/", "."));
		request.setDataFinalVigencia(tipoIncidenciaDTO.getDatafinalvigencia().replace("/", "."));
		request.setFuncao(ITipoIncidenciaServiceConstants.COD_EXCLUSAO);
			
		int quantidade = tipoIncidenciaDTO.getListaFaixasTipoIncidencia().size();						
		request.setQuantidadeOcorrencias(quantidade);
			
		List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidencia = tipoIncidenciaDTO.getListaFaixasTipoIncidencia();
				
		br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias[] ocorrencias = new br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias[quantidade]; 
				
		for (int i = 0; i < quantidade; i++) {		
				
			br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias ocorrenciastipoincidenciafaixas = new br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias();
									
			ocorrenciastipoincidenciafaixas.setValorInicial(listaFaixasTipoIncidencia.get(i).getValorinicial());
			ocorrenciastipoincidenciafaixas.setValorFinal(listaFaixasTipoIncidencia.get(i).getValorfinal());
			ocorrenciastipoincidenciafaixas.setValorAliquota(listaFaixasTipoIncidencia.get(i).getValoraliquota());
			ocorrenciastipoincidenciafaixas.setValorRedutor(listaFaixasTipoIncidencia.get(i).getValorRedutor());
			ocorrenciastipoincidenciafaixas.setNumeroSequencial(listaFaixasTipoIncidencia.get(i).getNumsequencial());
			
			ocorrencias[i] = ocorrenciastipoincidenciafaixas;
		}
							
		request.setOcorrencias(ocorrencias);
			
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
			
		IManterTipoIncidenciaPDCAdapter manterTipoIncidenciaPDCAdapter = factoryAdapter.getManterTipoIncidenciaPDCAdapter();
		ManterTipoIncidenciaResponse lResponse = manterTipoIncidenciaPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
			
		tipoIncidenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoIncidenciaDTORetorno.setMensagem(lResponse.getMensagem());
			
		return tipoIncidenciaDTORetorno;

	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}
