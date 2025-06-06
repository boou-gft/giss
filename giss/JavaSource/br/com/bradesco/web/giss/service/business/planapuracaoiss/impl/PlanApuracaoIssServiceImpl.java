/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/planapuracaoiss/impl/PlanApuracaoIssServiceImpl.java,v $
 * $Id: PlanApuracaoIssServiceImpl.java,v 1.10 2018/06/14 10:16:12 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: PlanApuracaoIssServiceImpl.java,v $
 * Revision 1.10  2018/06/14 10:16:12  gmichelini
 * *** empty log message ***
 *
 * Revision 1.9  2018/05/04 10:29:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/04/30 23:31:21  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/04/27 17:03:03  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/27 10:35:15  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/04/24 02:27:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/04/13 18:14:34  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2018/04/06 14:01:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2018/03/12 11:24:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:13:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.11  2013/03/11 12:25:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.10  2013/02/25 17:45:46  gmichelini
 * *** empty log message ***
 *
 * Revision 1.9  2013/02/15 12:49:02  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2013/02/14 15:51:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2013/02/04 17:27:26  fabio.soares
 * *** empty log message ***
 *
 * Revision 1.6  2013/02/04 12:22:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2013/01/15 17:55:20  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2013/01/15 17:14:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2012/12/20 15:53:59  renato.mariscal
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/19 19:22:35  renato.mariscal
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

package br.com.bradesco.web.giss.service.business.planapuracaoiss.impl;


import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterTechnicalException;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.IPlanApuracaoIssService;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.IPlanApuracaoIssServiceConstants;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.OcorrenciaApuracaoIssDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssEntradaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaListaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssAllDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.GerarDependenciasPlanApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta;
import br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.response.GerarDependenciasPlanApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.request.ListaPlanilhaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.request.ListaPlanilhaApuracao2Request;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.ListaPlanilhaApuracao2Response;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao;
import br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao.PlanilhaApuracaoIssAllReport;
import br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao.PlanilhaApuracaoIssAllReportTXT;
import br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao.PlanilhaApuracaoIssReport;
import br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao.PlanilhaApuracaoIssReportTXT;
import br.com.bradesco.web.giss.utils.Formatacao;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

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
 * Implementação do adaptador: PlanApuracaoIss
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class PlanApuracaoIssServiceImpl implements IPlanApuracaoIssService {

	FactoryAdapter factoryAdapter;
	/**
	 * Obtém o campo factoryAdapter
	 * @return factoryAdapter FactoryAdapter 
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * Define o campo factoryAdapter
	 * @param factoryAdapter FactoryAdapter 
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public PlanApuracaoIssSaidaDTO planApuracaoListaSaida(PlanApuracaoIssEntradaDTO planApuracaoEntrada) throws PdcAdapterTechnicalException{
		int dataCompetenciaInicio = NumberUtils.convertMesAno(planApuracaoEntrada.getMesApuracaoContabilInicio(),planApuracaoEntrada.getAnoApuracaoContabilInicio()); 
		int dataCompetenciaFim = NumberUtils.convertMesAno(planApuracaoEntrada.getMesApuracaoContabilFim(),planApuracaoEntrada.getAnoApuracaoContabilFim()); 
		
		ListarDependenciaPlanilhaApuracaoRequest request = new ListarDependenciaPlanilhaApuracaoRequest();
		request.setQuantidadeOcorrencia(100);
		request.setDataCompetenciaInicio(dataCompetenciaInicio);
		request.setDataCompetenciaFim(dataCompetenciaFim);
		request.setCodMunicipio(GissUtil.stringToLong(planApuracaoEntrada.getCodigoMunicipio()));
		request.setCodPessoaJuridica(GissUtil.notNull(planApuracaoEntrada.getCodigoDependencia())==0?0:GissUtil.notNull(planApuracaoEntrada.getCodPessoaJuridica()));
		request.setCodDependencia(GissUtil.notNull(planApuracaoEntrada.getCodigoDependencia()));
		
		ListarDependenciaPlanilhaApuracaoResponse response= getFactoryAdapter().getListarDependenciaPlanilhaApuracaoPDCAdapter().invokeProcess(request);

		if (response == null) {
			return null;
		}
		BigDecimal totalMunicipioReceita = BigDecimal.ZERO;
		BigDecimal totalMunicipiolIss = BigDecimal.ZERO;
		int cont = 0;
		long qtdeAgencia = 0l;
		long qtdePa = 0l;

		List<PlanApuracaoIssSaidaListaDTO> planApuracao = new ArrayList<PlanApuracaoIssSaidaListaDTO>();

		for(int i = 0 ; i < response.getOcorrenciasCount() ; i++){

			br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias o = response.getOcorrencias(i);
			
			PlanApuracaoIssSaidaListaDTO saidaApuracao = new PlanApuracaoIssSaidaListaDTO();

			saidaApuracao.setCodigoDepedencia(o.getCodigoDependencia());
			saidaApuracao.setCodPa(String.valueOf(o.getCodigoPaa()));
			saidaApuracao.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(o.getCodigoDependencia()), 6) + (GissUtil.notNull(String.valueOf(o.getCodigoPaa())).equals("0") || GissUtil.notNull(String.valueOf(o.getCodigoPaa())).equals("000000") || GissUtil.notNull(String.valueOf(o.getCodigoPaa())).equals("")?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(o.getCodigoPaa())),6)));
			
			saidaApuracao.setDescricaoDependencia(o.getDescricaoDependencia());
			saidaApuracao.setDescPa(o.getDescricaoPa());
			saidaApuracao.setDescDepPa(o.getDescricaoDependencia() + (GissUtil.notNull(o.getDescricaoPa()).equals("")?"":"/"+GissUtil.notNull(o.getDescricaoPa())));
			
			saidaApuracao.setCodigoPessoaJuridica((long) o.getCodigoPessoaJuridica());
			saidaApuracao.setContaContabil(o.getContaContabil());
			saidaApuracao.setDataCompetencia(o.getDataCompetencia());
			saidaApuracao.setNumeroSequencial(o.getNumeroSequencial());
			saidaApuracao.setSinalReceita(o.getSinalReceita());
			saidaApuracao.setValorReceita(BigDecimal.valueOf(o.getValorReceita()));
			saidaApuracao.setSinalTributoApuracao(o.getSinalTributoApuracao());
			saidaApuracao.setValorTributoApuracao(BigDecimal.valueOf(o.getValorTributoApuracao()));
			saidaApuracao.setCompetenciaConcatCodDepPa(GissUtil.formatarDataInvertida(o.getDataCompetencia())+saidaApuracao.getCodDepPa());
			if(o.getSinalReceita().equals("-")){
				saidaApuracao.setValorReceita(saidaApuracao.getValorReceita().negate());
			}
			if(o.getSinalTributoApuracao().equals("-")){
				saidaApuracao.setValorTributoApuracao(saidaApuracao.getValorTributoApuracao().negate());
			}
			
			if(GissUtil.notNull(String.valueOf(o.getCodigoPaa())).equals("0") || GissUtil.notNull(String.valueOf(o.getCodigoPaa())).equals("000000")){
				qtdeAgencia +=1;
			}else{
				qtdePa += 1;
			}
			
			totalMunicipioReceita = totalMunicipioReceita.add(BigDecimal.valueOf(o.getValorReceita()));
			totalMunicipiolIss = totalMunicipiolIss.add(BigDecimal.valueOf(o.getValorTributoApuracao()));
			saidaApuracao.setTotalMunicipioReceita(totalMunicipioReceita);
			saidaApuracao.setTotalMunicipiolIss(totalMunicipiolIss);
			saidaApuracao.setUf(o.getUf());
			saidaApuracao.setMunicipio(o.getMunicipio());
			saidaApuracao.setTragSemTrag(o.getTragSemTrag());
			saidaApuracao.setCodigoMunicipio(o.getCodMunicipio());
			
			planApuracao.add(saidaApuracao);
		}
		Collections.sort(planApuracao);
		for (PlanApuracaoIssSaidaListaDTO planApuracaoIssSaidaListaDTO : planApuracao) {
			planApuracaoIssSaidaListaDTO.setLinha(cont++);
			planApuracaoIssSaidaListaDTO.setQtdeAgencia(qtdeAgencia);
			planApuracaoIssSaidaListaDTO.setQtdePa(qtdePa);
			planApuracaoIssSaidaListaDTO.setTotalMunicipioReceita(totalMunicipioReceita);
			planApuracaoIssSaidaListaDTO.setTotalMunicipiolIss(totalMunicipiolIss);
			
		} 
		PlanApuracaoIssSaidaDTO retorno = new PlanApuracaoIssSaidaDTO();
		retorno.setLista(planApuracao);

		return retorno;
	}

	public RelatorioApuracaoIssDTO listarPlanilhaApuracaoAgencia(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta) throws PdcAdapterTechnicalException,PdcAdapterFunctionalException {
		ListarPlanilhaApuracaoRequest request = new ListarPlanilhaApuracaoRequest();
		request.setQtdeOcorrencias(IPlanApuracaoIssServiceConstants.NUM_MAX_LISTAR_PLANILHA_APURACAO);
		request.setCodPessoaJurid(entradaDTO.getCodPessoaJuridica() != null ? entradaDTO.getCodPessoaJuridica() : 0l);
		request.setNumSeqUnidOrganiz(entradaDTO.getNumeroSequencial() != null ? entradaDTO.getNumeroSequencial() : 0);
		request.setMesAnoApuracao(entradaDTO.getAnoApuracaoContabilFim() != null ? entradaDTO.getAnoApuracaoContabilFim() : 0);
		request.setFiltroConta(aberturaConta?"S":"N");
		
		ListarPlanilhaApuracaoResponse response = getFactoryAdapter().getListarPlanilhaApuracaoPDCAdapter().invokeProcess(request);

		if (response == null) {
			return null;
		}

		RelatorioApuracaoIssDTO apuracaoIssDTO = new RelatorioApuracaoIssDTO();
		apuracaoIssDTO.setCodAgenciaDev(entradaDTO.getCodDepPa());
		apuracaoIssDTO.setDescAgenciaDev(response.getDescAgenciaDev());
		apuracaoIssDTO.setCnpj(response.getCnpj());
		apuracaoIssDTO.setInscricaoMunicipal(response.getInscMunicipial());
		apuracaoIssDTO.setEndereco(response.getEndereco());
		apuracaoIssDTO.setCep(response.getCep());
		apuracaoIssDTO.setComplementoCep(response.getComplementoCep());
		apuracaoIssDTO.setCodAgenciaCentralizadora(response.getCodAgenciaCentralizadora());
		apuracaoIssDTO.setDigitoAgenciaCentralizadora(response.getDigAgenciaCentralizadora());
		apuracaoIssDTO.setDescAgenciaCentralizadora(response.getDescAgenciaCentralizadora());
		apuracaoIssDTO.setCodigoMunicipio(response.getCodMunicipio());
		apuracaoIssDTO.setDigitoMunicipio(response.getDigitoMunicipio());
		apuracaoIssDTO.setSiglaEstado(response.getDescUf());
		apuracaoIssDTO.setDiaVencimento(response.getDiaVenciemtnoTributo());
		apuracaoIssDTO.setMesCompetencia(response.getMesCompetencia());
		apuracaoIssDTO.setAnoCompetencia(response.getAnoContencia());
		apuracaoIssDTO.setValorRedutor(BigDecimal.valueOf(response.getValorRedutorTotal()));
		apuracaoIssDTO.setValorTotalReceita(BigDecimal.valueOf(response.getValorTotalReceita()));
		apuracaoIssDTO.setValorTotalIss(BigDecimal.valueOf(response.getValorTotalIss()));

		for (int i = 0; i < response.getListaPlanApuracaoCount(); i++) {
			ListaPlanApuracao ocorr = response.getListaPlanApuracao(i);

			if (ocorr.getTipoRegistro().trim().equals("")) {
				break;
			}

			OcorrenciaApuracaoIssDTO apur = new OcorrenciaApuracaoIssDTO();
			apur.setTipoRegistro(ocorr.getTipoRegistro());
			apur.setCodigoTipoServico(ocorr.getCodTipoServico());
			apur.setDescricaoTipoServico(ocorr.getDescTipoServico());
			apur.setCosif(GissUtil.mascaraContaContabil(ocorr.getCosif(), apur.getRazao()));
			apur.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodGrupo() , ocorr.getCodSubGrupo()));
			apur.setConta(ocorr.getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(ocorr.getConta()), 7)+"-"+ ocorr.getDigConta());
			apur.setItemLeiComplementar(ocorr.getItemLei());
			apur.setNomeContaContabil(ocorr.getDescRazao());
			apur.setPercentualAliquota(BigDecimal.valueOf(ocorr.getAliquotaApuracao()));
			apur.setValorReceita(BigDecimal.valueOf(ocorr.getValorReceita()));
			if ("-".equals(ocorr.getSinalReceita())) {
				apur.setValorReceita(apur.getValorReceita().negate());
			}
			apur.setValorTributo(BigDecimal.valueOf(ocorr.getValorIss()));
			if ("-".equals(ocorr.getSinalIss())) {
				apur.setValorTributo(apur.getValorTributo().negate());
			}
			apur.setCompetencia(1);
			
			apuracaoIssDTO.addApuracao(apur);
		}
			
		return apuracaoIssDTO;
	}

	public RelatorioApuracaoIssDTO listarPlanilhaApuracao(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta) {
		ListaPlanilhaApuracaoRequest request = new ListaPlanilhaApuracaoRequest();
		request.setQtdeOcorrencias(IPlanApuracaoIssServiceConstants.NUM_MAX_LISTAR_PLANILHA_APURACAO);
		request.setCodPessoaJurid(entradaDTO.getCodPessoaJuridica() != null ? entradaDTO.getCodPessoaJuridica() : 0l);
		request.setNumSeqUnidOrganiz(entradaDTO.getNumeroSequencial() != null ? entradaDTO.getNumeroSequencial() : 0);
		request.setMesAnoApurInicial(NumberUtils.convertMesAno(entradaDTO.getMesApuracaoContabilInicio(),entradaDTO.getAnoApuracaoContabilInicio()));
		request.setMesAnoApurFinal(NumberUtils.convertMesAno(entradaDTO.getMesApuracaoContabilFim(),entradaDTO.getAnoApuracaoContabilFim()));
		request.setFiltroConta(aberturaConta?"S":"N");
		request.setCodMunicipio(Long.parseLong(entradaDTO.getCodigoMunicipio()));
		ListaPlanilhaApuracaoResponse response = getFactoryAdapter().getListaPlanilhaApuracaoPDCAdapter().invokeProcess(request);
		
		if (response == null) {
			return null;
		}
		
		RelatorioApuracaoIssDTO apuracaoIssDTO = new RelatorioApuracaoIssDTO();
		apuracaoIssDTO.setCodAgenciaDev(entradaDTO.getCodDepPa());
		apuracaoIssDTO.setDescAgenciaDev(response.getDescAgenciaDev());
		apuracaoIssDTO.setCnpj(response.getCnpj());
		apuracaoIssDTO.setInscricaoMunicipal(response.getInscMunicipial());
		apuracaoIssDTO.setEndereco(response.getEndereco());
		apuracaoIssDTO.setCep(response.getCep());
		apuracaoIssDTO.setComplementoCep(response.getComplementoCep());
		apuracaoIssDTO.setCodAgenciaCentralizadora(response.getCodAgenciaCentralizadora());
		apuracaoIssDTO.setDigitoAgenciaCentralizadora(response.getDigAgenciaCentralizadora());
		apuracaoIssDTO.setDescAgenciaCentralizadora(response.getDescAgenciaCentralizadora());
		apuracaoIssDTO.setCodigoMunicipio(response.getCodMunicipio());
		apuracaoIssDTO.setDigitoMunicipio(response.getDigitoMunicipio());
		apuracaoIssDTO.setSiglaEstado(response.getDescUf());
		apuracaoIssDTO.setDiaVencimento(response.getDiaVenciemtnoTributo());
//		apuracaoIssDTO.setMesCompetencia(response.getMesCompetencia());
		apuracaoIssDTO.setAnoCompetencia(response.getAnoContencia());
		apuracaoIssDTO.setValorRedutor(response.getValorRedutorTotal());
		apuracaoIssDTO.setValorTotalReceita(response.getValorTotalReceita());
		apuracaoIssDTO.setValorTotalIss(response.getValorTotalIss());
		
		for (int i = 0; i < response.getOcorrenciasPlanApuracaoCount(); i++) {
			OcorrenciasPlanApuracao ocorr = response.getOcorrenciasPlanApuracao(i);
			
			if (ocorr.getTipoRegistro().trim().equals("")) {
				break;
			}
			
			OcorrenciaApuracaoIssDTO apur = new OcorrenciaApuracaoIssDTO();
			apur.setTipoRegistro(ocorr.getTipoRegistro());
			apur.setCodigoTipoServico(ocorr.getCodTipoServico());
			apur.setDescricaoTipoServico(ocorr.getDescTipoServico());
			apur.setCosif(GissUtil.mascaraContaContabil(ocorr.getCosif(), apur.getRazao()));
			apur.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodGrupo() , ocorr.getCodSubGrupo()));
			apur.setConta(ocorr.getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(ocorr.getConta()), 7)+"-"+ ocorr.getDigConta());
			apur.setNomeContaContabil(ocorr.getDescContaContabil());
			apur.setItemLeiComplementar(ocorr.getItemLei());
			apur.setPercentualAliquota(ocorr.getAliquotaApuracao());
			apur.setValorReceita(ocorr.getValorReceita());
			if ("-".equals(ocorr.getSinalReceita())) {
				apur.setValorReceita(apur.getValorReceita().negate());
			}
			apur.setValorTributo(ocorr.getValorIss());
			if ("-".equals(ocorr.getSinalIss())) {
				apur.setValorTributo(apur.getValorTributo().negate());
			}
			apur.setCompetencia(ocorr.getMesAnoApuracao());
			
			apuracaoIssDTO.addApuracao(apur);
		}
		
		return apuracaoIssDTO;
	}

	public RelatorioApuracaoIssAllDTO listarPlanilhaApuracaoAll(PlanApuracaoIssEntradaDTO entradaDTO, Boolean aberturaConta) {
		ListaPlanilhaApuracao2Request request = new ListaPlanilhaApuracao2Request();
		request.setQtdeOcorrencias(IPlanApuracaoIssServiceConstants.NUM_MAX_LISTAR_PLANILHA_APURACAO);
		request.setCodPessoaJurid(entradaDTO.getCodPessoaJuridica() != null ? entradaDTO.getCodPessoaJuridica() : 0l);
		request.setNumSeqUnidOrganiz(entradaDTO.getNumeroSequencial() != null ? entradaDTO.getNumeroSequencial() : 0);
		request.setMesAnoApurInicial(NumberUtils.convertMesAno(entradaDTO.getMesApuracaoContabilInicio(),entradaDTO.getAnoApuracaoContabilInicio()));
		request.setMesAnoApurFinal(NumberUtils.convertMesAno(entradaDTO.getMesApuracaoContabilFim(),entradaDTO.getAnoApuracaoContabilFim()));
		request.setFiltroConta(aberturaConta?"S":"N");
		
		ListaPlanilhaApuracao2Response response = getFactoryAdapter().getListaPlanilhaApuracao2PDCAdapter().invokeProcess(request);
		
		if (response == null) {
			return null;
		}

		RelatorioApuracaoIssAllDTO apuracaoIssAllDTO = new RelatorioApuracaoIssAllDTO();
		
		String mesAnoComp = "";
		String mesAnoCompAtual = "";
		
		apuracaoIssAllDTO.setValorRedutorTotal(BigDecimal.valueOf(response.getValorRedutorTotal()));
		apuracaoIssAllDTO.setValorTotalIssTotal(BigDecimal.valueOf(response.getValorTotalIss()));
		apuracaoIssAllDTO.setValorTotalReceitaTotal(BigDecimal.valueOf(response.getValorTotalReceita()));
		
		RelatorioApuracaoIssDTO apuracaoIssDTO = new RelatorioApuracaoIssDTO();
		
		for (int i = 0; i < response.getOcorrenciasPlanApuracaoCount(); i++) {
			br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao ocorr = response.getOcorrenciasPlanApuracao(i);
			
			if (!ocorr.getTipoRegistro().trim().equals("")) {

				mesAnoCompAtual = Formatacao.formataZerosEsquerda(String.valueOf(ocorr.getMesAnoApuracao()), 6);
				if (!mesAnoComp.equals(mesAnoCompAtual) && ocorr.getTipoRegistro().trim().equals("D")){
					
					if (!mesAnoComp.equals("")){
						apuracaoIssAllDTO.getApuracoesMesAno().add(apuracaoIssDTO);
					}
					mesAnoComp = mesAnoCompAtual;

					apuracaoIssDTO = new RelatorioApuracaoIssDTO();
					apuracaoIssDTO.setCodAgenciaDev(entradaDTO.getCodDepPa());
					apuracaoIssDTO.setDescAgenciaDev(response.getDescAgenciaDev());
					apuracaoIssDTO.setCnpj(response.getCnpj());
					apuracaoIssDTO.setInscricaoMunicipal(response.getInscMunicipial());
					apuracaoIssDTO.setEndereco(response.getEndereco());
					apuracaoIssDTO.setCep(response.getCep());
					apuracaoIssDTO.setComplementoCep(response.getComplementoCep());
					apuracaoIssDTO.setCodAgenciaCentralizadora(response.getCodAgenciaCentralizadora());
					apuracaoIssDTO.setDigitoAgenciaCentralizadora(response.getDigAgenciaCentralizadora());
					apuracaoIssDTO.setDescAgenciaCentralizadora(response.getDescAgenciaCentralizadora());
					apuracaoIssDTO.setCodigoMunicipio(response.getCodMunicipio());
					apuracaoIssDTO.setDigitoMunicipio(response.getDigitoMunicipio());
					apuracaoIssDTO.setSiglaEstado(response.getDescUf());
					apuracaoIssDTO.setDiaVencimento(ocorr.getDiaVencimento());
					apuracaoIssDTO.setAnoCompetencia(Integer.valueOf(!mesAnoComp.equals("")?mesAnoComp.substring(2, 6):"0"));
					apuracaoIssDTO.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodGrupo() , ocorr.getCodSubGrupo()));
					
					apuracaoIssDTO.setMesCompetencia(ocorr.getMesCompetencia());
					apuracaoIssDTO.setValorRedutor(BigDecimal.valueOf(ocorr.getValorRedutorMes()));
					apuracaoIssDTO.setValorTotalReceita(BigDecimal.valueOf(ocorr.getValorReceita()));
					apuracaoIssDTO.setValorTotalIss(BigDecimal.valueOf(ocorr.getValorIss()));
				}

				OcorrenciaApuracaoIssDTO apur = new OcorrenciaApuracaoIssDTO();
				apur.setTipoRegistro(ocorr.getTipoRegistro());
				apur.setCodigoTipoServico(ocorr.getCodTipoServico());
				apur.setDescricaoTipoServico(ocorr.getDescTipoServico());
				
				apur.setNomeContaContabil(ocorr.getDescRazao());
				
				if("".equals(ocorr.getDescRazao())){
				    apur.setNomeContaContabil(ocorr.getDescContaContabil());
				}
				apur.setCosif(GissUtil.mascaraContaContabil(ocorr.getCosif(), apur.getRazao()));
				apur.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodGrupo() , ocorr.getCodSubGrupo()));
				apur.setConta(ocorr.getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(ocorr.getConta()), 7)+"-"+ ocorr.getDigConta());
				apur.setItemLeiComplementar(ocorr.getItemLei());
				apur.setPercentualAliquota(BigDecimal.valueOf(ocorr.getAliquotaApuracao()));
				apur.setValorReceita(BigDecimal.valueOf(ocorr.getValorReceita()));
				if ("-".equals(ocorr.getSinalReceita())) {
					apur.setValorReceita(apur.getValorReceita().negate());
				}
				apur.setValorTributo(BigDecimal.valueOf(ocorr.getValorIss()));
				if ("-".equals(ocorr.getSinalIss())) {
					apur.setValorTributo(apur.getValorTributo().negate());
				}
				apur.setCompetencia(ocorr.getMesAnoApuracao());
				
				apuracaoIssDTO.addApuracao(apur);
			}
		}
		if (response.getOcorrenciasPlanApuracaoCount()>0){
			apuracaoIssAllDTO.getApuracoesMesAno().add(apuracaoIssDTO);
		}
		
		return apuracaoIssAllDTO;
	}
	
	
	public String gerarPlaninlhaApuracaoEos(PlanApuracaoIssEntradaDTO planApuracaoEntrada, Boolean aberturaConta) throws PdcAdapterTechnicalException{
		
		GerarDependenciasPlanApuracaoRequest request = new GerarDependenciasPlanApuracaoRequest();
		request.setCodMunicipio(GissUtil.stringToLong(planApuracaoEntrada.getCodigoMunicipio()));
		request.setFiltroConta(aberturaConta?"S":"N");
		ListaDepenPlanApuracaoNvConta[] lista = new ListaDepenPlanApuracaoNvConta[1000];
		for (int i = 0; i < lista.length; i++) {
			ListaDepenPlanApuracaoNvConta item = new ListaDepenPlanApuracaoNvConta();
			if (i < planApuracaoEntrada.getLista().size()) {
				item.setCompetencia(GissUtil.notNull("01."+GissUtil.preencherZerosAEsquerda(String.valueOf(planApuracaoEntrada.getLista().get(i).getMesApuracaoContabilInicio()),2)+"."+ planApuracaoEntrada.getLista().get(i).getAnoApuracaoContabilInicio()));
				item.setNumSeqUnidOrganiz(planApuracaoEntrada.getLista().get(i).getNumeroSequencial());
			}else {
				item.setCompetencia("");
				item.setNumSeqUnidOrganiz(0);
			}
			lista[i] = item;
		}
		request.setQtdeRegistros(planApuracaoEntrada.getLista().size());
		request.setListaDepenPlanApuracaoNvConta(lista);
		
		GerarDependenciasPlanApuracaoResponse response= getFactoryAdapter().getGerarDependenciasPlanApuracaoPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	/**
	 * Gera o relatorio em PDF
	 */
	public void gerarPlanilhaApuracaoPDF(List<RelatorioApuracaoIssDTO>  apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException {
		new PlanilhaApuracaoIssReport(apuracaoIssDTO, aberturaConta).gerarPdf(outputStream);
	}

	
	
	/**
	 * Gera o relatorio em PDF
	 */
	public void gerarPlanilhaApuracaoAllPDF(List<RelatorioApuracaoIssAllDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException {
		new PlanilhaApuracaoIssAllReport(apuracaoIssDTO, aberturaConta).gerarPdf(outputStream);
	}

	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarPlanilhaApuracaoAllTXT(List<RelatorioApuracaoIssAllDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException, ReportException, IOException {
		new PlanilhaApuracaoIssAllReportTXT(apuracaoIssDTO,outputStream, aberturaConta).gerar();
	}

	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarPlanilhaApuracaoTXT(List<RelatorioApuracaoIssDTO> apuracaoIssDTO, OutputStream outputStream, Boolean aberturaConta) throws DocumentException, ReportException, IOException {
		new PlanilhaApuracaoIssReportTXT(apuracaoIssDTO,outputStream, aberturaConta).gerar();
	}
		
 

}

