package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ItemRemessaAliquotaDTO {

	private Long codigoMunicipio;
	private String nomeMunicipio;
	private String uf;
	private Integer codigoItemServico;
	private String nomeItemServico;
	private BigDecimal aliquotaAtual;
	private BigDecimal aliquotaISSProprio;
	private BigDecimal aliquotaISSGerencial;
	
	public ItemRemessaAliquotaDTO(Long codigoMunicipio, String nomeMunicipio,
			String uf, Integer codigoItemServico, String nomeItemServico,
			BigDecimal aliquotaAtual, BigDecimal aliquotaISSProprio,
			BigDecimal aliquotaISSGerencial) {
		super();
		this.codigoMunicipio = codigoMunicipio;
		this.nomeMunicipio = nomeMunicipio;
		this.uf = uf;
		this.codigoItemServico = codigoItemServico;
		this.nomeItemServico = nomeItemServico;
		this.aliquotaAtual = aliquotaAtual;
		this.aliquotaISSProprio = aliquotaISSProprio;
		this.aliquotaISSGerencial = aliquotaISSGerencial;
	}
	
	public String getItemServicoFormatado() {
		StringBuilder builder = new StringBuilder();
		
		if (!GissUtil.isEmptyOrNull(getCodigoItemServico())) {
			builder.append(getCodigoItemServico());
		}
		
		if (builder.length() > 0) {
			builder.append(" - ");
		}
		
		if (!GissUtil.isEmptyOrNull(getNomeItemServico())) {
			builder.append(getNomeItemServico());
		}
		
		return builder.toString();
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public String getUf() {
		return uf;
	}

	public Integer getCodigoItemServico() {
		return codigoItemServico;
	}

	public String getNomeItemServico() {
		return nomeItemServico;
	}

	public BigDecimal getAliquotaAtual() {
		return aliquotaAtual;
	}

	public BigDecimal getAliquotaISSProprio() {
		return aliquotaISSProprio;
	}

	public BigDecimal getAliquotaISSGerencial() {
		return aliquotaISSGerencial;
	}

}
