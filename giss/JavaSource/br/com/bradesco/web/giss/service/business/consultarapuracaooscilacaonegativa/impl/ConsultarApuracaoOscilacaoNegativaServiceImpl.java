/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * �ltima revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1�App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaooscilacaonegativa/impl/ConsultarApuracaoOscilacaoNegativaServiceImpl.java,v $
 * $Id: ConsultarApuracaoOscilacaoNegativaServiceImpl.java,v 1.10 2018/06/14 10:16:11 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Hist�rico:
 * $Log: ConsultarApuracaoOscilacaoNegativaServiceImpl.java,v $
 * Revision 1.10  2018/06/14 10:16:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.9  2018/06/06 17:08:53  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/04/27 10:35:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/04/24 02:27:06  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/13 18:13:49  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/04/06 14:01:44  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2017/08/11 17:48:20  gilbertocopoli
 * altera��o Giba
 *
 * Revision 1.3  2017/07/28 14:09:19  gilbertocopoli
 * altera��o Giba
 *
 * Revision 1.2  2017/07/25 18:15:21  gilbertocopoli
 * altera��o Giba
 *
 * Revision 1.1  2017/04/11 14:12:48  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:41:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:49  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:12  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.IConsultarApuracaoOscilacaoNegativaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.IConsultarApuracaoOscilacaoNegativaServiceConstants;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ConsultarOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ContasOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.IConsultarOscilacaoNegativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.request.ConsultarOscilacaoNegativaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.IResultadoPesquisaOscilacaoNegativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.request.ResultadoPesquisaOscilacaoNegativaRequest;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.request.ResultadoPesquisaOscilacaoNegativaPlanilhaRequest;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse;
import br.com.bradesco.web.giss.utils.GissUtil;


/**
 * 
 * <p>
 * <b>T�tulo:</b>
 * </p>
 * <p>
 * <b>Descri�ao:</b>
 * </p>
 * <p>
 * Implementa��o do adaptador: ConsultarApuracaoOscilacaoNegativa
 * </p>
 * 
 * @comment C�DIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConsultarApuracaoOscilacaoNegativaServiceImpl implements IConsultarApuracaoOscilacaoNegativaService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public ConsultarApuracaoOscilacaoNegativaServiceImpl() {
		// TODO: Implementa��o
	}

	public ConsultarOscilacaoNegativaDTO consultarOscilacaoNegativa(int dataCompetencia, int codDependencia, long codPessoaJuridica){

		ConsultarOscilacaoNegativaDTO conOscilacaoNeg = new ConsultarOscilacaoNegativaDTO();

		ResultadoPesquisaOscilacaoNegativaRequest request = new ResultadoPesquisaOscilacaoNegativaRequest();
		request.setQtdeRegistro(IConsultarApuracaoOscilacaoNegativaServiceConstants.QUANTIDADE_REGISTROS_CONSULTA_LISTA_OSCILACAO_NEGATIVA);
		request.setMesAnoApuracao(dataCompetencia);
		request.setCodDependencia(codDependencia);
		request.setCodPessoaJuridica(codPessoaJuridica);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IResultadoPesquisaOscilacaoNegativaPDCAdapter listarOscilacaoPDCAdapter = this.factoryAdapter.getResultadoPesquisaOscilacaoNegativaPDCAdapter();
		ResultadoPesquisaOscilacaoNegativaResponse response = listarOscilacaoPDCAdapter.invokeProcess(request);


		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		BigDecimal totalAnterior = response.getValorAnteriorTotal();
		if ("-".equals(response.getSinalAnteriorTotal())) {
			totalAnterior = totalAnterior.negate();
		}
		BigDecimal totalAtual = response.getValorAtualTotal();
		if ("-".equals(response.getSinalAtualTotal())) {
			totalAtual = totalAtual.negate();
		}
		BigDecimal totalOscilacao = response.getValorOscilacaoTotal();
		if ("-".equals(response.getSinalOscilacaoTotal())) {
			totalOscilacao = totalOscilacao.negate();
		}
		BigDecimal totalAntAgencia = new BigDecimal(0);
		BigDecimal totalAtualAgencia = new BigDecimal(0);
		BigDecimal totalOscAgencia = new BigDecimal(0);
		BigDecimal totalAntPa = new BigDecimal(0);
		BigDecimal totalAtualPa = new BigDecimal(0);
		BigDecimal totalOscPa = new BigDecimal(0);
		
		conOscilacaoNeg.setCodMunicipio(response.getCodMunicipio());
		conOscilacaoNeg.setDescMunicipio(response.getDescMunicipio());
		conOscilacaoNeg.setCodUF(response.getCodUF());
		conOscilacaoNeg.setDescUF(response.getDescUF());
		int cont = 0;
		for(int i = 0; i < response.getOcorrenciasOscilacaoNegCount();i++){

			ConsultarOscilacaoNegativaDTO oscilacaoDTO = new ConsultarOscilacaoNegativaDTO();
			oscilacaoDTO.setMunicipio(response.getOcorrenciasOscilacaoNeg(i).getCodMunicipioOcor() + " - " + response.getOcorrenciasOscilacaoNeg(i).getDescMunicipioOcor());
			oscilacaoDTO.setMunicipioDepPa(response.getOcorrenciasOscilacaoNeg(i).getDescMunicipioPa().equals("")?
					response.getOcorrenciasOscilacaoNeg(i).getCodMunicipioOcor() + " - " + response.getOcorrenciasOscilacaoNeg(i).getDescMunicipioOcor():
						response.getOcorrenciasOscilacaoNeg(i).getCodMunicipioOcor() + " - " + response.getOcorrenciasOscilacaoNeg(i).getDescMunicipioOcor()+"/"+response.getOcorrenciasOscilacaoNeg(i).getDescMunicipioPa());
			oscilacaoDTO.setUf(String.valueOf(response.getOcorrenciasOscilacaoNeg(i).getCodUFOcor()));			
			oscilacaoDTO.setVlrOscilacao(response.getOcorrenciasOscilacaoNeg(i).getValorOscilacao());
			oscilacaoDTO.setVlrAnterior(response.getOcorrenciasOscilacaoNeg(i).getValorAnterior());
			oscilacaoDTO.setVlrAtual(response.getOcorrenciasOscilacaoNeg(i).getValorAtual());
			oscilacaoDTO.setNumeroSequencial(response.getOcorrenciasOscilacaoNeg(i).getNumSeqUnidadeOrganizacional());
			oscilacaoDTO.setCodigoPessoaJuridica(response.getOcorrenciasOscilacaoNeg(i).getCodPessoaJuridOcor());
			oscilacaoDTO.setCodigoPessoaJuridica(response.getOcorrenciasOscilacaoNeg(i).getCodPessoaJuridOcor());
			oscilacaoDTO.setDependencia(String.valueOf(response.getOcorrenciasOscilacaoNeg(i).getCodDependenciaOcor()));
			
			oscilacaoDTO.setDependencia(response.getOcorrenciasOscilacaoNeg(i).getCodDependenciaOcor() == 0?"":String.valueOf(response.getOcorrenciasOscilacaoNeg(i).getCodDependenciaOcor()));
			oscilacaoDTO.setCodPa(response.getOcorrenciasOscilacaoNeg(i).getCodPa() == 0?"":String.valueOf(response.getOcorrenciasOscilacaoNeg(i).getCodPa()));
			oscilacaoDTO.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(response.getOcorrenciasOscilacaoNeg(i).getCodDependenciaOcor()),6) + (GissUtil.notNull(response.getOcorrenciasOscilacaoNeg(i).getCodPa()) == 0?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(response.getOcorrenciasOscilacaoNeg(i).getCodPa())),6)));
			
			if(response.getOcorrenciasOscilacaoNeg(i).getSinalAnterior().equals("-")){
				oscilacaoDTO.setAnterior(response.getOcorrenciasOscilacaoNeg(i).getValorAnterior().negate());
			}else{
				oscilacaoDTO.setAnterior(response.getOcorrenciasOscilacaoNeg(i).getValorAnterior());
			}

			if(response.getOcorrenciasOscilacaoNeg(i).getSinalAtual().equals("-")){
				oscilacaoDTO.setAtual(response.getOcorrenciasOscilacaoNeg(i).getValorAtual().negate());
			}else{
				oscilacaoDTO.setAtual(response.getOcorrenciasOscilacaoNeg(i).getValorAtual());
			}
			
			if(response.getOcorrenciasOscilacaoNeg(i).getSinalOscilacao().equals("-")){
				oscilacaoDTO.setOscilacao(response.getOcorrenciasOscilacaoNeg(i).getValorOscilacao().negate());
			}else{
				oscilacaoDTO.setOscilacao(response.getOcorrenciasOscilacaoNeg(i).getValorOscilacao());
			}
			if(response.getOcorrenciasOscilacaoNeg(i).getCodPa() == 0){
				totalAntAgencia = totalAntAgencia.add(oscilacaoDTO.getAnterior());
				totalAtualAgencia = totalAtualAgencia.add(oscilacaoDTO.getAtual());
				totalOscAgencia = totalOscAgencia.add(oscilacaoDTO.getOscilacao());
			}else{
				totalAntPa = totalAntPa.add(oscilacaoDTO.getAnterior());
				totalAtualPa = totalAtualPa.add(oscilacaoDTO.getAtual());
				totalOscPa = totalOscPa.add(oscilacaoDTO.getOscilacao());
			}

			oscilacaoDTO.setTotalAnterior(totalAnterior);
			oscilacaoDTO.setTotalAtual(totalAtual);
			oscilacaoDTO.setTotalOscilacao(totalOscilacao);
			
			oscilacaoDTO.setValorTotalAntAgencia(totalAntAgencia);
			oscilacaoDTO.setValorTotalAtualAgencia(totalAtualAgencia);
			oscilacaoDTO.setValorTotalOscAgencia(totalOscAgencia);
			
			oscilacaoDTO.setValorTotalAntPa(totalAntPa);
			oscilacaoDTO.setValorTotalAtualPa(totalAtualPa);
			oscilacaoDTO.setValorTotalOscPa(totalOscPa);

			
			conOscilacaoNeg.getListaOscilacaoNeg().add(oscilacaoDTO);
		}
		Collections.sort(conOscilacaoNeg.getListaOscilacaoNeg());
		for (ConsultarOscilacaoNegativaDTO o : conOscilacaoNeg.getListaOscilacaoNeg()) {
			o.setTotalAnterior(totalAnterior);
			o.setTotalAtual(totalAtual);
			o.setTotalOscilacao(totalOscilacao);
			
			o.setValorTotalAntAgencia(totalAntAgencia);
			o.setValorTotalAtualAgencia(totalAtualAgencia);
			o.setValorTotalOscAgencia(totalOscAgencia);
			
			o.setValorTotalAntPa(totalAntPa);
			o.setValorTotalAtualPa(totalAtualPa);
			o.setValorTotalOscPa(totalOscPa);
			o.setItemRadio(cont++);
		}
		return conOscilacaoNeg;
	}


	public List<ContasOscilacaoNegativaDTO> listarContasOscilacaoNegativa(int dataCompetencia,int numeroSequencial,long codigoPessoaJuridica,int codDependencia){

		List<ContasOscilacaoNegativaDTO> listaContasOscilacao = new ArrayList<ContasOscilacaoNegativaDTO>();

		ConsultarOscilacaoNegativaRequest lRequest = new ConsultarOscilacaoNegativaRequest();
		lRequest.setNroMaxOcorrencias(IConsultarApuracaoOscilacaoNegativaServiceConstants.QUANTIDADE_REGISTROS_CONSULTA_LISTA_OSCILACAO_NEGATIVA);
		lRequest.setCodigoPessoaJuridica(codigoPessoaJuridica);
		lRequest.setNroSeqUndOrganizacional(numeroSequencial);
		lRequest.setMesAnoApuracao(dataCompetencia);
		lRequest.setCdDepend(codDependencia);

		IConsultarOscilacaoNegativaPDCAdapter oscilacaoNegativaPDCAdapter = factoryAdapter.getConsultarOscilacaoNegativaPDCAdapter();
		ConsultarOscilacaoNegativaResponse lResponse = oscilacaoNegativaPDCAdapter.invokeProcess(lRequest);

		BigDecimal totalAnterior = BigDecimal.valueOf(lResponse.getTotalAnteriorValor());
		if ("-".equals(lResponse.getTotalAnteriorSinal())) {
			totalAnterior = totalAnterior.negate();
		}
		BigDecimal totalAtual = BigDecimal.valueOf(lResponse.getTotalAtualValor());
		if ("-".equals(lResponse.getTotalAtualSinal())) {
			totalAtual = totalAtual.negate();
		}
		BigDecimal totalOscilacao = BigDecimal.valueOf(lResponse.getTotalOscilacaoValor());
		if ("-".equals(lResponse.getTotalOscilacaoSinal())) {
			totalOscilacao = totalOscilacao.negate();
		}

		for(int i=0; i < lResponse.getNroConsultas();i++){

			ContasOscilacaoNegativaDTO negativaDTO = new ContasOscilacaoNegativaDTO();

			if(lResponse.getOcorrencias(i).getAnteriorSinal().equals("-")){
				negativaDTO.setAnterior(BigDecimal.valueOf(lResponse.getOcorrencias(i).getAnteriorValor()).negate());
			}
			else{
				negativaDTO.setAnterior(BigDecimal.valueOf(lResponse.getOcorrencias(i).getAnteriorValor()));
			}


			if(lResponse.getOcorrencias(i).getAtualSinal().equals("-")){
				negativaDTO.setAtual(BigDecimal.valueOf(lResponse.getOcorrencias(i).getAtualValor()).negate());
			}
			else{
				negativaDTO.setAtual(BigDecimal.valueOf(lResponse.getOcorrencias(i).getAtualValor()));
			}

			if(lResponse.getOcorrencias(i).getOscilacaoSinal().equals("-")){
				negativaDTO.setOscilacao(BigDecimal.valueOf(lResponse.getOcorrencias(i).getOscilacaoValor()).negate());
			}

			else{
				negativaDTO.setOscilacao(BigDecimal.valueOf(lResponse.getOcorrencias(i).getOscilacaoValor()));
			}

			negativaDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			negativaDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getOcorrencias(i).getContaContabil()),negativaDTO.getRazao()));
			negativaDTO.setConta(lResponse.getOcorrencias(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getOcorrencias(i).getNumeroConta()), 7) +"-"+ lResponse.getOcorrencias(i).getDigitoConta());
			negativaDTO.setDescricao(lResponse.getOcorrencias(i).getDescRazao());
			negativaDTO.setTotalAnterior(totalAnterior);
			negativaDTO.setTotalAtual(totalAtual);
			negativaDTO.setTotalOscilacao(totalOscilacao);
			negativaDTO.setTotalAnteriorAcumulado(totalAnterior);
			negativaDTO.setTotalAtualAcumulado(totalAtual);
			negativaDTO.setTotalOscilacaoAcumulado(totalOscilacao);
			listaContasOscilacao.add(negativaDTO);
		}

		return listaContasOscilacao;
	}


	public ConsultarOscilacaoNegativaDTO consultarOscilacaoNegativaPlanilha(int dataCompetencia, int codDependencia, long codPessoaJuridica) {

		ConsultarOscilacaoNegativaDTO conOscilacaoNeg = new ConsultarOscilacaoNegativaDTO();

		ResultadoPesquisaOscilacaoNegativaPlanilhaRequest request = new ResultadoPesquisaOscilacaoNegativaPlanilhaRequest();
		request.setNroMaxOcorrencias(IConsultarApuracaoOscilacaoNegativaServiceConstants.QUANTIDADE_REGISTROS_CONSULTA_LISTA_OSCILACAO_NEGATIVA);
		request.setMesAnoApuracao(dataCompetencia);
		request.setCodigoDependencia(codDependencia);
		request.setCodigoPessoaJuridica(codPessoaJuridica);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter listarOscilacaoPlanilhaPDCAdapter = this.factoryAdapter.getResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter();
		ResultadoPesquisaOscilacaoNegativaPlanilhaResponse response = listarOscilacaoPlanilhaPDCAdapter.invokeProcess(request);


		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		BigDecimal totalOscilacao = response.getOscilacaoTotalValor();
		if ("-".equals(response.getOscilacaoTotalSinal())) {
			totalOscilacao = totalOscilacao.negate();
		}
		BigDecimal totalAnterior = response.getAnteriorTotalValor();
		if ("-".equals(response.getAnteriorTotalSinal())) {
			totalAnterior = totalAnterior.negate();
		}
		BigDecimal totalAtual = response.getAtualTotalValor();
		if ("-".equals(response.getAtualTotalSinal())) {
			totalAtual = totalAtual.negate();
		}
		
		conOscilacaoNeg.setCodMunicipio(response.getCodigoMunicipio());
		conOscilacaoNeg.setDescMunicipio(response.getDescMunicipio());
		conOscilacaoNeg.setCodUF(response.getCodigoUf());
		conOscilacaoNeg.setDescUF(response.getDescUf());

		for(int i = 0; i < response.getOcorrenciasCount();i++){

			ConsultarOscilacaoNegativaDTO oscilacaoDTO = new ConsultarOscilacaoNegativaDTO();
			oscilacaoDTO.setDependencia(String.valueOf(response.getOcorrencias(i).getCodigoDependencia()));
			oscilacaoDTO.setMunicipio(response.getOcorrencias(i).getCodigoMunicipio() + " - " + String.valueOf(response.getOcorrencias(i).getDescMunicipio()));
			oscilacaoDTO.setUf(String.valueOf(response.getOcorrencias(i).getSiglaUf()));			
			oscilacaoDTO.setVlrOscilacao(response.getOcorrencias(i).getOscilacaoValor());
			oscilacaoDTO.setVlrAnterior(response.getOcorrencias(i).getAnteriorValor());
			oscilacaoDTO.setVlrAtual(response.getOcorrencias(i).getAtualValor());
			oscilacaoDTO.setNumeroSequencial(response.getOcorrencias(i).getNroSeqUndOrganizacional());
			oscilacaoDTO.setCodigoPessoaJuridica(response.getOcorrencias(i).getCodigoPessoaJuridica());

			if(response.getOcorrencias(i).getAnteriorSinal().equals("-")){
				oscilacaoDTO.setAnterior(response.getOcorrencias(i).getAnteriorValor().negate());
			}else{
				oscilacaoDTO.setAnterior(response.getOcorrencias(i).getAnteriorValor());
			}

			if(response.getOcorrencias(i).getAtualSinal().equals("-")){
				oscilacaoDTO.setAtual(response.getOcorrencias(i).getAtualValor().negate());
			}else{
				oscilacaoDTO.setAtual(response.getOcorrencias(i).getAtualValor());
			}
			
			if(response.getOcorrencias(i).getOscilacaoSinal().equals("-")){
				oscilacaoDTO.setOscilacao(response.getOcorrencias(i).getOscilacaoValor().negate());
			}else{
				oscilacaoDTO.setOscilacao(response.getOcorrencias(i).getOscilacaoValor());
			}

			oscilacaoDTO.setTotalAnterior(totalAnterior);
			oscilacaoDTO.setTotalAtual(totalAtual);
			oscilacaoDTO.setTotalOscilacao(totalOscilacao);

			oscilacaoDTO.setItemRadio(i);
			conOscilacaoNeg.getListaOscilacaoNeg().add(oscilacaoDTO);
		}

		return conOscilacaoNeg;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}
	
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}


}

