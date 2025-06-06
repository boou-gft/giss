package br.com.bradesco.web.giss.service.report.issgerencial.painelcontrole;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.arquivoempresa.bean.ArquivoEmpresaISSDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.TabelaTxt;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class PainelControleReportTXT {
	private List<ArquivoEmpresaISSDTO> lista;
	private OutputStreamWriter osw;

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public PainelControleReportTXT(
			List<ArquivoEmpresaISSDTO> listaArq,
			OutputStream out) {
		this.lista = listaArq;
		this.osw = new OutputStreamWriter(out);
	}

	/**
	 * Gera o documento
	 * 
	 * @throws IOException
	 */
	public void gerar(ArquivoEmpresaISSDTO dtoo) throws ReportException, IOException {

			TabelaTxt txt = new TabelaTxt();
			montarCabecalhoTabela(txt, dtoo);

			for (int i = 0; i < lista.size(); i++) {
				ArquivoEmpresaISSDTO dto = lista.get(i);
				montarTabela(dto, txt, dtoo);
			}
		try {
			txt.geraTxt(osw);
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT", e);
		}
	}

	private void montarCabecalhoTabela(TabelaTxt txt, ArquivoEmpresaISSDTO dto) throws ReportException {
		try {
			txt.add("Empresa");
			txt.add("Produto");
			if(dto.getIndicadorTela() == "S"){
				txt.add("Período Enviado");
			}
			txt.add("Mês Competência");
			txt.add("Data Recepção");
			txt.add("Status Arquivo");
			txt.add("Cód. Finalidade");
			txt.add("Total de Registros");
			txt.add("Rejeitados");
			txt.add("% Rejeição");
			txt.add("Receita Rejeitados");
			txt.add("Aceitos");
			txt.add("Receita Aceitos");
			txt.add("Registros Base Negativa");
			txt.add("Valor Receita Base Negativa");
			txt.add("Base de Cálculo Apurada");
			txt.add("Valor de Cálculo ISS");
			if(dto.getIndicadorTela() == "M"){
				txt.add("% da Regra Transição - Domicílio Prestador");
				txt.add("Valor Total do ISS - Domicílio Prestador");
				txt.add("% da Regra Transição - Domicílio Tomador");
				txt.add("Valor Total do ISS - Domicílio Tomador");
			}
			
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarTabela(ArquivoEmpresaISSDTO arqEmp, TabelaTxt txt, ArquivoEmpresaISSDTO dtoo) {

		try {
		    
			txt.add(String.valueOf(arqEmp.getCodEmpresa()));
			txt.add(String.valueOf(arqEmp.getProduto()));
			if(dtoo.getIndicadorTela() == "S"){
				txt.add(arqEmp.getPeriodoEnviado());
			}
			txt.add(String.valueOf(arqEmp.getAnoMesFormatado()));
			txt.add(String.valueOf(arqEmp.getDataRecepcao()));
			txt.add(String.valueOf(arqEmp.getStatusArquivo()));
			txt.add(String.valueOf(arqEmp.getCodFinalidade()));
			txt.add(String.valueOf(arqEmp.getQtdeRegistros()));
			txt.add(String.valueOf(arqEmp.getRejeitados()));
			txt.add(String.valueOf(arqEmp.getPorcentRejeicao()));
			txt.add(String.valueOf(arqEmp.getReceitaRejeitados()));
			txt.add(String.valueOf(arqEmp.getAceitos()));
			txt.add(String.valueOf(arqEmp.getReceitaAceitos()));
			txt.add(String.valueOf(arqEmp.getQtdRegistroBaseNegativa()));
			txt.add(String.valueOf(arqEmp.getValorReceitaBaseNegativa()));
			txt.add(String.valueOf(arqEmp.getBaseCalcApurada()));
			txt.add(String.valueOf(arqEmp.getValorCalcIss()));
			if(dtoo.getIndicadorTela()== "M"){
				txt.add(String.valueOf(arqEmp.getPercDistrIssPrestador()));
				txt.add(String.valueOf(arqEmp.getValorTotalApuracaoPrestador()));
				txt.add(String.valueOf(arqEmp.getPercDistrIssTomador()));
				txt.add(String.valueOf(arqEmp.getValorTotalApuracaoTomador()));
			}
			
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}

	
}
