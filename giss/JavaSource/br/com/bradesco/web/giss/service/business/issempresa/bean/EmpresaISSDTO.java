package br.com.bradesco.web.giss.service.business.issempresa.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.CpfCnpjUtils;
import br.com.bradesco.web.giss.utils.GissUtil;

 public class EmpresaISSDTO implements Comparable<EmpresaISSDTO>{

	private String codFuncao;
	private Long codCosif;
	private Integer codEmpresa;
	private Long cnpj;
	private Integer cnpjFilial;
	private Integer cnpjControle;
	private String nomeEmpresa;
	private Integer sistemaContabil;
	private String descSistemaContabil;
	private String perRejeicaoArquivo;
	private String descEmpresa;
	private Long contaDespesa;
	private Long contaProvisao;
	private Integer numConsul;
	private Date dataAtualizacao;
	
	private Long codMunicipio;  
	private String descMunicipios;
	private Integer codigoUf;
	private Integer identContribuinte;
	private String residInformacoes;
	private Long telResponsavel;
	private String emailResponsavel;
	private String logradouro; 
	private String nroEndereco; 
	private String complEndereco;
	private String bairro;
	private String cep;
	private String complCep;
	private Long municipio;
	private String estado;
	private String descEstado;
	private Integer codigoContribuinte;
	private String residenciaInformacoes;
	private String nomeResponsavel;
	private String dataManutencao;
	private String dataManutencaoFormatada;
	private String status;
	
	private String codFuncaoAnterior;
	private String dataManutencaoFormatadaAnterior;
	private Integer codigoContribuinteAnterior;
	private String nomeResponsavelAnterior;
	private Long telResponsavelAnterior;
	private String emailResponsavelAnterior;
	private String logradouroAnterior; 
	private String nroEnderecoAnterior; 
	private String complEnderecoAnterior;
	private String bairroAnterior;
	private String cepAnterior;
	private String estadoAnterior;
	private String descEstadoAnterior;
	private Long codMunicipioAnterior;  
	private String descMunicipiosAnterior;
	private Integer codigoUfAnterior;
	
	private List<EmpresaISSDTO> lista = new ArrayList<EmpresaISSDTO>();
	private ContasISSDTO contas = new ContasISSDTO();
	private CombosISSDTO combos = new CombosISSDTO();
	
	
	/**
	 * @return the codFuncao
	 */
	public String getCodFuncao() {
		return codFuncao;
	}
	/**
	 * @param codFuncao the codFuncao to set
	 */
	public void setCodFuncao(String codFuncao) {
		this.codFuncao = codFuncao;
	}
	/**
	 * @return the codEmpresa
	 */
	public Integer getCodEmpresa() {
		return codEmpresa;
	}
	/**
	 * @param codEmpresa the codEmpresa to set
	 */
	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
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
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	/**
	 * @return the perRejeicaoArquivo
	 */
	public String getPerRejeicaoArquivo() {
		return perRejeicaoArquivo;
	}
	/**
	 * @param perRejeicaoArquivo the perRejeicaoArquivo to set
	 */
	public void setPerRejeicaoArquivo(String perRejeicaoArquivo) {
		this.perRejeicaoArquivo = perRejeicaoArquivo;
	}
	/**
	 * @return the descEmpresa
	 */
	public String getDescEmpresa() {
		return descEmpresa;
	}
	/**
	 * @param descEmpresa the descEmpresa to set
	 */
	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}
	/**
	 * @return the contaDespesa
	 */
	public Long getContaDespesa() {
		return contaDespesa;
	}
	/**
	 * @param contaDespesa the contaDespesa to set
	 */
	public void setContaDespesa(Long contaDespesa) {
		this.contaDespesa = contaDespesa;
	}
	/**
	 * @return the contaProvisao
	 */
	public Long getContaProvisao() {
		return contaProvisao;
	}
	/**
	 * @param contaProvisao the contaProvisao to set
	 */
	public void setContaProvisao(Long contaProvisao) {
		this.contaProvisao = contaProvisao;
	}
	
	
	/**
	 * @return the lista
	 */
	public List<EmpresaISSDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<EmpresaISSDTO> lista) {
		this.lista = lista;
	}

	/**
	 * @return the contas
	 */
	public ContasISSDTO getContas() {
		return contas;
	}
	/**
	 * @param contas the contas to set
	 */
	public void setContas(ContasISSDTO contas) {
		this.contas = contas;
	}
	/**
	 * @return the contaResumo
	 */
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
	/**
	 * @return the codCosif
	 */
	public Long getCodCosif() {
		return codCosif;
	}
	/**
	 * @param codCosif the codCosif to set
	 */
	public void setCodCosif(Long codCosif) {
		this.codCosif = codCosif;
	}
	public void setCnpjPrincipal(long cnpPrincipal) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return the combos
	 */
	public CombosISSDTO getCombos() {
		return combos;
	}
	/**
	 * @param combos the combos to set
	 */
	public void setCombos(CombosISSDTO combos) {
		this.combos = combos;
	}
	/**
	 * @return the sistemaContabil
	 */
	public Integer getSistemaContabil() {
		return sistemaContabil;
	}
	/**
	 * @param sistemaContabil the sistemaContabil to set
	 */
	public void setSistemaContabil(Integer sistemaContabil) {
		this.sistemaContabil = sistemaContabil;
	}
	/**
	 * @return the descSistemaContabil
	 */
	public String getDescSistemaContabil() {
		return descSistemaContabil;
	}
	/**
	 * @param descSistemaContabil the descSistemaContabil to set
	 */
	public void setDescSistemaContabil(String descSistemaContabil) {
		this.descSistemaContabil = descSistemaContabil;
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
	 * @return the contaDespesaForm
	 */
	public String getContaDespesaForm() {
		return GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(contaDespesa)),14 );
	}
	/**
	 * @return the contaProvisaoForm
	 */
	public String getContaProvisaoForm() {
		return GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(contaProvisao)),14 );
	}
	
	public String getDescEmpresaFormatada(){
		return getCnpjFormatado().equals("")?descEmpresa:getCnpjFormatado()+ " - " + descEmpresa;
	}
	
	public int compareTo(EmpresaISSDTO m) {
		return this.getCodEmpresa().compareTo(m.getCodEmpresa());
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
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

	public Integer getCodigoContribuinte() {
		return codigoContribuinte;
	}
	public void setCodigoContribuinte(Integer codigoContribuinte) {
		this.codigoContribuinte = codigoContribuinte;
	}
	public String getResidenciaInformacoes() {
		return residenciaInformacoes;
	}
	public void setResidenciaInformacoes(String residenciaInformacoes) {
		this.residenciaInformacoes = residenciaInformacoes;
	}
	public Long getTelResponsavel() {
		return telResponsavel;
	}
	public void setTelResponsavel(Long telResponsavel) {
		this.telResponsavel = telResponsavel;
	}
	public String getEmailResponsavel() {
		return emailResponsavel;
	}
	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNroEndereco() {
		return nroEndereco;
	}
	public void setNroEndereco(String nroEndereco) {
		this.nroEndereco = nroEndereco;
	}
	public String getComplEndereco() {
		return complEndereco;
	}
	public void setComplEndereco(String complEndereco) {
		this.complEndereco = complEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public Integer getIdentContribuinte() {
		return identContribuinte;
	}
	public void setIdentContribuinte(Integer identContribuinte) {
		this.identContribuinte = identContribuinte;
	}
	public String getResidInformacoes() {
		return residInformacoes;
	}
	public void setResidInformacoes(String residInformacoes) {
		this.residInformacoes = residInformacoes;
	}
	public Long getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}
	public String getComplCep() {
		return complCep;
	}
	public void setComplCep(String complCep) {
		this.complCep = complCep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the descEstado
	 */
	public String getDescEstado() {
		return descEstado;
	}
	/**
	 * @param descEstado the descEstado to set
	 */
	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}
	/**
	 * @return the dataManutencao
	 */
	public String getDataManutencao() {
		return dataManutencao;
	}
	/**
	 * @param dataManutencao the dataManutencao to set
	 */
	public void setDataManutencao(String dataManutencao) {
		this.dataManutencao = dataManutencao;
	}
	/**
	 * @return the dataManutencaoFormatada
	 */
	public String getDataManutencaoFormatada() {
		return dataManutencaoFormatada;
	}
	/**
	 * @param dataManutencaoFormatada the dataManutencaoFormatada to set
	 */
	public void setDataManutencaoFormatada(String dataManutencaoFormatada) {
		this.dataManutencaoFormatada = dataManutencaoFormatada;
	}
	/**
	 * @return the codFuncaoAnterior
	 */
	public String getCodFuncaoAnterior() {
		return codFuncaoAnterior;
	}
	/**
	 * @param codFuncaoAnterior the codFuncaoAnterior to set
	 */
	public void setCodFuncaoAnterior(String codFuncaoAnterior) {
		this.codFuncaoAnterior = codFuncaoAnterior;
	}
	/**
	 * @return the dataManutencaoFormatadaAnterior
	 */
	public String getDataManutencaoFormatadaAnterior() {
		return dataManutencaoFormatadaAnterior;
	}
	/**
	 * @param dataManutencaoFormatadaAnterior the dataManutencaoFormatadaAnterior to set
	 */
	public void setDataManutencaoFormatadaAnterior(String dataManutencaoFormatadaAnterior) {
		this.dataManutencaoFormatadaAnterior = dataManutencaoFormatadaAnterior;
	}
	
	/**
	 * @return the codigoContribuinteAnterior
	 */
	public Integer getCodigoContribuinteAnterior() {
		return codigoContribuinteAnterior;
	}
	/**
	 * @param codigoContribuinteAnterior the codigoContribuinteAnterior to set
	 */
	public void setCodigoContribuinteAnterior(Integer codigoContribuinteAnterior) {
		this.codigoContribuinteAnterior = codigoContribuinteAnterior;
	}
	/**
	 * @return the nomeResponsavelAnterior
	 */
	public String getNomeResponsavelAnterior() {
		return nomeResponsavelAnterior;
	}
	/**
	 * @param nomeResponsavelAnterior the nomeResponsavelAnterior to set
	 */
	public void setNomeResponsavelAnterior(String nomeResponsavelAnterior) {
		this.nomeResponsavelAnterior = nomeResponsavelAnterior;
	}
	/**
	 * @return the telResponsavelAnterior
	 */
	public Long getTelResponsavelAnterior() {
		return telResponsavelAnterior;
	}
	/**
	 * @param telResponsavelAnterior the telResponsavelAnterior to set
	 */
	public void setTelResponsavelAnterior(Long telResponsavelAnterior) {
		this.telResponsavelAnterior = telResponsavelAnterior;
	}
	/**
	 * @return the emailResponsavelAnterior
	 */
	public String getEmailResponsavelAnterior() {
		return emailResponsavelAnterior;
	}
	/**
	 * @param emailResponsavelAnterior the emailResponsavelAnterior to set
	 */
	public void setEmailResponsavelAnterior(String emailResponsavelAnterior) {
		this.emailResponsavelAnterior = emailResponsavelAnterior;
	}
	/**
	 * @return the logradouroAnterior
	 */
	public String getLogradouroAnterior() {
		return logradouroAnterior;
	}
	/**
	 * @param logradouroAnterior the logradouroAnterior to set
	 */
	public void setLogradouroAnterior(String logradouroAnterior) {
		this.logradouroAnterior = logradouroAnterior;
	}
	/**
	 * @return the nroEnderecoAnterior
	 */
	public String getNroEnderecoAnterior() {
		return nroEnderecoAnterior;
	}
	/**
	 * @param nroEnderecoAnterior the nroEnderecoAnterior to set
	 */
	public void setNroEnderecoAnterior(String nroEnderecoAnterior) {
		this.nroEnderecoAnterior = nroEnderecoAnterior;
	}
	/**
	 * @return the complEnderecoAnterior
	 */
	public String getComplEnderecoAnterior() {
		return complEnderecoAnterior;
	}
	/**
	 * @param complEnderecoAnterior the complEnderecoAnterior to set
	 */
	public void setComplEnderecoAnterior(String complEnderecoAnterior) {
		this.complEnderecoAnterior = complEnderecoAnterior;
	}
	/**
	 * @return the bairroAnterior
	 */
	public String getBairroAnterior() {
		return bairroAnterior;
	}
	/**
	 * @param bairroAnterior the bairroAnterior to set
	 */
	public void setBairroAnterior(String bairroAnterior) {
		this.bairroAnterior = bairroAnterior;
	}
	/**
	 * @return the cepAnterior
	 */
	public String getCepAnterior() {
		return cepAnterior;
	}
	/**
	 * @param cepAnterior the cepAnterior to set
	 */
	public void setCepAnterior(String cepAnterior) {
		this.cepAnterior = cepAnterior;
	}
	/**
	 * @return the descEstadoAnterior
	 */
	public String getDescEstadoAnterior() {
		return descEstadoAnterior;
	}
	/**
	 * @param descEstadoAnterior the descEstadoAnterior to set
	 */
	public void setDescEstadoAnterior(String descEstadoAnterior) {
		this.descEstadoAnterior = descEstadoAnterior;
	}
	/**
	 * @return the codMunicipioAnterior
	 */
	public Long getCodMunicipioAnterior() {
		return codMunicipioAnterior;
	}
	/**
	 * @param codMunicipioAnterior the codMunicipioAnterior to set
	 */
	public void setCodMunicipioAnterior(Long codMunicipioAnterior) {
		this.codMunicipioAnterior = codMunicipioAnterior;
	}
	/**
	 * @return the descMunicipiosAnterior
	 */
	public String getDescMunicipiosAnterior() {
		return descMunicipiosAnterior;
	}
	/**
	 * @param descMunicipiosAnterior the descMunicipiosAnterior to set
	 */
	public void setDescMunicipiosAnterior(String descMunicipiosAnterior) {
		this.descMunicipiosAnterior = descMunicipiosAnterior;
	}
	/**
	 * @return the estadoAnterior
	 */
	public String getEstadoAnterior() {
		return estadoAnterior;
	}
	/**
	 * @param estadoAnterior the estadoAnterior to set
	 */
	public void setEstadoAnterior(String estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}
	/**
	 * @return the codigoUfAnterior
	 */
	public Integer getCodigoUfAnterior() {
		return codigoUfAnterior;
	}
	/**
	 * @param codigoUfAnterior the codigoUfAnterior to set
	 */
	public void setCodigoUfAnterior(Integer codigoUfAnterior) {
		this.codigoUfAnterior = codigoUfAnterior;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescStatus() {
		return GissUtil.notNull(status).equalsIgnoreCase("A")?"Ativo":GissUtil.notNull(status).equalsIgnoreCase("I")?"Inativo":"";
	}

}
