package br.com.bradesco.web.giss.view.bean.controller.controleRecolhimento;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.exception.EnvioMensagemException;
import br.com.bradesco.web.giss.service.business.consaldosrec.IConSaldosRecService;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.ControleSaldosRecolhimentoDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.DependenciasDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.MunicipioDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ControleSaldosRecolhimentoBean {

	private List<SelectItem> listaEstado = new ArrayList<SelectItem>();
	private IConSaldosRecService controleSaldosRecolhimentoImpl;
	private String estadoFiltro;
	private String competencia;
	private String estado;
	private String municipio;
	private String vencimento;
	private String pagtoDiaUtil;
	private String formaPagto;
	private String dataRecolhimento;
	private String codMunicipio;
	private List<MunicipioDTO> listaMunicipios;
	private List<DependenciasDTO> listaDependenciaSaldosRecolhimento;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaDependenciasRadio = new ArrayList<SelectItem>();
	private boolean mostraMunicipios;
	private boolean mostraDependencias;
	private String itemSelecionadoLista;
	private Integer dependenciaSelecionada;

	public ControleSaldosRecolhimentoBean(){
		listaMunicipios = new ArrayList<MunicipioDTO>();
		listaDependenciaSaldosRecolhimento = new ArrayList<DependenciasDTO>();
	}


	public String inicializaControleSaldosRecolhimento() {
		carregaComboEstados();
		estadoFiltro = "";
		mostraMunicipios = false;
		competencia = GissUtil.geraDataCompetencia();

		return "controleSaldosRecolhimento";
	}


	public  List<SelectItem> carregaComboEstados(){
		listaEstado = controleSaldosRecolhimentoImpl.listarComboEstados();

		return listaEstado;

	}

	public void carregaListaMunicipios(ActionEvent event){
		if(!estadoFiltro.equals("") && estadoFiltro != null){
			listarMunicipios();
		}else{			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado.", "controleSaldosRecolhimento", BradescoViewExceptionActionType.ACTION, false);
		}
	}

	private void listarMunicipios() {
		listaControleCheckRadio = new ArrayList<SelectItem>();

		try {

			listaMunicipios = controleSaldosRecolhimentoImpl.listarMunicipios(estadoFiltro);

			if (listaMunicipios != null) {

				for (int i = 0; i <= listaMunicipios.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}
				
				mostraMunicipios = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), limparTelaIncial(), BradescoViewExceptionActionType.ACTION, false);
		}
	}
	
	public String limparTelaIncial(){
		mostraMunicipios = false;
		setListaMunicipios(null);
		
		return "controleSaldosRecolhimento";
		
	}

	public void paginarListaMunicipio(ActionEvent event){
		listarMunicipios();
		setListaMunicipios(listaMunicipios);

	}	

	public void paginarListaControleSaldoRecolhimento(ActionEvent event){
		listarDependenciasControleSaldoRecolhimento();
		setListaDependenciaSaldosRecolhimento(listaDependenciaSaldosRecolhimento);

	}	

	public String carregaDependenciasControleSaldoRecolhimento(){
		GissUtil gissUtil = new GissUtil();

		mostraDependencias = false;

		estado = gissUtil.procuraUnidadeFederativa(listaEstado, estadoFiltro);		

		MunicipioDTO municipioDTO = listaMunicipios.get(new Integer(itemSelecionadoLista));
		codMunicipio = municipioDTO.getCodigo();
		municipio = codMunicipio + " - " + municipioDTO.getNome();


		if(listarDependenciasControleSaldoRecolhimento()) {
			return "controleSaldosRecolhimentoResultado";
		} else {
			listarMunicipios();
			return null;
		}
	}

	private boolean listarDependenciasControleSaldoRecolhimento() {
		try {

			ControleSaldosRecolhimentoDTO  controleSaldoRecDTO = controleSaldosRecolhimentoImpl.listarDependenciasControleSaldoRecolhim(codMunicipio, competencia);

			vencimento = controleSaldoRecDTO.getVencimento();
			pagtoDiaUtil = controleSaldoRecDTO.getPagtoDiaUtil();
			formaPagto = controleSaldoRecDTO.getFormaPagto();
			dataRecolhimento = controleSaldoRecDTO.getDataRecolhimento();

			listaDependenciaSaldosRecolhimento = controleSaldoRecDTO.getListaDependencias();

			listaDependenciasRadio = new ArrayList<SelectItem>();
			if (listaDependenciaSaldosRecolhimento != null) {

				for (int i = 0; i <= listaDependenciaSaldosRecolhimento.size(); i++) {
					listaDependenciasRadio.add(new SelectItem(i, " "));
				}

				mostraDependencias = true;
			}
			return true;
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "controleSaldosRecolhimento", BradescoViewExceptionActionType.ACTION, false);
		}
		return false;
	}

	public String enviarMensagem() {
		if (getDependenciaSelecionada() != null) {
			DependenciasDTO dependencia = getListaDependenciaSaldosRecolhimento().get(getDependenciaSelecionada());
			try {
				String protocolo = controleSaldosRecolhimentoImpl.enviarMensagem(dependencia);
				BradescoFacesUtils.addInfoModalMessage("Mensagem enviada com sucesso  - Protocolo: " + protocolo, false);
			} catch (EnvioMensagemException e) {
				if (e.getReturnCode() >= 1 || e.getReturnCode() <= 2) {
					BradescoFacesUtils.addInfoModalMessage("Erro no envio de e-mail. Favor verificar o Gerenciador de Logs de erro para maiores detalhes.", false);
				} else {
					BradescoFacesUtils.addInfoModalMessage("Serviço Temporariamente Indisponível. Por favor, tente novamente mais tarde.", false);
				}
			}
		}

		return null;
	}

	public String voltarPaginaInicial(){
		listarMunicipios();

		return "controleSaldosRecolhimento";
	}

	public String getDataRecolhimento() {
		return dataRecolhimento;
	}

	public void setDataRecolhimento(String dataRecolhimento) {
		this.dataRecolhimento = dataRecolhimento;
	}

	public String getFormaPagto() {
		return formaPagto;
	}

	public void setFormaPagto(String formaPagto) {
		this.formaPagto = formaPagto;
	}

	public String getPagtoDiaUtil() {
		return pagtoDiaUtil;
	}

	public void setPagtoDiaUtil(String pagtoDiaUtil) {
		this.pagtoDiaUtil = pagtoDiaUtil;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public boolean isMostraDependencias() {
		return mostraDependencias;
	}

	public void setMostraDependencias(boolean mostraDependencias) {
		this.mostraDependencias = mostraDependencias;
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

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public List<SelectItem> getListaEstado() {
		return listaEstado;
	}
	public void setListaEstado(List<SelectItem> listaEstado) {
		this.listaEstado = listaEstado;
	}

	public String getEstadoFiltro() {
		return estadoFiltro;
	}
	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public List<MunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<MunicipioDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public boolean isMostraMunicipios() {
		return mostraMunicipios;
	}

	public void setMostraMunicipios(boolean mostraMunicipios) {
		this.mostraMunicipios = mostraMunicipios;
	}

	public List<DependenciasDTO> getListaDependenciaSaldosRecolhimento() {
		return listaDependenciaSaldosRecolhimento;
	}
	public void setListaDependenciaSaldosRecolhimento(
			List<DependenciasDTO> listaDependenciaSaldosRecolhimento) {
		this.listaDependenciaSaldosRecolhimento = listaDependenciaSaldosRecolhimento;
	}

	public IConSaldosRecService getControleSaldosRecolhimentoImpl() {
		return controleSaldosRecolhimentoImpl;
	}

	public void setControleSaldosRecolhimentoImpl(
			IConSaldosRecService controleSaldosRecolhimentoImpl) {
		this.controleSaldosRecolhimentoImpl = controleSaldosRecolhimentoImpl;
	}

	public List<SelectItem> getListaDependenciasRadio() {
		return listaDependenciasRadio;
	}

	public void setListaDependenciasRadio(List<SelectItem> listaDependenciasRadio) {
		this.listaDependenciasRadio = listaDependenciasRadio;
	}

	public Integer getDependenciaSelecionada() {
		return dependenciaSelecionada;
	}

	public void setDependenciaSelecionada(Integer dependenciaSelecionada) {
		this.dependenciaSelecionada = dependenciaSelecionada;
	}

}
