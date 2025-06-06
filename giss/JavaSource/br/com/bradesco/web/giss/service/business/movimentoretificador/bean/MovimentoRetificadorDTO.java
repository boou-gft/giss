/**
 * @nome: br.com.bradesco.web.giss.service.business.movimentoretificador.bean
 *
 * Compilador: JDK 1.6
 *
 * @propósito: .
 *
 * Data da Criação: 26/03/2021
 *
 * Parâmetros de Compilação:  -d
 *
 */
package br.com.bradesco.web.giss.service.business.movimentoretificador.bean;

import java.util.Date;

import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;


/**
 * @nome: MovimentoRetificadorDTO.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class MovimentoRetificadorDTO {

	private Integer anoMesCompetencia;
	private Integer codigoEmpresa;
	private String nomeEmpresa;
	private Integer codigoProduto;
	private String nomeProduto;
	private Long quantidadeRegistro;
	private String valorIss;
	private Integer identificadorTransacaoIss;
	private Integer identificadorProcessamentoIss;
	private Integer numeroApuracaoIss;
	private Date dataRecepcao;
	
	private Integer codigoSituacaoContabil;
	private String nomeSituacaoContabil;
	private Integer codigoFinalidadeArquivo;
	private String nomeFinalidade;
	
	private Long codigoMunicipio;
	private String nomeMunicipio;
	private String valorBaseCalculoAnterior;
	private String percentualAliquotaAnterior;
	private String valorApuracaoAnterior;
	private String valorBaseCalculoAtual;
	private String percentualAliquotaAtual;
	private String valorApuracaoAtual;
	private String valorOscilacao;
	private String valorTotalCredito;
	private String valorTotalApuracao;
	
	/**
	 * Construtor.
	 */
	public MovimentoRetificadorDTO() {
		super();
	}
	
	/**
	 * @return the descricaoIdentificadorProcessamentoIss
	 */
	public String getDescricaoIdentificadorProcessamentoIss() {
		return SituacaoPagamentoEnum.getByCodigo(getIdentificadorProcessamentoIss()).getDescricao();
	}
	
	/**
	 * @return the descricaoFinalidadeArquivo
	 */
	public String getDescricaoFinalidadeArquivo() {
		return FinalidadeArquivoMovimentoEnum.getByCodigo(getCodigoFinalidadeArquivo()).getDescricao();
	}
	
	/**
	 * @return the descricaoSituacaoContabil
	 */
	public String getDescricaoSituacaoContabil() {
		return SituacaoContabilEnum.getByCodigo(getCodigoSituacaoContabil()).getDescricao();
	}
	
	/**
	 * @nome: getAnoMesCompetenciaExibicao
	 * @propósito: Método responsável por getAnoMesCompetenciaExibicao.
	 *
	 * @return String
	 */
	public String getAnoMesCompetenciaExibicao() {
		String anoMesCompetenciaExibicao = "";
		
		if (!GissUtil.isEmptyOrNull(getAnoMesCompetencia())) {
			anoMesCompetenciaExibicao = 
				DateUtils.formatMesAno(
						GissUtil.stringToInteger(GissUtil.getString(getAnoMesCompetencia()).substring(4, 6)),
						GissUtil.stringToInteger(GissUtil.getString(getAnoMesCompetencia()).substring(0, 4)));
		}
		
		return anoMesCompetenciaExibicao;
	}
	
	
	/**
	 * @return the codigoEmpresa
	 */
	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}
	
	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	
	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	/**
	 * @return the codigoProduto
	 */
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	
	/**
	 * @param codigoProduto the codigoProduto to set
	 */
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	/**
	 * @return the nomeProduto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	/**
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	/**
	 * @return the quantidadeRegistro
	 */
	public Long getQuantidadeRegistro() {
		return quantidadeRegistro;
	}
	
	/**
	 * @param quantidadeRegistro the quantidadeRegistro to set
	 */
	public void setQuantidadeRegistro(Long quantidadeRegistro) {
		this.quantidadeRegistro = quantidadeRegistro;
	}
	
	/**
	 * @return the valorIss
	 */
	public String getValorIss() {
		return valorIss;
	}
	
	/**
	 * @param valorIss the valorIss to set
	 */
	public void setValorIss(String valorIss) {
		this.valorIss = valorIss;
	}

	/**
	 * @return the anoMesCompetencia
	 */
	public Integer getAnoMesCompetencia() {
		return anoMesCompetencia;
	}

	/**
	 * @param anoMesCompetencia the anoMesCompetencia to set
	 */
	public void setAnoMesCompetencia(Integer anoMesCompetencia) {
		this.anoMesCompetencia = anoMesCompetencia;
	}

	/**
	 * @return the identificadorTransacaoIss
	 */
	public Integer getIdentificadorTransacaoIss() {
		return identificadorTransacaoIss;
	}

	/**
	 * @param identificadorTransacaoIss the identificadorTransacaoIss to set
	 */
	public void setIdentificadorTransacaoIss(Integer identificadorTransacaoIss) {
		this.identificadorTransacaoIss = identificadorTransacaoIss;
	}

	/**
	 * @return the numeroApuracaoIss
	 */
	public Integer getNumeroApuracaoIss() {
		return numeroApuracaoIss;
	}

	/**
	 * @param numeroApuracaoIss the numeroApuracaoIss to set
	 */
	public void setNumeroApuracaoIss(Integer numeroApuracaoIss) {
		this.numeroApuracaoIss = numeroApuracaoIss;
	}

	/**
	 * @return the dataRecepcao
	 */
	public Date getDataRecepcao() {
		return dataRecepcao;
	}

	/**
	 * @param dataRecepcao the dataRecepcao to set
	 */
	public void setDataRecepcao(Date dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}

	/**
	 * @return the identificadorProcessamentoIss
	 */
	public Integer getIdentificadorProcessamentoIss() {
		return identificadorProcessamentoIss;
	}

	/**
	 * @param identificadorProcessamentoIss the identificadorProcessamentoIss to set
	 */
	public void setIdentificadorProcessamentoIss(
			Integer identificadorProcessamentoIss) {
		this.identificadorProcessamentoIss = identificadorProcessamentoIss;
	}

	/**
	 * @return the codigoMunicipio
	 */
	public Long getCodigoMunicipio() {
		return codigoMunicipio;
	}

	/**
	 * @param codigoMunicipio the codigoMunicipio to set
	 */
	public void setCodigoMunicipio(Long codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	/**
	 * @return the nomeMunicipio
	 */
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	/**
	 * @param nomeMunicipio the nomeMunicipio to set
	 */
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	/**
	 * @return the valorBaseCalculoAnterior
	 */
	public String getValorBaseCalculoAnterior() {
		return valorBaseCalculoAnterior;
	}

	/**
	 * @param valorBaseCalculoAnterior the valorBaseCalculoAnterior to set
	 */
	public void setValorBaseCalculoAnterior(String valorBaseCalculoAnterior) {
		this.valorBaseCalculoAnterior = valorBaseCalculoAnterior;
	}

	/**
	 * @return the percentualAliquotaAnterior
	 */
	public String getPercentualAliquotaAnterior() {
		return percentualAliquotaAnterior;
	}

	/**
	 * @param percentualAliquotaAnterior the percentualAliquotaAnterior to set
	 */
	public void setPercentualAliquotaAnterior(String percentualAliquotaAnterior) {
		this.percentualAliquotaAnterior = percentualAliquotaAnterior;
	}

	/**
	 * @return the valorApuracaoAnterior
	 */
	public String getValorApuracaoAnterior() {
		return valorApuracaoAnterior;
	}

	/**
	 * @param valorApuracaoAnterior the valorApuracaoAnterior to set
	 */
	public void setValorApuracaoAnterior(String valorApuracaoAnterior) {
		this.valorApuracaoAnterior = valorApuracaoAnterior;
	}

	/**
	 * @return the valorBaseCalculoAtual
	 */
	public String getValorBaseCalculoAtual() {
		return valorBaseCalculoAtual;
	}

	/**
	 * @param valorBaseCalculoAtual the valorBaseCalculoAtual to set
	 */
	public void setValorBaseCalculoAtual(String valorBaseCalculoAtual) {
		this.valorBaseCalculoAtual = valorBaseCalculoAtual;
	}

	/**
	 * @return the percentualAliquotaAtual
	 */
	public String getPercentualAliquotaAtual() {
		return percentualAliquotaAtual;
	}

	/**
	 * @param percentualAliquotaAtual the percentualAliquotaAtual to set
	 */
	public void setPercentualAliquotaAtual(String percentualAliquotaAtual) {
		this.percentualAliquotaAtual = percentualAliquotaAtual;
	}

	/**
	 * @return the valorApuracaoAtual
	 */
	public String getValorApuracaoAtual() {
		return valorApuracaoAtual;
	}

	/**
	 * @param valorApuracaoAtual the valorApuracaoAtual to set
	 */
	public void setValorApuracaoAtual(String valorApuracaoAtual) {
		this.valorApuracaoAtual = valorApuracaoAtual;
	}

	/**
	 * @return the valorOscilacao
	 */
	public String getValorOscilacao() {
		return valorOscilacao;
	}

	/**
	 * @param valorOscilacao the valorOscilacao to set
	 */
	public void setValorOscilacao(String valorOscilacao) {
		this.valorOscilacao = valorOscilacao;
	}

	/**
	 * @return the codigoSituacaoContabil
	 */
	public Integer getCodigoSituacaoContabil() {
		return codigoSituacaoContabil;
	}

	/**
	 * @param codigoSituacaoContabil the codigoSituacaoContabil to set
	 */
	public void setCodigoSituacaoContabil(Integer codigoSituacaoContabil) {
		this.codigoSituacaoContabil = codigoSituacaoContabil;
	}

	/**
	 * @return the codigoFinalidadeArquivo
	 */
	public Integer getCodigoFinalidadeArquivo() {
		return codigoFinalidadeArquivo;
	}

	/**
	 * @param codigoFinalidadeArquivo the codigoFinalidadeArquivo to set
	 */
	public void setCodigoFinalidadeArquivo(Integer codigoFinalidadeArquivo) {
		this.codigoFinalidadeArquivo = codigoFinalidadeArquivo;
	}

	/**
	 * @return the nomeSituacaoContabil
	 */
	public String getNomeSituacaoContabil() {
		return nomeSituacaoContabil;
	}

	/**
	 * @param nomeSituacaoContabil the nomeSituacaoContabil to set
	 */
	public void setNomeSituacaoContabil(String nomeSituacaoContabil) {
		this.nomeSituacaoContabil = nomeSituacaoContabil;
	}

	/**
	 * @return the nomeFinalidade
	 */
	public String getNomeFinalidade() {
		return nomeFinalidade;
	}

	/**
	 * @param nomeFinalidade the nomeFinalidade to set
	 */
	public void setNomeFinalidade(String nomeFinalidade) {
		this.nomeFinalidade = nomeFinalidade;
	}

	/**
	 * @return the valorTotalCredito
	 */
	public String getValorTotalCredito() {
		return valorTotalCredito;
	}

	/**
	 * @param valorTotalCredito the valorTotalCredito to set
	 */
	public void setValorTotalCredito(String valorTotalCredito) {
		this.valorTotalCredito = valorTotalCredito;
	}

	/**
	 * @return the valorTotalApuracao
	 */
	public String getValorTotalApuracao() {
		return valorTotalApuracao;
	}

	/**
	 * @param valorTotalApuracao the valorTotalApuracao to set
	 */
	public void setValorTotalApuracao(String valorTotalApuracao) {
		this.valorTotalApuracao = valorTotalApuracao;
	}
	
}
