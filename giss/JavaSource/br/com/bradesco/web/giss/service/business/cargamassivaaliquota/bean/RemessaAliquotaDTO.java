package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

public class RemessaAliquotaDTO {

	private Long numeroRemessa;
	private SituacaoRemessaEnum situacaoRemessa;
	private UsuarioRemessaAliquotaDTO usuarioCarga;
	private UsuarioRemessaAliquotaDTO usuarioConferencia;
	private UsuarioRemessaAliquotaDTO usuarioAprovacao;
	
	
	public RemessaAliquotaDTO() {
		super();
	}
	
	
	public Long getNumeroRemessa() {
		return numeroRemessa;
	}
	public void setNumeroRemessa(Long numeroRemessa) {
		this.numeroRemessa = numeroRemessa;
	}
	public SituacaoRemessaEnum getSituacaoRemessa() {
		return situacaoRemessa;
	}
	public void setSituacaoRemessa(SituacaoRemessaEnum situacaoRemessa) {
		this.situacaoRemessa = situacaoRemessa;
	}
	public UsuarioRemessaAliquotaDTO getUsuarioCarga() {
		return usuarioCarga;
	}
	public void setUsuarioCarga(UsuarioRemessaAliquotaDTO usuarioCarga) {
		this.usuarioCarga = usuarioCarga;
	}
	public UsuarioRemessaAliquotaDTO getUsuarioConferencia() {
		return usuarioConferencia;
	}
	public void setUsuarioConferencia(UsuarioRemessaAliquotaDTO usuarioConferencia) {
		this.usuarioConferencia = usuarioConferencia;
	}
	public UsuarioRemessaAliquotaDTO getUsuarioAprovacao() {
		return usuarioAprovacao;
	}
	public void setUsuarioAprovacao(UsuarioRemessaAliquotaDTO usuarioAprovacao) {
		this.usuarioAprovacao = usuarioAprovacao;
	}
	
	
}
