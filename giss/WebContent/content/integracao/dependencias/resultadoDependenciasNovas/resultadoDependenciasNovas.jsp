<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="resultadoDependenciasNovasForm" name="resultadoDependenciasNovasForm" >
<h:inputHidden id="hiddenRadioGrid" value="#{dependenciaBean.codListaPesquisar}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
		</br:brPanelGroup>
		
		<br:brSelectOneMenu id="empresa" value="#{dependenciaBean.indiceComboEmpresaFiltro}">
			<f:selectItems value="#{dependenciaBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{dependenciaBean.codDepFiltro}" onkeypress="return validaTecla('0123456789', event);"/>
		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguirPesquisa" style="cursor:hand" styleClass="HtmlCommandButtonBradesco"   value="#{msgs.mantercontacontabil_btn_pesquisar}" actionListener="#{dependenciaBean.carregarListaMunicipiosNovos}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{dependenciaBean.mostraDependencias}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{dependenciaBean.listaDependenciasNovas}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">	
				<t:column width="30px" style="height: 20px;">
					<f:facet name="header">
			      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotaoProsseguir(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{dependenciaBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sor" index="#{result.numeroRegistro}" rendered="#{result.codigo != '0'}" />
				</t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.resultadoDependenciasNovas_dependencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="280px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultadoDependenciasNovas_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="float:left; margin-left:5 px;" />
			  </t:column>
			  <t:column width="280px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.resultadoDependenciasNovas_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.municipio}" style="float:left; margin-left:5 px;" />
			  </t:column>
			  <t:column width="60px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.resultadoDependenciasNovas_UF}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.estado}"  style="float:left; margin-left:5 px;" />
			  </t:column>			  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{dependenciaBean.listaDependenciasNovas != null && dependenciaBean.mostraBotoes}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{dependenciaBean.paginarDependenciasNovas}" >
			  <f:facet name="previous">
			    <brArq:pdcCommandButton id="anterior"
			      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
			      value="#{msgs.label_anterior}" title="#{msgs.label_anterior}"/>
			  </f:facet>
			  <f:facet name="next">
			    <brArq:pdcCommandButton id="proxima"
			      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
			      value="#{msgs.label_proxima}" title="#{msgs.label_proxima}"/>
			  </f:facet>
			</brArq:pdcDataScroller> 
		</br:brPanelGroup>
		
	</br:brPanelGrid>				

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >		¨
	<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovas_prosseguir}" action="#{dependenciaBean.prosseguirDependenciasNovas}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>				
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
<script>

function habilitarBotaoProsseguir(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'resultadoDependenciasNovasForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'resultadoDependenciasNovasForm:hiddenRadioGrid'){		
			hidden = form.elements[i];
			hidden.value = radio.value;				
		}		
	}	
}

</script>
 </f:verbatim>

<brArq:validatorScript functionName="validateForm"/>

</brArq:form>
