package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.IConsultarApuracaoAliquotaZeradaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultaAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultarAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarMunicipiosAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.IConsultarapuracaoparcialService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoparcial.bean.ConsultarMunicipiosApuracaoParcialDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * Bean referente a tela Processamento > Consultar > Aliquota Zerada
 * 
 * @author renato.mariscal@brq.com
 * 
 */
public class ConsultarApuracaoAliquotaZeradaBean extends FiltroGenericoGISSBean {
	private static final long														serialVersionUID								= 1L;

	private static final Integer												MAX_OCORRENCIA_PRIMEIRA_LISTA		= 100;
	private static final Integer												MAX_OCORRENCIA_LISTA_RESULTADOS	= 100;
	private Long																				codMunicipio;
	private Double																			valorTotalReceita;
	private List<SelectItem>														listaEstado											= new ArrayList<SelectItem>();
	private List<SelectItem>														listaRadioAliquotaZerada				= new ArrayList<SelectItem>();
	private List<SelectItem>														listaRadioMunicipio							= new ArrayList<SelectItem>();
	private List<SelectItem>														listaControleCheckRadio;
	private List<ConsultarMunicipiosApuracaoParcialDTO>	listaMunicipios;
	private List<ConsultaAliquotaZeradaSaidaDTO>				listAliquotaZerada							= new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private ConsultaAliquotaZeradaSaidaDTO							vo															= new ConsultaAliquotaZeradaSaidaDTO();
	private List<ConsultarMunicipiosAposFechamentoDTO>	listaMunicipio									= new ArrayList<ConsultarMunicipiosAposFechamentoDTO>();
	private ConsultaAliquotaZeradaSaidaDTO							valoresTabela1									= new ConsultaAliquotaZeradaSaidaDTO();
	private List<ResultadoAliquotaZeradaSaidaDTO>				listResultados									= new ArrayList<ResultadoAliquotaZeradaSaidaDTO>();
	private ResultadoAliquotaZeradaSaidaDTO							resultadosDTO										= new ResultadoAliquotaZeradaSaidaDTO();
	private IConsultarapuracaoparcialService						consultarApuracaoParcialImpl;

	private Date																				competenciaFiltro;
	private String																			competenciaDetalhe;

	private String																			estado;
	private String																			municipio;

	private boolean																			mostraBotoes;
	private boolean																			mostraTabela;
	private boolean																			mostraBotoesResultado;
	private boolean																			carregaMunicipios;

	private boolean																			mostrarBotoesMunicipio;
	private IConsultarApuracaoAliquotaZeradaService			consultarApuracaoAliquotaZeradaImpl;
	private IConsultarApuracaoAposFechamentoService			consultarApuracaoAposFechamentoImpl;
	private String																			nomeMunicipio;
	private boolean																			mostraDependencias;

	private int																					radioAliquotaZerada;
	private String																			radioTelaConsultar;
	private int																					codRadioListaMunicipio;
	private String																			mesFiltro;
	private String																			anoFiltro;
	private String																			mesAte;
	private String																			anoAte;

	private BigDecimal																	totalGeral;
	private BigDecimal																	totalValor;

	private BigDecimal																	totalGeralResultado;
	private BigDecimal																	totalValorResultado;
	private int																					controleVoltar;

	private Boolean																			razaoExiste											= true;

	private List<ConsultaAliquotaZeradaSaidaDTO> lista1 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista2 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista3 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista4 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista5 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista6 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista7 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista8 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista9 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista10 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista11 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	private List<ConsultaAliquotaZeradaSaidaDTO> lista12 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
	
	private String competencia1;
	private String competencia2;
	private String competencia3;
	private String competencia4;
	private String competencia5;
	private String competencia6;
	private String competencia7;
	private String competencia8;
	private String competencia9;
	private String competencia10;
	private String competencia11;
	private String competencia12;
	
	
	private boolean competencia1Existe = false;
	private boolean competencia2Existe = false;
	private boolean competencia3Existe = false;
	private boolean competencia4Existe = false;
	private boolean competencia5Existe = false;
	private boolean competencia6Existe = false;
	private boolean competencia7Existe = false;
	private boolean competencia8Existe = false;
	private boolean competencia9Existe = false;
	private boolean competencia10Existe = false;
	private boolean competencia11Existe = false;
	private boolean competencia12Existe = false;

	private Long qtdeAgencia;

	private Long qtdePa;
	

	
	/**
	 * Chamada do Menu, inicializa os dados necessarios da pagina Limpa a sujeira dos campos
	 */
	public String iniciarPagina() {

		super.inicializaFiltroGenerico();
		listAliquotaZerada = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
		listaEstado = consultarApuracaoAposFechamentoImpl.listarComboEstados();
		setNomeMunicipio(null);
		setMesFiltro(null);
		setAnoFiltro(null);
		setAnoAte(null);
		setMesAte(null);
		competencia1Existe = false;
		competencia2Existe = false;
		competencia3Existe = false;
		competencia4Existe = false;
		competencia5Existe = false;
		competencia6Existe = false;
		competencia7Existe = false;
		competencia8Existe = false;
		competencia9Existe = false;
		competencia10Existe = false;
		competencia11Existe = false;
		competencia12Existe = false;
		
		competencia1 = "";
		competencia2 = "";
		competencia3 = "";
		competencia4 = "";
		competencia5 = "";
		competencia6 = "";
		competencia7 = "";
		competencia8 = "";
		competencia9 = "";
		competencia10 = "";
		competencia11 = "";
		competencia12 = "";
		
		lista1 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista2 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista3 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista4 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista5 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista6 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista7 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista8 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista9 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
		lista10 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
		lista11 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
		lista12 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
		
		carregaMunicipios = false;

		return "consultarApuracaoAliquotaZerada";
	}

	/**
	 * Carrega a lista de resultado
	 * 
	 * @return
	 */
	public String consultar() {

		try {
			valoresTabela1 = getListAliquotaZerada().get(radioAliquotaZerada);

			ConsultaAliquotaZeradaSaidaDTO dto = new ConsultaAliquotaZeradaSaidaDTO();
			dto = getListAliquotaZerada().get(radioAliquotaZerada);

			listResultados = getConsultarApuracaoAliquotaZeradaImpl().buscarResultadoAliquotaZerada(new ResultadoAliquotaZeradaEntradaDTO(MAX_OCORRENCIA_LISTA_RESULTADOS, dto.getCodPessoa(), dto.getNumeroSequencial(), Integer.parseInt(mesFiltro + anoFiltro), codMunicipio, Integer.parseInt(mesAte + anoAte),Integer.parseInt(dto.getDataApuracao().replace("/", ""))));

			if (listResultados.size() > 0) {
				if (listResultados.get(0).getCodigoGrupo() <= 0 || listResultados.get(0).getCodigoSubGrupo() <= 0) {
					razaoExiste = false;
				}
				else{
					razaoExiste = true;
				}
			}

			setMostraBotoesResultado(!listResultados.isEmpty());

			totalGeralResultado = listResultados.get(listResultados.size() - 1).getReceitaTotalGeralValor();
			totalValorResultado = listResultados.get(listResultados.size() - 1).getReceitaTotalValor();

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "erro", BradescoViewExceptionActionType.ACTION, false);
			return null;
		}

		return "resultadoApuracaoAliquotaZerada";
	}

	public String paginarConsulta(ActionEvent event) {

		prosseguir();
		setListAliquotaZerada(listAliquotaZerada);

		return "consultarApuracaoAliquotaZerada";
	}

	public String paginarResultado(ActionEvent event) {

		consultar();
		setListResultados(listResultados);

		return "resultadoApuracaoAliquotaZerada";
	}

	public String voltar() {

		return "consultarApuracaoAliquotaZerada";
	}

	public String voltar2() {

		return "consultarApuracaoAliquotaZeradaDependencia";
	}

	public String carregaLista(){

		try{
			
			if (getAnoFiltro().equals("") || getMesFiltro().equals("")) {
				if (getMesFiltro().equals("")) {
					BradescoFacesUtils.addInfoModalMessage("Digite o Mês inicial.", false);
					return null;
				}
				if (getAnoFiltro().equals("")) {
					BradescoFacesUtils.addInfoModalMessage("Digite o Ano inicial.", false);
					return null;
				}
			}
			
			if (getAnoAte().equals("") || getMesAte().equals("")) {
				if (getMesAte().equals("")) {
					BradescoFacesUtils.addInfoModalMessage("Digite o Mês final.", false);
					return null;
				}
				if (getAnoAte().equals("")) {
					BradescoFacesUtils.addInfoModalMessage("Digite o Ano final.", false);
					return null;
				}
			}
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        Date dtDe = formatter.parse("01/" + getMesFiltro() + "/" + getAnoFiltro());
	        Date dtAte = formatter.parse("01/" + getMesAte() + "/" + getAnoAte());
	        if(!GissUtil.verificarPeriodoDozeMesesSemDia(dtDe, dtAte)){
	            BradescoFacesUtils.addInfoModalMessage("O período deve ser menor ou igual a 12 meses", false);
	            return null;
	        }
	        
			if (buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					listaMunicipios = null;
					setCarregaMunicipios(false);
					radioTelaConsultar = null;
					buscaMunicipioManter();
					competenciaDetalhe = getMesFiltro() + "/" + getAnoFiltro();
					setEstado(GissUtil.procuraUnidadeFederativaSemCodigo(getListaEstados(), getEstadoFiltro()));
					setCodMunicipio(buscaMunicipio.getCodigo());
					setMunicipio(buscaMunicipio.getDescricao());
					try {
						vo = consultarApuracaoAliquotaZeradaImpl.buscarDependenciaAliquotaZerada(new ConsultarAliquotaZeradaEntradaDTO(MAX_OCORRENCIA_LISTA_RESULTADOS, Integer.parseInt(mesFiltro + anoFiltro), codMunicipio, GissUtil.notNull(codDepFiltro), codDepFiltro != null && codDepFiltro != 0 ? Long.valueOf(indiceComboEmpresaFiltro) : 0L, Integer.parseInt(mesAte + anoAte)));
						listAliquotaZerada = vo.getListaAliqZerada();
						
						separarListas(listAliquotaZerada);
						
						listaRadioAliquotaZerada = GissUtil.preencherSelectItemsMunicipio(listAliquotaZerada);
						totalValor = listAliquotaZerada.get(listAliquotaZerada.size() - 1).getReceitaTotalValor();
						totalGeral = listAliquotaZerada.get(listAliquotaZerada.size() - 1).getReceitaTotalGeralValor();
						qtdeAgencia = vo.getQtdeAgencia();
						qtdePa = vo.getQtdePa();
					} catch (PdcAdapterFunctionalException e) {
						BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "erro", BradescoViewExceptionActionType.ACTION, false);
						setListAliquotaZerada(new ArrayList<ConsultaAliquotaZeradaSaidaDTO>());
						return "";
					}
					controleVoltar = 1;
					return "consultarApuracaoAliquotaZeradaDependencia";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado e/ou Município OU Dependência!", false);
				}
			} else if (buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					buscaMunicipioManter();
					return "";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado e/ou Município OU Dependência!", false);
				}
			} else if (estadoFiltro != null && !estadoFiltro.equals("")) {
				if (codDepFiltro == null || codDepFiltro == 0) {
					pesquisaMunicipios();
					controleVoltar = 1;
					return "";
				} else {
					BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado, Município ou Dependência!", false);
				}
			} else if (codDepFiltro != null && codDepFiltro != 0) {
				listaMunicipios = null;
				setCarregaMunicipios(false);
				radioTelaConsultar = null;
				competenciaDetalhe = getMesFiltro() + "/" + getAnoFiltro();
				codMunicipio = 0l;
				String ret = prosseguir();

				//				setEstado(GissUtil.procuraUnidadeFederativaSemCodigo(getListaEstados(), vo.getCodUF()));
				//				setCodMunicipio(vo.getCodMunicipio().toString());
				//				setMunicipio(vo.getDescMunicipio());

				return ret;
			} else
				BradescoFacesUtils.addInfoModalMessage("Preencher pelo menos um dos argumentos: Estado e/ou Município OU Dependência!", false);
			//			BradescoFacesUtils.addInfoModalMessage("Preencher somente um dos argumentos: Estado e/ou Município OU Dependência!", false);
			
			
		}catch(Exception ex){
			BradescoFacesUtils.addInfoModalMessage(ex.getMessage(), false);
		}

		return "";
	}

	private void separarListas(List<ConsultaAliquotaZeradaSaidaDTO> listAliquotaZerada) {
	    competencia1Existe = false;
        competencia2Existe = false;
        competencia3Existe = false;
        competencia4Existe = false;
        competencia5Existe = false;
        competencia6Existe = false;
        competencia7Existe = false;
        competencia8Existe = false;
        competencia9Existe = false;
        competencia10Existe = false;
        competencia11Existe = false;
        competencia12Existe = false;
        
        competencia1 = "";
        competencia2 = "";
        competencia3 = "";
        competencia4 = "";
        competencia5 = "";
        competencia6 = "";
        competencia7 = "";
        competencia8 = "";
        competencia9 = "";
        competencia10 = "";
        competencia11 = "";
        competencia12 = "";
        
        lista1 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista2 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista3 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista4 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista5 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista6 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista7 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista8 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista9 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>(); 
        lista10 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
        lista11 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
        lista12 = new ArrayList<ConsultaAliquotaZeradaSaidaDTO>();
		
		for(ConsultaAliquotaZeradaSaidaDTO dto : listAliquotaZerada){
			if(dto.getDataApuracao().startsWith("01")){
				lista1.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia1 = dto.getDataApuracao();
				competencia1Existe = true;
			}
			else if(dto.getDataApuracao().startsWith("02")){
				lista2.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia2 = dto.getDataApuracao();
				competencia2Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("03")){
				lista3.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia3 = dto.getDataApuracao();
				competencia3Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("04")){
				lista4.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia4 = dto.getDataApuracao();
				competencia4Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("05")){
				lista5.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia5 = dto.getDataApuracao();
				competencia5Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("06")){
				lista6.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia6 = dto.getDataApuracao();
				competencia6Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("07")){
				lista7.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia7 = dto.getDataApuracao();
				competencia7Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("08")){
				lista8.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia8 = dto.getDataApuracao();
				competencia8Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("09")){
				lista9.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia9 = dto.getDataApuracao();
				competencia9Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("10")){
				lista10.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia10 = dto.getDataApuracao();
				competencia10Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("11")){
				lista11.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia11 = dto.getDataApuracao();
				competencia11Existe = true;
			
			}
			else if(dto.getDataApuracao().startsWith("12")){
				lista12.add(new ConsultaAliquotaZeradaSaidaDTO(dto.getReceitaTotalGeralValor(),
						dto.getNumConsultas(),
						dto.getCodPessoa(),
						dto.getNumeroSequencial(),
						dto.getDependencia(),
						dto.getDescricao(),
						dto.getReceitaValor(),
						dto.getReceitaTotalValor(),
						dto.getCodPa(), 
						dto.getDescPa(),
						dto.getCodDepPa(), 
						dto.getDescDepPa(),
						dto.getLinha()));
				
				competencia12 = dto.getDataApuracao();
				competencia12Existe = true;
			
			}
		}
	}

	/**
	 * Carrega a lista de municipios
	 * 
	 * @return
	 */
	public String carregaListaMunicipio() {

		try {

			if (!estadoFiltro.equals("0")) {

				listaMunicipio = getConsultarApuracaoAposFechamentoImpl().listarMunicipios(estadoFiltro);

				listaRadioMunicipio = new ArrayList<SelectItem>();
				for (int i = 0; i < getListaMunicipio().size(); i++) {
					listaRadioMunicipio.add(new SelectItem(i, " "));
				}
				if (getListaMunicipio().size() > 10) {
					setMostrarBotoesMunicipio(true);
				}

				return "listaMunicipiosAliquotaZerada";
			} else {
				BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "consultarApuracaoAliquotaZerada", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "erro", BradescoViewExceptionActionType.ACTION, false);

			return null;
		}
		return null;
	}

	public void pesquisaMunicipios() {

		if (getEstadoFiltro().equals("")) {
			BradescoFacesUtils.addInfoModalMessage("Selecione um estado.", "consultarApuracaoAliquotaZerada", BradescoViewExceptionActionType.ACTION, false);
			return;
		}
		try {
			listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(getEstadoFiltro());

			if (listaMunicipios != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i < listaMunicipios.size(); i++) {

					listaControleCheckRadio.add(new SelectItem(String.valueOf(i), " "));
				}

				setMostraBotoes(!listaMunicipios.isEmpty());
				setCarregaMunicipios(true);
			}
		} catch (PdcAdapterFunctionalException e) {
			setMostraBotoes(false);
			setCarregaMunicipios(false);
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "consultarApuracaoAliquotaZerada", BradescoViewExceptionActionType.ACTION, false);

		}
	}

	public void paginarMunicipio(ActionEvent evt) {

		listaMunicipios = consultarApuracaoParcialImpl.listarMunicipios(getEstadoFiltro());
	}

	public void paginarListaMunicipios(ActionEvent event) {

		carregaListaMunicipio();
	}

	public String voltarComValores() {

		nomeMunicipio = getListaMunicipio().get(codRadioListaMunicipio).getNome();
		codMunicipio = Long.valueOf(getListaMunicipio().get(codRadioListaMunicipio).getCodigo());

		return "consultarApuracaoAliquotaZerada";
	}

	/* CARREGAA A PRIMEIRA LISTA (DEPENDENCIA ALIQUOTA ZERADA) */
	public String prosseguir() {

		try {
		    if(getListaMunicipios() != null){
		        nomeMunicipio = getListaMunicipios().get(radioAliquotaZerada).getNome();
	            codMunicipio = Long.valueOf(getListaMunicipios().get(radioAliquotaZerada).getCodigo());
		    }
		    
//			Integer mes = "".equals(mesFiltro) ? 0 : Integer.valueOf(mesFiltro);
//			Integer ano = "".equals(anoFiltro) ? 0 : Integer.valueOf(anoFiltro);
//			Integer dtApuracao = mes + ano;

			vo = consultarApuracaoAliquotaZeradaImpl.buscarDependenciaAliquotaZerada(new ConsultarAliquotaZeradaEntradaDTO(MAX_OCORRENCIA_PRIMEIRA_LISTA, Integer.parseInt(mesFiltro + anoFiltro), codMunicipio, GissUtil.notNull(codDepFiltro), codDepFiltro != null && codDepFiltro != 0 ? Long.valueOf(indiceComboEmpresaFiltro) : 0L, Integer.parseInt(mesAte + anoAte)));
			listAliquotaZerada = vo.getListaAliqZerada();
			listaRadioAliquotaZerada = GissUtil.preencherSelectItemsMunicipio(listAliquotaZerada);
			separarListas(listAliquotaZerada);
			totalValor = listAliquotaZerada.get(listAliquotaZerada.size() - 1).getReceitaTotalValor();
			totalGeral = listAliquotaZerada.get(listAliquotaZerada.size() - 1).getReceitaTotalGeralValor();
			qtdeAgencia = vo.getQtdeAgencia();
			qtdePa = vo.getQtdePa();

			setEstado(vo.getDescUF());
			setCodMunicipio(vo.getCodMunicipio());
			setMunicipio(vo.getDescMunicipio());

			competenciaDetalhe = getMesFiltro() + "/" + getAnoFiltro();

		} catch (PdcAdapterFunctionalException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "consultarApuracaoAliquotaZerada", BradescoViewExceptionActionType.ACTION, false);
			setListAliquotaZerada(new ArrayList<ConsultaAliquotaZeradaSaidaDTO>());
			return "";
		}
		return "consultarApuracaoAliquotaZeradaDependencia";
	}

	public void imprimirPlanilhaAliquotas(ActionEvent ae){
		ConsultarApuracaoAliquotaPlanilhaDTO consultarPlanilhaDTO = new ConsultarApuracaoAliquotaPlanilhaDTO();
		consultarPlanilhaDTO.setLista1(lista1);
		consultarPlanilhaDTO.setLista2(lista2);
		consultarPlanilhaDTO.setLista3(lista3);
		consultarPlanilhaDTO.setLista4(lista4);
		consultarPlanilhaDTO.setLista5(lista5);
		consultarPlanilhaDTO.setLista6(lista6);
		consultarPlanilhaDTO.setLista7(lista7);
		consultarPlanilhaDTO.setLista8(lista8);
		consultarPlanilhaDTO.setLista9(lista9);
		consultarPlanilhaDTO.setLista10(lista10);
		consultarPlanilhaDTO.setLista11(lista11);
		consultarPlanilhaDTO.setLista12(lista12);
		
		consultarPlanilhaDTO.setCompetencia1(competencia1);
		consultarPlanilhaDTO.setCompetencia2(competencia2);
		consultarPlanilhaDTO.setCompetencia3(competencia3);
		consultarPlanilhaDTO.setCompetencia4(competencia4);
		consultarPlanilhaDTO.setCompetencia5(competencia5);
		consultarPlanilhaDTO.setCompetencia6(competencia6);
		consultarPlanilhaDTO.setCompetencia7(competencia7);
		consultarPlanilhaDTO.setCompetencia8(competencia8);
		consultarPlanilhaDTO.setCompetencia9(competencia9);
		consultarPlanilhaDTO.setCompetencia10(competencia10);
		consultarPlanilhaDTO.setCompetencia11(competencia11);
		consultarPlanilhaDTO.setCompetencia12(competencia12);
		
		consultarPlanilhaDTO.setCompetencia1Existe(competencia1Existe);		
		consultarPlanilhaDTO.setCompetencia2Existe(competencia2Existe);	
		consultarPlanilhaDTO.setCompetencia3Existe(competencia3Existe);	
		consultarPlanilhaDTO.setCompetencia4Existe(competencia4Existe);	
		consultarPlanilhaDTO.setCompetencia5Existe(competencia5Existe);	
		consultarPlanilhaDTO.setCompetencia6Existe(competencia6Existe);	
		consultarPlanilhaDTO.setCompetencia7Existe(competencia7Existe);	
		consultarPlanilhaDTO.setCompetencia8Existe(competencia8Existe);	
		consultarPlanilhaDTO.setCompetencia9Existe(competencia9Existe);	
		consultarPlanilhaDTO.setCompetencia10Existe(competencia10Existe);	
		consultarPlanilhaDTO.setCompetencia11Existe(competencia11Existe);	
		consultarPlanilhaDTO.setCompetencia12Existe(competencia12Existe);
		
		consultarPlanilhaDTO.setDescUf(this.estado);
		consultarPlanilhaDTO.setDescMunicipio(this.municipio);
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Alíquota Zerada", "ALIQUOTA_ZERADA");
		try {
			exportarPlanilha.aliquotasZeradas(consultarPlanilhaDTO, getTotalValor(), getTotalGeral(), qtdeAgencia, qtdePa);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}

	}

	/* ********************** Getters e Setters ************************** */
	public boolean isMostraBotoes() {

		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {

		this.mostraBotoes = mostraBotoes;
	}

	public Date getCompetenciaFiltro() {

		return competenciaFiltro;
	}

	public void setCompetenciaFiltro(Date competenciaFiltro) {

		this.competenciaFiltro = competenciaFiltro;
	}

	public List<SelectItem> getListaEstado() {

		return listaEstado;
	}

	public void setListaEstado(List<SelectItem> listaEstado) {

		this.listaEstado = listaEstado;
	}

	public boolean isMostraTabela() {

		return mostraTabela;
	}

	public void setMostraTabela(boolean mostraTabela) {

		this.mostraTabela = mostraTabela;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getListAliquotaZerada() {

		return listAliquotaZerada;
	}

	public void setListAliquotaZerada(List<ConsultaAliquotaZeradaSaidaDTO> listAliquotaZerada) {

		this.listAliquotaZerada = listAliquotaZerada;
	}

	public List<SelectItem> getListaRadioAliquotaZerada() {

		return listaRadioAliquotaZerada;
	}

	public void setListaRadioAliquotaZerada(List<SelectItem> listaRadioAliquotaZerada) {

		this.listaRadioAliquotaZerada = listaRadioAliquotaZerada;
	}

	public int getRadioAliquotaZerada() {

		return radioAliquotaZerada;
	}

	public void setRadioAliquotaZerada(int radioAliquotaZerada) {

		this.radioAliquotaZerada = radioAliquotaZerada;
	}

	public int getCodRadioListaMunicipio() {

		return codRadioListaMunicipio;
	}

	public void setCodRadioListaMunicipio(int codRadioListaMunicipio) {

		this.codRadioListaMunicipio = codRadioListaMunicipio;
	}

	public List<ConsultarMunicipiosAposFechamentoDTO> getListaMunicipio() {

		return listaMunicipio;
	}

	public void setListaMunicipio(List<ConsultarMunicipiosAposFechamentoDTO> listaMunicipio) {

		this.listaMunicipio = listaMunicipio;
	}

	public IConsultarApuracaoAposFechamentoService getConsultarApuracaoAposFechamentoImpl() {

		return consultarApuracaoAposFechamentoImpl;
	}

	public void setConsultarApuracaoAposFechamentoImpl(IConsultarApuracaoAposFechamentoService consultarApuracaoAposFechamentoImpl) {

		this.consultarApuracaoAposFechamentoImpl = consultarApuracaoAposFechamentoImpl;
	}

	public boolean isMostrarBotoesMunicipio() {

		return mostrarBotoesMunicipio;
	}

	public void setMostrarBotoesMunicipio(boolean mostrarBotoesMunicipio) {

		this.mostrarBotoesMunicipio = mostrarBotoesMunicipio;
	}

	public List<SelectItem> getListaRadioMunicipio() {

		return listaRadioMunicipio;
	}

	public void setListaRadioMunicipio(List<SelectItem> listaRadioMunicipio) {

		this.listaRadioMunicipio = listaRadioMunicipio;
	}

	public String getNomeMunicipio() {

		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {

		this.nomeMunicipio = nomeMunicipio;
	}

	public ConsultaAliquotaZeradaSaidaDTO getValoresTabela1() {

		return valoresTabela1;
	}

	public void setValoresTabela1(ConsultaAliquotaZeradaSaidaDTO valoresTabela1) {

		this.valoresTabela1 = valoresTabela1;
	}

	public List<ResultadoAliquotaZeradaSaidaDTO> getListResultados() {

		return listResultados;
	}

	public void setListResultados(List<ResultadoAliquotaZeradaSaidaDTO> listResultados) {

		this.listResultados = listResultados;
	}

	public ResultadoAliquotaZeradaSaidaDTO getResultadosDTO() {

		return resultadosDTO;
	}

	public void setResultadosDTO(ResultadoAliquotaZeradaSaidaDTO resultadosDTO) {

		this.resultadosDTO = resultadosDTO;
	}

	public boolean isMostraBotoesResultado() {

		return mostraBotoesResultado;
	}

	public void setMostraBotoesResultado(boolean mostraBotoesResultado) {

		this.mostraBotoesResultado = mostraBotoesResultado;
	}

	public String getCompetenciaDetalhe() {

		return competenciaDetalhe;
	}

	public void setCompetenciaDetalhe(String competenciaDetalhe) {

		this.competenciaDetalhe = competenciaDetalhe;
	}

	public Long getCodMunicipio() {

		return codMunicipio;
	}

	public void setCodMunicipio(Long codMunicipio) {

		this.codMunicipio = codMunicipio;
	}

	public Double getValorTotalReceita() {

		return valorTotalReceita;
	}

	public void setValorTotalReceita(Double valorTotalReceita) {

		this.valorTotalReceita = valorTotalReceita;
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

	public boolean isMostraDependencias() {

		return mostraDependencias;
	}

	public void setMostraDependencias(boolean mostraDependencias) {

		this.mostraDependencias = mostraDependencias;
	}

	public BigDecimal getTotalGeral() {

		return totalGeral;
	}

	public void setTotalGeral(BigDecimal totalGeral) {

		this.totalGeral = totalGeral;
	}

	public BigDecimal getTotalValor() {

		return totalValor;
	}

	public void setTotalValor(BigDecimal totalValor) {

		this.totalValor = totalValor;
	}

	public BigDecimal getTotalGeralResultado() {

		return totalGeralResultado;
	}

	public void setTotalGeralResultado(BigDecimal totalGeralResultado) {

		this.totalGeralResultado = totalGeralResultado;
	}

	public BigDecimal getTotalValorResultado() {

		return totalValorResultado;
	}

	public void setTotalValorResultado(BigDecimal totalValorResultado) {

		this.totalValorResultado = totalValorResultado;
	}

	public IConsultarApuracaoAliquotaZeradaService getConsultarApuracaoAliquotaZeradaImpl() {

		return consultarApuracaoAliquotaZeradaImpl;
	}

	public void setConsultarApuracaoAliquotaZeradaImpl(IConsultarApuracaoAliquotaZeradaService consultarApuracaoAliquotaZeradaImpl) {

		this.consultarApuracaoAliquotaZeradaImpl = consultarApuracaoAliquotaZeradaImpl;
	}

	public boolean isCarregaMunicipios() {

		return carregaMunicipios;
	}

	public void setCarregaMunicipios(boolean carregaMunicipios) {

		this.carregaMunicipios = carregaMunicipios;
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

	public List<ConsultarMunicipiosApuracaoParcialDTO> getListaMunicipios() {

		return listaMunicipios;
	}

	public void setListaMunicipios(List<ConsultarMunicipiosApuracaoParcialDTO> listaMunicipios) {

		this.listaMunicipios = listaMunicipios;
	}

	public String getRadioTelaConsultar() {

		return radioTelaConsultar;
	}

	public void setRadioTelaConsultar(String radioTelaConsultar) {

		this.radioTelaConsultar = radioTelaConsultar;
	}

	public int getControleVoltar() {

		return controleVoltar;
	}

	public void setControleVoltar(int controleVoltar) {

		this.controleVoltar = controleVoltar;
	}

	public List<SelectItem> getListaControleCheckRadio() {

		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {

		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public IConsultarapuracaoparcialService getConsultarApuracaoParcialImpl() {

		return consultarApuracaoParcialImpl;
	}

	public void setConsultarApuracaoParcialImpl(IConsultarapuracaoparcialService consultarApuracaoParcialImpl) {

		this.consultarApuracaoParcialImpl = consultarApuracaoParcialImpl;
	}

	public String getMesAte() {

		return mesAte;
	}

	public void setMesAte(String mesAte) {

		this.mesAte = mesAte;
	}

	public String getAnoAte() {

		return anoAte;
	}

	public void setAnoAte(String anoAte) {

		this.anoAte = anoAte;
	}

	public Boolean getRazaoExiste() {

		return razaoExiste;
	}

	public void setRazaoExiste(Boolean razaoExiste) {

		this.razaoExiste = razaoExiste;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista1() {
		return lista1;
	}

	public void setLista1(List<ConsultaAliquotaZeradaSaidaDTO> lista1) {
		this.lista1 = lista1;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista2() {
		return lista2;
	}

	public void setLista2(List<ConsultaAliquotaZeradaSaidaDTO> lista2) {
		this.lista2 = lista2;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista3() {
		return lista3;
	}

	public void setLista3(List<ConsultaAliquotaZeradaSaidaDTO> lista3) {
		this.lista3 = lista3;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista4() {
		return lista4;
	}

	public void setLista4(List<ConsultaAliquotaZeradaSaidaDTO> lista4) {
		this.lista4 = lista4;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista5() {
		return lista5;
	}

	public void setLista5(List<ConsultaAliquotaZeradaSaidaDTO> lista5) {
		this.lista5 = lista5;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista6() {
		return lista6;
	}

	public void setLista6(List<ConsultaAliquotaZeradaSaidaDTO> lista6) {
		this.lista6 = lista6;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista7() {
		return lista7;
	}

	public void setLista7(List<ConsultaAliquotaZeradaSaidaDTO> lista7) {
		this.lista7 = lista7;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista8() {
		return lista8;
	}

	public void setLista8(List<ConsultaAliquotaZeradaSaidaDTO> lista8) {
		this.lista8 = lista8;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista9() {
		return lista9;
	}

	public void setLista9(List<ConsultaAliquotaZeradaSaidaDTO> lista9) {
		this.lista9 = lista9;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista10() {
		return lista10;
	}

	public void setLista10(List<ConsultaAliquotaZeradaSaidaDTO> lista10) {
		this.lista10 = lista10;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista11() {
		return lista11;
	}

	public void setLista11(List<ConsultaAliquotaZeradaSaidaDTO> lista11) {
		this.lista11 = lista11;
	}

	public List<ConsultaAliquotaZeradaSaidaDTO> getLista12() {
		return lista12;
	}

	public void setLista12(List<ConsultaAliquotaZeradaSaidaDTO> lista12) {
		this.lista12 = lista12;
	}

	public String getCompetencia1() {
		return competencia1;
	}

	public void setCompetencia1(String competencia1) {
		this.competencia1 = competencia1;
	}

	public String getCompetencia2() {
		return competencia2;
	}

	public void setCompetencia2(String competencia2) {
		this.competencia2 = competencia2;
	}

	public String getCompetencia3() {
		return competencia3;
	}

	public void setCompetencia3(String competencia3) {
		this.competencia3 = competencia3;
	}

	public String getCompetencia4() {
		return competencia4;
	}

	public void setCompetencia4(String competencia4) {
		this.competencia4 = competencia4;
	}

	public String getCompetencia5() {
		return competencia5;
	}

	public void setCompetencia5(String competencia5) {
		this.competencia5 = competencia5;
	}

	public String getCompetencia6() {
		return competencia6;
	}

	public void setCompetencia6(String competencia6) {
		this.competencia6 = competencia6;
	}

	public String getCompetencia7() {
		return competencia7;
	}

	public void setCompetencia7(String competencia7) {
		this.competencia7 = competencia7;
	}

	public String getCompetencia8() {
		return competencia8;
	}

	public void setCompetencia8(String competencia8) {
		this.competencia8 = competencia8;
	}

	public String getCompetencia9() {
		return competencia9;
	}

	public void setCompetencia9(String competencia9) {
		this.competencia9 = competencia9;
	}

	public String getCompetencia10() {
		return competencia10;
	}

	public void setCompetencia10(String competencia10) {
		this.competencia10 = competencia10;
	}

	public String getCompetencia11() {
		return competencia11;
	}

	public void setCompetencia11(String competencia11) {
		this.competencia11 = competencia11;
	}

	public String getCompetencia12() {
		return competencia12;
	}

	public void setCompetencia12(String competencia12) {
		this.competencia12 = competencia12;
	}

	public boolean getCompetencia1Existe() {
		return competencia1Existe;
	}

	public void setCompetencia1Existe(boolean competencia1Existe) {
		this.competencia1Existe = competencia1Existe;
	}

	public boolean getCompetencia2Existe() {
		return competencia2Existe;
	}

	public void setCompetencia2Existe(boolean competencia2Existe) {
		this.competencia2Existe = competencia2Existe;
	}

	public boolean getCompetencia3Existe() {
		return competencia3Existe;
	}

	public void setCompetencia3Existe(boolean competencia3Existe) {
		this.competencia3Existe = competencia3Existe;
	}

	public boolean getCompetencia4Existe() {
		return competencia4Existe;
	}

	public void setCompetencia4Existe(boolean competencia4Existe) {
		this.competencia4Existe = competencia4Existe;
	}

	public boolean getCompetencia5Existe() {
		return competencia5Existe;
	}

	public void setCompetencia5Existe(boolean competencia5Existe) {
		this.competencia5Existe = competencia5Existe;
	}

	public boolean getCompetencia6Existe() {
		return competencia6Existe;
	}

	public void setCompetencia6Existe(boolean competencia6Existe) {
		this.competencia6Existe = competencia6Existe;
	}

	public boolean getCompetencia7Existe() {
		return competencia7Existe;
	}

	public void setCompetencia7Existe(boolean competencia7Existe) {
		this.competencia7Existe = competencia7Existe;
	}

	public boolean getCompetencia8Existe() {
		return competencia8Existe;
	}

	public void setCompetencia8Existe(boolean competencia8Existe) {
		this.competencia8Existe = competencia8Existe;
	}

	public boolean getCompetencia9Existe() {
		return competencia9Existe;
	}

	public void setCompetencia9Existe(boolean competencia9Existe) {
		this.competencia9Existe = competencia9Existe;
	}

	public boolean getCompetencia10Existe() {
		return competencia10Existe;
	}

	public void setCompetencia10Existe(boolean competencia10Existe) {
		this.competencia10Existe = competencia10Existe;
	}

	public boolean getCompetencia11Existe() {
		return competencia11Existe;
	}

	public void setCompetencia11Existe(boolean competencia11Existe) {
		this.competencia11Existe = competencia11Existe;
	}

	public boolean getCompetencia12Existe() {
		return competencia12Existe;
	}

	public void setCompetencia12Existe(boolean competencia12Existe) {
		this.competencia12Existe = competencia12Existe;
	}

	/**
	 * @return the qtdeAgencia
	 */
	public Long getQtdeAgencia() {
		return qtdeAgencia;
	}

	/**
	 * @param qtdeAgencia the qtdeAgencia to set
	 */
	public void setQtdeAgencia(Long qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}

	/**
	 * @return the qtdePa
	 */
	public Long getQtdePa() {
		return qtdePa;
	}

	/**
	 * @param qtdePa the qtdePa to set
	 */
	public void setQtdePa(Long qtdePa) {
		this.qtdePa = qtdePa;
	}

}
