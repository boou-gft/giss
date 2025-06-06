<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<rich:modalPanel id="buscaMunicipio" zindex="2000" autosized="true"  showWhenRendered="#{BuscaMunicipioBean.exibir}" rendered="#{BuscaMunicipioBean.exibir}">
	<brArq:form id="formBuscaMunicipio">
		<t:selectOneRadio id="buscaMunicipioSelecionado" value="#{BuscaMunicipioBean.selecionado}" layout="spread">
			<f:selectItems value="#{BuscaMunicipioBean.selectItems}"/>
		</t:selectOneRadio>
		<br:brPanelGrid columns="1" width="600px" border="0">
			<t:dataTable var="valor" value="#{BuscaMunicipioBean.data}" align="left" rowIndexVar="index" width="100%" rows="10" id="gridBuscaMunicipio"
			rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda,alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" cellspacing="1" cellpadding="0" >
				<t:column width="1px;">
			    	<t:radio index="#{index}" for=":formBuscaMunicipio:buscaMunicipioSelecionado"/>
				</t:column>
				<t:column width="180px">
					<f:facet name="header" >
	    	        	<br:brOutputLabelTitle value="#{msgs.geral_codigo_municipio}" />
					</f:facet>
					<br:brOutputText value="#{valor.codigoMunicipio}"/>
				</t:column>
				<t:column>
					<f:facet name="header" >
						<br:brOutputLabelTitle value="#{msgs.geral_municipio}" />
					</f:facet>
					<br:brOutputText value="#{valor.descricaoMuncipio}"/>
				</t:column>		
				<t:column>
					<f:facet name="header" >
						<br:brOutputLabelTitle value="#{msgs.geral_uf}" />
					</f:facet>
					<br:brOutputText value="#{valor.uf}"/>
				</t:column>		
			</t:dataTable>
			
			<br:brPanelGrid columns="1" width="520px" style="text-align:center" cellpadding="0" cellspacing="0">	
				<br:brPanelGroup>
				    <brArq:pdcDataScroller id="dataScrollerBuscaMuni" for="gridBuscaMunicipio">
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
		</br:brPanelGrid>
		<br:brPanelGrid columns="2" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
			<br:brPanelGroup style="text-align:left">
				<br:brCommandButton id="buttonPesquisaMunicipioCancelar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_cancelar}" action="#{BuscaMunicipioBean.cancelar}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
			</br:brPanelGroup>
		
			<br:brPanelGroup style="text-align:right">
				<br:brCommandButton id="buttonPesquisaMunicipioSelecionar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_confirmar}" action="#{BuscaMunicipioBean.selecionar}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
		
	</brArq:form>
</rich:modalPanel>