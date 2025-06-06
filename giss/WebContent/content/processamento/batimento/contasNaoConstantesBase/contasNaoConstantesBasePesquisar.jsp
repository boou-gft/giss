<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="contasNaoConstBasePesquisarForm" name="contasNaoConstBasePesquisarForm">

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.contas_nao_constantes_na_base_informacoes_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contas_nao_constantes_na_base_competencia}: "/>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contasNaoConstantesBaseBean.competencia}"/>
			</br:brPanelGroup>
				
		</br:brPanelGrid>
	
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{contasNaoConstantesBaseBean.mostraBotaoProsseguir}">	
			<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.contas_nao_constantes_na_base_prosseguir}" action="#{contasNaoConstantesBaseBean.prosseguir}" disabled="false">
					<brArq:submitCheckClient/>
				</br:brCommandButton>			
			</br:brPanelGroup>		
		</br:brPanelGrid>
		
		
		<br:brPanelGrid columns="1" style="margin-top:10px" cellpadding="0" cellspacing="0" rendered="#{contasNaoConstantesBaseBean.mostraTable}">
			<br:brPanelGroup>	
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_saldos_divergentes_resultado_pesquisa}:"/>
			</br:brPanelGroup>
		
			<br:brPanelGroup>
				<t:dataTable id="dataTable" value="#{contasNaoConstantesBaseBean.listaContasNaoConstantesBase}" var="result" 
					rows="50" cellspacing="1" cellpadding="0" 
					rowClasses="tabela_celula_normal, tabela_celula_destaque" 
					columnClasses="alinhamento_direita, alinhamento_esquerda" 
					headerClass="tabela_celula_destaque_acentuado" width="750px">
					
					<t:column width="100px" style="padding-right:5px; padding-left:5px; height:23px; float:center;">
						<f:facet name="header">
						  <br:brOutputText value="#{msgs.contas_nao_constantes_na_base_conta}" />
						</f:facet>
						<br:brOutputText value="#{result.conta}" style="float:left; margin-left:5 px;"/>
					</t:column>
					
					<t:column width="650px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
						  <br:brOutputText value="#{msgs.contas_nao_constantes_na_base_descricao}"  />
						</f:facet>
						<br:brOutputText value="#{result.descricao}" />
					</t:column>
				</t:dataTable>	
			</br:brPanelGroup>
			<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{contasNaoConstantesBaseBean.paginarContasNaoConstantesnaBase}"  rendered="#{contasNaoConstantesBaseBean.listaContasNaoConstantesBase != null && contasNaoConstantesBaseBean.mostraBotoes}">			
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
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{contasNaoConstantesBaseBean.mostraBotoes}">
			<br:brPanelGroup>
				<f:verbatim><hr class="lin"></f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{contasNaoConstantesBaseBean.mostraBotoes}">	
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoparcial_botao_voltar}" action="#{contasNaoConstantesBaseBean.inicializaContasNaoConstantesBase}">
				<brArq:submitCheckClient/>
				</br:brCommandButton>			
			</br:brPanelGroup>				
		</br:brPanelGrid>
	</br:brPanelGrid>
</brArq:form>