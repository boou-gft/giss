<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="historicoDependencia" name="historicoDependencia" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historicoDependencia_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
    <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_estado}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.estado}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_municipio}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.municipio}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<a4j:region id="regionRadioParametro">
				<t:selectOneRadio id="params" forceId="true" forceIdIndex="false" layout="spread" value="#{histDependenciaBean.itemParametroAvancar}" >
					<f:selectItems value="#{histDependenciaBean.selectItemParametrosAvancar}" />
					<a4j:support event="onclick" reRender="panelBotoes" limitToList="true" ajaxSingle="true" />
				</t:selectOneRadio>
			</a4j:region>
			<t:dataTable id="dataTable" value="#{histDependenciaBean.listaDependenciasMunicipio}" var="result" rows="50" rowIndexVar="parametroKey"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
			<t:column width="30px" style="height: 20px; padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:radio for=":historicoDependencia:params" index="#{parametroKey}" />
			</t:column>
			  <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historicoDependencia_dependencia}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoUnidadeOrganizacional}" style="height:19px"/>
			  </t:column>
			  <t:column width="250px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historicoDependencia_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricaoUnidadeOrganizacional}" style="margin-left: 5px;"/>
			  </t:column>	
			  <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historicoDependencia_atualizacao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataAtualizacao}"/>
			  </t:column>	
			  <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_hora}" />
			    </f:facet>
			    <br:brOutputText value="#{result.horaAtualizacao}"/>
			  </t:column>	
			  <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historicoDependencia_exclusao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataExclusao}"/>
			  </t:column>
			  <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_funcional}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoFuncional}"/>
			  </t:column>
			  <t:column width="250px" >
			    <f:facet name="header">
			      <br:brOutputText value="TRAG sem TRAG?" />
			    </f:facet>
			    <br:brOutputText value="#{result.tragSemTrag eq 'S' ? 'Sim' : 'Não' }" style="margin-left: 5px;"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller"  for="dataTable" actionListener="#{histDependenciaBean.paginarPesquisaAvancar}">
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
	
	<a4j:outputPanel id="panelBotoes" style="width: 100%; text-align: right" ajaxRendered="true">	
	<br:brPanelGrid columns="2" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup style="width: 100%;text-align:left">
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.historicoDependencia_voltar}" action="conHistoricoDependencias" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	
		<br:brPanelGroup style="width: 100%;text-align:right">
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historicoDependencia_consultar}" action="#{histDependenciaBean.detalharHistroicoDependencia}" disabled="#{empty histDependenciaBean.itemParametroAvancar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	</a4j:outputPanel>
	
</br:brPanelGrid>

</brArq:form>
