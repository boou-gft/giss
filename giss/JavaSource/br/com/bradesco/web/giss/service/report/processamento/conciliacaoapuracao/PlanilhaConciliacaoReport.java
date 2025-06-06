package br.com.bradesco.web.giss.service.report.processamento.conciliacaoapuracao;

import java.io.IOException;
import java.net.URL;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.report.base.BasicPdfReport;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaJustificativaApuracaoVO;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class PlanilhaConciliacaoReport extends BasicPdfReport {

	private ConciliacaoApuracaoVo conciliacaoApuracaoVo;
	private DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO;
	private ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo;
	private Image imagemRelatorio = null;
	private Integer qtdRelatorios = 0;
	
	public PlanilhaConciliacaoReport(ConciliacaoApuracaoVo conciliacaoApuracaoVo, DetalharJustificativaApuracaoVO detalharJustificativaApuracao) {
		super();
		this.conciliacaoApuracaoVo = conciliacaoApuracaoVo;
		this.imagemRelatorio = getImagemRelatorio();
		this.detalharJustificativaApuracaoVO = detalharJustificativaApuracao;
	}

	@Override
	protected void popularPdf(Document document) throws DocumentException {

		document.add(new Paragraph());
		document.add(montarCabecalhoImagem());
		document.add(montarCabecalho());
			
		int nroColunas = 11;
		int[] dimensaoColunas = new int[] { 12, 7, 10, 34, 11, 11, 11, 11, 13, 11, 11 };
		
		Table table = new Table(nroColunas);
		table.setWidth(108);
		table.setWidths(dimensaoColunas);
		table.setBorder(Rectangle.NO_BORDER);

		table = montarCabecalhoTabela(table);

		for (int i = 0; i < conciliacaoApuracaoVo.getLista().size(); i++) {
			ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo = conciliacaoApuracaoVo.getLista().get(i);

			table = montarLista(listaConciliacaoApuracaoVo, table);
		}
	
		document.add(table);
		
		/*
			Monta Bloco Resultados
		*/
		
		table = new Table(6);
		table.setWidth(108);
		table.setWidths(new int[] {20, 40, 20, 40,60,60});
		table.setBorder(Rectangle.NO_BORDER);
		
		table =  montarTotais(table, conciliacaoApuracaoVo);
		document.add(table);
		
		/*
			Monta Bloco Justificativa
		*/
		table = new Table(4);
		table.setWidth(108);
		table.setWidths(new int[] {15, 15,60 ,15});
		table.setBorder(Rectangle.NO_BORDER);
		
		table = montarCabecalhoTabelaJustificativa(table);
		
		for (int i = 0; i < detalharJustificativaApuracaoVO.getLista().size(); i++) {
			ListaJustificativaApuracaoVO item = detalharJustificativaApuracaoVO.getLista().get(i);

			table = montarListaJustificativa(item, table);
		}
		document.add(table);
	}

	

	private PdfPTable montarCabecalhoImagem() {
		PdfPTable tabelaImagem = new PdfPTable(1);
		PdfPCell celImagem = new PdfPCell();
		celImagem.setBorder(PdfPCell.NO_BORDER);
		celImagem.addElement(imagemRelatorio);
		tabelaImagem.addCell(celImagem);
		tabelaImagem.setHorizontalAlignment(PdfPTable.ALIGN_LEFT);
		return tabelaImagem;
	}

	private Table montarCabecalho() throws BadElementException,
			DocumentException {
		
		Table tableCabecalho = new Table(2);
		tableCabecalho.setWidth(100);
		tableCabecalho.setBorder(Rectangle.NO_BORDER);

		Cell celNomePlanilha = new Cell(new Chunk(
				"Consulta Conciliação da Apuração", FONT_NORMAL));
		celNomePlanilha.setBorder(Cell.NO_BORDER);
		celNomePlanilha.setColspan(2);
		tableCabecalho.addCell(celNomePlanilha);

		Cell celUnidadeOrganizacional = new Cell(new Chunk(
				"BANCO BRADESCO S.A.", FONT_NORMAL));
		celUnidadeOrganizacional.setBorder(Cell.NO_BORDER);
		celUnidadeOrganizacional.setColspan(2);
		tableCabecalho.addCell(celUnidadeOrganizacional);

		qtdRelatorios++;
		return tableCabecalho;
	}

	private Table montarTotais(Table table, ConciliacaoApuracaoVo conciliacaoApuracaoVo) throws BadElementException {
		
		//Receita CCRS:
		Cell celReceitaTotalCCRS = new Cell(new Chunk("Receita CCRS:", FONT_NORMAL));
		celReceitaTotalCCRS.setBorder(Cell.NO_BORDER);
		celReceitaTotalCCRS.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celReceitaTotalCCRS);
		
		Cell celValorReceitaTotalCCRS = new Cell(new Chunk(conciliacaoApuracaoVo.getValorReceitaTotalCCRS(), FONT_NORMAL));
		celValorReceitaTotalCCRS.setBorder(Cell.NO_BORDER);
		celValorReceitaTotalCCRS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorReceitaTotalCCRS);
		
		//Valor ISS:
		Cell celIssTotal = new Cell(new Chunk("   Valor ISS:", FONT_NORMAL));
		celIssTotal.setBorder(Cell.NO_BORDER);
		celIssTotal.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celIssTotal);
		
		Cell celValorIssTotal = new Cell(new Chunk(conciliacaoApuracaoVo.getValorIssTotal(), FONT_NORMAL));
		celValorIssTotal.setBorder(Cell.NO_BORDER);
		celValorIssTotal.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorIssTotal);
		
		Cell celColunaVazia = new Cell(new Chunk("", FONT_NORMAL));
		celColunaVazia.setBorder(Cell.NO_BORDER);
		celColunaVazia.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
			
		//Receita GISS:
		Cell celReceitaTotalGISS = new Cell(new Chunk("Receita GISS:", FONT_NORMAL));
		celReceitaTotalGISS.setBorder(Cell.NO_BORDER);
		celReceitaTotalGISS.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celReceitaTotalGISS);
		
		Cell celValorReceitaTotalGISS = new Cell(new Chunk(conciliacaoApuracaoVo.getValorReceitaTotalGISS(), FONT_NORMAL));
		celValorReceitaTotalGISS.setBorder(Cell.NO_BORDER);
		celValorReceitaTotalGISS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorReceitaTotalGISS);
		
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		
		//Valor de Ajuste:
		Cell celAjusteTotal = new Cell(new Chunk("Valor de Ajuste:" , FONT_NORMAL));
		celAjusteTotal.setBorder(Cell.NO_BORDER);
		celAjusteTotal.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celAjusteTotal);
		
		Cell celValorAjusteTotal = new Cell(new Chunk(conciliacaoApuracaoVo.getValorAjusteTotal(), FONT_NORMAL));
		celValorAjusteTotal.setBorder(Cell.NO_BORDER);
		celValorAjusteTotal.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorAjusteTotal);
		
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		
		
		//Aliquota Zerada:
		Cell celAliquotaZeradaTotal = new Cell(new Chunk("Aliquota Zerada:", FONT_NORMAL));
		celAliquotaZeradaTotal.setBorder(Cell.NO_BORDER);
		celAliquotaZeradaTotal.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celAliquotaZeradaTotal);
		
		Cell celValorAliquotaZeradaTotal = new Cell(new Chunk(conciliacaoApuracaoVo.getValorAliquotaZeradaTotal(), FONT_NORMAL));
		celValorAliquotaZeradaTotal.setBorder(Cell.NO_BORDER);
		celValorAliquotaZeradaTotal.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorAliquotaZeradaTotal);
		
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		table.addCell(celColunaVazia);
		
		//Receita CCRS:
		Cell celOscilacaoNegativaTotal = new Cell(new Chunk("Oscilação Negativa:", FONT_NORMAL));
		celOscilacaoNegativaTotal.setBorder(Cell.NO_BORDER);
		celOscilacaoNegativaTotal.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celOscilacaoNegativaTotal);
		
		Cell celValorOscilacaoNegativaTotal = new Cell(new Chunk(conciliacaoApuracaoVo.getValorOscilacaoNegativaTotal(), FONT_NORMAL));
		celValorOscilacaoNegativaTotal.setBorder(Cell.NO_BORDER);
		celValorOscilacaoNegativaTotal.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celValorOscilacaoNegativaTotal);
		return table;
	}
	
	private Table montarListaJustificativa(ListaJustificativaApuracaoVO listaJustificativaApuracaoVO, Table table) throws BadElementException, DocumentException {
		
		Cell celTituloCosif = new Cell(new Chunk(listaJustificativaApuracaoVO.getDataAtualizacao(), FONT_NORMAL));
		celTituloCosif.setBorder(Cell.NO_BORDER);
		celTituloCosif.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloCosif);

		Cell celTituloRazao = new Cell(new Chunk(listaJustificativaApuracaoVO.getSinalJustificativa() + listaJustificativaApuracaoVO.getValorJustificativa() + "  ", FONT_NORMAL));
		celTituloRazao.setBorder(Cell.NO_BORDER);
		celTituloRazao.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloRazao);

		Cell celTituloConta = new Cell(new Chunk(listaJustificativaApuracaoVO.getDescJustificativa(), FONT_NORMAL));
		celTituloConta.setBorder(Cell.NO_BORDER);
		celTituloConta.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloConta);

		Cell celTituloNome = new Cell(new Chunk(listaJustificativaApuracaoVO.getCodUsuarioManut(), FONT_NORMAL));
		celTituloNome.setBorder(Cell.NO_BORDER);
		celTituloNome.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloNome);
		
		return table;
	}
	
	
	private Table montarLista(ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo, Table table) throws BadElementException, DocumentException {
		
		montarResultadoTabela(table, listaConciliacaoApuracaoVo);

		return table;
	}

	private void montarResultadoTabela(Table table,	ListaConciliacaoApuracaoVo listaConciliacaoApuracaoVo) throws BadElementException {
		
		Cell celTituloCosif = new Cell(new Chunk(listaConciliacaoApuracaoVo.getCosif(), FONT_NORMAL));
		celTituloCosif.setBorder(Cell.NO_BORDER);
		celTituloCosif.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloCosif);

		Cell celTituloRazao = new Cell(new Chunk(listaConciliacaoApuracaoVo.getGrupoRazaoFormatado(), FONT_NORMAL));
		celTituloRazao.setBorder(Cell.NO_BORDER);
		celTituloRazao.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celTituloRazao);

		Cell celTituloConta = new Cell(new Chunk(listaConciliacaoApuracaoVo.getContaFormatada() + "  ", FONT_NORMAL));
		celTituloConta.setBorder(Cell.NO_BORDER);
		celTituloConta.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloConta);

		Cell celTituloNome = new Cell(new Chunk(listaConciliacaoApuracaoVo.getDescContaRazao(), FONT_NORMAL));
		celTituloNome.setBorder(Cell.NO_BORDER);
		celTituloNome.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloNome);

		Cell celTituloSaldoAnterior = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorSaldoAnteriorCCRS(), FONT_NORMAL));
		celTituloSaldoAnterior.setBorder(Cell.NO_BORDER);
		celTituloSaldoAnterior.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloSaldoAnterior);
		
		Cell celTituloDebitoCCRS = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorDebitoCCRS(), FONT_NORMAL));
		celTituloDebitoCCRS.setBorder(Cell.NO_BORDER);
		celTituloDebitoCCRS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloDebitoCCRS);
		
		Cell celTituloCreditoCCRS = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorCreditoCCRS(), FONT_NORMAL));
		celTituloCreditoCCRS.setBorder(Cell.NO_BORDER);
		celTituloCreditoCCRS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloCreditoCCRS);
		
		Cell celTituloSaldoAtual = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorSaldoAtualCCRS(), FONT_NORMAL));
		celTituloSaldoAtual.setBorder(Cell.NO_BORDER);
		celTituloSaldoAtual.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloSaldoAtual);
		
		Cell celTituloReceita = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorReceitaBalancete(), FONT_NORMAL));
		celTituloReceita.setBorder(Cell.NO_BORDER);
		celTituloReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloReceita);
		
		Cell celTituloReceitaGiss = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorReceitaGISS(), FONT_NORMAL));
		celTituloReceitaGiss.setBorder(Cell.NO_BORDER);
		celTituloReceitaGiss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloReceitaGiss);
		
		Cell celTitulDif = new Cell(new Chunk(listaConciliacaoApuracaoVo.getValorDifReceitaBalancete(), FONT_NORMAL));
		celTitulDif.setBorder(Cell.NO_BORDER);
		celTitulDif.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTitulDif);
		
	}
	

	private Table montarCabecalhoTabela( Table table) throws DocumentException {

		Cell celTituloCosif = new Cell(new Chunk("COSIF", FONT_NORMAL));
		celTituloCosif.setBorder(Cell.NO_BORDER);
		celTituloCosif.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloCosif);

		Cell celTituloRazao = new Cell(new Chunk("RAZÃO", FONT_NORMAL));
		celTituloRazao.setBorder(Cell.NO_BORDER);
		celTituloRazao.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celTituloRazao);

		Cell celTituloConta = new Cell(new Chunk("CONTA", FONT_NORMAL));
		celTituloConta.setBorder(Cell.NO_BORDER);
		celTituloConta.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celTituloConta);

		Cell celTituloNome = new Cell(new Chunk("NOME CONTA", FONT_NORMAL));
		celTituloNome.setBorder(Cell.NO_BORDER);
		celTituloNome.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloNome);

		Cell celTituloSaldoAnterior = new Cell(new Chunk("SALDO ANTERIOR", FONT_NORMAL));
		celTituloSaldoAnterior.setBorder(Cell.NO_BORDER);
		celTituloSaldoAnterior.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloSaldoAnterior);
		
		Cell celTituloDebitoCCRS = new Cell(new Chunk("DÉBITO", FONT_NORMAL));
		celTituloDebitoCCRS.setBorder(Cell.NO_BORDER);
		celTituloDebitoCCRS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloDebitoCCRS);
		
		Cell celTituloCreditoCCRS = new Cell(new Chunk("CRÉDITO", FONT_NORMAL));
		celTituloCreditoCCRS.setBorder(Cell.NO_BORDER);
		celTituloCreditoCCRS.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloCreditoCCRS);
		
		Cell celTituloSaldoAtual = new Cell(new Chunk("SALDO ATUAL", FONT_NORMAL));
		celTituloSaldoAtual.setBorder(Cell.NO_BORDER);
		celTituloSaldoAtual.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloSaldoAtual);
		
		Cell celTituloReceita = new Cell(new Chunk("RECEITA BALANCETE", FONT_NORMAL));
		celTituloReceita.setBorder(Cell.NO_BORDER);
		celTituloReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloReceita);
		
		Cell celTituloReceitaGiss = new Cell(new Chunk("RECEITA GISS", FONT_NORMAL));
		celTituloReceitaGiss.setBorder(Cell.NO_BORDER);
		celTituloReceitaGiss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloReceitaGiss);
		
		Cell celTitulDif = new Cell(new Chunk("DIF. RECEITA", FONT_NORMAL));
		celTitulDif.setBorder(Cell.NO_BORDER);
		celTitulDif.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTitulDif);

		return table;
	}
	private Table montarCabecalhoTabelaJustificativa( Table table) throws DocumentException {
		
		Cell celTituloCosif = new Cell(new Chunk("DATA ATUALIZAÇÃO", FONT_NORMAL));
		celTituloCosif.setBorder(Cell.NO_BORDER);
		celTituloCosif.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloCosif);
		
		Cell celTituloRazao = new Cell(new Chunk("VALOR DE AJUSTE  ", FONT_NORMAL));
		celTituloRazao.setBorder(Cell.NO_BORDER);
		celTituloRazao.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloRazao);
		
		Cell celTituloConta = new Cell(new Chunk("JUSTIFICATIVA", FONT_NORMAL));
		celTituloConta.setBorder(Cell.NO_BORDER);
		celTituloConta.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloConta);
		
		Cell celTituloNome = new Cell(new Chunk("USUÁRIO", FONT_NORMAL));
		celTituloNome.setBorder(Cell.NO_BORDER);
		celTituloNome.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloNome);
		
		
		return table;
	}
	
	private Image getImagemRelatorio() {
		try {
			String caminho = "/images/logo_marca.png";
			URL caminhoImagem = BradescoFacesUtils.getServletContext()
					.getResource(caminho);

			if (caminhoImagem == null) {
				throw new ReportException("Não encontrou a imagem no caminho: "
						+ caminho);
			}

			Image img = Image.getInstance(caminhoImagem);
			img.setBorder(Image.NO_BORDER);
			img.setWidthPercentage(30);
			return img;
		} catch (IOException e) {
			throw new ReportException(e);
		} catch (BadElementException e) {
			throw new ReportException(e);
		}
	}
}
