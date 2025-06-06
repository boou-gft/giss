<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="brHtml" %>

<brHtml:brPanelGrid width="100%" columns="1" cellpadding="0" cellspacing="5" border="0" >

	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.login_fail_header}"/>
	</brHtml:brPanelGroup>
	
	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{AUTH_FAILURE_BACKING.failureReason}"/>
	</brHtml:brPanelGroup>
	
	<brHtml:brPanelGroup>
		<brHtml:brCommandLink value="#{msgs.login_fail_back}" action="nav_index"/>
	</brHtml:brPanelGroup>

</brHtml:brPanelGrid>
