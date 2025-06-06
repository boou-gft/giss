package br.com.bradesco.web.giss.service.report.integracao.resultadomunicipiosnovos;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.TabelaTxt;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class ResultMunNovosReportTXT {
	private List<ResultMunicipiosNovosDTO> listaMunicipios;
	private OutputStreamWriter osw;

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public ResultMunNovosReportTXT(
			List<ResultMunicipiosNovosDTO> listaMunicipios,
			OutputStream out) {
		this.listaMunicipios = listaMunicipios;
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

			for (int i = 0; i < listaMunicipios.size(); i++) {
				ResultMunicipiosNovosDTO dto = listaMunicipios.get(i);
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
			txt.add("Código");
			txt.add("Nome");
			txt.add("UF");
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarTabela(ResultMunicipiosNovosDTO municipio, TabelaTxt txt) {

		try {
		    
			txt.add(municipio.getCodigo());
			txt.add(municipio.getNome());
			txt.add(municipio.getUf());
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}

	
}
