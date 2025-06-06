package br.com.bradesco.web.giss.service.business.contacontabil.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author gabrielmarani
 *
 */
public class ContaContabilDTO {
	
	private String conta;
	private Long cosif;
	private String cosifFormatado;
	private String codigoFuncional;
	private String razao;
	private Integer codGrupo;
	private Integer codSubGrupo;
	private String descricao;
	private Integer itemDaLei;
	private Integer descItemDaLei;
	private String item;
	private String atualizacao;
	private String horaAtualizacao;
	private String exclusao;
	private long usuario;
	private long quantidadeOcorrencias;
	private String codMensagem;
	private String mensagem;
	private List<ContasContabeisListaDTO> listaInclusaoContasContabeis;
	private int linha;
	private boolean checkGridIncluir;
	private Date dataInicial;
	private Date dataFinal;
	private Integer tipoServico;
	private String tipoServicoString;
	private String contaContabil;	
	private String tipoServicoDesc;
	private List<ContaContabilDTO> listaContasContabeis = new ArrayList<ContaContabilDTO>();
	private List<ContaContabilDTO> listaContasContabeisIncluir = new ArrayList<ContaContabilDTO>();
	/**
	 * @return the conta
	 */
	public String getConta() {
		return conta;
	}
	/**
	 * @param conta the conta to set
	 */
	public void setConta(String conta) {
		this.conta = conta;
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
	 * @return the cosifFormatado
	 */
	public String getCosifFormatado() {
		return cosifFormatado;
	}
	/**
	 * @param cosifFormatado the cosifFormatado to set
	 */
	public void setCosifFormatado(String cosifFormatado) {
		this.cosifFormatado = cosifFormatado;
	}
	/**
	 * @return the codigoFuncional
	 */
	public String getCodigoFuncional() {
		return codigoFuncional;
	}
	/**
	 * @param codigoFuncional the codigoFuncional to set
	 */
	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
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
	 * @return the codGrupo
	 */
	public Integer getCodGrupo() {
		return codGrupo;
	}
	/**
	 * @param codGrupo the codGrupo to set
	 */
	public void setCodGrupo(Integer codGrupo) {
		this.codGrupo = codGrupo;
	}
	/**
	 * @return the codSubGrupo
	 */
	public Integer getCodSubGrupo() {
		return codSubGrupo;
	}
	/**
	 * @param codSubGrupo the codSubGrupo to set
	 */
	public void setCodSubGrupo(Integer codSubGrupo) {
		this.codSubGrupo = codSubGrupo;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the itemDaLei
	 */
	public Integer getItemDaLei() {
		return itemDaLei;
	}
	/**
	 * @param itemDaLei the itemDaLei to set
	 */
	public void setItemDaLei(Integer itemDaLei) {
		this.itemDaLei = itemDaLei;
	}
	/**
	 * @return the descItemDaLei
	 */
	public Integer getDescItemDaLei() {
		return descItemDaLei;
	}
	/**
	 * @param descItemDaLei the descItemDaLei to set
	 */
	public void setDescItemDaLei(Integer descItemDaLei) {
		this.descItemDaLei = descItemDaLei;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the atualizacao
	 */
	public String getAtualizacao() {
		return atualizacao;
	}
	/**
	 * @param atualizacao the atualizacao to set
	 */
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}
	/**
	 * @return the horaAtualizacao
	 */
	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}
	/**
	 * @param horaAtualizacao the horaAtualizacao to set
	 */
	public void setHoraAtualizacao(String horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}
	/**
	 * @return the exclusao
	 */
	public String getExclusao() {
		return exclusao;
	}
	/**
	 * @param exclusao the exclusao to set
	 */
	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}
	/**
	 * @return the usuario
	 */
	public long getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the quantidadeOcorrencias
	 */
	public long getQuantidadeOcorrencias() {
		return quantidadeOcorrencias;
	}
	/**
	 * @param quantidadeOcorrencias the quantidadeOcorrencias to set
	 */
	public void setQuantidadeOcorrencias(long quantidadeOcorrencias) {
		this.quantidadeOcorrencias = quantidadeOcorrencias;
	}
	/**
	 * @return the codMensagem
	 */
	public String getCodMensagem() {
		return codMensagem;
	}
	/**
	 * @param codMensagem the codMensagem to set
	 */
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	/**
	 * @return the listaInclusaoContasContabeis
	 */
	public List<ContasContabeisListaDTO> getListaInclusaoContasContabeis() {
		return listaInclusaoContasContabeis;
	}
	/**
	 * @param listaInclusaoContasContabeis the listaInclusaoContasContabeis to set
	 */
	public void setListaInclusaoContasContabeis(List<ContasContabeisListaDTO> listaInclusaoContasContabeis) {
		this.listaInclusaoContasContabeis = listaInclusaoContasContabeis;
	}
	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(int linha) {
		this.linha = linha;
	}
	/**
	 * @return the checkGridIncluir
	 */
	public boolean isCheckGridIncluir() {
		return checkGridIncluir;
	}
	/**
	 * @param checkGridIncluir the checkGridIncluir to set
	 */
	public void setCheckGridIncluir(boolean checkGridIncluir) {
		this.checkGridIncluir = checkGridIncluir;
	}
	/**
	 * @return the dataInicial
	 */
	public Date getDataInicial() {
		return dataInicial;
	}
	/**
	 * @param dataInicial the dataInicial to set
	 */
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	/**
	 * @return the dataFinal
	 */
	public Date getDataFinal() {
		return dataFinal;
	}
	/**
	 * @param dataFinal the dataFinal to set
	 */
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	/**
	 * @return the tipoServico
	 */
	public Integer getTipoServico() {
		return tipoServico;
	}
	/**
	 * @param tipoServico the tipoServico to set
	 */
	public void setTipoServico(Integer tipoServico) {
		this.tipoServico = tipoServico;
	}
	/**
	 * @return the contaContabil
	 */
	public String getContaContabil() {
		return contaContabil;
	}
	/**
	 * @param contaContabil the contaContabil to set
	 */
	public void setContaContabil(String contaContabil) {
		this.contaContabil = contaContabil;
	}
	/**
	 * @return the tipoServicoDesc
	 */
	public String getTipoServicoDesc() {
		return tipoServicoDesc;
	}
	/**
	 * @param tipoServicoDesc the tipoServicoDesc to set
	 */
	public void setTipoServicoDesc(String tipoServicoDesc) {
		this.tipoServicoDesc = tipoServicoDesc;
	}
	/**
	 * @return the tipoServicoString
	 */
	public String getTipoServicoString() {
		return tipoServicoString;
	}
	/**
	 * @param tipoServicoString the tipoServicoString to set
	 */
	public void setTipoServicoString(String tipoServicoString) {
		this.tipoServicoString = tipoServicoString;
	}
	/**
	 * @return the listaContasContabeis
	 */
	public List<ContaContabilDTO> getListaContasContabeis() {
		return listaContasContabeis;
	}
	/**
	 * @param listaContasContabeis the listaContasContabeis to set
	 */
	public void setListaContasContabeis(List<ContaContabilDTO> listaContasContabeis) {
		this.listaContasContabeis = listaContasContabeis;
	}
	/**
	 * @return the listaContasContabeisIncluir
	 */
	public List<ContaContabilDTO> getListaContasContabeisIncluir() {
		return listaContasContabeisIncluir;
	}
	/**
	 * @param listaContasContabeisIncluir the listaContasContabeisIncluir to set
	 */
	public void setListaContasContabeisIncluir(List<ContaContabilDTO> listaContasContabeisIncluir) {
		this.listaContasContabeisIncluir = listaContasContabeisIncluir;
	}

}