package br.com.bradesco.web.giss.view.bean.controller.tiposervico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.tiposervico.ITipoServicoService;
import br.com.bradesco.web.giss.service.business.tiposervico.ITipoServicoServiceConstants;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.HistoricoTipoServicoDTO;
import br.com.bradesco.web.giss.service.business.tiposervico.bean.TipoServicoDTO;

public class TipoServicoBean {

	private String codigo;

	private String descricao;

	private List<TipoServicoDTO> listaGridTipoServico;

	private boolean mostraBotoes;
	
	private boolean carregaFaixas;

	private ITipoServicoService tipoServicoImpl;

	private List<SelectItem> listaControle;

	private String codListaPesquisar;

	private boolean hiddenProsseguir;
	
	//referente a historico
	private Date dataInicialHist;	
	private Date dataFinalHist;
	private boolean carregaHistorico;
	private List<HistoricoTipoServicoDTO> listaTipoServicoHistorico = new ArrayList<HistoricoTipoServicoDTO>();
	private List<SelectItem> listaControleRadio;

	public TipoServicoBean() {
		listaControle = new ArrayList<SelectItem>();
	}

	public String limparDados() {
		codigo = "";
		descricao = "";
		return "incluirTipoServico";
	}

	public void pesquisarManter(ActionEvent event) {
		listarTipoServico("M");
	}
	
	public void pesquisarIncluir(ActionEvent event) {
		listarTipoServico("I");
	}

	public String carregarIncluirListaTipoServico() {
		codigo = "";
		descricao = "";
		carregaFaixas = false;
		listarTipoServico("I");
		return "incluirTipoServico";
	}

	public String carregarAlterarListaTipoServico() {
		carregaFaixas = false;
		listarTipoServico("M");
		return "alterarTipoServico";
	}

	public String prosseguirResultado() {
		listarTipoServico("M");

		TipoServicoDTO tipoServicoDTO = listaGridTipoServico.get(new Integer(codListaPesquisar));
		setCodigo(tipoServicoDTO.getCodigo());
		setDescricao(tipoServicoDTO.getDescricao());

		return "alterarTipoServicoProsseguir";
	}

	public String incluirTipoServico() {

		try {
			TipoServicoDTO tipoServicoDTO = new TipoServicoDTO();

			if(!codigo.equals("") && !descricao.equals("")){
				tipoServicoDTO.setCodigo(codigo);
				tipoServicoDTO.setDescricao(descricao);
				tipoServicoDTO.setFuncao(ITipoServicoServiceConstants.COD_INCLUSAO);

				tipoServicoDTO = tipoServicoImpl.manterTipoServico(tipoServicoDTO);

				codigo = "";
				descricao = "";
				BradescoFacesUtils.addInfoModalMessage(tipoServicoDTO.getMensagem(), "incluirTipoServico", BradescoViewExceptionActionType.ACTION, false);				
			}else{
				BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "incluirTipoServico", BradescoViewExceptionActionType.ACTION, false);
			}
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "incluirTipoServico", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			listarTipoServico("I");
		}

		return null;
	}

	public String modificarTipoServico() {
		if (isHiddenProsseguir()) {

			try {
				TipoServicoDTO tipoServicoDTO = new TipoServicoDTO();
				
				if(!codigo.equals("") && !descricao.equals("")){
					tipoServicoDTO.setCodigo(codigo);
					tipoServicoDTO.setDescricao(descricao);
					tipoServicoDTO.setFuncao(ITipoServicoServiceConstants.COD_ALTERACAO);

					tipoServicoDTO = tipoServicoImpl.manterTipoServico(tipoServicoDTO);
					
					codigo = "";
					descricao = "";
					BradescoFacesUtils.addInfoModalMessage(tipoServicoDTO.getMensagem(), "alterarTipoServico", BradescoViewExceptionActionType.ACTION, false);
				}else{
					BradescoFacesUtils.addInfoModalMessage("Os campos são obrigatórios.", "alterarTipoServicoProsseguir", BradescoViewExceptionActionType.ACTION, false);
				}	
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "alterarTipoServico", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			} finally {
				listarTipoServico("M");
			}
		}

		return null;
	}

	public String excluirTipoServico() {
		if (isHiddenProsseguir()) {

			try {
				TipoServicoDTO tipoServicoDTO = new TipoServicoDTO();

				tipoServicoDTO.setCodigo(codigo);
				tipoServicoDTO.setDescricao(descricao);
				tipoServicoDTO.setFuncao(ITipoServicoServiceConstants.COD_EXCLUSAO);

				tipoServicoDTO = tipoServicoImpl.manterTipoServico(tipoServicoDTO);

				BradescoFacesUtils.addInfoModalMessage(tipoServicoDTO.getMensagem(), "alterarTipoServico", BradescoViewExceptionActionType.ACTION, false);
			} catch (PdcAdapterFunctionalException p) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "alterarTipoServico", BradescoViewExceptionActionType.ACTION, false);
			} catch (Exception e) {
				throw new BradescoViewException(e.getMessage(), e, null);
			} finally {
				listarTipoServico("M");
			}
		}

		return null;
	}

	private void listarTipoServico(String origem) {

		try {
			listaGridTipoServico = tipoServicoImpl.listaGridTipoServico();

			if (listaGridTipoServico != null) {
				listaControle = new ArrayList<SelectItem>();
				for (int i = 0; i <= listaGridTipoServico.size(); i++) {
					listaControle.add(new SelectItem(i, " "));
				}

				if (listaGridTipoServico.size() > ITipoServicoServiceConstants.NUMERO_REGISTROS_LISTA_TIPOSERVICO) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				this.carregaFaixas = true;
			}
		
		} catch (PdcAdapterFunctionalException p) {
			if(origem.equals("I"))
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "incluirTipoServico", BradescoViewExceptionActionType.ACTION, false);
			else
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "alterarTipoServico", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	
	}

	
	
	public String carregarHistoricoTipoServico() {
		
		carregaHistorico = false;
		dataInicialHist = null;
		dataFinalHist = null;
		listaTipoServicoHistorico = null;
		
		return "historicoTipoServico";
	}
	
	public String limparDadosHistorico() {

		carregaHistorico = false;
		dataInicialHist = null;
		dataFinalHist = null;
		if(listaTipoServicoHistorico != null){
			listaTipoServicoHistorico.clear();
		}else{
			listaTipoServicoHistorico = null;
		}
		
		return "historicoTipoServico";
	}
	
	public void carregaListaHistoricoTipoServico(ActionEvent event) {
		
		int RespostaData = dataFinalHist.compareTo(dataInicialHist);
		 
		if (RespostaData < 0 ) {
			dataInicialHist = null;
			dataFinalHist = null;
			BradescoFacesUtils.addInfoModalMessage("A data final deve ser maior ou igual a data inicial.", "historicoTipoServico", BradescoViewExceptionActionType.ACTION, false);
		}else{
			carregaHistorico = false;
			listarHistoricoTipoServico();
		}
	}
	
	public void paginarPesquisaHistorico(ActionEvent event){
	
		carregaHistorico = false;
		listaTipoServicoHistorico.clear();
		listarHistoricoTipoServico();
		
	}
			
	private void listarHistoricoTipoServico() {

		try {
			listaTipoServicoHistorico = tipoServicoImpl.listaHistoricoTipoServico(dataInicialHist, dataFinalHist);

			if (listaTipoServicoHistorico != null) {

				if (listaTipoServicoHistorico.size() > ITipoServicoServiceConstants.NUMERO_REGISTROS_LISTA_HISTORICO_TIPOSERVICO) {
					mostraBotoes = true;
				} else {
					mostraBotoes = false;
				}
				this.carregaHistorico = true;
			}
		
		} catch (PdcAdapterFunctionalException p) {
				dataInicialHist = null;
				dataFinalHist = null;
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(), "historicoTipoServico", BradescoViewExceptionActionType.ACTION, false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	
	}
	
	
	
	
	
	public boolean isCarregaHistorico() {
		return carregaHistorico;
	}

	public void setCarregaHistorico(boolean carregaHistorico) {
		this.carregaHistorico = carregaHistorico;
	}

	public Date getDataFinalHist() {
		return dataFinalHist;
	}

	public void setDataFinalHist(Date dataFinalHist) {
		this.dataFinalHist = dataFinalHist;
	}

	public Date getDataInicialHist() {
		return dataInicialHist;
	}

	public void setDataInicialHist(Date dataInicialHist) {
		this.dataInicialHist = dataInicialHist;
	}

	public List<SelectItem> getListaControleRadio() {
		return listaControleRadio;
	}

	public void setListaControleRadio(List<SelectItem> listaControleRadio) {
		this.listaControleRadio = listaControleRadio;
	}

	public List<HistoricoTipoServicoDTO> getListaTipoServicoHistorico() {
		return listaTipoServicoHistorico;
	}

	public void setListaTipoServicoHistorico(
			List<HistoricoTipoServicoDTO> listaTipoServicoHistorico) {
		this.listaTipoServicoHistorico = listaTipoServicoHistorico;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodListaPesquisar() {
		return codListaPesquisar;
	}

	public void setCodListaPesquisar(String codListaPesquisar) {
		this.codListaPesquisar = codListaPesquisar;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}

	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}

	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	public List<TipoServicoDTO> getListaGridTipoServico() {
		return listaGridTipoServico;
	}

	public void setListaGridTipoServico(List<TipoServicoDTO> listaGridTipoServico) {
		this.listaGridTipoServico = listaGridTipoServico;
	}

	public boolean isMostraBotoes() {
		return mostraBotoes;
	}

	public void setMostraBotoes(boolean mostraBotoes) {
		this.mostraBotoes = mostraBotoes;
	}

	public ITipoServicoService getTipoServicoImpl() {
		return tipoServicoImpl;
	}

	public void setTipoServicoImpl(ITipoServicoService tipoServicoImpl) {
		this.tipoServicoImpl = tipoServicoImpl;
	}

	public boolean isCarregaFaixas() {
		return carregaFaixas;
	}

	public void setCarregaFaixas(boolean carregaFaixas) {
		this.carregaFaixas = carregaFaixas;
	}
	
}
