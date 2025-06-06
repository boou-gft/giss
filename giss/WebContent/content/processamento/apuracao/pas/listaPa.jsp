<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="listaPaForm" name="listaPaForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{listaParcialPaBean.lista}"
							var="result" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="100%">
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_cosif}" />
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_razao}" />
								</f:facet>
								<br:brOutputText value="#{result.razao}" />
							</t:column>
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_conta}" />
								</f:facet>
								<br:brOutputText value="#{result.conta}" />
							</t:column>
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_codigo_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.codigoPa}" />
							</t:column>
							
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_nome_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.nomePa}" />
							</t:column>
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_municipio_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.municipioPa}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_uf_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.ufPa}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_nome_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.agenciaRelacionamento}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_municipio_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.municipioAgRelacionamento}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_uf_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.ufAgRelacionamento}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_iss}" />
								</f:facet>
								<br:brOutputText value="#{result.iss}" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	
	<br:brPanelGroup>
		<f:verbatim><hr class="lin"> </f:verbatim>
	</br:brPanelGroup>
		
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px">
				<br:brCommandButton id="botao_voltarII" 
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_voltar}" action="#{listaParcialPaBean.voltar}"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:500px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100%" >
		<br:brPanelGrid columns="3">
			<br:brCommandButton id="botao_exportar_planilha_eletronica"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_exportar_planilha_eletronica}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
			<br:brCommandButton id="botao_exportar_txt"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_exportar_txt}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
			<br:brCommandButton id="botao_impressao_pdf"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_impressao_pdf}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
		</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
</br:brPanelGrid>		
  
 <f:verbatim> 
	
<script language="javascript">
	

</script> 
</f:verbatim> 
  
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
