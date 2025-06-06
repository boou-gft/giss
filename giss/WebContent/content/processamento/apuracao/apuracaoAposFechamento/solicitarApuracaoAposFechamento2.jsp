<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="solicitarApuracaoAposFechamento2Form" name="solicitarApuracaoAposFechamento2Form">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	 <br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.sol_apuracao_apos_fechamento_solicitar_processamento_apuracao}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_competencia}:"/>	
		</br:brPanelGroup>		
	    <br:brPanelGroup>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoAposFechamentoBean.competencia}"/>	
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_data_processamento}:"/>	
		</br:brPanelGroup>		
	    <br:brPanelGroup>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoAposFechamentoBean.dataProcessamento}"/>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	
</br:brPanelGrid>	

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarAg}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
</br:brPanelGrid>
 
 <br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarAg}">		

	 <br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_ag}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_competencia}:"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoAposFechamentoBean.competencia}"/>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_processamento_envolvido}:"/>	
		</br:brPanelGroup>		

		<br:brPanelGroup>
		</br:brPanelGroup>		
	
	    <br:brPanelGroup>
			<t:dataTable var="result" value="#{apuracaoAposFechamentoBean.processamentosEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoAposFechamentoBean.processamentosEnvolvidos != null}">
				<t:column style="width: 100%">						
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText value="#{result.processamentosEnvolvidos}"/>
				</t:column>
			</t:dataTable>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	
</br:brPanelGrid>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarAg}">	
 	<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0" style="text-align:right">	
		<br:brPanelGroup>
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.sol_apuracao_apos_fechamento_botao_finalizar}"  action="#{apuracaoAposFechamentoBean.contabilizaApuracaoAg}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>		
</br:brPanelGrid>
<%--
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarPa}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
</br:brPanelGrid>

 <br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarPa}">		

	 <br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_pa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_competencia}:"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoAposFechamentoBean.competencia}"/>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_apos_fechamento_processamento_envolvido}:"/>	
		</br:brPanelGroup>		

		<br:brPanelGroup>
		</br:brPanelGroup>		
	
	    <br:brPanelGroup>
			<t:dataTable var="result" value="#{apuracaoAposFechamentoBean.processamentosEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoAposFechamentoBean.processamentosEnvolvidos != null}">
				<t:column style="width: 100%">						
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText value="#{result.processamentosEnvolvidos}"/>
				</t:column>
			</t:dataTable>	
		</br:brPanelGroup>		
	</br:brPanelGrid>	
</br:brPanelGrid>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoAposFechamentoBean.exibeFinalizarPa}">	
 	<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0" style="text-align:right">	
		<br:brPanelGroup>
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.sol_apuracao_apos_fechamento_botao_finalizar}"  action="#{apuracaoAposFechamentoBean.contabilizaApuracaoPa}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>		
</br:brPanelGrid>
 --%>

</brArq:form>
