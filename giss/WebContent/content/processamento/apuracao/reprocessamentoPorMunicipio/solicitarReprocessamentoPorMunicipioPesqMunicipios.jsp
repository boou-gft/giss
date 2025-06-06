<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="reprocesamentoPorMunicipioPesqMunicipioForm" name="reprocesamentoPorMunicipioPesqMunicipioForm" >
<h:inputHidden id="hiddenRadio" value="#{reprocessamentoPorMunicipioBean.filtroMunicipio}"/>	
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">	
	
	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.apuracao_reprocessamento_municipio_municipios}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">			
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{reprocessamentoPorMunicipioBean.listaMunicipios}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="100%" rowIndexVar="radioKey">	
			
			<t:column width="25px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
				<br:brOutputText value=""  escape="false" />
				</f:facet>
		    	<t:selectOneRadio onclick="javascript:radioGridPesquisaMunicipio(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaRadioPesqMunicipio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{radioKey}"  />
			</t:column>
			<t:column width="150px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			    <br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_codigo}" />
			    </f:facet>
				<br:brOutputText value="#{result.codigo}" style="padding-right:5px; padding-left:5px; float:left" />
			</t:column>
			<t:column width="350px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			    <br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_nome}" />
			    </f:facet>
				<br:brOutputText value="#{result.municipio}" style="padding-right:5px; padding-left:5px; float:left" />
			</t:column>			 		  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	 <br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{reprocessamentoPorMunicipioBean.pesquisarMunicipiosPaginacao}">
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
	
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_voltar}" action="#{reprocessamentoPorMunicipioBean.voltarPesquisaMunicipio}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 100%; text-align: right">
			<br:brCommandButton disabled="true" onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" 
					value="#{msgs.apuracao_reprocessamento_municipio_prosseguir}" action="#{reprocessamentoPorMunicipioBean.prosseguirPesqMunicipios}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
<script language="javascript">
function radioGridPesquisaMunicipio(form, radio){	
	var hidden;
	var botaoProsseguir;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'reprocesamentoPorMunicipioPesqMunicipioForm:btnProsseguir'){
			botaoProsseguir = form.elements[i];
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'reprocesamentoPorMunicipioPesqMunicipioForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;		
		}			
	}	
		if ((hidden.value != '')){
			botaoProsseguir.disabled = false;
	}
}
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>