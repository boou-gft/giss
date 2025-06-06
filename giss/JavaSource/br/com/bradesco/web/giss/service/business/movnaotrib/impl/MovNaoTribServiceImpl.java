package br.com.bradesco.web.giss.service.business.movnaotrib.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bradesco.web.giss.service.business.movnaotrib.IMovNaoTribService;
import br.com.bradesco.web.giss.service.business.movnaotrib.IMovNaoTribServiceConstants;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribContaDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribContaTotalDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribProsseguirDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribProsseguirTotalDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.IListarApuracaoMovimentoNaoTributavelPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.request.ListarApuracaoMovimentoNaoTributavelRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse;
import br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.IResultPesqApurMovNaoTributavelPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.request.ResultPesqApurMovNaoTributavelRequest;
import br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse;
import br.com.bradesco.web.giss.utils.GissUtil;


public class MovNaoTribServiceImpl implements IMovNaoTribService {

	private FactoryAdapter factoryAdapter;

	public MovNaoTribProsseguirTotalDTO listarDependencias(String codMunicipio, String dataCompetencia, Long codPessoaJurid, Integer codDependencia) {

		ResultPesqApurMovNaoTributavelRequest iRequest = new ResultPesqApurMovNaoTributavelRequest();
		iRequest.setQtdeRegistro(IMovNaoTribServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIA);
		iRequest.setMesAnoApuracao(new Integer(dataCompetencia));
		iRequest.setCodMunicipio(new Long(codMunicipio));
		iRequest.setCodPessoaJurid(codPessoaJurid);
		iRequest.setCodDependencia(codDependencia);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IResultPesqApurMovNaoTributavelPDCAdapter listarDependenciaPDCAdapter = factoryAdapter.getResultPesqApurMovNaoTributavelPDCAdapter();
		ResultPesqApurMovNaoTributavelResponse iResponse = listarDependenciaPDCAdapter.invokeProcess(iRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		MovNaoTribProsseguirTotalDTO dependenciaTotalDTO = new MovNaoTribProsseguirTotalDTO();
		dependenciaTotalDTO.setReceitaTotalMunicipio(iResponse.getValorReceitaTotalMun());
		if ("-".equals(iResponse.getSinalReceitaTotalMun())) {
			dependenciaTotalDTO.setReceitaTotalMunicipio(dependenciaTotalDTO.getReceitaTotalMunicipio().negate());
		}

		dependenciaTotalDTO.setReceitaTotalGeral(iResponse.getValorReceitaTotalGer());
		if ("-".equals(iResponse.getSinalReceitaTotalGer())) {
			dependenciaTotalDTO.setReceitaTotalGeral(iResponse.getValorReceitaTotalGer().negate());
		}

		dependenciaTotalDTO.setMovimentoTotalMunicipio(iResponse.getValorReceitaTotalMun());
		if ("-".equals(iResponse.getSinalReceitaTotalMun())) {
			dependenciaTotalDTO.setMovimentoTotalMunicipio(iResponse.getValorReceitaTotalMun().negate());
		}

		dependenciaTotalDTO.setMovimentoTotalGeral(iResponse.getValorApuracaoTotalGer());
		if ("-".equals(iResponse.getSinalApuracaoTotalGer())) {
			dependenciaTotalDTO.setMovimentoTotalGeral(iResponse.getValorApuracaoTotalGer().negate());
		}
		dependenciaTotalDTO.setValorApuracaoTotalAg(iResponse.getValorApuracaoTotalAg());
		if ("-".equals(iResponse.getSinalApuracaoTotalAg())) {
			dependenciaTotalDTO.setValorApuracaoTotalAg(iResponse.getValorApuracaoTotalAg().negate());
		}
		dependenciaTotalDTO.setValorApuracaoTotalPa(iResponse.getValorApuracaoTotalPa());
		if ("-".equals(iResponse.getSinalApuracaoTotalPa())) {
			dependenciaTotalDTO.setValorApuracaoTotalPa(iResponse.getValorApuracaoTotalPa().negate());
		}
		dependenciaTotalDTO.setCodMunicipio(iResponse.getCodMunicipio());
		dependenciaTotalDTO.setDescMunicipio(iResponse.getDescMunicipio());
		dependenciaTotalDTO.setCodUF(iResponse.getCodUF());
		dependenciaTotalDTO.setDescUF(iResponse.getDescUF());

		int cont = 0;
		List<MovNaoTribProsseguirDTO> listaMovNaoTribProsseguirDTO = new ArrayList<MovNaoTribProsseguirDTO>();
		for (int i = 0; i < iResponse.getOcorrenciasNaoTributaveisCount(); i++) {
			MovNaoTribProsseguirDTO dependenciaDTO = new MovNaoTribProsseguirDTO();
			
			dependenciaDTO.setDependencia(new Integer(iResponse.getOcorrenciasNaoTributaveis(i).getCodDependenicaOcor()));
			dependenciaDTO.setDescricao(iResponse.getOcorrenciasNaoTributaveis(i).getDescDependenciaOcor());
			dependenciaDTO.setMovimento(iResponse.getOcorrenciasNaoTributaveis(i).getValorApuracao());
			dependenciaDTO.setReceita(iResponse.getOcorrenciasNaoTributaveis(i).getValorReceita());
			dependenciaDTO.setCodigoPessoaJuridica(iResponse.getOcorrenciasNaoTributaveis(i).getCodPessoaJuridOcor());
			dependenciaDTO.setNumeroSequenciaUnidadeOrganizacional(iResponse.getOcorrenciasNaoTributaveis(i).getNumSeqUnidadeOrganizacional());
			
			dependenciaDTO.setDependencia(iResponse.getOcorrenciasNaoTributaveis(i).getCodDependenicaOcor().equals("")?0:Integer.valueOf(iResponse.getOcorrenciasNaoTributaveis(i).getCodDependenicaOcor()));
			dependenciaDTO.setCodPa(iResponse.getOcorrenciasNaoTributaveis(i).getCodPa().equals("000000")?0:Integer.valueOf(iResponse.getOcorrenciasNaoTributaveis(i).getCodPa()));
			dependenciaDTO.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(iResponse.getOcorrenciasNaoTributaveis(i).getCodDependenicaOcor()),6) + (GissUtil.notNull(iResponse.getOcorrenciasNaoTributaveis(i).getCodPa()).equals("000000") || GissUtil.notNull(iResponse.getOcorrenciasNaoTributaveis(i).getCodPa()).equals("")?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(iResponse.getOcorrenciasNaoTributaveis(i).getCodPa())),6)));
			
			dependenciaDTO.setDescricao(iResponse.getOcorrenciasNaoTributaveis(i).getDescDependenciaOcor());
			dependenciaDTO.setDescPa(iResponse.getOcorrenciasNaoTributaveis(i).getDescPa());
			dependenciaDTO.setDescDepPa(iResponse.getOcorrenciasNaoTributaveis(i).getDescDependenciaOcor() + (GissUtil.notNull(iResponse.getOcorrenciasNaoTributaveis(i).getDescPa()).equals("")?"":"/"+GissUtil.notNull(iResponse.getOcorrenciasNaoTributaveis(i).getDescPa())));
			if (iResponse.getOcorrenciasNaoTributaveis(i).getCodPa().equals("000000")) {
				dependenciaTotalDTO.setValorApuracaoTotalAg(dependenciaTotalDTO.getValorApuracaoTotalAg().add(iResponse.getOcorrenciasNaoTributaveis(i).getValorReceita()));
			}else{
				dependenciaTotalDTO.setValorApuracaoTotalPa(dependenciaTotalDTO.getValorApuracaoTotalAg().add(iResponse.getOcorrenciasNaoTributaveis(i).getValorReceita()));
			}
			listaMovNaoTribProsseguirDTO.add(dependenciaDTO);
		}
		Collections.sort(listaMovNaoTribProsseguirDTO);
		for (MovNaoTribProsseguirDTO movNaoTribProsseguirDTO : listaMovNaoTribProsseguirDTO) {
			movNaoTribProsseguirDTO.setLinha(cont++);
		}
		dependenciaTotalDTO.setListaMovNaoTribProsseguirDTO(listaMovNaoTribProsseguirDTO);
		return dependenciaTotalDTO;
	}

	public MovNaoTribContaTotalDTO listarContas(String codMunicipio, int dataCompetencia, long codPessoaJuridica, int nSeqUnidOrganizacional) {
		ListarApuracaoMovimentoNaoTributavelRequest iRequest = new ListarApuracaoMovimentoNaoTributavelRequest();

		iRequest.setNumeroMaximoOcorrencia(IMovNaoTribServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONTAS);
		iRequest.setCodigoMunicipio(new Long(codMunicipio));
		iRequest.setMesAnoApuracaoContabil(dataCompetencia);
		iRequest.setCodigoPessoaJuridica(codPessoaJuridica);
		iRequest.setNumeroSequenciaUnidadeOrganizacional(nSeqUnidOrganizacional);

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		IListarApuracaoMovimentoNaoTributavelPDCAdapter listarContasPDCAdapter = factoryAdapter.getListarApuracaoMovimentoNaoTributavelPDCAdapter();
		ListarApuracaoMovimentoNaoTributavelResponse iResponse = listarContasPDCAdapter.invokeProcess(iRequest);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		MovNaoTribContaTotalDTO contasTotalDTO = new MovNaoTribContaTotalDTO();
		contasTotalDTO.setAliquotaPadrao(new BigDecimal(String.valueOf(iResponse.getAliquotaPadrao())));
		contasTotalDTO.setBaseCalculo(new BigDecimal(String.valueOf(iResponse.getBaseCalculo())));
		contasTotalDTO.setTipoIncidencia(iResponse.getTipoIncidencia());

		int cont = 0;
		BigDecimal totalMovimento = new BigDecimal(String.valueOf(iResponse.getValorTotalMovimento()));
		if ("-".equals(iResponse.getSinalTotalMovimento())) {
			totalMovimento = totalMovimento.negate();
		}
		BigDecimal totalReceita = new BigDecimal(String.valueOf(iResponse.getValorTotalReceita()));
		if ("-".equals(iResponse.getSinalTotalReceita())) {
			totalReceita = totalReceita.negate();
		}

		List<MovNaoTribContaDTO> listaContasDTO = new ArrayList<MovNaoTribContaDTO>();
		for (int i = 0; i < iResponse.getNumeroConsultas(); i++) {
			MovNaoTribContaDTO contasDTO = new MovNaoTribContaDTO();
			contasDTO.setLinha(cont++);

			contasDTO.setRazao(GissUtil.formatarRazaoContabil(iResponse.getOcorrencias(i).getCodigoGrupo() , iResponse.getOcorrencias(i).getCodigoSubgrupo()));
			
			if(GissUtil.isSAPDate(dataCompetencia)) {
				contasDTO.setCosif(GissUtil.mascararCosifSAP(String.valueOf(iResponse.getOcorrencias(i).getCodigoContaContabil())));	
			} else {
				contasDTO.setCosif(GissUtil.mascaraCosif(String.valueOf(iResponse.getOcorrencias(i).getCodigoContaContabil())));
			}
			
			contasDTO.setConta(iResponse.getOcorrencias(i).getNumeroConta()==0?"":GissUtil.preencherZerosAEsquerda(GissUtil.paraString(iResponse.getOcorrencias(i).getNumeroConta()),7)+"-"+ iResponse.getOcorrencias(i).getDigitoConta());
			contasDTO.setMovimento(new BigDecimal(String.valueOf(iResponse.getOcorrencias(i).getMovimentoValor())));
			if ("-".equals(iResponse.getOcorrencias(i).getMovimentoSinal())) {
				contasDTO.setMovimento(new BigDecimal(String.valueOf(iResponse.getOcorrencias(i).getMovimentoValor())).negate());
			}
			contasTotalDTO.setTotalMovimento(totalMovimento);

			contasDTO.setReceita(new BigDecimal(String.valueOf(iResponse.getOcorrencias(i).getReceitaValor())));
			if ("-".equals(iResponse.getOcorrencias(i).getReceitaSinal())) {
				contasDTO.setReceita(new BigDecimal(String.valueOf(iResponse.getOcorrencias(i).getReceitaValor())).negate());
			}
			contasTotalDTO.setTotalReceita(totalReceita);

			listaContasDTO.add(contasDTO);
		}
		contasTotalDTO.setListaMovNaoTribContaDTO(listaContasDTO);

		return contasTotalDTO;
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}