<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="b"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<%   
   response.setHeader("Cache-Control","no-cache"); //HTTP 1.1   
   response.setHeader("Pragma","no-cache"); //HTTP 1.0   
   response.setDateHeader ("Expires", 0); //prevents caching   
   response.setHeader("Cache-Control","no-store"); //HTTP 1.1   
%>  

<tiles:useAttribute id="title" name="title" classname="java.lang.String"
	scope="request" ignore="true" />

<tiles:useAttribute id="description" name="description"
	classname="java.lang.String" scope="request" ignore="true" />
<tiles:useAttribute id="author" name="author"
	classname="java.lang.String" scope="request" ignore="true" />
<tiles:useAttribute id="copyright" name="copyright"
	classname="java.lang.String" scope="request" ignore="true" />
<tiles:useAttribute id="keywords" name="keywords"
	classname="java.lang.String" scope="request" ignore="true" />

<tiles:useAttribute name="css" ignore="true" />
<tiles:useAttribute name="especificCSS" ignore="true" />
<tiles:useAttribute name="js" ignore="true" />
<tiles:useAttribute name="especificJS" ignore="true" />

<html>

<f:view>
	<f:loadBundle basename="#{facesContext.application.messageBundle}"
		var="msgs" />


	<head>
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />
	<meta http-equiv="Page-Exit"
		content="progid:DXImageTransform.Microsoft.Fade(Duration=0.2,overlap=1)">

	<meta name="description"
		content='<h:outputText value="#{msgs[description]}"/>' />
	<meta name="author" content='<h:outputText value="#{msgs[author]}"/>' />
	<meta name="copyright"
		content='<h:outputText value="#{msgs[copyright]}"/>' />
	<meta name="keywords"
		content='<h:outputText value="#{msgs[keywords]}"/>' />

	<title><h:outputText value="#{msgs[title]}" /></title>
	<%-- b:brOutputText no puede ser usado, porque encapsula el texto entre <span></span> tags, no soportados por 
  		el tag html <title> --%>

	<%--  	#################################################################################
  			Inclusión de las StyleSheets 
  			#################################################################################
  	--%>
	<c:if test="${css!=null}">
		<c:forEach items="${css}" var="item">
			<c:if test="${item.tooltip==null}">
				<link rel="stylesheet" type="text/css"
					href="<c:url value="${item.link}"/>">
			</c:if>
			<c:if test="${item.tooltip=='print'}">
				<link rel="stylesheet" type="text/css" media="print"
					href="<c:url value="${item.link}"/>">
			</c:if>
		</c:forEach>
	</c:if>
	<%-- Inclusion de CSS especifico de la pagina o grupo de paginas actual 
	(definido en su tiles-definition) --%>
	<c:if test="${especificCSS!=null}">
		<c:forEach items="${especificCSS}" var="item">
			<c:if test="${item.tooltip==null}">
				<link rel="stylesheet" type="text/css"
					href="<c:url value="${item.link}"/>">
			</c:if>
			<c:if test="${item.tooltip=='print'}">
				<link rel="stylesheet" type="text/css" media="print"
					href="<c:url value="${item.link}"/>">
			</c:if>
		</c:forEach>
	</c:if>

	<%--  	#################################################################################
  			Inclusión de los Módulos Javascript
  			#################################################################################
  	--%>
	<c:if test="${js!=null}">
		<c:forEach items="${js}" var="item">
			<script language="JavaScript" src="<c:url value="${item.link}"/>">
			</script>
		</c:forEach>
	</c:if>
	<%-- Inclusion de Javascript especifico de la pagina o grupo de paginas actual 
	(definido en su tiles-definition) --%>
	<c:if test="${especificJS!=null}">
		<c:forEach items="${especificJS}" var="item">
			<script language="JavaScript" src="<c:url value="${item.link}"/>">
			</script>
		</c:forEach>
	</c:if>
	</head>


	<body leftmargin="0" topmargin="0" scroll="no" onresize="resizeWorkArea();">

	<t:div id="div_brArq_form_wait" style="display:none;">
		<t:div id="wait"
			style="{width: 100%; height: 100%; z-index: 10; position: absolute; cursor: wait; opacity:0.1; -moz-opacity: 0.1; filter: alpha(opacity=10); background-color: #ffffff}">
			<t:panelGroup style="{width: 100%; height: 100%; z-index: 10}">
				<br:brOutputText value=""></br:brOutputText>
				<f:verbatim>
					<iframe frameBorder="0" scrolling="NO"
						style="{width: 100%; height: 100%; z-index: 100; position: absolute;}"
						src="${pageContext.request.contextPath}/template/dummy.html"></iframe>
				</f:verbatim>
			</t:panelGroup>
		</t:div>
	</t:div>

	<b:brPanelGrid id="mainLayout" border="0" columns="1" cellpadding="0"
		cellspacing="0" styleClass="tmainpage" headerClass="theaderPanelGrid"
		footerClass="tfooterPanel" columnClasses="ccontext">



		<b:brPanelGroup id="pageContext">
			<%--<f:subview>--%>
			<b:brPanelGrid id="innerLayout" border="0" columns="1"
				cellpadding="0" cellspacing="0" styleClass="tmainpage"
				headerClass="tsubHeaderPanel" footerClass="thelpPanel"
				columnClasses="ccontext1">
				<f:facet name="header">
					<f:subview id="subHeader">
						<tiles:insert attribute="subHeader" flush="false" ignore="true" />

					</f:subview>
				</f:facet>

				<b:brPanelGroup id="bodyContent">
					<b:brPanelGrid id="contentLayout" border="0" columns="1"
						cellpadding="0" cellspacing="0" styleClass="tmainpage"
						headerClass="tmainMenuPanel" columnClasses="ccontext">
						<f:facet name="header">
							<f:subview id="mainMenu">
								<tiles:useAttribute name="checkUserRoles" ignore="true" />
								<tiles:useAttribute name="menuSelected" id="menuSelected"
									classname="java.lang.String" scope="request" ignore="true" />

								<tiles:useAttribute id="menuOptions" name="menuOptions"
									classname="java.util.List" scope="request" ignore="true" />
								<c:if test="${checkUserRoles == 'true'}">
									<authz:authorize ifAllGranted="ROLE_INTRANET">
										<tiles:insert attribute="mainMenu" flush="false" ignore="true" />
									</authz:authorize>
								</c:if>

								<c:if test="${checkUserRoles != 'true'}">
									<%-- En caso de no verificar roles (porque el aplicativo no posee seguridad) mostrar todo el menu prinicipal --%>
									<tiles:insert attribute="mainMenu" flush="false" ignore="true" />
								</c:if>
							</f:subview>
						</f:facet>
						<t:div id="pageContent">
							<tiles:useAttribute name="isHome" ignore="true" />
							<c:if test="${isHome!=null}">
								<b:brPanelGrid id="pageContentLayout" border="0" columns="2"
									cellpadding="0" cellspacing="0" styleClass="tmainpage2"
									columnClasses="cbodyContext">
									<%-- Inicio Indicador de Passos --%>
									<f:subview id="pathView">
										<tiles:useAttribute id="selection" name="selection"
											scope="request" ignore="true" classname="java.lang.String" />
										<tiles:useAttribute id="path" name="path" scope="request"
											ignore="true" classname="java.util.List" />
										<tiles:useAttribute id="passNumber" name="passNumber"
											scope="request" ignore="true" classname="java.lang.String" />
										<b:brPanelGrid cellpadding="0" cellspacing="0" border="0"
											align="left">
											<b:brOutputText value="#{msgs[selection]}"
												styleClass="selectionMenu" escape="false" />
											<b:brPanelGroup>
												<t:dataList value="#{path}" var="item" rowIndexVar="index"
													rowCountVar="count">
													<b:brPanelGroup style="white-space: nowrap;">
														<b:brOutputText value="#{index+1}"
															styleClass="passSelected"
															rendered="#{index+1==passNumber}" />
														<b:brOutputText value="#{index+1}"
															styleClass="passNoSelected"
															rendered="#{index+1!=passNumber}" />
														<b:brOutputText styleClass="textDefault" value="-" />
														<b:brOutputText styleClass="textPassSelected"
															value="#{msgs[item.value]}"
															rendered="#{index+1==passNumber}" />
														<b:brOutputText styleClass="textPassNoSelected"
															value="#{msgs[item.value]}"
															rendered="#{index+1!=passNumber}" />
													</b:brPanelGroup>
												</t:dataList>
											</b:brPanelGroup>
										</b:brPanelGrid>
									</f:subview>
								<%-- Fim Indicador de Passos --%>
									<b:brPanelGroup id="quickServices">
										<tiles:insert attribute="quickServices" flush="false"
											ignore="true" />
									</b:brPanelGroup>
									<b:brPanelGroup id="pageBody">
										<h:form id="formModalMessages">
											<app:modalMessages  
												mainDivClass="uiModalMessagesMainDivIntranet"
												headerDivClass="uiModalMessagesHeaderDivIntranet"
												bodyDivClass="uiModalMessagesBodyDivIntranet"
												buttonClass="uiModalMessagesOkButtonIntranet"
												footerDivClass="uiModalMessagesFooterDivIntranet"
												textClass="uiModalMessagesTextIntranet"
												buttonLabelForError="ERRO"
												buttonLabelForInfo="INFO"
												closeImage="/images/close.gif"
												id="button"/>
										</h:form>
										<tiles:insert attribute="body" flush="false" ignore="true" />

									</b:brPanelGroup>

								</b:brPanelGrid>
							</c:if>
							<c:if test="${isHome==null}">
								<b:brPanelGrid id="pageContentLayout" border="0" columns="1"
									cellpadding="0" cellspacing="0" styleClass="tmainpage"
									headerClass="pathContext" columnClasses="cbodyContext">
									<f:facet name="header">
										<f:subview id="pathView">
											<tiles:useAttribute id="path" name="path" scope="request"
												ignore="true" classname="java.util.List" />
											<b:brPanelGrid id="pathHeader" columns="1" border="0"
												cellpadding="0" cellspacing="0" styleClass="tmainpage"
												rendered="#{path!=null}">
												<b:brPanelGroup styleClass="pathSpaceLine">
													<b:brOutputText value=" " />
												</b:brPanelGroup>
												<b:brPanelGroup styleClass="pathLine">
													<t:dataList value="#{path}" var="item" rowIndexVar="index"
														rowCountVar="count">

														<%--<b:brOutputText styleClass="msg_path" value=":: " rendered='#{index==0}'/>
											    		<b:brOutputText styleClass="msg_path" value=" > " rendered='#{index>0}'/>--%>
														<b:brGraphicImage
															url="/template/images/bullet_titpag_princ.gif"
															rendered="#{index==0}" />
														<b:brGraphicImage
															url="/template/images/bullet_titpag_sub.gif"
															rendered="#{index>0}" />

														<b:brOutputText styleClass="msg_path_text"
															value="#{msgs[item.value]}" />
													</t:dataList>
												</b:brPanelGroup>
												<b:brPanelGroup styleClass="pathSpaceLine">
													<b:brOutputText value=" " />
												</b:brPanelGroup>
												<tiles:useAttribute id="selection" name="selection"
													scope="request" ignore="true" classname="java.lang.String" />
												<b:brPanelGroup styleClass="pathLine2"
													rendered="#{selection!=null}">
													<b:brOutputText value="#{msgs[selection]}" />
												</b:brPanelGroup>
												<b:brPanelGroup styleClass="pathSpaceLine">
													<b:brOutputText value=" " />
												</b:brPanelGroup>
											</b:brPanelGrid>
										</f:subview>
									</f:facet>
									<b:brPanelGroup id="pageBody">
										<tiles:insert attribute="body" flush="false" ignore="true" />
									</b:brPanelGroup>
								</b:brPanelGrid>
							</c:if>
						</t:div>
					</b:brPanelGrid>
				</b:brPanelGroup>


			</b:brPanelGrid>


			<%--</f:subview>--%>
		</b:brPanelGroup>

		<f:facet name="footer">
			<f:subview id="footer">
				<tiles:insert attribute="footer" flush="false" />
			</f:subview>
		</f:facet>

	</b:brPanelGrid>

	</body>
</f:view>
<script language="Javascript">
<!--
resizeWorkArea();
function resizeWorkArea() {
	var height = getHeight();
	var width = getWidth();
	if (height != -1) {
		var workHeightSize = height - 30 - 86;
		getObjectById('pageContent').style.height = workHeightSize;
	}
	getObjectById('pageContent').style.width = width;
	getObjectById('pageContent').style.overflow = 'auto';
}
function getObjectById(id) {
	if (document.all) {
		return document.all[id];
	} else {
		return document.getElementById(id);
	}
}

function getHeight() {
	if( window.innerHeight && window.innerHeight > 0 ) {
		return window.innerHeight;
	} else if( document.documentElement.clientHeight && document.documentElement.clientHeight > 0 ) {
		return document.documentElement.clientHeight;
	} else if( document.body.clientHeight && document.body.clientHeight > 0 ) {
		return document.body.clientHeight;
	} else {
		return -1;
	}
}

function getWidth() {
	if( window.innerWidth && window.innerWidth > 0 ) {
		return window.innerWidth;
	} else if( document.documentElement.clientWidth && document.documentElement.clientWidth > 0 ) {
		return document.documentElement.clientWidth;
	} else if( document.body.clientWidth && document.body.clientWidth > 0 ) {
		return document.body.clientWidth;
	} else {
		return -1;
	}
}

-->
</script>
</html>

