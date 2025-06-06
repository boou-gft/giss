package br.com.bradesco.web.giss.service.business.apuracaomensal.bean;

import br.com.bradesco.web.giss.utils.NumberUtils;

public class DependenciaApuracaoMensalEntradaDTO {

	private Integer numeroMaximoOcorrencia;

    private String codigoMunicipio;

    private Integer mesApuracaoContabil;

    private Integer anoApuracaoContabil;
    
    private Long codigoPessoaJuridica;
    
    private Integer codigoDependencia;

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Long getCodigoMunicipioLong() {
		if (getCodigoMunicipio() != null && !getCodigoMunicipio().trim().equals("")) {
			return Long.parseLong(getCodigoMunicipio());
		}
		return null;
	}

	public Integer getNumeroMaximoOcorrencia() {
		return numeroMaximoOcorrencia;
	}

	public void setNumeroMaximoOcorrencia(Integer numeroMaximoOcorrencia) {
		this.numeroMaximoOcorrencia = numeroMaximoOcorrencia;
	}

	public Integer getMesAnoApuracaoContabil() {
		if (getDescMesAnoApuracaoContabil() != null) {
			return Integer.parseInt(getDescMesAnoApuracaoContabil().replaceAll("/", ""));
		}

		return null;
	}

	public String getDescMesAnoApuracaoContabil() {
		if (getMesApuracaoContabil() != null && getAnoApuracaoContabil() != null) {
			String mes = NumberUtils.format(getMesApuracaoContabil(), "00");
			String ano = NumberUtils.format(getAnoApuracaoContabil(), "0000");
			return mes + "/" + ano;
		}
		return null;
	}

	public Integer getAnoApuracaoContabil() {
		return anoApuracaoContabil;
	}

	public void setAnoApuracaoContabil(Integer anoApuracaoContabil) {
		this.anoApuracaoContabil = anoApuracaoContabil;
	}

	public Integer getMesApuracaoContabil() {
		return mesApuracaoContabil;
	}

	public void setMesApuracaoContabil(Integer mesApuracaoContabil) {
		this.mesApuracaoContabil = mesApuracaoContabil;
	}

	public Long getCodigoPessoaJuridica() {
		return codigoPessoaJuridica;
	}

	public void setCodigoPessoaJuridica(Long codigoPessoaJuridica) {
		this.codigoPessoaJuridica = codigoPessoaJuridica;
	}

	public Integer getCodigoDependencia() {
		return codigoDependencia;
	}

	public void setCodigoDependencia(Integer codigoDependencia) {
		this.codigoDependencia = codigoDependencia;
	}

}
