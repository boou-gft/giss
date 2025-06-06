<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="parametrizarMinMaxAliquota" name="parametrizarMinMaxAliquota" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"/>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
  
  	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" width="100%">
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_aliquota_data_vigencia}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<app:calendar disabled="true" id="txtDataVigenciaInicio" value="#{parametrizarMinMaxAliquotaBean.dto.dataIncioVigenciaAliquota}" /> 	
		</br:brPanelGroup>	

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_aliquota_minimo}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText size="40" maxlength="6" id="txtMinimoAliquota" value="#{parametrizarMinMaxAliquotaBean.dto.porcentAliquotaMin}" onblur="vNumero(this,'9(1)V9999')"/> 	
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_aliquota_maximo}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText size="40" maxlength="6" id="txtMaximoAliquota" value="#{parametrizarMinMaxAliquotaBean.dto.porcentAliquotaMax}" onblur="vNumero(this,'9(1)V9999')"/> 	
		</br:brPanelGroup>	
	</br:brPanelGrid>
  
  	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_incluir_parametrizacao_aliquota}" action="#{parametrizarMinMaxAliquotaBean.incluir}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
  
  
  
  
	
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

	
	
