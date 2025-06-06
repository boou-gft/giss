package br.com.bradesco.web.giss.service.business.contacontabil.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.giss.service.business.contacontabil.IContaContabilService;
import br.com.bradesco.web.giss.service.business.contacontabil.IContaContabilServiceConstants;
import br.com.bradesco.web.giss.service.business.contacontabil.bean.ContaContabilDTO;
import br.com.bradesco.web.giss.service.business.contacontabil.exceptions.ContaContabilServiceException;
import br.com.bradesco.web.giss.service.business.tipoincidencia.exceptions.TipoIncidenciaServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.response.AlterarContaContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.response.ComboTipoServicoResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.response.ExcluirContaContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.response.ExcluirCtaContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.IIncluirContaContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil;
import br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.response.IncluirContaContabilResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeis.IListarContasContabeisPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeis.request.ListarContasContabeisRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeis.response.ListarContasContabeisResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.IListarContasContabeisPeriodoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.request.ListarContasContabeisPeriodoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.ListarContasContabeisPeriodoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.IListarContasContabeisTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.request.ListarContasContabeisTipoServicoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.model.contacontabil.TipoServicoComboBean;
import br.com.bradesco.web.giss.view.converter.FormatarData;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ContaContabil
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ContaContabilServiceImpl implements IContaContabilService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public ContaContabilServiceImpl() {
        // TODO: Implementação
    }

	public String alterarContaContabil(ContaContabilDTO dto) {
		
		AlterarContaContabilRequest request = new AlterarContaContabilRequest();
		
		String[] razao = dto.getRazao().split("-");
		String[] conta = dto.getConta().split("-");
		request.setCodigoTipoServico(GissUtil.notNull(dto.getTipoServico()));
		request.setCodigoItemLeiCompl(GissUtil.notNull(dto.getItemDaLei()));
		request.setCodigoUsuario(0l);
		request.setCodigoGrupo(GissUtil.notNull(razao[0]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		request.setCodigoSubgrupo(GissUtil.notNull(razao[1]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
		request.setConta(!GissUtil.notNull(dto.getConta()).equalsIgnoreCase("")?Integer.valueOf(conta[0]):0);
			
		/* **************************
		* 	INVOCA PROCESSO PDC		*
		* **************************/
			
		AlterarContaContabilResponse response = factoryAdapter.getAlterarContaContabilPDCAdapter().invokeProcess(request);

		/* *************************
		 * RESULTADO DA CONSULTA   * 
		 * *************************/ 
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}
		
	public String excluirContaContabilPorConta(ContaContabilDTO dto) {
		
		ExcluirCtaContabilRequest request = new ExcluirCtaContabilRequest();
		String[] razao = dto.getRazao().split("-");
		String[] conta = dto.getConta().split("-");
		
		request.setCodLeiComplementar(!GissUtil.notNull(dto.getTipoServicoDesc()).equalsIgnoreCase("")?Integer.valueOf(dto.getTipoServicoDesc().substring(0, 1)):0);
		request.setConta(!GissUtil.notNull(dto.getConta()).equalsIgnoreCase("")?Integer.valueOf(conta[0]):0);
		String usuario = BradescoCommonServiceFactory.getSessionManager().getSecurityDataBean().getUserId();
		Integer codUsuario = Integer.valueOf(usuario.substring(1));
		request.setCodigoUsuario(codUsuario);
		request.setCodigoGrupo(GissUtil.notNull(razao[0]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		request.setCodigoSubGrupo(GissUtil.notNull(razao[1]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
			
		/* **************************
		* 	INVOCA PROCESSO PDC		*
		* **************************/
			
		ExcluirCtaContabilResponse response = factoryAdapter.getExcluirCtaContabilPDCAdapter().invokeProcess(request);

		/* *************************
		 * RESULTADO DA CONSULTA   * 
		 * *************************/ 
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String excluirContaContabil(ContaContabilDTO dto) {
		
		ExcluirContaContabilRequest request = new ExcluirContaContabilRequest();
		String[] razao = dto.getRazao().split("-");
		request.setCodigoServico(!GissUtil.notNull(dto.getTipoServicoDesc()).equalsIgnoreCase("")?Integer.valueOf(dto.getTipoServicoDesc().substring(0, 1)):0);
		request.setCodigoLeiComplementar(GissUtil.stringToInteger(dto.getItem()));
		String usuario = BradescoCommonServiceFactory.getSessionManager().getSecurityDataBean().getUserId();
		Integer codUsuario = Integer.valueOf(usuario.substring(1));
		request.setCodigoUsuario(codUsuario);
		request.setCodigoGrupo(GissUtil.notNull(razao[0]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		request.setCodigoSubgrupo(GissUtil.notNull(razao[1]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
			
		/* **************************
		* 	INVOCA PROCESSO PDC		*
		* **************************/
			
		ExcluirContaContabilResponse response = factoryAdapter.getExcluirContaContabilPDCAdapter().invokeProcess(request);

		/* *************************
		 * RESULTADO DA CONSULTA   * 
		 * *************************/ 
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String incluirContaContabil(ContaContabilDTO contaContabilDTO) throws PdcAdapterException, ContaContabilServiceException {

		String[] razao;
		String[] conta;
		IncluirContaContabilRequest request = new IncluirContaContabilRequest();
			
		List<ContaContabilDTO> listaContasContabeis = contaContabilDTO.getListaContasContabeisIncluir();
		int quantidade = listaContasContabeis.size();
		request.setQuantidadesOcorrencias(quantidade);
			
		ListaIncluirContaContabil[] ocorrencias = new ListaIncluirContaContabil[99]; 
			
		for (int i = 0; i < ocorrencias.length; i++) {		
				
			ListaIncluirContaContabil ocorrenciasContasContabilistas = new ListaIncluirContaContabil();
			if(i < quantidade){
				razao = listaContasContabeis.get(i).getRazao().split("-");
				conta = listaContasContabeis.get(i).getConta().split("-");
				ocorrenciasContasContabilistas.setCodTipoServico(listaContasContabeis.get(i).getTipoServico());
				ocorrenciasContasContabilistas.setCodFuncBradesco(0l);
				ocorrenciasContasContabilistas.setCodItemLei(Integer.valueOf(listaContasContabeis.get(i).getItem()));
				ocorrenciasContasContabilistas.setCodGrupo(GissUtil.notNull(razao[0]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
				ocorrenciasContasContabilistas.setCodSubGrupo(GissUtil.notNull(razao[1]).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
				ocorrenciasContasContabilistas.setNumConta(listaContasContabeis.get(i).getConta().equals("")?0:Integer.valueOf(conta[0]));
				ocorrenciasContasContabilistas.setDigConta(listaContasContabeis.get(i).getConta().equals("")?"":conta[1]);
			}
			else{
				ocorrenciasContasContabilistas.setCodTipoServico(0);
				ocorrenciasContasContabilistas.setCodFuncBradesco(0l);
				ocorrenciasContasContabilistas.setCodItemLei(0);
				ocorrenciasContasContabilistas.setCodGrupo(0);
				ocorrenciasContasContabilistas.setCodSubGrupo(0);
				ocorrenciasContasContabilistas.setNumConta(0);
				ocorrenciasContasContabilistas.setDigConta("");
			}
			
			ocorrencias[i] = ocorrenciasContasContabilistas;
		}
		
		
		request.setListaIncluirContaContabil(ocorrencias);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
			
		IIncluirContaContabilPDCAdapter incluirContaContabilPDCAdapter = factoryAdapter.getIncluirContaContabilPDCAdapter();
		IncluirContaContabilResponse lResponse = incluirContaContabilPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		return lResponse.getCodMensagem() + " - " + lResponse.getMensagem();
	}
	
	public void listaGridContasContabeisIncluir(ContaContabilDTO dto, String origem) throws PdcAdapterException, TipoIncidenciaServiceException {

		ContaContabilDTO contasContabeis;		
		
		ListarContasContabeisRequest lRequest = new ListarContasContabeisRequest();		
		lRequest.setNroMaxOcorrencia(IContaContabilServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONTACONTABIL_INC);
		String[] razao = GissUtil.notNull(dto.getRazao()).split("-");
		lRequest.setCodigoGrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		lRequest.setCodigoSubgrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
		lRequest.setCosif(GissUtil.notNull(dto.getCosif()));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
	
		IListarContasContabeisPDCAdapter contasContabeisPDCAdapter = factoryAdapter.getListarContasContabeisPDCAdapter();
		ListarContasContabeisResponse lResponse = contasContabeisPDCAdapter.invokeProcess(lRequest);

		int cont = 0;

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			contasContabeis = new ContaContabilDTO();				
			String contaFormatada = GissUtil.notNull(lResponse.getOcorrencias(i).getNumeroConta()) == 0?"":GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(lResponse.getOcorrencias(i).getNumeroConta())), 7)+ "-" + GissUtil.removerPDoDigitoConta(lResponse.getOcorrencias(i).getDigitoConta());
			contasContabeis.setRazao(GissUtil.formatarRazaoContabil(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			contasContabeis.setConta(contaFormatada);
			contasContabeis.setCosif(GissUtil.notNull(lResponse.getOcorrencias(i).getContaContabil()).equals("")?0l:GissUtil.stringToLong(GissUtil.notNull(lResponse.getOcorrencias(i).getContaContabil()).replaceAll("\\.", "").replaceAll("-", "")));
			contasContabeis.setCosifFormatado(GissUtil.mascaraCosif(GissUtil.paraString(contasContabeis.getCosif())));
			contasContabeis.setDescricao(lResponse.getOcorrencias(i).getDescRazao());
			contasContabeis.setLinha(cont++);
			contasContabeis.setItem(GissUtil.notNull(dto.getItemDaLei()) == 0?"":String.valueOf(GissUtil.notNull(dto.getItemDaLei())));
			contasContabeis.setCheckGridIncluir(false);
			dto.getListaContasContabeis().add(contasContabeis);
		}
			
	}
	
	public void listaGridContasContabeis(ContaContabilDTO dto, String origem) throws PdcAdapterException, TipoIncidenciaServiceException {

		ContaContabilDTO contasContabeis;		
		
		//se a origem for Manter Contas Contábeis lista
		ListarContasContabeisTipoServicoRequest lRequest = new ListarContasContabeisTipoServicoRequest();		
		lRequest.setCodTipoServico(GissUtil.notNull(dto.getTipoServico()));
		
		String[] razao = GissUtil.notNull(dto.getRazao()).split("-");
		lRequest.setCodGrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		lRequest.setCodSubGrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
		lRequest.setCosif(GissUtil.notNull(dto.getCosif()));
		lRequest.setQtdeOcorrencias(50);
		lRequest.setIndicadorFuncao(GissUtil.notNull(origem));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
	
		IListarContasContabeisTipoServicoPDCAdapter contasContabeisPDCAdapter = factoryAdapter.getListarContasContabeisTipoServicoPDCAdapter();
		ListarContasContabeisTipoServicoResponse lResponse = contasContabeisPDCAdapter.invokeProcess(lRequest);

		int cont = 0;
		GissUtil gissUtil = new GissUtil();
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		for (int i = 0; i < lResponse.getListaContaContabilTipoServicoCount(); i++) {
			contasContabeis = new ContaContabilDTO();				
			contasContabeis.setRazao(GissUtil.formatarRazaoContabil(lResponse.getListaContaContabilTipoServico(i).getCodGrupo() , lResponse.getListaContaContabilTipoServico(i).getCodSubGrupo()));
			contasContabeis.setCosif(String.valueOf(GissUtil.notNull(lResponse.getListaContaContabilTipoServico(i).getCosif())).equals("")?0l:GissUtil.stringToLong(GissUtil.notNull(String.valueOf(lResponse.getListaContaContabilTipoServico(i).getCosif())).replaceAll("\\.", "").replaceAll("-", "")));
			contasContabeis.setCosifFormatado(GissUtil.mascaraCosif(GissUtil.paraString(contasContabeis.getCosif())));
			contasContabeis.setTipoServico(lResponse.getListaContaContabilTipoServico(i).getCodTipoServico());
			contasContabeis.setConta(GissUtil.notNull(lResponse.getListaContaContabilTipoServico(i).getNumConta()) == 0?
					"":GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(lResponse.getListaContaContabilTipoServico(i).getNumConta())), 7)+ "-" + GissUtil.removerPDoDigitoConta(lResponse.getListaContaContabilTipoServico(i).getDigConta()));
			contasContabeis.setDescricao(lResponse.getListaContaContabilTipoServico(i).getNomeRazao());
			contasContabeis.setItem(origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_INCLUIR)?String.valueOf(GissUtil.notNull(dto.getItemDaLei())):String.valueOf(lResponse.getListaContaContabilTipoServico(i).getCodItemLeiCompl()));
			contasContabeis.setAtualizacao(gissUtil.converteTimeStampString(lResponse.getListaContaContabilTipoServico(i).getHrManutencaoRegistro()));
			contasContabeis.setLinha(cont++);
			dto.getListaContasContabeis().add(contasContabeis);
			
		}
			
	}
		
	public void listaGridContasContabeisHistorico(ContaContabilDTO dto) throws PdcAdapterException, TipoIncidenciaServiceException {						
		ListarContasContabeisPeriodoRequest lRequest = new ListarContasContabeisPeriodoRequest();		
		ContaContabilDTO contasContabeis;
		String[] razao = dto.getRazao().split("-");
		lRequest.setDataInicial(FormatarData.formataDiaMesAnoToPdc(dto.getDataInicial()));
		lRequest.setDataFinal(FormatarData.formataDiaMesAnoToPdc(dto.getDataFinal()));
		lRequest.setNumeroMaximoOcorrencia(200);
		lRequest.setCodigoGrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[0])));
		lRequest.setCodigoSubgrupo(GissUtil.notNull(dto.getRazao()).equals("")?0:Integer.valueOf(GissUtil.notNull(razao[1])));
		lRequest.setCosif(GissUtil.notNull(dto.getCosif()));
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarContasContabeisPeriodoPDCAdapter contasContabeisPDCAdapter = factoryAdapter.getListarContasContabeisPeriodoPDCAdapter();
		ListarContasContabeisPeriodoResponse lResponse = contasContabeisPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			contasContabeis = new ContaContabilDTO();
			
			contasContabeis.setRazao(GissUtil.formatarRazaoContabil(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			String dataAtualizacao = lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/");
			String dataExclusao = lResponse.getOcorrencias(i).getDataExclusao().replace(".", "/");
			contasContabeis.setConta(GissUtil.notNull(lResponse.getOcorrencias(i).getNumeroConta()) == 0?
							"":GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(lResponse.getOcorrencias(i).getNumeroConta())), 7)+ "-" + GissUtil.removerPDoDigitoConta(lResponse.getOcorrencias(i).getDigitoConta()));
			contasContabeis.setTipoServico(lResponse.getOcorrencias(i).getCodigoServico());
			contasContabeis.setCosif(GissUtil.notNull(lResponse.getOcorrencias(i).getCodigoContaContabil()).equals("")?0l:GissUtil.stringToLong(GissUtil.notNull(lResponse.getOcorrencias(i).getCodigoContaContabil()).replaceAll("\\.", "").replaceAll("-", "")));
			contasContabeis.setCosifFormatado(GissUtil.mascaraCosif(GissUtil.paraString(contasContabeis.getCosif())));
			contasContabeis.setItem(String.valueOf(lResponse.getOcorrencias(i).getCodigoLeiComplementar()));
			contasContabeis.setAtualizacao(dataAtualizacao);	
			contasContabeis.setExclusao(dataExclusao);
			contasContabeis.setHoraAtualizacao(lResponse.getOcorrencias(i).getHoraAtualizacao());
			contasContabeis.setCodigoFuncional(GissUtil.paraString(lResponse.getOcorrencias(i).getCodigoFuncao()));
			dto.getListaContasContabeis().add(contasContabeis);
		}

	}

	public List<SelectItem> listarComboTipoServico() throws PdcAdapterException, TipoIncidenciaServiceException {
		
		List<SelectItem> comboTipoSetvicoList = new ArrayList<SelectItem>();
		ComboTipoServicoRequest lRequest = new ComboTipoServicoRequest();		
		lRequest.setTipoServico(0);
		lRequest.setNumeroMaximoOcorrencia(99);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IComboTipoServicoPDCAdapter comboTipoServicoPDCAdapter = factoryAdapter.getComboTipoServicoPDCAdapter();
		ComboTipoServicoResponse lResponse = comboTipoServicoPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			TipoServicoComboBean tipoServCombo = new TipoServicoComboBean();
			tipoServCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoTipoServico()));
			tipoServCombo.setDescricao(lResponse.getOcorrencias(i).getDescricaoTipoServico());
			comboTipoSetvicoList.add(new SelectItem(tipoServCombo.getCodigo(),tipoServCombo.getCodigo() + " - " + tipoServCombo.getDescricao()));
		}
		
		return comboTipoSetvicoList;
	}
	
	
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

