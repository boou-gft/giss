package br.com.bradesco.web.giss.view.bean.controller.consultar;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.IConsultarApuracaoAposFechamentoService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoAposFechamentoEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoFinalAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarDependenciaAposApuracaoFechamentoDTO;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.controller.generico.FiltroGenericoGISSBean;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class ConsultarApuracaoAposFechamentoBean extends FiltroGenericoGISSBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoPessoaJuridica;
	private String numeroSequencial;
	private List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinal;
	private List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinalConta;
	private IConsultarApuracaoAposFechamentoService consultarApuracaoAposFechamentoImpl;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>();
	private int linha;
	private int radioTela;
	private String dataProcessamento;
	private List<ConsultarDependenciaAposApuracaoFechamentoDTO> listaDependenciaApuracao;
	private String descricao;
	private String aliquota;
	private String baseCalculo;
	private String aliquotaPadrao;
	private String totalReceita;
	private String totalRecolher;
	private String dependencia;
	private String mesAnoCompetencia;
	private String tipoIncidencia;
	private String totalISSFinal;
	private String totalMovimento;
	private String totalTributavel;
	private String mesFiltro;
	private String anoFiltro;
	private String detalheEstado;
	private String detalheMunicipio;
	private boolean razaoExiste = true;
	private Integer filtro = 1;
	private Long qtdePa;
	private Long qtdeAgencia;
	private Integer radioTelaConta;
	private String aliquotaPadraoConta;
	private String aliquotaConta;
	private String tipoIncidenciaConta;
	private String baseCalculoConta;
	private String totalISSFinalConta;
	private String totalTributavelConta;
	private String totalMovimentoConta;
	private String detalheEstadoConta;
	private String detalheMunicipioCopnta;
	private ArrayList<SelectItem> listaControleCheckRadioConta = new ArrayList<SelectItem>();
	
	public String iniciaPagina() {
		super.inicializaFiltroGenerico();
		mesFiltro = null;
		anoFiltro = null;
		setDetalheEstado("");
		setDetalheMunicipio("");
		filtro = 1;
		return "consultarApuracaoAposFechamento";
	}
	
	public String prosseguir() {
		if (anoFiltro.equals("") || mesFiltro.equals("")) {
			if (mesFiltro.equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Mês da competência.", false);
				return null;
			}
			if (anoFiltro.equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Digite o Ano da competência.", false);
				return null;
			}
		}
		
		carregaDependecia();

		return "DEP_APURACAO";
	}

	private void carregaDependecia() {
		ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO = new ConsultarApuracaoAposFechamentoEntradaDTO();
		entradaDTO.setCompetencia(NumberUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro)));
		entradaDTO.setCodDependencia(codDepFiltro!=null&&codDepFiltro!=0?codDepFiltro:0);
		entradaDTO.setCodPessoaJuridica(codDepFiltro!=null&&codDepFiltro!=0?Long.valueOf(indiceComboEmpresaFiltro):0L);
		entradaDTO.setFiltro(getFiltro());

		try {
			listaDependenciaApuracao = consultarApuracaoAposFechamentoImpl.listarDependenciaApuracaoAposFechamento(entradaDTO);
		} catch (PdcAdapterFunctionalException e) {
			listaDependenciaApuracao = null;
			throw e;
		}
		listaControleCheckRadio = new ArrayList<SelectItem>();
		for (int i = 0; i < listaDependenciaApuracao.size(); i++) {
			listaControleCheckRadio.add(new SelectItem(String.valueOf(i), " "));
		}

		if (!listaDependenciaApuracao.isEmpty()) {
			ConsultarDependenciaAposApuracaoFechamentoDTO detalhe = listaDependenciaApuracao.iterator().next();
			dataProcessamento = detalhe.getDtProcessamento();
			totalRecolher = detalhe.getTotalRecolher();
			totalReceita = detalhe.getTotalReceita();
			qtdeAgencia = detalhe.getQtdeAgencia();
			qtdePa = detalhe.getQtdePa();
		}
	}

	public String paginarDependencia(ActionEvent evt){
		carregaDependecia();
		return null;
	}

	public String voltar() {
		return "consultarApuracaoAposFechamento";
	}

	public String consultarApuracaoFechamento() {
		ConsultarDependenciaAposApuracaoFechamentoDTO dependenciaDTO = (ConsultarDependenciaAposApuracaoFechamentoDTO)getListaDependenciaApuracao().get(new Integer (radioTela));
		setDescricao(dependenciaDTO.getDescDepPa());
		setCodigoPessoaJuridica(dependenciaDTO.getCodigoPessoaJuridica());
		setNumeroSequencial(dependenciaDTO.getNumeroSequencial());
		setDependencia(dependenciaDTO.getCodDepPa());
		setMesAnoCompetencia(mesFiltro + "/" + anoFiltro);
		carregaListaFinal();

		return "DETALHE_APURACAO";
	}
	
	public String consultarApuracaoFechamentoConta() {
		setMesAnoCompetencia(mesFiltro + "/" + anoFiltro);
		carregaListaFinalConta();

		return "DETALHE_APURACAO_CONTA";
	}

	private void carregaListaFinal() {
		ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO = new ConsultarApuracaoAposFechamentoEntradaDTO();
		entradaDTO.setCompetencia(NumberUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro)));
		entradaDTO.setCodigoPessoaJuridica(NumberUtils.parseLong(codigoPessoaJuridica));
		entradaDTO.setNumeroSequencialUnidadeOrganizacional(NumberUtils.parseInteger(numeroSequencial));

		try {
			listaFinal = consultarApuracaoAposFechamentoImpl.listarApuracaoFinalAposFechamento(entradaDTO);
			listaControleCheckRadioConta = new ArrayList<SelectItem>();
			for (int i = 0; i < listaFinal.size(); i++) {
				listaControleCheckRadioConta.add(new SelectItem(i, ""));
				
			}
		} catch (PdcAdapterFunctionalException e) {
			listaFinal = null;
			throw e;
		}

		if (!listaFinal.isEmpty()) {
			ConsultarApuracaoFinalAposFechamentoDTO detalhe = listaFinal.iterator().next();
			aliquotaPadrao = detalhe.getAliquotaPadrao() + "%";
			aliquota = detalhe.getAliquota();
			baseCalculo= detalhe.getBaseCalculo() + "%";
			tipoIncidencia = detalhe.getTipoIncidencia();
			totalISSFinal = detalhe.getTotalISSFinal();
			totalMovimento = detalhe.getTotalMovimento();
			totalTributavel = detalhe.getTotalTributavel();
			detalheEstado = detalhe.getUf();
			detalheMunicipio = detalhe.getCodMunicipio() + " - " + detalhe.getDescMunicipio();
			if (listaFinal.get(0).getCodigoGrupo() <= 0 || listaFinal.get(0).getCodigoSubGrupo() <= 0) {
				razaoExiste = false;
			}
			else{
				razaoExiste = true;
			}
		}
	}
	
	private void carregaListaFinalConta() {
		ConsultarApuracaoFinalAposFechamentoDTO dependenciaDTO = getListaFinal().get(new Integer (radioTela));
		ConsultarApuracaoAposFechamentoEntradaDTO entradaDTO = new ConsultarApuracaoAposFechamentoEntradaDTO();
		entradaDTO.setCompetencia(NumberUtils.convertMesAno(NumberUtils.parseInteger(mesFiltro), NumberUtils.parseInteger(anoFiltro)));
		entradaDTO.setCodigoPessoaJuridica(NumberUtils.parseLong(codigoPessoaJuridica));
		entradaDTO.setNumeroSequencialUnidadeOrganizacional(NumberUtils.parseInteger(numeroSequencial));
		entradaDTO.setRazao(dependenciaDTO.getRazao());
		entradaDTO.setCosif(dependenciaDTO.getCosif());
		
		try {
			listaFinalConta = consultarApuracaoAposFechamentoImpl.listarApuracaoFinalAposFechamentoConta(entradaDTO);
		} catch (PdcAdapterFunctionalException e) {
			listaFinalConta = null;
			throw e;
		}
		if (!listaFinalConta.isEmpty()) {
			ConsultarApuracaoFinalAposFechamentoDTO detalhe = listaFinalConta.iterator().next();
			aliquotaPadraoConta = detalhe.getAliquotaPadrao() + "%";
			aliquotaConta = detalhe.getAliquota();
			baseCalculoConta= detalhe.getBaseCalculo() + "%";
			tipoIncidenciaConta = detalhe.getTipoIncidencia();
			totalISSFinalConta = detalhe.getTotalISSFinal();
			totalMovimentoConta = detalhe.getTotalMovimento();
			totalTributavelConta = detalhe.getTotalTributavel();
			detalheEstadoConta = detalhe.getUf();
			detalheMunicipioCopnta = detalhe.getCodMunicipio() + " - " + detalhe.getDescMunicipio();
		}
	}

	public String paginarApuracaoFinal(ActionEvent evt) {
		carregaListaFinal();
		return null;
	}

	public void imprimirPlanilha(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Apuração Após Fechamento", "APURACAO_APOS_FECHAMENTO");
		try {
			exportarPlanilha.apuracaoPosFechamento(listaDependenciaApuracao);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	public void imprimirPlanilhaDetalhe(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha =  new ExportarPlanilha("Apuração Após Fechamento", "APURACAO_APOS_FECHAMENTO");
		try {
			exportarPlanilha.apuracaoAposFechamentoDetalhe(listaFinal, razaoExiste);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	public void imprimirPlanilhaDetalheConta(ActionEvent ae){
		
		ExportarPlanilha exportarPlanilha =  new ExportarPlanilha("Apuração Após Fechamento Nível Conta", "APURACAO_APOS_FECHAMENTO_NIVEL_CONTA");
		try {
			exportarPlanilha.apuracaoAposFechamentoDetalheConta(listaFinalConta, razaoExiste);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		
	}
	
	public String voltarDep() {
		return "DEP_APURACAO";
	}
	public String voltarRazap() {
		return "DETALHE_APURACAO";
	}

	public String getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(String totalReceita) {
		this.totalReceita = totalReceita;
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

	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
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

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public IConsultarApuracaoAposFechamentoService getConsultarApuracaoAposFechamentoImpl() {
		return consultarApuracaoAposFechamentoImpl;
	}

	public void setConsultarApuracaoAposFechamentoImpl(
			IConsultarApuracaoAposFechamentoService consultarApuracaoAposFechamentoImpl) {
		this.consultarApuracaoAposFechamentoImpl = consultarApuracaoAposFechamentoImpl;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getRadioTela() {
		return radioTela;
	}

	public void setRadioTela(int radioTela) {
		this.radioTela = radioTela;
	}

	public List<ConsultarDependenciaAposApuracaoFechamentoDTO> getListaDependenciaApuracao() {
		return listaDependenciaApuracao;
	}

	public void setListaDependenciaApuracao(
			List<ConsultarDependenciaAposApuracaoFechamentoDTO> listaDependenciaApuracao) {
		this.listaDependenciaApuracao = listaDependenciaApuracao;
	}

	public String getTotalRecolher() {
		return totalRecolher;
	}

	public void setTotalRecolher(String totalRecolher) {
		this.totalRecolher = totalRecolher;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public List<ConsultarApuracaoFinalAposFechamentoDTO> getListaFinal() {
		return listaFinal;
	}

	public void setListaFinal(
			List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinal) {
		this.listaFinal = listaFinal;
	}

	public String getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public String getNumeroSequencial() {
		return numeroSequencial;
	}

	public void setNumeroSequencial(String numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}

	public String getTotalISSFinal() {
		return totalISSFinal;
	}

	public void setTotalISSFinal(String totalISSFinal) {
		this.totalISSFinal = totalISSFinal;
	}

	public String getTotalMovimento() {
		return totalMovimento;
	}

	public void setTotalMovimento(String totalMovimento) {
		this.totalMovimento = totalMovimento;
	}

	public String getTotalTributavel() {
		return totalTributavel;
	}

	public void setTotalTributavel(String totalTributavel) {
		this.totalTributavel = totalTributavel;
	}

	public String getAnoFiltro() {
		return anoFiltro;
	}

	public void setAnoFiltro(String anoFiltro) {
		this.anoFiltro = anoFiltro;
	}

	public String getMesAnoCompetencia() {
		return mesAnoCompetencia;
	}

	public void setMesAnoCompetencia(String mesAnoCompetencia) {
		this.mesAnoCompetencia = mesAnoCompetencia;
	}

	public String getMesFiltro() {
		return mesFiltro;
	}

	public void setMesFiltro(String mesFiltro) {
		this.mesFiltro = mesFiltro;
	}

	public String getDetalheEstado() {
		return detalheEstado;
	}

	public void setDetalheEstado(String detalheEstado) {
		this.detalheEstado = detalheEstado;
	}

	public String getDetalheMunicipio() {
		return detalheMunicipio;
	}

	public void setDetalheMunicipio(String detalheMunicipio) {
		this.detalheMunicipio = detalheMunicipio;
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
	 * @return the qtdePa
	 */
	public Long getQtdePa() {
		return qtdePa;
	}

	/**
	 * @param qtdePa the qtdePa to set
	 */
	public void setQtdePa(Long qtdePa) {
		this.qtdePa = qtdePa;
	}

	/**
	 * @return the qtdeAgencia
	 */
	public Long getQtdeAgencia() {
		return qtdeAgencia;
	}

	/**
	 * @param qtdeAgencia the qtdeAgencia to set
	 */
	public void setQtdeAgencia(Long qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}

	/**
	 * @return the listaFinalConta
	 */
	public List<ConsultarApuracaoFinalAposFechamentoDTO> getListaFinalConta() {
		return listaFinalConta;
	}

	/**
	 * @param listaFinalConta the listaFinalConta to set
	 */
	public void setListaFinalConta(List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinalConta) {
		this.listaFinalConta = listaFinalConta;
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
	 * @return the aliquotaPadraoConta
	 */
	public String getAliquotaPadraoConta() {
		return aliquotaPadraoConta;
	}

	/**
	 * @param aliquotaPadraoConta the aliquotaPadraoConta to set
	 */
	public void setAliquotaPadraoConta(String aliquotaPadraoConta) {
		this.aliquotaPadraoConta = aliquotaPadraoConta;
	}

	/**
	 * @return the aliquotaConta
	 */
	public String getAliquotaConta() {
		return aliquotaConta;
	}

	/**
	 * @param aliquotaConta the aliquotaConta to set
	 */
	public void setAliquotaConta(String aliquotaConta) {
		this.aliquotaConta = aliquotaConta;
	}

	/**
	 * @return the tipoIncidenciaConta
	 */
	public String getTipoIncidenciaConta() {
		return tipoIncidenciaConta;
	}

	/**
	 * @param tipoIncidenciaConta the tipoIncidenciaConta to set
	 */
	public void setTipoIncidenciaConta(String tipoIncidenciaConta) {
		this.tipoIncidenciaConta = tipoIncidenciaConta;
	}

	/**
	 * @return the baseCalculoConta
	 */
	public String getBaseCalculoConta() {
		return baseCalculoConta;
	}

	/**
	 * @param baseCalculoConta the baseCalculoConta to set
	 */
	public void setBaseCalculoConta(String baseCalculoConta) {
		this.baseCalculoConta = baseCalculoConta;
	}

	/**
	 * @return the totalISSFinalConta
	 */
	public String getTotalISSFinalConta() {
		return totalISSFinalConta;
	}

	/**
	 * @param totalISSFinalConta the totalISSFinalConta to set
	 */
	public void setTotalISSFinalConta(String totalISSFinalConta) {
		this.totalISSFinalConta = totalISSFinalConta;
	}

	/**
	 * @return the totalTributavelConta
	 */
	public String getTotalTributavelConta() {
		return totalTributavelConta;
	}

	/**
	 * @param totalTributavelConta the totalTributavelConta to set
	 */
	public void setTotalTributavelConta(String totalTributavelConta) {
		this.totalTributavelConta = totalTributavelConta;
	}

	/**
	 * @return the totalMovimentoConta
	 */
	public String getTotalMovimentoConta() {
		return totalMovimentoConta;
	}

	/**
	 * @param totalMovimentoConta the totalMovimentoConta to set
	 */
	public void setTotalMovimentoConta(String totalMovimentoConta) {
		this.totalMovimentoConta = totalMovimentoConta;
	}

	/**
	 * @return the detalheEstadoConta
	 */
	public String getDetalheEstadoConta() {
		return detalheEstadoConta;
	}

	/**
	 * @param detalheEstadoConta the detalheEstadoConta to set
	 */
	public void setDetalheEstadoConta(String detalheEstadoConta) {
		this.detalheEstadoConta = detalheEstadoConta;
	}

	/**
	 * @return the detalheMunicipioCopnta
	 */
	public String getDetalheMunicipioCopnta() {
		return detalheMunicipioCopnta;
	}

	/**
	 * @param detalheMunicipioCopnta the detalheMunicipioCopnta to set
	 */
	public void setDetalheMunicipioCopnta(String detalheMunicipioCopnta) {
		this.detalheMunicipioCopnta = detalheMunicipioCopnta;
	}

	/**
	 * @return the listaControleCheckRadioConta
	 */
	public ArrayList<SelectItem> getListaControleCheckRadioConta() {
		return listaControleCheckRadioConta;
	}

	/**
	 * @param listaControleCheckRadioConta the listaControleCheckRadioConta to set
	 */
	public void setListaControleCheckRadioConta(ArrayList<SelectItem> listaControleCheckRadioConta) {
		this.listaControleCheckRadioConta = listaControleCheckRadioConta;
	}
	
}