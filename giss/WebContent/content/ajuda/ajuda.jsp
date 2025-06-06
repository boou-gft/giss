<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="ajudaServicoForm" name="ajudaServicoForm">

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.label_title_informacao_ajuda_atualizacao}" />
			</br:brPanelGroup>

			<f:verbatim>
				<br>
			</f:verbatim>

			<br:brPanelGroup id="ultimaAtualizacao"
				rendered="#{!ajudaVersaoSistemaBean.exibirTodas}">
				<br:brPanelGroup>
					<br:brOutputText
						value="Versão #{ajudaVersaoSistemaBean.ultimaAtualizacao.versao} - #{ajudaVersaoSistemaBean.ultimaAtualizacao.dataAtualizacao}" />
				</br:brPanelGroup>

				<f:verbatim>
					<br>
				</f:verbatim>

				<br:brPanelGroup>
					<t:dataList id="descricoes" var="descricao"
						value="#{ajudaVersaoSistemaBean.ultimaAtualizacao.descricoes}">
						<br:brOutputText value="    - #{descricao}" />

						<f:verbatim>
							<br>
						</f:verbatim>
					</t:dataList>
				</br:brPanelGroup>

				<f:verbatim>
					<br>
				</f:verbatim>
				<f:verbatim>
					<br>
				</f:verbatim>

				<br:brCommandLink value="Ver versões anteriores"
					rendered="#{!ajudaVersaoSistemaBean.exibirTodas}"
					action="#{ajudaVersaoSistemaBean.listarTodas}" />

			</br:brPanelGroup>

			<br:brPanelGroup>
				<t:dataList id="atualizacoes" var="atualizacao"
					rendered="#{ajudaVersaoSistemaBean.exibirTodas}"
					value="#{ajudaVersaoSistemaBean.atualizacoes}">
					<br:brPanelGroup>
						<br:brOutputText
							value="* Versão #{atualizacao.versao} - #{atualizacao.dataAtualizacao}" />
					</br:brPanelGroup>

					<f:verbatim>
						<br>
					</f:verbatim>

					<br:brPanelGroup>
						<t:dataList id="descricoesCompletas" var="descricao"
							value="#{atualizacao.descricoes}">
							<br:brOutputText value="- #{descricao}" />

							<f:verbatim>
								<br>
							</f:verbatim>
						</t:dataList>
					</br:brPanelGroup>

					<f:verbatim>
						<br>
					</f:verbatim>
				</t:dataList>

				<br:brCommandLink value="Ver última versão"
					rendered="#{ajudaVersaoSistemaBean.exibirTodas}"
					action="#{ajudaVersaoSistemaBean.listarUltima}" />

			</br:brPanelGroup>
			
			<BR>

			<br:brCommandLink value="Fechar"
				action="#{ajudaVersaoSistemaBean.sendToHome}" />

		</br:brPanelGrid>
	</br:brPanelGrid>

	<brArq:validatorScript functionName="validateForm" />
	<f:verbatim>
		<script>
			function Somaiuscula(formato, keypress, objeto) {
				campo = eval(objeto);
				caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
				if (caracteres.search(String.fromCharCode(keypress)) != 1) {
					campo.value = campo.value.toUpperCase();
				}
			}
		</script>
	</f:verbatim>
</brArq:form>

