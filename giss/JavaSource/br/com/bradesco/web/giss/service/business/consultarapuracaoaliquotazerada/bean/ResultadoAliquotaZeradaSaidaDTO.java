package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean;

import java.math.BigDecimal;

import br.com.bradesco.web.giss.utils.GissUtil;

public class ResultadoAliquotaZeradaSaidaDTO {

	private String			codMensagem;
	private String			mensagem;
	private BigDecimal	receitaTotalGeralValor;
	private BigDecimal	receitaTotalValor;
	private Integer			numConcultas;
	private String			conta;
	private String			razao;
	private String			descricao;
	private BigDecimal	receitaValor;
	private int					linha;
	private String			cosif;

	public ResultadoAliquotaZeradaSaidaDTO() {

		// TODO Auto-generated constructor stub
	}

	public ResultadoAliquotaZeradaSaidaDTO(BigDecimal receitaTotalGeralValor, BigDecimal receitaTotalValor, Integer numConcultas, String conta, String descricao, BigDecimal receitaValor, int linha, String cosif) {

		super();
		this.receitaTotalGeralValor = receitaTotalGeralValor;
		this.receitaTotalValor = receitaTotalValor;
		this.numConcultas = numConcultas;
		this.conta = conta;
		this.descricao = descricao;
		this.receitaValor = receitaValor;
		this.linha = linha;
		this.cosif = cosif;
	}

	public String getCodMensagem() {

		return codMensagem;
	}

	public void setCodMensagem(String codMensagem) {

		this.codMensagem = codMensagem;
	}

	public String getConta() {

		return conta;
	}

	public void setConta(String conta) {

		this.conta = conta;
	}

	public String getDescricao() {

		return descricao;
	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public int getLinha() {

		return linha;
	}

	public void setLinha(int linha) {

		this.linha = linha;
	}

	public String getMensagem() {

		return mensagem;
	}

	public void setMensagem(String mensagem) {

		this.mensagem = mensagem;
	}

	public Integer getNumConcultas() {

		return numConcultas;
	}

	public void setNumConcultas(Integer numConcultas) {

		this.numConcultas = numConcultas;
	}

	public BigDecimal getReceitaTotalValor() {

		return receitaTotalValor;
	}

	public void setReceitaTotalValor(BigDecimal receitaTotalValor) {

		this.receitaTotalValor = receitaTotalValor;
	}

	public BigDecimal getReceitaValor() {

		return receitaValor;
	}

	public void setReceitaValor(BigDecimal receitaValor) {

		this.receitaValor = receitaValor;
	}

	public BigDecimal getReceitaTotalGeralValor() {

		return receitaTotalGeralValor;
	}

	public void setReceitaTotalGeralValor(BigDecimal receitaTotalGeralValor) {

		this.receitaTotalGeralValor = receitaTotalGeralValor;
	}

	public String getRazao() {

		return razao;
	}

	public void setRazao(String razao) {

		this.razao = razao;
	}

	public Integer getCodigoGrupo() {

		return GissUtil.pegarCodigoGrupo(razao);
	}

	public Integer getCodigoSubGrupo() {

		return GissUtil.pegarCodigoSubgrupo(razao);
	}

	public String getCosif() {
		return cosif;
	}

	public void setCosif(String cosif) {
		this.cosif = cosif;
	}

}