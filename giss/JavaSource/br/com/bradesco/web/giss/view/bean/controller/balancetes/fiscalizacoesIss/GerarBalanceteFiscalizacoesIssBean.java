package br.com.bradesco.web.giss.view.bean.controller.balancetes.fiscalizacoesIss;

import java.util.ArrayList;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssService;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssSaidaDTO;

public class GerarBalanceteFiscalizacoesIssBean {

	private GerarBalanceteFiscalizacoesIssDTO gerarBalanceteFiscalizacoesIssDTO;
	private IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl;
	
	public String inicializaGerarBalanceteFiscalizacoesIss(){
		gerarBalanceteFiscalizacoesIssDTO = new GerarBalanceteFiscalizacoesIssDTO();
		
		try {
			carregarComboEmpresa();
			carregarComboEstado();
			carregarComboNivelConta();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		gerarBalanceteFiscalizacoesIssDTO.setFechadoSimulado("1");
		
		return "gerarBalancetesFiscalizacoesIss";
	}
	
	public void carregarComboEmpresa(){
		gerarBalanceteFiscalizacoesIssDTO.setListarEmpresasBalancetes(balancetesFiscalizacoesIssServiceImpl.carregarComboEmpresasBalancetes());
	}
	
	public void carregarComboEstado(){
		gerarBalanceteFiscalizacoesIssDTO.setListarEstadosBalancetes(balancetesFiscalizacoesIssServiceImpl.carregarComboEstadosBalancetes());
	}
	
	public void carregarComboMunicipio(){
		gerarBalanceteFiscalizacoesIssDTO.setListarMunicipiosBalancetes(balancetesFiscalizacoesIssServiceImpl.carregarComboMunicipiosBalancetes(gerarBalanceteFiscalizacoesIssDTO.getEstado(),gerarBalanceteFiscalizacoesIssDTO.getCodMunicipio()));
	}
	
	public void carregarComboNivelConta(){
		gerarBalanceteFiscalizacoesIssDTO.setListarNivelContas(new ArrayList<SelectItem>());
		
		gerarBalanceteFiscalizacoesIssDTO.getListarNivelContas().add(new SelectItem(1, "COSIF"));
		gerarBalanceteFiscalizacoesIssDTO.getListarNivelContas().add(new SelectItem(2, "RAZAO"));
		gerarBalanceteFiscalizacoesIssDTO.getListarNivelContas().add(new SelectItem(3, "CONTAS"));
	}
	
	public String carregarMunicipios() {
		gerarBalanceteFiscalizacoesIssDTO.setCodMunicipio(null);
		
		gerarBalanceteFiscalizacoesIssDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
		
		gerarBalanceteFiscalizacoesIssDTO.setMunicipio(null);
		
		if(gerarBalanceteFiscalizacoesIssDTO.getEstado() != null && gerarBalanceteFiscalizacoesIssDTO.getEstado() > 0){		
			try {
				carregarComboMunicipio();
				
				gerarBalanceteFiscalizacoesIssDTO.setDependencia(null);
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
				
				gerarBalanceteFiscalizacoesIssDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
				
				gerarBalanceteFiscalizacoesIssDTO.setMunicipio(null);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}
		
		return "gerarBalancetesFiscalizacoesIss";
	}
	
	public String carregarMunicipio() {
		try {
			carregarComboMunicipio();
			
			if(gerarBalanceteFiscalizacoesIssDTO.getCodMunicipio() != null){
				gerarBalanceteFiscalizacoesIssDTO.setMunicipio((Long) gerarBalanceteFiscalizacoesIssDTO.getListarMunicipiosBalancetes().get(0).getValue());
			}else{
				gerarBalanceteFiscalizacoesIssDTO.setMunicipio(null);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
			
			gerarBalanceteFiscalizacoesIssDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
			
			gerarBalanceteFiscalizacoesIssDTO.setMunicipio(null);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "gerarBalancetesFiscalizacoesIss";
	}
	
	public String carregarCodMunicipio(){
		if(gerarBalanceteFiscalizacoesIssDTO.getMunicipio() != null && gerarBalanceteFiscalizacoesIssDTO.getMunicipio() > 0){
			gerarBalanceteFiscalizacoesIssDTO.setCodMunicipio(gerarBalanceteFiscalizacoesIssDTO.getMunicipio());
		}else{
			gerarBalanceteFiscalizacoesIssDTO.setCodMunicipio(null);
		}
		
		return "gerarBalancetesFiscalizacoesIss";
	}
	
	public String executar(){
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
		
		gerarBalanceteFiscalizacoesIssDTO.setCodMunicipio(gerarBalanceteFiscalizacoesIssDTO.getMunicipio());
		
		try {
			saida = balancetesFiscalizacoesIssServiceImpl.executarBalancete(gerarBalanceteFiscalizacoesIssDTO);
			
			BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), inicializaGerarBalanceteFiscalizacoesIss(), BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesFiscalizacoesIss", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "gerarBalancetesFiscalizacoesIss";
	}

	public boolean isHabilitarCodMunicipio(){
		if(gerarBalanceteFiscalizacoesIssDTO.getEstado() != null){
			if(gerarBalanceteFiscalizacoesIssDTO.getEstado() > 0){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isHabilitarConsolidado(){
		if(gerarBalanceteFiscalizacoesIssDTO.getDependencia() != null && gerarBalanceteFiscalizacoesIssDTO.getDependencia() > 0){
			return true;
		}
		
		return false;
	}
	
	public String limparMunicipios(){
		if(gerarBalanceteFiscalizacoesIssDTO.getDependencia() != null && gerarBalanceteFiscalizacoesIssDTO.getDependencia() > 0){
			gerarBalanceteFiscalizacoesIssDTO.setEstado(null);
			gerarBalanceteFiscalizacoesIssDTO.setCodMunicipio(null);
			gerarBalanceteFiscalizacoesIssDTO.setMunicipio(null);
			gerarBalanceteFiscalizacoesIssDTO.setConsolidado(false);
		}
		
		return "gerarBalancetesFiscalizacoesIss";
	}
	
	public void limpar(){
		inicializaGerarBalanceteFiscalizacoesIss();
	}

	public IBalancetesFiscalizacoesIssService getBalancetesFiscalizacoesIssServiceImpl() {
		return balancetesFiscalizacoesIssServiceImpl;
	}

	public void setBalancetesFiscalizacoesIssServiceImpl(
			IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl) {
		this.balancetesFiscalizacoesIssServiceImpl = balancetesFiscalizacoesIssServiceImpl;
	}

	public GerarBalanceteFiscalizacoesIssDTO getGerarBalanceteFiscalizacoesIssDTO() {
		return gerarBalanceteFiscalizacoesIssDTO;
	}

	public void setGerarBalanceteFiscalizacoesIssDTO(
			GerarBalanceteFiscalizacoesIssDTO gerarBalanceteFiscalizacoesIssDTO) {
		this.gerarBalanceteFiscalizacoesIssDTO = gerarBalanceteFiscalizacoesIssDTO;
	}

}