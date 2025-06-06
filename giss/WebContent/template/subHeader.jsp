<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="b"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="cus"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>


<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="4"
	columnClasses="tsubHeaderColumn1,tsubHeaderColumn2,tsubHeaderColumn3,tsubHeaderColumn4"
	styleClass="theaderPanelGrid">
	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="1">
			<b:brPanelGroup>
				<tiles:useAttribute id="logoImg" name="logoImg" ignore="true"
					classname="java.lang.String" scope="request" />
				<b:brGraphicImage url="#{logoImg}" styleClass="img_logo" />
			</b:brPanelGroup>
		</b:brPanelGrid>
	</b:brPanelGroup>
	<b:brPanelGroup>

	</b:brPanelGroup>
	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="2" cellspacing="0" border="0" columns="3">
			<tiles:useAttribute id="clockImg" name="clockImg" ignore="true" classname="java.lang.String" scope="request"/>
			<b:brOutputText styleClass="msg_header3" value="#{sessionBean.dataAtual}" title="#{sessionBean.dataAtual}" />
			<b:brGraphicImage styleClass="img_iconeTempo" url="images/icone_tempo.gif" />
			<b:brOutputText styleClass="msg_header3" value="#{sessionBean.horaAtual}" title="#{sessionBean.horaAtual}" />
		</b:brPanelGrid>

		<b:brPanelGrid cellpadding="2" cellspacing="0" border="0" columns="3">
			<b:brGraphicImage styleClass="bullet" url="images/bullet.jpg" style="vertical-align:middle;" />
			<b:brOutputText styleClass="msg_header3" value="#{sessionBean.saudacao}" title="#{sessionBean.saudacao}" />
			<b:brOutputText styleClass="msg_header4" value="#{sessionBean.username}" title="#{sessionBean.username}" />
		</b:brPanelGrid>
	</b:brPanelGroup>

	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="1"
			align="right">
			<tiles:useAttribute id="btSairImg" name="btSairImg" ignore="true"
				classname="java.lang.String" scope="request" />
			<b:brCommandLink target="_parent" action="logout">
				<b:brGraphicImage url="#{btSairImg}" style="border:0"
					styleClass="img_sair" alt="#{msgs[subHeaderText1]}"
					title="#{msgs[subHeaderText1]}" />
				<f:actionListener
					type="br.com.bradesco.web.aq.view.actionlisteners.LogoutController" />
			</b:brCommandLink>
			<tiles:useAttribute id="subHeaderText" name="subHeaderText"
				ignore="true" classname="java.lang.String" scope="request" />
		</b:brPanelGrid>
	</b:brPanelGroup>

	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="1">
			<b:brPanelGroup>
			</b:brPanelGroup>
		</b:brPanelGrid>
	</b:brPanelGroup>
	<b:brPanelGroup>
	</b:brPanelGroup>
	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="3">
		</b:brPanelGrid>
	</b:brPanelGroup>
	<b:brPanelGroup>
		<b:brPanelGrid cellpadding="0" cellspacing="0" border="0" columns="1"
			align="right">
		</b:brPanelGrid>
	</b:brPanelGroup>
</b:brPanelGrid>
