package br.com.bradesco.web.giss.service.business.issaliquota.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issaliquota.IAliquotaISSService;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.exceptions.EmpresasISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.AlterarAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota;
import br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.response.AlterarAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.request.ConsultarAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.request.ConsultarInformacoesAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.response.ConsultarInformacoesAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota;
import br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse;
import br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest;
import br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.response.ParametrizarMinMaxAliquotaResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.issgerencial.coninfoaliquota.ConInfoAliquotaReportTXT;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

import com.lowagie.text.DocumentException;

public class AliquotaISSServiceImpl implements IAliquotaISSService{
	private FactoryAdapter factoryAdapter;

	public String alterarAliquota(List<AliquotaISSDTO> listAliquotas, String codUsuarioManutencao) throws PdcAdapterException, EmpresasISSServiceException {
		AlterarAliquotaRequest request = new AlterarAliquotaRequest(); 
		ListaAlterarAliquota[] listRequest = new ListaAlterarAliquota[100];
		
		for (int i = 0; i < 100; i++) {
			ListaAlterarAliquota ocorrencia = new ListaAlterarAliquota();
			AliquotaISSDTO item;
			if (i < listAliquotas.size()) {
				item = listAliquotas.get(i);
				ocorrencia.setCodMunicipio(item.getCodMunicipio());
				ocorrencia.setCodItemCompl(item.getCodLeiCompl());
				ocorrencia.setAliquotaApurcMinicipio(NumberUtils.convert(item.getAliquota()));
				ocorrencia.setDataInicioVigencia(item.getDataInicioVigencia());
			}else{
				ocorrencia.setCodMunicipio(0);
				ocorrencia.setCodItemCompl(0);
				ocorrencia.setAliquotaApurcMinicipio(new BigDecimal(0));
				ocorrencia.setDataInicioVigencia("");
			}
			
			listRequest[i] = ocorrencia;
		}
		
		request.setCodUsuarioManutencao(codUsuarioManutencao);
		request.setListaAlterarAliquota(listRequest);
		AlterarAliquotaResponse response = factoryAdapter.getAlterarAliquotaPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	
	public String incluirParamMinMaxAliquota(AliquotaISSDTO dto){
				
		ParametrizarMinMaxAliquotaRequest request = new ParametrizarMinMaxAliquotaRequest();
		
		request.setDataInicioVigencia(GissUtil.dateToString(dto.getDataIncioVigenciaAliquota(), GissUtil.FORMATO_DATA_SEM_HORA_PONTO));
		request.setPercentMinimoAliquota(NumberUtils.convert(GissUtil.notNull(dto.getPorcentAliquotaMin())));
		request.setPercentMaximoAliquota(NumberUtils.convert(GissUtil.notNull(dto.getPorcentAliquotaMax())));
	
		ParametrizarMinMaxAliquotaResponse response = factoryAdapter.getParametrizarMinMaxAliquotaPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
		
	}
	
	
	public void pesquisarVigencia(AliquotaISSDTO dto){
		
		ConsultarHistoricoMinMaxAliquotaRequest request = new ConsultarHistoricoMinMaxAliquotaRequest();
		AliquotaISSDTO item = new AliquotaISSDTO();
		dto.setLista(new ArrayList<AliquotaISSDTO>());
		
		request.setDataInicioVigencia(GissUtil.dateToString(dto.getDataIncioVigenciaAliquota(), GissUtil.FORMATO_DATA_SEM_HORA_PONTO));
		request.setDataFimVigencia(GissUtil.dateToString(dto.getDataFimVigenciaAliquota(), GissUtil.FORMATO_DATA_SEM_HORA_PONTO));
		
		ConsultarHistoricoMinMaxAliquotaResponse response = factoryAdapter.getConsultarHistoricoMinMaxAliquotaPDCAdapter().invokeProcess(request);
		for (int i = 0; i < response.getListaCount(); i++) {
			item = new AliquotaISSDTO();
			item.setNumParametro(response.getLista(i).getNumeroParametro());
			item.setPorcentAliquotaMin(NumberUtils.format(response.getLista(i).getPercentualMinimo(), "#,##0.0000"));
			item.setPorcentAliquotaMax(NumberUtils.format(response.getLista(i).getPercentualMaximo(), "#,##0.0000"));
			item.setDataInicioVigencia(GissUtil.formataDataMainframe(response.getLista(i).getDataInicioVigencia()));
			item.setDataFimVigencia(GissUtil.formataDataMainframe(response.getLista(i).getDataFimVigencia()));
			item.setUsuario(response.getLista(i).getUsuarioManutencao());
			item.setDataAlteracao(GissUtil.converteTimeStampCompleto(response.getLista(i).getDataHoraManutencao()));
			dto.getLista().add(item);
		}
	}
	
	
	public List<AliquotaISSDTO> consultarAliquota(Integer codUf, Long codMunicipio) throws PdcAdapterException, EmpresasISSServiceException {

		ConsultarAliquotaRequest request =  new ConsultarAliquotaRequest();
		request.setMaxOcorrencia(100);
		request.setCodUf(codUf);
		request.setCodMunicipio(codMunicipio);
		
		ConsultarAliquotaResponse response = factoryAdapter.getConsultarAliquotaPDCAdapter().invokeProcess(request);
		
		
		List<AliquotaISSDTO> listaAliqMunicipios = new ArrayList<AliquotaISSDTO>();
		
		for (int i = 0; i < response.getListaConsultarAliquotaCount(); i++) {
			ListaConsultarAliquota item = response.getListaConsultarAliquota(i);
			AliquotaISSDTO saida =  new AliquotaISSDTO();
			saida.setCodMunicipio(item.getCodMunicipio());
			saida.setDescMunicipio(item.getDescMunicipio());
			saida.setCodUf(item.getCodUf());
			saida.setSiglaUf(item.getSiglaUf());
			saida.setAliquota(NumberUtils.format(item.getAliquota()));
			listaAliqMunicipios.add(saida);
		}

		return listaAliqMunicipios;
	}

	public List<AliquotaISSDTO> listarLcAliquota(Long codMunicipio, Integer codItemLei) throws PdcAdapterException, EmpresasISSServiceException {
		ListarLcAliquotaRequest request = new ListarLcAliquotaRequest();
		request.setCodMunicipio(GissUtil.notNull(codMunicipio));
		request.setCodItemLei(GissUtil.notNull(codItemLei));
		
		ListarLcAliquotaResponse response = factoryAdapter.getListarLcAliquotaPDCAdapter().invokeProcess(request);
		
		
		List<AliquotaISSDTO> listaAliqMunicipios = new ArrayList<AliquotaISSDTO>();
		
		for (int i = 0; i < response.getListaLcAliquotaCount(); i++) {
			ListaLcAliquota item = response.getListaLcAliquota(i);
			AliquotaISSDTO saida =  new AliquotaISSDTO();
			saida.setCodMunicipio(item.getCodMunicipio());
			saida.setDataInicioVigencia(item.getDataInicioVigencia());
			saida.setAliquota(NumberUtils.format(item.getAliquota()));
			String itemServ = GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(item.getCodItemCompl())), 8);
			saida.setDescLeiCompl(GissUtil.mascaraItemLei(itemServ) + " - " + item.getDescItemCompl());
			saida.setCodLeiCompl(item.getCodItemCompl());
			listaAliqMunicipios.add(saida);
		}

		return listaAliqMunicipios;	
	}
	
	
	public void consultarInfosAliquota (AliquotaISSDTO dto){
		
		ConsultarInformacoesAliquotaRequest request = new ConsultarInformacoesAliquotaRequest();
		
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setCodItemLeiCompl(GissUtil.notNull(dto.getCodLeiCompl()));
		String dtAnoMesInicio = dto.getAnoPeriodoInicial() + dto.getMesPeriodoInicial();
		request.setDtInicioVigencia(GissUtil.notNull(Integer.valueOf(dtAnoMesInicio)));
		String dtAnoMesFinal = dto.getAnoPeriodoFinal() + dto.getMesPeriodoFinal();
		request.setDtFimVigencia(GissUtil.notNull(Integer.valueOf(dtAnoMesFinal)));

		ConsultarInformacoesAliquotaResponse response = factoryAdapter.getConsultarInformacoesAliquotaPDCAdapter().invokeProcess(request);
		for (int i = 0; i < response.getListaCount(); i++){
			AliquotaISSDTO saida =  new AliquotaISSDTO();
			saida.setCodLeiCompl(response.getLista(i).getCodItemCompl());
			saida.setDescLeiCompl(response.getLista(i).getDescItemCompl());
			saida.setAliquota(NumberUtils.format(response.getLista(i).getAliquota()));
			saida.setDataInicioVigencia(response.getLista(i).getDtInicioVigencia().replaceAll("\\.", "/"));
			saida.setDataFimVigencia(response.getLista(i).getDtFimVigencia().replaceAll("\\.", "/"));
			dto.getLista().add(saida);
		}
	}
	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarConAliquotaTXT(List<AliquotaISSDTO> lista, OutputStream outputStream) throws DocumentException, ReportException, IOException {
		new ConInfoAliquotaReportTXT(lista,outputStream).gerar();
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
