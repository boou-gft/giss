/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaomensaldiferenciada/impl/ConsultarApuracaoMensalDiferenciadaServiceImpl.java,v $
 * $Id: ConsultarApuracaoMensalDiferenciadaServiceImpl.java,v 1.1 2017/04/11 14:13:21 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ConsultarApuracaoMensalDiferenciadaServiceImpl.java,v $
 * Revision 1.1  2017/04/11 14:13:21  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:37  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ApuracaoMenDiferenciadaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ListaValoresDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada.ResultadoApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.IConsultarApuracaoMensalDiferenciadaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.IConsultarApuracaoMensalDiferenciadaServiceConstants;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.IListarResulApurMensalDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.ListarResulApurMensalDifResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif;
import br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.request.ListarResulPesqApurMensalDifRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: Consultarapuracaomensaldiferenciada
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConsultarApuracaoMensalDiferenciadaServiceImpl implements IConsultarApuracaoMensalDiferenciadaService {

	private FactoryAdapter factoryAdapter;

    /**
     * Construtor.
     */
    public ConsultarApuracaoMensalDiferenciadaServiceImpl() {
        // TODO: Implementação
    }
    
    public ApuracaoMenDiferenciadaDTO listarResultadoPesqApuracaoMensalDiferenciada(int competencia, int codMunicipio, int codDependencia, long codPessoaJurid){

    	ApuracaoMenDiferenciadaDTO apuracaoMenDif = new ApuracaoMenDiferenciadaDTO();
    	ListarResulPesqApurMensalDifRequest request = new ListarResulPesqApurMensalDifRequest();
    	ListarResulPesqApurMensalDifResponse response = new ListarResulPesqApurMensalDifResponse();
    		
    	request.setQtdeRegistro(IConsultarApuracaoMensalDiferenciadaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_MENSAL_DIF);
    	request.setCodMunicipio(codMunicipio);
    	request.setMesAnoApuracao(competencia);
    	request.setCodunidadeOrganizacional(codDependencia);
    	request.setCodPessoaJurid(codPessoaJurid);
    	
    	response = getFactoryAdapter().getListarResulPesqApurMensalDifPDCAdapter().invokeProcess(request);

    	BigDecimal totalReceita = response.getValorApuracaoTotalM();
    	if ("-".equals(response.getSinalApuracaoTotalM())) {
    		totalReceita = totalReceita.negate();
    	}

    	BigDecimal totalIss = response.getValorApuracaoTotalMun();
    	if ("-".equals(response.getSinalApuracaoTotalMun())) {
    		totalIss = totalIss.negate();
    	}
    	
    	apuracaoMenDif.setCodMunicipio(response.getCodMunicipio());
    	apuracaoMenDif.setDescMunicipio(response.getDescMunicipio());
    	apuracaoMenDif.setCodUF(response.getCodUF());
    	apuracaoMenDif.setDescUF(response.getDescUF());
    	

    	for(int i = 0; i < response.getQtdeRegistros(); i++){
    		OcorrenciasResultPesqApurMesDif ocorr = response.getOcorrenciasResultPesqApurMesDif(i);
    		
    		ApuracaoMenDiferenciadaDTO apuracaoMensal = new ApuracaoMenDiferenciadaDTO();

    		String codDependencia1 = ocorr.getCodDependencia();
    		if (codDependencia1 != null && !"".equals(ocorr.getCodDependencia().trim())) {
    			apuracaoMensal.setDependencia(Integer.parseInt((codDependencia1)));	
    		} else {
    			apuracaoMensal.setDependencia(0);
    		}
    		apuracaoMensal.setDescricao(ocorr.getDescDependencia());
    		apuracaoMensal.setIssRecolher(ocorr.getValorApuracao());
    		apuracaoMensal.setReceita(ocorr.getValorRecTributApuracao());
    		apuracaoMensal.setTotalISS(totalIss);
    		apuracaoMensal.setTotalReceita(totalReceita);
    		apuracaoMensal.setCodPessoaJuridica(ocorr.getCodPessoaJuridOcor());
    		apuracaoMensal.setNumeroSeqUniOrg(ocorr.getNumSeqUnidadeOrganizacional());
    		apuracaoMensal.setLinha(i);
    		
    		apuracaoMenDif.getListaApurMenDif().add(apuracaoMensal);
    	}
    	
    	
    	return apuracaoMenDif;
    }
    
    public ResultadoApuracaoMensalDTO listarResultadoApuracaoMensalDiferenciada( int codMunicipio, long codPesJuridica,int numUnidOrganizal, Integer mesAno ){
    	
    	ListarResulApurMensalDifRequest request = new ListarResulApurMensalDifRequest();
    	
    	request.setCodMunicipio(codMunicipio);
    	request.setCodPessoaJurid(codPesJuridica);
    	request.setQtdeOcorrencias(IConsultarApuracaoMensalDiferenciadaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_MENSAL_DIF);
    	request.setNumSeqUnidOrganizacional(numUnidOrganizal);
    	request.setMesAnoApuracao(mesAno);
    	
    	IListarResulApurMensalDifPDCAdapter listarResultadoApuracaoMensalDiferenciadaPDCAdapter = factoryAdapter.getListarResulApurMensalDifPDCAdapter();
    	ListarResulApurMensalDifResponse response = listarResultadoApuracaoMensalDiferenciadaPDCAdapter.invokeProcess(request);
		ResultadoApuracaoMensalDTO resultadoApuracaoMensalDTO = new ResultadoApuracaoMensalDTO();
		resultadoApuracaoMensalDTO.setCodMensagem(response.getCodMensagem());
    	resultadoApuracaoMensalDTO.setBaseCalculo(response.getBaseCalculo());
    	resultadoApuracaoMensalDTO.setAliquotaPadrao(response.getAliquotaPadrao());
    	resultadoApuracaoMensalDTO.setTipoIncidencia(response.getTipoIncidencia());
    	resultadoApuracaoMensalDTO.setSolicitacao(response.getSolicitacao());
    	resultadoApuracaoMensalDTO.setDataSolicitacao(response.getDataSolicitacao());
    	resultadoApuracaoMensalDTO.setVlrMovimento(response.getValorMovimento());
    	resultadoApuracaoMensalDTO.setVlrTributavel(response.getValorTributavel());
    	
		List<ListaValoresDTO> listaResultadoPesquisa =  new ArrayList<ListaValoresDTO>();
		
    	for(int i=0;i<response.getQtdeRegistro();i++){
    		OcorrenciaApurMensalDif ocorrencia = response.getOcorrenciaApurMensalDif(i);
    		ListaValoresDTO diferenciadaApuracaoDTO = new ListaValoresDTO();
    		
    		diferenciadaApuracaoDTO.setFaixaInicialSinal(ocorrencia.getSinalFaixa());
    		diferenciadaApuracaoDTO.setFaixaInicialValor(ocorrencia.getValorFaixa());
    		diferenciadaApuracaoDTO.setFaixaFinalSinal(ocorrencia.getSinalFaixaFinal());
    		diferenciadaApuracaoDTO.setFaixaFinalValor(ocorrencia.getValorFaixaFinal());
    		diferenciadaApuracaoDTO.setAliquotaFaixa(ocorrencia.getAliquota());
    		diferenciadaApuracaoDTO.setRedutorSinal(ocorrencia.getSinalRedutor());
    		diferenciadaApuracaoDTO.setRedutorValor(ocorrencia.getValorRedutor());
    		listaResultadoPesquisa.add(diferenciadaApuracaoDTO);
    		
    		
    	}
    	resultadoApuracaoMensalDTO.setListaPesquisaApuracao(listaResultadoPesquisa);
    	return resultadoApuracaoMensalDTO;
    }

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
    
}