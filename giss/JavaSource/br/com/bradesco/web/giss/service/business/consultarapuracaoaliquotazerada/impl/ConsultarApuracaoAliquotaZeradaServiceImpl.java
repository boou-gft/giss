/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consultarapuracaoaliquotazerada/impl/ConsultarApuracaoAliquotaZeradaServiceImpl.java,v $
 * $Id: ConsultarApuracaoAliquotaZeradaServiceImpl.java,v 1.9 2018/06/14 10:16:13 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ConsultarApuracaoAliquotaZeradaServiceImpl.java,v $
 * Revision 1.9  2018/06/14 10:16:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2018/06/06 17:09:36  gmichelini
 * *** empty log message ***
 *
 * Revision 1.7  2018/04/27 10:35:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.6  2018/04/24 02:27:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.5  2018/04/13 18:13:50  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/04/06 14:01:54  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/07/28 14:09:20  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.2  2017/07/25 18:15:30  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:13:19  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2013/01/08 12:33:32  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:00  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:27  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.IConsultarApuracaoAliquotaZeradaService;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultaAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ConsultarAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaEntradaDTO;
import br.com.bradesco.web.giss.service.business.consultarapuracaoaliquotazerada.bean.ResultadoAliquotaZeradaSaidaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse;
import br.com.bradesco.web.giss.utils.GissUtil;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ConsultarApuracaoAliquotaZerada
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConsultarApuracaoAliquotaZeradaServiceImpl implements IConsultarApuracaoAliquotaZeradaService {

	private FactoryAdapter factoryAdapter;

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	/**
	 * Construtor.
	 */

	public ConsultaAliquotaZeradaSaidaDTO buscarDependenciaAliquotaZerada (ConsultarAliquotaZeradaEntradaDTO entrada ) {

		ConsultarDependenciaAliquotaZeradaRequest request = new ConsultarDependenciaAliquotaZeradaRequest();
		ConsultaAliquotaZeradaSaidaDTO conAliqZerada = new ConsultaAliquotaZeradaSaidaDTO();
		ConsultarDependenciaAliquotaZeradaResponse response = new ConsultarDependenciaAliquotaZeradaResponse();
		
		request.setCodMunicipio(valorLong(entrada.getCodigoMunicipio()));
		request.setMesAnoApuracaoInicial(valorInteger(entrada.getDataApuracao()));
		request.setMesAnoApuracaoFinal(valorInteger(entrada.getDataApuracaoFinal()));
		request.setQtdeRegistro(valorInteger(entrada.getMaxOcorrencia()));
		request.setCodDependencia(valorInteger(entrada.getCodDependencia()));
		request.setCodPessoaJurid(valorLong(entrada.getCodPessoaJurid()));

		response = getFactoryAdapter().getConsultarDependenciaAliquotaZeradaPDCAdapter().invokeProcess(request);

		if(response ==null){
			return null;
		}
		int linha = 0;
		
		BigDecimal totalValor = BigDecimal.ZERO;
    	conAliqZerada.setCodMunicipio(response.getCodMunicipio());
		conAliqZerada.setDescMunicipio(response.getDescMunicipio());
		conAliqZerada.setCodUF(response.getCodUF());
		conAliqZerada.setDescUF(response.getDescUF());
		conAliqZerada.setApuracaoTotalValor(response.getSinalApuracaoTotal().equals("-")?response.getValorApuracaoTotal().negate():response.getValorApuracaoTotal());
		conAliqZerada.setQtdeAgencia(new Long(0));
		conAliqZerada.setQtdePa(new Long(0));
		
		for(int i =0; i < response.getOcorrenciasDepAliquotaZCount();i++){
			ConsultaAliquotaZeradaSaidaDTO saidaDTO = new ConsultaAliquotaZeradaSaidaDTO();
			saidaDTO.setReceitaTotalGeralValor(response.getSinalApuracaoTotal().equals("-")?response.getValorApuracaoTotal().negate():response.getValorApuracaoTotal());	
			saidaDTO.setReceitaValor(response.getOcorrenciasDepAliquotaZ(i).getSinalApuracao().equals("-")?response.getOcorrenciasDepAliquotaZ(i).getValorApuracao().negate():response.getOcorrenciasDepAliquotaZ(i).getValorApuracao());
			totalValor = totalValor.add(saidaDTO.getReceitaValor());
			saidaDTO.setNumConsultas(response.getQtdeRegistros());
			saidaDTO.setNumeroSequencial(response.getOcorrenciasDepAliquotaZ(i).getNumSeqUnidadeOrganizacional());
			saidaDTO.setCodPessoa(response.getOcorrenciasDepAliquotaZ(i).getCodPessoaJuridOcor());
			saidaDTO.setReceitaTotalValor(totalValor);
			saidaDTO.setDataApuracao(GissUtil.formatarDataInvertida(response.getOcorrenciasDepAliquotaZ(i).getMesAnoApuracao()));
			saidaDTO.setDependencia(response.getOcorrenciasDepAliquotaZ(i).getCodDependencia().equals("")?0:Integer.parseInt(response.getOcorrenciasDepAliquotaZ(i).getCodDependencia()));
			saidaDTO.setCodPa(response.getOcorrenciasDepAliquotaZ(i).getCodPa().equals("000000") || response.getOcorrenciasDepAliquotaZ(i).getCodPa().equals("")?0:Integer.parseInt(response.getOcorrenciasDepAliquotaZ(i).getCodPa()));
			saidaDTO.setCodDepPa(GissUtil.preencherZerosEsquerda(String.valueOf(response.getOcorrenciasDepAliquotaZ(i).getCodDependencia()),6) + (GissUtil.notNull(response.getOcorrenciasDepAliquotaZ(i).getCodPa()).equals("000000") || GissUtil.notNull(response.getOcorrenciasDepAliquotaZ(i).getCodPa()).equals("")?"":"/"+GissUtil.preencherZerosEsquerda(String.valueOf(GissUtil.notNull(response.getOcorrenciasDepAliquotaZ(i).getCodPa())),6)));
			saidaDTO.setDescricao(response.getOcorrenciasDepAliquotaZ(i).getDescDependencia());
			saidaDTO.setDescPa(response.getOcorrenciasDepAliquotaZ(i).getDescPa());
			saidaDTO.setDescDepPa(response.getOcorrenciasDepAliquotaZ(i).getDescDependencia() + (GissUtil.notNull(response.getOcorrenciasDepAliquotaZ(i).getDescPa()).equals("")?"":"/"+GissUtil.notNull(response.getOcorrenciasDepAliquotaZ(i).getDescPa())));
			
			if(response.getOcorrenciasDepAliquotaZ(i).getCodPa().equals("000000") || response.getOcorrenciasDepAliquotaZ(i).getCodPa().equals("")){
				conAliqZerada.setQtdeAgencia(conAliqZerada.getQtdeAgencia()+1);
			}else{
				conAliqZerada.setQtdePa(conAliqZerada.getQtdePa()+1);
			}
			saidaDTO.setQtdeAgencia(conAliqZerada.getQtdeAgencia());
			saidaDTO.setQtdePa(conAliqZerada.getQtdePa());
			conAliqZerada.getListaAliqZerada().add(saidaDTO);
		}
		Collections.sort(conAliqZerada.getListaAliqZerada());
		for (ConsultaAliquotaZeradaSaidaDTO al : conAliqZerada.getListaAliqZerada()) {
			al.setLinha(linha++);
		}
		return conAliqZerada;
	}


	public List<ResultadoAliquotaZeradaSaidaDTO> buscarResultadoAliquotaZerada(ResultadoAliquotaZeradaEntradaDTO entrada){

		ListarAliquotaZeradaRequest request =new ListarAliquotaZeradaRequest();

		request.setCodigoMunicipio(entrada.getCodigoMunicipio());
		request.setCodigoPessaoJuridica(entrada.getCodPessoa());
		request.setMesAnoApuracao(entrada.getDataSelecionada());
		request.setNroMaxOcorrencias(entrada.getMaxOcorrencia());
		request.setNroSeqUndOrganizacional(entrada.getNumSequencial());

		ListarAliquotaZeradaResponse response = getFactoryAdapter().getListarAliquotaZeradaPDCAdapter().invokeProcess(request);

		List<ResultadoAliquotaZeradaSaidaDTO> listaResultadoAliquota = new ArrayList<ResultadoAliquotaZeradaSaidaDTO>();
		int linha = 0;
		BigDecimal totalReceita = BigDecimal.ZERO;
		
		for(int i =0; i < response.getOcorrenciasCount();i++){

			ResultadoAliquotaZeradaSaidaDTO saidaDTO = new ResultadoAliquotaZeradaSaidaDTO();
					
			if(response.getReceitaApuracaoTotalSinal().equals("-")){
				saidaDTO.setReceitaTotalGeralValor(response.getReceitaApuracaoTotalValor().negate());
			}
			else{
				saidaDTO.setReceitaTotalGeralValor(response.getReceitaApuracaoTotalValor());
			}
			if(response.getOcorrencias(i).getReceitaApuracaoSinal().equals("-")){
				saidaDTO.setReceitaValor(response.getOcorrencias(i).getReceitaApuracaoValor().negate());
			}
			else{
				saidaDTO.setReceitaValor(response.getOcorrencias(i).getReceitaApuracaoValor());
			}
			
			totalReceita = totalReceita.add(saidaDTO.getReceitaValor());

			saidaDTO.setRazao(GissUtil.formatarRazaoContabil(response.getOcorrencias(i).getCodigoGrupo() , response.getOcorrencias(i).getCodigoSubgrupo()));
			saidaDTO.setCosif(GissUtil.mascaraContaContabil(String.valueOf(response.getOcorrencias(i).getContaContabil()),saidaDTO.getRazao()));
			saidaDTO.setConta(response.getOcorrencias(i).getNumeroConta() == 0?"":GissUtil.preencherZerosAEsquerda(String.valueOf(response.getOcorrencias(i).getNumeroConta()), 7)+"-"+ response.getOcorrencias(i).getDigitoConta());
			saidaDTO.setDescricao(response.getOcorrencias(i).getDescRazao());
			saidaDTO.setNumConcultas(response.getNroConsultas());
			saidaDTO.setReceitaTotalValor(totalReceita);
			saidaDTO.setLinha(linha++);
			
			listaResultadoAliquota.add(saidaDTO);
			
		}

		return listaResultadoAliquota;
	}










	public Long valorLong(Long valor){

		return valor != null? valor: 0;
	}

	public Integer valorInteger(Integer valor){

		return valor != null? valor: 0;

	}
}

