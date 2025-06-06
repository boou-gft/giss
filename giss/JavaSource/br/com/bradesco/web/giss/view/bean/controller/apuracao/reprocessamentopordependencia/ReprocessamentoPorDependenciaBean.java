package br.com.bradesco.web.giss.view.bean.controller.apuracao.reprocessamentopordependencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.IReprocessamentoPorDependenciaService;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ContaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoDependenciaProsseguirDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoPorDependenciaEntradaDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class ReprocessamentoPorDependenciaBean implements Serializable, BuscaMunicipioCallback {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double aliquota;
	private boolean checkTodos;
	private String estadoFiltro;
	private String itemSelecionadoLista;
	private String itemSelecionadoListaContasMunicipio;
	private String estado;
	private String municipio;
	private String nomeMunicipio;
	private String codigoMunicipio;
	private String filtroTipoServico;
	private Integer periodoMesInicial;
	private Integer periodoAnoInicial;
	private Integer periodoMesFinal;
	private Integer periodoAnoFinal;
	private String periodoInicial;
	private String periodoFinal;
	private Integer dependenciaLinhaSelecionada;
	private Set<ReprocessamentoDependenciaProsseguirDTO> listaDependenciasSelecionadas = new HashSet<ReprocessamentoDependenciaProsseguirDTO>();
	private List<SelectItem> listaTipoServico = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<ReprocessamentoMunicipioDTO> listaMunicipioDTO;
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<ReprocessamentoDependenciaDTO> listaMunicipio;
	private List<ReprocessamentoDependenciaProsseguirDTO> listaDependenciaProsseguir;
	private List<SelectItem> listaRadioMunicipio = new ArrayList<SelectItem>();
	private List<SelectItem> listaRadioContas = new ArrayList<SelectItem>();
	private ReprocessamentoDependenciaAliquotaDTO listaDependenciaAliquota;
	private IReprocessamentoPorDependenciaService reprocessamentoPorDependenciaImpl;

	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private String indiceComboEmpresaFiltro;
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String tipo;

	private Map<String, List<ReprocessamentoMunicipioDTO>> contasDoMunicipio = new HashMap<String, List<ReprocessamentoMunicipioDTO>>();

	public String inicializarReprocessamentoPorDependencia() {
		limparReprocessamentoDependencia();
		carregaComboEstados();
		buscaMunicipio = new BuscaMunicipioBean();
		setContasDoMunicipio(new HashMap<String, List<ReprocessamentoMunicipioDTO>>());
		return "solicitarReprocessamentoPorDependencia";
	}

	public List<SelectItem> carregaComboEstados() {
		listaDosEstados = dependenciaImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
		return listaEstados;
	}

	public void buscaMunicipioManter() {
		tipo = "manter";
		buscaMunicipio(estadoFiltro);
	}

	public void buscaMunicipio(String estado) {
		if (tipo.equals("manter")) {
			buscaMunicipio.setCallback(this);
			buscaMunicipio.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if (estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipio.setEstado(uf != null ? uf : "");
			buscaMunicipio.buscar();
		}
	}

	public void processa() {
		if (tipo.equals("manter")) {
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
		}
		// else if(tipo.equals("manterIncorp")){
		// estadoResultDepNovasMun = gissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipioIncorp.getUf());
		// }
	}

	public String paginarListaMunicipio(ActionEvent e) {
		pesquisarMunicipio();
		setListaMunicipio(listaMunicipio);
		return "solicitarReprocessamentoPorDependencia";
	}
//VerificarTeste
	public String paginarListaDependencia(ActionEvent e) {
		carregarReprocessamentoPorDepMunicipio();
		//carregarReprocessamentoPorDependencia();
		//setListaDependenciaProsseguir(listaDependenciaProsseguir);

		//if (isCheckTodos()) {
		//	for (ReprocessamentoDependenciaProsseguirDTO d : getListaDependenciaProsseguir()) {
		//		d.setRadio(true);
		//	}
		//} else {
		//	for (ReprocessamentoDependenciaProsseguirDTO d : getListaDependenciaProsseguir()) {
		//		d.setRadio(getListaDependenciasSelecionadas().contains(d.getDependencia()));
		//	}
		//}

		//return "solicitarReprocessamentoPorDependenciaProsseguir";
		return "";
	}

	public String prosseguir() {
		setCheckTodos(false);
		setListaDependenciasSelecionadas(new HashSet<ReprocessamentoDependenciaProsseguirDTO>());
		if (reprocessamento())
			return "solicitarReprocessamentoPorDependenciaProsseguir";
		else
			return null;

	}

	public void pesquisarMunicipio() {
		if ("".equals(getEstadoFiltro())) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", false);
			return;
		}
		listaMunicipio = reprocessamentoPorDependenciaImpl.listarMunicipios(estadoFiltro);
		listaRadioMunicipio = GissUtil.preencherSelectItemsMunicipio(listaMunicipio);
	}

	public String carregarLista() {
		if (periodoMesInicial != null && periodoMesInicial > 0 && periodoAnoInicial != null && periodoAnoInicial > 0 && periodoMesFinal != null && periodoMesFinal > 0 && periodoAnoFinal != null && periodoAnoFinal > 0) {

			if ((periodoAnoInicial.compareTo(periodoAnoFinal) < 0) || (periodoAnoInicial.equals(periodoAnoFinal) && periodoMesInicial.compareTo(periodoMesFinal) <= 0)) {

				if (validarPeriodoMaiorCorrente(periodoMesFinal, periodoAnoFinal)) {
					BradescoFacesUtils.addInfoModalMessage("Período Final deve ser menor ou igual que o mês vigente.", false);
					return "";
				}

				if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
					listaMunicipio = null;
					buscaMunicipioManter();
					estado = labelEstado();
					periodoInicial = DateUtils.formatMesAno(periodoMesInicial, periodoAnoInicial);
					periodoFinal = DateUtils.formatMesAno(periodoMesFinal, periodoAnoFinal);
					codigoMunicipio = buscaMunicipio.getCodigo().toString();
					nomeMunicipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
					municipio = codigoMunicipio + " - " + buscaMunicipio.getDescricao();
					carregarReprocessamentoPorDepMunicipio();
					return "solicitarReprocessamentoPorDependenciaProsseguir";
				} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
					buscaMunicipioManter();
					return "";
				} else if (estadoFiltro != null && !estadoFiltro.equals("")) {
					pesquisarMunicipio();
					return "";
				}else{
					BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado e/ou Município!", false);				}
			} else {
				BradescoFacesUtils.addInfoModalMessage("Período Inicial deve ser menor que o Período Final.", "solicitarReprocessamentoPorDependencia", BradescoViewExceptionActionType.ACTION, false);
				return "";
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Os campos de datas são obrigatórios.", "solicitarReprocessamentoPorDependencia", BradescoViewExceptionActionType.ACTION, false);
			return "";
		}
		return "";

	}

	public boolean reprocessamento() {
		if (periodoMesInicial != null && periodoMesInicial > 0 && periodoAnoInicial != null && periodoAnoInicial > 0 && periodoMesFinal != null && periodoMesFinal > 0 && periodoAnoFinal != null && periodoAnoFinal > 0) {

			if ((periodoAnoInicial.compareTo(periodoAnoFinal) < 0) || (periodoAnoInicial.equals(periodoAnoFinal) && periodoMesInicial.compareTo(periodoMesFinal) <= 0)) {

				if (validarPeriodoMaiorCorrente(periodoMesFinal, periodoAnoFinal)) {
					BradescoFacesUtils.addInfoModalMessage("Período Final deve ser menor ou igual que o mês vigente.", false);
					return false;
				}

				ReprocessamentoDependenciaDTO municipioDTO = listaMunicipio.get(new Integer(itemSelecionadoLista));
				municipio = municipioDTO.getNome();
				codigoMunicipio = municipioDTO.getCodigo();
				nomeMunicipio = municipioDTO.getNome();
				estado = labelEstado();
				periodoInicial = DateUtils.formatMesAno(periodoMesInicial, periodoAnoInicial);
				periodoFinal = DateUtils.formatMesAno(periodoMesFinal, periodoAnoFinal);

				try {
					carregarReprocessamentoPorDependencia();
				} catch (PdcAdapterFunctionalException e) {
					
					throw e;
				}
			} else {
				BradescoFacesUtils.addInfoModalMessage("Período Inicial deve ser menor que o Período Final.", "solicitarReprocessamentoPorDependencia", BradescoViewExceptionActionType.ACTION, false);
				return false;
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Os campos de datas são obrigatórios.", "solicitarReprocessamentoPorDependencia", BradescoViewExceptionActionType.ACTION, false);
			return false;
		}
		return true;
	}

	private boolean validarPeriodoMaiorCorrente(Integer mesFinal, Integer anoFinal) {
		Calendar dataCorrente = Calendar.getInstance();
		int mesCorrente = dataCorrente.get(Calendar.MONTH) + 1;
		int anoCorrente = dataCorrente.get(Calendar.YEAR);

		return ((anoFinal > anoCorrente) || (anoFinal == anoCorrente && mesFinal > mesCorrente));
	}

	public String voltar() {
//		pesquisarMunicipio();
		return "solicitarReprocessamentoPorDependencia";
	}

	public String labelEstado() {
		String sCodEstado = "";
		String sRetorno = "";

		for (int i = 0; i <= listaEstados.size() - 1; i++) {
			sCodEstado = listaEstados.get(i).getValue().toString();
			if (sCodEstado.equals(estadoFiltro)) {
				sRetorno = listaEstados.get(i).getLabel();
				break;
			}
		}
		return sRetorno;
	}

	public String prosseguirContaMunicipio() {
		if (avancarContaMunicipio())
			return "solicitarReprocessamentoPorDependenciaContasMunicipio";
		else
			return null;
	}

	public boolean avancarContaMunicipio() {
		if (!isCheckTodos()) {
			if (getListaDependenciasSelecionadas() == null || getListaDependenciasSelecionadas().isEmpty()) {
				BradescoFacesUtils.addInfoModalMessage("Selecione uma ou mais dependências.", false);
				return false;
			}

			if (getListaDependenciasSelecionadas().size() > 100) {
				BradescoFacesUtils.addInfoModalMessage("Não é possível selecionar mais do que 100 dependências.", false);
				return false;
			}
		}

		limparContasMunicipios();
		setContasDoMunicipio(new HashMap<String, List<ReprocessamentoMunicipioDTO>>());
		listaTipoServico = reprocessamentoPorDependenciaImpl.listarComboTipoServico();
		return true;
	}

	public String prosseguirContaMunicipio2() {
		carregaListaContasTipoServico();
		return "solicitarReprocessamentoPorDependenciaContasMunicipio2";
	}
	
	public void carregarReprocessamentoPorDepMunicipio() {
		listaDependenciaAliquota = reprocessamentoPorDependenciaImpl.listarReprocessamentoDependencia(DateUtils.formatMesAnoData(periodoMesInicial, periodoAnoInicial), DateUtils.formatMesAnoData(periodoMesFinal, periodoAnoFinal), codigoMunicipio);

		this.aliquota = listaDependenciaAliquota.getAliquota();

		this.listaDependenciaProsseguir = listaDependenciaAliquota.getListaDependenciaDTO();
		
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciaAliquota.getListaDependenciaDTO());

	}
	
	public void carregarReprocessamentoPorDependencia() {
		ReprocessamentoDependenciaDTO municipioDTO = listaMunicipio.get(new Integer(itemSelecionadoLista));
		listaDependenciaAliquota = reprocessamentoPorDependenciaImpl.listarReprocessamentoDependencia(DateUtils.formatMesAnoData(periodoMesInicial, periodoAnoInicial), DateUtils.formatMesAnoData(periodoMesFinal, periodoAnoFinal), municipioDTO.getCodigo());

		this.aliquota = listaDependenciaAliquota.getAliquota();

		this.listaDependenciaProsseguir = listaDependenciaAliquota.getListaDependenciaDTO();

		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaDependenciaAliquota.getListaDependenciaDTO());
	}

	public void limparReprocessamentoDependencia() {
		setPeriodoMesInicial(null);
		setPeriodoAnoInicial(null);
		setPeriodoMesFinal(null);
		setPeriodoAnoFinal(null);
		setPeriodoInicial(null);
		setPeriodoFinal(null);
		setListaMunicipio(null);
		setEstadoFiltro(null);
		setCheckTodos(false);
	}

	public void carregaListaContasTipoServico() {
		if (filtroTipoServico == null || filtroTipoServico.trim().equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um Tipo de Serviço.", false);
			return;
		}

		listaMunicipioDTO = reprocessamentoPorDependenciaImpl.listarContasTipoServico(codigoMunicipio, filtroTipoServico);

		if (!contasDoMunicipio.containsKey(filtroTipoServico)) {
			contasDoMunicipio.put(filtroTipoServico, listaMunicipioDTO);
		}

		listaMunicipioDTO = contasDoMunicipio.get(filtroTipoServico);

		if (listaMunicipioDTO != null) {
			for (int i = 0; i < listaMunicipioDTO.size(); i++) {
				listaRadioContas.add(new SelectItem(i, " "));
			}
		}
	}

	public String voltarReprocessamentoConta() {
//		limparContasMunicipios();
		return "solicitarReprocessamentoPorDependenciaContasMunicipio";
	}

	public String voltarReprocessamentoDependenciaProsseguir() {
		return "solicitarReprocessamentoPorDependenciaProsseguir";
	}

	public void limparContasMunicipios() {
		setFiltroTipoServico(null);
		setListaMunicipioDTO(null);
	}

	public void limparCampos() {
		contasDoMunicipio.remove(filtroTipoServico);

		prosseguirContaMunicipio2();
	}

	public String finalizar() {
		List<ContaDTO> contas = obterContasModificadas();
		if (contas.isEmpty()) {
			BradescoFacesUtils.addInfoModalMessage("Selecione pelo menos uma conta.", false);
			return "";
		}

		if (contas.size() > 25) {
			BradescoFacesUtils.addInfoModalMessage("Não é possível selecionar mais do que 25 contas.", false);
			return "";
		}

		ReprocessamentoPorDependenciaEntradaDTO entradaDTO = new ReprocessamentoPorDependenciaEntradaDTO();
		entradaDTO.setCompetenciaInicial(NumberUtils.convertMesAno(getPeriodoMesInicial(), getPeriodoAnoInicial()));
		entradaDTO.setCompetenciaFinal(NumberUtils.convertMesAno(getPeriodoMesFinal(), getPeriodoAnoFinal()));
		entradaDTO.setCodMunicipio(NumberUtils.parseLong(getCodigoMunicipio()));
		entradaDTO.setContas(contas);

		if (isCheckTodos()) {
			entradaDTO.setCriterioSelecao("T");
		} else {
			entradaDTO.setCriterioSelecao("");
			for (ReprocessamentoDependenciaProsseguirDTO dep : getListaDependenciasSelecionadas()) {
				DependenciaDTO d = new DependenciaDTO();
				d.setCodigoPessoaJuridica(dep.getCodigoPessoaJuridica());
				d.setNumeroSequenciaUnidadeOrganizacional(dep.getNumeroSequenciaUnidadeOrganizacional());

				entradaDTO.addDependencia(d);
			}
		}

		BasicSaidaDTO saida = getReprocessamentoPorDependenciaImpl().solicitarReprocessamentoPorDependencia(entradaDTO);

		BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), "solicitarReprocessamentoPorDependencia", BradescoViewExceptionActionType.ACTION, false);

		inicializarReprocessamentoPorDependencia();

		return "";
	}

	private List<ContaDTO> obterContasModificadas() {
		List<ContaDTO> contas = new ArrayList<ContaDTO>();

		for (String tpServico : contasDoMunicipio.keySet()) {
			for (ReprocessamentoMunicipioDTO mun : contasDoMunicipio.get(tpServico)) {
				if (mun.isContaSelecionada()) {
					ContaDTO contaDTO = new ContaDTO();
					contaDTO.setCodigoContaContabil(mun.getCodigoConta());
					contaDTO.setPercentualAliquota(NumberUtils.convert(mun.getAliquota()));

					contas.add(contaDTO);
				}
			}
		}

		return contas;
	}

	public void atribuirDependenciaTodos() {
		for (ReprocessamentoDependenciaProsseguirDTO d : getListaDependenciaProsseguir()) {
			if (isCheckTodos()) {
				getListaDependenciasSelecionadas().add(d);
			}
			d.setRadio(isCheckTodos());
		}

		if (!isCheckTodos()) {
			getListaDependenciasSelecionadas().clear();
		}
	}

	public void atribuirDependencia() {
		int tamBlocoDependencia = getListaDependenciaProsseguir().size();
		if (getDependenciaLinhaSelecionada() != null && getDependenciaLinhaSelecionada() >= 0 && getDependenciaLinhaSelecionada() < tamBlocoDependencia) {

			ReprocessamentoDependenciaProsseguirDTO depend = getListaDependenciaProsseguir().get(getDependenciaLinhaSelecionada());
			if (depend.isRadio()) {
				getListaDependenciasSelecionadas().add(depend);
			} else {
				getListaDependenciasSelecionadas().remove(depend);
				setCheckTodos(false);
			}
		}
	}

	// Getters e Setters

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

	public List<ReprocessamentoDependenciaDTO> getListaMunicipio() {
		return listaMunicipio;
	}

	public void setListaMunicipio(List<ReprocessamentoDependenciaDTO> listaMunicipio) {
		this.listaMunicipio = listaMunicipio;
	}

	public IReprocessamentoPorDependenciaService getReprocessamentoPorDependenciaImpl() {
		return reprocessamentoPorDependenciaImpl;
	}

	public void setReprocessamentoPorDependenciaImpl(IReprocessamentoPorDependenciaService reprocessamentoPorDependenciaImpl) {
		this.reprocessamentoPorDependenciaImpl = reprocessamentoPorDependenciaImpl;
	}

	public List<SelectItem> getListaRadioMunicipio() {
		return listaRadioMunicipio;
	}

	public void setListaRadioMunicipio(List<SelectItem> listaRadioMunicipio) {
		this.listaRadioMunicipio = listaRadioMunicipio;
	}

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public boolean isCheckTodos() {
		return checkTodos;
	}

	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}

	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public List<ReprocessamentoMunicipioDTO> getListaMunicipioDTO() {
		return listaMunicipioDTO;
	}

	public void setListaMunicipioDTO(List<ReprocessamentoMunicipioDTO> listaMunicipioDTO) {
		this.listaMunicipioDTO = listaMunicipioDTO;
	}

	public List<SelectItem> getListaRadioContas() {
		return listaRadioContas;
	}

	public void setListaRadioContas(List<SelectItem> listaRadioContas) {
		this.listaRadioContas = listaRadioContas;
	}

	public String getFiltroTipoServico() {
		return filtroTipoServico;
	}

	public void setFiltroTipoServico(String filtroTipoServico) {
		this.filtroTipoServico = filtroTipoServico;
	}

	public ReprocessamentoDependenciaAliquotaDTO getListaDependenciaAliquota() {
		return listaDependenciaAliquota;
	}

	public void setListaDependenciaAliquota(ReprocessamentoDependenciaAliquotaDTO listaDependenciaAliquota) {
		this.listaDependenciaAliquota = listaDependenciaAliquota;
	}

	public List<ReprocessamentoDependenciaProsseguirDTO> getListaDependenciaProsseguir() {
		return listaDependenciaProsseguir;
	}

	public void setListaDependenciaProsseguir(List<ReprocessamentoDependenciaProsseguirDTO> listaDependenciaProsseguir) {
		this.listaDependenciaProsseguir = listaDependenciaProsseguir;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public String getItemSelecionadoListaContasMunicipio() {
		return itemSelecionadoListaContasMunicipio;
	}

	public void setItemSelecionadoListaContasMunicipio(String itemSelecionadoListaContasMunicipio) {
		this.itemSelecionadoListaContasMunicipio = itemSelecionadoListaContasMunicipio;
	}

	public Integer getPeriodoAnoFinal() {
		return periodoAnoFinal;
	}

	public void setPeriodoAnoFinal(Integer periodoAnoFinal) {
		this.periodoAnoFinal = periodoAnoFinal;
	}

	public Integer getPeriodoAnoInicial() {
		return periodoAnoInicial;
	}

	public void setPeriodoAnoInicial(Integer periodoAnoInicial) {
		this.periodoAnoInicial = periodoAnoInicial;
	}

	public Integer getPeriodoMesFinal() {
		return periodoMesFinal;
	}

	public void setPeriodoMesFinal(Integer periodoMesFinal) {
		this.periodoMesFinal = periodoMesFinal;
	}

	public Integer getPeriodoMesInicial() {
		return periodoMesInicial;
	}

	public void setPeriodoMesInicial(Integer periodoMesInicial) {
		this.periodoMesInicial = periodoMesInicial;
	}

	public String getPeriodoFinal() {
		return periodoFinal;
	}

	public void setPeriodoFinal(String periodoFinal) {
		this.periodoFinal = periodoFinal;
	}

	public String getPeriodoInicial() {
		return periodoInicial;
	}

	public void setPeriodoInicial(String periodoInicial) {
		this.periodoInicial = periodoInicial;
	}

	public Integer getDependenciaLinhaSelecionada() {
		return dependenciaLinhaSelecionada;
	}

	public void setDependenciaLinhaSelecionada(Integer dependenciaLinhaSelecionada) {
		this.dependenciaLinhaSelecionada = dependenciaLinhaSelecionada;
	}

	public Set<ReprocessamentoDependenciaProsseguirDTO> getListaDependenciasSelecionadas() {
		return listaDependenciasSelecionadas;
	}

	public void setListaDependenciasSelecionadas(Set<ReprocessamentoDependenciaProsseguirDTO> listaDependenciasSelecionadas) {
		this.listaDependenciasSelecionadas = listaDependenciasSelecionadas;
	}

	public Map<String, List<ReprocessamentoMunicipioDTO>> getContasDoMunicipio() {
		return contasDoMunicipio;
	}

	public void setContasDoMunicipio(Map<String, List<ReprocessamentoMunicipioDTO>> contasDoMunicipio) {
		this.contasDoMunicipio = contasDoMunicipio;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public String getIndiceComboEmpresaFiltro() {
		return indiceComboEmpresaFiltro;
	}

	public void setIndiceComboEmpresaFiltro(String indiceComboEmpresaFiltro) {
		this.indiceComboEmpresaFiltro = indiceComboEmpresaFiltro;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
