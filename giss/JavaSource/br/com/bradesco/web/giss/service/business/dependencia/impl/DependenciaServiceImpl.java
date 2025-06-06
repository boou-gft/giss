/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: /SGCAP/giss/01.Fontes/02.Baixa_Plataforma/01.Web/giss/src/br/com/bradesco/web/giss/service/business/dependencia/impl/DependenciaServiceImpl.java,v $
 * $Id: DependenciaServiceImpl.java,v 1.1 2021/05/30 15:53:23 local_welber Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: DependenciaServiceImpl.java,v $
 * Revision 1.1  2021/05/30 15:53:23  local_welber
 * Commit incial do projeto
 *
 * Revision 1.13  2018/03/12 11:24:05  gmichelini
 * *** empty log message ***
 *
 * Revision 1.12  2018/02/01 16:06:06  gmichelini
 * *** empty log message ***
 *
 * Revision 1.11  2017/12/18 10:46:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.10  2017/11/10 13:11:04  gmichelini
 * Inclusão do botão Gerar Relatório EOS nas telas
 *
 * Tarifas Cobradas (PAs)
 * Resultado Municípios Novos
 * Manter Município
 *
 * Revision 1.9  2017/11/06 11:39:53  gmichelini
 * *** empty log message ***
 *
 * Revision 1.8  2017/08/14 20:08:51  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.7  2017/08/11 16:05:00  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.6  2017/08/09 16:16:48  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.5  2017/07/25 18:15:30  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.4  2017/07/07 14:27:24  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/06/22 19:53:06  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/06/06 12:32:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:12:56  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2013/03/04 18:51:10  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2013/02/04 12:22:44  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:46  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.dependencia.impl;

import static br.com.bradesco.web.giss.utils.GissUtil.verificaIntegerNulo;
import static br.com.bradesco.web.giss.utils.GissUtil.verificaLongNulo;
import static br.com.bradesco.web.giss.utils.GissUtil.verificaStringNula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaServiceConstants;
import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.ConsultarMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasEncerradasEntradaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasEncerradasSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasHistoricasSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasMunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasNovasDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoEntradaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependencia.exceptions.DependenciaServiceException;
import br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean.DependeciasEncerradasDTO;
import br.com.bradesco.web.giss.service.business.tipoincidencia.exceptions.TipoIncidenciaServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterardependencia.IAlterarDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.AlterarDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep;
import br.com.bradesco.web.giss.service.data.pdc.alterardependencia.response.AlterarDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.ICombolistadependenciasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest;
import br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse;
import br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.ICombolistamunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.request.ConsultaDependenciaHistoricoRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ConsultaDependenciaHistoricoResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultardependencia.IConsultarDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.IConsultarDependenciasEncerradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.request.ConsultarDependenciasEncerradasRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.ConsultarDependenciasEncerradasResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.IConsultarDependenciaUnidOrganizPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.IConsultarMunicipiosNovosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.response.ConsultarMunicipiosNovosResponse;
import br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.IDetalharDenpendenciasEncerradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest;
import br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse;
import br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.IExcluirDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.response.ExcluirDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.IIncluirDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.response.IncluirDependenciaResponse;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.IIncluirDependenciasNovasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.response.IncluirDependenciasNovasResponse;
import br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.IListarDependenciasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.request.ListarDependenciasMunicipioRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.ListarDependenciasMunicipioResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.IListarDependenciasNovasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.request.ListarDependenciasNovasRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.IListarHistMunicEstadoDependenciasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.request.ListarHistMunicEstadoDependenciasRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.ListarHistMunicEstadoDependenciasResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.utils.Formatacao;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: Dependencia
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class DependenciaServiceImpl implements IDependenciaService {

	private FactoryAdapter factoryAdapter;
	
    /**
     * Construtor.
     */
    public DependenciaServiceImpl() {
        // TODO: Implementação
    }
    
    public List<EstadosComboBean> listagemEstados() throws PdcAdapterException, DependenciaServiceException {
		
		List<EstadosComboBean> comboEstadosList = new ArrayList<EstadosComboBean>();
		List<EstadosComboBean> comboEstadosListOrdenado = new ArrayList<EstadosComboBean>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IDependenciaServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
		lRequest.setNomeUnidadeFederativa("");
		lRequest.setSiglaUnidadeFederativa("");
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IComboEstadosPDCAdapter comboEstadosPDCAdapter = factoryAdapter.getComboEstadosPDCAdapter();
		ComboEstadosResponse lResponse = comboEstadosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeFederativa()));
			estadosCombo.setSigla(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
			estadosCombo.setNome(lResponse.getOcorrencias(i).getNomeUnidadeFederativa());
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
    
    public List<SelectItem> listarComboEstados() throws PdcAdapterException, DependenciaServiceException {
		
		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		List<SelectItem> comboEstadosListOrdenado = new ArrayList<SelectItem>();

		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IDependenciaServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
		lRequest.setNomeUnidadeFederativa("");
		lRequest.setSiglaUnidadeFederativa("");
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IComboEstadosPDCAdapter comboEstadosPDCAdapter = factoryAdapter.getComboEstadosPDCAdapter();
		ComboEstadosResponse lResponse = comboEstadosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeFederativa()));
			estadosCombo.setSigla(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
			estadosCombo.setNome(lResponse.getOcorrencias(i).getNomeUnidadeFederativa());
			comboEstadosList.add(new SelectItem(estadosCombo.getCodigo(),estadosCombo.getNome()));
		}

		String[] vet;
		vet = new String[comboEstadosList.size()];
		for (int i = 0; i < comboEstadosList.size(); i++) {
			SelectItem comboEstadosListOrdenado1 = (SelectItem) comboEstadosList.get(i);
			vet[i] = Formatacao.completeToRight(comboEstadosListOrdenado1.getLabel(), ' ', 100) + Formatacao.formataZerosEsquerda(String.valueOf(i), 5);
		}
		Arrays.sort(vet);

		for (int i = 0; i < vet.length; i++) {
			comboEstadosListOrdenado.add((SelectItem) comboEstadosList.get(Integer.parseInt(vet[i].substring(100, 105))));
		}
		
		return comboEstadosListOrdenado;

	}    

    public List<DependenciasNovasDTO> listarDependenciasNovas(Long empresa, Integer codDependencia) {
    	
    	List<DependenciasNovasDTO> dependenciasNovasList = new ArrayList<DependenciasNovasDTO>();
		ListarDependenciasNovasRequest lRequest = new ListarDependenciasNovasRequest();		
		lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_NOVAS);
		lRequest.setNumSeqUnidadeOrganizacional(0);
		lRequest.setCodPessoaJuridica(empresa);
		lRequest.setCodUnidadeOrganizacional(codDependencia);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * 
		 * **************************/
		
		IListarDependenciasNovasPDCAdapter listaDependenciasNovasPDCAdapter = factoryAdapter.getListarDependenciasNovasPDCAdapter();
		ListarDependenciasNovasResponse lResponse = listaDependenciasNovasPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQtdeOcorrencias(); i++) {
			DependenciasNovasDTO dependNovasLista = new DependenciasNovasDTO();
			dependNovasLista.setCodPessoaJuridica(String.valueOf(lResponse.getOcorrenciasDepNovas(i).getCodPessoaJuridica()));
			dependNovasLista.setNumUnidOrganiz(String.valueOf(lResponse.getOcorrenciasDepNovas(i).getNumSeqUnidadeOrganizacional()));
			dependNovasLista.setCodigo(String.valueOf(lResponse.getOcorrenciasDepNovas(i).getCodUnidadeOrganizacional()));
			dependNovasLista.setDescricao(lResponse.getOcorrenciasDepNovas(i).getCodUorg());
			dependNovasLista.setMunicipio(String.valueOf(lResponse.getOcorrenciasDepNovas(i).getCodMunicipio()) + " - " + lResponse.getOcorrenciasDepNovas(i).getDescMunicipio());
			dependNovasLista.setEstado(lResponse.getOcorrenciasDepNovas(i).getSiglaUf());			
			dependNovasLista.setNumeroRegistro(cont++);
			dependenciasNovasList.add(dependNovasLista);
		}
		
		return dependenciasNovasList;
	}    
    
    public List<DependeciasEncerradasDTO> listarDependenciasEncerradas(String dataDe, String dataAte) {
    	
    	List<DependeciasEncerradasDTO> dependenciasEncerradasList = new ArrayList<DependeciasEncerradasDTO>();
		ConsultarDependenciasEncerradasRequest lRequest = new ConsultarDependenciasEncerradasRequest();		
		lRequest.setQuantidadeOcorrencias(130);
		lRequest.setDtInicio(dataDe);
		lRequest.setDtFinal(dataAte);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarDependenciasEncerradasPDCAdapter consultarDependenciasEncerradasPDCAdapter = factoryAdapter.getConsultarDependenciasEncerradasPDCAdapter();
		ConsultarDependenciasEncerradasResponse lResponse = consultarDependenciasEncerradasPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			DependeciasEncerradasDTO dependEncerrLista = new DependeciasEncerradasDTO();
			dependEncerrLista.setHoraManutencao(lResponse.getOcorrencias(i).getHoraManutencao().replace(".", "/"));
			dependEncerrLista.setCodigoDependencia(String.valueOf(lResponse.getOcorrencias(i).getCodigoDependencia()));
			dependEncerrLista.setNomeDependencia(lResponse.getOcorrencias(i).getNomeDependencia());
			dependEncerrLista.setNomeMunicipio(lResponse.getOcorrencias(i).getNomeMunicipio());
			dependEncerrLista.setMunicipio(lResponse.getOcorrencias(i).getCodigoMunicipio() + " - " + lResponse.getOcorrencias(i).getNomeMunicipio());
			dependEncerrLista.setCodigoMunicipio(String.valueOf(lResponse.getOcorrencias(i).getCodigoMunicipio()));
			dependEncerrLista.setNumeroSequencial(String.valueOf(lResponse.getOcorrencias(i).getNumeroSequencialUnidadeOrganizacional()));		
			dependEncerrLista.setCodigoDependenciaIncorporadora(String.valueOf(lResponse.getOcorrencias(i).getCodigoDependenciaIncorporadora()));
			dependEncerrLista.setNomeDependenciaIncorporadora(lResponse.getOcorrencias(i).getNomeDependenciaIncorporadora());
			dependEncerrLista.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrencias(i).getCodigoPessoaJuridica()));
			dependEncerrLista.setDataExclusao(String.valueOf(lResponse.getOcorrencias(i).getDataExclusao().replace(".", "/")));
			dependEncerrLista.setDataBaixa(String.valueOf(lResponse.getOcorrencias(i).getDataBaixa().replace(".", "/")));
			dependEncerrLista.setSiglaUnidadeFederativa(lResponse.getOcorrencias(i).getSiglaUnidadeFederativa());
			dependEncerrLista.setLinha(cont++);
			dependenciasEncerradasList.add(dependEncerrLista);
		}
		
		return dependenciasEncerradasList;
	}    
    
   public DependenciasMunicipioDTO listarDependenciasMunicipio(String codigoMunicipio, Integer codDependencia, String codPessoaJuridica) {

    	DependenciasMunicipioDTO dependenciasMunicipios = new DependenciasMunicipioDTO();
		ListarDependenciasMunicipioRequest lRequest = new ListarDependenciasMunicipioRequest();		
		lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
		lRequest.setCodMunicipio(Long.parseLong(codigoMunicipio));
		lRequest.setCodDependencia(codDependencia);
		lRequest.setCodPessoaJuridica(Long.parseLong(codPessoaJuridica));
		lRequest.setQtdDependenciasAtivas(0);
		lRequest.setQtdDependenciasEncer(0);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarDependenciasMunicipioPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarDependenciasMunicipioPDCAdapter();
		ListarDependenciasMunicipioResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		
		for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
			DependenciasMunicipioDTO dependMunicipioDTO = new DependenciasMunicipioDTO();
			
			dependMunicipioDTO.setCodMunicipio(lResponse.getOcorrencias(i).getCodMunicipio());
			dependMunicipioDTO.setDescMunicipio(lResponse.getOcorrencias(i).getDescMunicipio());
			dependMunicipioDTO.setCodUF(lResponse.getOcorrencias(i).getCodUF());
			dependMunicipioDTO.setDescUF(lResponse.getOcorrencias(i).getDescUF());
			dependMunicipioDTO.setTragSemTrag(lResponse.getOcorrencias(i).getTragSemTrag());
			
			dependMunicipioDTO.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrencias(i).getCodPessoaJuridica()));
			dependMunicipioDTO.setCodigoDependencia(String.valueOf(lResponse.getOcorrencias(i).getCodDependencia()));
			dependMunicipioDTO.setNumeroSequencialDependencia(String.valueOf(lResponse.getOcorrencias(i).getNumSeqPessoaJuridica()));
			dependMunicipioDTO.setDescricaoDependencia(lResponse.getOcorrencias(i).getDescDependencia());
			dependMunicipioDTO.setDataAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/"));
			dependMunicipioDTO.setLinha(cont++);
			dependenciasMunicipios.getDepMunicipio().add(dependMunicipioDTO);
		}
				
		return dependenciasMunicipios;
	}    
   
   public DependenciasMunicipioDTO listarDependenciasMunicipioComLoop(String codigoMunicipio, Integer codDependencia, String codPessoaJuridica) {
   	
   		DependenciasMunicipioDTO dependenciasMunicipios = new DependenciasMunicipioDTO();
   		CombolistadependenciasRequest lRequest = new CombolistadependenciasRequest();
   		
   		if(codDependencia != null && codDependencia > 0) {
   			lRequest.setMaxOcorr(30);	
   		} else {
   			lRequest.setMaxOcorr(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
   		}
   		
   		lRequest.setCdMun(Long.parseLong(codigoMunicipio));
		lRequest.setCdDependencia(codDependencia);
		lRequest.setCdPjurid(Long.parseLong(codPessoaJuridica));
		lRequest.setQtdAtiva(0);
		lRequest.setQtdEncer(0);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		ICombolistadependenciasPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getCombolistadependenciasPDCAdapter();
		CombolistadependenciasResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		dependenciasMunicipios.setCodMunicipio(lResponse.getCdMunicipio());
		dependenciasMunicipios.setCodUF(lResponse.getCdUf());
		dependenciasMunicipios.setDescMunicipio(lResponse.getDcMunicipio());
		dependenciasMunicipios.setDescUF(lResponse.getDcUf());
		
		for (int i = 0; i < lResponse.getGISSW050CONSULTASSAIDACount(); i++) {
			DependenciasMunicipioDTO dependMunicipioDTO = new DependenciasMunicipioDTO();
			dependMunicipioDTO.setCodigoPessoaJuridica(String.valueOf(lResponse.getGISSW050CONSULTASSAIDA(i).getSCdPjurid()));
			dependMunicipioDTO.setCodigoDependencia(String.valueOf(lResponse.getGISSW050CONSULTASSAIDA(i).getSCdDependencia()));
			dependMunicipioDTO.setNumeroSequencialDependencia(String.valueOf(lResponse.getGISSW050CONSULTASSAIDA(i).getSCdNseqPjurid()));
			dependMunicipioDTO.setDescricaoDependencia(lResponse.getGISSW050CONSULTASSAIDA(i).getSDepDescr());
			dependMunicipioDTO.setDataAtualizacao(lResponse.getGISSW050CONSULTASSAIDA(i).getSDtAtulz().replace(".", "/"));
			dependMunicipioDTO.setLinha(cont++);
			dependenciasMunicipios.getDepMunicipio().add(dependMunicipioDTO);
		}
		
		return dependenciasMunicipios;
	}    
   
	public DependenciasHistoricasSaidaDTO listarDependenciasMunicipioHistorico(String codMunicipio, Integer codDependencia, String codPessoaJuridica) {
	   ListaDependenciaPorMunicipioRequest parametro = new ListaDependenciaPorMunicipioRequest();
	   parametro.setQtdeRegistro(50);
	   parametro.setCodMunicipio(codMunicipio != null && !codMunicipio.equals("")?Long.valueOf(codMunicipio):0);
	   parametro.setCodDependencia(codDependencia != null?codDependencia:0);
	   parametro.setCodPessoaJuridica(codPessoaJuridica != null && !codPessoaJuridica.equals("")?Long.valueOf(codPessoaJuridica):0);
       
	   ListaDependenciaPorMunicipioResponse resultParametro = getFactoryAdapter().getListaDependenciaPorMunicipioPDCAdapter().invokeProcess(parametro);
       
       DependenciasHistoricasSaidaDTO listContabilOperacional = new DependenciasHistoricasSaidaDTO();
       DependenciasHistoricasSaidaDTO saida = null;
       
       listContabilOperacional.setCodMunicipio(resultParametro.getCodMunicipio());
       listContabilOperacional.setCodUF(resultParametro.getCodUF());
       listContabilOperacional.setDescMunicipio(resultParametro.getDescMunicipio());
       listContabilOperacional.setDescUF(resultParametro.getDescUF());
       
       for(int i = 0; i < resultParametro.getQtdeRegistros(); i++){
    	   OcorrenciasDepPorMunicipio param = resultParametro.getOcorrenciasDepPorMunicipio()[i];
	       	if (param.getCodUnidadeOrganizacional() > 0) {
	       		saida = new DependenciasHistoricasSaidaDTO(param.getCodUnidadeOrganizacional(), param.getDescUnidadeOrganizacional(), param.getDataAtualizacao(), param.getDataExclusao(), param.getCodPessoaJuridica(), param.getNumSeqUnidadeOrganizacional(), param.getTimeStamp(),param.getHoraAtualizacao(), param.getCodigoFuncional(), param.getTragSemTrag());
	       		listContabilOperacional.getDepHistorico().add(saida);
	       	}
       }
       
       return listContabilOperacional;
   }
   
	public DetalhesDependenciasHistoricoSaidaDTO consultaDependenciaHistorico(DetalhesDependenciasHistoricoEntradaDTO entrada) {
		ConsultaDependenciaHistoricoRequest parametro = new ConsultaDependenciaHistoricoRequest();
		parametro.setCodigoPessoaJuridica(entrada.getCodigoPessoaJuridica());
		parametro.setSequencialUnidadeOrganizacional(entrada.getNumeroSequencialUnidadeOrganizacional());
		parametro.setTimeStamp(entrada.getTimestamp());
		
      
		ConsultaDependenciaHistoricoResponse resultParametro = getFactoryAdapter().getConsultaDependenciaHistoricoPDCAdapter().invokeProcess(parametro);
      
      if(resultParametro == null){
      	return null;
      }
      
      DetalhesDependenciasHistoricoSaidaDTO saida = null;
      
      saida = new DetalhesDependenciasHistoricoSaidaDTO(
    		  resultParametro.getDataAbertura(), 
    		  resultParametro.getDataEncerramento(), 
    		  resultParametro.getCodigoAgenciaIncorporadora(), 
    		  resultParametro.getNomeAgenciaIncorporadora(), 
    		  resultParametro.getEnderecoAgenciaIncorporadora(), 
    		  resultParametro.getNumeroAgenciaIncorporadora(), 
    		  resultParametro.getCepAgenciaIncorporadora(), 
    		  resultParametro.getSiglaUFAgenciaIncorporadora(), 
    		  resultParametro.getPaisAgenciaIncorporadora(), 
    		  resultParametro.getCodigoCadastroContribuinteMobiliario(), 
    		  resultParametro.getCodigoDepartamentoAgenciaIncorporadora(), 
    		  resultParametro.getCodigoDepartamentoAgenciaIncorporadoraAnt(), 
    		  resultParametro.getDescricaoDepartamentoAgenciaIncorporadora(), 
    		  resultParametro.getDescricaoDepartamentoAgenciaIncorporadoraAnt(), 
    		  resultParametro.getInscricaoMunicipal(), 
    		  resultParametro.getInscricaoMunicipalAnt(), 
    		  resultParametro.getIndicadorTributavelNaoTributavel() ,
    		  resultParametro.getTipoDepartamento(), 
    		  resultParametro.getTipoDepartamentoAnt(), 
    		  NumberUtils.formatCnpj(resultParametro.getCnpj()), 
    		  resultParametro.getEstadoIncorporaDepartamento(), 
    		  resultParametro.getCodigoMunicipioIncorporaDepartamento(), 
    		  resultParametro.getDescricaoMunicipioIncorporaDepartamento());
      
      
      for (int i = 0; i < resultParametro.getQtdeOcorrencias(); i++) {
			DependenciaDTO dto = new DependenciaDTO();
			dto.setCodPaa(resultParametro.getListaConsultarDep(i).getCodPaa());
			dto.setDescPaa(resultParametro.getListaConsultarDep(i).getDescPaa());
			dto.setMunicipio(resultParametro.getListaConsultarDep(i).getMunicipio());
			dto.setUf(resultParametro.getListaConsultarDep(i).getUf());
			dto.setOperacao(resultParametro.getListaConsultarDep(i).getOperacao());
			saida.getListaPaa().add(dto);
		}
      			
      
      return saida;
  }
   
   @SuppressWarnings({ "unchecked", "static-access" })
   public List listarDependenciasEncerradas(DependenciasEncerradasEntradaDTO entrada) {
	   ConsultarDependenciasEncerradasRequest parametro = new ConsultarDependenciasEncerradasRequest();
	   parametro.setQuantidadeOcorrencias(50);
      
	   ConsultarDependenciasEncerradasResponse resultParametro = getFactoryAdapter().getConsultarDependenciasEncerradasPDCAdapter().invokeProcess(parametro);
      
      if(resultParametro == null){
      	return new ArrayList();
      }
      
      List listOcorrecias = new ArrayList();
      DependenciasEncerradasSaidaDTO saida = null;
      
      for(int i = 0; i < resultParametro.getOcorrenciasCount(); i++){
      br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias param = resultParametro.getOcorrencias(i);
	       	if (param.getCodigoMunicipio() > 0) {
	       		saida = new DependenciasEncerradasSaidaDTO(param.getNumeroSequencialUnidadeOrganizacional(), param.getCodigoMunicipio(), param.getNomeMunicipio(), param.getSiglaUnidadeFederativa(), param.getNomeDependenciaIncorporadora(), param.getDataExclusao(), param.getHoraManutencao());
	       		listOcorrecias.add(saida);
	       	}
      }
      
      return listOcorrecias;
  }
    
    public List<MunicipioDTO> listarMunicipios(String codigoEstado) {
    	
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
		lRequest.setQtdeRegistros(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodUF(Integer.valueOf(codigoEstado));
		lRequest.setCodMunicipio(0);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarMunicipiosPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
		ListarMunicipiosResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQtdeReg(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio());
			municipioLista.setSigla(lResponse.getOcorrenciasMunicipios(i).getSiglaUF());
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		
		return municipiosListRetorno;
	}
    
public List<MunicipioDTO> listarMunicipiosComLoop(String codigoEstado) {
    	
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
    	CombolistamunicipiosRequest lRequest = new CombolistamunicipiosRequest();		
		lRequest.setMaxOcorr(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCUf(Integer.valueOf(codigoEstado));
		lRequest.setCMun(0);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		ICombolistamunicipiosPDCAdapter listaMunicipiosPDCAdapter = factoryAdapter.getCombolistamunicipiosPDCAdapter();
		CombolistamunicipiosResponse lResponse = listaMunicipiosPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getConsultasSaidaCount(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getConsultasSaida(i).getSCmun()));
			municipioLista.setNome(lResponse.getConsultasSaida(i).getSImun());
			municipioLista.setSigla(lResponse.getConsultasSaida(i).getSCsglUf());
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		
		return municipiosListRetorno;
	}        
    
    public List<MunicipioDTO> listarHistMunicipiosPorEstado(String codigoEstado) throws PdcAdapterException, DependenciaServiceException {
    	
    	List<MunicipioDTO> municipiosListRetorno = new ArrayList<MunicipioDTO>();
		ListarHistMunicEstadoDependenciasRequest lRequest = new ListarHistMunicEstadoDependenciasRequest();		
		lRequest.setQuantidadeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodigoEstado(Integer.valueOf(codigoEstado));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarHistMunicEstadoDependenciasPDCAdapter listaHistMunicipiosEstadoDepPDCAdapter = factoryAdapter.getListarHistMunicEstadoDependenciasPDCAdapter();
		ListarHistMunicEstadoDependenciasResponse lResponse = listaHistMunicipiosEstadoDepPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrencias(i).getCodigoMunicipio()));
			municipioLista.setNome(lResponse.getOcorrencias(i).getDescricaoMunicipio());
			municipioLista.setDataAtualizacao(String.valueOf(lResponse.getOcorrencias(i).getDataAtualizacao()));
			municipioLista.setDataExclusao(String.valueOf(lResponse.getOcorrencias(i).getDataExclusao()));
			municipioLista.setHoraAtualizacao(lResponse.getOcorrencias(i).getHoraAtualizacao());
			municipioLista.setLinha(cont++);
			municipiosListRetorno.add(municipioLista);
		}
		
		return municipiosListRetorno;
	}        
    
    //consulta dependencia (Resultado dependencias novas)
	public DependenciaDTO consultarInformacoesDependencia(DependenciasNovasDTO dependenciasNovasDTO) throws PdcAdapterException, TipoIncidenciaServiceException {

		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();		
		ConsultarDependenciaRequest lRequest = new ConsultarDependenciaRequest();		
		
		lRequest.setCodigoPessoaJuridica(new Integer(dependenciasNovasDTO.getCodPessoaJuridica()));
		lRequest.setSequencialUnidadeOrganizacional(Integer.valueOf(dependenciasNovasDTO.getNumUnidOrganiz()));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarDependenciaPDCAdapter dependenciaPDCAdapter = factoryAdapter.getConsultarDependenciaPDCAdapter();
		ConsultarDependenciaResponse lResponse = dependenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		dependenciaDTORetorno.setCodigoDependencia(dependenciasNovasDTO.getCodigo());
		dependenciaDTORetorno.setDescricaoDependencia(dependenciasNovasDTO.getDescricao());		
		dependenciaDTORetorno.setDataAbertura(String.valueOf(lResponse.getDataAbertura()).replace(".", "/"));
		dependenciaDTORetorno.setDataEncerramento(String.valueOf(lResponse.getDataEncerramento()).replace(".", "/"));
		if (lResponse.getCodigoAgenciaIncorporadora() > 0) {
			dependenciaDTORetorno.setAgenciaIncorporadora(lResponse.getCodigoAgenciaIncorporadora() + " - " + lResponse.getNomeAgenciaIncorporadora());
		} else {
			dependenciaDTORetorno.setAgenciaIncorporadora("");
		}
		dependenciaDTORetorno.setLogradouro(lResponse.getEnderecoAgenciaIncorporadora());
		dependenciaDTORetorno.setCep(String.valueOf(lResponse.getCepAgenciaIncorporadora()));
		dependenciaDTORetorno.setEstado(lResponse.getSiglaUFAgenciaIncorporadora());		
		dependenciaDTORetorno.setPais(lResponse.getPaisAgenciaIncorporadora());
		dependenciaDTORetorno.setCcm(String.valueOf(lResponse.getCodigoCadastroContribuinteMobiliario()));
		dependenciaDTORetorno.setTipoDepartamento(lResponse.getTipoDepartamento());
		dependenciaDTORetorno.setCodAgenciaIncorporadoraDepartamento(String.valueOf(lResponse.getCodigoDepartamentoAgenciaIncorporadora()));
		dependenciaDTORetorno.setDescAgenciaIncorporadoraDepartamento(lResponse.getDescricaoDepartamentoAgenciaIncorporadora());
		dependenciaDTORetorno.setInscricaoMunicipal(lResponse.getInscricaoMunicipal());	
		dependenciaDTORetorno.setIndTributavel(String.valueOf(lResponse.getIndicadorTributavelNaoTributavel()));
		dependenciaDTORetorno.setCodMunicipio(lResponse.getCodigoMunicipio());
		dependenciaDTORetorno.setMunicipio(String.valueOf(lResponse.getCodigoMunicipio()) + " - " + lResponse.getNomeMunicipio());
		dependenciaDTORetorno.setEstadoMunicipioAgenIncorpDepto(lResponse.getEstadoIncorporaDepartamento());
		dependenciaDTORetorno.setCodMunicipioAgenIncorpDepto(lResponse.getCodigoMunicipioIncorporaDepartamento());
		dependenciaDTORetorno.setDescMunicipioAgenIncorpDepto(lResponse.getDescricaoMunicipioIncorporaDepartamento());	
		dependenciaDTORetorno.setCodigoPessoaAgencIncorpDepto(String.valueOf(lResponse.getCodigoPessoaAgencIncorpDepto()));
		dependenciaDTORetorno.setNumeroSequencAgencIncorpDepto(String.valueOf(lResponse.getNumeroSequencAgencIncorpDepto()));
		dependenciaDTORetorno.setCnpj(NumberUtils.formatCnpj(lResponse.getCnpj()));
		for (int i = 0; i < lResponse.getQtdeOcorrencias(); i++) {
			DependenciaDTO dto = new DependenciaDTO();
			dto.setCodPaa(lResponse.getListaConsultarDep(i).getCodPaa());
			dto.setDescPaa(lResponse.getListaConsultarDep(i).getDescPaa());
			dto.setMunicipio(lResponse.getListaConsultarDep(i).getMunicipio());
			dto.setUf(lResponse.getListaConsultarDep(i).getUf());
			dto.setOperacao(lResponse.getListaConsultarDep(i).getOperacao());
			dto.setExibirCheckCont(lResponse.getListaConsultarDep(i).getOperacao() == 1 || lResponse.getListaConsultarDep(i).getOperacao() == 3?true:false);
			dependenciaDTORetorno.getListaPaa().add(dto);
		}

		return dependenciaDTORetorno;
	}

	//consulta dependencia (encerradas)
	public DependenciaDTO consultarInformacoesDependencia(DependeciasEncerradasDTO dependenciaEncerrDTO) throws PdcAdapterException, TipoIncidenciaServiceException {

		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();		
		DetalharDenpendenciasEncerradasRequest lRequest = new DetalharDenpendenciasEncerradasRequest();		
		
		lRequest.setCodigoPessoaJuridica(Integer.valueOf(new Integer(dependenciaEncerrDTO.getCodigoPessoaJuridica())));
		lRequest.setSequencialUnidadeOrganizacional(Integer.valueOf(Integer.valueOf(dependenciaEncerrDTO.getNumeroSequencial())));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IDetalharDenpendenciasEncerradasPDCAdapter dependenciaPDCAdapter = factoryAdapter.getDetalharDenpendenciasEncerradasPDCAdapter();
		DetalharDenpendenciasEncerradasResponse lResponse = dependenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		dependenciaDTORetorno.setCodigoDependencia("" + lResponse.getCodigoDependencia());
		dependenciaDTORetorno.setDescricaoDependencia(lResponse.getNomeDependencia());
		dependenciaDTORetorno.setDataAbertura(String.valueOf(lResponse.getDataAbertura()).replace(".", "/"));
		dependenciaDTORetorno.setDataEncerramento(String.valueOf(lResponse.getDataEncerramento()).replace(".", "/"));
		if (lResponse.getCodigoAgenciaIncorporadora() > 0) {
			dependenciaDTORetorno.setAgenciaIncorporadora(lResponse.getCodigoAgenciaIncorporadora() + " - " + lResponse.getNomeAgenciaIncorporadora());
		} else {
			dependenciaDTORetorno.setAgenciaIncorporadora("");
		}
		dependenciaDTORetorno.setLogradouro(lResponse.getEnderecoAgenciaIncorporadora());
		dependenciaDTORetorno.setCep(String.valueOf(lResponse.getCepAgenciaIncorporadora()));
		dependenciaDTORetorno.setEstado(lResponse.getSiglaUFAgenciaIncorporadora());		
		dependenciaDTORetorno.setPais(lResponse.getPaisAgenciaIncorporadora());
		dependenciaDTORetorno.setCcm(String.valueOf(lResponse.getCodigoCadastroContribuinteMobiliario()));
		dependenciaDTORetorno.setTipoDepartamento(lResponse.getTipoDepartamento());
		dependenciaDTORetorno.setCodAgenciaIncorporadoraDepartamento(String.valueOf(lResponse.getCodigoDepartamentoAgenciaIncorporadora()));
		dependenciaDTORetorno.setDescAgenciaIncorporadoraDepartamento(lResponse.getDescricaoDepartamentoAgenciaIncorporadora());
		dependenciaDTORetorno.setInscricaoMunicipal(lResponse.getInscricaoMunicipal());	
		dependenciaDTORetorno.setIndTributavel(String.valueOf(lResponse.getIndicadorTributavelNaoTributavel()));
		dependenciaDTORetorno.setCodMunicipio(lResponse.getCodigoMunicipio());
		if (lResponse.getCodigoMunicipio() > 0) {
			dependenciaDTORetorno.setMunicipio(String.valueOf(lResponse.getCodigoMunicipio()) + " - " + lResponse.getNomeMunicipio());
		} else {
			dependenciaDTORetorno.setMunicipio("");
		}
		dependenciaDTORetorno.setEstadoMunicipioAgenIncorpDepto(lResponse.getEstadoIncorporaDepartamento());
		dependenciaDTORetorno.setCodMunicipioAgenIncorpDepto(lResponse.getCodigoMunicipioIncorporaDepartamento());
		dependenciaDTORetorno.setDescMunicipioAgenIncorpDepto(lResponse.getDescricaoMunicipioIncorporaDepartamento());
		dependenciaDTORetorno.setCnpj(NumberUtils.formatCnpj(lResponse.getCnpj()));

		return dependenciaDTORetorno;
	}	
	
	//manter
	public DependenciaDTO consultarInformacoesDependencia(String municipio, String numeroSequenciaDependencia, String codigoPessoaJuridica, String dataAtualizacao) throws PdcAdapterException, TipoIncidenciaServiceException {
		SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSSSSS");
		
		String dataFormatada = "";
		
		try {
			Date date = inputFormat.parse(dataAtualizacao);
			dataFormatada = outputFormat.format(date);
        } catch (ParseException e) {
            e.getMessage();
        }
		
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();		
		ConsultarDependenciaRequest lRequest = new ConsultarDependenciaRequest();		
		
		lRequest.setCodigoPessoaJuridica(Integer.valueOf(codigoPessoaJuridica));
		lRequest.setSequencialUnidadeOrganizacional(Integer.valueOf(numeroSequenciaDependencia));
		lRequest.setDataRegistroHistorico(dataFormatada);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarDependenciaPDCAdapter dependenciaPDCAdapter = factoryAdapter.getConsultarDependenciaPDCAdapter();
		ConsultarDependenciaResponse lResponse = dependenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		String vetorMunicipio[];
		
		vetorMunicipio = municipio.split(" - ");
		
		dependenciaDTORetorno.setCodigoDependencia(vetorMunicipio[0]);
		dependenciaDTORetorno.setDescricaoDependencia(vetorMunicipio[1]);		
		dependenciaDTORetorno.setDataAbertura(String.valueOf(lResponse.getDataAbertura()).replace(".", "/"));
		dependenciaDTORetorno.setDataEncerramento(String.valueOf(lResponse.getDataEncerramento()).replace(".", "/"));
		if (lResponse.getCodigoAgenciaIncorporadora() > 0) {
			dependenciaDTORetorno.setAgenciaIncorporadora(lResponse.getCodigoAgenciaIncorporadora() + " - " + lResponse.getNomeAgenciaIncorporadora());
		} else {
			dependenciaDTORetorno.setAgenciaIncorporadora("");
		}
		dependenciaDTORetorno.setLogradouro(lResponse.getEnderecoAgenciaIncorporadora());
		dependenciaDTORetorno.setCep(String.valueOf(lResponse.getCepAgenciaIncorporadora()));
		dependenciaDTORetorno.setEstado(lResponse.getSiglaUFAgenciaIncorporadora());		
		dependenciaDTORetorno.setPais(lResponse.getPaisAgenciaIncorporadora());
		dependenciaDTORetorno.setCcm(String.valueOf(lResponse.getCodigoCadastroContribuinteMobiliario()));
		dependenciaDTORetorno.setTipoDepartamento(lResponse.getTipoDepartamento());
		dependenciaDTORetorno.setCodAgenciaIncorporadoraDepartamento(String.valueOf(lResponse.getCodigoDepartamentoAgenciaIncorporadora()));
		dependenciaDTORetorno.setDescAgenciaIncorporadoraDepartamento(lResponse.getDescricaoDepartamentoAgenciaIncorporadora());
		dependenciaDTORetorno.setInscricaoMunicipal(lResponse.getInscricaoMunicipal());	
		dependenciaDTORetorno.setIndTributavel(String.valueOf(lResponse.getIndicadorTributavelNaoTributavel()));
		dependenciaDTORetorno.setCodMunicipio(lResponse.getCodigoMunicipio());
		dependenciaDTORetorno.setMunicipio(String.valueOf(lResponse.getCodigoMunicipio()) + " - " + lResponse.getNomeMunicipio());
		dependenciaDTORetorno.setEstadoMunicipioAgenIncorpDepto(lResponse.getEstadoIncorporaDepartamento());
		dependenciaDTORetorno.setCodMunicipioAgenIncorpDepto(lResponse.getCodigoMunicipioIncorporaDepartamento());
		dependenciaDTORetorno.setDescMunicipioAgenIncorpDepto(lResponse.getDescricaoMunicipioIncorporaDepartamento());	
		dependenciaDTORetorno.setCodigoPessoaAgencIncorpDepto(String.valueOf(lResponse.getCodigoPessoaAgencIncorpDepto()));
		dependenciaDTORetorno.setNumeroSequencAgencIncorpDepto(String.valueOf(lResponse.getNumeroSequencAgencIncorpDepto()));
		dependenciaDTORetorno.setCnpj(NumberUtils.formatCnpj(lResponse.getCnpj()));
		
		for (int i = 0; i < lResponse.getQtdeOcorrencias(); i++) {
			DependenciaDTO dto = new DependenciaDTO();
			dto.setCodPaa(lResponse.getListaConsultarDep(i).getCodPaa());
			dto.setDescPaa(lResponse.getListaConsultarDep(i).getDescPaa());
			dto.setMunicipio(lResponse.getListaConsultarDep(i).getMunicipio());
			dto.setUf(lResponse.getListaConsultarDep(i).getUf());
			dto.setOperacao(lResponse.getListaConsultarDep(i).getOperacao());
			dto.setExibirCheckCont(lResponse.getListaConsultarDep(i).getOperacao() == 1 || lResponse.getListaConsultarDep(i).getOperacao() == 3?true:false);
			dto.setDataAtualizacao(lResponse.getListaConsultarDep(i).getSDtSelecao());
			dependenciaDTORetorno.getListaPaa().add(dto);
		}
		
		return dependenciaDTORetorno;
	}
	
	public List<AgenciaDTO> listarAgenciasMunicipio(String codigoMunicipio) {
	    	
	    	List<AgenciaDTO> agenciasMunicipiosList = new ArrayList<AgenciaDTO>();
			ListarDependenciasMunicipioRequest lRequest = new ListarDependenciasMunicipioRequest();		
			lRequest.setQtdeOcorrencias(IDependenciaServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS_MUNICIPIO);
			lRequest.setCodMunicipio(Long.parseLong(codigoMunicipio));
			lRequest.setCodDependencia(0);
			lRequest.setCodPessoaJuridica(0L);
			lRequest.setQtdDependenciasAtivas(0);
			lRequest.setQtdDependenciasEncer(0);
			
			/* **************************
			 * 	INVOCA PROCESSO PDC		*
			 * **************************/
			
			IListarDependenciasMunicipioPDCAdapter listarDependenciasMunicipioPDCAdapter = factoryAdapter.getListarDependenciasMunicipioPDCAdapter();
			ListarDependenciasMunicipioResponse lResponse = listarDependenciasMunicipioPDCAdapter.invokeProcess(lRequest);

			/* **************************
			 * 	RESULTADO DA CONSULTA	*
			 * **************************/
			int cont = 0;
			
			for (int i = 0; i < lResponse.getOcorrenciasCount(); i++) {
				AgenciaDTO dependMunicipioDTO = new AgenciaDTO();
				dependMunicipioDTO.setCodigoPessoaJuridica(String.valueOf(lResponse.getOcorrencias(i).getCodPessoaJuridica()));
				dependMunicipioDTO.setCodigoDependencia(String.valueOf(lResponse.getOcorrencias(i).getCodDependencia()));
				dependMunicipioDTO.setNumeroSequencialDependencia(String.valueOf(lResponse.getOcorrencias(i).getNumSeqPessoaJuridica()));
				dependMunicipioDTO.setDescricaoDependencia(lResponse.getOcorrencias(i).getDescDependencia());
				dependMunicipioDTO.setDataAtualizacao(lResponse.getOcorrencias(i).getDataAtualizacao().replace(".", "/"));
				dependMunicipioDTO.setLinha(cont++);
				agenciasMunicipiosList.add(dependMunicipioDTO);
			}
			
			return agenciasMunicipiosList;
	}    	
	
	public DependenciaDTO incluirDependenciaNova(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento) {
	
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();
		
		if(ccm == null || ccm.equals("")){
			ccm = "0";
		}
		
		if(inscricaoMunicipal == null) {
			inscricaoMunicipal = "";
		}
		
		if(codigoAgenciaIncorpDepto == null || codigoAgenciaIncorpDepto.equals("")){
			codigoAgenciaIncorpDepto = "0";
		}
		
		if(nomeAgenciaIncorpDepto == null || nomeAgenciaIncorpDepto.equals("")){
			nomeAgenciaIncorpDepto = "0";
		}

		if(tipoDepartamento < 0){
			tipoDepartamento = 0;
		}
		
		IncluirDependenciasNovasRequest incluirDependencia = new IncluirDependenciasNovasRequest();
		incluirDependencia.setCodigoPessoaJuridica(Long.valueOf(codigoPessoaJuridica));
		incluirDependencia.setNumeroSequencialUnidadeOrganizacional(Integer.valueOf(numeroUnidadeOrganizacional));
		incluirDependencia.setIndicadorTributavel(tipoDepartamento);
		incluirDependencia.setCodigoCCM(Long.valueOf(ccm));
		incluirDependencia.setCodigoMunicipio(codigoMunicipioManter != null && !codigoMunicipioManter.trim().equals("") ? Long.valueOf(codigoMunicipioManter) : 0);
		incluirDependencia.setCodigoPessoaIncorporadoraDepto(Long.valueOf(codigoAgenciaIncorpDepto));
		incluirDependencia.setNumeroSequencialIncorporadoraDepto(Integer.valueOf(nomeAgenciaIncorpDepto));
		incluirDependencia.setInscricaoMunicipal(inscricaoMunicipal);
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IIncluirDependenciasNovasPDCAdapter incluirDependenciaPDCAdapter = factoryAdapter.getIncluirDependenciasNovasPDCAdapter();
		IncluirDependenciasNovasResponse lResponse = incluirDependenciaPDCAdapter.invokeProcess(incluirDependencia);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		dependenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		dependenciaDTORetorno.setMensagem(lResponse.getMensagem());
	
		return dependenciaDTORetorno;
		
	}
	
	public DependenciaDTO incluirDependencia(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento) {
		
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();
		
		if(ccm == null || ccm.equals("")){
			ccm = "0";
		}
		
		if(inscricaoMunicipal == null) {
			inscricaoMunicipal = "";
		}
		
		if(codigoAgenciaIncorpDepto == null || codigoAgenciaIncorpDepto.equals("")){
			codigoAgenciaIncorpDepto = "0";
		}
		
		if(nomeAgenciaIncorpDepto == null || nomeAgenciaIncorpDepto.equals("")){
			nomeAgenciaIncorpDepto = "0";
		}

		if(tipoDepartamento < 0){
			tipoDepartamento = 0;
		}
		
		IncluirDependenciaRequest incluirDependencia = new IncluirDependenciaRequest();
		incluirDependencia.setCodigoPessoaJuridica(Long.valueOf(codigoPessoaJuridica));
		incluirDependencia.setNumeroSequencialUnidadeOrganizacional(Integer.valueOf(numeroUnidadeOrganizacional));
		incluirDependencia.setIndicadorUnidadeTributaria(tipoDepartamento);
		incluirDependencia.setCodigoCCM(Long.valueOf(ccm));
		incluirDependencia.setCodigoMunicipio(codigoMunicipioManter != null && !codigoMunicipioManter.trim().equals("") ? Long.valueOf(codigoMunicipioManter) : 0);
		incluirDependencia.setCodigoPessoaIncorporadoraDepartamanto(Long.valueOf(codigoAgenciaIncorpDepto));
		incluirDependencia.setNumeroSequencialIncorporDepartamento(Integer.valueOf(nomeAgenciaIncorpDepto));
		incluirDependencia.setInscricaoMunicipal(inscricaoMunicipal);

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IIncluirDependenciaPDCAdapter incluirDependenciaPDCAdapter = factoryAdapter.getIncluirDependenciaPDCAdapter();
		IncluirDependenciaResponse lResponse = incluirDependenciaPDCAdapter.invokeProcess(incluirDependencia);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		dependenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		dependenciaDTORetorno.setMensagem(lResponse.getMensagem());
	
		return dependenciaDTORetorno;
		
	}
	
	public DependenciaDTO excluirDependencia(String codigoPessoaJuridica, String numeroUnidadeOrganizacional) {
		
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();
		
		ExcluirDependenciaRequest excluirDependencia = new ExcluirDependenciaRequest();
		excluirDependencia.setCodigoPessoaJuridica(Long.valueOf(codigoPessoaJuridica));
		excluirDependencia.setNumeroUnidadeOrganizacional(Integer.valueOf(numeroUnidadeOrganizacional));

		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IExcluirDependenciaPDCAdapter excluirDependenciaPDCAdapter = factoryAdapter.getExcluirDependenciaPDCAdapter();
		ExcluirDependenciaResponse lResponse = excluirDependenciaPDCAdapter.invokeProcess(excluirDependencia);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		dependenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		dependenciaDTORetorno.setMensagem(lResponse.getMensagem());
	
		return dependenciaDTORetorno;
		
	}
	
	public DependenciaDTO alterarDependencia(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento, DependenciaDTO dto) {
		
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();
		
		if(tipoDepartamento < 0){
		}

		if(ccm.equals("")){
			ccm = "0";
		}
		
		if(inscricaoMunicipal == null){
			inscricaoMunicipal = "";
		}
		
		if(codigoAgenciaIncorpDepto.equals("")){
			codigoAgenciaIncorpDepto = "0";
		}
		
		if(nomeAgenciaIncorpDepto.equals("")){
			nomeAgenciaIncorpDepto =  "0";
		}
		
		AlterarDependenciaRequest alterarDependencia = new AlterarDependenciaRequest();
		alterarDependencia.setCodigoPessoaJuridica(Long.valueOf(codigoPessoaJuridica));
		alterarDependencia.setNumeroUnidadeOrganizacional(Integer.valueOf(numeroUnidadeOrganizacional));
		alterarDependencia.setIndicadorTributavel(tipoDepartamento);
		alterarDependencia.setCodigoCCM(Long.valueOf(ccm));
		alterarDependencia.setCodigoMunicipio(Long.valueOf(codigoMunicipioManter));
		alterarDependencia.setCodigoIncorporadora(Long.valueOf(codigoAgenciaIncorpDepto)); //deveria ser 0
		alterarDependencia.setSequencialIncorporadora(Integer.valueOf(nomeAgenciaIncorpDepto)); //deveria ser 0
		alterarDependencia.setInscricaoMunicipal(inscricaoMunicipal);
		alterarDependencia.setQtdeOcorrencias(100);
		ListaAlterarDep[] lista = new ListaAlterarDep[100];
		for (int i = 0; i < lista.length; i++) {
			ListaAlterarDep item = new ListaAlterarDep();
			if (i < dto.getListaPaa().size()) {
				item.setCodPaa(dto.getListaPaa().get(i).getCodPaa());
				item.setOperacao(dto.getListaPaa().get(i).getOperacao());
			}else{
				item.setCodPaa(0);
				item.setOperacao(0);
			}
			lista[i] = item;
		}
		alterarDependencia.setListaAlterarDep(lista);
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IAlterarDependenciaPDCAdapter alterarDependenciaPDCAdapter = factoryAdapter.getAlterarDependenciaPDCAdapter();
		AlterarDependenciaResponse lResponse = alterarDependenciaPDCAdapter.invokeProcess(alterarDependencia);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		dependenciaDTORetorno.setCodMensagem(lResponse.getCodMensagem());
		dependenciaDTORetorno.setMensagem(lResponse.getMensagem());
	
		return dependenciaDTORetorno;
		
	}
	
	//para incluir
	public DependenciaDTO consultarInformacoesDependenciaUnidOrgan(String codigoDependencia) {
		
		DependenciaDTO dependenciaDTORetorno = new DependenciaDTO();		
		ConsultarDependenciaUnidOrganizRequest lRequest = new ConsultarDependenciaUnidOrganizRequest();		
		
		lRequest.setCodigoDependencia(Integer.valueOf(codigoDependencia));
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarDependenciaUnidOrganizPDCAdapter dependenciaPDCAdapter = factoryAdapter.getConsultarDependenciaUnidOrganizPDCAdapter();
		ConsultarDependenciaUnidOrganizResponse lResponse = dependenciaPDCAdapter.invokeProcess(lRequest);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
	
		dependenciaDTORetorno.setCodigoPessoaJuridica(String.valueOf(lResponse.getCodigoPessoaJuridica()));
		dependenciaDTORetorno.setSeqUnidadeOrganizacional(String.valueOf(lResponse.getNumeroSequencialUnidadeOrganizacional()));
		
		return dependenciaDTORetorno;
	}
	
	public String ConsultarMunicipiosNovos(ConsultarMunicipiosNovosDTO entrada) {
    	
		ConsultarMunicipiosNovosRequest request =  new ConsultarMunicipiosNovosRequest();
		
		request.setCdMunicipio(verificaLongNulo(entrada.getCdMunicipio()));
	    request.setCdUf(verificaIntegerNulo(entrada.getCdUf()));
	    request.setTipoPesquisa(verificaIntegerNulo(entrada.getTipoPesquisa()));
	    request.setCdTela(verificaStringNula(entrada.getCdTela()));
    			
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IConsultarMunicipiosNovosPDCAdapter dependenciaPDCAdapter = factoryAdapter.getConsultarMunicipiosNovosPDCAdapter();
		ConsultarMunicipiosNovosResponse response = dependenciaPDCAdapter.invokeProcess(request);

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		return response.getMensagem();
	}        
	
	
			
	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}

