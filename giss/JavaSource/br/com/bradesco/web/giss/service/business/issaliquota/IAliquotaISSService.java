package br.com.bradesco.web.giss.service.business.issaliquota;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issaliquota.bean.AliquotaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.exceptions.EmpresasISSServiceException;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;

import com.lowagie.text.DocumentException;

public interface IAliquotaISSService {
	
	List<AliquotaISSDTO> consultarAliquota(Integer codUf, Long codMunicipio) throws PdcAdapterException, EmpresasISSServiceException;
	
	List<AliquotaISSDTO> listarLcAliquota(Long codMunicipio, Integer codItemLei) throws PdcAdapterException, EmpresasISSServiceException;
	
	String alterarAliquota(List<AliquotaISSDTO> listAliquotas, String codUsuarioManutencao) throws PdcAdapterException, EmpresasISSServiceException;
	
	String incluirParamMinMaxAliquota(AliquotaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	
	void pesquisarVigencia(AliquotaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	
	void consultarInfosAliquota (AliquotaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	
	void gerarConAliquotaTXT(List<AliquotaISSDTO> lista, OutputStream outputStream) throws DocumentException, ReportException, IOException;
	
}
