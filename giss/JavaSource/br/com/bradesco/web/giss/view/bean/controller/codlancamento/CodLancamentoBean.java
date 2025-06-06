package br.com.bradesco.web.giss.view.bean.controller.codlancamento;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.codlancamento.ICodLancamentoService;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.CodLancamentoDTO;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.DetalheHistoricoDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;

public class CodLancamentoBean extends FiltroGenericoGISSBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = -95056171670006982L;

	private boolean mostrarLista;

	private CodLancamentoDTO dtoIncluir = new CodLancamentoDTO();

	private CodLancamentoDTO dtoManter = new CodLancamentoDTO();
	
	private CodLancamentoDTO dtoAlterar = new CodLancamentoDTO();

	private CodLancamentoDTO dtoHist = new CodLancamentoDTO();

	private CodLancamentoDTO dto = new CodLancamentoDTO();
	
	private DetalheHistoricoDTO detalheHistoricoDto =  new DetalheHistoricoDTO();
	
	private List<SelectItem> listaControleRadio = new ArrayList<SelectItem>();

	private ICodLancamentoService codLancamentoServiceImpl;
	
	private boolean hiddenProsseguir;
	
	private boolean checkTodos;
	
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	
	public String carregarIncluir() {
		dtoIncluir = new CodLancamentoDTO();
		mostrarLista = false;
		listarCodLancamento(dtoIncluir);
		return "incluirCodLancamento";
	}
	
	public String carregarManter() {
		codigosSelecionadosTabela = new Integer[100];
		checkTodos = false;
		dtoManter = new CodLancamentoDTO();
		hiddenProsseguir = true;
		listarCodLancamento(dtoManter);
		return "manterCodLancamento";
	}
	
	public String carregarHistorico() {
		dtoHist = new CodLancamentoDTO();
		mostrarLista = false;
		return "conHistCodLancamento";
	}
	public String limparDados() {
		dtoIncluir.setCodLancamento(null);
		dtoIncluir.setSegLinhaExtrato(null);
		dtoIncluir.setCosif(null);
		dtoIncluir.setRazao(null);
		dtoIncluir.setConta(null);
		dtoIncluir.setDigito(null);
		dtoIncluir.setNomeConta(null);
		dtoIncluir.setCodItem(null);
		return "incluirCodLancamento";
	}
	
	public String limparDadosHistorico() {
		dtoHist.setCodLancamento(null);
		dtoHist.setDataInicial(null);
		dtoHist.setDataFinal(null);
		
		
		return "conHistCodLancamento";
	}

	private void listarCodLancamento(CodLancamentoDTO dto) {
		try {
			dto = codLancamentoServiceImpl.listaCodLancamento(dto);
			mostrarLista = dto.getLista().size()>0;
			if (dto.getLista() != null) {
				listaControleRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					listaControleRadio.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public String listarHistorico() {
		try {
			if(dtoHist.getDataInicial() == null || dtoHist.getDataFinal() == null){ 
				BradescoFacesUtils.addInfoModalMessage("O período deve ser preenchido.", "conHistCodLancamento", BradescoViewExceptionActionType.ACTION, false);
			}else if (dtoHist.getDataFinal().compareTo(dtoHist.getDataInicial()) < 0 ) {
				dtoHist.setDataInicial(null);
				dtoHist.setDataFinal(null);
				BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data inicial.", "conHistCodLancamento", BradescoViewExceptionActionType.ACTION, false);
			}else {
				dtoHist.setLista(new ArrayList<CodLancamentoDTO>());
				dtoHist = codLancamentoServiceImpl.listaHistorico(dtoHist);
				mostrarLista = dtoHist.getLista().size() > 0;
				if(mostrarLista){
					
					listaControleRadio = new ArrayList<SelectItem>();
					for (int i = 0; i < dtoHist.getLista().size(); i++) {
						listaControleRadio.add(new SelectItem(i, " "));
					}
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return "conHistCodLancamento";
	}
	
	public String detalharHistorico(){
		Integer item = dtoHist.getItemSelecionado(); 
		if(item == null){
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);
		}
		
		Integer cdLancamento = getDtoHist().getLista().get(item).getCodLancamento();
		Integer paramLancamentoContabio = getDtoHist().getLista().get(item).getParamLancamentoContabil();
		String horainclusaoRegistroHistorico = getDtoHist().getLista().get(item).getHrInclusaoRegistroHistorico();		
		
		detalheHistoricoDto = codLancamentoServiceImpl.detalheHistorico(cdLancamento, paramLancamentoContabio, horainclusaoRegistroHistorico);
		
		return "detHistCodLancamento";
	}
	
	public String voltarConHistorico(){
		
		return "conHistCodLancamento";
	}
	

	
	public String incluirCodLancamento(){
		if (isHiddenProsseguir()) {
			if(GissUtil.validarRazao(dtoIncluir.getRazao()) == -1){
			    BradescoFacesUtils.addInfoModalMessage("Campo Razão inválido.", false);
			    return"";
			}
			if (GissUtil.notNull(dtoIncluir.getCodLancamento()) == 0) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código de Lançamento!", false);
			}else if(GissUtil.notNull(dtoIncluir.getSegLinhaExtrato()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a 2º Linha do Extrado!", false);
			}else if(GissUtil.notNull(dtoIncluir.getCosif()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o COSIF!", false);
			}else if(GissUtil.notNull(dtoIncluir.getRazao()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Razão!", false);
			}else if(GissUtil.notNull(dtoIncluir.getConta()) == 0 && GissUtil.notNull(dtoIncluir.getDigito()) == ""){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Conta e o Digito!", false);
			}else if(GissUtil.notNull(dtoIncluir.getNomeConta()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Nome da Conta!", false);
			}else if(GissUtil.notNull(dtoIncluir.getCodItem()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código de Serviço!", false);
			}else {
				BradescoFacesUtils.addInfoModalMessage(codLancamentoServiceImpl.incluir(dtoIncluir), false);
				dtoIncluir = new CodLancamentoDTO();
				listarCodLancamento(dtoIncluir);
			}
		}
		return "incluirCodLancamento";
			
	}
	
	public String carregarAlterar(){
		if(codigosSelecionadosTabela.length == 1){
			dtoAlterar = new CodLancamentoDTO();
			GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(codigosSelecionadosTabela[0]), dtoAlterar);
			return "alterarCodLancamento";
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar apenas um item na lista!", false);
			return "";
		}
	}
	
	public String alterar(){
		if (isHiddenProsseguir()) {
			if(GissUtil.validarRazao(dtoAlterar.getRazao()) == -1){
			    BradescoFacesUtils.addInfoModalMessage("Campo Razão inválido.", false);
			    return"";
			}
			if (GissUtil.notNull(dtoAlterar.getCodLancamento()) == 0) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código de Lançamento!", false);
			}else if(GissUtil.notNull(dtoAlterar.getSegLinhaExtrato()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a 2º Linha do Extrado!", false);
			}else if(GissUtil.notNull(dtoAlterar.getCosif()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o COSIF!", false);
			}else if(GissUtil.notNull(dtoAlterar.getRazao()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Razão!", false);
			}else if(GissUtil.notNull(dtoAlterar.getConta()) == 0 && GissUtil.notNull(dtoAlterar.getDigito()) == ""){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Conta e o Digito!", false);
			}else if(GissUtil.notNull(dtoAlterar.getNomeConta()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Nome da Conta!", false);
			}else if(GissUtil.notNull(dtoAlterar.getCodItem()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Item da Lei Complementar!", false);
			}else {
				BradescoFacesUtils.addInfoModalMessage(codLancamentoServiceImpl.alterar(dtoAlterar), false);
				carregarManter();
			}
			return "manterCodLancamento";
		}
		return "";
	}
	
	public String excluir(){
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabela.length > 0){
				dto.setLista(new ArrayList<CodLancamentoDTO>());
				for (Integer check : codigosSelecionadosTabela) {
					dto.getLista().add(dtoManter.getLista().get(check));
				}
				String msg = codLancamentoServiceImpl.excluir(dto);
				BradescoFacesUtils.addInfoModalMessage(msg, false);
				return carregarManter();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
				return "";
			}
		}
		return "";
	}
	
	public void paginarListaIncluir(ActionEvent event) {
		listarCodLancamento(dtoIncluir);
	}
	public void paginarListaManter(ActionEvent event) {
		listarCodLancamento(dtoManter);
	}
	
	
	public void paginarListaHist(ActionEvent event) {
		listarHistorico();
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

	/**
	 * @return the codLancamentoServiceImpl
	 */
	public ICodLancamentoService getCodLancamentoServiceImpl() {
		return codLancamentoServiceImpl;
	}

	/**
	 * @param codLancamentoServiceImpl the codLancamentoServiceImpl to set
	 */
	public void setCodLancamentoServiceImpl(ICodLancamentoService codLancamentoServiceImpl) {
		this.codLancamentoServiceImpl = codLancamentoServiceImpl;
	}

	/**
	 * @return the dto
	 */
	public CodLancamentoDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(CodLancamentoDTO dto) {
		this.dto = dto;
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
	 * @return the listaControleRadio
	 */
	public List<SelectItem> getListaControleRadio() {
		return listaControleRadio;
	}

	/**
	 * @param listaControleRadio the listaControleRadio to set
	 */
	public void setListaControleRadio(List<SelectItem> listaControleRadio) {
		this.listaControleRadio = listaControleRadio;
	}

	/**
	 * @return the dtoIncluir
	 */
	public CodLancamentoDTO getDtoIncluir() {
		return dtoIncluir;
	}

	/**
	 * @param dtoIncluir the dtoIncluir to set
	 */
	public void setDtoIncluir(CodLancamentoDTO dtoIncluir) {
		this.dtoIncluir = dtoIncluir;
	}

	/**
	 * @return the dtoManter
	 */
	public CodLancamentoDTO getDtoManter() {
		return dtoManter;
	}

	/**
	 * @param dtoManter the dtoManter to set
	 */
	public void setDtoManter(CodLancamentoDTO dtoManter) {
		this.dtoManter = dtoManter;
	}

	/**
	 * @return the dtoAlterar
	 */
	public CodLancamentoDTO getDtoAlterar() {
		return dtoAlterar;
	}

	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(CodLancamentoDTO dtoAlterar) {
		this.dtoAlterar = dtoAlterar;
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
	 * @return the dtoHist
	 */
	public CodLancamentoDTO getDtoHist() {
		return dtoHist;
	}

	/**
	 * @param dtoHist the dtoHist to set
	 */
	public void setDtoHist(CodLancamentoDTO dtoHist) {
		this.dtoHist = dtoHist;
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
	 * @return the detalheHistoricoDto
	 */
	public DetalheHistoricoDTO getDetalheHistoricoDto() {
		return detalheHistoricoDto;
	}

	/**
	 * @param detalheHistoricoDto the detalheHistoricoDto to set
	 */
	public void setDetalheHistoricoDto(DetalheHistoricoDTO detalheHistoricoDto) {
		this.detalheHistoricoDto = detalheHistoricoDto;
	}

}
