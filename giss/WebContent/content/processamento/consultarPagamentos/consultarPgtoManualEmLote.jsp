<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="consultarPgtoManualEmLote" name="consultarPgtoManualEmLote" >
<br:brPanelGrid columns="1" width="750%" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<%-- 
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" width="100%">
		<t:selectOneRadio id="tipoJurosMulta" value="#{pesquisarPagamentoManualBean.codigosSelecionadosRadio}" styleClass="HtmlSelectOneRadioBradesco" >  
			<f:selectItem value="0" itemValue="0" itemLabel="#{msgs.label_iss_gerencial_juros_multa_padrao} " />
			<f:selectItem value="1" itemValue="1"  itemLabel="#{msgs.label_iss_gerencial_juros_multa_individual}" />
		</t:selectOneRadio>
	</br:brPanelGrid>  
	--%>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{pesquisarPagamentoManualBean.codigosSelecionadosTabela}" >
		<f:selectItems value="#{pesquisarPagamentoManualBean.selectItemPgtoLote}" />
	</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll;overflow-X:scroll;height:200;width:750">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>	
			
		<t:dataTable id="dataTable" value="#{pesquisarPagamentoManualBean.dtoPgtoLote.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="1878px" >			
			  <t:column width="8px" >
			  
		    	<t:checkbox index="#{indexLista}" for=":consultarPgtoManualEmLote:checkboxRegistro"/>
			  </t:column>	
			  <t:column width="350px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.empresa} - #{result.descEmpresa}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column> 
			  <t:column width="200px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_servico_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codProduto} - #{result.descricaoProd}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column> 
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.competencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="350px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio} - #{result.municipio}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="200px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_base_calc_iss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.valorDeIss}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="200px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_iss_pgto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.valorIssPgto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_banco}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.banco}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			   <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_agencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.agencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			   <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_conta}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.conta}-#{result.digitoConta}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			 <%--  
			   <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_multa_juros}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.jurosMulta}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			 --%> 
			</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>		
	</t:div>	
</br:brPanelGrid>

<f:verbatim><hr class="lin"> </f:verbatim>

<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
	<br:brPanelGroup>
		<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"
			value="#{msgs.botao_voltar}" action="#{pesquisarPagamentoManualBean.voltar}" style="float:left">
			<brArq:submitCheckClient/>
		</br:brCommandButton>
		<br:brCommandButton id="btnPlanilhaElet" styleClass="HtmlCommandButtonBradesco"
			value="#{msgs.btn_exportar_planilha_eletronica}" style="float:right;margin-left:5 px" action="#{pesquisarPagamentoManualBean.imprimirPlanilhaLote}">
			<brArq:submitCheckClient/>
		</br:brCommandButton>
		<br:brCommandButton id="btnAgendar" styleClass="HtmlCommandButtonBradesco"
			value="#{msgs.btn_iss_gerencial_agendar}" style="float:right" action="#{pesquisarPagamentoManualBean.agendarPgtoLote}">
			<brArq:submitCheckClient/>
		</br:brCommandButton>
	</br:brPanelGroup>
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>