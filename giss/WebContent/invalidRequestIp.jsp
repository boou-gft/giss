<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="brHtml" %>

<brHtml:brPanelGrid width="100%" columns="1" cellpadding="0" cellspacing="5" border="0" >

	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.invalid_ip_header}"/>
	</brHtml:brPanelGroup>
	
	<f:verbatim><br></f:verbatim>
	
	<brHtml:brPanelGroup>
		<brHtml:brOutputText value="#{msgs.invalid_ip_next_steps}"/>
	</brHtml:brPanelGroup>
	
	<f:verbatim><br><br></f:verbatim>
	
	<brHtml:brPanelGroup>
		<brHtml:brCommandLink action="nav_index">
			<brHtml:brGraphicImage url="/images/bt_voltar.gif" />
		</brHtml:brCommandLink>
	</brHtml:brPanelGroup>

</brHtml:brPanelGrid>