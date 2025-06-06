package br.com.bradesco.web.giss.service.business.issempresa.impl;

import java.util.ArrayList;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.ContasISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.issempresa.exceptions.EmpresasISSServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcadastroemp.request.AlterarCadastroEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterarcadastroemp.response.AlterarCadastroEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp;
import br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.response.ExcluirContaEmpresaResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa;
import br.com.bradesco.web.giss.service.data.pdc.excluirempresa.response.ExcluirEmpresaResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.IncluirCadastroEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp;
import br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.response.IncluirCadastroEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluircontaempresa.request.IncluirContaEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluircontaempresa.response.IncluirContaEmpresaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.request.ListarContasEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.request.ListarEmpCadastrosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.request.ListarHistoricoEmpresaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.NumberUtils;

public class EmpresasISSServiceImpl implements IEmpresaISSService {
	private FactoryAdapter factoryAdapter;

	/**
	 * @return the factoryAdapter
	 */
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	/**
	 * @param factoryAdapter
	 *            the factoryAdapter to set
	 */
	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public String incluirCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {

		IncluirCadastroEmpRequest request = new IncluirCadastroEmpRequest();

		request.setCnpjPrincipal(GissUtil.notNull(dto.getCnpj()));
		request.setCnpjFilial(GissUtil.notNull(dto.getCnpjFilial()));
		request.setCnpjControle(GissUtil.notNull(dto.getCnpjControle()));
		request.setSistContabil(GissUtil.notNull(dto.getCombos().getCodSistemaContabil()));
		request.setPercentual(NumberUtils.convert(GissUtil.notNull(dto.getPerRejeicaoArquivo())));
		request.setContaDespesa(GissUtil.notNull(dto.getContaDespesa()));
		request.setContaProvisao(GissUtil.notNull(dto.getContaProvisao()));
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setIdentContribuinte(GissUtil.notNull(dto.getCodigoContribuinte())); 
		request.setResidInformacoes(GissUtil.notNull(dto.getNomeResponsavel()));
		request.setTelResponsavel(GissUtil.notNull(dto.getTelResponsavel()));
		request.setEmailResponsavel(GissUtil.notNull(dto.getEmailResponsavel()));
		request.setLogradouro(GissUtil.notNull(dto.getLogradouro()));
		request.setNumeroLogradouro(GissUtil.notNull(dto.getNroEndereco()));
		request.setComplementoEndereco(GissUtil.notNull(dto.getComplEndereco()));
		request.setBairro(GissUtil.notNull(dto.getBairro()));
		String[] cep = GissUtil.notNull(dto.getCep()).split("-");
		request.setCep(GissUtil.notNull(cep[0]).equals("")?0:Integer.valueOf(cep[0]));
		request.setCepComplemento(GissUtil.notNull(cep[1]).equals("")?0:Integer.valueOf(cep[1]));
		request.setMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setEstado(GissUtil.notNull(dto.getEstado()).equals("")?0:Integer.valueOf(GissUtil.notNull(dto.getEstado())));
		ListaContaEmp[] lista = new ListaContaEmp[100];
		for (int i = 0; i < 100; i++) {
			ListaContaEmp dtoConta = new ListaContaEmp();

			if (i < dto.getContas().getListaContas().size()) {

				dtoConta.setResumo(GissUtil.notNull(dto.getContas().getListaContas().get(i).getContaResumo()));
				dtoConta.setContaReceita(GissUtil.notNull(dto.getContas().getListaContas().get(i).getContaReceita()));
				dtoConta.setCosif(GissUtil.notNull(dto.getContas().getListaContas().get(i).getCosif()));
				dtoConta.setCodItemServLC(GissUtil.notNull(dto.getContas().getListaContas().get(i).getCodItemServicoLC()));
				dtoConta.setDescContaReceita(GissUtil.notNull(dto.getContas().getListaContas().get(i).getDescContaReceitaInc()));

			}else{
				dtoConta.setResumo(0);
				dtoConta.setContaReceita(0);
				dtoConta.setCosif(0);
				dtoConta.setCodItemServLC(0);
				dtoConta.setDescContaReceita("");
			}
			lista[i] = dtoConta;
		}
		request.setListaContaEmp(lista);

		IncluirCadastroEmpResponse response = factoryAdapter.getIncluirCadastroEmpPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String alterarCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {

		AlterarCadastroEmpRequest request = new AlterarCadastroEmpRequest();

		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setSistContabil(GissUtil.notNull(dto.getCombos().getCodSistemaContabil()));
		request.setPercentual(NumberUtils.convert(GissUtil.notNull(dto.getPerRejeicaoArquivo())));
		request.setContaDespesa(GissUtil.notNull(dto.getContaDespesa()));
		request.setContaProvisao(GissUtil.notNull(dto.getContaProvisao()));
		request.setIdentContribuinte(GissUtil.notNull(dto.getCodigoContribuinte())); 
		request.setResidInformacoes(GissUtil.notNull(dto.getNomeResponsavel()));
		request.setTelResponsavel(GissUtil.notNull(dto.getTelResponsavel()));
		request.setEmailResponsavel(GissUtil.notNull(dto.getEmailResponsavel()));
		request.setLogradouro(GissUtil.notNull(dto.getLogradouro()));
		request.setNumeroLogradouro(GissUtil.notNull(dto.getNroEndereco()));
		request.setComplEndereco(GissUtil.notNull(dto.getComplEndereco()));
		request.setBairro(GissUtil.notNull(dto.getBairro()));
		request.setCep(GissUtil.getCepMask(dto.getCep()));
		request.setComplementoCep(GissUtil.getCepComplMask(dto.getCep()));
		request.setMunicipio(GissUtil.notNull(dto.getCodMunicipio()));
		request.setEstado(GissUtil.notNull(dto.getEstado()).equals("")?0:Integer.valueOf(GissUtil.notNull(dto.getEstado())));

		AlterarCadastroEmpResponse response = factoryAdapter.getAlterarCadastroEmpPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String ExcluirCadastroEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {

		ExcluirEmpresaRequest request = new ExcluirEmpresaRequest();
		ListaExcluirEmpresa[] listaContas = new ListaExcluirEmpresa[100];
		for (int i = 0; i < 100; i++) {
			ListaExcluirEmpresa item = new ListaExcluirEmpresa();
			if (i < dto.getLista().size()) {
				item.setCodEmpresa(GissUtil.notNull(dto.getLista().get(i).getCodEmpresa()));
			} else {
				item.setCodEmpresa(0);
			}
			listaContas[i] = item;
		}
		request.setListaExcluirEmpresa(listaContas);

		ExcluirEmpresaResponse response = factoryAdapter.getExcluirEmpresaPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String incluirContasEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException {

		IncluirContaEmpresaRequest request = new IncluirContaEmpresaRequest();

		request.setCodEmpresa(GissUtil.notNull(codEmpresa));
		request.setResumo(GissUtil.notNull(dto.getContaResumo()));
		request.setContaReceita(GissUtil.notNull(dto.getContaReceita()));
		request.setCosif(GissUtil.notNull(dto.getCosif()));
		request.setCodItemServLC(GissUtil.notNull(dto.getCodItemServicoLC()));
		request.setDescContaReceita(GissUtil.notNull(dto.getDescContaReceita()));

		IncluirContaEmpresaResponse response = factoryAdapter.getIncluirContaEmpresaPDCAdapter().invokeProcess(request);

		return response.getCodMensagem() + " - " + response.getMensagem();
	}

	public String ExcluirContasEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException {

		ExcluirContaEmpresaRequest request = new ExcluirContaEmpresaRequest();
		ListaExcluirContasEmp[] listaContas = new ListaExcluirContasEmp[100];
		for (int i = 0; i < 100; i++) {
			ListaExcluirContasEmp item = new ListaExcluirContasEmp();
			if (i < dto.getListaContas().size()) {
				item.setCodEmpresa(GissUtil.notNull(codEmpresa));
				item.setResumo(GissUtil.notNull(dto.getListaContas().get(i).getContaResumo()));
				item.setContaReceita(GissUtil.notNull(dto.getListaContas().get(i).getContaReceita()));
			} else {
				item.setResumo(0);
				item.setContaReceita(0);
				item.setCodEmpresa(0);
			}
			listaContas[i] = item;
		}
		request.setListaExcluirContasEmp(listaContas);

		ExcluirContaEmpresaResponse response = factoryAdapter.getExcluirContaEmpresaPDCAdapter().invokeProcess(request);
		
		return response.getCodMensagem() + " - " + response.getMensagem();

	}

	public void ListaContaEmp(ContasISSDTO dto, Integer codEmpresa) throws PdcAdapterException, EmpresasISSServiceException {

		ListarContasEmpRequest request = new ListarContasEmpRequest();

		request.setCodEmpresa(GissUtil.notNull(codEmpresa));
		
		ListarContasEmpResponse response = factoryAdapter.getListarContasEmpPDCAdapter().invokeProcess(request);

		dto.setListaContas(new ArrayList<ContasISSDTO>());
		int numConsul = 0;
		for (int i = 0; i < response.getListaContasEmpCount(); i++) {
			ContasISSDTO dtoLocal = new ContasISSDTO();
			dtoLocal.setContaResumo(response.getListaContasEmp(i).getResumo());
			dtoLocal.setContaReceita(response.getListaContasEmp(i).getContaReceita());
			String contaFormatada = GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(response.getListaContasEmp(i).getContaReceita())), 14);
			dtoLocal.setDescContaReceitaInc(response.getListaContasEmp(i).getDescContaReceita());
			dtoLocal.setDescContaReceita(contaFormatada+ " - " +response.getListaContasEmp(i).getDescContaReceita());
			String cosifFormatado = GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaContasEmp(i).getCosif()), 8);
			dtoLocal.setCosifExibicao(GissUtil.mascaraCosif(cosifFormatado));
			dtoLocal.setCosif(response.getListaContasEmp(i).getCosif());
			dtoLocal.setCodItemServicoLC(response.getListaContasEmp(i).getCodItemServ());
			String itemServ = GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(response.getListaContasEmp(i).getCodItemServ())), 8);
			dtoLocal.setDescItemServicoLC(GissUtil.mascaraItemLei(itemServ) + " - " + response.getListaContasEmp(i).getDescItemServ());
			dtoLocal.setNumConsul(numConsul++);
			dto.getListaContas().add(dtoLocal);
		}
	}

	public void ListaEmpCadastro(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {

		ListarEmpCadastrosRequest request = new ListarEmpCadastrosRequest();
		dto.setLista(new ArrayList<EmpresaISSDTO>());
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setCnpjPrincipal(GissUtil.notNull(dto.getCnpj()));
		request.setCnpjFilial(GissUtil.notNull(dto.getCnpjFilial()));
		request.setCnpjControle(GissUtil.notNull(dto.getCnpjControle()));

		ListarEmpCadastrosResponse response = factoryAdapter.getListarEmpCadastrosPDCAdapter().invokeProcess(request);

		int numConsul = 0;
		for (int i = 0; i < response.getNumConsultas(); i++) {
			EmpresaISSDTO dtoLocal = new EmpresaISSDTO();
			dtoLocal.setCodEmpresa(response.getListaEmpCadastros(i).getCodEmpresa());
			dtoLocal.setCnpj(response.getListaEmpCadastros(i).getCnpjPrincipal());
			dtoLocal.setCnpjFilial(response.getListaEmpCadastros(i).getCnpjFilial());
			dtoLocal.setCnpjControle(response.getListaEmpCadastros(i).getCnpjControle());
			dtoLocal.setDescEmpresa(response.getListaEmpCadastros(i).getNomeEmpresa());
			dtoLocal.setDescSistemaContabil(response.getListaEmpCadastros(i).getSistContabil());
			dtoLocal.setPerRejeicaoArquivo(NumberUtils.format(response.getListaEmpCadastros(i).getPercentual()));
			dtoLocal.setContaDespesa(response.getListaEmpCadastros(i).getContaDespesa());
			dtoLocal.setContaProvisao(response.getListaEmpCadastros(i).getContaProvisao());
			dtoLocal.setCodigoContribuinte(response.getListaEmpCadastros(i).getIdentContribuinte());
			dtoLocal.setNomeResponsavel(response.getListaEmpCadastros(i).getResidInformacoes());
			dtoLocal.setTelResponsavel(response.getListaEmpCadastros(i).getTelResponsavel());
			dtoLocal.setEmailResponsavel(response.getListaEmpCadastros(i).getEmailResponsavel());
			dtoLocal.setLogradouro(response.getListaEmpCadastros(i).getLogradouro());
			dtoLocal.setNroEndereco(response.getListaEmpCadastros(i).getNumeroLogradouro());
			dtoLocal.setComplEndereco(response.getListaEmpCadastros(i).getComplEndereco());
			dtoLocal.setBairro(response.getListaEmpCadastros(i).getBairro());
			dtoLocal.setCep(GissUtil.formataCEP(response.getListaEmpCadastros(i).getCep(), response.getListaEmpCadastros(i).getComplCep()));
			dtoLocal.setCodMunicipio(response.getListaEmpCadastros(i).getMunicipio());
			dtoLocal.setEstado(String.valueOf(GissUtil.notNull(response.getListaEmpCadastros(i).getEstado())));
			dtoLocal.setNumConsul(numConsul++);
			dto.getLista().add(dtoLocal);
		}
	}
	
	public void ListarHistoricoEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {
		
		ListarHistoricoEmpresaRequest request = new ListarHistoricoEmpresaRequest();
		dto.setLista(new ArrayList<EmpresaISSDTO>());
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setCnpjEmpresa(GissUtil.notNull(dto.getCnpjFormatado()).equalsIgnoreCase("")?0:Long.valueOf(dto.getCnpjFormatado().replaceAll("[^0-9]+", "")));
		request.setData(GissUtil.dateToString(dto.getDataAtualizacao(), GissUtil.FORMATO_DATA_SEM_HORA_PONTO));
		request.setQtdeOcorrencias(150);
		
		ListarHistoricoEmpresaResponse response = factoryAdapter.getListarHistoricoEmpresaPDCAdapter().invokeProcess(request);
	
		for (int i = 0; i < response.getListaHistoricoEmpresaCount(); i++) {
			EmpresaISSDTO saida = new EmpresaISSDTO();
			saida.setCodEmpresa(response.getListaHistoricoEmpresa(i).getCodEmpresa());
			saida.setNomeEmpresa(response.getListaHistoricoEmpresa(i).getNomeEmpresa());
			saida.setDataManutencao(response.getListaHistoricoEmpresa(i).getDataHoraAtualizacao());
			saida.setDataManutencaoFormatada(GissUtil.converteTimeStampCompleto(response.getListaHistoricoEmpresa(i).getDataHoraAtualizacao()));
			saida.setCodFuncao(response.getListaHistoricoEmpresa(i).getCodFuncional());
			saida.setStatus(response.getListaHistoricoEmpresa(i).getStatus());
			
			dto.getLista().add(saida);
		}
	}

	public EmpresaISSDTO detalharHistoricoEmp(EmpresaISSDTO dto) throws PdcAdapterException, EmpresasISSServiceException {
		
		DetalharHistoricoEmpresaRequest request = new DetalharHistoricoEmpresaRequest();
		EmpresaISSDTO dtoDet = new EmpresaISSDTO();
		request.setCodEmpresa(GissUtil.notNull(dto.getCodEmpresa()));
		request.setDataAtualizacao(GissUtil.notNull(dto.getDataManutencao()));
		
		DetalharHistoricoEmpresaResponse response = factoryAdapter.getDetalharHistoricoEmpresaPDCAdapter().invokeProcess(request);
		
		dtoDet.setCodEmpresa(response.getCodEmpresaAtualizado());
		dtoDet.setCnpj(response.getCnpjAtualizado());
		dtoDet.setCnpjFilial(response.getCnpjFilialAtualizado());
		dtoDet.setCnpjControle(response.getCnpjControleAtualizado());
		dtoDet.setDescEmpresa(response.getNomeEmpresaAtualizado());
		dtoDet.setCodFuncao(response.getCodUsuarioAtualizado());
	    dtoDet.setDataManutencaoFormatada(GissUtil.converteTimeStampCompleto(response.getDataHoraAtualizado()));
	    dtoDet.setCodigoContribuinte(response.getCodIdentAtualizado());
	    dtoDet.setNomeResponsavel(response.getDescResponsavelAtualizado());
	    dtoDet.setTelResponsavel(response.getNtFoniAtualizado());
	    dtoDet.setEmailResponsavel(response.getEmailAtualizado());
	    dtoDet.setLogradouro(response.getLogradouroAtualizado());
	    dtoDet.setNroEndereco(response.getNumeroLogradouroAtualizado());
	    dtoDet.setComplEndereco(response.getComplementoAtualizado());
	    dtoDet.setBairro(response.getBairroAtualizado());
	    dtoDet.setCep(GissUtil.formataCEP(response.getCepAtualizado(), response.getCepComplAtualizado()));
	    dtoDet.setCodMunicipio(response.getCodMunicipioAtualizado());
	    dtoDet.setEstado(String.valueOf(response.getCodUfAtualizado()));
	    dtoDet.setCodFuncaoAnterior(response.getCodUsuarioAnterior());
	    dtoDet.setDataManutencaoFormatadaAnterior(GissUtil.converteTimeStampCompleto(response.getDataHoraManutencaoAterior()));
	    dtoDet.setCodigoContribuinteAnterior(response.getCodIdentAterior());
	    dtoDet.setNomeResponsavelAnterior(response.getDescResponsavelAnterior());
	    dtoDet.setTelResponsavelAnterior(response.getNtFoniAnterior());
	    dtoDet.setEmailResponsavelAnterior(response.getEmailAnterior());
	    dtoDet.setLogradouroAnterior(response.getLogradouroAnterior());
	    dtoDet.setNroEnderecoAnterior(response.getNumeroLogradouroAnterior());
	    dtoDet.setComplEndereco(response.getComplementoAnterior());
	    dtoDet.setBairroAnterior(response.getBairroAnterior());
	    dtoDet.setCepAnterior(GissUtil.formataCEP(response.getCepAnterior(), response.getCepComplementoAnterior()));
	    dtoDet.setCodMunicipioAnterior(response.getCodMunicipioAnterior());
	    dtoDet.setEstadoAnterior(String.valueOf(response.getCodUfAnterior()));
		
		return dtoDet;
	}
}