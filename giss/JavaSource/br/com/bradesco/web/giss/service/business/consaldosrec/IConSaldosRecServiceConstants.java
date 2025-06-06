/*
 * =========================================================================
 * 
 * Client:       Bradesco (BR)
 * Project:      Arquitetura Bradesco Canal Internet
 * Development:  GFT Iberia (http://www.gft.com)
 * -------------------------------------------------------------------------
 * Revision - Last:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/consaldosrec/IConSaldosRecServiceConstants.java,v $
 * $Id: IConSaldosRecServiceConstants.java,v 1.1 2017/04/11 14:13:12 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revision - History:
 * $Log: IConSaldosRecServiceConstants.java,v $
 * Revision 1.1  2017/04/11 14:13:12  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:01  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:15:30  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.consaldosrec;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface de constantes do adaptador: ConSaldosRec
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IConSaldosRecServiceConstants {

		public static final int QUANTIDADE_REGISTROS_SOLICITADA_LISTA_ESTADOS = 28;
		
		public static final int CODIGO_UNIDADE_FEDERATIVA = 0;
		
		public static final int QUANTIDADE_REGISTROS_SOLICITADA_LISTA_MUNICIPIOS = 50;
		
		public static final int QUANTIDADE_REGISTROS_SOLICITADA_LISTA_DEPENDENCIAS = 50;
		
		public static final int NUMERO_REGISTROS_PAGINA_LISTA_MUNICIPIOS = 50;
		
		public static final int NUMERO_REGISTROS_PAGINA_LISTA_DEPENDENCIAS = 50;
		
		public static final String SITUACAO_PENDENTE_NAO_ENVIADO_1 = "Pendente não enviado";
		public static final String SITUACAO_INDEVIDO_NAO_ENVIADO_2 = "Indevido não Enviado";
		public static final String SITUACAO_PENDENTES_ENVIADOS_3 = "Pendentes Enviados";
		public static final String SITUACAO_INDEVIDO_ENVIADO_4 = "Indevido Enviado";
		public static final String SITUACAO_ENVIADO_5 = "Enviado";
		
		public static final String FORMA_PAGAMENTO_ANTECIPA = "Antecipa";
		public static final String FORMA_PAGAMENTO_PRORROGA = "Prorroga";
		
		public static final String INDICADOR_DIA_UTIL_SIM = "Sim";
		public static final String INDICADOR_DIA_UTIL_NAO = "Não";

		public static final String APLICACAO_ORIGEM_ENVIO_MENSAGEM = "GISS";

		public static final String NOME_LOGICO_ENVIO_MENSAGEM = "GISS.EM.RECOLHISS.CONSULTA.SALDO.INDEVIDO";
}

