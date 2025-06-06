package br.com.bradesco.web.giss.service.business.issitemservicolc.impl;

import java.text.ParseException;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issitemservicolc.IItemServicoLCISSService;
import br.com.bradesco.web.giss.service.business.issitemservicolc.bean.ItemServicoLcISSDTO;
import br.com.bradesco.web.giss.service.business.issitemservicolc.exceptions.ItemLcISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest;
import br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.response.AlterarItemComplementarResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.request.DetalharHistoricoItemLeiComplRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.response.ExcluirItemComplementarResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.response.IncluirItemComplementarResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.request.ListarHistoricoItemLeiComplRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListarItemComplementarResponse;
import br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest;
import br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.response.ReativarItemServicoLcResponse;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ItemServicoLcISSServiceImpl implements IItemServicoLCISSService {
	private FactoryAdapter factoryAdapter;

	/**
	 * @return the factoryAdapter
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	
	public void ListaItemLC(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException {
		
		ListarItemComplementarRequest request = new ListarItemComplementarRequest();
		
		request.setItemLeiCompl(GissUtil.notNull(dto.getCodItemLc()));
		request.setStatus(GissUtil.notNull(dto.getStatus()));
		
		ListarItemComplementarResponse response = factoryAdapter.getListarItemComplementarPDCAdapter().invokeProcess(request);
		
		int numConsul = 0;
		for (int i = 0; i < response.getListaItemComplementarCount(); i++) {
			ItemServicoLcISSDTO dtoLocal = new ItemServicoLcISSDTO();
			if(response.getListaItemComplementar(i).getItemItemCompl() != 0){
				dtoLocal.setCodItemLc(response.getListaItemComplementar(i).getItemItemCompl());
				String itemLeiFormatado = GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaItemComplementar(i).getItemItemCompl()), 8);
				dtoLocal.setCodItemLcFormatado(GissUtil.mascaraItemLei(itemLeiFormatado));
				dtoLocal.setDescItemLc(response.getListaItemComplementar(i).getDescItemCompl());
				dtoLocal.setStatus(response.getListaItemComplementar(i).getStatus());
				dtoLocal.setNumConsul(numConsul++);
				dto.getLista().add(dtoLocal);
			}
		}
	}

	public void ListaItemLCHistorico(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException {
		
		ListarHistoricoItemLeiComplRequest request = new ListarHistoricoItemLeiComplRequest();
		
		request.setCodItemLei(GissUtil.notNull(dto.getCodItemLc()));

		ListarHistoricoItemLeiComplResponse response = factoryAdapter.getListarHistoricoItemLeiComplPDCAdapter().invokeProcess(request);

		int numConsul = 0;
		for (int i = 0; i < response.getListaHistoricoItemLeiCount(); i++) {
			ItemServicoLcISSDTO dtoLocal = new ItemServicoLcISSDTO();
			if(response.getListaHistoricoItemLei(i).getCodItemLei() != 0){
				dtoLocal.setCodItemLc(response.getListaHistoricoItemLei(i).getCodItemLei());
				dtoLocal.setCodItemLcFormatado(GissUtil.mascaraItemLei(GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaHistoricoItemLei(i).getCodItemLei()), 8)));
				dtoLocal.setDescItemLc(response.getListaHistoricoItemLei(i).getDescItemLei());
				dtoLocal.setStatus(response.getListaHistoricoItemLei(i).getStatus());
				dtoLocal.setDataHoraManutencao(response.getListaHistoricoItemLei(i).getDataHoraManutencao());
				dtoLocal.setDataHoraManutencaoFormatada(GissUtil.converteTimeStampCompleto(response.getListaHistoricoItemLei(i).getDataHoraManutencao()));
				dtoLocal.setCodFuncional(response.getListaHistoricoItemLei(i).getCodUsuarioManutencao());
				dtoLocal.setNumConsul(numConsul++);
				dto.getLista().add(dtoLocal);
			}
		}
	}
	
	public ItemServicoLcISSDTO detalharHistorico(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException, IndexOutOfBoundsException, ParseException {
		
		DetalharHistoricoItemLeiComplRequest request = new DetalharHistoricoItemLeiComplRequest();
		
		request.setCodItemLei(GissUtil.notNull(dto.getCodItemLc()));
		request.setDataHoraManutencao(GissUtil.notNull(dto.getDataHoraManutencao()));

		DetalharHistoricoItemLeiComplResponse response = factoryAdapter.getDetalharHistoricoItemLeiComplPDCAdapter().invokeProcess(request);
		ItemServicoLcISSDTO dtoLocal = new ItemServicoLcISSDTO(); 
		dtoLocal.setCodItemLc(response.getListaDetItemLeiCompl(0).getCodItemLei());
		dtoLocal.setCodItemLcFormatado(GissUtil.mascaraItemLei(GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaDetItemLeiCompl(0).getCodItemLei()), 8)));
		dtoLocal.setCodIndTipoManutencao(response.getListaDetItemLeiCompl(0).getCodIndTipoManutencao());
		dtoLocal.setDescItemLc(response.getListaDetItemLeiCompl(0).getDescItemLei());
		dtoLocal.setDataInicioVigencia(response.getListaDetItemLeiCompl(0).getDataInicioVigencia().replaceAll("\\.", "/"));
		dtoLocal.setDataFimVigencia(response.getListaDetItemLeiCompl(0).getDataFimVigencia().replaceAll("\\.", "/"));
		dtoLocal.setCodFuncional(response.getListaDetItemLeiCompl(0).getCodUsuarioManutencao());
		dtoLocal.setDataHoraManutencao(GissUtil.converteTimeStampCompleto(response.getListaDetItemLeiCompl(0).getDataHoraManutencao()));
		
		if(response.getQtdeOcorrencias() > 1){
			dtoLocal.setCodItemLcAnterior(response.getListaDetItemLeiCompl(1).getCodItemLei());
			dtoLocal.setCodItemLcFormatadoAnterior(GissUtil.mascaraItemLei(GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaDetItemLeiCompl(1).getCodItemLei()), 8)));
			dtoLocal.setCodIndTipoManutencaoAnterior(response.getListaDetItemLeiCompl(1).getCodIndTipoManutencao());
			dtoLocal.setDescItemLcAnterior(response.getListaDetItemLeiCompl(1).getDescItemLei());
			dtoLocal.setDataInicioVigenciaAnterior(response.getListaDetItemLeiCompl(1).getDataInicioVigencia().replaceAll("\\.", "/"));
			dtoLocal.setDataFimVigenciaAnterior(response.getListaDetItemLeiCompl(1).getDataFimVigencia().replaceAll("\\.", "/"));
			dtoLocal.setCodFuncionalAnterior(response.getListaDetItemLeiCompl(1).getCodUsuarioManutencao());
			dtoLocal.setDataHoraManutencaoAnterior(GissUtil.converteTimeStampCompleto(response.getListaDetItemLeiCompl(1).getDataHoraManutencao()));
			
		}else{
			dtoLocal.setCodItemLcAnterior(0);
			dtoLocal.setCodItemLcFormatadoAnterior("");
			dtoLocal.setCodIndTipoManutencaoAnterior("");
			dtoLocal.setDescItemLcAnterior("");
			dtoLocal.setDataInicioVigenciaAnterior("");
			dtoLocal.setDataFimVigenciaAnterior("");
			dtoLocal.setCodFuncionalAnterior("");
			dtoLocal.setDataHoraManutencaoAnterior("");
		}
		
		return dtoLocal;
	}
	
	public String incluirItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException{
		
		IncluirItemComplementarRequest request = new IncluirItemComplementarRequest();
		long codMunicipio = 0l;
		String msg = "";
		do{
			request.setCodItemLC(Integer.valueOf(GissUtil.notNull(dto.getCodItemLcFormatado()).replace(".", "")));
			request.setDecItemLC(GissUtil.notNull(dto.getDescItemLc()));
			request.setCodMunicipio(codMunicipio);
			
			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/
			IncluirItemComplementarResponse response = factoryAdapter.getIncluirItemComplementarPDCAdapter().invokeProcess(request);
			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/
	
			response.setCodMensagem(response.getCodMensagem());
			response.setMensagem(response.getMensagem());
			codMunicipio = response.getCodMunicipio();
			msg = response.getCodMensagem() + " - " + response.getMensagem();
		}while(codMunicipio != 0l);
		return msg;
		
	}
	
	
	public String alterarItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException{
		
		AlterarItemComplementarRequest request = new AlterarItemComplementarRequest();
		
		request.setCodItemLC(Integer.valueOf(GissUtil.notNull(dto.getCodItemLcFormatado()).replace(".", "")));
		request.setDescItemLC(GissUtil.notNull(dto.getDescItemLc()));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		AlterarItemComplementarResponse response = factoryAdapter.getAlterarItemComplementarPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
		
	}
	
	public String reativarItemDaLeiCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException{
	
		ReativarItemServicoLcRequest request = new ReativarItemServicoLcRequest();
		request.setCodItemLeiCompl(GissUtil.notNull(dto.getCodItemLc()));

		ReativarItemServicoLcResponse response = factoryAdapter.getReativarItemServicoLcPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	
	
	public String ExcluirItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException{

		ExcluirItemComplementarRequest request = new ExcluirItemComplementarRequest();
		ListaItemComplementar[] lista = new ListaItemComplementar[100];
		for (int i = 0; i < 100; i++) {
			ListaItemComplementar item = new ListaItemComplementar();
			if (i < dto.getLista().size()) {
				item.setCodItemLei(GissUtil.notNull(dto.getLista().get(i).getCodItemLc()));
			}else {
				item.setCodItemLei(0);
			}
			lista[i] = item;
		}
		request.setListaItemComplementar(lista);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		ExcluirItemComplementarResponse response = factoryAdapter.getExcluirItemComplementarPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	

	
}
