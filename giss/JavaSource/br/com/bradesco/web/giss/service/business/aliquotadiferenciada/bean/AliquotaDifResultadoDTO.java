package br.com.bradesco.web.giss.service.business.aliquotadiferenciada.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class AliquotaDifResultadoDTO {
	
	public String getCosif() {
		return cosif;
	}

	public void setCosif(String cosif) {
		this.cosif = cosif;
	}

	private String conta;
	private String cosif;
	private String razao;
	private String descricaoConta;
	private String item;
	private String padrao;
	private String diferenciada;
	private int linha;
	
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDescricaoConta() {
		return descricaoConta;
	}
	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}
	public String getDiferenciada() {
		return diferenciada;
	}
	public void setDiferenciada(String diferenciada) {
		this.diferenciada = diferenciada;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getPadrao() {
		return padrao;
	}
	public void setPadrao(String padrao) {
		this.padrao = padrao;
	}

	public String getRazao() {
		if(razao != null & razao.indexOf("-") > -1){
			String codigoGrupo = GissUtil.preencherZerosAEsquerda(razao.split("-")[0],3);
			String codigoSubgrupo = GissUtil.preencherZerosAEsquerda(razao.split("-")[1],3);
			razao = GissUtil.mascaraRazaoContabil(codigoGrupo + codigoSubgrupo);
		}
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	

}
