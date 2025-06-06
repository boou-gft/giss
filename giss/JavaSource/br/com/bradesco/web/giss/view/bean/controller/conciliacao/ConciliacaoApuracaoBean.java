package br.com.bradesco.web.giss.view.bean.controller.conciliacao;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ActionEvent;

import org.apache.commons.lang.StringUtils;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.conciliacaoVo;

import com.lowagie.text.DocumentException;

public class ConciliacaoApuracaoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date calendarioAte;
	private HtmlInputText valorAjuste;
	private String Justificativa;
	private boolean tela = true;
	private String mesFiltro;
	private String anoFiltro;
	private BigDecimal valor = null;
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	private ConciliacaoApuracaoVo saida = new ConciliacaoApuracaoVo();
	private DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO = new DetalharJustificativaApuracaoVO();
	private boolean exibirResumo = false;
	private boolean exibirJustificativa = false;
	
	private conciliacaoVo vo = new conciliacaoVo();
	
	
	public String iniciaTela(){
		
		calendarioAte = null;
		valor = null;
		valorAjuste = new HtmlInputText();
		mesFiltro = "";
		anoFiltro = "";
		Justificativa = "";
		tela = false;
		exibirResumo = false;
		exibirJustificativa = false;
		saida = new ConciliacaoApuracaoVo();
		detalharJustificativaApuracaoVO = new DetalharJustificativaApuracaoVO();
		
		
		return "conciliacaoApuracao";
	}

	private void carregarLista() {
		conciliacaoVo item = new conciliacaoVo();
		for (int i = 0; i < 10; i++) {
			item = new conciliacaoVo();
			 item.setCosif("9.9.9.99.99-9");
			 item.setRazao("999-999");
			 item.setConta("9999999-9");
			 item.setDescConta("Descrição de Conta");
			 item.setValor("999.999.999,99");
			 item.setJustificativa("Justificativa" + i);
			 vo.getLista().add(item);
		}
		
	}

	public String iniciaTelaInclusao(){
		
		calendarioAte = null;
		valor = null;
		valorAjuste = new HtmlInputText();
		Justificativa = "";
		mesFiltro = StringUtils.leftPad(GissUtil.extrairMesDataInteiro(new Date()).toString(), 2, "0");
		anoFiltro = GissUtil.extrairAnoDataInteiro(new Date()).toString();
		tela = true;
		exibirResumo = false;
		return "conciliacaoApuracaoInclusao";
	}
	
	public void incluir(){
		String competencias = mesFiltro + anoFiltro;
		Integer dataAtual = Integer.parseInt(StringUtils.leftPad(GissUtil.extrairMesDataInteiro(new Date()).toString(), 2, "0") + GissUtil.extrairAnoDataInteiro(new Date()).toString());
		
		if(competencias.equalsIgnoreCase("")){
			BradescoFacesUtils.addInfoModalMessage("Preencha o campo Competência da Apuração!", false);
		}else{
			if(Integer.parseInt(competencias) >= dataAtual){
				BradescoFacesUtils.addInfoModalMessage("O campo Competência da Apuração tem que ser menor que o mês/ano atual!", false);
			}else{
				if(valorAjuste.getValue() == null){
					BradescoFacesUtils.addInfoModalMessage("Preencha o campo Valor Ajuste!", false);
				}else{
					if(Justificativa.equalsIgnoreCase("")){
						BradescoFacesUtils.addInfoModalMessage("Preencha o campo Justificativa!", false);
					}else{
						ApuracaoMensalDTO item = new ApuracaoMensalDTO();
						ListaGenericaVO parametro = new ListaGenericaVO();
						
	//					parametro.setCompetencia(Integer.valueOf(competencias));
						parametro.setJustificativa(Justificativa);
						parametro.setValorAjuste(String.valueOf(valorAjuste.getValue()));
				    	
						item = apuracaoMensalServiceImpl.incluirJustificativa(parametro);
						BradescoFacesUtils.addInfoModalMessage(item.getMensagem(), false);
					}
				}
			}
		}
		
	}
	
	public void pesquisar(){
		String competencias = anoFiltro + GissUtil.preencherZerosAEsquerda(mesFiltro, 2) ;
		
		if(competencias.equalsIgnoreCase("")){
			BradescoFacesUtils.addInfoModalMessage("Preencha o campo Competência da Apuração!", false);
		}else{
			saida = apuracaoMensalServiceImpl.listarConciliacaoApuracao(competencias);
			exibirResumo = true;
		}
	}

	public void detalharJustificativa(){
		
		Date data = new Date();
	    Calendar c = Calendar.getInstance();
	    c.setTime(data);
	    // formata e exibe a data e hora
	    SimpleDateFormat sdf = new SimpleDateFormat("MM");
	    Integer mes = Integer.parseInt(sdf.format(data));
	    SimpleDateFormat sdfy = new SimpleDateFormat("yyyy");
	    Integer ano = Integer.parseInt(sdfy.format(data));
		
		if(mes == 1){
			mesFiltro = "12";
			anoFiltro = String.valueOf(ano -1);
		}else{
			mesFiltro = String.valueOf(mes -1);
			anoFiltro = String.valueOf(ano);
		}
		
		String competencias = anoFiltro + mesFiltro;
		
		if(competencias.equalsIgnoreCase("")){
			BradescoFacesUtils.addInfoModalMessage("Preencha o campo Competência da Apuração!", false);
		}else{
			detalharJustificativaApuracaoVO = apuracaoMensalServiceImpl.detalharJustificativaApuracao(competencias);
			exibirJustificativa = true;
		}
	}
	
	public void imprimirPlanilha(ActionEvent ae) {

		try {
			detalharJustificativa();
			imprimirPlanilhaConciliacao();
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
	}
	
	private void imprimirPlanilhaConciliacao() throws Exception {

		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Consulta Conciliação da Apuração", "CONCILIACAO_APURACAO");
		exportarPlanilha.planilhaConciliacaoApuracao(saida, detalharJustificativaApuracaoVO);

	}
	
	public String consultarTXT() throws DocumentException, IOException {
		detalharJustificativa();
		getApuracaoMensalServiceImpl().gerarConciliacaoTXT(saida, detalharJustificativaApuracaoVO, FacesUtils.getServletResponse().getOutputStream());
		
		FacesUtils.getServletResponse().setContentType("application/txt");
		FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.txt");
		FacesUtils.getContext().responseComplete();
		
		return null;
	}		
	
	public String consultarPDF() throws DocumentException, IOException {
		detalharJustificativa();
		getApuracaoMensalServiceImpl().gerarPlanilhaConciliacaoPDF(saida, detalharJustificativaApuracaoVO, FacesUtils.getServletResponse().getOutputStream());
		
		FacesUtils.getServletResponse().setContentType("application/pdf");
		FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.pdf");
		FacesUtils.getContext().responseComplete();
		
		return null;
	}
	
	// GETTERS AND SETTERS //

	public Date getCalendarioAte() {
		return calendarioAte;
	}

	public void setCalendarioAte(Date calendarioAte) {
		this.calendarioAte = calendarioAte;
	}

	public String getJustificativa() {
		return Justificativa;
	}

	public void setJustificativa(String justificativa) {
		Justificativa = justificativa;
	}

	public boolean isTela() {
		return tela;
	}

	public void setTela(boolean tela) {
		this.tela = tela;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public HtmlInputText getValorAjuste() {
		return valorAjuste;
	}

	public void setValorAjuste(HtmlInputText valorAjuste) {
		this.valorAjuste = valorAjuste;
	}

	public boolean isExibirResumo() {
		return exibirResumo;
	}

	public ConciliacaoApuracaoVo getSaida() {
		return saida;
	}

	public final DetalharJustificativaApuracaoVO getDetalharJustificativaApuracaoVO() {
		return detalharJustificativaApuracaoVO;
	}

	public final void setDetalharJustificativaApuracaoVO(
			DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO) {
		this.detalharJustificativaApuracaoVO = detalharJustificativaApuracaoVO;
	}

	public void setSaida(ConciliacaoApuracaoVo saida) {
		this.saida = saida;
	}

	public void setExibirResumo(boolean exibirResumo) {
		this.exibirResumo = exibirResumo;
	}
	
	public boolean isExibirJustificativa() {
		return exibirJustificativa;
	}

	public void setExibirJustificativa(boolean exibirJustificativa) {
		this.exibirJustificativa = exibirJustificativa;
	}

	/**
	 * @return the vo
	 */
	public conciliacaoVo getVo() {
		return vo;
	}

	/**
	 * @param vo the vo to set
	 */
	public void setVo(conciliacaoVo vo) {
		this.vo = vo;
	}

}
