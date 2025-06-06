package br.com.bradesco.web.giss.view.bean.controller.dependencia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean.DependeciasEncerradasDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class DependenciaEncerradaBean {
	
	private ILogManager logger;	
	private List<DependeciasEncerradasDTO> listaDependenciasEncerradas;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private boolean mostraDependenciasEncerradas;	
	private IDependenciaService dependenciaImpl;
	private String mesFiltro;
	private String anoFiltro;
	private String codListaPesquisarDepEncerradas;
	private boolean mostraBotoes;	
	private String codigoDependencia;
	private String descricaoDependencia;
	private String cnpj;	
	private String dataAbertura;
	private String dataEncerramento;
	private String agenciaIncorporadora;
	private String logradouro;
	private String numero;
	private String cep;	
	private String municipio;
	private String estado;
	private String pais;	
	private String codigoMunicipio;	
	private String codigoEstado;
	private String nomeMunicipio;
	private String nomeEstado;
	private String ccm;
	private String tipoDepartamento;
	private String codigoAgenciaIncorpDepto; 
	private String nomeAgenciaIncorpDepto; 
	private String inscricaoMunicipal;	
	private String numeroAgencia;
	private String nomeAgencia;		
	private int indTributavel;
	private String municIncorpDepto;
	private String estadoMunicIncorpDepto;
	private Date calendarioAte;
	private Date calendarioDe;
	
	public String iniciaTela(){
		
		codListaPesquisarDepEncerradas = "";
		mostraDependenciasEncerradas = false;
		listaDependenciasEncerradas = null;
		calendarioAte = null;
		calendarioDe = null;
		
		return "conDependenciasEncerradas";
	}

	public void carregarListaDependenciasEncerradas(ActionEvent event){
		
		//lista dependencias
		listarDependEncerradas();
		
	}	
	
	public String prosseguirDetalharDependencia() {
		
		DependeciasEncerradasDTO dependenciasEncerrDTO = listaDependenciasEncerradas.get(new Integer(codListaPesquisarDepEncerradas));
		
		consultarInformacoesDependencia(dependenciasEncerrDTO);
				
		return "detalhesDependenciasEncerradasProsseguir";
	}
	
	
	
	public void paginarListaDependenciasEncerradas(ActionEvent event){
		
		listarDependEncerradas();
		setListaDependenciasEncerradas(listaDependenciasEncerradas);
		
	}
	
	private void listarDependEncerradas() {

		try {
			
			Calendar calendInicial = Calendar.getInstance();
			calendInicial.setTime(getCalendarioDe());
			
			Calendar calendFinal = Calendar.getInstance();
			calendFinal.setTime(getCalendarioAte());
			
			
			if(calendInicial.compareTo(calendFinal) > 0){
				BradescoFacesUtils.addInfoModalMessage("O período inicial deve ser menor que o período final", false);
				return;
			}
			if(calendInicial.after(Calendar.getInstance())){
				BradescoFacesUtils.addInfoModalMessage("O período inicial não pode ser maior que a data atual", false);
				return;
			}
			if(GissUtil.verificarPeriodoDozeMeses(getCalendarioDe(), getCalendarioAte())){
				BradescoFacesUtils.addInfoModalMessage("O período deve ser menor ou igual a 12 meses", false);
				return;
			}
			
			String dia = GissUtil.preencherZerosAEsquerda(String.valueOf(calendInicial.get(Calendar.DAY_OF_MONTH)), 2);
			String mes = GissUtil.preencherZerosAEsquerda(String.valueOf((calendInicial.get(Calendar.MONTH) + 1)), 2);
			String ano = GissUtil.preencherZerosAEsquerda(String.valueOf(calendInicial.get(Calendar.YEAR)),4);
			String dataDe = dia  + mes + ano;
			
			dia = GissUtil.preencherZerosAEsquerda(String.valueOf(calendFinal.get(Calendar.DAY_OF_MONTH)),2);
			mes = GissUtil.preencherZerosAEsquerda(String.valueOf((calendFinal.get(Calendar.MONTH) + 1)),2);
			ano = GissUtil.preencherZerosAEsquerda(String.valueOf(calendFinal.get(Calendar.YEAR)),4);
			String dataAte = dia + mes + ano;
			
			listaDependenciasEncerradas = dependenciaImpl.listarDependenciasEncerradas(dataDe,dataAte);

			if (listaDependenciasEncerradas != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaDependenciasEncerradas.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaDependenciasEncerradas.size() > IDependenciaServiceConstants.NUMERO_REGISTROS_LISTA_DEPENDENCIAS_NOVAS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraDependenciasEncerradas = true;
			}
		} catch (PdcAdapterFunctionalException p) {
				listaDependenciasEncerradas = null;
				mostraDependenciasEncerradas = false;
				mesFiltro = "";
				anoFiltro = "";
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "conDependenciasEncerradas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public void consultarInformacoesDependencia(DependeciasEncerradasDTO dependenciasEncerrDTO) {
		try {
						
			DependenciaDTO dependenciaDTO = dependenciaImpl.consultarInformacoesDependencia(dependenciasEncerrDTO);
			
			GissUtil gissUtil = new GissUtil();
			
			DependeciasEncerradasDTO depEncerrDTO  = listaDependenciasEncerradas.get(Integer.valueOf(codListaPesquisarDepEncerradas));
						
			codigoDependencia = depEncerrDTO.getCodigoDependencia();
			descricaoDependencia = depEncerrDTO.getNomeDependencia();
			cnpj = dependenciaDTO.getCnpj();
			dataAbertura = dependenciaDTO.getDataAbertura();
			dataEncerramento = dependenciaDTO.getDataEncerramento();
			
			String dependenciaIncorporadora = "";
			if(!"0".equals(depEncerrDTO.getCodigoDependenciaIncorporadora())){
			    dependenciaIncorporadora = depEncerrDTO.getCodigoDependenciaIncorporadora() + " - " + depEncerrDTO.getNomeDependenciaIncorporadora();
			}
			
			agenciaIncorporadora = dependenciaIncorporadora; 
			codigoAgenciaIncorpDepto = dependenciaDTO.getCodAgenciaIncorporadoraDepartamento(); //
			nomeAgenciaIncorpDepto = dependenciaDTO.getDescAgenciaIncorporadoraDepartamento();	//		
			logradouro = dependenciaDTO.getLogradouro();
			estado = dependenciaDTO.getEstado();			
			municipio = dependenciaDTO.getMunicipio();
			cep = gissUtil.mascaraCep(dependenciaDTO.getCep());
			pais = dependenciaDTO.getPais();
			ccm = dependenciaDTO.getCcm();
			inscricaoMunicipal = dependenciaDTO.getInscricaoMunicipal();
			tipoDepartamento = dependenciaDTO.getTipoDepartamento();
			estadoMunicIncorpDepto = dependenciaDTO.getEstadoMunicipioAgenIncorpDepto();
						
			if(!dependenciaDTO.getCodMunicipioAgenIncorpDepto().equals("0000000000")){
				municIncorpDepto = dependenciaDTO.getCodMunicipioAgenIncorpDepto() + " - " + dependenciaDTO.getDescMunicipioAgenIncorpDepto();
			}else{
				municIncorpDepto = "";
			}
			
			if(tipoDepartamento.equals("TRIBUTAVEL"))
				indTributavel = 1;
			else
				indTributavel = 2;
			
			if(ccm.equals("0")){
				ccm = "";
			}
			
			if(inscricaoMunicipal.equals("0")){
				inscricaoMunicipal = "";
			}
			
			if(codigoAgenciaIncorpDepto.equals("0")){
				codigoAgenciaIncorpDepto = "";
			}

		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "conDependenciasEncerradas", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}
	
	public String voltarDependenciasEncerradas(){
		return "conDependenciasEncerradas";
	}
	
	public void imprimirPlanilha(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Dependências Encerradas", "DEPENDENCIAS_ENCERRADAS");
		try {
			exportarPlanilha.dependenciasEncerradas(listaDependenciasEncerradas);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(),  false);
		}
		
	}
	
	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
	}

	public List<DependeciasEncerradasDTO> getListaDependenciasEncerradas() {
		return listaDependenciasEncerradas;
	}

	public void setListaDependenciasEncerradas(
			List<DependeciasEncerradasDTO> listaDependenciasEncerradas) {
		this.listaDependenciasEncerradas = listaDependenciasEncerradas;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public boolean isMostraDependenciasEncerradas() {
		return mostraDependenciasEncerradas;
	}

	public void setMostraDependenciasEncerradas(boolean mostraDependenciasEncerradas) {
		this.mostraDependenciasEncerradas = mostraDependenciasEncerradas;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public String getCodListaPesquisarDepEncerradas() {
		return codListaPesquisarDepEncerradas;
	}

	public void setCodListaPesquisarDepEncerradas(
			String codListaPesquisarDepEncerradas) {
		this.codListaPesquisarDepEncerradas = codListaPesquisarDepEncerradas;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public String getAgenciaIncorporadora() {
		return agenciaIncorporadora;
	}

	public void setAgenciaIncorporadora(String agenciaIncorporadora) {
		this.agenciaIncorporadora = agenciaIncorporadora;
	}

	public String getCcm() {
		return ccm;
	}

	public void setCcm(String ccm) {
		this.ccm = ccm;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigoAgenciaIncorpDepto() {
		return codigoAgenciaIncorpDepto;
	}

	public void setCodigoAgenciaIncorpDepto(String codigoAgenciaIncorpDepto) {
		this.codigoAgenciaIncorpDepto = codigoAgenciaIncorpDepto;
	}

	public String getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(String codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getDescricaoDependencia() {
		return descricaoDependencia;
	}

	public void setDescricaoDependencia(String descricaoDependencia) {
		this.descricaoDependencia = descricaoDependencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNomeAgenciaIncorpDepto() {
		return nomeAgenciaIncorpDepto;
	}

	public void setNomeAgenciaIncorpDepto(String nomeAgenciaIncorpDepto) {
		this.nomeAgenciaIncorpDepto = nomeAgenciaIncorpDepto;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getEstadoMunicIncorpDepto() {
		return estadoMunicIncorpDepto;
	}

	public void setEstadoMunicIncorpDepto(String estadoMunicIncorpDepto) {
		this.estadoMunicIncorpDepto = estadoMunicIncorpDepto;
	}

	public int getIndTributavel() {
		return indTributavel;
	}

	public void setIndTributavel(int indTributavel) {
		this.indTributavel = indTributavel;
	}

	public String getMunicIncorpDepto() {
		return municIncorpDepto;
	}

	public void setMunicIncorpDepto(String municIncorpDepto) {
		this.municIncorpDepto = municIncorpDepto;
	}

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

}
