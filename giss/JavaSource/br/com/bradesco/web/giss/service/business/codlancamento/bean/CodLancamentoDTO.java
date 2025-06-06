package br.com.bradesco.web.giss.service.business.codlancamento.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import freemarker.template.utility.StringUtil;

public class CodLancamentoDTO {
	
	private Integer codLancamento;
	private String segLinhaExtrato;
	private Long cosif;
	private String razao;
	private Integer grupo;
	private Integer subGrupo;
	private Long conta;
	private String digito;
	private String nomeConta;
	private Integer codItem;
	private Integer numParam;
	private Date dataInicial;
	private Date dataFinal;
	private String dataAtualizacao;
	private String horaAtualizacao;
	private String dataExclusao;
	private String codFuncional;
	private int numeroRegistro;
	private Integer paramLancamentoContabil;
	private String hrInclusaoRegistroHistorico;
	private Integer itemSelecionado;
	
	private List<CodLancamentoDTO> lista = new ArrayList<CodLancamentoDTO>();
	
	public String getDescItem(){
		return obtemDescItem();
	}
	
	private String obtemDescItem(){
		String descItem = "";
		
		switch (getCodItem()) {
		case 1:
			descItem = "2º Linha de Extrato";
			break;
		case 2:
			descItem = "COSIF";		
			break;
		case 3:
			descItem = "Razão";
			break;
		case 4:
			descItem = "Conta e digito";
			break;
		case 5:
			descItem = "Nome da Conta";
			break;
		case 6:
			descItem = "Item de Seviço LC";
			break;
		case 9:
			descItem = "Varios";
			break;
		default:
			descItem = "";
			break;
		}
		
		return descItem;
	}
	
	/**
	 * @return the codLancamento
	 */
	public Integer getCodLancamento() {
		return codLancamento;
	}
	/**
	 * @param codLancamento the codLancamento to set
	 */
	public void setCodLancamento(Integer codLancamento) {
		this.codLancamento = codLancamento;
	}
	/**
	 * @return the segLinhaExtrato
	 */
	public String getSegLinhaExtrato() {
		return segLinhaExtrato;
	}
	/**
	 * @param segLinhaExtrato the segLinhaExtrato to set
	 */
	public void setSegLinhaExtrato(String segLinhaExtrato) {
		this.segLinhaExtrato = segLinhaExtrato;
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
	 * @return the digito
	 */
	public String getDigito() {
		return digito;
	}
	/**
	 * @param digito the digito to set
	 */
	public void setDigito(String digito) {
		this.digito = digito;
	}
	
	/**
	 * @return the nomeConta
	 */
	public String getNomeConta() {
		return nomeConta;
	}
	/**
	 * @param nomeConta the nomeConta to set
	 */
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	/**
	 * @return the codItem
	 */
	public Integer getCodItem() {
		return codItem;
	}
	/**
	 * @param codItem the codItem to set
	 */
	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}
	
	/**
	 * @return the razaoContaDig
	 */
	public String getRazaoContaDig() {
		return StringUtil.leftPad(String.valueOf(grupo), 3, "0") + "-" + 
			StringUtil.leftPad(String.valueOf(subGrupo), 3, "0") + "/" + conta + "-" + digito;
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
	 * @return the lista
	 */
	public List<CodLancamentoDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<CodLancamentoDTO> lista) {
		this.lista = lista;
	}
	/**
	 * @return the dataAtualizacao
	 */
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
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
	 * @return the dataExclusao
	 */
	public String getDataExclusao() {
		return dataExclusao;
	}
	/**
	 * @param dataExclusao the dataExclusao to set
	 */
	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	/**
	 * @return the codFuncional
	 */
	public String getCodFuncional() {
		return codFuncional;
	}
	/**
	 * @param codFuncional the codFuncional to set
	 */
	public void setCodFuncional(String codFuncional) {
		this.codFuncional = codFuncional;
	}
	/**
	 * @return the grupo
	 */
	public Integer getGrupo() {
		return grupo;
	}
	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	/**
	 * @return the subGrupo
	 */
	public Integer getSubGrupo() {
		return subGrupo;
	}
	/**
	 * @param subGrupo the subGrupo to set
	 */
	public void setSubGrupo(Integer subGrupo) {
		this.subGrupo = subGrupo;
	}
	/**
	 * @return the numeroRegistro
	 */
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	/**
	 * @param numeroRegistro the numeroRegistro to set
	 */
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	/**
	 * @return the numParam
	 */
	public Integer getNumParam() {
		return numParam;
	}
	/**
	 * @param numParam the numParam to set
	 */
	public void setNumParam(Integer numParam) {
		this.numParam = numParam;
	}

	/**
	 * @return the paramLancamentoContabil
	 */
	public Integer getParamLancamentoContabil() {
		return paramLancamentoContabil;
	}

	/**
	 * @param paramLancamentoContabil the paramLancamentoContabil to set
	 */
	public void setParamLancamentoContabil(Integer paramLancamentoContabil) {
		this.paramLancamentoContabil = paramLancamentoContabil;
	}

	/**
	 * @return the hrInclusaoRegistroHistorico
	 */
	public String getHrInclusaoRegistroHistorico() {
		return hrInclusaoRegistroHistorico;
	}

	/**
	 * @param hrInclusaoRegistroHistorico the hrInclusaoRegistroHistorico to set
	 */
	public void setHrInclusaoRegistroHistorico(String hrInclusaoRegistroHistorico) {
		this.hrInclusaoRegistroHistorico = hrInclusaoRegistroHistorico;
	}

	/**
	 * @return the itemSelecionado
	 */
	public Integer getItemSelecionado() {
		return itemSelecionado;
	}

	/**
	 * @param itemSelecionado the itemSelecionado to set
	 */
	public void setItemSelecionado(Integer itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}
}