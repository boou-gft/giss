/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/depmunicipio/impl/DepMunicipioServiceImpl.java,v $
 * $Id: DepMunicipioServiceImpl.java,v 1.7 2018/05/04 10:29:44 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: DepMunicipioServiceImpl.java,v $
 * Revision 1.7  2018/05/04 10:29:44  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/30 23:31:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/02/19 12:53:02  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/12/18 10:46:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/11/06 11:39:53  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:12:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:50  gmichelini
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
 
package br.com.bradesco.web.giss.service.business.depmunicipio.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.depmunicipio.IDepMunicipioService;
import br.com.bradesco.web.giss.service.business.depmunicipio.IDepMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.DependenciaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.depmunicipio.exceptions.DepMunicipioServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.IListarDependenciasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.ListarDependenciasMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
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
 * Implementação do adaptador: Depmunicipio
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class DepMunicipioServiceImpl implements IDepMunicipioService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public DepMunicipioServiceImpl() {
        // TODO: Implementação
    }
    
    /**
     * Método de exemplo.
     *
     * @see br.com.bradesco.web.giss.service.business.depmunicipio.IDepmunicipio#sampleDepmunicipio()
     */
    public void sampleDepmunicipio() {
        // TODO: Implementaçao
    }
    
    
    public List<SelectItem> listarComboEstados() throws PdcAdapterException, DepMunicipioServiceException {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IDepMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IDepMunicipioServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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
    
    
    
    public List<MunicipioDTO> listaGridDependenciaMunicipio(int codigoUnidadeFederativa, Long codMunicipio) throws PdcAdapterException, DepMunicipioServiceException {

		MunicipioDTO dependeciaMunicipio;		
		List<MunicipioDTO> MunicipioisList = new ArrayList<MunicipioDTO>();

			ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
			lRequest.setCodUF(codigoUnidadeFederativa);
			lRequest.setQtdeRegistros(IDepMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
			lRequest.setCodMunicipio(codMunicipio);

			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/

			IListarMunicipiosPDCAdapter dependenciaMunicipioPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
			ListarMunicipiosResponse lResponse = dependenciaMunicipioPDCAdapter.invokeProcess(lRequest);

			int cont = 0;

			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/

			for (int i = 0; i < lResponse.getQtdeReg(); i++) {
				dependeciaMunicipio = new MunicipioDTO();				
				dependeciaMunicipio.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
				dependeciaMunicipio.setNome(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio());
				dependeciaMunicipio.setLinha(cont++);
				dependeciaMunicipio.setUnidadeFederativa(lResponse.getOcorrenciasMunicipios(i).getSiglaUF());
				MunicipioisList.add(dependeciaMunicipio);
			}

		return MunicipioisList;

	}
    
    
    
    public DependenciaMunicipioDTO listarDependenciaMunicipioResultado(int codigoMunicipio) throws PdcAdapterException, DepMunicipioServiceException {

    	DependenciaMunicipioDTO dependeciaMunicipio;		
		List<DependenciaMunicipioDTO> lstMunicipios = new ArrayList<DependenciaMunicipioDTO>();
		DependenciaMunicipioDTO dependenciaMunicipio = new DependenciaMunicipioDTO();

			ListarDependenciasMunicipioRequest lRequest = new ListarDependenciasMunicipioRequest();		
			lRequest.setCodMunicipio(codigoMunicipio);
			lRequest.setCodDependencia(0);
			lRequest.setCodPessoaJuridica(0);
			lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
			lRequest.setQtdDependenciasAtivas(0);
			lRequest.setQtdDependenciasEncer(0);
			
			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/

			IListarDependenciasMunicipioPDCAdapter dependenciaMunicipioPDCAdapter = factoryAdapter.getListarDependenciasMunicipioPDCAdapter();
			ListarDependenciasMunicipioResponse lResponse = dependenciaMunicipioPDCAdapter.invokeProcess(lRequest);


			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/

			int qtdeDependenciasAtivas = 0;
			int qtdeDependenciasEncerradas = 0;
			
			for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
				dependeciaMunicipio = new DependenciaMunicipioDTO();				
				if(lResponse.getOcorrencias(i).getCodDependencia() != 0){
					dependeciaMunicipio.setCodigoDependencia(GissUtil.preencherZerosAEsquerda(String.valueOf(lResponse.getOcorrencias(i).getCodDependencia()), 5));
					dependeciaMunicipio.setDescricaoDependencia((lResponse.getOcorrencias(i).getDescDependencia()));
					dependeciaMunicipio.setSituacaoDependencia(lResponse.getOcorrencias(i).getSituacaoDepend());
					dependeciaMunicipio.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrencias(i).getCodPessoaJuridica()));
					dependeciaMunicipio.setNumeroSequenciaDependencia(String.valueOf(lResponse.getOcorrencias(i).getNumSeqPessoaJuridica()));
					dependeciaMunicipio.setDataAtualizacao(String.valueOf(lResponse.getOcorrencias(i).getDataAtualizacao()));
				
					if("ATIVA".equals(dependeciaMunicipio.getSituacaoDependencia())){
						qtdeDependenciasAtivas++;
					}
					else if("ENCERRADA".equals(dependeciaMunicipio.getSituacaoDependencia())){
						qtdeDependenciasEncerradas++;
					}
				
					lstMunicipios.add(dependeciaMunicipio);
				}
			}
			Collections.sort(lstMunicipios);

			dependenciaMunicipio.setLstMunicipios(lstMunicipios);
			dependenciaMunicipio.setQtdeDependenciasAtivas(qtdeDependenciasAtivas);
			dependenciaMunicipio.setQtdeDependenciasEncerradas(qtdeDependenciasEncerradas);
			
		return dependenciaMunicipio;

	}
    
    public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
}

