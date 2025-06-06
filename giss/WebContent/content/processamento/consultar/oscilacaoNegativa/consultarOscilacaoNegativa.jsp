<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<brArq:form id="consultarOscilacaoNegativaForm"
	name="consultarOscilacaoNegativaForm">
	<h:inputHidden id="hiddenRadio"
		value="#{consultarOscilacaoNegativaBean.itemSelecionadoLista}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.oscilacaoNegativa_label_informacoes_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold"
					styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.geral_empresa}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.geral_dependencia}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.oscilacaoNegativa_label_competencia}:" />
			</br:brPanelGroup>
			<%--Quebra Linha--%>
			<br:brSelectOneMenu id="empresa"
				value="#{consultarOscilacaoNegativaBean.indiceComboEmpresaFiltro}">
				<f:selectItems
					value="#{consultarOscilacaoNegativaBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10"
				value="#{consultarOscilacaoNegativaBean.codDepFiltro}" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brInputText styleClass="HtmlInputTextBradesco"
					onkeyup="proximoCampo(2,'consultarOscilacaoNegativaForm','consultarOscilacaoNegativaForm:txtMes','consultarOscilacaoNegativaForm:txtAno');"
					value="#{consultarOscilacaoNegativaBean.mesFiltro}" size="3"
					maxlength="2" id="txtMes"
					onkeypress="aplicamascara('consultarOscilacaoNegativaForm','consultarOscilacaoNegativaForm:txtMes',numeros);"
					onblur="validarData('consultarOscilacaoNegativaForm','consultarOscilacaoNegativaForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="integer"
						arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}"
						server="false" client="true" />
					<brArq:commonsValidator type="required"
						arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}"
						server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText styleClass="HtmlInputTextBradesco"
					value="#{consultarOscilacaoNegativaBean.anoFiltro}" size="6"
					maxlength="4" id="txtAno"
					onkeypress="aplicamascara('consultarOscilacaoNegativaForm','consultarOscilacaoNegativaForm:txtAno',numeros);"
					onblur="validarData('consultarOscilacaoNegativaForm','consultarOscilacaoNegativaForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="integer"
						arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}"
						server="false" client="true" />
					<brArq:commonsValidator type="required"
						arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}"
						server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
			style="float:right;">
			<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.oscilacaoNegativa_botao_prosseguir}"
					action="#{consultarOscilacaoNegativaBean.prosseguir}"
					disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup style="height:10px">
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0"
			rendered="#{consultarOscilacaoNegativaBean.mostraTable}">
			<br:brPanelGrid columns="1" width="100%" cellpadding="0"
				cellspacing="0">
				<t:div styleClass="barraDeRolagem">
				<br:brPanelGroup>
						<t:dataTable id="dataTable"
							value="#{consultarOscilacaoNegativaBean.listaOscilacao}"
							var="result" 
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="750px">
							<t:column width="10px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitarBotaoConsultar(document.forms[1], this);"
									id="sor" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarOscilacaoNegativaBean.listaDependenciaRadio}" />
								</t:selectOneRadio>
								<t:radio for="sor" index="#{result.itemRadio}" />
							</t:column>
							<t:column width="80px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.oscilacaoNegativa_label_dependencia}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.codDepPa}" />
							</t:column>
							<t:column width="500px" style="padding-left:5px;">
								<f:facet name="header">
									<h:outputText value="#{msgs.oscilacaoNegativa_label_municipio}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.municipioDepPa}" />
							</t:column>
							<t:column width="30px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.oscilacaoNegativa_label_uf}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.uf}" />
							</t:column>
							<t:column width="140px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.oscilacaoNegativa_label_anterior}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.anterior}"
									converter="decimalBrazillianConverter" />
							</t:column>
							<t:column width="140px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.oscilacaoNegativa_label_atual}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.atual}"
									converter="decimalBrazillianConverter" />
							</t:column>
							<t:column width="140px" style="padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.oscilacaoNegativa_label_oscilacao}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.oscilacao}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</br:brPanelGroup>
				</t:div>
			</br:brPanelGrid>
			<br:brPanelGrid columns="4" width="100%" cellpadding="0"
				cellspacing="0"
				rendered="#{!empty consultarOscilacaoNegativaBean.listaOscilacao}">
				<br:brPanelGroup style="width:450px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="Total das Agências Listadas:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalAnteriorAcumuladoAg}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalAtualAcumuladoAg}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalOscilacaoAcumuladoAg}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>

				<br:brPanelGroup style="width:450px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="Total dos PAs Listados:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalAnteriorAcumuladoPa}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalAtualAcumuladoPa}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.totalOscilacaoAcumuladoPa}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				
				<br:brPanelGroup style="width:450px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{msgs.oscilacaoNegativa_label_total}:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.labelTotalAnterior}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.labelTotalAtual}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
				<br:brPanelGroup style="width:100px;text-align:right">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarOscilacaoNegativaBean.labelTotalOscilacao}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="float:left;">
				<br:brPanelGroup>
					<br:brCommandButton id="btnVoltar"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.oscilacaoNegativa_botao_voltar}"
						action="#{consultarOscilacaoNegativaBean.voltar}" disabled="false">
						<brArq:submitCheckClient />
					</br:brCommandButton>
					<br:brPanelGroup style="width:470px" />
					<br:brCommandButton id="btnPlanilhaEletronica"
						styleClass="HtmlCommandButtonBradesco"
						value="Planilha Eletrônica"
						actionListener="#{consultarOscilacaoNegativaBean.imprimirPlanilhaEletronica}"
						onclick="desbloqTela();">
						<brArq:submitCheckClient />
					</br:brCommandButton>
					<br:brCommandButton id="btnConsultar"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.oscilacaoNegativa_botao_consultar}"
						action="#{consultarOscilacaoNegativaBean.consultarOscilacaoNegativa}"
						disabled="true">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<f:verbatim>
		<script type="text/javascript">
	function habilitarBotaoConsultar(form, radio) {

		var botaoConsultar;
		var hidden;

		for (i = 0; i < form.elements.length; i++) {

			if (form.elements[i].id == 'consultarOscilacaoNegativaForm:btnConsultar') {
				botaoConsultar = form.elements[i];
			}
			if (form.elements[i].id == 'consultarOscilacaoNegativaForm:hiddenRadio') {
				hidden = form.elements[i];
				hidden.value = radio.value;

			}

		}
		if ((hidden.value != '')) {
			botaoConsultar.disabled = false;
		}

	}
</script>
	</f:verbatim>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>