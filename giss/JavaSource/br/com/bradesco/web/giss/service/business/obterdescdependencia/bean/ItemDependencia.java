package br.com.bradesco.web.giss.service.business.obterdescdependencia.bean;

/**
 * @author Gian 
 */
public class ItemDependencia {

	private static final long serialVersionUID = 1L;

	private Long codEmpresa;
	private Integer codDependencia;
	private String desDependencia;
	private Integer numSeqDependencia;
	
	
	public Long getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public Integer getCodDependencia() {
		return codDependencia;
	}
	public void setCodDependencia(Integer codDependencia) {
		this.codDependencia = codDependencia;
	}
	public String getDesDependencia() {
		return desDependencia;
	}
	public void setDesDependencia(String desDependencia) {
		this.desDependencia = desDependencia;
	}
	public Integer getNumSeqDependencia() {
		return numSeqDependencia;
	}
	public void setNumSeqDependencia(Integer numSeqDependencia) {
		this.numSeqDependencia = numSeqDependencia;
	}
}
