package br.com.bradesco.web.giss.service.business.issrelatorio;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.lowagie.text.DocumentException;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.HistoricoTransacoesRecusadasISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioSaidaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.exceptions.RelatorioISSServiceException;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;

public interface IRelatorioISSService {
	
	public String gerarRelatorio(RelatorioISSDTO dto) throws PdcAdapterException, RelatorioISSServiceException;
	public void gerarRelatorioApuracaoTXT(List<RelatorioSaidaISSDTO> lista, OutputStream outputStream) throws DocumentException, ReportException, IOException;
	public String gerarRelatoriosAliquotas(AliquotaISSDTO dto) throws PdcAdapterException, RelatorioISSServiceException;
	public String gerarRelatorioHistoricoTransacoes(HistoricoTransacoesRecusadasISSDTO dto, Integer codEmpresaSelecionada);
}
