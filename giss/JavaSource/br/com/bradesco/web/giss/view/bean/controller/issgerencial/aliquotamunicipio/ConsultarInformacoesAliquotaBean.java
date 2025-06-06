package br.com.bradesco.web.giss.view.bean.controller.issgerencial.aliquotamunicipio;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import com.lowagie.text.DocumentException;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issaliquota.IAliquotaISSService;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: ConsultarInformacoesAliquotaBean.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ConsultarInformacoesAliquotaBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private AliquotaISSDTO dto = new AliquotaISSDTO();
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>();
	private List<SelectItem> selectItemServico = new ArrayList<SelectItem>();
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean();
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<CombosISSDTO> comboServico = new ArrayList<CombosISSDTO>();

	IUtilidadesService utilidadesServiceImpl = 
		(IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl");
	private IAliquotaISSService aliquotaISSServiceImpl;
	private Integer codigosSelecionadosTabela = null;
	private boolean mostrarLista = false;
	private Integer radioListaAliquotaMunicipio = null;
	
	/**
	 * @nome: inicializar
	 * @prop�sito: M�todo respons�vel por inicializar.
	 *
	 * @return String
	 */
	public String inicializar() {
		dto = new AliquotaISSDTO();
		buscaMunicipio = new BuscaMunicipioBean();
		mostrarLista = false;
		radioListaAliquotaMunicipio = null;
		carregarComboItemServico();
		carregaComboEstados();
		
		return "consultarInformacoesAliquota";
	}
	
	/**
	 * @nome: carregaComboEstados
	 * @prop�sito: M�todo respons�vel por carregaComboEstados.
	 */
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
	/**
	 * @nome: carregarComboItemServico
	 * @prop�sito: M�todo respons�vel por carregarComboItemServico.
	 */
	private void carregarComboItemServico() {
		comboServico = new ArrayList<CombosISSDTO>();
    	selectItemServico = new ArrayList<SelectItem>();
    	comboServico = utilidadesServiceImpl.listarComboItemServ();
    	for (int i = 0; i < comboServico.size(); i++) {
    		selectItemServico.add(new SelectItem(
    			comboServico.get(i).getCodItemServ(), comboServico.get(i).getDescItemServ()));
    	}		
    }
	
	/**
	 * @nome: pesquisarMunicipio
	 * @prop�sito: M�todo respons�vel por pesquisarMunicipio.
	 */
	public void pesquisarMunicipio() {
		String uf = null;
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if (dto.getEstado().equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	/**
	 * @nome: pesquisarInfosAliquota
	 * @prop�sito: M�todo respons�vel por pesquisarInfosAliquota.
	 *
	 * @return String
	 */
	public String pesquisarInfosAliquota() {
		try {
			mostrarLista = false; 
			if (GissUtil.notNull(dto.getMesPeriodoInicial()).equals("") 
				|| GissUtil.notNull(dto.getAnoPeriodoInicial()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Compet�ncia Inicial!", false);
				return "";
			} 
			
			if (GissUtil.notNull(dto.getMesPeriodoFinal()).equals("") 
				|| GissUtil.notNull(dto.getAnoPeriodoFinal()).equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Favor preencher a Compet�ncia Final!", false);
				return "";
			}
				
			if (GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				pesquisarMunicipio(); 
				dto.setCodMunicipio(buscaMunicipio.getCodigo());	
			} else if (!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
				pesquisarMunicipio();
				return "";
			} else {
				BradescoFacesUtils.addInfoModalMessage(
					"Favor preencher o C�digo ou a Descri��o do Munic�pio!", false);
				return "";
			}	
			
			dto.getLista().clear();
			aliquotaISSServiceImpl.consultarInfosAliquota(dto);    
			setMostrarLista(dto.getLista().size()>0); 
		} catch (Exception e) {
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		}
		return "";
	} 
	
	/**
	 * @nome: processa
	 * @prop�sito: M�todo respons�vel por processa.
	 */
	public void processa() {
		dto.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
	}
	
	/**
	 * @nome: imprimirPlanilha
	 * @prop�sito: M�todo respons�vel por imprimirPlanilha.
	 *
	 * @param ae ActionEvent
	 * @return String
	 */
	public String imprimirPlanilha(ActionEvent ae) {
		ExportarPlanilha exportarPlanilha = null;
		try {
			if (dto.getLista().size() >0) {
				exportarPlanilha = new ExportarPlanilha("Consultar Informa��es Al�quotas", "CON_INFOS_ALIQ");
				exportarPlanilha.planilhaInformacoesAliquota(dto.getLista());
			} else {
				BradescoFacesUtils.addInfoModalMessage("Lista de informa��es de al�quota vazia", false);
				return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
	}
	
	/**
	 * @nome: exportarTxt
	 * @prop�sito: M�todo respons�vel por exportarTxt.
	 *
	 * @param ae ActionEvent
	 * @return String
	 * @throws DocumentException
	 * @throws IOException
	 */
	public String exportarTxt(ActionEvent ae) throws DocumentException, IOException {
		if (dto.getLista().size() >0) {
			aliquotaISSServiceImpl.gerarConAliquotaTXT(
				dto.getLista(), FacesUtils.getServletResponse().getOutputStream());
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista est� vazia", false);
			return "";
		}
		FacesUtils.getServletResponse().setContentType("application/txt");
		FacesUtils.getServletResponse().setHeader(
			"Content-Disposition", "attachment;filename=conInfoAliquota.txt");
		FacesUtils.getContext().responseComplete();
		return null;
	}
	
	

	
	
	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public List<SelectItem> getSelectItemServico() {
		return selectItemServico;
	}

	public void setSelectItemServico(List<SelectItem> selectItemServico) {
		this.selectItemServico = selectItemServico;
	}

	public AliquotaISSDTO getDto() {
		return dto;
	}

	public void setDto(AliquotaISSDTO dto) {
		this.dto = dto;
	}

	public Integer getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}

	public void setCodigosSelecionadosTabela(Integer codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}
	
	public boolean isMostrarLista() {
		return mostrarLista;
	}
	
	public void setMostrarLista(boolean mostrarLista) {
		this.mostrarLista = mostrarLista;
	}

	public List<CombosISSDTO> getComboServico() {
		return comboServico;
	}

	public void setComboServico(List<CombosISSDTO> comboServico) {
		this.comboServico = comboServico;
	}

	public IAliquotaISSService getAliquotaISSServiceImpl() {
		return aliquotaISSServiceImpl;
	}

	public void setAliquotaISSServiceImpl(IAliquotaISSService aliquotaISSServiceImpl) {
		this.aliquotaISSServiceImpl = aliquotaISSServiceImpl;
	}

	public Integer getRadioListaAliquotaMunicipio() {
		return radioListaAliquotaMunicipio;
	}

	public void setRadioListaAliquotaMunicipio(Integer radioListaAliquotaMunicipio) {
		this.radioListaAliquotaMunicipio = radioListaAliquotaMunicipio;
	}
	
}
