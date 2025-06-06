package br.com.bradesco.web.giss.service.business.balancetesfiscalizacoesiss.bean;

import java.util.ArrayList;
import java.util.List;

public class ListarBalancetesSaidaDTO {
	
	private Integer codEmpresa;
    private String descEmpresa;
    private Long cpfCnpj;
    private Integer controle;
    private Integer filial;
    private Integer codGrupoInicio;
    private Integer codGrupoFim;
    private String codNivelConta;
    private String descDependencia;
    private String descMunicipio;
    private String siglaUf;
    private String codTipoBalancete;
    private List<ListarBalancetesOcorrenciasSaidaDTO> listarBalancetesOcorrencias = new ArrayList<ListarBalancetesOcorrenciasSaidaDTO>();
    
	public ListarBalancetesSaidaDTO() {
	
	}

	public ListarBalancetesSaidaDTO(Integer codEmpresa, String descEmpresa, Long cpfCnpj, Integer controle, Integer filial, Integer codGrupoInicio, Integer codGrupoFim, String codNivelConta, String descDependencia, String descMunicipio, String siglaUf, String codTipoBalancete) {
		this.codEmpresa = codEmpresa;
		this.descEmpresa = descEmpresa;
		this.cpfCnpj = cpfCnpj;
		this.controle = controle;
		this.filial = filial;
		this.codGrupoInicio = codGrupoInicio;
		this.codGrupoFim = codGrupoFim;
		this.codNivelConta = codNivelConta;
		this.descDependencia = descDependencia;
		this.descMunicipio = descMunicipio;
		this.siglaUf = siglaUf;
		this.codTipoBalancete = codTipoBalancete;
	}

	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getDescEmpresa() {
		return descEmpresa;
	}

	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}

	public Long getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Long cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Integer getControle() {
		return controle;
	}

	public void setControle(Integer controle) {
		this.controle = controle;
	}

	public Integer getFilial() {
		return filial;
	}

	public void setFilial(Integer filial) {
		this.filial = filial;
	}

	public List<ListarBalancetesOcorrenciasSaidaDTO> getListarBalancetesOcorrencias() {
		return listarBalancetesOcorrencias;
	}

	public void setListarBalancetesOcorrencias(
			List<ListarBalancetesOcorrenciasSaidaDTO> listarBalancetesOcorrencias) {
		this.listarBalancetesOcorrencias = listarBalancetesOcorrencias;
	}

	public Integer getCodGrupoInicio() {
		return codGrupoInicio;
	}

	public void setCodGrupoInicio(Integer codGrupoInicio) {
		this.codGrupoInicio = codGrupoInicio;
	}

	public Integer getCodGrupoFim() {
		return codGrupoFim;
	}

	public void setCodGrupoFim(Integer codGrupoFim) {
		this.codGrupoFim = codGrupoFim;
	}

	public String getCodNivelConta() {
		return codNivelConta;
	}

	public void setCodNivelConta(String codNivelConta) {
		this.codNivelConta = codNivelConta;
	}

	public String getDescDependencia() {
		return descDependencia;
	}

	public void setDescDependencia(String descDependencia) {
		this.descDependencia = descDependencia;
	}

	public String getDescMunicipio() {
		return descMunicipio;
	}

	public void setDescMunicipio(String descMunicipio) {
		this.descMunicipio = descMunicipio;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getCodTipoBalancete() {
		return codTipoBalancete;
	}

	public void setCodTipoBalancete(String codTipoBalancete) {
		this.codTipoBalancete = codTipoBalancete;
	}
}