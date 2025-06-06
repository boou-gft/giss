
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="resultadoMunicipiosNovosRecolhimento" name="resultadoMunicipiosNovosRecolhimento" >
<h:inputHidden id="hiddenRadio" value="#{resultMunicNovoBean.codListaPesquisaRadioAgencia}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.manter_dependencia_lista_agencias}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="525px" cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.mostraTableAgencia}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{resultMunicNovoBean.agenciaMunicipiosNovosDTO}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="525px" >		
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value=""  escape="false" />
			    </f:facet>		
			    
			    <t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{resultMunicNovoBean.listaControlePesquisaDependenciaMunicipio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
				
			</t:column>
			
			<t:column width="150px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultado_municipios_novos_recolhimento_agencia}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.agencia}" style="padding-right:5px; padding-left:5px; float:left;"/>
			</t:column>
			
			  <t:column width="470px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultado_municipios_novos_recolhimento_nome}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}" style="padding-right:5px; padding-left:5px; float:left;"/>
			  </t:column>			  
			
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="525px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.mostraTableAgencia}" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" 
		            actionListener="#{resultMunicNovoBean.pesquisarMunicipioRecolhimento}" rendered="#{resultMunicNovoBean.mostraBotoesListaAgencia}">

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
	

	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.resultado_municipios_novos_incluir_btn_voltar}" 
					action="#{resultMunicNovoBean.voltarNovoMunicipio}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:600px">
		</br:brPanelGroup>		
		
		<br:brPanelGroup >
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" 
					value="#{msgs.resultado_municipios_novos_incluir_btn_prosseguir}" action="#{resultMunicNovoBean.prosseguirRecolhimento}" onclick="javascript: return validateForm(document.forms[1]);" disabled="true" rendered="#{resultMunicNovoBean.mostraTableAgencia}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>

<script language="javascript">
	
	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'resultadoMunicipiosNovosRecolhimento:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'resultadoMunicipiosNovosRecolhimento:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
 	function validaEstado(form, msgestado){	
		var required = 'T';		
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'resultadoMunicipiosNovosRecolhimento:estadoFiltro'){
				if (form.elements[i].value == ''){
					required = 'F';
					alert(required);
				}
			}
				
			if (form.elements[i].id == 'resultadoMunicipiosNovosRecolhimento:hiddenObrigatoriedade'){		
				hidden = form.elements[i];
			}
			
		}	
		
		if (required == 'F'){
			alert(msgestado);
			hidden.value = 'F';
		}else{
			hidden.value = 'T';
		}
		

		
		
	}
	

</script>
</f:verbatim>


<brArq:validatorScript functionName="validateForm"/></brArq:form>
