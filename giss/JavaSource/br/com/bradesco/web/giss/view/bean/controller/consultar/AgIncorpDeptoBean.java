package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.agincorpdepart.IAgIncorpDepartService;
import br.com.bradesco.web.giss.service.business.agincorpdepart.IAgIncorpDepartServiceConstants;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartEntradaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaTotalDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorporaDepartAvancarTotalDTO;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;

public class AgIncorpDeptoBean extends FiltroGenericoGISSBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AgIncorpDepartEntradaDTO> listarDependencia;
	private ArrayList<SelectItem> listarDependenciaRadio = new ArrayList<SelectItem>();
	private boolean mostrarTabela;
	private Date mesAnoCompetencia;
	private IAgIncorpDepartService agIncorpDepartServiceImpl;
	private AgIncorporaDepartAvancarTotalDTO consultaAgenciaIncorporaDepartamento = new AgIncorporaDepartAvancarTotalDTO();
	private AgIncorpDepartSaidaTotalDTO listarAgenciaIncorpDepartamento = new AgIncorpDepartSaidaTotalDTO();
	private String mesFiltro;
	private String anoFiltro;
	private Integer linhaSelecionada;
	private String itemSelecionadoLista;
	private Integer competencia;
	private String dependencia;
	private String descricao;
	private int dependenciaFormatada;
	private boolean mostraPagina;
	private boolean mostraPaginacaoAvancar;
	private String itemSelecionado;
	private String mostraDataResultado;
	private BigDecimal totalReceita;
	private BigDecimal totalISSRecolher;
	private BigDecimal totalSaldo;
	private BigDecimal totalIss;
	
	public String iniciaPagina() {
		super.inicializaFiltroGenerico();
		linhaSelecionada = null;
		setMostrarTabela(false);
		mesFiltro = null;
		anoFiltro = null;
		listaEmpresa=listarEmpresaServiceImpl.carregarComboEmpresa();
		return "agenciaIncorpDepart";
	}

	public String prosseguir(){
		if(mesFiltro.equals("") || anoFiltro.equals("") ){	
			if (mesFiltro.equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Mês da competência.", false);
				return null;
			}
			if (anoFiltro.equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Ano da competência.", false);
				return null;
			}
		}else{
			try{
				linhaSelecionada = null;
				Integer mesAno = (Integer.parseInt(mesFiltro)*10000)+ Integer.parseInt(anoFiltro);
				listarAgenciaIncorpDepartamento = agIncorpDepartServiceImpl.listarAgenciaIncorpDepartamento(new AgIncorpDepartEntradaDTO(IAgIncorpDepartServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_AGENCIA_INCORP_DEP,mesAno, codDepFiltro!=null&&codDepFiltro!=0?codDepFiltro:0, codDepFiltro!=null&&codDepFiltro!=0?Long.valueOf(indiceComboEmpresaFiltro):0l));
				if(listarAgenciaIncorpDepartamento != null){
					listarDependenciaRadio = new ArrayList<SelectItem>();
					setMostraPagina(true);
					for(int i = 0; i < listarAgenciaIncorpDepartamento.getListaAgIncorpDepartSaida().size(); i++){
						listarDependenciaRadio.add(new SelectItem(i, ""));
					}
					
					if(listarAgenciaIncorpDepartamento.getListaAgIncorpDepartSaida().size() > 0){
						mostrarTabela = true;
					}else{
						mostrarTabela = false;
					}
				}
			totalReceita = listarAgenciaIncorpDepartamento.getTotalReceita();
			totalISSRecolher = listarAgenciaIncorpDepartamento.getTotalISSRecolher();
			
			
			}catch (PdcAdapterFunctionalException p) {
				listarAgenciaIncorpDepartamento = null;
				mostrarTabela = false;
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),"/agenciaIncorpDepart.jsf", BradescoViewExceptionActionType.ACTION, false);
			}
		}
		return "agenciaIncorpDepartConsultar";
		
	}

	
	public String carregaLista(){
		AgIncorpDepartSaidaDTO agIncorpDepartSaidaDTO = getListarAgenciaIncorpDepartamento().getListaAgIncorpDepartSaida().get(linhaSelecionada);
		
		setCompetencia(agIncorpDepartSaidaDTO.getMesAnoCompetencia());
		setDependencia(agIncorpDepartSaidaDTO.getCodigoDependencia()!=null&&agIncorpDepartSaidaDTO.getCodigoDependencia().equals("")?String.valueOf(agIncorpDepartSaidaDTO.getCodigoDependencia()):"");
		setDescricao(agIncorpDepartSaidaDTO.getDescricaoDependencia());
	try{	
		consultaAgenciaIncorporaDepartamento = agIncorpDepartServiceImpl.consultarAgenciaIncorporaDepartamento(agIncorpDepartSaidaDTO);
		
		setTotalSaldo(consultaAgenciaIncorporaDepartamento.getTotalSaldo());
		setTotalIss(consultaAgenciaIncorporaDepartamento.getTotalIss());
		
		Integer ano = agIncorpDepartSaidaDTO.getMesAnoCompetencia()%10000;
		Integer mes = agIncorpDepartSaidaDTO.getMesAnoCompetencia()/10000;
		
		if(consultaAgenciaIncorporaDepartamento != null){
			setMostraPaginacaoAvancar(true);
		}
		

	
		
		
		if (mes < 10 ){
			mostraDataResultado = "0" + mes + "/" + ano;
		}else{
			mostraDataResultado = mes + "/" + ano;
		}
	
	}catch (PdcAdapterFunctionalException p) {
		consultaAgenciaIncorporaDepartamento = null;
		setLinhaSelecionada(null);
		throw p;
	}
		
		
		return "agenciaIncorpDepartResultado";
	
		
	}

	public String voltar(){
		return iniciaPagina();
	}

	
	public String voltarConsulta(){
		consultaAgenciaIncorporaDepartamento = null;
		mostraDataResultado = null;
		dependencia = null;
		linhaSelecionada = null;
		descricao = null;
		return "agenciaIncorpDepart";
	}
	
	public String paginarLista(ActionEvent e){	
//		prosseguir();
		try{
			linhaSelecionada = null;
			Integer mesAno = (Integer.parseInt(mesFiltro)*10000)+ Integer.parseInt(anoFiltro);
			listarAgenciaIncorpDepartamento = agIncorpDepartServiceImpl.listarAgenciaIncorpDepartamento(new AgIncorpDepartEntradaDTO(IAgIncorpDepartServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_AGENCIA_INCORP_DEP,mesAno, codDepFiltro!=null&&codDepFiltro!=0?codDepFiltro:0, codDepFiltro!=null&&codDepFiltro!=0?Long.valueOf(indiceComboEmpresaFiltro):0l));
			if(listarAgenciaIncorpDepartamento != null){
				for(int i = 0; i < listarAgenciaIncorpDepartamento.getListaAgIncorpDepartSaida().size(); i++){
					listarDependenciaRadio.add(new SelectItem(i, ""));
				}
			}
		totalReceita = listarAgenciaIncorpDepartamento.getTotalReceita();
		totalISSRecolher = listarAgenciaIncorpDepartamento.getTotalISSRecolher();
		
		
		}catch (PdcAdapterFunctionalException p) {
			
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		}
		setListarAgenciaIncorpDepartamento(listarAgenciaIncorpDepartamento);
		return "agenciaIncorpDepart";
	}
	
	public String paginarListaAvancar(ActionEvent e){	
		carregaLista();
		setConsultaAgenciaIncorporaDepartamento(consultaAgenciaIncorporaDepartamento);
		return "agenciaIncorpDepartResultado";
	}	
	
	
	
	
	// Metodos get e set
	

	public IAgIncorpDepartService getAgIncorpDepartServiceImpl() {
		return agIncorpDepartServiceImpl;
	}
	public void setAgIncorpDepartServiceImpl(
			IAgIncorpDepartService agIncorpDepartServiceImpl) {
		this.agIncorpDepartServiceImpl = agIncorpDepartServiceImpl;
	}

	
	public Date getMesAnoCompetencia() {
		return mesAnoCompetencia;
	}
	public void setMesAnoCompetencia(Date mesAnoCompetencia) {
		this.mesAnoCompetencia = mesAnoCompetencia;
	}

	
	public List<AgIncorpDepartEntradaDTO> getListarDependencia() {
		return listarDependencia;
	}
	public void setListarDependencia(
			List<AgIncorpDepartEntradaDTO> listarDependencia) {
		this.listarDependencia = listarDependencia;
	}

	
	public ArrayList<SelectItem> getListarDependenciaRadio() {
		return listarDependenciaRadio;
	}
	public void setListarDependenciaRadio(
			ArrayList<SelectItem> listarDependenciaRadio) {
		this.listarDependenciaRadio = listarDependenciaRadio;
	}

	
	public boolean isMostrarTabela() {
		return mostrarTabela;
	}
	public void setMostrarTabela(boolean mostrarTabela) {
		this.mostrarTabela = mostrarTabela;
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

	
	public Integer getLinhaSelecionada() {
		return linhaSelecionada;
	}
	public void setLinhaSelecionada(Integer linhaSelecionada) {
		this.linhaSelecionada = linhaSelecionada;
	}


	public String getItemSelecionadoLista() {
		return itemSelecionadoLista;
	}
	public void setItemSelecionadoLista(String itemSelecionadoLista) {
		this.itemSelecionadoLista = itemSelecionadoLista;
	}


	public Integer getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}


	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}


	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public boolean isMostraPagina() {
		return mostraPagina;
	}
	public void setMostraPagina(boolean mostraPagina) {
		this.mostraPagina = mostraPagina;
	}


	public boolean isMostraPaginacaoAvancar() {
		return mostraPaginacaoAvancar;
	}
	public void setMostraPaginacaoAvancar(boolean mostraPaginacaoAvancar) {
		this.mostraPaginacaoAvancar = mostraPaginacaoAvancar;
	}


	public String getItemSelecionado() {
		return itemSelecionado;
	}
	public void setItemSelecionado(String itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}
	

	public String getMostraDataResultado() {
		return mostraDataResultado;
	}
	public void setMostraDataResultado(String mostraDataResultado) {
		this.mostraDataResultado = mostraDataResultado;
	}
	

	public BigDecimal getTotalISSRecolher() {
		return totalISSRecolher;
	}
	public void setTotalISSRecolher(BigDecimal totalISSRecolher) {
		this.totalISSRecolher = totalISSRecolher;
	}

	
	public BigDecimal getTotalReceita() {
		return totalReceita;
	}
	public void setTotalReceita(BigDecimal totalReceita) {
		this.totalReceita = totalReceita;
	}

	
	public int getDependenciaFormatada() {
		return dependenciaFormatada;
	}
	public void setDependenciaFormatada(int dependenciaFormatada) {
		this.dependenciaFormatada = dependenciaFormatada;
	}
	

	public AgIncorporaDepartAvancarTotalDTO getConsultaAgenciaIncorporaDepartamento() {
		return consultaAgenciaIncorporaDepartamento;
	}
	public void setConsultaAgenciaIncorporaDepartamento(
			AgIncorporaDepartAvancarTotalDTO consultaAgenciaIncorporaDepartamento) {
		this.consultaAgenciaIncorporaDepartamento = consultaAgenciaIncorporaDepartamento;
	}

	
	public BigDecimal getTotalIss() {
		return totalIss;
	}
	public void setTotalIss(BigDecimal totalIss) {
		this.totalIss = totalIss;
	}

	
	public BigDecimal getTotalSaldo() {
		return totalSaldo;
	}
	public void setTotalSaldo(BigDecimal totalSaldo) {
		this.totalSaldo = totalSaldo;
	}

	
	public AgIncorpDepartSaidaTotalDTO getListarAgenciaIncorpDepartamento() {
		return listarAgenciaIncorpDepartamento;
	}
	public void setListarAgenciaIncorpDepartamento(
			AgIncorpDepartSaidaTotalDTO listarAgenciaIncorpDepartamento) {
		this.listarAgenciaIncorpDepartamento = listarAgenciaIncorpDepartamento;
	}

	

}