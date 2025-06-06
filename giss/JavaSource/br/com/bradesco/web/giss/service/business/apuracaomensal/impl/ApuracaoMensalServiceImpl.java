package br.com.bradesco.web.giss.service.business.apuracaomensal.impl;

import static br.com.bradesco.web.giss.utils.GissUtil.dateToString;
import static br.com.bradesco.web.giss.utils.GissUtil.verificaIntegerNulo;
import static br.com.bradesco.web.giss.utils.GissUtil.verificaLongNulo;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.OcorrenciaApuracaoMensalTotalizadaSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.OcorrenciaDependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.IConsultaApuracaoPaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.response.ConsultaApuracaoPaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.ConsultaApurParcialIssResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.IConsultaConciliacaoApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.request.ConsultaConciliacaoApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.IConsultarRelacaoPaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.IConsultarTarifasCobradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.response.ConsultarTarifasCobradasResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.IDetalharJustificativaApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.DetalharJustificativaApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.IIncluirApuracaoAjustePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.response.IncluirApuracaoAjusteResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirjustificativa.IIncluirJustificativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirjustificativa.request.IncluirJustificativaRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirjustificativa.response.IncluirJustificativaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.IListarApuracaoMensalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.response.ListarApuracaoMensalResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.request.ListarApuracaoMensalNvContaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.request.ListarApuracaoMensalTotalizadaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.IListarConciliacaoApuracaoLoopPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.request.ListarConciliacaoApuracaoLoopRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.processamento.conciliacaoapuracao.PlanilhaConciliacaoReport;
import br.com.bradesco.web.giss.service.report.processamento.conciliacaoapuracao.PlanilhaConciliacaoReportTXT;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.SaidaCampoValorVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;

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
 * Implementação do adaptador: ApuracaoMensal
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ApuracaoMensalServiceImpl implements IApuracaoMensalService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ApuracaoMensalServiceImpl() {
    }
    
    
    public ApuracaoMensalDTO prosseguirApuracaoMensal(){
    	
    	ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
    	
    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_MENSAL);
    	lRequest.setFuncaoBotao(IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_PROSSEGUIR);
    	lRequest.setDiaDe("");
    	lRequest.setDiaAte("");
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);
    	
    	apuracaoMensalDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoMensalDTO.setMensagem(lResponse.getMensagem());
    	
    	return apuracaoMensalDTO;
    	
    }
    
  
    public DependenciaApuracaoMensalSaidaDTO listarDependenciaApuracaoMensal(DependenciaApuracaoMensalEntradaDTO apuracaoMensalEntradaDTO) {
		ListarDependenciaApuracaoMensalRequest request = new ListarDependenciaApuracaoMensalRequest();
		request.setCodigoMunicipio(apuracaoMensalEntradaDTO.getCodigoMunicipioLong() != null ? apuracaoMensalEntradaDTO.getCodigoMunicipioLong() : 0L);
		request.setMesAnoApuracaoContabil(apuracaoMensalEntradaDTO.getMesAnoApuracaoContabil() != null ? apuracaoMensalEntradaDTO.getMesAnoApuracaoContabil() : 0);
		request.setNumeroMaximoOcorrencia(50);
		request.setCodigoPessoaJuridica(GissUtil.notNull(apuracaoMensalEntradaDTO.getCodigoPessoaJuridica()));
		request.setCodigoUndOrgnz(GissUtil.notNull(apuracaoMensalEntradaDTO.getCodigoDependencia()));

		ListarDependenciaApuracaoMensalResponse response = getFactoryAdapter().getListarDependenciaApuracaoMensalPDCAdapter().invokeProcess(request); 

		if (response == null) {
			return null;
		}

		DependenciaApuracaoMensalSaidaDTO apuracaoMensalSaidaDTO = new DependenciaApuracaoMensalSaidaDTO();
		apuracaoMensalSaidaDTO.setTotalMunucipioReceitaValor(NumberUtils.applySignal(response.getTotalMunicipioReceitaSinal(), BigDecimal.valueOf(response.getTotalMunicipioReceitaValor())));
		apuracaoMensalSaidaDTO.setTotalMunucipioRecolherValor(NumberUtils.applySignal(response.getTotalMunicipioRecolherSinal(), BigDecimal.valueOf(response.getTotalMunicipioRecolherValor())));
		apuracaoMensalSaidaDTO.setTotalGeralReceitaValor(NumberUtils.applySignal(response.getTotalGeralReceitaSinal(), BigDecimal.valueOf(response.getTotalGeralReceitaValor())));
		apuracaoMensalSaidaDTO.setTotalGeralRecolherValor(NumberUtils.applySignal(response.getTotalGeralRecolherSinal(), BigDecimal.valueOf(response.getTotalGeralRecolherValor())));
		apuracaoMensalSaidaDTO.setTotalPaRecolherValor(new BigDecimal(0));
		apuracaoMensalSaidaDTO.setTotalPaReceitaValor(new BigDecimal(0));
		apuracaoMensalSaidaDTO.setTotalAgenciaReceitaValor(new BigDecimal(0));
		apuracaoMensalSaidaDTO.setTotalAgenciaRecolherValor(new BigDecimal(0));
		apuracaoMensalSaidaDTO.setQtdeAgencia(0L);
		apuracaoMensalSaidaDTO.setQtdePa(0L);
		
		List<OcorrenciaDependenciaApuracaoMensalSaidaDTO> apuracoes = new ArrayList<OcorrenciaDependenciaApuracaoMensalSaidaDTO>();
		for (OcorDependenciaApuracaoMensal o: response.getOcorDependenciaApuracaoMensal()) {
			OcorrenciaDependenciaApuracaoMensalSaidaDTO ocorrenciaDependencia = new OcorrenciaDependenciaApuracaoMensalSaidaDTO();
			ocorrenciaDependencia.setCodigoDependencia(o.getCodigoDependencia().equals("")?0:Integer.parseInt(o.getCodigoDependencia()));
			ocorrenciaDependencia.setCodigoPessoaJuridica(o.getCodigoPessoaJuridica());
			ocorrenciaDependencia.setDescricaoDependencia(o.getDescricaoDependencia());
			ocorrenciaDependencia.setGeralReceitaValor(NumberUtils.applySignal(o.getGeralReceitaSinal(), BigDecimal.valueOf(o.getGeralReceitaValor())));
			ocorrenciaDependencia.setMesAnoApuracao(o.getMesAnoApuracao());
			ocorrenciaDependencia.setMunicipioReceitaValor(NumberUtils.applySignal(o.getMunicipioReceitaSinal(), BigDecimal.valueOf(o.getMunicipioReceitaValor())));
			ocorrenciaDependencia.setNumeroSequenciaUnidadeOrganizacional(o.getNumeroSequenciaUnidadeOrganizacional());
			ocorrenciaDependencia.setCodPa(Integer.parseInt(o.getCodPa()));
			ocorrenciaDependencia.setDescPa(o.getDescPa());
			
			ocorrenciaDependencia.setCodigoDependencia(o.getCodigoDependencia().equals("")?0:Integer.parseInt(o.getCodigoDependencia()));
			ocorrenciaDependencia.setCodPa(o.getCodPa().equals("000000")?0:Integer.parseInt(o.getCodPa()));
			ocorrenciaDependencia.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(o.getCodigoDependencia()),6) + (GissUtil.notNull(o.getCodPa()).equals("000000") || GissUtil.notNull(o.getCodPa()).equals("")?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(o.getCodPa())),6)));
			
			ocorrenciaDependencia.setDescUF(o.getDescUF());
			ocorrenciaDependencia.setCodUF(o.getCdUF());
			ocorrenciaDependencia.setDescMunicipio(o.getDescMunicipio());
			ocorrenciaDependencia.setCodigoMunicipio(o.getCodMunicipio());
			ocorrenciaDependencia.setTragSemTrag(o.getTragSemTrag());
			
			ocorrenciaDependencia.setDescricaoDependencia(o.getDescricaoDependencia());
			ocorrenciaDependencia.setDescPa(o.getDescPa());
			ocorrenciaDependencia.setDescDepPa(o.getDescricaoDependencia() + (GissUtil.notNull(o.getDescPa()).equals("")?"":"/"+GissUtil.notNull(o.getDescPa())));
			if(o.getCodPa().equals("000000")){
				apuracaoMensalSaidaDTO.setTotalAgenciaReceitaValor(apuracaoMensalSaidaDTO.getTotalAgenciaReceitaValor().add(BigDecimal.valueOf(o.getMunicipioReceitaValor())));
				apuracaoMensalSaidaDTO.setTotalAgenciaRecolherValor(apuracaoMensalSaidaDTO.getTotalAgenciaRecolherValor().add(BigDecimal.valueOf(o.getGeralReceitaValor())));
				apuracaoMensalSaidaDTO.setQtdeAgencia(apuracaoMensalSaidaDTO.getQtdeAgencia()+1);
			}else{
				apuracaoMensalSaidaDTO.setTotalPaReceitaValor(apuracaoMensalSaidaDTO.getTotalPaReceitaValor().add(BigDecimal.valueOf(o.getMunicipioReceitaValor())));
				apuracaoMensalSaidaDTO.setTotalPaRecolherValor(apuracaoMensalSaidaDTO.getTotalPaRecolherValor().add(BigDecimal.valueOf(o.getGeralReceitaValor())));
				apuracaoMensalSaidaDTO.setQtdePa(apuracaoMensalSaidaDTO.getQtdePa()+1);
			}
			
			apuracoes.add(ocorrenciaDependencia);
    	}
		Collections.sort(apuracoes);
		
		apuracaoMensalSaidaDTO.setApuracoes(apuracoes);
		return apuracaoMensalSaidaDTO;
	}

    public ApuracaoMensalTotalizadaSaidaDTO listarApuracaoMensalTotalizada(ApuracaoMensalTotalizadaEntradaDTO totalizadaEntradaDTO) {
		ListarApuracaoMensalTotalizadaRequest request = new ListarApuracaoMensalTotalizadaRequest();
		
		request.setCodigoMunicipio(totalizadaEntradaDTO.getCodigoMunicipio() != null ? totalizadaEntradaDTO.getCodigoMunicipio() : 0l);
		request.setCodigoPessoaJuridica(totalizadaEntradaDTO.getCodigoPessoaJuridica() != null ? totalizadaEntradaDTO.getCodigoPessoaJuridica() : 0);
		request.setNroSeqUndOrganizacional(totalizadaEntradaDTO.getNumeroSequenciaUnidadeOrganizacional() != null ? totalizadaEntradaDTO.getNumeroSequenciaUnidadeOrganizacional() : 0);
		request.setMesAnoApuracao(totalizadaEntradaDTO.getDataApuracao() != null ? totalizadaEntradaDTO.getDataApuracao() : 0);
		request.setCodigoGrupo(0);
		request.setCodigoSubgrupo(0);
		request.setConta(0);
		request.setNumeroMaximoOcorrencias(IApuracaoMensalServiceConstants.NUMERO_OCORRENCIAS_APURACAO_MENSAL_TOTALIZADA);

		ListarApuracaoMensalTotalizadaResponse response = getFactoryAdapter().getListarApuracaoMensalTotalizadaPDCAdapter().invokeProcess(request); 

		if (response == null) {
			return null;
		}
		
		ApuracaoMensalTotalizadaSaidaDTO apur = new ApuracaoMensalTotalizadaSaidaDTO();
		
		apur.setPercentualBaseCalculoTributo(BigDecimal.valueOf(response.getBaseCalculo()));
		apur.setPercentualAliquotaPadraoMunicipio(BigDecimal.valueOf(response.getPercAliquotaPadrao()));
		apur.setTipoIncidencia(response.getNomeTipoIncidencia());
		apur.setNumeroConsultas(response.getNroConsultas());
		
		BigDecimal totalReceita = BigDecimal.valueOf(response.getMovtoReceitaApuracaoTotalValor());
		if ("-".equals(response.getMovtoReceitaApuracaoTotalSinal())) {
			totalReceita = totalReceita.negate();
		}
		apur.setTotalReceita(totalReceita);
		BigDecimal totalReceitaTributo = BigDecimal.valueOf(response.getMovtoReceitaTributavelTotalValor());
		if ("-".equals(response.getMovtoReceitaTributavelTotalSinal())) {
			totalReceitaTributo = totalReceitaTributo.negate();
		}
		apur.setTotalReceitaTributo(totalReceitaTributo);
		BigDecimal totalTributoApuracao = BigDecimal.valueOf(response.getTributoApurcaoTotalValor());
		if ("-".equals(response.getTributoApurcaoTotalSinal())) {
			totalTributoApuracao = totalTributoApuracao.negate();
		}
		apur.setTotalTributoApuracao(totalTributoApuracao);
		int i = 0;
		List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> consultas = new ArrayList<OcorrenciaApuracaoMensalTotalizadaSaidaDTO>();
		for (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias o : response.getOcorrencias()) {
		OcorrenciaApuracaoMensalTotalizadaSaidaDTO ocorrenciasApuracao = new OcorrenciaApuracaoMensalTotalizadaSaidaDTO();
		
		    ocorrenciasApuracao.setRazao(GissUtil.formatarRazaoContabil(o.getCodigoGrupo(), o.getCodigoSubgrupo()));
		    ocorrenciasApuracao.setConta(o.getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(String.valueOf(o.getNumeroConta()), 7)  + "-" + o.getDigitoConta());
			ocorrenciasApuracao.setCosif(GissUtil.mascaraContaContabil(o.getContaContabil(), ocorrenciasApuracao.getRazao()));
			ocorrenciasApuracao.setReceitaApuracaoSinal(o.getMovtoReceitaApuracaoSinal());
			ocorrenciasApuracao.setReceitaApuracaoValor(BigDecimal.valueOf(o.getMovtoReceitaApuracaoValor()));
			if ("-".equals(o.getMovtoReceitaApuracaoSinal())) {
				ocorrenciasApuracao.setReceitaApuracaoValor(BigDecimal.valueOf(o.getMovtoReceitaApuracaoValor()).negate());
			}
			ocorrenciasApuracao.setReceitaTributoApuracaoSinal(o.getMovtoReceitaTributavelSinal());
			ocorrenciasApuracao.setReceitaTributoApuracaoValor(BigDecimal.valueOf(o.getMovtoReceitaTributavelValor()));
			if ("-".equals(o.getMovtoReceitaTributavelSinal())) {
				ocorrenciasApuracao.setReceitaTributoApuracaoValor(BigDecimal.valueOf(o.getMovtoReceitaTributavelValor()).negate());
			}
			ocorrenciasApuracao.setPercentualAliquotaApuracao(BigDecimal.valueOf(o.getPercAliquotaPadrao()));
			ocorrenciasApuracao.setTributoApuracaoSinal(o.getTributoApurcaoSinal());
			ocorrenciasApuracao.setTributoApuracaoValor(BigDecimal.valueOf(o.getTributoApurcaoValor()));
			if ("-".equals(o.getTributoApurcaoSinal())) {
				ocorrenciasApuracao.setTributoApuracaoValor(BigDecimal.valueOf(o.getTributoApurcaoValor()).negate());
			}
			ocorrenciasApuracao.setLinha(i++);
			consultas.add(ocorrenciasApuracao);
			apur.setListaApuracaoMensalTotalizada(consultas);
		}
		
    	return apur;
	}
    
    public ApuracaoMensalTotalizadaSaidaDTO listarApuracaoMensalTotalizadaConta(ApuracaoMensalTotalizadaEntradaDTO totalizadaEntradaDTO) {
		ListarApuracaoMensalNvContaRequest request = new ListarApuracaoMensalNvContaRequest();
		String codGrpSubGrp[] = totalizadaEntradaDTO.getRazao().split("-");
		request.setCodMunicipio(totalizadaEntradaDTO.getCodigoMunicipio() != null ? totalizadaEntradaDTO.getCodigoMunicipio() : 0l);
		request.setCodPessoaJurid(totalizadaEntradaDTO.getCodigoPessoaJuridica() != null ? totalizadaEntradaDTO.getCodigoPessoaJuridica() : 0);
		request.setNumSeqUnidadeOrgnz(totalizadaEntradaDTO.getNumeroSequenciaUnidadeOrganizacional() != null ? totalizadaEntradaDTO.getNumeroSequenciaUnidadeOrganizacional() : 0);
		request.setMesAnoApuracao(totalizadaEntradaDTO.getDataApuracao() != null ? totalizadaEntradaDTO.getDataApuracao() : 0);
		request.setCodGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[0])));
		request.setCodSubGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[1])));
		request.setCosif(totalizadaEntradaDTO.getCosif());
		request.setQtdeRegistros(250);

		ListarApuracaoMensalNvContaResponse response = getFactoryAdapter().getListarApuracaoMensalNvContaPDCAdapter().invokeProcess(request); 

		if (response == null) {
			return null;
		}
		
		ApuracaoMensalTotalizadaSaidaDTO apur = new ApuracaoMensalTotalizadaSaidaDTO();
		
		apur.setPercentualBaseCalculoTributo(BigDecimal.valueOf(response.getPercentBaseCalculo()));
		apur.setPercentualAliquotaPadraoMunicipio(BigDecimal.valueOf(response.getPercentAliquotaPadrao()));
		apur.setTipoIncidencia(response.getTipoIndicador());
		apur.setNumeroConsultas(response.getQtdeOcorrencias());
		
		BigDecimal totalReceita = BigDecimal.valueOf(response.getValorTribututavelTotal());
		if ("-".equals(response.getSinalTributavelTotal())) {
			totalReceita = totalReceita.negate();
		}
		apur.setTotalReceita(totalReceita);
		BigDecimal totalReceitaTributo = BigDecimal.valueOf(response.getValorTributoTotal());
		if ("-".equals(response.getSinalTributoTotal())) {
			totalReceitaTributo = totalReceitaTributo.negate();
		}
		apur.setTotalReceitaTributo(totalReceitaTributo);
		BigDecimal totalTributoApuracao = BigDecimal.valueOf(response.getValorApuracaoTotal());
		if ("-".equals(response.getSinalApuracaoTotal())) {
			totalTributoApuracao = totalTributoApuracao.negate();
		}
		apur.setTotalTributoApuracao(totalTributoApuracao);
		int i = 0;
		List<OcorrenciaApuracaoMensalTotalizadaSaidaDTO> consultas = new ArrayList<OcorrenciaApuracaoMensalTotalizadaSaidaDTO>();
		for (ListaApuracaoMensalNvConta o : response.getListaApuracaoMensalNvConta()) {
		OcorrenciaApuracaoMensalTotalizadaSaidaDTO ocorrenciasApuracao = new OcorrenciaApuracaoMensalTotalizadaSaidaDTO();
		
		    ocorrenciasApuracao.setRazao(GissUtil.formatarRazaoContabil(o.getCodGrupo(), o.getCodSubGrupo()));
		    ocorrenciasApuracao.setConta(o.getConta()==0?"":GissUtil.preencherZerosAEsquerda(String.valueOf(o.getConta()), 7)  + "-" + o.getDigConta());
			ocorrenciasApuracao.setCosif(GissUtil.mascaraContaContabil(o.getCosif(), ocorrenciasApuracao.getRazao()));
			ocorrenciasApuracao.setReceitaApuracaoSinal(o.getSinalConta());
			ocorrenciasApuracao.setReceitaApuracaoValor(BigDecimal.valueOf(o.getValorConta()));
			if ("-".equals(o.getSinalConta())) {
				ocorrenciasApuracao.setReceitaApuracaoValor(BigDecimal.valueOf(o.getValorConta()).negate());
			}
			ocorrenciasApuracao.setReceitaTributoApuracaoSinal(o.getSinaltributavel());
			ocorrenciasApuracao.setReceitaTributoApuracaoValor(BigDecimal.valueOf(o.getValorTributavel()));
			if ("-".equals(o.getSinaltributavel())) {
				ocorrenciasApuracao.setReceitaTributoApuracaoValor(BigDecimal.valueOf(o.getValorTributavel()).negate());
			}
			ocorrenciasApuracao.setPercentualAliquotaApuracao(BigDecimal.valueOf(o.getPercentAliquota()));
			ocorrenciasApuracao.setTributoApuracaoSinal(o.getSinalTributo());
			ocorrenciasApuracao.setTributoApuracaoValor(BigDecimal.valueOf(o.getValorTributo()));
			if ("-".equals(o.getSinalTributo())) {
				ocorrenciasApuracao.setTributoApuracaoValor(BigDecimal.valueOf(o.getValorTributo()).negate());
			}
			ocorrenciasApuracao.setLinha(i++);
			consultas.add(ocorrenciasApuracao);
			apur.setListaApuracaoMensalTotalizada(consultas);
		}
		
    	return apur;
	}
    
    public TarifasCobradasVO consultarTarifasCobradas(TarifasCobradasVO parametro){
    	
    	ConsultarTarifasCobradasRequest request = new ConsultarTarifasCobradasRequest();
    	
    	request.setDataInicio(dateToString(parametro.getCalendarioDe(), "dd.MM.yyyy"));
    	request.setDataFim(dateToString(parametro.getCalendarioAte(), "dd.MM.yyyy"));
    	request.setNomeCliente(verificaIntegerNulo(parametro.getCodigoSelecionado()));
    	request.setCdJuncao(verificaIntegerNulo(parametro.getCdJuncao()));
    	request.setCdMunicipioJuncao(verificaLongNulo(parametro.getCdMunicipioJuncao()));
    	request.setCdUfJuncao(verificaIntegerNulo(parametro.getCdUfJuncao()));
    	request.setCdTipoPesquisa(verificaIntegerNulo(parametro.getCdTipoPesquisa()));
    	request.setCdTipoRelatorio(parametro.getCdTipoRelatorio());
    	IConsultarTarifasCobradasPDCAdapter consultarTarifasCobradasPDCAdapter = factoryAdapter.getConsultarTarifasCobradasPDCAdapter();
    	ConsultarTarifasCobradasResponse lResponse = consultarTarifasCobradasPDCAdapter.invokeProcess(request);
    	TarifasCobradasVO retorno = new TarifasCobradasVO();
    	retorno.setCodigoMensagem(lResponse.getCodMensagem());
    	retorno.setMensagem(lResponse.getMensagem());
    	
    	return retorno;
    	
    }
    
    public List<ListaGenericaVO> consultarRelacaoPa (TarifasCobradasVO parametro){
    	
    	ConsultarRelacaoPaRequest lRequest = new ConsultarRelacaoPaRequest();
    	
    	lRequest.setCodigoMunicipioPa(parametro.getCodMunicipio());
    	lRequest.setCodigoUfPa(Integer.valueOf(parametro.getUf()));
    	lRequest.setTodosPas(0);
    	lRequest.setQtdOcorrencia(50);
    	
    	IConsultarRelacaoPaPDCAdapter consultarRelacaoPaPDCAdapter = factoryAdapter.getConsultarRelacaoPaPDCAdapter();
    	ConsultarRelacaoPaResponse lResponse = consultarRelacaoPaPDCAdapter.invokeProcess(lRequest);
    	
    	List<ListaGenericaVO> listaRetorno = new ArrayList<ListaGenericaVO>();
    	
    	
    	for (int i = 0; i < lResponse.getNumeroOcorrencias(); i++) {
    		ListaGenericaVO item = new ListaGenericaVO();
    		
    		item.setCodigoPa(String.valueOf(lResponse.getOcorrencia(i).getCodigoPa()));
    		item.setNomePa(lResponse.getOcorrencia(i).getNomePa());
    		item.setMunicipioPa(lResponse.getOcorrencia(i).getNomeMunicipioPa());
    		item.setUfPa(lResponse.getOcorrencia(i).getNomeUfPa());
    		item.setAgenciaRelacionamento(String.valueOf(lResponse.getOcorrencia(i).getCodigoAgencia()));
    		item.setMunicipioAgRelacionamento(lResponse.getOcorrencia(i).getNomeMunicipioAgencia());
    		item.setUfAgRelacionamento(lResponse.getOcorrencia(i).getNomeUfAgencia());
    		item.setReceita(String.valueOf(lResponse.getOcorrencia(i).getValorReceita()));
    		item.setIss(String.valueOf(lResponse.getOcorrencia(i).getValorIss()));
			
			listaRetorno.add(item);
		}
    	
    	return listaRetorno;
    	
    }
    
    public ApuracaoMensalDTO funcaoTela(String funcao, String botao, String diaDe, String diaAte) {

    	ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();

    	ListarApuracaoMensalRequest lRequest = new ListarApuracaoMensalRequest();
    	lRequest.setFuncao(funcao);
    	lRequest.setFuncaoBotao(botao);
    	lRequest.setDiaDe(diaDe);
    	lRequest.setDiaAte(diaAte);
    	IListarApuracaoMensalPDCAdapter listarApuracaoMensalPDCAdapter = factoryAdapter.getListarApuracaoMensalPDCAdapter();
    	ListarApuracaoMensalResponse lResponse = listarApuracaoMensalPDCAdapter.invokeProcess(lRequest);
    	
    	apuracaoMensalDTO.setCodigoMensagem(lResponse.getCodMensagem());
    	apuracaoMensalDTO.setMensagem(lResponse.getMensagem());
    	apuracaoMensalDTO.setExibeContabil(lResponse.getExibeContabil());
    	apuracaoMensalDTO.setCompetencia(lResponse.getCompetencia());
    	
    	return apuracaoMensalDTO;
    	
    }
    
    public ApuracaoMensalDTO incluirApuracaoAjuste (ListaGenericaVO parametro){
    	
    	IncluirApuracaoAjusteRequest lRequest = new IncluirApuracaoAjusteRequest();
    	
    	lRequest.setCompetencia(parametro.getCompetencia());
    	lRequest.setJustificativa(parametro.getJustificativa());
    	lRequest.setValorAjuste(parametro.getValorAjuste());
    	
    	IIncluirApuracaoAjustePDCAdapter incluirApuracaoAjustePDCAdapter = factoryAdapter.getIncluirApuracaoAjustePDCAdapter();
    	IncluirApuracaoAjusteResponse lResponse = incluirApuracaoAjustePDCAdapter.invokeProcess(lRequest);
    	
    	ApuracaoMensalDTO retorno = new ApuracaoMensalDTO();
    	
    	retorno.setCodigoMensagem(lResponse.getCodMensagem());
    	retorno.setMensagem(lResponse.getMensagem());
    	
    	return retorno;
    	
    }
    
    public List<ListaGenericaVO> consultaApuracaoParcialIss(TarifasCobradasVO entrada) {
    	ConsultaApurParcialIssRequest request = new ConsultaApurParcialIssRequest();
		
    	request.setCodigoMunicipio(entrada.getCodMunicipio());
    	request.setCodigoUf(Integer.valueOf(entrada.getUf()));
    	request.setConsolidado(entrada.getCodigoSimNao());
    	request.setDataFim(GissUtil.dateToString(entrada.getCalendarioAte(), "dd.MM.yyyy"));
    	request.setDataInicio(GissUtil.dateToString(entrada.getCalendarioDe(), "dd.MM.yyyy"));
		request.setOcorrencia(IApuracaoMensalServiceConstants.NUMERO_OCORRENCIAS_DEPENDENCIA_APURACAO_MENSAL);

		ConsultaApurParcialIssResponse response = getFactoryAdapter().getConsultaApurParcialIssPDCAdapter().invokeProcess(request); 

		if (response == null) {
			return null;
		}
		
		List<ListaGenericaVO> retorno = new ArrayList<ListaGenericaVO>();
		
		for (br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias saida : response.getOcorrencias()) {
			ListaGenericaVO ocorrenciasApuracao = new ListaGenericaVO();
			
			ocorrenciasApuracao.setCosif(String.valueOf(saida.getCosif()));
			ocorrenciasApuracao.setRazao(saida.getNomePa());
			ocorrenciasApuracao.setConta(String.valueOf(saida.getConta()));
			ocorrenciasApuracao.setCodigoPa(String.valueOf(saida.getCodigoPa()));
			ocorrenciasApuracao.setNomePa(saida.getNomePa());
			ocorrenciasApuracao.setMunicipioPa(saida.getMunicipioPa());
			ocorrenciasApuracao.setUfPa(saida.getUfPa());
			ocorrenciasApuracao.setAgenciaRelacionamento(String.valueOf(saida.getCodigoAgencia()));
			ocorrenciasApuracao.setMunicipioAgRelacionamento(saida.getMunicipioAgencia());
			ocorrenciasApuracao.setUfAgRelacionamento(saida.getUfAgencia());
			ocorrenciasApuracao.setIss(String.valueOf(saida.getValorIss()));
			retorno.add(ocorrenciasApuracao);
		}
		
    	return retorno;
	}
    
    public ApuracaoMensalDTO consultaApuracaoPa (String dataInicio, String dataFim){
    	
    	ConsultaApuracaoPaRequest lRequest = new ConsultaApuracaoPaRequest();
    	
    	lRequest.setDataInicio(dataInicio);
    	lRequest.setDataFim(dataFim);
    	
    	IConsultaApuracaoPaPDCAdapter consultaApuracaoPaPDCAdapter = factoryAdapter.getConsultaApuracaoPaPDCAdapter();
    	ConsultaApuracaoPaResponse lResponse = consultaApuracaoPaPDCAdapter.invokeProcess(lRequest);
    	
    	ApuracaoMensalDTO retorno = new ApuracaoMensalDTO();
    	
    	retorno.setCodigoMensagem(lResponse.getCodMensagem());
    	retorno.setMensagem(lResponse.getMensagem());
    	
    	return retorno;
    	
    }
    
    public SaidaCampoValorVO consultaConciliacaoApuracao (String competencia){
    	
    	ConsultaConciliacaoApuracaoRequest lRequest = new ConsultaConciliacaoApuracaoRequest();
    	
    	lRequest.setCompetencia(Integer.valueOf(competencia));
    	
    	IConsultaConciliacaoApuracaoPDCAdapter consultaConciliacaoApuracaoPDCAdapter = factoryAdapter.getConsultaConciliacaoApuracaoPDCAdapter();
    	ConsultaConciliacaoApuracaoResponse lResponse = consultaConciliacaoApuracaoPDCAdapter.invokeProcess(lRequest);
    	
    	SaidaCampoValorVO retorno = new SaidaCampoValorVO();
    	
    	retorno.setValorReceita(lResponse.getValorReceita());
        retorno.setValorReceitaTotal(lResponse.getValorReceitaTotal());
        retorno.setValorReceitaDiferenca(lResponse.getValorReceitaDiferenca());
        retorno.setBalancete(lResponse.getBalancete());
        retorno.setAliquotaZerada(lResponse.getAliquotaZerada());
        retorno.setOscilacaoNegativa(lResponse.getOscilacaoNegativa());
        retorno.setSubTotalUm(lResponse.getSubTotalUm());
        retorno.setSubTotalDois(lResponse.getSubTotalDois());
        retorno.setAjuste(lResponse.getAjuste());
        retorno.setConciliacaoFinal(lResponse.getConciliacaoFinal());
    	
    	return retorno;
    	
    }
    
    public ApuracaoMensalDTO incluirJustificativa (ListaGenericaVO parametro){
    	
    	IncluirJustificativaRequest lRequest = new IncluirJustificativaRequest();
    	
    	lRequest.setDescJustificativa(parametro.getJustificativa());
    	lRequest.setVlrAjuste("-".equals(StringUtils.left(parametro.getValorAjuste(), 1)) ? StringUtils.right(parametro.getValorAjuste(), (parametro.getValorAjuste().length()-1)) : parametro.getValorAjuste());
    	lRequest.setSinalVlrAjuste("-".equals(StringUtils.left(parametro.getValorAjuste(), 1)) ? "-" : "+");
    	
    	IIncluirJustificativaPDCAdapter incluirJustificativaPDCAdapter = factoryAdapter.getIncluirJustificativaPDCAdapter();
    	IncluirJustificativaResponse lResponse = incluirJustificativaPDCAdapter.invokeProcess(lRequest);
    	
    	ApuracaoMensalDTO retorno = new ApuracaoMensalDTO();
    	
    	retorno.setCodigoMensagem(lResponse.getCodMensagem());
    	retorno.setMensagem(lResponse.getMensagem());
    	
    	return retorno;
    	
    }
    
    public ConciliacaoApuracaoVo listarConciliacaoApuracao(String competencia){
    	
    	ListarConciliacaoApuracaoLoopRequest lRequest = new ListarConciliacaoApuracaoLoopRequest();
    	
    	lRequest.setMaxOcorrencias(100);
    	lRequest.setMesAno(Integer.valueOf(competencia));
    	
    	IListarConciliacaoApuracaoLoopPDCAdapter listarConciliacaoApuracaoLoopPDCAdapter = factoryAdapter.getListarConciliacaoApuracaoLoopPDCAdapter();
    	ListarConciliacaoApuracaoLoopResponse lResponse = listarConciliacaoApuracaoLoopPDCAdapter.invokeProcess(lRequest);
    	
    	ConciliacaoApuracaoVo retorno = new ConciliacaoApuracaoVo();
    	
    	retorno.setNumConsultas(lResponse.getNumConsultas());
        retorno.setSinalReceitaTotalCCRS(lResponse.getSinalReceitaTotalCCRS());
        retorno.setValorReceitaTotalCCRS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorReceitaTotalCCRS())));
        retorno.setSinalReceitaTotalGISS(lResponse.getSinalReceitaTotalGISS());
        retorno.setValorReceitaTotalGISS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorReceitaTotalGISS())));
        retorno.setSinalAjusteTotal(lResponse.getSinalAjusteTotal());
        retorno.setValorAjusteTotal(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorAjusteTotal())));
        retorno.setSinalIssTotal(lResponse.getSinalIssTotal());
        retorno.setValorIssTotal(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorIssTotal())));
        retorno.setSinalAliquotaZeradaTotal(lResponse.getSinalAliquotaZeradaTotal());
        retorno.setValorAliquotaZeradaTotal(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorAliquotaZeradaTotal())));
        retorno.setSinalOscilacaoNegativaTotal(lResponse.getSinalOscilacaoNegativaTotal());
        retorno.setValorOscilacaoNegativaTotal(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorOscilacaoNegativaTotal())));
        retorno.setSinalRedutorTotal(lResponse.getSinalRedutorTotal());
        retorno.setValorRedutosTotal(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getValorRedutosTotal())));
        
        for (int i = 0; i < lResponse.getListaCount(); i++) {
    		
        	ListaConciliacaoApuracaoVo item = new ListaConciliacaoApuracaoVo();
        	
    		item.setCosif(GissUtil.mascaraCosif(lResponse.getLista(i).getCosif().replace(".", "")));
        	item.setGrupoRazao(Integer.valueOf(lResponse.getLista(i).getGrupoRazao()));
        	item.setSubGrupoRazao(lResponse.getLista(i).getSubGrupoRazao());
        	item.setConta(lResponse.getLista(i).getConta());
        	item.setDigitoConta(lResponse.getLista(i).getDigitoConta());
        	item.setDescContaRazao(lResponse.getLista(i).getDescContaRazao());
        	item.setSinalSaldoAnteriorCCRS(lResponse.getLista(i).getSinalSaldoAnteriorCCRS()); 
        	item.setValorSaldoAnteriorCCRS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorSaldoAnteriorCCRS())));
        	item.setSinalDebitoCCRS(lResponse.getLista(i).getSinalDebitoCCRS());
        	item.setValorDebitoCCRS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorDebitoCCRS())));
        	item.setSinalCreditoCCRS(lResponse.getLista(i).getSinalCreditoCCRS());
        	item.setValorCreditoCCRS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorCreditoCCRS())));
        	item.setSinalSaldoAtualCCRS(lResponse.getLista(i).getSinalSaldoAtualCCRS());
        	item.setValorSaldoAtualCCRS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorSaldoAtualCCRS())));
        	item.setSinalReceitaBalancete(lResponse.getLista(i).getSinalReceitaBalancete());
        	item.setValorReceitaBalancete(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorReceitaBalancete())));
        	item.setSinalReceitaGISS(lResponse.getLista(i).getSinalReceitaGISS());
        	item.setValorReceitaGISS(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorReceitaGISS())));
        	item.setSinalDifReceitaBalancete(lResponse.getLista(i).getSinalDifReceitaBalancete());
        	item.setValorDifReceitaBalancete(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorDifReceitaBalancete())));
        	
        	retorno.getLista().add(item);
        }
    	return retorno;
    }
    
    public DetalharJustificativaApuracaoVO detalharJustificativaApuracao(String competencia){
    	
    	DetalharJustificativaApuracaoRequest lRequest = new DetalharJustificativaApuracaoRequest();
    	
    	lRequest.setMaxOcorrencias(100);
    	lRequest.setMesAno(Integer.valueOf(competencia));
    	
    	IDetalharJustificativaApuracaoPDCAdapter detalharJustificativaApuracaoPDCAdapter = factoryAdapter.getDetalharJustificativaApuracaoPDCAdapter();
    	DetalharJustificativaApuracaoResponse lResponse = detalharJustificativaApuracaoPDCAdapter.invokeProcess(lRequest);
    	
    	DetalharJustificativaApuracaoVO retorno = new DetalharJustificativaApuracaoVO();
    	
    	retorno.setNumConsultas(lResponse.getNumConsultas());
        retorno.setCompetencia(lResponse.getCompetencia());
        
        for (int i = 0; i < lResponse.getListaCount(); i++) {
    		
        	ListaJustificativaApuracaoVO item = new ListaJustificativaApuracaoVO();
    		
        	item.setDataAtualizacao(lResponse.getLista(i).getDataAtualizacao());
        	item.setSinalJustificativa(lResponse.getLista(i).getSinalJustificativa());
        	item.setValorJustificativa(GissUtil.formataStringParaMoedaComMascara(String.valueOf(lResponse.getLista(i).getValorJustificativa())));
        	item.setDescJustificativa(lResponse.getLista(i).getDescJustificativa());
        	item.setCodUsuarioManut(lResponse.getLista(i).getCodUsuarioManut());
        	
        	retorno.getLista().add(item);
        }
    	return retorno;
    }
    
    /**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarConciliacaoTXT(ConciliacaoApuracaoVo conciliacaoApuracaoVo, DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO, OutputStream outputStream) throws DocumentException, ReportException, IOException {
		new PlanilhaConciliacaoReportTXT(conciliacaoApuracaoVo, detalharJustificativaApuracaoVO, outputStream).gerar();
	}
	
	public void gerarPlanilhaConciliacaoPDF(ConciliacaoApuracaoVo conciliacaoApuracaoVo, DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO, OutputStream outputStream) throws DocumentException {
		new PlanilhaConciliacaoReport(conciliacaoApuracaoVo, detalharJustificativaApuracaoVO).gerarPdf(outputStream);
	}
    
    public void detalharDependencias(){
    	
    }
    
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

