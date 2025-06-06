package br.com.bradesco.web.giss.service.business.agincorpdepart.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.agincorpdepart.IAgIncorpDepartService;
import br.com.bradesco.web.giss.service.business.agincorpdepart.IAgIncorpDepartServiceConstants;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartAvancarDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartEntradaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorpDepartSaidaTotalDTO;
import br.com.bradesco.web.giss.service.business.agincorpdepart.bean.AgIncorporaDepartAvancarTotalDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.IAgenciaIncorporaDepartamentoResultPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest;
import br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse;
import br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.IListarAgenciaIncorporaDepartamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.request.ListarAgenciaIncorporaDepartamentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse;

public class AgIncorpDepartServiceImpl implements IAgIncorpDepartService {
	
	FactoryAdapter factoryAdapter;
    
    public AgIncorpDepartSaidaTotalDTO listarAgenciaIncorpDepartamento(AgIncorpDepartEntradaDTO entrada) {
    	ListarAgenciaIncorporaDepartamentoRequest lRequest = new ListarAgenciaIncorporaDepartamentoRequest();
    	lRequest.setQtdeRegistro(IAgIncorpDepartServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_AGENCIA_INCORP_DEP);
    	lRequest.setMesAnoApuracao(entrada.getMesAnoCompetencia());
    	lRequest.setCodDependencia(entrada.getCodDependencia());
    	lRequest.setCodPessoaJurid(entrada.getCodPessoaJurid());

    	IListarAgenciaIncorporaDepartamentoPDCAdapter listarAgenciaIncorporaDepartamentoPDCAdapter = factoryAdapter.getListarAgenciaIncorporaDepartamentoPDCAdapter();
    	ListarAgenciaIncorporaDepartamentoResponse lResponse = listarAgenciaIncorporaDepartamentoPDCAdapter.invokeProcess(lRequest);
    	
    	int cont = 0;
    	
    	BigDecimal totalReceita = lResponse.getValorReceitaTotal();
    	if ("-".equals(lResponse.getSinalReceitaTotal())) {
    		totalReceita = totalReceita.negate();
    	}
    	BigDecimal totalIss = lResponse.getValorReceitaTotal();
    	if ("-".equals(lResponse.getSinalReceitaTotal())) {
    		totalIss = totalIss.negate();
    	}
    	
    	AgIncorpDepartSaidaTotalDTO agIncorpDepartSaidaTotalDTO = new AgIncorpDepartSaidaTotalDTO();
    	List<AgIncorpDepartSaidaDTO> listaAgenciaIncorporaDepartamento = new ArrayList<AgIncorpDepartSaidaDTO>();
    	for(int i = 0; i < lResponse.getQtdeRegistros(); i++) {
    		AgIncorpDepartSaidaDTO saidaDTO = new AgIncorpDepartSaidaDTO();
    		saidaDTO.setNumeroSequencialUnidadeOrganizacional(lResponse.getOcorrenciasAgenciaIncorp(i).getNumSeqUnidadeOrganizacional());
    		saidaDTO.setCodigoPessoaJuridica(lResponse.getOcorrenciasAgenciaIncorp(i).getCodPessoaJuridOcor());
    		saidaDTO.setMesAnoCompetencia(lResponse.getOcorrenciasAgenciaIncorp(i).getMesAnoApuracao());
    		String codDependencia = lResponse.getOcorrenciasAgenciaIncorp(i).getCodDependenciaOcor();
    		if (codDependencia != null && !"".equals(codDependencia.trim())) {
    			saidaDTO.setCodigoDependencia(new Integer(codDependencia.trim()));
    		} else {
    			saidaDTO.setCodigoDependencia(null);
    		}
    		saidaDTO.setDescricaoDependencia(lResponse.getOcorrenciasAgenciaIncorp(i).getDescDependenciaOcor());
    		
    		saidaDTO.setValorReceita(lResponse.getOcorrenciasAgenciaIncorp(i).getValorReceita());
    		if("-".equals(lResponse.getOcorrenciasAgenciaIncorp(i).getSinalReceita())){
    			saidaDTO.setValorReceita(lResponse.getOcorrenciasAgenciaIncorp(i).getValorReceita().negate());
    		}
    		
    		saidaDTO.setValorISSRecolher(lResponse.getOcorrenciasAgenciaIncorp(i).getValorApuracao());
    		if("-".equals(lResponse.getOcorrenciasAgenciaIncorp(i).getSinalApuracao())){
    			saidaDTO.setValorISSRecolher(lResponse.getOcorrenciasAgenciaIncorp(i).getValorApuracao().negate());
    		}

    		saidaDTO.setLinha(cont++);
    		
    		listaAgenciaIncorporaDepartamento.add(saidaDTO);
    	}	
    	agIncorpDepartSaidaTotalDTO.setTotalReceita(totalReceita);
    	agIncorpDepartSaidaTotalDTO.setTotalISSRecolher(totalIss);
    	agIncorpDepartSaidaTotalDTO.setListaAgIncorpDepartSaida(listaAgenciaIncorporaDepartamento);
    	
    	return agIncorpDepartSaidaTotalDTO;
    }

    
	public AgIncorporaDepartAvancarTotalDTO consultarAgenciaIncorporaDepartamento(AgIncorpDepartSaidaDTO entrada) {
		
		AgenciaIncorporaDepartamentoResultRequest iRequest = new AgenciaIncorporaDepartamentoResultRequest();
		iRequest.setNumeroMaximoOcorrencia(IAgIncorpDepartServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONSULTA_AGENCIA_INCORP_DEP);
		iRequest.setCodigoPessoaJuridica(entrada.getCodigoPessoaJuridica());
		iRequest.setNumeroSequenciaUnidadeOrganizacional(entrada.getNumeroSequencialUnidadeOrganizacional());
		iRequest.setMesAnoApuracaoContabil(entrada.getMesAnoCompetencia());
		
		
		IAgenciaIncorporaDepartamentoResultPDCAdapter consultarAgenciaIncorporaDepartamentoResultPDCAdapter = factoryAdapter.getAgenciaIncorporaDepartamentoResultPDCAdapter();
		AgenciaIncorporaDepartamentoResultResponse iResponse = consultarAgenciaIncorporaDepartamentoResultPDCAdapter.invokeProcess(iRequest);
		
		int cont = 0;
		BigDecimal totalSaldo = iResponse.getValorTotalReceita();
		if ("-".equals(iResponse.getSinalTotalReceita())) {
			totalSaldo = totalSaldo.negate();
		}
		BigDecimal totalIss = iResponse.getValorTotalIss();
		if ("-".equals(iResponse.getSinalTotalIss())) {
			totalIss = totalIss.negate();
		}

		AgIncorporaDepartAvancarTotalDTO agIncorporaDepartAvancarTotalDTO = new AgIncorporaDepartAvancarTotalDTO();
		
		List<AgIncorpDepartAvancarDTO> listaAvancarDTO = new ArrayList<AgIncorpDepartAvancarDTO>();
		for(int i = 0; i < iResponse.getNumeroConsultas(); i++) {
			AgIncorpDepartAvancarDTO avancarDTO = new AgIncorpDepartAvancarDTO();
			avancarDTO.setDependencia(iResponse.getOcorrencia(i).getCodigoDependencia());
			avancarDTO.setDescricao(iResponse.getOcorrencia(i).getDescricaoDependencia());
			avancarDTO.setLinha(cont++);
			
			avancarDTO.setSaldo(iResponse.getOcorrencia(i).getReceitaValor());
			if("-".equals(iResponse.getOcorrencia(i).getReceitaSinal())){
				avancarDTO.setSaldo(iResponse.getOcorrencia(i).getReceitaValor().negate());
			}
			
			avancarDTO.setIssRecolher(iResponse.getOcorrencia(i).getIssValor());
			if("-".equals(iResponse.getOcorrencia(i).getIssSinal())){
				avancarDTO.setIssRecolher(iResponse.getOcorrencia(i).getIssValor().negate());
			}

			listaAvancarDTO.add(avancarDTO);
		}	
			
		agIncorporaDepartAvancarTotalDTO.setTotalSaldo(totalSaldo);
		agIncorporaDepartAvancarTotalDTO.setTotalIss(totalIss);
		agIncorporaDepartAvancarTotalDTO.setListaAgIncorpDepartAvancarDTO(listaAvancarDTO);
			
		return agIncorporaDepartAvancarTotalDTO;	
	}
    
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public List<AgIncorpDepartEntradaDTO> listarAgenciaIncorpDepartamento(String mes, String ano) {
		
		return listarAgenciaIncorpDepartamento(mes, ano);		
	}
}