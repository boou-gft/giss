<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="solicitarReprocessamentoPorDependenciaProsseguirForm" name="solicitarReprocessamentoPorDependenciaProsseguirForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_processamento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGroup style="height: 20px;" />
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
	<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_estado}:" />
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{reprocessamentoPorDependenciaBean.estado}" />

			<br:brPanelGroup style="width: 135px;" />

			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_municipio}:" />
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{reprocessamentoPorDependenciaBean.municipio}" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	<br:brPanelGroup style="height: 10px;" />
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
	<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_data_inicial}:" />
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{reprocessamentoPorDependenciaBean.periodoInicial}" />

			<br:brPanelGroup style="width: 120px;" />

			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_data_final}:" />
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"  value="#{reprocessamentoPorDependenciaBean.periodoFinal}" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>	
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_resultado_pesquisa}:"/>
			</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
		<t:dataTable id="dataTable" value="#{reprocessamentoPorDependenciaBean.listaDependenciaProsseguir}" var="tabelaDependencia" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" rowIndexVar="dependenciaRowKey">	
			<t:column width="30px">
				<f:facet name="header">
					<t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{reprocessamentoPorDependenciaBean.checkTodos}">
						<a4j:support event="onclick" action="#{reprocessamentoPorDependenciaBean.atribuirDependenciaTodos}" reRender="dataTable, panelBotoes" />
					</t:selectBooleanCheckbox>
		    	</f:facet>
		    	<t:selectBooleanCheckbox id="sor" styleClass="HtmlSelectOneRadioBradesco" value="#{tabelaDependencia.radio}">
					<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaControleCheckRadio}"/>
					<a4j:support event="onclick" action="#{reprocessamentoPorDependenciaBean.atribuirDependencia}" reRender="dataTable, panelBotoes">
						<a4j:actionparam name="dependenciaRowParam" value="#{dependenciaRowKey}" assignTo="#{reprocessamentoPorDependenciaBean.dependenciaLinhaSelecionada}"/>
					</a4j:support>
				</t:selectBooleanCheckbox>	
			</t:column>	
			<t:column width="200px">
				<f:facet name="header" >
					  <br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_dependencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
				  <br:brOutputText value="#{tabelaDependencia.dependencia}" style="float:left; margin-left:5 px;"/>			
			</t:column>
			<t:column width="520px">
				<f:facet name="header">
					  <br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>		
				 <br:brOutputText value="#{tabelaDependencia.municipio}" style="float:left; margin-left:5 px;"/>
			</t:column>			
		</t:dataTable>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup >		
			    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{reprocessamentoPorDependenciaBean.paginarListaDependencia}" rendered="#{reprocessamentoPorDependenciaBean.listaDependenciaProsseguir != null}" >
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

	<br:brPanelGrid id="panelBotoes" columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_voltar}" action="#{reprocessamentoPorDependenciaBean.voltar}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brPanelGroup style="width: 613px;" />
	
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_prosseguir}" action="#{reprocessamentoPorDependenciaBean.prosseguirContaMunicipio}" disabled="#{empty reprocessamentoPorDependenciaBean.listaDependenciasSelecionadas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
</br:brPanelGrid>

<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>