<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="pgtosNaoGeradosForm" name="pgtosNaoGeradosForm">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<t:div  style="overflow-Y:scroll;overflow-X:scroll; height:275;width:750;display:block">
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>	
					
		<t:dataTable id="dataTable" value="#{listarPgtosNaoGeradosBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="1400px" >			
			  
			  <t:column width="70px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header" >
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.competencia}" />
			  </t:column>
			  <t:column width="200px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header" >
			      <h:outputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.empresa} - #{result.descEmpresa}" />
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.produto}" />
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_doiss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.valorProvisionado}" />
			  </t:column>
		<%-- 
			  <t:column width="110px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_base_iss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.baseIss}" />
			  </t:column>
		--%>
			  <t:column width="230px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio} - #{result.municipio}"/>
			  </t:column>
			</t:dataTable>	
			
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="#{listarPgtosNaoGeradosBean.voltar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0" style="text-align:right">
				<br:brPanelGroup>
					<%-- 
					<br:brCommandButton id="btnExportarTxt" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_iss_gerencial_exportar_txt}" actionListener="#{listarPgtosNaoGeradosBean.   }" style="margin-right:5px" onclick="desbloqTela();">
						<brArq:submitCheckClient/>
					</br:brCommandButton>
					--%>
					<br:brCommandButton id="btnPlanilhaEletronica" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_exportar_planilha_eletronica}" action="#{listarPgtosNaoGeradosBean.imprimirPlanilha}" onclick="desbloquearTela();">
						<brArq:submitCheckClient/>
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>
	</br:brPanelGrid>
	
	
</br:brPanelGrid>
	
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>