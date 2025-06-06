<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="historicoMunicipioConsultarForm" name="historicoMunicipioConsultarForm" >
<h:inputHidden id="hiddenRadio" value="#{historicoMunicipioBean.radioTelaManter}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_municipios_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{historicoMunicipioBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{historicoMunicipioBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{historicoMunicipioBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{historicoMunicipioBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{historicoMunicipioBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{historicoMunicipioBean.carregaListaHistoricoMunicipio}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{historicoMunicipioBean.carregaMunicipios}" >
		<br:brPanelGroup>
			<br:brOutputText value="#{msgs.path_title_incluir_manterTipoIncidencia_resultadoPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" width="700px" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.carregaMunicipios}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{historicoMunicipioBean.listaHistoricoMunicipios}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, 
			alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="700px" >
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{historicoMunicipioBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:1 px;"/>
			  </t:column>
			  <t:column width="370px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}"/>
			  </t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_atualizacao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.atualizacao}" style="float:left; margin-left:15 px;"/>
			  </t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_hora}" />
			    </f:facet>
			    <br:brOutputText value="#{result.hora}" style="float:left; margin-left:15 px;"/>
			  </t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_grid_exclusao}" style="float:left; margin-left:15 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.exclusao}"/>
			  </t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_funcional}" style="float:left; margin-left:15 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.codigoFuncional}"/>
			  </t:column>				  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{historicoMunicipioBean.pesquisarDadosMunicipio}" rendered="#{historicoMunicipioBean.listaControleCheckRadio != null && historicoMunicipioBean.mostraBotoes}">
			
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


	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.carregaMunicipios}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.carregaMunicipios}">	
		<br:brPanelGroup>																																								 
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_municipios_btn_consultar}" action="#{historicoMunicipioBean.consultarHistorico}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
		
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{historicoMunicipioBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>