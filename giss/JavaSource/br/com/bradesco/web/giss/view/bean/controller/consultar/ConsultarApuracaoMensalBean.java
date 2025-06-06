package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import net.sf.jasperreports.engine.JRException;
import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoDetalhamentoDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoDetalhamentoDependencia;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.ApuracaoMensalTotalizadaSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalEntradaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.OcorrenciaApuracaoMensalTotalizadaSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.OcorrenciaDependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaomensal.bean.ConsultaApuracaoMensalDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * Back Bean da tela de Apuracao Mensal de ISS
 * 
 * @author Renato Mariscal
 * 
 */
public class ConsultarApuracaoMensalBean extends FiltroGenericoGISSBean {

	private static final long serialVersionUID = 1L;
	private String mesCompetenciaFiltro;
	private String anoCompetenciaFiltro;
	private Integer dependencia;
	private String descricao;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;
	private String solicitacao;
	private String dataSolicitacao;
	private String dataProcessamento;

	private Date competenciaFiltro;
	public String testeEstado;

	private String totalMunicipioReceita;
	private String totaMunicipiolIss;

	private String totalReceitaGeral;
	private String totalIssGeral;

	private List<ConsultaApuracaoMensalDTO> listaGridResultado;
	private List<SelectItem> listaControleCheckbox = new ArrayList<SelectItem>();
	private boolean disabledRadio;
	private int codListaResultado;

	private MunicipioDTO municipioSelecionado;
	private String estadoSelecionado;
	private List<MunicipioDTO> listaMunicipios;
	private List<SelectItem> listaMunicipiosRadio = new ArrayList<SelectItem>();
	private BigDecimal totalMovimento;
	private BigDecimal totalTributavel;
	private BigDecimal totalISS;

	private boolean mostraLista = false;

	private DependenciaApuracaoMensalEntradaDTO filtroApuracaoDependencia = new DependenciaApuracaoMensalEntradaDTO();
	private DependenciaApuracaoMensalSaidaDTO dependenciaApuracaoMensal = new DependenciaApuracaoMensalSaidaDTO();
	private List<SelectItem> listaApuracaoCheckbox = new ArrayList<SelectItem>();

	private ApuracaoMensalTotalizadaSaidaDTO apuracaoMensalTotalizada = new ApuracaoMensalTotalizadaSaidaDTO();

	private List<ApuracaoDetalhamentoDependencia> lstDetalDependencias = new ArrayList<ApuracaoDetalhamentoDependencia>();
	
	private ApuracaoDetalhamentoDependencia detalDependencias = new ApuracaoDetalhamentoDependencia();
	
	private Integer[] itemSelecionadoDependencia;

	private Integer[] itemSelecionadoDetalhe;
	private List<SelectItem> listaCheckBoxDetalhe = new ArrayList<SelectItem>();
	
	private IApuracaoMensalService apuracaoMensalServiceImpl = null;
	
	private Integer radioTelaConta;

	/**
	 * Chamado pelo Menu, inicializa os componentes necessarios na tela
	 * 
	 * @return
	 */
	public String iniciarPagina() {
		super.inicializaFiltroGenerico();
		itemSelecionadoDependencia = null;
		setMesCompetenciaFiltro("");
		setAnoCompetenciaFiltro("");

		setMostraLista(false);

		setCompetenciaFiltro(new Date());

		setFiltroApuracaoDependencia(new DependenciaApuracaoMensalEntradaDTO());
		setDependenciaApuracaoMensal(new DependenciaApuracaoMensalSaidaDTO());
		setListaApuracaoCheckbox(new ArrayList<SelectItem>());

		setListaMunicipios(new ArrayList<MunicipioDTO>());
		setListaMunicipiosRadio(new ArrayList<SelectItem>());
		return "consultarApuracaoMensal";
	}
	
	public void popularCheckbox(){
		for (int i = 0; i < this.dependenciaApuracaoMensal.getApuracoes().size(); i++) {
			this.listaControleCheckbox.add(new SelectItem(i,""));
		}
	}
	
	public String carregaLista() {
		try {
			if (filtroApuracaoDependencia.getMesApuracaoContabil() == null || filtroApuracaoDependencia.getAnoApuracaoContabil() == null) {
				BradescoFacesUtils.addInfoModalMessage("Digite a competência.", false);
				return null;
			}
	
			if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					filtroApuracaoDependencia.setCodigoPessoaJuridica(0L);
					filtroApuracaoDependencia.setCodigoDependencia(0);
					buscaMunicipioManter();
					estadoSelecionado = GissUtil.procuraUnidadeFederativaSemCodigo(listaEstados, estadoFiltro);
					filtroApuracaoDependencia.setCodigoMunicipio(buscaMunicipio.getCodigo().toString());
					if (municipioSelecionado == null)
						municipioSelecionado = new MunicipioDTO();
					municipioSelecionado.setNome(buscaMunicipio.getDescricao());
					setDependenciaApuracaoMensal(getApuracaoMensalServiceImpl().listarDependenciaApuracaoMensal(filtroApuracaoDependencia));
	//				setListaApuracaoCheckbox();
					popularCheckbox();
					setItemSelecionadoDependencia(null);
					setMostraLista(false);
					listaMunicipios = null;
					return "resultadoApuracaoMensal";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
				}
			} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					buscaMunicipioManter();
					return "";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
				}
			} else if (estadoFiltro != null && !estadoFiltro.equals("")) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					setListaMunicipios(getDependenciaImpl().listarMunicipios(getEstadoFiltro()));
					carregaListaRadio();
					setMostraLista(true);
					return "";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
				}
			} else if (codDepFiltro != null && codDepFiltro != 0) {
				filtroApuracaoDependencia.setCodigoMunicipio("0");
				filtroApuracaoDependencia.setCodigoDependencia(codDepFiltro);
				filtroApuracaoDependencia.setCodigoPessoaJuridica(codDepFiltro!=null&&codDepFiltro!=0?indiceComboEmpresaFiltro!=null&&!indiceComboEmpresaFiltro.equals("")?Long.valueOf(indiceComboEmpresaFiltro):0L:0L);
				setDependenciaApuracaoMensal(getApuracaoMensalServiceImpl().listarDependenciaApuracaoMensal(filtroApuracaoDependencia));
	//			setListaApuracaoCheckbox();
				popularCheckbox();
				setItemSelecionadoDependencia(null);
				estadoSelecionado = getDependenciaApuracaoMensal().getDescUF();
				if(municipioSelecionado==null)municipioSelecionado=new MunicipioDTO();
				municipioSelecionado.setNome(getDependenciaApuracaoMensal().getDescMunicipio());
				filtroApuracaoDependencia.setCodigoMunicipio(getDependenciaApuracaoMensal().getCodigoMunicipio().toString());
				setMostraLista(false);
				listaMunicipios = null;
				return "resultadoApuracaoMensal";
			} else
				BradescoFacesUtils.addInfoModalMessage("Preencher um dos argumentos: Estado, Município ou Dependência!", false);
		} catch(Exception ex) {
			BradescoFacesUtils.addInfoModalMessage(ex.getMessage(), false);
			return "";
		}
		return "";
	}

	private void carregaListaRadio() {
		List<SelectItem> listaRadio = new ArrayList<SelectItem>();
		for (MunicipioDTO municipioDTO : getListaMunicipios()) {
			listaRadio.add(new SelectItem(municipioDTO.getCodigo(), ""));
		}
		setListaMunicipiosRadio(listaRadio);
	}

	public String avancarResultado() {
		MunicipioDTO municipioDTO = new MunicipioDTO();
		municipioDTO.setCodigo(filtroApuracaoDependencia.getCodigoMunicipio());

		int indexMunicipio = getListaMunicipios().indexOf(municipioDTO);
		if (indexMunicipio < 0) {
			throw new BradescoViewException("Item selecionado não encontrado!", "");
		}

		if (filtroApuracaoDependencia.getMesApuracaoContabil() == null || filtroApuracaoDependencia.getAnoApuracaoContabil() == null) {
			BradescoFacesUtils.addInfoModalMessage("Digite a competência.", false);
			return null;
		}

		municipioDTO = getListaMunicipios().get(indexMunicipio);

		setMunicipioSelecionado(municipioDTO);

		setEstadoSelecionado(obterDescricaoEstado(getEstadoFiltro()));

		setDependenciaApuracaoMensal(getApuracaoMensalServiceImpl().listarDependenciaApuracaoMensal(filtroApuracaoDependencia));
//		setListaApuracaoCheckbox();
		popularCheckbox();
		setItemSelecionadoDependencia(null);

		return "resultadoApuracaoMensal";
	}


	private void popularLista(){
		
		getLstDetalDependencias().clear();
		
		ApuracaoDetalhamentoDependencia apuracaoDetalhamento;
		for(Integer check : itemSelecionadoDependencia){
			apuracaoDetalhamento = new ApuracaoDetalhamentoDependencia();
			
			apuracaoDetalhamento.setDependencia(getDependenciaApuracaoMensal().getApuracoes().get(check).getCodDepPa());
			apuracaoDetalhamento.setMesCompetenciaFiltro(getFiltroApuracaoDependencia().getMesApuracaoContabil() + "/" + String.valueOf(getFiltroApuracaoDependencia().getAnoApuracaoContabil()));
			apuracaoDetalhamento.setDescricao(getDependenciaApuracaoMensal().getApuracoes().get(check).getDescDepPa());
			
			ApuracaoMensalTotalizadaEntradaDTO entrada = new ApuracaoMensalTotalizadaEntradaDTO();
			
			entrada.setCodigoMunicipio(getFiltroApuracaoDependencia().getCodigoMunicipioLong());
			entrada.setCodigoPessoaJuridica(getDependenciaApuracaoMensal().getApuracoes().get(check).getCodigoPessoaJuridica());
			entrada.setDataApuracao(getFiltroApuracaoDependencia().getMesAnoApuracaoContabil());
			entrada.setNumeroSequenciaUnidadeOrganizacional(getDependenciaApuracaoMensal().getApuracoes().get(check).getNumeroSequenciaUnidadeOrganizacional());
			
			setApuracaoMensalTotalizada(getApuracaoMensalServiceImpl().listarApuracaoMensalTotalizada(entrada));
			
			if(getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada().size() > 0){
			    int grupo = getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada().get(0).getCodigoGrupo();
			    int subGrupo = getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada().get(0).getCodigoSubGrupo();

			    if(grupo <= 0 || subGrupo <= 0){
			        apuracaoDetalhamento.setRazaoExiste(false);
			    } else {
			        apuracaoDetalhamento.setRazaoExiste(true);
			    }
			}
			
			BigDecimal totMov = BigDecimal.ZERO;
			BigDecimal totIss = BigDecimal.ZERO;
			BigDecimal totTrib = BigDecimal.ZERO;
			if (getApuracaoMensalTotalizada() != null) {
				totMov = getApuracaoMensalTotalizada().getTotalReceita();
				totIss = getApuracaoMensalTotalizada().getTotalTributoApuracao();
				totTrib = getApuracaoMensalTotalizada().getTotalReceitaTributo();
			}
			apuracaoDetalhamento.setTotalMovimento(totMov);
			apuracaoDetalhamento.setTotalISS(totIss);
			apuracaoDetalhamento.setTotalTributavel(totTrib);
			
			apuracaoDetalhamento.setBaseCalculo(String.valueOf(getApuracaoMensalTotalizada().getPercentualBaseCalculoTributo()).replace(".", ",") + " % ");
			apuracaoDetalhamento.setAliquotaPadrao(String.valueOf(getApuracaoMensalTotalizada().getPercentualAliquotaPadraoMunicipio()).replace(".", ",") + " % ");
			apuracaoDetalhamento.setTipoIncidencia(getApuracaoMensalTotalizada().getTipoIncidencia());
			
			apuracaoDetalhamento.setListaApuracaoMensalTotalizada(getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada());
			
			apuracaoDetalhamento.setListaControleCheckRadioConta(new ArrayList<SelectItem>());
			for (int i = 0; i < getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada().size(); i++) {
				apuracaoDetalhamento.getListaControleCheckRadioConta().add(new SelectItem( i, ""));
			}
			
			
			
			getLstDetalDependencias().add(apuracaoDetalhamento);
			
		}
		
	}
	private void popularListaConta(){
		Integer itemSelecionado = radioTelaConta;
		ApuracaoDetalhamentoDependencia apuracaoDetalhamento;
		for(Integer check : itemSelecionadoDependencia){
			apuracaoDetalhamento = new ApuracaoDetalhamentoDependencia();
			
			apuracaoDetalhamento.setDependencia(getDependenciaApuracaoMensal().getApuracoes().get(check).getCodDepPa());
			apuracaoDetalhamento.setMesCompetenciaFiltro(getFiltroApuracaoDependencia().getMesApuracaoContabil() + "/" + String.valueOf(getFiltroApuracaoDependencia().getAnoApuracaoContabil()));
			apuracaoDetalhamento.setDescricao(getDependenciaApuracaoMensal().getApuracoes().get(check).getDescDepPa());
			
			ApuracaoMensalTotalizadaEntradaDTO entrada = new ApuracaoMensalTotalizadaEntradaDTO();
			
			entrada.setCodigoMunicipio(getFiltroApuracaoDependencia().getCodigoMunicipioLong());
			entrada.setCodigoPessoaJuridica(getDependenciaApuracaoMensal().getApuracoes().get(check).getCodigoPessoaJuridica());
			entrada.setDataApuracao(getFiltroApuracaoDependencia().getMesAnoApuracaoContabil());
			entrada.setNumeroSequenciaUnidadeOrganizacional(getDependenciaApuracaoMensal().getApuracoes().get(check).getNumeroSequenciaUnidadeOrganizacional());
			entrada.setRazao(lstDetalDependencias.get(itemSelecionadoDetalhe[0]).getListaApuracaoMensalTotalizada().get(itemSelecionado).getRazao());
			entrada.setCosif(lstDetalDependencias.get(itemSelecionadoDetalhe[0]).getListaApuracaoMensalTotalizada().get(itemSelecionado).getCosif());
			setApuracaoMensalTotalizada(getApuracaoMensalServiceImpl().listarApuracaoMensalTotalizadaConta(entrada));
			
			
			BigDecimal totMov = BigDecimal.ZERO;
			BigDecimal totIss = BigDecimal.ZERO;
			BigDecimal totTrib = BigDecimal.ZERO;
			if (getApuracaoMensalTotalizada() != null) {
				totMov = getApuracaoMensalTotalizada().getTotalReceita();
				totIss = getApuracaoMensalTotalizada().getTotalTributoApuracao();
				totTrib = getApuracaoMensalTotalizada().getTotalReceitaTributo();
			}
			apuracaoDetalhamento.setTotalMovimento(totMov);
			apuracaoDetalhamento.setTotalISS(totIss);
			apuracaoDetalhamento.setTotalTributavel(totTrib);
			
			apuracaoDetalhamento.setBaseCalculo(String.valueOf(getApuracaoMensalTotalizada().getPercentualBaseCalculoTributo()).replace(".", ",") + " % ");
			apuracaoDetalhamento.setAliquotaPadrao(String.valueOf(getApuracaoMensalTotalizada().getPercentualAliquotaPadraoMunicipio()).replace(".", ",") + " % ");
			apuracaoDetalhamento.setTipoIncidencia(getApuracaoMensalTotalizada().getTipoIncidencia());
			
			apuracaoDetalhamento.setListaApuracaoMensalTotalizada(getApuracaoMensalTotalizada().getListaApuracaoMensalTotalizada());
			
			GissUtil.copiarPropriedadesNaoNulas(apuracaoDetalhamento, detalDependencias);
		}
	}
	
	public String avancarDetalhar() {

		popularLista();
		this.itemSelecionadoDetalhe = null;
		listaCheckBoxDetalhe = new ArrayList<SelectItem>();
		for(int i = 0 ; i < getLstDetalDependencias().size() ; i++){
			listaCheckBoxDetalhe.add(new SelectItem(i, ""));
		}
		
		setSolicitacao("");
		setDataSolicitacao("");
		setDataProcessamento("");

		return "detalheDepenApuracaoMensal";
	}
	
	public String avancarDetalharConta() {
		String tela = "";
			if(itemSelecionadoDetalhe.length == 1){
				if(radioTelaConta != null){
					popularListaConta();
					setSolicitacao("");
					setDataSolicitacao("");
					setDataProcessamento("");
					tela = "detalheDepenApuracaoMensalConta";
				}else{
					radioTelaConta = null;
					BradescoFacesUtils.addInfoModalMessage("Favor selecionar o checkbox referente ao item da lista selecionada.", false);
				}
			}else{
				radioTelaConta = null;
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar somente um checkbox.", false);
			}
		return tela;
	}

	private String obterDescricaoEstado(String codEstado) {
		if (codEstado != null && !codEstado.trim().equals("") && getListaEstados() != null) {
			for (SelectItem item : getListaEstados()) {
				if (item.getValue().equals(codEstado)) {
					return item.getLabel();
				}
			}
		}
		return "";
	}

	public boolean getProsseguirHabilitado() {
		return (getFiltroApuracaoDependencia() != null && getFiltroApuracaoDependencia().getCodigoMunicipio() != null && getFiltroApuracaoDependencia().getMesApuracaoContabil() != null && getFiltroApuracaoDependencia().getAnoApuracaoContabil() != null);
	}

	public String paginar(ActionEvent actionEvent) {
		if (getEstadoFiltro() != null && !getEstadoFiltro().trim().equals("")) {
			setListaMunicipios(getDependenciaImpl().listarMunicipios(getEstadoFiltro()));
			carregaListaRadio();
		}

		return null;
	}

	public String paginarResultado(ActionEvent actionEvent) {
		setDependenciaApuracaoMensal(getApuracaoMensalServiceImpl().listarDependenciaApuracaoMensal(getFiltroApuracaoDependencia()));
//		setListaApuracaoCheckbox();
		popularCheckbox();
		return null;
	}

	public void imprimirPlanilha(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Apuração Mensal", "APURACAO_MENSAL");
		try {
			exportarPlanilha.apuracoesMensais(dependenciaApuracaoMensal);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	public void imprimirApuracaoMensal(ActionEvent ae){
		
		List<OcorrenciaDependenciaApuracaoMensalSaidaDTO> lstApuracoes = new ArrayList<OcorrenciaDependenciaApuracaoMensalSaidaDTO>();
		for(Integer chk : itemSelecionadoDependencia){
			lstApuracoes.add(getDependenciaApuracaoMensal().getApuracoes().get(chk));
		}
		
		try {
			Map ht = new HashMap();
			
			ht.put("TOTAL_DEPENDENCIAS", dependenciaApuracaoMensal.getQtdeAgencia());
			ht.put("TOTAL_PA", dependenciaApuracaoMensal.getQtdePa());
			ht.put("TOTAL_AGENCIA_RECEITA", dependenciaApuracaoMensal.getTotalAgenciaReceitaValor());
			ht.put("TOTAL_AGENCIA_ISS", dependenciaApuracaoMensal.getTotalAgenciaRecolherValor());
			ht.put("TOTAL_PA_RECEITA", dependenciaApuracaoMensal.getTotalPaReceitaValor());
			ht.put("TOTAL_PA_ISS", dependenciaApuracaoMensal.getTotalPaRecolherValor());
			ht.put("TOTAL _MUNICIPIO_RECEITA", dependenciaApuracaoMensal.getTotalMunucipioReceitaValor());
			ht.put("TOTAL_MUNICIPIO_ISS", dependenciaApuracaoMensal.getTotalMunucipioRecolherValor());
			ht.put("TOTAL_GERAL_RECEITA", dependenciaApuracaoMensal.getTotalGeralReceitaValor());
			ht.put("TOTAL_GERAL_ISS", dependenciaApuracaoMensal.getTotalGeralRecolherValor());
			
			GissUtil.gerarPDF("apuracaoMensal","APURACOES_MENSAIS", lstApuracoes,ht);
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	public void imprimir(ActionEvent ae){
		
		popularLista();
		List<ApuracaoDetalhamentoDependencia> lstDetalhamento = new ArrayList<ApuracaoDetalhamentoDependencia>();
		for(Integer chk : itemSelecionadoDetalhe){
			for(int i = 0 ; i < getLstDetalDependencias().size() ; i++){
				if(i == chk){
					lstDetalhamento.add(getLstDetalDependencias().get(chk));
				}
			}
		}
		
		for(ApuracaoDetalhamentoDependencia apuracao : lstDetalhamento){
			for(OcorrenciaApuracaoMensalTotalizadaSaidaDTO apuracaoMensal : apuracao.getListaApuracaoMensalTotalizada()){
				apuracaoMensal.setRazaoExiste(apuracao.getRazaoExiste());
			}
		}
		
		setLstDetalDependencias(lstDetalhamento);
		
		List<ApuracaoDetalhamentoDTO> lstApuracaoDetalh = new ArrayList<ApuracaoDetalhamentoDTO>();
		for(int i = 0 ; i < getLstDetalDependencias().size() ; i++){
			ApuracaoDetalhamentoDTO rm = new ApuracaoDetalhamentoDTO();
			List<ApuracaoDetalhamentoDependencia> lstAd = new ArrayList<ApuracaoDetalhamentoDependencia>();
			lstAd.add(getLstDetalDependencias().get(i));
			rm.setLstDetalDependencias(lstAd);
			lstApuracaoDetalh.add(rm);
		}
		
		
		try {
			GissUtil.gerarPDF("consultaApuracaoMensal", "APURACOES_MENSAIS_DETAL" , lstApuracaoDetalh, null);
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
		
	}
	
	public void imprimirConta(ActionEvent ae){
		
		List<ApuracaoDetalhamentoDependencia> lstDetalhamento = new ArrayList<ApuracaoDetalhamentoDependencia>();
		lstDetalhamento.add(detalDependencias);
		
		for(ApuracaoDetalhamentoDependencia apuracao : lstDetalhamento){
			for(OcorrenciaApuracaoMensalTotalizadaSaidaDTO apuracaoMensal : apuracao.getListaApuracaoMensalTotalizada()){
				apuracaoMensal.setRazaoExiste(apuracao.getRazaoExiste());
			}
		}
		
		setLstDetalDependencias(lstDetalhamento);
		
		List<ApuracaoDetalhamentoDTO> lstApuracaoDetalh = new ArrayList<ApuracaoDetalhamentoDTO>();
		for(int i = 0 ; i < getLstDetalDependencias().size() ; i++){
			ApuracaoDetalhamentoDTO rm = new ApuracaoDetalhamentoDTO();
			List<ApuracaoDetalhamentoDependencia> lstAd = new ArrayList<ApuracaoDetalhamentoDependencia>();
			lstAd.add(getLstDetalDependencias().get(i));
			rm.setLstDetalDependencias(lstAd);
			lstApuracaoDetalh.add(rm);
		}
		
		
		try {
			GissUtil.gerarPDF("consultaApuracaoMensalConta", "APURACOES_MENSAIS_DETAL_CONTA" , lstApuracaoDetalh, null);
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
		
	}
	
	/* Getters e Setters */

	public String getTotalIssGeral() {
		return totalIssGeral;
	}

	public void setTotalIssGeral(String totalIssGeral) {
		this.totalIssGeral = totalIssGeral;
	}

	public String getTotalReceitaGeral() {
		return totalReceitaGeral;
	}

	public void setTotalReceitaGeral(String totalReceitaGeral) {
		this.totalReceitaGeral = totalReceitaGeral;
	}

	public String getTotalMunicipioReceita() {
		return totalMunicipioReceita;
	}

	public void setTotalMunicipioReceita(String totalMunicipioReceita) {
		this.totalMunicipioReceita = totalMunicipioReceita;
	}

	public String getTotaMunicipiolIss() {
		return totaMunicipiolIss;
	}

	public void setTotaMunicipiolIss(String totaMunicipiolIss) {
		this.totaMunicipiolIss = totaMunicipiolIss;
	}

	public Date getCompetenciaFiltro() {
		return competenciaFiltro;
	}

	public void setCompetenciaFiltro(Date competenciaFiltro) {
		this.competenciaFiltro = competenciaFiltro;
	}

	public String getTesteEstado() {
		return testeEstado;
	}

	public void setTesteEstado(String testeEstado) {
		this.testeEstado = testeEstado;
	}

	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public String getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public String getAnoCompetenciaFiltro() {
		return anoCompetenciaFiltro;
	}

	public void setAnoCompetenciaFiltro(String anoCompetenciaFiltro) {
		this.anoCompetenciaFiltro = anoCompetenciaFiltro;
	}

	public String getMesCompetenciaFiltro() {
		return mesCompetenciaFiltro;
	}

	public void setMesCompetenciaFiltro(String mesCompetenciaFiltro) {
		this.mesCompetenciaFiltro = mesCompetenciaFiltro;
	}

	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public String getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Integer getDependencia() {
		return dependencia;
	}

	public void setDependencia(Integer dependencia) {
		this.dependencia = dependencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public List<MunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public String pesquisar() {
		return "SUCESSO";
	}

	public String voltarConsultar() {
//		carregaLista();
		filtroApuracaoDependencia.setCodigoMunicipio(null);
		return "consultarApuracaoMensal";
	}

	public String voltarResultado() {
		lstDetalDependencias.clear();
		Arrays.fill(itemSelecionadoDependencia, null);
		popularCheckbox();
		setItemSelecionadoDependencia(null);
		return "resultadoApuracaoMensal";
	}
	
	public String voltarConta() {
		return "detalheDepenApuracaoMensal";
	}

	public void setListaMunicipios(List<MunicipioDTO> listaMunicipio) {

		this.listaMunicipios = listaMunicipio;
	}

	public List<SelectItem> getListaControleCheckbox() {
		return listaControleCheckbox;
	}

	public void getListaControleCheckbox(List<SelectItem> listaControleRadio) {
		this.listaControleCheckbox = listaControleRadio;
	}

	public List<ConsultaApuracaoMensalDTO> getListaGridResultado() {
		return listaGridResultado;
	}

	public void setListaGridResultado(List<ConsultaApuracaoMensalDTO> listaGridResultado) {
		this.listaGridResultado = listaGridResultado;
	}

	public void habilitarRadio(ActionEvent e) {
		setDisabledRadio(false);
	}

	public boolean getDisabledRadio() {
		return disabledRadio;
	}

	public void setDisabledRadio(boolean disabledRadio) {
		this.disabledRadio = disabledRadio;
	}

	public int getCodListaResultado() {
		return codListaResultado;
	}

	public void setCodListaResultado(int codListaResultado) {
		this.codListaResultado = codListaResultado;
	}

	public String getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(String estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public MunicipioDTO getMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public void setMunicipioSelecionado(MunicipioDTO municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	public DependenciaApuracaoMensalEntradaDTO getFiltroApuracaoDependencia() {
		return filtroApuracaoDependencia;
	}

	public void setFiltroApuracaoDependencia(DependenciaApuracaoMensalEntradaDTO filtroApuracaoDependencia) {
		this.filtroApuracaoDependencia = filtroApuracaoDependencia;
	}

	public DependenciaApuracaoMensalSaidaDTO getDependenciaApuracaoMensal() {
		return dependenciaApuracaoMensal;
	}

	public void setDependenciaApuracaoMensal(DependenciaApuracaoMensalSaidaDTO dependenciaApuracaoMensal) {
		this.dependenciaApuracaoMensal = dependenciaApuracaoMensal;
	}

	public Integer[] getItemSelecionadoDependencia() {
		return itemSelecionadoDependencia;
	}

	public void setItemSelecionadoDependencia(Integer[] itemSelecionadoDependencia) {
		this.itemSelecionadoDependencia = itemSelecionadoDependencia;
	}

	public boolean isMostraLista() {
		return mostraLista;
	}

	public void setMostraLista(boolean mostraLista) {
		this.mostraLista = mostraLista;
	}

	public ApuracaoMensalTotalizadaSaidaDTO getApuracaoMensalTotalizada() {
		return apuracaoMensalTotalizada;
	}

	public void setApuracaoMensalTotalizada(ApuracaoMensalTotalizadaSaidaDTO apuracaoMensalTotalizada) {
		this.apuracaoMensalTotalizada = apuracaoMensalTotalizada;
	}

	public BigDecimal getTotalISS() {
		return totalISS;
	}

	public void setTotalISS(BigDecimal totalISS) {
		this.totalISS = totalISS;
	}

	public BigDecimal getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(BigDecimal totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public BigDecimal getTotalTributavel() {
		return totalTributavel;
	}

	public void setTotalTributavel(BigDecimal totalTributavel) {
		this.totalTributavel = totalTributavel;
	}

	public List<SelectItem> getListaMunicipiosRadio() {
		return listaMunicipiosRadio;
	}

	public void setListaMunicipiosRadio(List<SelectItem> listaMunicipiosRadio) {
		this.listaMunicipiosRadio = listaMunicipiosRadio;
	}

	public List<SelectItem> getListaApuracaoCheckbox2() {
		return listaApuracaoCheckbox;
	}

	public void setListaApuracaoCheckbox(List<SelectItem> listaApuracaoCheckbox) {
		this.listaApuracaoCheckbox = listaApuracaoCheckbox;
	}

	public List<ApuracaoDetalhamentoDependencia> getLstDetalDependencias() {
		return lstDetalDependencias;
	}

	public void setLstDetalDependencias(
			List<ApuracaoDetalhamentoDependencia> lstDetalDependencias) {
		this.lstDetalDependencias = lstDetalDependencias;
	}

	public Integer[] getItemSelecionadoDetalhe() {
		return itemSelecionadoDetalhe;
	}

	public void setItemSelecionadoDetalhe(Integer[] itemSelecionadoDetalhe) {
		this.itemSelecionadoDetalhe = itemSelecionadoDetalhe;
	}

	public List<SelectItem> getListaCheckBoxDetalhe() {
		return listaCheckBoxDetalhe;
	}

	public void setListaCheckBoxDetalhe(List<SelectItem> listaCheckBoxDetalhe) {
		this.listaCheckBoxDetalhe = listaCheckBoxDetalhe;
	}

	/**
	 * @return the radioTelaConta
	 */
	public Integer getRadioTelaConta() {
		return radioTelaConta;
	}

	/**
	 * @param radioTelaConta the radioTelaConta to set
	 */
	public void setRadioTelaConta(Integer radioTelaConta) {
		this.radioTelaConta = radioTelaConta;
	}

	/**
	 * @return the detalDependencias
	 */
	public ApuracaoDetalhamentoDependencia getDetalDependencias() {
		return detalDependencias;
	}

	/**
	 * @param detalDependencias the detalDependencias to set
	 */
	public void setDetalDependencias(ApuracaoDetalhamentoDependencia detalDependencias) {
		this.detalDependencias = detalDependencias;
	}

}
