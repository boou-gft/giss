package br.com.bradesco.web.giss.service.business.issprocessarpagto;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.bean.ProcessarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.issprocessarpagto.exception.ProcessarPagtoISServiceException;



public interface IProcessarPagtoISSService {


	public ProcessarPagtoISSDTO ListaConsultarProcessar(ProcessarPagtoISSDTO dto)throws PdcAdapterException, ProcessarPagtoISServiceException ;
	public String BotaoConsultarProcessar(ProcessarPagtoISSDTO dto) throws PdcAdapterException,ProcessarPagtoISServiceException ;
}
