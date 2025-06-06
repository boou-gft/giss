package br.com.bradesco.web.giss.service.business.apuracaomensaldiferenciada;

public class ConsultarMunicipiosApuracaoMensalDiferenciadaDTO {
	
	private int linha;
	private String codigo;
	private String nome;
	private String uf;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

}
