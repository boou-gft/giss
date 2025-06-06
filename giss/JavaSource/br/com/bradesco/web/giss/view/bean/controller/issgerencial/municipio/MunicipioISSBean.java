package br.com.bradesco.web.giss.view.bean.controller.issgerencial.municipio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issmunicipio.IMunicipioISSService;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: MunicipioISSBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class MunicipioISSBean implements Serializable, BuscaMunicipioCallback {
	/**
	 * 
	 */
	private static final long serialVersionUID = -95056171670006982L;

	private IMunicipioISSService municipioISSServiceImpl = null;
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	
	private boolean hiddenProsseguir = false;
	private boolean mostrarLista = false;
	
	private Integer itemTabelaSelecionado = null;
	private String tipoManutencao = "";
	
	private MunicipioISSDTO dtoManter = new MunicipioISSDTO();
	private MunicipioISSDTO dtoAlterar = new MunicipioISSDTO();
	private MunicipioISSDTO dtoHistorico = new MunicipioISSDTO();
	private MunicipioISSDTO dtoHistoricoDet = new MunicipioISSDTO();
	
	private List<SelectItem> listaControleRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	/**
	 * Ação.
	 */
	private final static String EXCLUSAO = "E";
	/**
	 * Ação.
	 */
	private final static String ALTERACAO = "A";
	/**
	 * Ação.
	 */
	private final static String CONSULTA = "C";
	/**
	 * Ação.
	 */
	private final static String HISTORICO = "H";

	public String carregarManter() {
		dtoManter = new MunicipioISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		hiddenProsseguir = true;
		mostrarLista = false;
		itemTabelaSelecionado = null;
		carregaComboEstados();
		tipoManutencao = CONSULTA;
		return "manterMunicipio";
	}
	
	/**
	 * @nome: carregarHistorico
	 * @propósito: Método responsável por carregarHistorico.
	 *
	 * @return String
	 */
	public String carregarHistorico() {
		dtoHistorico = new MunicipioISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		hiddenProsseguir = true;
		mostrarLista = false;
		itemTabelaSelecionado = null;
		carregaComboEstados();
		tipoManutencao = HISTORICO;
		return "consultarHistoricoMunicipio";
	}
	
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
	public String pesquisar() {
		try {
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				pesquisarMunicipio();
				dtoManter.setCodMunicipio(buscaMunicipio.getCodigo());
				listarMunicipiosManter();
			} else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
				pesquisarMunicipio();
				return "";
			} else if(!GissUtil.notNull(dtoManter.getEstado()).equals("")) {
				dtoManter.setCodMunicipio(GissUtil.notNull(buscaMunicipio.getCodigo())!=0l?buscaMunicipio.getCodigo():0l);
				listarMunicipiosManter();
			} else {			
				BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return "";
	}
	
	/**
	 * @nome: pesquisarHistoricoMunicipio
	 * @propósito: Método responsável por pesquisarHistoricoMunicipio.
	 *
	 * @return String
	 */
	public String pesquisarHistoricoMunicipio() {
		if(!GissUtil.isEmptyOrNull(dtoHistorico.getDataAtualizacao()) 
			&& (GissUtil.notNull(buscaMunicipio.getCodigo()) != 0 
				|| !GissUtil.notNull(buscaMunicipio.getDescricao()).equals("") 
				|| !GissUtil.notNull(dtoHistorico.getEstado()).equals(""))) {
			BradescoFacesUtils.addInfoModalMessage("Pesquisa permitida somente por data de atualização ou por município.", false);
			return "";
		}
		if(dtoHistorico.getDataAtualizacao() != null) {
			dtoHistorico.setCodMunicipio(0l);
			dtoHistorico.setCodigoUf(0);
			listarMunicipiosHistorico();
			return "";
		}
		if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
			pesquisarMunicipio();
			dtoHistorico.setCodMunicipio(buscaMunicipio.getCodigo());
			listarMunicipiosHistorico();
		} else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
			pesquisarMunicipio();
			return "";
		} else if(!GissUtil.notNull(dtoManter.getEstado()).equals("")) {
			dtoHistorico.setCodMunicipio(GissUtil.notNull(buscaMunicipio.getCodigo())!=0l?buscaMunicipio.getCodigo():0l);
			listarMunicipiosHistorico();
		} else {			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
		}
		return "";
	}
	
	private void listarMunicipiosManter() {
		try {
			dtoManter.setLista(new ArrayList<MunicipioISSDTO>());
			listaControleRadio = new ArrayList<SelectItem>();
			dtoManter.setCodigoUf(GissUtil.notNull(dtoManter.getEstado()).equals("")?0:Integer.valueOf(dtoManter.getEstado()));
			municipioISSServiceImpl.consultarMunicipio(dtoManter);
			mostrarLista = dtoManter.getLista().size() > 0;
			if (dtoManter.getLista() != null) {
				listaControleRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < dtoManter.getLista().size(); i++) {
					listaControleRadio.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterMunicipio", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	/**
	 * @nome: listarMunicipiosHistorico
	 * @propósito: Método responsável por listarMunicipiosHistorico.
	 */
	private void listarMunicipiosHistorico() {
		try {
			dtoHistorico.setLista(new ArrayList<MunicipioISSDTO>());
			listaControleRadio = new ArrayList<SelectItem>();
			dtoHistorico.setCodigoUf(
				GissUtil.notNull(dtoHistorico.getEstado()).equals("")?0:Integer.valueOf(dtoHistorico.getEstado()));
			municipioISSServiceImpl.consultarHistoricoMunicipio(dtoHistorico);
			mostrarLista = dtoHistorico.getLista().size() > 0;
			if (dtoHistorico.getLista() != null) {
				listaControleRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < dtoHistorico.getLista().size(); i++) {
					listaControleRadio.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(
				p.getMessage(), "consultarHistoricoMunicipio", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void processa() {
		String estado = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		if (tipoManutencao.equals(HISTORICO)) {
			dtoHistorico.setEstado(estado);
		} else {
			dtoManter.setEstado(estado);
		}
	}
	
	public void pesquisarMunicipio() {
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		String estado = tipoManutencao.equals(HISTORICO)?dtoHistorico.getEstado():dtoManter.getEstado();
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(estado.equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	public String carregarDetalhar() {
		if(itemTabelaSelecionado != null) {
			dtoAlterar = new MunicipioISSDTO();
			GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(itemTabelaSelecionado), dtoAlterar);
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(String.valueOf(GissUtil.notNull(dtoAlterar.getCodigoUf())).equals(listaDosEstados.get(i).getCodigo())) {
					dtoAlterar.setEstado(listaDosEstados.get(i).getNome());
				}
			}
			return "detalharMunicipio";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";
		}
	}
	
	/**
	 * @nome: carregarDetalharHistorico
	 * @propósito: Método responsável por carregarDetalharHistorico.
	 *
	 * @return String
	 */
	public String carregarDetalharHistorico() {
		if(itemTabelaSelecionado != null) {
			dtoHistoricoDet = new MunicipioISSDTO();
			dtoHistoricoDet = municipioISSServiceImpl.detalharHistoricoMunicipio(dtoHistorico.getLista().get(itemTabelaSelecionado));
			return "detalharMunicipioHistorico";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";
		}
	}
	
	/**
	 * @nome: carregarAlterar
	 * @propósito: Método responsável por carregarAlterar.
	 *
	 * @return String
	 */
	public String carregarAlterar() {
		if(itemTabelaSelecionado!= null) {
			dtoAlterar = new MunicipioISSDTO();
			GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(itemTabelaSelecionado), dtoAlterar);
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(String.valueOf(GissUtil.notNull(dtoAlterar.getCodigoUf())).equals(listaDosEstados.get(i).getCodigo())) {
					dtoAlterar.setEstado(listaDosEstados.get(i).getNome());
				}
			}
			return "alterarMunicipio";
		} else {	
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";	
		}
	}
	
	public String alterar() {
		if (isHiddenProsseguir()) {
			if(GissUtil.notNull(dtoAlterar.getAliquotaPadrao()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Aliquota Padrão!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getDiaRecolhimento()) == 0) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Dia de Recolhimento!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getIndicadorDiaUtil()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Indicador de Dia Útil!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getRegrasDiaNaoUtil()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Regra Dia não Útil!", false);
				return "";
			}
			BradescoFacesUtils.addInfoModalMessage(municipioISSServiceImpl.manutencaoMunicipio(dtoAlterar, ALTERACAO), false);
			return carregarManter();
		}
		return "";
	}
	
	public String excluir() {
		if (isHiddenProsseguir()) {
			if(itemTabelaSelecionado == null) {
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
				return "";
			} else {
				if(dtoManter.getLista().get(itemTabelaSelecionado).getStatus().equalsIgnoreCase("A")) {
					BradescoFacesUtils.addInfoModalMessage(
						municipioISSServiceImpl.manutencaoMunicipio(
							dtoManter.getLista().get(itemTabelaSelecionado), EXCLUSAO), false);
					return carregarManter();
				} else {
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar um município ativo!", false);
					return "";
				}
			}
		}
		return "";
	}
	
	/**
	 * @nome: reativar
	 * @propósito: Método responsável por reativar.
	 *
	 * @return String
	 */
	public String reativar() {
		if (isHiddenProsseguir()) {
			if(itemTabelaSelecionado == null) {
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
				return "";
			} else {
				if(dtoManter.getLista().get(itemTabelaSelecionado).getStatus().equalsIgnoreCase("I")) {
					BradescoFacesUtils.addInfoModalMessage(
						municipioISSServiceImpl.reativarMunicipio(
							dtoManter.getLista().get(itemTabelaSelecionado)), false);
					return carregarManter();
				} else {
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar um município inativo!", false);
					return "";
				}
			}
		}
		return "";
	}
	
	public String limparDados() {
		return "incluirMunicipio";
		
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @param ae
	 * @return
	 */
	public String imprimirPlanilha(ActionEvent ae) {
		try {
			if(dtoManter.getLista().size() >0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Manter Municípios ISS", "MANTER_MUNICIPIOS_ISS");
				exportarPlanilha.planilhaMunicipiosIss(dtoManter);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista de municipios vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}
	
	/**
	 * @nome: voltar
	 * @propósito: Método responsável por voltar.
	 *
	 * @return String
	 */
	public String voltar() {
		return "consultarHistoricoMunicipio";
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
	 * @return the dtoManter
	 */
	public MunicipioISSDTO getDtoManter() {
		return dtoManter;
	}

	/**
	 * @param dtoManter the dtoManter to set
	 */
	public void setDtoManter(MunicipioISSDTO dtoManter) {
		this.dtoManter = dtoManter;
	}

	/**
	 * @return the dtoAlterar
	 */
	public MunicipioISSDTO getDtoAlterar() {
		return dtoAlterar;
	}

	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(MunicipioISSDTO dtoAlterar) {
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
	 * @return the itemTabelaSelecionado
	 */
	public Integer getItemTabelaSelecionado() {
		return itemTabelaSelecionado;
	}

	/**
	 * @param itemTabelaSelecionado the itemTabelaSelecionado to set
	 */
	public void setItemTabelaSelecionado(Integer itemTabelaSelecionado) {
		this.itemTabelaSelecionado = itemTabelaSelecionado;
	}

	/**
	 * @return the listaEstados
	 */
	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	/**
	 * @param listaEstados the listaEstados to set
	 */
	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	/**
	 * @return the municipioISSServiceImpl
	 */
	public IMunicipioISSService getMunicipioISSServiceImpl() {
		return municipioISSServiceImpl;
	}

	/**
	 * @param municipioISSServiceImpl the municipioISSServiceImpl to set
	 */
	public void setMunicipioISSServiceImpl(IMunicipioISSService municipioISSServiceImpl) {
		this.municipioISSServiceImpl = municipioISSServiceImpl;
	}

	/**
	 * @return the buscaMunicipio
	 */
	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	/**
	 * @param buscaMunicipio the buscaMunicipio to set
	 */
	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	/**
	 * @return the listaDosEstados
	 */
	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	/**
	 * @param listaDosEstados the listaDosEstados to set
	 */
	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public MunicipioISSDTO getDtoHistorico() {
		return dtoHistorico;
	}

	public void setDtoHistorico(MunicipioISSDTO dtoHistorico) {
		this.dtoHistorico = dtoHistorico;
	}

	public MunicipioISSDTO getDtoHistoricoDet() {
		return dtoHistoricoDet;
	}

	public void setDtoHistoricoDet(MunicipioISSDTO dtoHistoricoDet) {
		this.dtoHistoricoDet = dtoHistoricoDet;
	}

}