package br.com.bradesco.web.giss.view.bean.controller.tarifas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;

public class TarifasCobradasBean extends FiltroGenericoGISSBean {
	
	private Date calendarioAte;
	private Date calendarioDe;
	private Integer codigoSelecionado;
	private ListaTarifasCobradasBean listaTarifasCobradasBean = new ListaTarifasCobradasBean();
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	private static final long serialVersionUID = 1L;
	private String descricao;
	private MunicipioDTO municipioSelecionado;
	private String estadoSelecionado;
	private List<MunicipioDTO> listaMunicipios;
	private List<SelectItem> listaMunicipiosRadio = new ArrayList<SelectItem>();
	private Integer juncaoAgencia;
	private Integer codigoPa;
	private String estadoPa;
	private Integer tipoPesquisa;
	private boolean consolidado;
	private Integer codigoTipoRelatorio;
	
	public String iniciaTela(){
		super.inicializaFiltroGenerico();
		calendarioAte = null;
		calendarioDe = null;
		codigoSelecionado = 0;
		juncaoAgencia = null;
		codigoPa = null;
		tipoPesquisa = 1;
		consolidado = false;
		codigoTipoRelatorio = 0;
		return "tarifasCobradas";
	}

	public void gerarRelarorioEos (){
		
		if( (calendarioDe == null) && (calendarioAte == null) ){
			BradescoFacesUtils.addInfoModalMessage("Preencher os campos Data Inicio e Data Fim!", false);
			return;
		}
			
		if((estadoFiltro != null && !"".equals(estadoFiltro)) && (buscaMunicipio.getCodigo() == null || buscaMunicipio.getCodigo() == 0)){
			BradescoFacesUtils.addInfoModalMessage("Preencher o campo Código Município!", false);
			return;
		}
		
		if((codigoPa != null && codigoPa > 0) && (juncaoAgencia == null || juncaoAgencia == 0)){
			BradescoFacesUtils.addInfoModalMessage("Preencher o campo Junção da Ag.Relacionamento!", false);
			return;
		}
		
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipio();
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
			chamarEsvb();
			return;
		}
		
		if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipio();
			return;
		}
		
		boolean informacaoMunicipioPreenchida = buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0;
		boolean informacaoAgenciaPaPreenchida = codigoPa != null && codigoPa > 0 && juncaoAgencia != null && juncaoAgencia != 0;
		
		if(!informacaoMunicipioPreenchida && !informacaoAgenciaPaPreenchida) {
			BradescoFacesUtils.addInfoModalMessage("Preencher os campos de Junção/PA ou de Município!", false);
			return;
		}
		
		chamarEsvb();
	}

	private void chamarEsvb() {
		try{
			TarifasCobradasVO entrada = new TarifasCobradasVO();
			entrada.iniciar();
			
			entrada.setCalendarioAte(getCalendarioAte());
			entrada.setCalendarioDe(getCalendarioDe());
			entrada.setCodigoSelecionado(getCodigoSelecionado());
			entrada.setCdTipoPesquisa(consolidado ? 1 : 2);
			entrada.setCdJuncao(getJuncaoAgencia());
			entrada.setCdUfJuncao(codigoPa);
			entrada.setCdMunicipioJuncao(getBuscaMunicipio().getCodigo());
			entrada.setCdTipoRelatorio(getCodigoTipoRelatorio() == 0 ? "A" : "S");
			
			TarifasCobradasVO saida = new TarifasCobradasVO();
			saida = apuracaoMensalServiceImpl.consultarTarifasCobradas(entrada);
			
			BradescoFacesUtils.addInfoModalMessage(saida.getMensagem(), false);
		
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
	}
	
	public void buscaMunicipio(){
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(estadoFiltro.equals(listaDosEstados.get(i).getCodigo()))
				uf = listaDosEstados.get(i).getSigla();
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscar();
	}
	
	// GETTERS AND SETTERS //

	public Date getCalendarioAte() {
		return calendarioAte;
	}

	public void setCalendarioAte(Date calendarioAte) {
		this.calendarioAte = calendarioAte;
	}

	public Date getCalendarioDe() {
		return calendarioDe;
	}

	public void setCalendarioDe(Date calendarioDe) {
		this.calendarioDe = calendarioDe;
	}


	public Integer getCodigoSelecionado() {
		return codigoSelecionado;
	}



	public void setCodigoSelecionado(Integer codigoSelecionado) {
		this.codigoSelecionado = codigoSelecionado;
	}



	public ListaTarifasCobradasBean getListaTarifasCobradasBean() {
		return listaTarifasCobradasBean;
	}



	public void setListaTarifasCobradasBean(ListaTarifasCobradasBean listaTarifasCobradasBean) {
		this.listaTarifasCobradasBean = listaTarifasCobradasBean;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MunicipioDTO getMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public void setMunicipioSelecionado(MunicipioDTO municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public String getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(String estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public List<MunicipioDTO> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<MunicipioDTO> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public List<SelectItem> getListaMunicipiosRadio() {
		return listaMunicipiosRadio;
	}

	public void setListaMunicipiosRadio(List<SelectItem> listaMunicipiosRadio) {
		this.listaMunicipiosRadio = listaMunicipiosRadio;
	}

	public Integer getJuncaoAgencia() {
		return juncaoAgencia;
	}

	public void setJuncaoAgencia(Integer juncaoAgencia) {
		this.juncaoAgencia = juncaoAgencia;
	}

	public Integer getCodigoPa() {
		return codigoPa;
	}

	public void setCodigoPa(Integer codigoPa) {
		this.codigoPa = codigoPa;
	}

	public String getEstadoPa() {
		return estadoPa;
	}

	public void setEstadoPa(String estadoPa) {
		this.estadoPa = estadoPa;
	}

	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}

	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	/**
	 * Get: consolidado
	 * @return the consolidado
	 */
	public boolean isConsolidado() {
		return consolidado;
	}

	/**
	 * Set: consolidado
	 * @param consolidado the consolidado to set
	 */
	public void setConsolidado(boolean consolidado) {
		this.consolidado = consolidado;
	}

	public Integer getCodigoTipoRelatorio() {
		return codigoTipoRelatorio;
	}

	public void setCodigoTipoRelatorio(Integer codigoTipoRelatorio) {
		this.codigoTipoRelatorio = codigoTipoRelatorio;
	}
	
	

}
