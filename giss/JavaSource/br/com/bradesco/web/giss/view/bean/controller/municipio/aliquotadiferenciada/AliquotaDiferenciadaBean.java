package br.com.bradesco.web.giss.view.bean.controller.municipio.aliquotadiferenciada;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.IAliquotaDiferenciadaService;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.bean.AliquotaDifResultadoDTO;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.bean.AliquotaDiferenciadaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.utils.GissUtil;

public class AliquotaDiferenciadaBean {

	

	private List<AliquotaDifResultadoDTO> listaAliquotaResultado;
	private List<AliquotaDiferenciadaDTO> listaAliquotaDif;
	private boolean carregalistaAliquotaDif;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();	
	private String codigo;
	private String descricao;
	private String conta;
	private String item;
	private String padrao;
	private String diferenciada;
	private String descricaoConta;
	private int radioTelaAliquotaDiferenciada;
	private IAliquotaDiferenciadaService aliquotaDiferencImpl;	
	GissUtil gissUtil = new GissUtil();
	private Integer codMunicipioFiltroNovos;
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private String estadoFiltro;

	public List<SelectItem> carregaComboEstados() {
		listaEstados = dependenciaImpl.listarComboEstados();
		
		return listaEstados;
	}




	public String inicializaAliquotaDiferenciada(){
		codMunicipioFiltroNovos = null;
		estadoFiltro = "0";
		listaAliquotaDif = new ArrayList<AliquotaDiferenciadaDTO>();
		carregaComboEstados();
		carregaListaAliquotaDiferenciada();
		return "aliquotaDiferenciada";
	}


	public void carregaListaAliquotaDiferenciada(){

		listaAliquotaDif();	

	}


	private void listaAliquotaDif() {
		listaAliquotaDif = aliquotaDiferencImpl.listaGridAliquotaDiferenciada(codMunicipioFiltroNovos != null?codMunicipioFiltroNovos:0L, estadoFiltro != null && !estadoFiltro.equals("")?Integer.valueOf(estadoFiltro):0);

		if (listaAliquotaDif != null) {
			listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaAliquotaDif);
			carregalistaAliquotaDif = true;
		}
	}

	public void carregaAliquotaDifResultado() {

		listaAliquotaResultado();
	}


	private void listaAliquotaResultado(){


		try {
			listaAliquotaResultado = aliquotaDiferencImpl.listaGridAliquotaDiferenciadaResultado(codigo);
			if (listaAliquotaResultado != null) {
				listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaAliquotaResultado);
				carregalistaAliquotaDif = true;
			}
		}catch(PdcAdapterFunctionalException pafe){
			pafe.getCode();
			if(pafe.getCode().endsWith("GISS0003")){
				BradescoFacesUtils.addInfoModalMessage(pafe.getMessage(), "aliquotaDiferenciada", BradescoViewExceptionActionType.ACTION, false);
			}
		}catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}



	public String prosseguir(){		
		carregaInformacoesMunicipio();		
		carregaAliquotaDifResultado();
		return "aliquotaDiferenciadaResultado";
	}

	public void carregaInformacoesMunicipio(){
		AliquotaDiferenciadaDTO dto = (AliquotaDiferenciadaDTO) getListaAliquotaDif().get(getRadioTelaAliquotaDiferenciada());
		setDescricao(dto.getDescricao());
		setCodigo(dto.getCodigo());
	}
	
	public String voltar(){		
		listaControleCheckRadio = GissUtil.preencherSelectItemsMunicipio(listaAliquotaDif);
		return "VOLTAR";		
	}
	
	
	
	
	
	
	
	
	

	public List<AliquotaDiferenciadaDTO> getListaAliquotaDif() {
		return listaAliquotaDif;
	}

	public void setListaAliquotaDif(
			List<AliquotaDiferenciadaDTO> listaAliquotaDif) {
		this.listaAliquotaDif = listaAliquotaDif;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}


	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public IAliquotaDiferenciadaService getAliquotaDiferencImpl() {
		return aliquotaDiferencImpl;
	}

	public void setAliquotaDiferencImpl(
			IAliquotaDiferenciadaService aliquotaDiferencImpl) {
		this.aliquotaDiferencImpl = aliquotaDiferencImpl;
	}

	public boolean isCarregalistaAliquotaDif() {
		return carregalistaAliquotaDif;
	}


	public void setCarregalistaAliquotaDif(boolean carregalistaAliquotaDif) {
		this.carregalistaAliquotaDif = carregalistaAliquotaDif;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getRadioTelaAliquotaDiferenciada() {
		return radioTelaAliquotaDiferenciada;
	}

	public void setRadioTelaAliquotaDiferenciada(int radioTelaAliquotaDiferenciada) {
		this.radioTelaAliquotaDiferenciada = radioTelaAliquotaDiferenciada;
	}

	public List<AliquotaDifResultadoDTO> getListaAliquotaResultado() {
		return listaAliquotaResultado;
	}


	public void setListaAliquotaResultado(
			List<AliquotaDifResultadoDTO> listaAliquotaResultado) {
		this.listaAliquotaResultado = listaAliquotaResultado;
	}
	
	public String pesquisar(ActionEvent evt){
		
		carregaAliquotaDifResultado();
		setListaAliquotaResultado(listaAliquotaResultado);
		return "PROSSEGUIR";
	}
	
	public String pesquisarAliquota(ActionEvent evt){
		
		carregaListaAliquotaDiferenciada();
		setListaAliquotaDif(listaAliquotaDif);
		return "PROSSEGUIR";
	}



	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getDiferenciada() {
		return diferenciada;
	}


	public void setDiferenciada(String diferenciada) {
		this.diferenciada = diferenciada;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getPadrao() {
		return padrao;
	}


	public void setPadrao(String padrao) {
		this.padrao = padrao;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}


	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}


	public Integer getCodMunicipioFiltroNovos() {
		return codMunicipioFiltroNovos;
	}


	public void setCodMunicipioFiltroNovos(Integer codMunicipioFiltroNovos) {
		this.codMunicipioFiltroNovos = codMunicipioFiltroNovos;
	}


	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}


	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}




	public String getEstadoFiltro() {
		return estadoFiltro;
	}




	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

}
