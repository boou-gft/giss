package br.com.bradesco.web.giss.service.business.utilidade;

import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.listamunicipio.bean.ItemMunicipio;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.exceptions.UtilidadesServiceException;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public interface IUtilidadesService {

	public List<CombosISSDTO> listarComboSistContabil() throws PdcAdapterException, UtilidadesServiceException;
	public List<CombosISSDTO> listarComboRazao(Long cosif) throws PdcAdapterException, UtilidadesServiceException;
	public List<CombosISSDTO> listarComboItemServ() throws PdcAdapterException, UtilidadesServiceException;
	public List<CombosISSDTO> listarComboCtaReceita(Long cosif, Integer codEmpresa) throws PdcAdapterException, UtilidadesServiceException;
	public List<CombosISSDTO> listarCosifEmp(Integer codEmpresa) throws PdcAdapterException, UtilidadesServiceException;
	public String consultaLupaCnpj(EmpresaISSDTO dto) throws PdcAdapterException, UtilidadesServiceException;
	public ItemMunicipio consultaLupaMunicipio(Long codigo, String estado) throws PdcAdapterException, UtilidadesServiceException ;
	public List<ItemMunicipio>consultaLupaMunicipio(Long codigo, String descricao, String estado) throws PdcAdapterException, UtilidadesServiceException ; 
	public List<EstadosComboBean> listagemEstados() throws PdcAdapterException, UtilidadesServiceException ;



}
