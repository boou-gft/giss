<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="alterarTipoServicoForm" name="alterarTipoServicoForm" >
<h:inputHidden id="hiddenRadioGrid" value="#{tipoServicoBean.codListaPesquisar}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  rendered="#{tipoServicoBean.carregaFaixas}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{tipoServicoBean.carregaFaixas}">	
		<br:brPanelGroup >	
			<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
	    <t:dataTable id="dataTable" value="#{tipoServicoBean.listaGridTipoServico}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">
			 <t:column width="25px" >
				<f:facet name="header">
			      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotaoProsseguir(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{tipoServicoBean.listaControle}"/>
				</t:selectOneRadio>
		    	<t:radio for="sor" index="#{result.numeroRegistro}"  />
			</t:column>
			    
			  <t:column width="50px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_tipo_servico}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px; "  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}"  style="margin-left:6 px;float:right ;"/>
			  </t:column>
			  <t:column width="500px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.grid_descricao_tipo_servico}"style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="margin-left:6 px;float:left;"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_dt_atualizacao_tipo_servico}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtAtualizacao}" style="margin-left:12 px;float:left;" />
			  </t:column>		
		</t:dataTable>	
		<f:verbatim>  </f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{tipoServicoBean.listaGridTipoServico!= null && tipoServicoBean.mostraBotoes}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{tipoServicoBean.pesquisarManter}" >
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

		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{tipoServicoBean.carregaFaixas}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_prosseguir_tipo_servico}" action="#{tipoServicoBean.prosseguirResultado}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>

function habilitarBotaoProsseguir(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'alterarTipoServicoForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'alterarTipoServicoForm:hiddenRadioGrid'){		
			hidden = form.elements[i];
			hidden.value = radio.value;		
		}		
	}	
}

</script>
 </f:verbatim>
</brArq:form>