package br.com.bradesco.web.giss.service.business.codlancamento.impl;

import static br.com.bradesco.web.giss.utils.GissUtil.verificaIntegerNulo;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.codlancamento.ICodLancamentoService;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.CodLancamentoDTO;
import br.com.bradesco.web.giss.service.business.codlancamento.bean.DetalheHistoricoDTO;
import br.com.bradesco.web.giss.service.business.codlancamento.exeptions.CodLancamentoServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.response.AlterarCodLancamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.response.ConsultaHistoricoCodigosLancamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento;
import br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.response.ExcluirCodLancamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluircodlancamento.request.IncluirCodLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluircodlancamento.response.IncluirCodLancamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcodlancamento.request.ListarCodLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcodlancamento.response.ListarCodLancamentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.request.ListarHistCodLancamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.converter.FormatarData;
import freemarker.template.utility.StringUtil;
/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ApuracaoRep
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class CodLancamentoServiceImpl implements ICodLancamentoService {

	private FactoryAdapter factoryAdapter;
	
	/**
	 * @return 
	 */
	public CodLancamentoDTO listaCodLancamento(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException {

		ListarCodLancamentoRequest request = new ListarCodLancamentoRequest();
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		request.setQtdeRegistro(100);
		ListarCodLancamentoResponse response = factoryAdapter.getListarCodLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int numReg = 0;
		for (int i = 0; i < response.getListaCodLancamentoCount(); i++) {
			CodLancamentoDTO dtoLocal = new CodLancamentoDTO();
			dtoLocal.setCodLancamento(response.getListaCodLancamento(i).getCodLancamento());
			dtoLocal.setSegLinhaExtrato(response.getListaCodLancamento(i).getComplementar());
			dtoLocal.setCosif(response.getListaCodLancamento(i).getCosif());
			dtoLocal.setRazao(StringUtil.leftPad(String.valueOf(response.getListaCodLancamento(i).getGrupo()), 3, "0")
					+ "-" + StringUtil.leftPad(String.valueOf(response.getListaCodLancamento(i).getSubGrupo()), 3, "0"));
			dtoLocal.setGrupo(response.getListaCodLancamento(i).getGrupo());
			dtoLocal.setSubGrupo(response.getListaCodLancamento(i).getSubGrupo());
			dtoLocal.setConta(response.getListaCodLancamento(i).getConta());
			dtoLocal.setDigito(response.getListaCodLancamento(i).getDigConta());
			dtoLocal.setNomeConta(response.getListaCodLancamento(i).getDescConta());
			dtoLocal.setCodItem(response.getListaCodLancamento(i).getCodItem());
			dtoLocal.setNumParam(response.getListaCodLancamento(i).getParametro());
			dtoLocal.setNumeroRegistro(numReg++);
			dto.getLista().add(dtoLocal);
		}
		return dto;
	}
	
	/**
	 * @return 
	 */
	public CodLancamentoDTO listaHistorico(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException {

		ListarHistCodLancamentoRequest request = new ListarHistCodLancamentoRequest();
		request.setDataInicial(FormatarData.formataDiaMesAnoToPdc(dto.getDataInicial()));
		request.setDataFinal(FormatarData.formataDiaMesAnoToPdc(dto.getDataFinal()));
		request.setCodLancamento(GissUtil.notNull(dto.getCodLancamento()));
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		ListarHistCodLancamentoResponse response = factoryAdapter.getListarHistCodLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int numReg = 0;
		for (int i = 0; i < response.getListaHistCodLancamentoCount(); i++) {
			CodLancamentoDTO dtoLocal = new CodLancamentoDTO();
			dtoLocal.setCodLancamento(response.getListaHistCodLancamento(i).getCodLancamento());
			dtoLocal.setCodItem(response.getListaHistCodLancamento(i).getCodItem());
			dtoLocal.setDataAtualizacao(response.getListaHistCodLancamento(i).getDataAtualizacao().replace(".", "/"));
			dtoLocal.setHoraAtualizacao(response.getListaHistCodLancamento(i).getHoraAtualizacao());
			dtoLocal.setDataExclusao(response.getListaHistCodLancamento(i).getDataExclusao().replace(".", "/"));
			dtoLocal.setCodFuncional(response.getListaHistCodLancamento(i).getCodFunc());
			dtoLocal.setHrInclusaoRegistroHistorico(response.getListaHistCodLancamento(i).getHrInclusaoRegistroHist());
			dtoLocal.setParamLancamentoContabil(response.getListaHistCodLancamento(i).getParamLancamento());
			
			dtoLocal.setNumeroRegistro(numReg++);
			dto.getLista().add(dtoLocal);
		}
		return dto;
	}
	
	
	public DetalheHistoricoDTO detalheHistorico(Integer cdLancamento, Integer paramLancamentoContabio, String horainclusaoRegistroHistorico){
		ConsultaHistoricoCodigosLancamentoRequest request = new ConsultaHistoricoCodigosLancamentoRequest();
		
		request.setCdLancamento(verificaIntegerNulo(cdLancamento));
		request.setParamLancamentoContabio(verificaIntegerNulo(paramLancamentoContabio));
		request.setHorainclusaoRegistroHistorico(horainclusaoRegistroHistorico);	
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		 ConsultaHistoricoCodigosLancamentoResponse response = 
			 factoryAdapter.getConsultaHistoricoCodigosLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		DetalheHistoricoDTO saida = new DetalheHistoricoDTO();
	    saida.setCodMensagem(response.getCodMensagem());
	    saida.setMensagem(response.getMensagem());
	    saida.setDsComplementar(response.getDsComplementar());
	    saida.setDsComplementarAnterior(response.getDsComplementarAnterior());
	    saida.setDsLancamentoAplicadoContabil(response.getDsLancamentoAplicadoContabil());
	    saida.setDsLancamentoAplicadoContabilAnterior(response.getDsLancamentoAplicadoContabilAnterior());
	    saida.setCdLancamento(response.getCdLancamento());
	    saida.setCdLancamentoAnterior(response.getCdLancamentoAnterior());
	    saida.setGrupoContabilAtual(response.getGrupoContabilAtual());
	    saida.setGrupoContabilAtualAnterior(response.getGrupoContabilAtualAnterior());
	    saida.setGrupoContabil(response.getGrupoContabil());
	    saida.setGrupoContabilAnterior(response.getGrupoContabilAnterior());
	    saida.setContaContabilTributo(response.getContaContabilTributo());
	    saida.setContaContabilTributoAnterior(response.getContaContabilTributoAnterior());
	    saida.setContaContabil(response.getContaContabil());
	    saida.setContaContabilAnterior(response.getContaContabilAnterior());
	    saida.setDigitoContaContabil(response.getDigitoContaContabil());
	    saida.setDigitoContaContabilAnterior(response.getDigitoContaContabilAnterior());
	    saida.setCdItem(response.getCdItem());
	    saida.setCdItemAnterior(response.getCdItemAnterior());
	    
	    return saida;
	}
	
	
	/**
	 * @return 
	 */
	public String incluir(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException {
		
		IncluirCodLancamentoRequest request = new IncluirCodLancamentoRequest();
		request.setCodLancamento(GissUtil.notNull(dto.getCodLancamento()));
		request.setComplementar(GissUtil.notNull(dto.getSegLinhaExtrato()));
		request.setCosif(GissUtil.notNull(dto.getCosif()));
		String razao[] = dto.getRazao().split("-");
		request.setGrupo(Integer.valueOf(GissUtil.notNull(razao[0])));
		request.setSubGrupo(Integer.valueOf(GissUtil.notNull(razao[1])));
		request.setConta(GissUtil.notNull(dto.getConta()));
		request.setDigito(GissUtil.notNull(dto.getDigito()));
		request.setDescConta(GissUtil.notNull(dto.getNomeConta()));
		request.setCodItem(GissUtil.notNull(dto.getCodItem()));
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		IncluirCodLancamentoResponse response = factoryAdapter.getIncluirCodLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	/**
	 * @return 
	 */
	public String alterar(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException {
		
		AlterarCodLancamentoRequest request = new AlterarCodLancamentoRequest();
		request.setCodLancamento(GissUtil.notNull(dto.getCodLancamento()));
		request.setComplementar(GissUtil.notNull(dto.getSegLinhaExtrato()));
		request.setCosif(GissUtil.notNull(dto.getCosif()));
		String razao[] = dto.getRazao().split("-");
		request.setGrupo(Integer.valueOf(GissUtil.notNull(razao[0])));
		request.setSubGrupo(Integer.valueOf(GissUtil.notNull(razao[1])));
		request.setConta(GissUtil.notNull(dto.getConta()));
		request.setDigito(GissUtil.notNull(dto.getDigito()));
		request.setDescConta(GissUtil.notNull(dto.getNomeConta()));
		request.setCodItem(GissUtil.notNull(dto.getCodItem()));
		request.setNumParametro(GissUtil.notNull(dto.getNumParam()));
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		AlterarCodLancamentoResponse response = factoryAdapter.getAlterarCodLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	/**
	 * @return 
	 */
	public String excluir(CodLancamentoDTO dto) throws PdcAdapterException, CodLancamentoServiceException {
		
		ExcluirCodLancamentoRequest request = new ExcluirCodLancamentoRequest();
		ListaExcluirCodLancamento[] lista = new ListaExcluirCodLancamento[100];
		for (int i = 0; i < lista.length; i++) {
			ListaExcluirCodLancamento item = new ListaExcluirCodLancamento();
			if (i < dto.getLista().size()) {
				item.setCodLancamento(GissUtil.notNull(dto.getLista().get(i).getCodLancamento()));
				item.setComplementar(GissUtil.notNull(dto.getLista().get(i).getSegLinhaExtrato()));
				item.setCosif(GissUtil.notNull(dto.getLista().get(i).getCosif()));
				String razao[] = dto.getLista().get(i).getRazao().split("-");
				item.setGrupo(Integer.valueOf(GissUtil.notNull(razao[0])));
				item.setSubGrupo(Integer.valueOf(GissUtil.notNull(razao[1])));
				item.setConta(GissUtil.notNull(dto.getLista().get(i).getConta()));
				item.setDigito(GissUtil.notNull(dto.getLista().get(i).getDigito()));
				item.setNomeConta(GissUtil.notNull(dto.getLista().get(i).getNomeConta()));
				item.setCodItem(GissUtil.notNull(dto.getLista().get(i).getCodItem()));
				item.setNumParam(GissUtil.notNull(dto.getLista().get(i).getNumParam()));
			}else {
				item.setCodLancamento(0);
				item.setComplementar("");
				item.setCosif(0l);
				item.setGrupo(0);
				item.setSubGrupo(0);
				item.setConta(0l);
				item.setDigito("");
				item.setNomeConta("");
				item.setCodItem(0);
				item.setNumParam(0);
			}
			lista[i] = item;
		}
		request.setQtdeRegistros(dto.getLista().size());
		request.setListaExcluirCodLancamento(lista);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		ExcluirCodLancamentoResponse response = factoryAdapter.getExcluirCodLancamentoPDCAdapter().invokeProcess(request);
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	/**
	 * Construtor.
	 */
	public CodLancamentoServiceImpl() {
		// TODO: Implementação
	}
}