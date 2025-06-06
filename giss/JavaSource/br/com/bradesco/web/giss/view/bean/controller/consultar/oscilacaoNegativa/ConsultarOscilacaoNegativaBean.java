package br.com.bradesco.web.giss.view.bean.controller.consultar.oscilacaoNegativa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.IConsultarApuracaoOscilacaoNegativaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ConsultarOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ContasOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.listarempresa.IListarEmpresaService;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.converter.FormatarData;

public class ConsultarOscilacaoNegativaBean {

	private Date competenciaFiltro; 	
	private String competenciaFiltroFormat;
	private String dataCompetenciaEnviada;
	private String itemSelecionadoLista;	
	private String dependencia;
	private String municipio;
	private int dataCompetencia;
	private BigDecimal labelTotalAtual;
	private BigDecimal labelTotalAnterior;
	private BigDecimal labelTotalOscilacao;
	private boolean mostraTable;
	private List<ConsultarOscilacaoNegativaDTO> listaOscilacao = new ArrayList<ConsultarOscilacaoNegativaDTO>();
	private List<ContasOscilacaoNegativaDTO> listaContas;
	private List<SelectItem> listaDependenciaRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaContaRadio;
	private IConsultarApuracaoOscilacaoNegativaService consultarOscilacaoNegativaImpl;
	private String mesFiltro;
	private String anoFiltro;
	private int numeroSequencial;
	private long codigoPessoaJuridica;
	private String totalAnterior;
	private String totalAtual;
	private String totalOscilacao;
	private BigDecimal totalAnteriorAcumulado;
	private BigDecimal totalAtualAcumulado;
	private BigDecimal totalOscilacaoAcumulado;
	private BigDecimal totalAnteriorAcumuladoAg;
	private BigDecimal totalAtualAcumuladoAg;
	private BigDecimal totalOscilacaoAcumuladoAg;
	private BigDecimal totalAnteriorAcumuladoPa;
	private BigDecimal totalAtualAcumuladoPa;
	private BigDecimal totalOscilacaoAcumuladoPa;

	private String indiceComboEmpresaFiltro;
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private Integer codDepFiltro;
	private IListarEmpresaService listarEmpresaServiceImpl = (IListarEmpresaService) FacesUtils.getManagedBean("listarEmpresaServiceImpl");
	private boolean razaoExiste = true;
	ConsultarOscilacaoNegativaDTO vo = new ConsultarOscilacaoNegativaDTO();

	public String inicializaOscilacaoNegativa(){
		setListaOscilacao(null);
		setMostraTable(false);
		setMesFiltro(null);
		setAnoFiltro(null);
		setCompetenciaFiltro(null);
		setIndiceComboEmpresaFiltro(null);
		setCodDepFiltro(null);
		listaEmpresa=listarEmpresaServiceImpl.carregarComboEmpresa();

		return "consultarOscilacaoNegativa";
	}

	public void prosseguir(){

		if(!mesFiltro.equals("") && !anoFiltro.equals("")){
			this.setCompetenciaFiltroFormat(FormatarData.formataData(this.competenciaFiltro,"MMyyyy"));
			this.setDataCompetenciaEnviada(FormatarData.formataData(this.competenciaFiltro,"MM/yyyy"));
			dataCompetencia = Integer.parseInt(mesFiltro + anoFiltro);

			setMostraTable(listarDepedenciasOscilacao());

		}else{
			BradescoFacesUtils.addInfoModalMessage("Digite a compet�ncia.", "consultarOscilacaoNegativa", BradescoViewExceptionActionType.ACTION, false);
		}	
	}

	private boolean listarDepedenciasOscilacao() {

		try {
			
			 vo = consultarOscilacaoNegativaImpl.consultarOscilacaoNegativa(dataCompetencia, codDepFiltro!=null?codDepFiltro:0, codDepFiltro!=null?Long.parseLong(indiceComboEmpresaFiltro):0L);
			 listaOscilacao = vo.getListaOscilacaoNeg();

			for (int i = 0; i < listaOscilacao.size(); i++) {

				listaDependenciaRadio.add(new SelectItem(i, " "));

			}

			labelTotalOscilacao = listaOscilacao.get(listaOscilacao.size()-1).getTotalOscilacao();
			labelTotalAtual = listaOscilacao.get(listaOscilacao.size()-1).getTotalAtual();
			labelTotalAnterior = listaOscilacao.get(listaOscilacao.size()-1).getTotalAnterior();
			totalAnteriorAcumulado = listaOscilacao.get(listaOscilacao.size()-1).getTotalAnteriorAcumulado();
			totalAtualAcumulado = listaOscilacao.get(listaOscilacao.size()-1).getTotalAnteriorAcumulado();
			totalOscilacaoAcumulado = listaOscilacao.get(listaOscilacao.size()-1).getTotalAnteriorAcumulado();
			totalAnteriorAcumuladoAg = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalAntAgencia();
			totalAtualAcumuladoAg = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalAtualAgencia();
			totalOscilacaoAcumuladoAg = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalOscAgencia();
			totalAnteriorAcumuladoPa = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalAntPa();
			totalAtualAcumuladoPa = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalAtualPa();
			totalOscilacaoAcumuladoPa = listaOscilacao.get(listaOscilacao.size()-1).getValorTotalOscPa();

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarOscilacaoNegativa", BradescoViewExceptionActionType.ACTION, false);
			return false;
		} 
		return true;
	}

	public void voltar(){
		inicializaOscilacaoNegativa();
	}

	public String consultarOscilacaoNegativa(){


		if(listaContasOscilacaoNegativa()){
			return "resultadoConsultaOscilacaoNegativa";
		}
		return null;
	}

	public boolean listaContasOscilacaoNegativa(){

		dataCompetenciaEnviada = getMesFiltro() + "/" + getAnoFiltro();
		ConsultarOscilacaoNegativaDTO consultaItemSelecionadoDTO = listaOscilacao.get(new Integer(itemSelecionadoLista));
		dependencia = consultaItemSelecionadoDTO.getDependencia().isEmpty() ? "0" : consultaItemSelecionadoDTO.getDependencia();
		municipio = consultaItemSelecionadoDTO.getMunicipio();
		numeroSequencial = consultaItemSelecionadoDTO.getNumeroSequencial();
		codigoPessoaJuridica = consultaItemSelecionadoDTO.getCodigoPessoaJuridica();

		listaContas = new ArrayList<ContasOscilacaoNegativaDTO>();
		try{

			listaContas = consultarOscilacaoNegativaImpl.listarContasOscilacaoNegativa(dataCompetencia, numeroSequencial, codigoPessoaJuridica, Integer.parseInt(dependencia));

			if (listaContas.size() > 0) {
				if (listaContas.get(0).getCodigoGrupo() <= 0 || listaContas.get(0).getCodigoSubgrupo() <= 0) {
					razaoExiste = false;
				}
				else{
					razaoExiste = true;
				}
			}
			
			totalAnterior = NumberUtils.format(listaContas.get(listaContas.size()-1).getTotalAnterior());
			totalAtual = NumberUtils.format(listaContas.get(listaContas.size()-1).getTotalAtual());
			totalOscilacao = NumberUtils.format(listaContas.get(listaContas.size()-1).getTotalOscilacao());

		}
		catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultarOscilacaoNegativa", BradescoViewExceptionActionType.ACTION, false);
			return false;
		}

		return true;
	}


	public String voltarConsultar(){
//		prosseguir();
		return "consultarOscilacaoNegativa";
	}

	public String paginarOscilacaoNegativaDependencia(ActionEvent event){

		listarDepedenciasOscilacao();
		setListaOscilacao(listaOscilacao);

		return "consultarOscilacaoNegativa";

	}


	public String paginarResultadoOscilacaoNegativa(ActionEvent event){

		listaContasOscilacaoNegativa();
		setListaContas(listaContas);

		return "resultadoConsultaOscilacaoNegativa";
	}

	public void imprimirPlanilhaEletronica(ActionEvent ae){
		
//		ConsultarOscilacaoNegativaDTO consutarOscilacao = consultarOscilacaoNegativaImpl.consultarOscilacaoNegativaPlanilha(dataCompetencia, numeroSequencial, codigoPessoaJuridica);
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Oscila��o Negativa", "OSCILACAO_NEGATIVA");
		try {
			exportarPlanilha.oscilacaoNegativa(listaOscilacao, 
					totalAnteriorAcumuladoAg, totalAtualAcumuladoAg, totalOscilacaoAcumuladoAg,
					totalAnteriorAcumuladoPa, totalAtualAcumuladoPa, totalOscilacaoAcumuladoPa);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(),false);
		}
		
	}
	
	public void imprimirPlanilhaEletronicaDetalhe(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Oscila��o Negativa", "OSCILACAO_NEGATIVA_DETALHE");
		try {
			exportarPlanilha.oscilacaoNegativaDetalhe(listaContas, razaoExiste);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(),false);
		}
		
	}
	
	public Date getCompetenciaFiltro() {
		return competenciaFiltro;
	}
	
	public void setCompetenciaFiltro(Date competenciaFiltro) {
		this.competenciaFiltro = competenciaFiltro;
	}

	public boolean isMostraTable() {
		return mostraTable;
	}
	
	public void setMostraTable(boolean mostraTable) {
		this.mostraTable = mostraTable;
	}

	public List<ConsultarOscilacaoNegativaDTO> getListaOscilacao() {
		return listaOscilacao;
	}
	
	public void setListaOscilacao(List<ConsultarOscilacaoNegativaDTO> listaOscilacao) {
		this.listaOscilacao = listaOscilacao;
	}

	public List<SelectItem> getListaDependenciaRadio() {
		return listaDependenciaRadio;
	}
	
	public void setListaDependenciaRadio(List<SelectItem> listaDependenciaRadio) {
		this.listaDependenciaRadio = listaDependenciaRadio;
	}

	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}
	
	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}

	public String getCompetenciaFiltroFormat() {
		return competenciaFiltroFormat;
	}
	
	public void setCompetenciaFiltroFormat(String competenciaFiltroFormat) {
		this.competenciaFiltroFormat = competenciaFiltroFormat;
	}

	public int getDataCompetencia() {
		return dataCompetencia;
	}

	public void setDataCompetencia(int dataCompetencia) {
		this.dataCompetencia = dataCompetencia;
	}

	public String getDataCompetenciaEnviada() {
		return dataCompetenciaEnviada;
	}
	
	public void setDataCompetenciaEnviada(String dataCompetenciaEnviada) {
		this.dataCompetenciaEnviada = dataCompetenciaEnviada;
	}

	public List<SelectItem> getListaContaRadio() {
		return listaContaRadio;
	}
	
	public void setListaContaRadio(List<SelectItem> listaContaRadio) {
		this.listaContaRadio = listaContaRadio;
	}

	public List<ContasOscilacaoNegativaDTO> getListaContas() {
		return listaContas;
	}

	public void setListaContas(List<ContasOscilacaoNegativaDTO> listaContas) {
		this.listaContas = listaContas;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public IConsultarApuracaoOscilacaoNegativaService getConsultarOscilacaoNegativaImpl() {
		return consultarOscilacaoNegativaImpl;
	}

	public void setConsultarOscilacaoNegativaImpl(
			IConsultarApuracaoOscilacaoNegativaService consultarOscilacaoNegativaImpl) {
		this.consultarOscilacaoNegativaImpl = consultarOscilacaoNegativaImpl;
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

	public long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public int getNumeroSequencial() {
		return numeroSequencial;
	}

	public void setNumeroSequencial(int numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}

	public String getTotalAnterior() {
		return totalAnterior;
	}

	public void setTotalAnterior(String totalAnterior) {
		this.totalAnterior = totalAnterior;
	}

	public String getTotalAtual() {
		return totalAtual;
	}

	public void setTotalAtual(String totalAtual) {
		this.totalAtual = totalAtual;
	}

	public String getTotalOscilacao() {
		return totalOscilacao;
	}

	public void setTotalOscilacao(String totalOscilacao) {
		this.totalOscilacao = totalOscilacao;
	}

	public BigDecimal getLabelTotalAnterior() {
		return labelTotalAnterior;
	}

	public void setLabelTotalAnterior(BigDecimal labelTotalAnterior) {
		this.labelTotalAnterior = labelTotalAnterior;
	}

	public BigDecimal getLabelTotalAtual() {
		return labelTotalAtual;
	}

	public void setLabelTotalAtual(BigDecimal labelTotalAtual) {
		this.labelTotalAtual = labelTotalAtual;
	}

	public BigDecimal getLabelTotalOscilacao() {
		return labelTotalOscilacao;
	}

	public void setLabelTotalOscilacao(BigDecimal labelTotalOscilacao) {
		this.labelTotalOscilacao = labelTotalOscilacao;
	}

	public String getIndiceComboEmpresaFiltro() {
		return indiceComboEmpresaFiltro;
	}

	public void setIndiceComboEmpresaFiltro(String indiceComboEmpresaFiltro) {
		this.indiceComboEmpresaFiltro = indiceComboEmpresaFiltro;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public Integer getCodDepFiltro() {
		return codDepFiltro;
	}

	public void setCodDepFiltro(Integer codDepFiltro) {
		this.codDepFiltro = codDepFiltro;
	}

	public boolean isRazaoExiste() {
		return razaoExiste;
	}

	public void setRazaoExiste(boolean razaoExiste) {
		this.razaoExiste = razaoExiste;
	}

	public BigDecimal getTotalAnteriorAcumulado() {
		return totalAnteriorAcumulado;
	}

	public void setTotalAnteriorAcumulado(BigDecimal totalAnteriorAcumulado) {
		this.totalAnteriorAcumulado = totalAnteriorAcumulado;
	}

	public BigDecimal getTotalAtualAcumulado() {
		return totalAtualAcumulado;
	}

	public void setTotalAtualAcumulado(BigDecimal totalAtualAcumulado) {
		this.totalAtualAcumulado = totalAtualAcumulado;
	}

	public BigDecimal getTotalOscilacaoAcumulado() {
		return totalOscilacaoAcumulado;
	}

	public void setTotalOscilacaoAcumulado(BigDecimal totalOscilacaoAcumulado) {
		this.totalOscilacaoAcumulado = totalOscilacaoAcumulado;
	}

	/**
	 * @return the totalAnteriorAcumuladoAg
	 */
	public BigDecimal getTotalAnteriorAcumuladoAg() {
		return totalAnteriorAcumuladoAg;
	}

	/**
	 * @param totalAnteriorAcumuladoAg the totalAnteriorAcumuladoAg to set
	 */
	public void setTotalAnteriorAcumuladoAg(BigDecimal totalAnteriorAcumuladoAg) {
		this.totalAnteriorAcumuladoAg = totalAnteriorAcumuladoAg;
	}

	/**
	 * @return the totalAtualAcumuladoAg
	 */
	public BigDecimal getTotalAtualAcumuladoAg() {
		return totalAtualAcumuladoAg;
	}

	/**
	 * @param totalAtualAcumuladoAg the totalAtualAcumuladoAg to set
	 */
	public void setTotalAtualAcumuladoAg(BigDecimal totalAtualAcumuladoAg) {
		this.totalAtualAcumuladoAg = totalAtualAcumuladoAg;
	}

	/**
	 * @return the totalOscilacaoAcumuladoAg
	 */
	public BigDecimal getTotalOscilacaoAcumuladoAg() {
		return totalOscilacaoAcumuladoAg;
	}

	/**
	 * @param totalOscilacaoAcumuladoAg the totalOscilacaoAcumuladoAg to set
	 */
	public void setTotalOscilacaoAcumuladoAg(BigDecimal totalOscilacaoAcumuladoAg) {
		this.totalOscilacaoAcumuladoAg = totalOscilacaoAcumuladoAg;
	}

	/**
	 * @return the totalAnteriorAcumuladoPa
	 */
	public BigDecimal getTotalAnteriorAcumuladoPa() {
		return totalAnteriorAcumuladoPa;
	}

	/**
	 * @param totalAnteriorAcumuladoPa the totalAnteriorAcumuladoPa to set
	 */
	public void setTotalAnteriorAcumuladoPa(BigDecimal totalAnteriorAcumuladoPa) {
		this.totalAnteriorAcumuladoPa = totalAnteriorAcumuladoPa;
	}

	/**
	 * @return the totalAtualAcumuladoPa
	 */
	public BigDecimal getTotalAtualAcumuladoPa() {
		return totalAtualAcumuladoPa;
	}

	/**
	 * @param totalAtualAcumuladoPa the totalAtualAcumuladoPa to set
	 */
	public void setTotalAtualAcumuladoPa(BigDecimal totalAtualAcumuladoPa) {
		this.totalAtualAcumuladoPa = totalAtualAcumuladoPa;
	}

	/**
	 * @return the totalOscilacaoAcumuladoPa
	 */
	public BigDecimal getTotalOscilacaoAcumuladoPa() {
		return totalOscilacaoAcumuladoPa;
	}

	/**
	 * @param totalOscilacaoAcumuladoPa the totalOscilacaoAcumuladoPa to set
	 */
	public void setTotalOscilacaoAcumuladoPa(BigDecimal totalOscilacaoAcumuladoPa) {
		this.totalOscilacaoAcumuladoPa = totalOscilacaoAcumuladoPa;
	}
	
}
