<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="dependenciasEncerradasProsseguirForm" name="dependenciasEncerradasProsseguirForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
  	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.dependencias_encerradas_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.dependencias_encerradas_mes_referencia}:"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="3" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 
	    <br:brPanelGroup>	
		    <br:brInputText styleClass="HtmlInputTextBradesco" value="#{dependeciasEncerradasBean.mesFiltro}" size="4" maxlength="2" readonly="true" id="txtMes">
		    </br:brInputText>	
		</br:brPanelGroup>					

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-left:5px;margin-right:5px;">
			 <br:brPanelGroup>	
			 	<f:verbatim>/</f:verbatim>
 			</br:brPanelGroup>		
		</br:brPanelGrid>
		
		<br:brPanelGroup>						
		    <br:brInputText styleClass="HtmlInputTextBradesco" value="#{dependeciasEncerradasBean.anoFiltro}" readonly="true" size="8" maxlength="4" id="txtAno">
		    </br:brInputText>	
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">	
			<f:verbatim> <div id="rolagem" style="width:750px; overflow-x:scroll"></f:verbatim> 
			<t:dataTable id="dataTable" value="#{dependeciasEncerradasBean.listaPesquisa}" var="result" 
				rows="50" cellspacing="1" cellpadding="0" 
				rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, 
				alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda" 
				headerClass="tabela_celula_destaque_acentuado" width="1000px">
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
					<%--<t:selectOneRadio onclick="javascript:radioGridPesquisa(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{dependeciasEncerradasBean.listaControlePesquisa}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />--%>
				</t:column>
				  <t:column width="100px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_dependencia}" />
				    </f:facet>
				    <br:brOutputText value="#{result.dependencia}"/>
				  </t:column>
				  <t:column width="250px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_descricao}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.descricao}"/>
				  </t:column>
				  <t:column width="300px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_municipio}"/>
				    </f:facet>
				    <br:brOutputText value="#{result.municipio}" />
				  </t:column>
				  <t:column width="50px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_uf}" /> 
				    </f:facet>
				    <br:brOutputText value="#{result.uf}" />
				  </t:column>
				  <t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_atualizacao}" />
				    </f:facet>
				    <br:brOutputText value="#{result.atualizacao}" />
				  </t:column>
				  <t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_exclusao}" />
				    </f:facet>
				    <br:brOutputText value="#{result.exclusao}" />
				  </t:column>
				</t:dataTable>	
				<f:verbatim>  </f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	
		
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	 
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.dependencias_encerradas_btn_voltar}" action="#{dependeciasEncerradasBean.voltarPesquisar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:450px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:150px" >
			<br:brCommandButton id="btnProsseguir"  styleClass="HtmlCommandButtonBradesco" value="#{msgs.dependencias_encerradas_btn_consultar}" action="#{dependeciasEncerradasBean.consultarDependencia}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid> 
 
  </br:brPanelGrid>
  
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
