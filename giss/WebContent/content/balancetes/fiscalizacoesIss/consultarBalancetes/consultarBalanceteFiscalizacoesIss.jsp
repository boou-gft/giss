<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarBalanceteFiscalizacoesIssForm" name="consultarBalanceteFiscalizacoesIssForm">

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
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>	
			<f:verbatim> <div id="rolagem" style="width:750px;"> </f:verbatim>
			
	    	
	    	<t:dataTable id="dataTable" value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listarPedidoBalancetes}" rowIndexVar="parametroKey" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="1170px">
			 	<t:column width="25px" >
					<f:facet name="header">
			      		<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    	</f:facet>		
					<t:selectOneRadio onclick="habilitarBotaoProsseguir(#{result.codSituacaoPedido});" value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.itemSelecionadoListaPedidoBalancetes}" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listaControlePedidoBalancetes}"/>
					</t:selectOneRadio>
		    		<t:radio for="sor" index="#{parametroKey}" />
				</t:column>
			    
			  	<t:column width="110px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_data_solicitacao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.dataSolicitacao}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="60px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_estado}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descUf}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="160px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descMunicipio}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="90px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_dependencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codDependenciaFormatado}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="190px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_empresa}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descEmpresa}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="100px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_periodo_inicial}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.periodoInicial}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="100px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_periodo_final}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.periodoFinal}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="320px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_status_pesquisa}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descSituacaoPedido}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			</t:dataTable>
			
			
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{consultarBalanceteFiscalizacoesIssBean.paginarListaPedido}" rendered="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listarPedidoBalancetes != null}">
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

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" disabled="#{consultarBalanceteFiscalizacoesIssBean.verificarBotaoProsseguir}" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_prosseguir}" action="#{consultarBalanceteFiscalizacoesIssBean.prosseguir}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

</br:brPanelGrid>

</brArq:form>