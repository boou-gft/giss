<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="excluirContaContabilForm" name="excluirContaContabilForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.excluir_conta_contabil_informacoes_da_conta}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.excluir_conta_contabil_tipo_servico}:" />
		</br:brPanelGroup>			
		<br:brPanelGrid columns="1" style="margin-top:5px;" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>			
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.tipoServicoDesc}" />
		</br:brPanelGroup>	
		</br:brPanelGrid>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
 	<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0"  >	
 		 <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;">
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_cosif}:"/>	
					</br:brPanelGroup>
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >						
					<br:brPanelGroup>	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.cosifFormatado}"/>	
					</br:brPanelGroup>				
				</br:brPanelGrid>					
		</br:brPanelGroup>	
 		 <br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>		
 		 <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;">
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.excluir_conta_contabil_razao}:"/>	
					</br:brPanelGroup>
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >						
					<br:brPanelGroup>	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.razao}"/>	
					</br:brPanelGroup>				
				</br:brPanelGrid>					
		</br:brPanelGroup>	
	    <br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>		
	    <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;">
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.excluir_conta_contabil_conta_contabil}:"/>	
					</br:brPanelGroup>
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >						
					<br:brPanelGroup>	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.conta}"/>	
					</br:brPanelGroup>				
				</br:brPanelGrid>					
		</br:brPanelGroup>		
	    <br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>		
	     <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="margin-bottom:5px;">
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.excluir_conta_contabil_descricao}:"/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.descricao}" />	
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
		<br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>			
		 <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;" >
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.excluir_conta_contabil_item_lei}:"/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
				    	<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.item}" />
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.excluir_conta_contabil_btn_voltar}" action="manterContaContabil" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton  id="btnConfirmar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.excluir_conta_contabil_btn_finalizar}" actionListener="#{contaContabilBean.excluiContaContabil}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="height:300px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
		</br:brPanelGroup>		
	</br:brPanelGrid>
</br:brPanelGrid> 		

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

