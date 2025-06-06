package br.com.bradesco.web.giss.view.bean.controller.balancetes.obrigacoesWebservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.ControleLogsDTO;
import br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.ILogTransmissaoArquivoService;

public class ConsultaLogArquivosBean {
	
	private Date dataInicial;	
	private Date dataFinal;
	private String dataInicialFormatada;
	private String dataFinalFormatada;
	private boolean exibeLista;
	private List<ControleLogsDTO> listaControleLogs = new ArrayList<ControleLogsDTO>();
	private List<SelectItem> listaControleLogsCheckRadio = new ArrayList<SelectItem>();
	private Integer codListaPesquisar;
	private ControleLogsDTO logSelecionado;
	
	private ILogTransmissaoArquivoService logTransmissaoArquivoServiceImpl;
	
	private ILogManager logger = BradescoCommonServiceFactory.getLogManager();
	
	public String inicializaConsultaLogArquivos() {
		listaControleLogs = new ArrayList<ControleLogsDTO>();
		exibeLista = false;
		dataInicial = null;
		dataFinal = null;
		codListaPesquisar = null;
		return "consultarLogArquivos";
	}
	
	public void pesquisar(ActionEvent event) {
		listaControleLogsCheckRadio = new ArrayList<SelectItem>();
		codListaPesquisar = null;
		try {
			formatarDatasPesquisa();
			
			listaControleLogs = logTransmissaoArquivoServiceImpl.listarLogTransmissaoArquivo(dataInicialFormatada, dataFinalFormatada);
			
			exibeLista = true;
			
			criarLogsCheckRadio(listaControleLogs);
		} catch (PdcAdapterFunctionalException e) {
			logger.error(this.getClass(), e);
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			exibeLista = false;
		} catch (Exception e) {
			exibeLista = false;
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void paginarListaControleLogs(ActionEvent event) {
		listaControleLogsCheckRadio = new ArrayList<SelectItem>();
		codListaPesquisar = null;
		try {

			listaControleLogs = logTransmissaoArquivoServiceImpl.listarLogTransmissaoArquivo(dataInicialFormatada, dataFinalFormatada);
			
			criarLogsCheckRadio(listaControleLogs);

		} catch (PdcAdapterFunctionalException e) {
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			exibeLista = false;
		} catch (Exception e) {
			exibeLista = false;
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	/**Formata as datas no padrão dd-MM-yyyy
	 * @author jonascc
	 */
	private void formatarDatasPesquisa() {
		DateFormat dateFormat = new SimpleDateFormat(
		"dd-MM-yyyy");
		dataInicialFormatada = dateFormat.format(dataInicial);
		dataFinalFormatada = dateFormat.format(dataFinal);
	}
	
	private void criarLogsCheckRadio(List<ControleLogsDTO> listaControleLogs) {
		for (int i = 0; i < listaControleLogs.size(); i++) {
			listaControleLogsCheckRadio.add(new SelectItem(i, " "));
		}
	}
	
	public String voltar() {
		codListaPesquisar = null;
		return "consultarLogArquivos";
	}
	
	public String voltarInicio() {
		return inicializaConsultaLogArquivos();
	}
	
	public String detalhar() {
		logSelecionado = listaControleLogs.get(codListaPesquisar);
		return "detalharLogArquivos";
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public boolean isExibeLista() {
		return exibeLista;
	}

	public void setExibeLista(boolean exibeLista) {
		this.exibeLista = exibeLista;
	}

	public List<ControleLogsDTO> getListaControleLogs() {
		return listaControleLogs;
	}

	public void setListaControleLogs(List<ControleLogsDTO> listaControleLogs) {
		this.listaControleLogs = listaControleLogs;
	}

	public List<SelectItem> getListaControleLogsCheckRadio() {
		return listaControleLogsCheckRadio;
	}

	public void setListaControleLogsCheckRadio(
			List<SelectItem> listaControleLogsCheckRadio) {
		this.listaControleLogsCheckRadio = listaControleLogsCheckRadio;
	}

	public Integer getCodListaPesquisar() {
		return codListaPesquisar;
	}

	public void setCodListaPesquisar(Integer codListaPesquisar) {
		this.codListaPesquisar = codListaPesquisar;
	}

	public ControleLogsDTO getLogSelecionado() {
		return logSelecionado;
	}

	public void setLogSelecionado(ControleLogsDTO logSelecionado) {
		this.logSelecionado = logSelecionado;
	}

	public ILogTransmissaoArquivoService getLogTransmissaoArquivoServiceImpl() {
		return logTransmissaoArquivoServiceImpl;
	}

	public void setLogTransmissaoArquivoServiceImpl(
			ILogTransmissaoArquivoService logTransmissaoArquivoServiceImpl) {
		this.logTransmissaoArquivoServiceImpl = logTransmissaoArquivoServiceImpl;
	}

}
