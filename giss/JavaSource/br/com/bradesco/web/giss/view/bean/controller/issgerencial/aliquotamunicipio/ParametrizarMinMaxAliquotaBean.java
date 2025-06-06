package br.com.bradesco.web.giss.view.bean.controller.issgerencial.aliquotamunicipio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.giss.service.business.issaliquota.IAliquotaISSService;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;

public class ParametrizarMinMaxAliquotaBean {

	private static final long serialVersionUID = 1L;
	private IAliquotaISSService aliquotaISSServiceImpl;
	private AliquotaISSDTO dto = new AliquotaISSDTO();
	private List<SelectItem> selectItemHistorico = new ArrayList<SelectItem>();
	private boolean mostrarListaHistorico;
	
	
	public String inicializar(){
		dto = new AliquotaISSDTO();
		mostrarListaHistorico = false;
		dto.setDataIncioVigenciaAliquota(new Date());
		return "parametrizarMinMaxAliquota";
	}
	
	
	public String inicializarHistorico(){
		dto = new AliquotaISSDTO();
		mostrarListaHistorico = false;
		return "consultarHistoricoMinMaxAliquota";
	}
	
	
	public String incluir(){ 
		if(GissUtil.notNull(dto.getPorcentAliquotaMin()).equals("")){
			BradescoFacesUtils.addInfoModalMessage("O campo Mínimo (Alíquota %) está vazio.", false);
			return "";
		}
		if(GissUtil.notNull(dto.getPorcentAliquotaMax()).equals("")){
			BradescoFacesUtils.addInfoModalMessage("O campo Máximo (Alíquota %) está vazio.", false);
			return "";
		}
		
		String msg = aliquotaISSServiceImpl.incluirParamMinMaxAliquota(dto);
		BradescoFacesUtils.addInfoModalMessage(msg, false);
		return inicializar();
			
	}
	
	
	public String pesquisarHistoricoAliquota(){
		if(dto.getDataIncioVigenciaAliquota() != null && dto.getDataIncioVigenciaAliquota() != null){
			dto.setLista(new ArrayList<AliquotaISSDTO>());  
			aliquotaISSServiceImpl.pesquisarVigencia(dto);  
			mostrarListaHistorico = dto.getLista().size() > 0; 
		} else {
			BradescoFacesUtils.addInfoModalMessage("Obrigatório o preenchimento dos campos 'De' e 'Até' da Vigência.", false);
		}
		
		return "";
	}
	
	public String imprimirPlanilha(ActionEvent ae){
		try {
			if(dto.getLista().size() >0){
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha Histórico de Mínimo e Máximo de Alíquota ", "HISTORICO_MIN_MAX_ALIQUOTA");
				exportarPlanilha.planilhaHistoricoMinMaxAliquota(dto.getLista());
			} else {
					BradescoFacesUtils.addInfoModalMessage("Lista de históricos vazia", false);
					return"";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}


	
	public AliquotaISSDTO getDto() {
		return dto;
	}
	public void setDto(AliquotaISSDTO dto) {
		this.dto = dto;
	}

	public List<SelectItem> getSelectItemHistorico() {
		return selectItemHistorico;
	}

	public void setSelectItemHistorico(List<SelectItem> selectItemHistorico) {
		this.selectItemHistorico = selectItemHistorico;
	}

	public IAliquotaISSService getAliquotaISSServiceImpl() {
		return aliquotaISSServiceImpl;
	}

	public void setAliquotaISSServiceImpl(IAliquotaISSService aliquotaISSServiceImpl) {
		this.aliquotaISSServiceImpl = aliquotaISSServiceImpl;
	}

	public boolean isMostrarListaHistorico() {
		return mostrarListaHistorico;
	}

	public void setMostrarListaHistorico(boolean mostrarListaHistorico) {
		this.mostrarListaHistorico = mostrarListaHistorico;
	}
}