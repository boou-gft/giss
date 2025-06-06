package br.com.bradesco.web.giss.service.business.issmunicipio.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradesco.web.giss.utils.CpfCnpjUtils;
import br.com.bradesco.web.giss.utils.GissUtil;

public class MunicipioISSDTO implements Comparable<MunicipioISSDTO>{
	
	private String estado;
	private Long codMunicipio;
	private String descMunicipios;
	private String dataHoraAtualizacao;
	private String dataFimVigencia;
	private Integer codigoUf;
	private String siglaUf;	
	private Integer banco;
	private Integer agencia;
	private Long conta;
	private String digitoConta;
	private Long cnpj;
	private Integer cnpjFilial;
	private Integer cnpjControle;
	private String origem;
	private String aliquotaPadrao;
	private Integer diaRecolhimento;
	private String elegivelPagamento;
	private String status;
	private Integer numConsultas;
	private String indicadorDiaUtil;
	private String regrasDiaNaoUtil;
	private String funcionario;
	private Date dataAtualizacao;
	
	private Integer bancoAnterior;
	private Integer agenciaAnterior;
	private Long contaAnterior;
	private String digitoContaAnterior;
	private Long cnpjAnterior;
	private Integer cnpjFilialAnterior;
	private Integer cnpjControleAnterior;
	private String aliquotaPadraoAnterior;
	private Integer diaRecolhimentoAnterior; 
	private String indicadorDiaUtilAnterior; 
	private String regrasDiaNaoUtilAnterior; 
	private String statusAnterior;
	private String dataHoraAtualizacaoAnterior;
	private String funcionarioAnterior;
	private String elegivelPagamentoAnterior;

	private List<MunicipioISSDTO> lista = new ArrayList<MunicipioISSDTO>();

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the codMunicipio
	 */
	public Long getCodMunicipio() {
		return codMunicipio;
	}

	/**
	 * @param codMunicipio the codMunicipio to set
	 */
	public void setCodMunicipio(Long codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	/**
	 * @return the descMunicipios
	 */
	public String getDescMunicipios() {
		return descMunicipios;
	}

	/**
	 * @param descMunicipios the descMunicipios to set
	 */
	public void setDescMunicipios(String descMunicipios) {
		this.descMunicipios = descMunicipios;
	}

	/**
	 * @return the codigoUf
	 */
	public Integer getCodigoUf() {
		return codigoUf;
	}

	/**
	 * @param codigoUf the codigoUf to set
	 */
	public void setCodigoUf(Integer codigoUf) {
		this.codigoUf = codigoUf;
	}

	/**
	 * @return the siglaUf
	 */
	public String getSiglaUf() {
		return siglaUf;
	}

	/**
	 * @param siglaUf the siglaUf to set
	 */
	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	/**
	 * @return the banco
	 */
	public Integer getBanco() {
		return banco;
	}

	/**
	 * @param banco the banco to set
	 */
	public void setBanco(Integer banco) {
		this.banco = banco;
	}

	/**
	 * @return the agencia
	 */
	public Integer getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the conta
	 */
	public Long getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(Long conta) {
		this.conta = conta;
	}

	/**
	 * @return the digitoConta
	 */
	public String getDigitoConta() {
		return digitoConta;
	}

	/**
	 * @param string the digitoConta to set
	 */
	public void setDigitoConta(String string) {
		this.digitoConta = string;
	}

	/**
	 * @return the cnpj
	 */
	public Long getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the cnpjFilial
	 */
	public Integer getCnpjFilial() {
		return cnpjFilial;
	}

	/**
	 * @param cnpjFilial the cnpjFilial to set
	 */
	public void setCnpjFilial(Integer cnpjFilial) {
		this.cnpjFilial = cnpjFilial;
	}

	/**
	 * @return the cnpjControle
	 */
	public Integer getCnpjControle() {
		return cnpjControle;
	}

	/**
	 * @param cnpjControle the cnpjControle to set
	 */
	public void setCnpjControle(Integer cnpjControle) {
		this.cnpjControle = cnpjControle;
	}

	/**
	 * @return the origem
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}

	/**
	 * @return the aliquotaPadrao
	 */
	public String getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	/**
	 * @param aliquotaPadrao the aliquotaPadrao to set
	 */
	public void setAliquotaPadrao(String aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}

	/**
	 * @return the diaRecolhimento
	 */
	public Integer getDiaRecolhimento() {
		return diaRecolhimento;
	}

	/**
	 * @param diaRecolhimento the diaRecolhimento to set
	 */
	public void setDiaRecolhimento(Integer diaRecolhimento) {
		this.diaRecolhimento = diaRecolhimento;
	}

	/**
	 * @return the indicadorDiaUtil
	 */
	public String getIndicadorDiaUtil() {
		return indicadorDiaUtil;
	}

	/**
	 * @param indicadorDiaUtil the indicadorDiaUtil to set
	 */
	public void setIndicadorDiaUtil(String indicadorDiaUtil) {
		this.indicadorDiaUtil = indicadorDiaUtil;
	}

	/**
	 * @return the regrasDiaNaoUtil
	 */
	public String getRegrasDiaNaoUtil() {
		return regrasDiaNaoUtil;
	}

	/**
	 * @param regrasDiaNaoUtil the regrasDiaNaoUtil to set
	 */
	public void setRegrasDiaNaoUtil(String regrasDiaNaoUtil) {
		this.regrasDiaNaoUtil = regrasDiaNaoUtil;
	}

	/**
	 * @return the lista
	 */
	public List<MunicipioISSDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<MunicipioISSDTO> lista) {
		this.lista = lista;
	}
	public String getCnpjFormatadoAnterior(){
		if(GissUtil.notNull(cnpjAnterior) == 0L){
			return "";
		}
		return GissUtil.formatarCNPJComMascara(String.valueOf(GissUtil.notNull(cnpjAnterior)), String.valueOf(GissUtil.notNull(cnpjFilialAnterior)), String.valueOf(GissUtil.notNull(cnpjControleAnterior)));
	}
	public String getCnpjFormatado(){
		if(GissUtil.notNull(cnpj) == 0L){
			return "";
		}
		return GissUtil.formatarCNPJComMascara(String.valueOf(GissUtil.notNull(cnpj)), String.valueOf(GissUtil.notNull(cnpjFilial)), String.valueOf(GissUtil.notNull(cnpjControle)));
	}
	public void setCnpjFormatado(String cnpjFormatado){
		Long cnpjSemFormatacao= CpfCnpjUtils.removerFormatacaoCpfCnpj(cnpjFormatado);
		setCnpj(CpfCnpjUtils.extrairCpfCnpjPrincipalLong(cnpjSemFormatacao));		
		setCnpjFilial(CpfCnpjUtils.extrairCpfCnpjFilialInteiro(cnpjSemFormatacao));
		setCnpjControle(CpfCnpjUtils.extrairCpfCnpjDigitoControleInteiro(cnpjSemFormatacao));
	}
	
	
	/**
	 * @return the regrasDiaNaoUtil
	 */
	public String getRegrasDiaNaoUtilExibicao() {
		return GissUtil.notNull(regrasDiaNaoUtil).equals("A")?"Antecipar":GissUtil.notNull(regrasDiaNaoUtil).equals("P")?"Postergar":"";
	}
	/**
	 * @return the regrasDiaNaoUtil
	 */
	public String getRegrasDiaNaoUtilExibicaoAnterior() {
		return GissUtil.notNull(regrasDiaNaoUtilAnterior).equals("A")?"Antecipar":GissUtil.notNull(regrasDiaNaoUtilAnterior).equals("P")?"Postergar":"";
	}
	
	/**
	 * @return the indicadorDiaUtil
	 */
	public String getIndicadorDiaUtilExibicao() {
		return GissUtil.notNull(indicadorDiaUtil).equals("S")?"Sim":GissUtil.notNull(indicadorDiaUtil).equals("N")?"Não":"";
	}
	/**
	 * @return the indicadorDiaUtil
	 */
	public String getIndicadorDiaUtilExibicaoAnterior() {
		return GissUtil.notNull(indicadorDiaUtilAnterior).equals("S")?"Sim":GissUtil.notNull(indicadorDiaUtilAnterior).equals("N")?"Não":"";
	}
	
	public int compareTo(MunicipioISSDTO m) {
		return this.getCodMunicipio().compareTo(m.getCodMunicipio());
	}

	/**
	 * @return the elegivelPagamento
	 */
	public String getElegivelPagamento() {
		return elegivelPagamento;
	}

	/**
	 * @param elegivelPagamento the elegivelPagamento to set
	 */
	public void setElegivelPagamento(String elegivelPagamento) {
		this.elegivelPagamento = elegivelPagamento;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the descElegivelPagamento
	 */
	public String getDescElegivelPagamento() {
		return GissUtil.notNull(elegivelPagamento).equalsIgnoreCase("S")?"Sim":GissUtil.notNull(elegivelPagamento).equalsIgnoreCase("N")?"Não":"";
	}
	/**
	 * @return the descElegivelPagamento
	 */
	public String getDescElegivelPagamentoAnterior() {
		return GissUtil.notNull(elegivelPagamentoAnterior).equalsIgnoreCase("S")?"Sim":GissUtil.notNull(elegivelPagamentoAnterior).equalsIgnoreCase("N")?"Não":"";
	}

	/**
	 * @return the descStatus
	 */
	public String getDescStatus() {
		return GissUtil.notNull(status).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(status).equalsIgnoreCase("I")?"Inativo":"";
	}
	
	/**
	 * @return the descStatus
	 */
	public String getDescStatusAnterior() {
		return GissUtil.notNull(statusAnterior).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(statusAnterior).equalsIgnoreCase("I")?"Inativo":"";
	}

	public String getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}

	public void setDataHoraAtualizacao(String dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}


	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(String dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public Integer getNumConsultas() {
		return numConsultas;
	}

	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}

	public Long getContaAnterior() {
		return contaAnterior;
	}

	public void setContaAnterior(Long contaAnterior) {
		this.contaAnterior = contaAnterior;
	}

	public String getDigitoContaAnterior() {
		return digitoContaAnterior;
	}

	public void setDigitoContaAnterior(String digitoContaAnterior) {
		this.digitoContaAnterior = digitoContaAnterior;
	}

	public Integer getCnpjFilialAnterior() {
		return cnpjFilialAnterior;
	}

	public void setCnpjFilialAnterior(Integer cnpjFilialAnterior) {
		this.cnpjFilialAnterior = cnpjFilialAnterior;
	}

	public Integer getCnpjControleAnterior() {
		return cnpjControleAnterior;
	}

	public void setCnpjControleAnterior(Integer cnpjControleAnterior) {
		this.cnpjControleAnterior = cnpjControleAnterior;
	}

	public Integer getDiaRecolhimentoAnterior() {
		return diaRecolhimentoAnterior;
	}

	public void setDiaRecolhimentoAnterior(Integer diaRecolhimentoAnterior) {
		this.diaRecolhimentoAnterior = diaRecolhimentoAnterior;
	}

	public String getIndicadorDiaUtilAnterior() {
		return indicadorDiaUtilAnterior;
	}

	public void setIndicadorDiaUtilAnterior(String indicadorDiaUtilAnterior) {
		this.indicadorDiaUtilAnterior = indicadorDiaUtilAnterior;
	}

	public String getRegrasDiaNaoUtilAnterior() {
		return regrasDiaNaoUtilAnterior;
	}

	public void setRegrasDiaNaoUtilAnterior(String regrasDiaNaoUtilAnterior) {
		this.regrasDiaNaoUtilAnterior = regrasDiaNaoUtilAnterior;
	}

	public String getStatusAnterior() {
		return statusAnterior;
	}

	public void setStatusAnterior(String statusAnterior) {
		this.statusAnterior = statusAnterior;
	}

	public String getFuncionarioAnterior() {
		return funcionarioAnterior;
	}

	public void setFuncionarioAnterior(String funcionarioAnterior) {
		this.funcionarioAnterior = funcionarioAnterior;
	}

	public String getElegivelPagamentoAnterior() {
		return elegivelPagamentoAnterior;
	}

	public void setElegivelPagamentoAnterior(String elegivelPagamentoAnterior) {
		this.elegivelPagamentoAnterior = elegivelPagamentoAnterior;
	}

	public Integer getBancoAnterior() {
		return bancoAnterior;
	}

	public void setBancoAnterior(Integer bancoAnterior) {
		this.bancoAnterior = bancoAnterior;
	}

	public Integer getAgenciaAnterior() {
		return agenciaAnterior;
	}

	public void setAgenciaAnterior(Integer agenciaAnterior) {
		this.agenciaAnterior = agenciaAnterior;
	}

	public Long getCnpjAnterior() {
		return cnpjAnterior;
	}

	public void setCnpjAnterior(Long cnpjAnterior) {
		this.cnpjAnterior = cnpjAnterior;
	}

	public String getAliquotaPadraoAnterior() {
		return aliquotaPadraoAnterior;
	}

	public void setAliquotaPadraoAnterior(String aliquotaPadraoAnterior) {
		this.aliquotaPadraoAnterior = aliquotaPadraoAnterior;
	}

	public String getDataHoraAtualizacaoAnterior() {
		return dataHoraAtualizacaoAnterior;
	}

	public void setDataHoraAtualizacaoAnterior(String dataHoraAtualizacaoAnterior) {
		this.dataHoraAtualizacaoAnterior = dataHoraAtualizacaoAnterior;
	}
	
	public String getDataHoraAtualizacaoAnteriorFormatado() {
		return GissUtil.converteTimeStampCompleto(dataHoraAtualizacaoAnterior);
	}
	public String getDataHoraAtualizacaoFormatado() {
		return GissUtil.converteTimeStampCompleto(dataHoraAtualizacao);
	}

}