package br.com.bradesco.web.giss.service.business.issempresa;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.exceptions.EmpresasISSServiceException;

public interface IEmpresasISSServiceConstants {
	
	public EmpresaISSDTO LupaCosifEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	
}
