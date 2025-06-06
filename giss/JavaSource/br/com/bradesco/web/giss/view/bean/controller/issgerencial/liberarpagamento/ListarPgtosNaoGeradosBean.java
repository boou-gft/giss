package br.com.bradesco.web.giss.view.bean.controller.issgerencial.liberarpagamento;


import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * @nome: ListarPgtosNaoGeradosBean.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ListarPgtosNaoGeradosBean {
	
	private static final long serialVersionUID = 1L;
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO = "liberarPagto";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_RETIFICADO = "liberarPagtoIssRetificado";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE = "pgtosNaoGerados";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE_RETIFICADO = "pgtosNaoGeradosRetificado";
	private static final String PLANILHA_LIBERAR_PAGAMENTO = "PGTOS_SEM_DADOS_BANC";
	private static final String PLANILHA_LIBERAR_PAGAMENTO_RETIFICADO = "PGTOS_SEM_DADOS_BANC_RET";
	
	private LiberarPagtoISSDTO dto = new LiberarPagtoISSDTO();
	private Boolean exibirMovimentoRetificacao;
	
	/**
	 * @nome: inicializar
	 * @prop�sito: M�todo respons�vel por inicializar.
	 *
	 * @param parametro LiberarPagtoISSDTO
	 * @param exibirMovimentoRetificacao Boolean
	 * @return String
	 */
	public String inicializar(LiberarPagtoISSDTO parametro, Boolean exibirMovimentoRetificacao) {
		dto = new LiberarPagtoISSDTO();
		dto = parametro;
		setExibirMovimentoRetificacao(exibirMovimentoRetificacao);
		return navegarDetalhe();
	}
	
	/**
	 * @nome: voltar
	 * @prop�sito: M�todo respons�vel por voltar.
	 *
	 * @return
	 */
	public String voltar() {
		return navegarConsulta();
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @prop�sito: M�todo respons�vel por imprimirPlanilha.
	 *
	 * @return
	 */
	public String imprimirPlanilha() {
		try {
			if(dto.getLista().size() > 0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha dos valores apurados de munic�pios sem dados banc�rios ", gerarNomePlanilha());
				exportarPlanilha.planilhaPgtosNaoGerados(dto.getLista());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista Valores apurados de munic�pios sem dados banc�rios vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: navegarConsulta
	 * @prop�sito: M�todo respons�vel por navegarConsulta.
	 *
	 * @return String
	 */
	private String navegarConsulta() {
		if (getExibirMovimentoRetificacao()) {
			return NAVEGACAO_LIBERAR_PAGAMENTO_RETIFICADO;
		} else {
			return NAVEGACAO_LIBERAR_PAGAMENTO;
		}
	}
	
	/**
	 * @nome: navegarDetalhe
	 * @prop�sito: M�todo respons�vel por navegarDetalhe.
	 *
	 * @return String
	 */
	private String navegarDetalhe() {
		if (getExibirMovimentoRetificacao()) {
			return NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE_RETIFICADO;
		} else {
			return NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE;
		}
	}
	
	/**
	 * @nome: gerarNomePlanilha
	 * @prop�sito: M�todo respons�vel por gerarNomePlanilha.
	 *
	 * @return String
	 */
	private String gerarNomePlanilha() {
		if (getExibirMovimentoRetificacao()) {
			return PLANILHA_LIBERAR_PAGAMENTO_RETIFICADO;
		} else {
			return PLANILHA_LIBERAR_PAGAMENTO;
		}
	}

	/**
	 * @nome: exportarTxt
	 * @prop�sito: M�todo respons�vel por exportarTxt.
	 *
	 * @return String
	 */
	public String exportarTxt(){
		return "";
	}

	/**
	 * @return the dto
	 */
	public LiberarPagtoISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(LiberarPagtoISSDTO dto) {
		this.dto = dto;
	}

	/**
	 * @return the exibirMovimentoRetificacao
	 */
	public Boolean getExibirMovimentoRetificacao() {
		return exibirMovimentoRetificacao;
	}

	/**
	 * @param exibirMovimentoRetificacao the exibirMovimentoRetificacao to set
	 */
	public void setExibirMovimentoRetificacao(Boolean exibirMovimentoRetificacao) {
		this.exibirMovimentoRetificacao = exibirMovimentoRetificacao;
	}
}