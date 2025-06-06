package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;


public class ListaPorPaBean {
	
	private String totalReceita;
	private String totalIss;
	private List<ListaGenericaVO> lista = new ArrayList<ListaGenericaVO>();
	private IApuracaoMensalService apuracaoMensalServiceImpl;
	
	
	public String iniciaTela(TarifasCobradasVO parametro){
		lista.clear();
		totalReceita = "";
		totalIss = "";
		popular(parametro);
		return "listaPorPa";
	}
	
	public void popular(TarifasCobradasVO parametro){
		lista = apuracaoMensalServiceImpl.consultarRelacaoPa(parametro);
	}

	// GETTERS AND SETTERS //
	
	public String getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}

	public String getTotalIss() {
		return totalIss;
	}

	public void setTotalIss(String totalIss) {
		this.totalIss = totalIss;
	}

	public List<ListaGenericaVO> getLista() {
		return lista;
	}

	public void setLista(List<ListaGenericaVO> lista) {
		this.lista = lista;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

}
