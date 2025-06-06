package giss.processamento;

import java.util.Iterator;

import br.com.bradesco.pdc.engine.exception.ProcessMessageException;
import br.com.bradesco.pdc.engine.message.IProcessMessageElement;
import br.com.bradesco.pdc.connector.exception.TransactionMessageException;
import br.com.bradesco.pdc.connector.message.ITransactionMessageElement;
import br.com.bradesco.pdc.engine.process.action.ActionException;
import br.com.bradesco.pdc.engine.process.action.IActionContext;
import br.com.bradesco.pdc.engine.process.action.fwo.IFWOAction;
import br.com.bradesco.pdc.engine.process.action.fwo.IFWORequest;
import br.com.bradesco.pdc.engine.process.action.fwo.IFWOResponse;
import br.com.bradesco.pdc.connector.message.fwo.FWOHeaderFRWKConstants;
import br.com.bradesco.pdc.engine.process.control.fwo.FWOUtils;

/**
 * FWO_COMBO
 * Arquivo gerado automaticamente em 04/06/25 16:57
 * Transação: GISSIACS - Tipo: FWOcombo
 */
public class TxGissiacs implements IFWOAction {

    /**
    * Obtem dados da entrada do processo (informados pelo usuario) e
    * repassa para o FLUXO (Transacao MF)
    */
    public void pre(IActionContext context, IFWORequest request)
            throws ActionException, ProcessMessageException, TransactionMessageException {
            
        String codigoRetorno = context.getSession().getUserTransientStorage().get(FWOUtils.CODIGO_RETORNO);
        String paginacao = FWOHeaderFRWKConstants.FLUXO_DADOS_INICIO; //Bloco [I]nicial
        if (codigoRetorno != null) {
        	paginacao = FWOHeaderFRWKConstants.FLUXO_DADOS_SEGUINTE; // Bloco [S]eguinte 
        }

        //Valor para paginacao no cabecalho do FWO
        FWOUtils.setPaginacao(request, paginacao);
            
        //Inicio da entrada do Processo
        IProcessMessageElement pRequest = context.getRequest().getMessage();
		ITransactionMessageElement txRequest = request.getMessage();

		txRequest.setElementValue( "GISSW396-HEADER.GISSW396-COD-LAYOUT", "GISSW396");
		txRequest.setElementValue( "GISSW396-HEADER.GISSW396-TAM-LAYOUT", "00054");
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-MAX-OCORR", pRequest.getElementValue("quantidadeOcorrencia"));
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-DMES-ANO-APURC-INI", pRequest.getElementValue("dataCompetenciaInicio"));
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-DMES-ANO-APURC-FIM", pRequest.getElementValue("dataCompetenciaFim"));
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-CMUN", pRequest.getElementValue("codMunicipio"));
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-CD-PJURID", pRequest.getElementValue("codPessoaJuridica"));
		txRequest.setElementValue( "GISSW396-REGISTRO.GISSW396-BLOCO-ENTRADA.GISSW396-CD-DEPENDENCIA", pRequest.getElementValue("codDependencia"));

    }


    /**
    * Obtem retorno do FLUXO (Transacao MF) e repassa para a saida do processo.
    */
    public void post(IActionContext context, IFWOResponse response)
           throws ActionException, ProcessMessageException, TransactionMessageException {

    	boolean warnings = false;        //Nao registra as msgs de mais dados
    	boolean codigoRetorno = true;    //Armazena codigo retorno para saber o momento de parada

		IProcessMessageElement pResponse = context.getResponse().getMessage();
		ITransactionMessageElement txResponse = response.getMessage();
		
		//Tratamento de erro
    	if (FWOUtils.trataCodigoRetorno(context, response, warnings, codigoRetorno)) {
    		return;
    	}
		
        //Inicio da saida do Processo
        		pResponse.setElementValue("periodoInicio", txResponse.getElementValue("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-DMES-ANO-PERIO-INI"));
		pResponse.setElementValue("periodoFim", txResponse.getElementValue("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-DMES-ANO-PERIO-FIM"));
		pResponse.setElementValue("quantidadeOcorrencia", txResponse.getElementValue("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-NUM-CONSULTAS"));
		pResponse.setElementValue("qtdeAgencia", txResponse.getElementValue("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-S-TOTAL-AG-LIST.GISSW397-S-QUANTIDADE"));
		pResponse.setElementValue("qtdePa", txResponse.getElementValue("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-S-TOTAL-PA-LIST.GISSW397-S-QUANTIDADE"));

		// Ocorrências do elemento 'GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA.GISSW397-CONSULTAS-SAIDA'
		ITransactionMessageElement txGISSW397_BLOCO_SAIDA = txResponse.getElement("GISSW397-REGISTRO.GISSW397-BLOCO-SAIDA");
		IProcessMessageElement pGISSW397_BLOCO_SAIDA = pResponse;
		Iterator iterGISSW397_CONSULTAS_SAIDA = FWOUtils.trataOcorrenciasPaginacao(response, txGISSW397_BLOCO_SAIDA.getElements("GISSW397-CONSULTAS-SAIDA")).iterator();
		int idxGISSW397_CONSULTAS_SAIDA = FWOUtils.getSize(pGISSW397_BLOCO_SAIDA.getElements("ocorrencias"));

		while (iterGISSW397_CONSULTAS_SAIDA.hasNext()) {
		   ITransactionMessageElement txGISSW397_CONSULTAS_SAIDA = (ITransactionMessageElement) iterGISSW397_CONSULTAS_SAIDA.next();
		   IProcessMessageElement pGISSW397_CONSULTAS_SAIDA = pGISSW397_BLOCO_SAIDA.getElement("ocorrencias", idxGISSW397_CONSULTAS_SAIDA + 1);

		pGISSW397_CONSULTAS_SAIDA.setElementValue("codigoPessoaJuridica", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-CPSSOA-JURID"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("numeroSequencial", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-NSEQ-UND-ORGNZ"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("dataCompetencia", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-DMES-ANO-APURC"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("contaContabil", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-CCTA-CTBIL-TRIBU"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("codigoDependencia", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-CD-DEPENDENCIA"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("codigoPaa", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-CD-PAA"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("descricaoDependencia", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-DEP-DESCR"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("descricaoPa", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-PA-DESCR"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("sinalReceita", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-VRECTA-TRIBU-APURC.GISSW397-S-SINAL"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("valorReceita", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-VRECTA-TRIBU-APURC.GISSW397-S-VALOR"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("sinalTributoApuracao", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-VTRIBT-APURC.GISSW397-S-SINAL"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("valorTributoApuracao", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-VTRIBT-APURC.GISSW397-S-VALOR"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("uf", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-DC-UF"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("municipio", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-DC-MUNICIPIO"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("tragSemTrag", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-TRAG-SEM-TRAG"));
		pGISSW397_CONSULTAS_SAIDA.setElementValue("codMunicipio", txGISSW397_CONSULTAS_SAIDA.getElementValue("GISSW397-S-C-MUN"));
			idxGISSW397_CONSULTAS_SAIDA++;
		}

        
        //Processos de combo nao precisam de restart
        context.getResponse().setMoreData(false);
    }   
}