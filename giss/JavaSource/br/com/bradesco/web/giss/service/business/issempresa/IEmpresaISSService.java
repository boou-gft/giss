package br.com.bradesco.web.giss.service.business.issempresa;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issempresa.bean.ContasISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.exceptions.EmpresasISSServiceException;



public interface IEmpresaISSService {


	public void ListaEmpCadastro(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	public String incluirCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	public String alterarCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	public String ExcluirCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	public void ListaContaEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException;
	public String incluirContasEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException;
	public String ExcluirContasEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException;
	public void ListarHistoricoEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	public EmpresaISSDTO detalharHistoricoEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException;
	
}
