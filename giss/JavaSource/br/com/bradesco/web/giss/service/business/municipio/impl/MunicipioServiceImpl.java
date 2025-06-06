/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/municipio/impl/MunicipioServiceImpl.java,v $
 * $Id: MunicipioServiceImpl.java,v 1.3 2017/12/18 10:46:14 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: MunicipioServiceImpl.java,v $
 * Revision 1.3  2017/12/18 10:46:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:13:27  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:10  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:34  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.municipio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.municipio.IMunicipioService;
import br.com.bradesco.web.giss.service.business.municipio.IMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.municipio.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.municipio.exceptions.MunicipioServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovos.request.ListarMunicipiosNovosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovos.response.ListarMunicipiosNovosResponse;
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
 * Implementação do adaptador: Mantermunicipio
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class MunicipioServiceImpl implements IMunicipioService{

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public MunicipioServiceImpl() {
		// TODO: Implementação
	}

	/**
	 * Método de exemplo.
	 *
	 * @see br.com.bradesco.web.giss.service.business.mantermunicipio.IMantermunicipio#sampleMantermunicipio()
	 */
	public void sampleMantermunicipio() {
		// TODO: Implementaçao
	}

	public List<SelectItem> listarComboEstados() throws PdcAdapterException, MunicipioServiceException {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IMunicipioServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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
	
	
	public List<MunicipioDTO> listaGridMunicipioNovos(String origem, Long codMunicipio, Integer codUF, Integer tipoPesquisa) throws PdcAdapterException, MunicipioServiceException {

		MunicipioDTO MunicipioNovos;		
		List<MunicipioDTO> MunicipioisList = new ArrayList<MunicipioDTO>();
		
		if(origem.equals(IMunicipioServiceConstants.ORIGEM_LISTA_MUNICIPIO_RESULTADO_NOVOS)){
			ListarMunicipiosNovosRequest lRequest = new ListarMunicipiosNovosRequest();		
			lRequest.setQtdeOcorrencias(IMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
			lRequest.setCodMunicipio(codMunicipio);
			lRequest.setCodUF(codUF);
			lRequest.setTipoPesquisa(tipoPesquisa);
	
			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/
			
			
			ListarMunicipiosNovosResponse lResponse = factoryAdapter.getListarMunicipiosNovosPDCAdapter().invokeProcess(lRequest);

			int cont = 0;

			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/

			for (int i = 0; i < lResponse.getQtdeRegistros(); i++) {
				MunicipioNovos = new MunicipioDTO();				
				MunicipioNovos.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipioNovos(i).getCodMunicipio()));
				MunicipioNovos.setNome(lResponse.getOcorrenciasMunicipioNovos(i).getDescMunicipio());
				MunicipioNovos.setLinha(cont++);
				MunicipioNovos.setUf(lResponse.getOcorrenciasMunicipioNovos(i).getUf());
				MunicipioNovos.setTipoPesquisa(lResponse.getOcorrenciasMunicipioNovos(i).getTipoPesquisa());
				MunicipioisList.add(MunicipioNovos);
			}

		}
		
		return MunicipioisList;
	}

	public List<MunicipioDTO> listaGridMunicipio(int codigoUnidadeFederativa, String origem, Long codMunicipio) throws PdcAdapterException, MunicipioServiceException {

		MunicipioDTO dependeciaMunicipio;		
		List<MunicipioDTO> MunicipioisList = new ArrayList<MunicipioDTO>();

		//se a origem for Manter Contas Contábeis lista
		if(origem.equals(IMunicipioServiceConstants.ORIGEM_LISTA_MUNICIPIO_DEPENDENCIA)){

			ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
			lRequest.setCodUF(codigoUnidadeFederativa);
			lRequest.setCodMunicipio(codMunicipio);
			lRequest.setQtdeRegistros(IMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);

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
				dependeciaMunicipio.setUf(null);
				MunicipioisList.add(dependeciaMunicipio);
			}

		}

		return MunicipioisList;

	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

