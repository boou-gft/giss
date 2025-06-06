package br.com.bradesco.web.giss.service.business.reprocessamentopordependencia.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ContaDTO {

	private String codigoContaContabil;
    private BigDecimal percentualAliquota = BigDecimal.ZERO;
    private String razao;

	public String getCodigoContaContabil() {
		return codigoContaContabil;
	}

	public void setCodigoContaContabil(String codigoContaContabil) {
		this.codigoContaContabil = codigoContaContabil;
	}

	public BigDecimal getPercentualAliquota() {
		return percentualAliquota;
	}

	public void setPercentualAliquota(BigDecimal percentualAliquota) {
		this.percentualAliquota = percentualAliquota;
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
