package br.com.bradesco.web.giss.view.bean.controller.issgerencial.itemservicolc;


import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.issitemservicolc.IItemServicoLCISSService;
import br.com.bradesco.web.giss.service.business.issitemservicolc.bean.ItemServicoLcISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class ItemServicoLcISSBean  extends FiltroGenericoGISSBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IItemServicoLCISSService itemServicoLcISSServiceImpl;
	private IUtilidadesService utilidadesServiceImpl;

	private ItemServicoLcISSDTO dtoIncluir = new ItemServicoLcISSDTO();
	private ItemServicoLcISSDTO dtoManter = new ItemServicoLcISSDTO();
	private ItemServicoLcISSDTO dtoAlterar = new ItemServicoLcISSDTO();
	private ItemServicoLcISSDTO dto = new ItemServicoLcISSDTO();
	private ItemServicoLcISSDTO dtoHistorico = new ItemServicoLcISSDTO();
	private ItemServicoLcISSDTO dtoDetalhar = new ItemServicoLcISSDTO();
	
	private List<SelectItem> selectItemServicoLC = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemServico = new ArrayList<SelectItem>();
	
	private List<ItemServicoLcISSDTO> listaItemServicoLC = new ArrayList<ItemServicoLcISSDTO>();
	private List<CombosISSDTO> comboServico = new ArrayList<CombosISSDTO>();
	
	private Integer radioListaItemServicoLC;
	private Integer tipoPesquisa;
	private Integer codigoSelecionadoRadio = null;
	private Integer[] codigosSelecionadosTabela = new Integer[100];

	private static final int INICIAL = 1;
	private static final int PESQUISAR = 2;
	
	private boolean checkTodos;
	private boolean hiddenProsseguir;
	private boolean mostrarLista;
	
	public String carregarIncluir() {
		dtoIncluir = new ItemServicoLcISSDTO();
		return "incluirItemLeiCompl";
	}
	
	public String carregarManter() {
		codigosSelecionadosTabela = new Integer[100];
		checkTodos = false;
		dtoManter = new ItemServicoLcISSDTO();
		hiddenProsseguir = false;
		listarItemSevicoLC(dtoManter, INICIAL);
		return "manterItemLeiCompl";
		
	}
	public String carregarConsultar() {
		codigosSelecionadosTabela = new Integer[100];
		dtoManter = new ItemServicoLcISSDTO();
		hiddenProsseguir = false;
		listarItemSevicoLC(dtoManter, INICIAL);
		return "consultarItemLeiCompl";
	}

	public String carregarHistorico() {
		dtoHistorico = new ItemServicoLcISSDTO();
		hiddenProsseguir = false;
		mostrarLista = false;
		codigoSelecionadoRadio = null;
		selectItemServicoLC = new ArrayList<SelectItem>();
		dto = new ItemServicoLcISSDTO();
		carregarComboItemServico();
		return "consultarHistItemLeiCompl";
	}
	
	public String carregarDetalhar() {
		if(codigoSelecionadoRadio != null){
			dtoDetalhar = new ItemServicoLcISSDTO();
			hiddenProsseguir = false;
			try {
				setDtoDetalhar(itemServicoLcISSServiceImpl.detalharHistorico(dtoHistorico.getLista().get(codigoSelecionadoRadio)));
			} catch (Exception e) {
				BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			}
			return "detalharHistItemLeiCompl";
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";
		}
	}
	
	public String limparDados() {
		dtoIncluir = new ItemServicoLcISSDTO();
		return "";
	}
	
	public String reativar(){
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabela.length > 1){
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar apenas um item na lista!", false);
				return "";
			}
			if(codigosSelecionadosTabela.length == 1){
				if(dtoManter.getLista().get(codigosSelecionadosTabela[0]).getStatus().equalsIgnoreCase("I")){
					BradescoFacesUtils.addInfoModalMessage(itemServicoLcISSServiceImpl.reativarItemDaLeiCompl(dtoManter.getLista().get(codigosSelecionadosTabela[0])), false);
					return carregarManter();
				}else{
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item de serviço da lei complementar inativo!", false);
					return"";
				}
			}else{
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
					return"";
			}
		}
		return "";
	}
	
	
	public String exportarExcel(){
		return "";
	}
	
	public String pequisar(){
		if(GissUtil.notNull(dtoManter.getCodItemLcFormatado()).equals("")){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher Item de Serviço da LC!", false);
			return"";
		}
		String codItem = !GissUtil.notNull(dtoManter.getCodItemLcFormatado()).equals("")?GissUtil.notNull(dtoManter.getCodItemLcFormatado().replace(".", "")):"00000000";
		if (codItem.length() < 8) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher os 8 digitos do Item de Serviço da LC!", false);
		}
		listarItemSevicoLC(dtoManter, PESQUISAR);
		return "";
	}

	public String pequisarHistorico(){
		if(GissUtil.notNull(dtoHistorico.getCodItemLc()) == 0){
    		BradescoFacesUtils.addInfoModalMessage("Favor Selecionar um Item Serviço!", false);
    		return"";
    	}
		
		dtoHistorico.getLista().clear();
		itemServicoLcISSServiceImpl.ListaItemLCHistorico(dtoHistorico);
		mostrarLista = dtoHistorico.getLista().size()>0;
		if (dtoHistorico.getLista() != null) {
			selectItemServicoLC = new ArrayList<SelectItem>();
			for (int i = 0; i < dtoHistorico.getLista().size(); i++) {
				selectItemServicoLC.add(new SelectItem(i, " "));
			}
		}
		return "";
	}
	
	

	private void listarItemSevicoLC(ItemServicoLcISSDTO dto, int tipoPesquisa) {
		try {
			dto.getLista().clear();
			dto.setCodItemLc(!GissUtil.notNull(dto.getCodItemLcFormatado()).equals("")?Integer.valueOf(GissUtil.notNull(dto.getCodItemLcFormatado().replace(".", ""))):0);
			itemServicoLcISSServiceImpl.ListaItemLC(dto);
			mostrarLista = dto.getLista().size()>0;
			if (dto.getLista() != null) {
				selectItemServicoLC = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectItemServicoLC.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			if (tipoPesquisa == INICIAL && p.getMessage().equals("NAO EXISTEM DADOS A SEREM LISTADOS")) {
				return;
			}
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			if (tipoPesquisa == INICIAL && e.getMessage().equals("NAO EXISTEM DADOS A SEREM LISTADOS")) {
				return;
			}
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String incluirItemServicoLC(){
		if (hiddenProsseguir) {		
			String codItem = !GissUtil.notNull(dtoIncluir.getCodItemLcFormatado()).equals("")?GissUtil.notNull(dtoIncluir.getCodItemLcFormatado().replace(".", "")):"00000000";
			if (GissUtil.notNull(dtoIncluir.getCodItemLcFormatado()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher Item de Serviço da LC!", false);
				return"";
			}if (codItem.length() < 8) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher os 8 digitos do Item de Serviço da LC!", false);
				return"";
			}else if(GissUtil.notNull(dtoIncluir.getDescItemLc()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Descrição!", false);
				return"";
			}else {
				BradescoFacesUtils.addInfoModalMessage(itemServicoLcISSServiceImpl.incluirItemCompl(dtoIncluir), false);
			}
			return carregarManter();
		}
		return "";
			
	}
	
	public String carregarAlterar(){
		if(codigosSelecionadosTabela.length == 1){
			if(dtoManter.getLista().get(codigosSelecionadosTabela[0]).getStatus().equalsIgnoreCase("I")){
				BradescoFacesUtils.addInfoModalMessage("Não é possível alterar um item inativo!", false);
				return "";
			} else{
				dtoAlterar = new ItemServicoLcISSDTO();
				GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(codigosSelecionadosTabela[0]), dtoAlterar);
				return "alterarItemLeiCompl";
			}
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar apenas um item na lista!", false);
			return "";
		}
	}
	
	public String confirmarAlterar(){
		if (isHiddenProsseguir()) {
			if (GissUtil.notNull(dtoAlterar.getCodItemLcFormatado()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher Item de Serviço da LC!", false);
				return"";
			}else if(GissUtil.notNull(dtoAlterar.getDescItemLc()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Descrição!", false);
				return"";
			}else {
				BradescoFacesUtils.addInfoModalMessage(itemServicoLcISSServiceImpl.alterarItemCompl(dtoAlterar), false);
				
			}
			return carregarManter();
		}
		return "";
	}
	
	public String excluir(){
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabela.length > 0){
				dto.setLista(new ArrayList<ItemServicoLcISSDTO>());
				for (Integer check : codigosSelecionadosTabela) {
					dto.getLista().add(dtoManter.getLista().get(check));
				}
				String msg = itemServicoLcISSServiceImpl.ExcluirItemCompl(dto);
				BradescoFacesUtils.addInfoModalMessage(msg, false);
				return carregarManter();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
				return "";
			}
		}
		return "";
	}
	


	public void atribuirTodos() {
		if(checkTodos){
			codigosSelecionadosTabela = new Integer[dtoManter.getLista().size()];
			for (int i = 0; i < dtoManter.getLista().size(); i++) {
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
	
	public String imprimirPlanilha(ActionEvent ae){
		try {
			if(dtoManter.getLista().size() >0){
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Consultar Item de Serviço da LC", "CON_ITEM_SERVICO_LC");
				exportarPlanilha.planilhaItemServicoIss(dtoManter);
			}else{
				BradescoFacesUtils.addInfoModalMessage("Lista de item de serviço da lc vazia", false);
				return"";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}
	
	 private void carregarComboItemServico(){
		 dto = new ItemServicoLcISSDTO();
    	selectItemServico = new ArrayList<SelectItem>();
    	itemServicoLcISSServiceImpl.ListaItemLC(dto);
    	for (int i = 0; i < dto.getLista().size(); i++) {
    		selectItemServico.add(new SelectItem(dto.getLista().get(i).getCodItemLc(), dto.getLista().get(i).getCodItemLcFormatado()+ " - " + dto.getLista().get(i).getDescItemLc()));
    	}		
    }

	/**
	 * @return the dtoIncluir
	 */
	public ItemServicoLcISSDTO getDtoIncluir() {
		return dtoIncluir;
	}

	/**
	 * @param dtoIncluir the dtoIncluir to set
	 */
	public void setDtoIncluir(ItemServicoLcISSDTO dtoIncluir) {
		this.dtoIncluir = dtoIncluir;
	}

	/**
	 * @return the dtoManter
	 */
	public ItemServicoLcISSDTO getDtoManter() {
		return dtoManter;
	}

	/**
	 * @param dtoManter the dtoManter to set
	 */
	public void setDtoManter(ItemServicoLcISSDTO dtoManter) {
		this.dtoManter = dtoManter;
	}

	/**
	 * @return the dtoAlterar
	 */
	public ItemServicoLcISSDTO getDtoAlterar() {
		return dtoAlterar;
	}

	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(ItemServicoLcISSDTO dtoAlterar) {
		this.dtoAlterar = dtoAlterar;
	}

	/**
	 * @return the dto
	 */
	public ItemServicoLcISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(ItemServicoLcISSDTO dto) {
		this.dto = dto;
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
	 * @return the mostrarLista
	 */
	public boolean isMostrarLista() {
		return mostrarLista;
	}

	/**
	 * @param mostrarLista the mostrarLista to set
	 */
	public void setMostrarLista(boolean mostrarLista) {
		this.mostrarLista = mostrarLista;
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
	 * @return the radioListaItemServicoLC
	 */
	public Integer getRadioListaItemServicoLC() {
		return radioListaItemServicoLC;
	}

	/**
	 * @param radioListaItemServicoLC the radioListaItemServicoLC to set
	 */
	public void setRadioListaItemServicoLC(Integer radioListaItemServicoLC) {
		this.radioListaItemServicoLC = radioListaItemServicoLC;
	}

	/**
	 * @return the listaItemServicoLC
	 */
	public List<ItemServicoLcISSDTO> getListaItemServicoLC() {
		return listaItemServicoLC;
	}

	/**
	 * @param listaItemServicoLC the listaItemServicoLC to set
	 */
	public void setListaItemServicoLC(List<ItemServicoLcISSDTO> listaItemServicoLC) {
		this.listaItemServicoLC = listaItemServicoLC;
	}

	/**
	 * @return the selectItemServicoLC
	 */
	public List<SelectItem> getSelectItemServicoLC() {
		return selectItemServicoLC;
	}

	/**
	 * @param selectItemServicoLC the selectItemServicoLC to set
	 */
	public void setSelectItemServicoLC(List<SelectItem> selectItemServicoLC) {
		this.selectItemServicoLC = selectItemServicoLC;
	}

	/**
	 * @return the itemServicoLcISSServiceImpl
	 */
	public IItemServicoLCISSService getItemServicoLcISSServiceImpl() {
		return itemServicoLcISSServiceImpl;
	}

	/**
	 * @param itemServicoLcISSServiceImpl the itemServicoLcISSServiceImpl to set
	 */
	public void setItemServicoLcISSServiceImpl(IItemServicoLCISSService itemServicoLcISSServiceImpl) {
		this.itemServicoLcISSServiceImpl = itemServicoLcISSServiceImpl;
	}

	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}

	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	public Integer getCodigoSelecionadoRadio() {
		return codigoSelecionadoRadio;
	}

	public void setCodigoSelecionadoRadio(Integer codigoSelecionadoRadio) {
		this.codigoSelecionadoRadio = codigoSelecionadoRadio;
	}

	/**
	 * @return the dtoHistorico
	 */
	public ItemServicoLcISSDTO getDtoHistorico() {
		return dtoHistorico;
	}

	/**
	 * @param dtoHistorico the dtoHistorico to set
	 */
	public void setDtoHistorico(ItemServicoLcISSDTO dtoHistorico) {
		this.dtoHistorico = dtoHistorico;
	}

	/**
	 * @return the dtoDetalhar
	 */
	public ItemServicoLcISSDTO getDtoDetalhar() {
		return dtoDetalhar;
	}

	/**
	 * @param dtoDetalhar the dtoDetalhar to set
	 */
	public void setDtoDetalhar(ItemServicoLcISSDTO dtoDetalhar) {
		this.dtoDetalhar = dtoDetalhar;
	}

	/**
	 * @return the selectItemServico
	 */
	public List<SelectItem> getSelectItemServico() {
		return selectItemServico;
	}

	/**
	 * @param selectItemServico the selectItemServico to set
	 */
	public void setSelectItemServico(List<SelectItem> selectItemServico) {
		this.selectItemServico = selectItemServico;
	}

	/**
	 * @return the comboServico
	 */
	public List<CombosISSDTO> getComboServico() {
		return comboServico;
	}

	/**
	 * @param comboServico the comboServico to set
	 */
	public void setComboServico(List<CombosISSDTO> comboServico) {
		this.comboServico = comboServico;
	}

	/**
	 * @return the utilidadesServiceImpl
	 */
	public IUtilidadesService getUtilidadesServiceImpl() {
		return utilidadesServiceImpl;
	}

	/**
	 * @param utilidadesServiceImpl the utilidadesServiceImpl to set
	 */
	public void setUtilidadesServiceImpl(IUtilidadesService utilidadesServiceImpl) {
		this.utilidadesServiceImpl = utilidadesServiceImpl;
	}

}