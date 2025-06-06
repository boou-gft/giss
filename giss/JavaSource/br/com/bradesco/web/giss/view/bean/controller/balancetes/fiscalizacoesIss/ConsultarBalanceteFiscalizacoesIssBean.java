package br.com.bradesco.web.giss.view.bean.controller.balancetes.fiscalizacoesIss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssService;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ConsultarBalanceteFiscalizacoesIssDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesEntradaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesOcorrenciasSaidaDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

@SuppressWarnings("deprecation")
public class ConsultarBalanceteFiscalizacoesIssBean {

	private ConsultarBalanceteFiscalizacoesIssDTO consultarBalanceteFiscalizacoesIssDTO;
	private IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl;

	public String inicializaConsultarBalanceteFiscalizacoesIss(){
		consultarBalanceteFiscalizacoesIssDTO = new ConsultarBalanceteFiscalizacoesIssDTO();
	
		try {
			listarPedidoBalancetes();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "consultarBalancetesFiscalizacoesIss";
	}
	
	private void listarPedidoBalancetes() {
		consultarBalanceteFiscalizacoesIssDTO.setListarPedidoBalancetes(balancetesFiscalizacoesIssServiceImpl.listarPedidoBalancetes(1));

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
			
			consultarBalanceteFiscalizacoesIssDTO.setItemBalanceteSelecionado(null);
			
			return "consultarDetalhesBalancetesFiscalizacoesIss";
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "";
	}
	
	private void listaIntermediariaBalancetes() {
		consultarBalanceteFiscalizacoesIssDTO.setListaIntermediariaBalancetes(balancetesFiscalizacoesIssServiceImpl.listaIntermediariaBalancetes(consultarBalanceteFiscalizacoesIssDTO.getListarPedidoBalancetes().get(consultarBalanceteFiscalizacoesIssDTO.getItemSelecionadoListaPedidoBalancetes()).getCodSolicitacaoBalancete(), 1));

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
	
	public void gerarExcel(ActionEvent evt) throws IOException{
		criarExcel();
		disponibilizarExcel();
	}
	
	public void criarExcel() throws IOException{
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Balancete");

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
		
		ListarBalancetesEntradaDTO entrada = new ListarBalancetesEntradaDTO();
		
		consultarBalanceteFiscalizacoesIssDTO.setListaControleBalancetes(new ArrayList<SelectItem>());

		for(Integer chk : consultarBalanceteFiscalizacoesIssDTO.getItemBalanceteSelecionado()){
			entrada.setCodSolicitacaoBalancete(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodSolicitacaoBalancete());
			entrada.setCodMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodMunicipio());
			entrada.setDtMesAno(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getDtMesAnoApuracao());
			entrada.setCodDependencia(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia());
	
			try {
				consultarBalanceteFiscalizacoesIssDTO.setListarBalancetes(balancetesFiscalizacoesIssServiceImpl.listarBalancetes(entrada));
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalheBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}

			if(rownum > 0){
				row = sheet.createRow(rownum++);
				cell = row.createCell(0);
				cell.setCellStyle(titleStyle);
				cell.setCellValue("");
			}
			
			sheet.addMergedRegion(new CellRangeAddress(rownum,rownum,0,4));
			
			row = sheet.createRow(rownum++);
			cell = row.createCell(0);
			cell.setCellStyle(titleStyle);
			
			String descTipoSaldo;
			
			if("F".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodTipoBalancete())){
				descTipoSaldo = "FECHADO";
			}else{
				descTipoSaldo = "SIMULADO";
			}

			cell.setCellValue("BALANCETE GERAL MENSAL DE " + consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getPeriodo() + " - SALDO " + descTipoSaldo);
			
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
	
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				cell.setCellValue("CNPJ: " + cnpjEmpresa);
			}else{
				cell.setCellValue("CNPJ: " + cnpjEmpresa.substring(0,cnpjEmpresa.indexOf("/")));
			}
			
			row = sheet.createRow(rownum++);
			cell = row.createCell(0);
			cell.setCellStyle(headerStyle);
			
			String descAgencia = "";
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				descAgencia = consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescDependencia();
			}
	
			cell.setCellValue("AGENCIA: " + descAgencia);
			
			cell = row.createCell(1);
			cell.setCellStyle(headerStyle);
			cell.setCellValue("UF: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getSiglaUf());
			
			cell = row.createCell(2);
			cell.setCellStyle(headerStyle);
			cell.setCellValue("MUNICIPIO: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescMunicipio());
			
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
					cell.setCellValue(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta().toString(), 7) + "-" + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDigConta() + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento());
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
		}
		
		File path = new File("\\suportedbdc_apl\\intranet\\balancetesGISS");
		
        if(!path.exists()){
        	path.mkdir();
        }
	
		FileOutputStream out = new FileOutputStream(new File("\\suportedbdc_apl\\intranet\\balancetesGISS\\balancete.xls"));
		workbook.write(out);
		out.close();
	}

	public void disponibilizarExcel() throws IOException{
		File file = new File("\\suportedbdc_apl\\intranet\\balancetesGISS\\balancete.xls");
		
		InputStream fis = new FileInputStream(file);
		
		byte[] buf = new byte[(int) file.length()];
		
		int offset = 0;
		
		int numRead = 0;
		
		while ((offset < buf.length) && ((numRead = fis.read(buf, offset, buf.length -offset)) >= 0)){
			offset += numRead;
		}
		
		fis.close();
		
		java.util.Date atual = new java.util.Date();

		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("dd/MM/yyyy_hh:mm:ss_SSS");

		String nomeArquivo = "balancete_" + formater.format(atual);
		
		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename=" + nomeArquivo + ".xls");
		response.getOutputStream().write(buf);
		response.getOutputStream().flush();
		response.getOutputStream().close();
		
		file.delete();
		
		FacesContext.getCurrentInstance().responseComplete();
	}
	
	public void gerarTxt(ActionEvent evt) throws IOException{
		criarTxt();
		disponibilizarTxt();
	}
	
	public void criarTxt() throws IOException{
		File path = new File("\\suportedbdc_apl\\intranet\\balancetesGISS");
		
        if(!path.exists()){
        	path.mkdir();
        }
        
        int rownum = 0;
		
		FileWriter arq = new FileWriter("\\suportedbdc_apl\\intranet\\balancetesGISS\\balancete.txt");
	    
	    PrintWriter gravarArq = new PrintWriter(arq);

	    ListarBalancetesEntradaDTO entrada = new ListarBalancetesEntradaDTO();
		
		consultarBalanceteFiscalizacoesIssDTO.setListaControleBalancetes(new ArrayList<SelectItem>());

		for(Integer chk : consultarBalanceteFiscalizacoesIssDTO.getItemBalanceteSelecionado()){
			entrada.setCodSolicitacaoBalancete(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodSolicitacaoBalancete());
			entrada.setCodMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodMunicipio());
			entrada.setDtMesAno(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getDtMesAnoApuracao());
			entrada.setCodDependencia(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia());
	
			try {
				consultarBalanceteFiscalizacoesIssDTO.setListarBalancetes(balancetesFiscalizacoesIssServiceImpl.listarBalancetes(entrada));
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalheBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
			
			if(rownum > 0){
				gravarArq.append("\r\n");
				gravarArq.append("\r\n");
			}
	    
		    String descTipoSaldo;
			
			if("F".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodTipoBalancete())){
				descTipoSaldo = "FECHADO";
			}else{
				descTipoSaldo = "SIMULADO";
			}
	
		    gravarArq.append("											BALANCETE GERAL MENSAL DE " + consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getPeriodo() + " - SALDO " + descTipoSaldo);
		    
		    gravarArq.append("\r\n");
		    gravarArq.append("\r\n");
	
		    String descEmpresa = consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodEmpresa() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescEmpresa();
			
		    gravarArq.append(GissUtil.complementaEspacos("EMPRESA: " + descEmpresa, 70));
	
			String cnpjEmpresa = GissUtil.formatarCNPJComMascara(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCpfCnpj().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getFilial().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getControle().toString());
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				gravarArq.append("CNPJ: " + cnpjEmpresa);
			}else{
				gravarArq.append("CNPJ: " + cnpjEmpresa.substring(0,cnpjEmpresa.indexOf("/")));
			}
	
			String descAgencia = "";
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				descAgencia = consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescDependencia();
			}
			
			gravarArq.append("\r\n");
			
			gravarArq.append(GissUtil.complementaEspacos("AGENCIA: " + descAgencia, 70));
	
			gravarArq.append(GissUtil.complementaEspacos("UF: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getSiglaUf(), 50));
	
			gravarArq.append("MUNICIPIO: " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescMunicipio());
	
			gravarArq.append("\r\n");
			gravarArq.append("\r\n");
			
			gravarArq.append(GissUtil.complementaEspacos("CONTA", 85));
			gravarArq.append(GissUtil.complementaEspacos("SALDO ANTERIOR", 42));
			gravarArq.append(GissUtil.complementaEspacos("DEBITO", 33));
			gravarArq.append(GissUtil.complementaEspacos("CREDITO", 30));
			gravarArq.append("SALDO ATUAL");
			
			gravarArq.append("\r\n");
			
			for (int x = 0; x < consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().size(); x++) {
				gravarArq.append("\r\n");
				
				if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() <= 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
					gravarArq.append(GissUtil.complementaEspacos(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
				}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() <= 0){
					gravarArq.append(GissUtil.complementaEspacos(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil().toString(), 2) + "-" + GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodSubgrupoContabil().toString(), 2) + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
				}else if(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodCosif() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodGrupoContabil() > 0 && consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta() > 0){
					gravarArq.append(GissUtil.complementaEspacos(GissUtil.preencherZerosEsquerda(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getCodConta().toString(), 7) + "-" + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDigConta() + " " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getDescLancamento(), 65));
				}
	
				gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAnterior()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAnterior(), 34));
			
				gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoDebito()).toString(), 34));
				
				gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoCredito()).toString(), 34));
				
				gravarArq.append(GissUtil.complementaEspacosEsquerda(GissUtil.formatarValoresBig(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getVlrSaldoAtual()).toString() + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().get(x).getSinalSaldoAtual(), 34));
			}
			
			rownum++;
		}

	    arq.close();
	}
	
	public void disponibilizarTxt() throws IOException{
		File file = new File("\\suportedbdc_apl\\intranet\\balancetesGISS\\balancete.txt");
		
		InputStream fis = new FileInputStream(file);
		
		byte[] buf = new byte[(int) file.length()];
		
		int offset = 0;
		
		int numRead = 0;
		
		while ((offset < buf.length) && ((numRead = fis.read(buf, offset, buf.length -offset)) >= 0)){
			offset += numRead;
		}
		
		fis.close();
		
		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		
		java.util.Date atual = new java.util.Date();

		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("dd/MM/yyyy_hh:mm:ss_SSS");

		String nomeArquivo = "balancete_" + formater.format(atual);
		
		response.setContentType("text/plain");
		response.setHeader("Content-Disposition", "attachment;filename=" + nomeArquivo + ".txt");
		response.getOutputStream().write(buf);
		response.getOutputStream().flush();
		response.getOutputStream().close();
		
		file.delete();
		
		FacesContext.getCurrentInstance().responseComplete();
	}

	public void gerarPdf(ActionEvent evt) throws JRException, IOException{
		disponibilizarPdf();
	}
	
	public void disponibilizarPdf() throws JRException, IOException{
		Collection colRelatorio = new ArrayList();
		
		HashMap parametros = new HashMap();
		
		byte[] bytes = null;
		
		Vector vetPdf = new Vector();
		
		ListarBalancetesEntradaDTO entrada = new ListarBalancetesEntradaDTO();
		
		consultarBalanceteFiscalizacoesIssDTO.setListaControleBalancetes(new ArrayList<SelectItem>());

		for(Integer chk : consultarBalanceteFiscalizacoesIssDTO.getItemBalanceteSelecionado()){
			entrada.setCodSolicitacaoBalancete(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodSolicitacaoBalancete());
			entrada.setCodMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodMunicipio());
			entrada.setDtMesAno(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getDtMesAnoApuracao());
			entrada.setCodDependencia(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia());
	
			try {
				consultarBalanceteFiscalizacoesIssDTO.setListarBalancetes(balancetesFiscalizacoesIssServiceImpl.listarBalancetes(entrada));
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarDetalheBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}

			String descTipoSaldo;
			
			if("F".equals(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodTipoBalancete())){
				descTipoSaldo = "FECHADO";
			}else{
				descTipoSaldo = "SIMULADO";
			}

		    String descEmpresa = consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCodEmpresa() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescEmpresa();

			String cnpjEmpresa = GissUtil.formatarCNPJComMascara(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getCpfCnpj().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getFilial().toString(), consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getControle().toString());
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				cnpjEmpresa = cnpjEmpresa;
			}else{
				cnpjEmpresa = cnpjEmpresa.substring(0,cnpjEmpresa.indexOf("/"));
			}
	
			String descAgencia = "";
			
			if(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() > 0){
				descAgencia = consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia() + " - " + consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescDependencia();
			}

			for (ListarBalancetesOcorrenciasSaidaDTO itemLista : consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias()) {
				
				itemLista.setPeriodo(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getPeriodo());
				itemLista.setSaldo(descTipoSaldo);
				itemLista.setEmpresa(descEmpresa);
				itemLista.setAgencia(descAgencia);
				itemLista.setCnpj(cnpjEmpresa);
				itemLista.setUf(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getSiglaUf());
				itemLista.setMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getDescMunicipio());
				
				if(itemLista.getCodCosif() > 0 && itemLista.getCodGrupoContabil() <= 0 && itemLista.getCodConta() <= 0){
					itemLista.setDescLancamento(GissUtil.complementaEspacosEsquerda("", (itemLista.getNivelLancamento() * 2)) + itemLista.getCodCosif() + " " + itemLista.getDescLancamento());
					itemLista.setFlagCosif("S");
				}else if(itemLista.getCodCosif() > 0 && itemLista.getCodGrupoContabil() > 0 && itemLista.getCodConta() <= 0){
					itemLista.setDescLancamento(GissUtil.complementaEspacosEsquerda("", (itemLista.getNivelLancamento() * 2)) + GissUtil.preencherZerosEsquerda(itemLista.getCodGrupoContabil().toString(), 2) + "-" + GissUtil.preencherZerosEsquerda(itemLista.getCodSubgrupoContabil().toString(), 2) + " " + itemLista.getDescLancamento());
					itemLista.setFlagCosif("");
				}else if(itemLista.getCodCosif() > 0 && itemLista.getCodGrupoContabil() > 0 && itemLista.getCodConta() > 0){
					itemLista.setDescLancamento(GissUtil.complementaEspacosEsquerda("", (itemLista.getNivelLancamento() * 2)) + GissUtil.preencherZerosEsquerda(itemLista.getCodConta().toString(), 7) + "-" + itemLista.getDigConta() + " " + itemLista.getDescLancamento());
					itemLista.setFlagCosif("");
				}
				vetPdf.add(itemLista);
			}
		}
		
		consultarBalanceteFiscalizacoesIssDTO.setLstPdf((Collection) vetPdf);

		String caminhoRelativo = FacesUtils.getServletContext().getRealPath("/relatorio");
		
		consultarBalanceteFiscalizacoesIssDTO.setDiretorioRelatorio(caminhoRelativo + "/");
		
		colRelatorio.add(consultarBalanceteFiscalizacoesIssDTO);
		
		JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(colRelatorio);
		
		bytes = JasperRunManager.runReportToPdf((caminhoRelativo + "/balancete.jasper"), parametros, beanCollectionDataSource);

		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		
		java.util.Date atual = new java.util.Date();

		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("dd/MM/yyyy_hh:mm:ss_SSS");

		String nomeArquivo = "balancete_" + formater.format(atual);
		
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		response.setHeader("Content-Disposition", "attachment;filename=" + nomeArquivo + ".pdf");
		response.getOutputStream().write(bytes);
		response.getOutputStream().flush();
		response.getOutputStream().close();

		FacesContext.getCurrentInstance().responseComplete();
	}
	
	private void listarBalancetes() {
		ListarBalancetesEntradaDTO entrada = new ListarBalancetesEntradaDTO();
		
		consultarBalanceteFiscalizacoesIssDTO.setListaControleBalancetes(new ArrayList<SelectItem>());

		for(Integer chk : consultarBalanceteFiscalizacoesIssDTO.getItemBalanceteSelecionado()){
			entrada.setCodSolicitacaoBalancete(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodSolicitacaoBalancete());
			entrada.setCodMunicipio(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodMunicipio());
			entrada.setDtMesAno(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getDtMesAnoApuracao());
			entrada.setCodDependencia(consultarBalanceteFiscalizacoesIssDTO.getListaIntermediariaBalancetes().get(chk).getCodDependencia());
	
			consultarBalanceteFiscalizacoesIssDTO.setListarBalancetes(balancetesFiscalizacoesIssServiceImpl.listarBalancetes(entrada));
	
			if (consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes() != null) {
				for (int i = 0; i < consultarBalanceteFiscalizacoesIssDTO.getListarBalancetes().getListarBalancetesOcorrencias().size(); i++) {
					consultarBalanceteFiscalizacoesIssDTO.getListaControleBalancetes().add(new SelectItem(i, " "));
				}
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
		return "consultarBalancetesFiscalizacoesIss";
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