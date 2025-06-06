package br.com.bradesco.web.giss.service.business.ajuda.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AjudaVersaoSistemaDTO implements Comparable<AjudaVersaoSistemaDTO> {

	private String versao;
	private String dataAtualizacao;
	private List<String> descricoes = new ArrayList<String>();
	private List<String> telas = new ArrayList<String>();

	public AjudaVersaoSistemaDTO() {
	}

	public AjudaVersaoSistemaDTO(String versao, String dataAtualizacao,
			List<String> descricoes, List<String> telas) {
		this.versao = versao;
		this.dataAtualizacao = dataAtualizacao;
		this.descricoes = descricoes;
		this.telas = telas;
	}

	public AjudaVersaoSistemaDTO(JSONObject atualizacao) {
		this.versao = (String) atualizacao.get("versao");
		this.dataAtualizacao = (String) atualizacao.get("data");

		JSONArray descricaoArray = (JSONArray) atualizacao.get("descricao");
		for (Object descricao : descricaoArray) {
			this.descricoes.add((String) descricao);			
		}

		JSONArray telasArray = (JSONArray) atualizacao.get("telas");
		for (Object tela : telasArray) {
			this.telas.add((String) tela);			
		}
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public List<String> getDescricoes() {
		return descricoes;
	}

	public void setDescricoes(List<String> descricoes) {
		this.descricoes = descricoes;
	}

	public List<String> getTelas() {
		return telas;
	}

	public void setTelas(List<String> telas) {
		this.telas = telas;
	}

	public int compareTo(AjudaVersaoSistemaDTO o) {
		if (this.dataAtualizacao == null || o.getDataAtualizacao() == null) {
			return 0;
		}
		
		try {
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(this.dataAtualizacao);
			Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o.getDataAtualizacao());
			
			return date2.compareTo(date1);
		} catch (ParseException e) {
			return 0;
		}
	}
}
