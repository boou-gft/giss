package br.com.bradesco.web.giss.view.bean.controller.issgerencial.arquivoempresa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.arquivoempresa.IArquivoEmpresaISSService;
import br.com.bradesco.web.giss.service.business.arquivoempresa.bean.ArquivoEmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

import com.lowagie.text.DocumentException;

public class ArquivoEmpresaISSBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -95056171670006982L;

	IEmpresaISSService empresasISSServiceImpl = (IEmpresaISSService) FacesUtils
			.getManagedBean("empresasISSServiceImpl");
	private IArquivoEmpresaISSService arquivoEmpresaISSServiceImpl;
	private boolean hiddenProsseguir;
	private boolean mostrarLista;
	private Integer itemTabelaSelecionado;

	private ArquivoEmpresaISSDTO dto = new ArquivoEmpresaISSDTO();
	private EmpresaISSDTO dtoCombo = new EmpresaISSDTO();
	private Integer tipoPesquisa;
	private static final int INICIAL = 1;
	private static final int PESQUISAR = 2;
	private static final String MENSAL = "M";
	private static final String SEMANAL = "S";
	private String tela;

	private List<SelectItem> listaControleRadio = new ArrayList<SelectItem>();
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>();
	private List<SelectItem> selectlistaEmp = new ArrayList<SelectItem>();

	public String carregarConsulta() {
		dto = new ArquivoEmpresaISSDTO();
		dtoCombo = new EmpresaISSDTO();
		dtoCombo.getLista().clear();
		mostrarLista = false;
		carregarLista(dto, INICIAL, MENSAL);
		carregarComboEmpresa();
		tela = "conArquivoEmp";
		return tela;
	}

	public String carregarConsultaSemanais() {
		dto = new ArquivoEmpresaISSDTO();
		dtoCombo = new EmpresaISSDTO();
		dtoCombo.getLista().clear();
		mostrarLista = false;
		carregarLista(dto, INICIAL, SEMANAL);
		carregarComboEmpresa();
		tela = "conArquivoEmpSem";
		return tela;
	}

	public String pesquisar() {
		try {
			if(validarPesquisa()){
				if (GissUtil.notNull(dto.getAnoBase()) == 0
						|| GissUtil.notNull(dto.getMesBase()) == 0) {
					dto.setAnoMes("");
				} else {
					dto.setAnoMes(String.valueOf(dto.getAnoBase())
							+ GissUtil.preencherZerosEsquerda(
									String.valueOf(dto.getMesBase()), 2));
				}
				carregarLista(dto, PESQUISAR,
						tela.equals("conArquivoEmpSem") ? SEMANAL : MENSAL);	
			}
			
		} catch (PdcAdapterFunctionalException p) {
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
		return "";
	}
	
	public boolean validarPesquisa() {
		boolean retorno = true;
		Calendar cal = Calendar.getInstance();
		int mesCorrente = cal.get(Calendar.MONTH)+1;
		int anoCorrente = cal.get(Calendar.YEAR);
		
		if(dto.getIndicadorTela()=="M"){
			return retorno;
		}
		if (dto.getMesBase()== null){
			BradescoFacesUtils.addInfoModalMessage("INFORME O MÊS BASE", false);
			retorno = false;	
		} else if (dto.getAnoBase()== null){
			BradescoFacesUtils.addInfoModalMessage("INFORME O ANO BASE", false);
			retorno = false;
		} else if (dto.getAnoBase() > anoCorrente){
			BradescoFacesUtils.addErrorModalMessage("ANO BASE INVÁLIDO");
			retorno = false;
			return retorno;
			
		} else if (dto.getMesBase()> mesCorrente){
			if(dto.getAnoBase()< anoCorrente){
				retorno = true;
			}else{
			BradescoFacesUtils.addErrorModalMessage("MÊS BASE INVÁLIDO");
			retorno = false;
			}
			
		} else if (dto.getMesBase() > mesCorrente && dto.getAnoBase() > anoCorrente){
			BradescoFacesUtils.addErrorModalMessage("MÊS BASE E ANO BASE INVÁLIDOS");
			retorno = false;
		}
		
		return retorno;
	}

	private void carregarComboEmpresa() {
		listaEmpresa = new ArrayList<SelectItem>();
		empresasISSServiceImpl.ListaEmpCadastro(dtoCombo);
		for (int i = 0; i < dtoCombo.getLista().size(); i++) {
			listaEmpresa.add(new SelectItem(dtoCombo.getLista().get(i)
					.getCodEmpresa(), dtoCombo.getLista().get(i)
					.getCnpjFormatado()
					+ " - " + dtoCombo.getLista().get(i).getDescEmpresa()));
		}
	}

	private void carregarLista(ArquivoEmpresaISSDTO dto, int tipoPesquisa,
			String tipoArquivo) {
		try {
			dto.setLista(new ArrayList<ArquivoEmpresaISSDTO>());
			if (tipoArquivo.equals("M")) {
				dto.setIndicadorTela("M");
				arquivoEmpresaISSServiceImpl.ListaArquivoEmpresa(dto,
						tipoArquivo);
			} else if (tipoArquivo.equals("S")) {
				dto.setIndicadorTela("S");
				arquivoEmpresaISSServiceImpl.ListaArquivosEmpresaSemanal(dto,
						tipoArquivo);
			}

			mostrarLista = dto.getLista().size() > 0;
			if (dto.getLista() != null) {
				selectlistaEmp = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectlistaEmp.add(new SelectItem(i, " "));
				}
			}
		} catch (PdcAdapterFunctionalException p) {
			if (tipoPesquisa == INICIAL
					&& p.getMessage().equals(
							"NAO EXISTEM DADOS A SEREM LISTADOS")) {
				return;
			}
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(), false);
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}
	}

	public String imprimirPlanilha(ActionEvent ae) {
		try {
			if (dto.getLista().size() > 0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha(
						"Planilha Arquivos das Empresas (Painel de Controle)",
						"ARQUIVOS_EMPRESAS_PAINEL_CONTR");
				exportarPlanilha.planilhaArquivosEmp(dto.getLista(), dto);
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista está vazia",
						false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;

	}

	public String consultarTXT(ActionEvent ae) throws DocumentException,
			IOException {
		if (dto.getLista().size() > 0) {
			arquivoEmpresaISSServiceImpl.gerarPainelControleTXT(dto.getLista(),
					FacesUtils.getServletResponse().getOutputStream(), dto);
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista está vazia", false);
			return "";
		}
		FacesUtils.getServletResponse().setContentType("application/txt");
		FacesUtils.getServletResponse().setHeader("Content-Disposition",
				"attachment;filename=painelControle.txt");
		FacesUtils.getContext().responseComplete();
		return null;
	}

	/**
	 * @return the mostrarLista
	 */
	public boolean isMostrarLista() {
		return mostrarLista;
	}

	/**
	 * @param mostrarLista
	 *            the mostrarLista to set
	 */
	public void setMostrarLista(boolean mostrarLista) {
		this.mostrarLista = mostrarLista;
	}

	/**
	 * @return the listaControleRadio
	 */
	public List<SelectItem> getListaControleRadio() {
		return listaControleRadio;
	}

	/**
	 * @param listaControleRadio
	 *            the listaControleRadio to set
	 */
	public void setListaControleRadio(List<SelectItem> listaControleRadio) {
		this.listaControleRadio = listaControleRadio;
	}

	/**
	 * @return the hiddenProsseguir
	 */
	public boolean isHiddenProsseguir() {
		return hiddenProsseguir;
	}

	/**
	 * @param hiddenProsseguir
	 *            the hiddenProsseguir to set
	 */
	public void setHiddenProsseguir(boolean hiddenProsseguir) {
		this.hiddenProsseguir = hiddenProsseguir;
	}

	/**
	 * @return the itemTabelaSelecionado
	 */
	public Integer getItemTabelaSelecionado() {
		return itemTabelaSelecionado;
	}

	/**
	 * @param itemTabelaSelecionado
	 *            the itemTabelaSelecionado to set
	 */
	public void setItemTabelaSelecionado(Integer itemTabelaSelecionado) {
		this.itemTabelaSelecionado = itemTabelaSelecionado;
	}

	/**
	 * @return the dtoCon
	 */
	public ArquivoEmpresaISSDTO getDto() {
		return dto;
	}

	/**
	 * @param dtoCon
	 *            the dtoCon to set
	 */
	public void setDto(ArquivoEmpresaISSDTO dto) {
		this.dto = dto;
	}

	/**
	 * @return the listaEmpresa
	 */
	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	/**
	 * @param listaEmpresa
	 *            the listaEmpresa to set
	 */
	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	/**
	 * @return the arquivoEmpresaISSServiceImpl
	 */
	public IArquivoEmpresaISSService getArquivoEmpresaISSServiceImpl() {
		return arquivoEmpresaISSServiceImpl;
	}

	/**
	 * @param arquivoEmpresaISSServiceImpl
	 *            the arquivoEmpresaISSServiceImpl to set
	 */
	public void setArquivoEmpresaISSServiceImpl(
			IArquivoEmpresaISSService arquivoEmpresaISSServiceImpl) {
		this.arquivoEmpresaISSServiceImpl = arquivoEmpresaISSServiceImpl;
	}

	/**
	 * @return the selectlistaEmp
	 */
	public List<SelectItem> getSelectlistaEmp() {
		return selectlistaEmp;
	}

	/**
	 * @param selectlistaEmp
	 *            the selectlistaEmp to set
	 */
	public void setSelectlistaEmp(List<SelectItem> selectlistaEmp) {
		this.selectlistaEmp = selectlistaEmp;
	}

	/**
	 * @return the dtoCombo
	 */
	public EmpresaISSDTO getDtoCombo() {
		return dtoCombo;
	}

	/**
	 * @param dtoCombo
	 *            the dtoCombo to set
	 */
	public void setDtoCombo(EmpresaISSDTO dtoCombo) {
		this.dtoCombo = dtoCombo;
	}

	/**
	 * @return the empresasISSServiceImpl
	 */
	public IEmpresaISSService getEmpresasISSServiceImpl() {
		return empresasISSServiceImpl;
	}

	/**
	 * @param empresasISSServiceImpl
	 *            the empresasISSServiceImpl to set
	 */
	public void setEmpresasISSServiceImpl(
			IEmpresaISSService empresasISSServiceImpl) {
		this.empresasISSServiceImpl = empresasISSServiceImpl;
	}

	/**
	 * @return the tipoPesquisa
	 */
	public Integer getTipoPesquisa() {
		return tipoPesquisa;
	}

	/**
	 * @param tipoPesquisa
	 *            the tipoPesquisa to set
	 */
	public void setTipoPesquisa(Integer tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	public String voltarConArquivoEmpSem() {
		dto = new ArquivoEmpresaISSDTO();
		dtoCombo = new EmpresaISSDTO();
		dtoCombo.getLista().clear();
		mostrarLista = false;
		tela = "conArquivoEmpSem";
		return tela;
	}

}
