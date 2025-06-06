package br.com.bradesco.web.giss.service.business.issitemservicolc;

import java.text.ParseException;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issitemservicolc.bean.ItemServicoLcISSDTO;
import br.com.bradesco.web.giss.service.business.issitemservicolc.exceptions.ItemLcISSServiceException;

public interface IItemServicoLCISSService {

	public void ListaItemLC(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
	public void ListaItemLCHistorico(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
	public ItemServicoLcISSDTO detalharHistorico(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException, IndexOutOfBoundsException, ParseException;
	public String incluirItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
	public String alterarItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
	public String ExcluirItemCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
	public String reativarItemDaLeiCompl(ItemServicoLcISSDTO dto) throws PdcAdapterException, ItemLcISSServiceException;
}
