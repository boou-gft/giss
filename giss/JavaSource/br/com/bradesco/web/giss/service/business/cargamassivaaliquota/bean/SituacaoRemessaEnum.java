package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

public enum SituacaoRemessaEnum {

	CONSISTENTE_ISS_PROPRIO         (1, "Consistente - Pendente de Conferência"),
	CONFERIDA_ISS_PROPRIO           (2, "Conferida - Pendente de Aprovação"),
	APROVADA_ISS_PROPRIO            (3, "Aprovada"),
	REJEITADA_ISS_PROPRIO           (4, "Rejeitada"),
	INCONSISTENTE_ISS_PROPRIO       (9, "Inconsistente"),
	CONSISTENTE_ISS_GERENCIAL       (5, "Consistente - Pendente de Conferência"),
	CONFERIDA_ISS_GERENCIAL         (6, "Conferida - Pendente de Aprovação"),
	APROVADA_ISS_GERENCIAL          (7, "Aprovada"),
	REJEITADA_ISS_GERENCIAL         (8, "Rejeitada"),
	INCONSISTENTE_ISS_GERENCIAL     (0, "Inconsistente");
	
	private Integer codigo;
	private String descricao;
	
	/**
	 * Construtor.
	 */
	private SituacaoRemessaEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * @nome: getByCodigo
	 * @propósito: Método responsável por getByCodigo.
	 *
	 * @param codigo String
	 * @return SituacaoRemessaEnum
	 */
	public static SituacaoRemessaEnum getByCodigo(Integer codigo) {
		SituacaoRemessaEnum retorno = SituacaoRemessaEnum.CONSISTENTE_ISS_PROPRIO;
		for (SituacaoRemessaEnum item : SituacaoRemessaEnum.values()) {
			if (item.codigo.equals(codigo)) {
				retorno = item;
				break;
			}
		}
		return retorno;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @return the codigo
	 */
	public void setCodigo(Integer codigo) {
	}

	/**
	 * @return the descricao
	 */
	public void setDescricao(String descricao) {
	}
}
