package br.com.bradesco.web.giss.view.bean.controller.issgerencial.liberarpagamento;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

/**
 * @nome: ListarPgtosNaoElegiveisBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ListarPgtosNaoElegiveisBean {

	private static final long serialVersionUID = 1L;
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO = "liberarPagto";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_RETIFICADO = "liberarPagtoIssRetificado";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE = "consultarNaoElegiveis";
	private static final String NAVEGACAO_LIBERAR_PAGAMENTO_DETALHE_RETIFICADO = "consultarNaoElegiveisRetificado";
	private static final String PLANILHA_LIBERAR_PAGAMENTO = "MUNIC_NAO_ELEGIVEIS";
	private static final String PLANILHA_LIBERAR_PAGAMENTO_RETIFICADO = "MUNIC_NAO_ELEGIVEIS_RET";
	
	private LiberarPagtoISSDTO dto = new LiberarPagtoISSDTO();
	private Boolean exibirMovimentoRetificacao;
	
	/**
	 * @nome: iniciarTela
	 * @propósito: Método responsável por iniciarTela.
	 *
	 * @param parametro LiberarPagtoISSDTO
	 * @param exibirMovimentoRetificacao Boolean
	 * @return String
	 */
	public String iniciarTela(LiberarPagtoISSDTO parametro, Boolean exibirMovimentoRetificacao) {
		dto = new LiberarPagtoISSDTO();
		dto = parametro;
		setExibirMovimentoRetificacao(exibirMovimentoRetificacao);
		return navegarDetalhe();
	}

	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @return
	 */
	public String imprimirPlanilha() {
		try {
			if(dto.getLista().size() > 0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha dos valores apurados de municípios não elegíveis para pagamento", gerarNomePlanilha());
				exportarPlanilha.planilhaPgtosNaoElegiveis(dto.getLista());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista de Valores apurados de municípios não elegíveis para pagamento vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: voltar
	 * @propósito: Método responsável por voltar.
	 *
	 * @return String
	 */
	public String voltar(){
		return navegarConsulta();
	}
	
	/**
	 * @nome: navegarConsulta
	 * @propósito: Método responsável por navegarConsulta.
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
	 * @propósito: Método responsável por navegarDetalhe.
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
	 * @propósito: Método responsável por gerarNomePlanilha.
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