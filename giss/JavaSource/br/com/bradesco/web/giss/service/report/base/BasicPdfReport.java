package br.com.bradesco.web.giss.service.report.base;

import java.io.OutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;

public abstract class BasicPdfReport {

	protected static final Font FONT_NORMAL = new Font(Font.COURIER, 7);

	protected static final Font FONT_BOLD = new Font(Font.COURIER, 7, Font.BOLD);

	public void gerarPdf(OutputStream outputStream) throws DocumentException {
		Document document = new Document(PageSize.A4.rotate());

		PdfWriter writer = null;
		try {
			writer = PdfWriter.getInstance(document, outputStream);

			document.open();

			popularPdf(document);

			writer.flush();
		} finally {
			if (document != null && document.isOpen()) {
				document.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}
	
	protected abstract void popularPdf(Document document) throws DocumentException;
}
