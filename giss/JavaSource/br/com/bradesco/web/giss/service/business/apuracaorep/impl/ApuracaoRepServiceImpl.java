/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/apuracaorep/impl/ApuracaoRepServiceImpl.java,v $
 * $Id: ApuracaoRepServiceImpl.java,v 1.1 2017/04/11 14:13:22 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ApuracaoRepServiceImpl.java,v $
 * Revision 1.1  2017/04/11 14:13:22  gmichelini
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

package br.com.bradesco.web.giss.service.business.apuracaorep.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaorep.IApuracaoRepService;
import br.com.bradesco.web.giss.service.business.apuracaorep.IApuracaoRepServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ApuracaoReprocessamentoSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaorep.bean.ListarApuracaoReprocessamentoSaidaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.ListarApuracaoMensalReprocessamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.response.Ocorrencias;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.ListarApuracaoReprocessamentoResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.converter.FormatarData;
/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ApuracaoRep
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ApuracaoRepServiceImpl implements IApuracaoRepService {

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
	public ApuracaoRepServiceImpl() {
		// TODO: Implementação
	}
	/*IMPLEMENTAÇÃO PARA TRAZER OS DADOS DA PRIMEIRA TELA*/
	public List<ApuracaoReprocessamentoSaidaDTO> buscarDadosPesquisa(Integer maxOcorrencia){

		ListarApuracaoMensalReprocessamentoRequest request = new ListarApuracaoMensalReprocessamentoRequest();
		request.setMaxOcorrencia(maxOcorrencia);

		ListarApuracaoMensalReprocessamentoResponse response = getFactoryAdapter().getListarApuracaoMensalReprocessamentoPDCAdapter().invokeProcess(request);

		if(response == null){
			return null;
		}
		List<ApuracaoReprocessamentoSaidaDTO> saida = new ArrayList<ApuracaoReprocessamentoSaidaDTO>();
		int linha = 0;
		for(int i = 0; i < response.getOcorrenciasCount(); i++){
			Ocorrencias ocorrencias = response.getOcorrencias(i);
			if(ocorrencias.getCodigo()<= 0)break;
			linha = i;
			
			String ano = ocorrencias.getProcessamento().substring(0, 4);
			String mes = ocorrencias.getProcessamento().substring(5, 7);
			String dia = ocorrencias.getProcessamento().substring(8, 10);
			String dataProcessamento = dia + "/" + mes + "/" + ano;
			
			saida.add(new ApuracaoReprocessamentoSaidaDTO(ocorrencias.getCodigo(), FormatarData.formataDiaMesAnoFromPdc(ocorrencias.getSolicitacao()) , dataProcessamento ,FormatarData.formataDiaMesAnoFromPdc( ocorrencias.getPeriodoInicial()) , FormatarData.formataDiaMesAnoFromPdc(ocorrencias.getPeriodoFinal()), linha));
		}
		return  saida;
	}

	/*IMPLEMENTAÇÃO PARA TRAZER OS DADOS DA QUARTA TELA*/
	public List<ListarApuracaoReprocessamentoSaidaDTO> listarApuracaoReprocessamento(ListarApuracaoReprocessamentoEntradaDTO entrada){

		GissUtil gissUtil = new GissUtil();
		
		ListarApuracaoReprocessamentoRequest request = new ListarApuracaoReprocessamentoRequest();

		request.setCodigoMunicipio(valorLong(entrada.getCodigoMunicipio()));
		request.setCodigoPessoaJuridica(valorLong(entrada.getCodigoPessoaJuridica()));
		request.setMesAnoApuracao(valorInteger(entrada.getDataApuracao()));
		request.setNroMaxOcorrencias(IApuracaoRepServiceConstants.MAX_OCORRENCIA);
		request.setNroSeqUndOrganizadora(valorInteger(entrada.getNumeroSequenciaUnidadeOrganizacional()));
		request.setNroSolicitacao(valorInteger(entrada.getNumeroSolicitacao()));
		request.setCodigoGrupo(entrada.getCodigoGrupo());
		request.setCodigoSubgrupo(entrada.getCodigoSubgrupo());

		ListarApuracaoReprocessamentoResponse response = getFactoryAdapter().getListarApuracaoReprocessamentoPDCAdapter().invokeProcess(request);

		if(response == null){
			return null;
		}
		List<ListarApuracaoReprocessamentoSaidaDTO> saida = new ArrayList<ListarApuracaoReprocessamentoSaidaDTO>();
		
		BigDecimal totalIss = response.getTributoApuracaoTotalValor();
		if ("-".equals(response.getTributoApuracaoTotalSinal())) {
			totalIss = totalIss.negate();
		}
		BigDecimal totalTributavel = response.getMovmtoReceitaTributavelTotalValor();
		if ("-".equals(response.getMovmtoReceitaTributavelTotalSinal())) {
			totalTributavel = totalTributavel.negate();
		}
		BigDecimal totalMovimento = response.getMovmtoReceitaApuracaoTotalValor();
		if ("-".equals(response.getMovmtoReceitaApuracaoTotalSinal())) {
			totalMovimento = totalMovimento.negate();
		}

		int linha = 0;
		for(int i =0; i < response.getOcorrenciasCount(); i++){
			
			ListarApuracaoReprocessamentoSaidaDTO saidaDTO = new ListarApuracaoReprocessamentoSaidaDTO();
			br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias ocorrencias = response.getOcorrencias(i);
			
			BigDecimal valorIss = ocorrencias.getTributoApuracaoValor();
			if("-".equals(ocorrencias.getTributoApuracaoSinal())) {
				valorIss = valorIss.negate();
			}
			saidaDTO.setIssValor(valorIss);
			
			BigDecimal valorTributavel = ocorrencias.getMovmtoReceitaTributavelValor();
			if("-".equals(ocorrencias.getMovmtoReceitaTributavelSinal())) {
				valorIss = valorIss.negate();
			}
			saidaDTO.setTributavelValor(valorTributavel);

			BigDecimal valorMovimento = ocorrencias.getMovmtoReceitaApuracaoValor();
			if("-".equals(ocorrencias.getMovmtoReceitaApuracaoSinal())) {
				valorMovimento = valorMovimento.negate();
			}
			saidaDTO.setMovimentoValor(valorMovimento);

			saidaDTO.setAliquota(NumberUtils.format(ocorrencias.getPercAliquotaApuracao())+"%");
			saidaDTO.setAliquotaPadrao(response.getPercAliquotaPadraoMuni());
			saidaDTO.setBaseCalculo(response.getPercBaseCalculoTributavel());
			saidaDTO.setRazao(GissUtil.formatarRazaoContabil(ocorrencias.getCodigoGrupo() , ocorrencias.getCodigoSubgrupo()));
			saidaDTO.setConta(GissUtil.mascaraContaContabil(String.valueOf(ocorrencias.getContaContabil()),saidaDTO.getRazao()));
			saidaDTO.setTipoIncidencia(response.getTipoIncidenciaTributavel());
			saidaDTO.setNumConsultas(response.getNroConsultas());
			saidaDTO.setTotalIss(totalIss);
			saidaDTO.setTotalMovimento(totalMovimento);
			saidaDTO.setTotalTributavel(totalTributavel);
			saidaDTO.setLinha(linha++);
			
			
			saida.add(saidaDTO);
		}
		return saida;
	}


	private int valorInteger(Integer valor) {
		return valor != null ? valor : 0;
	}
	private Long valorLong(Long valor) {
		return valor != null ? valor : 0;
	}

}

