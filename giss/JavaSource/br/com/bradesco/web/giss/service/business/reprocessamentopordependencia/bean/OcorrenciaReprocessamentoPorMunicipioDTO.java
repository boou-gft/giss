package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class OcorrenciaReprocessamentoPorMunicipioDTO {

	private Long codigoMunicipio;

    private String contaContabil;

    private BigDecimal aliquota;
    
    private String razao;

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(String contaContabil) {
		this.contaContabil = contaContabil;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public Integer getCodigoGrupo(){
		return GissUtil.pegarCodigoGrupo(razao);
	}
	
	public Integer getCodigoSubgrupo(){
		return GissUtil.pegarCodigoSubgrupo(razao);
	}
}
