package br.com.bradesco.web.giss.view.bean.model.listaGenerica;

import java.util.ArrayList;

public class conciliacaoVo {
	private String cosif;
	private String razao;
	private String conta;
	private String descConta;
	private String valor;
	private String justificativa;
	private ArrayList<conciliacaoVo> lista = new ArrayList<conciliacaoVo>();
	/**
	 * @return the cosif
	 */
	public String getCosif() {
		return cosif;
	}
	/**
	 * @param cosif the cosif to set
	 */
	public void setCosif(String cosif) {
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
	 * @return the descConta
	 */
	public String getDescConta() {
		return descConta;
	}
	/**
	 * @param descConta the descConta to set
	 */
	public void setDescConta(String descConta) {
		this.descConta = descConta;
	}
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	/**
	 * @return the justificativa
	 */
	public String getJustificativa() {
		return justificativa;
	}
	/**
	 * @param justificativa the justificativa to set
	 */
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	/**
	 * @return the lista
	 */
	public ArrayList<conciliacaoVo> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<conciliacaoVo> lista) {
		this.lista = lista;
	}

}