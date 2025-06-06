package br.com.bradesco.web.giss.view.bean.controller.balancetes.obrigacoesAcessorias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssService;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ConsultarBalanceteFiscalizacoesIssDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesEntradaDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

@SuppressWarnings("deprecation")
public class ConsultarBalanceteObrigacoesAcessoriasBean {

	private ILogManager log = BradescoCommonServiceFactory.getLogManager();
	private ConsultarBalanceteFiscalizacoesIssDTO consultarBalanceteFiscalizacoesIssDTO;
	private IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl;
	
	public String inicializaConsultarBalanceteObrigacoesAcessorias(){
		consultarBalanceteFiscalizacoesIssDTO = new ConsultarBalanceteFiscalizacoesIssDTO();
	
		try {
			listarPedidoBalancetes();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "consultarBalancetesObrigacoesAcessorias";
	}
	
	private void listarPedidoBalancetes() {
		consultarBalanceteFiscalizacoesIssDTO.setListarPedidoBalancetes(balancetesFiscalizacoesIssServiceImpl.listarPedidoBalancetes(2));

		if (consultarBalanceteFiscalizacoesIssDTO.getListarPedidoBalancetes() != null) {
			
			consultarBalanceteFiscalizacoesIssDTO.setListaControlePedidoBalancetes(new ArrayList<SelectItem>());
			
			for (int i = 0; i < consultarBalanceteFiscalizacoesIssDTO.getListarPedidoBalancetes().size(); i++) {
				consultarBalanceteFiscalizacoesIssDTO.getListaControlePedidoBalancetes().add(new SelectItem(i, " "));
			}
		}
	}
	
	public String prosseguir(){
		try {
			listaIntermediariaBalancetes();
			
			return "consultarDetalhesBalancetesObrigacoesAcessorias";
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "";
	}
	
	private void listaIntermediariaBalancetes() {
		consultarBalanceteFiscalizacoesIssDTO.setListaIntermediariaBalancetes(balancetesFiscalizacoesIssServiceImpl.listaIntermediariaBalancetes(consultarBalanceteFiscalizacoesIssDTO.getListarPedidoBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaPedidoBalancetes()).getCodSolicitacaoBalancete(), 2));

		if (consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes() != null) {
			
			consultarBalanceteFiscalizacoesIssDTO.setListaControleIntermediariaBalancetes(new ArrayList<SelectItem>());
			
			for (int i = 0; i < consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().size(); i++) {
				consultarBalanceteFiscalizacoesIssDTO.getListaControleIntermediariaBalancetes().add(new SelectItem(i, " "));
			}
		}
	}
	
	public void paginarListaPedido(ActionEvent event) {
		listarPedidoBalancetes();
	}
	
	public void paginarListaIntermediaria(ActionEvent event) {
		listaIntermediariaBalancetes();
	}

	public void gerarExcel(ActionEvent evt){
		try {
			listarBalancetes();
			
			criarExcel();
			
			disponibilizarExcel();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalheBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void criarExcel() throws IOException{
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Balancete");
		
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,4));
	
		sheet.setDefaultColumnWidth(15);
		sheet.setDefaultRowHeight((short)400);
	
		int rownum = 0;
		int cellnum = 0;
		Cell cell;
		Row row;
	
		HSSFDataFormat numberFormat = workbook.createDataFormat();
	
		CellStyle titleStyle = workbook.createCellStyle();
		titleStyle.setAlignment(CellStyle.ALIGN_CENTER);
		titleStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setAlignment(CellStyle.ALIGN_LEFT);
		headerStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		
		CellStyle columnLeftStyle = workbook.createCellStyle();
		columnLeftStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		columnLeftStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		columnLeftStyle.setAlignment(CellStyle.ALIGN_LEFT);
		columnLeftStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		
		CellStyle columnRightStyle = workbook.createCellStyle();
		columnRightStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		columnRightStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		columnRightStyle.setAlignment(CellStyle.ALIGN_RIGHT);
		columnRightStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
	
		CellStyle textLeftStyle = workbook.createCellStyle();
		textLeftStyle.setAlignment(CellStyle.ALIGN_LEFT);
		textLeftStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		
		CellStyle textRightStyle = workbook.createCellStyle();
		textRightStyle.setAlignment(CellStyle.ALIGN_RIGHT);
		textRightStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
	
		CellStyle numberStyle = workbook.createCellStyle();
		numberStyle.setDataFormat(numberFormat.getFormat("#,##0.00"));
		numberStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

		row = sheet.createRow(rownum++);
		cell = row.createCell(0);
		cell.setCellStyle(titleStyle);
		
		String descTipoSaldo;
		
		if("F".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodTipoBalancete())){
			descTipoSaldo = "FECHADO";
		}else{
			descTipoSaldo = "SIMULADO";
		}
		
		cell.setCellValue("BALANCETE GERAL MENSAL DE 12/2015 - SALDO " + descTipoSaldo);
		
		row = sheet.createRow(rownum++);
		cell = row.createCell(0);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("");
		
		row = sheet.createRow(rownum++);
		cell = row.createCell(0);
		cell.setCellStyle(headerStyle);
		
		String descEmpresa = consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodEmpresa() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescEmpresa();
		
		cell.setCellValue("EMPRESA: " + descEmpresa);
		
		cell = row.createCell(1);
		cell.setCellStyle(headerStyle);
		
		String cnpjEmpresa = GissUtil.formatarCNPJComMascara(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCpfCnpj().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getFilial().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getControle().toString());
		
		cell.setCellValue("CNPJ: " + cnpjEmpresa);
		
		row = sheet.createRow(rownum++);
		cell = row.createCell(0);
		cell.setCellStyle(headerStyle);
		
		String descAgencia = consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getCodDependencia() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescDependencia();
		
		cell.setCellValue("AGENCIA: " + descAgencia);
		
		cell = row.createCell(1);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("UF: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getSiglaUf());
		
		cell = row.createCell(2);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("MUNICIPIO: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescMunicipio());
		
		row = sheet.createRow(rownum++);
		cell = row.createCell(0);
		cell.setCellStyle(headerStyle);
		
		String descNivel;
		
		if("1".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodNivelConta())){
			descNivel = "COSIF";
		}else if("2".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodNivelConta())){
			descNivel = "RAZAO";
		}else{
			descNivel = "CONTAS";
		}
		
		cell.setCellValue("NIVEL: " + descNivel);
		
		cell = row.createCell(1);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("GRUPO DE CONTA: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodGrupoInicio() + " A " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodGrupoFim());
		
		cellnum = 0;
		
		row = sheet.createRow(rownum++);
		cell = row.createCell(cellnum++);
		cell.setCellStyle(columnLeftStyle);
		cell.setCellValue("CONTA");
	
		cell = row.createCell(cellnum++);
		cell.setCellStyle(columnRightStyle);
		cell.setCellValue("SALDO ANTERIOR");
	
		cell = row.createCell(cellnum++);
		cell.setCellStyle(columnRightStyle);
		cell.setCellValue("DEBITO");
		
		cell = row.createCell(cellnum++);
		cell.setCellStyle(columnRightStyle);
		cell.setCellValue("CREDITO");
		
		cell = row.createCell(cellnum++);
		cell.setCellStyle(columnRightStyle);
		cell.setCellValue("SALDO ATUAL");
	
		for (int x = 0; x < consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().size(); x++) {
			row = sheet.createRow(rownum++);
			cellnum = 0;
		
			cell = row.createCell(cellnum++);
			cell.setCellStyle(textLeftStyle);
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() <= 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
				cell.setCellValue(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento());
			}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
				cell.setCellValue(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil().toString(), 2) + "-" + GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodSubgrupoContabil().toString(), 2) + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento());
			}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() > 0){
				cell.setCellValue(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta().toString(), 7) + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento());
			}

			cell = row.createCell(cellnum++);
			cell.setCellStyle(textRightStyle);
			cell.setCellValue(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAnterior()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAnterior());
		
			cell = row.createCell(cellnum++);
			cell.setCellStyle(textRightStyle);
			cell.setCellValue(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoDebito()).toString());
			
			cell = row.createCell(cellnum++);
			cell.setCellStyle(textRightStyle);
			cell.setCellValue(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoCredito()).toString());
			
			cell = row.createCell(cellnum++);
			cell.setCellStyle(textRightStyle);
			cell.setCellValue(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAtual()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAtual());
		}
		
		File path = new File(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS");
		
        if(!path.exists()){
        	path.mkdir();
        }
	
        FileOutputStream out = null;
        
        try {
        	out = new FileOutputStream(new File(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS" + File.separator + "exemploBalancete.xls"));
    		workbook.write(out);
        } catch (FileNotFoundException e){
        	log.error(
					"ConsultarBalanceteObrigacoesAcessoriasBean.criarExcel() "
					.concat("- Erro ao manipular File"), e);
        }
        
		finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					log.error(
							"ConsultarBalanceteObrigacoesAcessoriasBean.criarExcel() "
							.concat("- Erro ao fechar recurso alocado (File)"), e);
				}
			}
		}
	}

	public void disponibilizarExcel() throws IOException{
		File file = new File(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS" + File.separator + "exemploBalancete.xls");
		
		InputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] buf = new byte[(int) file.length()];
			
			int offset = 0;
			
			int numRead = 0;
			
			while ((offset < buf.length) && ((numRead = fis.read(buf, offset, buf.length -offset)) >= 0)){
				offset += numRead;
			}
			
			fis.close();
			
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
			
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-Disposition", "attachment;filename=exemploBalancete.xls");
			response.getOutputStream().write(buf);
			response.getOutputStream().flush();
			response.getOutputStream().close();
			
			file.delete();
			
			FacesContext.getCurrentInstance().responseComplete();
		} catch (FileNotFoundException e) {
			BradescoFacesUtils.addErrorModalMessage("Erro na manipulação do Arquivo.");
		}
		
		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					BradescoFacesUtils.addErrorModalMessage("Erro na manipulação do Arquivo.");
				}
			}
		}
	}
	
	public void gerarTxt(ActionEvent evt){
		try {
			listarBalancetes();
			
			criarTxt();
			
			disponibilizarTxt();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalheBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void criarTxt() throws IOException{
		File path = new File(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS");
		
        if(!path.exists()){
        	path.mkdir();
        }
		
		FileWriter arq = new FileWriter(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS" + File.separator + "exemploBalancete.txt");
	    
	    PrintWriter gravarArq = new PrintWriter(arq);

	    String descTipoSaldo;
		
		if("F".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodTipoBalancete())){
			descTipoSaldo = "FECHADO";
		}else{
			descTipoSaldo = "SIMULADO";
		}

	    gravarArq.append("											BALANCETE GERAL MENSAL DE 12/2015 - SALDO " + descTipoSaldo);
	    
	    gravarArq.printf("%n");
	    gravarArq.printf("%n");

	    String descEmpresa = consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodEmpresa() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescEmpresa();
		
	    gravarArq.append("EMPRESA: " + descEmpresa + "						");

		String cnpjEmpresa = GissUtil.formatarCNPJComMascara(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCpfCnpj().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getFilial().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getControle().toString());
		
		gravarArq.append("CNPJ: " + cnpjEmpresa);

		String descAgencia = consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getCodDependencia() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescDependencia();

		gravarArq.printf("%n");
		
		gravarArq.append("AGENCIA: " + descAgencia + "					");

		gravarArq.append("UF: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getSiglaUf() + "				");

		gravarArq.append("MUNICIPIO: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescMunicipio());

		gravarArq.printf("%n");
		
		String descNivel;
		
		if("1".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodNivelConta())){
			descNivel = "COSIF";
		}else if("2".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodNivelConta())){
			descNivel = "RAZAO";
		}else{
			descNivel = "CONTAS";
		}
		
		gravarArq.append("NIVEL: " + descNivel + "			");

		gravarArq.append("GRUPO DE CONTA: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodGrupoInicio() + " A " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodGrupoFim());
		
		gravarArq.printf("%n");
		gravarArq.printf("%n");
		
		gravarArq.append(GissUtil.complementaEspacos("CONTA", 85));
		gravarArq.append(GissUtil.complementaEspacos("SALDO ANTERIOR", 42));
		gravarArq.append(GissUtil.complementaEspacos("DEBITO", 33));
		gravarArq.append(GissUtil.complementaEspacos("CREDITO", 30));
		gravarArq.append("SALDO ATUAL");
		
		gravarArq.printf("%n");
		
		for (int x = 0; x < consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().size(); x++) {
			gravarArq.printf("%n");
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() <= 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
				gravarArq.append(GissUtil.complementaEspacos(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
			}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
				gravarArq.append(GissUtil.complementaEspacos(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil().toString(), 2) + "-" + GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodSubgrupoContabil().toString(), 2) + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
			}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() > 0){
				gravarArq.append(GissUtil.complementaEspacos(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta().toString(), 7) + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
			}

			gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAnterior()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAnterior(), 34));
		
			gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoDebito()).toString(), 34));
			
			gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoCredito()).toString(), 34));
			
			gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAtual()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAtual(), 34));
		}

	    arq.close();
	}
	
	public void disponibilizarTxt() throws IOException{
		File file = new File(File.separator + "suportedbdc_apl" + File.separator + "intranet" + File.separator + "balancetesGISS" + File.separator + "exemploBalancete.txt");
		
		InputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] buf = new byte[(int) file.length()];
			
			int offset = 0;
			
			int numRead = 0;
			
			while ((offset < buf.length) && ((numRead = fis.read(buf, offset, buf.length -offset)) >= 0)){
				offset += numRead;
			}
			
			fis.close();
			
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
			
			response.setContentType("text/plain");
			response.setHeader("Content-Disposition", "attachment;filename=exemploBalancete.txt");
			response.getOutputStream().write(buf);
			response.getOutputStream().flush();
			response.getOutputStream().close();
			
			file.delete();
			
			FacesContext.getCurrentInstance().responseComplete();
		
		} catch (FileNotFoundException e) {
			BradescoFacesUtils
					.addErrorModalMessage("Erro na manipulação do arquivo.");
		}

		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					BradescoFacesUtils
							.addErrorModalMessage("Erro na manipulação do arquivo.");
				}
			}
		}

	}
	
	public String gerarPdf(){
		try {
			listarBalancetes();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalhesBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "consultarDetalhesBalancetesObrigacoesAcessorias";
	}
	
	private void listarBalancetes() {
		ListarBalancetesEntradaDTO entrada = new ListarBalancetesEntradaDTO();
		
		entrada.setCodSolicitacaoBalancete(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getCodSolicitacaoBalancete());
		entrada.setCodMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getCodMunicipio());
		entrada.setDtMesAno(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getDtMesAnoApuracao());
		entrada.setCodDependencia(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaIntermediariaBalancetes()).getCodDependencia());

		consultarBalanceteFiscalizacoesIssDTO.setListarBalancetes(balancetesFiscalizacoesIssServiceImpl.listarBalancetes(entrada));

		if (consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes() != null) {
			
			consultarBalanceteFiscalizacoesIssDTO.setListaControleBalancetes(new ArrayList<SelectItem>());
			
			for (int i = 0; i < consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().size(); i++) {
				consultarBalanceteFiscalizacoesIssDTO.getListaControleBalancetes().add(new SelectItem(i, " "));
			}
		}
	}
	
	public boolean isVerificarBotaoProsseguir(){
		if(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaPedidoBalancetes() != null){
			if("5".equals(consultarBalanceteFiscalizacoesIssDTO.getListarPedidoBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaPedidoBalancetes()).getCodSituacaoPedido())){
				return false;
			}
		}
		
		return true;
	}
	
	public String voltar(){
		return "consultarBalancetesObrigacoesAcessorias";
	}

	public IBalancetesFiscalizacoesIssService getBalancetesFiscalizacoesIssServiceImpl() {
		return balancetesFiscalizacoesIssServiceImpl;
	}

	public void setBalancetesFiscalizacoesIssServiceImpl(
			IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl) {
		this.balancetesFiscalizacoesIssServiceImpl = balancetesFiscalizacoesIssServiceImpl;
	}

	public ConsultarBalanceteFiscalizacoesIssDTO getConsultarBalanceteFiscalizacoesIssDTO() {
		return consultarBalanceteFiscalizacoesIssDTO;
	}

	public void setConsultarBalanceteFiscalizacoesIssDTO(
			ConsultarBalanceteFiscalizacoesIssDTO consultarBalanceteFiscalizacoesIssDTO) {
		this.consultarBalanceteFiscalizacoesIssDTO = consultarBalanceteFiscalizacoesIssDTO;
	}
}