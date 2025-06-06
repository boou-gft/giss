package br.com.bradesco.web.giss.view.bean.controller.issgerencial.relatorio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.IRelatorioISSService;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioSaidaISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: RelatorioISSBean.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class RelatorioISSBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = -95056171670006982L;
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	IEmpresaISSService empresasISSServiceImpl = (IEmpresaISSService) FacesUtils.getManagedBean("empresasISSServiceImpl");
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private IRelatorioISSService relatorioISSServiceImpl;
	private RelatorioISSDTO dto = new RelatorioISSDTO();
	private EmpresaISSDTO dtoCombo= new EmpresaISSDTO();
	private Integer itemSelecionadoMun;
	private Integer itemSelecionadoEmp;
	private Integer codEmpresaSelecionada;
	
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleRadioMun = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleRadioEmp = new ArrayList<SelectItem>();
	
	/**
	 * Navega��o.
	 */
	private static final String GERAR_RELATORIO_APURACAO = "gerarRelatorio";
	
	/**
	 * @nome: iniciarTela
	 * @prop�sito: M�todo respons�vel por iniciarTela.
	 *
	 * @return String
	 */
	public String iniciarTela() {
		dto = new RelatorioISSDTO();
		dto.getListaEmpresa().clear();
		dto.getListaMunicipio().clear();
		dtoCombo = new EmpresaISSDTO();
		dtoCombo.getLista().clear();
		listaEstados.clear();
		listaDosEstados.clear();
		listaEmpresa.clear();
		listaControleRadioMun.clear();
		listaControleRadioEmp.clear();
		itemSelecionadoMun = null;
		itemSelecionadoEmp = null;
		codEmpresaSelecionada = 0;
		buscaMunicipio = new BuscaMunicipioBean();
		carregaComboEstados();
		carregarComboEmpresa();
		return GERAR_RELATORIO_APURACAO;
	}
	
	/**
	 * @nome: carregaComboEstados
	 * @prop�sito: M�todo respons�vel por carregaComboEstados.
	 */
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
	/**
	 * @nome: carregarComboEmpresa
	 * @prop�sito: M�todo respons�vel por carregarComboEmpresa.
	 */
	private void carregarComboEmpresa() { 
		listaEmpresa = new ArrayList<SelectItem>();
    	empresasISSServiceImpl.ListaEmpCadastro(dtoCombo);
    	for (int i = 0; i < dtoCombo.getLista().size(); i++) {
			listaEmpresa.add(new SelectItem(dtoCombo.getLista().get(i).getCodEmpresa(), 
				dtoCombo.getLista().get(i).getCnpjFormatado()+ " - "+dtoCombo.getLista().get(i).getDescEmpresa()));
		}
	}

	/**
	 * @nome: processa
	 * @prop�sito: M�todo respons�vel por processa.
	 */
	public void processa() {
		dto.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @prop�sito: M�todo respons�vel por pesquisarMunicipio.
	 *
	 * @return String
	 */
	public String pesquisarMunicipio() {
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
		return GERAR_RELATORIO_APURACAO;
	}
	
	/**
	 * @nome: adicionarMun
	 * @prop�sito: M�todo respons�vel por adicionarMun.
	 *
	 * @return String
	 */
	public String adicionarMun() {
		try {
			if (GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				if (dto.getListaMunicipio().size() < 50) {
					pesquisarMunicipio();
					boolean naoExiste = true;
					for (int i = 0; i < dto.getListaMunicipio().size(); i++) {
						if (dto.getListaMunicipio().get(i).getCodMunicipio().equals(buscaMunicipio.getCodigo())) {
							naoExiste = false;
						}
					}
					if (naoExiste) {
						MunicipioISSDTO item = new MunicipioISSDTO();
						item.setCodMunicipio(buscaMunicipio.getCodigo());
						item.setDescMunicipios(buscaMunicipio.getDescricao());
						item.setSiglaUf(buscaMunicipio.getUf());
						dto.getListaMunicipio().add(item);
						atualizarSelectItemMun();
						buscaMunicipio = new BuscaMunicipioBean();
						dto.setEstado("");
					} else {
						BradescoFacesUtils.addInfoModalMessage("Munic�pio j� exite na lista.", false);
					}
				} else {
					BradescoFacesUtils.addInfoModalMessage("Permitido adicionar somente 50 munic�pios.", false);
				}
			} else {			
				BradescoFacesUtils.addInfoModalMessage("Preencher o c�digo do munic�pio.", false);
			}
		} catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
		return "";
	}

	/**
	 * @nome: adicionarEmp
	 * @prop�sito: M�todo respons�vel por adicionarEmp.
	 *
	 * @return String
	 */
	public String adicionarEmp() {
		try {
			if (GissUtil.notNull(codEmpresaSelecionada) != 0) {
				if (dto.getListaEmpresa().size() < dtoCombo.getLista().size()) {
					int codSelecionado = 0;
					boolean naoExiste = true;
					boolean todasEmpresas = false;
					for (int i = 0; i < dto.getListaEmpresa().size(); i++) {
						if (dto.getListaEmpresa().get(i).getCodEmpresa().equals(codEmpresaSelecionada)) {
							naoExiste = false;
						}
						if (dto.getListaEmpresa().get(i).getCodEmpresa().equals(99999)) {
							todasEmpresas = true;
						}
					}
					
					if (!todasEmpresas) {
						if (codEmpresaSelecionada == 99999) {
							dto.setListaEmpresa(new ArrayList<EmpresaISSDTO>());
							EmpresaISSDTO emp = new EmpresaISSDTO();
							emp.setCodEmpresa(99999);
							emp.setDescEmpresa("TODAS EMPRESAS");
							dto.getListaEmpresa().add(emp);
							atualizarSelectItemEmp();
							codEmpresaSelecionada = 0;
							return "";
						}
						if (naoExiste) {
							for (int i = 0; i < dtoCombo.getLista().size(); i++) {
								if (dtoCombo.getLista().get(i).getCodEmpresa().equals(codEmpresaSelecionada)) {
									codSelecionado = i;
								}
							}
							dto.getListaEmpresa().add(dtoCombo.getLista().get(codSelecionado));
							atualizarSelectItemEmp();
							codEmpresaSelecionada = 0;
						} else {
							BradescoFacesUtils.addInfoModalMessage("Empresa j� exite na lista.", false);
						}
					} else {
						BradescoFacesUtils.addInfoModalMessage("N�o � permitido adicionar empresa.", false);
					}
				} else {
					BradescoFacesUtils.addInfoModalMessage(
						"Permitido adicionar somente " + dtoCombo.getLista().size() + " Empresas.", false);
				}
			} else {			
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar uma empresa.", false);
			}
		} catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
		return "";
	}

	/**
	 * @nome: excluirMun
	 * @prop�sito: M�todo respons�vel por excluirMun.
	 *
	 * @return String
	 */
	public String excluirMun() {
		if (itemSelecionadoMun != null) {
			dto.getListaMunicipio().remove(dto.getListaMunicipio().get(itemSelecionadoMun));
			atualizarSelectItemMun();
			itemSelecionadoMun = null;
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista de munic�pios!", false);
		}
		return "";
	}
	
	/**
	 * @nome: excluirEmp
	 * @prop�sito: M�todo respons�vel por excluirEmp.
	 *
	 * @return String
	 */
	public String excluirEmp() {
		if (itemSelecionadoEmp != null) {
			dto.getListaEmpresa().remove(dto.getListaEmpresa().get(itemSelecionadoEmp));
			atualizarSelectItemEmp();
			itemSelecionadoEmp = null;
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista de empresas!", false);
		}
		return "";
	}
	
	/**
	 * @nome: atualizarSelectItemMun
	 * @prop�sito: M�todo respons�vel por atualizarSelectItemMun.
	 */
	private void atualizarSelectItemMun() {
		listaControleRadioMun = new ArrayList<SelectItem>();
		Collections.sort(dto.getListaMunicipio());
		for (int i = 0; i < dto.getListaMunicipio().size(); i++) {
			listaControleRadioMun.add(new SelectItem(i, " "));
		}
	}
	
	/**
	 * @nome: atualizarSelectItemEmp
	 * @prop�sito: M�todo respons�vel por atualizarSelectItemEmp.
	 */
	private void atualizarSelectItemEmp() {
		listaControleRadioEmp = new ArrayList<SelectItem>();
		Collections.sort(dto.getListaEmpresa());
		for (int i = 0; i < dto.getListaEmpresa().size(); i++) {
			listaControleRadioEmp.add(new SelectItem(i, " "));
		}
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @prop�sito: M�todo respons�vel por imprimirPlanilha.
	 *
	 * @return String
	 * @throws Exception
	 */
	public String imprimirPlanilha() throws Exception {
		ExportarPlanilha exportarPlanilha = null;
		if (validarFiltros()) {
			carregarLista();
			if (dto.getListaSaida().size() >0) {
				exportarPlanilha = new ExportarPlanilha("Relat�rio Apura��o", "RELATORIO_APURACAO");
				exportarPlanilha.planilhaApuracao(dto.getListaSaida());
			} else {
				BradescoFacesUtils.addInfoModalMessage("N�o h� dados para montar a planilha de apura��o", false);
				return "";
			}
		}
		return "";
	}

	/**
	 * @nome: consultarTXT
	 * @prop�sito: M�todo respons�vel por consultarTXT.
	 *
	 * @return String
	 * @throws Exception
	 */
	public String consultarTXT() throws Exception {
		if (validarFiltros()) {
			carregarLista();
			if (dto.getListaSaida().size() >0) {
				relatorioISSServiceImpl.gerarRelatorioApuracaoTXT(
					dto.getListaSaida(), FacesUtils.getServletResponse().getOutputStream());
				FacesUtils.getServletResponse().setContentType("application/txt");
				FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.txt");
				FacesUtils.getContext().responseComplete();
			} else {
				BradescoFacesUtils.addInfoModalMessage("N�o h� dados para montar o txt de apura��o", false);
				return "";
			}
		}
		return "";
	}
	
	/**
	 * @nome: validarFiltros
	 * @prop�sito: M�todo respons�vel por validarFiltros.
	 *
	 * @return boolean
	 */
	private boolean validarFiltros() {
		if (GissUtil.notNull(dto.getMesPeriodoInicial()).equalsIgnoreCase("") 
			|| GissUtil.notNull(dto.getAnoPeriodoInicial()).equalsIgnoreCase("")
			|| GissUtil.notNull(dto.getMesPeriodoFinal()).equalsIgnoreCase("") 
			|| GissUtil.notNull(dto.getAnoPeriodoFinal()).equalsIgnoreCase("")) {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher o periodo da compet�ncia", false);
			return false;
		}
		if (dto.getListaMunicipio().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Favor adicionar pelo menos um munic�pio na lista", false);
			return false;
		}
		if (dto.getListaEmpresa().size() == 0) {
			BradescoFacesUtils.addInfoModalMessage("Favor adicionar pelo menos uma empresa na lista", false);
			return false;
		}
		return true;
	}

	/**
	 * @nome: carregarLista
	 * @prop�sito: M�todo respons�vel por carregarLista.
	 */
	private void carregarLista() {
		try{
			dto.setListaSaida(new ArrayList<RelatorioSaidaISSDTO>());
			relatorioISSServiceImpl.gerarRelatorio(dto);
		}catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
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
	 * @return the dto
	 */
	public RelatorioISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(RelatorioISSDTO dto) {
		this.dto = dto;
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
	 * @return the relatorioISSServiceImpl
	 */
	public IRelatorioISSService getRelatorioISSServiceImpl() {
		return relatorioISSServiceImpl;
	}

	/**
	 * @param relatorioISSServiceImpl the relatorioISSServiceImpl to set
	 */
	public void setRelatorioISSServiceImpl(IRelatorioISSService relatorioISSServiceImpl) {
		this.relatorioISSServiceImpl = relatorioISSServiceImpl;
	}

	/**
	 * @return the listaEmpresa
	 */
	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	/**
	 * @param listaEmpresa the listaEmpresa to set
	 */
	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	/**
	 * @return the listaControleRadioMun
	 */
	public List<SelectItem> getListaControleRadioMun() {
		return listaControleRadioMun;
	}

	/**
	 * @param listaControleRadioMun the listaControleRadioMun to set
	 */
	public void setListaControleRadioMun(List<SelectItem> listaControleRadioMun) {
		this.listaControleRadioMun = listaControleRadioMun;
	}

	/**
	 * @return the listaControleRadioEmp
	 */
	public List<SelectItem> getListaControleRadioEmp() {
		return listaControleRadioEmp;
	}

	/**
	 * @param listaControleRadioEmp the listaControleRadioEmp to set
	 */
	public void setListaControleRadioEmp(List<SelectItem> listaControleRadioEmp) {
		this.listaControleRadioEmp = listaControleRadioEmp;
	}

	/**
	 * @return the itemSelecionadoMun
	 */
	public Integer getItemSelecionadoMun() {
		return itemSelecionadoMun;
	}

	/**
	 * @param itemSelecionadoMun the itemSelecionadoMun to set
	 */
	public void setItemSelecionadoMun(Integer itemSelecionadoMun) {
		this.itemSelecionadoMun = itemSelecionadoMun;
	}

	/**
	 * @return the itemSelecionadoEmp
	 */
	public Integer getItemSelecionadoEmp() {
		return itemSelecionadoEmp;
	}

	/**
	 * @param itemSelecionadoEmp the itemSelecionadoEmp to set
	 */
	public void setItemSelecionadoEmp(Integer itemSelecionadoEmp) {
		this.itemSelecionadoEmp = itemSelecionadoEmp;
	}

	/**
	 * @return the codEmpresaSelecionada
	 */
	public Integer getCodEmpresaSelecionada() {
		return codEmpresaSelecionada;
	}

	/**
	 * @param codEmpresaSelecionada the codEmpresaSelecionada to set
	 */
	public void setCodEmpresaSelecionada(Integer codEmpresaSelecionada) {
		this.codEmpresaSelecionada = codEmpresaSelecionada;
	}
}