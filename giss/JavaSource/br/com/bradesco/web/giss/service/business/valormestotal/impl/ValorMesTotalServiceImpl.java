/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/valormestotal/impl/ValorMesTotalServiceImpl.java,v $
 * $Id: ValorMesTotalServiceImpl.java,v 1.8 2018/06/14 10:16:11 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ValorMesTotalServiceImpl.java,v $
 * Revision 1.8  2018/06/14 10:16:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/06/06 17:08:58  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/24 02:27:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/03/12 11:24:00  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/02/19 12:53:03  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/12/05 13:30:26  jaquelinebrito
 * Tela Valor Superior
 *
 * Revision 1.2  2017/07/28 14:09:19  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:12:47  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:39:46  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:25  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.valormestotal.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.mantermunicipio.exceptions.MunicipioServiceException;
import br.com.bradesco.web.giss.service.business.valormestotal.IValorMesTotalService;
import br.com.bradesco.web.giss.service.business.valormestotal.IValorMesTotalServiceConstants;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSDTO;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSTotalDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.IListarValoresMesTotalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.IListarValorMesTotalNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse;
import br.com.bradesco.web.giss.utils.GissUtil;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ValorMesTotal
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ValorMesTotalServiceImpl implements IValorMesTotalService {

	private FactoryAdapter factoryAdapter;

	public DemonstrativoISSTotalDTO listarDemonstrativoISS(String mesAnoCompetencia, Integer filtro) throws PdcAdapterException, MunicipioServiceException {

		
		ListarValoresMesTotalRequest lRequest = new ListarValoresMesTotalRequest();		
		lRequest.setNroMaxOcorrencias(IValorMesTotalServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEMONSTRATIVO);
		lRequest.setMesAnoApuracao(Integer.valueOf(mesAnoCompetencia));
		lRequest.setCodigoFiltro(filtro);
	

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListarValoresMesTotalPDCAdapter listaDemonstrativoPDCAdapter = factoryAdapter.getListarValoresMesTotalPDCAdapter();
		ListarValoresMesTotalResponse lResponse = listaDemonstrativoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		DemonstrativoISSTotalDTO demonstrativoISSTotalDTO = new DemonstrativoISSTotalDTO(); 
		demonstrativoISSTotalDTO.setTotalReceita(new BigDecimal(0));
		demonstrativoISSTotalDTO.setTotalIss(new BigDecimal(0));
		
		
		List<DemonstrativoISSDTO> listaDemonstrativoISSDTO = new ArrayList<DemonstrativoISSDTO>();
		
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			
			DemonstrativoISSDTO demonstrativoISSDTO = new DemonstrativoISSDTO();
			demonstrativoISSDTO.setRazao(GissUtil.formatarRazaoContabilMesTotal(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			demonstrativoISSDTO.setCosif(GissUtil.mascaraContaContabil(lResponse.getOcorrencias(i).getContaContabil(),demonstrativoISSDTO.getRazao()));
			demonstrativoISSDTO.setConta("");
			demonstrativoISSDTO.setReceita(new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getReceitaValor())));
			
			if("-".equals(lResponse.getOcorrencias(i).getReceitaSinal())){
				demonstrativoISSDTO.setReceita(new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getReceitaValor())).negate());
			}
			
			demonstrativoISSDTO.setIss(new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getIssValor())));
			if("-".equals(lResponse.getOcorrencias(i).getIssSinal())){
				demonstrativoISSDTO.setIss(new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getIssValor())).negate());
			}
			
			demonstrativoISSDTO.setLinha(i);
			demonstrativoISSTotalDTO.setTotalReceita(demonstrativoISSTotalDTO.getTotalReceita().add(demonstrativoISSDTO.getReceita()));
			demonstrativoISSTotalDTO.setTotalIss(demonstrativoISSTotalDTO.getTotalIss().add(demonstrativoISSDTO.getIss()));
			listaDemonstrativoISSDTO.add(demonstrativoISSDTO);		
		}
		
		demonstrativoISSTotalDTO.setListaDemonstrativoISSDTO(listaDemonstrativoISSDTO);

		return demonstrativoISSTotalDTO;
	}
	
	public DemonstrativoISSTotalDTO listarDemonstrativoISSConta(String mesAnoCompetencia, Integer filtro, String razao, String cosif) throws PdcAdapterException, MunicipioServiceException {

		String codGrpSubGrp[] = razao.split("-");
		ListarValorMesTotalNvContaRequest lRequest = new ListarValorMesTotalNvContaRequest();		
		lRequest.setQtdeRegistros(IValorMesTotalServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEMONSTRATIVO);
		lRequest.setMesAnoApuracao(Integer.valueOf(mesAnoCompetencia));
		lRequest.setCodGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[0])));
		lRequest.setCodSubGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[1])));
		lRequest.setCosif(cosif);
		lRequest.setFiltro(filtro);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListarValorMesTotalNvContaPDCAdapter listaDemonstrativoPDCAdapter = factoryAdapter.getListarValorMesTotalNvContaPDCAdapter();
		ListarValorMesTotalNvContaResponse lResponse = listaDemonstrativoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		DemonstrativoISSTotalDTO demonstrativoISSTotalDTO = new DemonstrativoISSTotalDTO(); 
		demonstrativoISSTotalDTO.setTotalReceita(new BigDecimal(0));
		demonstrativoISSTotalDTO.setTotalIss(new BigDecimal(0));
		
		
		List<DemonstrativoISSDTO> listaDemonstrativoISSDTO = new ArrayList<DemonstrativoISSDTO>();
		
		for (int i = 0; i < lResponse.getListaValorMesTotalNvContaCount(); i++) {
			
			DemonstrativoISSDTO demonstrativoISSDTO = new DemonstrativoISSDTO();
			demonstrativoISSDTO.setRazao(GissUtil.formatarRazaoContabilMesTotal(lResponse.getListaValorMesTotalNvConta(i).getCodGrupo() , lResponse.getListaValorMesTotalNvConta(i).getCodSubGrupo()));
			demonstrativoISSDTO.setCosif(GissUtil.mascaraContaContabil(lResponse.getListaValorMesTotalNvConta(i).getCosif(),demonstrativoISSDTO.getRazao()));
			demonstrativoISSDTO.setConta(lResponse.getListaValorMesTotalNvConta(i).getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaValorMesTotalNvConta(i).getConta()), 7)+"-"+ lResponse.getListaValorMesTotalNvConta(i).getDigConta());
			demonstrativoISSDTO.setReceita(BigDecimal.valueOf(lResponse.getListaValorMesTotalNvConta(i).getValorReceita()));
			
			if("-".equals(lResponse.getListaValorMesTotalNvConta(i).getSinalReceita())){
				demonstrativoISSDTO.setReceita(BigDecimal.valueOf(lResponse.getListaValorMesTotalNvConta(i).getValorReceita()).negate());
			}
			
			demonstrativoISSDTO.setIss(BigDecimal.valueOf(lResponse.getListaValorMesTotalNvConta(i).getValorIss()));
			if("-".equals(lResponse.getListaValorMesTotalNvConta(i).getSinalIss())){
				demonstrativoISSDTO.setIss(BigDecimal.valueOf(lResponse.getListaValorMesTotalNvConta(i).getValorIss()).negate());
			}
			
			demonstrativoISSTotalDTO.setTotalReceita(demonstrativoISSTotalDTO.getTotalReceita().add(demonstrativoISSDTO.getReceita()));
			demonstrativoISSTotalDTO.setTotalIss(demonstrativoISSTotalDTO.getTotalIss().add(demonstrativoISSDTO.getIss()));
			listaDemonstrativoISSDTO.add(demonstrativoISSDTO);		
		}
		demonstrativoISSTotalDTO.setListaDemonstrativoISSDTO(listaDemonstrativoISSDTO);

		return demonstrativoISSTotalDTO;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

