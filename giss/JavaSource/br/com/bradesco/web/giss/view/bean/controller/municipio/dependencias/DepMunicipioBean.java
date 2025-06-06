package br.com.bradesco.web.giss.view.bean.controller.municipio.dependencias;

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
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.depmunicipio.IDepMunicipioService;
import br.com.bradesco.web.giss.service.business.depmunicipio.IDepMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.DependenciaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.IObterDescDependenciaService;
import br.com.bradesco.web.giss.service.business.obterdescdependencia.bean.ItemDependencia;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class DepMunicipioBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IDepMunicipioService dependenciaMunicipioImpl; // referente a interface
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private String estadoFiltro;
	private int radioTelaManter;
	private boolean mostraBotoes;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<MunicipioDTO> listaDependenciaMunicipios = null;
	private boolean carregaMunicipios;
	private String nome;
	private String codigo;
	private int linha;
	private String UnidadeFederativa;
	private String estado;
	private String codigoDependencia;
	private String descricaoDependencia;
	private int linhaResultado;
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private BuscaMunicipioBean buscaMunicipioIncorp = new BuscaMunicipioBean();
	private Integer codDepIncorpora; // código da dependência filtro
	private String descDepIncorpora; // descricao da dependência filtro
	private Integer numSeqDepIncorpora;
	private String indiceComboEmpresaIncorpora;
	IObterDescDependenciaService obterDescDependenciaServiceImpl = (IObterDescDependenciaService) FacesUtils.getManagedBean("obterDescDependenciaServiceImpl");
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String estadoResultDepNovasMun; // codigo do estado selecionado
	private String tipo;
	private ItemDependencia dep = new ItemDependencia();
	private String codigoMunicipio;
	private DependenciaMunicipioDTO dependenciaMunicipio;

	public String inicializaDependenciaMunicipio() {

		listaDependenciaMunicipios = null;
		dependenciaMunicipio = null;
		carregaMunicipios = false;
		estadoFiltro = "";
		buscaMunicipio = new BuscaMunicipioBean();
		listaEstados = new ArrayList<SelectItem>();
		carregaComboEstados();

		return "manterDependenciaMunicipio";
	}

	public void buscaMunicipioIncorp() {
		tipo = "manterIncorp";
		buscaMunicipio(estadoResultDepNovasMun);
	}

	public void buscaMunicipioManter() {
		tipo = "manter";
		buscaMunicipio(estadoFiltro);
	}

	public void buscaMunicipio(String estado) {
		if (!tipo.equals("manterIncorp")) {
			buscaMunicipio.setCallback(this);
			buscaMunicipio.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if (estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipio.setEstado(uf != null ? uf : "");
			buscaMunicipio.buscar();
		} else {
			buscaMunicipioIncorp.setCallback(this);
			buscaMunicipioIncorp.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if (estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipioIncorp.setEstado(uf != null ? uf : "");
			buscaMunicipioIncorp.buscar();
		}
	}

	public void processa() {
		if (tipo.equals("manter")) {
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		} else if (tipo.equals("manterIncorp")) {
			estadoResultDepNovasMun = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipioIncorp.getUf());
		}
	}

	public void carregarDependenciaIncorporaDepNova() {
		carregarDependencia(indiceComboEmpresaIncorpora, codDepIncorpora);
		setNumSeqDepIncorpora(dep.getNumSeqDependencia());
		setCodDepIncorpora(dep.getCodDependencia());
		setDescDepIncorpora(dep.getDesDependencia());
	}

	public void carregarDependencia(String empresa, Integer codDep) {
		if (codDep != null && codDep != 0) {
			dep = obterDescDependenciaServiceImpl.obterDescDependencia(Long.valueOf(empresa), codDep);
		} else {
			BradescoFacesUtils.addInfoModalMessage("Favor preencher a Dependencia.", false);
			return;
		}

	}

	public List<SelectItem> carregaComboEstados() {

		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}

	public String voltaPesquisaDependenciaMunicipio() {

		carregaMunicipios = true;
		listarDependenciaMunicipio();
		return "manterDependenciaMunicipio";
	}

	public String carregaListaMunicipios() {
		if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
			buscaMunicipioManter();
			codigoMunicipio = buscaMunicipio.getCodigo().toString();
			//listarDependenciaMunicipio();

			GissUtil gissUtil = new GissUtil();
			setCodigo(codigoMunicipio);
			setNome(buscaMunicipio.getDescricao());
			estado = gissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);
			carregaListaAliquotaDiferenciadaResultado();
			return "manterDependenciaMunicipioProsseguir";

		} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
			buscaMunicipioManter();
			return "";
		} else if (!estadoFiltro.equals("") && estadoFiltro != null) {
			codigoMunicipio = buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0?buscaMunicipio.getCodigo().toString():"0";
			listarDependenciaMunicipio();
			return "";
		} else {
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
		}
		return "";
	}

	public String carregaListaAliquotaDiferenciadaResultado() {
		return listarDependenciaMunicipioResultado();

	}

	private void listarDependenciaMunicipio() {

		try {

			listaDependenciaMunicipios = dependenciaMunicipioImpl.listaGridDependenciaMunicipio(Integer.parseInt(estadoFiltro), codigoMunicipio != null ? Long.valueOf(codigoMunicipio) : 0L);

			if (listaDependenciaMunicipios != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaDependenciaMunicipios.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaDependenciaMunicipios.size() >= IDepMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

				carregaMunicipios = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			estadoFiltro = "";
			carregaMunicipios = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterDependenciaMunicipio", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String prosseguirDependencia() {

		GissUtil gissUtil = new GissUtil();
		MunicipioDTO municipioDTO = (MunicipioDTO) getListaDependenciaMunicipios().get(new Integer(radioTelaManter));
		setCodigo(municipioDTO.getCodigo());
		setNome(municipioDTO.getNome());
		estado = gissUtil.procuraUnidadeFederativa(listaEstados, estadoFiltro);		
		return carregaListaAliquotaDiferenciadaResultado();
	}

	private String listarDependenciaMunicipioResultado() {

		try {

			dependenciaMunicipio = dependenciaMunicipioImpl.listarDependenciaMunicipioResultado(Integer.parseInt(codigo));

			if (dependenciaMunicipio.getLstMunicipios().size() >= IDepMunicipioServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS) {
				mostraBotoes = true;
			} else {
				mostraBotoes = false;
			}

		} catch (NumberFormatException e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		} catch(PdcAdapterFunctionalException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
			return "manterDependenciaMunicipio";
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return "manterDependenciaMunicipioProsseguir";
	}

	public String pesquisar(ActionEvent evt) {
		listarDependenciaMunicipio();
		setListaDependenciaMunicipios(listaDependenciaMunicipios);
		setRadioTelaManter(-1);
		return "VOLTAR_PESQUISAR";

	}

	public String pesquisarResultado(ActionEvent evt) {
		listarDependenciaMunicipioResultado();
		getDependenciaMunicipio().setLstMunicipios(getDependenciaMunicipio().getLstMunicipios());
		return "manterDependenciaMunicipioProsseguir";
	}

	public void imprimirPlanilha(ActionEvent ae){
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Dependências do Município", "DEPENDENCIAS_MUNICIPIOS");
		try {
			exportarPlanilha.dependenciasMunicipio(getDependenciaMunicipio());
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(),false);
		}
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUnidadeFederativa() {
		return UnidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		UnidadeFederativa = unidadeFederativa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}

	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}

	public IDepMunicipioService getDependenciaMunicipioImpl() {
		return dependenciaMunicipioImpl;
	}

	public void setDependenciaMunicipioImpl(IDepMunicipioService dependenciaMunicipioImpl) {
		this.dependenciaMunicipioImpl = dependenciaMunicipioImpl;
	}

	public List<MunicipioDTO> getListaDependenciaMunicipios() {
		return listaDependenciaMunicipios;
	}

	public void setListaDependenciaMunicipios(List<MunicipioDTO> listaDependenciaMunicipios) {
		this.listaDependenciaMunicipios = listaDependenciaMunicipios;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public int getRadioTelaManter() {
		return radioTelaManter;
	}

	public void setRadioTelaManter(int radioTelaManter) {
		this.radioTelaManter = radioTelaManter;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public String getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}

	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}

	public int getLinhaResultado() {
		return linhaResultado;
	}

	public void setLinhaResultado(int linhaResultado) {
		this.linhaResultado = linhaResultado;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public BuscaMunicipioBean getBuscaMunicipioIncorp() {
		return buscaMunicipioIncorp;
	}

	public void setBuscaMunicipioIncorp(BuscaMunicipioBean buscaMunicipioIncorp) {
		this.buscaMunicipioIncorp = buscaMunicipioIncorp;
	}

	public Integer getCodDepIncorpora() {
		return codDepIncorpora;
	}

	public void setCodDepIncorpora(Integer codDepIncorpora) {
		this.codDepIncorpora = codDepIncorpora;
	}

	public String getDescDepIncorpora() {
		return descDepIncorpora;
	}

	public void setDescDepIncorpora(String descDepIncorpora) {
		this.descDepIncorpora = descDepIncorpora;
	}

	public Integer getNumSeqDepIncorpora() {
		return numSeqDepIncorpora;
	}

	public void setNumSeqDepIncorpora(Integer numSeqDepIncorpora) {
		this.numSeqDepIncorpora = numSeqDepIncorpora;
	}

	public String getIndiceComboEmpresaIncorpora() {
		return indiceComboEmpresaIncorpora;
	}

	public void setIndiceComboEmpresaIncorpora(String indiceComboEmpresaIncorpora) {
		this.indiceComboEmpresaIncorpora = indiceComboEmpresaIncorpora;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public String getEstadoResultDepNovasMun() {
		return estadoResultDepNovasMun;
	}

	public void setEstadoResultDepNovasMun(String estadoResultDepNovasMun) {
		this.estadoResultDepNovasMun = estadoResultDepNovasMun;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ItemDependencia getDep() {
		return dep;
	}

	public void setDep(ItemDependencia dep) {
		this.dep = dep;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public DependenciaMunicipioDTO getDependenciaMunicipio() {
		return dependenciaMunicipio;
	}

	public void setDependenciaMunicipio(DependenciaMunicipioDTO dependenciaMunicipio) {
		this.dependenciaMunicipio = dependenciaMunicipio;
	}

}