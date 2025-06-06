package br.com.bradesco.web.giss.view.bean.controller.issgerencial.empresa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.ContasISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class EmpresaISSBean implements Serializable, BuscaMunicipioCallback{
	private static final long serialVersionUID = 1L;

	private IEmpresaISSService empresasISSServiceImpl;
	private IUtilidadesService utilidadesServiceImpl;
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	
	private EmpresaISSDTO dtoIncluir = new EmpresaISSDTO();	
	private EmpresaISSDTO dtoAlterar = new EmpresaISSDTO();
	private EmpresaISSDTO dtoManter = new EmpresaISSDTO();
	private EmpresaISSDTO dtoHistorico = new EmpresaISSDTO();
	private EmpresaISSDTO dtoHistoricoDet = new EmpresaISSDTO();
	private EmpresaISSDTO dtoTemp = new EmpresaISSDTO();
	private ContasISSDTO dto = new ContasISSDTO();
	
	private static final int INICIAL = 1;
	private static final int PESQUISAR = 2;
	private static final int INCLUIR = 1;
	private static final int ALTERAR = 2;
	private static final int HISTORICO = 3;
	
	private boolean mostrarListaEmpresa;
	private boolean mostrarListaContas;
    private boolean hiddenProsseguir;
	private boolean checkTodos;
	private boolean checkTodosContas;
	
	private Integer tipoPesquisa;
	private int tipoManutencao;
	private Integer codigosSelecionadosTabela = null;
	private Integer[] codigosSelecionadosTabelaContas = new Integer[100];
	
	private List<SelectItem> selectItemCadastro = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemContas = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemServico = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemCosif = new ArrayList<SelectItem>();
	private List<SelectItem> selectItemSistContabil = new ArrayList<SelectItem>();		
	private List<SelectItem> selectItemContaReceita = new ArrayList<SelectItem>();		
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	
	private List<CombosISSDTO> comboServico = new ArrayList<CombosISSDTO>();
	private List<CombosISSDTO> comboCosif = new ArrayList<CombosISSDTO>();
	private List<CombosISSDTO> comboSistContabil = new ArrayList<CombosISSDTO>();		
	private List<CombosISSDTO> comboContaReceita = new ArrayList<CombosISSDTO>();		
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	
	public String inicializarManter(){
    	codigosSelecionadosTabela = null;
		checkTodos = false;
		dtoManter = new EmpresaISSDTO();
		hiddenProsseguir = true;
		listarCadastroEmpresa(dtoManter, INICIAL);
		return "manterCadEmpresa";
	}
	
	public String inicializarHistorico(){
		codigosSelecionadosTabela = null;
		checkTodos = false;
		dtoHistorico = new EmpresaISSDTO();
		hiddenProsseguir = true;
		mostrarListaEmpresa = false;
		return "historicoCadEmpresa";
	}
	
	public String inicializarIncluir(){
		dtoIncluir = new EmpresaISSDTO();
		dtoIncluir.setContas(new ContasISSDTO());
		hiddenProsseguir = true;
		codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
		incializaCombos();
		limparCamposConta(dtoIncluir);
		tipoManutencao = INCLUIR;
		return "incluirCadEmpresa";
	}
	
    public String inicializarAlterar(){
		if(codigosSelecionadosTabela!= null) {
			dtoAlterar = new EmpresaISSDTO();
			GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(codigosSelecionadosTabela), dtoAlterar);
			incializaCombos();
			for (int i = 0; i < comboSistContabil.size(); i++) {
				if (comboSistContabil.get(i).getDescSistemaContabil().trim().equals(dtoAlterar.getDescSistemaContabil().trim())) {
					dtoAlterar.getCombos().setCodSistemaContabil(comboSistContabil.get(i).getCodSistemaContabil());
				}
			}
			listarContaEmpresa();
			limparCamposConta(dtoAlterar);
			if (GissUtil.notNull(dtoAlterar.getCombos().getCodSistemaContabil()) == 1) {
				try {
					carregaComboCosif(dtoAlterar);
				} catch (Exception e) {
				}
			}
			tipoManutencao = ALTERAR;
			getBuscaMunicipio().setCodigo(dtoAlterar.getCodMunicipio());
			if(GissUtil.notNull(getBuscaMunicipio().getCodigo()) != 0l){
				pesquisarMunicipioAlterar();
			}
			return "alterarCadEmpresa";
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";
		}
	}

    public String inicializarDetalhar(){
    	if(codigosSelecionadosTabela!=null){
    		dtoAlterar = new EmpresaISSDTO();
			GissUtil.copiarPropriedadesNaoNulas(dtoManter.getLista().get(codigosSelecionadosTabela), dtoAlterar);
			listarContaEmpresa();
			incializaCombos();
			tipoManutencao = ALTERAR;
			getBuscaMunicipio().setCodigo(dtoAlterar.getCodMunicipio());
			if(GissUtil.notNull(getBuscaMunicipio().getCodigo()) != 0l){
				pesquisarMunicipioAlterar();
			}
			return "detalharCadEmpresa";
		}else{
			BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
			return "";
		}
	}
    public String inicializarDetHistorico(){
    	if(codigosSelecionadosTabela!=null){
    		dtoHistoricoDet = new EmpresaISSDTO();
    		incializaCombos();
    		
    		dtoHistoricoDet = empresasISSServiceImpl.detalharHistoricoEmp(dtoHistorico.getLista().get(codigosSelecionadosTabela));
    		empresasISSServiceImpl.ListaContaEmp(dtoHistoricoDet.getContas(), dtoHistoricoDet.getCodEmpresa());
    		tipoManutencao = HISTORICO;
    		if(GissUtil.notNull(dtoHistoricoDet.getCodMunicipio()) != 0l){
        		dtoTemp = new EmpresaISSDTO();
    			getBuscaMunicipio().setCodigo(dtoHistoricoDet.getCodMunicipio());
    			getBuscaMunicipio().setDescricao("");
    			dtoTemp.setEstado(dtoHistoricoDet.getEstado());
    			pesquisarMunicipioHistorico();
    			dtoHistoricoDet.setDescEstado(dtoTemp.getDescEstado());
    			dtoHistoricoDet.setCodMunicipio(buscaMunicipio.getCodigo());
    			dtoHistoricoDet.setDescMunicipios(buscaMunicipio.getDescricao());
    			
    		}
    		if(GissUtil.notNull(dtoHistoricoDet.getCodMunicipioAnterior()) != 0l){
    			dtoTemp = new EmpresaISSDTO();
    			getBuscaMunicipio().setCodigo(dtoHistoricoDet.getCodMunicipioAnterior());
    			getBuscaMunicipio().setDescricao("");
    			dtoTemp.setEstado(dtoHistoricoDet.getEstadoAnterior());
    			pesquisarMunicipioHistorico();
    			dtoHistoricoDet.setDescEstadoAnterior(dtoTemp.getDescEstado());
    			dtoHistoricoDet.setCodMunicipioAnterior(buscaMunicipio.getCodigo());
    			dtoHistoricoDet.setDescMunicipiosAnterior(buscaMunicipio.getDescricao());
    		}
    		
    		return "detalharHistCadEmpresa";
    	}else{
    		BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
    		return "";
    	}
    }
    
    private void incializaCombos(){
    	carregaComboEstados();
    	carregaComboSistContabil();
    	carregarComboItemServico();
    }
    
    
    public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
    private void carregaComboSistContabil(){
    	comboSistContabil = new ArrayList<CombosISSDTO>();
    	selectItemSistContabil = new ArrayList<SelectItem>();
    	comboSistContabil = utilidadesServiceImpl.listarComboSistContabil();
    	for (int i = 0; i < comboSistContabil.size(); i++) {
			selectItemSistContabil.add(new SelectItem(comboSistContabil.get(i).getCodSistemaContabil(), comboSistContabil.get(i).getDescSistemaContabil()));
		}
	}
    
    private void carregarComboItemServico(){
    	comboServico = new ArrayList<CombosISSDTO>();
    	selectItemServico = new ArrayList<SelectItem>();
    	comboServico = utilidadesServiceImpl.listarComboItemServ();
    	for (int i = 0; i < comboServico.size(); i++) {
    		selectItemServico.add(new SelectItem(comboServico.get(i).getCodItemServ(), comboServico.get(i).getDescItemServ()));
    	}		
    }
    
    private void carregaComboCosif(EmpresaISSDTO dto){
    	comboCosif = new ArrayList<CombosISSDTO>();
    	selectItemCosif = new ArrayList<SelectItem>();
    	selectItemContaReceita = new ArrayList<SelectItem>();		
    	comboContaReceita = new ArrayList<CombosISSDTO>();
    	comboCosif = utilidadesServiceImpl.listarCosifEmp(dto.getCodEmpresa());
    	for (int i = 0; i < comboCosif.size(); i++) {
    		selectItemCosif.add(new SelectItem(comboCosif.get(i).getCodCosif(), String.valueOf(comboCosif.get(i).getCodCosif())));
    	}
    }
    
    private void carregaComboCtaReceita(Long cosif, EmpresaISSDTO dto){
    	selectItemContaReceita = new ArrayList<SelectItem>();		
    	comboContaReceita = new ArrayList<CombosISSDTO>();		
		comboContaReceita = utilidadesServiceImpl.listarComboCtaReceita(cosif, dto.getCodEmpresa());
		for (int i = 0; i < comboContaReceita.size(); i++) {
			selectItemContaReceita.add(new SelectItem(comboContaReceita.get(i).getContaReceita(), comboContaReceita.get(i).getDescContaReceitaExibicao()));
		}
	}
    
    private void carregarCombosContaCor(EmpresaISSDTO dto){
    	if (dto.getCombos()!= null){
    		if (dto.getCombos().getCodSistemaContabil() == 1 ) {
    			carregaComboCosif(dto);
			}
    	}
    }
    
    public String imprimirPlanilha(ActionEvent ae){
		try {
			dtoAlterar.setCodMunicipio(buscaMunicipio.getCodigo());
			dtoAlterar.setDescMunicipios(buscaMunicipio.getDescricao());
			ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Detalhar Cadastro Empresa", "DETALHAR_CADASTRO_EMPRESA");
			exportarPlanilha.planilhaDetCadastroEmpresa(dtoAlterar);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}
    
    public void carregarCombosContaCorrenteAlterar(){
    	carregarCombosContaCor(dtoAlterar);
    }
    
    public void carregarCombosContaCorrente(){
    	carregarCombosContaCor(dtoIncluir);
    }
    
    public void carregarComboContaReceitaAlterar(){
    	carregarComboConta(dtoAlterar);
    }
    
    public void carregarComboContaReceita(){
    	carregarComboConta(dtoIncluir);
    }
    
    private void carregarComboConta(EmpresaISSDTO dto){
    	if (dto.getCombos().getCodSistemaContabil() == 1 ) {
    		carregaComboCtaReceita(dto.getContas().getCosif(), dto);
    	}
    }
    
    private void listarContaEmpresa() {
		empresasISSServiceImpl.ListaContaEmp(dtoAlterar.getContas(), dtoAlterar.getCodEmpresa());
		for (int i = 0; i < dtoAlterar.getContas().getListaContas().size(); i++) {
			selectItemContas.add(new SelectItem(i, " "));
		}
		checkTodosContas = false;
		codigosSelecionadosTabelaContas = new Integer[100];
	}
    
    public String limparCheckTodos() {
		checkTodos = false;
		return "";
	}
   
    public void buscarDescCnpj(){
    	if(GissUtil.notNull(dtoIncluir.getCodEmpresa()) == 0 && GissUtil.notNull(dtoIncluir.getCnpjFormatado()).equals("")){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher Código Empresa ou CNPJ Empresa!", false);
			dtoIncluir.setCodEmpresa(null);
			dtoIncluir.setCnpjFormatado("");
			dtoIncluir.setDescEmpresa("");
			return;
		}
    	try {
    		dtoIncluir.setDescEmpresa(null);
    		utilidadesServiceImpl.consultaLupaCnpj(dtoIncluir);
    		if(GissUtil.notNull(dtoIncluir.getCodEmpresa()) != 0){
    			carregaComboCosif(dtoIncluir);
    		}
		} catch (Exception e) {
			if(dtoIncluir.getDescEmpresa() == null){
				BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			}else{
				dtoIncluir.setCodEmpresa(dtoIncluir.getCodEmpresa());
			}
		}
    }
    
    public String pesquisar(){
		if(GissUtil.notNull(dtoManter.getCodEmpresa()) == 0 && GissUtil.notNull(dtoManter.getCnpjFormatado()).equals("")){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher Código Empresa ou CNPJ Empresa!", false);
			return"";
		}
		listarCadastroEmpresa(dtoManter, PESQUISAR);
		return "";
	}
    
    public String pesquisarHistorico(){
		if(GissUtil.notNull(dtoHistorico.getCodEmpresa()) == 0 && GissUtil.notNull(dtoHistorico.getCnpjFormatado()).equals("") && dtoHistorico.getDataAtualizacao()==null){
			BradescoFacesUtils.addInfoModalMessage("Favor preencher Código Empresa ou CNPJ Empresa ou Data de Atualização!", false);
			return"";
		}
		dtoHistorico.setLista(new ArrayList<EmpresaISSDTO>());
		selectItemCadastro = new ArrayList<SelectItem>();
		empresasISSServiceImpl.ListarHistoricoEmp(dtoHistorico);
		mostrarListaEmpresa = dtoHistorico.getLista().size() > 0;
		if (dtoHistorico.getLista() != null) {
			selectItemCadastro = new ArrayList<SelectItem>();
			for (int i = 0; i < dtoHistorico.getLista().size(); i++) {
				selectItemCadastro.add(new SelectItem(i, " "));
			}
		}
		return "";
	}
    
    private void listarCadastroEmpresa(EmpresaISSDTO dto, int tipoPesquisa) {
    	try {
    		dto.setLista(new ArrayList<EmpresaISSDTO>());
    		selectItemCadastro = new ArrayList<SelectItem>();
			empresasISSServiceImpl.ListaEmpCadastro(dto);
			mostrarListaEmpresa = dto.getLista().size() > 0;
			if (dto.getLista() != null) {
				selectItemCadastro = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectItemCadastro.add(new SelectItem(i, " "));
				}
			}
    	} catch (PdcAdapterFunctionalException p) {
			if (tipoPesquisa == INICIAL && p.getMessage().equals("NAO EXISTEM DADOS A SEREM LISTADOS")) {
				return;
			}
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			if (tipoPesquisa == INICIAL && e.getMessage().equals("NAO EXISTEM DADOS A SEREM LISTADOS")) {
				return;
			}
			throw new BradescoViewException(e.getMessage(), e, null);
		}
			
	}
    
    public String incluirContaIncluir(){
    	
    	if(GissUtil.notNull(dtoIncluir.getContas().getContaResumo()) == 0){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o Resumo!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoIncluir.getContas().getCosif()) == 0l){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o COSIF!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoIncluir.getContas().getContaReceita()) == 0l){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o Conta Receita!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoIncluir.getContas().getDescContaReceita()).equals("")&& !dtoIncluir.getCombos().getCodSistemaContabil().equals(1)){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher a Descrição da Conta Receita!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoIncluir.getContas().getCodItemServicoLC()) == 0){
    		BradescoFacesUtils.addInfoModalMessage("Favor Selecionar um Item Serviço!", false);
    		return"";
    	}
    	
    	for (int i = 0; i < comboServico.size(); i++) {
			if(comboServico.get(i).getCodItemServ().equals(dtoIncluir.getContas().getCodItemServicoLC())){
				dtoIncluir.getContas().setDescItemServicoLC(comboServico.get(i).getDescItemServExibicao());
			}
		}
    	
    	ContasISSDTO dto= new ContasISSDTO();	
    	if(dtoIncluir.getCombos().getCodSistemaContabil().equals(1)){
    		for (int i = 0; i < comboCosif.size(); i++) {
    			if(comboCosif.get(i).getCodCosif().equals(dtoIncluir.getContas().getCosif())){
    				dtoIncluir.getContas().setCosifExibicao(comboCosif.get(i).getCodCosifExibicao());
    			}
    		}
    		for (int i = 0; i < comboContaReceita.size(); i++) {
    			if(comboContaReceita.get(i).getContaReceita().equals(dtoIncluir.getContas().getContaReceita())){
    				dtoIncluir.getContas().setDescContaReceita(comboContaReceita.get(i).getDescContaReceitaExibicao());
    				dtoIncluir.getContas().setDescContaReceitaInc(comboContaReceita.get(i).getDescContaReceita());
    			}
    		}
    	}else{
    		String cosifFormatado = GissUtil.preencherZerosAEsquerda(String.valueOf(dtoIncluir.getContas().getCosif()), 8);
    		dtoIncluir.getContas().setCosifExibicao(GissUtil.mascaraCosif(cosifFormatado));
    		dtoIncluir.getContas().setDescContaReceitaInc(dtoIncluir.getContas().getDescContaReceita());
    		String contaFormatado = GissUtil.preencherZerosAEsquerda(String.valueOf(dtoIncluir.getContas().getContaReceita()), 14) + " - "+dtoIncluir.getContas().getDescContaReceita();
    		dtoIncluir.getContas().setDescContaReceita(contaFormatado);
    	}
    	GissUtil.copiarPropriedadesNaoNulas(dtoIncluir.getContas(), dto);
    	for (int i = 0; i < dtoIncluir.getContas().getListaContas().size(); i++) {
    		ContasISSDTO conta = dtoIncluir.getContas().getListaContas().get(i);
    		if(conta.getContaResumo().equals(dto.getContaResumo()) && conta.getCosif().equals(dto.getCosif()) 
    				&& conta.getContaReceita().equals(dto.getContaReceita()) && conta.getCodItemServicoLC().equals(dto.getCodItemServicoLC())){
    			BradescoFacesUtils.addInfoModalMessage("Ocorrencia já cadastrada!", false);
    			return"";
    		}
    	}
    	dtoIncluir.getContas().getListaContas().add(dto);
    	selectItemContas = new ArrayList<SelectItem>();
		for (int i = 0; i < dtoIncluir.getContas().getListaContas().size(); i++) {
			selectItemContas.add(new SelectItem(i, " "));
		}
		limparCamposConta(dtoIncluir);
		return "incluirCadEmpresa";
    }
    

    private void limparCamposConta(EmpresaISSDTO dto) {
    	dto.getContas().setContaResumo(null);
    	dto.getContas().setCosif(null);
    	dto.getContas().setContaReceita(null);
    	dto.getContas().setDescContaReceita(null);
    	dto.getContas().setCodItemServicoLC(null);
    	selectItemContaReceita = new ArrayList<SelectItem>();		
    	comboContaReceita = new ArrayList<CombosISSDTO>();
    	codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
    	
    }

	public String incluirContaAlterar(){
		
		if(GissUtil.notNull(dtoAlterar.getContas().getContaResumo()) == 0){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o Resumo!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoAlterar.getContas().getCosif()) == 0l){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o COSIF!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoAlterar.getContas().getContaReceita()) == 0l){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher o Conta Receita!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoAlterar.getContas().getDescContaReceita()).equals("")&& !dtoAlterar.getCombos().getCodSistemaContabil().equals(1)){
    		BradescoFacesUtils.addInfoModalMessage("Favor Preencher a Descrição da Conta Receita!", false);
    		return"";
    	}
    	if(GissUtil.notNull(dtoAlterar.getContas().getCodItemServicoLC()) == 0){
    		BradescoFacesUtils.addInfoModalMessage("Favor Selecionar um Item Serviço!", false);
    		return"";
    	}
		
    	for (int i = 0; i < comboServico.size(); i++) {
			if(comboServico.get(i).getCodItemServ().equals(dtoAlterar.getContas().getCodItemServicoLC())){
				dtoAlterar.getContas().setDescItemServicoLC(comboServico.get(i).getDescItemServ());
			}
		}
    	
    	ContasISSDTO dto= new ContasISSDTO();	
    	if(dtoAlterar.getCombos().getCodSistemaContabil().equals(1)){
    		for (int i = 0; i < comboContaReceita.size(); i++) {
    			if(comboContaReceita.get(i).getContaReceita().equals(dtoAlterar.getContas().getContaReceita())){
    				dtoAlterar.getContas().setDescContaReceita(comboContaReceita.get(i).getDescContaReceita());
    			}
    		}
    	}
    	GissUtil.copiarPropriedadesNaoNulas(dtoAlterar.getContas(), dto);
    	for (int i = 0; i < dtoAlterar.getContas().getListaContas().size(); i++) {
    		ContasISSDTO conta = dtoAlterar.getContas().getListaContas().get(i);
    		if(conta.getContaResumo().equals(dto.getContaResumo()) && conta.getCosif().equals(dto.getCosif()) 
    				&& conta.getContaReceita().equals(dto.getContaReceita()) && conta.getCodItemServicoLC().equals(dto.getCodItemServicoLC())){
    			BradescoFacesUtils.addInfoModalMessage("Ocorrencia já cadastrada!", false);
    			return"";
    		}
    	}
    	BradescoFacesUtils.addInfoModalMessage(empresasISSServiceImpl.incluirContasEmp(dto, dtoAlterar.getCodEmpresa()), false);
    	
    	listarContaEmpresa();
		limparCamposConta(dtoAlterar);
    	return inicializarAlterar();
    }
    
	public String confirmarInclusaoEmpresa(){
		if(hiddenProsseguir){
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0){
				pesquisarMunicipio(dtoIncluir);
				dtoIncluir.setCodMunicipio(buscaMunicipio.getCodigo());
			}else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")){
				pesquisarMunicipio(dtoIncluir);
				return"";
			}else if(!GissUtil.notNull(dtoIncluir.getEstado()).equals("")){
				dtoIncluir.setCodMunicipio(GissUtil.notNull(buscaMunicipio.getCodigo())!=0l?buscaMunicipio.getCodigo():0l);
			}
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) == 0 || GissUtil.notNull(dtoIncluir.getEstado()).equals("") || GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")){			
				BradescoFacesUtils.addInfoModalMessage("Preencher o estado e município.", false);
				return"";
			}
			if (GissUtil.notNull(dtoIncluir.getCodEmpresa()) == 0) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Código Empresa!", false);
				return "";
			}
			if(GissUtil.notNull(dtoIncluir.getCnpjFormatado()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o CNPJ Empresa", false);
				return "";
			}
			if(GissUtil.notNull(dtoIncluir.getCombos().getCodSistemaContabil()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar o Sistema Contábil!", false);
				return "";
			}
			if(GissUtil.notNull(dtoIncluir.getPerRejeicaoArquivo()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Percentual de Regeição!", false);
				return "";
			}
			
			if(GissUtil.notNull(dtoIncluir.getContaDespesa()) == 0L){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o campo Conta Despesa!", false);
				return "";
			}
			if(GissUtil.notNull(dtoIncluir.getContaProvisao()) == 0L){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Campo Conta Provisão!", false);
				return "";
			}
			if(dtoIncluir.getContas().getListaContas().size() == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor adicionar uma conta!", false);
				return "";
			} else {
				
			BradescoFacesUtils.addInfoModalMessage(empresasISSServiceImpl.incluirCadastroEmp(dtoIncluir), false);
			dtoIncluir = new EmpresaISSDTO();
			
			}
			return inicializarManter();
		}
		codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
		return "";
	}
	
	public String confirmarAlteracao(){
		if(hiddenProsseguir){
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0){
				pesquisarMunicipio(dtoAlterar);
				dtoAlterar.setCodMunicipio(buscaMunicipio.getCodigo());
			}else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")){
				pesquisarMunicipio(dtoAlterar);
				return"";
			}else if(!GissUtil.notNull(dtoAlterar.getEstado()).equals("")){
				dtoAlterar.setCodMunicipio(GissUtil.notNull(buscaMunicipio.getCodigo())!=0l?buscaMunicipio.getCodigo():0l);
			}
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) == 0 || GissUtil.notNull(dtoAlterar.getEstado()).equals("") || GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")){			
				BradescoFacesUtils.addInfoModalMessage("Preencher o estado e município.", false);
				return"";
			}
			if(GissUtil.notNull(dtoAlterar.getCombos().getCodSistemaContabil()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar o Sistema Contábil!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getPerRejeicaoArquivo()).equals("")){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Percentual de Regeição!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getContaDespesa()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o campo Conta Despesa!", false);
				return "";
			}
			if(GissUtil.notNull(dtoAlterar.getContaProvisao()) == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor preencher o Campo Conta Provisão!", false);
				return "";
			}
			if(dtoAlterar.getContas().getListaContas().size() == 0){
				BradescoFacesUtils.addInfoModalMessage("Favor adicionar ao menos uma conta!", false);
				return "";
				
			} else {
				BradescoFacesUtils.addInfoModalMessage(empresasISSServiceImpl.alterarCadastroEmp(dtoAlterar), false);
				
			}
		return inicializarManter();
		}
		codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
		return "";
		
	}

	public String excluirContasIncluir(){
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabelaContas.length > 0){
				List<ContasISSDTO> listaContasRemove = new ArrayList<ContasISSDTO>(); 
				for (Integer check : codigosSelecionadosTabelaContas) {
					listaContasRemove.add(dtoIncluir.getContas().getListaContas().get(check));
				}
				if(listaContasRemove.size() > 0){
					dtoIncluir.getContas().getListaContas().removeAll(listaContasRemove);
					setCodigosSelecionadosTabelaContas(new Integer[100]);
					setSelectItemContas(new ArrayList<SelectItem>(dtoIncluir.getContas().getListaContas().size()));
					for (int i = 0; i < dtoIncluir.getContas().getListaContas().size(); i++) {
						selectItemContas.add(new SelectItem(i, " "));
					}
				}
				setCheckTodosContas(false);
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
				return "";
			}
		}
		codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
		return "";
	}
	
	public String excluirContas(){
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabelaContas.length > 0){
				if(codigosSelecionadosTabelaContas.length != dtoAlterar.getContas().getListaContas().size()){
					dto.setListaContas(new ArrayList<ContasISSDTO>());
					for (Integer check : codigosSelecionadosTabelaContas) {
						dto.getListaContas().add(dtoAlterar.getContas().getListaContas().get(check));
					}
					String msg = empresasISSServiceImpl.ExcluirContasEmp(dto, dtoAlterar.getCodEmpresa());
					BradescoFacesUtils.addInfoModalMessage(msg, false);
				}else{
					BradescoFacesUtils.addInfoModalMessage("Não é permitido excluir todas as contas!", false);
				}
				return inicializarAlterar();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um ou mais itens na lista!", false);
				return "";
			}
		}
		codigosSelecionadosTabelaContas = new Integer[100];
		checkTodosContas = false;
		return "";
	}
	
	public String excluirEmpresa(){
		EmpresaISSDTO dtoEmp = new EmpresaISSDTO();
		if (isHiddenProsseguir()) {
			if(codigosSelecionadosTabela!=null){
				dtoEmp.setLista(new ArrayList<EmpresaISSDTO>());
				dtoEmp.getLista().add(dtoManter.getLista().get(codigosSelecionadosTabela));
				BradescoFacesUtils.addInfoModalMessage(empresasISSServiceImpl.ExcluirCadastroEmp(dtoEmp), false);
				return inicializarManter();
			}else{
				BradescoFacesUtils.addInfoModalMessage("Favor selecionar um item na lista!", false);
				return "";
			}
		}
		return "";
	}
	
	public void atribuirTodosIncluir() {
		if(checkTodosContas){
			codigosSelecionadosTabelaContas = new Integer[dtoIncluir.getContas().getListaContas().size()];
			for (int i = 0; i < dtoIncluir.getContas().getListaContas().size(); i++) {
				if(i== 100)
					break;
				codigosSelecionadosTabelaContas[i] = i;
			}
		}else{
			codigosSelecionadosTabelaContas = new Integer[100];
		}
	}
	
	public void processa() {
		if(tipoManutencao == INCLUIR){
			dtoIncluir.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
		}else if(tipoManutencao == HISTORICO){
			dtoTemp.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
		}else{
			dtoAlterar.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
		}
	}
	
	public void pesquisarMunicipioIncluir(){
		pesquisarMunicipio(dtoIncluir);
	}
	public void pesquisarMunicipioAlterar(){
		pesquisarMunicipio(dtoAlterar);
	}
	public void pesquisarMunicipioHistorico(){
		pesquisarMunicipio(dtoTemp);
	}
	
	private void pesquisarMunicipio(EmpresaISSDTO dto){
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(dto.getEstado().equals(listaDosEstados.get(i).getCodigo())){
				uf = listaDosEstados.get(i).getSigla();
				dto.setDescEstado(listaDosEstados.get(i).getNome());
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	
	/**
	 * @return the empresasISSServiceImpl
	 */
	public IEmpresaISSService getEmpresasISSServiceImpl() {
		return empresasISSServiceImpl;
	}
	/**
	 * @param empresasISSServiceImpl the empresasISSServiceImpl to set
	 */
	public void setEmpresasISSServiceImpl(IEmpresaISSService empresasISSServiceImpl) {
		this.empresasISSServiceImpl = empresasISSServiceImpl;
	}

	/**
	 * @return the selectItemCadastro
	 */
	public List<SelectItem> getSelectItemCadastro() {
		return selectItemCadastro;
	}
	/**
	 * @param selectItemCadastro the selectItemCadastro to set
	 */
	public void setSelectItemCadastro(List<SelectItem> selectItemCadastro) {
		this.selectItemCadastro = selectItemCadastro;
	}

	/**
	 * @return the dtoAlterar
	 */
	public EmpresaISSDTO getDtoAlterar() {
		return dtoAlterar;
	}
	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(EmpresaISSDTO dtoAlterar) {
		this.dtoAlterar = dtoAlterar;
	}
	/**
	 * @return the dtoManter
	 */
	public EmpresaISSDTO getDtoManter() {
		return dtoManter;
	}
	/**
	 * @param dtoManter the dtoManter to set
	 */
	public void setDtoManter(EmpresaISSDTO dtoManter) {
		this.dtoManter = dtoManter;
	}
	/**
	 * @return the mostrarListaEmpresa
	 */
	public boolean isMostrarListaEmpresa() {
		return mostrarListaEmpresa;
	}
	/**
	 * @param mostrarListaEmpresa the mostrarListaEmpresa to set
	 */
	public void setMostrarListaEmpresa(boolean mostrarListaEmpresa) {
		this.mostrarListaEmpresa = mostrarListaEmpresa;
	}
 
	/**
	 * @return the hiddenProsseguir
	 */
	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}
	/**
	 * @param hiddenProsseguir the hiddenProsseguir to set
	 */
	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}
	/**
	 * @return the checkTodos
	 */
	public boolean isCheckTodos() {
		return checkTodos;
	}
	/**
	 * @param checkTodos the checkTodos to set
	 */
	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}
	public void setCodigosSelecionadosTabela(Integer codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}
	public Integer getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}

	/**
	 * @return the selectItemContas
	 */
	public List<SelectItem> getSelectItemContas() {
		return selectItemContas;
	}

	/**
	 * @param selectItemContas the selectItemContas to set
	 */
	public void setSelectItemContas(List<SelectItem> selectItemContas) {
		this.selectItemContas = selectItemContas;
	}

	/**
	 * @return the checkTodosContas
	 */
	public boolean isCheckTodosContas() {
		return checkTodosContas;
	}

	/**
	 * @param checkTodosContas the checkTodosContas to set
	 */
	public void setCheckTodosContas(boolean checkTodosContas) {
		this.checkTodosContas = checkTodosContas;
	}

	/**
	 * @return the codigosSelecionadosTabelaContas
	 */
	public Integer[] getCodigosSelecionadosTabelaContas() {
		return codigosSelecionadosTabelaContas;
	}

	/**
	 * @param codigosSelecionadosTabelaContas the codigosSelecionadosTabelaContas to set
	 */
	public void setCodigosSelecionadosTabelaContas(Integer[] codigosSelecionadosTabelaContas) {
		this.codigosSelecionadosTabelaContas = codigosSelecionadosTabelaContas;
	}

	/**
	 * @return the dtoIncluir
	 */
	public EmpresaISSDTO getDtoIncluir() {
		return dtoIncluir;
	}

	/**
	 * @param dtoIncluir the dtoIncluir to set
	 */
	public void setDtoIncluir(EmpresaISSDTO dtoIncluir) {
		this.dtoIncluir = dtoIncluir;
	}


	/**
	 * @return the mostrarListaContas
	 */
	public boolean isMostrarListaContas() {
		return mostrarListaContas;
	}

	/**
	 * @param mostrarListaContas the mostrarListaContas to set
	 */
	public void setMostrarListaContas(boolean mostrarListaContas) {
		this.mostrarListaContas = mostrarListaContas;
	}

	/**
	 * @return the dto
	 */
	public ContasISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(ContasISSDTO dto) {
		this.dto = dto;
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
	 * @return the selectItemServico
	 */
	public List<SelectItem> getSelectItemServico() {
		return selectItemServico;
	}

	/**
	 * @param selectItemServico the selectItemServico to set
	 */
	public void setSelectItemServico(List<SelectItem> selectItemServico) {
		this.selectItemServico = selectItemServico;
	}

	/**
	 * @return the selectItemCosif
	 */
	public List<SelectItem> getSelectItemCosif() {
		return selectItemCosif;
	}

	/**
	 * @param selectItemCosif the selectItemCosif to set
	 */
	public void setSelectItemCosif(List<SelectItem> selectItemCosif) {
		this.selectItemCosif = selectItemCosif;
	}

	/**
	 * @return the selectItemSistContabil
	 */
	public List<SelectItem> getSelectItemSistContabil() {
		return selectItemSistContabil;
	}

	/**
	 * @param selectItemSistContabil the selectItemSistContabil to set
	 */
	public void setSelectItemSistContabil(List<SelectItem> selectItemSistContabil) {
		this.selectItemSistContabil = selectItemSistContabil;
	}

	/**
	 * @return the selectItemContaReceita
	 */
	public List<SelectItem> getSelectItemContaReceita() {
		return selectItemContaReceita;
	}

	/**
	 * @param selectItemContaReceita the selectItemContaReceita to set
	 */
	public void setSelectItemContaReceita(List<SelectItem> selectItemContaReceita) {
		this.selectItemContaReceita = selectItemContaReceita;
	}

	/**
	 * @return the comboServico
	 */
	public List<CombosISSDTO> getComboServico() {
		return comboServico;
	}

	/**
	 * @param comboServico the comboServico to set
	 */
	public void setComboServico(List<CombosISSDTO> comboServico) {
		this.comboServico = comboServico;
	}

	/**
	 * @return the comboCosif
	 */
	public List<CombosISSDTO> getComboCosif() {
		return comboCosif;
	}

	/**
	 * @param comboCosif the comboCosif to set
	 */
	public void setComboCosif(List<CombosISSDTO> comboCosif) {
		this.comboCosif = comboCosif;
	}

	/**
	 * @return the comboSistContabil
	 */
	public List<CombosISSDTO> getComboSistContabil() {
		return comboSistContabil;
	}

	/**
	 * @param comboSistContabil the comboSistContabil to set
	 */
	public void setComboSistContabil(List<CombosISSDTO> comboSistContabil) {
		this.comboSistContabil = comboSistContabil;
	}

	/**
	 * @return the comboContaReceita
	 */
	public List<CombosISSDTO> getComboContaReceita() {
		return comboContaReceita;
	}

	/**
	 * @param comboContaReceita the comboContaReceita to set
	 */
	public void setComboContaReceita(List<CombosISSDTO> comboContaReceita) {
		this.comboContaReceita = comboContaReceita;
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
	 * @return the buscaMunicipio
	 */
	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	/**
	 * @param buscaMunicipio the buscaMunicipio to set
	 */
	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	/**
	 * @return the listaEstados
	 */
	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	/**
	 * @param listaEstados the listaEstados to set
	 */
	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	/**
	 * @return the listaDosEstados
	 */
	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	/**
	 * @param listaDosEstados the listaDosEstados to set
	 */
	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	/**
	 * @return the dtoHistorico
	 */
	public EmpresaISSDTO getDtoHistorico() {
		return dtoHistorico;
	}

	/**
	 * @param dtoHistorico the dtoHistorico to set
	 */
	public void setDtoHistorico(EmpresaISSDTO dtoHistorico) {
		this.dtoHistorico = dtoHistorico;
	}

	/**
	 * @return the dtoHistoricoDet
	 */
	public EmpresaISSDTO getDtoHistoricoDet() {
		return dtoHistoricoDet;
	}

	/**
	 * @param dtoHistoricoDet the dtoHistoricoDet to set
	 */
	public void setDtoHistoricoDet(EmpresaISSDTO dtoHistoricoDet) {
		this.dtoHistoricoDet = dtoHistoricoDet;
	}
}