package br.com.bradesco.web.giss.view.bean.controller.saldosdivergentes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.ISaldosDivergServiceConstants;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.ISaldosDivergentesService;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteContaDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteContaTotalDTO;
import br.com.bradesco.web.giss.service.business.saldosdivergentes.bean.SaldoDivergenteDependenciaTotalDTO;
import br.com.bradesco.web.giss.utils.GissUtil;

public class SaldosDivergentesBean {

	private ISaldosDivergentesService saldosDivergentesImpl;			//referente a interface
	private SaldoDivergenteContaTotalDTO listaSaldosDivergentes;
	private SaldoDivergenteDependenciaTotalDTO listaSaldosDivergentesDependencia;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private boolean mostraSaldosDivergentes;
	private boolean mostraBotoes;
	private String itemSelecionadoLista;
	private String competencia;
	private BigDecimal totalApuracao;
	private BigDecimal totalContabil;
	private long conta;
	private String dataSaidaResultado; 
	private BigDecimal totalApuracaoResultado;
	private BigDecimal totalContabilResultado;


	public String inicializaSaldosDivergentes(){

		mostraSaldosDivergentes = false;
		mostraBotoes = false;
		listaSaldosDivergentes = null;
		itemSelecionadoLista = "";
		
		competencia = GissUtil.geraDataCompetencia();
		totalContabil = BigDecimal.ZERO;
		totalApuracao = BigDecimal.ZERO;

		return "saldosDivergentes";

	}
	
	public void limparTela() {
		mostraSaldosDivergentes = false;
		mostraBotoes = false;
		listaSaldosDivergentes = null;
		itemSelecionadoLista = "";
		totalContabil = BigDecimal.ZERO;
		totalApuracao = BigDecimal.ZERO;
	}
	
	public void carregaListaSaldoDivergentesConta(){

		if(competencia == null){
			BradescoFacesUtils.addInfoModalMessage("Preencha o campo data do processamento", "saldosDivergentes", BradescoViewExceptionActionType.ACTION, false);
		}
		else{
			
			listaSaldosDivergentes = new SaldoDivergenteContaTotalDTO();
			
			try{	
				listaSaldosDivergentes = saldosDivergentesImpl.listarSaldoDivergenteConta(competencia.replace("/", ""));

				if(listaSaldosDivergentes != null){

					for (int i = 0; i <= listaSaldosDivergentes.getListaSaldoDivergenteContaDTO().size(); i++) {
						listaControleCheckRadio.add(new SelectItem(i, " "));
					}

					if (listaSaldosDivergentes.getListaSaldoDivergenteContaDTO().size() >= ISaldosDivergServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_SALDO_DIVERGENTES_CONTA) {
						mostraSaldosDivergentes = true;
					} else {
						mostraSaldosDivergentes = false;
					}

				}

				setTotalApuracao(listaSaldosDivergentes.getTotalApuracao());
				setTotalContabil(listaSaldosDivergentes.getTotalContabil());

			} catch (PdcAdapterFunctionalException p) {
				limparTela();
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			} 

		}
	}


	public String pesquisar(ActionEvent evt){

		carregaListaSaldoDivergentesConta();
		setListaSaldosDivergentes(listaSaldosDivergentes);

		return "saldosDivergentes";
	}

	public String pesquisarVoltar(){

		return "saldosDivergentes";
	}

	public String consultar(){
		SaldoDivergenteContaDTO saldoDivergenteContaTotalDTO = getListaSaldosDivergentes().getListaSaldoDivergenteContaDTO().get(new Integer(itemSelecionadoLista));
		setConta(saldoDivergenteContaTotalDTO.getConta());
		
		if (carregaListaSaldoDivergenciaDependencia()) {
			return "CONSULTAR_SALDOS_DIVERGENTES";
		}

		return null;
	}

	public boolean carregaListaSaldoDivergenciaDependencia(){
		
		listaSaldosDivergentesDependencia = new SaldoDivergenteDependenciaTotalDTO();
		
		try{
			listaSaldosDivergentesDependencia = saldosDivergentesImpl.listarSaldoDivergenteDependencia(conta,competencia.replace("/",""));

			if(listaSaldosDivergentesDependencia != null){
				

				if (listaSaldosDivergentesDependencia.getListaSaldoDivergenteDependenciaDTO().size() >= ISaldosDivergServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_SALDO_DIVERGENTES_CONTA) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

			}
			
			setTotalApuracaoResultado(listaSaldosDivergentesDependencia.getTotalApuracao());
			setTotalContabilResultado(listaSaldosDivergentesDependencia.getTotalContabil());


		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			return false;
		}

		return true;
	}

	public String pesquisarResultado(ActionEvent evt){

		carregaListaSaldoDivergenciaDependencia();
		setListaSaldosDivergentesDependencia(listaSaldosDivergentesDependencia);

		return "CONSULTAR_SALDOS_DIVERGENTES";
	}


	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	
	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	
	public SaldoDivergenteContaTotalDTO getListaSaldosDivergentes() {
		return listaSaldosDivergentes;
	}

	public void setListaSaldosDivergentes(
			SaldoDivergenteContaTotalDTO listaSaldosDivergentes) {
		this.listaSaldosDivergentes = listaSaldosDivergentes;
	}

	public BigDecimal getTotalApuracao() {
		return totalApuracao;
	}

	public void setTotalApuracao(BigDecimal totalApuracao) {
		this.totalApuracao = totalApuracao;
	}

	public BigDecimal getTotalContabil() {
		return totalContabil;
	}

	public void setTotalContabil(BigDecimal totalContabil) {
		this.totalContabil = totalContabil;
	}

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}

	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	
	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public boolean isMostraSaldosDivergentes() {
		return mostraSaldosDivergentes;
	}

	public void setMostraSaldosDivergentes(boolean mostraSaldosDivergentes) {
		this.mostraSaldosDivergentes = mostraSaldosDivergentes;
	}

	public ISaldosDivergentesService getSaldosDivergentesImpl() {
		return saldosDivergentesImpl;
	}

	public void setSaldosDivergentesImpl(
			ISaldosDivergentesService saldosDivergentesImpl) {
		this.saldosDivergentesImpl = saldosDivergentesImpl;
	}


	public long getConta() {
		return conta;
	}

	public void setConta(long conta) {
		this.conta = conta;
	}

	public SaldoDivergenteDependenciaTotalDTO getListaSaldosDivergentesDependencia() {
		return listaSaldosDivergentesDependencia;
	}

	public void setListaSaldosDivergentesDependencia(
			SaldoDivergenteDependenciaTotalDTO listaSaldosDivergentesDependencia) {
		this.listaSaldosDivergentesDependencia = listaSaldosDivergentesDependencia;
	}

	public String getDataSaidaResultado() {
		return dataSaidaResultado;
	}

	public void setDataSaidaResultado(String dataSaidaResultado) {
		this.dataSaidaResultado = dataSaidaResultado;
	}

	public BigDecimal getTotalApuracaoResultado() {
		return totalApuracaoResultado;
	}

	public void setTotalApuracaoResultado(BigDecimal totalApuracaoResultado) {
		this.totalApuracaoResultado = totalApuracaoResultado;
	}

	public BigDecimal getTotalContabilResultado() {
		return totalContabilResultado;
	}

	public void setTotalContabilResultado(BigDecimal totalContabilResultado) {
		this.totalContabilResultado = totalContabilResultado;
	}

}
