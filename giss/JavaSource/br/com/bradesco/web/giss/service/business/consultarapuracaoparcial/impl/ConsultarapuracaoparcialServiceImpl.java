/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoparcial/impl/ConsultarapuracaoparcialServiceImpl.java,v $
 * $Id: ConsultarapuracaoparcialServiceImpl.java,v 1.9 2018/06/14 10:16:08 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ConsultarapuracaoparcialServiceImpl.java,v $
 * Revision 1.9  2018/06/14 10:16:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/06/06 17:08:56  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/05/17 18:47:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/27 10:35:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/04/24 02:27:02  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/04/13 18:14:34  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2018/04/06 14:01:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/12/18 10:46:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:12:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2012/12/21 16:36:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:39  gmichelini
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

package br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoServiceConstants;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.exceptions.ConsultarApuracaoAposFechamentoServiceException;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialServiceConstants;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarApuracaoParcialFinalDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarDependenciaParcialDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.exceptions.ConsultarapuracaoparcialServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.IListaApuracaoParcialFinalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.ListaApuracaoParcialFinalResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.IListarApuracaoParcialDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.request.ListarApuracaoParcialDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.IListarApuracaoParcialNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse;
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
 * Implementação do adaptador: Consultarapuracaoparcial
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConsultarapuracaoparcialServiceImpl implements IConsultarapuracaoparcialService {






	private FactoryAdapter factoryAdapter;



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




	public List<ConsultarMunicipiosApuracaoParcialDTO> listarMunicipios(String codigoEstado) {

		List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios = new ArrayList<ConsultarMunicipiosApuracaoParcialDTO>();

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


			ConsultarMunicipiosApuracaoParcialDTO municipioLista = new ConsultarMunicipiosApuracaoParcialDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
			municipioLista.setUf(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getSiglaUF()));
			municipioLista.setLinha(cont++);

			listaMunicipios.add(municipioLista);
		}

		return listaMunicipios;
	}


	public ConsultarDependenciaParcialDTO listarDependenciaMunicipioResultado(long codigoMunicipio, long codPessoaJurid, int codDependencia) throws PdcAdapterException, ConsultarapuracaoparcialServiceException {

		ConsultarDependenciaParcialDTO dependeciaMunicipio;	
		ConsultarDependenciaParcialDTO dep = new ConsultarDependenciaParcialDTO();

		ListarApuracaoParcialDependenciaRequest lRequest = new ListarApuracaoParcialDependenciaRequest();		
		lRequest.setCodigoMunicipio(codigoMunicipio);
		lRequest.setCodPessoaJurid(codPessoaJurid);
		lRequest.setCodDependencia(codDependencia);
		lRequest.setQuantidadeOcorrencias(IConsultarapuracaoparcialServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListarApuracaoParcialDependenciaPDCAdapter apuracaoParcialDependenciaPDCAdapter = factoryAdapter.getListarApuracaoParcialDependenciaPDCAdapter();
		ListarApuracaoParcialDependenciaResponse lResponse = apuracaoParcialDependenciaPDCAdapter.invokeProcess(lRequest);

		BigDecimal totalISS = BigDecimal.ZERO;
		BigDecimal totalISSPa = BigDecimal.ZERO;
		BigDecimal totalReceita = BigDecimal.ZERO;
		BigDecimal totalReceitaPa = BigDecimal.ZERO;

		BigDecimal totalISSGeral = lResponse.getValorISSGeral();
		if ("-".equals(lResponse.getSinalISSGeral())) {
			totalISSGeral = totalISSGeral.negate();
		}
		BigDecimal totalReceitaGeral = lResponse.getValorReceitaGeral();
		if ("-".equals(lResponse.getSinalReceitaGeral())) {
			totalReceitaGeral = totalReceitaGeral.negate();
		}
		dep.setCodMunicipio(lResponse.getCodMunicipio());
		dep.setCodUF(lResponse.getCodUf());
		dep.setDescMunicipio(lResponse.getDescMunicipio());
		dep.setDescUF(lResponse.getDescUf());

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		for (int i = 0; i < lResponse.getListaApuracaoParcialDependenciaCount(); i++) {
			dependeciaMunicipio = new ConsultarDependenciaParcialDTO();	

			dependeciaMunicipio.setCodigoPessoaJuridica(String.valueOf(lResponse.getListaApuracaoParcialDependencia(i).getCodPessoaJurid()));
			dependeciaMunicipio.setNumeroSequencial(String.valueOf(lResponse.getListaApuracaoParcialDependencia(i).getNumSeqUnidadeOrganizacional()));
			dependeciaMunicipio.setTotalRecolherGeral(NumberUtils.format(totalISSGeral));
			dependeciaMunicipio.setTotalReceitaGeral(NumberUtils.format(totalReceitaGeral));
			
			dependeciaMunicipio.setDependencia(lResponse.getListaApuracaoParcialDependencia(i).getCodDependencia() == 0?"":String.valueOf(lResponse.getListaApuracaoParcialDependencia(i).getCodDependencia()));
			dependeciaMunicipio.setCodPa(lResponse.getListaApuracaoParcialDependencia(i).getCodPa() == 0?"":String.valueOf(lResponse.getListaApuracaoParcialDependencia(i).getCodPa()));
			dependeciaMunicipio.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(lResponse.getListaApuracaoParcialDependencia(i).getCodDependencia()),6) + (GissUtil.notNull(lResponse.getListaApuracaoParcialDependencia(i).getCodPa()) == 0?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(lResponse.getListaApuracaoParcialDependencia(i).getCodPa())),6)));
			
			dependeciaMunicipio.setDescricao(lResponse.getListaApuracaoParcialDependencia(i).getDescDependencia());
			dependeciaMunicipio.setDescPa(lResponse.getListaApuracaoParcialDependencia(i).getDescPa());
			dependeciaMunicipio.setDescDepPa(lResponse.getListaApuracaoParcialDependencia(i).getDescDependencia() + (GissUtil.notNull(lResponse.getListaApuracaoParcialDependencia(i).getDescPa()).equals("")?"":"/"+GissUtil.notNull(lResponse.getListaApuracaoParcialDependencia(i).getDescPa())));
			dependeciaMunicipio.setReceita(NumberUtils.format(lResponse.getListaApuracaoParcialDependencia(i).getValorReceita()));
			dependeciaMunicipio.setISSRecolher(NumberUtils.format(lResponse.getListaApuracaoParcialDependencia(i).getValorISS()));
			if(lResponse.getListaApuracaoParcialDependencia(i).getCodPa() == 0){
				totalReceita = totalReceita.add(lResponse.getListaApuracaoParcialDependencia(i).getValorReceita());
				totalISS = totalISS.add(lResponse.getListaApuracaoParcialDependencia(i).getValorISS());
			}else{
				totalReceitaPa = totalReceitaPa.add(lResponse.getListaApuracaoParcialDependencia(i).getValorReceita());
				totalISSPa = totalISSPa.add(lResponse.getListaApuracaoParcialDependencia(i).getValorISS());
			}
			
			dep.getLista().add(dependeciaMunicipio);
		}
		
		Collections.sort(dep.getLista());
		for (ConsultarDependenciaParcialDTO element : dep.getLista()) {
			element.setLinha(cont++);
			element.setTotalReceita(NumberUtils.format(totalReceita));
			element.setTotalReceitaPa(NumberUtils.format(totalReceitaPa));
			element.setTotalRecolher(NumberUtils.format(totalISS));
			element.setTotalRecolherPa(NumberUtils.format(totalISSPa));
			element.setTotalRecolherGeral(NumberUtils.format(totalISS.add(totalISSPa)));
			element.setTotalReceitaGeral(NumberUtils.format(totalReceitaPa.add(totalReceita)));
		}
		return dep;

	}
	
	
	public List<ConsultarApuracaoParcialFinalDTO> listarApuracaoParcialFinal(String codigoMunicipio,int codigoPessoaJuridica,String numeroSequencialUnidade){
		
		List<ConsultarApuracaoParcialFinalDTO> consultarApuracaoParcialList = new ArrayList<ConsultarApuracaoParcialFinalDTO>();
	
		
		ListaApuracaoParcialFinalRequest lRequest = new ListaApuracaoParcialFinalRequest();
		lRequest.setCodigoMunicipio(Long.parseLong(codigoMunicipio));
		lRequest.setNumeroMaxOcorrencia(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
		lRequest.setSequenciaOrganizada(Integer.parseInt(numeroSequencialUnidade));
		lRequest.setCodigoPessoaJuridica(codigoPessoaJuridica);
		
		IListaApuracaoParcialFinalPDCAdapter listaApuracaoParcialFinalPDCAdapter = factoryAdapter.getListaApuracaoParcialFinalPDCAdapter();
		ListaApuracaoParcialFinalResponse lResponse = listaApuracaoParcialFinalPDCAdapter.invokeProcess(lRequest);
		
		BigDecimal totalIss = new BigDecimal(String.valueOf(lResponse.getTotalValorIss()));
		if ("-".equals(lResponse.getTotalValorIssSinal())) {
			totalIss = totalIss.negate();
		}
		
		BigDecimal totalMovimento = new BigDecimal(String.valueOf(lResponse.getTotalValorMovimento()));
		if ("-".equals(lResponse.getTotalValorMovimentoSinal())) {
			totalMovimento = totalMovimento.negate();
		}
		
		BigDecimal totalTributavel = new BigDecimal(String.valueOf(lResponse.getTotalValorTribu()));
		if ("-".equals(lResponse.getTotalValorTribuSinal())) {
			totalTributavel = totalTributavel.negate();
		}
	
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			
			ConsultarApuracaoParcialFinalDTO apuracaoParcialDTO = new ConsultarApuracaoParcialFinalDTO();
			
			apuracaoParcialDTO.setBaseCalculo(NumberUtils.format(lResponse.getBaseCalculoTributario())+ "%");
			apuracaoParcialDTO.setAliquotaPadrao(NumberUtils.format(lResponse.getAliquotaPadraoMunicipio()) + "%");
			apuracaoParcialDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			apuracaoParcialDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getOcorrencias(i).getContaContabilTributavel()),apuracaoParcialDTO.getRazao()));
			apuracaoParcialDTO.setAliquota(NumberUtils.format(lResponse.getOcorrencias(i).getAliquotaConta()) + "%");
			
			BigDecimal valorIss = new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getValorIss()));
			if ("-".equals(lResponse.getOcorrencias(i).getValorIssSinal())) {
				valorIss = valorIss.negate();
			}
			apuracaoParcialDTO.setValorIss(NumberUtils.format(valorIss));
			BigDecimal valorMovimento = new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getValorMovimento()));
			if ("-".equals(lResponse.getOcorrencias(i).getValorMovimentoSinal())) {
				valorMovimento = valorMovimento.negate();
			}
			apuracaoParcialDTO.setMovimento(NumberUtils.format(valorMovimento));
			BigDecimal valorTributavel = new BigDecimal(String.valueOf(lResponse.getOcorrencias(i).getValorTributario()));
			if ("-".equals(lResponse.getOcorrencias(i).getValorTributarioSinal())) {
				valorTributavel = valorTributavel.negate();
			}
			apuracaoParcialDTO.setTributavel(NumberUtils.format(valorTributavel));
			apuracaoParcialDTO.setTipoIncidencia(lResponse.getTipoIncidenteTributario());
			apuracaoParcialDTO.setDataSolicitacao(lResponse.getDataApuracao().replace(".", "/"));
			apuracaoParcialDTO.setTotalISSFinal(NumberUtils.format(totalIss));
			apuracaoParcialDTO.setTotalMovimento(NumberUtils.format(totalMovimento));
			apuracaoParcialDTO.setTotalTributavel(NumberUtils.format(totalTributavel));
			apuracaoParcialDTO.setLinha(i);
			consultarApuracaoParcialList.add(apuracaoParcialDTO);
		}
		
		return consultarApuracaoParcialList;
	}
	
	public List<ConsultarApuracaoParcialFinalDTO> listarApuracaoParcialFinalConta(String codigoMunicipio,int codigoPessoaJuridica,Integer numeroSequencialUnidade, String razao, String cosif, String dataInicial, String dataFinal){
		
		List<ConsultarApuracaoParcialFinalDTO> consultarApuracaoParcialList = new ArrayList<ConsultarApuracaoParcialFinalDTO>();
		String codGrpSubGrp[] = razao.split("-");
		ListarApuracaoParcialNvContaRequest lRequest = new ListarApuracaoParcialNvContaRequest();
		lRequest.setCodMunicipio(Long.parseLong(codigoMunicipio));
		lRequest.setQtdeRegistros(IConsultarApuracaoAposFechamentoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_APURACAO_APOS_FECHAMENTO);
		lRequest.setNumSeqUnidOrgnz(numeroSequencialUnidade);
		lRequest.setCodPessoaJurid(codigoPessoaJuridica);
		lRequest.setCodGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[0])));
		lRequest.setCodSubGrupo(Integer.valueOf(GissUtil.notNull(codGrpSubGrp[1])));
		lRequest.setCosif(cosif);
		lRequest.setDataInicial(dataInicial.replace("/", "."));
		lRequest.setDataFinal(dataFinal.replace("/", "."));
		
		IListarApuracaoParcialNvContaPDCAdapter listarApuracaoParcialNvContaPDCAdapter = factoryAdapter.getListarApuracaoParcialNvContaPDCAdapter();
		ListarApuracaoParcialNvContaResponse lResponse = listarApuracaoParcialNvContaPDCAdapter.invokeProcess(lRequest);
		
		BigDecimal totalIss = lResponse.getValorIssTotal();
		if ("-".equals(lResponse.getSinalIssTotal())) {
			totalIss = totalIss.negate();
		}
		
		BigDecimal totalMovimento = lResponse.getValorMovimentoTotal();
		if ("-".equals(lResponse.getSinalMovimentoTotal())) {
			totalMovimento = totalMovimento.negate();
		}
		
		BigDecimal totalTributavel = lResponse.getValorTributoTotal();
		if ("-".equals(lResponse.getSinalTributoTotal())) {
			totalTributavel = totalTributavel.negate();
		}
		
		for (int i = 0; i < lResponse.getListaApuracaoParcialNvContaCount(); i++) {
			
			ConsultarApuracaoParcialFinalDTO apuracaoParcialDTO = new ConsultarApuracaoParcialFinalDTO();
			
			apuracaoParcialDTO.setBaseCalculo(NumberUtils.format(lResponse.getPercentBaseCalculo())+ "%");
			apuracaoParcialDTO.setAliquotaPadrao(NumberUtils.format(lResponse.getPercentAliquotaPadrao()) + "%");
			apuracaoParcialDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaApuracaoParcialNvConta(i).getCodGrupo() , lResponse.getListaApuracaoParcialNvConta(i).getCodSubGrupo()));
			apuracaoParcialDTO.setConta(lResponse.getListaApuracaoParcialNvConta(i).getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaApuracaoParcialNvConta(i).getConta()),7)+"-"+lResponse.getListaApuracaoParcialNvConta(i).getDigConta());
			apuracaoParcialDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getListaApuracaoParcialNvConta(i).getCosif()),apuracaoParcialDTO.getRazao()));
			apuracaoParcialDTO.setAliquota(NumberUtils.format(lResponse.getListaApuracaoParcialNvConta(i).getAliquotaConta()) + "%");
			
			BigDecimal valorIss = lResponse.getListaApuracaoParcialNvConta(i).getValorIss();
			if ("-".equals(lResponse.getListaApuracaoParcialNvConta(i).getSinalIss())) {
				valorIss = valorIss.negate();
			}
			apuracaoParcialDTO.setValorIss(NumberUtils.format(valorIss));
			BigDecimal valorMovimento = lResponse.getListaApuracaoParcialNvConta(i).getValorMovimento();
			if ("-".equals(lResponse.getListaApuracaoParcialNvConta(i).getSinalMovimento())) {
				valorMovimento = valorMovimento.negate();
			}
			apuracaoParcialDTO.setMovimento(NumberUtils.format(valorMovimento));
			BigDecimal valorTributavel = lResponse.getListaApuracaoParcialNvConta(i).getValorTributo();
			if ("-".equals(lResponse.getListaApuracaoParcialNvConta(i).getSinalTributo())) {
				valorTributavel = valorTributavel.negate();
			}
			apuracaoParcialDTO.setTributavel(NumberUtils.format(valorTributavel));
			apuracaoParcialDTO.setTipoIncidencia(lResponse.getDescTipoIndicador());
			apuracaoParcialDTO.setDataSolicitacao(lResponse.getDataSolicitacaoApuracao().replace(".", "/"));
			apuracaoParcialDTO.setTotalISSFinal(NumberUtils.format(totalIss));
			apuracaoParcialDTO.setTotalMovimento(NumberUtils.format(totalMovimento));
			apuracaoParcialDTO.setTotalTributavel(NumberUtils.format(totalTributavel));
			consultarApuracaoParcialList.add(apuracaoParcialDTO);
		}
		
		return consultarApuracaoParcialList;
	}

	/**
	 * Construtor.
	 */
	public ConsultarapuracaoparcialServiceImpl() {
		// TODO: Implementação
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

