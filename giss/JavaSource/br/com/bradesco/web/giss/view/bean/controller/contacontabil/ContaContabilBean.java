package br.com.bradesco.web.giss.view.bean.controller.contacontabil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.contacontabil.IContaContabilService;
import br.com.bradesco.web.giss.service.business.contacontabil.IContaContabilServiceConstants;
import br.com.bradesco.web.giss.service.business.contacontabil.bean.ContaContabilDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class ContaContabilBean {

	private IUtilidadesService utilidadesServiceImpl;

	private ILogManager logger; // log
	private IContaContabilService contaContabilImpl; // referente a interface
	private String codListaPesquisaRadio; // item selecionado na lista de contas contábeis
	private boolean checkTodosIncluir; // checkbox Todos da função incluir
	private boolean carregaContas; // carrega ou não a lista das contas contábeis
	private boolean mostraBotoes; // mostra ou não botões de paginação
	private boolean flagConsulta;
	private boolean habilitaComboRazão = false;
	private List<SelectItem> listaControleCheckRadio = new ArrayList<SelectItem>(); // lista de controles checkbox ou radio usados na lista da inclusão
	public List<SelectItem> listaTipoServico = new ArrayList<SelectItem>(); // lista do combo de tipo de serviço
	public List<SelectItem> listaRazao = new ArrayList<SelectItem>();
	private List<CombosISSDTO> comboRazao = new ArrayList<CombosISSDTO>();
	private List<SelectItem> selectItemCosif = new ArrayList<SelectItem>();
	private List<CombosISSDTO> comboCosif = new ArrayList<CombosISSDTO>();
	private ContaContabilDTO dto = new ContaContabilDTO();
	private ContaContabilDTO dtoAlterar = new ContaContabilDTO();

	private String tpoPesquisa = "R";

	public ContaContabilBean() {

	}

	public String inicializaIncluir() {

		checkTodosIncluir = false;
		mostraBotoes = false;
		carregaContas = false;
		dto = new ContaContabilDTO();
		carregaComboTipoServico();
		habilitaComboRazão = false;
		tpoPesquisa = "R";
		carregarComboCosif();

		return "incluirContaContabil";

	}

	public String inicializaManter() {
		mostraBotoes = false;
		carregaContas = false;
		dto = new ContaContabilDTO();
		carregaComboTipoServico();
		habilitaComboRazão = false;
		tpoPesquisa = "R";
		carregarComboCosif();
		return "manterContaContabil";

	}

	public String inicializaHistorico() {
		mostraBotoes = false;
		carregaContas = false;
		carregaComboTipoServico();
		habilitaComboRazão = false;
		dto = new ContaContabilDTO();
		tpoPesquisa = "R";
		carregarComboCosif();
		return "historicoContaContabil";

	}

	public String inicializaConsultarContaTipoServico() {
		mostraBotoes = false;
		carregaContas = false;
		carregaComboTipoServico();
		habilitaComboRazão = false;
		dto = new ContaContabilDTO();
		tpoPesquisa = "R";
		carregarComboCosif();
		return "consultaContaContabilTipoServico";

	}

	public List<SelectItem> carregaComboTipoServico() {

		// Chama classe de servico para preenchimento do combo de Tipo de Serviço
		listaTipoServico = contaContabilImpl.listarComboTipoServico();

		return listaTipoServico;

	}

	public void carregarComboRazao() {
		if(GissUtil.notNull(dto.getCosif())!= 0l){
			dto.setRazao("");
			comboRazao = new ArrayList<CombosISSDTO>();
			listaRazao = new ArrayList<SelectItem>();
			comboRazao = utilidadesServiceImpl.listarComboRazao(dto.getCosif());
			for (int i = 0; i < comboRazao.size(); i++) {
				listaRazao.add(new SelectItem(comboRazao.get(i).getRazao(), comboRazao.get(i).getRazao()));
			}
		}else{
			dto.setRazao("");
			comboRazao = new ArrayList<CombosISSDTO>();
			listaRazao = new ArrayList<SelectItem>();
		}
	}

	private void carregarComboCosif() {
		comboCosif = new ArrayList<CombosISSDTO>();
		selectItemCosif = new ArrayList<SelectItem>();
		comboCosif = utilidadesServiceImpl.listarCosifEmp(237);

		for (int i = 0; i < comboCosif.size(); i++) {
			selectItemCosif.add(new SelectItem(comboCosif.get(i).getCodCosif(), String.valueOf(comboCosif.get(i).getCodCosif())));
		}
	}

	public void carregaListaContasContabeis(ActionEvent event) {
		dto.setDataInicial(new Date());
		dto.setDataFinal(new Date());
		carregaContas = false;

		// lista as contas contábeis
		listarContasContabeis(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_MANTER); // M significa que a origem é Manter Contas Contábeis. Direciona para o processo correto.
	}

	public void carregaListaContasContabeisIncluir(ActionEvent event) {
		carregaListaContasContabeisIncluir();

	}

	public void carregaListaContasContabeisIncluir() {

		dto.setDataInicial(new Date());
		dto.setDataFinal(new Date());

		carregaContas = false;

		// lista as contas contábeis
		listarContasContabeis(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_INCLUIR); // I significa que a origem é Incluir Contas Contábeis. Direciona para o processo correto.

	}

	public void carregaListaContasContabeisHistorico(ActionEvent event) {
		// lista as contas contábeis
		mostraBotoes = false;
		carregaContas = false;

		if (!DateUtils.isSameDay(dto.getDataInicial(), dto.getDataFinal()) && dto.getDataInicial().compareTo(dto.getDataFinal()) > 0) {
			BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data inicial.", "historicoContaContabil", BradescoViewExceptionActionType.ACTION, false);
			return;
		}

		listarContasContabeis(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_HISTORICO); // H significa que a origem é Histórico Contas Contábeis. Direciona para o processo correto.
	}

	private void listarContasContabeis(String origem) {

		try {
			if(!origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_HISTORICO)){
				if(GissUtil.notNull(dto.getTipoServicoString()).equals("")){
					BradescoFacesUtils.addErrorModalMessage("Favor preencher o campo Tipo de Serviço.");
					return;
				}else{
					dto.setTipoServico(Integer.valueOf(dto.getTipoServicoString()));
				}
			}
			
			dto.getListaContasContabeis().clear();
			if(origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_HISTORICO)){
				contaContabilImpl.listaGridContasContabeisHistorico(dto);
			}else if(origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_INCLUIR)){
				contaContabilImpl.listaGridContasContabeisIncluir(dto, origem);
			}else if(origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_MANTER)){
				contaContabilImpl.listaGridContasContabeis(dto, origem);
			}

			if (dto.getListaContasContabeis() != null) {
				listaControleCheckRadio = new ArrayList<SelectItem>();
				for (int i = 0; i <= dto.getListaContasContabeis().size(); i++) {
					listaControleCheckRadio.add(new SelectItem(i, " "));
				}

				if (dto.getListaContasContabeis().size() > IContaContabilServiceConstants.NUMERO_REGISTROS_LISTA_CONTACONTABIL) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				carregaContas = true;
			}
		} catch (PdcAdapterFunctionalException p) {
			if (origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_MANTER) && flagConsulta == false)
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "manterContaContabil", BradescoViewExceptionActionType.ACTION, false);
			else if (origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_MANTER) && flagConsulta == true) {
				flagConsulta = false;
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultaContaContabilTipoServico", BradescoViewExceptionActionType.ACTION, false);
			} else if (origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_INCLUIR)) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "incluirContaContabil", BradescoViewExceptionActionType.ACTION, false);
			} else if (origem.equals(IContaContabilServiceConstants.ORIGEM_LISTA_CONTAS_CONTABEIS_HISTORICO))
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "historicoContaContabil", BradescoViewExceptionActionType.ACTION, false);
			else
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "consultaContaContabilTipoServico", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	} 

	public String carregaAlteracao() {
		
		dtoAlterar = new ContaContabilDTO();
		dtoAlterar = dto.getListaContasContabeis().get(Integer.parseInt(getCodListaPesquisaRadio()));
		for (int i = 0; i < listaTipoServico.size(); i++) {
			if(Integer.valueOf(listaTipoServico.get(i).getValue().toString()).equals(dto.getTipoServico()))
				dtoAlterar.setTipoServicoDesc(listaTipoServico.get(i).getLabel());
		}
		dtoAlterar.setItemDaLei(Integer.valueOf(dto.getListaContasContabeis().get(Integer.parseInt(getCodListaPesquisaRadio())).getItem()));
		return "carrega_alteracao";
	}

	public String carregaExclusao() {

		dtoAlterar = new ContaContabilDTO();
		dtoAlterar = dto.getListaContasContabeis().get(Integer.parseInt(getCodListaPesquisaRadio()));
		for (int i = 0; i < listaTipoServico.size(); i++) {
			if(Integer.valueOf(listaTipoServico.get(i).getValue().toString()).equals(dto.getTipoServico()))
				dtoAlterar.setTipoServicoDesc(listaTipoServico.get(i).getLabel());
		}

		return "carrega_exclusao";
	}

	public String voltarInicialIncluir() {
		return inicializaIncluir();
	}

	public String voltarInicial() {
		carregaListaContasContabeis(null);

		return "inicial_manter_contas";
	}

	public String voltarPesquisarHistorico() {

		carregaContas = false;
		// tipoServicoFiltro = "0";
		dto.setDataInicial(null);
		dto.setDataFinal(null);

		return "historicoContaContabil";
	}
	
	public void imprimirPlanilhaEletronicaHistorico(){
		ExportarPlanilha exportar = new ExportarPlanilha("PLANILHA_HISTORICO_RAZAO_CONTABIL", "Histórico Razão Contábil");
		try {
			exportar.planilhaHistoricoRazaoContabil(dto.getListaContasContabeis());
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
	}

	public String voltarPesquisarConsultaContaTipoServico() {

		carregaContas = false;
		// tipoServicoFiltro = "";
		// dataInicial = null;
		// dataFinal = null;
		// razao = null;
		return "consultaContaContabilTipoServico";
	}

	public String alteraContaContabil(ActionEvent event) {
		try {
			if(GissUtil.notNull(dtoAlterar.getItemDaLei())==0){
				BradescoFacesUtils.addErrorModalMessage("Favor preencher o campo Item da LC Padrão.");
				return "";
			}
			String msg = contaContabilImpl.alterarContaContabil(dtoAlterar);
			BradescoFacesUtils.addInfoModalMessage(msg, "manterContaContabil", BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			inicializaManter();
		}
		return "";
	}

	public String excluiContaContabil(ActionEvent event) {
		try {
			String msg = "";
			if(GissUtil.notNull(dtoAlterar.getConta()).equalsIgnoreCase("")){
				msg = contaContabilImpl.excluirContaContabil(dtoAlterar);
			}else{
				msg = contaContabilImpl.excluirContaContabilPorConta(dtoAlterar);
			}			
			BradescoFacesUtils.addInfoModalMessage(msg, "manterContaContabil", BradescoViewExceptionActionType.ACTION, false);
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			inicializaManter();
		}
		return "";
	}

	public void incluirContasContabeis() {

		try {
		
			if(GissUtil.notNull(dto.getTipoServicoString()).equals("")){
				BradescoFacesUtils.addErrorModalMessage("Favor preencher o campo Tipo de Serviço.");
				return;
			}else{
				dto.setTipoServico(Integer.valueOf(dto.getTipoServicoString()));
			}
	
			ContaContabilDTO contasContabilDTO = new ContaContabilDTO();
			for(int i=0;i < dto.getListaContasContabeis().size(); i++){
			
				if(dto.getListaContasContabeis().get(i).isCheckGridIncluir() == true){
					dto.getListaContasContabeis().get(i).setTipoServico(dto.getTipoServico());
					contasContabilDTO.getListaContasContabeisIncluir().add(dto.getListaContasContabeis().get(i));
				 }
			}
			if(contasContabilDTO.getListaContasContabeisIncluir().size() > 0){
				String msg = contaContabilImpl.incluirContaContabil(contasContabilDTO);
				BradescoFacesUtils.addInfoModalMessage(msg, "#{contaContabilBean.inicializaIncluir}", BradescoViewExceptionActionType.ACTION, false);
			}else{
				BradescoFacesUtils.addErrorModalMessage("Favor selecionar uma ou mais contas para incluir.");
			}
		
		 } catch (PdcAdapterFunctionalException p) {
			 BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
			 return;
		 } catch (Exception e) {
			 throw new BradescoViewException(e.getMessage(), e, null);
		 }
	}


	public String limparDadosIncluir() {
		return inicializaIncluir();
	}

	public String limparDadosHistorico() {

		return inicializaHistorico();

	}

	public void imprimirPlanilha(ActionEvent ae) {

		try {
			imprimirPlanilhaRazoes(1);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}

	}

	public void imprimirManterRazaoContabil(ActionEvent ae) {

		try {
			imprimirPlanilhaRazoes(2);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}

	}

	private void imprimirPlanilhaRazoes(int flag) throws Exception {

		ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Razões Contábeis", "RAZOES_CONTABEIS");
		exportarPlanilha.razoesContabeis(dto.getListaContasContabeis(), flag);

	}

	public boolean isFlagConsulta() {
		return flagConsulta;
	}

	public void setFlagConsulta(boolean flagConsulta) {
		this.flagConsulta = flagConsulta;
	}

	public List<SelectItem> getListaControleCheckRadio() {
		return listaControleCheckRadio;
	}

	public void setListaControleCheck(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public String getCodListaPesquisaRadio() {
		return codListaPesquisaRadio;
	}

	public void setCodListaPesquisaRadio(String codListaPesquisaRadio) {
		this.codListaPesquisaRadio = codListaPesquisaRadio;
	}

	public List<SelectItem> getListaTipoServico() {
		return listaTipoServico;
	}

	public void setListaTipoServico(List<SelectItem> listaTipoServico) {
		this.listaTipoServico = listaTipoServico;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public boolean isCheckTodosIncluir() {
		return checkTodosIncluir;
	}

	public void setCheckTodosIncluir(boolean checkTodosIncluir) {
		this.checkTodosIncluir = checkTodosIncluir;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}

	public boolean isCarregaContas() {
		return carregaContas;
	}

	public void setCarregaContas(boolean carregaContas) {
		this.carregaContas = carregaContas;
	}

	public void setListaControleCheckRadio(List<SelectItem> listaControleCheckRadio) {
		this.listaControleCheckRadio = listaControleCheckRadio;
	}

	public IContaContabilService getContaContabilImpl() {
		return contaContabilImpl;
	}

	public void setContaContabilImpl(IContaContabilService contaContabilImpl) {
		this.contaContabilImpl = contaContabilImpl;
	}

	/**
	 * @return the tpoPesquisa
	 */
	public String getTpoPesquisa() {
		return tpoPesquisa;
	}

	/**
	 * @param tpoPesquisa
	 *            the tpoPesquisa to set
	 */
	public void setTpoPesquisa(String tpoPesquisa) {
		this.tpoPesquisa = tpoPesquisa;
	}


	/**
	 * @return the utilidadesServiceImpl
	 */
	public IUtilidadesService getUtilidadesServiceImpl() {
		return utilidadesServiceImpl;
	}

	/**
	 * @param utilidadesServiceImpl
	 *            the utilidadesServiceImpl to set
	 */
	public void setUtilidadesServiceImpl(IUtilidadesService utilidadesServiceImpl) {
		this.utilidadesServiceImpl = utilidadesServiceImpl;
	}

	/**
	 * @return the listaRazao
	 */
	public List<SelectItem> getListaRazao() {
		return listaRazao;
	}

	/**
	 * @param listaRazao
	 *            the listaRazao to set
	 */
	public void setListaRazao(List<SelectItem> listaRazao) {
		this.listaRazao = listaRazao;
	}

	/**
	 * @return the comboRazao
	 */
	public List<CombosISSDTO> getComboRazao() {
		return comboRazao;
	}

	/**
	 * @param comboRazao
	 *            the comboRazao to set
	 */
	public void setComboRazao(List<CombosISSDTO> comboRazao) {
		this.comboRazao = comboRazao;
	}

	/**
	 * @return the selectItemCosif
	 */
	public List<SelectItem> getSelectItemCosif() {
		return selectItemCosif;
	}

	/**
	 * @param selectItemCosif
	 *            the selectItemCosif to set
	 */
	public void setSelectItemCosif(List<SelectItem> selectItemCosif) {
		this.selectItemCosif = selectItemCosif;
	}

	/**
	 * @return the comboCosif
	 */
	public List<CombosISSDTO> getComboCosif() {
		return comboCosif;
	}

	/**
	 * @param comboCosif
	 *            the comboCosif to set
	 */
	public void setComboCosif(List<CombosISSDTO> comboCosif) {
		this.comboCosif = comboCosif;
	}

	/**
	 * @return the dto
	 */
	public ContaContabilDTO getDto() {
		return dto;
	}

	/**
	 * @param dto
	 *            the dto to set
	 */
	public void setDto(ContaContabilDTO dto) {
		this.dto = dto;
	}

	/**
	 * @return the habilitaComboRazão
	 */
	public boolean isHabilitaComboRazão() {
		return habilitaComboRazão;
	}

	/**
	 * @param habilitaComboRazão
	 *            the habilitaComboRazão to set
	 */
	public void setHabilitaComboRazão(boolean habilitaComboRazão) {
		this.habilitaComboRazão = habilitaComboRazão;
	}

	/**
	 * @return the dtoAlterar
	 */
	public ContaContabilDTO getDtoAlterar() {
		return dtoAlterar;
	}

	/**
	 * @param dtoAlterar the dtoAlterar to set
	 */
	public void setDtoAlterar(ContaContabilDTO dtoAlterar) {
		this.dtoAlterar = dtoAlterar;
	}

	

}