package br.com.bradesco.web.giss.service.business.utilidade.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.listamunicipio.bean.ItemMunicipio;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.service.business.utilidade.bean.CombosISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.exceptions.UtilidadesServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.response.ConsultarLupaCnpjEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.request.ConsultarLupaMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ConsultarLupaMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio;
import br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.request.ListarComboCtaReceitaRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.request.ListarComboRazaoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.request.ListarComboSistContabilRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse;
import br.com.bradesco.web.giss.utils.Formatacao;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class UtilidadesServiceImpl implements IUtilidadesService {

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

	public List<CombosISSDTO> listarComboSistContabil() throws PdcAdapterException, UtilidadesServiceException {

		List<CombosISSDTO> comboSistContabilList = new ArrayList<CombosISSDTO>();
		ListarComboSistContabilRequest request = new ListarComboSistContabilRequest();

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		request.setCodEmpresa("S");
		ListarComboSistContabilResponse response = factoryAdapter.getListarComboSistContabilPDCAdapter().invokeProcess(request);
		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		for (int i = 0; i < response.getListaComboSistContabilCount(); i++) {
			if (response.getListaComboSistContabil(i).getCodSistemaContabil()!=0) {
				CombosISSDTO sistemaContabil = new CombosISSDTO();
				sistemaContabil.setCodSistemaContabil(response.getListaComboSistContabil(i).getCodSistemaContabil());
				sistemaContabil.setDescSistemaContabil(response.getListaComboSistContabil(i).getDescSistemaContabil());
				comboSistContabilList.add(sistemaContabil);
			}
		}
		return comboSistContabilList;

	}
	
	public List<CombosISSDTO> listarComboRazao(Long cosif) throws PdcAdapterException, UtilidadesServiceException{
		
		List<CombosISSDTO> comboRazaoList = new ArrayList<CombosISSDTO>();
		ListarComboRazaoRequest request = new ListarComboRazaoRequest();
		
		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */
		
		request.setCosif(GissUtil.notNull(cosif));
		
		ListarComboRazaoResponse response = factoryAdapter.getListarComboRazaoPDCAdapter().invokeProcess(request);
		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		
		for (int i = 0; i < response.getListaComboRazaoCount(); i++) {
			if (response.getListaComboRazao(i).getCodGrupo()!=0) {
				CombosISSDTO razao = new CombosISSDTO();
				razao.setCodGrupo(response.getListaComboRazao(i).getCodGrupo());
				razao.setCodSubgrupo(response.getListaComboRazao(i).getCodSubGrupo());
				razao.setRazao(GissUtil.formatarRazaoContabil(response.getListaComboRazao(i).getCodGrupo(),response.getListaComboRazao(i).getCodSubGrupo()));
				comboRazaoList.add(razao);
			}
		}
		return comboRazaoList;
		
	}

	public List<CombosISSDTO> listarComboItemServ() throws PdcAdapterException, UtilidadesServiceException {

		List<CombosISSDTO> comboItemServList = new ArrayList<CombosISSDTO>();
		ListarComboDescItemServRequest request = new ListarComboDescItemServRequest();
		request.setCodEmpresa("S");

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */

		ListarComboDescItemServResponse response = factoryAdapter.getListarComboDescItemServPDCAdapter().invokeProcess(request);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */

		for (int i = 0; i < response.getListaComboDescItemServCount(); i++) {
			if (response.getListaComboDescItemServ(i).getCodItemServ()!=0) {
				CombosISSDTO ItemServ = new CombosISSDTO();
				ItemServ.setCodItemServ(response.getListaComboDescItemServ(i).getCodItemServ());
				ItemServ.setDescItemServ(response.getListaComboDescItemServ(i).getCodItemServ() + " - " + response.getListaComboDescItemServ(i).getDescItemServ());
				String itemServ = GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(response.getListaComboDescItemServ(i).getCodItemServ())), 8);
				ItemServ.setDescItemServExibicao(GissUtil.mascaraItemLei(itemServ) + " - " + response.getListaComboDescItemServ(i).getDescItemServ());
				comboItemServList.add(ItemServ);
			}
		}
		return comboItemServList;

	}

	public List<CombosISSDTO> listarComboCtaReceita(Long cosif, Integer codEmpresa) throws PdcAdapterException, UtilidadesServiceException {

		List<CombosISSDTO> comboCtaReceitaList = new ArrayList<CombosISSDTO>();
		ListarComboCtaReceitaRequest request = new ListarComboCtaReceitaRequest();

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */
		request.setCodCosif(GissUtil.notNull(cosif));
		request.setCodigoEmpresa(GissUtil.notNull(codEmpresa));

		ListarComboCtaReceitaResponse response = factoryAdapter.getListarComboCtaReceitaPDCAdapter().invokeProcess(request);

		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		CombosISSDTO CtaReceita;
		for (ListaComboCtaReceita itemRetorno : response.getListaComboCtaReceita()){
				CtaReceita= new CombosISSDTO();
				CtaReceita.setContaReceita(itemRetorno.getCodCtaReceita());
				String contaFormatada = GissUtil.preencherZerosAEsquerda(String.valueOf(GissUtil.notNull(itemRetorno.getCodCtaReceita())), 14);
				CtaReceita.setDescContaReceitaExibicao(contaFormatada + " - " +itemRetorno.getDescCtaReceita());
				CtaReceita.setDescContaReceita(itemRetorno.getDescCtaReceita());
				comboCtaReceitaList.add(CtaReceita);
		}
		return comboCtaReceitaList;

	}

	public String consultaLupaCnpj(EmpresaISSDTO dto) throws PdcAdapterException, UtilidadesServiceException {

		ConsultarLupaCnpjEmpRequest request = new ConsultarLupaCnpjEmpRequest();
		request.setCnpjPrincipal(GissUtil.notNull(dto.getCnpj()));
		request.setCnpjFilial(GissUtil.notNull(dto.getCnpjFilial()));
		request.setCnpjControle(GissUtil.notNull(dto.getCnpjControle()));
		request.setCodEmpresa(GissUtil.notNull(dto.getCnpj())!=0?0:GissUtil.notNull(dto.getCodEmpresa()));

		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */
		ConsultarLupaCnpjEmpResponse response = factoryAdapter.getConsultarLupaCnpjEmpPDCAdapter().invokeProcess(request);
		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		dto.setCnpj(response.getCnpjPrincipal());
		dto.setCnpjControle(response.getCnpjControle());
		dto.setCnpjFilial(response.getCnpjFilial());
		dto.setCodEmpresa(response.getCodEmpresa());
		dto.setDescEmpresa(response.getDescEmpresa());
		response.setCodMensagem(response.getCodMensagem());
		response.setMensagem(response.getMensagem());
		return response.getCodMensagem() + " - " + response.getMensagem();

	}

	public List<CombosISSDTO> listarCosifEmp(Integer codEmpresa) throws PdcAdapterException, UtilidadesServiceException {

		ListarComboCosifEmpRequest request = new ListarComboCosifEmpRequest();
		List<CombosISSDTO> dtoCosif = new ArrayList<CombosISSDTO>();
		request.setCodigoEmpresa(GissUtil.notNull(codEmpresa));
		/*
		 * ************************** INVOCA PROCESSO PDC * *************************
		 */
		ListarComboCosifEmpResponse response = factoryAdapter.getListarComboCosifEmpPDCAdapter().invokeProcess(request);
		/*
		 * ************************** RESULTADO DA CONSULTA * *************************
		 */
		for (int i = 0; i < response.getListaCosifCount(); i++) {
			if (response.getListaCosif(i).getCodCosif()!=0) {
				CombosISSDTO item = new CombosISSDTO();
				item.setCodCosif(response.getListaCosif(i).getCodCosif());
				String cosifFormatado = GissUtil.preencherZerosAEsquerda(String.valueOf(response.getListaCosif(i).getCodCosif()), 10);
				item.setCodCosifExibicao(GissUtil.mascaraCosif(cosifFormatado));
				dtoCosif.add(item);
			}
		}
		
		return dtoCosif;

	}
	
	public ItemMunicipio consultaLupaMunicipio(Long codigo, String estado) throws PdcAdapterException, UtilidadesServiceException  {
		List<ItemMunicipio> lista = consultaLupaMunicipio(codigo, "", estado);
		return lista.size() == 0 ? new ItemMunicipio() : lista.get(0);
	}
	
	public List<ItemMunicipio>consultaLupaMunicipio(Long codigo, String descricao, String estado) throws PdcAdapterException, UtilidadesServiceException  {
		descricao = GissUtil.notNull(descricao).toUpperCase();
		codigo = GissUtil.notNull(codigo);

		ConsultarLupaMunicipioRequest request = new ConsultarLupaMunicipioRequest();
	
		ArrayList<ItemMunicipio> municipio = new ArrayList<ItemMunicipio>();
		
		request.setCfuncao("C");
		request.setCodMunicipio(codigo);
		request.setNomeMunicipio(descricao);
		request.setUf(estado);

		ConsultarLupaMunicipioResponse response = factoryAdapter.getConsultarLupaMunicipioPDCAdapter().invokeProcess(request);

		for (int i = 0; i < response.getQuantOcorrencia(); i++) {
			ItemMunicipio itemMunicipio = new ItemMunicipio();
			ListaConsultarLupaMunicipio listaMunicipio = response.getListaConsultarLupaMunicipio(i);
			
			itemMunicipio.setCodigoMunicipio(listaMunicipio.getCodMunicipioAgeo());
			itemMunicipio.setDescricaoMuncipio(listaMunicipio.getMunicipio());
			itemMunicipio.setUf(listaMunicipio.getSiglaEstado());
			municipio.add(itemMunicipio);
		}
		return municipio;
	}
	
    public List<EstadosComboBean> listagemEstados() throws PdcAdapterException, UtilidadesServiceException {
		
		List<EstadosComboBean> comboEstadosList = new ArrayList<EstadosComboBean>();
		List<EstadosComboBean> comboEstadosListOrdenado = new ArrayList<EstadosComboBean>();
		ListarComboEstadoRequest lRequest = new ListarComboEstadoRequest();		
		lRequest.setQtdeReg(50);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		ListarComboEstadoResponse lResponse = factoryAdapter.getListarComboEstadoPDCAdapter().invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getNumConsulta(); i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(String.valueOf(lResponse.getListaComboEstado(i).getCodUf()));
			estadosCombo.setSigla(lResponse.getListaComboEstado(i).getCodSiglaUf());
			estadosCombo.setNome(lResponse.getListaComboEstado(i).getDescUf());
			comboEstadosList.add(estadosCombo);
		}

		String[] vet;
		vet = new String[comboEstadosList.size()];
		for (int i = 0; i < comboEstadosList.size(); i++) {
			EstadosComboBean comboEstadosListOrdenado1 = (EstadosComboBean) comboEstadosList.get(i);
			vet[i] = Formatacao.completeToRight(comboEstadosListOrdenado1.getNome(), ' ', 100) + Formatacao.formataZerosEsquerda(String.valueOf(i), 5);
		}
		Arrays.sort(vet);

		for (int i = 0; i < vet.length; i++) {
			comboEstadosListOrdenado.add((EstadosComboBean) comboEstadosList.get(Integer.parseInt(vet[i].substring(100, 105))));
		}
		
		return comboEstadosListOrdenado;
	}

}
