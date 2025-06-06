package br.com.bradesco.web.giss.service.business.tipoincidencia.bean;

import java.util.List;

public class TipoIncidenciaDTO {
	
	private String codigo;
	private String descricao;
	private String dtAtualizacao;	
	private boolean caracterisiticas;	
	private String datainiciovigencia;	
	private String datafinalvigencia;	
	private List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidencia;
	private int numeroRegistro;
	private String codMensagem;
	private String mensagem;
	private String codigoFuncional;
	
	public String getCodigoFuncional() {
		return codigoFuncional;
	}
	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(String dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int totalRegistros) {
		this.numeroRegistro = totalRegistros;
	}		
	public boolean isCaracterisiticas() {
		return caracterisiticas;
	}
	public void setCaracterisiticas(boolean caracterisiticas) {
		this.caracterisiticas = caracterisiticas;
	}
	public String getDatafinalvigencia() {
		return datafinalvigencia;
	}
	public void setDatafinalvigencia(String datafinalvigencia) {
		this.datafinalvigencia = datafinalvigencia;
	}
	public String getDatainiciovigencia() {
		return datainiciovigencia;
	}
	public void setDatainiciovigencia(String datainiciovigencia) {
		this.datainiciovigencia = datainiciovigencia;
	}		
	public List<TipoIncidenciaFaixasDTO> getListaFaixasTipoIncidencia() {
		return listaFaixasTipoIncidencia;
	}
	public void setListaFaixasTipoIncidencia(List<TipoIncidenciaFaixasDTO> listaFaixasTipoIncidencia) {
		this.listaFaixasTipoIncidencia = listaFaixasTipoIncidencia;
	}
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
