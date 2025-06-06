package br.com.bradesco.web.giss.view.bean.controller.ajuda;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.ajuda.bean.AjudaVersaoSistemaDTO;

public class AjudaVersaoSistemaBean {

	private boolean exibirTodas;

	private String labelVersaoRodape;

	private List<AjudaVersaoSistemaDTO> atualizacoes = new ArrayList<AjudaVersaoSistemaDTO>();

	public String init() {
		this.exibirTodas = false;
		listarAtualizacoes();
		return "ajuda";
	}

	public void listarTodas() {
		this.exibirTodas = true;
	}

	public void listarUltima() {
		this.exibirTodas = false;
	}
	
	private Map<String, String> obterTelasECodigos() {
		Map<String, String> telas = new HashMap<String, String>();
		telas.put("/incluirTipoServico.jsf", "GISSC001");
		telas.put("/ajuda.jsf", "GISSC003");
		telas.put("/presHome.jsf", "GISSC004");
		
		return telas;
	}
	
	private String obterCodigoPorTela() {
		Map<String, String> telas = obterTelasECodigos();
		
		String codigoTela = telas.get(getTelaAtual());
		if (codigoTela == null) {
			return "";
		}
		
		return codigoTela;
	}

	public String getLabelVersaoAtualPagina() {
		listarAtualizacoes();
		this.labelVersaoRodape = "";		
		String codigoTela = obterCodigoPorTela();
		
		if (codigoTela == "") {
			return "";
		}
		
		for (AjudaVersaoSistemaDTO atualizacao : this.atualizacoes) {
			for (String tela : atualizacao.getTelas()) {
				if (tela.equalsIgnoreCase(codigoTela)) {
					return this.labelVersaoRodape = codigoTela + " - Última atualização: " + atualizacao.getDataAtualizacao();
				}
			}
		}
		
		return "";
	}

	public AjudaVersaoSistemaDTO getUltimaAtualizacao() {
		return buscarUltimaAtualizacao();
	}
	
	public String getTelaAtual() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestServletPath();
	}

	private AjudaVersaoSistemaDTO buscarUltimaAtualizacao() {
		return !atualizacoes.isEmpty() ? atualizacoes.get(0) : null;
	}

	private void listarAtualizacoes() {
		this.atualizacoes.clear();

		FileReader arquivoJson = null;
		
		try {
			JSONParser parser = new JSONParser();
			arquivoJson = obterArquivoPeloCaminho();

			JSONArray atualizacoesJson = (JSONArray) parser.parse(arquivoJson);

			for (Object obj : atualizacoesJson) {
				JSONObject atualizacao = (JSONObject) obj;
				this.atualizacoes.add(new AjudaVersaoSistemaDTO(atualizacao));
			}

			Collections.sort(this.atualizacoes);
		} catch (Exception e) {
			BradescoFacesUtils
					.addErrorModalMessage("Atualização não disponível");
		}
		
		finally {
			if (arquivoJson != null) {
				try {
					arquivoJson.close();
				} catch (IOException e) {
					BradescoFacesUtils.addErrorModalMessage("Erro ao obter Arquivo pelo caminho.");
				}
			}
		}
	}

	private FileReader obterArquivoPeloCaminho() throws FileNotFoundException {
		ClassLoader cl = getClass().getClassLoader();
		return new FileReader(cl.getResource("/br/com/bradesco/web/giss/view/bean/controller/ajuda/historico-atualizacao.json").getFile());
	}

	public boolean isExibirTodas() {
		return exibirTodas;
	}

	public void setExibirTodas(boolean exibirTodas) {
		this.exibirTodas = exibirTodas;
	}

	public List<AjudaVersaoSistemaDTO> getAtualizacoes() {
		return atualizacoes;
	}

	public void setAtualizacoes(List<AjudaVersaoSistemaDTO> atualizacoes) {
		this.atualizacoes = atualizacoes;
	}

	public String sendToHome() {
		return "presHome";
	}
	
	public String getLabelVersaoRodape() {
		return labelVersaoRodape;
	}

	public void setLabelVersaoRodape(String labelVersaoRodape) {
		this.labelVersaoRodape = labelVersaoRodape;
	}

}
