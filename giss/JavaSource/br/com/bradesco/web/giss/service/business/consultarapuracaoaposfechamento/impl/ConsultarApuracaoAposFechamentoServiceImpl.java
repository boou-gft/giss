/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoaposfechamento/impl/ConsultarApuracaoAposFechamentoServiceImpl.java,v $
 * $Id: ConsultarApuracaoAposFechamentoServiceImpl.java,v 1.11 2018/06/14 10:16:14 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ConsultarApuracaoAposFechamentoServiceImpl.java,v $
 * Revision 1.11  2018/06/14 10:16:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.10  2018/06/06 17:09:26  gmichelini
 * *** empty log message ***
 *
 * Revision 1.9  2018/04/27 10:35:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/04/24 02:27:09  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/04/13 18:13:50  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/06 14:01:55  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2017/12/18 10:46:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2017/08/11 16:05:01  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.3  2017/08/10 14:20:45  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.2  2017/08/07 16:38:44  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:10:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2013/01/08 12:33:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2013/01/02 14:54:20  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:40  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoServiceConstants;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoAposFechamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoFinalAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoReprocessamentoResultadoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoReprocessamentoResultadoTotalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarDependenciaAposApuracaoFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarMunicipiosAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.exceptions.ConsultarApuracaoAposFechamentoServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.IListaDepApuracaoAposFechISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.request.ListaDepApuracaoAposFechISSRequest;
import br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.IListarApuracaoAposFechamentoISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.response.ListarApuracaoAposFechamentoISSResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.IListarApuracaoFinalAposFechamentoISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ListarApuracaoFinalAposFechamentoISSResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias;
import br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.IListarApurAposFechamentoNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.request.ListarApurAposFechamentoNvContaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta;
import br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.IListarDepApurMensalResulPesqPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.request.ListarDepApurMensalResulPesqRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.municipio.EstadosComboBean;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ConsultarApuracaoAposFechamento
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConsultarApuracaoAposFechamentoServiceImpl implements IConsultarApuracaoAposFechamentoService {

	private FactoryAdapter factoryAdapter;
	/**
	 * Construtor.
	 */
	public ConsultarApuracaoAposFechamentoServiceImpl() {
		// TODO: Implementação
	}

	public List<ConsultarApuracaoAposFechamentoDTO> listarPesquisaAposFechamento(String mesAnoApuracao) throws PdcAdapterException,ConsultarApuracaoAposFechamentoServiceException{

		ConsultarApuracaoAposFechamentoDTO aposFechamentoDTO;
		List<ConsultarApuracaoAposFechamentoDTO> listaAposFechamentoDTO = new ArrayList<ConsultarApuracaoAposFechamentoDTO>();

		ListarApuracaoAposFechamentoISSRequest lRequest = new ListarApuracaoAposFechamentoISSRequest();
		lRequest.setMesAnoApuracao(Integer.parseInt(mesAnoApuracao));
		lRequest.setQuantidadeOcorrencias(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);


		IListarApuracaoAposFechamentoISSPDCAdapter listarApuracaoAposFechamentoISSPDCAdapter = factoryAdapter.getListarApuracaoAposFechamentoISSPDCAdapter();
		ListarApuracaoAposFechamentoISSResponse lResponse = listarApuracaoAposFechamentoISSPDCAdapter.invokeProcess(lRequest);

		for(int i = 0;i<lResponse.getQuantidadeOcorrencias();i++){
			
			
			aposFechamentoDTO = new ConsultarApuracaoAposFechamentoDTO();
			String dataProcessamento;
			String dataSolicitacao;
			
			dataSolicitacao = String.valueOf(lResponse.getOcorrencias(i).getDataSolicitacaoApuracao());
			dataProcessamento=String.valueOf(lResponse.getOcorrencias(i).getDataProcessamento());
			
			aposFechamentoDTO.setCodigoSolicitacao(String.valueOf(lResponse.getOcorrencias(i).getCodigoSolicitacaoApuracao()));
			aposFechamentoDTO.setDataProcessamento(GissUtil.formataDataTimeStamp(dataProcessamento));
			aposFechamentoDTO.setDataSolicitacao(dataSolicitacao.replace(".", "/"));
			listaAposFechamentoDTO.add(aposFechamentoDTO);

		}

		return listaAposFechamentoDTO;


	}
	

	public ConsultarApuracaoReprocessamentoResultadoTotalDTO listarDependenciaApuracaoMensalPesquisa(String codigoMunicipio, int codigoSolicitacao, String mesAnoApuracao, Integer codDependencia, Long codPessoaJurid){
		ListarDepApurMensalResulPesqRequest lRequest = new ListarDepApurMensalResulPesqRequest();
		lRequest.setCodMunicipio(Long.parseLong(codigoMunicipio));
		lRequest.setQtdeRegistro(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
		lRequest.setNumSolicitacao(codigoSolicitacao);
		lRequest.setMesAnoApuracao(Integer.parseInt(mesAnoApuracao));
		lRequest.setCodDependencia(codDependencia);
		lRequest.setCodPessoaJurid(codPessoaJurid);

		IListarDepApurMensalResulPesqPDCAdapter listarDependenciaApuracaoMensalResultadoPesquisaPDCAdapter = factoryAdapter.getListarDepApurMensalResulPesqPDCAdapter();
		ListarDepApurMensalResulPesqResponse lResponse = listarDependenciaApuracaoMensalResultadoPesquisaPDCAdapter.invokeProcess(lRequest);
		
		ConsultarApuracaoReprocessamentoResultadoTotalDTO totalApuracaoReprocessamento = new ConsultarApuracaoReprocessamentoResultadoTotalDTO();
		totalApuracaoReprocessamento.setReceitaTotalMunicipio(lResponse.getValorApuracaoTotal());
		if("-".equals(lResponse.getSinalApuracaoTotal())) {
			totalApuracaoReprocessamento.setReceitaTotalMunicipio(totalApuracaoReprocessamento.getReceitaTotalMunicipio().negate());
		}
		totalApuracaoReprocessamento.setIssTotalMunicipio(lResponse.getValorlApuracaoTotalMun());
		if("-".equals(lResponse.getSinallApuracaoTotalMun())) {
			totalApuracaoReprocessamento.setIssTotalMunicipio(totalApuracaoReprocessamento.getIssTotalMunicipio().negate());
		}
		totalApuracaoReprocessamento.setReceitaTotalGeral(lResponse.getValorlApuracaoTotalG());
		if("-".equals(lResponse.getSinallApuracaoTotalG())) {
			totalApuracaoReprocessamento.setReceitaTotalGeral(totalApuracaoReprocessamento.getReceitaTotalGeral().negate());
		}
		totalApuracaoReprocessamento.setIssTotalGeral(lResponse.getValorlApuracaoTotalGer());
		if("-".equals(lResponse.getSinallApuracaoTotalGer())) {
			totalApuracaoReprocessamento.setIssTotalGeral(totalApuracaoReprocessamento.getIssTotalGeral().negate());
		}
		
		totalApuracaoReprocessamento.setCodMunicipio(lResponse.getCodMunicipio());
		totalApuracaoReprocessamento.setDescMunicipio(lResponse.getDescMunicipio());
		totalApuracaoReprocessamento.setCodUF(lResponse.getCodUF());
		totalApuracaoReprocessamento.setDescUF(lResponse.getDescUF());

		List<ConsultarApuracaoReprocessamentoResultadoDTO> listaApuracaoReprocessamento = new ArrayList<ConsultarApuracaoReprocessamentoResultadoDTO>(); 
		for (int i = 0; i < lResponse.getQtdeRegistros(); i++) {
			ConsultarApuracaoReprocessamentoResultadoDTO dependenciaDTO = new ConsultarApuracaoReprocessamentoResultadoDTO();
			dependenciaDTO.setCodPessoa(lResponse.getOcorrenciasDepApurMensalResult(i).getCodPessoaJuridOcor());
			dependenciaDTO.setNumSequencial(lResponse.getOcorrenciasDepApurMensalResult(i).getNumSeqUnidadeOrganizacional());
			dependenciaDTO.setDataApuracao(lResponse.getOcorrenciasDepApurMensalResult(i).getMesAnoApuracao());
			String dependencia = lResponse.getOcorrenciasDepApurMensalResult(i).getCodDependencia();
			if (dependencia != null && !"".equals(dependencia.trim())) {
				dependenciaDTO.setDependencia(Integer.parseInt(dependencia));
			} else {
				dependenciaDTO.setDependencia(0);
			}
			dependenciaDTO.setDescricao(lResponse.getOcorrenciasDepApurMensalResult(i).getDescDependencia());
			dependenciaDTO.setLinha(i);

			dependenciaDTO.setReceitaValor(lResponse.getOcorrenciasDepApurMensalResult(i).getValorApuracaoRec());
			if("-".equals(lResponse.getOcorrenciasDepApurMensalResult(i).getSinalApuracaoRec())) {
				dependenciaDTO.setReceitaValor(dependenciaDTO.getReceitaValor().negate());
			}

			dependenciaDTO.setIssValor(lResponse.getOcorrenciasDepApurMensalResult(i).getValorApuracao());
			if("-".equals(lResponse.getOcorrenciasDepApurMensalResult(i).getSinalApuracao())) {
				dependenciaDTO.setIssValor(dependenciaDTO.getIssValor().negate());
			}

			listaApuracaoReprocessamento.add(dependenciaDTO);
		}
		totalApuracaoReprocessamento.setListaApuracaoReprocessamento(listaApuracaoReprocessamento);
		
		return totalApuracaoReprocessamento;
	}
	
	 public List<SelectItem> listarComboEstados() throws PdcAdapterException, ConsultarApuracaoAposFechamentoServiceException {

			List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
			ComboEstadosRequest lRequest = new ComboEstadosRequest();		
			lRequest.setQuantidadeOcorrencias(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
			lRequest.setCodigoUnidadeFederativa(IConsultarApuracaoAposFechamentoServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
			lRequest.setNomeUnidadeFederativa("");
			lRequest.setSiglaUnidadeFederativa("");

			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/

			IComboEstadosPDCAdapter comboEstadosPDCAdapter = factoryAdapter.getComboEstadosPDCAdapter();
			ComboEstadosResponse lResponse = comboEstadosPDCAdapter.invokeProcess(lRequest);

			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/

			for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
				EstadosComboBean estadosCombo = new EstadosComboBean();
				estadosCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeFederativa()));
				estadosCombo.setSigla(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
				estadosCombo.setNome(lResponse.getOcorrencias(i).getNomeUnidadeFederativa());
				comboEstadosList.add(new SelectItem(estadosCombo.getCodigo(),estadosCombo.getNome()));
			}

			return comboEstadosList;
		}
	 
	 
		public List<ConsultarMunicipiosAposFechamentoDTO> listarMunicipios(String codigoEstado) {
			
			List<ConsultarMunicipiosAposFechamentoDTO> listaMunicipios = new ArrayList<ConsultarMunicipiosAposFechamentoDTO>();
			
			ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
			lRequest.setQtdeRegistros(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);
			lRequest.setCodUF(Integer.valueOf(codigoEstado));
			lRequest.setCodMunicipio(0);
			
			 /* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/
			
			IListarMunicipiosPDCAdapter listarMunicipiosPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
			ListarMunicipiosResponse lResponse = listarMunicipiosPDCAdapter.invokeProcess(lRequest);
			
		

			 /* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/
			int cont = 0;
			
			for (int i = 0; i < lResponse.getQtdeReg(); i++) {
				ConsultarMunicipiosAposFechamentoDTO municipioLista = new ConsultarMunicipiosAposFechamentoDTO();
				
				municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
				municipioLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
				municipioLista.setUf(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getSiglaUF()));
				municipioLista.setLinha(cont++);
				
				listaMunicipios.add(municipioLista);
			}
			
			return listaMunicipios;
		}

		public List<ConsultarDependenciaAposApuracaoFechamentoDTO> listarDependenciaApuracaoAposFechamento(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO) {
			ListaDepApuracaoAposFechISSRequest lRequest = new ListaDepApuracaoAposFechISSRequest();
			lRequest.setQtdeRegistro(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
			lRequest.setDiaMesAnoApuracao(entradaDTO.getCompetencia());
			lRequest.setCodPessoaJuridica(entradaDTO.getCodPessoaJuridica());
			lRequest.setCodDependencia(entradaDTO.getCodDependencia());
			lRequest.setTipoPesquisa(entradaDTO.getFiltro());

			IListaDepApuracaoAposFechISSPDCAdapter listaDependenciaApuracaoAposFechamentoISSPDCAdapter = factoryAdapter.getListaDepApuracaoAposFechISSPDCAdapter();
			ListaDepApuracaoAposFechISSResponse lResponse = listaDependenciaApuracaoAposFechamentoISSPDCAdapter.invokeProcess(lRequest);

			List<ConsultarDependenciaAposApuracaoFechamentoDTO> consultarDependenciaList = new ArrayList<ConsultarDependenciaAposApuracaoFechamentoDTO>();

			BigDecimal totalReceita = new BigDecimal(0);
			BigDecimal totalIss = new BigDecimal(0);
			long qtdeAgencia = 0l;
			long qtdePa = 0l;
			
			int cont = 0;

			for (int i = 0; i < lResponse.getOcorrenciasApurParcDepCount(); i++) {
				ConsultarDependenciaAposApuracaoFechamentoDTO dependenciaDTO = new ConsultarDependenciaAposApuracaoFechamentoDTO();
				dependenciaDTO.setDependecia(String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getCodDependencia()));
				dependenciaDTO.setDescricao(lResponse.getOcorrenciasApurParcDep(i).getDescDependencia());
				BigDecimal valorReceita = lResponse.getOcorrenciasApurParcDep(i).getValorRec(); 
				if ("-".equals(lResponse.getOcorrenciasApurParcDep(i).getSinalRec())) {
					valorReceita = valorReceita.negate();
				}
				BigDecimal valorIss = lResponse.getOcorrenciasApurParcDep(i).getValorIss();
				if ("-".equals(lResponse.getOcorrenciasApurParcDep(i).getSinalIss())) {
					valorIss = valorIss.negate();
				}
				dependenciaDTO.setReceita(NumberUtils.format(valorReceita));
				dependenciaDTO.setISSRecolher(NumberUtils.format(valorIss));
				totalReceita = totalReceita.add(valorReceita);
				totalIss = totalIss.add(valorIss);
				dependenciaDTO.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getCodPessoaJuridica()));
				dependenciaDTO.setNumeroSequencial(String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getNumeroSequencial()));
				dependenciaDTO.setDtProcessamento(lResponse.getDtProcessamento());
				
				dependenciaDTO.setDependecia(lResponse.getOcorrenciasApurParcDep(i).getCodDependencia() == 0?"":String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getCodDependencia()));
				dependenciaDTO.setCodPa(lResponse.getOcorrenciasApurParcDep(i).getCodPa() == 0?"":String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getCodPa()));
				dependenciaDTO.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(lResponse.getOcorrenciasApurParcDep(i).getCodDependencia()),6) + (GissUtil.notNull(lResponse.getOcorrenciasApurParcDep(i).getCodPa()) == 0?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(lResponse.getOcorrenciasApurParcDep(i).getCodPa())),6)));
				
				dependenciaDTO.setDescricao(lResponse.getOcorrenciasApurParcDep(i).getDescDependencia());
				dependenciaDTO.setDescPa(lResponse.getOcorrenciasApurParcDep(i).getDescPa());
				dependenciaDTO.setDescDepPa(lResponse.getOcorrenciasApurParcDep(i).getDescDependencia() + (GissUtil.notNull(lResponse.getOcorrenciasApurParcDep(i).getDescPa()).equals("")?"":"/"+GissUtil.notNull(lResponse.getOcorrenciasApurParcDep(i).getDescPa())));
				if(lResponse.getOcorrenciasApurParcDep(i).getCodPa() == 0){
					qtdeAgencia += 1;
				}else{
					qtdePa += 1;
				}
				dependenciaDTO.setQtdeAgencia(qtdeAgencia);
				dependenciaDTO.setQtdePa(qtdePa);
				dependenciaDTO.setLinha(i);
				consultarDependenciaList.add(dependenciaDTO);
			}
			Collections.sort(consultarDependenciaList);
			for (ConsultarDependenciaAposApuracaoFechamentoDTO consultarDependenciaAposApuracaoFechamentoDTO : consultarDependenciaList) {
				consultarDependenciaAposApuracaoFechamentoDTO.setLinha(cont++);
				consultarDependenciaAposApuracaoFechamentoDTO.setQtdeAgencia(qtdeAgencia);
				consultarDependenciaAposApuracaoFechamentoDTO.setQtdePa(qtdePa);
				consultarDependenciaAposApuracaoFechamentoDTO.setTotalReceita(NumberUtils.format(totalReceita));
				consultarDependenciaAposApuracaoFechamentoDTO.setTotalRecolher(NumberUtils.format(totalIss));
			}
			return consultarDependenciaList;
		}

		public List<ConsultarApuracaoFinalAposFechamentoDTO> listarApuracaoFinalAposFechamento(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO) {
			ListarApuracaoFinalAposFechamentoISSRequest lRequest = new ListarApuracaoFinalAposFechamentoISSRequest();
			lRequest.setNumeroMaximoOcorrencias(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
			lRequest.setCodigoPessoaJuridica(entradaDTO.getCodigoPessoaJuridica());
			lRequest.setSequenciaUnidadeOrganiza(entradaDTO.getNumeroSequencialUnidadeOrganizacional());
			lRequest.setCompetencia(entradaDTO.getCompetencia());

			IListarApuracaoFinalAposFechamentoISSPDCAdapter listarApuracaoFinalAposFechamentoISSPDCAdapter = factoryAdapter.getListarApuracaoFinalAposFechamentoISSPDCAdapter();
			ListarApuracaoFinalAposFechamentoISSResponse lResponse = listarApuracaoFinalAposFechamentoISSPDCAdapter.invokeProcess(lRequest);

			List<ConsultarApuracaoFinalAposFechamentoDTO> consultarApuracaoFinalList = new ArrayList<ConsultarApuracaoFinalAposFechamentoDTO>();

			BigDecimal totalIss = new BigDecimal(String.valueOf(lResponse.getTotalIssValor()));
			if ("-".equals(lResponse.getTotalIssSinal())) {
				totalIss = totalIss.negate();
			}
			
			BigDecimal totalMovimento = new BigDecimal(String.valueOf(lResponse.getMovimentoValor()));
			if ("-".equals(lResponse.getMovimentoSinal())) {
				totalMovimento = totalMovimento.negate();
			}

			BigDecimal totalTributavel = new BigDecimal(String.valueOf(lResponse.getTribuValor()));
			if ("-".equals(lResponse.getTribuSinal())) {
				totalTributavel = totalTributavel.negate();
			}

			for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
				Ocorrencias ocorr = lResponse.getOcorrencias(i);
				ConsultarApuracaoFinalAposFechamentoDTO apuracaoFinalDTO = new ConsultarApuracaoFinalAposFechamentoDTO();
				apuracaoFinalDTO.setBaseCalculo(NumberUtils.format(lResponse.getPorcBaseCalculoTribu()));
				apuracaoFinalDTO.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodigoGrupo() , ocorr.getCodigoSubgrupo()));
				apuracaoFinalDTO.setAliquotaPadrao(NumberUtils.format(lResponse.getPorcAliquotaPadraoMunicipio()));
				apuracaoFinalDTO.setConta(lResponse.getOcorrencias(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getOcorrencias(i).getNumeroConta()), 7)+ "-"+ lResponse.getOcorrencias(i).getDigitoConta());
				apuracaoFinalDTO.setCosif(GissUtil.mascaraContaContabil((String.valueOf(ocorr.getContaContabilTribu())),apuracaoFinalDTO.getRazao()));
				apuracaoFinalDTO.setAliquota(NumberUtils.format(ocorr.getPorcAliquotaConta())+"%");
				apuracaoFinalDTO.setCodDependencia(lResponse.getCodigoDependencia());
				apuracaoFinalDTO.setDescDependencia(lResponse.getDescDependencia());
				apuracaoFinalDTO.setCodMunicipio(lResponse.getCodMunicipio());
				apuracaoFinalDTO.setDescMunicipio(lResponse.getDescMunicipio());
				apuracaoFinalDTO.setUf(lResponse.getUf());

				BigDecimal valorIss = new BigDecimal(String.valueOf(ocorr.getIssValor()));
				if ("-".equals(ocorr.getIssSinal())) {
					valorIss = valorIss.negate();
				}
				apuracaoFinalDTO.setValorIss(NumberUtils.format(valorIss));

				BigDecimal valorMovimento = new BigDecimal(String.valueOf(ocorr.getMovimentoValor()));
				if ("-".equals(ocorr.getMovimentoSinal())) {
					valorMovimento = valorMovimento.negate();
				}
				apuracaoFinalDTO.setMovimento(NumberUtils.format(valorMovimento));

				BigDecimal valorTributavel = new BigDecimal(String.valueOf(ocorr.getTribuValor()));
				if ("-".equals(ocorr.getTribuSinal())) {
					valorTributavel = valorTributavel.negate();
				}
				apuracaoFinalDTO.setTributavel(NumberUtils.format(valorTributavel));

				apuracaoFinalDTO.setTipoIncidencia(lResponse.getTipoIncidenteTribu());
				apuracaoFinalDTO.setTotalISSFinal(NumberUtils.format(totalIss));
				apuracaoFinalDTO.setTotalMovimento(NumberUtils.format(totalMovimento));
				apuracaoFinalDTO.setTotalTributavel(NumberUtils.format(totalTributavel));
				apuracaoFinalDTO.setLinha(i);
				consultarApuracaoFinalList.add(apuracaoFinalDTO);
			}

			return consultarApuracaoFinalList;
		}
		
		public List<ConsultarApuracaoFinalAposFechamentoDTO> listarApuracaoFinalAposFechamentoConta(ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO) {
			ListarApurAposFechamentoNvContaRequest lRequest = new ListarApurAposFechamentoNvContaRequest();
			lRequest.setQtdeRegistros(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
			lRequest.setCodPessoaJurid(entradaDTO.getCodigoPessoaJuridica());
			lRequest.setNumSeqUnidadeOrgnz(entradaDTO.getNumeroSequencialUnidadeOrganizacional());
			lRequest.setCompetencia(entradaDTO.getCompetencia());
			String codGrpSubGrp[] = entradaDTO.getRazao().split("-");
			lRequest.setCodGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[0])));
			lRequest.setCodSubGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[1])));
			lRequest.setCosif(entradaDTO.getCosif());
			
			IListarApurAposFechamentoNvContaPDCAdapter listarApuracaoFinalAposFechamentoISSPDCAdapter = factoryAdapter.getListarApurAposFechamentoNvContaPDCAdapter();
			ListarApurAposFechamentoNvContaResponse lResponse = listarApuracaoFinalAposFechamentoISSPDCAdapter.invokeProcess(lRequest);

			List<ConsultarApuracaoFinalAposFechamentoDTO> consultarApuracaoFinalList = new ArrayList<ConsultarApuracaoFinalAposFechamentoDTO>();

			BigDecimal totalIss = lResponse.getValorIssTotal();
			if ("-".equals(lResponse.getSinalIssTotal())) {
				totalIss = totalIss.negate();
			}
			
			BigDecimal totalMovimento = lResponse.getValorMovementoTotal();
			if ("-".equals(lResponse.getSinalMovimentoTotal())) {
				totalMovimento = totalMovimento.negate();
			}

			BigDecimal totalTributavel = lResponse.getValorTributoTotal();
			if ("-".equals(lResponse.getSinalTributoTotal())) {
				totalTributavel = totalTributavel.negate();
			}

			for (int i = 0; i < lResponse.getListaApurAposFechamentoNvContaCount(); i++) {
				ListaApurAposFechamentoNvConta ocorr = lResponse.getListaApurAposFechamentoNvConta(i);
				ConsultarApuracaoFinalAposFechamentoDTO apuracaoFinalDTO = new ConsultarApuracaoFinalAposFechamentoDTO();
				apuracaoFinalDTO.setBaseCalculo(NumberUtils.format(lResponse.getPercentBaseCalc()));
				apuracaoFinalDTO.setRazao(GissUtil.formatarRazaoContabil(ocorr.getCodGrupo() , ocorr.getCodSubGrupo()));
				apuracaoFinalDTO.setAliquotaPadrao(NumberUtils.format(lResponse.getPercentAliquotaPadrao()));
				apuracaoFinalDTO.setConta(lResponse.getListaApurAposFechamentoNvConta(i).getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaApurAposFechamentoNvConta(i).getConta()), 7)+"-"+ lResponse.getListaApurAposFechamentoNvConta(i).getDigConta());
				apuracaoFinalDTO.setCosif(GissUtil.mascaraContaContabil((String.valueOf(ocorr.getCosif())),apuracaoFinalDTO.getRazao()));
				apuracaoFinalDTO.setAliquota(NumberUtils.format(ocorr.getPercentAliquota())+"%");
				apuracaoFinalDTO.setCodDependencia(lResponse.getCodDependencia());
				apuracaoFinalDTO.setDescDependencia(lResponse.getDescDependencia());
				apuracaoFinalDTO.setCodMunicipio(lResponse.getCodMunicipio());
				apuracaoFinalDTO.setDescMunicipio(lResponse.getDescMunicipio());
				apuracaoFinalDTO.setUf(lResponse.getCodUf());

				BigDecimal valorIss = ocorr.getValorIss();
				if ("-".equals(ocorr.getSinalIss())) {
					valorIss = valorIss.negate();
				}
				apuracaoFinalDTO.setValorIss(NumberUtils.format(valorIss));

				BigDecimal valorMovimento = ocorr.getValorMovimento();
				if ("-".equals(ocorr.getSinalMovimento())) {
					valorMovimento = valorMovimento.negate();
				}
				apuracaoFinalDTO.setMovimento(NumberUtils.format(valorMovimento));

				BigDecimal valorTributavel = ocorr.getValorTributo();
				if ("-".equals(ocorr.getSinalTributo())) {
					valorTributavel = valorTributavel.negate();
				}
				apuracaoFinalDTO.setTributavel(NumberUtils.format(valorTributavel));

				apuracaoFinalDTO.setTipoIncidencia(lResponse.getTipoIndicador());
				apuracaoFinalDTO.setTotalISSFinal(NumberUtils.format(totalIss));
				apuracaoFinalDTO.setTotalMovimento(NumberUtils.format(totalMovimento));
				apuracaoFinalDTO.setTotalTributavel(NumberUtils.format(totalTributavel));
				consultarApuracaoFinalList.add(apuracaoFinalDTO);
			}

			return consultarApuracaoFinalList;
		}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

