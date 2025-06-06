/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.impl
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 26/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.IListarDiferencasRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessarapuracao.IListarReprocessarApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessarapuracao.request.ListarReprocessarApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessarapuracao.response.ListarReprocessarApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorcontabil.IListarRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorcontabil.request.ListarRetificadorContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorcontabil.response.ListarRetificadorContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.IListarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.request.ListarRetificadorLiberacaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.response.ListarRetificadorLiberacaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.IProcessarRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ProcessarRetificadorContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.response.ProcessarRetificadorContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.IProcessarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.response.ProcessarRetificadorLiberacaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.IReprocessarApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.response.ReprocessarApuracaoResponse;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

/**
 * @nome: MovimentoRetificadorServiceImpl.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
/**@nome: MovimentoRetificadorServiceImpl.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
/**@nome: MovimentoRetificadorServiceImpl.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class MovimentoRetificadorServiceImpl implements IMovimentoRetificadorService {
	
	private static final String CODIGO_GENERICO_SUCESSO = "GISS0011";
	
	private FactoryAdapter factoryAdapter;

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#listarProcessarContabilidade(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO)
	 */
	public List<MovimentoRetificadorDTO> listarProcessarContabilidade(MovimentoRetificadorFiltroDTO filtro) {
		List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
		MovimentoRetificadorDTO item = null;

		ListarRetificadorContabilRequest request = new ListarRetificadorContabilRequest();
		request.setAnoMesCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesCompetencia()), GissUtil.stringToInteger(filtro.getAnoCompetencia())));
		request.setMaximoOcorrencias(100);
		
		IListarRetificadorContabilPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarRetificadorContabilPDCAdapter();
		ListarRetificadorContabilResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getLista())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getListaCount(); i++) {
				item = new MovimentoRetificadorDTO();
				item.setAnoMesCompetencia(response.getLista(i).getAnoMesCompetencia());
				item.setCodigoEmpresa(response.getLista(i).getCodigoEmpresa());
				item.setIdentificadorTransacaoIss(response.getLista(i).getIdentificadorTransacaoIss());
				item.setNumeroApuracaoIss(response.getLista(i).getNumeroApuracaoIss());
				item.setNomeProduto(response.getLista(i).getNomeProduto());
				item.setDataRecepcao(DateUtils.convertDatePdc(response.getLista(i).getDataRecepcao()));
				item.setQuantidadeRegistro(response.getLista(i).getQuantidadeRegistro());
				item.setValorIss(GissUtil.formatarValoresBig(response.getLista(i).getValorReceita()));
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#processarContabilidade(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO, br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO)
	 */
	public String processarContabilidade(MovimentoRetificadorFiltroDTO filtro, MovimentoRetificadorDTO movimentoRetificadorDTO) {
		String msgRetorno = "Solicitação Realizada com Sucesso";

		ProcessarRetificadorContabilRequest request = new ProcessarRetificadorContabilRequest();
		request.setIndicadorContabilizar(filtro.getIndicadorContabilizacao());
		request.setNumeroConsultas(100);
		
		br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada[] listaMunicipioAgendar = 
			new br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada[100];
		br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada item = 
			new br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada();
		
		item.setAnoMesCompetencia(movimentoRetificadorDTO.getAnoMesCompetencia());
		item.setCodigoEmpresa(movimentoRetificadorDTO.getCodigoEmpresa());
		item.setIdentificadorTransacaoIss(movimentoRetificadorDTO.getIdentificadorTransacaoIss());
		item.setNumeroApuracaoIss(movimentoRetificadorDTO.getNumeroApuracaoIss());
		item.setNomeProduto(movimentoRetificadorDTO.getNomeProduto());
		item.setDataRecepcao(DateUtils.formatPdc(movimentoRetificadorDTO.getDataRecepcao()));
		item.setQuantidadeRegistro(movimentoRetificadorDTO.getQuantidadeRegistro());
		item.setValorReceita(GissUtil.notNull(NumberUtils.convert(movimentoRetificadorDTO.getValorIss())));
		
		listaMunicipioAgendar[0] = item;
		
		for(int i = 1; i < 100; i++){
			item = new br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada();
			item.setAnoMesCompetencia(0);
			item.setCodigoEmpresa(0);
			item.setIdentificadorTransacaoIss(0);
			item.setNumeroApuracaoIss(0);
			item.setNomeProduto("");
			item.setDataRecepcao("");
			item.setQuantidadeRegistro(0L);
			item.setValorReceita(BigDecimal.ZERO);
			listaMunicipioAgendar[i] = item;
		}
		
		request.setListaEntrada(listaMunicipioAgendar);
		
		IProcessarRetificadorContabilPDCAdapter solicitarPDCAdapter = getFactoryAdapter().getProcessarRetificadorContabilPDCAdapter();
		ProcessarRetificadorContabilResponse response = solicitarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#listarLiberarPagamento(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO)
	 */
	public List<MovimentoRetificadorDTO> listarLiberarPagamento(MovimentoRetificadorFiltroDTO filtro) {
		List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
		MovimentoRetificadorDTO item = null;

		ListarRetificadorLiberacaoRequest request = new ListarRetificadorLiberacaoRequest();
		request.setAnoMesCompetencia(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesCompetencia()), GissUtil.stringToInteger(filtro.getAnoCompetencia())));
		request.setMaximoOcorrencias(100);
		
		IListarRetificadorLiberacaoPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarRetificadorLiberacaoPDCAdapter();
		ListarRetificadorLiberacaoResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getLista())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getListaCount(); i++) {
				item = new MovimentoRetificadorDTO();
				item.setAnoMesCompetencia(response.getLista(i).getAnoMesCompetencia());
				item.setCodigoEmpresa(response.getLista(i).getCodigoEmpresa());
				item.setIdentificadorTransacaoIss(response.getLista(i).getIdentificadorTransacaoIss());
				item.setNumeroApuracaoIss(response.getLista(i).getNumeroApuracaoIss());
				item.setNomeProduto(response.getLista(i).getNomeProduto());
				item.setDataRecepcao(DateUtils.convertDatePdc(response.getLista(i).getDataRecepcao()));
				item.setIdentificadorProcessamentoIss(response.getLista(i).getIdentificadorProcessamentoIss());
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#liberarPagamentoIss(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO, br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO)
	 */
	public String liberarPagamentoIss(MovimentoRetificadorFiltroDTO filtro, MovimentoRetificadorDTO movimentoRetificadorDTO) {
		String msgRetorno = "Solicitação Realizada com Sucesso";

		ProcessarRetificadorLiberacaoRequest request = new ProcessarRetificadorLiberacaoRequest();
		request.setNumeroConsultas(100);
		
		br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] listaMunicipioAgendar = 
			new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[100];
		br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada item = 
			new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada();
		
		item.setAnoMesCompetencia(movimentoRetificadorDTO.getAnoMesCompetencia());
		item.setCodigoEmpresa(movimentoRetificadorDTO.getCodigoEmpresa());
		item.setIdentificadorTransacaoIss(movimentoRetificadorDTO.getIdentificadorTransacaoIss());
		item.setNumeroApuracaoIss(movimentoRetificadorDTO.getNumeroApuracaoIss());
		item.setNomeProduto(movimentoRetificadorDTO.getNomeProduto());
		item.setDataRecepcao(DateUtils.formatPdc(movimentoRetificadorDTO.getDataRecepcao()));
		
		listaMunicipioAgendar[0] = item;
		
		for(int i = 1; i < 100; i++){
			item = new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada();
			item.setAnoMesCompetencia(0);
			item.setCodigoEmpresa(0);
			item.setIdentificadorTransacaoIss(0);
			item.setNumeroApuracaoIss(0);
			item.setNomeProduto("");
			item.setDataRecepcao("");
			listaMunicipioAgendar[i] = item;
		}
		
		request.setListaEntrada(listaMunicipioAgendar);
		
		IProcessarRetificadorLiberacaoPDCAdapter solicitarPDCAdapter = getFactoryAdapter().getProcessarRetificadorLiberacaoPDCAdapter();
		ProcessarRetificadorLiberacaoResponse response = solicitarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#listarDiferencasContabeis(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO, br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO)
	 */
	public List<MovimentoRetificadorDTO> listarDiferencasContabeis(MovimentoRetificadorFiltroDTO filtro,
			MovimentoRetificadorDTO movimentoRetificadorDTO) {
		List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
		MovimentoRetificadorDTO item = null;

		ListarDiferencasRetificadorContabilRequest request = new ListarDiferencasRetificadorContabilRequest();
		request.setANOMES(movimentoRetificadorDTO.getAnoMesCompetencia());
		request.setCODEMPRESA(movimentoRetificadorDTO.getCodigoEmpresa());
		request.setCIDTFDTRANS(movimentoRetificadorDTO.getIdentificadorTransacaoIss());
		request.setNAPURCISSEMPR(movimentoRetificadorDTO.getNumeroApuracaoIss());
		
		IListarDiferencasRetificadorContabilPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarDiferencasRetificadorContabilPDCAdapter();
		ListarDiferencasRetificadorContabilResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getLISTA())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			movimentoRetificadorDTO.setNomeEmpresa(response.getIEMPR());
			movimentoRetificadorDTO.setNomeProduto(response.getPRODUTO());
			movimentoRetificadorDTO.setCodigoSituacaoContabil(response.getSITCONTABIL());
			movimentoRetificadorDTO.setCodigoFinalidadeArquivo(response.getCFNALDARQISS());
			for (int i = 0; i < response.getLISTACount(); i++) {
				item = new MovimentoRetificadorDTO();
				item.setCodigoMunicipio(response.getLISTA(i).getCMUN());
				item.setNomeMunicipio(response.getLISTA(i).getIMUN());
				item.setValorBaseCalculoAnterior(GissUtil.formatarValoresBig(response.getLISTA(i).getVBASECALCANT()));
				item.setPercentualAliquotaAnterior(GissUtil.formatarValoresBig(response.getLISTA(i).getPALIQTANT()));
				item.setValorApuracaoAnterior(GissUtil.formatarValoresBig(response.getLISTA(i).getVAPURCANT()));				
				item.setValorBaseCalculoAtual(GissUtil.formatarValoresBig(response.getLISTA(i).getVBASECALCATU()));
				item.setPercentualAliquotaAtual(GissUtil.formatarValoresBig(response.getLISTA(i).getPALIQTATU()));
				item.setValorApuracaoAtual(GissUtil.formatarValoresBig(response.getLISTA(i).getVAPURCATU()));
				item.setValorOscilacao(GissUtil.formatarValoresBig(response.getLISTA(i).getVALORDIF()));
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#listarReprocessarApuracao(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorFiltroDTO)
	 */
	public List<MovimentoRetificadorDTO> listarReprocessarApuracao(MovimentoRetificadorFiltroDTO filtro) {
		List<MovimentoRetificadorDTO> lista = new ArrayList<MovimentoRetificadorDTO>();
		MovimentoRetificadorDTO item = null;

		ListarReprocessarApuracaoRequest request = new ListarReprocessarApuracaoRequest();
		IListarReprocessarApuracaoPDCAdapter listarPDCAdapter = null;
		ListarReprocessarApuracaoResponse response = null;
		
		request.setAnoMesCompetencia(
			NumberUtils.formatAnoMesPdc(
				GissUtil.stringToInteger(filtro.getMesCompetencia()), 
				GissUtil.stringToInteger(filtro.getAnoCompetencia())));
		request.setCodigoEmpresa(filtro.getCodigoEmpresa());
		request.setCodigoProduto(filtro.getCodigoProduto());
		
		listarPDCAdapter = getFactoryAdapter().getListarReprocessarApuracaoPDCAdapter();
		response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getLista())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getListaCount(); i++) {
				item = new MovimentoRetificadorDTO();
				item.setCodigoEmpresa(response.getLista(i).getCodigoEmpresa());
				item.setNomeEmpresa(response.getLista(i).getNomeEmpresa());
				item.setCodigoProduto(response.getLista(i).getCodigoProduto());
				item.setNomeProduto(response.getLista(i).getNomeProduto());
				item.setAnoMesCompetencia(response.getLista(i).getAnoMesCompetencia());
				item.setNumeroApuracaoIss(response.getLista(i).getNumeroApuracao());
				item.setNomeFinalidade(response.getLista(i).getFinalidade());
				item.setNomeSituacaoContabil(response.getLista(i).getSituacaoContabil());
				item.setValorTotalApuracao(GissUtil.formatarValoresBig(response.getLista(i).getValorTotalApuracao()));
				item.setValorTotalCredito(GissUtil.formatarValoresBig(response.getLista(i).getValorTotalCredito()));
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.movimentoretificador.IMovimentoRetificadorService#reprocessarApuracao(br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO)
	 */
	public String reprocessarApuracao(MovimentoRetificadorDTO movimentoRetificadorDTO) {
		String msgRetorno = "Solicitação Realizada com Sucesso";

		ReprocessarApuracaoRequest request = new ReprocessarApuracaoRequest();
		ReprocessarApuracaoResponse response = null;
		IReprocessarApuracaoPDCAdapter reprocessarPDCAdapter = null;
		
		request.setAnoMesCompetencia(movimentoRetificadorDTO.getAnoMesCompetencia());
		request.setCodigoEmpresa(movimentoRetificadorDTO.getCodigoEmpresa());
		request.setCodigoProduto(movimentoRetificadorDTO.getCodigoProduto());
		request.setNumeroApuracao(movimentoRetificadorDTO.getNumeroApuracaoIss());
		
		reprocessarPDCAdapter = getFactoryAdapter().getReprocessarApuracaoPDCAdapter();
		response = reprocessarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	

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
}
