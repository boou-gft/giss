package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;


public class ApuracaoParcialPeriodoBean extends FiltroGenericoGISSBean {
	
	private Integer codigoSimNao;
	private Date dataInicio = null;
	private Date dataFim = null;
	private ListaParcialPaBean listaParcialPaBean = new ListaParcialPaBean();
	private static final long serialVersionUID = 1L;
	private String descricao;
	private MunicipioDTO municipioSelecionado;
	private String estadoSelecionado;
	private List<MunicipioDTO> listaMunicipios;
	private List<SelectItem> listaMunicipiosRadio = new ArrayList<SelectItem>();
	private IApuracaoMensalService apuracaoMensalServiceImpl = null;
	
	
	public String iniciaTela(){
		
		codigoSimNao = null;
		super.inicializaFiltroGenerico();
		setCodigoSimNao(1);
		return "apuracaoParcialPa";
	}
	
	public String consultar(){
		TarifasCobradasVO parametro = new TarifasCobradasVO();
		parametro.setCalendarioDe(dataInicio);
		parametro.setCalendarioAte(dataFim);
		parametro.setUf(getEstadoFiltro());
		parametro.setCodigoSimNao(getCodigoSimNao());
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioManter();
			parametro.setCodMunicipio(buscaMunicipio.getCodigo() != null ? buscaMunicipio.getCodigo() : 0l);
			return listaParcialPaBean.iniciaTela(parametro, "AP");
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioManter();
			return"";
		}else if(!estadoFiltro.equals("") && estadoFiltro != null){
			parametro.setCodMunicipio(buscaMunicipio.getCodigo() != null ? buscaMunicipio.getCodigo() : 0l);
			return listaParcialPaBean.iniciaTela(parametro, "AP");
		}else{			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
			return "";
		}
	}
	

	// GETTERS AND SETTERS //

	public Integer getCodigoSimNao() {
		return codigoSimNao;
	}

	public void setCodigoSimNao(Integer codigoSimNao) {
		this.codigoSimNao = codigoSimNao;
	}

	public ListaParcialPaBean getListaParcialPaBean() {
		return listaParcialPaBean;
	}

	public void setListaParcialPaBean(ListaParcialPaBean listaParcialPaBean) {
		this.listaParcialPaBean = listaParcialPaBean;
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

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
