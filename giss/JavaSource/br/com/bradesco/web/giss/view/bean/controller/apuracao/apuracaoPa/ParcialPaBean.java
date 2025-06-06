package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;

import java.util.Date;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.utils.GissUtil;


public class ParcialPaBean {
	
	private Date dataInicialHist;	
	private Date dataFinalHist;
	private ListaParcialPaBean listaParcialPaBean = new ListaParcialPaBean();
	private IApuracaoMensalService apuracaoMensalServiceImpl = null;
	
	public String iniciaTela(){
		dataInicialHist = null;
		dataFinalHist = null;
		return "parcialPa";
	}
	
	public String consultar(){
		ApuracaoMensalDTO retorno = new ApuracaoMensalDTO();
		
		String dataInicio = "";
		String dataFim = "";
		
		if(dataInicialHist == null){
			BradescoFacesUtils.addInfoModalMessage("Preencher a Data Inicial!", false);
		}else{
			if(dataFinalHist == null){
				BradescoFacesUtils.addInfoModalMessage("Preencher a Data Fim!", false);
			}else{
				dataInicio = GissUtil.dateToString(dataInicialHist, "dd.MM.yyyy");
				dataFim = GissUtil.dateToString(dataFinalHist, "dd.MM.yyyy");
				
				retorno = apuracaoMensalServiceImpl.consultaApuracaoPa(dataInicio, dataFim);
				//return listaParcialPaBean.iniciaTelaApuracao("P");
			}
		}
		return null;
	}

	// GETTERS AND SETTERS //
	public Date getDataInicialHist() {
		return dataInicialHist;
	}

	public void setDataInicialHist(Date dataInicialHist) {
		this.dataInicialHist = dataInicialHist;
	}

	public Date getDataFinalHist() {
		return dataFinalHist;
	}

	public void setDataFinalHist(Date dataFinalHist) {
		this.dataFinalHist = dataFinalHist;
	}

	public ListaParcialPaBean getListaParcialPaBean() {
		return listaParcialPaBean;
	}

	public void setListaParcialPaBean(ListaParcialPaBean listaParcialPaBean) {
		this.listaParcialPaBean = listaParcialPaBean;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}
	
}
