package br.com.bradesco.web.giss.service.business.arquivoempresa.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.acegisecurity.ui.webapp.SiteminderAuthenticationProcessingFilter;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.arquivoempresa.IArquivoEmpresaISSService;
import br.com.bradesco.web.giss.service.business.arquivoempresa.bean.ArquivoEmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.arquivoempresa.exceptions.ArquivoEmpresaISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.request.ConsultarArquivoEmpSemanalRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.service.report.issgerencial.painelcontrole.PainelControleReportTXT;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

import com.lowagie.text.DocumentException;


public class ArquivoEmpresaISSServiceImpl implements IArquivoEmpresaISSService{
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
	
	public void ListaArquivoEmpresa(ArquivoEmpresaISSDTO dto, String tipoArquivo) throws PdcAdapterException, ArquivoEmpresaISSServiceException{
		
		ConsultarArquivoEmpRequest request = new ConsultarArquivoEmpRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setAnoMes(GissUtil.verificaStringNulaInteger(dto.getAnoMes()));
		request.setIndicadorTela(tipoArquivo);
		request.setCodProduto(GissUtil.notNull(dto.getCodProduto()));
		request.setMaxOcorrencia(99);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		ConsultarArquivoEmpResponse response = factoryAdapter.getConsultarArquivoEmpPDCAdapter().invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int numConsul = 0;
		for (int i = 0; i < response.getListaConsultarArquivoEmpCount(); i++) {
			ArquivoEmpresaISSDTO arquivoEmpresa = new ArquivoEmpresaISSDTO();
			if(response.getListaConsultarArquivoEmp(i).getCodEmpresa() != 0){
				arquivoEmpresa.setCodEmpresa(response.getListaConsultarArquivoEmp(i).getCodEmpresa());
				arquivoEmpresa.setProduto(response.getListaConsultarArquivoEmp(i).getProduto());
				arquivoEmpresa.setAnoMes(response.getListaConsultarArquivoEmp(i).getAnoMes());
				String dataRecepcao = response.getListaConsultarArquivoEmp(i).getDataRecepcao();
				arquivoEmpresa.setDataRecepcao(response.getListaConsultarArquivoEmp(i).getDataRecepcao().equals("2017-01-01")?"":GissUtil.formataDataTimeStamp(dataRecepcao));
				arquivoEmpresa.setStatusArquivo(response.getListaConsultarArquivoEmp(i).getStatusArquivo());
				arquivoEmpresa.setCodFinalidade(response.getListaConsultarArquivoEmp(i).getCodFinalidade());
				arquivoEmpresa.setQtdeRegistros(response.getListaConsultarArquivoEmp(i).getQntRegistroRecebido());
				arquivoEmpresa.setAceitos(response.getListaConsultarArquivoEmp(i).getQntRegistroAceitacao());
				arquivoEmpresa.setRejeitados(response.getListaConsultarArquivoEmp(i).getQntRegistroRej());
				arquivoEmpresa.setIssCalculado(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorRecebido()));
				arquivoEmpresa.setReceitaAceitos(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorAceitacao()));
				arquivoEmpresa.setReceitaRejeitados(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorRegistroRej()));
				
				arquivoEmpresa.setQtdRegistroBaseNegativa(response.getListaConsultarArquivoEmp(i).getQtdRegistroIssNegtv());
				arquivoEmpresa.setValorReceitaBaseNegativa(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalIssNegtv()));
				arquivoEmpresa.setBaseCalcApurada(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorBaseCalcApuracao()));
				arquivoEmpresa.setValorCalcIss(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalApuracaoIss()));
				arquivoEmpresa.setPorcentRejeicao(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getPercRejeitadoArqIss()));
				arquivoEmpresa.setPercDistrIssPrestador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getPercDistrIssPrestador()));
				arquivoEmpresa.setValorTotalReceitaPrestador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalReceitaPrestador()));
				arquivoEmpresa.setValorTotalApuracaoPrestador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalApuracaoPrestador()));
				arquivoEmpresa.setPercAliquotaPrestador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getPercAliquotaPrestador()));
				arquivoEmpresa.setPercDistrIssTomador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getPercDistrIssTomador()));
				arquivoEmpresa.setValorTotalReceitaTomador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalReceitaTomador()));
				arquivoEmpresa.setValorTotalApuracaoTomador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getValorTotalApuracaoTomador()));
				arquivoEmpresa.setPercAliquotaTomador(NumberUtils.format(response.getListaConsultarArquivoEmp(i).getPercAliquotaTomador()));
			
				arquivoEmpresa.setNumConsul(numConsul++);
				dto.getLista().add(arquivoEmpresa);
			}
		}
	}
	
public void ListaArquivosEmpresaSemanal(ArquivoEmpresaISSDTO dto, String tipoArquivo) throws PdcAdapterException, ArquivoEmpresaISSServiceException{
		
		ConsultarArquivoEmpSemanalRequest request = new ConsultarArquivoEmpSemanalRequest();
		
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setAnoMes(GissUtil.verificaStringNulaInteger(dto.getAnoMes()));
		request.setMaxOcorrencia(99);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		ConsultarArquivoEmpSemanalResponse response = factoryAdapter.getConsultarArquivoEmpSemanalPDCAdapter().invokeProcess(request);
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int numConsul = 0;
		for (int i = 0; i < response.getListaConsultarArquivoEmpSemanalCount(); i++) {
			ArquivoEmpresaISSDTO arquivoEmpresa = new ArquivoEmpresaISSDTO();
			if(response.getListaConsultarArquivoEmpSemanal(i).getCodEmpresa() != 0){
				arquivoEmpresa.setCodEmpresa(response.getListaConsultarArquivoEmpSemanal(i).getCodEmpresa());
				arquivoEmpresa.setProduto(response.getListaConsultarArquivoEmpSemanal(i).getProduto());
				arquivoEmpresa.setDataInicial(response.getListaConsultarArquivoEmpSemanal(i).getSPeriodoIni());
				arquivoEmpresa.setDataFinal(response.getListaConsultarArquivoEmpSemanal(i).getSPeriodoFim());
				arquivoEmpresa.setPeriodoEnviado(arquivoEmpresa.getDataInicial() + " a " + arquivoEmpresa.getDataFinal());
				arquivoEmpresa.setAnoMes(GissUtil.getString(response.getListaConsultarArquivoEmpSemanal(i).getAnoMes()));
				String dataRecepcao = response.getListaConsultarArquivoEmpSemanal(i).getDataRecepcao();
				arquivoEmpresa.setDataRecepcao(response.getListaConsultarArquivoEmpSemanal(i).getDataRecepcao().equals("2017-01-01")?"":GissUtil.formataDataTimeStamp(dataRecepcao));
				arquivoEmpresa.setStatusArquivo(response.getListaConsultarArquivoEmpSemanal(i).getStatusArquivo());
				arquivoEmpresa.setCodFinalidade(response.getListaConsultarArquivoEmpSemanal(i).getCodFinalidade());
				arquivoEmpresa.setQtdeRegistros(response.getListaConsultarArquivoEmpSemanal(i).getQntRegistroRecebido());
				arquivoEmpresa.setRejeitados(response.getListaConsultarArquivoEmpSemanal(i).getQntRegistroRejeitado());
				arquivoEmpresa.setPorcentRejeicao(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getSPercentualRejeicaoArqIss())));
				arquivoEmpresa.setReceitaRejeitados(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getSValorRegistroRejeitado())));
				arquivoEmpresa.setAceitos(response.getListaConsultarArquivoEmpSemanal(i).getSQntdRegistroAcatado());
				arquivoEmpresa.setReceitaAceitos(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getSValorAcatado())));
				arquivoEmpresa.setQtdRegistroBaseNegativa(response.getListaConsultarArquivoEmpSemanal(i).getQtdRegistroIssNegtv());
				arquivoEmpresa.setValorReceitaBaseNegativa(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getValorTotalIssNegtv())));
				arquivoEmpresa.setBaseCalcApurada(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getValorBaseCalcApuracao())));
				arquivoEmpresa.setValorCalcIss(GissUtil.getString(NumberUtils.format(response.getListaConsultarArquivoEmpSemanal(i).getValorTotalApuracaoIss())));
				
				
			
				arquivoEmpresa.setNumConsul(numConsul++);
				dto.getLista().add(arquivoEmpresa);
			}
		}
	}
	
	/**
	 * Gera o relatorio em TXT
	 * @throws IOException 
	 * @throws ReportException 
	 */
	public void gerarPainelControleTXT(List<ArquivoEmpresaISSDTO> lista, OutputStream outputStream, ArquivoEmpresaISSDTO dto) throws DocumentException, ReportException, IOException {
		new PainelControleReportTXT(lista,outputStream).gerar(dto);
	}
}
