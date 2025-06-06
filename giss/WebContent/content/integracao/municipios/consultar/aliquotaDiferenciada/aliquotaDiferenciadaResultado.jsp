<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="aliquotaDiferenciadaResultadoForm" name="aliquotaDiferenciadaResultadoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" > 
	  <br:brPanelGroup> 
		</br:brPanelGroup> 
  	</br:brPanelGrid>	    		
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacoes_municipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.aliquota_diferenciada_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaDiferenciadaBean.codigo}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.aliquota_diferenciada_label_municipio}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaDiferenciadaBean.descricao}" />
		</br:brPanelGroup>	      
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
		
	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">	
		<t:dataTable id="dataTable" value="#{aliquotaDiferenciadaBean.listaAliquotaResultado}" var="result" 
			rows="50" cellspacing="1" cellpadding="0" 
			rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_direita, alinhamento_esquerda, alinhamento_direita, 
			alinhamento_direita, alinhamento_direita" 
			headerClass="tabela_celula_destaque_acentuado" width="800px" >			
			  <t:column width="150px" style="padding-right:5px; padding-left:5px; height:23px ">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cosif}" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}"/>
			  </t:column>			
			  <t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_razao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.razao}"/>
			  </t:column>
			  <t:column width="150px" style="padding-right:5px; padding-left:5px; height:23px ">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_conta}" />
			    </f:facet>
			    <br:brOutputText value="#{result.conta}"/>
			  </t:column>	
			  <t:column width="470px" style="padding-right:5px; padding-left:5px;text-align:left">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_descricao}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.descricaoConta}"/>
			  </t:column>
			  <t:column width="60px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_item}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.item}" />
			  </t:column>
			   <t:column width="80px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_padrao}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.padrao}" />
			  </t:column>
			   <t:column width="80px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_diferenciada}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.diferenciada}" />
			  </t:column>			  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{aliquotaDiferenciadaBean.pesquisar}">
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
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_voltar}" action="#{aliquotaDiferenciadaBean.voltar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>
	</br:brPanelGrid>
 
    
    <br:brPanelGrid columns="1" style="height:400px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
    
  </br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm"/>
 </brArq:form>
