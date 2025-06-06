package br.com.bradesco.web.giss.service.business.apuracaorep.bean;

public class ConsultaDetalhadaSaidaDTO {
	
	private String Mensagem;
	private String codMensagem;
    private String receitaTotalMunicipioSinal;
    private Double receitaTotalMunicipioValor;
    private String issTotalMunicipioSinal;
    private Double issTotalMunicipioValor;
    private String receitaTotalGeralSinal;
    private Double receitaTotalGeralValor;
    private String issTotalGeralSinal;
    private Double issTotalGeralValor;
    private Integer numConsultas; 
    private Long codPessoa;
    private Integer numSequencial;
    private Integer dataApuracao;
    private String dependencia;
    private String descricao;
    private String receitaSinal;
    private Double receitaValor;
    private String issSinal;
    private Double issValor;
    private int linha;
	
    public ConsultaDetalhadaSaidaDTO() {
		// TODO Auto-generated constructor stub
	}
    
    
    public ConsultaDetalhadaSaidaDTO(String receitaTotalMunicipioSinal, Double receitaTotalMunicipioValor, String issTotalMunicipioSinal, Double issTotalMunicipioValor, String receitaTotalGeralSinal, Double receitaTotalGeralValor, String issTotalGeralSinal, Double issTotalGeralValor, Integer numConsultas, Long codPessoa, Integer numSequencial, Integer dataApuracao, String dependencia, String descricao, String receitaSinal, Double receitaValor, String issSinal, Double issValor, int linha) {
		super();
		this.receitaTotalMunicipioSinal = receitaTotalMunicipioSinal;
		this.linha = linha;
		this.receitaTotalMunicipioValor = receitaTotalMunicipioValor;
		this.issTotalMunicipioSinal = issTotalMunicipioSinal;
		this.issTotalMunicipioValor = issTotalMunicipioValor;
		this.receitaTotalGeralSinal = receitaTotalGeralSinal;
		this.receitaTotalGeralValor = receitaTotalGeralValor;
		this.issTotalGeralSinal = issTotalGeralSinal;
		this.issTotalGeralValor = issTotalGeralValor;
		this.numConsultas = numConsultas;
		this.codPessoa = codPessoa;
		this.numSequencial = numSequencial;
		this.dataApuracao = dataApuracao;
		this.dependencia = dependencia;
		this.descricao = descricao;
		this.receitaSinal = receitaSinal;
		this.receitaValor = receitaValor;
		this.issSinal = issSinal;
		this.issValor = issValor;
	}
	public String getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(String codMensagem) {
		this.codMensagem = codMensagem;
	}
	public Long getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}
	public Integer getDataApuracao() {
		return dataApuracao;
	}
	public void setDataApuracao(Integer dataApuracao) {
		this.dataApuracao = dataApuracao;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIssSinal() {
		return issSinal;
	}
	public void setIssSinal(String issSinal) {
		this.issSinal = issSinal;
	}
	public String getIssTotalGeralSinal() {
		return issTotalGeralSinal;
	}
	public void setIssTotalGeralSinal(String issTotalGeralSinal) {
		this.issTotalGeralSinal = issTotalGeralSinal;
	}
	public Double getIssTotalGeralValor() {
		return issTotalGeralValor;
	}
	public void setIssTotalGeralValor(Double issTotalGeralValor) {
		this.issTotalGeralValor = issTotalGeralValor;
	}
	public String getIssTotalMunicipioSinal() {
		return issTotalMunicipioSinal;
	}
	public void setIssTotalMunicipioSinal(String issTotalMunicipioSinal) {
		this.issTotalMunicipioSinal = issTotalMunicipioSinal;
	}
	public Double getIssTotalMunicipioValor() {
		return issTotalMunicipioValor;
	}
	public void setIssTotalMunicipioValor(Double issTotalMunicipioValor) {
		this.issTotalMunicipioValor = issTotalMunicipioValor;
	}
	public Double getIssValor() {
		return issValor;
	}
	public void setIssValor(Double issValor) {
		this.issValor = issValor;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	public Integer getNumConsultas() {
		return numConsultas;
	}
	public void setNumConsultas(Integer numConsultas) {
		this.numConsultas = numConsultas;
	}
	public Integer getNumSequencial() {
		return numSequencial;
	}
	public void setNumSequencial(Integer numSequencial) {
		this.numSequencial = numSequencial;
	}
	public String getReceitaSinal() {
		return receitaSinal;
	}
	public void setReceitaSinal(String receitaSinal) {
		this.receitaSinal = receitaSinal;
	}
	public String getReceitaTotalGeralSinal() {
		return receitaTotalGeralSinal;
	}
	public void setReceitaTotalGeralSinal(String receitaTotalGeralSinal) {
		this.receitaTotalGeralSinal = receitaTotalGeralSinal;
	}
	public Double getReceitaTotalGeralValor() {
		return receitaTotalGeralValor;
	}
	public void setReceitaTotalGeralValor(Double receitaTotalGeralValor) {
		this.receitaTotalGeralValor = receitaTotalGeralValor;
	}
	public String getReceitaTotalMunicipioSinal() {
		return receitaTotalMunicipioSinal;
	}
	public void setReceitaTotalMunicipioSinal(String receitaTotalMunicipioSinal) {
		this.receitaTotalMunicipioSinal = receitaTotalMunicipioSinal;
	}
	public Double getReceitaTotalMunicipioValor() {
		return receitaTotalMunicipioValor;
	}
	public void setReceitaTotalMunicipioValor(Double receitaTotalMunicipioValor) {
		this.receitaTotalMunicipioValor = receitaTotalMunicipioValor;
	}
	public Double getReceitaValor() {
		return receitaValor;
	}
	public void setReceitaValor(Double receitaValor) {
		this.receitaValor = receitaValor;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
    
    
	

}
