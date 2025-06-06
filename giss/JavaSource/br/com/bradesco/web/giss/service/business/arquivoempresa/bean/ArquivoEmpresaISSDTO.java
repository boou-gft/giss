package br.com.bradesco.web.giss.service.business.arquivoempresa.bean;

import java.util.ArrayList;


public class ArquivoEmpresaISSDTO {
	
	private Integer codEmpresa;
	private Integer anoBase;
	private Integer mesBase;
	private String descEmpresa;
    private String anoMes;
    private String mesCompetencia;
    private Integer codProduto;
    private String produto;
    private String dataRecepcao;
    private String statusArquivo;
    private String codFinalidade;
    private Long qtdeRegistros;
    private String receitaAceitos;
    private String receitaRejeitados;
    private Long aceitos;
    private Long rejeitados;
    private String issCalculado;
    private Integer numConsul;
    private String porcentRejeicao; 
    private String baseCalcApurada;
    private String valorCalcIss;
    private Long qtdRegistroBaseNegativa;
    private String valorReceitaBaseNegativa;
    
    private String percDistrIssPrestador;
    private String valorTotalReceitaPrestador;
    private String valorTotalApuracaoPrestador;
    private String percAliquotaPrestador;
    private String percDistrIssTomador;
    private String valorTotalReceitaTomador;
    private String valorTotalApuracaoTomador;
    private String percAliquotaTomador;
    private String periodoEnviado;
    private Double aceitosSemanal;
    private String dataInicial;
    private String dataFinal;
    private String indicadorTela;
       
	private ArrayList<ArquivoEmpresaISSDTO> lista = new ArrayList<ArquivoEmpresaISSDTO>();

	
	public String getAnoMesFormatado(){
		if (getAnoMes() == null || "".equals(getAnoMes().trim())) {
			return "";
		}
		
		String anoSaida = getAnoMes().substring(0, 4);
		String mesSaida = getAnoMes().substring(4);
		
		return mesSaida + "/" + anoSaida;
	}
	/**
	 * @return the codEmpresa
	 */
	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	/**
	 * @param codEmpresa the codEmpresa to set
	 */
	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	/**
	 * @return the anoBase
	 */
	public Integer getAnoBase() {
		return anoBase;
	}

	/**
	 * @param anoBase the anoBase to set
	 */
	public void setAnoBase(Integer anoBase) {
		this.anoBase = anoBase;
	}

	/**
	 * @return the mesBase
	 */
	public Integer getMesBase() {
		return mesBase;
	}

	/**
	 * @param mesBase the mesBase to set
	 */
	public void setMesBase(Integer mesBase) {
		this.mesBase = mesBase;
	}

	/**
	 * @return the descEmpresa
	 */
	public String getDescEmpresa() {
		return descEmpresa;
	}

	/**
	 * @param descEmpresa the descEmpresa to set
	 */
	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	/**
	 * @return the anoMes
	 */
	public String getAnoMes() {
		return anoMes;
	}

	/**
	 * @param anoMes the anoMes to set
	 */
	public void setAnoMes(String anoMes) {
		this.anoMes = anoMes;
	}

	/**
	 * @return the mesCompetencia
	 */
	public String getMesCompetencia() {
		return mesCompetencia;
	}

	/**
	 * @param mesCompetencia the mesCompetencia to set
	 */
	public void setMesCompetencia(String mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	/**
	 * @return the produto
	 */
	public String getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(String produto) {
		this.produto = produto;
	}

	/**
	 * @return the dataRecepcao
	 */
	public String getDataRecepcao() {
		return dataRecepcao;
	}

	/**
	 * @param dataRecepcao the dataRecepcao to set
	 */
	public void setDataRecepcao(String dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}

	/**
	 * @return the statusArquivo
	 */
	public String getStatusArquivo() {
		return statusArquivo;
	}

	/**
	 * @param statusArquivo the statusArquivo to set
	 */
	public void setStatusArquivo(String statusArquivo) {
		this.statusArquivo = statusArquivo;
	}

	/**
	 * @return the codFinalidade
	 */
	public String getCodFinalidade() {
		return codFinalidade;
	}

	/**
	 * @param codFinalidade the codFinalidade to set
	 */
	public void setCodFinalidade(String codFinalidade) {
		this.codFinalidade = codFinalidade;
	}

	/**
	 * @return the qtdeRegistros
	 */
	public Long getQtdeRegistros() {
		return qtdeRegistros;
	}

	/**
	 * @param qtdeRegistros the qtdeRegistros to set
	 */
	public void setQtdeRegistros(Long qtdeRegistros) {
		this.qtdeRegistros = qtdeRegistros;
	}

	/**
	 * @return the receitaAceitos
	 */
	public String getReceitaAceitos() {
		return receitaAceitos;
	}

	/**
	 * @param receitaAceitos the receitaAceitos to set
	 */
	public void setReceitaAceitos(String receitaAceitos) {
		this.receitaAceitos = receitaAceitos;
	}

	/**
	 * @return the receitaRejeitados
	 */
	public String getReceitaRejeitados() {
		return receitaRejeitados;
	}

	/**
	 * @param receitaRejeitados the receitaRejeitados to set
	 */
	public void setReceitaRejeitados(String receitaRejeitados) {
		this.receitaRejeitados = receitaRejeitados;
	}

	/**
	 * @return the aceitos
	 */
	public Long getAceitos() {
		return aceitos;
	}

	/**
	 * @param aceitos the aceitos to set
	 */
	public void setAceitos(Long aceitos) {
		this.aceitos = aceitos;
	}

	/**
	 * @return the rejeitados
	 */
	public Long getRejeitados() {
		return rejeitados;
	}

	/**
	 * @param rejeitados the rejeitados to set
	 */
	public void setRejeitados(Long rejeitados) {
		this.rejeitados = rejeitados;
	}

	/**
	 * @return the issCalculado
	 */
	public String getIssCalculado() {
		return issCalculado;
	}

	/**
	 * @param issCalculado the issCalculado to set
	 */
	public void setIssCalculado(String issCalculado) {
		this.issCalculado = issCalculado;
	}

	/**
	 * @return the numConsul
	 */
	public Integer getNumConsul() {
		return numConsul;
	}

	/**
	 * @param numConsul the numConsul to set
	 */
	public void setNumConsul(Integer numConsul) {
		this.numConsul = numConsul;
	}

	/**
	 * @return the lista
	 */
	public ArrayList<ArquivoEmpresaISSDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<ArquivoEmpresaISSDTO> lista) {
		this.lista = lista;
	}
	/**
	 * @return the porcentRejeicao
	 */
	public String getPorcentRejeicao() {
		return porcentRejeicao;
	}
	/**
	 * @param porcentRejeicao the porcentRejeicao to set
	 */
	public void setPorcentRejeicao(String porcentRejeicao) {
		this.porcentRejeicao = porcentRejeicao;
	}
	/**
	 * @return the baseCalcApurada
	 */
	public String getBaseCalcApurada() {
		return baseCalcApurada;
	}
	/**
	 * @param baseCalcApurada the baseCalcApurada to set
	 */
	public void setBaseCalcApurada(String baseCalcApurada) {
		this.baseCalcApurada = baseCalcApurada;
	}
	/**
	 * @return the valorCalcIss
	 */
	public String getValorCalcIss() {
		return valorCalcIss;
	}
	/**
	 * @param valorCalcIss the valorCalcIss to set
	 */
	public void setValorCalcIss(String valorCalcIss) {
		this.valorCalcIss = valorCalcIss;
	}
	/**
	 * @return the qtdRegistroBaseNegativa
	 */
	public Long getQtdRegistroBaseNegativa() {
		return qtdRegistroBaseNegativa;
	}
	/**
	 * @param qtdRegistroBaseNegativa the qtdRegistroBaseNegativa to set
	 */
	public void setQtdRegistroBaseNegativa(Long qtdRegistroBaseNegativa) {
		this.qtdRegistroBaseNegativa = qtdRegistroBaseNegativa;
	}
	/**
	 * @return the valorReceitaBaseNegativa
	 */
	public String getValorReceitaBaseNegativa() {
		return valorReceitaBaseNegativa;
	}
	/**
	 * @param valorReceitaBaseNegativa the valorReceitaBaseNegativa to set
	 */
	public void setValorReceitaBaseNegativa(String valorReceitaBaseNegativa) {
		this.valorReceitaBaseNegativa = valorReceitaBaseNegativa;
	}
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getPercDistrIssPrestador() {
		return percDistrIssPrestador;
	}
	public void setPercDistrIssPrestador(String percDistrIssPrestador) {
		this.percDistrIssPrestador = percDistrIssPrestador;
	}
	public String getValorTotalReceitaPrestador() {
		return valorTotalReceitaPrestador;
	}
	public void setValorTotalReceitaPrestador(String valorTotalReceitaPrestador) {
		this.valorTotalReceitaPrestador = valorTotalReceitaPrestador;
	}
	public String getValorTotalApuracaoPrestador() {
		return valorTotalApuracaoPrestador;
	}
	public void setValorTotalApuracaoPrestador(String valorTotalApuracaoPrestador) {
		this.valorTotalApuracaoPrestador = valorTotalApuracaoPrestador;
	}
	public String getPercAliquotaPrestador() {
		return percAliquotaPrestador;
	}
	public void setPercAliquotaPrestador(String percAliquotaPrestador) {
		this.percAliquotaPrestador = percAliquotaPrestador;
	}
	public String getPercDistrIssTomador() {
		return percDistrIssTomador;
	}
	public void setPercDistrIssTomador(String percDistrIssTomador) {
		this.percDistrIssTomador = percDistrIssTomador;
	}
	public String getValorTotalReceitaTomador() {
		return valorTotalReceitaTomador;
	}
	public void setValorTotalReceitaTomador(String valorTotalReceitaTomador) {
		this.valorTotalReceitaTomador = valorTotalReceitaTomador;
	}
	public String getValorTotalApuracaoTomador() {
		return valorTotalApuracaoTomador;
	}
	public void setValorTotalApuracaoTomador(String valorTotalApuracaoTomador) {
		this.valorTotalApuracaoTomador = valorTotalApuracaoTomador;
	}
	public String getPercAliquotaTomador() {
		return percAliquotaTomador;
	}
	public void setPercAliquotaTomador(String percAliquotaTomador) {
		this.percAliquotaTomador = percAliquotaTomador;
	}
	public void setPeriodoEnviado(String periodoEnviado) {
		this.periodoEnviado = periodoEnviado;
	}
	public String getPeriodoEnviado() {
		return periodoEnviado;
	}
	public void setAceitosSemanal(Double aceitosSemanal) {
		this.aceitosSemanal = aceitosSemanal;
	}
	public Double getAceitosSemanal() {
		return aceitosSemanal;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setIndicadorTela(String indicadorTela) {
		this.indicadorTela = indicadorTela;
	}
	public String getIndicadorTela() {
		return indicadorTela;
	}
}
