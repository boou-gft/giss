package br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.ControleLogsDTO;
import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.TransmissaoArquivoLogDTO;
import br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.ILogTransmissaoArquivoService;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.ILogTransmissaoArquivoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest;
import br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse;
import br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.IManutencaoLogTransArquivoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest;
import br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.response.ManutencaoLogTransArquivoResponse;

public class LogTransmissaoArquivoServiceImpl implements
		ILogTransmissaoArquivoService {
	
	private FactoryAdapter factoryAdapter;
	
	private ILogManager logger = BradescoCommonServiceFactory.getLogManager();

	public ControleLogsDTO incluirLogTransmissaoArquivo(
			TransmissaoArquivoLogDTO transmissaoArquivoLogDTO) {
		
		ManutencaoLogTransArquivoRequest request = new ManutencaoLogTransArquivoRequest();
		request.setETipoDeManutencao("I");
		request.setENctrlRemssDepdc(0L);
		request.setECmunBacen(transmissaoArquivoLogDTO.getCodMunicipio());
		request.setECpssoaJurid(transmissaoArquivoLogDTO.getCodEmpresa());
		request.setENseqUndOrgnz(transmissaoArquivoLogDTO.getCodDependencia());
		request.setECtpoArqPreft(transmissaoArquivoLogDTO.getCodTipoArquivo());
		request.setEIarqRemssPreft(transmissaoArquivoLogDTO.getNomeArquivo());
		request.setECsitTrnsmPreft(transmissaoArquivoLogDTO.getCodSituacaoTransArquivo());
		String mensagemRetorno = transmissaoArquivoLogDTO.getMensagemRetorno() == null ? "-" : transmissaoArquivoLogDTO.getMensagemRetorno(); 
		request.setERmsgemRetorPreft(mensagemRetorno);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
			
		IManutencaoLogTransArquivoPDCAdapter manutencaoLogTransArquivoPDCAdapter = factoryAdapter.getManutencaoLogTransArquivoPDCAdapter();
		ManutencaoLogTransArquivoResponse response = manutencaoLogTransArquivoPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		return null;
	}

	public List<ControleLogsDTO> listarLogTransmissaoArquivo(String dataInicio,
			String dataFim) {
		
		LogTransmissaoArquivoRequest request = new LogTransmissaoArquivoRequest();
		request.setEMaxOcorr(50);
		request.setEDataRemessaIni(dataInicio);
		request.setEDataRemessaFim(dataFim);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		logger.info(this.getClass(), "LogTransmissaoArquivoPDCAdapter:");
		logger.info(this.getClass(), factoryAdapter.getLogTransmissaoArquivoPDCAdapter().toString());
		ILogTransmissaoArquivoPDCAdapter logTransmissaoArquivoPDCAdapter = factoryAdapter.getLogTransmissaoArquivoPDCAdapter();
		LogTransmissaoArquivoResponse response = logTransmissaoArquivoPDCAdapter.invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		int cont = 0;
		
		List<ControleLogsDTO> lista = new ArrayList<ControleLogsDTO>();
		
		for (int i = 0; i < response.getSNumConsultas(); i++) {
			ControleLogsDTO controleLogsDTO = new ControleLogsDTO();
			controleLogsDTO.setRemessa(response.getGISSW06SREGSAIDA(i).getSNctrlRemssDepdc());
			controleLogsDTO.setCodMunicipio(response.getGISSW06SREGSAIDA(i).getSCmunBacen());//
			controleLogsDTO.setMunicipio(response.getGISSW06SREGSAIDA(i).getSRmunBacen());//
			controleLogsDTO.setEmpresa(response.getGISSW06SREGSAIDA(i).getSCpssoaJurid());
			controleLogsDTO.setCodDependencia(response.getGISSW06SREGSAIDA(i).getSNseqUndOrgnz());
			controleLogsDTO.setDescDependencia(response.getGISSW06SREGSAIDA(i).getSRseqUndOrgnz());
			controleLogsDTO.setCodTipoArquivo(response.getGISSW06SREGSAIDA(i).getSCtpoArqPreft());
			controleLogsDTO.setDescTipoArquivo(response.getGISSW06SREGSAIDA(i).getSRtpoArqPreft());
			controleLogsDTO.setNomeArquivo(response.getGISSW06SREGSAIDA(i).getSIarqRemssPreft());
			controleLogsDTO.setCodSitTransmissao(response.getGISSW06SREGSAIDA(i).getSCsitTrnsmPreft());
			controleLogsDTO.setDescSitTransmissao(response.getGISSW06SREGSAIDA(i).getSRsitTrnsmPreft());
			controleLogsDTO.setDataRemessa(response.getGISSW06SREGSAIDA(i).getSDataRemessa());
			controleLogsDTO.setHoraRemessa(response.getGISSW06SREGSAIDA(i).getSHoraRemessa());
			controleLogsDTO.setMensagemRetornoPref(response.getGISSW06SREGSAIDA(i).getSRmsgemRetorPreft());
			controleLogsDTO.setCodUsuarioInclusao(response.getGISSW06SREGSAIDA(i).getSCusuarIncl());
			controleLogsDTO.setIndex(cont++);
			
			lista.add(controleLogsDTO);
			
		}
		
		return lista;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
}
