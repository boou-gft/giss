package br.com.bradesco.web.giss.service.business.arquivoempresa;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.lowagie.text.DocumentException;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.arquivoempresa.bean.ArquivoEmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.arquivoempresa.exceptions.ArquivoEmpresaISSServiceException;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;



public interface IArquivoEmpresaISSService {
	
	public void ListaArquivoEmpresa(ArquivoEmpresaISSDTO dto, String tipoArquivo) throws PdcAdapterException, ArquivoEmpresaISSServiceException; 
	
	public void gerarPainelControleTXT(List<ArquivoEmpresaISSDTO> lista, OutputStream outputStream, ArquivoEmpresaISSDTO dto) throws DocumentException, ReportException, IOException;
	
	public void ListaArquivosEmpresaSemanal(ArquivoEmpresaISSDTO dto, String tipoArquivo) throws PdcAdapterException, ArquivoEmpresaISSServiceException;
	
}
