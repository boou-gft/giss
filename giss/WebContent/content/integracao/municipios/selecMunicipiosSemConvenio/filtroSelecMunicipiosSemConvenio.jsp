<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="mainForm" name="mainForm">

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold"
					styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.manter_dependencia_label_estado}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.geral_codigo_municipio}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.geral_municipio}:" />
			</br:brPanelGroup>

			<br:brSelectOneMenu style="width:180px" id="estado"
				value="#{resultMunicNovoBean.estadoFiltro}">
				<f:selectItem itemValue=""
					itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{resultMunicNovoBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7"
				value="#{resultMunicNovoBean.buscaMunicipio.codigo}"
				onkeypress="return validaTecla('0123456789', event);" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun"
				onclick="submit();"
				action="#{resultMunicNovoBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70"
				value="#{resultMunicNovoBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.mantercontacontabil_btn_pesquisar}"
					action="#{resultMunicNovoBean.pesquisarMunicipiosSemConv}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:5px;" cellpadding="0"
			rendered="#{resultMunicNovoBean.mostraBotoes}" cellspacing="0">
			<br:brPanelGroup>
				<br:brSelectBooleanCheckbox disabled="true" value="true"></br:brSelectBooleanCheckbox>
				<br:brOutputText value="#{msgs.label_nao_conveniados}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brSelectBooleanCheckbox disabled="true"
					value="false"></br:brSelectBooleanCheckbox>
				<br:brOutputText value="#{msgs.label_conveniados}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid style="margin-top:10px"
			rendered="#{resultMunicNovoBean.mostraBotoes}">
			<br:brPanelGrid styleClass="mainPanel" cellpadding="0"
				cellspacing="0" columns="1" width="100%">
				<br:brPanelGroup>
					<br:brOutputText
						value="#{msgs.path_title_incluir_manterTipoIncidencia_resultadoPesquisa}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGrid columns="1" width="700px" style="margin-top:5px;"
				cellpadding="0" cellspacing="0">

				<br:brPanelGroup>
					<t:div
						rendered="#{resultMunicNovoBean.listaMunicipiosSemConv!= null}">
						<t:dataTable id="dataTable"
							value="#{resultMunicNovoBean.listaMunicipiosSemConv}"
							var="result" rows="50" rowIndexVar="indexLista" cellspacing="1"
							cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">
							<t:column width="25px">
								<f:facet name="header">
									<t:selectBooleanCheckbox id="todos"
										styleClass="HtmlSelectOneRadioBradesco"
										value="#{resultMunicNovoBean.checkTodos}">
										<a4j:support event="onclick" action="#{resultMunicNovoBean.atribuirMunicipioTodos}" 
											reRender="dataTable, panelBotoes"/>
									</t:selectBooleanCheckbox>
								</f:facet>
								<t:selectBooleanCheckbox id="sor"
									styleClass="HtmlSelectOneRadioBradesco"
									value="#{result.itemSelecionadoCheckLista}">
									<a4j:support event="onclick" action="#{resultMunicNovoBean.atribuirMunicipio}" reRender="dataTable, panelBotoes">
										<a4j:actionparam name="municipioRowParam" value="#{indexLista}" assignTo="#{resultMunicNovoBean.municipioLinhaSelecionada}"/>
									</a4j:support>
								</t:selectBooleanCheckbox>
							</t:column>
							<t:column width="100px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.historico_municipios_grid_codigo}" />
								</f:facet>
								<br:brOutputText value="#{result.codigo}"
									style="float:left; margin-left:1 px;" />
							</t:column>
							<t:column width="370px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.historico_municipios_grid_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result.descricao}" />
							</t:column>
							<t:column width="100px"
								style="padding-right:5px; padding-left:5px; text-align:center">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.historicoDependencia_uf}" />
								</f:facet>
								<br:brOutputText value="#{result.uf}" />
							</t:column>
							<t:column width="120px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.label_data_manut}" />
								</f:facet>
								<br:brOutputText value="#{result.data}"
									style="float:left; margin-left:15 px;" />
							</t:column>
							<t:column width="100px"
								style="padding-right:5px; padding-left:5px; text-align:center">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.label_hora_manut}"/>
								</f:facet>
								<br:brOutputText value="#{result.hora}" />
							</t:column>
							<t:column width="100px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="#{msgs.label_usuario}"
										style="float:left; margin-left:15 px;" />
								</f:facet>
								<br:brOutputText value="#{result.codigoFuncional}" />
							</t:column>
						</t:dataTable>

						<br:brPanelGrid columns="1" width="100%" style="text-align:center"
							cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
								<brArq:pdcDataScroller id="dataScroller" for="dataTable"
									actionListener="#{resultMunicNovoBean.paginarMunicipiosSemConv}"
									rendered="#{resultMunicNovoBean.mostraBotoes}">
									<f:facet name="previous">
										<brArq:pdcCommandButton id="anterior"
											styleClass="HtmlCommandButtonBradesco"
											style="margin-left: 3px;" value="#{msgs.label_anterior}"
											title="#{msgs.label_anterior}" />
									</f:facet>
									<f:facet name="next">
										<brArq:pdcCommandButton id="proxima"
											styleClass="HtmlCommandButtonBradesco"
											style="margin-left: 3px;" value="#{msgs.label_proxima}"
											title="#{msgs.label_proxima}" />
									</f:facet>
								</brArq:pdcDataScroller>
							</br:brPanelGroup>
						</br:brPanelGrid>
					</t:div>
				</br:brPanelGroup>
				<f:verbatim>
					<hr class="lin">
				</f:verbatim>
			</br:brPanelGrid>

			<br:brPanelGrid id="panelBotoes" columns="4" width="100%" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup style="text-align:left;width:150px">
					<br:brOutputText value=" " />
				</br:brPanelGroup>

				<br:brPanelGrid columns="1" style="width:360px" cellpadding="0"
					cellspacing="0">
					<br:brPanelGroup>
					</br:brPanelGroup>
				</br:brPanelGrid>

				<br:brPanelGroup>
					<br:brPanelGroup style="width:150px">
						<br:brOutputText value=" " />
					</br:brPanelGroup>
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brCommandButton id="btnIncluir"
						styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
						value="#{msgs.botao_confirmar}"
						disabled="#{resultMunicNovoBean.listaMunicipiosSemConv == null}"
						action="#{resultMunicNovoBean.incluirMunicipiosSemConv}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>


			</br:brPanelGrid>

		</br:brPanelGrid>



		<f:verbatim />

	</br:brPanelGrid>
	<f:verbatim>
		

	</f:verbatim>
	
	<brArq:validatorScript functionName="validateForm" />

</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean alias="#{BuscaMunicipioBean}"
		value="#{resultMunicNovoBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp"%>
</t:aliasBeansScope>
