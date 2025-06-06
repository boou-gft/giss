package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.SituacaoRemessaEnum;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.UsuarioRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassiva.IAprovarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassiva.request.AprovarCargaMassivaRequest;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassiva.response.AprovarCargaMassivaResponse;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.IAprovarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.request.AprovarCargaMassivaGerencialRequest;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.response.AprovarCargaMassivaGerencialResponse;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassiva.IConferirRejeitarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassiva.request.ConferirRejeitarCargaMassivaRequest;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassiva.response.ConferirRejeitarCargaMassivaResponse;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.IConferirRejeitarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.response.ConferirRejeitarCargaMassivaGerencialResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.IDetalharCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.DetalharCargaMassivaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.IListarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.request.ListarCargaMassivaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.ListarCargaMassivaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.IListarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.response.ListarCargaMassivaGerencialResponse;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.IManterAliquotaDetalhePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.ManterAliquotaDetalheResponse;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.IManterAliquotaListaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.ManterAliquotaListaResponse;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.IManterAliquotaManutencaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.response.ManterAliquotaManutencaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.ISolicitarRemessaAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.response.SolicitarRemessaAliquotaResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.integracao.cargamassivaaliquota.CargaMassivaReportTXT;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.Formatacao;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

import com.lowagie.text.DocumentException;

/**@nome: CargaMassivaAliquotaServiceImpl.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class CargaMassivaAliquotaServiceImpl implements ICargaMassivaAliquotaService {
	
	private static final String CODIGO_GENERICO_SUCESSO = "GISS0011";
	
	private FactoryAdapter factoryAdapter;

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#listarCargaMassivaIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO)
	 */
	public List<RemessaAliquotaDTO> listarCargaMassivaIssProprio(ManterAliquotaFiltroDTO filtro) {
		List<RemessaAliquotaDTO> lista = new ArrayList<RemessaAliquotaDTO>();
		RemessaAliquotaDTO item = null;

		ListarCargaMassivaRequest request = new ListarCargaMassivaRequest();
		request.setAnoMesInicio(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesInicial()), GissUtil.stringToInteger(filtro.getAnoInicial())));
		request.setAnoMesFim(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesFinal()), GissUtil.stringToInteger(filtro.getAnoFinal())));
		
		IListarCargaMassivaPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarCargaMassivaPDCAdapter();
		ListarCargaMassivaResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getQtdOcorrencia())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getQtdOcorrencia(); i++) {
				item = new RemessaAliquotaDTO();
				item.setNumeroRemessa(response.getLista(i).getNumeroRemessa());
				item.setSituacaoRemessa(SituacaoRemessaEnum.getByCodigo(response.getLista(i).getCodigoSituacao()));
				item.setUsuarioCarga(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioCarga(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraCarga())));
				item.setUsuarioConferencia(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioConferencia(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraConferencia())));
				item.setUsuarioAprovacao(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioAprovacao(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraAprovacao())));
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#listarCargaMassivaIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO)
	 */
	public List<RemessaAliquotaDTO> listarCargaMassivaIssGerencial(ManterAliquotaFiltroDTO filtro) {
		List<RemessaAliquotaDTO> lista = new ArrayList<RemessaAliquotaDTO>();
		RemessaAliquotaDTO item = null;

		ListarCargaMassivaGerencialRequest request = new ListarCargaMassivaGerencialRequest();
		request.setAnoMesInicio(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesInicial()), GissUtil.stringToInteger(filtro.getAnoInicial())));
		request.setAnoMesFim(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesFinal()), GissUtil.stringToInteger(filtro.getAnoFinal())));
		
		IListarCargaMassivaGerencialPDCAdapter listarPDCAdapter = getFactoryAdapter().getListarCargaMassivaGerencialPDCAdapter();
		ListarCargaMassivaGerencialResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getQtdOcorrencia())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getQtdOcorrencia(); i++) {
				item = new RemessaAliquotaDTO();
				item.setNumeroRemessa(response.getLista(i).getNumeroRemessa());
				item.setSituacaoRemessa(SituacaoRemessaEnum.getByCodigo(response.getLista(i).getCodigoSituacao()));
				item.setUsuarioCarga(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioCarga(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraCarga())));
				item.setUsuarioConferencia(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioConferencia(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraConferencia())));
				item.setUsuarioAprovacao(new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioAprovacao(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraAprovacao())));
				lista.add(item);
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#listarManterAliquotaIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO)
	 */
	public List<ManterAliquotaDTO> listarManterAliquotaIssProprio(ManterAliquotaFiltroDTO filtro) {
		List<ManterAliquotaDTO> lista = new ArrayList<ManterAliquotaDTO>();

		ManterAliquotaListaRequest request = new ManterAliquotaListaRequest();
		request.setAnoMesInicio(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesInicial()), GissUtil.stringToInteger(filtro.getAnoInicial())));
		request.setAnoMesFim(NumberUtils.formatAnoMesPdc(GissUtil.stringToInteger(filtro.getMesFinal()), GissUtil.stringToInteger(filtro.getAnoFinal())));
		request.setCodigoMunicipio(GissUtil.notNull(filtro.getCodigoMunicipio()));
		request.setCodigoItemServico(GissUtil.notNull(filtro.getCodigoItemServico()));
		
		IManterAliquotaListaPDCAdapter listarPDCAdapter = getFactoryAdapter().getManterAliquotaListaPDCAdapter();
		ManterAliquotaListaResponse response = listarPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getQtdOcorrencia())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getQtdOcorrencia(); i++) {
				lista.add(
					new ManterAliquotaDTO(
						response.getLista(i).getCodigoMunicipio(),
						response.getLista(i).getDescricaoMunicipio(),
						response.getLista(i).getAliquota(),
						DateUtils.convertDatePdc(response.getLista(i).getCompetenciaInicial()),
						DateUtils.convertDatePdc(response.getLista(i).getCompetenciaFinal()),
						new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioCarga(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraCarga())),
						new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioConferencia(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraConferencia())),
						new UsuarioRemessaAliquotaDTO(response.getLista(i).getUsuarioAprovacao(), DateUtils.convertTimestampPdc(response.getLista(i).getDataHoraAprovacao())),
						filtro.getIndicadorPesquisa()));
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#listarManterAliquotaIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO)
	 */
	public List<ManterAliquotaDTO> listarManterAliquotaIssGerencial(ManterAliquotaFiltroDTO filtro) {
		List<ManterAliquotaDTO> lista = new ArrayList<ManterAliquotaDTO>();
		
		return lista;
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#detalharManterAliquotaIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO, java.lang.String)
	 */
	public List<ItemManterAliquotaDTO> detalharManterAliquotaIssProprio(ManterAliquotaDTO manterAliquotaDTO, String tipoTela) {
		List<ItemManterAliquotaDTO> lista = new ArrayList<ItemManterAliquotaDTO>();
		
		ManterAliquotaDetalheRequest request = new ManterAliquotaDetalheRequest();
		request.setCodigoMunicipio(GissUtil.notNull(manterAliquotaDTO.getCodigoMunicipio()));
		request.setIndicadorPesquisa(GissUtil.notNull(manterAliquotaDTO.getIndicadorPesquisa()));
		request.setTipoTela(tipoTela);

		IManterAliquotaDetalhePDCAdapter detalharPDCAdapter = getFactoryAdapter().getManterAliquotaDetalhePDCAdapter();
		ManterAliquotaDetalheResponse response = detalharPDCAdapter.invokeProcess(request);
		manterAliquotaDTO.atualizarAliquotaPadrao(response.getPercentualAliquotaApuracaoPadrao());
		
		if (GissUtil.isEmptyOrNull(response.getQtdOcorrencia())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getQtdOcorrencia(); i++) {
				lista.add(
					new ItemManterAliquotaDTO(
						response.getLista(i).getCodigoMunicipio(),
						response.getLista(i).getCodigoItemServico(),
						response.getLista(i).getNomeItemServico(),
						GissUtil.formatarValoresBig(response.getLista(i).getPercentualAliquotaApuracaoAtualizado())));
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#detalharManterAliquotaIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO, java.lang.String)
	 */
	public List<ItemManterAliquotaDTO> detalharManterAliquotaIssGerencial(ManterAliquotaDTO manterAliquotaDTO, String tipoTela) {
		List<ItemManterAliquotaDTO> lista = new ArrayList<ItemManterAliquotaDTO>();
		
		return lista;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#detalharCargaMassivaIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssProprio(RemessaAliquotaDTO remessaAliquotaDTO) {
		return detalharCargaMassiva(remessaAliquotaDTO);
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#detalharCargaMassivaIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO) {
		return detalharCargaMassiva(remessaAliquotaDTO);
	}
	
	/**
	 * @nome: detalharCargaMassiva
	 * @propósito: Método responsável por detalharCargaMassiva.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return List<ItemRemessaAliquotaDTO>
	 */
	private List<ItemRemessaAliquotaDTO> detalharCargaMassiva(RemessaAliquotaDTO remessaAliquotaDTO) {
		List<ItemRemessaAliquotaDTO> lista = new ArrayList<ItemRemessaAliquotaDTO>();
		
		DetalharCargaMassivaRequest request = new DetalharCargaMassivaRequest();
		request.setNumeroRemessa(GissUtil.notNull(remessaAliquotaDTO.getNumeroRemessa()));
		
		IDetalharCargaMassivaPDCAdapter detalharPDCAdapter = getFactoryAdapter().getDetalharCargaMassivaPDCAdapter();
		DetalharCargaMassivaResponse response = detalharPDCAdapter.invokeProcess(request);
		
		if (GissUtil.isEmptyOrNull(response.getLista())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		} else {
			for (int i = 0; i < response.getListaCount(); i++) {
				if (!GissUtil.isEmptyOrNull(response.getLista(i).getCodigoMunicipio())) {
					lista.add(
							new ItemRemessaAliquotaDTO(
								response.getLista(i).getCodigoMunicipio(),
								response.getLista(i).getNomeMunicipio(),
								response.getLista(i).getUf(),
								response.getLista(i).getCodigoItemServico(),
								response.getLista(i).getNomeItemServico(),
								response.getLista(i).getAliquotaAtual(),
								response.getLista(i).getAliquotaIssProprio(),
								response.getLista(i).getAliquotaIssGerencial()));
				}
			}
			return lista;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#rejeitarIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String rejeitarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Rejeição Realizada com Sucesso";

		ConferirRejeitarCargaMassivaResponse response = conferirRejeitarIssProprio(remessaAliquotaDTO, "R");
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#rejeitarIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String rejeitarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Rejeição Realizada com Sucesso";

		ConferirRejeitarCargaMassivaGerencialResponse response = conferirRejeitarIssGerencial(remessaAliquotaDTO, "R");
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#conferirIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String conferirIssProprio(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Conferência Realizada com Sucesso";

		ConferirRejeitarCargaMassivaResponse response = conferirRejeitarIssProprio(remessaAliquotaDTO, "C");
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#conferirIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String conferirIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Conferência Realizada com Sucesso";

		ConferirRejeitarCargaMassivaGerencialResponse response = conferirRejeitarIssGerencial(remessaAliquotaDTO, "C");
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/**
	 * @nome: conferirRejeitarIssProprio
	 * @propósito: Método responsável por conferirRejeitarIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @param acao String
	 * @return ConferirRejeitarCargaMassivaResponse
	 */
	private ConferirRejeitarCargaMassivaResponse conferirRejeitarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO, String acao) {
		ConferirRejeitarCargaMassivaRequest request = new ConferirRejeitarCargaMassivaRequest();
		request.setNumeroRemessa(GissUtil.notNull(remessaAliquotaDTO.getNumeroRemessa()));
		request.setIndicadorAcao(GissUtil.notNull(acao));
		
		IConferirRejeitarCargaMassivaPDCAdapter conferirRejeitarPDCAdapter = getFactoryAdapter().getConferirRejeitarCargaMassivaPDCAdapter();
		ConferirRejeitarCargaMassivaResponse response = conferirRejeitarPDCAdapter.invokeProcess(request);
		
		return response;
	}
	
	/**
	 * @nome: conferirRejeitarIssGerencial
	 * @propósito: Método responsável por conferirRejeitarIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @param acao String
	 * @return ConferirRejeitarCargaMassivaGerencialResponse
	 */
	private ConferirRejeitarCargaMassivaGerencialResponse conferirRejeitarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO, String acao) {
		ConferirRejeitarCargaMassivaGerencialRequest request = new ConferirRejeitarCargaMassivaGerencialRequest();
		request.setNumeroRemessa(GissUtil.notNull(remessaAliquotaDTO.getNumeroRemessa()));
		request.setIndicadorAcao(GissUtil.notNull(acao));
		
		IConferirRejeitarCargaMassivaGerencialPDCAdapter conferirRejeitarPDCAdapter = getFactoryAdapter().getConferirRejeitarCargaMassivaGerencialPDCAdapter();
		ConferirRejeitarCargaMassivaGerencialResponse response = conferirRejeitarPDCAdapter.invokeProcess(request);
		
		return response;
	}

	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#aprovarIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String aprovarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Aprovação Realizada com Sucesso";

		AprovarCargaMassivaRequest request = new AprovarCargaMassivaRequest();
		request.setNumeroRemessa(GissUtil.notNull(remessaAliquotaDTO.getNumeroRemessa()));
		
		IAprovarCargaMassivaPDCAdapter aprovarPDCAdapter = getFactoryAdapter().getAprovarCargaMassivaPDCAdapter();
		AprovarCargaMassivaResponse response = aprovarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#aprovarIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO)
	 */
	public String aprovarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO) {
		String msgRetorno = "Aprovação Realizada com Sucesso";

		AprovarCargaMassivaGerencialRequest request = new AprovarCargaMassivaGerencialRequest();
		request.setNumeroRemessa(GissUtil.notNull(remessaAliquotaDTO.getNumeroRemessa()));
		
		IAprovarCargaMassivaGerencialPDCAdapter aprovarPDCAdapter = getFactoryAdapter().getAprovarCargaMassivaGerencialPDCAdapter();
		AprovarCargaMassivaGerencialResponse response = aprovarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#gerarRelatorioCargaMassivaTXT(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO, java.util.List, javax.servlet.ServletOutputStream)
	 */
	public void gerarRelatorioCargaMassivaTXT(RemessaAliquotaDTO remessaAliquotaDTO, List<ItemRemessaAliquotaDTO> lista, 
			Boolean isIssProprio, ServletOutputStream outputStream) throws DocumentException, ReportException, IOException {
		new CargaMassivaReportTXT(remessaAliquotaDTO, lista, isIssProprio, outputStream).gerar();
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#modificarAliquotaIssProprio(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO, java.util.List, java.lang.String)
	 */
	public String modificarAliquotaIssProprio(ManterAliquotaDTO manterAliquotaDTO,
			List<ItemManterAliquotaDTO> listaSelecionados, String tipoTela) {
		
		ManterAliquotaManutencaoRequest request = new ManterAliquotaManutencaoRequest();
		request.setIndicadorPesquisa(GissUtil.notNull(manterAliquotaDTO.getIndicadorPesquisa()));
		request.setTipoTela(GissUtil.notNull(tipoTela));
		request.setQtdOcorrencia(GissUtil.notNull(listaSelecionados.size()));

		for(int i = 0; i < listaSelecionados.size(); i++){
			ItemManterAliquotaDTO dto = listaSelecionados.get(i);
			br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista entrada  = new br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista();
			
			entrada.setCodigoMunicipio(GissUtil.notNull(dto.getCodigoMunicipio()));
			entrada.setCodigoItemServico(GissUtil.notNull(dto.getCodigoItemServico()));
			entrada.setPercentualAliquotaApuracaoAtualizado(Formatacao.retirarMascaraBigDecimal(dto.getPercentualAliquotaAtualizado()));

			request.addLista(i, entrada);
		}

		IManterAliquotaManutencaoPDCAdapter manterPDCAdapter = getFactoryAdapter().getManterAliquotaManutencaoPDCAdapter();
		ManterAliquotaManutencaoResponse response = manterPDCAdapter.invokeProcess(request);
		
		return response.getMensagem();
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#modificarAliquotaIssGerencial(br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO, java.util.List, java.lang.String)
	 */
	public String modificarAliquotaIssGerencial(ManterAliquotaDTO manterAliquotaDTO,
			List<ItemManterAliquotaDTO> listaSelecionados, String tipoTela) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService#solicitarRemessa()
	 */
	public String solicitarRemessa() {
		String msgRetorno = "Solicitação Realizada com Sucesso";

		SolicitarRemessaAliquotaRequest request = new SolicitarRemessaAliquotaRequest();
		
		ISolicitarRemessaAliquotaPDCAdapter solicitarPDCAdapter = getFactoryAdapter().getSolicitarRemessaAliquotaPDCAdapter();
		SolicitarRemessaAliquotaResponse response = solicitarPDCAdapter.invokeProcess(request);
		
		if (!CODIGO_GENERICO_SUCESSO.equals(response.getCodMensagem())) {
			throw new PdcAdapterFunctionalException(response.getCodMensagem(), response.getMensagem());
		}
		
		return msgRetorno;
	}
	
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}
