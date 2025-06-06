package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensaldiferenciada.bean.ApuracaoMensalDiferenciadaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.IPlanApuracaoIssService;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssEntradaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaListaDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssAllDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

import com.lowagie.text.DocumentException;

public class PlanApuracaoIssBean implements Serializable, BuscaMunicipioCallback {
	private static final long serialVersionUID = 1L;

	private Integer radioTelaPesquisar;
	private int radioTelaResultado;
	private String estadoFiltro;
	private String estadoSelecionado;
	private String municipioSelecionado;
	private Long codMunicipioSelecionado;
	private List<SelectItem> listaEstadoFiltro = new ArrayList<SelectItem>();
	private List<MunicipioDTO> listaPesquisa;
	private List<SelectItem> listaControlePesquisa = new ArrayList<SelectItem>();
	private boolean mostraBotoes;
	private List<ApuracaoMensalDiferenciadaDTO> listaResultado;
	private List<SelectItem> listaControleResultado = new ArrayList<SelectItem>();
	private boolean mostraBotoesResultado;
	private String obrigatoriedade;
	private BigDecimal totalMunicipioReceita;
	private BigDecimal totalMunicipiolIss;
	private String mesFiltro;
	private String anoFiltro;
	private IPlanApuracaoIssService planApuracaoIssImpl;
	private String prosseguirHabilitado;
	private boolean carregaMunicipios;
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios;
	private List<SelectItem> listaControleCheckRadio;
	private String estadoNome;
	private List<PlanApuracaoIssSaidaListaDTO> listaSaidaPlanilha;
	private Integer[] itemApuracaoSelecionado = null;
	private IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private BuscaMunicipioBean buscaMunicipio;
	private IConsultarapuracaoparcialService consultarApuracaoParcialImpl;
	private PlanApuracaoIssEntradaDTO planApuracaoEntrada = new PlanApuracaoIssEntradaDTO();
	private Date competenciaFiltro;
	private String indiceComboEmpresaFiltro;
	private Integer codDepFiltro;
	private boolean mostrarCabecalho;
	private boolean checkTodosIncluir;
	private boolean checkAberturaConta;

	private Long totalAgencia;

	private Long totalPa;

	public boolean pesquisaMunicipios() {
		try {
			setRadioTelaPesquisar(null);
			listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(estadoFiltro);

			if (listaMunicipios != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();

				for (int i = 0; i <= listaMunicipios.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				mostraBotoes = !listaMunicipios.isEmpty();
				setCarregaMunicipios(true);
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), limparTela(), BradescoViewExceptionActionType.ACTION, false);
			return false;
		}

		return true;
	}

	public void paginarMunicipios(ActionEvent event) {
		radioTelaPesquisar = null;
		pesquisaMunicipios();
	}

	/**
	 * Acao do primeiro botao "consultar" do filtro.
	 * 
	 * Se estiver preenchido apenas o estado, mostra a lista de municipios. Se estiver preenchido o municipio ou empresa+dependencia, vai para a tela seguinte.
	 * 
	 * @return
	 */
	public String consultarFiltroInicial() {
		boolean estado = !GissUtil.isEmptyOrNull(estadoFiltro);
		boolean municipio = !GissUtil.isEmptyOrNull(buscaMunicipio.getCodigo());
		boolean dependencia = !GissUtil.isEmptyOrNull(codDepFiltro);
		Integer mesInicial = planApuracaoEntrada.getMesApuracaoContabilInicio();
		Integer anoInicial = planApuracaoEntrada.getAnoApuracaoContabilInicio();
		Integer mesFinal = planApuracaoEntrada.getMesApuracaoContabilFim();
		Integer anoFinal = planApuracaoEntrada.getAnoApuracaoContabilFim();

		// Verifica se os campos de perio
		if (GissUtil.isEmptyOrNull(mesInicial) || GissUtil.isEmptyOrNull(anoInicial) || GissUtil.isEmptyOrNull(mesFinal) || GissUtil.isEmptyOrNull(anoFinal)) {
			BradescoFacesUtils.addInfoModalMessage("Preencha o período", false);
			return null;
		}

		if ((anoInicial.compareTo(anoFinal) < 0) || (anoInicial.equals(anoFinal) && mesInicial.compareTo(mesFinal) <= 0)) {

			if (GissUtil.validarPeriodoCorrente(mesFinal, anoFinal)) {
				BradescoFacesUtils.addInfoModalMessage("Período Final deve ser menor que mês vigente.", false);
				return "";
			}

		} else {
			BradescoFacesUtils.addInfoModalMessage("Período Inicial deve ser menor que o Período Final.", false);
			return "";
		}

		if (!GissUtil.validaPeriodoMes(mesInicial, anoInicial, mesFinal, anoFinal, 18)) {
			BradescoFacesUtils.addInfoModalMessage("Período máximo de 18 meses.", false);
			return "";
		}

		// Nenhum campo-chave preenchido
		if (!(estado || municipio || dependencia)) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um filtro: estado/municipio ou dependencia", false);
			return null;
		}

		// Preenchido depencia e (municipio ou estado)
		if (dependencia && (municipio || estado)) {
			BradescoFacesUtils.addInfoModalMessage("Selecione apenas um filtro: estado/municipio ou dependencia", false);
			return null;
		}

		// Apenas estado
		if (estado && !municipio && !dependencia) {
			// Verifica se e bem sucedida a busca de municipios
			if (!pesquisaMunicipios()) {
				return null;
			}
			return "planilhaApuracaoISS"; // Permanece na tela
		}

		// Somente municipio ou somente dependencia. Em ambos casos vai para a proxima tela

		// Efetua a busca de municipio, para garantir que a descricao e estado equivalem ao codigo digitado
		if (GissUtil.notNull(buscaMunicipio.getCodigo()) != 0L) {
			buscaMunicipio.buscar();
			processa();// Carrega o combo de estado a partir do resultado da busca de municipio
		} else {
			buscaMunicipio.setDescricao("");
		}

		planApuracaoEntrada.setCodigoMunicipio(String.valueOf(GissUtil.notNull(buscaMunicipio.getCodigo())));
		if (carregaListaResultado()) {
			carregaMunicipios = false;
			mostraBotoes = false;
			setRadioTelaPesquisar(null);
			return "planilhaApuracaoISSResultado";
		}
		return null;
	}

	public boolean carregaListaResultado() {
		try {
			planApuracaoEntrada.setCodPessoaJuridica(codDepFiltro !=null?GissUtil.stringToLong(indiceComboEmpresaFiltro):0l);
			planApuracaoEntrada.setCodigoDependencia(GissUtil.notNull(codDepFiltro));
			PlanApuracaoIssSaidaDTO resultado = planApuracaoIssImpl.planApuracaoListaSaida(planApuracaoEntrada);
			listaSaidaPlanilha = resultado.getLista();
			codMunicipioSelecionado = GissUtil.stringToLong(planApuracaoEntrada.getCodigoMunicipio());
			if (GissUtil.stringToLong(planApuracaoEntrada.getCodigoMunicipio()) == 0) {
				estadoNome = resultado.getUf();
				municipioSelecionado = resultado.getMunicipio();
				
			} else {
				estadoNome = GissUtil.procuraUnidadeFederativaSemCodigo(listaEstados, estadoFiltro);
				municipioSelecionado = buscaMunicipio.getDescricao();
			}

			if (listaSaidaPlanilha != null) {
				listaControleResultado = new ArrayList<SelectItem>();

				for (int i = 0; i < listaSaidaPlanilha.size(); i++) {
					listaControleResultado.add(new SelectItem(String.valueOf(i), " "));
				}

				mostraBotoesResultado = true;
			}
			totalMunicipiolIss = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipiolIss();
			totalMunicipioReceita = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipioReceita();
			totalAgencia = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdeAgencia();
			totalPa = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdePa();
			return true;

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addErrorModalMessage(p.getMessage());
		} catch (Exception p) {
			BradescoFacesUtils.addErrorModalMessage(p.getMessage());
		}
		return false;
	}

	public void paginarListaResultado(ActionEvent evt) {
		carregaListaResultado();
	}

	public String voltarPesquisar() {
//		consultarFiltroInicial();
		this.itemApuracaoSelecionado = null;
		return "planilhaApuracaoISS";
	}

	/**
	 * Acao do botao "PDF" na tela de resultado de pesquisa
	 * 
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	public String consultarPDFAgencia() throws DocumentException, IOException {
		if(itemApuracaoSelecionado.length <= 12){
			RelatorioApuracaoIssDTO relatorio = new RelatorioApuracaoIssDTO();
			List<RelatorioApuracaoIssDTO> lstRelatorio = new ArrayList<RelatorioApuracaoIssDTO>();
			for(Integer chk : itemApuracaoSelecionado){		
				PlanApuracaoIssSaidaListaDTO apuracaoSelecionada = getListaSaidaPlanilha().get(chk);
				PlanApuracaoIssEntradaDTO planApuracaoIssEntradaDTO = new PlanApuracaoIssEntradaDTO();
				planApuracaoIssEntradaDTO.setCodDepPa(apuracaoSelecionada.getCodDepPa());
				planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(getPlanApuracaoEntrada().getMesApuracaoContabilInicio());
				planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(getPlanApuracaoEntrada().getAnoApuracaoContabilInicio());
	
				planApuracaoIssEntradaDTO.setMesApuracaoContabilFim(getPlanApuracaoEntrada().getMesApuracaoContabilFim());
				planApuracaoIssEntradaDTO.setAnoApuracaoContabilFim(getPlanApuracaoEntrada().getAnoApuracaoContabilFim());
	
				planApuracaoIssEntradaDTO.setCodPessoaJuridica(apuracaoSelecionada.getCodigoPessoaJuridica());
				planApuracaoIssEntradaDTO.setNumeroSequencial(apuracaoSelecionada.getNumeroSequencial());
				planApuracaoIssEntradaDTO.setCodigoMunicipio(String.valueOf(apuracaoSelecionada.getCodigoMunicipio()));

				relatorio = getPlanApuracaoIssImpl().listarPlanilhaApuracao(planApuracaoIssEntradaDTO, checkAberturaConta);
				lstRelatorio.add(relatorio);
			}
	
			getPlanApuracaoIssImpl().gerarPlanilhaApuracaoPDF(lstRelatorio, FacesUtils.getServletResponse().getOutputStream(), checkAberturaConta);
			FacesUtils.getServletResponse().setContentType("application/pdf");
			FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.pdf");
			FacesUtils.getContext().responseComplete();
		}else{
			BradescoFacesUtils.addInfoModalMessage(gerarEos(),false);
		}
		return null;
	}

	/**
	 * Acao do botao "PDF" na tela de resultado de pesquisa
	 * 
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	public String consultarPDF() throws DocumentException, IOException {
		if(itemApuracaoSelecionado.length <= 12){
			
			List<RelatorioApuracaoIssDTO> lstRelatorioApuracaoIssDTO = new ArrayList<RelatorioApuracaoIssDTO>();
			RelatorioApuracaoIssDTO relatorio = null;
			for(Integer chk : itemApuracaoSelecionado){
				
				PlanApuracaoIssSaidaListaDTO apuracaoSelecionada = getListaSaidaPlanilha().get(chk);
	
				PlanApuracaoIssEntradaDTO planApuracaoIssEntradaDTO = new PlanApuracaoIssEntradaDTO();
				
				planApuracaoIssEntradaDTO.setCodPessoaJuridica(apuracaoSelecionada.getCodigoPessoaJuridica());
				planApuracaoIssEntradaDTO.setNumeroSequencial(apuracaoSelecionada.getNumeroSequencial());
				
				if (mostrarCabecalho) {
					planApuracaoIssEntradaDTO.setCodDepPa(apuracaoSelecionada.getCodDepPa());
					planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
					planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getAnoCompetencia()));
					planApuracaoIssEntradaDTO.setMesApuracaoContabilFim(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilFim(Integer.parseInt(apuracaoSelecionada.getAnoCompetencia()));
					planApuracaoIssEntradaDTO.setCodigoMunicipio(String.valueOf(apuracaoSelecionada.getCodigoMunicipio()));
					relatorio = getPlanApuracaoIssImpl().listarPlanilhaApuracao(planApuracaoIssEntradaDTO, checkAberturaConta);
				} else {
					planApuracaoIssEntradaDTO.setCodDepPa(apuracaoSelecionada.getCodDepPa());
					planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(0);
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(0);
					planApuracaoIssEntradaDTO.setMesApuracaoContabilFim(0);
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilFim(apuracaoSelecionada.getDataCompetencia());
					relatorio = getPlanApuracaoIssImpl().listarPlanilhaApuracaoAgencia(planApuracaoIssEntradaDTO, checkAberturaConta);
				}
				lstRelatorioApuracaoIssDTO.add(relatorio);
			}
			
			if (relatorio.getApuracoes().size() > 0) {
				getPlanApuracaoIssImpl().gerarPlanilhaApuracaoPDF(lstRelatorioApuracaoIssDTO,FacesUtils.getServletResponse().getOutputStream(), checkAberturaConta);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Dependência sem registros de contas", false);
				return "";
			}
	
			FacesUtils.getServletResponse().setContentType("application/pdf");
			FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.pdf");
			FacesUtils.getContext().responseComplete();
		}else{
			BradescoFacesUtils.addInfoModalMessage(gerarEos(),false);
		}
		return null;
	}

	/**
	 * Acao do botao "TXT" na tela de resultado de pesquisa
	 * 
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	public String consultarTXT() throws DocumentException, IOException {
		RelatorioApuracaoIssDTO relatorio = null;
		List<RelatorioApuracaoIssDTO> lstRelatorio = new ArrayList<RelatorioApuracaoIssDTO>();
		if(itemApuracaoSelecionado.length <= 12){
			for(Integer chk : itemApuracaoSelecionado){
				PlanApuracaoIssSaidaListaDTO apuracaoSelecionada = getListaSaidaPlanilha().get(chk);
				PlanApuracaoIssEntradaDTO planApuracaoIssEntradaDTO = new PlanApuracaoIssEntradaDTO();
				
				planApuracaoIssEntradaDTO.setCodPessoaJuridica(apuracaoSelecionada.getCodigoPessoaJuridica());
				planApuracaoIssEntradaDTO.setNumeroSequencial(apuracaoSelecionada.getNumeroSequencial());
				planApuracaoIssEntradaDTO.setCodDepPa(apuracaoSelecionada.getCodDepPa());
				
				if (mostrarCabecalho) {
					planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getAnoCompetencia()));
					planApuracaoIssEntradaDTO.setMesApuracaoContabilFim(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilFim(Integer.parseInt(apuracaoSelecionada.getAnoCompetencia()));
					planApuracaoIssEntradaDTO.setCodigoMunicipio(String.valueOf(apuracaoSelecionada.getCodigoMunicipio()));
					relatorio = getPlanApuracaoIssImpl().listarPlanilhaApuracao(planApuracaoIssEntradaDTO, checkAberturaConta);
				} else {
					planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(0);
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(0);
					planApuracaoIssEntradaDTO.setMesApuracaoContabilFim(0);
					planApuracaoIssEntradaDTO.setAnoApuracaoContabilFim(apuracaoSelecionada.getDataCompetencia());
					relatorio = getPlanApuracaoIssImpl().listarPlanilhaApuracaoAgencia(planApuracaoIssEntradaDTO, checkAberturaConta);
				}
				
				lstRelatorio.add(relatorio);
				
			}

			if(relatorio.getApuracoes().size() > 0){
				getPlanApuracaoIssImpl().gerarPlanilhaApuracaoTXT(lstRelatorio, FacesUtils.getServletResponse().getOutputStream(), checkAberturaConta);
			}else{
				BradescoFacesUtils.addInfoModalMessage("Dependência sem registros de contas", false);
				return"";
			}
			
			FacesUtils.getServletResponse().setContentType("application/txt");
			FacesUtils.getServletResponse().setHeader("Content-Disposition", "attachment;filename=planilhaApuracao.txt");
			FacesUtils.getContext().responseComplete();
		}else{
			BradescoFacesUtils.addInfoModalMessage(gerarEos(),false);
		}
		return null;
	}

	private String gerarEos() {
		PlanApuracaoIssEntradaDTO entrada = new PlanApuracaoIssEntradaDTO();
		for(Integer chk : itemApuracaoSelecionado){
			PlanApuracaoIssSaidaListaDTO apuracaoSelecionada = getListaSaidaPlanilha().get(chk);
			PlanApuracaoIssEntradaDTO planApuracaoIssEntradaDTO = new PlanApuracaoIssEntradaDTO();
			
			planApuracaoIssEntradaDTO.setNumeroSequencial(apuracaoSelecionada.getNumeroSequencial());
			planApuracaoIssEntradaDTO.setMesApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getMesCompetencia()));
			planApuracaoIssEntradaDTO.setAnoApuracaoContabilInicio(Integer.parseInt(apuracaoSelecionada.getAnoCompetencia()));
			entrada.getLista().add(planApuracaoIssEntradaDTO);
		}
		entrada.setCodigoMunicipio(String.valueOf(GissUtil.notNull(codMunicipioSelecionado)));
		return getPlanApuracaoIssImpl().gerarPlaninlhaApuracaoEos(entrada, checkAberturaConta);
		
	}		
		
	
	public void limparPagina(ActionEvent evt) {

		setMostraBotoes(false);
		setListaPesquisa(null);
		setEstadoFiltro("");
		setCompetenciaFiltro(new Date());
		setRadioTelaPesquisar(-1);
		setMesFiltro("");
		setAnoFiltro("");
	}

	public String limparTela() {

		setMostraBotoes(false);

		setCompetenciaFiltro(new Date());
		setRadioTelaPesquisar(-1);
		setCarregaMunicipios(false);

		carregaComboEstados();

		return "planilhaApuracaoISS";
	}

	public String iniciarTela() {
		setMostrarCabecalho(true);
		setMostraBotoes(false);
		setListaMunicipios(null);
		setCompetenciaFiltro(new Date());
		setRadioTelaPesquisar(-1);
		setCarregaMunicipios(false);
		planApuracaoEntrada = new PlanApuracaoIssEntradaDTO();

		listaEmpresa = listarEmpresaServiceImpl.carregarComboEmpresa();
		indiceComboEmpresaFiltro = "0";
		buscaMunicipio = new BuscaMunicipioBean();
		setEstadoFiltro(null);
		setCodDepFiltro(null);
		setIndiceComboEmpresaFiltro(null);
		carregaComboEstados();
		itemApuracaoSelecionado = null;
		checkTodosIncluir = false;

		return "planilhaApuracaoISS";
	}

	public String iniciarTelaAgencia() {
		setMostrarCabecalho(false);
		setItemApuracaoSelecionado(null);
		planApuracaoEntrada.setCodigoMunicipio("0");
		planApuracaoEntrada.setMesApuracaoContabilInicio(0);
		planApuracaoEntrada.setAnoApuracaoContabilInicio(0);
		planApuracaoEntrada.setMesApuracaoContabilFim(0);
		planApuracaoEntrada.setAnoApuracaoContabilFim(0);
		planApuracaoEntrada.setNumeroSequencial(0);
		planApuracaoEntrada.setCodPessoaJuridica(0l);
		planApuracaoEntrada.setCodigoDependencia(0 );
		itemApuracaoSelecionado = null;
		checkTodosIncluir = false;

		try {
			PlanApuracaoIssSaidaDTO resultado = planApuracaoIssImpl.planApuracaoListaSaida(planApuracaoEntrada);
			listaSaidaPlanilha = resultado.getLista();

			if (listaSaidaPlanilha != null) {
				listaControleResultado = GissUtil.preencherSelectItemsMunicipio(listaSaidaPlanilha);
				mostraBotoesResultado = true;
			}
			totalMunicipiolIss = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipiolIss();
			totalMunicipioReceita = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipioReceita();
			totalAgencia = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdeAgencia();
			totalPa = listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdePa();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return "";
		} catch (Exception p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return "";
		}
		return "planilhaApuracaoISSAgencia";
	}

	public String prosseguir() {
		setItemApuracaoSelecionado(null);
		setRadioTelaResultado(-1);
		itemApuracaoSelecionado = null;
		checkAberturaConta = false;
		
		if (GissUtil.notNull(planApuracaoEntrada.getMesApuracaoContabilInicio()) == 0 || GissUtil.notNull(planApuracaoEntrada.getAnoApuracaoContabilInicio()) == 0 || GissUtil.notNull(planApuracaoEntrada.getMesApuracaoContabilFim()) == 0 || GissUtil.notNull(planApuracaoEntrada.getAnoApuracaoContabilFim()) == 0) {
			BradescoFacesUtils.addInfoModalMessage("Digite o período.", false);
		} else {
			ConsultarMunicipiosApuracaoParcialDTO municipio = getListaMunicipios().get(getRadioTelaPesquisar());
			planApuracaoEntrada.setCodigoMunicipio(municipio.getCodigo());

			// buscaMunicipio.setCodigo(GissUtil.stringToLong(municipio.getCodigo()));
			 buscaMunicipio.setDescricao(municipio.getNome());

			if (carregaListaResultado()) {
				estadoNome = GissUtil.procuraUnidadeFederativaSemCodigo(listaEstados, estadoFiltro);
				return "planilhaApuracaoISSResultado";
			}
		}
		return null;
	}

	public void buscaMunicipioManter() {
		buscaMunicipio(estadoFiltro);
	}

	public void buscaMunicipio(String estado) {
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (estado.equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null ? uf : "");
		buscaMunicipio.buscar();

	}

	public void processa() {
		estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
	}

	public void imprimirPlanilhaEletronica(ActionEvent ae){
		ExportarPlanilha exportar = new ExportarPlanilha("Planilha de Apuração ISS", "PLANILHA_APURACAO_ISS");
		try {
			exportar.planilhaApuracaoISS(listaSaidaPlanilha);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
	}
	
	/**
	 * Carrega o combo de estados
	 * 
	 * @return
	 */
	private void carregaComboEstados() {
		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}

	public Integer getPegarTamanhoLista(){
		return listaSaidaPlanilha.size();
	}
	
	/**
	 * Obtém o campo planApuracaoIssImpl
	 * 
	 * @return planApuracaoIssImpl IPlanApuracaoIssService
	 */
	public IPlanApuracaoIssService getPlanApuracaoIssImpl() {
		return planApuracaoIssImpl;
	}

	/**
	 * Define o campo planApuracaoIssImpl
	 * 
	 * @param planApuracaoIssImpl
	 *            IPlanApuracaoIssService
	 */
	public void setPlanApuracaoIssImpl(IPlanApuracaoIssService planApuracaoIssImpl) {
		this.planApuracaoIssImpl = planApuracaoIssImpl;
	}

	/**
	 * Obtém o campo planApuracaoEntrada
	 * 
	 * @return planApuracaoEntrada PlanApuracaoIssEntradaDTO
	 */
	public PlanApuracaoIssEntradaDTO getPlanApuracaoEntrada() {
		return planApuracaoEntrada;
	}

	/**
	 * Define o campo planApuracaoEntrada
	 * 
	 * @param planApuracaoEntrada
	 *            PlanApuracaoIssEntradaDTO
	 */
	public void setPlanApuracaoEntrada(PlanApuracaoIssEntradaDTO planApuracaoEntrada) {
		this.planApuracaoEntrada = planApuracaoEntrada;
	}

	/**
	 * Obtém o campo prosseguirHabilitado
	 * 
	 * @return prosseguirHabilitado String
	 */
	public String getProsseguirHabilitado() {
		return prosseguirHabilitado;
	}

	/**
	 * Define o campo prosseguirHabilitado
	 * 
	 * @param prosseguirHabilitado
	 *            String
	 */
	public void setProsseguirHabilitado(String prosseguirHabilitado) {
		this.prosseguirHabilitado = prosseguirHabilitado;
	}

	/**
	 * Obtém o campo consultarApuracaoParcialImpl
	 * 
	 * @return consultarApuracaoParcialImpl IConsultarapuracaoparcialService
	 */
	public IConsultarapuracaoparcialService getConsultarApuracaoParcialImpl() {
		return consultarApuracaoParcialImpl;
	}

	/**
	 * Define o campo consultarApuracaoParcialImpl
	 * 
	 * @param consultarApuracaoParcialImpl
	 *            IConsultarapuracaoparcialService
	 */
	public void setConsultarApuracaoParcialImpl(IConsultarapuracaoparcialService consultarApuracaoParcialImpl) {
		this.consultarApuracaoParcialImpl = consultarApuracaoParcialImpl;
	}

	/**
	 * Obtém o campo listaMunicipios
	 * 
	 * @return listaMunicipios List<ConsultarMunicipiosApuracaoParcialDTO>
	 */
	public List<ConsultarMunicipiosApuracaoParcialDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	/**
	 * Define o campo listaMunicipios
	 * 
	 * @param listaMunicipios
	 *            List<ConsultarMunicipiosApuracaoParcialDTO>
	 */
	public void setListaMunicipios(List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	/**
	 * Obtém o campo listaControleCheckRadio
	 * 
	 * @return listaControleCheckRadio List<SelectItem>
	 */
	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	/**
	 * Define o campo listaControleCheckRadio
	 * 
	 * @param listaControleCheckRadio
	 *            List<SelectItem>
	 */
	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	/**
	 * Obtém o campo carregaMunicipios
	 * 
	 * @return carregaMunicipios boolean
	 */
	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}

	/**
	 * Define o campo carregaMunicipios
	 * 
	 * @param carregaMunicipios
	 *            boolean
	 */
	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}

	/**
	 * Obtém o campo estadoNome
	 * 
	 * @return estadoNome String
	 */
	public String getEstadoNome() {
		return estadoNome;
	}

	/**
	 * Define o campo estadoNome
	 * 
	 * @param estadoNome
	 *            String
	 */
	public void setEstadoNome(String estadoNome) {
		this.estadoNome = estadoNome;
	}

	/**
	 * Obtém o campo listaSaidaPlanilha
	 * 
	 * @return listaSaidaPlanilha List<PlanApuracaoIssSaidaDTO>
	 */
	public List<PlanApuracaoIssSaidaListaDTO> getListaSaidaPlanilha() {
		return listaSaidaPlanilha;
	}

	/**
	 * Define o campo listaSaidaPlanilha
	 * 
	 * @param listaSaidaPlanilha
	 *            List<PlanApuracaoIssSaidaDTO>
	 */
	public void setListaSaidaPlanilha(List<PlanApuracaoIssSaidaListaDTO> listaSaidaPlanilha) {
		this.listaSaidaPlanilha = listaSaidaPlanilha;
	}

	/**
	 * Obtém o campo listaEstadoFiltro
	 * 
	 * @return listaEstadoFiltro List<SelectItem>
	 */
	public List<SelectItem> getListaEstadoFiltro() {
		return listaEstadoFiltro;
	}

	public Date getCompetenciaFiltro() {
		return competenciaFiltro;
	}

	public void setCompetenciaFiltro(Date competenciaFiltro) {
		this.competenciaFiltro = competenciaFiltro;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public List<SelectItem> getListaControlePesquisa() {
		return listaControlePesquisa;
	}

	public void setListaControlePesquisa(List<SelectItem> listaControlePesquisa) {
		this.listaControlePesquisa = listaControlePesquisa;
	}

	public List<MunicipioDTO> getListaPesquisa() {
		return listaPesquisa;
	}

	public void setListaPesquisa(List<MunicipioDTO> listaPesquisa) {
		this.listaPesquisa = listaPesquisa;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public Integer getRadioTelaPesquisar() {
		return radioTelaPesquisar;
	}

	public void setRadioTelaPesquisar(Integer radioTelaPesquisar) {
		this.radioTelaPesquisar = radioTelaPesquisar;
	}

	public void setListaEstadoFiltro(List<SelectItem> listaEstadoFiltro) {
		this.listaEstadoFiltro = listaEstadoFiltro;
	}

	public String getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(String estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public String getMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public void setMunicipioSelecionado(String municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public int getRadioTelaResultado() {
		return radioTelaResultado;
	}

	public void setRadioTelaResultado(int radioTelaResultado) {
		this.radioTelaResultado = radioTelaResultado;
	}

	public List<SelectItem> getListaControleResultado() {
		return listaControleResultado;
	}

	public void setListaControleResultado(List<SelectItem> listaControleResultado) {
		this.listaControleResultado = listaControleResultado;
	}

	public List<ApuracaoMensalDiferenciadaDTO> getListaResultado() {
		return listaResultado;
	}

	public void setListaResultado(List<ApuracaoMensalDiferenciadaDTO> listaResultado) {
		this.listaResultado = listaResultado;
	}

	public boolean isMostraBotoesResultado() {
		return mostraBotoesResultado;
	}

	public void setMostraBotoesResultado(boolean mostraBotoesResultado) {
		this.mostraBotoesResultado = mostraBotoesResultado;
	}

	public String getObrigatoriedade() {
		return obrigatoriedade;
	}

	public void setObrigatoriedade(String obrigatoriedade) {
		this.obrigatoriedade = obrigatoriedade;
	}

	public BigDecimal getTotalMunicipiolIss() {
		return totalMunicipiolIss;
	}

	public void setTotalMunicipiolIss(BigDecimal totalMunicipiolIss) {
		this.totalMunicipiolIss = totalMunicipiolIss;
	}

	public BigDecimal getTotalMunicipioReceita() {
		return totalMunicipioReceita;
	}

	public void setTotalMunicipioReceita(BigDecimal totalMunicipioReceita) {
		this.totalMunicipioReceita = totalMunicipioReceita;
	}

	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public Integer[] getItemApuracaoSelecionado() {
		return itemApuracaoSelecionado;
	}

	public void setItemApuracaoSelecionado(Integer[] itemApuracaoSelecionado) {
		this.itemApuracaoSelecionado = itemApuracaoSelecionado;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
	}

	public IListarEmpresaService getListarEmpresaServiceImpl() {
		return listarEmpresaServiceImpl;
	}

	public void setListarEmpresaServiceImpl(IListarEmpresaService listarEmpresaServiceImpl) {
		this.listarEmpresaServiceImpl = listarEmpresaServiceImpl;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
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

	public Integer getCodDepFiltro() {
		return codDepFiltro;
	}

	public void setCodDepFiltro(Integer codDepFiltro) {
		this.codDepFiltro = codDepFiltro;
	}

	public boolean isMostrarCabecalho() {
		return mostrarCabecalho;
	}

	public void setMostrarCabecalho(boolean mostrarCabecalho) {
		this.mostrarCabecalho = mostrarCabecalho;
	}

	public boolean isCheckTodosIncluir() {
		return checkTodosIncluir;
	}

	public void setCheckTodosIncluir(boolean checkTodosIncluir) {
		this.checkTodosIncluir = checkTodosIncluir;
	}

	/**
	 * @return the totalAgencia
	 */
	public Long getTotalAgencia() {
		return totalAgencia;
	}

	/**
	 * @param totalAgencia the totalAgencia to set
	 */
	public void setTotalAgencia(Long totalAgencia) {
		this.totalAgencia = totalAgencia;
	}

	/**
	 * @return the totalPa
	 */
	public Long getTotalPa() {
		return totalPa;
	}

	/**
	 * @param totalPa the totalPa to set
	 */
	public void setTotalPa(Long totalPa) {
		this.totalPa = totalPa;
	}

	/**
	 * @return the checkAberturaConta
	 */
	public boolean isCheckAberturaConta() {
		return checkAberturaConta;
	}

	/**
	 * @param checkAberturaConta the checkAberturaConta to set
	 */
	public void setCheckAberturaConta(boolean checkAberturaConta) {
		this.checkAberturaConta = checkAberturaConta;
	}

	/**
	 * @return the codMunicipioSelecionado
	 */
	public Long getCodMunicipioSelecionado() {
		return codMunicipioSelecionado;
	}

	/**
	 * @param codMunicipioSelecionado the codMunicipioSelecionado to set
	 */
	public void setCodMunicipioSelecionado(Long codMunicipioSelecionado) {
		this.codMunicipioSelecionado = codMunicipioSelecionado;
	}

}
