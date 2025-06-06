<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="brHtml" %>

<html>

<f:view locale="#{localeBean.locale}">
<f:loadBundle basename="#{facesContext.application.messageBundle}" var="msgs" />

<head>
<meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
<link rel="stylesheet" type="text/css" href="<c:url value="/template/css/components.css"/>">
</head>

<body>
<brHtml:brPanelGrid width="100%" columns="1" cellpadding="0" cellspacing="5" border="0" >

	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.login_fail_header}"/>
	</brHtml:brPanelGroup>
	
	<c:if test="${requestScope.identification_error!=null}">
		<brHtml:brPanelGroup>
			<f:verbatim><font color="red"><c:out value="${requestScope.identification_error.localizedMessage}"/></font></f:verbatim>
		</brHtml:brPanelGroup>
	</c:if>
	
	<brHtml:brPanelGroup>
		<brHtml:brCommandLink value="#{msgs.login_fail_back}" action="nav_index"/>
	</brHtml:brPanelGroup>

</brHtml:brPanelGrid>
</body>
</f:view>
</html>