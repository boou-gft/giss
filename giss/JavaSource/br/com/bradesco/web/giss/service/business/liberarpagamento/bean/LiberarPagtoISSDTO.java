package br.com.bradesco.web.giss.service.business.liberarpagamento.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.utils.CpfCnpjUtils;
import br.com.bradesco.web.giss.utils.GissUtil;

public class LiberarPagtoISSDTO {

	private Integer empresa;
	private String descEmpresa;
	private String produto;
	private Integer codProduto;
	private String dataRecepcao;
	private String qtdeRegistro;
	private String valorReceita;
	private Integer nApurcIssEmpresa;
	private Integer codIdenticacaoTransIss;
	private Integer anoMes;
	private Integer numConsul;
	private String competencia;   
	private Integer mesComp;
	private Integer anoComp;
	private String vencimento;    
	private Double valorPgto;     
	private String baseIss;   
	private Integer qtdeOcorrencias;
	private Long codMunicipio;
	private String municipio;   
	private String estado;
	private boolean statusAtivoInat;
	private String valorProvisionado;
	private Long qtdePgtos;
	private Long qtdePgtosVencidos;
	private Long valorTotal;
	private Long qtdeTeds;
	private Long qtdeTransfBradesco;
	private Long codigoIbge;
	private String status;
	private Integer statusEmpresa;
	private String valorDeIss; 
	private String valorBaseCalculo;
	private String dtAgendamento;
	private String dtPagamento;
	private String dataAgendamentoInicio;
	private String dataAgendamentoFim;
	private String dataPagamentoInicio;
	private String dataPagamentoFim;
	private String dataCompetenciaInicio;
	private String dataCompetenciaFim;
	private String dadosPagamento;
	private String mesPeriodoInicial;
	private String anoPeriodoInicial;
	private String elegivelParaPagamento;
	private Integer codTipoCredito; //TED ou transferencia
	private String valorIssPgto;
	private String valorAcrescimoJurosMulta;
	private String percentualAtualizacaoMonetaria;
	private String valorAtualizacaoMonetaria;
	private String valorIssPgtoAtualizado;
	private Integer codStatus;
	private String descStatus;
	private Integer codMovimento;
	private String nomePrograma;
	private String valorJuros;
	private String valorMulta;
	private String dtHoraInclusao;
	private String dtOriginal;
	private String dtVencimento;
	private String descTipoCredito;
	private String banco;
	private String agencia;
	private String conta;
	private String digitoConta;
	private String dtHoraProcessamento;
	private String codUsuario;
	private Long cnpj;
	private Integer cnpjFilial;
	private Integer cnpjControle;
	private String descricaoProd;
	private String tipoAtualizacao;
	private List<LiberarPagtoISSDTO> lista = new ArrayList<LiberarPagtoISSDTO>();
	private List<LiberarPagtoISSDTO> listaSelecionadosTabela = new ArrayList<LiberarPagtoISSDTO>();
	
	public boolean getExibeDadosBancarios() {
		boolean exibeDadosBancarios = true;
		
		if ("0".equals(getBanco()) || "0".equals(getAgencia())) {
			exibeDadosBancarios = false;
		}
		return exibeDadosBancarios;
	}
	
	
	/**
	 * @return the empresa
	 */
	public Integer getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}
	
	public String getCnpjFormatado(){
		if(GissUtil.notNull(cnpj) == 0L){
			return "";
		}
		return GissUtil.formatarCNPJComMascara(GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(cnpj)), 8), GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(cnpjFilial)),4), GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(cnpjControle)),2));
	}
	public void setCnpjFormatado(String cnpjFormatado){
		Long cnpjSemFormatacao= CpfCnpjUtils.removerFormatacaoCpfCnpj(cnpjFormatado);
		setCnpj(CpfCnpjUtils.extrairCpfCnpjPrincipalLong(cnpjSemFormatacao));		
		setCnpjFilial(CpfCnpjUtils.extrairCpfCnpjFilialInteiro(cnpjSemFormatacao));
		setCnpjControle(CpfCnpjUtils.extrairCpfCnpjDigitoControleInteiro(cnpjSemFormatacao));
	}
	
	/**
	 * @return the produto
	 */
	public String getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public void setProduto(String produto) {
		this.produto = produto;
	}
	/**
	 * @return the qtdeRegistro
	 */
	public String getQtdeRegistro() {
		return qtdeRegistro;
	}
	/**
	 * @param qtdeRegistro the qtdeRegistro to set
	 */
	public void setQtdeRegistro(String qtdeRegistro) {
		this.qtdeRegistro = qtdeRegistro;
	}
	/**
	 * @return the valorReceita
	 */
	public String getValorReceita() {
		return valorReceita;
	}
	/**
	 * @param valorReceita the valorReceita to set
	 */
	public void setValorReceita(String valorReceita) {
		this.valorReceita = valorReceita;
	}
	/**
	 * @return the lista
	 */
	public List<LiberarPagtoISSDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<LiberarPagtoISSDTO> lista) {
		this.lista = lista;
	}
	/**
	 * @return the nApurcIssEmpresa
	 */
	public Integer getNApurcIssEmpresa() {
		return nApurcIssEmpresa;
	}
	/**
	 * @param apurcIssEmpresa the nApurcIssEmpresa to set
	 */
	public void setNApurcIssEmpresa(Integer apurcIssEmpresa) {
		nApurcIssEmpresa = apurcIssEmpresa;
	}
	/**
	 * @return the codIdenticacaoTransIss
	 */
	public Integer getCodIdenticacaoTransIss() {
		return codIdenticacaoTransIss;
	}
	
	/**
	 * @param codIdenticacaoTransIss the codIdenticacaoTransIss to set
	 */
	public void setCodIdenticacaoTransIss(Integer codIdenticacaoTransIss) {
		this.codIdenticacaoTransIss = codIdenticacaoTransIss;
	}
	/**
	 * @return the anoMes
	 */
	public Integer getAnoMes() {
		return anoMes;
	}
	/**
	 * @param anoMes the anoMes to set
	 */
	public void setAnoMes(Integer anoMes) {
		this.anoMes = anoMes;
	}
	/**
	 * @return the dataRecepcao
	 */
	public String getDataRecepcao() {
		return dataRecepcao;
	}
	/**
	 * @param dataRecepcao the dataRecepcao to set
	 */
	public void setDataRecepcao(String dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}
	/**
	 * @return the numConsul
	 */
	public Integer getNumConsul() {
		return numConsul;
	}
	/**
	 * @param numConsul the numConsul to set
	 */
	public void setNumConsul(Integer numConsul) {
		this.numConsul = numConsul;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	public Double getValorPgto() {
		return valorPgto;
	}
	public void setValorPgto(Double valorPgto) {
		this.valorPgto = valorPgto;
	}
	public String getBaseIss() {
		return baseIss;
	}
	public void setBaseIss(String baseIss) {
		this.baseIss = baseIss;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getValorProvisionado() {
		return valorProvisionado;
	}
	public void setValorProvisionado(String valorProvisionado) {
		this.valorProvisionado = valorProvisionado;
	}
	public Long getQtdePgtos() {
		return qtdePgtos;
	}
	public void setQtdePgtos(Long qtdePgtos) {
		this.qtdePgtos = qtdePgtos;
	}
	public Long getQtdePgtosVencidos() {
		return qtdePgtosVencidos;
	}
	public void setQtdePgtosVencidos(Long qtdePgtosVencidos) {
		this.qtdePgtosVencidos = qtdePgtosVencidos;
	}
	public Long getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Long valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Long getQtdeTeds() {
		return qtdeTeds;
	}
	public void setQtdeTeds(Long qtdeTeds) {
		this.qtdeTeds = qtdeTeds;
	}
	public Long getQtdeTransfBradesco() {
		return qtdeTransfBradesco;
	}
	public void setQtdeTransfBradesco(Long qtdeTransfBradesco) {
		this.qtdeTransfBradesco = qtdeTransfBradesco;
	}
	public Long getCodigoIbge() {
		return codigoIbge;
	}
	public void setCodigoIbge(Long codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	public String getStatus() {
		return GissUtil.notNull(status).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(status).equalsIgnoreCase("I")?"Inativo":"";
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getValorDeIss() {
		return valorDeIss;
	}
	public void setValorDeIss(String valorDeIss) {
		this.valorDeIss = valorDeIss;
	}
	public String getDataAgendamentoInicio() {
		return dataAgendamentoInicio;
	}
	public void setDataAgendamentoInicio(String dataAgendamentoInicio) {
		this.dataAgendamentoInicio = dataAgendamentoInicio;
	}
	public String getDataAgendamentoFim() {
		return dataAgendamentoFim;
	}
	public void setDataAgendamentoFim(String dataAgendamentoFim) {
		this.dataAgendamentoFim = dataAgendamentoFim;
	}
	public String getDataPagamentoInicio() {
		return dataPagamentoInicio;
	}
	public void setDataPagamentoInicio(String dataPagamentoInicio) {
		this.dataPagamentoInicio = dataPagamentoInicio;
	}
	public String getDataPagamentoFim() {
		return dataPagamentoFim;
	}
	public void setDataPagamentoFim(String dataPagamentoFim) {
		this.dataPagamentoFim = dataPagamentoFim;
	}
	public String getDataCompetenciaInicio() {
		return dataCompetenciaInicio;
	}
	public void setDataCompetenciaInicio(String dataCompetenciaInicio) {
		this.dataCompetenciaInicio = dataCompetenciaInicio;
	}
	public String getDataCompetenciaFim() {
		return dataCompetenciaFim;
	}
	public void setDataCompetenciaFim(String dataCompetenciaFim) {
		this.dataCompetenciaFim = dataCompetenciaFim;
	}
	public String getDadosPagamento() {
		return dadosPagamento;
	}
	public void setDadosPagamento(String dadosPagamento) {
		this.dadosPagamento = dadosPagamento;
	}
	public String getElegivelParaPagamento() {
		return elegivelParaPagamento;
	}
	public void setElegivelParaPagamento(String elegivelParaPagamento) {
		this.elegivelParaPagamento = elegivelParaPagamento;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getValorBaseCalculo() {
		return valorBaseCalculo;
	}
	public void setValorBaseCalculo(String valorBaseCalculo) {
		this.valorBaseCalculo = valorBaseCalculo;
	}
	public Long getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMesPeriodoInicial() {
		return mesPeriodoInicial;
	}
	public void setMesPeriodoInicial(String mesPeriodoInicial) {
		this.mesPeriodoInicial = mesPeriodoInicial;
	}
	public String getAnoPeriodoInicial() {
		return anoPeriodoInicial;
	}
	public void setAnoPeriodoInicial(String anoPeriodoInicial) {
		this.anoPeriodoInicial = anoPeriodoInicial;
	}
	public boolean isStatusAtivoInat() {
		return statusAtivoInat;
	}
	public void setStatusAtivoInat(boolean statusAtivoInat) {
		this.statusAtivoInat = statusAtivoInat;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getCnpjFilial() {
		return cnpjFilial;
	}
	public void setCnpjFilial(Integer cnpjFilial) {
		this.cnpjFilial = cnpjFilial;
	}
	public Integer getCnpjControle() {
		return cnpjControle;
	}
	public void setCnpjControle(Integer cnpjControle) {
		this.cnpjControle = cnpjControle;
	}
	public String getDescEmpresa() {
		return descEmpresa;
	}
	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}
	public Integer getQtdeOcorrencias() {
		return qtdeOcorrencias;
	}
	public void setQtdeOcorrencias(Integer qtdeOcorrencias) {
		this.qtdeOcorrencias = qtdeOcorrencias;
	}
	public String getDtAgendamento() {
		return dtAgendamento;
	}
	public void setDtAgendamento(String dtAgendamento) {
		this.dtAgendamento = dtAgendamento;
	}
	public String getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(String dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public Integer getStatusEmpresa() {
		return statusEmpresa;
	}
	public void setStatusEmpresa(Integer statusEmpresa) {
		this.statusEmpresa = statusEmpresa;
	}
	public Integer getCodTipoCredito() {
		return codTipoCredito;
	}
	public void setCodTipoCredito(Integer codTipoCredito) {
		this.codTipoCredito = codTipoCredito;
	}
	public String getDescTipoCredito() {
		return descTipoCredito;
	}
	public void setDescTipoCredito(String descTipoCredito) {
		this.descTipoCredito = descTipoCredito;
	}
	public String getValorIssPgto() {
		return valorIssPgto;
	}
	public void setValorIssPgto(String valorIssPgto) {
		this.valorIssPgto = valorIssPgto;
	}
	public Integer getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(Integer codStatus) {
		this.codStatus = codStatus;
	}
	public String getDescStatus() {
		return descStatus;
	}
	public void setDescStatus(String descStatus) {
		this.descStatus = descStatus;
	}
	public Integer getCodMovimento() {
		return codMovimento;
	}
	public void setCodMovimento(Integer codMovimento) {
		this.codMovimento = codMovimento;
	}
	public String getNomePrograma() {
		return nomePrograma;
	}
	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}
	public String getDtHoraInclusao() {
		return dtHoraInclusao;
	}
	public void setDtHoraInclusao(String dtHoraInclusao) {
		this.dtHoraInclusao = dtHoraInclusao;
	}
	
	public String getDescCodStatus() {
		return statusEmpresa.equals(2)?"Pendente de Liberação":statusEmpresa.equals(3)?"Liberado Total":statusEmpresa.equals(4)?"Liberado Parcial":"";
	}
	
	public String getDescCodStatusConPgtos() {
		switch(codIdenticacaoTransIss){
			case 1:
				return "Pendente de envio";
			case 2:
				return "Pagamento enviado";
			case 3: 
				return "Pago";
			case 4:
				return "Rejeitado (Retorno - Devolução com ou sem estorno)";
			case 5:
				return "Provisionado (Município sem dados bancários)";
			case 6:
				return "Provisionado (Inconsistente)";
			case 7:
				return "Provisionado Município não elegível";
			default:
				return "";
		}
	}
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public String getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}
	public String getDtHoraProcessamento() {
		return dtHoraProcessamento;
	}
	public void setDtHoraProcessamento(String dtHoraProcessamento) {
		this.dtHoraProcessamento = dtHoraProcessamento;
	}
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public Integer getMesComp() {
		return mesComp;
	}
	public void setMesComp(Integer mesComp) {
		this.mesComp = mesComp;
	}
	public Integer getAnoComp() {
		return anoComp;
	}
	public void setAnoComp(Integer anoComp) {
		this.anoComp = anoComp;
	}
	
	public String getDescricaoProd() {
		if(codProduto == 1){
			descricaoProd = "Leasing";
		} else if(codProduto == 2){
			descricaoProd = "Fundos";
		}else if(codProduto == 3){
			descricaoProd = "Cartões - Anuidade";
		}else if(codProduto == 4){
			descricaoProd = "Consórcio";
		}else if(codProduto == 5){
			descricaoProd = "Cartões - Comissões";
		}
		return descricaoProd;
	}
	
	public void setDescricaoProd(String descricaoProd) {
		this.descricaoProd = descricaoProd;
	}
	public String getDtOriginal() {
		return dtOriginal;
	}
	public void setDtOriginal(String dtOriginal) {
		this.dtOriginal = dtOriginal;
	}
	public String getValorJuros() {
		return valorJuros;
	}
	public void setValorJuros(String valorJuros) {
		this.valorJuros = valorJuros;
	}
	public String getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(String valorMulta) {
		this.valorMulta = valorMulta;
	}
	public String getTipoAtualizacao() {
		return tipoAtualizacao;
	}
	public void setTipoAtualizacao(String tipoAtualizacao) {
		this.tipoAtualizacao = tipoAtualizacao;
	}
	public List<LiberarPagtoISSDTO> getListaSelecionadosTabela() {
		return listaSelecionadosTabela;
	}
	public void setListaSelecionadosTabela(
			List<LiberarPagtoISSDTO> listaSelecionadosTabela) {
		this.listaSelecionadosTabela = listaSelecionadosTabela;
	}


	public String getValorAcrescimoJurosMulta() {
		return valorAcrescimoJurosMulta;
	}


	public void setValorAcrescimoJurosMulta(String valorAcrescimoJurosMulta) {
		this.valorAcrescimoJurosMulta = valorAcrescimoJurosMulta;
	}


	public String getPercentualAtualizacaoMonetaria() {
		return percentualAtualizacaoMonetaria;
	}


	public void setPercentualAtualizacaoMonetaria(
			String percentualAtualizacaoMonetaria) {
		this.percentualAtualizacaoMonetaria = percentualAtualizacaoMonetaria;
	}


	public String getValorAtualizacaoMonetaria() {
		return valorAtualizacaoMonetaria;
	}


	public void setValorAtualizacaoMonetaria(String valorAtualizacaoMonetaria) {
		this.valorAtualizacaoMonetaria = valorAtualizacaoMonetaria;
	}


	public String getValorIssPgtoAtualizado() {
		return valorIssPgtoAtualizado;
	}


	public void setValorIssPgtoAtualizado(String valorIssPgtoAtualizado) {
		this.valorIssPgtoAtualizado = valorIssPgtoAtualizado;
	}
	
}
