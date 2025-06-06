package br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.OcorrenciaApuracaoIssDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssAllDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.RelatorioApuracaoIssDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.Formatacao;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.utils.TabelaTxt;
import br.com.bradesco.web.giss.utils.TabelaTxt.Alinhamento;

/**
 * Gera o relatorio em TXT
 * 
 * @author Renato Mariscal
 */
public class PlanilhaApuracaoIssAllReportTXT {
	private List<RelatorioApuracaoIssAllDTO> relatorioApuracaoIssAllDTO;
	private RelatorioApuracaoIssDTO relatorioApuracaoIssOneDTO;

	private OutputStreamWriter osw;
	private Boolean razaoExiste = true;
	private Boolean aberturaConta = false;


	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssAllDTO
	 */
	public PlanilhaApuracaoIssAllReportTXT(List<RelatorioApuracaoIssAllDTO> relatorioApuracaoIssDTO,OutputStream out, Boolean aberturaConta) {
		this.relatorioApuracaoIssAllDTO = relatorioApuracaoIssDTO;
		this.osw = new OutputStreamWriter(out);
		setAberturaConta(aberturaConta);
	}
	
	/**
	 * Gera o documento
	 * @throws IOException 
	 */
	public void gerar() throws ReportException, IOException {

		for(RelatorioApuracaoIssAllDTO dto  : relatorioApuracaoIssAllDTO){
			for (int i = 0; i < dto.getApuracoesMesAno().size(); i++) {
				relatorioApuracaoIssOneDTO = dto.getApuracoesMesAno().get(i);

				if (relatorioApuracaoIssOneDTO.getCodigoGrupo() <= 0 || relatorioApuracaoIssOneDTO.getCodigoSubgrupo() <= 0) {
					razaoExiste = false;
				} else {
					razaoExiste = true;
				}

				montarCabecalho(i);
				montarDescricaoDemonstrativo();
				montarCabecalhoTabela();
				montarTabela(dto);
			}
			novaLinha();
			novaLinha();
			novaLinha();
			novaLinha();
			novaLinha();
		}
//		montarTotalGeralFinal(relatorioApuracaoIssAllDTO);
		
		montarRodape();
		try {
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT",e);
		}
	}

	private void write(String s) throws IOException{
		osw.append(s);
	}

	private void write(Number i) throws IOException {
		write(String.valueOf(i));
	}

	private void novaLinha() throws IOException{
		osw.append("\r\n");
	}

	/*
	 * Monta o cabecalho do relatorio
	 */
	private void montarCabecalho(int i)throws ReportException{
		try {
			if(i>0){
				novaLinha();
				novaLinha();
				novaLinha();
				novaLinha();
				novaLinha();
			}
			write("Planilha de Apuração do I.S.S.");
			novaLinha();

			write("BANCO BRADESCO S.A.");
			novaLinha();

			write(Formatacao.formataSpacesDireita("AGENCIA: " + relatorioApuracaoIssOneDTO.getCodAgenciaDev() + "/" + relatorioApuracaoIssOneDTO.getDescAgenciaDev(), 119));
			write("ESTADO: " + relatorioApuracaoIssOneDTO.getSiglaEstado());
			novaLinha();

			write(Formatacao.formataSpacesDireita("CNPJ: " + NumberUtils.formatCnpj(relatorioApuracaoIssOneDTO.getCnpj()), 97));
			write("INSCRICAO MUNICIPAL: " + relatorioApuracaoIssOneDTO.getInscricaoMunicipal());
			novaLinha();

			write(Formatacao.formataSpacesDireita("ENDERECO: "+ relatorioApuracaoIssOneDTO.getEndereco(), 115));
			write("CEP: " + relatorioApuracaoIssOneDTO.getCepFormatado());
			novaLinha();

			write(Formatacao.formataSpacesDireita("CENTRALIZADORA: " + GissUtil.formatNumber(String.valueOf(relatorioApuracaoIssOneDTO.getCodAgenciaCentralizadora()),5) + "-" + relatorioApuracaoIssOneDTO.getDigitoAgenciaCentralizadora()+ "/" + relatorioApuracaoIssOneDTO.getDescAgenciaCentralizadora(), 111));
			write("COD.MUNIC.: "+ relatorioApuracaoIssOneDTO.getCodigoMunicipio() + "/" + relatorioApuracaoIssOneDTO.getDigitoMunicipio());
			novaLinha();

			write(Formatacao.formataSpacesDireita("COMPETENCIA: " + relatorioApuracaoIssOneDTO.getMesCompetencia()+"/"+relatorioApuracaoIssOneDTO.getAnoCompetencia(),116));
			write("VENCIMENTO: " + relatorioApuracaoIssOneDTO.getDiaVencimento());
			novaLinha();novaLinha();
			
		/**	write("Planilha de Apuração do I.S.S.");
			novaLinha();

			write("BANCO BRADESCO S.A.");
			novaLinha();

			write("AGENCIA: "+ GissUtil.formatNumber(String.valueOf(relatorioApuracaoIssOneDTO.getCodAgenciaDev()),5)+"/"+relatorioApuracaoIssOneDTO.getDescAgenciaDev());
			novaLinha();

			write("ESTADO: " + relatorioApuracaoIssOneDTO.getSiglaEstado());
			novaLinha();

			write("CNPJ: " + NumberUtils.formatCnpj(relatorioApuracaoIssOneDTO.getCnpj()));
			novaLinha();

			write("INSCRICAO MUNICIPAL: " + relatorioApuracaoIssOneDTO.getInscricaoMunicipal());
			novaLinha();

			write("ENDERECO: "+ relatorioApuracaoIssOneDTO.getEndereco());
			novaLinha();

			write("CEP: " + relatorioApuracaoIssOneDTO.getCepFormatado());
			novaLinha();

			write("CENTRALIZADORA: ");
			write(GissUtil.formatNumber(String.valueOf(relatorioApuracaoIssOneDTO.getCodAgenciaCentralizadora()),5));
			write("-");
			write(relatorioApuracaoIssOneDTO.getDigitoAgenciaCentralizadora());
			write("/");
			write(relatorioApuracaoIssOneDTO.getDescAgenciaCentralizadora());
			novaLinha();


			write("COD.MUNIC.: ");
			write(relatorioApuracaoIssOneDTO.getCodigoMunicipio());
			write("/");
			write(relatorioApuracaoIssOneDTO.getDigitoMunicipio());
			novaLinha();

			write("COMPETENCIA: ");
			write(relatorioApuracaoIssOneDTO.getMesCompetencia());
			write("/");
			write(relatorioApuracaoIssOneDTO.getAnoCompetencia());
			novaLinha();

			write("VENCIMENTO: " + relatorioApuracaoIssOneDTO.getDiaVencimento());
			novaLinha();novaLinha();
			*/
			
		} catch (IOException e) {
			throw new ReportException("Erro ao montar o cabecalho - durante a geracao do relatorio TXT",e);
		}
	}


	private void montarDescricaoDemonstrativo() throws ReportException {
		try{
			
			write("DEMONSTRATIVO   DAS   RECEITAS,  PARA   EFEITO   DE   RECOLHIMENTO   DO   ISSQN, A  SER   EFETUADO  NO  VENCIMENTO. O  LANCAMENTO");
			novaLinha();
			write("CONTABIL   FOI   FEITO   A   DEBITO   DA   CONTA   (55.89 - 1/9)  NA  AGENCIA/DEPARTAMENTO  E  A  CREDITO  DA CONTA");
			novaLinha();
			write("(17.50 - 1/9),   NA   AGENCIA/DEPARTAMENTO  CENTRALIZADOR, QUE  E  O   RESPONSAVEL   PELO   RECOLHIMENTO  E  PELA");
			novaLinha();
			write("GUARDA  DOS  DOCUMENTOS  POR  11  (ONZE)  ANOS.");
			novaLinha();
			novaLinha();
			write("(NO  ATO  DO  RECOLHIMENTO  DEBITAR  A  CONTA  (17.50 - 1/9)  QUE  DEVERA  SER  ZERADA).");
			novaLinha();
			novaLinha();
			
			/**
			write("DEMONSTRATIVO DAS RECEITAS, PARA EFEITO DE RECOLHIMENTO DO ISSQN, A  SER EFETUADO  NO  " +
					"VENCIMENTO. O LANCAMENTO CONTABIL FOI FEITO A DEBITO DA CONTA 8.1.9.25.00-1 (55.89.1/9) " +
					"NA AGENCIA/DEPARTAMENTO E A CREDITO DA CONTA 4.9.4.20.90-2 (17.50.1/9), NA " +
					"AGENCIA/DEPARTAMENTO CENTRALIZADOR, QUE E O RESPONSAVEL PELO RECOLHIMENTO E PELA GUARDA DOS " +
			"DOCUMENTOS POR 11 (ONZE) ANOS.");
			novaLinha();
			write("(NO ATO DO RECOLHIMENTO DEBITAR A CONTA 4.9.4.20.90-2 (17.50 - 1/9) QUE DEVERA SER ZERADA).");
			novaLinha();
			novaLinha(); */
			
		} catch (IOException e) {
			throw new ReportException("Erro ao montar a descricao do Demonstrativo -  durante a geracao do relatorio TXT",e);
		}
	}

	private void montarTabela(RelatorioApuracaoIssAllDTO dto) throws ReportException {
		try{
			boolean tipoServicoNovo = true;
			
			String tituloConta = "COSIF";
			
			TabelaTxt txt = new TabelaTxt();
			txt.add(tituloConta);
			
			if(razaoExiste){
				txt.add("RAZÃO");
			}
			
			if(aberturaConta)
				txt.add("CONTA");
			
			txt.add("TITULO DA CONTA");
			txt.add("ITEM L.C.");
			txt.add("RECEITA",Alinhamento.DIREITA);
			txt.add("ALIQUOTA",Alinhamento.DIREITA);
			txt.add("ISS",Alinhamento.DIREITA);
			txt.quebraLinha();
			
			for (int i = 0; i < relatorioApuracaoIssOneDTO.getApuracoes().size(); i++) {
				OcorrenciaApuracaoIssDTO apuracao = relatorioApuracaoIssOneDTO.getApuracoes().get(i);
				
				if (tipoServicoNovo) {
					txt.add(apuracao.getCodigoTipoServico()+ "/" + apuracao.getDescricaoTipoServico());
					txt.add("");
					txt.add("");
					txt.add("");
					txt.add("");
					txt.quebraLinha();
					
					tipoServicoNovo = false;
				}
				
				txt.add(!apuracao.isTotal()?GissUtil.mascaraContaContabil(apuracao.getCosif(),apuracao.getRazao()):"");
				if(razaoExiste){
					txt.add(!apuracao.isTotal()?apuracao.getRazao():"");
				}
				if(aberturaConta)
					txt.add(!apuracao.isTotal()?apuracao.getConta():"");
					
				txt.add(!apuracao.isTotal()?apuracao.getNomeContaContabil():"");
				txt.add(!apuracao.isTotal()?apuracao.getItemLeiComplementar():"");
				txt.add(NumberUtils.format(apuracao.getValorReceita()),Alinhamento.DIREITA);
				txt.add(!apuracao.isTotal()?NumberUtils.format(apuracao.getPercentualAliquota()):"",Alinhamento.DIREITA);
				txt.add(NumberUtils.format(apuracao.getValorTributo()),Alinhamento.DIREITA);
				txt.quebraLinha();
				
				tipoServicoNovo = apuracao.isTotal();
				
			}
			
			txt.add("REDUTOR");
			txt.add("");
			txt.add("");
			txt.add("");
			
			if(aberturaConta)
				txt.add("");
			
			txt.add("",Alinhamento.DIREITA);
			txt.add("(-)",Alinhamento.DIREITA);
			txt.add(NumberUtils.format(dto.getValorRedutorTotal()),Alinhamento.DIREITA);
			txt.quebraLinha();
			
			txt.add("TOTAL AGENCIA");
			txt.add("");
			txt.add("");
			txt.add("");
			
			if(aberturaConta)
				txt.add("");
			
			txt.add("",Alinhamento.DIREITA);
			txt.add(NumberUtils.format(dto.getValorTotalReceitaTotal()),Alinhamento.DIREITA);
			txt.add(NumberUtils.format(dto.getValorTotalIssTotal()),Alinhamento.DIREITA);
			txt.quebraLinha();
			txt.geraTxt(osw);
			
		} catch (Exception e) {
			throw new ReportException("Erro ao montar a tabela durante a geracao do relatorio TXT",e);
		}
	}


	private void montarCabecalhoTabela() throws ReportException {
		try{
			write("TIPO DE SERVICO");
			novaLinha();
			
		} catch (Exception e) {
			throw new ReportException("Erro ao montar o cabecalho durante a geracao do relatorio TXT",e);
		}
	}


//	private void montarTotalGeralFinal(RelatorioApuracaoIssAllDTO relatorioApuracaoIssDTO) {
//		try{
//			novaLinha();
//			novaLinha();
//			novaLinha();
//
//			write("REDUTOR GERAL");
//			novaColuna();
//			novaColuna();
//			novaColuna();
//			novaColuna();
//			write("(-)");
//			novaColuna();
//			write(NumberUtils.format(relatorioApuracaoIssDTO.getValorRedutorTotal()));
//			novaLinha();
//			
//			write("TOTAL GERAL");
//			novaColuna();
//			novaColuna();
//			novaColuna();
//
//			write(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalReceitaTotal()));
//			novaColuna();
//			novaColuna();
//
//			write(NumberUtils.format(relatorioApuracaoIssDTO.getValorTotalIssTotal()));
//			novaLinha();
//		} catch (Exception e) {
//			throw new ReportException("Erro ao montar o total geral durante a geracao do relatorio TXT",e);
//		}
//	}

	private void montarRodape()  {
		try{
			novaLinha();
			write("ASSUMO INTEIRA RESPONSABILIDADE PELA EXATIDAO DOS DADOS FORNECIDOS:");
			novaLinha();
			novaLinha();
			write("NOME:______________________________________________CPF:_________________________");
			novaLinha();
			novaLinha();
			write("TELEFONE:__________________________________________DATA:________________________");
			novaLinha();
			novaLinha();
			write("ASSINATURA:________________________________________");
			novaLinha();
			novaLinha();
					
		} catch (Exception e) {
			throw new ReportException("Erro ao montar o rodape durante a geracao do relatorio TXT",e);
		}
	}

	/**
	 * @return the aberturaConta
	 */
	public Boolean getAberturaConta() {
		return aberturaConta;
	}

	/**
	 * @param aberturaConta the aberturaConta to set
	 */
	public void setAberturaConta(Boolean aberturaConta) {
		this.aberturaConta = aberturaConta;
	}

}
