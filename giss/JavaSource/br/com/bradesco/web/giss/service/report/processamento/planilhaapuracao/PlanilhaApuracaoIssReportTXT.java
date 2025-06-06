package br.com.bradesco.web.giss.service.report.processamento.planilhaapuracao;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.OcorrenciaApuracaoIssDTO;
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
public class PlanilhaApuracaoIssReportTXT {
	private List<RelatorioApuracaoIssDTO> relatorioApuracaoIssDTO;
	private RelatorioApuracaoIssDTO relatorioApuracao;
	private Boolean razaoExiste = true;
	private OutputStreamWriter osw;
	private int qtdRelatorioImpresso = 0;
	private Boolean aberturaConta = false;

	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param relatorioApuracaoIssDTO
	 */
	public PlanilhaApuracaoIssReportTXT(
			List<RelatorioApuracaoIssDTO> relatorioApuracaoIssDTO,
			OutputStream out, Boolean aberturaConta) {
		this.relatorioApuracaoIssDTO = relatorioApuracaoIssDTO;
		this.osw = new OutputStreamWriter(out);
		setAberturaConta(aberturaConta);
	}

	/**
	 * Gera o documento
	 * 
	 * @throws IOException
	 */
	public void gerar() throws ReportException, IOException {

		for (RelatorioApuracaoIssDTO dto : relatorioApuracaoIssDTO) {
			relatorioApuracao = dto;
			boolean servicoNovo = true;    
			montarCabecalho();
			montarDescricaoDemonstrativo();

			if (dto.getApuracoes().size() > 0) {
				if (dto.getApuracoes().get(0).getCodigoGrupo() <= 0
						|| dto.getApuracoes().get(0).getCodigoSubgrupo() <= 0) {
					razaoExiste = false;
				} else {
					razaoExiste = true;
				}
			}

			TabelaTxt txt = new TabelaTxt();
			montarCabecalhoTabela(txt);

			for (int i = 0; i < dto.getApuracoes().size(); i++) {
				OcorrenciaApuracaoIssDTO ocorrenciaApuracaoIssDTO = dto.getApuracoes().get(i);

				montarTabela(ocorrenciaApuracaoIssDTO, txt,servicoNovo);
				
				if("T".equals(ocorrenciaApuracaoIssDTO.getTipoRegistro())){
				    servicoNovo = true;
				} else {
				    servicoNovo = false;
				}

			}

			montarTotalGeral(txt);
		}

		montarRodape();
		try {
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT", e);
		}
	}

	private void write(String s) throws IOException {
		osw.append(s);
	}

	private void novaLinha() throws IOException {
		osw.append("\r\n");
	}

	/*
	 * Monta o cabecalho do relatorio
	 */
	private void montarCabecalho() throws ReportException {
		try {

			if (qtdRelatorioImpresso > 0) {
				novaLinha();
				novaLinha();
				novaLinha();
			}
			write("Planilha de Apuração do I.S.S.");
			novaLinha();

			write("BANCO BRADESCO S.A.");
			novaLinha();

			write(Formatacao.formataSpacesDireita("AGENCIA: "
					+ String.valueOf(relatorioApuracao
							.getCodAgenciaDev()) + "/"
					+ relatorioApuracao.getDescAgenciaDev(), 119));
			write("ESTADO: " + relatorioApuracao.getSiglaEstado());
			novaLinha();

			write(Formatacao.formataSpacesDireita("CNPJ: "
					+ NumberUtils.formatCnpj(relatorioApuracao.getCnpj()), 97));
			write("INSCRICAO MUNICIPAL: "
					+ relatorioApuracao.getInscricaoMunicipal());
			novaLinha();

			write(Formatacao.formataSpacesDireita("ENDERECO: "
					+ relatorioApuracao.getEndereco(), 115));
			write("CEP: " + relatorioApuracao.getCepFormatado());
			novaLinha();

			write(Formatacao.formataSpacesDireita("CENTRALIZADORA: "
					+ GissUtil.formatNumber(String.valueOf(relatorioApuracao
							.getCodAgenciaCentralizadora()), 5) + "-"
					+ relatorioApuracao.getDigitoAgenciaCentralizadora() + "/"
					+ relatorioApuracao.getDescAgenciaCentralizadora(), 111));
			write("COD.MUNIC.: " + relatorioApuracao.getCodigoMunicipio() + "/"
					+ relatorioApuracao.getDigitoMunicipio());
			novaLinha();

			write(Formatacao.formataSpacesDireita("COMPETENCIA: "
					+ relatorioApuracao.getMesCompetencia() + "/"
					+ relatorioApuracao.getAnoCompetencia(), 116));
			write("VENCIMENTO: " + relatorioApuracao.getDiaVencimento());
			novaLinha();
			novaLinha();
			qtdRelatorioImpresso++;
		} catch (IOException e) {
			throw new ReportException(
					"Erro ao montar o cabecalho - durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarDescricaoDemonstrativo() throws ReportException {
		try {

			write("DEMONSTRATIVO   DAS   RECEITAS,  PARA   EFEITO   DE   RECOLHIMENTO   DO   ISSQN, A  SER   EFETUADO  NO  VENCIMENTO. O  LANCAMENTO");
			novaLinha();
			write("CONTABIL   FOI   FEITO   A   DEBITO   DA   CONTA    (55.89 - 1/9)  NA  AGENCIA/DEPARTAMENTO  E  A  CREDITO  DA CONTA");
			novaLinha();
			write("(17.50 - 1/9),   NA   AGENCIA/DEPARTAMENTO  CENTRALIZADOR, QUE  E  O   RESPONSAVEL   PELO   RECOLHIMENTO  E  PELA");
			novaLinha();
			write("GUARDA  DOS  DOCUMENTOS  POR  11  (ONZE)  ANOS.");
			novaLinha();
			novaLinha();
			write("(NO  ATO  DO  RECOLHIMENTO  DEBITAR  A  CONTA   (17.50 - 1/9)  QUE  DEVERA  SER  ZERADA).");
			novaLinha();
			novaLinha();
		} catch (IOException e) {
			throw new ReportException(
					"Erro ao montar a descricao do Demonstrativo -  durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarCabecalhoTabela(TabelaTxt txt) throws ReportException {
		try {
			write("TIPO DE SERVICO");
			novaLinha();

			String tituloConta = "COSIF";

			txt.add(tituloConta);

			if (razaoExiste) {
				txt.add("RAZÃO");
			}
			if(aberturaConta)
				txt.add("CONTA");

			txt.add("TITULO DA CONTA");
			txt.add("ITEM L.C.");
			txt.add("RECEITA", Alinhamento.DIREITA);
			txt.add("ALIQUOTA", Alinhamento.DIREITA);
			txt.add("ISS", Alinhamento.DIREITA);
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarRodape() {
		try {
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
			throw new ReportException(
					"Erro ao montar o rodape durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarTabela(OcorrenciaApuracaoIssDTO apuracao, TabelaTxt txt, boolean servicoNovo) {

		try {
		    
			if (servicoNovo) {
				txt.add(apuracao.getCodigoTipoServico() + "/"
						+ apuracao.getDescricaoTipoServico());
				txt.add("");
				txt.add("");
				txt.add("");
				txt.add("");
				txt.quebraLinha();

			}
			
			txt.add(!apuracao.isTotal() ? GissUtil.mascaraContaContabil(
					apuracao.getCosif(), apuracao.getRazao()) : "");
			if (razaoExiste) {
				txt.add(!apuracao.isTotal() ? apuracao.getRazao() : "");
			}
			if (aberturaConta) {
				txt.add(!apuracao.isTotal() ? apuracao.getConta() : "");
			}
			txt.add(!apuracao.isTotal() ? apuracao.getNomeContaContabil() : "");
			txt.add(!apuracao.isTotal() ? apuracao.getItemLeiComplementar()
					: "");
			txt.add(NumberUtils.format(apuracao.getValorReceita()),
					Alinhamento.DIREITA);
			txt.add(!apuracao.isTotal() ? NumberUtils.format(apuracao
					.getPercentualAliquota()) : "", Alinhamento.DIREITA);
			txt.add(NumberUtils.format(apuracao.getValorTributo()),
					Alinhamento.DIREITA);
			txt.quebraLinha();

		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}

	private void montarTotalGeral(TabelaTxt txt) {

		try {
			txt.add("REDUTOR");
			txt.add("");
			txt.add("");
			txt.add("");
			if (aberturaConta) {
				txt.add("");
			}
			txt.add("", Alinhamento.DIREITA);
			txt.add("(-)", Alinhamento.DIREITA);
			txt.add(NumberUtils.format(relatorioApuracao.getValorRedutor()),
					Alinhamento.DIREITA);
			txt.quebraLinha();

			txt.add("TOTAL AGENCIA");
			txt.add("");
			txt.add("");
			txt.add("");
			if (aberturaConta) {
				txt.add("");
			}
			txt.add(NumberUtils
					.format(relatorioApuracao.getValorTotalReceita()),
					Alinhamento.DIREITA);
			txt.add("", Alinhamento.DIREITA);
			txt.add(NumberUtils.format(relatorioApuracao.getValorTotalIss()),
					Alinhamento.DIREITA);
			txt.quebraLinha();
			txt.geraTxt(osw);
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
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
