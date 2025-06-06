package br.com.bradesco.web.giss.view.bean.controller.issgerencial.processarpagamento;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.IProcessarPagtoISSService;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.bean.ProcessarPagtoISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ProcessarPagtoISSBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IProcessarPagtoISSService processarPagtoISSServiceImpl;
	
	private ProcessarPagtoISSDTO dto = new ProcessarPagtoISSDTO();
	private ProcessarPagtoISSDTO dtoProcessar = new ProcessarPagtoISSDTO();
	private List<SelectItem> selectItem = new ArrayList<SelectItem>();
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	
	private boolean hiddenProsseguir;
	private boolean checkTodos;
	private boolean mostrarListaProcessar;
	
	
	
	public String carregarProcessarPagto() {
		dto = new ProcessarPagtoISSDTO();
		dtoProcessar = new ProcessarPagtoISSDTO();
		dto.setIndContabilizar("M");
		codigosSelecionadosTabela = new Integer[100];
		checkTodos = false;
		selectItem = new ArrayList<SelectItem>();
		listar();
		return "processarPagto";
	}
	

	private void listar() {
		
		try {
    		dto.setLista(new ArrayList<ProcessarPagtoISSDTO>());
    		selectItem = new ArrayList<SelectItem>();
			dto = processarPagtoISSServiceImpl.ListaConsultarProcessar(dto);
			mostrarListaProcessar = dto.getLista().size() > 0;
			if (dto.getLista() != null) {
				selectItem = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectItem.add(new SelectItem(i, " "));
				}
			}
	} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
	} catch (Exception e) {
		throw new BradescoViewException(e.getMessage(), e, null);
	}
}	
	public String processar() {
		if(codigosSelecionadosTabela.length > 0){
			GissUtil.copiarPropriedadesNaoNulas(dto, dtoProcessar);
			dtoProcessar.setLista(new ArrayList<ProcessarPagtoISSDTO>());
			for (Integer check : codigosSelecionadosTabela) {
				dtoProcessar.getLista().add(dto.getLista().get(check));
			}
			String msg = processarPagtoISSServiceImpl.BotaoConsultarProcessar(dtoProcessar);
			BradescoFacesUtils.addInfoModalMessage(msg, false);
			return carregarProcessarPagto();
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
			return "";
		}
	}
	
	
	
	public void atribuirTodos() {
		
		if(checkTodos){
			codigosSelecionadosTabela = new Integer[dto.getLista().size()];
			for (int i = 0; i < dto.getLista().size(); i++) {
				if(i== 100)
					break;
				codigosSelecionadosTabela[i] = i;
			}
		}else{
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	
	public String limparCheckTodos() {
		checkTodos = false;
		return "";
	}


	/**
	 * @return the dto
	 */
	public ProcessarPagtoISSDTO getDto() {
		return dto;
	}


	/**
	 * @param dto the dto to set
	 */
	public void setDto(ProcessarPagtoISSDTO dto) {
		this.dto = dto;
	}


	/**
	 * @return the selectItem
	 */
	public List<SelectItem> getSelectItem() {
		return selectItem;
	}


	/**
	 * @param selectItem the selectItem to set
	 */
	public void setSelectItem(List<SelectItem> selectItem) {
		this.selectItem = selectItem;
	}


	/**
	 * @return the hiddenProsseguir
	 */
	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}


	/**
	 * @param hiddenProsseguir the hiddenProsseguir to set
	 */
	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}


	/**
	 * @return the checkTodos
	 */
	public boolean isCheckTodos() {
		return checkTodos;
	}


	/**
	 * @param checkTodos the checkTodos to set
	 */
	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}


	/**
	 * @return the codigosSelecionadosTabela
	 */
	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}


	/**
	 * @param codigosSelecionadosTabela the codigosSelecionadosTabela to set
	 */
	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}
	
	/**
	 * @return the processarPagtoISSServiceImpl
	 */
	public IProcessarPagtoISSService getProcessarPagtoISSServiceImpl() {
		return processarPagtoISSServiceImpl;
	}


	/**
	 * @param processarPagtoISSServiceImpl the processarPagtoISSServiceImpl to set
	 */
	public void setProcessarPagtoISSServiceImpl(IProcessarPagtoISSService processarPagtoISSServiceImpl) {
		this.processarPagtoISSServiceImpl = processarPagtoISSServiceImpl;
	}


	/**
	 * @return the mostrarListaProcessar
	 */
	public boolean isMostrarListaProcessar() {
		return mostrarListaProcessar;
	}


	/**
	 * @param mostrarListaProcessar the mostrarListaProcessar to set
	 */
	public void setMostrarListaProcessar(boolean mostrarListaProcessar) {
		this.mostrarListaProcessar = mostrarListaProcessar;
	}


	/**
	 * @return the dtoProcessar
	 */
	public ProcessarPagtoISSDTO getDtoProcessar() {
		return dtoProcessar;
	}


	/**
	 * @param dtoProcessar the dtoProcessar to set
	 */
	public void setDtoProcessar(ProcessarPagtoISSDTO dtoProcessar) {
		this.dtoProcessar = dtoProcessar;
	}

}
