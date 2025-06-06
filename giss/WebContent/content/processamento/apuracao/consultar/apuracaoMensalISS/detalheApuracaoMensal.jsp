<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>

<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="resultadoApuracaoMensal" name="resultadoApuracaoMensal">

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.detalheApuracaoMensal_title_informacoes_apuracao}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_competencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.mesCompetenciaFiltro}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_dependencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.dependencia}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_descricao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.descricao}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_base_calculo}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.baseCalculo}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_aliquota_padrao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.aliquotaPadrao}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.detalheApuracaoMensal_tipo_incidencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.tipoIncidencia}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="linha">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{consultarApuracaoMensalBean.apuracaoMensalTotalizada.listaApuracaoMensalTotalizada}"
							var="result" rows="50" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita,alinhamento_direita,alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="100px"
								style="height:23px; padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.incluircontacontabil_conta}" />
								</f:facet>
								<br:brOutputText value="#{result.contaContabilTributo}" />
							</t:column>
							<t:column width="150px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText
										value="#{msgs.apuracao_reprocessamento_movimento}" />
								</f:facet>
								<br:brOutputText value="#{result.receitaApuracaoValor}">
									<f:converter converterId="decimalBrazillianConverter" />
								</br:brOutputText>
							</t:column>
							<t:column width="150px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracao_reprocessamento_tributavel}" />
								</f:facet>
								<br:brOutputText value="#{result.receitaTributoApuracaoValor}">
									<f:converter converterId="decimalBrazillianConverter" />
								</br:brOutputText>
							</t:column>
							<t:column width="150px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracao_reprocessamento_aliquota}" />
								</f:facet>
								<br:brOutputText value="#{result.percentualAliquotaApuracao}">
									<f:converter converterId="decimalBrazillianConverter" />
								</br:brOutputText>
							</t:column>
							<t:column width="150px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.apuracao_reprocessamento_iss}" />
								</f:facet>
								<br:brOutputText value="#{result.tributoApuracaoValor}">
									<f:converter converterId="decimalBrazillianConverter" />
								</br:brOutputText>
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0"
			rendered="#{!empty consultarApuracaoMensalBean.apuracaoMensalTotalizada.listaApuracaoMensalTotalizada}"
			style="padding-right:5px; padding-left:5px">
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:50px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:110px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{msgs.resultadoApuracaoMensal_total}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:80px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.totalMovimento}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:152px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.totalTributavel}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:307px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.totalISS}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0"
			rendered="#{consultarApuracaoMensalBean.listaGridResultado != null}"
			style="padding-right:5px; padding-left:5px">

			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:450px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{msgs.detalheApuracaoMensal_total}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoMensalBean.totalMunicipioReceita}" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoMensalBean.totaMunicipiolIss}" />
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" style="text-align:center"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable"
					actionListener="#{consultarApuracaoMensalBean.pesquisar}"
					rendered="#{!empty consultarApuracaoMensalBean.apuracaoMensalTotalizada.listaApuracaoMensalTotalizada}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior"
							styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
							value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima"
							styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
							value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="linha">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup style="text-align:left;width:150px">
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.detalheApuracaoMensal_btn_voltar}"
					action="#{consultarApuracaoMensalBean.voltarResultado}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>

	<f:verbatim>
		<script language="javascript">
	for (i = 0; i < document.forms[1].elements.length; i++) {
		if (document.forms[1].elements[i].id == 'resultadoApuracaoMensal:competencia.day') {
			document.forms[1].elements[i].style.visibility = "hidden";
		}

	}
</script>
	</f:verbatim>

	<brArq:validatorScript functionName="validateForm" />
</brArq:form>


