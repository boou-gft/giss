package br.com.bradesco.web.giss.view.bean.controller.apuracao.reprocessamentopormunicipio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.basic.bean.BasicSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.OcorrenciaReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean.ReprocessamentoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.IReprocessamentopormunicipioService;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioDTO;
import br.com.bradesco.web.giss.service.business.reprocessamentopormunicipio.bean.ReprocessamentoPorMunicipioEntradaDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class ReprocessamentoPorMunicipioBean implements Serializable, BuscaMunicipioCallback {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean mostraTabela;
	private boolean checkTodos;
	private boolean mostraCampos = true;
	private boolean inverteMostraCampos = false;
	private String itemSelecionadoListaContas;
	private String estadoFiltro;
	private String filtroTipoServico;
	private String filtroMunicipio;
	private String codMunicipio;
	private String codServico;
	private Integer periodoMesInicial;
	private Integer periodoAnoInicial;
	private Integer periodoMesFinal;
	private Integer periodoAnoFinal;
	private Integer municipioLinhaSelecionada;
	private String descMunicipio;
	private Set<ReprocessamentoPorMunicipioDTO> listaMunicipioSelecionados = new TreeSet<ReprocessamentoPorMunicipioDTO>();
	private List<SelectItem> listaMunicipioContas = new ArrayList<SelectItem>();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<SelectItem> listaTipoServico = new ArrayList<SelectItem>();
	private List<ReprocessamentoPorMunicipioDTO> listaMunicipiosEstadoPeriodo;
	private List<ReprocessamentoPorMunicipioDTO> listaMunicipios;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<ReprocessamentoMunicipioDTO> listaContasMunicipios;
	private List<SelectItem> listaRadioMunicipio = new ArrayList<SelectItem>();
	private List<SelectItem> listaRadioPesqMunicipio = new ArrayList<SelectItem>();
	private IReprocessamentopormunicipioService reprocessamentoPorMunicipioImpl;
	private boolean botaoPesquisarhabilitado;

	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private String indiceComboEmpresaFiltro;
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String tipo;

	private Map<String, Map<String, List<ReprocessamentoMunicipioDTO>>> contasDoMunicipio = new HashMap<String, Map<String, List<ReprocessamentoMunicipioDTO>>>();

	public String inicializaReprocessamentoPorMunicipio() {
		carregaComboEstados();
		setEstadoFiltro(null);
		setPeriodoMesInicial(null);
		setPeriodoAnoInicial(null);
		setPeriodoMesFinal(null);
		setPeriodoAnoFinal(null);
		setListaMunicipiosEstadoPeriodo(null);
		buscaMunicipio = new BuscaMunicipioBean();
		setMostraTabela(false);
		setDescMunicipio("");
		setMunicipioLinhaSelecionada(null);
		setListaMunicipioContas(new ArrayList<SelectItem>());
		setContasDoMunicipio(new HashMap<String, Map<String, List<ReprocessamentoMunicipioDTO>>>());
		return "solicitarReprocessamentoPorMunicipio";
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

	public String prosseguirContasMunicipios() {

		inverteMostraCampos = false;

		if (getListaMunicipioSelecionados().isEmpty()) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um ou mais municípios.", false);
			return "";
		}

		if (!isCheckTodos() && getListaMunicipioSelecionados().size() > 30) {
			BradescoFacesUtils.addInfoModalMessage("Não é possível selecionar mais que 30 municípios.", false);
			return "";
		}
		
		

		setListaMunicipioContas(carregaComboMunicipioConta());

		listaTipoServico = reprocessamentoPorMunicipioImpl.listarComboTipoServico();

		botaoPesquisarhabilitado = false;

		setFiltroTipoServico("");
		setCodMunicipio("");
		setDescMunicipio("");

		setContasDoMunicipio(new HashMap<String, Map<String, List<ReprocessamentoMunicipioDTO>>>());

		if (!isCheckTodos()) {
			for (ReprocessamentoPorMunicipioDTO reprocMun : getListaMunicipioSelecionados()) {
				getContasDoMunicipio().put(reprocMun.getCodigo(), new HashMap<String, List<ReprocessamentoMunicipioDTO>>());
			}
		}
		if(getListaMunicipioContas().size() == 1){
			codMunicipio = listaMunicipioContas.get(0).getValue().toString();
			descMunicipio = listaMunicipioContas.get(0).getLabel();
		}else{
			codMunicipio = null;
			descMunicipio = "";
		}

		return "solicitarReprocessamentoPorMunicipioContasMunicipio";

	}

	private List<SelectItem> carregaComboMunicipioConta() {
		List<SelectItem> listaComboMunContas = new ArrayList<SelectItem>();
		for (ReprocessamentoPorMunicipioDTO reproc : getListaMunicipioSelecionados()) {
			listaComboMunContas.add(new SelectItem(reproc.getCodigo(), reproc.getMunicipio()));
		}
		return listaComboMunContas;
	}

	public String pesquisarListaMunicipioEstadoPeriodo() {
		
		setCheckTodos(false);
		setListaMunicipioSelecionados(new TreeSet<ReprocessamentoPorMunicipioDTO>());

		

		if (periodoMesInicial != null && periodoMesInicial > 0 && periodoAnoInicial != null && periodoAnoInicial > 0 && periodoMesFinal != null && periodoMesFinal > 0 && periodoAnoFinal != null && periodoAnoFinal > 0) {

			if ((periodoAnoInicial.compareTo(periodoAnoFinal) < 0) || (periodoAnoInicial.equals(periodoAnoFinal) && periodoMesInicial.compareTo(periodoMesFinal) <= 0)) {

				if (validarPeriodoMaiorCorrente(periodoMesFinal, periodoAnoFinal)) {
					BradescoFacesUtils.addInfoModalMessage("Período Final deve ser menor ou igual que o mês vigente.", false);
					return "";
				}
				if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
					buscaMunicipioManter();
					codMunicipio = buscaMunicipio.getCodigo().toString();
					inverteMostraCampos = false;

					ReprocessamentoPorMunicipioDTO rec = new ReprocessamentoPorMunicipioDTO();
					rec.setCodigo(String.valueOf(GissUtil.notNull(buscaMunicipio.getCodigo())));
					rec.setMunicipio(buscaMunicipio.getDescricao());
					codMunicipio = buscaMunicipio.getCodigo().toString();
					descMunicipio = buscaMunicipio.getDescricao();
					getListaMunicipioSelecionados().add(rec);

					setListaMunicipioContas(carregaComboMunicipioConta());

					listaTipoServico = reprocessamentoPorMunicipioImpl.listarComboTipoServico();

					botaoPesquisarhabilitado = false;

					setFiltroTipoServico("");
					setMostraTabela(false);

					setContasDoMunicipio(new HashMap<String, Map<String, List<ReprocessamentoMunicipioDTO>>>());

					if (!isCheckTodos()) {
						for (ReprocessamentoPorMunicipioDTO reprocMun : getListaMunicipioSelecionados()) {
							getContasDoMunicipio().put(reprocMun.getCodigo(), new HashMap<String, List<ReprocessamentoMunicipioDTO>>());
						}
					}
					return "solicitarReprocessamentoPorMunicipioContasMunicipio";
				} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
					buscaMunicipioManter();
					return "";
				} else if (getEstadoFiltro() != null && !getEstadoFiltro().equals("")) {
					setMostraTabela(true);
					listaMunicipiosEstadoPeriodo = reprocessamentoPorMunicipioImpl.listaMunicipioEstadoPeriodo(estadoFiltro, DateUtils.formatMesAnoData(periodoMesInicial, periodoAnoInicial), DateUtils.formatMesAnoData(periodoMesFinal, periodoAnoFinal));
					listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaMunicipiosEstadoPeriodo);
					return "solicitarReprocessamentoPorMunicipio2";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Selecione um estado ou um município.", false);
					return "";
				}

			} else {
				BradescoFacesUtils.addInfoModalMessage("Período Inicial deve ser menor que o Período Final.", false);
				return "";
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Os campos de datas são obrigatórios.", false);
			return "";
		}

	}

	private boolean validarPeriodoMaiorCorrente(Integer mesFinal, Integer anoFinal) {
		Calendar dataCorrente = Calendar.getInstance();
		int mesCorrente = dataCorrente.get(Calendar.MONTH) + 1;
		int anoCorrente = dataCorrente.get(Calendar.YEAR);

		return ((anoFinal > anoCorrente) || (anoFinal == anoCorrente && mesFinal > mesCorrente));
	}

	public String voltar() {
		setMostraTabela(false);
		return "solicitarReprocessamentoPorMunicipio";
	}

	public String paginarListaMunicipios(ActionEvent e) {
		pesquisarListaMunicipioEstadoPeriodo();
		setListaMunicipiosEstadoPeriodo(listaMunicipiosEstadoPeriodo);

		if (isCheckTodos()) {
			for (ReprocessamentoPorMunicipioDTO reproc : getListaMunicipiosEstadoPeriodo()) {
				reproc.setRadio(true);
			}
		} else {
			for (ReprocessamentoPorMunicipioDTO reproc : getListaMunicipiosEstadoPeriodo()) {
				reproc.setRadio(getListaMunicipioSelecionados().equals(reproc.getCodigo()));
			}
		}

		return "solicitarReprocessamentoPorMunicipio2";
	}

	public String paginarListaContas(ActionEvent e) {
		pesquisarContasMunicipio();

		return null;
	}

	public String voltarReprocessamentoMunicipio() {
		return "solicitarReprocessamentoPorMunicipio2";
	}

	public String voltarReprocessamentoConta() {
		return "solicitarReprocessamentoPorMunicipioContasMunicipio";
	}

	public String voltarPesquisaMunicipio() {
		return "solicitarReprocessamentoPorMunicipioContasMunicipio";
	}

	public String carregarListaContasMunicipios() {
		if (codMunicipio == null || codMunicipio.equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um município.", false);
			return "";
		}

		if (filtroTipoServico == null || filtroTipoServico.equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um tipo de serviço.", false);
			return "";
		}

		pesquisarContasMunicipio();

		return "solicitarReprocessamentoPorMunicipioFinalizar";
	}

	private void pesquisarContasMunicipio() {
		listaContasMunicipios = reprocessamentoPorMunicipioImpl.listarContasTipoServico(codMunicipio, filtroTipoServico);

		// verifica se o municipio tem contas
		if (!contasDoMunicipio.containsKey(codMunicipio)) {
			contasDoMunicipio.put(codMunicipio, new HashMap<String, List<ReprocessamentoMunicipioDTO>>());
		}

		// adiciona a conta do municipio
		Map<String, List<ReprocessamentoMunicipioDTO>> contasPorTipo = contasDoMunicipio.get(codMunicipio);
		if (!contasPorTipo.containsKey(filtroTipoServico)) {
			contasPorTipo.put(filtroTipoServico, listaContasMunicipios);
		}

		listaContasMunicipios = contasPorTipo.get(filtroTipoServico);

		if (listaContasMunicipios != null) {
			// setMostraPaginacao(true);
			listaRadioMunicipio = new ArrayList<SelectItem>();
			for (int i = 0; i < listaContasMunicipios.size(); i++) {
				listaRadioMunicipio.add(new SelectItem(i, " "));
			}
		}
	}

	public String pesquisarMunicipios() {
		listaMunicipios = new ArrayList<ReprocessamentoPorMunicipioDTO>();
		if (isCheckTodos()) {
			listaMunicipios.addAll(reprocessamentoPorMunicipioImpl.listaMunicipioEstadoPeriodo(estadoFiltro, DateUtils.formatMesAnoData(periodoMesInicial, periodoAnoInicial), DateUtils.formatMesAnoData(periodoMesFinal, periodoAnoFinal)));
		} else {
			listaMunicipios.addAll(getListaMunicipioSelecionados());
		}

		if (listaMunicipios != null) {
			listaRadioPesqMunicipio = new ArrayList<SelectItem>();
			for (int i = 0; i < listaMunicipios.size(); i++) {
				listaRadioPesqMunicipio.add(new SelectItem(i, " "));
			}
		}

		return "solicitarReprocessamentoPorMunicipioPesqMunicipio";
	}

	public String pesquisarMunicipiosPaginacao(ActionEvent event) {
		return pesquisarMunicipios();
	}

	public String prosseguirPesqMunicipios() {
		ReprocessamentoPorMunicipioDTO municipioDTO = listaMunicipios.get(new Integer(filtroMunicipio));
		codMunicipio = municipioDTO.getCodigo();
		descMunicipio = municipioDTO.getMunicipio();

		return "solicitarReprocessamentoPorMunicipioContasMunicipio";
	}

	public void limparCampos() {
		if (contasDoMunicipio.containsKey(codMunicipio)) {
			Map<String, List<ReprocessamentoMunicipioDTO>> contasPorTipo = contasDoMunicipio.get(codMunicipio);
			if (contasPorTipo.containsKey(filtroTipoServico)) {
				contasPorTipo.remove(filtroTipoServico);
			}
		}

		pesquisarContasMunicipio();
	}

	public String finalizar() {
		List<OcorrenciaReprocessamentoPorMunicipioDTO> contas = obterContasModificadas();
		if (contas.isEmpty()) {
			BradescoFacesUtils.addInfoModalMessage("Selecione pelo menos uma conta.", "solicitarReprocessamentoPorMunicipioFinalizar", BradescoViewExceptionActionType.ACTION, false);
			return "solicitarReprocessamentoPorMunicipio";
		}

		if (contas.size() > 30) {
			BradescoFacesUtils.addInfoModalMessage("Não é possível selecionar mais do que 30 contas.", "solicitarReprocessamentoPorMunicipioFinalizar", BradescoViewExceptionActionType.ACTION, false);
			return "solicitarReprocessamentoPorMunicipio";
		}

		Integer estadoSelecionado = 0;
		if (getEstadoFiltro() != null && !getEstadoFiltro().trim().equals("")) {
			estadoSelecionado = Integer.parseInt(getEstadoFiltro());
		}

		ReprocessamentoPorMunicipioEntradaDTO entradaDTO = new ReprocessamentoPorMunicipioEntradaDTO();
		entradaDTO.setCodEstado(estadoSelecionado);
		entradaDTO.setCompetenciaInicial(NumberUtils.convertMesAno(getPeriodoMesInicial(), getPeriodoAnoInicial()));
		entradaDTO.setCompetenciaFinal(NumberUtils.convertMesAno(getPeriodoMesFinal(), getPeriodoAnoFinal()));
		entradaDTO.setOcorrencias(contas);

		if (isCheckTodos()) {
			entradaDTO.setCriterioSelecao("T");
		} else {
			entradaDTO.setCriterioSelecao("");
		}

		try {
			BasicSaidaDTO saida = getReprocessamentoPorMunicipioImpl().solicitarReprocessamentoPorMunicipio(entradaDTO);
			BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), false);
			inicializaReprocessamentoPorMunicipio();
		} catch (PdcAdapterFunctionalException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "solicitarReprocessamentoPorMunicipioFinalizar", BradescoViewExceptionActionType.ACTION, false);
			return "solicitarReprocessamentoPorMunicipio";
		}
		return "solicitarReprocessamentoPorMunicipio";
	}

	private List<OcorrenciaReprocessamentoPorMunicipioDTO> obterContasModificadas() {
		List<OcorrenciaReprocessamentoPorMunicipioDTO> contas = new ArrayList<OcorrenciaReprocessamentoPorMunicipioDTO>();

		for (String cMunicipio : contasDoMunicipio.keySet()) {
			Map<String, List<ReprocessamentoMunicipioDTO>> contasPorTipo = contasDoMunicipio.get(cMunicipio);

			// O municipio esta selecionado mas nao teve aliquota alterada.
			// Portanto, so envia o codigo do municipio
			if (!isCheckTodos() && contasPorTipo.isEmpty()) {
				OcorrenciaReprocessamentoPorMunicipioDTO ocorrMunicipio = new OcorrenciaReprocessamentoPorMunicipioDTO();
				ocorrMunicipio.setCodigoMunicipio(NumberUtils.parseLong(cMunicipio));
				ocorrMunicipio.setContaContabil("0");
				ocorrMunicipio.setAliquota(BigDecimal.ZERO);
				ocorrMunicipio.setRazao("");

				contas.add(ocorrMunicipio);
			} else {
				for (String tpServico : contasPorTipo.keySet()) {
					for (ReprocessamentoMunicipioDTO mun : contasPorTipo.get(tpServico)) {
						if (mun.isContaSelecionada()) {
							OcorrenciaReprocessamentoPorMunicipioDTO ocorrMunicipio = new OcorrenciaReprocessamentoPorMunicipioDTO();
							ocorrMunicipio.setCodigoMunicipio(NumberUtils.parseLong(cMunicipio));
							ocorrMunicipio.setContaContabil(mun.getCodigoConta());
							ocorrMunicipio.setAliquota(NumberUtils.convert(mun.getAliquota()));
							ocorrMunicipio.setRazao(mun.getRazao());

							contas.add(ocorrMunicipio);
						}
					}
				}
			}
		}

		return contas;
	}

	public void atribuirMunicipioTodos() {
		for (ReprocessamentoPorMunicipioDTO reproc : getListaMunicipiosEstadoPeriodo()) {
			reproc.setRadio(isCheckTodos());
		}

		if (isCheckTodos()) {
			getListaMunicipioSelecionados().addAll(getListaMunicipiosEstadoPeriodo());
		} else {
			getListaMunicipioSelecionados().clear();
		}
	}

	public void atribuirMunicipio() {
		int tamBlocoMunicipio = getListaMunicipiosEstadoPeriodo().size();
		if (getMunicipioLinhaSelecionada() != null && getMunicipioLinhaSelecionada() >= 0 && getMunicipioLinhaSelecionada() < tamBlocoMunicipio) {

			ReprocessamentoPorMunicipioDTO reproc = getListaMunicipiosEstadoPeriodo().get(getMunicipioLinhaSelecionada());
			if (reproc.isRadio()) {
				getListaMunicipioSelecionados().add(reproc);
			} else {
				getListaMunicipioSelecionados().remove(reproc);
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

	public IReprocessamentopormunicipioService getReprocessamentoPorMunicipioImpl() {
		return reprocessamentoPorMunicipioImpl;
	}

	public void setReprocessamentoPorMunicipioImpl(IReprocessamentopormunicipioService reprocessamentoPorMunicipioImpl) {
		this.reprocessamentoPorMunicipioImpl = reprocessamentoPorMunicipioImpl;
	}

	public String getFiltroTipoServico() {
		return filtroTipoServico;
	}

	public void setFiltroTipoServico(String filtroTipoServico) {
		this.filtroTipoServico = filtroTipoServico;
	}

	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public List<ReprocessamentoPorMunicipioDTO> getListaMunicipiosEstadoPeriodo() {
		return listaMunicipiosEstadoPeriodo;
	}

	public void setListaMunicipiosEstadoPeriodo(List<ReprocessamentoPorMunicipioDTO> listaMunicipiosEstadoPeriodo) {
		this.listaMunicipiosEstadoPeriodo = listaMunicipiosEstadoPeriodo;
	}

	public boolean isMostraTabela() {
		return mostraTabela;
	}

	public void setMostraTabela(boolean mostraTabela) {
		this.mostraTabela = mostraTabela;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public boolean isCheckTodos() {
		return checkTodos;
	}

	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}

	public List<ReprocessamentoMunicipioDTO> getListaContasMunicipios() {
		return listaContasMunicipios;
	}

	public void setListaContasMunicipios(List<ReprocessamentoMunicipioDTO> listaContasMunicipios) {
		this.listaContasMunicipios = listaContasMunicipios;
	}

	public List<SelectItem> getListaRadioMunicipio() {
		return listaRadioMunicipio;
	}

	public void setListaRadioMunicipio(List<SelectItem> listaRadioMunicipio) {
		this.listaRadioMunicipio = listaRadioMunicipio;
	}

	public List<ReprocessamentoPorMunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<ReprocessamentoPorMunicipioDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public List<SelectItem> getListaRadioPesqMunicipio() {
		return listaRadioPesqMunicipio;
	}

	public void setListaRadioPesqMunicipio(List<SelectItem> listaRadioPesqMunicipio) {
		this.listaRadioPesqMunicipio = listaRadioPesqMunicipio;
	}

	public String getFiltroMunicipio() {
		return filtroMunicipio;
	}

	public void setFiltroMunicipio(String filtroMunicipio) {
		this.filtroMunicipio = filtroMunicipio;
	}

	public boolean isMostraCampos() {
		return mostraCampos;
	}

	public void setMostraCampos(boolean mostraCampos) {
		this.mostraCampos = mostraCampos;
	}

	public boolean isInverteMostraCampos() {
		return inverteMostraCampos;
	}

	public void setInverteMostraCampos(boolean inverteMostraCampos) {
		this.inverteMostraCampos = inverteMostraCampos;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getCodServico() {
		return codServico;
	}

	public void setCodServico(String codServico) {
		this.codServico = codServico;
	}

	public String getItemSelecionadoListaContas() {
		return itemSelecionadoListaContas;
	}

	public void setItemSelecionadoListaContas(String itemSelecionadoListaContas) {
		this.itemSelecionadoListaContas = itemSelecionadoListaContas;
	}

	public boolean isBotaoPesquisarhabilitado() {
		return botaoPesquisarhabilitado;
	}

	public void setBotaoPesquisarhabilitado(boolean botaoPesquisarhabilitado) {
		this.botaoPesquisarhabilitado = botaoPesquisarhabilitado;
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

	public Integer getMunicipioLinhaSelecionada() {
		return municipioLinhaSelecionada;
	}

	public void setMunicipioLinhaSelecionada(Integer municipioLinhaSelecionada) {
		this.municipioLinhaSelecionada = municipioLinhaSelecionada;
	}

	public Set<ReprocessamentoPorMunicipioDTO> getListaMunicipioSelecionados() {
		return listaMunicipioSelecionados;
	}

	public void setListaMunicipioSelecionados(Set<ReprocessamentoPorMunicipioDTO> listaMunicipioSelecionados) {
		this.listaMunicipioSelecionados = listaMunicipioSelecionados;
	}

	public List<SelectItem> getListaMunicipioContas() {
		return listaMunicipioContas;
	}

	public void setListaMunicipioContas(List<SelectItem> listaMunicipioContas) {
		this.listaMunicipioContas = listaMunicipioContas;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public Map<String, Map<String, List<ReprocessamentoMunicipioDTO>>> getContasDoMunicipio() {
		return contasDoMunicipio;
	}

	public void setContasDoMunicipio(Map<String, Map<String, List<ReprocessamentoMunicipioDTO>>> contasDoMunicipio) {
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

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

}
