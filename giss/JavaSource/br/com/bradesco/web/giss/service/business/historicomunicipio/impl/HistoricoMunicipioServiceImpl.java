/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/historicomunicipio/impl/HistoricoMunicipioServiceImpl.java,v $
 * $Id: HistoricoMunicipioServiceImpl.java,v 1.9 2018/06/14 10:16:05 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: HistoricoMunicipioServiceImpl.java,v $
 * Revision 1.9  2018/06/14 10:16:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/06/06 17:08:51  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/04/06 14:01:43  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/03/12 11:23:51  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2017/08/25 13:57:54  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.4  2017/08/23 17:22:56  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.3  2017/08/14 20:08:32  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.2  2017/07/25 18:15:24  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:11:45  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:00  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:28  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.historicomunicipio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.historicomunicipio.IHistMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.historicomunicipio.IHistoricoMunicipioService;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.DetalheHistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistMunConResultadoDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioContasDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.exceptions.HistMunicipioServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.response.ComboTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarcontas.IConsultarContasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarcontas.request.ConsultarContasRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarcontas.response.ConsultarContasResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.IConsultarListaContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.request.ConsultarListaContasTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.IConsultarMunicipioTabelaHistoricoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.IListaHistMunicipioPorEstadoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.request.ListaHistMunicipioPorEstadoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.model.contacontabil.TipoServicoComboBean;
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
 * Implementação do adaptador: Historicomunicipio
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class HistoricoMunicipioServiceImpl implements IHistoricoMunicipioService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Método de exemplo.
	 *
	 * @see br.com.bradesco.web.giss.service.business.historicomunicipio.IHistoricomunicipio#sampleHistoricomunicipio()
	 */
	public void sampleHistoricomunicipio() {
		// TODO: Implementaçao
	}


	public List<SelectItem> listarComboEstados() throws PdcAdapterException, HistMunicipioServiceException {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IHistMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IHistMunicipioServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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

	public List<HistoricoMunicipioDTO> listaGriHistoricoMunicipio(int codigoUnidadeFederativa, Long codMunicipio) throws PdcAdapterException, HistMunicipioServiceException {

		HistoricoMunicipioDTO historicoMunicipio;		
		List<HistoricoMunicipioDTO> historicoMunicipioList = new ArrayList<HistoricoMunicipioDTO>();

		ListaHistMunicipioPorEstadoRequest lRequest = new ListaHistMunicipioPorEstadoRequest();		
		lRequest.setCodUF(codigoUnidadeFederativa);
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setQtdeRegistro(IHistMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListaHistMunicipioPorEstadoPDCAdapter historicoMunicipioPDCAdapter = factoryAdapter.getListaHistMunicipioPorEstadoPDCAdapter();
		ListaHistMunicipioPorEstadoResponse lResponse = historicoMunicipioPDCAdapter.invokeProcess(lRequest);

		int cont = 0;

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		for (int i = 0; i < lResponse.getQtdeRegistros(); i++) {
			historicoMunicipio = new HistoricoMunicipioDTO();				
			historicoMunicipio.setCodigo(String.valueOf(lResponse.getOcorrenciasHistMunicipio(i).getCodMunicipio()));
			historicoMunicipio.setDescricao(lResponse.getOcorrenciasHistMunicipio(i).getDescMunicipio());
			historicoMunicipio.setAtualizacao(lResponse.getOcorrenciasHistMunicipio(i).getDataAtualizacao().replace(".", "/"));
			historicoMunicipio.setHora(lResponse.getOcorrenciasHistMunicipio(i).getHoraAtualizacao());
			historicoMunicipio.setExclusao(lResponse.getOcorrenciasHistMunicipio(i).getDataExclusao().replace(".", "/"));
			historicoMunicipio.setHoraRegistroInclusao(lResponse.getOcorrenciasHistMunicipio(i).getHorainclusao());
			historicoMunicipio.setCodigoFuncional(lResponse.getOcorrenciasHistMunicipio(i).getCodigoFuncional());
			historicoMunicipio.setLinha(cont++);
			historicoMunicipioList.add(historicoMunicipio);
		}


		return historicoMunicipioList;

	}


	public DetalheHistoricoMunicipioDTO listaDetalheMunicipio(int codigoMunicipio, String timestamp) throws PdcAdapterException, HistMunicipioServiceException {

		DetalheHistoricoMunicipioDTO historicoMunicipio;		

		ConsultarMunicipioTabelaHistoricoRequest lRequest = new ConsultarMunicipioTabelaHistoricoRequest();		
		lRequest.setCodigoMunicipio(codigoMunicipio);
		lRequest.setTimeStamp(timestamp);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IConsultarMunicipioTabelaHistoricoPDCAdapter detalheHistoricoMunicipioPDCAdapter = factoryAdapter.getConsultarMunicipioTabelaHistoricoPDCAdapter();
		ConsultarMunicipioTabelaHistoricoResponse lResponse = detalheHistoricoMunicipioPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		historicoMunicipio = new DetalheHistoricoMunicipioDTO();				
		historicoMunicipio.setCodigoTipoIncidencia(String.valueOf(lResponse.getCodigoTipoIncidencia()));
		historicoMunicipio.setCodigoUorgResponsavel(String.valueOf(lResponse.getCodigoUorgResponsavel()));
		historicoMunicipio.setCodigoUorgResponsavelAnt(String.valueOf(lResponse.getCodigoUorgResponsavelAnt()));
		historicoMunicipio.setDiaVencimento(String.valueOf(lResponse.getDiaVencimento()));
		historicoMunicipio.setDiaVencimentoAnt(String.valueOf(lResponse.getDiaVencimentoAnt()));
		historicoMunicipio.setFormaPagamento(String.valueOf(lResponse.getFormaPagamento()));
		historicoMunicipio.setFormaPagamentoAnt(String.valueOf(lResponse.getFormaPagamentoAnt()));
		historicoMunicipio.setNomeEstadoResponsavel(String.valueOf(lResponse.getNomeEstadoResponsavel()));
		historicoMunicipio.setNomeIncidencia(String.valueOf(lResponse.getNomeIncidencia()));
		historicoMunicipio.setNomeIncidenciaAnt(String.valueOf(lResponse.getNomeIncidenciaAnt()));
		historicoMunicipio.setNomeUorgResponsavel(String.valueOf(lResponse.getNomeUorgResponsavel()));		
		historicoMunicipio.setNomeUorgResponsavelAnt(String.valueOf(lResponse.getNomeUorgResponsavelAnt()));		
		historicoMunicipio.setPagamentoDiaUtil(String.valueOf(lResponse.getPagamentoDiaUtil()));
		historicoMunicipio.setPagamentoDiaUtilAnt(String.valueOf(lResponse.getPagamentoDiaUtilAnt()));
		historicoMunicipio.setPercentAliquotaPadrao(String.valueOf(lResponse.getPercentAliquotaPadrao()));
		historicoMunicipio.setPercentAliquotaPadraoAnt(String.valueOf(lResponse.getPercentAliquotaPadraoAnt()));
		historicoMunicipio.setPercentBaseCalculo(String.valueOf(lResponse.getPercentBaseCalculo()));
		historicoMunicipio.setPercentBaseCalculoAnt(String.valueOf(lResponse.getPercentBaseCalculoAnt()));
		historicoMunicipio.setPercentualAliquotaMunicipio(String.valueOf(lResponse.getPercentualAliquotaMunicipio()));
		historicoMunicipio.setEstadoCentralizador(lResponse.getEstadoCentralizador());
		historicoMunicipio.setEstadoCentralizadorAnt(lResponse.getEstadoCentralizadorAnt());
		historicoMunicipio.setCodigoMunicipioCentralizador(String.valueOf(lResponse.getCodigoMunicipioCentralizador()));
		historicoMunicipio.setCodigoMunicipioCentralizadorAnt(String.valueOf(lResponse.getCodigoMunicipioCentralizadorAnt()));
		historicoMunicipio.setDescricaoMunicipioContralizador(lResponse.getDescricaoMunicipioCentralizador());
		historicoMunicipio.setDescricaoMunicipioContralizadorAnt(lResponse.getDescricaoMunicipioCentralizadorAnt());
		historicoMunicipio.setNroLei("" + lResponse.getCodigoLeiVigente());
		historicoMunicipio.setNroLeiAnt("" + lResponse.getCodigoLeiVigenteAnt());
		historicoMunicipio.setDescLei(lResponse.getDescLeiVigente());
		historicoMunicipio.setDescLeiAnt(lResponse.getDescLeiVigenteAnt());
		historicoMunicipio.setInfoComplementar(lResponse.getInformacaoComplementar());
		historicoMunicipio.setInfoComplementarAnt(lResponse.getInformacaoComplementarAnt());
		historicoMunicipio.setTipoAlteracao(String.valueOf(lResponse.getSaldoAlteracao()));
		historicoMunicipio.setDescricaoAnterior(lResponse.getSaldoAnterior());
		historicoMunicipio.setDescricaoAtual(lResponse.getSaldoAtual());
		
		return historicoMunicipio;

	}

	public List<SelectItem> listarComboTipoServico() throws PdcAdapterException, HistMunicipioServiceException {

		List<SelectItem> comboTipoSetvicoList = new ArrayList<SelectItem>();
		ComboTipoServicoRequest lRequest = new ComboTipoServicoRequest();		
		lRequest.setTipoServico(0);
		lRequest.setNumeroMaximoOcorrencia(99);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IComboTipoServicoPDCAdapter comboTipoServicoPDCAdapter = factoryAdapter.getComboTipoServicoPDCAdapter();
		ComboTipoServicoResponse lResponse = comboTipoServicoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			TipoServicoComboBean tipoServCombo = new TipoServicoComboBean();
			tipoServCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoServico()));
			tipoServCombo.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoServico());
			comboTipoSetvicoList.add(new SelectItem(tipoServCombo.getCodigo(),tipoServCombo.getCodigo() + " - " + tipoServCombo.getDescricao()));
		}

		return comboTipoSetvicoList;
	}
	
	public List<HistoricoMunicipioContasDTO> listaDetalheMunicipioResultado(int codigoMunicipio,int codigoServico) throws PdcAdapterException, HistMunicipioServiceException {

		HistoricoMunicipioContasDTO historicoMunicipio;		
		List <HistoricoMunicipioContasDTO> historicoMunicipioList = new ArrayList<HistoricoMunicipioContasDTO>();


		ConsultarListaContasTipoServicoRequest lRequest = new ConsultarListaContasTipoServicoRequest();		
		lRequest.setCodigoMunicipio(codigoMunicipio);
		lRequest.setNroMaxOcorrencias(IHistMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodigoTipoServico(codigoServico);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IConsultarListaContasTipoServicoPDCAdapter detalheHistoricoMunicipioPDCAdapter = factoryAdapter.getConsultarListaContasTipoServicoPDCAdapter();
		ConsultarListaContasTipoServicoResponse lResponse = detalheHistoricoMunicipioPDCAdapter.invokeProcess(lRequest);

		GissUtil gissUtil = new GissUtil();
		int cont=0;
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		for (int i = 0; i < lResponse.getNroConsultas(); i++) {
			historicoMunicipio = new HistoricoMunicipioContasDTO();
			historicoMunicipio.setCodigoTributo(String.valueOf(lResponse.getListaContasTpServ(i).getCodigoTributo()));
			historicoMunicipio.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContasTpServ(i).getCodigoGrupo() , lResponse.getListaContasTpServ(i).getCodigoSubgrupo()));
			historicoMunicipio.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getListaContasTpServ(i).getContaContabil()),historicoMunicipio.getRazao()));
			historicoMunicipio.setDescricaoDetalhe(String.valueOf(lResponse.getListaContasTpServ(i).getDescRazao()));
			historicoMunicipio.setConta(lResponse.getListaContasTpServ(i).getConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaContasTpServ(i).getConta()),7)+"-"+ lResponse.getListaContasTpServ(i).getDigConta());
			historicoMunicipio.setLinha(cont++);
			historicoMunicipioList.add(historicoMunicipio);
		}

		return historicoMunicipioList;

	}
	
	public List<HistMunConResultadoDTO> listaHistoricoMunicipioContaResultado(int codigoMunicipio, int grupo, int subGrupo) throws PdcAdapterException, HistMunicipioServiceException {

		HistMunConResultadoDTO historicoMunicipio;		
		List <HistMunConResultadoDTO> historicoMunicipioList = new ArrayList<HistMunConResultadoDTO>();


		ConsultarContasRequest lRequest = new ConsultarContasRequest();		
		lRequest.setCodigoMunicipio(codigoMunicipio);
		lRequest.setNroMaxOcorrencias(IHistMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodigoGrupo(grupo);
		lRequest.setCodigoSubgrupo(subGrupo);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IConsultarContasPDCAdapter detalheHistoricoMunicipioPDCAdapter = factoryAdapter.getConsultarContasPDCAdapter();
		ConsultarContasResponse lResponse = detalheHistoricoMunicipioPDCAdapter.invokeProcess(lRequest);

		int cont=0;
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			historicoMunicipio = new HistMunConResultadoDTO();
			historicoMunicipio.setAliquota(String.valueOf(lResponse.getOcorrencias(i).getAliquota()));
			historicoMunicipio.setInicio(lResponse.getOcorrencias(i).getDataInicioVigencia().replace(".", "/"));
			historicoMunicipio.setTermino(lResponse.getOcorrencias(i).getDataFimVigencia().replace(".", "/"));
			historicoMunicipio.setLinha(cont++);
			historicoMunicipioList.add(historicoMunicipio);
		}

		return historicoMunicipioList;

	}


	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

