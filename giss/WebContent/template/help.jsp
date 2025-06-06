<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="b" %>

<b:brPanelGrid border="0" width="400" cellpadding="0" cellspacing="0" align="center" columns="1" bgcolor="#FFFFFF">
    <b:brPanelGrid bgcolor="#ECECEC" columns="1" width="100%">
        <b:brOutputText value=" " />
    </b:brPanelGrid>
    <b:brPanelGrid bgcolor="#FFFFFF" align="center" columns="3">
        <b:brOutputText value=" " />
        <b:brPanelGroup>
        	<tiles:useAttribute name="labelAyuda" id="labelAyuda" classname="java.lang.String" scope="request" ignore="true"/>
    	    <b:brGraphicImage url="/template/images/interrogacao.jpg" />
            <b:brOutputText styleClass="msg_header" value=" #{msgs[labelAyuda]}" />
        </b:brPanelGroup>
        <b:brOutputText value=" " />
    </b:brPanelGrid>
    <tiles:useAttribute id="helpOptions" name="helpOptions" classname="java.util.List" scope="request" ignore="true"/>
    <b:brPanelGrid bgcolor="#ECECEC" columns="1" align="center" width="100%">
    	<b:brPanelGroup>
    		<t:dataList var="item" value="#{helpOptions}" rowCountVar="count" rowIndexVar="index">  	   
		        <b:brCommandLink styleClass="msg_header2" value="#{msgs[item.value]}" action="#{item.link}"/>
		        <b:brOutputText value=" | " rendered="#{index<count-1}"/>
		    </t:dataList>
        </b:brPanelGroup>
    </b:brPanelGrid>
</b:brPanelGrid>