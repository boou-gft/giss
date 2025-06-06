<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>

<br:brPanelGrid width="745" columns="3" cellpadding="0" cellspacing="0"
	align="left" styleClass="tfooterPanelGrid"
	columnClasses="tfooterColumnLeft,tfooterColumnAuto,tfooterColumnRight">
	<br:brPanelGroup>
		<tiles:useAttribute id="footerImg" name="footerImg" ignore="true"
			classname="java.lang.String" scope="request" />
		<br:brGraphicImage url="#{footerImg}" />
	</br:brPanelGroup>
	<br:brGraphicImage url="/images/pixel_invisivel.gif" />

	<br:brPanelGroup>
		<tiles:useAttribute id="footerText" name="footerText" ignore="true"
			classname="java.lang.String" scope="request" />
		<tiles:useAttribute id="footerText" name="footerText" ignore="true"
			classname="java.lang.String" scope="request" />

		<tiles:useAttribute id="tela" name="tela" ignore="true"
			classname="java.lang.String" />

		<br:brOutputText
			value="Versão #{ajudaVersaoSistemaBean.ultimaAtualizacao.versao} - Ultima atualização: #{ajudaVersaoSistemaBean.ultimaAtualizacao.dataAtualizacao} | " />

		<br:brOutputText value="#{msgs[footerText]}" styleClass="footerText" />

	</br:brPanelGroup>
</br:brPanelGrid>
