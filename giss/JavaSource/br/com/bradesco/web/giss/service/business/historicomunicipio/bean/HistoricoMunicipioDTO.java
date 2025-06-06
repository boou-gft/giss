package br.com.bradesco.web.giss.service.business.historicomunicipio.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class HistoricoMunicipioDTO {
	
	private String codigo;
	private String descricao;
	private String atualizacao;
	private String hora;
	private String exclusao;
	private String horaRegistroInclusao;
	private String codigoFuncional;
	
	private Boolean desabilitarCheckItemLista = Boolean.FALSE;
	private Boolean itemSelecionadoMainframe = Boolean.FALSE;
    private Boolean itemSelecionadoCheckLista = Boolean.FALSE;
    private String data = "";
    private String uf = "";
    
    private boolean flagSituacaoMunicipio = false; 
    private String codFlagSituacao = "";
	
	private int linha;
	private Long id;
	
	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
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
	public String getExclusao() {
		return exclusao;
	}
	public void setExclusao(String exclusao) {
		this.exclusao = exclusao;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getHoraRegistroInclusao() {
		return horaRegistroInclusao;
	}
	public void setHoraRegistroInclusao(String horaRegistroInclusao) {
		this.horaRegistroInclusao = horaRegistroInclusao;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCodigoFuncional() {
		return codigoFuncional;
	}
	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	public Boolean getDesabilitarCheckItemLista() {
		return desabilitarCheckItemLista;
	}
	public void setDesabilitarCheckItemLista(Boolean desabilitarCheckItemLista) {
		this.desabilitarCheckItemLista = desabilitarCheckItemLista;
	}
	public Boolean getItemSelecionadoMainframe() {
		return itemSelecionadoMainframe;
	}
	public void setItemSelecionadoMainframe(Boolean itemSelecionadoMainframe) {
		this.itemSelecionadoMainframe = itemSelecionadoMainframe;
	}
	public Boolean getItemSelecionadoCheckLista() {
		return itemSelecionadoCheckLista;
	}
	public void setItemSelecionadoCheckLista(Boolean itemSelecionadoCheckLista) {
		this.itemSelecionadoCheckLista = itemSelecionadoCheckLista;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public boolean getFlagSituacaoMunicipio() {
		return flagSituacaoMunicipio;
	}
	public void setFlagSituacaoMunicipio(String flagSituacaoMunicipio) {
		
		if(GissUtil.isEmptyOrNullZero(flagSituacaoMunicipio)){
			this.flagSituacaoMunicipio = false;
		}
		
		else{
			this.flagSituacaoMunicipio = true;
		}
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodFlagSituacao() {
		return codFlagSituacao;
	}
	public void setCodFlagSituacao(String codFlagSituacao) {
		this.codFlagSituacao = codFlagSituacao;
	}
}
