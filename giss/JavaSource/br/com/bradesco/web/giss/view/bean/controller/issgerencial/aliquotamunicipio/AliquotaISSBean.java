package br.com.bradesco.web.giss.view.bean.controller.issgerencial.aliquotamunicipio;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issaliquota.IAliquotaISSService;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.IRelatorioISSService;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: AliquotaISSBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class AliquotaISSBean implements Serializable, BuscaMunicipioCallback {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int MANTER = 1;
	private static final int GERAR_RELATORIO = 2;
	
	private IAliquotaISSService aliquotaISSServiceImpl = null;
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	IRelatorioISSService relatorioISSServiceImpl = 
		(IRelatorioISSService) FacesUtils.getManagedBean("relatorioISSServiceImpl"); 
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean(); 
	
	private AliquotaISSDTO dtoManter = new AliquotaISSDTO();
	private AliquotaISSDTO dtoAlterar = new AliquotaISSDTO();
	private AliquotaISSDTO itemLei = new AliquotaISSDTO();
	private AliquotaISSDTO dtoGerarRelatorio = new AliquotaISSDTO();
	
	private Integer radioListaAliquotaMunicipio = null;
	private AliquotaISSDTO itemAliquotaISSDTO = new AliquotaISSDTO();
	private List<SelectItem> selectItemAliquotaMunicipio = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemAliquotaAlterar = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemLei = new ArrayList<SelectItem>();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>(); 
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>(); 
	private List<SelectItem> selectItemServico = new ArrayList<SelectItem>(); 
	private List<CombosISSDTO> comboServico = new ArrayList<CombosISSDTO>(); 
	private boolean hiddenProsseguir = false;
	private boolean mostrarLista = false; 
	private boolean mostraBotoes = false;
	
	private int tipoTela = 0;
	
	private boolean checkTodos = false;
	
	private Integer[] codigosSelecionadosTabela = new Integer[100];
	
	/**
	 * @nome: carregarManter
	 * @propósito: Método responsável por carregarManter.
	 *
	 * @return String
	 */
	public String carregarManter() {
		dtoManter = new AliquotaISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		mostrarLista = false;
		mostraBotoes = false;
		radioListaAliquotaMunicipio = null;
		carregaComboEstados();
		tipoTela = MANTER;
		return "manterAliquotaMunicipio";
	}
	
	/**
	 * @nome: carregarRelatoriosDeAliquotas
	 * @propósito: Método responsável por carregarRelatoriosDeAliquotas.
	 *
	 * @return String
	 */
	public String carregarRelatoriosDeAliquotas() {
		dtoGerarRelatorio = new AliquotaISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		carregarComboItemServico();
		carregaComboEstados();
		tipoTela = GERAR_RELATORIO;
		return "gerarRelatoriosAliquotas";
	}
	
	/**
	 * @nome: carregaComboEstados
	 * @propósito: Método responsável por carregaComboEstados.
	 */
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
	/**
	 * @nome: processa
	 * @propósito: Método responsável por processa.
	 */
	public void processa() {
		if (tipoTela == MANTER) {
			dtoManter.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
		} else {
			dtoGerarRelatorio.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
		}
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 */
	public void pesquisarMunicipio() {
		pesquisarMunicipio(dtoManter);
	}

	/**
	 * @nome: pesquisarMunicipioRelatorio
	 * @propósito: Método responsável por pesquisarMunicipioRelatorio.
	 */
	public void pesquisarMunicipioRelatorio() {
		pesquisarMunicipio(dtoGerarRelatorio);
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 *
	 * @param dto AliquotaISSDTO
	 */
	private void pesquisarMunicipio(AliquotaISSDTO dto) {
		String uf = null;
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (dto.getEstado().equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	/**
	 * @nome: pesquisarManterAliquota
	 * @propósito: Método responsável por pesquisarManterAliquota.
	 *
	 * @return String
	 */
	public String pesquisarManterAliquota() {
		try {
			if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
				pesquisarMunicipio();
				dtoManter.setCodMunicipio(buscaMunicipio.getCodigo());
				listarAliquota();
			} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
				pesquisarMunicipio();
				return "";
			} else if (!GissUtil.notNull(dtoManter.getEstado()).equals("")) {
				dtoManter.setCodMunicipio(buscaMunicipio.getCodigo()!=null&&buscaMunicipio.getCodigo()!=0?buscaMunicipio.getCodigo():0l);
				listarAliquota();
			} else {			
				BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
			}
		} catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
		return "manterAliquotaMunicipio";
	}	

	/**
	 * @nome: listarAliquota
	 * @propósito: Método responsável por listarAliquota.
	 */
	private void listarAliquota() {
		getDtoManter().setListaAliqMunicipios(new ArrayList<AliquotaISSDTO>());

		getDtoManter().setCodUf(GissUtil.verificaStringNulaInteger(getDtoManter().getEstado()));
		getDtoManter().setListaAliqMunicipios(
				getAliquotaISSServiceImpl().consultarAliquota(
						getDtoManter().getCodUf(), GissUtil.notNull(buscaMunicipio.getCodigo())));
		
		selectItemAliquotaMunicipio =  new ArrayList<SelectItem>();
		for (int i = 0; i < getDtoManter().getListaAliqMunicipios().size(); i++) {
			selectItemAliquotaMunicipio.add(new SelectItem(i, " "));
		}

		mostrarLista = true;
	}

	/**
	 * @nome: carregarAlterar
	 * @propósito: Método responsável por carregarAlterar.
	 *
	 * @return String
	 */
	public String carregarAlterar() {
		if (radioListaAliquotaMunicipio != null) {
			dtoAlterar = new AliquotaISSDTO();
			dtoAlterar = dtoManter.getListaAliqMunicipios().get(radioListaAliquotaMunicipio);
			carregarComboItemServico();
			listarLcAliquota();
			buscarNomeMunicipio();
			hiddenProsseguir = true;
			return "alterarAliquotaMunicipio";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar apenas um item na lista!", false);
			return "";
		}
	}
	
	/**
	 * @nome: carregarDetalhar
	 * @propósito: Método responsável por carregarDetalhar.
	 *
	 * @return String
	 */
	public String carregarDetalhar() {
		if (radioListaAliquotaMunicipio != null) {
			dtoAlterar = new AliquotaISSDTO();
			dtoAlterar = dtoManter.getListaAliqMunicipios().get(radioListaAliquotaMunicipio);
			listarLcAliquota();
			buscarNomeMunicipio();
			return "detalharAliquotaMunicipio";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar apenas um item na lista!", false);
			return "";
		}
	}

	/**
	 * @nome: listarLcAliquota
	 * @propósito: Método responsável por listarLcAliquota.
	 */
	public void listarLcAliquota() {
		dtoAlterar.setListaAlterar(new ArrayList<AliquotaISSDTO>());
		getDtoAlterar().setListaAlterar(
			getAliquotaISSServiceImpl().listarLcAliquota(
				getDtoAlterar().getCodMunicipio(), dtoAlterar.getCodLeiCompl()));
		checkTodos = false;
		codigosSelecionadosTabela = new Integer[100];
		selectItemLei = new ArrayList<SelectItem>();
		for (int i = 0; i < dtoAlterar.getListaAlterar().size(); i++) {
			selectItemLei.add(new SelectItem(i, " "));
		}
	}

	/**
	 * @nome: buscarNomeMunicipio
	 * @propósito: Método responsável por buscarNomeMunicipio.
	 */
	private void buscarNomeMunicipio() {
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (String.valueOf(GissUtil.notNull(dtoAlterar.getCodUf())).equals(listaDosEstados.get(i).getCodigo())) {
				dtoAlterar.setEstado(listaDosEstados.get(i).getNome());
			}
		}
	}
	
	/**
	 * @nome: alterarListaAliquota
	 * @propósito: Método responsável por alterarListaAliquota.
	 *
	 * @return String
	 */
	public String alterarListaAliquota() {
		try {
			if (hiddenProsseguir) {
				if (codigosSelecionadosTabela.length>0) {
					List<AliquotaISSDTO> listAliquotas = new ArrayList<AliquotaISSDTO>();
					for (int i = 0; i < codigosSelecionadosTabela.length; i++) {
						listAliquotas.add(dtoAlterar.getListaAlterar().get(codigosSelecionadosTabela[i]));
					}
					BradescoFacesUtils.addInfoModalMessage(aliquotaISSServiceImpl.alterarAliquota(listAliquotas, ""), false);
					return carregarManter();
				} else {
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
					return "";
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return "";
	}	
	
	/**
	 * @nome: atribuirTodos
	 * @propósito: Método responsável por atribuirTodos.
	 */
	public void atribuirTodos() {
		
		if (checkTodos) {
			codigosSelecionadosTabela = new Integer[dtoAlterar.getListaAlterar().size()];
			for (int i = 0; i < dtoAlterar.getListaAlterar().size(); i++) {
				if (i== 100) {
					break;
				}
				codigosSelecionadosTabela[i] = i;
			}
		} else {
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	
	/**
	 * @nome: carregarComboItemServico
	 * @propósito: Método responsável por carregarComboItemServico.
	 */
	private void carregarComboItemServico() {
		comboServico = new ArrayList<CombosISSDTO>();
    	selectItemServico = new ArrayList<SelectItem>();
    	comboServico = utilidadesServiceImpl.listarComboItemServ();
    	for (int i = 0; i < comboServico.size(); i++) {
    		selectItemServico.add(new SelectItem(comboServico.get(i).getCodItemServ(), comboServico.get(i).getDescItemServ()));
    	}		
    }
	
	/**
	 * @nome: gerarRelatoriosDeAliquotas
	 * @propósito: Método responsável por gerarRelatoriosDeAliquotas.
	 *
	 * @return String
	 */
	public String gerarRelatoriosDeAliquotas() {
		try {
			
			if (GissUtil.notNull(dtoGerarRelatorio.getMesPeriodoInicial()).equals("") 
				|| GissUtil.notNull(dtoGerarRelatorio.getAnoPeriodoInicial()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Competência Inicial!", false);
				return "";
			} 
			
			if (GissUtil.notNull(dtoGerarRelatorio.getMesPeriodoFinal()).equals("") 
				|| GissUtil.notNull(dtoGerarRelatorio.getAnoPeriodoFinal()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Competência Final!", false);
				return "";
			}
							
			if (GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				pesquisarMunicipioRelatorio(); 
				dtoGerarRelatorio.setCodMunicipio(buscaMunicipio.getCodigo());
			} else if (!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
				pesquisarMunicipioRelatorio();
				return "";
			} else if (!GissUtil.notNull(dtoGerarRelatorio.getEstado()).equals("")) {
				dtoGerarRelatorio.setCodMunicipio(0l);
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código ou a Descrição do Município!", false);
				return "";
			}

			BradescoFacesUtils.addInfoModalMessage(relatorioISSServiceImpl.gerarRelatoriosAliquotas(dtoGerarRelatorio), false);
		
		} catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
		return "";
	}
	
	
	

	/**
	 * @return the dtoManter
	 */
	public AliquotaISSDTO getDtoManter() {
		return dtoManter;
	}
	/**
	 * @param dtoManter the dtoManter to set
	 */
	public void setDtoManter(AliquotaISSDTO dtoManter) {
		this.dtoManter = dtoManter;
	}
	/**
	 * @return the dtoAlterar
	 */
	public AliquotaISSDTO getDtoAlterar() {
		return dtoAlterar;
	}
	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(AliquotaISSDTO dtoAlterar) {
		this.dtoAlterar = dtoAlterar;
	}
	/**
	 * @return the itemAliquotaISSDTO
	 */
	public AliquotaISSDTO getItemAliquotaISSDTO() {
		return itemAliquotaISSDTO;
	}
	/**
	 * @param itemAliquotaISSDTO the itemAliquotaISSDTO to set
	 */
	public void setItemAliquotaISSDTO(AliquotaISSDTO itemAliquotaISSDTO) {
		this.itemAliquotaISSDTO = itemAliquotaISSDTO;
	}
	/**
	 * @return the listaAliquota
	 */

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
	 * @return the selectItemAliquotaMunicipio
	 */
	public List<SelectItem> getSelectItemAliquotaMunicipio() {
		return selectItemAliquotaMunicipio;
	}
	/**
	 * @param selectItemAliquotaMunicipio the selectItemAliquotaMunicipio to set
	 */
	public void setSelectItemAliquotaMunicipio(List<SelectItem> selectItemAliquotaMunicipio) {
		this.selectItemAliquotaMunicipio = selectItemAliquotaMunicipio;
	}
	/**
	 * @return the mostraBotoes
	 */
	public boolean isMostraBotoes() {
		return mostraBotoes;
	}
	/**
	 * @param mostraBotoes the mostraBotoes to set
	 */
	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}
	/**
	 * @return the listaEstados
	 */
	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}
	/**
	 * @return the radioListaAliquotaMunicipio
	 */
	public Integer getRadioListaAliquotaMunicipio() {
		return radioListaAliquotaMunicipio;
	}
	/**
	 * @param radioListaAliquotaMunicipio the radioListaAliquotaMunicipio to set
	 */
	public void setRadioListaAliquotaMunicipio(Integer radioListaAliquotaMunicipio) {
		this.radioListaAliquotaMunicipio = radioListaAliquotaMunicipio;
	}
	/**
	 * @return the selectItemAliquotaAlterar
	 */
	public List<SelectItem> getSelectItemAliquotaAlterar() {
		return selectItemAliquotaAlterar;
	}
	/**
	 * @param selectItemAliquotaAlterar the selectItemAliquotaAlterar to set
	 */
	public void setSelectItemAliquotaAlterar(List<SelectItem> selectItemAliquotaAlterar) {
		this.selectItemAliquotaAlterar = selectItemAliquotaAlterar;
	}
	/**
	 * @param listaEstados the listaEstados to set
	 */
	public void setListaEstados(ArrayList<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
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
	 * @return the itemLei
	 */
	public AliquotaISSDTO getItemLei() {
		return itemLei;
	}
	/**
	 * @param itemLei the itemLei to set
	 */
	public void setItemLei(AliquotaISSDTO itemLei) {
		this.itemLei = itemLei;
	}
	/**
	 * @return the selectItemLei
	 */
	public List<SelectItem> getSelectItemLei() {
		return selectItemLei;
	}
	/**
	 * @param selectItemLei the selectItemLei to set
	 */
	public void setSelectItemLei(List<SelectItem> selectItemLei) {
		this.selectItemLei = selectItemLei;
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
	 * @return the aliquotaISSServiceImpl
	 */
	public IAliquotaISSService getAliquotaISSServiceImpl() {
		return aliquotaISSServiceImpl;
	}
	/**
	 * @param aliquotaISSServiceImpl the aliquotaISSServiceImpl to set
	 */
	public void setAliquotaISSServiceImpl(IAliquotaISSService aliquotaISSServiceImpl) {
		this.aliquotaISSServiceImpl = aliquotaISSServiceImpl;
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
	/**
	 * @param listaEstados the listaEstados to set
	 */
	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
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
	public AliquotaISSDTO getDtoGerarRelatorio() {
		return dtoGerarRelatorio;
	}
	public void setDtoGerarRelatorio(AliquotaISSDTO dtoGerarRelatorio) {
		this.dtoGerarRelatorio = dtoGerarRelatorio;
	}
	
}	