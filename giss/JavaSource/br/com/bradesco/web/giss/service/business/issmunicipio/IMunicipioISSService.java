package br.com.bradesco.web.giss.service.business.issmunicipio;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;
import br.com.bradesco.web.giss.service.business.issmunicipio.exceptions.MunicipioISSServiceException;

public interface IMunicipioISSService {
	
	public String manutencaoMunicipio(MunicipioISSDTO dto, String tipoManutencao) throws PdcAdapterException, MunicipioISSServiceException;
	public void consultarMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException;
	public String reativarMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException ;
	public void consultarHistoricoMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException ;
	public MunicipioISSDTO detalharHistoricoMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException;
}
