<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="brHtml" %>

<brHtml:brPanelGrid width="100%" columns="1" cellpadding="0" cellspacing="5" border="0" >

	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.session_expired_header}"/>
	</brHtml:brPanelGroup>
	
	<f:verbatim><br></f:verbatim>
	
	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.session_expired_next_steps}"/>
	</brHtml:brPanelGroup>
	
	<f:verbatim><br><br></f:verbatim>
	
	<brHtml:brPanelGroup>
		<img src="<c:url value="images/bt_sair.gif"/>"/>
		<brHtml:brCommandLink target="_parent" action="logout">
				<brHtml:brGraphicImage url="#{btSairImg}"
					alt="#{msgs[subHeaderText1]}"
					title="#{msgs[subHeaderText1]}" />
				<f:actionListener
					type="br.com.bradesco.web.aq.view.actionlisteners.LogoutController" />
			</brHtml:brCommandLink>
	</brHtml:brPanelGroup>

</brHtml:brPanelGrid>