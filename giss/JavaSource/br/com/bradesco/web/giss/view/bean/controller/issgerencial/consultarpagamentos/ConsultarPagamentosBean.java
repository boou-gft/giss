package br.com.bradesco.web.giss.view.bean.controller.issgerencial.consultarpagamentos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import net.sf.jasperreports.engine.JRException;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.issempresa.IEmpresaISSService;
import br.com.bradesco.web.giss.service.business.issempresa.bean.EmpresaISSDTO;
import br.com.bradesco.web.giss.service.business.liberarpagamento.ILiberarPagtoISSService;
import br.com.bradesco.web.giss.service.business.liberarpagamento.bean.LiberarPagtoISSDTO;
import br.com.bradesco.web.giss.service.business.utilidade.IUtilidadesService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioBean;
import br.com.bradesco.web.giss.view.bean.filtro.BuscaMunicipioCallback;
import br.com.bradesco.web.giss.view.bean.imprimirRelatorios.ExportarPlanilha;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: ConsultarPagamentosBean.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class ConsultarPagamentosBean implements Serializable, BuscaMunicipioCallback {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;
	
	private ILogManager logManager;
	
	private LiberarPagtoISSDTO dto = new LiberarPagtoISSDTO();
	private LiberarPagtoISSDTO dtoDetalhe = new LiberarPagtoISSDTO();
	private List<SelectItem> selectItemPgtos = new ArrayList<SelectItem>();
	private Integer codigoSelecionadoRadio = null;
	
	private List<SelectItem> listaEmpresa = new ArrayList<SelectItem>(); 
	private List<SelectItem> selectlistaEmp = new ArrayList<SelectItem>(); 
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>(); 
	private List<EstadosComboBean> listaDosEstados = new ArrayList<EstadosComboBean>(); 
	private BuscaMunicipioBean buscaMunicipio = new BuscaMunicipioBean(); 
	IUtilidadesService utilidadesServiceImpl = (IUtilidadesService) FacesUtils.getManagedBean("utilidadesServiceImpl"); 
	IEmpresaISSService empresasISSServiceImpl = (IEmpresaISSService) FacesUtils.getManagedBean("empresasISSServiceImpl"); 
	ILiberarPagtoISSService liberarPagtoISSServiceImpl = (ILiberarPagtoISSService) FacesUtils.getManagedBean("liberarPagtoISSServiceImpl");
	private EmpresaISSDTO dtoCombo = new EmpresaISSDTO(); 
	private Integer[] codigosSelecionadosTabela = new Integer[100]; 

	private boolean checkTodos = false; 
	private boolean mostrarLista = false; 


	
	/**
	 * @nome: inicializar
	 * @propósito: Método responsável por inicializar.
	 *
	 * @return String
	 */
	public String inicializar() {
		dto = new LiberarPagtoISSDTO();
		codigosSelecionadosTabela = new Integer[100];
		listaEstados.clear();
		listaDosEstados.clear();
		buscaMunicipio = new BuscaMunicipioBean();
		checkTodos = false;
		carregarComboEmpresa();
		carregaComboEstados();
		
		return "consultarPagamentos";
	}
	
	/**
	 * @nome: carregaComboEstados
	 * @propósito: Método responsável por carregaComboEstados.
	 */
	public void carregaComboEstados() {
		listaDosEstados = new ArrayList<EstadosComboBean>();
		listaEstados = new ArrayList<SelectItem>();
		listaDosEstados = utilidadesServiceImpl.listagemEstados();
		listaEstados = GissUtil.carregaComboEstados(listaDosEstados);
	}
	
	/**
	 * @nome: carregarComboEmpresa
	 * @propósito: Método responsável por carregarComboEmpresa.
	 */
	private void carregarComboEmpresa() { 
    	listaEmpresa = new ArrayList<SelectItem>();
    	empresasISSServiceImpl.ListaEmpCadastro(dtoCombo);
    	for (int i = 0; i < dtoCombo.getLista().size(); i++) {
			listaEmpresa.add(new SelectItem(dtoCombo.getLista().get(i).getCodEmpresa(), dtoCombo.getLista().get(i).getCnpjFormatado()+ " - "+dtoCombo.getLista().get(i).getDescEmpresa()));
		}
	}
	
	public void processa() {
		dto.setEstado(GissUtil.procuraCodigoUnidadeFederativaPorSigla(listaDosEstados, buscaMunicipio.getUf()));
	}
	
	/**
	 * @nome: pesquisarPagtos
	 * @propósito: Método responsável por pesquisarPagtos.
	 *
	 * @return String
	 */
	public String pesquisarPagtos() {
		return consultar(Boolean.TRUE);
	}
	
	/**
	 * @nome: consultar
	 * @propósito: Método responsável por consultar.
	 *
	 * @param exibirMensagemErro Boolean
	 * @return String
	 */
	private String consultar(Boolean exibirMensagemErro) {
		
		try {	
			if(dto.getMesPeriodoInicial().equals("") || dto.getAnoPeriodoInicial().equals("")) {
				BradescoFacesUtils.addInfoModalMessage("Obrigatório preencher mês e ano da competência!", false);
				return "";
			}
			
			if(dto.getEmpresa() == null || dto.getEmpresa() == 0) {
				BradescoFacesUtils.addInfoModalMessage("Obrigatório selecionar a Empresa!", false);
				return "";
			}
			
			if(dto.getCodProduto() == null || dto.getCodProduto() == 0) {
				BradescoFacesUtils.addInfoModalMessage("Obrigatório selecionar um Produto!", false);
				return "";
			}
			
			if(GissUtil.notNull(buscaMunicipio.getCodigo()) != 0) {
				pesquisarMunicipio();
				dto.setCodMunicipio(buscaMunicipio.getCodigo());
			} else if(!GissUtil.notNull(buscaMunicipio.getDescricao()).equals("")) {
				pesquisarMunicipio();
				return "";
			} else {
				dto.setCodMunicipio(0l);
			}
			dto.setLista(new ArrayList<LiberarPagtoISSDTO>());
			selectItemPgtos = new ArrayList<SelectItem>();
			codigosSelecionadosTabela = new Integer[1000];
			liberarPagtoISSServiceImpl.listarConsultaPagamentos(dto);
			setMostrarLista(dto.getLista().size()>0); 
			if (dto.getLista() != null) {
				selectItemPgtos = new ArrayList<SelectItem>();
				for (int i = 0; i < dto.getLista().size(); i++) {
					selectItemPgtos.add(new SelectItem(i, " "));
				}        
			}
		
		} catch (PdcAdapterFunctionalException p) {
			if (exibirMensagemErro) {
				BradescoFacesUtils.addInfoModalMessage(p.getMessage(),false);
			}
		} catch (Exception e) {
			getLogManager().error(this.getClass(), e);
			if (exibirMensagemErro) {
				GissUtil.adicionarMensagemInformacao("msg_erro_servico_generica");
			}
		}
		
		return "";
	}
	
	/**
	 * @nome: detalhar
	 * @propósito: Método responsável por detalhar.
	 *
	 * @return String
	 */
	public String detalhar() {
		if(dto.getLista().size() >0) {
			if(codigosSelecionadosTabela.length == 1) {
				dtoDetalhe = new LiberarPagtoISSDTO();
				try {
					setDtoDetalhe(dto.getLista().get(codigosSelecionadosTabela[0]));
				} catch (Exception e) {
					BradescoFacesUtils.addErrorModalMessage(e.getMessage());
				}
				return "detalharConsultaPagamentos";
				
			} else {
				BradescoFacesUtils.addInfoModalMessage("Para detalhar selecione um único registro da lista!", false);
				return "";
			} 
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista de 'Consultar TED/Transferência' vazia", false);
			return "";
		}
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 */
	public void pesquisarMunicipio() {
		pesquisarMunicipio(dto);
	}
	
	/**
	 * @nome: pesquisarMunicipio
	 * @propósito: Método responsável por pesquisarMunicipio.
	 *
	 * @param dto LiberarPagtoISSDTO
	 */
	private void pesquisarMunicipio(LiberarPagtoISSDTO dto) {
		buscaMunicipio.setCallback(this);
		buscaMunicipio.setSelecionado(null);
		String uf = null;
		for (int i = 0; i < listaDosEstados.size(); i++) {
			if(dto.getEstado().equals(listaDosEstados.get(i).getCodigo())) {
				uf = listaDosEstados.get(i).getSigla();
			}
		}
		buscaMunicipio.setEstado(uf != null?uf:"");
		buscaMunicipio.buscarISS();
	}
	
	/**
	 * @nome: atribuirTodos
	 * @propósito: Método responsável por atribuirTodos.
	 */
	public void atribuirTodos() {
		if(checkTodos) {
			codigosSelecionadosTabela = new Integer[dto.getLista().size()];
			for (int i = 0; i < dto.getLista().size(); i++) {
				if(i== 100) {
					break;
				}
				codigosSelecionadosTabela[i] = i;
			}
		} else {
			codigosSelecionadosTabela = new Integer[100];
		}
	}
	
	/**
	 * @nome: emitirComprovante
	 * @propósito: Método responsável por emitirComprovante.
	 *
	 * @param ev ActionEvent
	 */
	public void emitirComprovante(ActionEvent ev) {
		if(dto.getLista().size() > 0) {
			if(codigosSelecionadosTabela.length == 1) {
				if(dto.getLista().get(codigosSelecionadosTabela[0]).getCodStatus() == 3) {
					gerarComprovante();
				} else {
					BradescoFacesUtils.addInfoModalMessage("O Status precisa estar como 'PAGO' para gerar o comprovante.", false);
				}
			} else {
				BradescoFacesUtils.addInfoModalMessage("Selecione 1 item da lista para gerar o comprovante.", false);		
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista de 'Consultar TED/Transferência' vazia.", false);
		}
	}
	
	/**
	 * @nome: emitirComprovanteLote
	 * @propósito: Método responsável por emitirComprovanteLote.
	 *
	 * @param ev ActionEvent
	 */
	public void emitirComprovanteLote(ActionEvent ev) {
		if(dto.getLista().size() > 0) {
			if(codigosSelecionadosTabela.length > 1) {
				if(dto.getLista().get(codigosSelecionadosTabela[0]).getCodStatus() == 3) {
					gerarComprovante();	
				} else {
					BradescoFacesUtils.addInfoModalMessage("O Status precisa estar como 'PAGO' para gerar o comprovante em lote.", false);
				}
			} else {
				BradescoFacesUtils.addInfoModalMessage("Selecione mais de 1 item da lista para Comprovante em Lote.", false);
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista de 'Consultar TED/Transferência' vazia", false);
		}
	}

	/**
	 * @nome: imprimirPlanilha
	 * @propósito: Método responsável por imprimirPlanilha.
	 *
	 * @return String
	 */
	public String imprimirPlanilha() {
		try {
			if(dto.getLista().size() >0) {
				ExportarPlanilha exportarPlanilha = new ExportarPlanilha("Planilha de Consultar TED e Transferência ", "CONSULTA_TEDTRANSF");
				exportarPlanilha.planilhaConsultarPagamentos(dto.getLista());
			} else {
					BradescoFacesUtils.addInfoModalMessage("Planilha de 'Consultar TED/Transferência' vazia", false);
					return "";
			}
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
		return null;
		
	}
	
	/**
	 * @nome: cancelarSelecionados
	 * @propósito: Método responsável por cancelarSelecionados.
	 *
	 * @return String
	 */
	public String cancelarSelecionados() {
		if(dto.getLista().size() > 0) {
			if(codigosSelecionadosTabela.length > 0) {
				try {
					List<LiberarPagtoISSDTO> selecionados = new ArrayList<LiberarPagtoISSDTO>();
					for (Integer selecionado : codigosSelecionadosTabela) {
						LiberarPagtoISSDTO liberarPagtoISSDTO = dto.getLista().get(selecionado);
						if (liberarPagtoISSDTO.getCodStatus() != 1) {
							BradescoFacesUtils.addInfoModalMessage("Cancelamento de TED/Transferência permitido apenas para pagamento(s) 'Pendente(s) de Envio'.", false);
							return "";
						} else {
							selecionados.add(liberarPagtoISSDTO);
						}
					}
					
					String mensagem = liberarPagtoISSServiceImpl.cancelarTedTransferencia(dto, selecionados, Boolean.FALSE);
					
					BradescoFacesUtils.addInfoModalMessage(mensagem, false);
					
					return consultar(Boolean.FALSE);
				} catch (Exception e) {
					BradescoFacesUtils.addErrorModalMessage(e.getMessage());
				}
			} else {
				BradescoFacesUtils.addInfoModalMessage("Para cancelar selecione algum registro da lista!", false);
			} 
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista de 'Consultar TED/Transferência' vazia", false);
		}
		return "";
	}
	
	/**
	 * @nome: cancelarTodos
	 * @propósito: Método responsável por cancelarTodos.
	 *
	 * @return String
	 */
	public String cancelarTodos() {
		if(dto.getLista().size() > 0) {
			try {
				String mensagem = liberarPagtoISSServiceImpl.cancelarTedTransferencia(dto, dto.getLista(), Boolean.TRUE);
				
				BradescoFacesUtils.addInfoModalMessage(mensagem, false);
				
				return consultar(Boolean.FALSE);
			} catch (Exception e) {
				BradescoFacesUtils.addErrorModalMessage(e.getMessage());
			}
		} else {
			BradescoFacesUtils.addInfoModalMessage("Lista de 'Consultar TED/Transferência' vazia", false);
		}
		return "";
	}

	/**
	 * @nome: gerarComprovante
	 * @propósito: Método responsável por gerarComprovante.
	 */
	private void gerarComprovante() {
		List<LiberarPagtoISSDTO> listaRelatorio = new ArrayList<LiberarPagtoISSDTO>();
		
		for (Integer check : codigosSelecionadosTabela) {
			listaRelatorio.add(dto.getLista().get(check));
		}
		
		try {
			GissUtil.gerarPDF("comprovantePagamento", "COMPROVANTE_PAGAMENTO" , listaRelatorio, new HashMap<String, Object>());
		} catch (JRException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (IOException e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		} catch (Exception e) {
			BradescoFacesUtils.addInfoModalMessage(e.getMessage(), false);
		}
	}
	

	public List<SelectItem> getSelectItemPgtos() {
		return selectItemPgtos;
	}

	public void setSelectItemPgtos(List<SelectItem> selectItemPgtos) {
		this.selectItemPgtos = selectItemPgtos;
	}

	public Integer getCodigoSelecionadoRadio() {
		return codigoSelecionadoRadio;
	}

	public void setCodigoSelecionadoRadio(Integer codigoSelecionadoRadio) {
		this.codigoSelecionadoRadio = codigoSelecionadoRadio;
	}

	public LiberarPagtoISSDTO getDto() {
		return dto;
	}

	public void setDto(LiberarPagtoISSDTO dto) {
		this.dto = dto;
	}

	public List<SelectItem> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<SelectItem> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public List<SelectItem> getSelectlistaEmp() {
		return selectlistaEmp;
	}

	public void setSelectlistaEmp(List<SelectItem> selectlistaEmp) {
		this.selectlistaEmp = selectlistaEmp;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<EstadosComboBean> getListaDosEstados() {
		return listaDosEstados;
	}

	public void setListaDosEstados(List<EstadosComboBean> listaDosEstados) {
		this.listaDosEstados = listaDosEstados;
	}

	public BuscaMunicipioBean getBuscaMunicipio() {
		return buscaMunicipio;
	}

	public void setBuscaMunicipio(BuscaMunicipioBean buscaMunicipio) {
		this.buscaMunicipio = buscaMunicipio;
	}

	public IUtilidadesService getUtilidadesServiceImpl() {
		return utilidadesServiceImpl;
	}

	public void setUtilidadesServiceImpl(IUtilidadesService utilidadesServiceImpl) {
		this.utilidadesServiceImpl = utilidadesServiceImpl;
	}
	public IEmpresaISSService getEmpresasISSServiceImpl() {
		return empresasISSServiceImpl;
	}
	public void setEmpresasISSServiceImpl(IEmpresaISSService empresasISSServiceImpl) {
		this.empresasISSServiceImpl = empresasISSServiceImpl;
	}
	public EmpresaISSDTO getDtoCombo() {
		return dtoCombo;
	}
	public void setDtoCombo(EmpresaISSDTO dtoCombo) {
		this.dtoCombo = dtoCombo;
	}
	public Integer[] getCodigosSelecionadosTabela() {
		return codigosSelecionadosTabela;
	}
	public void setCodigosSelecionadosTabela(Integer[] codigosSelecionadosTabela) {
		this.codigosSelecionadosTabela = codigosSelecionadosTabela;
	}
	public boolean isCheckTodos() {
		return checkTodos;
	}
	public void setCheckTodos(boolean checkTodos) {
		this.checkTodos = checkTodos;
	}
	public boolean isMostrarLista() {
		return mostrarLista;
	}
	public void setMostrarLista(boolean mostrarLista) {
		this.mostrarLista = mostrarLista;
	}
	public ILiberarPagtoISSService getLiberarPagtoISSServiceImpl() {
		return liberarPagtoISSServiceImpl;
	}
	public void setLiberarPagtoISSServiceImpl(
			ILiberarPagtoISSService liberarPagtoISSServiceImpl) {
		this.liberarPagtoISSServiceImpl = liberarPagtoISSServiceImpl;
	}
	public LiberarPagtoISSDTO getDtoDetalhe() {
		return dtoDetalhe;
	}
	public void setDtoDetalhe(LiberarPagtoISSDTO dtoDetalhe) {
		this.dtoDetalhe = dtoDetalhe;
	}


	public ILogManager getLogManager() {
		return logManager;
	}


	public void setLogManager(ILogManager logManager) {
		this.logManager = logManager;
	}

	
}
