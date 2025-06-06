<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="b" %>

<b:brPanelGrid columns="1" cellspacing="6" width="100%">
	<b:brOutputText value="#{msgs.exception_line1}"/>
	<b:brOutputText value="#{msgs.exception_line2}"/>
	<b:brOutputText value=" "/>
</b:brPanelGrid>

<b:brPanelGrid columns="1" cellspacing="4" width="100%">
	<b:brOutputText value="#{msgs.exception_summary_label}"/>
	<b:brOutputText value="#{exceptionBean.descricao}"/>
	<b:brOutputText value="#{msgs.exception_detail_label}"/>
	<b:brOutputText value="#{exceptionBean.detalhe}"/>
</b:brPanelGrid>

<b:brPanelGrid columns="1" cellspacing="6" width="100%">
	<b:brOutputText value=" "/>
	<b:brCommandLink action="nav_index" value="#{msgs.exception_back_link}"/>
</b:brPanelGrid>