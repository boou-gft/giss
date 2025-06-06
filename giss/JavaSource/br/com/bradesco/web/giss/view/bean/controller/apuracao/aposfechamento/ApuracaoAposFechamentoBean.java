package br.com.bradesco.web.giss.view.bean.controller.apuracao.aposfechamento;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaoaposfechamento.bean.ApuracaoAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;


public class ApuracaoAposFechamentoBean {

	public String competencia;
	public String dataProcessamento;
	private List<ApuracaoAposFechamentoDTO> processamentosEnvolvidos = new ArrayList<ApuracaoAposFechamentoDTO>();
	private Date dataCaptura;
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	private Boolean exibeFinalizarAg;
	private Boolean exibeFinalizarPa;

	public String inicializaApuracaoAposFechamento(){

		dataCaptura = new Date();
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataProcessamento = dataFormat.format(dataCaptura);

		ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
		apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		competencia = apuracaoMensalDTO.getCompetencia();
		exibeFinalizarAg = true;
		
//		ApuracaoMensalDTO apuracaoMensalDTOPa = new ApuracaoMensalDTO();
//		apuracaoMensalDTOPa = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO_PA, 
//				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL);
//		exibeFinalizarPa = apuracaoMensalDTOPa.isSolicitacaoContabil();

		if(apuracaoMensalDTO.isSolicitacaoContabil()){ //|| !apuracaoMensalDTOPa.isSolicitacaoContabil()) {
			return "FINALIZAR_FECHAMENTO_APURACAO";
		}
		return "solicitarApuracaoAposFechamento";
	}

	public String solicitarApuracao(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO_AMBOS, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_PROSSEGUIR, "", "");
			
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(), false);

		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} 
		return inicializaApuracaoAposFechamento();
	}

	public String contabilizaApuracaoAg(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR, "", "");
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(), false);
		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} 

		return "FINALIZAR_FECHAMENTO_APURACAO";
	}
	
	public String contabilizaApuracaoPa(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_APOS_FECHAMENTO_PA, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR, "", "");
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(), false);
			exibeFinalizarPa = !false;
		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} 
		
		return "FINALIZAR_FECHAMENTO_APURACAO";
	}

	public ApuracaoAposFechamentoBean() {
		ApuracaoAposFechamentoDTO x = new ApuracaoAposFechamentoDTO();
		x.setProcessamentosEnvolvidos("Geração da Contabilidade");
		processamentosEnvolvidos.add(x);
	}

	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public String getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public List<ApuracaoAposFechamentoDTO> getProcessamentosEnvolvidos() {
		return processamentosEnvolvidos;
	}

	public void setProcessamentosEnvolvidos(
			List<ApuracaoAposFechamentoDTO> processamentosEnvolvidos) {
		this.processamentosEnvolvidos = processamentosEnvolvidos;
	}

	public Date getDataCaptura() {
		return dataCaptura;
	}

	public void setDataCaptura(Date dataCaptura) {
		this.dataCaptura = dataCaptura;
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
	 * @return the exibeFinalizarPa
	 */
	public Boolean getExibeFinalizarPa() {
		return exibeFinalizarPa;
	}

	/**
	 * @param exibeFinalizarPa the exibeFinalizarPa to set
	 */
	public void setExibeFinalizarPa(Boolean exibeFinalizarPa) {
		this.exibeFinalizarPa = exibeFinalizarPa;
	}

}