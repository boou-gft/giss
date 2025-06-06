<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterDependenciaConsultarForm"
	name="manterDependenciaConsultarForm">
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid styleClass="mainPanel" cellpadding="2" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.manter_dependencia_consultar_title_informacoes_dependencia}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="2" cellpadding="2" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_dependencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{parametrizacaoDependenciaBean.codigoDependencia}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{parametrizacaoDependenciaBean.municipio}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="2"
			cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_descricao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{parametrizacaoDependenciaBean.descricaoDependencia}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="2"
			cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_cnpj}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{parametrizacaoDependenciaBean.cnpj}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="2" style="margin-top:11px" cellpadding="2"
			cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_chave_seguranca}: " />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brInputText id="chaveSeguranca" maxlength="50" size="100"
					value="#{parametrizacaoDependenciaBean.chaveSeguranca}"
					disabled="false" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.manter_dependencia_consultar_label_url}: " />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brInputText id="url" maxlength="256" size="100"
					value="#{parametrizacaoDependenciaBean.url}" disabled="false" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="2" width="750" cellpadding="0"
			cellspacing="0">
			<br:brPanelGrid columns="1" width="100%" cellpadding="0"
				style="text-align:left;" cellspacing="0">
				<br:brPanelGroup>
					<br:brCommandButton id="btnVoltar"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.manter_dependencia_consultar_btn_voltar}"
						action="#{parametrizacaoDependenciaBean.voltarResultadoPesquisa}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGrid columns="1" width="100%" cellpadding="0"
				style="text-align:right;" cellspacing="0">
				<br:brPanelGroup>
					<br:brCommandButton id="btnIncluir"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.manter_dependencia_consultar_btn_concluir}"
						action="#{parametrizacaoDependenciaBean.incluirParametro}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>

	</br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>
