package br.com.bradesco.web.giss.view.bean.controller.municipio.historico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.historicomunicipio.IHistMunicipioServiceConstants;
import br.com.bradesco.web.giss.service.business.historicomunicipio.IHistoricoMunicipioService;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.DetalheHistoricoMunicipioDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistMunConResultadoDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioContasDTO;
import br.com.bradesco.web.giss.service.business.historicomunicipio.bean.HistoricoMunicipioDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class HistoricoMunicipioBean implements Serializable, BuscaMunicipioCallback{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manterEstadoFiltro;
	private ILogManager logger;

	private List<SelectItem> listaControlePesquisaManter = new ArrayList<SelectItem>();
	private String nome;
	private String vencimento;
	private String pagmentoSetimoDia;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String tipoIncidencia;
	private String estadoRecolhimento;
	private String tipoAlteracao;
	private String descricaoAnterior;
	private String descricaoAtual;

	private List<HistoricoMunicipioContasDTO> listaPesquisaContas;

	private boolean mostraBotoesConta;
	private List<SelectItem> listaControleConta = new ArrayList<SelectItem>();

	private boolean mostraBotoesContaResultado;

	//Minhas alterações

	private String aliquota;
	private IHistoricoMunicipioService historicoMunicipioImpl;													//referente a interface
	private String estadoFiltro;
	public List<SelectItem> listaEstados = new ArrayList<SelectItem>();	
	private String codigo;
	private String descricao;
	private String atualizacao;
	private String exclusao;
	private int linha;
	private List<HistoricoMunicipioDTO> listaHistoricoMunicipios;
	private int radioTelaManter;
	private boolean mostraBotoes;
	private boolean mostraContasTipoServico;
	private boolean carregaMunicipios;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaControleCheckRadioContas = new ArrayList<SelectItem>();
	private String estado;
	private String percentualAliquotaMunicipio;
	private String diaVencimento;
	private String pagamentoDiaUtil;
	private String formaPagamento;
	private String percentBaseCalculo;
	private String percentAliquotaPadrao;
	private String codigoTipoIncidencia;
	private String nomeIncidencia;
	private String nomeEstadoResponsavel;
	private String codigoUorgResponsavel;
	private String nomeUorgResponsavel;
	private String dependenciaCentralizadora;
	private String estadoCentralizador;
	private String codigoMunicipioCentralizador;
	private String descricaoMunicipioCentralizador;
	private List<DetalheHistoricoMunicipioDTO> listaHistoricoMunicipiosDetalhe;
	public List<SelectItem> listaTipoServico = new ArrayList<SelectItem>();	
	private String tipoServicoFiltro;
	private int radioTelaManterContas;
	private String descricaoDetalhe;
	private String conta;
	private String razao;
	private String codigoTributo;
	private List<HistoricoMunicipioContasDTO> listaHistoricoMunicipioConta;
	private List<HistMunConResultadoDTO> listaHistoricoMunicipioContaResutltado;
	private String inicio;
	private String termino;
	private String tipoServico;
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils.getManagedBean("dependenciaImpl");
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private String codigoMunicipio;
	private String nroLei;
	private String descLei;
	private String inforComplementar;
	private String formaPagamentoAnt;
	private String pagamentoDiaUtilAnt;
	private String percentBaseCalculoAnt;
	private String percentAliquotaPadraoAnt;
	private String codigoUorgResponsavelAnt;
	private String nomeUorgResponsavelAnt;
	private String nroLeiAnt;
	private String descLeiAnt;
	private String inforComplementarAnt;
	private String dependenciaCentralizadoraAnt;
	private String estadoCentralizadorAnt;
	private String descricaoMunicipioCentralizadorAnt;
	private String codigoMunicipioCentralizadorAnt;
	private String diaVencimentoAnt;
	private String nomeIncidenciaAnt;



	public String inicializaHistoricoMunicipio(){

		estadoFiltro ="";
		carregaMunicipios = false;
		mostraBotoes = false; 
		carregaComboEstados();	
		buscaMunicipio = new BuscaMunicipioBean();
		listaHistoricoMunicipios = null;
		codigoMunicipio = null;
		
		return "historicoMunicipio";
	}


	public void buscaMunicipioManter(){
		buscaMunicipio(estadoFiltro);
	}
	
	public void buscaMunicipio(String estado){
			buscaMunicipio.setCallback(this);
			buscaMunicipio.setSelecionado(null);
			String uf = null;
			for (int i = 0; i < listaDosEstados.size(); i++) {
				if(estado.equals(listaDosEstados.get(i).getCodigo()))
					uf = listaDosEstados.get(i).getSigla();
			}
			buscaMunicipio.setEstado(uf != null?uf:"");
			buscaMunicipio.buscar();
	}
	
	public void processa() {
			estadoFiltro = GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf());
	}
	
	
	
	public List<SelectItem> carregaComboEstados() {

		// Chama classe de servico para preenchimento do combo de Estados
		listaDosEstados = dependenciaImpl.listagemEstados();

		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);

		return listaEstados;
	}


	public void carregaListaHistoricoMunicipio() {
		if(buscaMunicipio.getCodigo() != null && buscaMunicipio.getCodigo() != 0){
			buscaMunicipioManter();
			codigoMunicipio = buscaMunicipio.getCodigo().toString();
			listarHistoricoMunicipios();
		}else if(buscaMunicipio.getDescricao() != null && !buscaMunicipio.getDescricao().equals("")){
			buscaMunicipioManter();
			return;
		}else if(!estadoFiltro.equals("") && estadoFiltro != null){
			codigoMunicipio = buscaMunicipio.getCodigo()!=null&&buscaMunicipio.getCodigo()!=0?buscaMunicipio.getCodigo().toString():"0";
			listarHistoricoMunicipios();
		}else{			
			BradescoFacesUtils.addInfoModalMessage("Selecione o estado ou Preencha o município.", false);
		}

	}

	public void listarHistoricoMunicipios(){
		try {

			listaHistoricoMunicipios = historicoMunicipioImpl.listaGriHistoricoMunicipio(Integer.parseInt(estadoFiltro), codigoMunicipio != null?Long.valueOf(codigoMunicipio):0L);

			if (historicoMunicipioImpl != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaHistoricoMunicipios.size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (listaHistoricoMunicipios.size() >= IHistMunicipioServiceConstants.NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}

				carregaMunicipios = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			estadoFiltro = "";
			carregaMunicipios = false;
			mostraBotoes = false;
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "historicoMunicipio", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}


	public String consultarHistorico(){

		try{
			HistoricoMunicipioDTO historicoMunicipioDTO = (HistoricoMunicipioDTO)getListaHistoricoMunicipios().get(new Integer(radioTelaManter));
			setCodigo(historicoMunicipioDTO.getCodigo());
			setDescricao(historicoMunicipioDTO.getDescricao());
			
			DetalheHistoricoMunicipioDTO historicoMunicipiosDetalhe = historicoMunicipioImpl.listaDetalheMunicipio(Integer.parseInt(codigo), historicoMunicipioDTO.getHoraRegistroInclusao());
			estado = GissUtil.procuraUnidadeFederativaSemCodigo(listaEstados, estadoFiltro);
			
			tipoAlteracao = historicoMunicipiosDetalhe.getTipoAlteracao();
			descricaoAnterior = historicoMunicipiosDetalhe.getDescricaoAnterior();
			descricaoAtual = historicoMunicipiosDetalhe.getDescricaoAtual();
			
			diaVencimento = historicoMunicipiosDetalhe.getDiaVencimento();
			diaVencimentoAnt = historicoMunicipiosDetalhe.getDiaVencimentoAnt();
			if (diaVencimento == null || diaVencimento.trim().equals("") || Integer.parseInt(diaVencimento) <= 0) {
				diaVencimento = "";
			}

			
			pagamentoDiaUtil = historicoMunicipiosDetalhe.getPagamentoDiaUtil().equals("S")?
					IHistMunicipioServiceConstants.PGTO_DIA_UTIL_SIM:historicoMunicipiosDetalhe.getPagamentoDiaUtil().equals("N")?IHistMunicipioServiceConstants.PGTO_DIA_UTIL_NAO:"";
			pagamentoDiaUtilAnt = historicoMunicipiosDetalhe.getPagamentoDiaUtilAnt().equals("S")?
					IHistMunicipioServiceConstants.PGTO_DIA_UTIL_SIM:historicoMunicipiosDetalhe.getPagamentoDiaUtilAnt().equals("N")?IHistMunicipioServiceConstants.PGTO_DIA_UTIL_NAO:"";
			
		
			formaPagamento = historicoMunicipiosDetalhe.getFormaPagamento().equals("1")?
					IHistMunicipioServiceConstants.FORMA_DE_PGTO_ANTECIPA:historicoMunicipiosDetalhe.getFormaPagamento().equals("2")?IHistMunicipioServiceConstants.FORMA_DE_PGTO_PRORROGA:"";
			formaPagamentoAnt = historicoMunicipiosDetalhe.getFormaPagamentoAnt().equals("1")?
					IHistMunicipioServiceConstants.FORMA_DE_PGTO_ANTECIPA:historicoMunicipiosDetalhe.getFormaPagamentoAnt().equals("2")?IHistMunicipioServiceConstants.FORMA_DE_PGTO_PRORROGA:"";
			

			codigoTipoIncidencia = historicoMunicipiosDetalhe.getCodigoTipoIncidencia();
			nomeIncidencia  = historicoMunicipiosDetalhe.getNomeIncidencia();
			//alterar a book
			nomeIncidenciaAnt  = historicoMunicipiosDetalhe.getNomeIncidenciaAnt();
			if (!GissUtil.notNull(codigoTipoIncidencia).trim().equals("") && Integer.parseInt(GissUtil.notNull(codigoTipoIncidencia)) > 0) {
				percentualAliquotaMunicipio = historicoMunicipiosDetalhe.getPercentualAliquotaMunicipio();
				percentBaseCalculo = historicoMunicipiosDetalhe.getPercentBaseCalculo();
				percentAliquotaPadrao = historicoMunicipiosDetalhe.getPercentAliquotaPadrao();
				percentBaseCalculoAnt = historicoMunicipiosDetalhe.getPercentBaseCalculoAnt();
				percentAliquotaPadraoAnt = historicoMunicipiosDetalhe.getPercentAliquotaPadraoAnt();
			} else {
				percentualAliquotaMunicipio = "";
				percentBaseCalculo = "";
				percentAliquotaPadrao = "";
				percentBaseCalculoAnt = "";
				percentAliquotaPadraoAnt = "";
			}

			nomeEstadoResponsavel = historicoMunicipiosDetalhe.getNomeEstadoResponsavel();
			codigoUorgResponsavel = historicoMunicipiosDetalhe.getCodigoUorgResponsavel();
			codigoUorgResponsavelAnt = historicoMunicipiosDetalhe.getCodigoUorgResponsavelAnt();
			nomeUorgResponsavel = historicoMunicipiosDetalhe.getNomeUorgResponsavel();
			nomeUorgResponsavelAnt = historicoMunicipiosDetalhe.getNomeUorgResponsavelAnt();
			if (codigoUorgResponsavel != null && Integer.parseInt(codigoUorgResponsavel) > 0) {
				dependenciaCentralizadora = codigoUorgResponsavel + " - " + nomeUorgResponsavel;
			} else {
				dependenciaCentralizadora = "";
			}
			if (codigoUorgResponsavelAnt != null && Integer.parseInt(codigoUorgResponsavelAnt) > 0) {
				dependenciaCentralizadoraAnt = codigoUorgResponsavelAnt + " - " + nomeUorgResponsavelAnt;
			} else {
				dependenciaCentralizadoraAnt = "";
			}
			estadoCentralizador = historicoMunicipiosDetalhe.getEstadoCentralizador();
			estadoCentralizadorAnt = historicoMunicipiosDetalhe.getEstadoCentralizadorAnt();
			codigoMunicipioCentralizador = historicoMunicipiosDetalhe.getCodigoMunicipioCentralizador();
			codigoMunicipioCentralizadorAnt = historicoMunicipiosDetalhe.getCodigoMunicipioCentralizadorAnt();
			descricaoMunicipioCentralizador = historicoMunicipiosDetalhe.getDescricaoMunicipioContralizador();
			descricaoMunicipioCentralizadorAnt = historicoMunicipiosDetalhe.getDescricaoMunicipioContralizadorAnt();
			if (codigoMunicipioCentralizador == null || Integer.parseInt(codigoMunicipioCentralizador) <= 0) {
				codigoMunicipioCentralizador = "";
				descricaoMunicipioCentralizador = "";
			}
			nroLei = historicoMunicipiosDetalhe.getNroLei();
			descLei = historicoMunicipiosDetalhe.getDescLei();
			inforComplementar = historicoMunicipiosDetalhe.getInfoComplementar();
			nroLeiAnt = historicoMunicipiosDetalhe.getNroLeiAnt();
			descLeiAnt = historicoMunicipiosDetalhe.getDescLeiAnt();
			inforComplementarAnt = historicoMunicipiosDetalhe.getInfoComplementarAnt();
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "historicoMunicipio", BradescoViewExceptionActionType.ACTION, false);
		}	

		return "PROSSEGUIR_CONSULTAR";
	}

	public String consultarContas(){
		setRadioTelaManterContas(-1);
		tipoServicoFiltro="";
		carregaComboTipoServico();
		mostraContasTipoServico = false;
		listaHistoricoMunicipioConta=null;
		return "PROSSEGUIR_CONTAS";
	}
	
	public String prosseguirContaResultado(){
		HistoricoMunicipioContasDTO historicoMunicipioContaDTO = (HistoricoMunicipioContasDTO)getListaHistoricoMunicipioConta().get(new Integer(radioTelaManterContas));
		conta= historicoMunicipioContaDTO.getConta();
		razao = historicoMunicipioContaDTO.getRazao();
		codigoTributo = historicoMunicipioContaDTO.getCodigoTributo();
		tipoServico = GissUtil.procuraTipoServico(listaTipoServico, tipoServicoFiltro);
		mostraContasTipoServico = false;
		carregaListaContasResultado();

		return "PROSSEGUIR_CONTAS_RESULTADO";
	}


	public List<SelectItem> carregaComboTipoServico(){

		//Chama classe de servico para preenchimento do combo de Tipo de Serviço
		listaTipoServico = historicoMunicipioImpl.listarComboTipoServico();

		return listaTipoServico;		
	}

	public void carregaListaContas(){
		try{
			
			listaHistoricoMunicipioConta = historicoMunicipioImpl.listaDetalheMunicipioResultado(Integer.parseInt(codigo),Integer.parseInt(tipoServicoFiltro));

			if (historicoMunicipioImpl != null) {
				listaControleCheckRadioContas = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaHistoricoMunicipioConta.size(); i++) {
					listaControleCheckRadioContas.add(new SelectItem(i, " "));
				}

				if (listaHistoricoMunicipioConta.size() >= IHistMunicipioServiceConstants.NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS_CONTA) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraContasTipoServico = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "PROSSEGUIR_CONSULTAR", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}


	public void carregaListaContasResultado(){
		try{
			
			
			if(GissUtil.validarRazao(razao) == -1){
                BradescoFacesUtils.addErrorModalMessage("Campo Razão inválido.");
                return;
            }
			Integer grupo = GissUtil.pegarCodigoGrupo(razao);
			Integer subGrupo = GissUtil.pegarCodigoSubgrupo(razao);
			
			mostraContasTipoServico = false;
			listaHistoricoMunicipioContaResutltado = historicoMunicipioImpl.listaHistoricoMunicipioContaResultado(Integer.parseInt(codigo),grupo,subGrupo);
		
			if (historicoMunicipioImpl != null) {

				if (listaHistoricoMunicipioContaResutltado.size() >= IHistMunicipioServiceConstants.NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS_CONTA) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				mostraContasTipoServico = true;
			}
			
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "PROSSEGUIR_CONSULTAR", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			}
	}

	public void limparListaContas(){
		setRadioTelaManterContas(-1);
	}
	
	public String voltarContas(){
		return "VOLTAR_CONTAS";
	}


	public String voltarPesquisar(){
		return "VOLTAR_PESQUISAR";
	}


	public String pesquisarDadosMunicipio(ActionEvent evt){
		carregaListaHistoricoMunicipio();
		setListaHistoricoMunicipios(listaHistoricoMunicipios);
		return "historicoMunicipio";
	}
	
	public String pesquisarResultadoPesquisa (ActionEvent evt){
		carregaListaContas();
		setListaHistoricoMunicipioConta(listaHistoricoMunicipioConta);
		return "PROSSEGUIR_CONTAS";
	}
	
	public String pesquisarContasMunicípio (ActionEvent evt){
		carregaListaContasResultado();
		setListaHistoricoMunicipioContaResutltado(listaHistoricoMunicipioContaResutltado);
		return "PROSSEGUIR_CONTAS_RESULTADO";
	}

	public String getTipoServico() {
		return tipoServico;
	}


	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}


	public String getInicio() {
		return inicio;
	}


	public void setInicio(String inicio) {
		this.inicio = inicio;
	}


	public String getTermino() {
		return termino;
	}


	public void setTermino(String termino) {
		this.termino = termino;
	}


	public IHistoricoMunicipioService getHistoricoMunicipioImpl() {
		return historicoMunicipioImpl;
	}

	public void setHistoricoMunicipioImpl(
			IHistoricoMunicipioService historicoMunicipioImpl) {
		this.historicoMunicipioImpl = historicoMunicipioImpl;
	}	



	public List<HistMunConResultadoDTO> getListaHistoricoMunicipioContaResutltado() {
		return listaHistoricoMunicipioContaResutltado;
	}


	public void setListaHistoricoMunicipioContaResutltado(
			List<HistMunConResultadoDTO> listaHistoricoMunicipioContaResutltado) {
		this.listaHistoricoMunicipioContaResutltado = listaHistoricoMunicipioContaResutltado;
	}

	public List<HistoricoMunicipioContasDTO> getListaHistoricoMunicipioConta() {
		return listaHistoricoMunicipioConta;
	}


	public void setListaHistoricoMunicipioConta(
			List<HistoricoMunicipioContasDTO> listaHistoricoMunicipioConta) {
		this.listaHistoricoMunicipioConta = listaHistoricoMunicipioConta;
	}



	public String getDescricaoDetalhe() {
		return descricaoDetalhe;
	}


	public void setDescricaoDetalhe(String descricaoDetalhe) {
		this.descricaoDetalhe = descricaoDetalhe;
	}


	public int getRadioTelaManterContas() {
		return radioTelaManterContas;
	}

	public void setRadioTelaManterContas(int radioTelaManterContas) {
		this.radioTelaManterContas = radioTelaManterContas;
	}


	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public List<DetalheHistoricoMunicipioDTO> getListaHistoricoMunicipiosDetalhe() {
		return listaHistoricoMunicipiosDetalhe;
	}


	public void setListaHistoricoMunicipiosDetalhe(
			List<DetalheHistoricoMunicipioDTO> listaHistoricoMunicipiosDetalhe) {
		this.listaHistoricoMunicipiosDetalhe = listaHistoricoMunicipiosDetalhe;
	}

	public String getCodigoTipoIncidencia() {
		return codigoTipoIncidencia;
	}


	public void setCodigoTipoIncidencia(String codigoTipoIncidencia) {
		this.codigoTipoIncidencia = codigoTipoIncidencia;
	}


	public String getCodigoUorgResponsavel() {
		return codigoUorgResponsavel;
	}


	public void setCodigoUorgResponsavel(String codigoUorgResponsavel) {
		this.codigoUorgResponsavel = codigoUorgResponsavel;
	}


	public String getDiaVencimento() {
		return diaVencimento;
	}


	public void setDiaVencimento(String diaVencimento) {
		this.diaVencimento = diaVencimento;
	}


	public String getNomeEstadoResponsavel() {
		return nomeEstadoResponsavel;
	}


	public void setNomeEstadoResponsavel(String nomeEstadoResponsavel) {
		this.nomeEstadoResponsavel = nomeEstadoResponsavel;
	}


	public String getNomeIncidencia() {
		return nomeIncidencia;
	}


	public void setNomeIncidencia(String nomeIncidencia) {
		this.nomeIncidencia = nomeIncidencia;
	}


	public String getNomeUorgResponsavel() {
		return nomeUorgResponsavel;
	}


	public void setNomeUorgResponsavel(String nomeUorgResponsavel) {
		this.nomeUorgResponsavel = nomeUorgResponsavel;
	}


	public String getPagamentoDiaUtil() {
		return pagamentoDiaUtil;
	}


	public void setPagamentoDiaUtil(String pagamentoDiaUtil) {
		this.pagamentoDiaUtil = pagamentoDiaUtil;
	}


	public String getPercentAliquotaPadrao() {
		return percentAliquotaPadrao;
	}


	public void setPercentAliquotaPadrao(String percentAliquotaPadrao) {
		this.percentAliquotaPadrao = percentAliquotaPadrao;
	}


	public String getPercentBaseCalculo() {
		return percentBaseCalculo;
	}


	public void setPercentBaseCalculo(String percentBaseCalculo) {
		this.percentBaseCalculo = percentBaseCalculo;
	}


	public String getPercentualAliquotaMunicipio() {
		return percentualAliquotaMunicipio;
	}


	public void setPercentualAliquotaMunicipio(String percentualAliquotaMunicipio) {
		this.percentualAliquotaMunicipio = percentualAliquotaMunicipio;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void limparGridManterDependencia(){
		setListaHistoricoMunicipios(null);
		setRadioTelaManter(-1);
	}



	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public boolean isCarregaMunicipios() {
		return carregaMunicipios;
	}



	public void setCarregaMunicipios(boolean carregaMunicipios) {
		this.carregaMunicipios = carregaMunicipios;
	}


	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}
	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public int getRadioTelaManter() {
		return radioTelaManter;
	}

	public void setRadioTelaManter(int radioTelaManter) {
		this.radioTelaManter = radioTelaManter;
	}


	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}


	public String getAtualizacao() {
		return atualizacao;
	}


	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getExclusao() {
		return exclusao;
	}


	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}


	public int getLinha() {
		return linha;
	}


	public void setLinha(int linha) {
		this.linha = linha;
	}

	public List<HistoricoMunicipioDTO> getListaHistoricoMunicipios() {
		return listaHistoricoMunicipios;
	}

	public void setListaHistoricoMunicipios(
			List<HistoricoMunicipioDTO> listaHistoricoMunicipios) {
		this.listaHistoricoMunicipios = listaHistoricoMunicipios;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoServicoFiltro() {
		return tipoServicoFiltro;
	}

	public void setTipoServicoFiltro(String tipoServicoFiltro) {
		this.tipoServicoFiltro = tipoServicoFiltro;
	}


	public String getCodigoTributo() {
		return codigoTributo;
	}

	public void setCodigoTributo(String codigoTributo) {
		this.codigoTributo = codigoTributo;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public String voltarConsultar() {
		return "VOLTAR_CONSULTAR";
	}

	public String getManterEstadoFiltro() {
		return manterEstadoFiltro;
	}

	public void setManterEstadoFiltro(String manterEstadoFiltro) {
		this.manterEstadoFiltro = manterEstadoFiltro;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public List<SelectItem> getListaControlePesquisaManter() {
		return listaControlePesquisaManter;
	}

	public void setListaControlePesquisaManter(
			List<SelectItem> listaControlePesquisaManter) {
		this.listaControlePesquisaManter = listaControlePesquisaManter;
	}

	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	public String getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}


	public String getDependenciaCentralizadora() {
		return dependenciaCentralizadora;
	}

	public void setDependenciaCentralizadora(String dependenciaCentralizadora) {
		this.dependenciaCentralizadora = dependenciaCentralizadora;
	}


	public String getEstadoRecolhimento() {
		return estadoRecolhimento;
	}

	public void setEstadoRecolhimento(String estadoRecolhimento) {
		this.estadoRecolhimento = estadoRecolhimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPagmentoSetimoDia() {
		return pagmentoSetimoDia;
	}

	public void setPagmentoSetimoDia(String pagmentoSetimoDia) {
		this.pagmentoSetimoDia = pagmentoSetimoDia;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public void limparPagina(ActionEvent evt) {
		logger.debug(this, "Iniciando a Limpeza da Página.");
		setManterEstadoFiltro("");
		//setListaPesquisaManter(null);
		//setListaContaResultado(null);
		setListaPesquisaContas(null);
		setRadioTelaManter(-1);
		setCodigo("");
		setNome("");
		setEstado("");
		setAliquota("");
		setVencimento("");
		setPagmentoSetimoDia("");
		setFormaPagamento("");
		setBaseCalculo("");
		setAliquotaPadrao("");
		setTipoIncidencia("");
		setEstadoRecolhimento("");
		setDependenciaCentralizadora("");
		//setMostraBotoesManter(false);
		setMostraBotoesContaResultado(false);
		logger.debug(this, "Finalizando a Limpeza da Página.");
	}

	public List<SelectItem> getListaControleConta() {
		return listaControleConta;
	}

	public void setListaControleConta(List<SelectItem> listaControleConta) {
		this.listaControleConta = listaControleConta;
	}

	public List<HistoricoMunicipioContasDTO> getListaPesquisaContas() {
		return listaPesquisaContas;
	}

	public void setListaPesquisaContas(
			List<HistoricoMunicipioContasDTO> listaPesquisaContas) {
		this.listaPesquisaContas = listaPesquisaContas;
	}

	public boolean isMostraBotoesConta() {
		return mostraBotoesConta;
	}

	public void setMostraBotoesConta(boolean mostraBotoesConta) {
		this.mostraBotoesConta = mostraBotoesConta;
	}

	public boolean isMostraBotoesContaResultado() {
		return mostraBotoesContaResultado;
	}

	public void setMostraBotoesContaResultado(boolean mostraBotoesContaResultado) {
		this.mostraBotoesContaResultado = mostraBotoesContaResultado;
	}

	public boolean isMostraContasTipoServico() {
		return mostraContasTipoServico;
	}

	public void setMostraContasTipoServico(boolean mostraContasTipoServico) {
		this.mostraContasTipoServico = mostraContasTipoServico;
	}


	public String getCodigoMunicipioCentralizador() {
		return codigoMunicipioCentralizador;
	}


	public void setCodigoMunicipioCentralizador(String codigoMunicipioCentralizador) {
		this.codigoMunicipioCentralizador = codigoMunicipioCentralizador;
	}


	public String getDescricaoMunicipioCentralizador() {
		return descricaoMunicipioCentralizador;
	}

	public void setDescricaoMunicipioCentralizador(
			String descricaoMunicipioCentralizador) {
		this.descricaoMunicipioCentralizador = descricaoMunicipioCentralizador;
	}

	public String getEstadoCentralizador() {
		return estadoCentralizador;
	}

	public void setEstadoCentralizador(String estadoCentralizador) {
		this.estadoCentralizador = estadoCentralizador;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}


	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}


	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}


	public String getRazao() {
		return razao;
	}


	public void setRazao(String razao) {
		this.razao = razao;
	}


	public String getNroLei() {
		return nroLei;
	}


	public void setNroLei(String nroLei) {
		this.nroLei = nroLei;
	}


	public String getDescLei() {
		return descLei;
	}


	public void setDescLei(String descLei) {
		this.descLei = descLei;
	}


	public String getInforComplementar() {
		return inforComplementar;
	}


	public void setInforComplementar(String inforComplementar) {
		this.inforComplementar = inforComplementar;
	}

	public String getLeiComplementar() {
		if (this.nroLei == null || this.descLei == null || ("0".equals(this.nroLei) && "".equals(this.descLei))) {
			return "";
		}

		return getNroLei() + " - " + getDescLei();
	}


	public String getTipoAlteracao() {
		return tipoAlteracao;
	}


	public void setTipoAlteracao(String tipoAlteracao) {
		this.tipoAlteracao = tipoAlteracao;
	}


	public String getDescricaoAnterior() {
		return descricaoAnterior;
	}


	public void setDescricaoAnterior(String descricaoAnterior) {
		this.descricaoAnterior = descricaoAnterior;
	}


	public String getDescricaoAtual() {
		return descricaoAtual;
	}


	public void setDescricaoAtual(String descricaoAtual) {
		this.descricaoAtual = descricaoAtual;
	}


	/**
	 * @return the formaPagamentoAnt
	 */
	public String getFormaPagamentoAnt() {
		return formaPagamentoAnt;
	}


	/**
	 * @param formaPagamentoAnt the formaPagamentoAnt to set
	 */
	public void setFormaPagamentoAnt(String formaPagamentoAnt) {
		this.formaPagamentoAnt = formaPagamentoAnt;
	}


	/**
	 * @return the pagamentoDiaUtilAnt
	 */
	public String getPagamentoDiaUtilAnt() {
		return pagamentoDiaUtilAnt;
	}


	/**
	 * @param pagamentoDiaUtilAnt the pagamentoDiaUtilAnt to set
	 */
	public void setPagamentoDiaUtilAnt(String pagamentoDiaUtilAnt) {
		this.pagamentoDiaUtilAnt = pagamentoDiaUtilAnt;
	}


	/**
	 * @return the percentBaseCalculoAnt
	 */
	public String getPercentBaseCalculoAnt() {
		return percentBaseCalculoAnt;
	}


	/**
	 * @param percentBaseCalculoAnt the percentBaseCalculoAnt to set
	 */
	public void setPercentBaseCalculoAnt(String percentBaseCalculoAnt) {
		this.percentBaseCalculoAnt = percentBaseCalculoAnt;
	}


	/**
	 * @return the percentAliquotaPadraoAnt
	 */
	public String getPercentAliquotaPadraoAnt() {
		return percentAliquotaPadraoAnt;
	}


	/**
	 * @param percentAliquotaPadraoAnt the percentAliquotaPadraoAnt to set
	 */
	public void setPercentAliquotaPadraoAnt(String percentAliquotaPadraoAnt) {
		this.percentAliquotaPadraoAnt = percentAliquotaPadraoAnt;
	}


	/**
	 * @return the codigoUorgResponsavelAnt
	 */
	public String getCodigoUorgResponsavelAnt() {
		return codigoUorgResponsavelAnt;
	}


	/**
	 * @param codigoUorgResponsavelAnt the codigoUorgResponsavelAnt to set
	 */
	public void setCodigoUorgResponsavelAnt(String codigoUorgResponsavelAnt) {
		this.codigoUorgResponsavelAnt = codigoUorgResponsavelAnt;
	}


	/**
	 * @return the nomeUorgResponsavelAnt
	 */
	public String getNomeUorgResponsavelAnt() {
		return nomeUorgResponsavelAnt;
	}


	/**
	 * @param nomeUorgResponsavelAnt the nomeUorgResponsavelAnt to set
	 */
	public void setNomeUorgResponsavelAnt(String nomeUorgResponsavelAnt) {
		this.nomeUorgResponsavelAnt = nomeUorgResponsavelAnt;
	}


	/**
	 * @return the nroLeiAnt
	 */
	public String getNroLeiAnt() {
		return nroLeiAnt;
	}


	/**
	 * @param nroLeiAnt the nroLeiAnt to set
	 */
	public void setNroLeiAnt(String nroLeiAnt) {
		this.nroLeiAnt = nroLeiAnt;
	}


	/**
	 * @return the descLeiAnt
	 */
	public String getDescLeiAnt() {
		return descLeiAnt;
	}


	/**
	 * @param descLeiAnt the descLeiAnt to set
	 */
	public void setDescLeiAnt(String descLeiAnt) {
		this.descLeiAnt = descLeiAnt;
	}


	/**
	 * @return the inforComplementarAnt
	 */
	public String getInforComplementarAnt() {
		return inforComplementarAnt;
	}


	/**
	 * @param inforComplementarAnt the inforComplementarAnt to set
	 */
	public void setInforComplementarAnt(String inforComplementarAnt) {
		this.inforComplementarAnt = inforComplementarAnt;
	}


	/**
	 * @return the dependenciaCentralizadoraAnt
	 */
	public String getDependenciaCentralizadoraAnt() {
		return dependenciaCentralizadoraAnt;
	}


	/**
	 * @param dependenciaCentralizadoraAnt the dependenciaCentralizadoraAnt to set
	 */
	public void setDependenciaCentralizadoraAnt(String dependenciaCentralizadoraAnt) {
		this.dependenciaCentralizadoraAnt = dependenciaCentralizadoraAnt;
	}


	/**
	 * @return the estadoCentralizadorAnt
	 */
	public String getEstadoCentralizadorAnt() {
		return estadoCentralizadorAnt;
	}


	/**
	 * @param estadoCentralizadorAnt the estadoCentralizadorAnt to set
	 */
	public void setEstadoCentralizadorAnt(String estadoCentralizadorAnt) {
		this.estadoCentralizadorAnt = estadoCentralizadorAnt;
	}


	/**
	 * @return the descricaoMunicipioCentralizadorAnt
	 */
	public String getDescricaoMunicipioCentralizadorAnt() {
		return descricaoMunicipioCentralizadorAnt;
	}


	/**
	 * @param descricaoMunicipioCentralizadorAnt the descricaoMunicipioCentralizadorAnt to set
	 */
	public void setDescricaoMunicipioCentralizadorAnt(String descricaoMunicipioCentralizadorAnt) {
		this.descricaoMunicipioCentralizadorAnt = descricaoMunicipioCentralizadorAnt;
	}


	/**
	 * @return the codigoMunicipioCentralizadorAnt
	 */
	public String getCodigoMunicipioCentralizadorAnt() {
		return codigoMunicipioCentralizadorAnt;
	}


	/**
	 * @param codigoMunicipioCentralizadorAnt the codigoMunicipioCentralizadorAnt to set
	 */
	public void setCodigoMunicipioCentralizadorAnt(String codigoMunicipioCentralizadorAnt) {
		this.codigoMunicipioCentralizadorAnt = codigoMunicipioCentralizadorAnt;
	}


	/**
	 * @return the diaVencimentoAnt
	 */
	public String getDiaVencimentoAnt() {
		return diaVencimentoAnt;
	}


	/**
	 * @param diaVencimentoAnt the diaVencimentoAnt to set
	 */
	public void setDiaVencimentoAnt(String diaVencimentoAnt) {
		this.diaVencimentoAnt = diaVencimentoAnt;
	}


	/**
	 * @return the nomeIncidenciaAnt
	 */
	public String getNomeIncidenciaAnt() {
		return nomeIncidenciaAnt;
	}


	/**
	 * @param nomeIncidenciaAnt the nomeIncidenciaAnt to set
	 */
	public void setNomeIncidenciaAnt(String nomeIncidenciaAnt) {
		this.nomeIncidenciaAnt = nomeIncidenciaAnt;
	}


	/**
	 * @return the listaControleCheckRadioContas
	 */
	public List<SelectItem> getListaControleCheckRadioContas() {
		return listaControleCheckRadioContas;
	}


	/**
	 * @param listaControleCheckRadioContas the listaControleCheckRadioContas to set
	 */
	public void setListaControleCheckRadioContas(List<SelectItem> listaControleCheckRadioContas) {
		this.listaControleCheckRadioContas = listaControleCheckRadioContas;
	}
	
}
