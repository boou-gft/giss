package br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean;

import java.util.Date;

public class UsuarioRemessaAliquotaDTO {

	private String codigo;
	private Date data;
	
	
	public UsuarioRemessaAliquotaDTO(String codigo, Date data) {
		super();
		this.codigo = codigo;
		this.data = data;
	}

	
	public String getCodigo() {
		return codigo;
	}

	public Date getData() {
		return data;
	}
}
