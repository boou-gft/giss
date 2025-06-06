<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="b" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<tiles:useAttribute name="headerLinks" ignore="true"/>

<f:verbatim>
<map name="LinksCabec">
	<c:forEach var="item" items="${headerLinks}">
		<area href="<c:url value="${item.link}"/>" alt="<c:out value="${item.tooltip}"/>" 
			shape="rect" coords="<c:out value="${item.value}"/>">
	</c:forEach>
</map>
</f:verbatim>

<b:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		
	<c:set var="userEnabled"><authz:authentication property="enabled" /></c:set>
	<c:if test="${userEnabled=='true'}">
		<authz:authorize ifAllGranted="ROLE_INTRANET">
			<tiles:useAttribute id="headerSessaoImg" name="logoImg" ignore="true" classname="java.lang.String" scope="request"/>
		</authz:authorize>
		
		<b:brCommandLink id="logoutLink" action="logout" shape="rect" coords="677,0,745,27">
			<b:brGraphicImage url="#{headerSessaoImg}" style="border:0" alt="Bradesco Dia e Noite" usemap="#LinksCabec" />
 			<f:actionListener type="br.com.bradesco.web.aq.view.actionlisteners.LogoutController" />
 		</b:brCommandLink>
	</c:if>
	<c:if test="${userEnabled!='true'}">
		<tiles:useAttribute id="headerImg" name="diaNoiteSessaoImg" ignore="true" classname="java.lang.String" scope="request"/>
		<b:brGraphicImage url="#{headerImg}" style="border:0" alt="Bradesco Dia e Noite"/>
	</c:if>
	
</b:brPanelGrid>
