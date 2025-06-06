/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/aliquotadiferenciada/impl/AliquotaDiferenciadaServiceImpl.java,v $
 * $Id: AliquotaDiferenciadaServiceImpl.java,v 1.5 2018/06/14 10:16:13 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: AliquotaDiferenciadaServiceImpl.java,v $
 * Revision 1.5  2018/06/14 10:16:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2018/06/06 17:08:57  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2017/07/28 14:09:20  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.2  2017/07/25 18:15:30  gilbertocopoli
 * alteração Giba
 *
 * Revision 1.1  2017/04/11 14:12:18  gmichelini
 * *** empty log message ***
 *
 * Revision 1.4  2013/01/11 18:09:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.3  2012/12/10 16:11:21  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:14  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:31  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:04  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.aliquotadiferenciada.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.IAliqDiferencServiceConstants;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.IAliquotaDiferenciadaService;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.bean.AliquotaDifResultadoDTO;
import br.com.bradesco.web.giss.service.business.aliquotadiferenciada.bean.AliquotaDiferenciadaDTO;
import br.com.bradesco.web.giss.service.data.pdc.FactoryAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.IListaContasMunAliqDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.request.ListaContasMunAliqDifRequest;
import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.ListaContasMunAliqDifResponse;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.IListarMunicipioAliquotaDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.request.ListarMunicipioAliquotaDifRequest;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse;
import br.com.bradesco.web.giss.utils.GissUtil;





/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Implementação do adaptador: Aliquotadiferenciada
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public class AliquotaDiferenciadaServiceImpl implements IAliquotaDiferenciadaService {

	private FactoryAdapter factoryAdapter;

	/**
	 * Construtor.
	 */
	public AliquotaDiferenciadaServiceImpl() {
		// TODO: Implementação
	}

	public List<AliquotaDiferenciadaDTO> listaGridAliquotaDiferenciada(Long codMunicipio, Integer codUF){

		AliquotaDiferenciadaDTO AliquotaDiferenciada;


		List<AliquotaDiferenciadaDTO> AliquotaDiferenciadaList = new ArrayList<AliquotaDiferenciadaDTO>();

		ListarMunicipioAliquotaDifRequest lRequest = new ListarMunicipioAliquotaDifRequest();		
		lRequest.setQtdeRegistro(IAliqDiferencServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ALIQUOTA_DIFERENCIADA);
		lRequest.setCodMunicipio(codMunicipio);
		lRequest.setCodUF(codUF);


		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/

		IListarMunicipioAliquotaDifPDCAdapter listarMunicipiosAliquotaDifPDCAdapter = factoryAdapter.getListarMunicipioAliquotaDifPDCAdapter();
		ListarMunicipioAliquotaDifResponse lResponse = listarMunicipiosAliquotaDifPDCAdapter.invokeProcess(lRequest);


		int cont = 0;

		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/

		for (int i = 0; i < lResponse.getQtdeRegistros(); i++) {
			AliquotaDiferenciada = new AliquotaDiferenciadaDTO();				
			AliquotaDiferenciada.setCodigo(String.valueOf(lResponse.getOcorrenciasAliquota(i).getCodMunicipio()));
			AliquotaDiferenciada.setDescricao(lResponse.getOcorrenciasAliquota(i).getDescMunicipio());
			AliquotaDiferenciada.setLinha(cont++);
			AliquotaDiferenciadaList.add(AliquotaDiferenciada);
		}


		return AliquotaDiferenciadaList;

	}

	public List<AliquotaDifResultadoDTO> listaGridAliquotaDiferenciadaResultado(String codigoMunicipio){
		
		AliquotaDifResultadoDTO AliquotaDiferenciadaResultado;
		List<AliquotaDifResultadoDTO> AliquotaDiferenciadaResultadoList = new ArrayList<AliquotaDifResultadoDTO>();
		
		ListaContasMunAliqDifRequest lRequest = new ListaContasMunAliqDifRequest();
		lRequest.setNumeroMaximoOcorrencias(IAliqDiferencServiceConstants.QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ALIQUOTA_DIFERENCIADA);
		lRequest.setCodigoMunicipio(Long.valueOf(codigoMunicipio));
		
		
		/* **************************
		 * 	INVOCA PROCESSO PDC		*
		 * **************************/
		
		
		IListaContasMunAliqDifPDCAdapter listaContasMunAliqDifPDCAdapter = factoryAdapter.getListaContasMunAliqDifPDCAdapter();
		ListaContasMunAliqDifResponse lResponse = listaContasMunAliqDifPDCAdapter.invokeProcess(lRequest);
		int cont = 0;
		
		GissUtil gissUtil = new GissUtil();
		
		/* **************************
		 * 	RESULTADO DA CONSULTA	*
		 * **************************/
		
		
		for (int i = 0; i < lResponse.getNumeroConsultas(); i++) {
			AliquotaDiferenciadaResultado = new AliquotaDifResultadoDTO();				
			AliquotaDiferenciadaResultado.setItem(String.valueOf(lResponse.getOcorrencias(i).getItemLei()));
			AliquotaDiferenciadaResultado.setRazao(GissUtil.formatarRazaoContabil(lResponse.getOcorrencias(i).getCodigoGrupo() , lResponse.getOcorrencias(i).getCodigoSubgrupo()));
			AliquotaDiferenciadaResultado.setCosif(GissUtil.mascaraContaContabil(lResponse.getOcorrencias(i).getCodigoConta(), AliquotaDiferenciadaResultado.getRazao()));
			AliquotaDiferenciadaResultado.setConta(lResponse.getOcorrencias(i).getNumeroConta() == 0?"":GissUtil.preencherZerosAEsquerda(String.valueOf(lResponse.getOcorrencias(i).getNumeroConta()), 7) + "-"+ lResponse.getOcorrencias(i).getDigitoConta());
			AliquotaDiferenciadaResultado.setDescricaoConta(String.valueOf(lResponse.getOcorrencias(i).getDescricaoRazao()));
			AliquotaDiferenciadaResultado.setDiferenciada(String.format("%.2f", lResponse.getOcorrencias(i).getAliquotaDiferenciada()) + "%");
			AliquotaDiferenciadaResultado.setPadrao(String.format("%.2f", lResponse.getOcorrencias(i).getAliquotaPadrao()) + "%");
			AliquotaDiferenciadaResultado.setLinha(cont++);
			AliquotaDiferenciadaResultadoList.add(AliquotaDiferenciadaResultado);
		}


		return AliquotaDiferenciadaResultadoList;
	}



	public FactoryAdapter getFactoryAdapter() {
		return factoryAdapter;
	}

	public void setFactoryAdapter(FactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}

}




