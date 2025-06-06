<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="alterarContaContabilForm" name="alterarContaContabilForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.contaContabil_subTitulo_infoConta_alterar}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="margin-bottom:5px;">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contaContabil_label_tipoServico_alterar}:"/>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.tipoServicoDesc}"/>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	


	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	
	<br:brPanelGrid columns="8" cellpadding="0" cellspacing="0"  >	
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
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contaContabil_label_razao_alterar}:"/>	
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
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contaContabil_label_tipoConta_alterar}:"/>	
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
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contaContabil_label_descricao_alterar}:"/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{contaContabilBean.dtoAlterar.descricao}"/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
		<br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>			
		 <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;" >
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.contaContabil_label_itemLei_alterar}:"/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
				    	<br:brInputText value="#{contaContabilBean.dtoAlterar.itemDaLei}" size="8" maxlength="6" id="txtItemDaLei" onkeyup="validaCampo('alterarContaContabilForm');">  
				    		<brArq:commonsValidator type="required" arg="#{msgs.contaContabil_label_itemLei_alterar}" server="false" client="true"/> 
				    	</br:brInputText>				    	
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.contaContabil_subTitulo_alterarTipoServico_alterar}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.contaContabil_label_tipoServico_alterar}:" />
		</br:brPanelGroup>			
		<br:brPanelGrid columns="1" style="margin-top:5px;" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brSelectOneMenu style="width:260px;cursor:hand;" id="tipoServico" value="#{contaContabilBean.dtoAlterar.tipoServico}">
					<f:selectItem itemValue="" itemLabel="#{msgs.contaContabil_subTitulo_comboSelecione}"/>
					<f:selectItems value="#{contaContabilBean.listaTipoServico}"/>
			    	<brArq:commonsValidator type="required" arg="#{msgs.contaContabil_label_tipoServico_alterar}" server="false" client="true"/>
				</br:brSelectOneMenu>
			</br:brPanelGroup>
		</br:brPanelGrid>		
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
			<br:brCommandButton  id="btnConfirmar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.excluir_conta_contabil_btn_finalizar}" actionListener="#{contaContabilBean.alteraContaContabil}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="height:300px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	
</br:brPanelGrid>
<f:verbatim>
<script language="javascript">
   
function validaCampo(form){
 
	var scampo = document.getElementById(form+':txtItemDaLei').value; 			
	document.getElementById(form+':txtItemDaLei').value = scampo.replace(/\D/g,"");
	
}
   
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	
	