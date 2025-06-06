<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="solicitarReprocessamentoPorDependenciaContasMunicipio2Form"
	name="solicitarReprocessamentoPorDependenciaContasMunicipio2Form">
	<h:inputHidden id="hiddenRadio"
		value="#{reprocessamentoPorDependenciaBean.itemSelecionadoListaContasMunicipio}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_municipios}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid style="margin-top:20px" />

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_codigo}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{reprocessamentoPorDependenciaBean.codigoMunicipio}" />
				<br:brPanelGroup style="width: 20px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_nome}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{reprocessamentoPorDependenciaBean.nomeMunicipio} " />
				<br:brPanelGroup style="width: 20px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_estado}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{reprocessamentoPorDependenciaBean.estado}" />
				<br:brPanelGroup style="width: 20px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_aliquota}:" />
				<br:brOutputText styleClass="HtmlOutputTextBoldBradesco"
					value="#{reprocessamentoPorDependenciaBean.aliquota}" converter="decimalBrazillianConverter" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="%" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid style="margin-top:10px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_tipo_servico}:" />

				<br:brSelectOneMenu style="width: 320px;" id="pagtoDiaUtil"
					value="#{reprocessamentoPorDependenciaBean.filtroTipoServico}">
					<f:selectItem itemValue="" itemLabel="#{msgs.apuracao_reprocessamento_dependencia_selecione}" />
					<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaTipoServico}" />
					<brArq:commonsValidator type="required"
						arg="#{msgs.resultado_municipios_novos_incluir_pagto_dia_util}" server="false" client="true" />
				</br:brSelectOneMenu>



			</br:brPanelGroup>
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="float:right;">
			<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_prosseguir}"
					action="#{reprocessamentoPorDependenciaBean.prosseguirContaMunicipio2}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid style="margin-top:10px" />

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_resultado_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
					<t:dataTable id="dataTable" value="#{reprocessamentoPorDependenciaBean.listaMunicipioDTO}"
						var="listaMunicipio" rows="50" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="30px">
							<t:selectBooleanCheckbox id="sor" styleClass="HtmlSelectOneRadioBradesco"
								value="#{listaMunicipio.contaSelecionada}">
								<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaRadioContas}" />
								<a4j:support event="onclick" />
							</t:selectBooleanCheckbox>
						</t:column>
						<t:column width="150px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_conta}"
									style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
							</f:facet>
							<br:brOutputText value="#{listaMunicipio.conta}" />
						</t:column>
						<t:column width="150px" style="text-align:center">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_razao}"
									style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
							</f:facet>
							<br:brOutputText value="#{listaMunicipio.razao}" />
						</t:column>
						<t:column width="470px">
							<f:facet name="header">
								<h:outputText value="#{msgs.apuracao_reprocessamento_dependencia_descricao}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{listaMunicipio.descricao}" />
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_aliquota}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brInputText value="#{listaMunicipio.aliquota}" size="8" alt="onlyNumAndComma"
								onkeypress="onlyNumAndComma();">
								<a4j:support event="onblur"
									onsubmit="if (!validaAliquota(this, 'Al\u00EDquota')) { return false; }" />
							</br:brInputText>
						</t:column>
					</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0"
			rendered="#{!empty reprocessamentoPorDependenciaBean.listaMunicipioDTO}">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable" >
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco"
							style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco"
							style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="float:left;">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_voltar}"
					action="#{reprocessamentoPorDependenciaBean.voltarReprocessamentoConta}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<br:brPanelGroup style="width: 495px;" />
				<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_limpar}"
					action="#{reprocessamentoPorDependenciaBean.limparCampos}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>

				<br:brPanelGroup style="width: 5px;" />

				<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_dependencia_finalizar}"
					action="#{reprocessamentoPorDependenciaBean.finalizar}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>

	<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />

	<f:verbatim>
		<script type="text/javascript">
	function onlyNumAndComma() {
		var tecla = "";
		if (document.all) {// Internet Explorer
			tecla = event.keyCode;
		} else if (document.layers) {// Nestcape
			tecla = event.which;
		}

		if ((tecla > 47 && tecla < 58) || tecla === 44) {// numeros de 0 a 9
			return true;
		} else {
			event.keyCode = 0;
			return false;
		}
	}
</script>
	</f:verbatim>

	<brArq:validatorScript functionName="validateForm" />
</brArq:form>