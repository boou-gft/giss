<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="apuracaoRepForm">

	<h:inputHidden id="hiddenMunicipio" value="#{apuracaoRepBean.radioMunicipio}"/>

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup  style = "height:30">
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracao_reprocessamento_info_reprocessamento}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
  	    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup >
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_solicitacao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataSolicitacao}" >
				  <f:converter converterId="dateBrazillianConverter"/>
				     </br:brOutputText> 
			</br:brPanelGroup>
		
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_processamento}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataProcessamento}"/>
				</br:brPanelGroup>
		
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_periodo}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataInicioApuracao}">
					     <f:converter converterId="competenciaConverter"/>
				     </br:brOutputText> 
				     <br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="à" style="margin-right: 12" />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataFimApuracao}">
					<f:converter converterId="competenciaConverter"/>
				     </br:brOutputText> 
				</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0">
			<br:brPanelGroup >
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.estado}" >
				</br:brOutputText> 
			</br:brPanelGroup>
		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_competencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.dataCompetenciaSaida}"/>
			</br:brPanelGroup>
		
			
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" width="100%" style="margin-top:11px;" cellpadding="0" cellspacing="0" rendered="#{apuracaoRepBean.mostraMunicipios}" >
			<br:brPanelGroup>
				<f:verbatim><hr class="lin"> </f:verbatim>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" cellpadding="0" style="margin-top:6px;"cellspacing="0" rendered="#{apuracaoRepBean.mostraMunicipios}">
		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio}:" />
			</br:brPanelGroup>			
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{apuracaoRepBean.mostraMunicipios}">	
			<br:brPanelGroup >	
				<t:dataTable id="dataTable" value="#{apuracaoRepBean.listaMunicipio}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px" >
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value="" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{apuracaoRepBean.listaCtrlMunicipio}"/>
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
	
		
		<br:brPanelGrid columns="1" width="650px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{apuracaoRepBean.mostraMunicipios}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{apuracaoRepBean.paginarMunicipio}">
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
	
		<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup style="text-align:left;width:150px"  >
				<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_voltar}" action="#{apuracaoRepBean.voltarProsseguir}" >	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
			<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>	
			<br:brPanelGroup style="text-align:right;width:200px" >
				<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_consultar}" action="#{apuracaoRepBean.consultaDetalhada}" disabled="true">	
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
			if (form.elements[i].id == 'apuracaoRepForm:btnConsultar'){
				form.elements[i].disabled=false;
			}
			
			if (form.elements[i].id == 'apuracaoRepForm:hiddenMunicipio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
		}	
	}
</script>
</f:verbatim>
</brArq:form>