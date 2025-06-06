<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="solicitarApuracaoParcial2Form" name="solicitarApuracaoParcial2Form">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	 <br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracaoparcial_solicitar_processamento_apuracao_parcial}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracaoparcial_competencia}: "/>	
		</br:brPanelGroup>		
	    <br:brPanelGroup>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoParcialBean.dataCompetencia}"/>	
		</br:brPanelGroup>		   
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputTextBold styleClass="HtmlOutputTextRotuloBradesco" value="Dependências de Relacionamento"/>	
		</br:brPanelGroup>		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputTextBold styleClass="HtmlOutputTextRotuloBradesco" value="Postos de Atendimento Bancário"/>	
		</br:brPanelGroup>			   
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid width="750px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px;float:left;"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoparcial_botao_voltar}"  action="#{apuracaoParcialBean.voltar}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
</br:brPanelGrid>
</brArq:form>