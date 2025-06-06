package br.com.bradesco.web.giss.view.bean.controller.cargamassivaaliquota;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.ICargaMassivaAliquotaService;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class ManterAliquotaBean implements Serializable, BuscaMunicipioCallback{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8338151151411433963L;
	
	private static final String MANTER_ALIQUOTA_CONSULTA = "manterAliquotaConsultar";
	private static final String MANTER_ALIQUOTA_INCLUIR = "manterAliquotaIncluir";
	private static final String MANTER_ALIQUOTA_ALTERAR = "manterAliquotaAlterar";
	private static final String MANTER_ALIQUOTA_EXCLUIR = "manterAliquotaExcluir";
	
	private static final String TIPO_TELA_INCLUIR = "I";
	private static final String TIPO_TELA_ALTERAR = "A";
	private static final String TIPO_TELA_EXCLUIR = "E";

	private ILogManager logManager;
	
	private List<SelectItem> listaControle;
	private List<ManterAliquotaDTO> listaConsulta;
	private List<ItemManterAliquotaDTO> listaDetalhe;
	private Integer itemSelecionado;
	private ManterAliquotaFiltroDTO filtro;
	private List<SelectItem> listaEstados;
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private ManterAliquotaDTO dto;
	private String tipoTela;
	private boolean checkTodos;
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	private List<SelectItem> selectItemLei = new ArrayList<SelectItem>();
	
	private ICargaMassivaAliquotaService cargaMassivaAliquotaServiceImpl;
	private IUtilidadesService utilidadesServiceImpl;
	
	public String inicializar(){
		limpar();
		carregarCombos();
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public void pesquisarMunicipioManterAliquota(){
		pesquisarMunicipio();
	}
	
	public String pesquisar() {
		try {
			setListaControle(new ArrayList<SelectItem>());
			setListaConsulta(new ArrayList<ManterAliquotaDTO>());
			setItemSelecionado(null);
			if (validarPesquisa()) {
				List<ManterAliquotaDTO> lista = getCargaMassivaAliquotaServiceImpl().listarManterAliquotaIssProprio(getFiltro());
				
				if (!GissUtil.isEmptyOrNull(lista)) {
					setListaConsulta(lista);
					setListaControle(GissUtil.criarSelectItemList(getListaConsulta().size(), 0));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public String incluir() {
		if(getItemSelecionado() == null){
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
		} else {
			return detalhar(MANTER_ALIQUOTA_INCLUIR, TIPO_TELA_INCLUIR);
		}
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public String alterar() {
		if(getItemSelecionado() == null){
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
		} else {
			return detalhar(MANTER_ALIQUOTA_ALTERAR, TIPO_TELA_ALTERAR);
		}
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public String excluir() {
		if(getItemSelecionado() == null){
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);			
		} else {
			return detalhar(MANTER_ALIQUOTA_EXCLUIR, TIPO_TELA_EXCLUIR);
		}
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	private String detalhar(String telaRetorno, String tipoTela) {
		try {
		
			setDto(getListaConsulta().get(getItemSelecionado()));
			getDto().atualizarEstado(GissUtil.procuraUnidadeFederativaSemCodigo(getListaEstados(), getFiltro().getCodigoEstado()));
			getDto().atualizarIndicadorPesquisa(getFiltro().getIndicadorPesquisa());
			setListaDetalhe(new ArrayList<ItemManterAliquotaDTO>());
			setTipoTela(tipoTela);
			setCheckTodos(false);
			
			List<ItemManterAliquotaDTO> lista = getCargaMassivaAliquotaServiceImpl().detalharManterAliquotaIssProprio(getDto(), tipoTela);
			
			if (!GissUtil.isEmptyOrNull(lista)) {
				setListaDetalhe(lista);
			}
			
			codigosSelecionadosTabela = new Integer[100];
			selectItemLei = new ArrayList<SelectItem>();
			for (int i = 0; i < getListaDetalhe().size(); i++) {
				selectItemLei.add(new SelectItem(i, " "));
			}
			
			return telaRetorno;
		} catch (PdcAdapterFunctionalException p) {
			setItemSelecionado(null);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			setItemSelecionado(null);
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public String exportarExcel(ActionEvent ae){
		try {
			if(!GissUtil.isEmptyOrNull(getListaConsulta())){
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha Manter Alíquotas", "PLANILHA_MANTER_ALIQUOTAS");
				exportarPlanilha.planilhaManterAliquotas(getListaConsulta()); 
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista está vazia", false);
				return"";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	public String voltar() {
		setItemSelecionado(null);
		setDto(null);
		setTipoTela("");
		return MANTER_ALIQUOTA_CONSULTA;
	}
	
	public void atribuirTodos() {
		
		if(isCheckTodos()){
			codigosSelecionadosTabela = new Integer[getListaDetalhe().size()];
			for (int i = 0; i < getListaDetalhe().size(); i++) {
				if(i== 100)
					break;
					codigosSelecionadosTabela[i] = i;
			}
		}else{
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	
	public String incluirAliquota() {
		return modificarAliquota(MANTER_ALIQUOTA_INCLUIR);
	}
	
	public String alterarAliquota() {
		return modificarAliquota(MANTER_ALIQUOTA_ALTERAR);
	}
	
	public String excluirAliquota() {
		return modificarAliquota(MANTER_ALIQUOTA_EXCLUIR);
	}
	
	private String modificarAliquota(String telaRetorno) {
		try {
			if (getCodigosSelecionadosTabela().length > 0) {
				List<ItemManterAliquotaDTO> listaAliquotas = new ArrayList<ItemManterAliquotaDTO>();
				for (int i = 0; i < getCodigosSelecionadosTabela().length; i++) {
					listaAliquotas.add(getListaDetalhe().get(getCodigosSelecionadosTabela()[i]));
				}
				
				String retorno = getCargaMassivaAliquotaServiceImpl().modificarAliquotaIssProprio(getDto(), listaAliquotas, getTipoTela());
				
				BradescoFacesUtils.addInfoModalMessage(retorno, false);
				
				return pesquisar();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			getLogManager().error(this.getClass(), p);
		} catch (Exception e) {
			GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			getLogManager().error(this.getClass(), e);
		}
		return telaRetorno;
	}
	
	public boolean getExibirBotaoIncluirAliquota() {
		boolean exibirBotaoIncluirAliquota = false;
		if (TIPO_TELA_INCLUIR.equals(getTipoTela())) {
			exibirBotaoIncluirAliquota = true;
		}
		return exibirBotaoIncluirAliquota;
	}
	
	public boolean getExibirBotaoAlterarAliquota() {
		boolean exibirBotaoAlterarAliquota = false;
		if (TIPO_TELA_ALTERAR.equals(getTipoTela())) {
			exibirBotaoAlterarAliquota = true;
		}
		return exibirBotaoAlterarAliquota;
	}
	
	public boolean getExibirBotaoExcluirAliquota() {
		boolean exibirBotaoExcluirAliquota = false;
		if (TIPO_TELA_EXCLUIR.equals(getTipoTela())) {
			exibirBotaoExcluirAliquota = true;
		}
		return exibirBotaoExcluirAliquota;
	}
	
	private boolean validarPesquisa() {
		if(GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getMesInicial()))) 
			|| GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getAnoInicial())))) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Competência Inicial!", false);
			return false;
		} 
		
		if(GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getMesFinal()))) 
			|| GissUtil.isEmptyOrNull(GissUtil.zeroNull(GissUtil.stringToInteger(getFiltro().getAnoFinal())))){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Competência Final!", false);
			return false;
		}
		
		if(GissUtil.isEmptyOrNull(GissUtil.notNull(getFiltro().getCodigoMunicipio()))){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código IBGE!", false);
			return false;
		}
		return true;
	}

	private void pesquisarMunicipio(){
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(getFiltro().getCodigoEstado().equals(listaDosEstados.get(i).getCodigo()))
				uf = listaDosEstados.get(i).getSigla();
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscar();
	}
	
	public void processa() {
		getFiltro().setCodigoEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(getListaDosEstados(), getBuscaMunicipio().getUf()));
		getFiltro().setCodigoMunicipio(getBuscaMunicipio().getCodigo());
	}

	private void carregarCombos() {
		setListaDosEstados(getUtilidadesServiceImpl().listagemEstados());
		setListaEstados(GissUtil.carregaComboEstados(getListaDosEstados()));
	}

	private void limpar() {
		setFiltro(new ManterAliquotaFiltroDTO());
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<ManterAliquotaDTO>());
		setItemSelecionado(null);
		setListaEstados(new ArrayList<SelectItem>());
		setListaDosEstados(new ArrayList<EstadosComboBean>());
		setBuscaMunicipio(new BuscaMunicipioBean());
	}
	
	

	public ILogManager getLogManager() {
		return logManager;
	}

	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	public ICargaMassivaAliquotaService getCargaMassivaAliquotaServiceImpl() {
		return cargaMassivaAliquotaServiceImpl;
	}

	public void setCargaMassivaAliquotaServiceImpl(
			ICargaMassivaAliquotaService cargaMassivaAliquotaServiceImpl) {
		this.cargaMassivaAliquotaServiceImpl = cargaMassivaAliquotaServiceImpl;
	}

	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	public List<ManterAliquotaDTO> getListaConsulta() {
		return listaConsulta;
	}

	public void setListaConsulta(List<ManterAliquotaDTO> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

	public Integer getItemSelecionado() {
		return itemSelecionado;
	}

	public void setItemSelecionado(Integer itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}

	public ManterAliquotaFiltroDTO getFiltro() {
		return filtro;
	}

	public void setFiltro(ManterAliquotaFiltroDTO filtro) {
		this.filtro = filtro;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public IUtilidadesService getUtilidadesServiceImpl() {
		return utilidadesServiceImpl;
	}

	public void setUtilidadesServiceImpl(IUtilidadesService utilidadesServiceImpl) {
		this.utilidadesServiceImpl = utilidadesServiceImpl;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public List<ItemManterAliquotaDTO> getListaDetalhe() {
		return listaDetalhe;
	}

	public void setListaDetalhe(List<ItemManterAliquotaDTO> listaDetalhe) {
		this.listaDetalhe = listaDetalhe;
	}

	public ManterAliquotaDTO getDto() {
		return dto;
	}

	public void setDto(ManterAliquotaDTO dto) {
		this.dto = dto;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}

	public boolean isCheckTodos() {
		return checkTodos;
	}

	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}

	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}

	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}

	public List<SelectItem> getSelectItemLei() {
		return selectItemLei;
	}

	public void setSelectItemLei(List<SelectItem> selectItemLei) {
		this.selectItemLei = selectItemLei;
	}
}
