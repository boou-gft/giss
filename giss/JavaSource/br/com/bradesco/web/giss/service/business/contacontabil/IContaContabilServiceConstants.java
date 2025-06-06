/*
 * =========================================================================
 * 
 * Client:       Bradesco (BR)
 * Project:      Arquitetura Bradesco Canal Internet
 * Development:  GFT Iberia (http://www.gft.com)
 * -------------------------------------------------------------------------
 * Revision - Last:
 * $Source: d:\cvs\cmmi\projetos/bradescopsw/2017/BRD2017-0112-01/trunk/3-Implementacao/3.1–App/giss/JavaSource/br/com/bradesco/web/giss/service/business/contacontabil/IContaContabilServiceConstants.java,v $
 * $Id: IContaContabilServiceConstants.java,v 1.2 2018/04/06 14:01:44 gmichelini Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revision - History:
 * $Log: IContaContabilServiceConstants.java,v $
 * Revision 1.2  2018/04/06 14:01:44  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:11:50  gmichelini
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

package br.com.bradesco.web.giss.service.business.contacontabil;


/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface de constantes do adaptador: ContaContabil
 * </p>
 * 
 * @comment CÓDIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IContaContabilServiceConstants {

	//Utilizado para Manter Contas Contábeis
	public static final String COD_INCLUSAO = "I";	
	
	public static final String COD_ALTERACAO = "A";
	
	public static final String COD_EXCLUSAO = "E";	
	
	public static final String ORIGEM_LISTA_CONTAS_CONTABEIS_MANTER = "M";
	
	public static final String ORIGEM_LISTA_CONTAS_CONTABEIS_INCLUIR = "I";
	
	public static final String ORIGEM_LISTA_CONTAS_CONTABEIS_HISTORICO = "H";
	
	public static final String ORIGEM_LISTA_CONTAS_CONTABEIS_CONSULTA_TIPO_SERVICO = "C";
	
	//Parâmetros de área de entrada do processo Listar Contas Contábeis	
	public static final int NUMERO_REGISTROS_LISTA_CONTACONTABIL = 0;	
	
	//Quantidade de registros solicitada para o processo de listar contas contábeis 
	public static final int QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONTACONTABIL = 410;
	
	public static final int QUANTIDADE_REGISTROS_SOLICITADA_LISTA_CONTACONTABIL_INC = 350;
	
}

