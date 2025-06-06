/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consaldosrec/impl/ConSaldosRecServiceImpl.java,v $
 * $Id: ConSaldosRecServiceImpl.java,v 1.2 2017/12/18 10:46:16 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: ConSaldosRecServiceImpl.java,v $
 * Revision 1.2  2017/12/18 10:46:16  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:08:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2017/04/05 20:53:27  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:35  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:07  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */
 
package br.com.bradesco.web.giss.service.business.consaldosrec.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterException;
import br.com.bradesco.web.giss.exception.EnvioMensagemException;
import br.com.bradesco.web.giss.service.business.consaldosrec.IConSaldosRecService;
import br.com.bradesco.web.giss.service.business.consaldosrec.IConSaldosRecServiceConstants;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.ControleSaldosRecolhimentoDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.DependenciasDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.consaldosrec.exceptions.ConSaldosRecServiceException;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.response.ComboEstadosResponse;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.IListarDependenciasSaldoRecolhimentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.request.ListarDependenciasSaldoRecolhimentoRequest;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.ListarDependenciasSaldoRecolhimentoResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.request.ListarMunicipiosRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.response.ListarMunicipiosResponse;
import br.com.bradesco.web.giss.utils.NumberUtils;
import br.com.bradesco.web.giss.view.bean.model.municipio.EstadosComboBean;
import emsg.api.ApiVersoes;
import emsg.api.EnvioMensagem;
import emsg.api.EnvioMensagemFactory;
import emsg.api.EnvioMensagemTO;
import emsg.api.IdiomaConstantes;
import emsg.api.dispositivo.EnderecoEmailTipos;
import emsg.api.dispositivo.MensagemEmailTO;
import emsg.api.exception.EmsgApiException;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: ConSaldosRec
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class ConSaldosRecServiceImpl implements IConSaldosRecService {

	private ILogManager logger;

	private FactoryAdapter factoryAdapter;
	
	public List<SelectItem> listarComboEstados() throws PdcAdapterException, ConSaldosRecServiceException {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();
		ComboEstadosRequest lRequest = new ComboEstadosRequest();		
		lRequest.setQuantidadeOcorrencias(IConSaldosRecServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS);
		lRequest.setCodigoUnidadeFederativa(IConSaldosRecServiceConstants.CODIGO_UNIDADE_FEDERATIVA);
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

		return comboEstadosList;
	}
	
	public List<MunicipioDTO> listarMunicipios(String codigoMunicipio) throws PdcAdapterException, ConSaldosRecServiceException {
		
		List<MunicipioDTO> listaMunicipios = new ArrayList<MunicipioDTO>();
		
		ListarMunicipiosRequest lRequest = new ListarMunicipiosRequest();		
		lRequest.setQtdeRegistros(IConSaldosRecServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS);
		lRequest.setCodUF(Integer.valueOf(codigoMunicipio));
		lRequest.setCodMunicipio(0);
		
		 /* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarMunicipiosPDCAdapter listarMunicipiosPDCAdapter = factoryAdapter.getListarMunicipiosPDCAdapter();
		ListarMunicipiosResponse lResponse = listarMunicipiosPDCAdapter.invokeProcess(lRequest);

		 /* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQtdeReg(); i++) {
			MunicipioDTO municipioLista = new MunicipioDTO();
			
			municipioLista.setCodigo(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getCodMunicipio()));
			municipioLista.setNome(String.valueOf(lResponse.getOcorrenciasMunicipios(i).getDescMunicipio()));
			municipioLista.setLinha(cont++);
			listaMunicipios.add(municipioLista);
		}
		
		return listaMunicipios;
	}

	public ControleSaldosRecolhimentoDTO listarDependenciasControleSaldoRecolhim(String codigoMunicipio, String competencia) throws PdcAdapterException, ConSaldosRecServiceException {
		
		ControleSaldosRecolhimentoDTO dependenciasRetorno = new ControleSaldosRecolhimentoDTO();		
		List<DependenciasDTO> dependenciasList = new ArrayList<DependenciasDTO>();
		
		ListarDependenciasSaldoRecolhimentoRequest lRequest = new ListarDependenciasSaldoRecolhimentoRequest();		
		lRequest.setQuantidadeOcorrencias(IConSaldosRecServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS);
		lRequest.setCodigoMunicipio(Long.valueOf(codigoMunicipio));
		lRequest.setMesAnoApuracao(Integer.valueOf(competencia.replace("/", "")));
		
		 /* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		IListarDependenciasSaldoRecolhimentoPDCAdapter listarDependenciasPDCAdapter = factoryAdapter.getListarDependenciasSaldoRecolhimentoPDCAdapter();
		ListarDependenciasSaldoRecolhimentoResponse lResponse = listarDependenciasPDCAdapter.invokeProcess(lRequest);

		 /* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		

		String indicadorDiaUtil = "";
		String indicadorFormaPagto = "";
		String dataInvertida = lResponse.getDataRecolhimento().replaceAll("\\.", "/");
		
		if(lResponse.getIndicadorDiaUtil().equals("S")){
			indicadorDiaUtil = IConSaldosRecServiceConstants.INDICADOR_DIA_UTIL_SIM;
		}else{
			indicadorDiaUtil = IConSaldosRecServiceConstants.INDICADOR_DIA_UTIL_NAO;
		}
		
		if(lResponse.getIndicadorPagamentoTributo().equals("1")){
			indicadorFormaPagto = IConSaldosRecServiceConstants.FORMA_PAGAMENTO_ANTECIPA;
		}else{
			indicadorFormaPagto = IConSaldosRecServiceConstants.FORMA_PAGAMENTO_PRORROGA;
		}
		
		dependenciasRetorno.setCompetencia(competencia);
		dependenciasRetorno.setDataRecolhimento(dataInvertida);
		dependenciasRetorno.setFormaPagto(indicadorFormaPagto);
		dependenciasRetorno.setPagtoDiaUtil(indicadorDiaUtil);
		dependenciasRetorno.setVencimento(String.valueOf(lResponse.getDiaVencimentoTributo()));
		
		int cont = 0;
		
		for (int i = 0; i < lResponse.getQuantidadeOcorrencias(); i++) {
			DependenciasDTO dependenciaLista = new DependenciasDTO();
		
			String descSituacao = "";
			String descEmail = "";
			boolean ativaCheck;
			
			int situacao = lResponse.getOcorrencias(i).getIndicadorSituacaoMensagem();
			
				switch (situacao) { 
					case 1: 
						descSituacao = IConSaldosRecServiceConstants.SITUACAO_PENDENTE_NAO_ENVIADO_1;
						break; 
					case 2: 
						descSituacao = IConSaldosRecServiceConstants.SITUACAO_INDEVIDO_NAO_ENVIADO_2;
						break; 
					case 3: 
						descSituacao = IConSaldosRecServiceConstants.SITUACAO_PENDENTES_ENVIADOS_3;
						break; 
					case 4: 
						descSituacao = IConSaldosRecServiceConstants.SITUACAO_INDEVIDO_ENVIADO_4;
						break; 
					case 5: 
						descSituacao = IConSaldosRecServiceConstants.SITUACAO_ENVIADO_5;
						break;			        
				} 
			
				if(situacao == 1 || situacao == 2){
					descEmail = "Não";
					ativaCheck = true;
				}else{
					descEmail = "Sim";
					ativaCheck = false;
				}
								
			dependenciaLista.setDependencia(String.valueOf(lResponse.getOcorrencias(i).getCodigoUnidadeOrganizacionalResponsavel()));
			dependenciaLista.setCodUnidadeOrg(lResponse.getOcorrencias(i).getCodigoUnidadeOrganizacionalResponsavel());
			dependenciaLista.setDescricao(lResponse.getOcorrencias(i).getNomeUnidadeOrganizacionalResponsavel());
			dependenciaLista.setSituacao(descSituacao);
			dependenciaLista.setVencimento(String.valueOf(lResponse.getOcorrencias(i).getDiaVencimentoTributo()));
			BigDecimal valorContabil = lResponse.getOcorrencias(i).getContabil(0).getValor();
			if ("-".equals(lResponse.getOcorrencias(i).getContabil(0).getSinal())) {
				valorContabil = valorContabil.negate();
			}
			dependenciaLista.setSaldo(NumberUtils.format(valorContabil));
			dependenciaLista.setEmail(descEmail);
			dependenciaLista.setAtivaCheckSaldoRec(ativaCheck);
			dependenciaLista.setDataAtual(lResponse.getOcorrencias(i).getDataAtual());
			dependenciaLista.setDataProcessamento(lResponse.getOcorrencias(i).getDataProcessamento());
			dependenciaLista.setLinha(cont++);
			dependenciasList.add(dependenciaLista);
		}
		
		dependenciasRetorno.setListaDependencias(dependenciasList);
		
		return dependenciasRetorno;
	}

	public String enviarMensagem(DependenciasDTO dependencia) {
		EnvioMensagemTO envioMensagemTO = new EnvioMensagemTO();
		envioMensagemTO.setNomeAplicacaoOrigem(IConSaldosRecServiceConstants.APLICACAO_ORIGEM_ENVIO_MENSAGEM);
		envioMensagemTO.setNomeLogicoMensagem(IConSaldosRecServiceConstants.NOME_LOGICO_ENVIO_MENSAGEM);
		envioMensagemTO.setCodigoIdiomaMensagem(IdiomaConstantes.IDIOMA_PORTUGUES);
		String param1 = dependencia.getDataAtual();
		String param2 = dependencia.getDataProcessamento();
		String[] parametros = {param1, param2};
		envioMensagemTO.setWorkConjuntoParametroMensagem(parametros);

		StringBuilder mensagemEmail = new StringBuilder();
		mensagemEmail.append(NumberUtils.format(dependencia.getCodUnidadeOrg(), "##0000"));
		mensagemEmail.append("000");
		MensagemEmailTO mensagemEmailPrincipalTO = new MensagemEmailTO();
		mensagemEmailPrincipalTO.adicionarEnderecoEmail(mensagemEmail.toString(), EnderecoEmailTipos.TIPO_PARA);
		envioMensagemTO.setMensagemPrincipalTO(mensagemEmailPrincipalTO);

		try {
			logger.info(this.getClass(), "Enviando mensagem para o endereço: " + mensagemEmail.toString());

			EnvioMensagem envioMensagem = EnvioMensagemFactory.getInstance(ApiVersoes.EMSG0002);
			String protocoloMensagem = envioMensagem.enviarMensagem(envioMensagemTO, EnvioMensagem.SERVER);

			logger.info(this.getClass(), "Protocolo de Envio: " + protocoloMensagem);

			return protocoloMensagem;
		} catch (EmsgApiException e) {
			logger.info(this.getClass(), "Return Code: " + e.getReturnCode());
			logger.info(this.getClass(), "Reason Code: " + e.getReasonCode());
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			throw new EnvioMensagemException(e);
		}
	}

	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

	public ILogManager getLogger() {
		return logger;
	}

	public void setLogger(ILogManager logger) {
		this.logger = logger;
	}
}
