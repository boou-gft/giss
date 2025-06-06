<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="depConsultarApuracaoAposFechamentoForm" name="depConsultarApuracaoAposFechamentoForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoAposFechamentoBean.radioTela}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="1">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_data_processamento}:" />
		</br:brPanelGroup>	
			
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.dataProcessamento}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<f:verbatim> <br> </f:verbatim> 
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_resultado_pesquisa}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

		<t:div style="height: 200px; overflow: auto;">
		<br:brPanelGrid
			columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
					<t:dataTable id="dataTable"
						value="#{consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}"
						var="result" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="30px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectOneRadio
								onclick="javascript:habilitaBotaoDepConsultaApuracaoAposFechamento(document.forms[1], this);"
								id="sor" styleClass="HtmlSelectOneRadioBradesco" layout="spread"
								forceId="true" forceIdIndex="false">
								<f:selectItems
									value="#{consultarApuracaoAposFechamentoBean.listaControleCheckRadio}" />
							</t:selectOneRadio>
							<t:radio for="sor" index="#{result.linha}" />
						</t:column>
						<t:column width="100px"
							style="padding-right:5px; padding-left:5px;">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.depConsultarApuracaoAposFechamento_label_dependencia}"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.codDepPa}" />
						</t:column>
						<t:column width="320px"
							style="padding-right:5px; padding-left:5px;">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.depConsultarApuracaoAposFechamento_label_descricao}"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.descDepPa}" />
						</t:column>
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px;">
							<f:facet name="header">
								<h:outputText
									value="#{msgs.depConsultarApuracaoAposFechamento_label_receita}"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.receita}" />
						</t:column>
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px;">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.depConsultarApuracaoAposFechamento_label_iss_a_recolher}"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.ISSRecolher}" />
						</t:column>
					</t:dataTable> 0
			</br:brPanelGroup>
		</br:brPanelGrid>
		</t:div>
		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" rendered="#{!empty consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}">
			<br:brPanelGroup style="width: 30px;" />
			<br:brPanelGroup style="width: 417px; text-align:left;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="Total das Agências Relacionadas:" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>	
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.qtdeAgencia}" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width: 30px;" />
			<br:brPanelGroup style="width: 417px; text-align:left;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="Total dos PAs Relacionados:" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>	
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.qtdePa}" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width: 30px;" />
			<br:brPanelGroup style="width: 417px; text-align:left;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{msgs.saldos_divergentes_total}" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.totalReceita}" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>	
			<br:brPanelGroup style="width: 150px; text-align:right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.totalRecolher}" style="padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>

	
	<br:brPanelGrid width="100%">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
		<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0"
			columns="3">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.depConsultarApuracaoAposFechamento_botao_voltar}"
					action="#{consultarApuracaoAposFechamentoBean.voltar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGroup style="text-align: right; width:100%">
				<br:brCommandButton id="btnPlanilhaEletronica"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.depConsultarApuracaoAposFechamento_label_botao_planilha_eletronica}"
					disabled="#{consultarApuracaoAposFechamentoBean.listaDependenciaApuracao == null}"
					actionListener="#{consultarApuracaoAposFechamentoBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<br:brCommandButton id="btnProsseguir"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.depConsultarApuracaoAposFechamento_label_botao_consultar}"
					action="#{consultarApuracaoAposFechamentoBean.consultarApuracaoFechamento}"
					disabled="true">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>

</brArq:form>