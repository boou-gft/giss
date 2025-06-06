package br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.OcorrenciaApuracaoIssDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssDTO;
import br.com.bradesco.web.giss.service.report.base.BasicPdfReport;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class PlanilhaApuracaoIssReport extends BasicPdfReport {

	private List<RelatorioApuracaoIssDTO> relatorioApuracaoIssDTO;
	private RelatorioApuracaoIssDTO relatorioDTO;
	private Image imagemRelatorio = null;
	private Boolean razaoExiste = false;
	private Integer qtdRelatorios = 0;
	private Boolean aberturaConta = false;

	public PlanilhaApuracaoIssReport(
			List<RelatorioApuracaoIssDTO> relatorioApuracaoIssDTO, Boolean aberturaConta) {
		super();
		this.relatorioApuracaoIssDTO = relatorioApuracaoIssDTO;

		this.imagemRelatorio = getImagemRelatorio();
		this.aberturaConta = aberturaConta;
	}

	@Override
	protected void popularPdf(Document document) throws DocumentException {
		document.add(new Paragraph());
		document.add(montarCabecalhoImagem());


		for (RelatorioApuracaoIssDTO dto : relatorioApuracaoIssDTO) {
			relatorioDTO = dto;
			boolean servicoNovo = true;  
			if(qtdRelatorios > 0){
				document.add(Chunk.NEXTPAGE);
				document.add(montarCabecalhoImagem());
			}
				
			document.add(montarCabecalho());
			document.add(montarDescricaoDemonstrativo());

			if (relatorioDTO.getApuracoes().size() > 0) {
				if (relatorioDTO.getApuracoes().get(0).getCodigoGrupo() <= 0
						|| relatorioDTO.getApuracoes().get(0)
								.getCodigoSubgrupo() <= 0) {
					razaoExiste = false;
				} else {
					razaoExiste = true;
				}
			}
			
			int nroColunas = 6;
			int[] dimensaoColunas = new int[] { 13, 38, 18, 20, 10, 12 };

			if (razaoExiste) {
				nroColunas = 7;
				dimensaoColunas = new int[] { 12, 7, 35, 12, 20, 10, 12 };
			}
			if (aberturaConta) {
				nroColunas = 8;
				dimensaoColunas = new int[] { 12, 7, 12, 32, 10, 15, 10, 10 };
			}
			Table table = new Table(nroColunas);
			table.setWidth(108);
			table.setWidths(dimensaoColunas);
			table.setBorder(Rectangle.NO_BORDER);

			table = montarCabecalhoTabela(table);

			for (int i = 0; i < dto.getApuracoes().size(); i++) {
				OcorrenciaApuracaoIssDTO ocorrenciaApuracaoIss = dto.getApuracoes().get(i);

				table = montarLista(ocorrenciaApuracaoIss, table,servicoNovo);
				
                if("T".equals(ocorrenciaApuracaoIss.getTipoRegistro())){
                    servicoNovo = true;
                } else {
                    servicoNovo = false;
                }

			}

			table = montarTotalGeral(relatorioDTO,table);

			document.add(table);
			document.add(montarRodape());
		}

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
				"Planilha de Apuração do I.S.S.", FONT_NORMAL));
		celNomePlanilha.setBorder(Cell.NO_BORDER);
		celNomePlanilha.setColspan(2);
		tableCabecalho.addCell(celNomePlanilha);

		Cell celUnidadeOrganizacional = new Cell(new Chunk(
				"BANCO BRADESCO S.A.", FONT_NORMAL));
		celUnidadeOrganizacional.setBorder(Cell.NO_BORDER);
		celUnidadeOrganizacional.setColspan(2);
		tableCabecalho.addCell(celUnidadeOrganizacional);

		StringBuilder agencia = new StringBuilder();
		agencia.append("AGENCIA: ");
		agencia.append(String.valueOf(relatorioDTO
				.getCodAgenciaDev()));
		agencia.append("/");
		agencia.append(relatorioDTO.getDescAgenciaDev());
		Cell celAgencia = new Cell(new Chunk(agencia.toString(), FONT_NORMAL));
		celAgencia.setBorder(Cell.NO_BORDER);
		tableCabecalho.addCell(celAgencia);

		Cell celEstado = new Cell(new Chunk("ESTADO: "
				+ relatorioDTO.getSiglaEstado(), FONT_NORMAL));
		celEstado.setBorder(Cell.NO_BORDER);
		celEstado.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		tableCabecalho.addCell(celEstado);

		Cell celCnpj = new Cell(new Chunk("CNPJ: "
				+ NumberUtils.formatCnpj(relatorioDTO.getCnpj()), FONT_NORMAL));
		celCnpj.setBorder(Cell.NO_BORDER);
		tableCabecalho.addCell(celCnpj);

		Cell celInscricaoMunicipal = new Cell(new Chunk("INSCRICAO MUNICIPAL: "
				+ relatorioDTO.getInscricaoMunicipal(), FONT_NORMAL));
		celInscricaoMunicipal.setBorder(Cell.NO_BORDER);
		celInscricaoMunicipal.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		tableCabecalho.addCell(celInscricaoMunicipal);

		StringBuilder endereco = new StringBuilder();
		endereco.append("ENDERECO: ");
		endereco.append(relatorioDTO.getEndereco());
		Cell celEndereco = new Cell(new Chunk(endereco.toString(), FONT_NORMAL));
		celEndereco.setBorder(Cell.NO_BORDER);
		tableCabecalho.addCell(celEndereco);

		Cell celCep = new Cell(new Chunk("CEP: "
				+ relatorioDTO.getCepFormatado(), FONT_NORMAL));
		celCep.setBorder(Cell.NO_BORDER);
		celCep.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		tableCabecalho.addCell(celCep);

		StringBuilder centralizadora = new StringBuilder();
		centralizadora.append("CENTRALIZADORA: ");
		centralizadora.append(GissUtil.formatNumber(String.valueOf(relatorioDTO
				.getCodAgenciaCentralizadora()), 5));
		centralizadora.append("-");
		centralizadora.append(relatorioDTO.getDigitoAgenciaCentralizadora());
		centralizadora.append("/");
		centralizadora.append(relatorioDTO.getDescAgenciaCentralizadora());
		Cell celCentralizadora = new Cell(new Chunk(centralizadora.toString(),
				FONT_NORMAL));
		celCentralizadora.setBorder(Cell.NO_BORDER);
		tableCabecalho.addCell(celCentralizadora);

		StringBuilder municipio = new StringBuilder();
		municipio.append(relatorioDTO.getCodigoMunicipio());
		municipio.append("/");
		municipio.append(relatorioDTO.getDigitoMunicipio());
		Cell celCodMunic = new Cell(new Chunk("COD.MUNIC.: "
				+ municipio.toString(), FONT_NORMAL));
		celCodMunic.setBorder(Cell.NO_BORDER);
		celCodMunic.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		tableCabecalho.addCell(celCodMunic);

		StringBuilder competencia = new StringBuilder();
		competencia.append(relatorioDTO.getMesCompetencia());
		competencia.append("/");
		competencia.append(relatorioDTO.getAnoCompetencia());
		Cell celCompetencia = new Cell(new Chunk("COMPETENCIA: "
				+ competencia.toString(), FONT_NORMAL));
		celCompetencia.setBorder(Cell.NO_BORDER);
		tableCabecalho.addCell(celCompetencia);

		Cell celVencimento = new Cell(new Chunk("VENCIMENTO: "
				+ relatorioDTO.getDiaVencimento(), FONT_NORMAL));
		celVencimento.setBorder(Cell.NO_BORDER);
		celVencimento.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		tableCabecalho.addCell(celVencimento);

		qtdRelatorios++;
		return tableCabecalho;
	}

	private Table montarDescricaoDemonstrativo() throws BadElementException,
			DocumentException {
		Table table = new Table(1);
		table.setWidth(100);
		table.setBorder(Rectangle.NO_BORDER);

		Cell celTexto1 = new Cell(
				new Chunk(
						"DEMONSTRATIVO DAS RECEITAS, PARA EFEITO DE RECOLHIMENTO DO ISSQN, A  SER EFETUADO  NO  VENCIMENTO. O LANCAMENTO",
						FONT_NORMAL));
		celTexto1.setBorder(Cell.NO_BORDER);
		celTexto1.setHorizontalAlignment(Cell.ALIGN_JUSTIFIED_ALL);
		table.addCell(celTexto1);

		Cell celTexto2 = new Cell(
				new Chunk(
						"CONTABIL FOI FEITO A DEBITO DA CONTA (55.89.1/9) NA AGENCIA/DEPARTAMENTO E A CREDITO DA CONTA",
						FONT_NORMAL));
		celTexto2.setBorder(Cell.NO_BORDER);
		celTexto2.setHorizontalAlignment(Cell.ALIGN_JUSTIFIED_ALL);
		table.addCell(celTexto2);

		Cell celTexto3 = new Cell(
				new Chunk(
						"(17.50.1/9), NA AGENCIA/DEPARTAMENTO CENTRALIZADOR, QUE E O RESPONSAVEL PELO RECOLHIMENTO E PELA",
						FONT_NORMAL));
		celTexto3.setBorder(Cell.NO_BORDER);
		celTexto3.setHorizontalAlignment(Cell.ALIGN_JUSTIFIED_ALL);
		table.addCell(celTexto3);

		Cell celTexto4 = new Cell(new Chunk(
				"GUARDA DOS DOCUMENTOS POR 11 (ONZE) ANOS.", FONT_NORMAL));
		celTexto4.setBorder(Cell.NO_BORDER);
		celTexto4.setHorizontalAlignment(Cell.ALIGN_JUSTIFIED);
		table.addCell(celTexto4);

		Cell celTexto5 = new Cell(
				new Chunk(
						"(NO ATO DO RECOLHIMENTO DEBITAR A CONTA (17.50 - 1/9) QUE DEVERA SER ZERADA).",
						FONT_NORMAL));
		celTexto5.setBorder(Cell.NO_BORDER);
		celTexto5.setHorizontalAlignment(Cell.ALIGN_JUSTIFIED);
		table.addCell(celTexto5);

		return table;
	}

	private Table montarLista(OcorrenciaApuracaoIssDTO ocorrenciaApuracaoIss, Table table,boolean servicoNovo)	throws BadElementException, DocumentException {

		StringBuilder descricaoTipoServico;

		if (servicoNovo) {
			descricaoTipoServico = new StringBuilder();
			descricaoTipoServico.append(ocorrenciaApuracaoIss.getCodigoTipoServico());
			descricaoTipoServico.append("/");
			descricaoTipoServico.append(ocorrenciaApuracaoIss.getDescricaoTipoServico());
			
			Cell celTipoServico = new Cell(new Chunk(descricaoTipoServico.toString(), FONT_NORMAL));
			celTipoServico.setBorder(Cell.NO_BORDER);
			celTipoServico.setColspan(table.getColumns());
			table.addCell(celTipoServico);
			
		}

		if (!ocorrenciaApuracaoIss.isTotal()) {
			montarResultadoTabela(table, ocorrenciaApuracaoIss);
		} else {
			montarTotalTabela(table, ocorrenciaApuracaoIss);
		}

		return table;
	}

	private void montarResultadoTabela(Table table,	OcorrenciaApuracaoIssDTO apuracao) throws BadElementException {
		
		Cell celConta = new Cell(new Chunk(GissUtil.mascaraContaContabil(apuracao.getCosif(), apuracao.getRazao()),FONT_NORMAL));
		celConta.setBorder(Cell.NO_BORDER);
		celConta.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celConta);
		
		if (razaoExiste) {
			Cell celRazao = new Cell(new Chunk(apuracao.getRazao(), FONT_NORMAL));
			celRazao.setBorder(Cell.NO_BORDER);
			celRazao.setHorizontalAlignment(Cell.ALIGN_LEFT);
			table.addCell(celRazao);
		}
		if (aberturaConta) {
			Cell celContaC = new Cell(new Chunk(apuracao.getConta(), FONT_NORMAL));
			celContaC.setBorder(Cell.NO_BORDER);
			celContaC.setHorizontalAlignment(Cell.ALIGN_LEFT);
			table.addCell(celContaC);
		}

		Cell celHistorico = new Cell(new Chunk(apuracao.getNomeContaContabil(), FONT_NORMAL));
		celHistorico.setBorder(Cell.NO_BORDER);
		celHistorico.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celHistorico);

		Cell celLc = new Cell(new Chunk(apuracao.getItemLeiComplementar(), FONT_NORMAL));
		celLc.setBorder(Cell.NO_BORDER);
		celLc.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celLc);

		Cell celReceita = new Cell(new Chunk(NumberUtils.format(apuracao.getValorReceita()), FONT_NORMAL));
		celReceita.setBorder(Cell.NO_BORDER);
		celReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celReceita);

		Cell celAliquota = new Cell(new Chunk(NumberUtils.format(apuracao.getPercentualAliquota()), FONT_NORMAL));
		celAliquota.setBorder(Cell.NO_BORDER);
		celAliquota.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celAliquota);

		Cell celIss = new Cell(new Chunk(NumberUtils.format(apuracao
				.getValorTributo()), FONT_NORMAL));
		celIss.setBorder(Cell.NO_BORDER);
		celIss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celIss);
	}

	private void montarTotalTabela(Table table,
			OcorrenciaApuracaoIssDTO apuracao) throws BadElementException {

		Integer colspan = 4;
		if (razaoExiste) {
			colspan = 5;
		}
		if (aberturaConta) {
			colspan = 6;
		}

		Cell celTotalReceita = new Cell(new Chunk(NumberUtils.format(apuracao
				.getValorReceita()), FONT_NORMAL));
		celTotalReceita.setBorder(Cell.NO_BORDER);
		celTotalReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		celTotalReceita.setColspan(colspan);
		table.addCell(celTotalReceita);

		Cell celTotalIss = new Cell(new Chunk(NumberUtils.format(apuracao
				.getValorTributo()), FONT_NORMAL));
		celTotalIss.setBorder(Cell.NO_BORDER);
		celTotalIss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		celTotalIss.setColspan(2);
		table.addCell(celTotalIss);
	}

	private Table montarCabecalhoTabela( Table table) throws DocumentException {

		Cell celTituloTipoServico = new Cell(new Chunk("TIPO DE SERVICO", FONT_NORMAL));
		celTituloTipoServico.setBorder(Cell.NO_BORDER);
		celTituloTipoServico.setColspan(table.getColumns());
		table.addCell(celTituloTipoServico);

		String nomeColunaConta = "COSIF";

		Cell celTituloConta = new Cell(new Chunk(nomeColunaConta, FONT_NORMAL));
		celTituloConta.setBorder(Cell.NO_BORDER);
		celTituloConta.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloConta);

		if (razaoExiste) {
			Cell cellRazao = new Cell(new Chunk("RAZÃO", FONT_NORMAL));
			cellRazao.setBorder(Cell.NO_BORDER);
			cellRazao.setHorizontalAlignment(Cell.ALIGN_LEFT);
			table.addCell(cellRazao);
		}
		
		if (aberturaConta) {
			Cell cellConta = new Cell(new Chunk("CONTA", FONT_NORMAL));
			cellConta.setBorder(Cell.NO_BORDER);
			cellConta.setHorizontalAlignment(Cell.ALIGN_LEFT);
			table.addCell(cellConta);
		}

		Cell celTituloHistorico = new Cell(new Chunk("TITULO DA CONTA",	FONT_NORMAL));
		celTituloHistorico.setBorder(Cell.NO_BORDER);
		celTituloHistorico.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTituloHistorico);

		Cell celTituloLc = new Cell(new Chunk("ITEM L.C.", FONT_NORMAL));
		celTituloLc.setBorder(Cell.NO_BORDER);
		celTituloLc.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celTituloLc);

		Cell celTituloReceita = new Cell(new Chunk("RECEITA", FONT_NORMAL));
		celTituloReceita.setBorder(Cell.NO_BORDER);
		celTituloReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloReceita);

		Cell celTituloAliquota = new Cell(new Chunk("ALIQUOTA", FONT_NORMAL));
		celTituloAliquota.setBorder(Cell.NO_BORDER);
		celTituloAliquota.setHorizontalAlignment(Cell.ALIGN_CENTER);
		table.addCell(celTituloAliquota);

		Cell celTituloIss = new Cell(new Chunk("ISS", FONT_NORMAL));
		celTituloIss.setBorder(Cell.NO_BORDER);
		celTituloIss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
		table.addCell(celTituloIss);

		return table;
	}

	private Table montarTotalGeral(RelatorioApuracaoIssDTO relatorioApuracaoIssDTO, Table table)	throws DocumentException {

		Integer colspan = 3;
		if (razaoExiste) {
			colspan = 4;
		}
		
		if(aberturaConta){
			Cell celRedutor = new Cell(new Chunk("REDUTOR.........................................................", FONT_NORMAL));
			celRedutor.setBorder(Cell.NO_BORDER);
			celRedutor.setHorizontalAlignment(Cell.ALIGN_LEFT);
			celRedutor.setColspan(colspan);
			table.addCell(celRedutor);

			
			Cell celSinalRedutor = new Cell(new Chunk("(-)", FONT_NORMAL));
			celSinalRedutor.setBorder(Cell.NO_BORDER);
			celSinalRedutor.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			celSinalRedutor.setColspan(3);
			table.addCell(celSinalRedutor);

			Cell celValorRedutor = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorRedutor()), FONT_NORMAL));
			celValorRedutor.setBorder(Cell.NO_BORDER);
			celValorRedutor.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			table.addCell(celValorRedutor);
		
			
			Cell celTotalAgencia = new Cell(new Chunk("TOTAL AGENCIA...................................................", FONT_NORMAL));
			celTotalAgencia.setBorder(Cell.NO_BORDER);
			celTotalAgencia.setHorizontalAlignment(Cell.ALIGN_LEFT);
			celTotalAgencia.setColspan(colspan);
			table.addCell(celTotalAgencia);
			
			Cell celValorTotalReceita = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalReceita()), FONT_NORMAL));
			celValorTotalReceita.setBorder(Cell.NO_BORDER);
			celValorTotalReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			celValorTotalReceita.setColspan(3);
			table.addCell(celValorTotalReceita);

			Cell celValorTotalIss = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalIss()), FONT_NORMAL));
			celValorTotalIss.setBorder(Cell.NO_BORDER);
			celValorTotalIss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			table.addCell(celValorTotalIss);
		}else{
			Cell celRedutor = new Cell(new Chunk("REDUTOR.........................................................", FONT_NORMAL));
			celRedutor.setBorder(Cell.NO_BORDER);
			celRedutor.setHorizontalAlignment(Cell.ALIGN_LEFT);
			celRedutor.setColspan(colspan);
			table.addCell(celRedutor);
	
			Cell celSinalRedutor = new Cell(new Chunk("(-)", FONT_NORMAL));
			celSinalRedutor.setBorder(Cell.NO_BORDER);
			celSinalRedutor.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			celSinalRedutor.setColspan(2);
			table.addCell(celSinalRedutor);
	
			Cell celValorRedutor = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorRedutor()), FONT_NORMAL));
			celValorRedutor.setBorder(Cell.NO_BORDER);
			celValorRedutor.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			table.addCell(celValorRedutor);
	
			Cell celTotalAgencia = new Cell(new Chunk("TOTAL AGENCIA...................................................", FONT_NORMAL));
			celTotalAgencia.setBorder(Cell.NO_BORDER);
			celTotalAgencia.setHorizontalAlignment(Cell.ALIGN_LEFT);
			celTotalAgencia.setColspan(colspan);
			table.addCell(celTotalAgencia);
	
			Cell celValorTotalReceita = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalReceita()), FONT_NORMAL));
			celValorTotalReceita.setBorder(Cell.NO_BORDER);
			celValorTotalReceita.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			table.addCell(celValorTotalReceita);
	
			Cell celValorTotalIss = new Cell(new Chunk(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalIss()), FONT_NORMAL));
			celValorTotalIss.setBorder(Cell.NO_BORDER);
			celValorTotalIss.setHorizontalAlignment(Cell.ALIGN_RIGHT);
			celValorTotalIss.setColspan(2);
			table.addCell(celValorTotalIss);			
		}

		return table;
	}

	private Table montarRodape() throws BadElementException, DocumentException {
		Table table = new Table(5);
		table.setWidth(100);
		table.setWidths(new int[] { 12, 44, 1, 5, 38 });
		table.setBorder(Rectangle.NO_BORDER);

		Cell celTitulo = new Cell(
				new Chunk(
						"ASSUMO INTEIRA RESPONSABILIDADE PELA EXATIDAO DOS DADOS FORNECIDOS:",
						FONT_NORMAL));
		celTitulo.setBorder(Cell.NO_BORDER);
		celTitulo.setHorizontalAlignment(Cell.ALIGN_LEFT);
		celTitulo.setColspan(5);
		table.addCell(celTitulo);

		Cell celNome = new Cell(new Chunk("NOME:", FONT_NORMAL));
		celNome.setBorder(Cell.NO_BORDER);
		celNome.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celNome);

		Cell celNomePreenchimento = new Cell();
		celNomePreenchimento.setBorder(Cell.BOTTOM);
		table.addCell(celNomePreenchimento);

		Cell celEspaco = new Cell();
		celEspaco.setBorder(Cell.NO_BORDER);
		table.addCell(celEspaco);

		Cell celCpf = new Cell(new Chunk("CPF:", FONT_NORMAL));
		celCpf.setBorder(Cell.NO_BORDER);
		table.addCell(celCpf);

		Cell celCpfPreenchimento = new Cell();
		celCpfPreenchimento.setBorder(Cell.BOTTOM);
		table.addCell(celCpfPreenchimento);

		Cell celTelefone = new Cell(new Chunk("TELEFONE:", FONT_NORMAL));
		celTelefone.setBorder(Cell.NO_BORDER);
		celTelefone.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celTelefone);

		Cell celTelefonePreenchimento = new Cell();
		celTelefonePreenchimento.setBorder(Cell.BOTTOM);
		table.addCell(celTelefonePreenchimento);

		table.addCell(celEspaco);

		Cell celData = new Cell(new Chunk("DATA:", FONT_NORMAL));
		celData.setBorder(Cell.NO_BORDER);
		table.addCell(celData);

		Cell celDataPreenchimento = new Cell();
		celDataPreenchimento.setBorder(Cell.BOTTOM);
		table.addCell(celDataPreenchimento);

		Cell celAssinatura = new Cell(new Chunk("ASSINATURA:", FONT_NORMAL));
		celAssinatura.setBorder(Cell.NO_BORDER);
		celAssinatura.setHorizontalAlignment(Cell.ALIGN_LEFT);
		table.addCell(celAssinatura);

		Cell celAssPreenchimento = new Cell();
		celAssPreenchimento.setBorder(Cell.BOTTOM);
		table.addCell(celAssPreenchimento);

		Cell celEspacoAss = new Cell();
		celEspacoAss.setBorder(Cell.NO_BORDER);
		celEspacoAss.setColspan(3);
		table.addCell(celEspacoAss);

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
