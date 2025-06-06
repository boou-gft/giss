package br.com.bradesco.web.giss.utils;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Formata Tabelas em formato texto.
 * 
 * Utilizar os metodos add para adicionar as celulas, e quebraLinha() para indicar a troca de linha.
 * 
 * @author renato.mariscal
 */
public class TabelaTxt {
	public enum Alinhamento{ESQUERDA,DIREITA};
	private int coluna=0;
	private int linha=0;
	private List<List<String>> dados =new ArrayList<List<String>>();
	private List<String> linhaAtual;
	private List<Alinhamento> alinhamentoAtual;
	public String separador="   ";
	public String quebraLinha="\r\n";
	private static final String ESPACOS="                                                                                                    ";
	
	private List<List<Alinhamento>> alinhamentos=new ArrayList<List<Alinhamento>>();
	private List<Integer> tamanhos=new ArrayList<Integer>();
	
	/**
	 * Construtor Padrao
	 *
	 */
	public TabelaTxt() {
		linhaAtual=new ArrayList<String>();
		alinhamentoAtual=new ArrayList<Alinhamento>();
		dados.add(linhaAtual);
		alinhamentos.add(alinhamentoAtual);
	}
	
	/**
	 * Adiciona uma celula de String com alinhamento a Esquerda
	 * @param valor
	 */
	public void add(String valor){
		if(valor==null)valor="";
		add(valor,Alinhamento.ESQUERDA);
	}

	/**
	 * Adiciona uma celula numerica com alinhamento a direita
	 * @param valor
	 */
	public void add(int valor){
		add(String.valueOf(valor),Alinhamento.DIREITA);
	}

	
	/**
	 * Adiciona uma celula de String com alinhamento especificado
	 * @param valor
	 */
	public void add(String valor,Alinhamento alinhamento){
		linhaAtual.add(valor);
		alinhamentoAtual.add(alinhamento);
		if(coluna==tamanhos.size()){
			tamanhos.add(valor.length());
		}else if (tamanhos.get(coluna)<valor.length()){
			tamanhos.set(coluna, valor.length());
		}
		coluna++;
	}

	/**
	 * Adiciona uma celula numerica com alinhamento especificado
	 * @param valor
	 * @param alinhamento
	 */
	public void add(int valor, Alinhamento alinhamento) {
		add(String.valueOf(valor),alinhamento);
	}

	
	/**
	 * Quebra a linha da tabela (indicacao de nova linha)
	 */
	public void quebraLinha(){
		coluna=0;
		linha+=1;
		
		linhaAtual=new ArrayList<String>();
		alinhamentoAtual=new ArrayList<Alinhamento>();
		dados.add(linhaAtual);
		alinhamentos.add(alinhamentoAtual);
	}
	
	/**
	 * Gera o TXT da tabela dentro do StringBuffer recebido.
	 * @param osw
	 * @throws IOException 
	 */
	public void geraTxt(OutputStreamWriter osw) throws IOException{
		int qtdColunas=tamanhos.size();
		int qtdLinhas=dados.size();
		for(int l=0;l<qtdLinhas;l++){
			List<String> lin = dados.get(l);
			List<Alinhamento> ali = alinhamentos.get(l);
			for(int c=0;c<qtdColunas;c++){
				if(c<lin.size()){
					format(osw, lin.get(c),ali.get(c),tamanhos.get(c));
				}else{
					format(osw, "",Alinhamento.ESQUERDA,tamanhos.get(c));
				}
				if(c<qtdColunas-1){
					osw.append(separador);
				}
			}
			if(l<qtdLinhas-1){
				osw.append(quebraLinha);
			}
		}
	}
	
	/*
	 * Formata a celula
	 */
	private void format(OutputStreamWriter osw,String valor,Alinhamento alinhamento, int tamanho) throws IOException{
		String esp = ESPACOS.substring(0,tamanho-valor.length());
		if(alinhamento==Alinhamento.DIREITA){
			osw.append(esp);
		}
		osw.append(valor);
		if(alinhamento==Alinhamento.ESQUERDA){
			osw.append(esp);
		}
	}

}
