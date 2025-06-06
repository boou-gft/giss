package br.com.bradesco.web.giss.view.bean.controller.balancetes.obrigacoesAcessorias;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.IBalancetesFiscalizacoesIssService;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteFiscalizacoesIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.GerarBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.IncluirExcluirBalanceteObrigacoesAcessoriasDTO;
import br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean.ListarBalancetesParametrizadosSaidaDTO;

public class GerarBalanceteObrigacoesAcessoriasBean {

	private GerarBalanceteObrigacoesAcessoriasDTO gerarBalanceteObrigacoesAcessoriasDTO;
	private IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl;
	private List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados;
	
	public String inicializaGerarBalanceteObrigacoesAcessorias(){
		gerarBalanceteObrigacoesAcessoriasDTO = new GerarBalanceteObrigacoesAcessoriasDTO();
		listarBalancetesParametrizados = new ArrayList<ListarBalancetesParametrizadosSaidaDTO>();
		
		try {
			carregarComboEstado();
			listarBalancetesParametrizados();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		gerarBalanceteObrigacoesAcessoriasDTO.setFechadoSimulado("1");
		
		return "gerarBalancetesObrigacoesAcessorias";
	}

	public void carregarComboEstado(){
		gerarBalanceteObrigacoesAcessoriasDTO.setListarEstadosBalancetes(balancetesFiscalizacoesIssServiceImpl.carregarComboEstadosBalancetes());
	}
	
	public void listarBalancetesParametrizados(){
		listarBalancetesParametrizados = balancetesFiscalizacoesIssServiceImpl.listarBalancetesParametrizados();

		if (listarBalancetesParametrizados != null) {

			gerarBalanceteObrigacoesAcessoriasDTO.setListaControleBalancetesParametrizados(new ArrayList<SelectItem>());
			
			for (int i = 0; i < listarBalancetesParametrizados.size(); i++) {
				gerarBalanceteObrigacoesAcessoriasDTO.getListaControleBalancetesParametrizados().add(new SelectItem(i, " "));
			}
		}
	}
	
	public String paginar(ActionEvent event) {
		listarBalancetesParametrizados();
		return "";
	}
	
	public void carregarComboMunicipio(){
		gerarBalanceteObrigacoesAcessoriasDTO.setListarMunicipiosBalancetes(balancetesFiscalizacoesIssServiceImpl.carregarComboMunicipiosBalancetes(gerarBalanceteObrigacoesAcessoriasDTO.getEstado(),gerarBalanceteObrigacoesAcessoriasDTO.getCodMunicipio()));
	}

	public String carregarMunicipios() {
		gerarBalanceteObrigacoesAcessoriasDTO.setCodMunicipio(null);
		
		gerarBalanceteObrigacoesAcessoriasDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
		
		gerarBalanceteObrigacoesAcessoriasDTO.setMunicipio(null);

		if(gerarBalanceteObrigacoesAcessoriasDTO.getEstado() != null && gerarBalanceteObrigacoesAcessoriasDTO.getEstado() > 0){
			try {
				carregarComboMunicipio();
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
				
				gerarBalanceteObrigacoesAcessoriasDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
				
				gerarBalanceteObrigacoesAcessoriasDTO.setMunicipio(null);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}
		
		return "gerarBalancetesObrigacoesAcessorias";
	}
	
	public String carregarMunicipio() {
		try {
			carregarComboMunicipio();
			
			if(gerarBalanceteObrigacoesAcessoriasDTO.getCodMunicipio() != null){
				gerarBalanceteObrigacoesAcessoriasDTO.setMunicipio((Long) gerarBalanceteObrigacoesAcessoriasDTO.getListarMunicipiosBalancetes().get(0).getValue());
			}else{
				gerarBalanceteObrigacoesAcessoriasDTO.setMunicipio(null);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
			
			gerarBalanceteObrigacoesAcessoriasDTO.setListarMunicipiosBalancetes(new ArrayList<SelectItem>());
			
			gerarBalanceteObrigacoesAcessoriasDTO.setMunicipio(null);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "gerarBalancetesObrigacoesAcessorias";
	}
	
	public String carregarCodMunicipio(){
		if(gerarBalanceteObrigacoesAcessoriasDTO.getMunicipio() != null && gerarBalanceteObrigacoesAcessoriasDTO.getMunicipio() > 0){
			gerarBalanceteObrigacoesAcessoriasDTO.setCodMunicipio(gerarBalanceteObrigacoesAcessoriasDTO.getMunicipio());
		}else{
			gerarBalanceteObrigacoesAcessoriasDTO.setCodMunicipio(null);
		}
		
		return "gerarBalancetesObrigacoesAcessorias";
	}
	
	public String incluir(){
		if("S".equals(gerarBalanceteObrigacoesAcessoriasDTO.getCondicaoIncluirExcluir())){
			IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada = new IncluirExcluirBalanceteObrigacoesAcessoriasDTO();
			GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
	
			entrada.setCodMunicipio(gerarBalanceteObrigacoesAcessoriasDTO.getMunicipio());
			
			if(gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && !gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && !gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("1");
			}else if(!gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && !gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("2");
			}else if(gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && !gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("3");
			}else if(!gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && !gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("4");
			}else if(gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && !gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("5");
			}else if(!gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("6");
			}else if(gerarBalanceteObrigacoesAcessoriasDTO.isGrupo7() && gerarBalanceteObrigacoesAcessoriasDTO.isGrupo8() && gerarBalanceteObrigacoesAcessoriasDTO.isTodosGrupos()){
				entrada.setCodGrupo("7");
			}else{
				entrada.setCodGrupo("0");
			}
	
			try {
				saida = balancetesFiscalizacoesIssServiceImpl.incluirBalancete(entrada);
				
				BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), inicializaGerarBalanceteObrigacoesAcessorias(), BradescoViewExceptionActionType.ACTION, false);
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}
		
		return "gerarBalancetesObrigacoesAcessorias";
	}
	
	public String gerarBalancete(){
		GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();

		try {
			saida = balancetesFiscalizacoesIssServiceImpl.gerarBalancete(gerarBalanceteObrigacoesAcessoriasDTO);
			
			BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), inicializaGerarBalanceteObrigacoesAcessorias(), BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return "gerarBalancetesObrigacoesAcessorias";
	}

	public String excluir(){
		if("S".equals(gerarBalanceteObrigacoesAcessoriasDTO.getCondicaoIncluirExcluir())){
			IncluirExcluirBalanceteObrigacoesAcessoriasDTO entrada = new IncluirExcluirBalanceteObrigacoesAcessoriasDTO();
			GerarBalanceteFiscalizacoesIssSaidaDTO saida = new GerarBalanceteFiscalizacoesIssSaidaDTO();
	
			entrada.setCodMunicipio(listarBalancetesParametrizados.get(gerarBalanceteObrigacoesAcessoriasDTO.getItemSelecionadoListarBalancetesParametrizados()).getCodMunicipio());
			entrada.setCodGrupo("");
			
			try {
				saida = balancetesFiscalizacoesIssServiceImpl.excluirBalancete(entrada);
				
				BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), inicializaGerarBalanceteObrigacoesAcessorias(), BradescoViewExceptionActionType.ACTION, false);
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "gerarBalancetesObrigacoesAcessorias", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
		}
		
		return "gerarBalancetesObrigacoesAcessorias";
	}

	public boolean isHabilitarCodMunicipio(){
		if(gerarBalanceteObrigacoesAcessoriasDTO.getEstado() != null){
			if(gerarBalanceteObrigacoesAcessoriasDTO.getEstado() > 0){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isHabilitarExcluir(){
		if(gerarBalanceteObrigacoesAcessoriasDTO.getItemSelecionadoListarBalancetesParametrizados() != null){
			return false;
		}
		
		return true;
	}

	public void limpar(){
		inicializaGerarBalanceteObrigacoesAcessorias();
	}

	public IBalancetesFiscalizacoesIssService getBalancetesFiscalizacoesIssServiceImpl() {
		return balancetesFiscalizacoesIssServiceImpl;
	}

	public void setBalancetesFiscalizacoesIssServiceImpl(
			IBalancetesFiscalizacoesIssService balancetesFiscalizacoesIssServiceImpl) {
		this.balancetesFiscalizacoesIssServiceImpl = balancetesFiscalizacoesIssServiceImpl;
	}

	public GerarBalanceteObrigacoesAcessoriasDTO getGerarBalanceteObrigacoesAcessoriasDTO() {
		return gerarBalanceteObrigacoesAcessoriasDTO;
	}

	public void setGerarBalanceteObrigacoesAcessoriasDTO(
			GerarBalanceteObrigacoesAcessoriasDTO gerarBalanceteObrigacoesAcessoriasDTO) {
		this.gerarBalanceteObrigacoesAcessoriasDTO = gerarBalanceteObrigacoesAcessoriasDTO;
	}

	public List<ListarBalancetesParametrizadosSaidaDTO> getListarBalancetesParametrizados() {
		return listarBalancetesParametrizados;
	}

	public void setListarBalancetesParametrizados(
			List<ListarBalancetesParametrizadosSaidaDTO> listarBalancetesParametrizados) {
		this.listarBalancetesParametrizados = listarBalancetesParametrizados;
	}

}