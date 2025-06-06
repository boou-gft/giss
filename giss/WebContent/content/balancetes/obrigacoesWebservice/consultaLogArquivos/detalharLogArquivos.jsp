<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultaLogArquivosObrigacoesWebserviceForm"
	name="consultaLogArquivosObrigacoesWebserviceForm">
	<h:inputHidden id="hiddenRadio"
		value="#{consultaLogArquivosBean.codListaPesquisar}" />

	<br:brPanelGrid columns="1" width="750px" cellpadding="0"
		cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid cellpadding="0" cellspacing="0" columns="3"
			width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_remessa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.remessa}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.geral_dependencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.codDependencia}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_descricao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.descDependencia}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.codMunicipio} - #{consultaLogArquivosBean.logSelecionado.municipio}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_tipo_arquivo}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.descTipoArquivo}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_nome_arquivo}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.nomeArquivo}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_situacao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.descSitTransmissao}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_data}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.dataRemessa}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_hora}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.horaRemessa}" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_matricula}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultaLogArquivosBean.logSelecionado.codUsuarioInclusao}" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" width="750px" style="text-align:left"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.label_descricao}: " />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brInputTextarea rows="5" cols="128" styleClass="HtmlOutputTextRespostaBradesco" readonly="true"
					value="#{consultaLogArquivosBean.logSelecionado.mensagemRetornoPref}" />
			</br:brPanelGroup>
		</br:brPanelGrid>


		<br:brPanelGrid columns="1" width="750px" style="text-align:left"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<f:verbatim>
					<hr class="lin">
				</f:verbatim>

				<br:brCommandButton id="btnPesquisar"
					onclick="javascript: return validateForm(document.forms[1]);"
					styleClass="HtmlCommandButtonBradesco !important;"
					style="margin: 8px 0 8px 0" value="#{msgs.botao_voltar}"
					action="#{consultaLogArquivosBean.voltar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>


	<brArq:validatorScript functionName="validateForm" />

</brArq:form>