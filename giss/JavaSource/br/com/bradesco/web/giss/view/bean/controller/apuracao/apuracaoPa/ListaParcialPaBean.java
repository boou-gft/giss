package br.com.bradesco.web.giss.view.bean.controller.apuracao.apuracaoPa;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaomensal.IApuracaoMensalService;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaGenericaVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.TarifasCobradasVO;


public class ListaParcialPaBean {
	
	private String totalReceita;
	private List<ListaGenericaVO> lista = new ArrayList<ListaGenericaVO>();
	private String voltar = "";
	private IApuracaoMensalService apuracaoMensalServiceImpl = null;
	
	// menu processamento consulta 
	public String iniciaTela(TarifasCobradasVO item, String parametro){
		lista.clear();
		totalReceita = "";
		voltar = parametro;
		popular(item);
		return "listaParcialPa";
	}
	
	// menu processamento apuração 
	public String iniciaTelaApuracao(String parametro){
		lista.clear();
		totalReceita = "";
		voltar = parametro;
		return "listaPa";
	}
	
	public void popular(TarifasCobradasVO item){
		lista = apuracaoMensalServiceImpl.consultaApuracaoParcialIss(item);
	}
	
	public String voltar(){
		if(voltar.equalsIgnoreCase("P")){
			return "parcialPa";
		}
		
		if(voltar.equalsIgnoreCase("C")){
			return "consultaPa";
		}
		
		if(voltar.equalsIgnoreCase("AP")){
			return "apuracaoParcialPa";
		}
		
		if(voltar.equalsIgnoreCase("R")){
			return "apuracaoPorPa";
		}
		return null;
	}

	// GETTERS AND SETTERS //
	
	public String getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
	}

	public List<ListaGenericaVO> getLista() {
		return lista;
	}

	public void setLista(List<ListaGenericaVO> lista) {
		this.lista = lista;
	}

	public String getVoltar() {
		return voltar;
	}

	public void setVoltar(String voltar) {
		this.voltar = voltar;
	}

	public IApuracaoMensalService getApuracaoMensalServiceImpl() {
		return apuracaoMensalServiceImpl;
	}

	public void setApuracaoMensalServiceImpl(IApuracaoMensalService apuracaoMensalServiceImpl) {
		this.apuracaoMensalServiceImpl = apuracaoMensalServiceImpl;
	}

}
