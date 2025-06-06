package br.com.bradesco.web.giss.service.report.issgerencial.coninfoaliquota;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.TabelaTxt;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class ConInfoAliquotaReportTXT {
	private List<AliquotaISSDTO> lista;
	private OutputStreamWriter osw;

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public ConInfoAliquotaReportTXT(List<AliquotaISSDTO> lista, OutputStream out) {
		this.lista = lista;
		this.osw = new OutputStreamWriter(out);
	}

	/**
	 * Gera o documento
	 * 
	 * @throws IOException
	 */
	public void gerar() throws ReportException, IOException {

			TabelaTxt txt = new TabelaTxt();
			montarCabecalhoTabela(txt);

			for (int i = 0; i < lista.size(); i++) {
				AliquotaISSDTO dto = lista.get(i);
				montarTabela(dto, txt);
			}
		try {
			txt.geraTxt(osw);
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT", e);
		}
	}

	private void montarCabecalhoTabela(TabelaTxt txt) throws ReportException {
		try {
			txt.add("Item de Serviço da LC");
			txt.add("Alíquota");
			txt.add("Competência");
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException("Erro ao montar o cabecalho durante a geracao do relatorio TXT", e);
		}
	}

	private void montarTabela(AliquotaISSDTO item, TabelaTxt txt) {

		try {
		    
			txt.add(String.valueOf(item.getCodLeiCompl() + " - " + item.getDescLeiCompl()));
			txt.add(String.valueOf(item.getAliquota()));
			txt.add(String.valueOf(item.getDataInicioVigencia() + " - " + item.getDataFimVigencia()));
			
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException("Erro ao montar a tabela durante a geracao do relatorio TXT",	e);
		}
	}
}