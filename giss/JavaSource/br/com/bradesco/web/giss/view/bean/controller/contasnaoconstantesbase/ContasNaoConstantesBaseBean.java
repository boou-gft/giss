package br.com.bradesco.web.giss.view.bean.controller.contasnaoconstantesbase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.IContasNaoConstantesBaseService;
import br.com.bradesco.web.giss.service.business.contasnaoconstantesbase.bean.ContasNaoConstantesBaseDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ContasNaoConstantesBaseBean {
	private boolean mostraTable;
	private boolean mostraBotaoProsseguir;
	private boolean mostraBotoes;
	private List<ContasNaoConstantesBaseDTO> listaContasNaoConstantesBase;
	private IContasNaoConstantesBaseService contasNaoConstantesBaseImpl;
	private Date dataProcessamento;
	private String competencia;
	

	public ContasNaoConstantesBaseBean(){
		listaContasNaoConstantesBase = new ArrayList<ContasNaoConstantesBaseDTO>();
	}
	
	
	public String inicializaContasNaoConstantesBase(){
		
		mostraTable = false;
		mostraBotoes = false;
		mostraBotaoProsseguir = true;
		dataProcessamento = new Date();
		competencia = GissUtil.geraDataCompetencia();
		
		return "contasNaoConstantes";
	}
	

	public String prosseguir(){
		
		if(dataProcessamento != null){		
			mostraBotoes = false;
			mostraTable = true;
			mostraBotaoProsseguir = false;
			if(listarContasNaoConstantesnaBase())
				return "contasNaoConstantesResultado";
				
		}else{
			BradescoFacesUtils.addInfoModalMessage("Insira uma data válida.","contasNaoConstantes", BradescoViewExceptionActionType.ACTION, false);
		}
		
		return null; 
	}
	
	public void paginarContasNaoConstantesnaBase(ActionEvent event){
		
		listarContasNaoConstantesnaBase();
		setListaContasNaoConstantesBase(listaContasNaoConstantesBase);
		
	}
	
	
	private boolean listarContasNaoConstantesnaBase() {
		       

		try {
			
			
			listaContasNaoConstantesBase = contasNaoConstantesBaseImpl.listarContasNaoConstantesBase();
			
			if (listaContasNaoConstantesBase != null) {

			
				mostraBotoes = !listaContasNaoConstantesBase.isEmpty();
				
				mostraBotaoProsseguir = false;
				
				mostraTable = true;
				
			}
		} catch (PdcAdapterFunctionalException p) {
				mostraTable = false;
				mostraBotoes = false;
				mostraBotaoProsseguir = true;
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "contasNaoConstantes", BradescoViewExceptionActionType.ACTION, false);
				return false;
		}


	
		return true;
	}
	
	
	
	public boolean isMostraBotoes() {
		return mostraBotoes;
	}
	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	
	public boolean isMostraTable() {
		return mostraTable;
	}
	public void setMostraTable(boolean mostraTable) {
		this.mostraTable = mostraTable;
	}
	
	public boolean isMostraBotaoProsseguir() {
		return mostraBotaoProsseguir;
	}
	public void setMostraBotaoProsseguir(boolean mostraBotaoProsseguir) {
		this.mostraBotaoProsseguir = mostraBotaoProsseguir;
	}
	
	public List<ContasNaoConstantesBaseDTO> getListaContasNaoConstantesBase() {
		return listaContasNaoConstantesBase;
	}
	public void setListaContasNaoConstantesBase(
			List<ContasNaoConstantesBaseDTO> listaContasNaoConstantesBase) {
		this.listaContasNaoConstantesBase = listaContasNaoConstantesBase;
	}
	
	public Date getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}


	public IContasNaoConstantesBaseService getContasNaoConstantesBaseImpl() {
		return contasNaoConstantesBaseImpl;
	}


	public void setContasNaoConstantesBaseImpl(
			IContasNaoConstantesBaseService contasNaoConstantesBaseImpl) {
		this.contasNaoConstantesBaseImpl = contasNaoConstantesBaseImpl;
	}

}
