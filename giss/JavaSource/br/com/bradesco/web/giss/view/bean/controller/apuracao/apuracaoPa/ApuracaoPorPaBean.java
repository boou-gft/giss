package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;

/**
 * Back Bean da tela de Apuracao Mensal de ISS
 * 
 * @author Renato Mariscal
 * 
 */
public class ApuracaoPorPaBean extends FiltroGenericoGISSBean {

	private static final long serialVersionUID = 1L;
	private String descricao;
	private Integer codigoSimNao;
	private MunicipioDTO municipioSelecionado;
	private String estadoSelecionado;
	private List<MunicipioDTO> listaMunicipios;
	private List<SelectItem> listaMunicipiosRadio = new ArrayList<SelectItem>();
	private ListaPorPaBean listaPorPaBean = new ListaPorPaBean();
	
	private IApuracaoMensalService apuracaoMensalServiceImpl = null;

	/**
	 * Chamado pelo Menu, inicializa os componentes necessarios na tela
	 * 
	 * @return
	 */
	public String iniciarPagina() {
		super.inicializaFiltroGenerico();
		setCodigoSimNao(1);
		return "apuracaoPorPa";
	}
	

	public String consultar() {
		TarifasCobradasVO parametro = new TarifasCobradasVO();
		parametro.setUf(getEstadoFiltro());
		parametro.setCodigoSimNao(getCodigoSimNao());
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioManter();
			parametro.setCodMunicipio(buscaMunicipio.getCodigo() != null ? buscaMunicipio.getCodigo() : 0l);
			return listaPorPaBean.iniciaTela(parametro);
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioManter();
			return"";
		}else if(!estadoFiltro.equals("") && estadoFiltro != null){
			parametro.setCodMunicipio(buscaMunicipio.getCodigo() != null ? buscaMunicipio.getCodigo() : 0l);
			return listaPorPaBean.iniciaTela(parametro);
		}else{			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
			return "";
		}
		
		
	}
	
	
	// getters and setters
	public Integer getCodigoSimNao() {
		return codigoSimNao;
	}

	public void setCodigoSimNao(Integer codigoSimNao) {
		this.codigoSimNao = codigoSimNao;
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


	public ListaPorPaBean getListaPorPaBean() {
		return listaPorPaBean;
	}


	public void setListaPorPaBean(ListaPorPaBean listaPorPaBean) {
		this.listaPorPaBean = listaPorPaBean;
	}

}
