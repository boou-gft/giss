<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="reprocesamentoPorMunicipioContasMunicipio2Form"
	name="reprocesamentoPorMunicipioContasMunicipio2Form">
	<h:inputHidden id="hiddenRadio"
		value="#{reprocessamentoPorMunicipioBean.itemSelecionadoListaContas}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_selecao_aliquota}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_municipio}:" />

				<br:brInputText value="#{reprocessamentoPorMunicipioBean.descMunicipio}" disabled="true"
					size="45" />

				<br:brPanelGroup style="width: 2px;" />

				<br:brCommandButton image="/images/lupa.gif" id="btnPesquisarMunicipio"
					styleClass="HtmlCommandButtonBradesco"
					action="#{reprocessamentoPorMunicipioBean.pesquisarMunicipios}">
					<brArq:submitCheckClient />
				</br:brCommandButton>

				<br:brPanelGroup style="width: 20px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_tipo_servico}:" />

				<br:brSelectOneMenu id="tipoServico"
					value="#{reprocessamentoPorMunicipioBean.filtroTipoServico}"
					onchange="habilitarBotaoPesquisar(document.forms[1]);">
					<f:selectItem itemValue="" itemLabel="#{msgs.apuracao_reprocessamento_municipio_selecione}" />
					<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaTipoServico}" />
				</br:brSelectOneMenu>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup style="width: 100%; text-align: right">
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_pesquisar}"
					action="#{reprocessamentoPorMunicipioBean.carregarListaContasMunicipios}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_resultado_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
					<t:dataTable id="dataTable" value="#{reprocessamentoPorMunicipioBean.listaContasMunicipios}"
						var="result" rows="50" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="100%">
						<t:column width="30px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectBooleanCheckbox id="sor" styleClass="HtmlSelectOneRadioBradesco"
								value="#{result.contaSelecionada}">
								<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaRadioMunicipio}" />
								<a4j:support event="onclick" />
							</t:selectBooleanCheckbox>
						</t:column>
						<t:column width="150px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_conta}"
									style="margin-left:5 px; font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.conta}" />
						</t:column>
						<t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_razao}" />
							</f:facet>
							<br:brOutputText value="#{result.razao}" />
						</t:column>
						<t:column width="470px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_descricao}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.descricao}" style="float:left;" />
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_aliquota}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brInputText value="#{result.aliquota}" size="8" alt="percentual"
								onkeypress="onlyNumAndComma()">
								<a4j:support event="onblur"
									onsubmit="if (!validaAliquota(this, 'Al\u00EDquota')) { return false; }" />
							</br:brInputText>
						</t:column>
					</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
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

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_voltar}"
					action="#{reprocessamentoPorMunicipioBean.voltarReprocessamentoConta}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>

				<br:brPanelGroup style="width: 500px;" />

				<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_limpar}"
					action="#{reprocessamentoPorMunicipioBean.limparCampos}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>

				<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracao_reprocessamento_municipio_finalizar}"
					action="#{reprocessamentoPorMunicipioBean.finalizar}" disabled="false">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />
	</br:brPanelGrid>
	<f:verbatim>
		<script type="text/javascript">
	function habilitaBotaoFinalizar(form, radio) {

		var botaoFinalizar;
		var hidden;

		for (i = 0; i < form.elements.length; i++) {
			if (form.elements[i].id == 'reprocesamentoPorMunicipioContasMunicipio2Form:btnFinalizar') {
				botaoFinalizar = form.elements[i];
			}
			if (form.elements[i].id == 'reprocesamentoPorMunicipioContasMunicipio2Form:hiddenRadio') {
				hidden = form.elements[i];
				hidden.value = radio.value;
			}
		}
		if ((hidden.value != '')) {
			botaoFinalizar.disabled = false;
		}
	}

	function onlyNumAndComma() {
		var tecla = "";
		if (document.all) {// Internet Explorer
			tecla = event.keyCode;
		} else if(document.layers) {// Nestcape
			tecla = event.which;
		}
		
		if ((tecla > 47 && tecla < 58) || tecla === 44) {// numeros de 0 a 9
			return true;
		}	else {
			event.keyCode = 0;
			return false;
		}
	}
</script>
	</f:verbatim>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>