package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

import java.math.BigDecimal;
import java.util.Date;

import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;

public class ManterAliquotaDTO {

	private Long codigoMunicipio;
	private String nomeMunicipio;
	private String estado;
	private BigDecimal aliquota;
	private Date competenciaInicial;
	private Date competenciaFinal;
	private UsuarioRemessaAliquotaDTO usuarioCarga;
	private UsuarioRemessaAliquotaDTO usuarioConferencia;
	private UsuarioRemessaAliquotaDTO usuarioAprovacao;
	private BigDecimal aliquotaPadrao;
	private String indicadorPesquisa;
	
	
	public ManterAliquotaDTO(Long codigoMunicipio, String nomeMunicipio,
			BigDecimal aliquota, Date competenciaInicial,
			Date competenciaFinal, UsuarioRemessaAliquotaDTO usuarioCarga,
			UsuarioRemessaAliquotaDTO usuarioConferencia,
			UsuarioRemessaAliquotaDTO usuarioAprovacao,
			String indicadorPesquisa) {
		super();
		this.codigoMunicipio = codigoMunicipio;
		this.nomeMunicipio = nomeMunicipio;
		this.aliquota = aliquota;
		this.competenciaInicial = competenciaInicial;
		this.competenciaFinal = competenciaFinal;
		this.usuarioCarga = usuarioCarga;
		this.usuarioConferencia = usuarioConferencia;
		this.usuarioAprovacao = usuarioAprovacao;
		this.indicadorPesquisa = indicadorPesquisa;
	}
	
	public void atualizarAliquotaPadrao(BigDecimal aliquotaPadrao) {
		this.aliquotaPadrao = aliquotaPadrao;
	}
	
	public void atualizarEstado(String estado) {
		this.estado = estado;
	}
	
	public void atualizarIndicadorPesquisa(String indicadorPesquisa) {
		this.indicadorPesquisa = indicadorPesquisa;
	}

	public String getCompetenciaFormatada() {
		StringBuilder builder = new StringBuilder();
		
		if (!GissUtil.isEmptyOrNull(getCompetenciaInicial()) && !GissUtil.isEmptyOrNull(getCompetenciaFinal())) {
			builder.append(DateUtils.format(getCompetenciaInicial()));
			builder.append(" - ");
			builder.append(DateUtils.format(getCompetenciaFinal()));
		}
		
		return builder.toString();
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public Date getCompetenciaInicial() {
		return competenciaInicial;
	}

	public Date getCompetenciaFinal() {
		return competenciaFinal;
	}

	public UsuarioRemessaAliquotaDTO getUsuarioCarga() {
		return usuarioCarga;
	}

	public UsuarioRemessaAliquotaDTO getUsuarioConferencia() {
		return usuarioConferencia;
	}

	public UsuarioRemessaAliquotaDTO getUsuarioAprovacao() {
		return usuarioAprovacao;
	}

	public BigDecimal getAliquotaPadrao() {
		return aliquotaPadrao;
	}

	public String getEstado() {
		return estado;
	}

	public String getIndicadorPesquisa() {
		return indicadorPesquisa;
	}
}
