package br.com.bradesco.web.giss.service.business.percentualTransicao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.percentualTransicao.IPercentualTransicaoService;
import br.com.bradesco.web.giss.service.business.percentualTransicao.bean.PercentualTransicaoDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.IAlterarPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.response.AlterarPercentualTransicaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.IExcluirPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.response.ExcluirPercentualTransicaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirpercentualtransicao.IIncluirPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirpercentualtransicao.request.IncluirPercentualTransicaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirpercentualtransicao.response.IncluirPercentualTransicaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.IListarPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.request.ListarPercentualTransicaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;

public class PercentualTransicaoServiceImpl implements IPercentualTransicaoService {
	private FactoryAdapter factoryAdapter;

	public List<PercentualTransicaoDTO> listar() {
		PercentualTransicaoDTO percentualDTO = null;
		List<PercentualTransicaoDTO> percentualList = new ArrayList<PercentualTransicaoDTO>();
		ListarPercentualTransicaoRequest request = new ListarPercentualTransicaoRequest();
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarPercentualTransicaoPDCAdapter listarPercentualTransicaoPDCAdapter = factoryAdapter.getListarPercentualTransicaoPDCAdapter();
		ListarPercentualTransicaoResponse response = listarPercentualTransicaoPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < response.getQtdeOcorr(); i++) {
			Saida saida = response.getSaida(i);
			percentualDTO = new PercentualTransicaoDTO();
			percentualDTO.setNumeroRegistro(saida.getNumParmDistrIss());
			percentualDTO.setPercentualMunicipioTomador(GissUtil.formatarCampoDeValorMonetario(saida.getPtgDistrIssTomador()));
			percentualDTO.setPercentualMunicipioPrestador(GissUtil.formatarCampoDeValorMonetario(saida.getPtgDistrIssPrestador()));
			percentualDTO.setDataInicioVigencia(DateUtils.convertDatePdc(saida.getDtIniVigencia()));
			percentualDTO.setDataFimVigencia(DateUtils.convertDatePdc(saida.getDtFimVigencia()));
			percentualDTO.setDataAlteracao(DateUtils.convertTimestampPdc(saida.getHrManutReg()));
			percentualDTO.setUsuario(saida.getCUsuarManut());
			percentualDTO.setIndicadorAprovacao(saida.getIndicadorAprov());
			percentualList.add(percentualDTO);
		}

		return percentualList;
	}

	public String incluir(PercentualTransicaoDTO dto) {
		IncluirPercentualTransicaoRequest request = new IncluirPercentualTransicaoRequest();
		request.setPtgDistrIssTomador(GissUtil.converteStringDouble(dto.getPercentualMunicipioTomador()));
		request.setPtgDistrIssPrestador(GissUtil.converteStringDouble(dto.getPercentualMunicipioPrestador()));
		request.setDtIniVigencia(DateUtils.formatPdc(dto.getDataInicioVigencia()));
		request.setDtFimVigencia(DateUtils.formatPdc(dto.getDataFimVigencia()));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IIncluirPercentualTransicaoPDCAdapter incluirPercentualTransicaoPDCAdapter = factoryAdapter.getIncluirPercentualTransicaoPDCAdapter();
		IncluirPercentualTransicaoResponse response = incluirPercentualTransicaoPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA INCLUSAO	*
		 * **************************/

		return response.getMensagem();
	}

	public String alterar(PercentualTransicaoDTO dto) {
		AlterarPercentualTransicaoRequest request = new AlterarPercentualTransicaoRequest();
		request.setNumParmDistrIss(dto.getNumeroRegistro());
		request.setPtgDistrIssTomador(GissUtil.converteStringDouble(dto.getPercentualMunicipioTomador()));
		request.setPtgDistrIssPrestador(GissUtil.converteStringDouble(dto.getPercentualMunicipioPrestador()));
		request.setDtIniVigencia(DateUtils.formatPdc(dto.getDataInicioVigencia()));
		request.setDtFimVigencia(DateUtils.formatPdc(dto.getDataFimVigencia()));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IAlterarPercentualTransicaoPDCAdapter alterarPercentualTransicaoPDCAdapter = factoryAdapter.getAlterarPercentualTransicaoPDCAdapter();
		AlterarPercentualTransicaoResponse response = alterarPercentualTransicaoPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA ALTERACAO	*
		 * **************************/

		return response.getMensagem();
	}

	public String excluir(PercentualTransicaoDTO dto) {
		ExcluirPercentualTransicaoRequest request = new ExcluirPercentualTransicaoRequest();
		request.setNumParmDistrIss(dto.getNumeroRegistro());
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IExcluirPercentualTransicaoPDCAdapter excluirPercentualTransicaoPDCAdapter = factoryAdapter.getExcluirPercentualTransicaoPDCAdapter();
		ExcluirPercentualTransicaoResponse response = excluirPercentualTransicaoPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA EXCLUSAO	*
		 * **************************/

		return response.getMensagem();
	}
	
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
}
