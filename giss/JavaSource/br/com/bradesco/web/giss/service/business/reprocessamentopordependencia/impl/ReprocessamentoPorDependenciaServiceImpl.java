/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/reprocessamentopordependencia/impl/ReprocessamentoPorDependenciaServiceImpl.java,v $
 * $Id: ReprocessamentoPorDependenciaServiceImpl.java,v 1.6 2018/06/14 10:16:05 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ReprocessamentoPorDependenciaServiceImpl.java,v $
 * Revision 1.6  2018/06/14 10:16:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/06/06 17:08:53  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2017/12/18 10:46:15  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/12/14 17:46:44  gabrielmarani
 * *** empty log message ***
 *
 * Revision 1.2  2017/08/14 20:09:08  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:12:11  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:02  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.IReprocessamentoPorDependenciaService;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.IReprocessamentoPorDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ContaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaProsseguirDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoPorDependenciaEntradaDTO;
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
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.IListarReprocessamentoDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.ListarReprocessamentoDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.response.SolicitarReprocessamentoPorDependenciaResponse;
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
 * Implementação do adaptador: ApuracaoAposFechamento
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ReprocessamentoPorDependenciaServiceImpl implements IReprocessamentoPorDependenciaService {
	
	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    
	public ReprocessamentoPorDependenciaServiceImpl() {
        // TODO: Implementação
    }
    
    public List<SelectItem> listarComboEstados() {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IReprocessamentoPorDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IReprocessamentoPorDependenciaServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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

    
    public List<ReprocessamentoDependenciaDTO> listarMunicipios(String codigoEstado) {
		
		List<ReprocessamentoDependenciaDTO> listaMunicipios = new ArrayList<ReprocessamentoDependenciaDTO>();
		
		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
		lRequest.setQtdeRegistros(IReprocessamentoPorDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
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
			ReprocessamentoDependenciaDTO municipioLista = new ReprocessamentoDependenciaDTO();
			
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
			municipioLista.setItemRadio(cont++);
			listaMunicipios.add(municipioLista);
		}	
		return listaMunicipios;
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
    
    
	public ReprocessamentoDependenciaAliquotaDTO listarReprocessamentoDependencia(String dataInicial, String dataFinal, String municipio) {
		
    	ListarReprocessamentoDependenciaRequest IRequest = new ListarReprocessamentoDependenciaRequest();
    	IRequest.setNumeroMaximoOcorrencias(IReprocessamentoPorDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS_NOVOS);    	
    	IRequest.setCodigoMunicipio(Integer.valueOf(municipio));
    	IRequest.setDataInicialReprocessamento(dataInicial);
    	IRequest.setDataFinalReprocessamento(dataFinal);
    	
    	/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
	
    	IListarReprocessamentoDependenciaPDCAdapter listarReprocessamentoDependenciaPDCAdapter = factoryAdapter.getListarReprocessamentoDependenciaPDCAdapter();
    	ListarReprocessamentoDependenciaResponse IResponse = listarReprocessamentoDependenciaPDCAdapter.invokeProcess(IRequest);			
		
    	/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/	
		
		ReprocessamentoDependenciaAliquotaDTO listaAliquota = new ReprocessamentoDependenciaAliquotaDTO();
		List<ReprocessamentoDependenciaProsseguirDTO> listaDependencia = new ArrayList<ReprocessamentoDependenciaProsseguirDTO>();
		listaAliquota.setAliquota(IResponse.getAliquotaPadraoMunicipio());
				
		for(int i = 0; i < IResponse.getOcorrenciasCount();i++){
			ReprocessamentoDependenciaProsseguirDTO dependenciaLista = new ReprocessamentoDependenciaProsseguirDTO();
			
			dependenciaLista.setDependencia(String.valueOf(IResponse.getOcorrencias(i).getCodigoDependencia()));
			dependenciaLista.setMunicipio(String.valueOf(IResponse.getOcorrencias(i).getDescricaoDependencia()));
			dependenciaLista.setCodigoPessoaJuridica(IResponse.getOcorrencias(i).getCodigoPessoaJuridica());
			dependenciaLista.setNumeroSequenciaUnidadeOrganizacional(IResponse.getOcorrencias(i).getNumeroSequenciaUnidadeOrganizacional());
			
			//dependenciaLista.setRadio(cont++);
			listaDependencia.add(dependenciaLista);		
		}
		listaAliquota.setListaDependenciaDTO(listaDependencia);
		return listaAliquota;

	}
	
	
	public List<ReprocessamentoMunicipioDTO> listarContasTipoServico(String municipio, String codTipoServico){
    	
    	List<ReprocessamentoMunicipioDTO> listaDependenciasConta = new ArrayList<ReprocessamentoMunicipioDTO>();
		ListarContasTipoServicoRequest lRequest = new ListarContasTipoServicoRequest();	
		
		GissUtil gissUtil = new GissUtil();
		
		lRequest.setNumeroMaximoOcorrencia(IReprocessamentoPorDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
		lRequest.setCodigoMunicipio(Long.parseLong(municipio));
		lRequest.setCodigoTipoServicoV(Integer.parseInt(codTipoServico));
		
		IListarContasTipoServicoPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarContasTipoServicoPDCAdapter();
		ListarContasTipoServicoResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);
		
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencia(); i++) {
			ReprocessamentoMunicipioDTO contaDTO = new ReprocessamentoMunicipioDTO();
			contaDTO.setCodigoConta(lResponse.getListaContasTipoServico(i).getCodigoConta());
			contaDTO.setDescricao(lResponse.getListaContasTipoServico(i).getDescricaoRazao());
			contaDTO.setAliquota(NumberUtils.format(lResponse.getListaContasTipoServico(i).getPercentualAliquota()));
			contaDTO.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContasTipoServico(i).getCodGrupo() , lResponse.getListaContasTipoServico(i).getCodSubGrupo()));
			contaDTO.setConta(lResponse.getListaContasTipoServico(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(lResponse.getListaContasTipoServico(i).getNumeroConta()),7)+"-"+ lResponse.getListaContasTipoServico(i).getDigitoConta());
			contaDTO.setCosif(GissUtil.mascaraContaContabil(lResponse.getListaContasTipoServico(i).getCodigoConta(), contaDTO.getRazao()));
			contaDTO.setRadioSelecionadoMunicipio(cont++);
			contaDTO.setContaSelecionada(false);
			listaDependenciasConta.add(contaDTO);
		}
		
		return listaDependenciasConta;
	}   
	
	public BasicSaidaDTO solicitarReprocessamentoPorDependencia(ReprocessamentoPorDependenciaEntradaDTO entradaDTO) {
		SolicitarReprocessamentoPorDependenciaRequest request = new SolicitarReprocessamentoPorDependenciaRequest();
		request.setCriterioSelecao(entradaDTO.getCriterioSelecao().equals("T") ? "T" : " ");
		request.setCompetenciaInicial(entradaDTO.getCompetenciaInicial());
		request.setCompetenciaFinal(entradaDTO.getCompetenciaFinal());
		request.setCodigoMunicipio(entradaDTO.getCodMunicipio());
		request.setUsuario("");

		if ("T".equals(entradaDTO.getCriterioSelecao())) {
			Dependencias d = new Dependencias();
			d.setCodigoPessoaJuridica(0);
			d.setNroSeqUndOrganizacional(0);
			request.addDependencias(d);
		} else {
			for (DependenciaDTO d : entradaDTO.getDependencias()) {
				Dependencias dep = new Dependencias();
				dep.setCodigoPessoaJuridica(d.getCodigoPessoaJuridica());
				dep.setNroSeqUndOrganizacional(d.getNumeroSequenciaUnidadeOrganizacional());
				request.addDependencias(dep);
			}
		}
		
		//Forçando a entrada ter no mínimo 100 registros
		for (int i = request.getDependenciasCount(); i < 100; i++) {
			Dependencias d = new Dependencias();
			d.setCodigoPessoaJuridica(0);
			d.setNroSeqUndOrganizacional(0);
			request.addDependencias(d);
		}

		if (entradaDTO.getContas() == null || entradaDTO.getContas().isEmpty()) {
			Aliquotas aliq = new Aliquotas();
			aliq.setCodigoGrupo(0);
			aliq.setCodigoSubgrupo(0);
			aliq.setPercAliquotaApuracaoEvtal(BigDecimal.ZERO);
			request.addAliquotas(aliq);
		} else {
			for (ContaDTO c : entradaDTO.getContas()) {
				Aliquotas aliq = new Aliquotas();
				aliq.setCodigoGrupo(c.getCodigoGrupo());
				aliq.setCodigoSubgrupo(c.getCodigoSubgrupo());
				aliq.setPercAliquotaApuracaoEvtal(c.getPercentualAliquota());
				request.addAliquotas(aliq);
			}
		}

		//Forçando a entrada ter no mínimo 100 registros
		for(int j = request.getAliquotasCount(); j < 50; j++){
			Aliquotas aliq = new Aliquotas();
			aliq.setCodigoGrupo(0);
			aliq.setCodigoSubgrupo(0);
			aliq.setPercAliquotaApuracaoEvtal(BigDecimal.ZERO);
			request.addAliquotas(aliq);
		}
		
		SolicitarReprocessamentoPorDependenciaResponse response = getFactoryAdapter().getSolicitarReprocessamentoPorDependenciaPDCAdapter().invokeProcess(request);

		return new BasicSaidaDTO(response.getCodMensagem(), response.getMensagem());
	}
	
    public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	
}

