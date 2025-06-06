/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/resultmunnovo/impl/ResultMunNovoServiceImpl.java,v $
 * $Id: ResultMunNovoServiceImpl.java,v 1.12 2018/06/14 10:16:08 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ResultMunNovoServiceImpl.java,v $
 * Revision 1.12  2018/06/14 10:16:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.11  2018/06/06 17:08:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.10  2018/02/01 16:15:26  gmichelini
 * *** empty log message ***
 *
 * Revision 1.9  2017/12/18 10:46:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2017/12/14 17:46:44  gabrielmarani
 * *** empty log message ***
 *
 * Revision 1.7  2017/11/06 11:39:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2017/08/14 20:09:11  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.5  2017/08/11 19:00:23  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.4  2017/06/09 11:56:22  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/06/06 23:39:07  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:13:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2012/12/21 16:36:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
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

package br.com.bradesco.web.giss.service.business.resultmunnovo.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.DetalheMunicipioDTO;
import br.com.bradesco.web.giss.service.business.municipio.IMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.municipio.exceptions.MunicipioServiceException;
import br.com.bradesco.web.giss.service.business.resultmunnovo.IResultMunNovoService;
import br.com.bradesco.web.giss.service.business.resultmunnovo.IResultMunNovoServiceConstants;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ContaDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.IncluirMunicipioDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultAgenciaMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.TipoServicoDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.response.AtualizarAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.IComboTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.request.ComboTipoIncidenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.response.ComboTipoIncidenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.response.ComboTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.IConsultarMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.request.ConsultarMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.IEfetivaSelecMunicipiosSemConvPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest;
import br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada;
import br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.response.EfetivaSelecMunicipiosSemConvResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluiralterarcontasmunicipio.IIncluirAlterarContasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluiralterarcontasmunicipio.request.IncluirAlterarContasMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluiralterarcontasmunicipio.response.IncluirAlterarContasMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.IIncluirMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.response.IncluirMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.IListarContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.IListarDependenciasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.ListarDependenciasMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.IListarMunicipiosNovosAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.request.ListarMunicipiosNovosAllRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.response.ListarMunicipiosNovosAllResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.IListarMunicipiosSemConvenioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.IListarResultMunNovosAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.request.ListarResultMunNovosAllRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.response.ListarResultMunNovosAllResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.integracao.resultadomunicipiosnovos.ResultMunNovosReportTXT;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.model.municipio.EstadosComboBean;
import br.com.bradesco.web.giss.view.bean.model.tipoincidencia.TipoIncidenciaComboBean;

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
 * Implementação do adaptador: ResultMunNovo
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ResultMunNovoServiceImpl implements IResultMunNovoService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public ResultMunNovoServiceImpl() {
		// TODO: Implementação
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public DetalheMunicipioDTO detalharMunicipio(String codigoMunicipio, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {

		DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();
		ConsultarMunicipioRequest lRequest = new ConsultarMunicipioRequest();

		lRequest.setCodMunicipio(Integer.valueOf(codigoMunicipio));
		lRequest.setTipoPesquisa(Integer.valueOf(tipoPesquisa));

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IConsultarMunicipioPDCAdapter municipioPDCAdapter = factoryAdapter.getConsultarMunicipioPDCAdapter();
		ConsultarMunicipioResponse lResponse = municipioPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		detMunicipioDTORetorno.setPercentualAliquota(String.valueOf(lResponse.getPercentualAliquotaMunicipio()).replace(".", ","));
		detMunicipioDTORetorno.setDiaVencimento(String.valueOf(lResponse.getDiaVencimentoTribut()));
		detMunicipioDTORetorno.setPagtoDiaUtil(String.valueOf(lResponse.getIndNecessidadePagtoDiaUtil()));
		detMunicipioDTORetorno.setDescFormaPagamento(String.valueOf(lResponse.getCodigoFormaPagamento()));
		detMunicipioDTORetorno.setPercentualBaseCalculo(String.valueOf(lResponse.getPercentualBaseAliquota()).replace(".", ","));
		detMunicipioDTORetorno.setPercentualAliquotaPadrao(String.valueOf(lResponse.getPercentualAliquotaPadrao()).replace(".", ","));
		detMunicipioDTORetorno.setDescTipoIncidencia(String.valueOf(lResponse.getCodigoTipoIncidencia()));
		detMunicipioDTORetorno.setNomeTipoIncidencia(lResponse.getNomeTipoIncidencia());
		detMunicipioDTORetorno.setCodigoDependRespRecolhimento(lResponse.getCodigoDependenciaCentralizadora());
		detMunicipioDTORetorno.setNomeDependRespRecolhimento(lResponse.getDescricaoDependenciaCentralizadora());
		detMunicipioDTORetorno.setIndiceVigencia(lResponse.getIndiceVigencia());
		detMunicipioDTORetorno.setCodigoMunicipio(String.valueOf(lResponse.getCodigoMunicipioCentralizadora()));
		detMunicipioDTORetorno.setNomeMunicipio(lResponse.getDescricaoMunicipio());
		detMunicipioDTORetorno.setCodigoPessoaJuridica(String.valueOf(lResponse.getCodigoPessoaJuridicaCentralizadora()));
		detMunicipioDTORetorno.setNumeroSequencialCentralizadora(String.valueOf(lResponse.getNumeroSequencialCentralizadora()));
		detMunicipioDTORetorno.setNomeUnidadeFederativa(lResponse.getUFCentralizadora());
		detMunicipioDTORetorno.setDescUnidadeFederativa(lResponse.getDescricaoUF());
		detMunicipioDTORetorno.setTipoPesquisa(lResponse.getTipoPesquisa());

		return detMunicipioDTORetorno;
	}

	public List<ResultMunicipiosNovosDTO> listarMunicipiosNovos(Long codMunicipio, Integer codUF, Integer tipoPesquisa)  {

		List<ResultMunicipiosNovosDTO> listaMunicipiosNovos = new ArrayList<ResultMunicipiosNovosDTO>();
		ListarResultMunNovosAllRequest lRequest = new ListarResultMunNovosAllRequest();
		lRequest.setQtdeRegistros(IResultMunNovoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setCodUf(codUF);
		lRequest.setTipoPesquisa(tipoPesquisa);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarResultMunNovosAllPDCAdapter listaMunicipiosNovosPDCAdapter = factoryAdapter.getListarResultMunNovosAllPDCAdapter();
		ListarResultMunNovosAllResponse lResponse = listaMunicipiosNovosPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		int cont = 0;

		for (int i = 0; i < lResponse.getListaResultMunNovosAllCount(); i++) {
			ResultMunicipiosNovosDTO municipioNovosLista = new ResultMunicipiosNovosDTO();

			municipioNovosLista.setCodigo(String.valueOf(lResponse.getListaResultMunNovosAll(i).getCodMunicipio()));
			municipioNovosLista.setNome(String.valueOf(lResponse.getListaResultMunNovosAll(i).getDescMunicipio()));
			municipioNovosLista.setUf(String.valueOf(lResponse.getListaResultMunNovosAll(i).getDescUf()));
			municipioNovosLista.setLinha(cont++);

			listaMunicipiosNovos.add(municipioNovosLista);
		}

		return listaMunicipiosNovos;
	}

	public List<EstadosComboBean> listagemEstados() throws PdcAdapterException, MunicipioServiceException {

		List<EstadosComboBean> comboEstadosList = new ArrayList<EstadosComboBean>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();
		lRequest.setQuantidadeOcorrencias(IMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IMunicipioServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
		lRequest.setNomeUnidadeFederativa("");
		lRequest.setSiglaUnidadeFederativa("");

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IComboEstadosPDCAdapter comboEstadosPDCAdapter = factoryAdapter.getComboEstadosPDCAdapter();
		ComboEstadosResponse lResponse = comboEstadosPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeFederativa()));
			estadosCombo.setSigla(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
			estadosCombo.setNome(lResponse.getOcorrencias(i).getNomeUnidadeFederativa());
			comboEstadosList.add(estadosCombo);
		}

		return comboEstadosList;
	}

	public List<SelectItem> listarTipoIncidencia() throws PdcAdapterException, MunicipioServiceException {

		List<SelectItem> comboTipoIncidenciaList = new ArrayList<SelectItem>();
		ComboTipoIncidenciaRequest lRequest = new ComboTipoIncidenciaRequest();
		lRequest.setQuantidadeOcorrencias(100);
		lRequest.setCodigoTipoIncidencia(0);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IComboTipoIncidenciaPDCAdapter comboTipoIncidenciaPDCAdapter = factoryAdapter.getComboTipoIncidenciaPDCAdapter();
		ComboTipoIncidenciaResponse lResponse = comboTipoIncidenciaPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			TipoIncidenciaComboBean tipoIncidenciaCombo = new TipoIncidenciaComboBean();
			tipoIncidenciaCombo.setCodigoTipoIncidencia(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoIncidencia()));
			tipoIncidenciaCombo.setDescricaoTipoIncidencia(lResponse.getOcorrencias(i).getDescricaoTipoIncidencia());
			comboTipoIncidenciaList.add(new SelectItem(tipoIncidenciaCombo.getCodigoTipoIncidencia(), tipoIncidenciaCombo.getDescricaoTipoIncidencia()));
		}

		return comboTipoIncidenciaList;
	}

	public List<ResultMunicipiosNovosDTO> listarMunicipios(String codigoMunicipio) {

		List<ResultMunicipiosNovosDTO> listaMunicipios = new ArrayList<ResultMunicipiosNovosDTO>();

		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();
		lRequest.setQtdeRegistros(IResultMunNovoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);
		lRequest.setCodUF(Integer.valueOf(codigoMunicipio));
		lRequest.setCodMunicipio(0);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarMunicipiosPDCAdapter listarMunicipiosPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
		ListarMunicipiosResponse lResponse = listarMunicipiosPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		int cont = 0;

		for (int i = 0; i < lResponse.getQtdeReg(); i++) {
			ResultMunicipiosNovosDTO municipioLista = new ResultMunicipiosNovosDTO();

			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
			municipioLista.setUf(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getSiglaUF()));
			municipioLista.setLinha(cont++);

			listaMunicipios.add(municipioLista);
		}

		return listaMunicipios;
	}

	public List<ResultAgenciaMunicipiosNovosDTO> listarDependenciasMunicipio(String codMunicipioFiltro) {

		List<ResultAgenciaMunicipiosNovosDTO> listaDependenciasMunicipios = new ArrayList<ResultAgenciaMunicipiosNovosDTO>();
		ListarDependenciasMunicipioRequest lRequest = new ListarDependenciasMunicipioRequest();
		lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
		lRequest.setCodMunicipio(Integer.parseInt(codMunicipioFiltro));
		lRequest.setCodDependencia(0);
		lRequest.setCodPessoaJuridica(0);
		lRequest.setQtdDependenciasAtivas(0);
		lRequest.setQtdDependenciasEncer(0);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarDependenciasMunicipioPDCAdapter listarDependenciaMunicipiosPDCAdapter = factoryAdapter.getListarDependenciasMunicipioPDCAdapter();
		ListarDependenciasMunicipioResponse lResponse = listarDependenciaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		int cont = 0;

		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			ResultAgenciaMunicipiosNovosDTO dependenciaMunicipioLista = new ResultAgenciaMunicipiosNovosDTO();

			dependenciaMunicipioLista.setAgencia(String.valueOf(lResponse.getOcorrencias(i).getCodDependencia()));
			dependenciaMunicipioLista.setNome(String.valueOf(lResponse.getOcorrencias(i).getDescDependencia()));
			dependenciaMunicipioLista.setLinha(cont++);
			dependenciaMunicipioLista.setCodigoPessoaJuridica(lResponse.getOcorrencias(i).getCodPessoaJuridica());
			dependenciaMunicipioLista.setNumeroSequenciaDependencia(lResponse.getOcorrencias(i).getNumSeqPessoaJuridica());

			listaDependenciasMunicipios.add(dependenciaMunicipioLista);
		}

		return listaDependenciasMunicipios;
	}

	public List<SelectItem> listarTipoServico() {

		List<SelectItem> comboTipoServico = new ArrayList<SelectItem>();
		ComboTipoServicoRequest lRequest = new ComboTipoServicoRequest();
		lRequest.setTipoServico(0);
		lRequest.setNumeroMaximoOcorrencia(99);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */
		IComboTipoServicoPDCAdapter comboTipoServicoPDCAdapter = factoryAdapter.getComboTipoServicoPDCAdapter();
		ComboTipoServicoResponse lResponse = comboTipoServicoPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		int cont = 0;
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			TipoServicoDTO tipoServico = new TipoServicoDTO();
			tipoServico.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoServico()));
			tipoServico.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoServico());
			tipoServico.setNumeroRegistro(cont++);

			comboTipoServico.add(new SelectItem(tipoServico.getCodigo(), tipoServico.getCodigo() + " - " + tipoServico.getDescricao()));
		}

		return comboTipoServico;
	}

	public List<ContaDTO> listarContasTipoServico(String codigoMunicipio, String codigoTipoServico) {

		List<ContaDTO> dependenciasMunicipiosList = new ArrayList<ContaDTO>();
		if (codigoTipoServico != "" && codigoTipoServico != null) {
			ListarContasTipoServicoRequest lRequest = new ListarContasTipoServicoRequest();

			lRequest.setNumeroMaximoOcorrencia(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
			lRequest.setCodigoMunicipio(Long.parseLong(codigoMunicipio));
			lRequest.setCodigoTipoServicoV(Integer.parseInt(codigoTipoServico));

			IListarContasTipoServicoPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarContasTipoServicoPDCAdapter();
			ListarContasTipoServicoResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);

			int cont = 0;

			for (int i = 0; i < lResponse.getQuantidadeOcorrencia(); i++) {
				ContaDTO contaDTO = new ContaDTO();
				contaDTO.setDescricao(lResponse.getListaContasTipoServico(i).getDescricaoRazao());
				contaDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContasTipoServico(i).getCodGrupo() , lResponse.getListaContasTipoServico(i).getCodSubGrupo()));
				contaDTO.setConta(lResponse.getListaContasTipoServico(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaContasTipoServico(i).getNumeroConta()),7)+"-"+ lResponse.getListaContasTipoServico(i).getDigitoConta());
				contaDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getListaContasTipoServico(i).getCodigoConta()),contaDTO.getRazao()));
				contaDTO.setCodigoTributo(String.valueOf(lResponse.getListaContasTipoServico(i).getCodigoTributo()));
				contaDTO.setInicioVigencia(lResponse.getListaContasTipoServico(i).getDtInicioVigencia());
				contaDTO.setFinalVigencia(lResponse.getListaContasTipoServico(i).getDtFinalVigencia());
				contaDTO.setPercentualAliquota(String.valueOf(lResponse.getListaContasTipoServico(i).getPercentualAliquota()).replace(".", ","));
				contaDTO.setLinha(cont++);
				dependenciasMunicipiosList.add(contaDTO);
			}
		}
		return dependenciasMunicipiosList;
	}

	public DetalheMunicipioDTO incluirMunicipio(IncluirMunicipioDTO incluirMunicipioDTO) throws PdcAdapterException, MunicipioServiceException {

		DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();

		IncluirMunicipioRequest incluirMunicipio = new IncluirMunicipioRequest();

		incluirMunicipio.setCodigoFormaPagamento(Integer.valueOf(incluirMunicipioDTO.getCodigoFormaPagamento()));
		incluirMunicipio.setCodigoMunicipio(Long.valueOf(incluirMunicipioDTO.getCodigoMunicipio()));
		incluirMunicipio.setCodigoTipoIncidencia(Integer.valueOf(incluirMunicipioDTO.getCodigoTipoIncidencia()));
		incluirMunicipio.setCodigoUnidadeOrganizacional(Long.valueOf(incluirMunicipioDTO.getCodigoUnidadeOrganizacional()));
		incluirMunicipio.setDiaVencimento(Integer.valueOf(incluirMunicipioDTO.getDiaVencimento()));
		incluirMunicipio.setIndNecessidadePagtoDiaUtil(incluirMunicipioDTO.getIndNecessidadePagtoDiaUtil());
		incluirMunicipio.setNumeroUnidadeOrganizacional(Integer.valueOf(incluirMunicipioDTO.getNumeroUnidadeOrganizacional()));
		incluirMunicipio.setPercentualAliquotaPadrao(new BigDecimal(incluirMunicipioDTO.getPercentualAliquotaPadrao().replace(",", ".")));
		incluirMunicipio.setPercentualBaseAliquota(new BigDecimal(incluirMunicipioDTO.getPercentualBaseAliquota().replace(",", ".")));
		incluirMunicipio.setCodigoLegislacaoVigente(0);
		incluirMunicipio.setItemComplementarLei("");
		
		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IIncluirMunicipioPDCAdapter alterarMunicipioPDCAdapter = factoryAdapter.getIncluirMunicipioPDCAdapter();
		IncluirMunicipioResponse lResponse = alterarMunicipioPDCAdapter.invokeProcess(incluirMunicipio);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		detMunicipioDTORetorno.setCodigoErro(lResponse.getCodMensagem());
		detMunicipioDTORetorno.setMensagemErro(lResponse.getMensagem());

		return detMunicipioDTORetorno;

	}

	public DetalheMunicipioDTO incluirContasMunicipio(IncluirMunicipioDTO incluirMunicipioDTO) throws PdcAdapterException, MunicipioServiceException {

		DetalheMunicipioDTO detMunicipioDTORetorno = new DetalheMunicipioDTO();

		IncluirAlterarContasMunicipioRequest incluirAlterarMunicipio = new IncluirAlterarContasMunicipioRequest();

		incluirAlterarMunicipio.setAliquotaConta(new BigDecimal(incluirMunicipioDTO.getAliquotaConta().replace(",", ".")));
		incluirAlterarMunicipio.setCodigoGrupo(incluirMunicipioDTO.getCodigoGrupo());
		incluirAlterarMunicipio.setCodigoSubgrupo(incluirMunicipioDTO.getCodigoSubgrupo());
		incluirAlterarMunicipio.setCodigoMunicipio(Long.valueOf(incluirMunicipioDTO.getCodigoMunicipio()));
		incluirAlterarMunicipio.setCodigoTipoServico(Integer.valueOf(incluirMunicipioDTO.getCodigoTipoServico()));
		incluirAlterarMunicipio.setCodigoTributo(Integer.valueOf(incluirMunicipioDTO.getCodigoTributo()));
		incluirAlterarMunicipio.setDataFinalVigencia(incluirMunicipioDTO.getDataFinalVigenciaConta().replace("/", "."));
		incluirAlterarMunicipio.setDataInicioVigencia(incluirMunicipioDTO.getDataInicioVigenciaConta().replace("/", "."));
		String conta[] = incluirMunicipioDTO.getCodigoConta().split("-");
		incluirAlterarMunicipio.setConta(Integer.valueOf(conta[0].trim()));
		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IIncluirAlterarContasMunicipioPDCAdapter alterarMunicipioPDCAdapter = factoryAdapter.getIncluirAlterarContasMunicipioPDCAdapter();
		IncluirAlterarContasMunicipioResponse lResponse = alterarMunicipioPDCAdapter.invokeProcess(incluirAlterarMunicipio);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		detMunicipioDTORetorno.setCodigoErro(lResponse.getCodMensagem());
		detMunicipioDTORetorno.setMensagemErro(lResponse.getMensagem());

		return detMunicipioDTORetorno;

	}
	
	public String atualizarAliquota(Integer codTipoServico, Long codMunicipio, String aliquota) throws PdcAdapterException, MunicipioServiceException {
		AtualizarAliquotaRequest request = new AtualizarAliquotaRequest();
		AtualizarAliquotaResponse response = null;
		
		request.setAliquota(Double.valueOf(aliquota.replace(",", ".")));
		request.setCodMunicipio(codMunicipio);
		request.setCodTipoServico(codTipoServico);

		/*************************** INVOCA PROCESSO PDC ****************************/

		response = factoryAdapter.getAtualizarAliquotaPDCAdapter().invokeProcess(request);

		/*************************** RESULTADO DA CONSULTA **************************/

		return response.getMensagem();

	}
	
	public List<ResultMunicipiosNovosDTO> listarMunicipiosNovosAll(Long codMunicipio, Integer codUF, Integer tipoPesquisa)  {

		List<ResultMunicipiosNovosDTO> listaMunicipiosNovos = new ArrayList<ResultMunicipiosNovosDTO>();
		ListarMunicipiosNovosAllRequest lRequest = new ListarMunicipiosNovosAllRequest();
		lRequest.setQtdeOcorrencias(IResultMunNovoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setCodUF(codUF);
		lRequest.setTipoPesquisa(tipoPesquisa);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarMunicipiosNovosAllPDCAdapter listaMunicipiosNovosPDCAdapter = factoryAdapter.getListarMunicipiosNovosAllPDCAdapter();
		ListarMunicipiosNovosAllResponse lResponse = listaMunicipiosNovosPDCAdapter.invokeProcess(lRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		int cont = 0;

		for (int i = 0; i < lResponse.getOcorrenciasMunicipioNovosCount(); i++) {
			ResultMunicipiosNovosDTO municipioNovosLista = new ResultMunicipiosNovosDTO();

			municipioNovosLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipioNovos(i).getCodMunicipio()));
			municipioNovosLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipioNovos(i).getDescMunicipio()));
			municipioNovosLista.setUf(String.valueOf(lResponse.getOcorrenciasMunicipioNovos(i).getUf()));
			municipioNovosLista.setTipoPesquisa(lResponse.getOcorrenciasMunicipioNovos(i).getTipoPesquisa());
			municipioNovosLista.setLinha(cont++);

			listaMunicipiosNovos.add(municipioNovosLista);
		}

		return listaMunicipiosNovos;
	}
	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarListaMunicipioTXT(List<ResultMunicipiosNovosDTO> listaMunicipios, OutputStream outputStream) throws DocumentException, ReportException, IOException {
		new ResultMunNovosReportTXT(listaMunicipios,outputStream).gerar();
	}

	public List<HistoricoMunicipioDTO> listarMunicipiosSemConvenio(String codigoUf, BuscaMunicipioBean municipio) {
		
		List<HistoricoMunicipioDTO> listaMunicipios = new ArrayList<HistoricoMunicipioDTO>();
		ListarMunicipiosSemConvenioRequest lRequest = new ListarMunicipiosSemConvenioRequest();
		HistoricoMunicipioDTO obj = new HistoricoMunicipioDTO();
		
		int contador = 0;
		
		lRequest.setQtdeOcorr(1);
		lRequest.setCodUf(!GissUtil.isEmptyOrNull(codigoUf) ? Long.parseLong(codigoUf) : Long.parseLong("0"));
		lRequest.setCodMunicipio(!GissUtil.isEmptyOrNull(municipio.getCodigo()) ? municipio.getCodigo() : Long.parseLong("0"));

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarMunicipiosSemConvenioPDCAdapter listarMunicipioSemConvenioPDCAdapter = factoryAdapter.getListarMunicipiosSemConvenioPDCAdapter();
		ListarMunicipiosSemConvenioResponse lResponse = listarMunicipioSemConvenioPDCAdapter.invokeProcess(lRequest);

		for(ListaSaida retorno : lResponse.getListaSaida()){
			
			obj = new HistoricoMunicipioDTO();
			obj.setId(Long.valueOf(contador));
			obj.setCodigo(String.valueOf(retorno.getCodMunicipio()));
			obj.setDescricao(retorno.getDescMunicipio());
			obj.setUf(retorno.getUf());
			obj.setData(GissUtil.formataDataTimeStamp(retorno.getDataHoraManut()));
			obj.setHora(GissUtil.formataHoraTimeStamp(retorno.getDataHoraManut()));
			obj.setCodigoFuncional(retorno.getCodUsuarioManut());
			obj.setFlagSituacaoMunicipio(String.valueOf(retorno.getCodSitMunicipio()));
			obj.setCodFlagSituacao(String.valueOf(retorno.getCodSitMunicipio()));
			
			if(obj.getFlagSituacaoMunicipio()) {
				obj.setItemSelecionadoCheckLista(Boolean.TRUE);
			}
			
			listaMunicipios.add(obj);
			
			contador++;
		}
	
		return listaMunicipios;
	}

	public String incluirMunicipiosSemConvenio(List<HistoricoMunicipioDTO> listaMunicipios) {
		
		EfetivaSelecMunicipiosSemConvRequest lRequest = new EfetivaSelecMunicipiosSemConvRequest();
		
		int quantidade = 300;
		
		lRequest.setQtdeOcor(300);
		ListaEntrada[] ocorrencias = new ListaEntrada[quantidade]; 
		
		for (int i = 0; i < quantidade; i++) {		
			ListaEntrada objEntrada = new ListaEntrada();
			
			if(i < listaMunicipios.size()){
				objEntrada.setCmun(!GissUtil.isEmptyOrNull(listaMunicipios.get(i).getCodigo()) ? Long.parseLong(listaMunicipios.get(i).getCodigo()) : Long.parseLong("0"));
				objEntrada.setAtivDesatv(listaMunicipios.get(i).getItemSelecionadoCheckLista() == true ? 1 : 0);
			}
			
			else{
				objEntrada.setCmun(0);
				objEntrada.setAtivDesatv(0);
			}
			
			ocorrencias[i] = objEntrada;
		}

		lRequest.setListaEntrada(ocorrencias);
		
		IEfetivaSelecMunicipiosSemConvPDCAdapter efetivaSelecMunicipiosSemConvPDCAdapter = factoryAdapter.getEfetivaSelecMunicipiosSemConvPDCAdapter();
		EfetivaSelecMunicipiosSemConvResponse lResponse = efetivaSelecMunicipiosSemConvPDCAdapter.invokeProcess(lRequest);
		
		return lResponse.getCodMensagem() + " - " + lResponse.getMensagem();
	}

}
