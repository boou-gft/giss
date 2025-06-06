<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="formDetalheDepen" name="detalheDepen">
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoMensalBean.radioTelaConta}"/>
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


		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
						<f:verbatim>
							<hr class="lin">
						</f:verbatim>

						<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_competencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.mesCompetenciaFiltro}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_dependencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.dependencia}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_descricao}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.descricao}" />
							</br:brPanelGroup>
						</br:brPanelGrid>

						<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
							cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
							</br:brPanelGroup>
						</br:brPanelGrid>

						<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_base_calculo}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.baseCalculo}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_aliquota_padrao}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.aliquotaPadrao}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_tipo_incidencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{consultarApuracaoMensalBean.detalDependencias.tipoIncidencia}" />
							</br:brPanelGroup>
						</br:brPanelGrid>

						<f:verbatim>
							<br />
						</f:verbatim>



						<br:brPanelGrid columns="1" width="100%" cellpadding="0"
							cellspacing="0">
							<br:brPanelGroup>
								<t:div styleClass="barraDeRolagem">
										<t:dataTable id="dataTable"
											value="#{consultarApuracaoMensalBean.detalDependencias.listaApuracaoMensalTotalizada}"
											var="result" rows="50" cellspacing="1" cellpadding="0"
											rowClasses="tabela_celula_normal, tabela_celula_destaque"
											columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita,alinhamento_direita,alinhamento_direita"
											headerClass="tabela_celula_destaque_acentuado" width="750px">
											<t:column width="10%"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText value="#{msgs.label_cosif}" />
												</f:facet>
												<br:brOutputText value="#{result.cosif}" />
											</t:column>
											<t:column width="5%" style="padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarApuracaoMensalBean.detalDependencias.razaoExiste}">
												<f:facet name="header">
													<h:outputText value="#{msgs.valor_mes_total_razao}" />
												</f:facet>
												<br:brOutputText value="#{result.razao}" />
											</t:column>
											<t:column width="10%" style="padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarApuracaoMensalBean.detalDependencias.razaoExiste}">
												<f:facet name="header">
													<h:outputText value="Conta" />
												</f:facet>
												<br:brOutputText value="#{result.conta}" />
											</t:column>
											<t:column width="10%"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<h:outputText
														value="#{msgs.apuracao_reprocessamento_movimento}" />
												</f:facet>
												<br:brOutputText value="#{result.receitaApuracaoValor}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="10%"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_tributavel}" />
												</f:facet>
												<br:brOutputText
													value="#{result.receitaTributoApuracaoValor}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="5%"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_aliquota}" />
												</f:facet>
												<br:brOutputText
													value="#{result.percentualAliquotaApuracao}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="10%"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_iss}" />
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
								style="width:240px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{consultarApuracaoMensalBean.detalDependencias.totalMovimento}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:115px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{consultarApuracaoMensalBean.detalDependencias.totalTributavel}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:170px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{consultarApuracaoMensalBean.detalDependencias.totalISS}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
						</br:brPanelGrid>

			</br:brPanelGroup>

			<br:brPanelGrid columns="3" width="100%" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup style="text-align:left;width:150px">
					<br:brCommandButton id="btnVoltar"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.detalheApuracaoMensal_btn_voltar}"
						action="#{consultarApuracaoMensalBean.voltarConta}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="width:490px" />
				<br:brPanelGroup style="float:right">
					<br:brCommandButton id="btnPDF"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.resultadoApuracaoOscilacaoNegativa_botao_pdf}"
						actionListener="#{consultarApuracaoMensalBean.imprimirConta}"
						onclick="desbloqTela();" >
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>


		</br:brPanelGrid>
	</br:brPanelGrid>
</brArq:form>

<f:verbatim>
	<script language="javascript">
	function desativarBotao(chk) {

		var checkboxes = document.getElementsByName('sor');
		var btnPDF = document.getElementById('formDetalheDepen:btnPDF');

		var qtdeSelecionados = 0;

		for ( var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].type === 'checkbox') {
				if (checkboxes[i].checked === true) {
					qtdeSelecionados++;
				}
			}
		}
		btnPDF.disabled = qtdeSelecionados <= 0;

	}
</script>
</f:verbatim>
