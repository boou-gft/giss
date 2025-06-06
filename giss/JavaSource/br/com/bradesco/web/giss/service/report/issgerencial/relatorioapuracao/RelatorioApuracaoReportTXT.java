package br.com.bradesco.web.giss.service.report.issgerencial.relatorioapuracao;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioSaidaISSDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.TabelaTxt;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class RelatorioApuracaoReportTXT {
	private List<RelatorioSaidaISSDTO> lista;
	private OutputStreamWriter osw;

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public RelatorioApuracaoReportTXT(
			List<RelatorioSaidaISSDTO> lista, OutputStream out) {
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
			RelatorioSaidaISSDTO dto = lista.get(i);
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
			txt.add("Empresa");
			txt.add("Produto");
			txt.add("Competência");
			txt.add("Receita Apurada");
			txt.add("Alíquota");
			txt.add("ISS Apurado");
			txt.add("Município Prestador (IBGE - Nome do Município)");
			txt.add("UF Município Prestador");
			txt.add("ISS Domicílio Prestador");
			txt.add("Município Tomador (IBGE - Nome do Município)");
			txt.add("UF Município Tomador");
			txt.add("ISS Domicílio Tomador");
			txt.quebraLinha();
		} catch (Exception e) {
			throw new ReportException("Erro ao montar o cabecalho durante a geracao do relatorio TXT", e);
		}
	}

	private void montarTabela(RelatorioSaidaISSDTO item, TabelaTxt txt) {
		try {
			txt.add(item.getNomeEmpresa());
			txt.add(item.getProduto());
			txt.add(item.getDtMesAno());
			txt.add(item.getValorTotalCredito());
			txt.add(item.getPercentualAliquotaTomador());
			txt.add(item.getValorTotalApuracao());
			txt.add(item.getDescMunicipioPrestador());
			txt.add(item.getSiglaUfPrestador());
			txt.add(item.getValorTotalApuracaoPrestador());
			txt.add(item.getDescMunicipioTomador());
			txt.add(item.getSiglaUfTomador());
			txt.add(item.getValorTotalApuracaoTomador());
			txt.quebraLinha();
		} catch (Exception e) {
			throw new ReportException("Erro ao montar a tabela durante a geracao do relatorio TXT", e);
		}
	}
}