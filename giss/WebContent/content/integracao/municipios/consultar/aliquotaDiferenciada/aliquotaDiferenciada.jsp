<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="aliquotaDiferenciadaForm" name="aliquotaDiferenciadaForm" >
<h:inputHidden id="hiddenRadio" value="#{aliquotaDiferenciadaBean.radioTelaAliquotaDiferenciada}"/>


<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>			
		</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{aliquotaDiferenciadaBean.estadoFiltro}" onchange="javascript:habilitaBotaoProsseguir(document.forms[1]);">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{aliquotaDiferenciadaBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{aliquotaDiferenciadaBean.codMunicipioFiltroNovos}" onkeypress="return validaTecla('0123456789', event);"/>
		
	</br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguirPesquisa" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{aliquotaDiferenciadaBean.carregaListaAliquotaDiferenciada}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="550px" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{aliquotaDiferenciadaBean.listaAliquotaDif}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="550px" >
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotoesAliquotaDiferenciada(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{aliquotaDiferenciadaBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="80px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:1 px;"/>
			  </t:column>
			  <t:column width="470px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.aliquota_diferenciada_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="550px" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{aliquotaDiferenciadaBean.pesquisarAliquota}" rendered="#{aliquotaDiferenciadaBean.listaAliquotaDif != null}">

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
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.aliquota_diferenciada_btn_prosseguir}" action="#{aliquotaDiferenciadaBean.prosseguir}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>


<brArq:validatorScript functionName="validateForm"/>
</brArq:form>



