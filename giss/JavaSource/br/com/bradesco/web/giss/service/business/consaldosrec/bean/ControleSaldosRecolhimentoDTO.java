package br.com.bradesco.web.giss.service.business.consaldosrec.bean;

import java.util.List;

public class ControleSaldosRecolhimentoDTO {
	
	private String competencia;
	private String estado;
	private String municipio;
	private String vencimento;
	private String pagtoDiaUtil;
	private String formaPagto;
	private String dataRecolhimento;
	private List<DependenciasDTO> listaDependencias;
	private String codMensagem;
	private String mensagem;
	
	
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	public List<DependenciasDTO> getListaDependencias() {
		return listaDependencias;
	}
	public void setListaDependencias(List<DependenciasDTO> listaDependencias) {
		this.listaDependencias = listaDependencias;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public String getDataRecolhimento() {
		return dataRecolhimento;
	}
	public void setDataRecolhimento(String dataRecolhimento) {
		this.dataRecolhimento = dataRecolhimento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFormaPagto() {
		return formaPagto;
	}
	public void setFormaPagto(String formaPagto) {
		this.formaPagto = formaPagto;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getPagtoDiaUtil() {
		return pagtoDiaUtil;
	}
	public void setPagtoDiaUtil(String pagtoDiaUtil) {
		this.pagtoDiaUtil = pagtoDiaUtil;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	
	
	
}
