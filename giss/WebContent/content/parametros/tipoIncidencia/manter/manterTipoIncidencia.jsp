<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterTipoIncidenciaForm" name="manterTipoIncidenciaForm" >
<h:inputHidden id="hiddenRadio" value="#{tipoIncidenciaBean.codListaPesquisar}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_incidencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{tipoIncidenciaBean.carregaFaixas}">	
		<br:brPanelGroup >	
			<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
	    <t:dataTable id="dataTable" value="#{tipoIncidenciaBean.listaGridTipoIncidencia}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">
			 <t:column width="25px" >
				<f:facet name="header">
			      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotaoProsseguir(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{tipoIncidenciaBean.listaControle}"/>
				</t:selectOneRadio>
		    	<t:radio for="sor" index="#{result.numeroRegistro}"  />
			</t:column>
			    
			  <t:column width="50px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_tipo_incidencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}"  style="margin-left:6 px;float:left;"/>
			  </t:column>
			  <t:column width="500px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.grid_descricao_incidencia}"style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="margin-left:6 px;float:left;"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_atualizacao_incidencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtAtualizacao}" style="margin-left:6 px;float:left;" />
			  </t:column>		
		</t:dataTable>	
		<f:verbatim>  </f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{tipoIncidenciaBean.carregaFaixas}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{tipoIncidenciaBean.pesquisar}" rendered="#{tipoIncidenciaBean.listaGridTipoIncidencia!= null && tipoIncidenciaBean.mostraBotoes}">
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


	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnAlterar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_alterar_tipo_incidencia}" action="#{tipoIncidenciaBean.prosseguirResultadoAlteracao}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnExcluir" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_excluir_tipo_incidencia}" action="#{tipoIncidenciaBean.prosseguirResultadoExclusao}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnConsultar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_consultar_tipo_incidencia}" action="#{tipoIncidenciaBean.prosseguirResultadoConsulta}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
	</br:brPanelGrid>		
		
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>

function habilitarBotaoProsseguir(form, radio) {
	document.getElementById("manterTipoIncidenciaForm:btnAlterar").disabled=false;
	document.getElementById("manterTipoIncidenciaForm:btnExcluir").disabled=false;
	document.getElementById("manterTipoIncidenciaForm:btnConsultar").disabled=false;
	document.getElementById("manterTipoIncidenciaForm:hiddenRadio").value = radio.value;
}

</script>
 </f:verbatim>
</brArq:form>