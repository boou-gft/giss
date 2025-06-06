<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="parcialPaForm" name="parcialPaForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{msgs.label_solicitar_processamento_apuracao_parcial}"/>
		</br:brPanelGroup>
		
		<f:verbatim>&nbsp;&nbsp;</f:verbatim>
				
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{msgs.consultarApuracaoParcial_label_periodo}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px" value="#{msgs.historico_conta_contabil_label_de}"/>
		 	<app:calendar  id="calendarioDe" value="#{parcialPaBean.dataInicialHist}">	
			 	<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_inicial}" server="false" client="true"/>
		 	</app:calendar>
			<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.historico_conta_contabil_label_ate}"/>
			<app:calendar  id="calendarioAte" value="#{parcialPaBean.dataFinalHist}">
				<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_final}" server="false" client="true"/>
		 	</app:calendar>
		</br:brPanelGroup>	
		
		
	</br:brPanelGrid>
	
	
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
		
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px">
			<br:brCommandButton id="botao_voltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_voltar}" action="nav_index"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:500px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100%" >
		<br:brPanelGrid columns="1">
			<br:brCommandButton id="botao_prosseguir"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_prosseguir}" action="#{parcialPaBean.consultar}"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
</br:brPanelGrid>		
  
 <f:verbatim> 
	
<script language="javascript">
	

</script> 
</f:verbatim> 
  
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
