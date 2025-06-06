package br.com.bradesco.web.giss.service.business.issrelatorio.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.IRelatorioISSService;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.HistoricoTransacoesRecusadasISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioSaidaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.exceptions.RelatorioISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.response.GerarRelatoriosAliquotasResponse;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.response.GerarRelHistTransacoesResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.issgerencial.relatorioapuracao.RelatorioApuracaoReportTXT;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

import com.lowagie.text.DocumentException;

public class RelatorioISSServiceImpl implements IRelatorioISSService{
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
	
	public String gerarRelatorio(RelatorioISSDTO dto) throws PdcAdapterException, RelatorioISSServiceException {

		GerarRelatorioApuracaoRequest request = new GerarRelatorioApuracaoRequest();
		ListaMunicipios[] listaMun = new ListaMunicipios[50];
		ListaMunicipios itemMun = new ListaMunicipios();
		ListaEmpresa[] listaEmp = new ListaEmpresa[15];
		ListaEmpresa itemEmp = new ListaEmpresa();
		String data = "";
		
		data = GissUtil.verificaStringNulaInteger(dto.getAnoPeriodoInicial())+ GissUtil.preencherZerosAEsquerda(GissUtil.notNull(dto.getMesPeriodoInicial()),2);
		request.setDtMesAnoInicio(GissUtil.verificaStringNulaInteger(data));
		
		data = GissUtil.verificaStringNulaInteger(dto.getAnoPeriodoFinal())+ GissUtil.preencherZerosAEsquerda(GissUtil.notNull(dto.getMesPeriodoFinal()),2);
		request.setDtMesAnoFim(GissUtil.verificaStringNulaInteger(data)) ;
		
		request.setQtdeOcorrencias(dto.getListaMunicipio().size());
		for (int i = 0; i < 50; i++) {
			itemMun = new ListaMunicipios();
			if (i < dto.getListaMunicipio().size()) {
				itemMun.setCodMunicipio(GissUtil.notNull(dto.getListaMunicipio().get(i).getCodMunicipio()));
			}else{
				itemMun.setCodMunicipio(0);
			}
			listaMun[i] = itemMun;
		}
		request.setListaMunicipios(listaMun);
		
		for (int i = 0; i < 15; i++) {
			itemEmp = new ListaEmpresa();
			if (i < dto.getListaEmpresa().size()) {
				itemEmp.setCodEmpresa(GissUtil.notNull(dto.getListaEmpresa().get(i).getCodEmpresa()));
			}else{
				itemEmp.setCodEmpresa(0);
			}
			listaEmp[i] = itemEmp;
		}
		request.setListaEmpresa(listaEmp);
		request.setCodProduto(dto.getCodProduto());

		/* **************************
		 * INVOCA PROCESSO PDC * *************************
		 */
		GerarRelatorioApuracaoResponse response = factoryAdapter.getGerarRelatorioApuracaoPDCAdapter().invokeProcess(request);
		/* **************************
		 * RESULTADO DA CONSULTA * *************************
		 */
		RelatorioSaidaISSDTO item = new RelatorioSaidaISSDTO();
		for (int i = 0; i < response.getListaRelatorioApuracaoCount(); i++) {
			item = new RelatorioSaidaISSDTO();
			if (response.getListaRelatorioApuracao(i).getCodEmpresa() != 0l) {
				item.setCodEmpresa(response.getListaRelatorioApuracao(i).getCodEmpresa());
				item.setNomeEmpresa(response.getListaRelatorioApuracao(i).getDescEmpresa());
				item.setProduto(response.getListaRelatorioApuracao(i).getProduto());
				String dtMesAno = String.valueOf(response.getListaRelatorioApuracao(i).getDtMesAno());
				item.setDtMesAno(dtMesAno.substring(4, 6)+"/"+dtMesAno.substring(0, 4));
				item.setValorTotalCredito(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalCredito()));
				item.setValorTotalApuracao(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalApuracao()));
				item.setCodMunicipioPrestador(response.getListaRelatorioApuracao(i).getCodMunicipioPrestador());
				item.setDescMunicipioPrestador(response.getListaRelatorioApuracao(i).getCodMunicipioPrestador() + " - " +response.getListaRelatorioApuracao(i).getDescMunicipioPrestador());
				item.setSiglaUfPrestador(response.getListaRelatorioApuracao(i).getSiglaUfPrestador());
				item.setValorTotalReceitaPrestador(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalReceitaPrestador()));
				item.setPercentualAliquotaPrestador(NumberUtils.format(response.getListaRelatorioApuracao(i).getPercAliquotaPrestador()));
				item.setValorTotalApuracaoPrestador(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalApuracaoPresstador()));
				item.setCodMunicipioTomador(response.getListaRelatorioApuracao(i).getCodMunicipioTomador());
				item.setDescMunicipioTomador(response.getListaRelatorioApuracao(i).getCodMunicipioTomador() + " - " +response.getListaRelatorioApuracao(i).getDescMunicipioTomador());
				item.setSiglaUfTomador(response.getListaRelatorioApuracao(i).getSiglaUfTomador());
				item.setValorTotalReceitaTomador(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalReceitaTomador()));
				item.setPercentualAliquotaTomador(NumberUtils.format(response.getListaRelatorioApuracao(i).getPercAliquotaTomador()));
				item.setValorTotalApuracaoTomador(NumberUtils.format(response.getListaRelatorioApuracao(i).getValorTotalApuracaoTomador()));
				
				dto.getListaSaida().add(item);
			}
		}
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	
	public String gerarRelatoriosAliquotas(AliquotaISSDTO dto) throws PdcAdapterException, RelatorioISSServiceException {
		
		GerarRelatoriosAliquotasRequest request = new GerarRelatoriosAliquotasRequest();
		
		String dtAnoMesInicio = dto.getAnoPeriodoInicial() + dto.getMesPeriodoInicial();
		request.setDataInicioVigencia(GissUtil.notNull(Integer.valueOf(dtAnoMesInicio)));
		String dtAnoMesFinal = dto.getAnoPeriodoFinal() + dto.getMesPeriodoFinal();
		request.setDataFimVigencia(GissUtil.notNull(Integer.valueOf(dtAnoMesFinal)));
		request.setCodItemLeiComp(GissUtil.notNull(dto.getCodLeiCompl()));
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		
		GerarRelatoriosAliquotasResponse response = factoryAdapter.getGerarRelatoriosAliquotasPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
		
	}
	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarRelatorioApuracaoTXT(List<RelatorioSaidaISSDTO> lista, OutputStream outputStream) throws DocumentException, ReportException, IOException {
		new RelatorioApuracaoReportTXT(lista,outputStream).gerar();
	}
	
	public String gerarRelatorioHistoricoTransacoes(HistoricoTransacoesRecusadasISSDTO dto, Integer codEmpresaSelecionada) {
		
		GerarRelHistTransacoesRequest request = new GerarRelHistTransacoesRequest();
		

			String dtAnoMesInicio = dto.getAnoPeriodoInicial() + dto.getMesPeriodoInicial();
			String dtAnoMesFinal = dto.getAnoPeriodoFinal() + dto.getMesPeriodoFinal();
			
			request.setECompetIni(Integer.valueOf(dtAnoMesInicio));
			request.setECompetFim(Integer.valueOf(dtAnoMesFinal));
			request.setECodEmpresa(GissUtil.notNull(codEmpresaSelecionada));
			request.setECodMunicip(GissUtil.notNull(dto.getCodMunicipio()));
			request.setEFiller("");
			
		GerarRelHistTransacoesResponse response = factoryAdapter.getGerarRelHistTransacoesPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + 
		" - " + response.getMensagem();
		
	}

}
