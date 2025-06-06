package br.com.bradesco.web.giss.view.bean.controller.issgerencial.percentualTransicao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.percentualTransicao.IPercentualTransicaoService;
import br.com.bradesco.web.giss.service.business.percentualTransicao.bean.PercentualTransicaoDTO;
import br.com.bradesco.web.giss.utils.GissUtil;


public class ParametrizarPercentualTransicaoBean {

	private static final String PARAMETRIZAR_PERCENTUAL_TRANSICAO_CONSULTA = "consultarPercentualTransicao";
	private static final String PARAMETRIZAR_PERCENTUAL_TRANSICAO_INCLUSAO = "incluirPercentualTransicao";
	private static final String PARAMETRIZAR_PERCENTUAL_TRANSICAO_ALTERACAO = "alterarPercentualTransicao";
	
	private ILogManager logManager;
	
	private IPercentualTransicaoService percentualTransicaoServiceImpl;

	private List<SelectItem> listaControle;
	private List<PercentualTransicaoDTO> listaConsulta;
	private PercentualTransicaoDTO dto;
	private Integer itemSelecionado;

	public String inicializar(){
		limparConsulta();
		carregarLista();
		return PARAMETRIZAR_PERCENTUAL_TRANSICAO_CONSULTA;
	}
	
	public String prepararInclusao() {
		limparIncluirAlterar();
		return PARAMETRIZAR_PERCENTUAL_TRANSICAO_INCLUSAO;
	}

	public String prepararAlteracao() {
		limparIncluirAlterar();

		if(getItemSelecionado() == null){
			BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);
			return PARAMETRIZAR_PERCENTUAL_TRANSICAO_CONSULTA;
		} else {
			setDto(getListaConsulta().get(getItemSelecionado()));
			return PARAMETRIZAR_PERCENTUAL_TRANSICAO_ALTERACAO;
		}
	}
	
	public String voltar() {
		return inicializar();
	}
	
	public String incluir() {
		try {
			String retorno = percentualTransicaoServiceImpl.incluir(getDto());

			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
			return inicializar();
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			
		}
		
		return PARAMETRIZAR_PERCENTUAL_TRANSICAO_INCLUSAO;
	}

	public String alterar() {
		try {
			String retorno = percentualTransicaoServiceImpl.alterar(getDto());

			BradescoFacesUtils.addInfoModalMessage(retorno, false);
			
			return inicializar();
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			
		}
		
		return PARAMETRIZAR_PERCENTUAL_TRANSICAO_ALTERACAO;
	}
	
	public String excluir() {
		try {
			if(getItemSelecionado() == null){
				BradescoFacesUtils.addInfoModalMessage("Selecione um Registro na Lista.", false);
			} else {
				String retorno = percentualTransicaoServiceImpl.excluir(getListaConsulta().get(getItemSelecionado()));
				
				BradescoFacesUtils.addInfoModalMessage(retorno, false);
				
				return inicializar();
			}
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			throw new BradescoViewException(e.getMessage(), e, null);
		} finally {
			
		}
		
		return PARAMETRIZAR_PERCENTUAL_TRANSICAO_CONSULTA;
	}

	private void carregarLista() {
		try {
			List<PercentualTransicaoDTO> lista = percentualTransicaoServiceImpl.listar();
			
			if (!GissUtil.isEmptyOrNull(lista)) {
				setListaConsulta(lista);
				setListaControle(GissUtil.criarSelectItemList(getListaConsulta().size(), 0));
			}
		} catch (PdcAdapterFunctionalException p) {
			getLogManager().error(this.getClass(), p);
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
		} finally {
			
		}
	}

	private void limparConsulta() {
		setListaControle(new ArrayList<SelectItem>());
		setListaConsulta(new ArrayList<PercentualTransicaoDTO>());
		setItemSelecionado(null);
	}
	
	private void limparIncluirAlterar() {
		setDto(new PercentualTransicaoDTO());
	}
	
	
	public IPercentualTransicaoService getPercentualTransicaoServiceImpl() {
		return percentualTransicaoServiceImpl;
	}

	public void setPercentualTransicaoServiceImpl(
			IPercentualTransicaoService percentualTransicaoServiceImpl) {
		this.percentualTransicaoServiceImpl = percentualTransicaoServiceImpl;
	}

	public List<PercentualTransicaoDTO> getListaConsulta() {
		return listaConsulta;
	}

	public void setListaConsulta(List<PercentualTransicaoDTO> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

	public List<SelectItem> getListaControle() {
		return listaControle;
	}

	public void setListaControle(List<SelectItem> listaControle) {
		this.listaControle = listaControle;
	}

	public PercentualTransicaoDTO getDto() {
		return dto;
	}

	public void setDto(PercentualTransicaoDTO dto) {
		this.dto = dto;
	}

	public ILogManager getLogManager() {
		return logManager;
	}

	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	public Integer getItemSelecionado() {
		return itemSelecionado;
	}

	public void setItemSelecionado(Integer itemSelecionado) {
		this.itemSelecionado = itemSelecionado;
	}
}
