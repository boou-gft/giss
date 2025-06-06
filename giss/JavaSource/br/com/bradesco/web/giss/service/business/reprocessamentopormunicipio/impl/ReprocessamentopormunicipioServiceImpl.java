/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/reprocessamentopormunicipio/impl/ReprocessamentopormunicipioServiceImpl.java,v $
 * $Id: ReprocessamentopormunicipioServiceImpl.java,v 1.6 2018/06/14 10:16:13 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ReprocessamentopormunicipioServiceImpl.java,v $
 * Revision 1.6  2018/06/14 10:16:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/06/06 17:08:58  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2017/12/18 10:46:17  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/12/14 17:46:44  gabrielmarani
 * *** empty log message ***
 *
 * Revision 1.2  2017/08/14 20:08:52  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:11:59  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:35  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.IReprocessamentoPorDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.OcorrenciaReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.IReprocessamentopormunicipioService;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.IReprocessamentopormunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioEntradaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.exceptions.TipoIncidenciaServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.response.ComboTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.IListarContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.IListarReprocessamentoPorMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.response.ListarReprocessamentoPorMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.response.SolicitarReprocessamentoPorMunicipioResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
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
 * Implementação do adaptador: Reprocessamentopormunicipio
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ReprocessamentopormunicipioServiceImpl implements IReprocessamentopormunicipioService {
	
	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ReprocessamentopormunicipioServiceImpl() {
        // TODO: Implementação
    }
    
    public List<SelectItem> listarComboEstados() {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IReprocessamentopormunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IReprocessamentopormunicipioServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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

	
	
	
    public List<SelectItem> listarComboTipoServico() throws PdcAdapterException, TipoIncidenciaServiceException {
		
		List<SelectItem> comboTipoSetvicoList = new ArrayList<SelectItem>();
		ComboTipoServicoRequest lRequest = new ComboTipoServicoRequest();		
		lRequest.setTipoServico(IReprocessamentoPorDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_TIPOINCIDENCIA);
		lRequest.setNumeroMaximoOcorrencia(IReprocessamentoPorDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_HISTORICO_TIPO_INCIDENCIA);

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
    
    
    
	
	public List<ReprocessamentoPorMunicipioDTO> listaMunicipioEstadoPeriodo(String codEstado, String dataInicial, String dataFinal) {
	
		
		List<ReprocessamentoPorMunicipioDTO> listaMunicipiosEstadoPeriodo = new ArrayList<ReprocessamentoPorMunicipioDTO>();
		ListarReprocessamentoPorMunicipioRequest IRequest = new ListarReprocessamentoPorMunicipioRequest();
		IRequest.setNumeroMaximoOcorrencias(IReprocessamentopormunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_ESTADO_PERIODO);
		IRequest.setCodigoEstado(Integer.parseInt(codEstado));
		IRequest.setDataInicialReprocessamento(dataInicial);
		IRequest.setDataFinalReprocessamento(dataFinal);
	
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
	
		IListarReprocessamentoPorMunicipioPDCAdapter listarMunicipiosPDCAdapter = factoryAdapter.getListarReprocessamentoPorMunicipioPDCAdapter();
		ListarReprocessamentoPorMunicipioResponse IResponse = listarMunicipiosPDCAdapter.invokeProcess(IRequest);
	

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		int cont = 0;
	
			for(int i = 0; i < IResponse.getNumeroConsultas(); i++){
				ReprocessamentoPorMunicipioDTO municipioLista = new ReprocessamentoPorMunicipioDTO();
				municipioLista.setItemRadio(cont++);
				municipioLista.setCodigo(String.valueOf(IResponse.getOcorrencias(i).getCodigoMunicipio()));
				municipioLista.setMunicipio(String.valueOf(IResponse.getOcorrencias(i).getDescricaoMunicipio()));
		
				listaMunicipiosEstadoPeriodo.add(municipioLista);
			}
			return listaMunicipiosEstadoPeriodo;
	}
    
    
	public List<ReprocessamentoPorMunicipioDTO> listarMunicipios(String codigoEstado) {
		
		List<ReprocessamentoPorMunicipioDTO> listaMunicipios = new ArrayList<ReprocessamentoPorMunicipioDTO>();
		
		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
		lRequest.setQtdeRegistros(IReprocessamentopormunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
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
			ReprocessamentoPorMunicipioDTO municipioLista = new ReprocessamentoPorMunicipioDTO();
			
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setMunicipio(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
			municipioLista.setItemRadio(cont++);
		
			listaMunicipios.add(municipioLista);
		}
		
		return listaMunicipios;
	}
    
    
    
    
	public List<ReprocessamentoMunicipioDTO> listarContasTipoServico(String municipio, String codTipoServico) {
		List<ReprocessamentoMunicipioDTO> listaMunicipiosConta = new ArrayList<ReprocessamentoMunicipioDTO>();
		ListarContasTipoServicoRequest lRequest = new ListarContasTipoServicoRequest();	
		
		GissUtil gissUtil = new GissUtil();
		
		lRequest.setNumeroMaximoOcorrencia(IReprocessamentopormunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);
		lRequest.setCodigoMunicipio(Long.parseLong(municipio));
		lRequest.setCodigoTipoServicoV(Integer.parseInt(codTipoServico));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarContasTipoServicoPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarContasTipoServicoPDCAdapter();
		ListarContasTipoServicoResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);
		
		 /* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencia(); i++) {
			ReprocessamentoMunicipioDTO contaDTO = new ReprocessamentoMunicipioDTO();
			contaDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContasTipoServico(i).getCodGrupo() , lResponse.getListaContasTipoServico(i).getCodSubGrupo()));
			contaDTO.setConta(lResponse.getListaContasTipoServico(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaContasTipoServico(i).getNumeroConta()),7)+"-"+ lResponse.getListaContasTipoServico(i).getDigitoConta());
			contaDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(lResponse.getListaContasTipoServico(i).getCodigoConta()),contaDTO.getRazao()));
			contaDTO.setDescricao(lResponse.getListaContasTipoServico(i).getDescricaoRazao());
			contaDTO.setAliquota(NumberUtils.format(lResponse.getListaContasTipoServico(i).getPercentualAliquota()));
			contaDTO.setRadioSelecionadoMunicipio(cont++);
			listaMunicipiosConta.add(contaDTO);
		}
		return listaMunicipiosConta;
	}
	
	public BasicSaidaDTO solicitarReprocessamentoPorMunicipio(ReprocessamentoPorMunicipioEntradaDTO entradaDTO) {
		SolicitarReprocessamentoPorMunicipioRequest request = new SolicitarReprocessamentoPorMunicipioRequest();
		request.setCriterioSelecao(entradaDTO.getCriterioSelecao().equals("T") ? "T" : " ");
		request.setCodigoEstado(entradaDTO.getCodEstado());
		request.setCompetenciaInicial(entradaDTO.getCompetenciaInicial());
		request.setCompetenciaFinal(entradaDTO.getCompetenciaFinal());
		request.setUsuario("");

		if (entradaDTO.getOcorrencias() == null || entradaDTO.getOcorrencias().isEmpty()) {
			Municipios o = new Municipios();
			o.setCodigoMunicipio(0);
			o.setCodigoGrupo(0);
			o.setCodigoSubgrupo(0);
			o.setPercAliquotaApuracaoEvtal(BigDecimal.ZERO);
			request.addMunicipios(o);
		} else {
			for (OcorrenciaReprocessamentoPorMunicipioDTO ocorr : entradaDTO.getOcorrencias()) {
				Municipios o = new Municipios();
				o.setCodigoMunicipio(ocorr.getCodigoMunicipio());
				o.setCodigoGrupo(ocorr.getCodigoGrupo());
				o.setCodigoSubgrupo(ocorr.getCodigoSubgrupo());
				o.setPercAliquotaApuracaoEvtal(ocorr.getAliquota());
				request.addMunicipios(o);
			}
		}

		for(int i = request.getMunicipiosCount(); i < 720; i++){
			Municipios o = new Municipios();
			o.setCodigoMunicipio(0);
			o.setCodigoGrupo(0);
			o.setCodigoSubgrupo(0);
			o.setPercAliquotaApuracaoEvtal(BigDecimal.ZERO);
			request.addMunicipios(o);
		}
		
		request.setTipoUsuario("");
		request.setUsuarioCanal("");
		request.setCodigoCanal(0);
		request.setTerminal("");
		
		SolicitarReprocessamentoPorMunicipioResponse response = getFactoryAdapter().getSolicitarReprocessamentoPorMunicipioPDCAdapter().invokeProcess(request);

		return new BasicSaidaDTO(response.getCodMensagem(), response.getMensagem());
	}
	
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
}

