<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="listarMunicipioForm" name="listarMunicipioForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoAliquotaZeradaBean.codRadioListaMunicipio}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_municipio}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="435px" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
		<br:brPanelGroup >	
				<t:dataTable id="dataTable" value="#{consultarApuracaoAliquotaZeradaBean.listaMunicipio}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px" >
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value="" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{consultarApuracaoAliquotaZeradaBean.listaRadioMunicipio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />
				</t:column>
				  <t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_codigo}" />
				    </f:facet>
				    <br:brOutputText value="#{result.codigo}"/>
				  </t:column>
				  <t:column width="570px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_nome}" />
				    </f:facet>
				    <br:brOutputText value="#{result.nome}"/>
				  </t:column>		
				  	  
				</t:dataTable>	
				
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{consultarApuracaoAliquotaZeradaBean.paginarListaMunicipios}">
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

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="4" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<br:brPanelGroup style="float:left;text-align:left;width:150px"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_voltar}" action="#{consultarApuracaoAliquotaZeradaBean.voltar}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_prosseguir}" action="#{consultarApuracaoAliquotaZeradaBean.voltarComValores}" disabled="true" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>	
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

function habilitarBotoes(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'listarMunicipioForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'listarMunicipioForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}

</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
