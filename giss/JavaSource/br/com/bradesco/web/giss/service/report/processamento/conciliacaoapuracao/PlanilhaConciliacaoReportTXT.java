package br.com.bradesco.web.giss.service.report.processamento.conciliacaoapuracao;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.TabelaTxt;
import br.com.bradesco.web.giss.utils.TabelaTxt.Alinhamento;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaJustificativaApuracaoVO;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class PlanilhaConciliacaoReportTXT {
	private ConciliacaoApuracaoVo conciliacaoApuracaoVo;
	private DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO;
	private ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo;
	private OutputStreamWriter osw;
	private int qtdRelatorioImpresso = 0;
	

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public PlanilhaConciliacaoReportTXT(
			ConciliacaoApuracaoVo conciliacaoApuracaoVo,
			DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO,
			OutputStream out) {
		this.conciliacaoApuracaoVo = conciliacaoApuracaoVo;
		this.detalharJustificativaApuracaoVO = detalharJustificativaApuracaoVO;
		this.osw = new OutputStreamWriter(out);
		
	}

	/**
	 * Gera o documento
	 * 
	 * @throws IOException
	 */
	public void gerar() throws ReportException, IOException {

			montarCabecalho();
			TabelaTxt txt = new TabelaTxt();
			montarCabecalhoTabela(txt);

			for (int i = 0; i < conciliacaoApuracaoVo.getLista().size(); i++) {
				ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo = conciliacaoApuracaoVo.getLista().get(i);

				montarTabela(listaConciliacaoApuracaoVo, txt);
			}

			montarTotalGeral(txt);
			
			/*
				Monta Bloco Resultados
			*/	
			txt = new TabelaTxt();
			montarTotais(txt);
			montarTotalGeral(txt);	
			
			/*
				Monta Bloco Justificativa
			*/
						
			txt = new TabelaTxt();
			montarCabecalhoTabelaJustificativa(txt);

			for (int i = 0; i < detalharJustificativaApuracaoVO.getLista().size(); i++) {
				ListaJustificativaApuracaoVO item = detalharJustificativaApuracaoVO.getLista().get(i);

				montarTabelaJustificativa(item, txt);
			}
			
			montarTotalGeral(txt);				
		
		try {
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT", e);
		}
	}

	private void write(String s) throws IOException {
		osw.append(s);
	}

	private void novaLinha() throws IOException {
		osw.append("\r\n");
	}

	/*
	 * Monta o cabecalho do relatorio
	 */
	private void montarCabecalho() throws ReportException {
		try {

			if (qtdRelatorioImpresso > 0) {
				novaLinha();
				novaLinha();
				novaLinha();
			}
			write("Consulta Conciliação da Apuração");
			novaLinha();

			write("BANCO BRADESCO S.A.");
			
			novaLinha();
			novaLinha();
			qtdRelatorioImpresso++;
		} catch (IOException e) {
			throw new ReportException(
					"Erro ao montar o cabecalho - durante a geracao do relatorio TXT",
					e);
		}
	}
	

	private void montarCabecalhoTabela(TabelaTxt txt) throws ReportException {
		try {
			write("RESULTADO DA PESQUISA");
			novaLinha();

			txt.add("COSIF");
			txt.add("RAZÃO");
			txt.add("CONTA");
			txt.add("NOME DA CONTA");
			txt.add("SALDO ANTERIOR CCRS", Alinhamento.DIREITA);
			txt.add("DÉBITO CCRS", Alinhamento.DIREITA);
			txt.add("CRÉDITO CCRS", Alinhamento.DIREITA);
			txt.add("SALDO ATUAL CCRS", Alinhamento.DIREITA);
			txt.add("RECEITA BALANCETE", Alinhamento.DIREITA);
			txt.add("RECEITA GISS", Alinhamento.DIREITA);
			txt.add("DIF. GISS X BALANCETE", Alinhamento.DIREITA);
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}
	
	private void montarCabecalhoTabelaJustificativa(TabelaTxt txt) throws ReportException {
		try {
			write("");
			novaLinha();
			
			txt.add("DATA ATUALIZAÇÃO");
			txt.add("VALOR DE AJUSTE");
			txt.add("JUSTIFICATIVA");
			txt.add("USUÁRIO");
			txt.quebraLinha();
			
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarTabela(ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo, TabelaTxt txt) {

		try {
		    
			txt.add(listaConciliacaoApuracaoVo.getCosif());
			txt.add(listaConciliacaoApuracaoVo.getGrupoRazaoFormatado());
			txt.add(listaConciliacaoApuracaoVo.getContaFormatada());
			txt.add(listaConciliacaoApuracaoVo.getDescContaRazao());
			txt.add(listaConciliacaoApuracaoVo.getValorSaldoAnteriorCCRS(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorDebitoCCRS(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorCreditoCCRS(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorSaldoAtualCCRS(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorReceitaBalancete(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorReceitaGISS(), Alinhamento.DIREITA);
			txt.add(listaConciliacaoApuracaoVo.getValorDifReceitaBalancete(), Alinhamento.DIREITA);
			
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}
	
	private void montarTabelaJustificativa(ListaJustificativaApuracaoVO listaJustificativaApuracaoVO, TabelaTxt txt) {
		
		try {
			
			txt.add(listaJustificativaApuracaoVO.getDataAtualizacao());
			txt.add(listaJustificativaApuracaoVO.getSinalJustificativa() + listaJustificativaApuracaoVO.getValorJustificativa());
			txt.add(listaJustificativaApuracaoVO.getDescJustificativa());
			txt.add(listaJustificativaApuracaoVO.getCodUsuarioManut());
			
			txt.quebraLinha();
			
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}
	
	
	
	
	private void montarTotais(TabelaTxt txt) {

		try {
			
			write("");
			novaLinha();
			
			txt.add("Receita CCRS:");
			txt.add(conciliacaoApuracaoVo.getValorReceitaTotalCCRS(), Alinhamento.DIREITA);

			txt.add("Valor ISS:");
			txt.add(conciliacaoApuracaoVo.getValorIssTotal(), Alinhamento.DIREITA);
			txt.quebraLinha();
			
			txt.add("Receita GISS:");
			txt.add(conciliacaoApuracaoVo.getValorReceitaTotalGISS(), Alinhamento.DIREITA);
			txt.quebraLinha();
			
			txt.add("Valor de Ajuste:");
			txt.add(conciliacaoApuracaoVo.getValorAjusteTotal(), Alinhamento.DIREITA);
			txt.quebraLinha();
			
			
			txt.add("Aliquota Zerada:");
			txt.add(conciliacaoApuracaoVo.getValorAliquotaZeradaTotal(), Alinhamento.DIREITA);
			txt.quebraLinha();
			
			txt.add("Oscilação Negativa:");
			txt.add(conciliacaoApuracaoVo.getValorOscilacaoNegativaTotal(), Alinhamento.DIREITA);
			txt.quebraLinha();
			
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
		
	}
	
	

	private void montarTotalGeral(TabelaTxt txt) {

		try {
			txt.geraTxt(osw);
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}

	}
	
}
