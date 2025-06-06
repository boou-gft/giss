package br.com.bradesco.web.giss.service.business.issmunicipio.impl;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issmunicipio.IMunicipioISSService;
import br.com.bradesco.web.giss.service.business.issmunicipio.bean.MunicipioISSDTO;
import br.com.bradesco.web.giss.service.business.issmunicipio.exceptions.MunicipioISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.response.AlterarMunicipioISSResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.request.DetalharMunicipioHistoricoRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.request.ListarHistoricoMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest;
import br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.response.ReativarMunicipioISSResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

public class MunicipioISSServiceImpl implements IMunicipioISSService{
	private FactoryAdapter factoryAdapter;

	/**
	 * @return the factoryAdapter
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
	public String manutencaoMunicipio(MunicipioISSDTO dto, String tipoManutencao) throws PdcAdapterException, MunicipioISSServiceException {
		
		AlterarMunicipioISSRequest request = new AlterarMunicipioISSRequest();
		
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setAliquotaPadrao(NumberUtils.convert(GissUtil.notNull(dto.getAliquotaPadrao())));
		request.setDiaVencimento(GissUtil.notNull(dto.getDiaRecolhimento()));
		request.setIndicadorDiaUtil(GissUtil.notNull(dto.getIndicadorDiaUtil()));
		request.setRegraDiaNaoUtil(GissUtil.notNull(dto.getRegrasDiaNaoUtil()));
		request.setCodIndPagamento(GissUtil.notNull(dto.getElegivelPagamento()));
		request.setCodUsuarioManutencao("");
		request.setFuncao(tipoManutencao);
		
		AlterarMunicipioISSResponse response = factoryAdapter.getAlterarMunicipioISSPDCAdapter().invokeProcess(request);
	
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public void consultarMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException{
		
		ConsultarMunicipioUfRequest request = new ConsultarMunicipioUfRequest();
	
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setCodUf(GissUtil.notNull(dto.getCodigoUf()));
		request.setMaxOcorrencia(150);

		ConsultarMunicipioUfResponse response = factoryAdapter.getConsultarMunicipioUfPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getListaConsultarMunicipioUfCount(); i++) {
			if (response.getListaConsultarMunicipioUf(i).getCodMunicipio() != 0l) {
				MunicipioISSDTO consultaUf = new MunicipioISSDTO();
				consultaUf.setCodMunicipio(response.getListaConsultarMunicipioUf(i).getCodMunicipio());
				consultaUf.setDescMunicipios(response.getListaConsultarMunicipioUf(i).getDescMunicipio());
				consultaUf.setCodigoUf(response.getListaConsultarMunicipioUf(i).getCodUp());
				consultaUf.setSiglaUf(response.getListaConsultarMunicipioUf(i).getSiglaUf());
				consultaUf.setBanco(response.getListaConsultarMunicipioUf(i).getCodBanco());
				consultaUf.setAgencia(response.getListaConsultarMunicipioUf(i).getCodAgencia());
				consultaUf.setConta(response.getListaConsultarMunicipioUf(i).getConta());
				consultaUf.setDigitoConta(response.getListaConsultarMunicipioUf(i).getDgConta());
				consultaUf.setCnpj(response.getListaConsultarMunicipioUf(i).getCnpj());
				consultaUf.setCnpjFilial(response.getListaConsultarMunicipioUf(i).getCnpjFilial());
				consultaUf.setCnpjControle(response.getListaConsultarMunicipioUf(i).getCnpjControle());
				consultaUf.setAliquotaPadrao(NumberUtils.format(response.getListaConsultarMunicipioUf(i).getAliquota()));
				consultaUf.setDiaRecolhimento(response.getListaConsultarMunicipioUf(i).getDiaRecolhimento());
				consultaUf.setIndicadorDiaUtil(response.getListaConsultarMunicipioUf(i).getIndicadorDiaUtil());
				consultaUf.setRegrasDiaNaoUtil(response.getListaConsultarMunicipioUf(i).getRegraDiaUtil());
				consultaUf.setStatus(response.getListaConsultarMunicipioUf(i).getStatusMunicipio());
				consultaUf.setElegivelPagamento(response.getListaConsultarMunicipioUf(i).getCodIndPagamento());
				dto.getLista().add(consultaUf);
			}
		}
	}
	
	public void consultarHistoricoMunicipio(MunicipioISSDTO dto)throws PdcAdapterException, MunicipioISSServiceException {
		
		ListarHistoricoMunicipioRequest request = new ListarHistoricoMunicipioRequest();
		
		request.setDataAtualizacao(GissUtil.dateToString(dto.getDataAtualizacao(), GissUtil.FORMATO_DATA_SEM_HORA_PONTO));
		request.setCodigoMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setCodigoUf(GissUtil.notNull(dto.getCodigoUf()));
		request.setQtdOcorrencia(200);
		
		ListarHistoricoMunicipioResponse response = factoryAdapter.getListarHistoricoMunicipioPDCAdapter().invokeProcess(request);
		for (int i = 0; i < response.getListaHistoricoMunicipioCount(); i++) {
			
			MunicipioISSDTO pesquisaPorData = new MunicipioISSDTO();
			pesquisaPorData.setCodigoUf(GissUtil.notNull(response.getListaHistoricoMunicipio(i).getCodigoUf()));
			pesquisaPorData.setCodMunicipio(GissUtil.notNull(response.getListaHistoricoMunicipio(i).getCodigoMunicipio()));
			pesquisaPorData.setDataHoraAtualizacao(response.getListaHistoricoMunicipio(i).getDadosManutencao()) ;
			pesquisaPorData.setSiglaUf(GissUtil.notNull(response.getListaHistoricoMunicipio(i).getSiglaUf()));
			pesquisaPorData.setDescMunicipios(GissUtil.notNull(response.getListaHistoricoMunicipio(i).getNomeMunicipio()));
			String dataFim = GissUtil.notNull(response.getListaHistoricoMunicipio(i).getDataFimVigencia());
			pesquisaPorData.setDataFimVigencia(dataFim.equalsIgnoreCase("31.12.2999")?"":dataFim.replaceAll("\\.", "/"));
			pesquisaPorData.setFuncionario(GissUtil.notNull(response.getListaHistoricoMunicipio(i).getUsuarioManutencao()));
			dto.getLista().add(pesquisaPorData);
		}
		
	}
	
	
	
	public String reativarMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException {
		
		ReativarMunicipioISSRequest request = new ReativarMunicipioISSRequest();
	
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setCodUsuarioManutencao("");

		ReativarMunicipioISSResponse response = factoryAdapter.getReativarMunicipioISSPDCAdapter().invokeProcess(request);

		return response.getCodMensagem() + " - " + response.getMensagem();
	}
	
	
	public MunicipioISSDTO detalharHistoricoMunicipio(MunicipioISSDTO dto) throws PdcAdapterException, MunicipioISSServiceException{
	
		DetalharMunicipioHistoricoRequest request = new DetalharMunicipioHistoricoRequest();
		MunicipioISSDTO dtoDet = new MunicipioISSDTO();
		request.setQtdeOcorrencias(GissUtil.notNull(dto.getNumConsultas()));
		request.setSiglaUf(dto.getCodigoUf());
		request.setCodMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setManutencao(dto.getDataHoraAtualizacao());
		
		DetalharMunicipioHistoricoResponse response = factoryAdapter.getDetalharMunicipioHistoricoPDCAdapter().invokeProcess(request);
	
		dtoDet.setCodMunicipio(response.getCodMunicipio());
		dtoDet.setDescMunicipios(response.getDescMunicipio());
		dtoDet.setSiglaUf(response.getSiglaUf());
		dtoDet.setEstado(response.getDescEstado());
		dtoDet.setBanco(response.getCodBanco());
		dtoDet.setAgencia(response.getCodAgencia());
		dtoDet.setConta(response.getConta());
		dtoDet.setDigitoConta(response.getDigitoConta());
		dtoDet.setCnpj(response.getCnpjBase());
		dtoDet.setCnpjFilial(response.getCnpjFilial());
		dtoDet.setCnpjControle(response.getCnpjControle());
		dtoDet.setAliquotaPadrao(NumberUtils.format(response.getAliquota()));
		dtoDet.setDiaRecolhimento(response.getDiaRecolhimento());
		dtoDet.setIndicadorDiaUtil(response.getIndicadorDiaUtil());
		dtoDet.setRegrasDiaNaoUtil(response.getRegraDiaNaoUtil());
		dtoDet.setStatus(response.getStatus());
		dtoDet.setElegivelPagamento(response.getIndicadorPagamento());
		dtoDet.setDataHoraAtualizacao(response.getManutencao());
		dtoDet.setFuncionario(response.getCodUsuarioManutencao());

		dtoDet.setBancoAnterior(response.getCodBancoAnterior());
		dtoDet.setAgenciaAnterior(response.getCodAgenciaAnterior());
		dtoDet.setContaAnterior(response.getContaAnterior());
		dtoDet.setDigitoContaAnterior(response.getDigitoContaAnterior());
		dtoDet.setCnpjAnterior(response.getCnpjBaseAnterior());
		dtoDet.setCnpjFilialAnterior(response.getCnpjFilialAnterior());
		dtoDet.setCnpjControleAnterior(response.getCnpjControleAnterior());
		dtoDet.setAliquotaPadraoAnterior(NumberUtils.format(response.getAliquotaAnterior()));
		dtoDet.setDiaRecolhimentoAnterior(response.getDiaRecolhimentoAnterior());
		dtoDet.setIndicadorDiaUtilAnterior(response.getIndicadorDiaUtilAnterior());
		dtoDet.setRegrasDiaNaoUtilAnterior(response.getRegraDiaNaoUtilAnterior());
		dtoDet.setStatusAnterior(response.getStatusAnterior());
		dtoDet.setElegivelPagamentoAnterior(response.getIndicadorPagamentoAnterior());
		dtoDet.setDataHoraAtualizacaoAnterior(response.getManutencaoAnterior());
		dtoDet.setFuncionarioAnterior(response.getCodUsuarioManutencaoAnterior());
		
		return dtoDet;
		
	}
	
	
}
