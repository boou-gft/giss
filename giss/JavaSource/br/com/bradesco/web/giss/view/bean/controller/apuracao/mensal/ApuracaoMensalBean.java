package br.com.bradesco.web.giss.view.bean.controller.apuracao.mensal;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalServiceConstants;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalDTO;

public class ApuracaoMensalBean {
	public String competenciaProcessamento;	
	public String competenciaContabilizacao;
	private List<ApuracaoMensalDTO> processamentosEnvolvidos = new ArrayList<ApuracaoMensalDTO>();
	private List<ApuracaoMensalDTO> contabilizacaoEnvolvidos = new ArrayList<ApuracaoMensalDTO>();
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	private ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
	private String competenciaContabilizacaoPa;
	private Boolean exibeFinalizarAg;
	private Boolean exibeFinalizarPa;


	private String competenciaContabilizacaoSemConv = "";
	private Boolean exibeFinalizarSemConv = false;

	public ApuracaoMensalBean() {
		ApuracaoMensalDTO x = new ApuracaoMensalDTO();
		ApuracaoMensalDTO z = new ApuracaoMensalDTO();
		ApuracaoMensalDTO y = new ApuracaoMensalDTO();

		z.setProcessamentosEnvolvidos("Batimento de Contas");
		processamentosEnvolvidos.add(z);
		y.setProcessamentosEnvolvidos("Batimento de Saldos");
		processamentosEnvolvidos.add(y);
		x.setProcessamentosEnvolvidos("Apuração Mensal");
		processamentosEnvolvidos.add(x);


		x = new ApuracaoMensalDTO();
		x.setContabilizacaoEnvolvidos("Geração da Contabilidade");
		contabilizacaoEnvolvidos.add(x);


	}

	public String inicializaApuracaoMensal(){

		ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
		apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_MENSAL, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		competenciaProcessamento = apuracaoMensalDTO.getCompetencia();
		competenciaContabilizacao = apuracaoMensalDTO.getCompetencia();
		exibeFinalizarAg = apuracaoMensalDTO.isSolicitacaoContabil();
		
		ApuracaoMensalDTO apuracaoMensalDTOPa = new ApuracaoMensalDTO();
		apuracaoMensalDTOPa = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_MENSAL_PA, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		competenciaContabilizacaoPa = apuracaoMensalDTOPa.getCompetencia();
		exibeFinalizarPa = apuracaoMensalDTOPa.isSolicitacaoContabil();
		
		ApuracaoMensalDTO apuracaoMensalDTOSemConv = new ApuracaoMensalDTO();
		apuracaoMensalDTOSemConv = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_SEM_CONVENIO, 
				IApuracaoMensalServiceConstants.TIPO_FUNCAO_INICIAL, "", "");
		competenciaContabilizacaoSemConv = apuracaoMensalDTOSemConv.getCompetencia();
		exibeFinalizarSemConv = apuracaoMensalDTOSemConv.isSolicitacaoContabil();
		
		return "solicitarApuracaoMensal";
	}
	

	public String contabilizaApuracao(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_MENSAL, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR, "", "");
			exibeFinalizarAg = !false;
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(),false);
		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		}
		return "solicitarApuracaoMensal";
	}
	public String contabilizaApuracaoPa(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_MENSAL_PA, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR, "", "");
			exibeFinalizarPa = !false;
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(),false);
		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		}
		return "solicitarApuracaoMensal";
	}
	
	public String contabilizaApuracaoSemConv(){
		try{
			ApuracaoMensalDTO apuracaoMensalDTO = new ApuracaoMensalDTO();
			apuracaoMensalDTO = apuracaoMensalServiceImpl.funcaoTela(IApuracaoMensalServiceConstants.TIPO_FUNCAO_SEM_CONVENIO, 
					IApuracaoMensalServiceConstants.TIPO_FUNCAO_BOTAO_FINALIZAR, "", "");
			exibeFinalizarSemConv = !false;
			BradescoFacesUtils.addInfoModalMessage(apuracaoMensalDTO.getMensagem(),false);
		}catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		}
		return "solicitarApuracaoMensal";
	}

	public String getCompetenciaContabilizacao() {
		return competenciaContabilizacao;
	}
	public void setCompetenciaContabilizacao(String competenciaContabilizacao) {
		this.competenciaContabilizacao = competenciaContabilizacao;
	}
	public String getCompetenciaProcessamento() {
		return competenciaProcessamento;
	}
	public void setCompetenciaProcessamento(String competenciaProcessamento) {
		this.competenciaProcessamento = competenciaProcessamento;
	}
	public List<ApuracaoMensalDTO> getContabilizacaoEnvolvidos() {
		return contabilizacaoEnvolvidos;
	}
	public void setContabilizacaoEnvolvidos(
			List<ApuracaoMensalDTO> contabilizacaoEnvolvidos) {
		this.contabilizacaoEnvolvidos = contabilizacaoEnvolvidos;
	}	
	public List<ApuracaoMensalDTO> getProcessamentosEnvolvidos() {
		return processamentosEnvolvidos;
	}
	public void setProcessamentosEnvolvidos(
			List<ApuracaoMensalDTO> processamentosEnvolvidos) {
		this.processamentosEnvolvidos = processamentosEnvolvidos;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(
			IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	public ApuracaoMensalDTO getApuracaoMensalDTO() {
		return apuracaoMensalDTO;
	}

	public void setApuracaoMensalDTO(ApuracaoMensalDTO apuracaoMensalDTO) {
		this.apuracaoMensalDTO = apuracaoMensalDTO;
	}

	/**
	 * @return the competenciaContabilizacaoPa
	 */
	public String getCompetenciaContabilizacaoPa() {
		return competenciaContabilizacaoPa;
	}

	/**
	 * @param competenciaContabilizacaoPa the competenciaContabilizacaoPa to set
	 */
	public void setCompetenciaContabilizacaoPa(String competenciaContabilizacaoPa) {
		this.competenciaContabilizacaoPa = competenciaContabilizacaoPa;
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

	public String getCompetenciaContabilizacaoSemConv() {
		return competenciaContabilizacaoSemConv;
	}

	public void setCompetenciaContabilizacaoSemConv(
			String competenciaContabilizacaoSemConv) {
		this.competenciaContabilizacaoSemConv = competenciaContabilizacaoSemConv;
	}

	public Boolean getExibeFinalizarSemConv() {
		return exibeFinalizarSemConv;
	}

	public void setExibeFinalizarSemConv(Boolean exibeFinalizarSemConv) {
		this.exibeFinalizarSemConv = exibeFinalizarSemConv;
	}
}