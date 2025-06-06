/**
 * 
 * @author: Wellington Gonçalves Pires - Foursys
 * 
 * */

package br.com.bradesco.web.giss.utils;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.PlanilhaConstants;

public abstract class PlanilhaEletronica implements PlanilhaConstants {

	private int indiceLinha = 0;

	private XSSFWorkbook workBook = new XSSFWorkbook();
	private XSSFSheet planilha;

	private Cell celula;
	private Row linha;

	private FileOutputStream saida;

	private HSSFPalette palette;
	private XSSFColor color = new XSSFColor(new java.awt.Color(33, 83, 148));
	private XSSFColor color_alternativa = new XSSFColor(new java.awt.Color(64, 49, 81));
	private HSSFPalette palette_alternativa;
	private XSSFFont timesNewRomanFontBold;
	private XSSFFont timesNewRomanFontNormal;
	private XSSFCellStyle bordaPadrao;
	private XSSFCellStyle padrao1;
	private XSSFCellStyle padrao2;
	private XSSFCellStyle estiloTitulo;
	private XSSFCellStyle estiloTitulo_alternativo;
	private XSSFCellStyle estiloCabecalho;
	private XSSFCellStyle estiloCabecalho_alternativo;
	private XSSFCellStyle estiloRegistros;
	private XSSFCellStyle estiloPersonalizado;

	private String nomeArquivo;

	public PlanilhaEletronica(String nomePlanilha, String nomeArquivo) {

		setPlanilha(getWorkBook().createSheet(nomePlanilha));

		this.nomeArquivo = nomeArquivo;

		/* =================FORMATAÇÕES====================== */
		//33 83 148
//		getColor().setRgb(new byte[]{new Byte((byte) 41), new Byte((byte) 33), new Byte((byte) 83), new Byte((byte) 127)});
//		getColor_alternativa().setRgb(new byte[]{new Byte((byte) 42), new Byte((byte) 64),new Byte((byte) 49), new Byte((byte) 81)});
		
		
//		setPalette(getWorkBook().getCustomPalette());
//		setPalette_alternativa(getWorkBook().getCustomPalette());

//		getPalette().setColorAtIndex(, new Byte((byte) 54),new Byte((byte) 96), new Byte((byte) 146));
//		getPalette_alternativa().setColorAtIndex(new Byte((byte) 42), new Byte((byte) 64),new Byte((byte) 49), new Byte((byte) 81));
		
		setTimesNewRomanFontBold(getWorkBook().createFont());
		getTimesNewRomanFontBold().setFontName("Times New Roman");
		getTimesNewRomanFontBold().setColor(HSSFColor.WHITE.index);
		getTimesNewRomanFontBold().setFontHeightInPoints((short) 12);
		getTimesNewRomanFontBold().setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

		setTimesNewRomanFontNormal(getWorkBook().createFont());
		getTimesNewRomanFontNormal().setFontName("Times New Roman");
		getTimesNewRomanFontNormal().setColor(HSSFColor.BLACK.index);
		getTimesNewRomanFontNormal().setFontHeightInPoints((short) 12);

		setBordaPadrao(getWorkBook().createCellStyle());
		getBordaPadrao().setBorderLeft(HSSFCellStyle.BORDER_THIN);
		getBordaPadrao().setBorderRight(HSSFCellStyle.BORDER_THIN);
		getBordaPadrao().setBorderTop(HSSFCellStyle.BORDER_THIN);
		getBordaPadrao().setBorderBottom(HSSFCellStyle.BORDER_THIN);

		setPadrao1(getWorkBook().createCellStyle());
		getPadrao1().cloneStyleFrom(getBordaPadrao());
		getPadrao1().setFont(getTimesNewRomanFontBold());

		setPadrao2(getWorkBook().createCellStyle());
		getPadrao2().cloneStyleFrom(getBordaPadrao());
		getPadrao2().setFont(getTimesNewRomanFontNormal());

		setEstiloTitulo(getWorkBook().createCellStyle());
		getEstiloTitulo().cloneStyleFrom(getPadrao1());
		getEstiloTitulo().setAlignment(CellStyle.ALIGN_CENTER);
		getEstiloTitulo().setFillForegroundColor(getColor());
		getEstiloTitulo().setFillPattern(CellStyle.SOLID_FOREGROUND);

		setEstiloTitulo_alternativo(getWorkBook().createCellStyle());
		getEstiloTitulo_alternativo().cloneStyleFrom(getPadrao1());
		getEstiloTitulo_alternativo().setAlignment(CellStyle.ALIGN_CENTER);
		getEstiloTitulo_alternativo().setFillForegroundColor(getColor());
		getEstiloTitulo_alternativo().setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		setEstiloCabecalho(getWorkBook().createCellStyle());
		getEstiloCabecalho().cloneStyleFrom(getPadrao1());
		getEstiloCabecalho().setFillForegroundColor(getColor());
		getEstiloCabecalho().setFillPattern(CellStyle.SOLID_FOREGROUND);
		getEstiloCabecalho().setAlignment(CellStyle.ALIGN_LEFT);
		
		setEstiloCabecalho_alternativo(getWorkBook().createCellStyle());
		getEstiloCabecalho_alternativo().cloneStyleFrom(getPadrao1());
		getEstiloCabecalho_alternativo().setFillForegroundColor(getColor_alternativa());
		getEstiloCabecalho_alternativo().setFillPattern(CellStyle.SOLID_FOREGROUND);
		getEstiloCabecalho_alternativo().setAlignment(CellStyle.ALIGN_LEFT);
		
		setEstiloRegistros(getWorkBook().createCellStyle());
		getEstiloRegistros().cloneStyleFrom(getPadrao2());

		setEstiloPersonalizado(getWorkBook().createCellStyle());
		getEstiloPersonalizado().cloneStyleFrom(getPadrao2());
		getEstiloPersonalizado().setAlignment(CellStyle.ALIGN_CENTER);

	}

	protected void criaTitulo(int indiceCelula, Object valor, CellStyle estilo) throws Exception {

		try {
			criaLinha(indiceLinha++);

			criaCelula(indiceCelula, valor, estilo);
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaCabecalho(HashMap<Integer, Object> cabecalho,CellStyle estilo) throws Exception {

		try {
			criaLinha(indiceLinha++);

			for (Integer chave : cabecalho.keySet()) {

				criaCelula(chave, String.valueOf(cabecalho.get(chave)), estilo);

			}
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaRegistros(HashMap<Integer, HashMap<Integer, Object>> registro,CellStyle estilo) throws Exception {
		
		try {
			SortedSet<Integer> keys = new TreeSet<Integer>(registro.keySet());
			
			for (Integer chave : keys) {

				criaRegistro(registro.get(chave), estilo);

			}
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaRegistro(HashMap<Integer, Object> registro, CellStyle estilo) throws Exception {

		try {
			criaLinha(indiceLinha++);

			SortedSet<Integer> keys = new TreeSet<Integer>(registro.keySet());
			
			for (Integer chave : keys) {

				criaCelula(chave, registro.get(chave), estilo);

			}
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criarCelulaPersonalizada(int indexCelula, Object valor,CellStyle estilo) throws Exception {

		try {
			criarCelulaComIndice(indexCelula, indiceLinha++, valor, estilo);
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criarCelulaComIndice(int indexCelula, int indexLinha,Object valor, CellStyle estilo) throws Exception {

		try {
			criaLinha(indexLinha);

			criaCelula(indexCelula, valor, estilo);
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaLinha(int indexLinha) throws Exception {

		try {
			setLinha(getPlanilha().createRow(indexLinha));
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaCelula(int indexCelula, Object valor, CellStyle estilo) throws Exception {

		try {
			setCelula(getLinha().createCell(indexCelula));
			DecimalFormat formatar = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(new Locale ("pt", "BR")));
			
			if (valor instanceof String) {

				getCelula().setCellValue(String.valueOf(valor));

			} else if (valor instanceof Integer) {
				
				getCelula().setCellValue(Integer.parseInt(String.valueOf(valor)));

			} else if (valor instanceof Double) {

				getCelula().setCellValue(formatar.format(valor));

			} else if (valor instanceof Boolean) {

				getCelula().setCellValue(Boolean.valueOf(String.valueOf(valor)));

			} else if (valor instanceof BigDecimal) {
				
				getCelula().setCellValue(formatar.format(((BigDecimal) valor)));

			} else if (valor instanceof Date) {
				
				DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

				getCelula().setCellValue(dataFormatada.format(valor));

			}
			

			if (estilo != null)
				getCelula().setCellStyle(estilo);
			
		} catch (NumberFormatException nfe) {
			throw nfe;
		} catch(Exception e){
			throw e;
		}

	}

	protected void montarFormula(Object coluna, int indexCelula, CellStyle estilo)throws Exception {

		try {
			String formula = "SUM(" + coluna + "8" + ":" + coluna+ (indiceLinha - 1) + ")";

			criaFormula(indexCelula, formula, estilo);
		} catch (Exception e) {
			throw e;
		}

	}

	protected void criaFormula(int indexCelula, String formula, CellStyle estilo) throws Exception {

		try {
			setCelula(getLinha().createCell(indexCelula));
			getCelula().setCellFormula(formula);

			if (estilo != null)
				getCelula().setCellStyle(estilo);
		} catch (FormulaParseException npe) {
			throw npe;
		}catch(Exception e){
			throw e;
		}

	}

	protected void mesclarCelula(int primeiraLinha, int ultimaLinha,int primeiraColuna, int ultimaColuna) throws Exception {

		try {
			getPlanilha().addMergedRegion(new CellRangeAddress(primeiraLinha, ultimaLinha,primeiraColuna, ultimaColuna));

			CellRangeAddress range = new CellRangeAddress(primeiraLinha,ultimaLinha, primeiraColuna, ultimaColuna);

			RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, range, getPlanilha(),getWorkBook());
			RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, range, getPlanilha(),getWorkBook());
			RegionUtil.setBorderRight(CellStyle.BORDER_THIN, range, getPlanilha(),getWorkBook());
			RegionUtil.setBorderTop(CellStyle.BORDER_THIN, range, getPlanilha(),getWorkBook());
		} catch (Exception e) {
			throw e;
		}

	}

	protected void tamanhoDeColuna(int indiceColuna, double tamanho) throws Exception {

		try {

			getPlanilha().setColumnWidth(indiceColuna, (int) Math.ceil(TAMANHO_COLUNA.multiply(new BigDecimal(tamanho)).doubleValue()));

		} catch (Exception e) {
			throw e;
		}
		

	}

	protected void centralizarCelula(int linha, int celula) throws Exception{
		
		try {
			CellStyle centralizado = getWorkBook().createCellStyle();
			centralizado.cloneStyleFrom(getEstiloRegistros());
			centralizado.setAlignment(CellStyle.ALIGN_CENTER);
			
			getPlanilha().getRow(linha).getCell(celula).setCellStyle(centralizado);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void alterarTipoCelula(int linha, int celula,int tipoCelula) throws Exception{
		
		/*
		 * TIPOS DE CELULAS:
		 * 
		 * 0 - Númerico
		 * 1 - Texto
		 * 2 - Formula
		 * 3 - Celula em Branco
		 * 4 - Boleana
		 * 5 - Celula de erro
		 * 
		 * */
		try {
			getPlanilha().getRow(linha).getCell(celula).setCellType(tipoCelula);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected int retornaLinhaAtual() throws Exception {

		return indiceLinha;

	}
	
	protected void celulaADireita(int linha, int celula) throws Exception{
		
		try {
			CellStyle direita = getWorkBook().createCellStyle();
			direita.cloneStyleFrom(getPadrao2());
			direita.setAlignment(CellStyle.ALIGN_RIGHT);
			
			getPlanilha().getRow(linha).getCell(celula).setCellStyle(direita);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void celulaAEsquerda(int linha, int celula) throws Exception{
		
		try {
			CellStyle esquerda = getWorkBook().createCellStyle();
			esquerda.cloneStyleFrom(getPadrao2());
			esquerda.setAlignment(CellStyle.ALIGN_LEFT);
			
			getPlanilha().getRow(linha).getCell(celula).setCellStyle(esquerda);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void aplicarEstilo(int linha, int celula,CellStyle estilo) throws Exception{
		
		try {
			getPlanilha().getRow(linha).getCell(celula).setCellStyle(estilo);
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void pularLinha(int nroLinhas) throws Exception {

		try {
			for (int i = 0; i < nroLinhas; i++) {

				criaLinha(indiceLinha++);

			}

		} catch (Exception e) {
			throw e;
		}

	}
	
	protected void efetuarDownload() throws Exception {

		try {
			ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();

			getWorkBook().write(outByteStream);

			byte[] bytes = outByteStream.toByteArray();

			FacesContext facesContext = FacesContext.getCurrentInstance();
			HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

			ServletOutputStream ouputStream = response.getOutputStream();
			response.setContentType("application/octet-stream");
			response.addHeader("Content-disposition", "attachment;filename="+ nomeArquivo + ".xlsx");
			response.setContentLength(bytes.length);

			// Esse popula o arquivo que será aberto ou salvo
			ouputStream.write(bytes, 0, bytes.length);
			ouputStream.flush();
			ouputStream.close();
			response.flushBuffer();
			facesContext.responseComplete();
		} catch (IOException ioe) {
			throw ioe;
		} catch (Exception e){
			throw e;
		}

	}

	public int getIndiceLinha() {
		return indiceLinha;
	}

	public void setIndiceLinha(int indiceLinha) {
		this.indiceLinha = indiceLinha;
	}

	public XSSFWorkbook getWorkBook() {
		return workBook;
	}

	public void setWorkBook(XSSFWorkbook workBook) {
		this.workBook = workBook;
	}

	public XSSFSheet getPlanilha() {
		return planilha;
	}

	public void setPlanilha(XSSFSheet planilha) {
		this.planilha = planilha;
	}

	public Cell getCelula() {
		return celula;
	}

	public void setCelula(Cell celula) {
		this.celula = celula;
	}

	public Row getLinha() {
		return linha;
	}

	public void setLinha(Row linha) {
		this.linha = linha;
	}

	public FileOutputStream getSaida() {
		return saida;
	}

	public void setSaida(FileOutputStream saida) {
		this.saida = saida;
	}

	public HSSFPalette getPalette() {
		return palette;
	}

	public void setPalette(HSSFPalette palette) {
		this.palette = palette;
	}

	public XSSFColor getColor() {
		return color;
	}

	public void setColor(XSSFColor color) {
		this.color = color;
	}

	public XSSFColor getColor_alternativa() {
		return color_alternativa;
	}

	public void setColor_alternativa(XSSFColor colorAlternativa) {
		color_alternativa = colorAlternativa;
	}

	public HSSFPalette getPalette_alternativa() {
		return palette_alternativa;
	}

	public void setPalette_alternativa(HSSFPalette paletteAlternativa) {
		palette_alternativa = paletteAlternativa;
	}

	public XSSFFont getTimesNewRomanFontBold() {
		return timesNewRomanFontBold;
	}

	public void setTimesNewRomanFontBold(XSSFFont timesNewRomanFontBold) {
		this.timesNewRomanFontBold = timesNewRomanFontBold;
	}

	public XSSFFont getTimesNewRomanFontNormal() {
		return timesNewRomanFontNormal;
	}

	public void setTimesNewRomanFontNormal(XSSFFont timesNewRomanFontNormal) {
		this.timesNewRomanFontNormal = timesNewRomanFontNormal;
	}

	public XSSFCellStyle getBordaPadrao() {
		return bordaPadrao;
	}

	public void setBordaPadrao(XSSFCellStyle bordaPadrao) {
		this.bordaPadrao = bordaPadrao;
	}

	public XSSFCellStyle getPadrao1() {
		return padrao1;
	}

	public void setPadrao1(XSSFCellStyle padrao1) {
		this.padrao1 = padrao1;
	}

	public XSSFCellStyle getPadrao2() {
		return padrao2;
	}

	public void setPadrao2(XSSFCellStyle padrao2) {
		this.padrao2 = padrao2;
	}

	public XSSFCellStyle getEstiloTitulo() {
		return estiloTitulo;
	}

	public void setEstiloTitulo(XSSFCellStyle estiloTitulo) {
		this.estiloTitulo = estiloTitulo;
	}

	public XSSFCellStyle getEstiloTitulo_alternativo() {
		return estiloTitulo_alternativo;
	}

	public void setEstiloTitulo_alternativo(XSSFCellStyle estiloTituloAlternativo) {
		estiloTitulo_alternativo = estiloTituloAlternativo;
	}

	public XSSFCellStyle getEstiloCabecalho() {
		return estiloCabecalho;
	}

	public void setEstiloCabecalho(XSSFCellStyle estiloCabecalho) {
		this.estiloCabecalho = estiloCabecalho;
	}

	public XSSFCellStyle getEstiloCabecalho_alternativo() {
		return estiloCabecalho_alternativo;
	}

	public void setEstiloCabecalho_alternativo(
			XSSFCellStyle estiloCabecalhoAlternativo) {
		estiloCabecalho_alternativo = estiloCabecalhoAlternativo;
	}

	public XSSFCellStyle getEstiloRegistros() {
		return estiloRegistros;
	}

	public void setEstiloRegistros(XSSFCellStyle estiloRegistros) {
		this.estiloRegistros = estiloRegistros;
	}

	public XSSFCellStyle getEstiloPersonalizado() {
		return estiloPersonalizado;
	}

	public void setEstiloPersonalizado(XSSFCellStyle estiloPersonalizado) {
		this.estiloPersonalizado = estiloPersonalizado;
	}

	/**
	 * @return the nomeArquivo
	 */
	public String getNomeArquivo() {
		return nomeArquivo;
	}

	/**
	 * @param nomeArquivo the nomeArquivo to set
	 */
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	
	/* ======== GETTERS E SETTERS ============= */
	

}
