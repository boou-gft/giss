package br.com.bradesco.web.giss.view.bean.controller.tipoincidencia;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.apache.commons.lang.time.DateUtils;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.tipoincidencia.ITipoIncidenciaService;
import br.com.bradesco.web.giss.service.business.tipoincidencia.ITipoIncidenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.HistoricoTipoIncidenciaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.TipoIncidenciaDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.bean.TipoIncidenciaFaixasDTO;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.utils.exceptions.GissFormatException;
import br.com.bradesco.web.giss.view.bean.model.tipoincidencia.TipoIncidenciaFaixasBean;

public class TipoIncidenciaBean {

	private String codigo;

	private String descricao;

	private Date datainiciovigencia;

	private Date datafinalvigencia;

	private String datainiciovigenciadesc;

	private String datafinalvigenciadesc;

	private boolean carregaFaixas;

	private List<TipoIncidenciaDTO> listaGridTipoIncidencia;

	private List<TipoIncidenciaFaixasBean> listaFaixasTipoIncidencia;

	private boolean mostraBotoes;

	private ITipoIncidenciaService tipoIncidenciaImpl;

	private List<SelectItem> listaControle;

	private String codListaPesquisar;

	private boolean hiddenProsseguir;

	// referente a historico
	private Date dataInicialHist;

	private Date dataFinalHist;

	private boolean carregaHistorico;

	private String itemSelecionadoLista;

	private List<HistoricoTipoIncidenciaDTO> listaTipoIncidenciaHistorico = new ArrayList<HistoricoTipoIncidenciaDTO>();

	public TipoIncidenciaBean() {
		listaControle = new ArrayList<SelectItem>();
		listaFaixasTipoIncidencia = new ArrayList<TipoIncidenciaFaixasBean>();
	}

	public String limparDados(ActionEvent event) throws ParseException {

		codigo = "";
		descricao = "";
		datainiciovigencia = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		datafinalvigencia = dateFormat.parse("31/12/3999");
		
		listaFaixasTipoIncidencia.clear();
		carregaFaixas = false;

		return "incluirTipoIncidencia";
	}

	public void pesquisar(ActionEvent event) {
		listarTipoIncidencia("M");
	}

	public void adicionaLinhaFaixaIncluir(ActionEvent event) {

		int indice = listaFaixasTipoIncidencia.size() - 1;
		// valida se todos os campos da faixa corrente foram preenchidos
		if (!listaFaixasTipoIncidencia.get(indice).getValorinicial().equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValorfinal()
						.equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValoraliquota()
						.equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValorRedutor()
						.equals("")) {

			// valida se o campo faixa final corrente é maior que o campo faixa
			// inicial corrente
			if (validaFaixas("I")) {

				// valida se o intervalo (valor inicial e valor final) corrente
				// está contido nos intervalos anteriores
				boolean resp = true;
				for (int i = 0; i <= indice; i++) {
					double valorinicialcorrente = new Double(
							listaFaixasTipoIncidencia.get(indice)
									.getValorinicial().replace(".", "")
									.replace(",", "."));
					double valorfinalcorrente = new Double(
							listaFaixasTipoIncidencia.get(indice)
									.getValorfinal().replace(".", "").replace(
											",", "."));
					double valoriniciallista = new Double(
							listaFaixasTipoIncidencia.get(i).getValorinicial()
									.replace(".", "").replace(",", "."));
					double valorfinallista = new Double(
							listaFaixasTipoIncidencia.get(i).getValorfinal()
									.replace(".", "").replace(",", "."));

					if(Double.valueOf(listaFaixasTipoIncidencia.get(indice).getValoraliquota().replace(",", ".")) > 100){
						BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(indice + 1)+ ", o valor da alíquota não pode ser maior que 100.", "incluirTipoIncidencia",
								BradescoViewExceptionActionType.ACTION,	false);
						resp = false;
					}else{
					
						if ((!(valorinicialcorrente < valoriniciallista) || !(valorfinalcorrente < valorfinallista)) && indice != 0 && i != indice) {
							if (!(valorinicialcorrente > valoriniciallista)	|| !(valorfinalcorrente > valorfinallista)) {
								BradescoFacesUtils
									.addInfoModalMessage(
											"Na faixa "
													+ new Integer(indice + 1)
													+ ", o intervalo entre valor inicial e valor final, não pode estar contido nas faixas anteriormente inseridas.",
											"incluirTipoIncidencia",
											BradescoViewExceptionActionType.ACTION,
											false);
								resp = false;
								break;
							}
						}
					}	
				}

				if (resp == true) {
					listaFaixasTipoIncidencia.add(new TipoIncidenciaFaixasBean(
							"", "", "", "", 0));
				}

			}

		} else {
			BradescoFacesUtils.addInfoModalMessage(
					"Preencha todos os valores.", "incluirTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		}

	}
	
	public void adicionaLinhaFaixa(ActionEvent event) {

		int indice = listaFaixasTipoIncidencia.size() - 1;
		// valida se todos os campos da faixa corrente foram preenchidos
		if (!listaFaixasTipoIncidencia.get(indice).getValorinicial().equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValorfinal().equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValoraliquota().equals("")
				&& !listaFaixasTipoIncidencia.get(indice).getValorRedutor().equals("")) {

			// valida se o campo faixa final corrente é maior que o campo faixa
			// inicial corrente
			if (validaFaixas("A")) {

				// valida se o intervalo (valor inicial e valor final) corrente
				// está contido nos intervalos anteriores
				boolean resp = true;
				for (int i = 0; i <= indice; i++) {
					double valorinicialcorrente = new Double(
							listaFaixasTipoIncidencia.get(indice)
									.getValorinicial().replace(".", "")
									.replace(",", "."));
					double valorfinalcorrente = new Double(
							listaFaixasTipoIncidencia.get(indice)
									.getValorfinal().replace(".", "").replace(
											",", "."));
					double valoriniciallista = new Double(
							listaFaixasTipoIncidencia.get(i).getValorinicial()
									.replace(".", "").replace(",", "."));
					double valorfinallista = new Double(
							listaFaixasTipoIncidencia.get(i).getValorfinal()
									.replace(".", "").replace(",", "."));

					if(Double.valueOf(listaFaixasTipoIncidencia.get(indice).getValoraliquota().replace(",", ".")) > 100){
						BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(indice + 1)+ ", o valor da alíquota não pode ser maior que 100.", "alterarTipoIncidencia",
								BradescoViewExceptionActionType.ACTION,	false);
						resp = false;
					}else{
					
						if ((!(valorinicialcorrente < valoriniciallista) || !(valorfinalcorrente < valorfinallista)) && indice != 0 && i != indice) {
							if (!(valorinicialcorrente > valoriniciallista)	|| !(valorfinalcorrente > valorfinallista)) {
								BradescoFacesUtils
									.addInfoModalMessage(
											"Na faixa "
													+ new Integer(indice + 1)
													+ ", o intervalo entre valor inicial e valor final, não pode estar contido nas faixas anteriormente inseridas.",
											"alterarTipoIncidencia",
											BradescoViewExceptionActionType.ACTION,
											false);
								resp = false;
								break;
							}
						}
					}	
				}

				if (resp == true) {
					listaFaixasTipoIncidencia.add(new TipoIncidenciaFaixasBean(	"", "", "", "", 0));
				}

			}

		} else {
			BradescoFacesUtils.addInfoModalMessage(
					"Preencha todos os valores.", "alterarTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
		}

	}


	public void removeLinhaFaixa(ActionEvent event) {

		if (listaFaixasTipoIncidencia.size() > 1)
			listaFaixasTipoIncidencia
					.remove(listaFaixasTipoIncidencia.size() - 1);

	}

	public boolean validaFaixas(String origem) {

		boolean resp = false;
		int tam = listaFaixasTipoIncidencia.size();
		BigDecimal dinicial = null;
		BigDecimal dfinal = null;

		for (int i = 0; i < tam; i++) {
			dinicial = new BigDecimal(listaFaixasTipoIncidencia.get(i)
					.getValorinicial().replace(".", "").replace(",", "."));
			dfinal = new BigDecimal(listaFaixasTipoIncidencia.get(i)
					.getValorfinal().replace(".", "").replace(",", "."));

			if (dinicial.doubleValue() < dfinal.doubleValue()) {
				resp = true;
			} else {
				resp = false;
				
				if(origem.equals("I"))
					BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(i + 1)+ ", o valor inicial deve ser menor que o valor final.","incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
				else
					BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(i + 1)+ ", o valor inicial deve ser menor que o valor final.","alterarTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
			}
		}

		return resp;
	}

	public String voltarIncluirTipoIncidencia(ActionEvent event) throws ParseException {

		inicializaIncluirTipoIncidencia();

		return "incluirTipoIncidencia";
	}

	public String inicializaIncluirTipoIncidencia() throws ParseException {

		// seta campo de data inicial com a data do dia e outros campos
		this.codigo = null;
		this.descricao = null;
		this.datainiciovigencia = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		this.datafinalvigencia = dateFormat.parse("31/12/3999");
		
		this.carregaFaixas = false;
		listaFaixasTipoIncidencia = new ArrayList<TipoIncidenciaFaixasBean>();

		return "incluirTipoIncidencia";
	}

	public void carregarListaFaixasTipoIncidencia(ActionEvent event) throws ParseException {
		// se foram preenchidos os campos corretamente
		if (codigo != null && !codigo.trim().equals("") && descricao != null && !descricao.trim().equals("") && datainiciovigencia != null && datafinalvigencia != null) {
			// verifica se a data inicial é menor que a data do dia
			Date dataAtual = new Date();
		
			int RespostaDataInicial = datainiciovigencia.compareTo(dataAtual);
			int RespostaDataFinal = datafinalvigencia.compareTo(dataAtual);
			int RespostaData = datafinalvigencia.compareTo(datainiciovigencia);
		 
			boolean baresults = DateUtils.isSameDay(datainiciovigencia, dataAtual);
			boolean bbresults = DateUtils.isSameDay(datafinalvigencia, dataAtual);
		 
			if(!baresults && RespostaDataInicial < 0){
			 
				BradescoFacesUtils.addInfoModalMessage("A data inicial deve ser maior ou igual a data atual.", "incluirTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
		 
			 
			}else if(!bbresults && RespostaDataFinal < 0){
			 
				BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data atual.", "incluirTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
			 
			}else{
				// verifica se a data final da vigencia é maior que a inicial.
				if (RespostaData > 0 ) {
					
					if(verificaExistenciaTipoIncidencia()) {
						if(carregaFaixas == false){
							this.carregaFaixas = true;
							listaFaixasTipoIncidencia.add(new TipoIncidenciaFaixasBean("","", "", "", 0));
						}
					}
				} else {
					BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior que a data inicial.","incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
				}
			}
		 
		} else {
			BradescoFacesUtils.addInfoModalMessage("Preencha todos os campos.",	"incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
		}
	}

	public boolean verificaExistenciaTipoIncidencia(){
		
		boolean retorno = false;
		
		try {
			
			TipoIncidenciaDTO tipoIncidenciaDTO = new TipoIncidenciaDTO();

			tipoIncidenciaDTO.setCodigo(codigo);
			tipoIncidenciaDTO.setDescricao(descricao);
			
			retorno = tipoIncidenciaImpl.validaInclusaoTipoIncidencia(tipoIncidenciaDTO);
			
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),"incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		
		return retorno;
	}
	
	public String carregarAlterarListaTipoIncidencia() {

		carregaFaixas = false;
		listarTipoIncidencia("M");

		return "manterTipoIncidencia";
	}

	public String prosseguirResultadoConsulta() {

		TipoIncidenciaDTO tipoIncidenciaDTO = listaGridTipoIncidencia
				.get(new Integer(codListaPesquisar));
		if (consultaTipoIncidencia(tipoIncidenciaDTO)) {
			return "consultarTipoIncidencia";
		}

		return null;
	}

	public String prosseguirResultadoAlteracao() {

		TipoIncidenciaDTO tipoIncidenciaDTO = listaGridTipoIncidencia
				.get(new Integer(codListaPesquisar));
		if (consultaTipoIncidencia(tipoIncidenciaDTO)) {
			return "alterarTipoIncidencia";
		}

		return null;
	}

	public String prosseguirResultadoExclusao() {

		TipoIncidenciaDTO tipoIncidenciaDTO = listaGridTipoIncidencia
				.get(new Integer(codListaPesquisar));
		if (consultaTipoIncidencia(tipoIncidenciaDTO)) {
			return "excluirTipoIncidencia";
		}

		return null;
	}

	public void incluirTipoIncidencia(ActionEvent event) {

		try {

			TipoIncidenciaDTO tipoIncidenciaDTO = new TipoIncidenciaDTO();

			if (validaInclusaoTipoIncidencia("I")) {

				tipoIncidenciaDTO.setCodigo(codigo);
				tipoIncidenciaDTO.setDescricao(descricao);

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

				String dataIni = dateFormat.format(datainiciovigencia);
				String dataFim = dateFormat.format(datafinalvigencia);

				tipoIncidenciaDTO.setDatainiciovigencia(dataIni);
				tipoIncidenciaDTO.setDatafinalvigencia(dataFim);

				List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidenciaDTO = new ArrayList<TipoIncidenciaFaixasDTO>();

				for (TipoIncidenciaFaixasBean tipoIncidenciaFaixasBean : listaFaixasTipoIncidencia) {

					TipoIncidenciaFaixasDTO tipoincidenciafaixas = new TipoIncidenciaFaixasDTO();

					tipoincidenciafaixas.setValorinicial(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorinicial()));
					tipoincidenciafaixas.setValorfinal(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorfinal()));
					tipoincidenciafaixas.setValoraliquota(NumberUtils.convert(tipoIncidenciaFaixasBean.getValoraliquota()));
					tipoincidenciafaixas.setValorRedutor(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorRedutor()));
					tipoincidenciafaixas
							.setNumsequencial(tipoIncidenciaFaixasBean
									.getNumsequencial());

					listaFaixasTipoIncidenciaDTO.add(tipoincidenciafaixas);
				}

				tipoIncidenciaDTO
						.setListaFaixasTipoIncidencia(listaFaixasTipoIncidenciaDTO);

				tipoIncidenciaDTO = tipoIncidenciaImpl
						.incluirTipoIncidencia(tipoIncidenciaDTO);

				BradescoFacesUtils.addInfoModalMessage(tipoIncidenciaDTO
						.getMensagem(), "incluirTipoIncidencia",
						BradescoViewExceptionActionType.ACTION, false);
				
				listarTipoIncidencia("I");
				limparCamposInclusao();
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"incluirTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		}
	}

	public boolean validaInclusaoTipoIncidencia(String origem) {

		int indice = listaFaixasTipoIncidencia.size() - 1;
		boolean resp = true;

		if(listaFaixasTipoIncidencia.get(indice).getValorinicial().equals("") || listaFaixasTipoIncidencia.get(indice).getValorfinal().equals("") || listaFaixasTipoIncidencia.get(indice).getValorRedutor().equals("") || listaFaixasTipoIncidencia.get(indice).getValoraliquota().equals("")){
			resp = false;
			if(origem.equals("I"))
				BradescoFacesUtils.addInfoModalMessage("Digite os dados referentes a faixa.","incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION,false);
			else
				BradescoFacesUtils.addInfoModalMessage("Digite os dados referentes a faixa.","alterarTipoIncidencia",BradescoViewExceptionActionType.ACTION,false);
		}else{

			 //valida intervalo de data
			 Date dataAtual = new Date();
			 
			 int RespostaDataInicial = datainiciovigencia.compareTo(dataAtual);
			 int RespostaDataFinal = datafinalvigencia.compareTo(dataAtual);
			 int RespostaData = datafinalvigencia.compareTo(datainiciovigencia);
			 
			 boolean baresults = DateUtils.isSameDay(datainiciovigencia, dataAtual);
			 boolean bbresults = DateUtils.isSameDay(datafinalvigencia, dataAtual);
			 
			 if(!baresults && RespostaDataInicial < 0){
				 if(origem.equals("I")){
					 BradescoFacesUtils.addInfoModalMessage("A data inicial deve ser maior ou igual a data atual.", "incluirTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
				 }else{
					 BradescoFacesUtils.addInfoModalMessage("A data inicial deve ser maior ou igual a data atual.", "alterarTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
				 }
				 resp = false;
				 
			 }else if(!bbresults && RespostaDataFinal < 0){
				 if(origem.equals("I")){
					 BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data atual.", "incluirTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
				 }else{
					 BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data atual.", "alterarTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
				 }
				 resp = false;
			 }else{	 
				 if (RespostaData > 0 ) {
				
					 // valida se o intervalo (valor inicial e valor final) corrente está
					 // contido nos intervalos anteriores
					 for (int i = 0; i <= indice; i++) {
						 double valorinicialcorrente = new Double(listaFaixasTipoIncidencia.get(indice).getValorinicial().replace(".", "").replace(",", "."));
						 double valorfinalcorrente = new Double(listaFaixasTipoIncidencia.get(indice).getValorfinal().replace(".", "").replace(",", "."));
						 double valoriniciallista = new Double(listaFaixasTipoIncidencia.get(i).getValorinicial().replace(".", "").replace(",","."));
						 double valorfinallista = new Double(listaFaixasTipoIncidencia.get(i).getValorfinal().replace(".", "").replace(",","."));

						 if (!(valorinicialcorrente < valorfinalcorrente)) {
							 if(origem.equals("I"))
								 BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(indice + 1)+ ", o valor inicial deve ser menor que o valor final.","incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
							 else
								 BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(indice + 1)+ ", o valor inicial deve ser menor que o valor final.","alterarTipoIncidencia",BradescoViewExceptionActionType.ACTION, false);
					
							 resp = false;
							 break;
						 }
				
						 if(Double.valueOf(listaFaixasTipoIncidencia.get(i).getValoraliquota().replace(",", ".")) > 100){
							 if(origem.equals("I")){
								 BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(i + 1)+ ", o valor da alíquota não pode ser maior que 100.", "incluirTipoIncidencia",
									BradescoViewExceptionActionType.ACTION,	false);
							 }else{
								 BradescoFacesUtils.addInfoModalMessage("Na faixa "+ new Integer(i + 1)+ ", o valor da alíquota não pode ser maior que 100.", "alterarTipoIncidencia",
									BradescoViewExceptionActionType.ACTION,	false);
						
							 }
							 resp = false;
							 break;
						 }else{
				
							 if ((!(valorinicialcorrente < valoriniciallista) || !(valorfinalcorrente < valorfinallista)) && indice != 0 && i != indice) {
								 if (!(valorinicialcorrente > valoriniciallista) || !(valorfinalcorrente > valorfinallista) || !(valorinicialcorrente > valorfinallista)) {
									 if(origem.equals("I")){
										 BradescoFacesUtils.addInfoModalMessage("Na faixa " + new Integer(indice + 1)+ ", o intervalo entre valor inicial e valor final, não pode estar contido nas faixas anteriormente inseridas.",
											"incluirTipoIncidencia",BradescoViewExceptionActionType.ACTION,	false);
										 resp = false;
										 break;
									 }else{
										 BradescoFacesUtils.addInfoModalMessage("Na faixa " + new Integer(indice + 1)+ ", o intervalo entre valor inicial e valor final, não pode estar contido nas faixas anteriormente inseridas.",
											"alterarTipoIncidencia",BradescoViewExceptionActionType.ACTION,	false);
							
										 resp = false;
										 break;
									 }	
								 }
							 }
						 }
					 }	 
				}else{
					if(origem.equals("I")){
						BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior que a data atual.", "incluirTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
					}else{
						BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior que a data atual.", "alterarTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
					}
					resp = false;
				}
			}	
		}	 
		return resp;
	}

	public boolean consultaTipoIncidencia(TipoIncidenciaDTO tipoIncidenciaDTO) {
		try {
			tipoIncidenciaDTO = tipoIncidenciaImpl.consultarTipoIncidencia(tipoIncidenciaDTO);

			this.setCodigo(tipoIncidenciaDTO.getCodigo());
			this.setDescricao(tipoIncidenciaDTO.getDescricao());

			// para saida normal
			this.setDatainiciovigenciadesc(tipoIncidenciaDTO.getDatainiciovigencia().replace(".", "/"));
			this.setDatafinalvigenciadesc(tipoIncidenciaDTO.getDatafinalvigencia().replace(".", "/"));

			// para o componente calendário
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			Date dataIni = dateFormat.parse(tipoIncidenciaDTO.getDatainiciovigencia());
			Date dataFim = dateFormat.parse(tipoIncidenciaDTO.getDatafinalvigencia());
			this.setDatainiciovigencia(dataIni);
			this.setDatafinalvigencia(dataFim);

			TipoIncidenciaFaixasBean faixasBean;

			listaFaixasTipoIncidencia = new ArrayList<TipoIncidenciaFaixasBean>();

			for (TipoIncidenciaFaixasDTO tipoIncidencia : tipoIncidenciaDTO.getListaFaixasTipoIncidencia()) {

				faixasBean = new TipoIncidenciaFaixasBean();

				faixasBean.setValoraliquota(NumberUtils.format(tipoIncidencia.getValoraliquota()));
				faixasBean.setValorfinal(NumberUtils.format(tipoIncidencia.getValorfinal()));
				faixasBean.setValorinicial(NumberUtils.format(tipoIncidencia.getValorinicial()));
				faixasBean.setValorRedutor(NumberUtils.format(tipoIncidencia.getValorRedutor()));
				faixasBean.setNumsequencial(tipoIncidencia.getNumsequencial());

				listaFaixasTipoIncidencia.add(faixasBean);
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"manterTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
			return false;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return true;
	}

	public String alterarTipoIncidencia(ActionEvent event) {

		try {

			TipoIncidenciaDTO tipoIncidenciaDTO = new TipoIncidenciaDTO();

			if (validaInclusaoTipoIncidencia("A")) {
			
				tipoIncidenciaDTO.setCodigo(codigo);
				tipoIncidenciaDTO.setDescricao(descricao);

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

				String dataIni = dateFormat.format(datainiciovigencia);
				String dataFim = dateFormat.format(datafinalvigencia);
				
				tipoIncidenciaDTO.setDatainiciovigencia(dataIni);
				tipoIncidenciaDTO.setDatafinalvigencia(dataFim);

				List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidenciaDTO = new ArrayList<TipoIncidenciaFaixasDTO>();

				for (TipoIncidenciaFaixasBean tipoIncidenciaFaixasBean : listaFaixasTipoIncidencia) {

					TipoIncidenciaFaixasDTO tipoincidenciafaixas = new TipoIncidenciaFaixasDTO();

					tipoincidenciafaixas.setValorinicial(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorinicial()));
					tipoincidenciafaixas.setValorfinal(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorfinal()));
					tipoincidenciafaixas.setValoraliquota(NumberUtils.convert(tipoIncidenciaFaixasBean.getValoraliquota()));
					tipoincidenciafaixas.setValorRedutor(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorRedutor()));
					tipoincidenciafaixas.setNumsequencial(tipoIncidenciaFaixasBean.getNumsequencial());
					
					listaFaixasTipoIncidenciaDTO.add(tipoincidenciafaixas);
				}

				tipoIncidenciaDTO
					.setListaFaixasTipoIncidencia(listaFaixasTipoIncidenciaDTO);

				tipoIncidenciaDTO = tipoIncidenciaImpl
					.alterarTipoIncidencia(tipoIncidenciaDTO);

				BradescoFacesUtils.addInfoModalMessage(tipoIncidenciaDTO
					.getMensagem(), "manterTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
			
				listarTipoIncidencia("M");
			}
			
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"alterarTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}

	public String excluirTipoIncidencia(ActionEvent event) {

		try {

			TipoIncidenciaDTO tipoIncidenciaDTO = new TipoIncidenciaDTO();

			tipoIncidenciaDTO.setCodigo(codigo);
			tipoIncidenciaDTO.setDescricao(descricao);

			tipoIncidenciaDTO.setDatainiciovigencia(datainiciovigenciadesc);
			tipoIncidenciaDTO.setDatafinalvigencia(datafinalvigenciadesc);

			List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidenciaDTO = new ArrayList<TipoIncidenciaFaixasDTO>();

			for (TipoIncidenciaFaixasBean tipoIncidenciaFaixasBean : listaFaixasTipoIncidencia) {

				TipoIncidenciaFaixasDTO tipoincidenciafaixas = new TipoIncidenciaFaixasDTO();

				tipoincidenciafaixas.setValorinicial(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorinicial()));
				tipoincidenciafaixas.setValorfinal(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorfinal()));
				tipoincidenciafaixas.setValoraliquota(NumberUtils.convert(tipoIncidenciaFaixasBean.getValoraliquota()));
				tipoincidenciafaixas.setValorRedutor(NumberUtils.convert(tipoIncidenciaFaixasBean.getValorRedutor()));
				tipoincidenciafaixas.setNumsequencial(tipoIncidenciaFaixasBean.getNumsequencial());

				listaFaixasTipoIncidenciaDTO.add(tipoincidenciafaixas);
			}

			tipoIncidenciaDTO
					.setListaFaixasTipoIncidencia(listaFaixasTipoIncidenciaDTO);

			tipoIncidenciaDTO = tipoIncidenciaImpl
					.excluirTipoIncidencia(tipoIncidenciaDTO);

			BradescoFacesUtils.addInfoModalMessage(tipoIncidenciaDTO
					.getMensagem(), "manterTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
			
			listarTipoIncidencia("M");
			
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"excluirTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

		return null;
	}

	private void listarTipoIncidencia(String origem) {

		try {
			listaGridTipoIncidencia = tipoIncidenciaImpl
					.listaGridTipoIncidencia();

			if (listaGridTipoIncidencia != null) {
				listaControle = new ArrayList<SelectItem>();
				for (int i = 0; i < listaGridTipoIncidencia.size(); i++) {
					listaControle.add(new SelectItem(i, " "));
				}

				if (listaGridTipoIncidencia.size() > ITipoIncidenciaServiceConstants.NUMERO_REGISTROS_LISTA_TIPOINCIDENCIA) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				this.carregaFaixas = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			if (origem.equals("I"))
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
						"incluirTipoIncidencia",
						BradescoViewExceptionActionType.ACTION, false);
			else
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
						"manterTipoIncidencia",
						BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	
	
	public String carregarHistoricoTipoIncidencia() {

		carregaHistorico = false;
		dataInicialHist = null;
		dataFinalHist = null;
		listaTipoIncidenciaHistorico = null;

		return "historicoTipoIncidencia";
	}

	public String limparDadosHistorico() {

		carregaHistorico = false;
		dataInicialHist = null;
		dataFinalHist = null;
		if (listaTipoIncidenciaHistorico != null) {
			listaTipoIncidenciaHistorico.clear();
		} else {
			listaTipoIncidenciaHistorico = null;
		}

		return "historicoTipoIncidencia";
	}

	public void carregaListaHistoricoTipoIncidencia(ActionEvent event) {

		 int RespostaData = dataFinalHist.compareTo(dataInicialHist);
		 
		 if (RespostaData < 0 ) {
			dataInicialHist = null;
			dataFinalHist = null;
			BradescoFacesUtils.addInfoModalMessage(
					"A data final deve ser maior ou igual a data inicial.",
					"historicoTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		} else {
			carregaHistorico = false;
			listarHistoricoTipoIncidencia();
		}
	}

	public void paginarPesquisaHistorico(ActionEvent event) {
		
		listarHistoricoTipoIncidencia();
		setListaTipoIncidenciaHistorico(listaTipoIncidenciaHistorico);

	}
	
	public void paginarFaixasHistorico(ActionEvent event) {
		
		listaControle = null;
		
		listarHistoricoTipoIncidencia();
		setListaFaixasTipoIncidencia(listaFaixasTipoIncidencia);

	}
	
	private void listarHistoricoTipoIncidencia() {

		try {
			listaTipoIncidenciaHistorico = tipoIncidenciaImpl
					.listaHistoricoTipoIncidencia(dataInicialHist,
							dataFinalHist);

			if (listaTipoIncidenciaHistorico != null) {
				listaControle = new ArrayList<SelectItem>();
				for (int i = 0; i < listaTipoIncidenciaHistorico.size(); i++) {
					listaControle.add(new SelectItem(i, " "));
				}				

				if (listaTipoIncidenciaHistorico.size() > ITipoIncidenciaServiceConstants.NUMERO_REGISTROS_LISTA_HISTORICO_TIPOINCIDENCIA) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				this.carregaHistorico = true;
			}

		} catch (PdcAdapterFunctionalException p) {
			dataInicialHist = null;
			dataFinalHist = null;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"historicoTipoIncidencia",
					BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	public String prosseguirResultadoConsultaHistorico() {

		HistoricoTipoIncidenciaDTO histTipoIncidenciaDTO = listaTipoIncidenciaHistorico.get(new Integer(itemSelecionadoLista));
		if (consultaHistoricoTipoIncidencia(histTipoIncidenciaDTO)) {
			return "consultarTipoIncidenciaHistorico";
		}

		return null;
	}
	
	public boolean consultaHistoricoTipoIncidencia(HistoricoTipoIncidenciaDTO histTipoIncidenciaDTO) {
		try {
			TipoIncidenciaDTO tipoIncidenciaDTO = new TipoIncidenciaDTO();
			
			tipoIncidenciaDTO = tipoIncidenciaImpl.consultarHistoricoTipoIncidencia(histTipoIncidenciaDTO.getCodigo(), histTipoIncidenciaDTO.getDescricao(), dataInicialHist, dataFinalHist, histTipoIncidenciaDTO.getHrManutencaoRegistro());

			codigo = histTipoIncidenciaDTO.getCodigo();
			descricao = histTipoIncidenciaDTO.getDescricao();
			this.setDatainiciovigenciadesc(tipoIncidenciaDTO.getDatainiciovigencia().replace(".", "/"));
			this.setDatafinalvigenciadesc(tipoIncidenciaDTO.getDatafinalvigencia().replace(".", "/"));
			
			TipoIncidenciaFaixasBean faixasBean;

			listaFaixasTipoIncidencia = new ArrayList<TipoIncidenciaFaixasBean>();

			for (TipoIncidenciaFaixasDTO tipoIncidencia : tipoIncidenciaDTO.getListaFaixasTipoIncidencia()) {

				faixasBean = new TipoIncidenciaFaixasBean();

				faixasBean.setValoraliquota(NumberUtils.format(tipoIncidencia.getValoraliquota()));
				faixasBean.setValorfinal(NumberUtils.format(tipoIncidencia.getValorfinal()));
				faixasBean.setValorinicial(NumberUtils.format(tipoIncidencia.getValorinicial()));
				faixasBean.setValorRedutor(NumberUtils.format(tipoIncidencia.getValorRedutor()));
				faixasBean.setNumsequencial(tipoIncidencia.getNumsequencial());

				listaFaixasTipoIncidencia.add(faixasBean);
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),"historicoTipoIncidencia", BradescoViewExceptionActionType.ACTION, false);
			return false;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return true;
	}

	public void limparCamposInclusao() {

		codigo = "";
		descricao = "";
		datainiciovigencia = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			datafinalvigencia = dateFormat.parse("31/12/3999");
		} catch (ParseException e) {
			throw new GissFormatException(e.getMessage(), e);
		}

		listaFaixasTipoIncidencia.clear();
		carregaFaixas = false;
				
	}
	
	

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public boolean isCarregaHistorico() {
		return carregaHistorico;
	}

	public void setCarregaHistorico(boolean carregaHistorico) {
		this.carregaHistorico = carregaHistorico;
	}

	public Date getDataFinalHist() {
		return dataFinalHist;
	}

	public void setDataFinalHist(Date dataFinalHist) {
		this.dataFinalHist = dataFinalHist;
	}

	public Date getDataInicialHist() {
		return dataInicialHist;
	}

	public void setDataInicialHist(Date dataInicialHist) {
		this.dataInicialHist = dataInicialHist;
	}

	public List<HistoricoTipoIncidenciaDTO> getListaTipoIncidenciaHistorico() {
		return listaTipoIncidenciaHistorico;
	}

	public void setListaTipoIncidenciaHistorico(
			List<HistoricoTipoIncidenciaDTO> listaTipoIncidenciaHistorico) {
		this.listaTipoIncidenciaHistorico = listaTipoIncidenciaHistorico;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodListaPesquisar() {
		return codListaPesquisar;
	}

	public void setCodListaPesquisar(String codListaPesquisar) {
		this.codListaPesquisar = codListaPesquisar;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatafinalvigencia() {
		return datafinalvigencia;
	}

	public void setDatafinalvigencia(Date datafinalvigencia) {
		this.datafinalvigencia = datafinalvigencia;
	}

	public Date getDatainiciovigencia() {
		return datainiciovigencia;
	}

	public void setDatainiciovigencia(Date datainiciovigencia) {
		this.datainiciovigencia = datainiciovigencia;
	}

	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}

	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}

	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	public String getDatafinalvigenciadesc() {
		return datafinalvigenciadesc;
	}

	public void setDatafinalvigenciadesc(String datafinalvigenciadesc) {
		this.datafinalvigenciadesc = datafinalvigenciadesc;
	}

	public String getDatainiciovigenciadesc() {
		return datainiciovigenciadesc;
	}

	public void setDatainiciovigenciadesc(String datainiciovigenciadesc) {
		this.datainiciovigenciadesc = datainiciovigenciadesc;
	}

	public List<TipoIncidenciaDTO> getListaGridTipoIncidencia() {
		return listaGridTipoIncidencia;
	}

	public void setListaGridTipoIncidencia(
			List<TipoIncidenciaDTO> listaGridTipoIncidencia) {
		this.listaGridTipoIncidencia = listaGridTipoIncidencia;
	}

	public List<TipoIncidenciaFaixasBean> getListaFaixasTipoIncidencia() {
		return listaFaixasTipoIncidencia;
	}

	public void setListaFaixasTipoIncidencia(
			List<TipoIncidenciaFaixasBean> listaFaixasTipoIncidencia) {
		this.listaFaixasTipoIncidencia = listaFaixasTipoIncidencia;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public ITipoIncidenciaService getTipoIncidenciaImpl() {
		return tipoIncidenciaImpl;
	}

	public void setTipoIncidenciaImpl(ITipoIncidenciaService tipoIncidenciaImpl) {
		this.tipoIncidenciaImpl = tipoIncidenciaImpl;
	}

	public boolean isCarregaFaixas() {
		return carregaFaixas;
	}

	public void setCarregaFaixas(boolean carregaFaixas) {
		this.carregaFaixas = carregaFaixas;
	}

}
