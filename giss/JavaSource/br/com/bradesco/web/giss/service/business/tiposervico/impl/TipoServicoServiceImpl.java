/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	GISS
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/tiposervico/impl/TipoServicoServiceImpl.java,v $
 * $Id: TipoServicoServiceImpl.java,v 1.2 2017/07/25 18:15:29 gilbertocopoli Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: TipoServicoServiceImpl.java,v $
 * Revision 1.2  2017/07/25 18:15:29  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:13:27  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:40:52  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.tiposervico.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.tiposervico.ITipoServicoService;
import br.com.bradesco.web.giss.service.business.tiposervico.ITipoServicoServiceConstants;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.HistoricoTipoServicoDTO;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.TipoServicoDTO;
import br.com.bradesco.web.giss.service.business.tiposervico.exceptions.TipoServicoServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.IConsultarHistoricoTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.ConsultarHistoricoTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listartiposervico.IListarTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listartiposervico.request.ListarTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listartiposervico.response.ListarTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.mantertiposervico.IManterTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.mantertiposervico.request.ManterTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.mantertiposervico.response.ManterTipoServicoResponse;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: TipoServico
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class TipoServicoServiceImpl implements ITipoServicoService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public TipoServicoServiceImpl() {
		// TODO: Implementação
	}
	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoServico' e retorna uma lista de TipoServico
	 * 
	 * @return tipoServicoList
	 */
	public List<TipoServicoDTO> listaGridTipoServico() throws PdcAdapterException, TipoServicoServiceException {

		TipoServicoDTO tipoServico;
		List<TipoServicoDTO> tipoServicoList = new ArrayList<TipoServicoDTO>();
		ListarTipoServicoRequest lRequest = new ListarTipoServicoRequest();
		
		lRequest.setCodigotiposervico(ITipoServicoServiceConstants.COD_TIPOSERVICO_LISTA);
		lRequest.setDescricaotiposervico(ITipoServicoServiceConstants.DESCRICAO_TIPOSERVICO_LISTA);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarTipoServicoPDCAdapter tipoServicoPDCAdapter = factoryAdapter.getListarTipoServicoPDCAdapter();
		ListarTipoServicoResponse lResponse = tipoServicoPDCAdapter.invokeProcess(lRequest);

		int cont = 0;

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getNumeroocorrencias(); i++) {
			tipoServico = new TipoServicoDTO();
			tipoServico.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigotiposervico()));
			tipoServico.setDescricao(lResponse.getOcorrencias(i).getDescricaotiposervico());
			tipoServico.setDtAtualizacao(lResponse.getOcorrencias(i).getDataatualizacao());
			tipoServico.setNumeroRegistro(cont++);
			tipoServicoList.add(tipoServico);
		}

		return tipoServicoList;

	}
	
	/**
	 * Este método invoca o processo PDC 'giss.parametrizacao.listarTipoServico' e retorna uma lista de TipoServico
	 * 
	 * @return tipoServicoList
	 */
	public List<HistoricoTipoServicoDTO> listaHistoricoTipoServico(Date dataInicial, Date dataFinal) throws PdcAdapterException, TipoServicoServiceException {

		HistoricoTipoServicoDTO histTipoServico;
		List<HistoricoTipoServicoDTO> histTipoServicoList = new ArrayList<HistoricoTipoServicoDTO>();
		ConsultarHistoricoTipoServicoRequest lRequest = new ConsultarHistoricoTipoServicoRequest();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

		String dataIni = dateFormat.format(dataInicial);
		String dataFim = dateFormat.format(dataFinal);
		
		lRequest.setQuantidadeOcorrencias(ITipoServicoServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_HISTORICO_TIPO_SERVICO);
		lRequest.setDataInicial(Integer.valueOf(dataIni));
		lRequest.setDataFinal(Integer.valueOf(dataFim));

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarHistoricoTipoServicoPDCAdapter histTipoServicoPDCAdapter = factoryAdapter.getConsultarHistoricoTipoServicoPDCAdapter();
		ConsultarHistoricoTipoServicoResponse lResponse = histTipoServicoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			histTipoServico = new HistoricoTipoServicoDTO();
			histTipoServico.setTipo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoServico()));
			histTipoServico.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoServico());
			if(!lResponse.getOcorrencias(i).getDataAtualizacao().equals("0000000000"))
				histTipoServico.setAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/"));
			if(!lResponse.getOcorrencias(i).getDataExclusao().equals("0000000000"))
				histTipoServico.setExclusao(lResponse.getOcorrencias(i).getDataExclusao().replace(".", "/"));
			histTipoServico.setAlteracao(lResponse.getOcorrencias(i).getHoraAtualizacao());
			histTipoServico.setCodigoFuncional(lResponse.getOcorrencias(i).getCodigoFuncional());
			histTipoServicoList.add(histTipoServico);
		}

		return histTipoServicoList;

	}
	
	public TipoServicoDTO manterTipoServico(TipoServicoDTO tipoServicoDTO) throws PdcAdapterException, TipoServicoServiceException {
		
		TipoServicoDTO tipoServicoDTORetorno = new TipoServicoDTO();
		
		ManterTipoServicoRequest mantertiposervico = new ManterTipoServicoRequest();
		mantertiposervico.setCodigotiposervico(new Integer(tipoServicoDTO.getCodigo()));
		mantertiposervico.setDescricaotiposervico(tipoServicoDTO.getDescricao());
		mantertiposervico.setFuncao(tipoServicoDTO.getFuncao());
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IManterTipoServicoPDCAdapter manterTipoServicoPDCAdapter = factoryAdapter.getManterTipoServicoPDCAdapter();
		ManterTipoServicoResponse lResponse = manterTipoServicoPDCAdapter.invokeProcess(mantertiposervico);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		tipoServicoDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		tipoServicoDTORetorno.setMensagem(lResponse.getMensagem());
	
		return tipoServicoDTORetorno;

	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}
