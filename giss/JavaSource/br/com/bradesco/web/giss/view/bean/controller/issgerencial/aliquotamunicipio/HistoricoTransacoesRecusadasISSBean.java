package br.com.bradesco.web.giss.view.bean.controller.issgerencial.aliquotamunicipio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.model.SelectItem;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issaliquota.IAliquotaISSService;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.IRelatorioISSService;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.HistoricoTransacoesRecusadasISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: historicoTransacoesRecusadasISSBean
 * 
 * @propósito: <p>
 *             Classe responsável por Histórico de Transações Recusadas pelo
 *             Motor de Cálculo
 *             </p>
 * 
 * @author: Luiz de Albuquerque & Vitor P. Caliman <BR/>
 * @equipe: PRIME <BR/>
 * @version: 1.0
 * @see
 */
public class HistoricoTransacoesRecusadasISSBean implements Serializable,
		BuscaMunicipioCallback {

	private static final long serialVersionUID = 1L;
	private static final int MANTER = 1;
	private static final int GERAR_RELATORIO = 2;
	private HistoricoTransacoesRecusadasISSDTO dtoHistorico = new HistoricoTransacoesRecusadasISSDTO();
	IEmpresaISSService empresasISSServiceImpl = (IEmpresaISSService) FacesUtils
			.getManagedBean("empresasISSServiceImpl");
	private IAliquotaISSService aliquotaISSServiceImpl = null;
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils
			.getManagedBean("utilidadesServiceImpl");
	IRelatorioISSService relatorioISSServiceImpl = (IRelatorioISSService) FacesUtils
			.getManagedBean("relatorioISSServiceImpl");
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private AliquotaISSDTO dtoManter = new AliquotaISSDTO();
	private AliquotaISSDTO dtoAlterar = new AliquotaISSDTO();
	private AliquotaISSDTO itemLei = new AliquotaISSDTO();
	private HistoricoTransacoesRecusadasISSDTO dtoGerarRelatorio = new HistoricoTransacoesRecusadasISSDTO();
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
	private Integer codEmpresaSelecionada;
	private EmpresaISSDTO dtoCombo = new EmpresaISSDTO();
	private List<SelectItem> listaControleRadioEmp = new ArrayList<SelectItem>();
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
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
		dtoGerarRelatorio = new HistoricoTransacoesRecusadasISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		mostrarLista = false;
		mostraBotoes = false;
		radioListaAliquotaMunicipio = null;
		carregaComboEstados();
		carregarComboEmpresa();
		tipoTela = MANTER;
		return "manterAliquotaMunicipio";
	}

	public void processa() {
		if (tipoTela == MANTER) {
			dtoManter.setEstado(GissUtil
					.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados,
							buscaMunicipio.getUf()));
		} else {
			dtoGerarRelatorio.setEstado(GissUtil
					.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados,
							buscaMunicipio.getUf()));
		}
	}

	/**
	 * @nome: carregarRelatoriosDeTransacoesRecusadas
	 * @propósito: Método responsável por
	 *             carregarRelatoriosDeTransacoesRecusadas.
	 * 
	 * @return String
	 */
	public String carregarRelatoriosDeTransacoesRecusadas() {
		dtoGerarRelatorio = new HistoricoTransacoesRecusadasISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		carregaComboEstados();
		carregarComboEmpresa();
		tipoTela = GERAR_RELATORIO;
		return "gerarHistoricoTransacoesRecusadas";
	}

	/**
	 * @nome: carregarComboEmpresa
	 * @propósito: Método responsável por carregarComboEmpresa.
	 */
	private void carregarComboEmpresa() {
		listaEmpresa = new ArrayList<SelectItem>();
		empresasISSServiceImpl.ListaEmpCadastro(dtoCombo);
		for (int i = 0; i < dtoCombo.getLista().size(); i++) {
			listaEmpresa.add(new SelectItem(dtoCombo.getLista().get(i)
					.getCodEmpresa(), dtoCombo.getLista().get(i)
					.getCnpjFormatado()
					+ " - " + dtoCombo.getLista().get(i).getDescEmpresa()));
		}
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
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 * 
	 */
	public void pesquisarMunicipio() {
		String uf = null;
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (dtoHistorico.getEstado().equals(
					listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null ? uf : "");
		buscaMunicipio.buscarISS();
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
			dtoAlterar = dtoManter.getListaAliqMunicipios().get(
					radioListaAliquotaMunicipio);
			buscarNomeMunicipio();
			hiddenProsseguir = true;
			return "alterarAliquotaMunicipio";
		} else {
			BradescoFacesUtils.addInfoModalMessage(
					"Favor selecionar apenas um item na lista!", false);
			return "";
		}
	}

	/**
	 * @nome: buscarNomeMunicipio
	 * @propósito: Método responsável por buscarNomeMunicipio.
	 */

	private void buscarNomeMunicipio() {
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (String.valueOf(GissUtil.notNull(dtoAlterar.getCodUf())).equals(
					listaDosEstados.get(i).getCodigo())) {
				dtoAlterar.setEstado(listaDosEstados.get(i).getNome());
			}
		}
	}

	/**
	 * @nome: atribuirTodos
	 * @propósito: Método responsável por atribuirTodos.
	 */
	public void atribuirTodos() {

		if (checkTodos) {
			codigosSelecionadosTabela = new Integer[dtoAlterar
					.getListaAlterar().size()];
			for (int i = 0; i < dtoAlterar.getListaAlterar().size(); i++) {
				if (i == 100) {
					break;
				}
				codigosSelecionadosTabela[i] = i;
			}
		} else {
			codigosSelecionadosTabela = new Integer[100];
		}
	}

	/**
	 * @nome: gerarRelatoriosHistoricoTransacoes
	 * @propósito: Método responsável por gerarRelatoriosHistoricoTransacoes.
	 * 
	 */

	public String gerarRelatoriosHistoricoTransacoes() {
		try {
			Integer calendarMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
			if (GissUtil.notNull(dtoGerarRelatorio.getMesPeriodoInicial())
					.equals("")
					|| GissUtil.notNull(
							dtoGerarRelatorio.getAnoPeriodoInicial())
							.equals("")) {
				BradescoFacesUtils.addInfoModalMessage(
						"FAVOR PREENCHER A COMPETÊNCIA INICIAL!", false);
				return "";
			}
			
			else if (calendarMonth < Integer
					.valueOf(dtoGerarRelatorio.getMesPeriodoInicial())) {
				BradescoFacesUtils
						.addInfoModalMessage("PERIODO INICIAL INVÁLIDO!", false);
				return "";
			}

			else if (GissUtil.notNull(dtoGerarRelatorio.getMesPeriodoFinal())
					.equals("")
					|| GissUtil.notNull(dtoGerarRelatorio.getAnoPeriodoFinal())
							.equals("")) {
				BradescoFacesUtils
						.addInfoModalMessage("PERÍODO FINAL DE COMPETÊNCIA DEVE SER INFORMADO!", false);
				return "";
			}

			else if (DateUtils.convertMesAno(
					Integer.valueOf(dtoGerarRelatorio.getMesPeriodoInicial()),
					Integer.valueOf(dtoGerarRelatorio.getAnoPeriodoInicial()))
					.after(DateUtils.convertMesAno(Integer
							.valueOf(dtoGerarRelatorio.getMesPeriodoFinal()),
							Integer.valueOf(dtoGerarRelatorio
									.getAnoPeriodoFinal())))) {
				BradescoFacesUtils
						.addInfoModalMessage("PERÍODO FINAL DE COMPETÊNCIA MENOR QUE O INICIAL!", false);
				return "";
			}

			else if (codEmpresaSelecionada == 0) {
				BradescoFacesUtils.addInfoModalMessage("INFORME A EMPRESA!", false);
				return "";
			}

			else if (buscaMunicipio.getCodigo() == null) {
				dtoHistorico.setCodMunicipio(0L);
			}

			dtoGerarRelatorio.setCodEmpresa(codEmpresaSelecionada);

			BradescoFacesUtils.addErrorModalMessage(relatorioISSServiceImpl
					.gerarRelatorioHistoricoTransacoes(dtoGerarRelatorio,
							codEmpresaSelecionada));

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
	 * @param dtoManter
	 *            the dtoManter to set
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
	 * @param dtoAlterar
	 *            the dtoAlterar to set
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
	 * @param itemAliquotaISSDTO
	 *            the itemAliquotaISSDTO to set
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
	 * @param hiddenProsseguir
	 *            the hiddenProsseguir to set
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
	 * @param mostrarLista
	 *            the mostrarLista to set
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
	 * @param selectItemAliquotaMunicipio
	 *            the selectItemAliquotaMunicipio to set
	 */
	public void setSelectItemAliquotaMunicipio(
			List<SelectItem> selectItemAliquotaMunicipio) {
		this.selectItemAliquotaMunicipio = selectItemAliquotaMunicipio;
	}

	/**
	 * @return the mostraBotoes
	 */
	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	/**
	 * @param mostraBotoes
	 *            the mostraBotoes to set
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
	 * @param radioListaAliquotaMunicipio
	 *            the radioListaAliquotaMunicipio to set
	 */
	public void setRadioListaAliquotaMunicipio(
			Integer radioListaAliquotaMunicipio) {
		this.radioListaAliquotaMunicipio = radioListaAliquotaMunicipio;
	}

	/**
	 * @return the selectItemAliquotaAlterar
	 */
	public List<SelectItem> getSelectItemAliquotaAlterar() {
		return selectItemAliquotaAlterar;
	}

	/**
	 * @param selectItemAliquotaAlterar
	 *            the selectItemAliquotaAlterar to set
	 */
	public void setSelectItemAliquotaAlterar(
			List<SelectItem> selectItemAliquotaAlterar) {
		this.selectItemAliquotaAlterar = selectItemAliquotaAlterar;
	}

	/**
	 * @param listaEstados
	 *            the listaEstados to set
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
	 * @param selectItemServico
	 *            the selectItemServico to set
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
	 * @param itemLei
	 *            the itemLei to set
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
	 * @param selectItemLei
	 *            the selectItemLei to set
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
	 * @param codigosSelecionadosTabela
	 *            the codigosSelecionadosTabela to set
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
	 * @param checkTodos
	 *            the checkTodos to set
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
	 * @param aliquotaISSServiceImpl
	 *            the aliquotaISSServiceImpl to set
	 */
	public void setAliquotaISSServiceImpl(
			IAliquotaISSService aliquotaISSServiceImpl) {
		this.aliquotaISSServiceImpl = aliquotaISSServiceImpl;
	}

	/**
	 * @return the buscaMunicipio
	 */
	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	/**
	 * @param buscaMunicipio
	 *            the buscaMunicipio to set
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
	 * @param listaDosEstados
	 *            the listaDosEstados to set
	 */
	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	/**
	 * @param listaEstados
	 *            the listaEstados to set
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
	 * @param comboServico
	 *            the comboServico to set
	 */
	public void setComboServico(List<CombosISSDTO> comboServico) {
		this.comboServico = comboServico;
	}

	public HistoricoTransacoesRecusadasISSDTO getDtoGerarRelatorio() {
		return dtoGerarRelatorio;
	}

	public void setDtoGerarRelatorio(
			HistoricoTransacoesRecusadasISSDTO dtoGerarRelatorio) {
		this.dtoGerarRelatorio = dtoGerarRelatorio;
	}

	public HistoricoTransacoesRecusadasISSDTO getDtoHistorico() {
		return dtoHistorico;
	}

	public void setDtoHistorico(HistoricoTransacoesRecusadasISSDTO dtoHistorico) {
		this.dtoHistorico = dtoHistorico;
	}

	public Integer getCodEmpresaSelecionada() {
		return codEmpresaSelecionada;
	}

	public void setCodEmpresaSelecionada(Integer codEmpresaSelecionada) {
		this.codEmpresaSelecionada = codEmpresaSelecionada;
	}

	public List<SelectItem> getListaControleRadioEmp() {
		return listaControleRadioEmp;
	}

	public void setListaControleRadioEmp(List<SelectItem> listaControleRadioEmp) {
		this.listaControleRadioEmp = listaControleRadioEmp;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

}