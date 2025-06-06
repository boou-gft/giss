package br.com.bradesco.web.giss.service.business.liberarpagamento.impl;

import static br.com.bradesco.web.giss.utils.GissUtil.notNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.exception.ProcessarPagtoISServiceException;
import br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.exceptions.LiberarPagtoISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.AgendarPgtoIndividualRequest;
import br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar;
import br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.response.AgendarPgtoIndividualResponse;
import br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.CalcularSelecionadosOuTodosRequest;
import br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.request.ListaMunicipiosCalcular;
import br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.CancelarTedTransferenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.request.ListaMunicipios;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.response.CancelarTedTransferenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse;
import br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento;
import br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.response.LiberarPagamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.request.ListarConsultaPagamentosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListarConsultaPagamentosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.request.ListarNaoElegiveisRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.request.ListarPagamentoManualRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.request.ListarPgtosVencidosCompRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.IListarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.response.ListarRetificadorLiberacaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.IProcessarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.response.ProcessarRetificadorLiberacaoResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;


/**@nome: LiberarPagtoISSServiceImpl.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class LiberarPagtoISSServiceImpl implements ILiberarPagtoISSService {
	
	private static final String CODIGO_GENERICO_SUCESSO = "GISS0011";
	
	private FactoryAdapter factoryAdapter;

	/**
	 * @return the factoryAdapter
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarLiberarPagamento(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public LiberarPagtoISSDTO listarLiberarPagamento(LiberarPagtoISSDTO dto)throws PdcAdapterException, ProcessarPagtoISServiceException {
		ConsultarLiberarPagtoRequest request = new ConsultarLiberarPagtoRequest();
		
		request.setAnoMes(Integer.valueOf(notNull(dto.getAnoPeriodoInicial())+notNull(dto.getMesPeriodoInicial())));
		request.setMaxOcorrencias(99);

		ConsultarLiberarPagtoResponse response = factoryAdapter.getConsultarLiberarPagtoPDCAdapter().invokeProcess(request);

		int numConsul = 0;
		for (int i = 0; i < response.getConsultarLiberarPagtoCount(); i++) {
			LiberarPagtoISSDTO dtoLocal = new LiberarPagtoISSDTO();
			if(response.getConsultarLiberarPagto(i).getCodEmpresa() != 0) {
				dtoLocal.setEmpresa(response.getConsultarLiberarPagto(i).getCodEmpresa());
				dtoLocal.setProduto(response.getConsultarLiberarPagto(i).getProducao());
				dtoLocal.setAnoMes(response.getConsultarLiberarPagto(i).getAnoMes());
				dtoLocal.setDataRecepcao(response.getConsultarLiberarPagto(i).getDataRecepcao());
				dtoLocal.setCodIdenticacaoTransIss(response.getConsultarLiberarPagto(i).getCodIdentificacaoTransIss());
				dtoLocal.setNApurcIssEmpresa(response.getConsultarLiberarPagto(i).getNApurcIssEmpresa());
				dtoLocal.setStatusEmpresa(response.getConsultarLiberarPagto(i).getSitPagto());
				dtoLocal.setNumConsul(numConsul++);
				dto.getLista().add(dtoLocal);
			}
		}
		return dto;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarLiberarPagamentoRetificado(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public LiberarPagtoISSDTO listarLiberarPagamentoRetificado(LiberarPagtoISSDTO dto) {
		ListarRetificadorLiberacaoRequest request = new ListarRetificadorLiberacaoRequest();
		request.setAnoMesCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(dto.getMesPeriodoInicial()), GissUtil.stringToInteger(dto.getAnoPeriodoInicial())));
		request.setMaximoOcorrencias(100);
		
		IListarRetificadorLiberacaoPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarRetificadorLiberacaoPDCAdapter();
		ListarRetificadorLiberacaoResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getNumeroConsultas())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			int numConsul = 0;
			for (int i = 0; i < response.getNumeroConsultas(); i++) {
				LiberarPagtoISSDTO dtoLocal = new LiberarPagtoISSDTO();
				if(response.getLista(i).getCodigoEmpresa() != 0) {
					dtoLocal.setEmpresa(response.getLista(i).getCodigoEmpresa());
					dtoLocal.setProduto(response.getLista(i).getNomeProduto());
					dtoLocal.setAnoMes(response.getLista(i).getAnoMesCompetencia());
					dtoLocal.setDataRecepcao(response.getLista(i).getDataRecepcao());
					dtoLocal.setCodIdenticacaoTransIss(response.getLista(i).getIdentificadorTransacaoIss());
					dtoLocal.setNApurcIssEmpresa(response.getLista(i).getNumeroApuracaoIss());
					dtoLocal.setStatusEmpresa(response.getLista(i).getIdentificadorProcessamentoIss());
					dtoLocal.setNumConsul(numConsul++);
					dto.getLista().add(dtoLocal);
				}
			}
			return dto;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#liberarPagamento(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public String liberarPagamento(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		LiberarPagamentoRequest request = new LiberarPagamentoRequest();
		
		request.setNumConsultas(dto.getLista().size());
		
		ListaLiberarPagamento[] lista = new ListaLiberarPagamento[100];

		for (int i = 0; i < 100; i++) {
			ListaLiberarPagamento dtoBotao = new ListaLiberarPagamento();
			if (i < dto.getLista().size()) {
				dtoBotao.setAnoMes(notNull(dto.getLista().get(i).getAnoMes()));
				dtoBotao.setCodEmpresa(notNull(dto.getLista().get(i).getEmpresa()));
				dtoBotao.setCodIdentificacaoTransIss(notNull(dto.getLista().get(i).getCodIdenticacaoTransIss()));
				dtoBotao.setNApurcIssEmpresa(notNull(dto.getLista().get(i).getNApurcIssEmpresa()));
				dtoBotao.setProduto(notNull(dto.getLista().get(i).getProduto()));
				dtoBotao.setDataRecepcao(notNull(dto.getLista().get(i).getDataRecepcao()));
			} else {
				dtoBotao.setAnoMes(0);
				dtoBotao.setCodEmpresa(0);
				dtoBotao.setCodIdentificacaoTransIss(0);
				dtoBotao.setNApurcIssEmpresa(0);
				dtoBotao.setProduto("");
				dtoBotao.setDataRecepcao("");
			}
			lista[i] = dtoBotao;
		}
		request.setListaLiberarPagamento(lista);

		LiberarPagamentoResponse response = factoryAdapter.getLiberarPagamentoPDCAdapter().invokeProcess(request);

		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#liberarPagamentoRetificado(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public String liberarPagamentoRetificado(LiberarPagtoISSDTO dto) {
		String msgRetorno = "Solicitação Realizada com Sucesso";
	
		ProcessarRetificadorLiberacaoRequest request = new ProcessarRetificadorLiberacaoRequest();
		request.setNumeroConsultas(100);
		
		br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] lista = 
			new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[100];
				
		for (int i = 0; i < 100; i++) {
			br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada dtoBotao = 
				new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada();
			if (i < dto.getLista().size()) {
				dtoBotao.setAnoMesCompetencia(notNull(dto.getLista().get(i).getAnoMes()));
				dtoBotao.setCodigoEmpresa(notNull(dto.getLista().get(i).getEmpresa()));
				dtoBotao.setIdentificadorTransacaoIss(notNull(dto.getLista().get(i).getCodIdenticacaoTransIss()));
				dtoBotao.setNumeroApuracaoIss(notNull(dto.getLista().get(i).getNApurcIssEmpresa()));
				dtoBotao.setNomeProduto(notNull(dto.getLista().get(i).getProduto()));
				dtoBotao.setDataRecepcao(notNull(dto.getLista().get(i).getDataRecepcao()));
			} else {
				dtoBotao.setAnoMesCompetencia(0);
				dtoBotao.setCodigoEmpresa(0);
				dtoBotao.setIdentificadorTransacaoIss(0);
				dtoBotao.setNumeroApuracaoIss(0);
				dtoBotao.setNomeProduto("");
				dtoBotao.setDataRecepcao("");
			}
			lista[i] = dtoBotao;
		}
		
		request.setListaEntrada(lista);
		
		IProcessarRetificadorLiberacaoPDCAdapter solicitarPDCAdapter = getFactoryAdapter().getProcessarRetificadorLiberacaoPDCAdapter();
		ProcessarRetificadorLiberacaoResponse response = solicitarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarPagtosNaoGerados(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public void listarPagtosNaoGerados(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		ListarPgtosNaoGeradosRequest request = new ListarPgtosNaoGeradosRequest();
		request.setCodEmpresa(notNull(dto.getEmpresa()));
		request.setCodProduto(notNull(dto.getCodIdenticacaoTransIss()));
		request.setCompetencia(notNull(dto.getAnoMes()));
		request.setNumeroApuracaoIss(notNull(dto.getNApurcIssEmpresa()));
		
		ListarPgtosNaoGeradosResponse response = factoryAdapter.getListarPgtosNaoGeradosPDCAdapter().invokeProcess(request);
		
		for(int i = 0; i < response.getListaPgtosNaoGeradosCount(); i++) {
			
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			String comp = String.valueOf(response.getListaPgtosNaoGerados(i).getCompetencia());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setEmpresa(response.getListaPgtosNaoGerados(i).getCodEmpresa());
			saida.setDescEmpresa(response.getListaPgtosNaoGerados(i).getNomeEmpresa());
			saida.setProduto(response.getListaPgtosNaoGerados(i).getProduto());
			//valor ISS Apurado
			saida.setValorProvisionado(NumberUtils.format(response.getListaPgtosNaoGerados(i).getValorIssApurado()));
			//valor base iss
			saida.setBaseIss(NumberUtils.format(response.getListaPgtosNaoGerados(i).getValorBaseIss()));
			saida.setCodMunicipio(response.getListaPgtosNaoGerados(i).getCodMunicipio());
			saida.setMunicipio(response.getListaPgtosNaoGerados(i).getNomeMunicipio());
			dto.getLista().add(saida);
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarPgtosNaoElegiveis(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public void listarPgtosNaoElegiveis(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		ListarNaoElegiveisRequest request = new ListarNaoElegiveisRequest();
		request.setCodEmpresa(notNull(dto.getEmpresa()));
		request.setCodProduto(notNull(dto.getCodIdenticacaoTransIss()));
		request.setCompetencia(notNull(dto.getAnoMes()));
		request.setNumeroApuracaoIss(notNull(dto.getNApurcIssEmpresa()));
		
		ListarNaoElegiveisResponse response = factoryAdapter.getListarNaoElegiveisPDCAdapter().invokeProcess(request);
		
		for(int i = 0; i < response.getListaPgtosNaoElegiveisCount(); i++) {
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			
			String comp = String.valueOf(response.getListaPgtosNaoElegiveis(i).getCompetencia());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setEmpresa(response.getListaPgtosNaoElegiveis(i).getCodEmpresa());
			saida.setDescEmpresa(response.getListaPgtosNaoElegiveis(i).getNomeEmpresa());
			saida.setProduto(response.getListaPgtosNaoElegiveis(i).getProduto());
			//valor ISS Apurado
			saida.setValorProvisionado(NumberUtils.format(response.getListaPgtosNaoElegiveis(i).getValorIssApurado()));
			//valor base iss
			saida.setBaseIss(NumberUtils.format(response.getListaPgtosNaoElegiveis(i).getValorBaseIss()));
			saida.setCodMunicipio(response.getListaPgtosNaoElegiveis(i).getCodMunicipio());
			saida.setMunicipio(response.getListaPgtosNaoElegiveis(i).getNomeMunicipio());
			saida.setVencimento(response.getListaPgtosNaoElegiveis(i).getVencimento().replaceAll("\\.", "/"));
			dto.getLista().add(saida);
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarPgtosVencidosComp(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public void listarPgtosVencidosComp(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		ListarPgtosVencidosCompRequest request = new ListarPgtosVencidosCompRequest();
		
		request.setCodEmpresa(notNull(dto.getEmpresa()));
		request.setCodIdentificacaoProduto(notNull(dto.getCodIdenticacaoTransIss()));
		request.setAnoMes(notNull(dto.getAnoMes()));
		request.setNumeroApuracaoIss(notNull(dto.getNApurcIssEmpresa()));
		
		ListarPgtosVencidosCompResponse response = factoryAdapter.getListarPgtosVencidosCompPDCAdapter().invokeProcess(request);
		
		for(int i = 0; i < response.getListaPgtosVencidosCount(); i++) {
			
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			
			String comp = String.valueOf(response.getListaPgtosVencidos(i).getMesAno());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setAnoMes(response.getListaPgtosVencidos(i).getMesAno());
			saida.setEmpresa(response.getListaPgtosVencidos(i).getCodEmpresa());
			saida.setDescEmpresa(response.getListaPgtosVencidos(i).getNomeEmpresa());
			saida.setProduto(response.getListaPgtosVencidos(i).getNomeProduto());
			//valor ISS Apurado
			saida.setValorProvisionado(NumberUtils.format(response.getListaPgtosVencidos(i).getValorIssApurado()));
			//valor base iss
			saida.setBaseIss(NumberUtils.format(response.getListaPgtosVencidos(i).getValorBaseIss()));
			saida.setCodMunicipio(response.getListaPgtosVencidos(i).getCodMunicipio());
			saida.setMunicipio(response.getListaPgtosVencidos(i).getNomeMunicipio());
			saida.setVencimento(response.getListaPgtosVencidos(i).getVencimento().replaceAll("\\.", "/"));
			dto.getLista().add(saida);
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarConsultaPagamentos(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public void listarConsultaPagamentos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		ListarConsultaPagamentosRequest request = new ListarConsultaPagamentosRequest();
		
		request.setCompetencia(Integer.valueOf(notNull(dto.getAnoPeriodoInicial())+notNull(dto.getMesPeriodoInicial())));
		request.setCodEmpresa(notNull(dto.getEmpresa()));
		request.setStatus(notNull(dto.getCodStatus()));
		request.setCodProduto(notNull(dto.getCodProduto()));
		request.setCodMunicipio(notNull(dto.getCodMunicipio()));
		
		ListarConsultaPagamentosResponse response = factoryAdapter.getListarConsultaPagamentosPDCAdapter().invokeProcess(request);
		
		for(int i = 0; i < response.getListaConsultaPagamentosCount(); i++) {
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			saida.setEmpresa(response.getListaConsultaPagamentos(i).getCodEmpresa());
			saida.setDescEmpresa(response.getListaConsultaPagamentos(i).getDescEmpresa());
			saida.setCodMunicipio(response.getListaConsultaPagamentos(i).getCodMunicipio());
			saida.setMunicipio(response.getListaConsultaPagamentos(i).getDescMunicipio());
			saida.setCodIdenticacaoTransIss(response.getListaConsultaPagamentos(i).getCodIdentifTransIss());
			saida.setProduto(response.getListaConsultaPagamentos(i).getProduto());
			saida.setDtAgendamento(response.getListaConsultaPagamentos(i).getDtAgendamento().replaceAll("\\.", "/"));
			saida.setDtPagamento(response.getListaConsultaPagamentos(i).getDtPagamento().replaceAll("\\.", "/")); 
			String comp = String.valueOf(response.getListaConsultaPagamentos(i).getCompetencia());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setCodTipoCredito(response.getListaConsultaPagamentos(i).getCodTipoCredito());
			saida.setDescTipoCredito(response.getListaConsultaPagamentos(i).getDescTipoCredito());
			saida.setValorIssPgto(NumberUtils.format(response.getListaConsultaPagamentos(i).getValorIssPagto()));
			saida.setCodStatus(response.getListaConsultaPagamentos(i).getCodStatus());
			saida.setDescStatus(response.getListaConsultaPagamentos(i).getDescStatus());
			saida.setCodMovimento(response.getListaConsultaPagamentos(i).getCodMovimento());
			saida.setNomePrograma(response.getListaConsultaPagamentos(i).getNomePrograma());
			saida.setDtHoraInclusao(GissUtil.converteTimeStampCompleto(response.getListaConsultaPagamentos(i).getDtHoraInclusao()));
			dto.getLista().add(saida);
		}
	}
		
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#listarPagamentoManual(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public void listarPagamentoManual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		ListarPagamentoManualRequest request = new ListarPagamentoManualRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getEmpresa()));
		request.setCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(dto.getMesPeriodoInicial()), GissUtil.stringToInteger(dto.getAnoPeriodoInicial())));		
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setCodProduto(GissUtil.notNull(dto.getCodProduto()));
		request.setStatus(GissUtil.notNull(dto.getCodStatus()));
		
		ListarPagamentoManualResponse response = factoryAdapter.getListarPagamentoManualPDCAdapter().invokeProcess(request);
		
		for(int i = 0; i < response.getListaPagamentoManualCount(); i++) {
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			saida.setEmpresa(notNull(response.getListaPagamentoManual(i).getCodEmpresa()));
			saida.setDescEmpresa(response.getListaPagamentoManual(i).getDescEmpresa());
			String comp = String.valueOf(response.getListaPagamentoManual(i).getCompetencia());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setCodMunicipio(notNull(response.getListaPagamentoManual(i).getCodMunicipio()));
			saida.setMunicipio(response.getListaPagamentoManual(i).getDescMunicipio());
			saida.setDtOriginal(response.getListaPagamentoManual(i).getDataOriginal().replaceAll("\\.", "/"));
			//data Vencimento = Data Agendamento
			saida.setDtVencimento(response.getListaPagamentoManual(i).getDataAgendamento().replaceAll("\\.", "/")); 
			saida.setValorIssPgto(notNull(NumberUtils.format(response.getListaPagamentoManual(i).getValorPagamentoIss())));
			saida.setCodStatus(notNull(response.getListaPagamentoManual(i).getCodStatusProcesso()));
			saida.setDescStatus(response.getListaPagamentoManual(i).getDescStatusProcesso());
			saida.setCodProduto(notNull(response.getListaPagamentoManual(i).getCodProduto()));
			saida.setProduto(response.getListaPagamentoManual(i).getDescProduto());
			saida.setBanco(String.valueOf(response.getListaPagamentoManual(i).getBanco()));
			saida.setAgencia(String.valueOf(response.getListaPagamentoManual(i).getAgencia()));
			saida.setConta(notNull(String.valueOf(response.getListaPagamentoManual(i).getNumConta())));
			saida.setDigitoConta(notNull(response.getListaPagamentoManual(i).getDigitoConta()));
			saida.setElegivelParaPagamento(response.getListaPagamentoManual(i).getElegivelPgto());
			saida.setDescTipoCredito(response.getListaPagamentoManual(i).getDescTipoCredito());
			saida.setQtdeOcorrencias(response.getQtdeOcorrencias());
			dto.getLista().add(saida);
		}
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#agendarPgtoIndividual(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public String agendarPgtoIndividual(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		return "";
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#agendarSelecionadosOuTodos(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO)
	 */
	public String agendarSelecionadosOuTodos(LiberarPagtoISSDTO dto) throws PdcAdapterException, LiberarPagtoISSServiceException {
		AgendarPgtoIndividualRequest request = new AgendarPgtoIndividualRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getEmpresa()));
		request.setCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(dto.getMesPeriodoInicial()), GissUtil.stringToInteger(dto.getAnoPeriodoInicial())));
		request.setCodProduto(GissUtil.notNull(dto.getCodProduto()));
		
		ListaMunicipioAgendar[] listaMunicipioAgendar = new ListaMunicipioAgendar[200];
		
		//Se for agendar todos
		if(dto.getTipoAtualizacao().equals("S")) {

			for(int i = 0; i < 200; i++) {
				ListaMunicipioAgendar item = new ListaMunicipioAgendar();
				if(i < dto.getLista().size()) { 
					item.setCodMunicipio(dto.getLista().get(i).getCodMunicipio());
					item.setValorTotalApuracaoIss(GissUtil.notNull(NumberUtils.convert(dto.getLista().get(i).getValorIssPgto())));
					item.setValorMulta(GissUtil.notNull(NumberUtils.convert(dto.getLista().get(i).getValorAcrescimoJurosMulta())));
					item.setPercentualAtualizacaoMonetaria(GissUtil.converteStringDouble(dto.getLista().get(i).getPercentualAtualizacaoMonetaria()));
					item.setValorAtualizacaoMonetaria(GissUtil.notNull(NumberUtils.convert(dto.getLista().get(i).getValorAtualizacaoMonetaria())));
					item.setValorPagamento(GissUtil.notNull(NumberUtils.convert(dto.getLista().get(i).getValorIssPgtoAtualizado())));
					item.setDataOrigem(dto.getLista().get(i).getDtOriginal().replaceAll("/", "\\."));
					item.setDataAgendamento(dto.getLista().get(i).getDtVencimento().replaceAll("/", "\\."));
				} else {
					item.setCodMunicipio(0L);
					item.setValorTotalApuracaoIss(BigDecimal.ZERO);
					item.setValorMulta(BigDecimal.ZERO);
					item.setPercentualAtualizacaoMonetaria(0);
					item.setValorAtualizacaoMonetaria(BigDecimal.ZERO);
					item.setValorPagamento(BigDecimal.ZERO);
					item.setDataOrigem("");
					item.setDataAgendamento("");
				}
				listaMunicipioAgendar[i] = item;
			}
		//Se for agendar selecionados	
		} else {
			for(int i = 0; i < 200; i++) {
				ListaMunicipioAgendar item = new ListaMunicipioAgendar();
				if(i < dto.getListaSelecionadosTabela().size()) { 
					item.setCodMunicipio(dto.getListaSelecionadosTabela().get(i).getCodMunicipio());
					item.setValorTotalApuracaoIss(GissUtil.notNull(NumberUtils.convert(dto.getListaSelecionadosTabela().get(i).getValorIssPgto())));
					item.setValorMulta(GissUtil.notNull(NumberUtils.convert(dto.getListaSelecionadosTabela().get(i).getValorAcrescimoJurosMulta())));
					item.setPercentualAtualizacaoMonetaria(GissUtil.converteStringDouble(dto.getListaSelecionadosTabela().get(i).getPercentualAtualizacaoMonetaria()));
					item.setValorAtualizacaoMonetaria(GissUtil.notNull(NumberUtils.convert(dto.getListaSelecionadosTabela().get(i).getValorAtualizacaoMonetaria())));
					item.setValorPagamento(GissUtil.notNull(NumberUtils.convert(dto.getListaSelecionadosTabela().get(i).getValorIssPgtoAtualizado())));
					item.setDataOrigem(dto.getListaSelecionadosTabela().get(i).getDtOriginal().replaceAll("/", "\\."));
					item.setDataAgendamento(dto.getListaSelecionadosTabela().get(i).getDtVencimento().replaceAll("/", "\\."));
				} else {
					item.setCodMunicipio(0L);
					item.setValorTotalApuracaoIss(BigDecimal.ZERO);
					item.setValorMulta(BigDecimal.ZERO);
					item.setPercentualAtualizacaoMonetaria(0);
					item.setValorAtualizacaoMonetaria(BigDecimal.ZERO);
					item.setValorPagamento(BigDecimal.ZERO);
					item.setDataOrigem("");
					item.setDataAgendamento("");
				}
				listaMunicipioAgendar[i] = item;
			}
		}
		
		request.setListaMunicipioAgendar(listaMunicipioAgendar);
		
		AgendarPgtoIndividualResponse response = factoryAdapter.getAgendarPgtoIndividualPDCAdapter().invokeProcess(request);
		
		return response.getMensagem();
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#cancelarTedTransferencia(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO, java.util.List, java.lang.Boolean)
	 */
	public String cancelarTedTransferencia(LiberarPagtoISSDTO dto, List<LiberarPagtoISSDTO> selecionados, Boolean todos) throws PdcAdapterException, LiberarPagtoISSServiceException {
		CancelarTedTransferenciaRequest request = new CancelarTedTransferenciaRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getEmpresa()));
		request.setCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(dto.getMesPeriodoInicial()), GissUtil.stringToInteger(dto.getAnoPeriodoInicial())));
		request.setProduto(GissUtil.notNull(dto.getCodProduto()));
		request.setCancelarTodos(todos ? "S" : "N");
				
		ListaMunicipios[] listaMunicipios = new ListaMunicipios[500];
		
		//Se for agendar todos
		if(todos) {
			for(int i = 0; i < 500; i++) {
				ListaMunicipios item = new ListaMunicipios();
				item.setCodMunicipio(0L);
				listaMunicipios[i] = item;
			}
			
		//Se for agendar selecionados	
		} else {
			for(int i = 0; i < 500; i++) {
				ListaMunicipios item = new ListaMunicipios();
				if(i < selecionados.size()) { 
					item.setCodMunicipio(selecionados.get(i).getCodMunicipio());
				} else {
					item.setCodMunicipio(0L);
				}
				listaMunicipios[i] = item;
			}
		}
		
		request.setListaMunicipios(listaMunicipios);
		
		CancelarTedTransferenciaResponse response = factoryAdapter.getCancelarTedTransferenciaPDCAdapter().invokeProcess(request);
		
		return response.getMensagem();
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService#calcularSelecionadosOuTodos(br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO, java.lang.Boolean)
	 */
	public void calcularSelecionadosOuTodos(LiberarPagtoISSDTO dto, Boolean todos) throws PdcAdapterException, LiberarPagtoISSServiceException {
		CalcularSelecionadosOuTodosRequest request = new CalcularSelecionadosOuTodosRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getEmpresa()));
		request.setCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(dto.getMesPeriodoInicial()), GissUtil.stringToInteger(dto.getAnoPeriodoInicial())));		
		request.setCodProduto(GissUtil.notNull(dto.getCodProduto()));
		request.setValorMulta(GissUtil.notNull(NumberUtils.convert(dto.getValorMulta())));
		request.setPercentualAtualizacaoMonetearia(GissUtil.converteStringDouble(dto.getValorJuros()));
		request.setCalcularTodos(todos ? "S" : "N");
		
		ListaMunicipiosCalcular[] listaMunicipios = new ListaMunicipiosCalcular[70];
		
		//Se for agendar todos
		if(todos) {
			for(int i = 0; i < 70; i++) {
				ListaMunicipiosCalcular item = new ListaMunicipiosCalcular();
				item.setCodMunicipio(0L);
				item.setValorTotalApuracao(BigDecimal.ZERO);
				listaMunicipios[i] = item;
			}
			
		//Se for agendar selecionados	
		} else {
			for(int i = 0; i < 70; i++) {
				ListaMunicipiosCalcular item = new ListaMunicipiosCalcular();
				if(i < dto.getListaSelecionadosTabela().size()) { 
					item.setCodMunicipio(GissUtil.notNull(dto.getListaSelecionadosTabela().get(i).getCodMunicipio()));
					item.setValorTotalApuracao(GissUtil.notNull(NumberUtils.convert(dto.getListaSelecionadosTabela().get(i).getValorIssPgto())));
				} else {
					item.setCodMunicipio(0L);
					item.setValorTotalApuracao(BigDecimal.ZERO);
				}
				listaMunicipios[i] = item;
			}
		}
		
		request.setListaMunicipiosCalcular(listaMunicipios);

		CalcularSelecionadosOuTodosResponse response = factoryAdapter.getCalcularSelecionadosOuTodosPDCAdapter().invokeProcess(request);
		
		if (response.getListaCalculoCount() > 0) {
			dto.setLista(new ArrayList<LiberarPagtoISSDTO>());
			dto.setListaSelecionadosTabela(new ArrayList<LiberarPagtoISSDTO>());
			dto.setQtdeOcorrencias(0);
		}
		
		for(int i = 0; i < response.getListaCalculoCount(); i++) {
			LiberarPagtoISSDTO saida = new LiberarPagtoISSDTO();
			saida.setEmpresa(notNull(response.getListaCalculo(i).getCodEmpresa()));
			saida.setDescEmpresa(response.getListaCalculo(i).getDescEmpresa());
			String comp = String.valueOf(response.getListaCalculo(i).getCompetencia());
			String competenciaConcat = comp.substring(4, 6) + "/" + comp.substring(0, 4);
			saida.setCompetencia(competenciaConcat);
			saida.setAnoComp(GissUtil.stringToInteger(comp.substring(0, 4)));
			saida.setMesComp(GissUtil.stringToInteger(comp.substring(4, 6)));
			saida.setCodMunicipio(notNull(response.getListaCalculo(i).getCodMunicipio()));
			saida.setMunicipio(response.getListaCalculo(i).getDescMunicipio());
			saida.setDtOriginal(response.getListaCalculo(i).getDataOriginal().replaceAll("\\.", "/"));
			//data Vencimento = Data Agendamento
			saida.setDtVencimento(response.getListaCalculo(i).getDataAgendamento().replaceAll("\\.", "/")); 
			saida.setValorIssPgto(notNull(NumberUtils.format(response.getListaCalculo(i).getValorTotalApuracaoIss())));
			saida.setValorAcrescimoJurosMulta(notNull(NumberUtils.format(response.getListaCalculo(i).getValorMulta())));
			saida.setPercentualAtualizacaoMonetaria(notNull(NumberUtils.format(response.getListaCalculo(i).getPercentualAtualizacaoMonetaria(), "#,##0.00000000")));
			saida.setValorAtualizacaoMonetaria(notNull(NumberUtils.format(response.getListaCalculo(i).getValorAtualizacaoMonetaria())));
			saida.setValorIssPgtoAtualizado(notNull(NumberUtils.format(response.getListaCalculo(i).getValorPagamentoAtualizado())));	
			saida.setCodStatus(notNull(response.getListaCalculo(i).getCodStatus()));
			saida.setDescStatus(response.getListaCalculo(i).getDescStatus());
			saida.setCodProduto(notNull(response.getListaCalculo(i).getCodProduto()));
			saida.setProduto(response.getListaCalculo(i).getDescProduto());
			saida.setBanco(String.valueOf(response.getListaCalculo(i).getBanco()));
			saida.setAgencia(String.valueOf(response.getListaCalculo(i).getAgencia()));
			saida.setConta(notNull(String.valueOf(response.getListaCalculo(i).getNumConta())));
			saida.setDigitoConta(notNull(response.getListaCalculo(i).getDigitoConta()));
			saida.setElegivelParaPagamento(response.getListaCalculo(i).getElegivelPgto());
			saida.setDescTipoCredito(response.getListaCalculo(i).getDescTipoCredito());
			saida.setQtdeOcorrencias(response.getQtdeOcorrencias());
			dto.getLista().add(saida);
		}
	}	
}
