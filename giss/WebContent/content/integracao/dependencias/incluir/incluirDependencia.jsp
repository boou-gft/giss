<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirDependenciaForm" name="incluirDependenciaForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.incluirDependencia_subTitulo_informacoesDependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
					<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.incluirDependencia_label_dependencia}:" style="margin-right:5px;"/>						
		    	</br:brPanelGroup>				
				<br:brPanelGroup style="width:5px">
		    	</br:brPanelGroup>
				<br:brPanelGroup>						
				   	<br:brInputText value="#{dependenciaBean.codigoDependencia}" size="8" maxlength="5" id="txtDependencia"  onkeyup="aplicamascara('incluirDependenciaForm', 'incluirDependenciaForm:txtDependencia',numeros);">  
				   		<brArq:commonsValidator type="required" arg="#{msgs.incluirDependencia_label_dependencia}" server="false" client="true" />
					    <brArq:commonsValidator type="integer" arg="#{msgs.incluirDependencia_label_dependencia}" server="false" client="true" /> 
					</br:brInputText>    	
				</br:brPanelGroup>	
			</br:brPanelGrid>			
		</br:brPanelGroup>
	    <br:brPanelGroup style="width:56px">
	    </br:brPanelGroup>		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_descricao}:" />
		</br:brPanelGroup>
	     <br:brPanelGroup style="width:130px">
	    </br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_cnpj}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_dataAbertura}:" />
		</br:brPanelGroup>
	    <br:brPanelGroup style="width:120px">
	    </br:brPanelGroup>		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_dataEncerramento}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_agencia}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.incluirDependencia_botao_prosseguir}" action="#{dependenciaBean.prosseguirIncluirDependencia}">
				<brArq:submitCheckClient/> 
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
   
</brArq:form>
	