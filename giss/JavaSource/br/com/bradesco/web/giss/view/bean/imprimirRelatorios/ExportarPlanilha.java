package br.com.bradesco.web.giss.view.bean.imprimirRelatorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.DependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.business.apuracaomensal.bean.OcorrenciaDependenciaApuracaoMensalSaidaDTO;
import br.com.bradesco.web.giss.service.business.arquivoempresa.bean.ArquivoEmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultaAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarApuracaoFinalAposFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaposfechamento.bean.ConsultarDependenciaAposApuracaoFechamentoDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ConsultarOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaooscilacaonegativa.bean.ContasOscilacaoNegativaDTO;
import br.com.bradesco.web.giss.service.business.contacontabil.bean.ContaContabilDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean.DependeciasEncerradasDTO;
import br.com.bradesco.web.giss.service.business.depmunicipio.bean.DependenciaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.bean.ContasISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issitemservicolc.bean.ItemServicoLcISSDTO;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;
import br.com.bradesco.web.giss.service.business.issrelatorio.bean.RelatorioSaidaISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.mantermunicipio.bean.ContaMunicipioDTO;
import br.com.bradesco.web.giss.service.business.movimentoretificador.bean.MovimentoRetificadorDTO;
import br.com.bradesco.web.giss.service.business.planapuracaoiss.bean.PlanApuracaoIssSaidaListaDTO;
import br.com.bradesco.web.giss.service.business.resultmunnovo.bean.ResultMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSDTO;
import br.com.bradesco.web.giss.service.business.valormestotal.bean.DemonstrativoISSTotalDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.utils.PlanilhaEletronica;
import br.com.bradesco.web.giss.view.bean.controller.consultar.ConsultarApuracaoAliquotaPlanilhaDTO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.DetalharJustificativaApuracaoVO;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaConciliacaoApuracaoVo;
import br.com.bradesco.web.giss.view.bean.model.listaGenerica.ListaJustificativaApuracaoVO;

public class ExportarPlanilha extends PlanilhaEletronica {
	/*EXPORTAR PLANILHA*/
	public ExportarPlanilha(String nomePlanilha, String nomeArquivo) {
		super(nomePlanilha, nomeArquivo);
	}
	/*RAZOES CONTABEIS*/
	public void razoesContabeis(List<ContaContabilDTO> listaContasContabeis,
			int flag) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Razões Contábeis", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "COSIF");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put(COLUNA_D, "Descrição");
		hmValores.put(COLUNA_E, "Item da lei complementar");
		if (flag == 2){
			hmValores.put(COLUNA_F, "Atualização");
		}
		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ContaContabilDTO contaContabil : listaContasContabeis) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, contaContabil.getCosifFormatado());
			hmValores.put(COLUNA_B, contaContabil.getRazao());
			hmValores.put(COLUNA_C, contaContabil.getConta());
			hmValores.put(COLUNA_D, contaContabil.getDescricao());
			hmValores.put(COLUNA_E, contaContabil.getItem());
			if (flag == 2){
				hmValores.put(COLUNA_F, contaContabil.getAtualizacao());
			}
			hmRegistros.put(contador++, hmValores);

		}

		criaRegistros(hmRegistros, getEstiloRegistros());
		if (flag == 1){
			mesclarCelula(0, 0, COLUNA_A, COLUNA_E);
		}else{
			mesclarCelula(0, 0, COLUNA_A, COLUNA_F);
		}
		tamanhoDeColuna(COLUNA_A, 20);
		tamanhoDeColuna(COLUNA_B, 20);
		tamanhoDeColuna(COLUNA_C, 20);
		tamanhoDeColuna(COLUNA_D, 90);
		tamanhoDeColuna(COLUNA_E, 20);
		if (flag == 2){
			tamanhoDeColuna(COLUNA_F, 20);
		}
		efetuarDownload();

	}

	/*APURACOES MENSAIS*/
	public void apuracoesMensais(DependenciaApuracaoMensalSaidaDTO dependenciaApuracaoMensal) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Apuração Mensal", getEstiloTitulo());

		/* ======= CABEï¿½ALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Dependência");
		hmValores.put(COLUNA_B, "Descrição");
		hmValores.put(COLUNA_C, "Município");
		hmValores.put(COLUNA_D, "Estado");
		hmValores.put(COLUNA_E, "Receita");
		hmValores.put(COLUNA_F, "ISS a Recolher");
		hmValores.put(COLUNA_G, "TRAG sem TRAG?");
		
		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual() - 1;
		for (OcorrenciaDependenciaApuracaoMensalSaidaDTO dependencia : dependenciaApuracaoMensal.getApuracoes()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, dependencia.getCodDepPa());
			hmValores.put(COLUNA_B, dependencia.getDescDepPa());
			hmValores.put(COLUNA_C, dependencia.getDescMunicipio());
			hmValores.put(COLUNA_D, dependencia.getDescUF());
			hmValores.put(COLUNA_E, dependencia.getMunicipioReceitaValor());
			hmValores.put(COLUNA_F, dependencia.getGeralReceitaValor());
			hmValores.put(COLUNA_G, dependencia.getTragSemTrag().equals("S") ? "Sim" : "Não");
			
			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (int i = 0; i < dependenciaApuracaoMensal.getApuracoes().size(); i++) {
			linha++;
			celulaADireita(linha, COLUNA_E);
			celulaADireita(linha, COLUNA_F);
		}

		/* =========== TOTAL ========== */

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total das Agências Listadas:");
		hmValores.put(COLUNA_F, dependenciaApuracaoMensal.getQtdeAgencia().toString());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total dos PAs Listados:");
		hmValores.put(COLUNA_F, dependenciaApuracaoMensal.getQtdePa().toString());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total das Agências:");
		hmValores.put(COLUNA_E,	dependenciaApuracaoMensal.getTotalAgenciaReceitaValor());
		hmValores.put(COLUNA_F,	dependenciaApuracaoMensal.getTotalAgenciaRecolherValor());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);
		
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total dos PAs:");
		hmValores.put(COLUNA_E,	dependenciaApuracaoMensal.getTotalPaReceitaValor());
		hmValores.put(COLUNA_F,	dependenciaApuracaoMensal.getTotalPaRecolherValor());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total Município:");
		hmValores.put(COLUNA_E,	dependenciaApuracaoMensal.getTotalMunucipioReceitaValor());
		hmValores.put(COLUNA_F,	dependenciaApuracaoMensal.getTotalMunucipioRecolherValor());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_D, "Total Geral:");
		hmValores.put(COLUNA_E,	dependenciaApuracaoMensal.getTotalGeralReceitaValor());
		hmValores.put(COLUNA_F,	dependenciaApuracaoMensal.getTotalGeralRecolherValor());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_D, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_G);

		tamanhoDeColuna(COLUNA_A, 20);
		tamanhoDeColuna(COLUNA_B, 70);
		tamanhoDeColuna(COLUNA_C, 30);
		tamanhoDeColuna(COLUNA_D, 30);
		tamanhoDeColuna(COLUNA_E, 35);
		tamanhoDeColuna(COLUNA_F, 35);
		tamanhoDeColuna(COLUNA_G, 15);

		efetuarDownload();

	}
	/*APURACOES PÓS FECHAMENTO*/
	public void apuracaoPosFechamento(
			List<ConsultarDependenciaAposApuracaoFechamentoDTO> listaDependenciaApuracao)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Apuração Após Fechamento", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Dependência");
		hmValores.put(COLUNA_B, "Descrição");
		hmValores.put(COLUNA_C, "Receita");
		hmValores.put(COLUNA_D, "ISS a Recolher");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ConsultarDependenciaAposApuracaoFechamentoDTO dependenciaAposFech : listaDependenciaApuracao) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, dependenciaAposFech.getCodDepPa());
			hmValores.put(COLUNA_B, dependenciaAposFech.getDescDepPa());
			hmValores.put(COLUNA_C, dependenciaAposFech.getReceita());
			hmValores.put(COLUNA_D, dependenciaAposFech.getISSRecolher());

			hmRegistros.put(contador++, hmValores);

		}

		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ConsultarDependenciaAposApuracaoFechamentoDTO dependenciaAposFech : listaDependenciaApuracao) {
			celulaADireita(linha, COLUNA_C);
			celulaADireita(linha, COLUNA_D);
			linha++;
		}

		/* =========== TOTAL ========== */

		hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_B, "Total das Agências Relacionadas:");
		hmValores.put(
				COLUNA_D,
				listaDependenciaApuracao
						.get(listaDependenciaApuracao.size() - 1)
						.getQtdeAgencia().toString());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);

		hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_B, "Total dos PAs Relacionados:");
		hmValores.put(
				COLUNA_D,
				listaDependenciaApuracao
						.get(listaDependenciaApuracao.size() - 1).getQtdePa()
						.toString());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);

		hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_B, "Total");
		hmValores.put(COLUNA_C, listaDependenciaApuracao.get(0)
				.getTotalReceita());
		hmValores.put(COLUNA_D, listaDependenciaApuracao.get(0)
				.getTotalRecolher());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_C);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);

		/* =========== FORMATAÇÕES ========== */
		contador = 2;
		for (ConsultarDependenciaAposApuracaoFechamentoDTO dependenciaAposFech : listaDependenciaApuracao) {
			celulaADireita(contador, COLUNA_C);
			celulaADireita(contador, COLUNA_D);
			contador++;
		}

		mesclarCelula(0, 0, COLUNA_A, COLUNA_D);

		tamanhoDeColuna(COLUNA_A, 17.71);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 47);
		tamanhoDeColuna(COLUNA_D, 44.71);

		efetuarDownload();

	}
	/*DEPENDENCIAS ENCERRADAS*/
	public void dependenciasEncerradas(
			List<DependeciasEncerradasDTO> listaDependenciasEncerradas)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Dependências Encerradas", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Dependência");
		hmValores.put(COLUNA_B, "Descrição");
		hmValores.put(COLUNA_C, "Município");
		hmValores.put(COLUNA_D, "UF");
		hmValores.put(COLUNA_E, "Atualização");
		hmValores.put(COLUNA_F, "Exclusão");
		hmValores.put(COLUNA_G, "Data da Baixa I.M.");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (DependeciasEncerradasDTO dependenciaAposFech : listaDependenciasEncerradas) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, dependenciaAposFech.getCodigoDependencia());
			hmValores.put(COLUNA_B, dependenciaAposFech.getNomeDependencia());
			hmValores.put(COLUNA_C, dependenciaAposFech.getMunicipio());
			hmValores.put(COLUNA_D,
					dependenciaAposFech.getSiglaUnidadeFederativa());
			hmValores.put(COLUNA_E, dependenciaAposFech.getHoraManutencao());
			hmValores.put(COLUNA_F, dependenciaAposFech.getDataExclusao());
			hmValores.put(COLUNA_G, dependenciaAposFech.getDataBaixa());

			hmRegistros.put(contador++, hmValores);

		}

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_G);

		tamanhoDeColuna(COLUNA_A, 12.86);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 43.29);
		tamanhoDeColuna(COLUNA_D, 8.29);
		tamanhoDeColuna(COLUNA_E, 11.29);
		tamanhoDeColuna(COLUNA_F, 10.57);
		tamanhoDeColuna(COLUNA_G, 19.14);

		efetuarDownload();

	}
	/*DEPENDENCIAS MUNICIPIO*/
	public void dependenciasMunicipio(
			DependenciaMunicipioDTO dependenciaMunicipioDTO) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Dependências do Município", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Dependência");
		hmValores.put(COLUNA_B, "Descrição");
		hmValores.put(COLUNA_C, "Situação da Dependência");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (DependenciaMunicipioDTO dependenciaMunicipio : dependenciaMunicipioDTO
				.getLstMunicipios()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores
					.put(COLUNA_A, dependenciaMunicipio.getCodigoDependencia());
			hmValores.put(COLUNA_B,
					dependenciaMunicipio.getDescricaoDependencia());
			hmValores.put(COLUNA_C,
					dependenciaMunicipio.getSituacaoDependencia());

			hmRegistros.put(contador++, hmValores);

		}

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total de Dependências Ativas");
		hmValores.put(COLUNA_C,
				dependenciaMunicipioDTO.getQtdeDependenciasAtivas());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total de Dependências Encerradas");
		hmValores.put(COLUNA_C,
				dependenciaMunicipioDTO.getQtdeDependenciasEncerradas());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());

		/* =========== FORMATAÇÕES ========== */
		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 17.71);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 47);

		efetuarDownload();

	}
	/*ALIQUOTAS ZERADAS*/
	public void aliquotasZeradas(
			ConsultarApuracaoAliquotaPlanilhaDTO consultarPlanilhaDTO,
			BigDecimal totalValor, BigDecimal totalGeral, Long qtdeAgencia,
			Long qtdePa) throws Exception {
		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Alíquotas Zeradas", getEstiloTitulo());

		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;

		if (consultarPlanilhaDTO.isCompetencia1Existe()) {
			/* ======= 1 CABEÇALHO 1 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO 1 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia1());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO 1 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");

			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO 1 ======== */
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			contador = 0;
			int linha = retornaLinhaAtual();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista1()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista1()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}

			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia2Existe()) {

			/* ======= SEGUNDO BLOCO ======= */
			/* ======= 1 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia2());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");

			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO 2 ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista2()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista2()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}

			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia3Existe()) {

			/* ======= TERCEIRO BLOCO ======= */
			/* ======= 1 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia3());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");

			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO 2 ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista3()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista3()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia4Existe()) {
			/* ======= QUARTO BLOCO ======= */
			/* ======= 1 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia4());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO 2 ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");

			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO 2 ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista4()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista4()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}

			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia5Existe()) {

			/* ======= QUINTO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia5());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");

			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista5()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista5()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia6Existe()) {

			/* ======= SEXTO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia6());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista6()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista6()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia7Existe()) {

			/* ======= SÉTIMO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia7());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista7()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista7()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia8Existe()) {

			/* ======= OITAVO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia8());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista8()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista8()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia9Existe()) {

			/* ======= NONO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia9());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista9()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista9()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia10Existe()) {

			/* ======= DÉCIMO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia10());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista10()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista10()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia11Existe()) {

			/* ======= DÉCIMO PRIMEIRO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia11());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista11()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista11()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
			pularLinha(1);
		}

		if (consultarPlanilhaDTO.isCompetencia12Existe()) {

			/* ======= DÉCIMO SEGUNDO BLOCO ======= */
			/* ======= 1 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Estado");
			hmValores.put(COLUNA_B, "Municipio");
			hmValores.put(COLUNA_C, "Competência");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 1 CONTEUDO CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, consultarPlanilhaDTO.getDescUf());
			hmValores.put(COLUNA_B, consultarPlanilhaDTO.getDescMunicipio());
			hmValores.put(COLUNA_C, consultarPlanilhaDTO.getCompetencia12());
			criaRegistro(hmValores, getEstiloRegistros());

			/* ======= 2 CABEÇALHO ======== */
			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "Dependência");
			hmValores.put(COLUNA_B, "Descrição");
			hmValores.put(COLUNA_C, "Receita");
			criaCabecalho(hmValores, getEstiloCabecalho());

			/* ======= 2 CONTEUDO CABEÇALHO ======== */
			int linha = retornaLinhaAtual();
			hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista12()) {

				hmValores = new HashMap<Integer, Object>();

				hmValores.put(COLUNA_A, aliquota.getCodDepPa());
				hmValores.put(COLUNA_B, aliquota.getDescDepPa());
				hmValores.put(COLUNA_C, aliquota.getReceitaValor());

				hmRegistros.put(contador++, hmValores);

			}
			criaRegistros(hmRegistros, getEstiloRegistros());

			for (ConsultaAliquotaZeradaSaidaDTO aliquota : consultarPlanilhaDTO
					.getLista12()) {
				celulaADireita(linha, COLUNA_C);
				linha++;
			}
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total das Agências Listadas:");
		hmValores.put(COLUNA_C, qtdeAgencia.toString());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_C);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total dos PAs Listados:");
		hmValores.put(COLUNA_C, qtdePa.toString());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_C);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total Valor");
		hmValores.put(COLUNA_C, totalValor);
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_C);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total Geral");
		hmValores.put(COLUNA_C, totalGeral);
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_C);

		/* =========== FORMATAÇÕES ========== */
		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 18);
		tamanhoDeColuna(COLUNA_B, 101.57);
		tamanhoDeColuna(COLUNA_C, 18);

		efetuarDownload();
	}
	/*RAZOES MUNICIPIO*/
	public void razoesMunicipio(List<ContaMunicipioDTO> lstContaMunicipio)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Razões do Município", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Cosif");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Descrição");
		hmValores.put(COLUNA_D, "Alíquota");
		hmValores.put(COLUNA_E, "Código Tributo");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ContaMunicipioDTO contaMunicipio : lstContaMunicipio) {
			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, contaMunicipio.getCosif());
			hmValores.put(COLUNA_B, contaMunicipio.getRazao());
			hmValores.put(COLUNA_C, contaMunicipio.getDescricao());
			hmValores.put(COLUNA_D, contaMunicipio.getAliquota());
			hmValores.put(COLUNA_E, contaMunicipio.getCodigoTributo());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ContaMunicipioDTO contaMunicipio : lstContaMunicipio) {
			celulaADireita(linha, COLUNA_D);
			celulaADireita(linha, COLUNA_E);
			linha++;
		}

		mesclarCelula(0, 0, COLUNA_A, COLUNA_E);

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 11);
		tamanhoDeColuna(COLUNA_C, 97.57);
		tamanhoDeColuna(COLUNA_D, 32.43);
		tamanhoDeColuna(COLUNA_E, 32.43);

		efetuarDownload();

	}
	/*VALOR MES TOTAL*/
	public void valorMesTotal(DemonstrativoISSTotalDTO listaContasCompetencia,
			boolean razaoExiste) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Valor Mês Total", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();
		int retira = 0;
		if (!razaoExiste) {
			retira = 1;
		}
		if (razaoExiste){
			hmValores.put(COLUNA_A, "Conta");
		}else{
			hmValores.put(COLUNA_A, "Cosif");
		}
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put((COLUNA_C - retira), "Receita");
		hmValores.put((COLUNA_D - retira), "ISS");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (DemonstrativoISSDTO demonstrativo : listaContasCompetencia
				.getListaDemonstrativoISSDTO()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, demonstrativo.getCosif());
			hmValores.put(COLUNA_B, demonstrativo.getRazao());
			hmValores.put((COLUNA_C - retira), demonstrativo.getReceita());
			hmValores.put((COLUNA_D - retira), demonstrativo.getIss());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (DemonstrativoISSDTO demonstrativo : listaContasCompetencia
				.getListaDemonstrativoISSDTO()) {
			celulaADireita(linha, (COLUNA_C - retira));
			celulaADireita(linha, (COLUNA_D - retira));
			linha++;
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put((COLUNA_B - retira), "Total:");
		hmValores.put((COLUNA_C - retira),
				listaContasCompetencia.getTotalReceita());
		hmValores
				.put((COLUNA_D - retira), listaContasCompetencia.getTotalIss());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, (COLUNA_B - retira),
				getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_C - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_D - retira));

		mesclarCelula(0, 0, COLUNA_A, (COLUNA_D - retira));

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 11);
		tamanhoDeColuna((COLUNA_C - retira), 97.57);
		tamanhoDeColuna((COLUNA_D - retira), 32.43);

		efetuarDownload();

	}

	public void valorMesTotalConta(
			DemonstrativoISSTotalDTO listaContasCompetencia, boolean razaoExiste)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Valor Mês Total Nível Conta", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();
		int retira = 0;
		hmValores.put(COLUNA_A, "Cosif");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put((COLUNA_D - retira), "Receita");
		hmValores.put((COLUNA_E - retira), "ISS");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (DemonstrativoISSDTO demonstrativo : listaContasCompetencia
				.getListaDemonstrativoISSDTO()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, demonstrativo.getCosif());
			hmValores.put(COLUNA_B, demonstrativo.getRazao());
			hmValores.put(COLUNA_C, demonstrativo.getConta());
			hmValores.put((COLUNA_D - retira), demonstrativo.getReceita());
			hmValores.put((COLUNA_E - retira), demonstrativo.getIss());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (DemonstrativoISSDTO demonstrativo : listaContasCompetencia
				.getListaDemonstrativoISSDTO()) {
			celulaADireita(linha, (COLUNA_D - retira));
			celulaADireita(linha, (COLUNA_E - retira));
			linha++;
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put((COLUNA_C - retira), "Total:");
		hmValores.put((COLUNA_D - retira),
				listaContasCompetencia.getTotalReceita());
		hmValores
				.put((COLUNA_E - retira), listaContasCompetencia.getTotalIss());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, (COLUNA_C - retira),
				getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_D - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_E - retira));

		mesclarCelula(0, 0, COLUNA_A, (COLUNA_E - retira));

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 11);
		tamanhoDeColuna(COLUNA_C, 18.29);
		tamanhoDeColuna((COLUNA_D - retira), 97.57);
		tamanhoDeColuna((COLUNA_E - retira), 32.43);

		efetuarDownload();

	}
	/*APURACAO APOS FECHAMENTO DETALHE*/
	public void apuracaoAposFechamentoDetalhe(
			List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinal,
			boolean razaoExiste) throws Exception {

		int retira = 0;
		if (!razaoExiste) {
			retira = 1;
		}

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Apuração Após Fechamento", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();
		if (razaoExiste){
			hmValores.put(COLUNA_A, "Cosif");
		}else{
			hmValores.put(COLUNA_A, "Conta");
		}
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put((COLUNA_C - retira), "Movimento");
		hmValores.put((COLUNA_D - retira), "Tributável");
		hmValores.put((COLUNA_E - retira), "Alíquota");
		hmValores.put((COLUNA_F - retira), "ISS");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ConsultarApuracaoFinalAposFechamentoDTO consultarApuracao : listaFinal) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, consultarApuracao.getCosif());
			hmValores.put(COLUNA_B, consultarApuracao.getRazao());
			hmValores
					.put((COLUNA_C - retira), consultarApuracao.getMovimento());
			hmValores.put((COLUNA_D - retira),
					consultarApuracao.getTributavel());
			hmValores.put((COLUNA_E - retira), consultarApuracao.getAliquota());
			hmValores.put((COLUNA_F - retira), consultarApuracao.getValorIss());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ConsultarApuracaoFinalAposFechamentoDTO consultarApuracao : listaFinal) {
			celulaADireita(linha, (COLUNA_C - retira));
			celulaADireita(linha, (COLUNA_D - retira));
			celulaADireita(linha, (COLUNA_E - retira));
			celulaADireita(linha, (COLUNA_F - retira));
			linha++;
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		ConsultarApuracaoFinalAposFechamentoDTO detalhe = listaFinal.iterator()
				.next();
		hmValores.put(COLUNA_A, "Total:");
		hmValores.put((COLUNA_C - retira), detalhe.getTotalMovimento());
		hmValores.put((COLUNA_D - retira), detalhe.getTotalTributavel());
		hmValores.put((COLUNA_F - retira), detalhe.getTotalISSFinal());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_A, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_C - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_D - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_F - retira));

		mesclarCelula(0, 0, COLUNA_A, (COLUNA_F - retira));

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 11);
		tamanhoDeColuna((COLUNA_C - retira), 97.57);
		tamanhoDeColuna((COLUNA_D - retira), 32.43);
		tamanhoDeColuna((COLUNA_E - retira), 32.43);
		tamanhoDeColuna((COLUNA_F - retira), 32.43);

		efetuarDownload();

	}
	/*APURACAO APOS FECHAMENTO DETALHE CONTA*/
	public void apuracaoAposFechamentoDetalheConta(
			List<ConsultarApuracaoFinalAposFechamentoDTO> listaFinal,
			boolean razaoExiste) throws Exception {

		int retira = 0;

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Apuração Após Fechamento Nível Conta",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "COSIF");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put((COLUNA_D - retira), "Movimento");
		hmValores.put((COLUNA_E - retira), "Tributável");
		hmValores.put((COLUNA_F - retira), "Alíquota");
		hmValores.put((COLUNA_G - retira), "ISS");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ConsultarApuracaoFinalAposFechamentoDTO consultarApuracao : listaFinal) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, consultarApuracao.getCosif());
			hmValores.put(COLUNA_B, consultarApuracao.getRazao());
			hmValores.put(COLUNA_C, consultarApuracao.getConta());
			hmValores
					.put((COLUNA_D - retira), consultarApuracao.getMovimento());
			hmValores.put((COLUNA_E - retira),
					consultarApuracao.getTributavel());
			hmValores.put((COLUNA_F - retira), consultarApuracao.getAliquota());
			hmValores.put((COLUNA_G - retira), consultarApuracao.getValorIss());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ConsultarApuracaoFinalAposFechamentoDTO consultarApuracao : listaFinal) {
			celulaADireita(linha, (COLUNA_D - retira));
			celulaADireita(linha, (COLUNA_E - retira));
			celulaADireita(linha, (COLUNA_F - retira));
			celulaADireita(linha, (COLUNA_G - retira));
			linha++;
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		ConsultarApuracaoFinalAposFechamentoDTO detalhe = listaFinal.iterator()
				.next();
		hmValores.put(COLUNA_B, "Total:");
		hmValores.put((COLUNA_D - retira), detalhe.getTotalMovimento());
		hmValores.put((COLUNA_E - retira), detalhe.getTotalTributavel());
		hmValores.put((COLUNA_G - retira), detalhe.getTotalISSFinal());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_D - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_E - retira));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_G - retira));

		mesclarCelula(0, 0, COLUNA_B, (COLUNA_G - retira));

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 11);
		tamanhoDeColuna(COLUNA_C, 18.29);
		tamanhoDeColuna((COLUNA_D - retira), 97.57);
		tamanhoDeColuna((COLUNA_E - retira), 32.43);
		tamanhoDeColuna((COLUNA_F - retira), 32.43);
		tamanhoDeColuna((COLUNA_G - retira), 32.43);

		efetuarDownload();

	}
	/*OSCILACAO NEGATIVA*/
	public void oscilacaoNegativa(
			List<ConsultarOscilacaoNegativaDTO> listaOscilacao,
			BigDecimal totalAnteriorAcumuladoAg,
			BigDecimal totalAtualAcumuladoAg,
			BigDecimal totalOscilacaoAcumuladoAg,
			BigDecimal totalAnteriorAcumuladoPa,
			BigDecimal totalAtualAcumuladoPa,
			BigDecimal totalOscilacaoAcumuladoPa) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Oscilação Negativa", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Dependência");
		hmValores.put(COLUNA_B, "Município");
		hmValores.put(COLUNA_C, "UF");
		hmValores.put(COLUNA_D, "Anterior");
		hmValores.put(COLUNA_E, "Atual");
		hmValores.put(COLUNA_F, "Oscilação");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ConsultarOscilacaoNegativaDTO oscilacao : listaOscilacao) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, oscilacao.getCodDepPa());
			hmValores.put(COLUNA_B, oscilacao.getMunicipioDepPa());
			hmValores.put(COLUNA_C, oscilacao.getUf());
			hmValores.put(COLUNA_D, oscilacao.getAnterior());
			hmValores.put(COLUNA_E, oscilacao.getAtual());
			hmValores.put(COLUNA_F, oscilacao.getOscilacao());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ConsultarOscilacaoNegativaDTO oscilacao : listaOscilacao) {
			celulaADireita(linha, COLUNA_D);
			celulaADireita(linha, COLUNA_E);
			celulaADireita(linha, COLUNA_F);
			linha++;
		}

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total das Agências Listadas:");
		hmValores.put(COLUNA_D, totalAnteriorAcumuladoAg);
		hmValores.put(COLUNA_E, totalAtualAcumuladoAg);
		hmValores.put(COLUNA_F, totalOscilacaoAcumuladoAg);
		criaRegistro(hmValores, getEstiloRegistros());

		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		/* =========== TOTAL ========== */
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total dos PAs Listados:");
		hmValores.put(COLUNA_D, totalAnteriorAcumuladoPa);
		hmValores.put(COLUNA_E, totalAtualAcumuladoPa);
		hmValores.put(COLUNA_F, totalOscilacaoAcumuladoPa);
		criaRegistro(hmValores, getEstiloRegistros());

		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		/* =========== TOTAL ========== */
		ConsultarOscilacaoNegativaDTO oscilacao = listaOscilacao.iterator()
				.next();
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total:");
		hmValores.put(COLUNA_D, oscilacao.getTotalAnterior());
		hmValores.put(COLUNA_E, oscilacao.getTotalAtual());
		hmValores.put(COLUNA_F, oscilacao.getTotalOscilacao());
		criaRegistro(hmValores, getEstiloRegistros());

		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_D);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_E);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);

		mesclarCelula(0, 0, COLUNA_A, COLUNA_F);

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 66.29);
		tamanhoDeColuna(COLUNA_D, 27.86);
		tamanhoDeColuna(COLUNA_E, 27.86);
		tamanhoDeColuna(COLUNA_F, 27.86);

		efetuarDownload();

	}
	/*OSCILACAO NEGATIVA DETALHE*/
	public void oscilacaoNegativaDetalhe(
			List<ContasOscilacaoNegativaDTO> listaContas, boolean razaoExiste)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Oscilação Negativa", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		int retirar = 0;
		if (!razaoExiste) {
			retirar = 2;
		}
		if (razaoExiste){
			hmValores.put(COLUNA_A, "Cosif");
		}else{
			hmValores.put(COLUNA_A, "Conta");
		}
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put((COLUNA_D - retirar), "Descrição");
		hmValores.put((COLUNA_E - retirar), "Anterior");
		hmValores.put((COLUNA_F - retirar), "Atual");
		hmValores.put((COLUNA_G - retirar), "Oscilação");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual();
		for (ContasOscilacaoNegativaDTO oscilacao : listaContas) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, oscilacao.getCosif());
			hmValores.put(COLUNA_B, oscilacao.getRazao());
			hmValores.put(COLUNA_C, oscilacao.getConta());
			hmValores.put((COLUNA_D - retirar), oscilacao.getDescricao());
			hmValores.put((COLUNA_E - retirar), oscilacao.getAnterior());
			hmValores.put((COLUNA_F - retirar), oscilacao.getAtual());
			hmValores.put((COLUNA_G - retirar), oscilacao.getOscilacao());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (ContasOscilacaoNegativaDTO oscilacao : listaContas) {
			celulaADireita(linha, (COLUNA_E - retirar));
			celulaADireita(linha, (COLUNA_F - retirar));
			celulaADireita(linha, (COLUNA_G - retirar));
			linha++;
		}

		/* =========== TOTAL ========== */
		ContasOscilacaoNegativaDTO oscilacao = listaContas.iterator().next();
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_B, "Total:");
		hmValores.put((COLUNA_E - retirar), oscilacao.getTotalAnterior());
		hmValores.put((COLUNA_F - retirar), oscilacao.getTotalAtual());
		hmValores.put((COLUNA_G - retirar), oscilacao.getTotalOscilacao());
		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_B, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_E - retirar));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_F - retirar));
		celulaADireita(retornaLinhaAtual() - 1, (COLUNA_G - retirar));

		mesclarCelula(0, 0, COLUNA_A, (COLUNA_G - retirar));

		tamanhoDeColuna(COLUNA_A, 18.29);
		tamanhoDeColuna(COLUNA_B, 14);
		tamanhoDeColuna(COLUNA_C, 18.29);
		tamanhoDeColuna((COLUNA_D - retirar), 66.29);
		tamanhoDeColuna((COLUNA_E - retirar), 27.86);
		tamanhoDeColuna((COLUNA_F - retirar), 27.86);
		tamanhoDeColuna((COLUNA_G - retirar), 27.86);

		efetuarDownload();

	}
	/*PLANILHA APURACAO ISS*/
	public void planilhaApuracaoISS(
			List<PlanApuracaoIssSaidaListaDTO> listaSaidaPlanilha)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha de Apuração ISS", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Competência");
		hmValores.put(COLUNA_B, "Dependência");
		hmValores.put(COLUNA_C, "Descrição");
		hmValores.put(COLUNA_D, "Município");
		hmValores.put(COLUNA_E, "Estado");
		hmValores.put(COLUNA_F, "Receita");
		hmValores.put(COLUNA_G, "ISS a Recolher");
		hmValores.put(COLUNA_H, "TRAG sem TRAG?");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		int linha = retornaLinhaAtual() - 1;
		for (PlanApuracaoIssSaidaListaDTO planilha : listaSaidaPlanilha) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getDataCompetenciaFormatada());
			hmValores.put(COLUNA_B, planilha.getCodDepPa());
			hmValores.put(COLUNA_C, planilha.getDescDepPa());

			hmValores.put(COLUNA_D, planilha.getMunicipio());
			hmValores.put(COLUNA_E, planilha.getUf());

			hmValores.put(COLUNA_F, planilha.getValorReceita());
			hmValores.put(COLUNA_G, planilha.getValorTributoApuracao());
			hmValores.put(COLUNA_H, planilha.getTragSemTrag().equals("S") ? "Sim" : "Não");
			
			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		for (int i = 0; i < listaSaidaPlanilha.size(); i++) {
			linha++;
			celulaADireita(linha, COLUNA_F);
			celulaADireita(linha, COLUNA_G);
		}

		/* =========== TOTAL ========== */

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_E, "Total das Agências Listadas:");
		hmValores.put(COLUNA_G,	String.valueOf(listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdeAgencia()));

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_E, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_G);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_E, "Total dos PAs Listados:");
		hmValores.put(COLUNA_G,	String.valueOf(listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getQtdePa()));

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_E, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_G);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_E, "Total:");
		hmValores.put(COLUNA_F,	listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipioReceita());
		hmValores.put(COLUNA_G, listaSaidaPlanilha.get(listaSaidaPlanilha.size() - 1).getTotalMunicipiolIss());

		criaRegistro(hmValores, getEstiloRegistros());
		aplicarEstilo(retornaLinhaAtual() - 1, COLUNA_E, getEstiloCabecalho());
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_F);
		celulaADireita(retornaLinhaAtual() - 1, COLUNA_G);

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_H);

		tamanhoDeColuna(COLUNA_A, 17);
		tamanhoDeColuna(COLUNA_B, 30);
		tamanhoDeColuna(COLUNA_C, 47);
		tamanhoDeColuna(COLUNA_D, 44);
		tamanhoDeColuna(COLUNA_E, 44);
		tamanhoDeColuna(COLUNA_F, 44);
		tamanhoDeColuna(COLUNA_G, 44);
		tamanhoDeColuna(COLUNA_H, 44);

		efetuarDownload();
	}
	/*PLANILHA MUNICIPIOS*/
	public void planilhaMunicipios(List<MunicipioDTO> listaMunicipio)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Manter Municípios", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Código");
		hmValores.put(COLUNA_B, "Nome");
		hmValores.put(COLUNA_C, "Atualização");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (MunicipioDTO planilha : listaMunicipio) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCodigo());
			hmValores.put(COLUNA_B, planilha.getNome());
			hmValores.put(COLUNA_C, planilha.getDataAtualizacao());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 17);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 12);

		efetuarDownload();
	}
	
	public void planilhaHistoricoRazaoContabil(List<ContaContabilDTO> listaContaContabil) throws Exception {
		criaTitulo(COLUNA_A, "Planilha Histórico Razão Contábil", getEstiloTitulo());
		mesclarCelula(0, 0, COLUNA_A, COLUNA_I);
		
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "COSIF");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put(COLUNA_D, "Serviço");
		hmValores.put(COLUNA_E, "Item");
		hmValores.put(COLUNA_F, "Atualização");
		hmValores.put(COLUNA_G, "Hora");
		hmValores.put(COLUNA_H, "Exclusão");
		hmValores.put(COLUNA_I, "Cód. Funcional");

		criaCabecalho(hmValores, getEstiloCabecalho());

		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ContaContabilDTO planilha : listaContaContabil) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCosifFormatado());
			hmValores.put(COLUNA_B, planilha.getRazao());
			hmValores.put(COLUNA_C, planilha.getConta());
			hmValores.put(COLUNA_D, planilha.getTipoServico());
			hmValores.put(COLUNA_E, planilha.getItem());
			hmValores.put(COLUNA_F, planilha.getAtualizacao());
			hmValores.put(COLUNA_G, planilha.getHoraAtualizacao());
			hmValores.put(COLUNA_H, planilha.getExclusao());
			hmValores.put(COLUNA_I, planilha.getCodigoFuncional());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		efetuarDownload();
	}
	
	/*PLANILHA MUNICIPIOS NOVOS*/
	public void planilhaMunicipiosNovos(
			List<ResultMunicipiosNovosDTO> listaMunicipioNovas)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Resultado de Municípios Novos",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Código");
		hmValores.put(COLUNA_B, "Nome");
		hmValores.put(COLUNA_C, "UF");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ResultMunicipiosNovosDTO planilha : listaMunicipioNovas) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCodigo());
			hmValores.put(COLUNA_B, planilha.getNome());
			hmValores.put(COLUNA_C, planilha.getUf());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 17);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 12);

		efetuarDownload();
	}
	/*PLANILHA CONCILIACAO APURACAO*/
	public void planilhaConciliacaoApuracao(
			ConciliacaoApuracaoVo conciliacaoApuracaoVo,
			DetalharJustificativaApuracaoVO detalharJustificativaApuracaoVO)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Consulta Conciliação da Apuração",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Cosif");
		hmValores.put(COLUNA_B, "Razão");
		hmValores.put(COLUNA_C, "Conta");
		hmValores.put(COLUNA_D, "Nome Conta");
		hmValores.put(COLUNA_E, "Saldo Anterior CCRS");
		hmValores.put(COLUNA_F, "Débito CCRS");
		hmValores.put(COLUNA_G, "Crédito CCRS");
		hmValores.put(COLUNA_H, "Saldo Atual CCRS");
		hmValores.put(COLUNA_I, "Receita Balancete");
		hmValores.put(COLUNA_J, "Receita GISS");
		hmValores.put(COLUNA_K, "Dif. GISS X Balancete");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ListaConciliacaoApuracaoVo planilha : conciliacaoApuracaoVo
				.getLista()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCosif());
			hmValores.put(COLUNA_B, planilha.getGrupoRazaoFormatado());
			hmValores.put(COLUNA_C, planilha.getContaFormatada());
			hmValores.put(COLUNA_D, planilha.getDescContaRazao());
			hmValores.put(COLUNA_E, planilha.getValorSaldoAnteriorCCRS());
			hmValores.put(COLUNA_F, planilha.getValorDebitoCCRS());
			hmValores.put(COLUNA_G, planilha.getValorCreditoCCRS());
			hmValores.put(COLUNA_H, planilha.getValorSaldoAtualCCRS());
			hmValores.put(COLUNA_I, planilha.getValorReceitaBalancete());
			hmValores.put(COLUNA_J, planilha.getValorReceitaGISS());
			hmValores.put(COLUNA_K, planilha.getValorDifReceitaBalancete());

			hmRegistros.put(contador++, hmValores);
		}

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== TOTAL ========== */

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "");
		criaRegistro(hmValores, getEstiloPersonalizado());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Receita CCRS:");
		hmValores.put(COLUNA_C, String.valueOf(conciliacaoApuracaoVo
				.getValorReceitaTotalCCRS()));
		hmValores.put(COLUNA_E, "Valor ISS:");
		hmValores.put(COLUNA_G,
				String.valueOf(conciliacaoApuracaoVo.getValorIssTotal()));

		criaRegistro(hmValores, getEstiloRegistros());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_A, COLUNA_B);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_C, COLUNA_D);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_E, COLUNA_F);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_G, COLUNA_H);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total dos PAs Listados:");
		hmValores.put(COLUNA_C, String.valueOf(conciliacaoApuracaoVo
				.getValorReceitaTotalGISS()));
		criaRegistro(hmValores, getEstiloRegistros());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_A, COLUNA_B);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_C, COLUNA_D);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Valor de Ajuste: ");
		hmValores.put(COLUNA_C,
				String.valueOf(conciliacaoApuracaoVo.getValorAjusteTotal()));
		criaRegistro(hmValores, getEstiloRegistros());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_A, COLUNA_B);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_C, COLUNA_D);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Aliquota Zerada:");
		hmValores.put(COLUNA_C, String.valueOf(conciliacaoApuracaoVo
				.getValorAliquotaZeradaTotal()));
		criaRegistro(hmValores, getEstiloRegistros());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_A, COLUNA_B);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_C, COLUNA_D);

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Oscilação Negativa:");
		hmValores.put(COLUNA_C, String.valueOf(conciliacaoApuracaoVo
				.getValorOscilacaoNegativaTotal()));
		criaRegistro(hmValores, getEstiloRegistros());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_A, COLUNA_B);
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_C, COLUNA_D);

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_K);

		tamanhoDeColuna(COLUNA_A, 17);
		tamanhoDeColuna(COLUNA_B, 19);
		tamanhoDeColuna(COLUNA_C, 12);
		tamanhoDeColuna(COLUNA_D, 60);
		tamanhoDeColuna(COLUNA_E, 22);
		tamanhoDeColuna(COLUNA_F, 17);
		tamanhoDeColuna(COLUNA_G, 17);
		tamanhoDeColuna(COLUNA_H, 20);
		tamanhoDeColuna(COLUNA_I, 20);
		tamanhoDeColuna(COLUNA_J, 17);
		tamanhoDeColuna(COLUNA_K, 22);

		if (detalharJustificativaApuracaoVO.getLista().size() > 0) {

			hmValores = new HashMap<Integer, Object>();
			hmValores.put(COLUNA_A, "");
			criaRegistro(hmValores, getEstiloPersonalizado());

			/* ======= SEGUNDA LISTA======== */
			criaTitulo(COLUNA_A, "Justificativa", getEstiloTitulo());
			mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
					COLUNA_A, COLUNA_E);

			/* ======= CABEÇALHO ======== */
			HashMap<Integer, Object> hmValoresJust = new HashMap<Integer, Object>();

			hmValoresJust.put(COLUNA_A, "Data Atualização");
			hmValoresJust.put(COLUNA_B, "Valor de Ajuste  ");
			hmValoresJust.put(COLUNA_C, "Justificativa");
			hmValoresJust.put(COLUNA_E, "Usuário");

			criaCabecalho(hmValoresJust, getEstiloCabecalho());
			mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
					COLUNA_C, COLUNA_D);

			/* ======= CONTEUDO CABEÇALHO ======== */
			HashMap<Integer, HashMap<Integer, Object>> hmRegistrosJust = new HashMap<Integer, HashMap<Integer, Object>>();
			int contadorJ = 0;
			for (ListaJustificativaApuracaoVO planilhaJ : detalharJustificativaApuracaoVO
					.getLista()) {

				hmValoresJust = new HashMap<Integer, Object>();

				hmValoresJust.put(COLUNA_A, planilhaJ.getDataAtualizacao());
				hmValoresJust.put(COLUNA_B, planilhaJ.getSinalJustificativa()
						+ planilhaJ.getValorJustificativa());
				hmValoresJust.put(COLUNA_C, planilhaJ.getDescJustificativa());
				hmValoresJust.put(COLUNA_E, planilhaJ.getCodUsuarioManut());

				hmRegistrosJust.put(contadorJ++, hmValoresJust);
			}

			criaRegistros(hmRegistrosJust, getEstiloRegistros());
			mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
					COLUNA_C, COLUNA_D);
		}
		efetuarDownload();
	}

	/**
	 * @nome: planilhaApuracao
	 * @propósito: Método responsável por planilhaApuracao.
	 * 
	 * @param lista
	 *            List<RelatorioSaidaISSDTO>
	 * @throws Exception
	 */
	public void planilhaApuracao(List<RelatorioSaidaISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		HashMap<Integer, Object> hmTitulo = new HashMap<Integer, Object>();
		hmTitulo.put(COLUNA_A, "Planilha Relatório Apuração");
		hmTitulo.put(COLUNA_B, "");
		hmTitulo.put(COLUNA_C, "");
		hmTitulo.put(COLUNA_D, "");
		hmTitulo.put(COLUNA_E, "");
		hmTitulo.put(COLUNA_F, "");
		hmTitulo.put(COLUNA_G, "ISS DOMICÍLIO PRESTADOR");
		hmTitulo.put(COLUNA_H, "");
		hmTitulo.put(COLUNA_I, "");
		hmTitulo.put(COLUNA_J, "ISS DOMICÍLIO TOMADOR");
		hmTitulo.put(COLUNA_K, "");
		hmTitulo.put(COLUNA_L, "");
		criaCabecalho(hmTitulo, getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Competência");
		hmValores.put(COLUNA_D, "Receita Apurada");
		hmValores.put(COLUNA_E, "Alíquota");
		hmValores.put(COLUNA_F, "ISS Apurado");
		hmValores.put(COLUNA_G,
				"Município Prestador (IBGE - Nome do Município)");
		hmValores.put(COLUNA_H, "UF Município Prestador");
		hmValores.put(COLUNA_I, "ISS Domicílio Prestador");
		hmValores.put(COLUNA_J, "Município Tomador (IBGE - Nome do Município)");
		hmValores.put(COLUNA_K, "UF Município Tomador");
		hmValores.put(COLUNA_L, "ISS Domicílio Tomador");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (RelatorioSaidaISSDTO item : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, item.getNomeEmpresa());
			hmValores.put(COLUNA_B, item.getProduto());
			hmValores.put(COLUNA_C, item.getDtMesAno());
			hmValores.put(COLUNA_D, item.getValorTotalCredito());
			hmValores.put(COLUNA_E, item.getPercentualAliquotaTomador());
			hmValores.put(COLUNA_F, item.getValorTotalApuracao());
			hmValores.put(COLUNA_G, item.getDescMunicipioPrestador());
			hmValores.put(COLUNA_H, item.getSiglaUfPrestador());
			hmValores.put(COLUNA_I, item.getValorTotalApuracaoPrestador());
			hmValores.put(COLUNA_J, item.getDescMunicipioTomador());
			hmValores.put(COLUNA_K, item.getSiglaUfTomador());
			hmValores.put(COLUNA_L, item.getValorTotalApuracaoTomador());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_F);
		mesclarCelula(0, 0, COLUNA_G, COLUNA_I);
		mesclarCelula(0, 0, COLUNA_J, COLUNA_L);

		tamanhoDeColuna(COLUNA_A, 60);
		tamanhoDeColuna(COLUNA_B, 60);
		tamanhoDeColuna(COLUNA_C, 14);
		tamanhoDeColuna(COLUNA_D, 24);
		tamanhoDeColuna(COLUNA_E, 24);
		tamanhoDeColuna(COLUNA_F, 24);
		tamanhoDeColuna(COLUNA_G, 60);
		tamanhoDeColuna(COLUNA_H, 24);
		tamanhoDeColuna(COLUNA_I, 24);
		tamanhoDeColuna(COLUNA_J, 60);
		tamanhoDeColuna(COLUNA_K, 24);
		tamanhoDeColuna(COLUNA_L, 24);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaDetCadastroEmpresa
	 * @propósito: Método responsável por planilhaDetCadastroEmpresa.
	 * 
	 * @param dto
	 *            EmpresaISSDTO
	 * @throws Exception
	 */
	public void planilhaDetCadastroEmpresa(EmpresaISSDTO dto) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Detalhar Cadastro Empresa", getEstiloTitulo());
		HashMap<Integer, Object> hmValores2 = null;
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Código Empresa:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getCodEmpresa()));
		hmValores.put(COLUNA_C, "CNPJ Empresa:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getCnpjFormatado()));
		hmValores.put(COLUNA_E, "Descrição Empresa:");
		hmValores.put(COLUNA_F, String.valueOf(dto.getDescEmpresa()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Percentual para Rejeição de Arquivo:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getPerRejeicaoArquivo()));
		hmValores.put(COLUNA_C, "Sistema Contábil:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getDescSistemaContabil()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Conta Despesa ISS:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getContaDespesa()));
		hmValores.put(COLUNA_C, "Conta Provisão ISS:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getContaProvisao()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Identificação do Contribuinte:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getCodigoContribuinte()));
		hmValores.put(COLUNA_C, "Nome do Contato:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getNomeResponsavel()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Telefone:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getTelResponsavel()));
		hmValores.put(COLUNA_C, "E-mail:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getEmailResponsavel()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Logradouro:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getLogradouro()));
		hmValores.put(COLUNA_C, "Número:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getNroEndereco()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Complemento:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getComplEndereco()));
		hmValores.put(COLUNA_C, "CEP:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getCep()));
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Bairro:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getBairro()));
		hmValores.put(COLUNA_C, "");
		hmValores.put(COLUNA_D, "");
		criaRegistro(hmValores, getEstiloRegistros());

		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Estado:");
		hmValores.put(COLUNA_B, String.valueOf(dto.getDescEstado()));
		hmValores.put(COLUNA_C, "Cód Município IBGE:");
		hmValores.put(COLUNA_D, String.valueOf(dto.getCodMunicipio()));
		hmValores.put(COLUNA_E, "Município:");
		hmValores.put(COLUNA_F, String.valueOf(dto.getDescMunicipios()));
		criaRegistro(hmValores, getEstiloRegistros());
		pularLinha(1);

		/* ======= CABEÇALHO ======== */
		hmValores2 = new HashMap<Integer, Object>();

		hmValores2.put(COLUNA_A, "Resumo");
		hmValores2.put(COLUNA_B, "COSIF");
		hmValores2.put(COLUNA_C, "Conta Receita");
		hmValores2.put(COLUNA_D, "Item de Serviço da LC");

		criaCabecalho(hmValores2, getEstiloCabecalho());
		mesclarCelula(retornaLinhaAtual() - 1, retornaLinhaAtual() - 1,
				COLUNA_D, COLUNA_F);
		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();

		int contador = 0;
		for (ContasISSDTO item : dto.getContas().getListaContas()) {

			hmValores2 = new HashMap<Integer, Object>();

			hmValores2.put(COLUNA_A, String.valueOf(item.getContaResumo()));
			hmValores2.put(COLUNA_B, String.valueOf(item.getCosifExibicao()));
			hmValores2
					.put(COLUNA_C, String.valueOf(item.getDescContaReceita()));
			hmValores2.put(COLUNA_D,
					String.valueOf(item.getDescItemServicoLC()));

			hmRegistros.put(contador++, hmValores2);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());
		int tamanhoLista = dto.getContas().getListaContas().size();
		while (tamanhoLista > 0) {
			mesclarCelula(retornaLinhaAtual() - tamanhoLista,
					retornaLinhaAtual() - tamanhoLista, COLUNA_D, COLUNA_F);
			tamanhoLista--;
		}
		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_F);

		tamanhoDeColuna(COLUNA_A, 35);
		tamanhoDeColuna(COLUNA_B, 25);
		tamanhoDeColuna(COLUNA_C, 45);
		tamanhoDeColuna(COLUNA_D, 25);
		tamanhoDeColuna(COLUNA_E, 18);
		tamanhoDeColuna(COLUNA_F, 35);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaMunicipiosIss
	 * @propósito: Método responsável por planilhaMunicipiosIss.
	 * 
	 * @param dto
	 *            MunicipioISSDTO
	 * @throws Exception
	 */
	public void planilhaMunicipiosIss(MunicipioISSDTO dto) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Manter Municípios ISS",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Código");
		hmValores.put(COLUNA_B, "Nome");
		hmValores.put(COLUNA_C, "UF");
		hmValores.put(COLUNA_D, "Status");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (MunicipioISSDTO item : dto.getLista()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, item.getCodMunicipio());
			hmValores.put(COLUNA_B, item.getDescMunicipios());
			hmValores.put(COLUNA_C, item.getSiglaUf());
			hmValores.put(COLUNA_D, item.getDescStatus());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_D);

		tamanhoDeColuna(COLUNA_A, 17);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 12);
		tamanhoDeColuna(COLUNA_D, 17);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaItemServicoIss
	 * @propósito: Método responsável por planilhaItemServicoIss.
	 * 
	 * @param dto
	 *            ItemServicoLcISSDTO
	 * @throws Exception
	 */
	public void planilhaItemServicoIss(ItemServicoLcISSDTO dto)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Item de Serviço da LC",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Item de Serviço da LC");
		hmValores.put(COLUNA_B, "Descrição");
		hmValores.put(COLUNA_C, "Status");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ItemServicoLcISSDTO item : dto.getLista()) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, item.getCodItemLcFormatado());
			hmValores.put(COLUNA_B, item.getDescItemLc());
			hmValores.put(COLUNA_C, item.getDescStatus());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 24);
		tamanhoDeColuna(COLUNA_B, 72.14);
		tamanhoDeColuna(COLUNA_C, 17);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaHistoricoMinMaxAliquota
	 * @propósito: Método responsável por planilhaHistoricoMinMaxAliquota.
	 * 
	 * @param lista
	 *            List<AliquotaISSDTO>
	 * @throws Exception
	 */
	public void planilhaHistoricoMinMaxAliquota(List<AliquotaISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A,
				"Planilha Histórico de Mínimo e Máximo de Alíquota",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Data Início Vigência");
		hmValores.put(COLUNA_B, "Data Fim Vigência");
		hmValores.put(COLUNA_C, "% Alíquota (Mínimo)");
		hmValores.put(COLUNA_D, "% Alíquota (Máximo)");
		hmValores.put(COLUNA_E, "Usuário");
		hmValores.put(COLUNA_F, "Data de Alteração");
		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (AliquotaISSDTO item : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, item.getDataInicioVigencia());
			hmValores.put(COLUNA_B, item.getDataFimVigencia());
			hmValores.put(COLUNA_C, item.getPorcentAliquotaMin());
			hmValores.put(COLUNA_D, item.getPorcentAliquotaMax());
			hmValores.put(COLUNA_E, item.getUsuario());
			hmValores.put(COLUNA_F, item.getDataAlteracao());
			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_F);

		tamanhoDeColuna(COLUNA_A, 20);
		tamanhoDeColuna(COLUNA_B, 20);
		tamanhoDeColuna(COLUNA_C, 22);
		tamanhoDeColuna(COLUNA_D, 22);
		tamanhoDeColuna(COLUNA_E, 15);
		tamanhoDeColuna(COLUNA_F, 27);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaArquivosEmp
	 * @propósito: Método responsável por planilhaArquivosEmp.
	 * 
	 * @param lista
	 *            ArrayList<ArquivoEmpresaISSDTO>
	 * @throws Exception
	 */
	public void planilhaArquivosEmp(ArrayList<ArquivoEmpresaISSDTO> lista,
			ArquivoEmpresaISSDTO dto) throws Exception {

		/* =========== TITULO ========== */

		HashMap<Integer, Object> hmTitulo = new HashMap<Integer, Object>();

		hmTitulo.put(COLUNA_A,
				"Planilha Arquivos das Empresas (Painel de Controle)");
		if (dto.getIndicadorTela() == "S") {
			hmTitulo.put(COLUNA_B, "");
			hmTitulo.put(COLUNA_C, "");
			hmTitulo.put(COLUNA_D, "");
			hmTitulo.put(COLUNA_E, "");
			hmTitulo.put(COLUNA_F, "");
			hmTitulo.put(COLUNA_G, "");
			hmTitulo.put(COLUNA_H, "");
			hmTitulo.put(COLUNA_I, "");
			hmTitulo.put(COLUNA_J, "");
			hmTitulo.put(COLUNA_K, "");
			hmTitulo.put(COLUNA_L, "");
			hmTitulo.put(COLUNA_M, "");
			hmTitulo.put(COLUNA_N, "");
			hmTitulo.put(COLUNA_O, "");
			hmTitulo.put(COLUNA_P, "");
			hmTitulo.put(COLUNA_Q, "");
		} else {

			hmTitulo.put(COLUNA_B, "");
			hmTitulo.put(COLUNA_C, "");
			hmTitulo.put(COLUNA_D, "");
			hmTitulo.put(COLUNA_E, "");
			hmTitulo.put(COLUNA_F, "");
			hmTitulo.put(COLUNA_G, "");
			hmTitulo.put(COLUNA_H, "");
			hmTitulo.put(COLUNA_I, "");
			hmTitulo.put(COLUNA_J, "");
			hmTitulo.put(COLUNA_K, "");
			hmTitulo.put(COLUNA_L, "");
			hmTitulo.put(COLUNA_M, "");
			hmTitulo.put(COLUNA_N, "");
			hmTitulo.put(COLUNA_O, "");
			hmTitulo.put(COLUNA_P, "");
			hmTitulo.put(COLUNA_Q, "ISS DOMICÍLIO PRESTADOR");
			hmTitulo.put(COLUNA_R, "");
			hmTitulo.put(COLUNA_S, "ISS DOMICÍLIO TOMADOR");
			hmTitulo.put(COLUNA_T, "");
		}

		criaCabecalho(hmTitulo, getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		if (dto.getIndicadorTela() == "S") {
			hmValores.put(COLUNA_C, "Período Enviado");
			hmValores.put(COLUNA_D, "Mês Competência");
			hmValores.put(COLUNA_E, "Data Recepção");
			hmValores.put(COLUNA_F, "Status Arquivo");
			hmValores.put(COLUNA_G, "Cód. Finalidade");
			hmValores.put(COLUNA_H, "Total de Registros");
			hmValores.put(COLUNA_I, "Rejeitados");
			hmValores.put(COLUNA_J, "% Rejeição");
			hmValores.put(COLUNA_K, "Receita Rejeitados");
			hmValores.put(COLUNA_L, "Aceitos");
			hmValores.put(COLUNA_M, "Receita Aceitos");
			hmValores.put(COLUNA_N, "Registro Base Negativa");
			hmValores.put(COLUNA_O, "Valor Receita Base Negativa");
			hmValores.put(COLUNA_P, "Base de Cálculo Apurada");
			hmValores.put(COLUNA_Q, "Valor de Cálculo ISS");
		} else {

			hmValores.put(COLUNA_C, "Mês Competência");
			hmValores.put(COLUNA_D, "Data Recepção");
			hmValores.put(COLUNA_E, "Status Arquivo");
			hmValores.put(COLUNA_F, "Cód. Finalidade");
			hmValores.put(COLUNA_G, "Total de Registros");
			hmValores.put(COLUNA_H, "Rejeitados");
			hmValores.put(COLUNA_I, "% Rejeição");
			hmValores.put(COLUNA_J, "Receita Rejeitados");
			hmValores.put(COLUNA_K, "Aceitos");
			hmValores.put(COLUNA_L, "Receita Aceitos");
			hmValores.put(COLUNA_M, "Registro Base Negativa");
			hmValores.put(COLUNA_N, "Valor Receita Base Negativa");
			hmValores.put(COLUNA_O, "Base de Cálculo Apurada");
			hmValores.put(COLUNA_P, "Valor de Cálculo ISS");
			hmValores.put(COLUNA_Q, "% da Regra Transição");
			hmValores.put(COLUNA_R, "Valor Total do ISS");
			hmValores.put(COLUNA_S, "% da Regra Transição");
			hmValores.put(COLUNA_T, "Valor Total do ISS");
		}

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ArquivoEmpresaISSDTO item : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, String.valueOf(item.getCodEmpresa()));
			hmValores.put(COLUNA_B, item.getProduto());
			if (dto.getIndicadorTela() == "S") {
				hmValores.put(COLUNA_C, item.getPeriodoEnviado());
				hmValores.put(COLUNA_D, item.getAnoMesFormatado());
				hmValores.put(COLUNA_E, item.getDataRecepcao());
				hmValores.put(COLUNA_F, item.getStatusArquivo());
				hmValores.put(COLUNA_G, item.getCodFinalidade());
				hmValores.put(COLUNA_H, String.valueOf(item.getQtdeRegistros()));
				hmValores.put(COLUNA_I, String.valueOf(item.getRejeitados()));
				hmValores.put(COLUNA_J, item.getPorcentRejeicao());
				hmValores.put(COLUNA_K, item.getReceitaRejeitados());
				hmValores.put(COLUNA_L, String.valueOf(item.getAceitos()));
				hmValores.put(COLUNA_M, item.getReceitaAceitos());
				hmValores.put(COLUNA_N, String.valueOf(item.getQtdRegistroBaseNegativa()));
				hmValores.put(COLUNA_O, item.getValorReceitaBaseNegativa());
				hmValores.put(COLUNA_P, item.getBaseCalcApurada());
				hmValores.put(COLUNA_Q, item.getValorCalcIss());
			} else {
				hmValores.put(COLUNA_C, item.getAnoMesFormatado());
				hmValores.put(COLUNA_D, item.getDataRecepcao());
				hmValores.put(COLUNA_E, item.getStatusArquivo());
				hmValores.put(COLUNA_F, item.getCodFinalidade());
				hmValores
						.put(COLUNA_G, String.valueOf(item.getQtdeRegistros()));
				hmValores.put(COLUNA_H, String.valueOf(item.getRejeitados()));
				hmValores.put(COLUNA_I, item.getPorcentRejeicao());
				hmValores.put(COLUNA_J, item.getReceitaRejeitados());
				hmValores.put(COLUNA_K, String.valueOf(item.getAceitos()));
				hmValores.put(COLUNA_L, item.getReceitaAceitos());
				hmValores.put(COLUNA_M,
						String.valueOf(item.getQtdRegistroBaseNegativa()));
				hmValores.put(COLUNA_N, item.getValorReceitaBaseNegativa());
				hmValores.put(COLUNA_O, item.getBaseCalcApurada());
				hmValores.put(COLUNA_P, item.getValorCalcIss());
				hmValores.put(COLUNA_Q, item.getPercDistrIssPrestador());
				hmValores.put(COLUNA_R, item.getValorTotalApuracaoPrestador());
				hmValores.put(COLUNA_S, item.getPercDistrIssTomador());
				hmValores.put(COLUNA_T, item.getValorTotalApuracaoTomador());
			}

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		if(dto.getIndicadorTela()== "S"){
			mesclarCelula(0, 0, COLUNA_A, COLUNA_Q);
		}else{
			mesclarCelula(0, 0, COLUNA_A, COLUNA_P);
			mesclarCelula(0, 0, COLUNA_Q, COLUNA_R);
			mesclarCelula(0, 0, COLUNA_S, COLUNA_T);
		}
		

		tamanhoDeColuna(COLUNA_A, 15);
		tamanhoDeColuna(COLUNA_B, 45);
		tamanhoDeColuna(COLUNA_C, 18);
		tamanhoDeColuna(COLUNA_D, 18);
		tamanhoDeColuna(COLUNA_E, 35);
		tamanhoDeColuna(COLUNA_F, 35);
		tamanhoDeColuna(COLUNA_G, 16);
		tamanhoDeColuna(COLUNA_H, 16);
		tamanhoDeColuna(COLUNA_I, 16);
		tamanhoDeColuna(COLUNA_J, 30);
		tamanhoDeColuna(COLUNA_K, 16);
		tamanhoDeColuna(COLUNA_L, 30);
		tamanhoDeColuna(COLUNA_M, 30);
		tamanhoDeColuna(COLUNA_N, 30);
		tamanhoDeColuna(COLUNA_O, 30);
		tamanhoDeColuna(COLUNA_P, 30);
		tamanhoDeColuna(COLUNA_Q, 30);
		tamanhoDeColuna(COLUNA_R, 30);
		tamanhoDeColuna(COLUNA_S, 30);
		tamanhoDeColuna(COLUNA_T, 30);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaInformacoesAliquota
	 * @propósito: Método responsável por planilhaInformacoesAliquota.
	 * 
	 * @param lista
	 *            List<AliquotaISSDTO>
	 * @throws Exception
	 */
	public void planilhaInformacoesAliquota(List<AliquotaISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha de Informações de Alíquotas",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Item de Serviço da LC");
		hmValores.put(COLUNA_B, "Alíquota");
		hmValores.put(COLUNA_C, "Competência");
		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (AliquotaISSDTO item : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					item.getCodLeiCompl() + " - " + item.getDescLeiCompl());
			hmValores.put(COLUNA_B, item.getAliquota());
			hmValores.put(
					COLUNA_C,
					item.getDataInicioVigencia() + " - "
							+ item.getDataFimVigencia());
			hmRegistros.put(contador++, hmValores);
		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 70);
		tamanhoDeColuna(COLUNA_B, 15);
		tamanhoDeColuna(COLUNA_C, 30);

		efetuarDownload();

	}

	/**
	 * @nome: planilhaPgtosVencidosComp
	 * @propósito: Método responsável por planilhaPgtosVencidosComp.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPgtosVencidosComp(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(
				COLUNA_A,
				"Planilha Valores apurados de municípios com data para pagamento vencida",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Competência");
		hmValores.put(COLUNA_B, "Empresa");
		hmValores.put(COLUNA_C, "Produto");
		hmValores.put(COLUNA_D, "Valor do ISS");
		hmValores.put(COLUNA_E, "Município");
		hmValores.put(COLUNA_F, "Vencimento");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCompetencia());
			hmValores.put(COLUNA_B,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(COLUNA_C, planilha.getProduto());
			hmValores.put(COLUNA_D, planilha.getValorProvisionado());
			hmValores.put(COLUNA_E,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());
			hmValores.put(COLUNA_F, planilha.getVencimento());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorProvisionado());

			hmRegistros.put(contador++, hmValores);

		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_D,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_F);

		tamanhoDeColuna(COLUNA_A, 20);
		tamanhoDeColuna(COLUNA_B, 42);
		tamanhoDeColuna(COLUNA_C, 33);
		tamanhoDeColuna(COLUNA_D, 35);
		tamanhoDeColuna(COLUNA_E, 59);
		tamanhoDeColuna(COLUNA_F, 21);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaPgtosNaoGerados
	 * @propósito: Método responsável por planilhaPgtosNaoGerados.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPgtosNaoGerados(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(
				COLUNA_A,
				"Planilha dos valores apurados de municípios sem dados bancários",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Competência");
		hmValores.put(COLUNA_B, "Empresa");
		hmValores.put(COLUNA_C, "Produto");
		hmValores.put(COLUNA_D, "Valor do ISS");
		hmValores.put(COLUNA_E, "Município");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCompetencia());
			hmValores.put(COLUNA_B,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(COLUNA_C, planilha.getProduto());
			hmValores.put(COLUNA_D, planilha.getValorProvisionado());
			hmValores.put(COLUNA_E,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorProvisionado());

			hmRegistros.put(contador++, hmValores);

		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_D,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_E);

		tamanhoDeColuna(COLUNA_A, 20);
		tamanhoDeColuna(COLUNA_B, 42);
		tamanhoDeColuna(COLUNA_C, 33);
		tamanhoDeColuna(COLUNA_D, 35);
		tamanhoDeColuna(COLUNA_E, 59);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaPgtosNaoElegiveis
	 * @propósito: Método responsável por planilhaPgtosNaoElegiveis.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPgtosNaoElegiveis(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(
				COLUNA_A,
				"Planilha dos valores apurados de municípios não elegíveis para pagamento",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Competência");
		hmValores.put(COLUNA_B, "Empresa");
		hmValores.put(COLUNA_C, "Produto");
		hmValores.put(COLUNA_D, "Valor do ISS");
		hmValores.put(COLUNA_E, "Município");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {
			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCompetencia());
			hmValores.put(COLUNA_B,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(COLUNA_C, planilha.getProduto());
			hmValores.put(COLUNA_D, planilha.getValorProvisionado());
			hmValores.put(COLUNA_E,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorProvisionado());

			hmRegistros.put(contador++, hmValores);
		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_D,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_E);

		tamanhoDeColuna(COLUNA_A, 23);
		tamanhoDeColuna(COLUNA_B, 42);
		tamanhoDeColuna(COLUNA_C, 33);
		tamanhoDeColuna(COLUNA_D, 35);
		tamanhoDeColuna(COLUNA_E, 59);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaConsultarPagamentos
	 * @propósito: Método responsável por planilhaConsultarPagamentos.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaConsultarPagamentos(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Consultar TED e Transferência",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Competência");
		hmValores.put(COLUNA_D, "Município");
		hmValores.put(COLUNA_E, "Valor do ISS");
		hmValores.put(COLUNA_F, "Data original");
		hmValores.put(COLUNA_G, "Data agendamento");
		hmValores.put(COLUNA_H, "Status");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {
			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(COLUNA_B, planilha.getProduto());
			hmValores.put(COLUNA_C, planilha.getCompetencia());
			hmValores.put(COLUNA_D,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());
			hmValores.put(COLUNA_E, planilha.getValorIssPgto());
			hmValores.put(COLUNA_F, planilha.getDtAgendamento());
			hmValores.put(COLUNA_G, planilha.getDtPagamento());
			hmValores.put(COLUNA_H, planilha.getDescStatus());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorIssPgto());

			hmRegistros.put(contador++, hmValores);
		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_E,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_H);

		tamanhoDeColuna(COLUNA_A, 40);
		tamanhoDeColuna(COLUNA_B, 27);
		tamanhoDeColuna(COLUNA_C, 13);
		tamanhoDeColuna(COLUNA_D, 60);
		tamanhoDeColuna(COLUNA_E, 28);
		tamanhoDeColuna(COLUNA_F, 13);
		tamanhoDeColuna(COLUNA_G, 19);
		tamanhoDeColuna(COLUNA_H, 67);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaPesquisarPagtoManual
	 * @propósito: Método responsável por planilhaPesquisarPagtoManual.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPesquisarPagtoManual(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Pesquisa Pagamento Manual",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Competência");
		hmValores.put(COLUNA_D, "Município");
		hmValores.put(COLUNA_E, "Valor do ISS");
		hmValores.put(COLUNA_F, "Data Original");
		hmValores.put(COLUNA_G, "Data Agendamento");
		hmValores.put(COLUNA_H, "Status");
		hmValores.put(COLUNA_I, "Tipo de Crédito");
		hmValores.put(COLUNA_J, "Dados para Pgto");
		hmValores.put(COLUNA_K, "Elegível para Pgto");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(
					COLUNA_B,
					planilha.getCodProduto() + "-"
							+ planilha.getProduto());
			hmValores.put(COLUNA_C, planilha.getCompetencia());
			hmValores.put(COLUNA_D,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());
			hmValores.put(COLUNA_E, planilha.getValorIssPgto());
			hmValores.put(COLUNA_F, planilha.getDtOriginal());
			hmValores.put(COLUNA_G, planilha.getDtVencimento());
			hmValores.put(COLUNA_H, planilha.getDescStatus());
			hmValores.put(COLUNA_I, planilha.getDescTipoCredito());
			hmValores.put(
					COLUNA_J,
					planilha.getBanco() + " " + planilha.getAgencia() + " "
							+ planilha.getConta() + "-"
							+ planilha.getDigitoConta());
			hmValores.put(COLUNA_K, planilha.getElegivelParaPagamento());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorIssPgto());

			hmRegistros.put(contador++, hmValores);

		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_E,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_K);

		tamanhoDeColuna(COLUNA_A, 50);
		tamanhoDeColuna(COLUNA_B, 26);
		tamanhoDeColuna(COLUNA_C, 15);
		tamanhoDeColuna(COLUNA_D, 40);
		tamanhoDeColuna(COLUNA_E, 40);
		tamanhoDeColuna(COLUNA_F, 25);
		tamanhoDeColuna(COLUNA_G, 35);
		tamanhoDeColuna(COLUNA_H, 26);
		tamanhoDeColuna(COLUNA_I, 32);
		tamanhoDeColuna(COLUNA_J, 25);
		tamanhoDeColuna(COLUNA_K, 25);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaPesquisarPagtoManualCalculo
	 * @propósito: Método responsável por planilhaPesquisarPagtoManualCalculo.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPesquisarPagtoManualCalculo(
			List<LiberarPagtoISSDTO> lista) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Pesquisa Pagamento Manual Calculado",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Competência");
		hmValores.put(COLUNA_D, "Município");
		hmValores.put(COLUNA_E, "Valor do ISS");
		hmValores.put(COLUNA_F, "Acréscimo de Juros/Multa");
		hmValores.put(COLUNA_G, "Atualização Monetária(%)");
		hmValores.put(COLUNA_H, "Valor Atualização Monetária");
		hmValores.put(COLUNA_I, "Valor Atualizado");
		hmValores.put(COLUNA_J, "Data Original");
		hmValores.put(COLUNA_K, "Data Agendamento");
		hmValores.put(COLUNA_L, "Status");
		hmValores.put(COLUNA_M, "Tipo de Crédito");
		hmValores.put(COLUNA_N, "Dados para Pgto");
		hmValores.put(COLUNA_O, "Elegível para Pgto");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(
					COLUNA_B,
					planilha.getCodProduto() + "-"
							+ planilha.getProduto());
			hmValores.put(COLUNA_C, planilha.getCompetencia());
			hmValores.put(COLUNA_D,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());
			hmValores.put(COLUNA_E, planilha.getValorIssPgto());
			hmValores.put(COLUNA_F, planilha.getValorAcrescimoJurosMulta());
			hmValores.put(COLUNA_G,
					planilha.getPercentualAtualizacaoMonetaria());
			hmValores.put(COLUNA_H, planilha.getValorAtualizacaoMonetaria());
			hmValores.put(COLUNA_I, planilha.getValorIssPgtoAtualizado());
			hmValores.put(COLUNA_J, planilha.getDtOriginal());
			hmValores.put(COLUNA_K, planilha.getDtVencimento());
			hmValores.put(COLUNA_L, planilha.getDescStatus());
			hmValores.put(COLUNA_M, planilha.getDescTipoCredito());
			hmValores.put(
					COLUNA_N,
					planilha.getBanco() + " " + planilha.getAgencia() + " "
							+ planilha.getConta() + "-"
							+ planilha.getDigitoConta());
			hmValores.put(COLUNA_O, planilha.getElegivelParaPagamento());

			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorIssPgto());

			hmRegistros.put(contador++, hmValores);

		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_E,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_O);

		tamanhoDeColuna(COLUNA_A, 50);
		tamanhoDeColuna(COLUNA_B, 26);
		tamanhoDeColuna(COLUNA_C, 15);
		tamanhoDeColuna(COLUNA_D, 40);
		tamanhoDeColuna(COLUNA_E, 40);
		tamanhoDeColuna(COLUNA_F, 40);
		tamanhoDeColuna(COLUNA_G, 40);
		tamanhoDeColuna(COLUNA_H, 40);
		tamanhoDeColuna(COLUNA_I, 40);
		tamanhoDeColuna(COLUNA_J, 25);
		tamanhoDeColuna(COLUNA_K, 35);
		tamanhoDeColuna(COLUNA_L, 26);
		tamanhoDeColuna(COLUNA_M, 32);
		tamanhoDeColuna(COLUNA_N, 25);
		tamanhoDeColuna(COLUNA_O, 25);

		efetuarDownload();
	}

	/**
	 * @nome: convertStringToDouble
	 * @propósito: Método responsável por convertStringToDouble.
	 * 
	 * @param valor
	 *            String
	 * @return double
	 */
	public double convertStringToDouble(String valor) {
		String valorFormatado = valor.replace(".", "").replace(",", ".");
		double valorConvertido = Double.valueOf(valorFormatado);
		return valorConvertido;
	}

	/**
	 * @nome: planilhaLiberarPagamentoIss
	 * @propósito: Método responsável por planilhaLiberarPagamentoIss.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaLiberarPagamentoIss(List<LiberarPagtoISSDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, getNomeArquivo(), getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Situação do Pagamento");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getEmpresa());
			hmValores.put(COLUNA_B, planilha.getProduto());
			hmValores.put(COLUNA_C, planilha.getDescCodStatus());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 30);
		tamanhoDeColuna(COLUNA_B, 60);
		tamanhoDeColuna(COLUNA_C, 50);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaLiberarPagamentoIssMovimento
	 * @propósito: Método responsável por planilhaLiberarPagamentoIssMovimento.
	 * 
	 * @param lista
	 *            List<MovimentoRetificadorDTO>
	 * @throws Exception
	 */
	public void planilhaLiberarPagamentoIssMovimento(
			List<MovimentoRetificadorDTO> lista) throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(
				COLUNA_A,
				"Planilha Liberar Pagamentos ISS - Movimento Retificador e Complementar",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Produto");
		hmValores.put(COLUNA_C, "Situação do Pagamento");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (MovimentoRetificadorDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, planilha.getCodigoEmpresa());
			hmValores.put(COLUNA_B, planilha.getNomeProduto());
			hmValores.put(COLUNA_C,
					planilha.getDescricaoIdentificadorProcessamentoIss());

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_C);

		tamanhoDeColuna(COLUNA_A, 30);
		tamanhoDeColuna(COLUNA_B, 60);
		tamanhoDeColuna(COLUNA_C, 50);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaPgtoLoteSelecionados
	 * @propósito: Método responsável por planilhaPgtoLoteSelecionados.
	 * 
	 * @param lista
	 *            List<LiberarPagtoISSDTO>
	 * @throws Exception
	 */
	public void planilhaPgtoLoteSelecionados(List<LiberarPagtoISSDTO> lista)
			throws Exception {
		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha de Pagamento em Lote", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, "Empresa");
		hmValores.put(COLUNA_B, "Serviço/Produto");
		hmValores.put(COLUNA_C, "Competência");
		hmValores.put(COLUNA_D, "Município");
		hmValores.put(COLUNA_E, "Valor Base de Cálculo ISS");
		hmValores.put(COLUNA_F, "Valor de ISS (Pgto)");
		hmValores.put(COLUNA_G, "Banco");
		hmValores.put(COLUNA_H, "Agência");
		hmValores.put(COLUNA_I, "Conta");

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		double contadorBaseCalcIss = 0;
		double contadorValorIssPgto = 0;

		for (LiberarPagtoISSDTO planilha : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					planilha.getEmpresa() + "-" + planilha.getDescEmpresa());
			hmValores.put(
					COLUNA_B,
					planilha.getCodProduto() + "-"
							+ planilha.getDescricaoProd());
			hmValores.put(COLUNA_C, planilha.getCompetencia());
			hmValores.put(COLUNA_D,
					planilha.getCodMunicipio() + "-" + planilha.getMunicipio());
			hmValores.put(COLUNA_E, planilha.getValorDeIss());
			hmValores.put(COLUNA_F, planilha.getValorIssPgto());
			hmValores.put(COLUNA_G, planilha.getBanco());
			hmValores.put(COLUNA_H, planilha.getAgencia());
			hmValores.put(COLUNA_I,
					planilha.getConta() + "-" + planilha.getDigitoConta());

			contadorBaseCalcIss = contadorBaseCalcIss
					+ convertStringToDouble(planilha.getValorDeIss());
			contadorValorIssPgto = contadorValorIssPgto
					+ convertStringToDouble(planilha.getValorIssPgto());

			hmRegistros.put(contador++, hmValores);

		}
		contador++;
		hmValores = new HashMap<Integer, Object>();
		hmValores.put(COLUNA_A, "Total de Registros: " + lista.size());
		hmValores.put(COLUNA_E,
				"Total: R$ " + NumberUtils.format(contadorBaseCalcIss));
		hmValores.put(COLUNA_F,
				"Total: R$ " + NumberUtils.format(contadorValorIssPgto));

		hmRegistros.put(contador++, hmValores);

		criaRegistros(hmRegistros, getEstiloRegistros());

		/* =========== FORMATAÇÕES ========== */

		mesclarCelula(0, 0, COLUNA_A, COLUNA_I);

		tamanhoDeColuna(COLUNA_A, 54);
		tamanhoDeColuna(COLUNA_B, 28);
		tamanhoDeColuna(COLUNA_C, 28);
		tamanhoDeColuna(COLUNA_D, 25);
		tamanhoDeColuna(COLUNA_E, 35);
		tamanhoDeColuna(COLUNA_F, 35);
		tamanhoDeColuna(COLUNA_G, 25);
		tamanhoDeColuna(COLUNA_H, 25);
		tamanhoDeColuna(COLUNA_I, 25);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaCargaMassiva
	 * @propósito: Método responsável por planilhaCargaMassiva.
	 * 
	 * @param dto
	 *            RemessaAliquotaDTO
	 * @param lista
	 *            List<ItemRemessaAliquotaDTO>
	 * @param isIssProprio
	 *            Boolean
	 * @throws Exception
	 */
	public void planilhaCargaMassiva(RemessaAliquotaDTO dto,
			List<ItemRemessaAliquotaDTO> lista, Boolean isIssProprio)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Carga Massiva Alíquotas",
				getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, GissUtil.getFacesMessage("label_remessa"));
		hmValores.put(COLUNA_B, GissUtil.getFacesMessage("label_situacao"));
		hmValores
				.put(COLUNA_C, GissUtil.getFacesMessage("label_usuario_carga"));
		hmValores.put(COLUNA_D, GissUtil.getFacesMessage("label_data_hora"));
		hmValores.put(COLUNA_E,
				GissUtil.getFacesMessage("label_usuario_conferencia"));
		hmValores.put(COLUNA_F, GissUtil.getFacesMessage("label_data_hora"));
		hmValores.put(COLUNA_G,
				GissUtil.getFacesMessage("label_usuario_aprovacao"));
		hmValores.put(COLUNA_H, GissUtil.getFacesMessage("label_data_hora"));
		hmValores.put(COLUNA_I, GissUtil.getFacesMessage("label_municipio"));
		hmValores.put(COLUNA_J, GissUtil.getFacesMessage("label_descricao"));
		hmValores.put(COLUNA_K, GissUtil.getFacesMessage("label_uf"));
		hmValores.put(COLUNA_L, GissUtil.getFacesMessage("label_item_servico"));
		hmValores.put(COLUNA_M,
				GissUtil.getFacesMessage("label_aliquota_atualizar"));
		if (isIssProprio) {
			hmValores.put(COLUNA_N,
					GissUtil.getFacesMessage("label_aliquota_iss_proprio"));
			hmValores.put(COLUNA_O,
					GissUtil.getFacesMessage("label_aliquota_iss_gerencial"));
		} else {
			hmValores.put(COLUNA_N,
					GissUtil.getFacesMessage("label_aliquota_iss_gerencial"));
		}

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ItemRemessaAliquotaDTO itemDto : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A, String.valueOf(dto.getNumeroRemessa()));
			hmValores.put(COLUNA_B,
					String.valueOf(dto.getSituacaoRemessa().getDescricao()));
			hmValores.put(COLUNA_C,
					String.valueOf(dto.getUsuarioCarga().getCodigo()));
			hmValores.put(COLUNA_D, String.valueOf(DateUtils.format(dto
					.getUsuarioCarga().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			hmValores.put(COLUNA_E,
					String.valueOf(dto.getUsuarioConferencia().getCodigo()));
			hmValores.put(COLUNA_F, String.valueOf(DateUtils.format(dto
					.getUsuarioConferencia().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			hmValores.put(COLUNA_G,
					String.valueOf(dto.getUsuarioAprovacao().getCodigo()));
			hmValores.put(COLUNA_H, String.valueOf(DateUtils.format(dto
					.getUsuarioAprovacao().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			hmValores.put(COLUNA_I,
					String.valueOf(itemDto.getCodigoMunicipio()));
			hmValores.put(COLUNA_J, String.valueOf(itemDto.getNomeMunicipio()));
			hmValores.put(COLUNA_K, String.valueOf(itemDto.getUf()));
			hmValores.put(COLUNA_L,
					String.valueOf(itemDto.getItemServicoFormatado()));
			hmValores.put(COLUNA_M, String.valueOf(itemDto.getAliquotaAtual()));
			if (isIssProprio) {
				hmValores.put(COLUNA_N,
						String.valueOf(itemDto.getAliquotaISSProprio()));
				hmValores.put(COLUNA_O,
						String.valueOf(itemDto.getAliquotaISSGerencial()));
			} else {
				hmValores.put(COLUNA_N,
						String.valueOf(itemDto.getAliquotaISSGerencial()));
			}

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		if (isIssProprio) {
			mesclarCelula(0, 0, COLUNA_A, COLUNA_O);
		} else {
			mesclarCelula(0, 0, COLUNA_A, COLUNA_N);
		}

		efetuarDownload();
	}

	/**
	 * @nome: planilhaManterAliquotas
	 * @propósito: Método responsável por planilhaManterAliquotas.
	 * 
	 * @param lista
	 *            List<ManterAliquotaDTO>
	 * @throws Exception
	 */
	public void planilhaManterAliquotas(List<ManterAliquotaDTO> lista)
			throws Exception {

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, "Planilha Manter Alíquotas", getEstiloTitulo());

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, GissUtil.getFacesMessage("label_municipio"));
		hmValores.put(COLUNA_B, GissUtil.getFacesMessage("label_descricao"));
		hmValores.put(COLUNA_C, GissUtil.getFacesMessage("label_aliquota"));
		hmValores.put(COLUNA_D, GissUtil.getFacesMessage("label_competencia"));
		hmValores
				.put(COLUNA_E, GissUtil.getFacesMessage("label_usuario_carga"));
		hmValores.put(COLUNA_F, GissUtil.getFacesMessage("label_data_hora"));
		hmValores.put(COLUNA_G,
				GissUtil.getFacesMessage("label_usuario_conferencia"));
		hmValores.put(COLUNA_H, GissUtil.getFacesMessage("label_data_hora"));
		hmValores.put(COLUNA_I,
				GissUtil.getFacesMessage("label_usuario_aprovacao"));
		hmValores.put(COLUNA_J, GissUtil.getFacesMessage("label_data_hora"));

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (ManterAliquotaDTO itemDto : lista) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					String.valueOf(itemDto.getCodigoMunicipio()));
			hmValores.put(COLUNA_B, String.valueOf(itemDto.getNomeMunicipio()));
			hmValores.put(COLUNA_C, String.valueOf(itemDto.getAliquota()));
			hmValores.put(COLUNA_D,
					String.valueOf(itemDto.getCompetenciaFormatada()));
			hmValores.put(COLUNA_E,
					String.valueOf(itemDto.getUsuarioCarga().getCodigo()));
			hmValores.put(COLUNA_F, String.valueOf(DateUtils.format(itemDto
					.getUsuarioCarga().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			hmValores
					.put(COLUNA_G, String.valueOf(itemDto
							.getUsuarioConferencia().getCodigo()));
			hmValores.put(COLUNA_H, String.valueOf(DateUtils.format(itemDto
					.getUsuarioConferencia().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			hmValores.put(COLUNA_I,
					String.valueOf(itemDto.getUsuarioAprovacao().getCodigo()));
			hmValores.put(COLUNA_J, String.valueOf(DateUtils.format(itemDto
					.getUsuarioAprovacao().getData(),
					GissUtil.DATA_HORA_COMPLETA_FORMATADO)));

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		mesclarCelula(0, 0, COLUNA_A, COLUNA_J);

		efetuarDownload();
	}

	/**
	 * @nome: planilhaDiferencaContabilMovimentoRetificado
	 * @propósito: Método responsável por
	 *             planilhaDiferencaContabilMovimentoRetificado.
	 * 
	 * @param dto
	 *            MovimentoRetificadorDTO
	 * @param listaDetalheList
	 *            <MovimentoRetificadorDTO>
	 * @throws Exception
	 */
	public void planilhaDiferencaContabilMovimentoRetificado(
			MovimentoRetificadorDTO dto,
			List<MovimentoRetificadorDTO> listaDetalhe) throws Exception {

		HashMap<Integer, Object> hmHeader = new HashMap<Integer, Object>();

		/* =========== TITULO ========== */
		criaTitulo(COLUNA_A, getNomeArquivo(), getEstiloTitulo());

		pularLinha(1);

		hmHeader = new HashMap<Integer, Object>();
		hmHeader.put(COLUNA_A, GissUtil.getFacesMessage("label_empresa"));
		hmHeader.put(COLUNA_B, GissUtil.getString(dto.getCodigoEmpresa())
				+ " - " + GissUtil.getString(dto.getNomeEmpresa()));
		criaCabecalho(hmHeader, getEstiloRegistros());

		hmHeader = new HashMap<Integer, Object>();
		hmHeader.put(COLUNA_A, GissUtil.getFacesMessage("label_produto"));
		hmHeader.put(COLUNA_B, GissUtil.getString(dto.getNomeProduto()));
		criaCabecalho(hmHeader, getEstiloRegistros());

		hmHeader = new HashMap<Integer, Object>();
		hmHeader.put(COLUNA_A, GissUtil.getFacesMessage("label_competencia"));
		hmHeader.put(COLUNA_B,
				GissUtil.getString(dto.getAnoMesCompetenciaExibicao()));
		criaCabecalho(hmHeader, getEstiloRegistros());

		hmHeader = new HashMap<Integer, Object>();
		hmHeader.put(COLUNA_A,
				GissUtil.getFacesMessage("label_tipo_movimento_anterior"));
		hmHeader.put(COLUNA_B,
				GissUtil.getString(dto.getDescricaoFinalidadeArquivo()));
		criaCabecalho(hmHeader, getEstiloRegistros());

		hmHeader = new HashMap<Integer, Object>();
		hmHeader.put(COLUNA_A, GissUtil
				.getFacesMessage("label_situacao_contabil_movimento_anterior"));
		hmHeader.put(COLUNA_B,
				GissUtil.getString(dto.getDescricaoSituacaoContabil()));
		criaCabecalho(hmHeader, getEstiloRegistros());

		pularLinha(1);

		/* ======= CABEÇALHO ======== */
		HashMap<Integer, Object> hmValores = new HashMap<Integer, Object>();

		hmValores.put(COLUNA_A, GissUtil.getFacesMessage("label_municipio"));
		hmValores.put(COLUNA_B, GissUtil.getFacesMessage("label_descricao"));
		hmValores.put(COLUNA_C,
				GissUtil.getFacesMessage("label_base_calculo_anterior"));
		hmValores.put(COLUNA_D,
				GissUtil.getFacesMessage("label_aliquota_anterior"));
		hmValores.put(COLUNA_E,
				GissUtil.getFacesMessage("label_valor_iss_anterior"));
		hmValores.put(COLUNA_F,
				GissUtil.getFacesMessage("label_base_calculo_atual"));
		hmValores.put(COLUNA_G,
				GissUtil.getFacesMessage("label_aliquota_atual"));
		hmValores.put(COLUNA_H,
				GissUtil.getFacesMessage("label_valor_iss_atual"));
		hmValores.put(COLUNA_I,
				GissUtil.getFacesMessage("label_valor_oscilacao"));

		criaCabecalho(hmValores, getEstiloCabecalho());

		/* ======= CONTEUDO CABEÇALHO ======== */
		HashMap<Integer, HashMap<Integer, Object>> hmRegistros = new HashMap<Integer, HashMap<Integer, Object>>();
		int contador = 0;
		for (MovimentoRetificadorDTO itemDto : listaDetalhe) {

			hmValores = new HashMap<Integer, Object>();

			hmValores.put(COLUNA_A,
					String.valueOf(itemDto.getCodigoMunicipio()));
			hmValores.put(COLUNA_B, String.valueOf(itemDto.getNomeMunicipio()));
			hmValores.put(COLUNA_C,
					String.valueOf(itemDto.getValorBaseCalculoAnterior()));
			hmValores.put(COLUNA_D,
					String.valueOf(itemDto.getPercentualAliquotaAnterior()));
			hmValores.put(COLUNA_E,
					String.valueOf(itemDto.getValorApuracaoAnterior()));
			hmValores.put(COLUNA_F,
					String.valueOf(itemDto.getValorBaseCalculoAtual()));
			hmValores.put(COLUNA_G,
					String.valueOf(itemDto.getPercentualAliquotaAtual()));
			hmValores.put(COLUNA_H,
					String.valueOf(itemDto.getValorApuracaoAtual()));
			hmValores
					.put(COLUNA_I, String.valueOf(itemDto.getValorOscilacao()));

			hmRegistros.put(contador++, hmValores);

		}
		criaRegistros(hmRegistros, getEstiloRegistros());

		mesclarCelula(0, 0, COLUNA_A, COLUNA_I);

		efetuarDownload();
	}

}
