package br.com.bradesco.web.giss.view.bean.controller.valormestotal;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import net.sf.jasperreports.engine.JRException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.valormestotal.IValorMesTotalService;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSDTO;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSTotalDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class ValorMesTotalBean {

	private ILogManager logger;	
	private IValorMesTotalService valorMesTotalServiceImpl;
	private IUtilidadesService utilidadesServiceImpl;
	private DemonstrativoISSTotalDTO listaContasCompetencia = new DemonstrativoISSTotalDTO();
	private BigDecimal totalReceita;
	private BigDecimal totalIss;
	private Integer filtro = 1;
	private String mesFiltro;
	private String anoFiltro;
	private String mesAnoCompetencia;
	private boolean razaoExiste = true;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private Long cosif;
	private String razao;
	private Integer radioTelaConta;
	private DemonstrativoISSTotalDTO listaContasCompetenciaConta;
	private BigDecimal totalReceitaConta;
	private BigDecimal totalIssConta;
	
	
	public String inicializaValoresMesTotal() {
		mesFiltro = null;
		anoFiltro = null;
		filtro = 1;
		listaContasCompetencia = new DemonstrativoISSTotalDTO();
		return "valorMesTotalInicial";
	}
	

	public String carregaListaDemonstrativo(){
		if(mesFiltro.equals("") || anoFiltro.equals("")){
			BradescoFacesUtils.addInfoModalMessage("Digite a competência.", "valorMesTotalInicial", BradescoViewExceptionActionType.ACTION, false);
			return null;
		}
		radioTelaConta = null;
		if(listarDemonstrativoValorMesTotal()) {
			return "PROSSEGUIR_VALOR_MES_TOTAL";
		}

		return null;
	}
	
	public String carregaListaDemonstrativoConta(){
		if(radioTelaConta == null){
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item.", false);
			return null;
		}
		
		if(listarDemonstrativoValorMesTotalConta()) {
			return "PROSSEGUIR_VALOR_MES_TOTAL_CONTA";
		}

		return null;
	}
	
	public String voltar() {
		listaContasCompetencia = new DemonstrativoISSTotalDTO();
		return "valorMesTotalInicial";
	}
	
	public String voltarConta() {
		listaContasCompetenciaConta = new DemonstrativoISSTotalDTO();
		return "PROSSEGUIR_VALOR_MES_TOTAL";
	}

	private boolean listarDemonstrativoValorMesTotal() {
		try {
			String 	mesAnoCompetencia;
			
			mesAnoCompetencia = mesFiltro + anoFiltro;
			
			listaContasCompetencia = valorMesTotalServiceImpl.listarDemonstrativoISS(mesAnoCompetencia, filtro);

			if (!listaContasCompetencia.getListaDemonstrativoISSDTO().isEmpty()) {
				if (listaContasCompetencia.getListaDemonstrativoISSDTO().get(0).getCodigoGrupo() <= 0 ||
					listaContasCompetencia.getListaDemonstrativoISSDTO().get(0).getCodigoSubGrupo() <= 0) {
					razaoExiste = false;
				}
				else{
					razaoExiste = true;
				}
			}
			for (int i = 0; i <= listaContasCompetencia.getListaDemonstrativoISSDTO().size(); i++) {
				listaControleCheckRadio.add(new SelectItem(String.valueOf(i), " "));
			}
			
			totalReceita = listaContasCompetencia.getTotalReceita();
			totalIss = listaContasCompetencia.getTotalIss();

		} catch (PdcAdapterFunctionalException p) {
			listaContasCompetencia = new DemonstrativoISSTotalDTO();
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "valorMesTotalInicial", BradescoViewExceptionActionType.ACTION, false);
			return false;
		} 
		
		return true;
	}
	
	private boolean listarDemonstrativoValorMesTotalConta() {
		try {
			String 	mesAnoCompetencia;
			
			mesAnoCompetencia = mesFiltro + anoFiltro;
			DemonstrativoISSDTO itemSelecionado = listaContasCompetencia.getListaDemonstrativoISSDTO().get(radioTelaConta);
			listaContasCompetenciaConta = valorMesTotalServiceImpl.listarDemonstrativoISSConta(mesAnoCompetencia, filtro, itemSelecionado.getRazao(), itemSelecionado.getCosif());

			totalReceitaConta = listaContasCompetenciaConta.getTotalReceita();
			totalIssConta = listaContasCompetenciaConta.getTotalIss();

		} catch (PdcAdapterFunctionalException p) {
			listaContasCompetenciaConta = new DemonstrativoISSTotalDTO();
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "PROSSEGUIR_VALOR_MES_TOTAL", BradescoViewExceptionActionType.ACTION, false);
			return false;
		} 
		
		return true;
	}

	public void paginarListaDemonstrativo(ActionEvent event){

		listarDemonstrativoValorMesTotal();
		setListaContasCompetencia(listaContasCompetencia);

	}

	public void imprimir(ActionEvent ae){

		try {
			Map<Object, Object> ht = new HashMap<Object, Object>();
			ht.put("TOTAL_RECEITA", totalReceita);
			ht.put("TOTAL_ISS", totalIss);
			ht.put("RAZAO_EXISTE", razaoExiste);
			
			GissUtil.gerarPDF("valoresMesTotal", "VALORES_MES_TOTAL", listaContasCompetencia.getListaDemonstrativoISSDTO(),ht);
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	
	public void imprimirConta(ActionEvent ae){

		try {
			Map<Object, Object> ht = new HashMap<Object, Object>();
			ht.put("TOTAL_RECEITA", totalReceitaConta);
			ht.put("TOTAL_ISS", totalIssConta);
			ht.put("RAZAO_EXISTE", razaoExiste);
			
			GissUtil.gerarPDF("valoresMesTotalConta", "VALORES_MES_TOTAL_CONTA", listaContasCompetenciaConta.getListaDemonstrativoISSDTO(),ht);
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	public void imprimirPlanilhaEletronica(ActionEvent ae){
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("VALOR_MES", "Valores Mês Total");
		try {
			exportarPlanilha.valorMesTotal(listaContasCompetencia,razaoExiste);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "valorMesTotalInicial", BradescoViewExceptionActionType.ACTION, false);
		}
	}
	
	public void imprimirPlanilhaEletronicaConta(ActionEvent ae){
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("VALOR_MES_NIVEL_CONTA", "Valores Mês Total Nível Conta");
		try {
			exportarPlanilha.valorMesTotalConta(listaContasCompetenciaConta,razaoExiste);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), "", BradescoViewExceptionActionType.ACTION, false);
		}
	}
	
	public IValorMesTotalService getValorMesTotalServiceImpl() {
		return valorMesTotalServiceImpl;
	}

	public void setValorMesTotalServiceImpl(
			IValorMesTotalService valorMesTotalServiceImpl) {
		this.valorMesTotalServiceImpl = valorMesTotalServiceImpl;
	}


	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public DemonstrativoISSTotalDTO getListaContasCompetencia() {
		return listaContasCompetencia;
	}

	public void setListaContasCompetencia(
			DemonstrativoISSTotalDTO listaContasCompetencia) {
		this.listaContasCompetencia = listaContasCompetencia;
	}

	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public String getMesAnoCompetencia() {
		return mesAnoCompetencia;
	}

	public void setMesAnoCompetencia(String mesAnoCompetencia) {
		this.mesAnoCompetencia = mesAnoCompetencia;
	}

	public BigDecimal getTotalIss() {
		return totalIss;
	}

	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}

	public BigDecimal getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}

	public boolean isRazaoExiste() {
		return razaoExiste;
	}

	public void setRazaoExiste(boolean razaoExiste) {
		this.razaoExiste = razaoExiste;
	}

	public Integer getFiltro() {
		return filtro;
	}

	public void setFiltro(Integer filtro) {
		this.filtro = filtro;
	}

	/**
	 * @return the cosif
	 */
	public Long getCosif() {
		return cosif;
	}

	/**
	 * @param cosif the cosif to set
	 */
	public void setCosif(Long cosif) {
		this.cosif = cosif;
	}

	/**
	 * @return the razao
	 */
	public String getRazao() {
		return razao;
	}

	/**
	 * @param razao the razao to set
	 */
	public void setRazao(String razao) {
		this.razao = razao;
	}

	/**
	 * @return the utilidadesServiceImpl
	 */
	public IUtilidadesService getUtilidadesServiceImpl() {
		return utilidadesServiceImpl;
	}

	/**
	 * @param utilidadesServiceImpl the utilidadesServiceImpl to set
	 */
	public void setUtilidadesServiceImpl(IUtilidadesService utilidadesServiceImpl) {
		this.utilidadesServiceImpl = utilidadesServiceImpl;
	}


	/**
	 * @return the listaControleCheckRadio
	 */
	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}


	/**
	 * @param listaControleCheckRadio the listaControleCheckRadio to set
	 */
	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}


	/**
	 * @return the listaContasCompetenciaConta
	 */
	public DemonstrativoISSTotalDTO getListaContasCompetenciaConta() {
		return listaContasCompetenciaConta;
	}


	/**
	 * @param listaContasCompetenciaConta the listaContasCompetenciaConta to set
	 */
	public void setListaContasCompetenciaConta(DemonstrativoISSTotalDTO listaContasCompetenciaConta) {
		this.listaContasCompetenciaConta = listaContasCompetenciaConta;
	}


	/**
	 * @return the radioTelaConta
	 */
	public Integer getRadioTelaConta() {
		return radioTelaConta;
	}


	/**
	 * @param radioTelaConta the radioTelaConta to set
	 */
	public void setRadioTelaConta(Integer radioTelaConta) {
		this.radioTelaConta = radioTelaConta;
	}


	/**
	 * @return the totalReceitaConta
	 */
	public BigDecimal getTotalReceitaConta() {
		return totalReceitaConta;
	}


	/**
	 * @param totalReceitaConta the totalReceitaConta to set
	 */
	public void setTotalReceitaConta(BigDecimal totalReceitaConta) {
		this.totalReceitaConta = totalReceitaConta;
	}


	/**
	 * @return the totalIssConta
	 */
	public BigDecimal getTotalIssConta() {
		return totalIssConta;
	}


	/**
	 * @param totalIssConta the totalIssConta to set
	 */
	public void setTotalIssConta(BigDecimal totalIssConta) {
		this.totalIssConta = totalIssConta;
	}

}
