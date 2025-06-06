package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ItemManterAliquotaDTO {

	private Long codigoMunicipio;
	private Integer codigoItemServico;
	private String nomeItemServico;
	private String percentualAliquotaAtualizado;
	
	
	public ItemManterAliquotaDTO(Long codigoMunicipio,
			Integer codigoItemServico, String nomeItemServico,
			String percentualAliquotaAtualizado) {
		super();
		this.codigoMunicipio = codigoMunicipio;
		this.codigoItemServico = codigoItemServico;
		this.nomeItemServico = nomeItemServico;
		this.percentualAliquotaAtualizado = percentualAliquotaAtualizado;
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

	public Integer getCodigoItemServico() {
		return codigoItemServico;
	}

	public String getNomeItemServico() {
		return nomeItemServico;
	}

	public String getPercentualAliquotaAtualizado() {
		return percentualAliquotaAtualizado;
	}

	public void setPercentualAliquotaAtualizado(
			String percentualAliquotaAtualizado) {
		this.percentualAliquotaAtualizado = percentualAliquotaAtualizado;
	}	
}
