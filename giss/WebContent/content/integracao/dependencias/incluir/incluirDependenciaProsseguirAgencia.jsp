<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirDependenciaAgenciaForm" name="incluirDependenciaAgenciaForm" >
<h:inputHidden id="hiddenRadioGrid" value="#{dependenciaBean.codListaPesquisarAgencia}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="465px" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup >
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputTextBold styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_lista_agencias}" />
		</br:brPanelGroup >
		
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{dependenciaBean.listaAgencias}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="465px">	
				<t:column width="25px">
					<f:facet name="header">
				      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotaoFinalizar(document.forms[1], this);" id="sor" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{dependenciaBean.listaControleCheckRadio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sor" index="#{result.linha}" />
				</t:column>
			  <t:column width="120px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.resultadoDependenciasNovasAgencia_agencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoDependencia}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="320px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultadoDependenciasNovasAgencia_nome}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricaoDependencia}" style="float:left; margin-left:5 px;" />
			  </t:column>			 
			</t:dataTable>
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
 	<br:brPanelGrid columns="1" width="440px" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"   actionListener="#{dependenciaBean.paginarListaAgencias}" rendered="#{dependenciaBean.listaAgencias != null &&  dependenciaBean.mostraBotoes}">
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
	
	<br:brPanelGrid columns="7" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="7" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<f:verbatim><hr class="lin"> </f:verbatim>	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_voltar}" action="#{dependenciaBean.voltarIncluirDependenciasMunicipios}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="width:470px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	

		<br:brPanelGroup style="text-align:right;width:80px" >
			<br:brCommandButton id="btnProsseguir"    styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_prosseguir}" action="#{dependenciaBean.retornarInformacoesIncluirPreenchido}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>		
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>

<f:verbatim>
<script>

function habilitarBotaoFinalizar(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'incluirDependenciaAgenciaForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'incluirDependenciaAgenciaForm:hiddenRadioGrid'){		
			hidden = form.elements[i];
			hidden.value = radio.value;				
		}		
	}	
}

</script>
 </f:verbatim>
 
</brArq:form>
