package br.com.bradesco.web.giss.view.bean.controller.apuracao.parcial;

import java.util.Calendar;
import java.util.Date;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ApuracaoParcialBean {
	
	private String dataCompetencia;
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	private Boolean exibeFinalizarAg; 
	private Integer diaDe;
	private Integer diaAte;
	private int diaAtual;

	public String inicializaApuracaoParcial() {
		ApuracaoMensalDTO apuracaoParcial = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_PARCIAL, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		dataCompetencia = apuracaoParcial.getCompetencia();
		apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_PARCIAL_PA, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		exibeFinalizarAg = true;
		diaDe = 1;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		diaAte = c.get(Calendar.DAY_OF_MONTH);
		diaAtual = c.get(Calendar.DAY_OF_MONTH);
		return "solicitarApuracaoParcial";
	}
	
	public void prosseguir() {
		if(diaDe == null || diaAte == null){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a data inicial e a data final.", false);
			return;
		}
		if(GissUtil.notNull(diaDe) == 0 || GissUtil.notNull(diaDe) > diaAtual || GissUtil.notNull(diaDe) > GissUtil.notNull(diaAte)){
			BradescoFacesUtils.addInfoModalMessage("Dia inicial não pode ser zero e nem maior que o dia atual.", false);
			return;
		}
		if(GissUtil.notNull(diaAte) < GissUtil.notNull(diaDe) || GissUtil.notNull(diaAte) > diaAtual){
			BradescoFacesUtils.addInfoModalMessage("Dia final não pode ser menor que o dia inicial e nem maior que o dia atual.", false);
			return;
		}
		try {
			String dataIncio = GissUtil.preencherZerosAEsquerda(String.valueOf(getDiaDe()), 2)+"."+dataCompetencia.replace("/", ".");
			String dataFinal = GissUtil.preencherZerosAEsquerda(String.valueOf(getDiaAte()), 2)+"."+dataCompetencia.replace("/", ".");
			ApuracaoMensalDTO apuracaoParcialDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_PARCIAL_AMBOS, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_PROSSEGUIR,dataIncio, dataFinal);
			BradescoFacesUtils.addInfoModalMessage(apuracaoParcialDTO.getMensagem(), "SUCESSO_PROSSEGUIR", BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "solicitarApuracaoParcial", BradescoViewExceptionActionType.ACTION, false);
		} 
	}

	public String voltar() {
		return "solicitarApuracaoParcial";
	}
	
	public String getDataCompetencia() {
		return dataCompetencia;
	}

	public void setDataCompetencia(String dataCompetencia) {
		this.dataCompetencia = dataCompetencia;
	}

	/**
	 * @return the apuracaoMensalServiceImpl
	 */
	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	/**
	 * @param apuracaoMensalServiceImpl the apuracaoMensalServiceImpl to set
	 */
	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	/**
	 * @return the exibeFinalizarAg
	 */
	public Boolean getExibeFinalizarAg() {
		return exibeFinalizarAg;
	}

	/**
	 * @param exibeFinalizarAg the exibeFinalizarAg to set
	 */
	public void setExibeFinalizarAg(Boolean exibeFinalizarAg) {
		this.exibeFinalizarAg = exibeFinalizarAg;
	}

	/**
	 * @return the diaDe
	 */
	public Integer getDiaDe() {
		return diaDe;
	}

	/**
	 * @param diaDe the diaDe to set
	 */
	public void setDiaDe(Integer diaDe) {
		this.diaDe = diaDe;
	}

	/**
	 * @return the diaAte
	 */
	public Integer getDiaAte() {
		return diaAte;
	}

	/**
	 * @param diaAte the diaAte to set
	 */
	public void setDiaAte(Integer diaAte) {
		this.diaAte = diaAte;
	}

}
