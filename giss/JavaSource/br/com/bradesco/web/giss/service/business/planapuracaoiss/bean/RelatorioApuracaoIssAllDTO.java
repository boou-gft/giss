package br.com.bradesco.web.giss.service.business.planapuracaoiss.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RelatorioApuracaoIssAllDTO {

	private BigDecimal valorRedutorTotal;

	private BigDecimal valorTotalReceitaTotal;

	private BigDecimal valorTotalIssTotal;

	private List<RelatorioApuracaoIssDTO> apuracoesMesAno = new ArrayList<RelatorioApuracaoIssDTO>();

	public BigDecimal getValorRedutorTotal() {
		return valorRedutorTotal;
	}

	public void setValorRedutorTotal(BigDecimal valorRedutorTotal) {
		this.valorRedutorTotal = valorRedutorTotal;
	}

	public BigDecimal getValorTotalReceitaTotal() {
		return valorTotalReceitaTotal;
	}

	public void setValorTotalReceitaTotal(BigDecimal valorTotalReceitaTotal) {
		this.valorTotalReceitaTotal = valorTotalReceitaTotal;
	}

	public BigDecimal getValorTotalIssTotal() {
		return valorTotalIssTotal;
	}

	public void setValorTotalIssTotal(BigDecimal valorTotalIssTotal) {
		this.valorTotalIssTotal = valorTotalIssTotal;
	}

	public List<RelatorioApuracaoIssDTO> getApuracoesMesAno() {
		return apuracoesMesAno;
	}

	public void setApuracoesMesAno(List<RelatorioApuracaoIssDTO> apuracoesMesAno) {
		this.apuracoesMesAno = apuracoesMesAno;
	}

}
