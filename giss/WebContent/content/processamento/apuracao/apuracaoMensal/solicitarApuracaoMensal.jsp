<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="solicitarApuracaoMensalForm" name="solicitarApuracaoMensalForm">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-top: 9px">	   
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.sol_apuracao_mensal_solicitar_processamento_apuracao}:" style="margin-top: 9px"/>
		</br:brPanelGroup>
		<f:verbatim><br/> </f:verbatim>
	</br:brPanelGrid>	
	<br:brPanelGroup>
		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-top: 9px"/>	
		<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_competencia}: " style="margin-top: 9px"/>	
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalBean.competenciaProcessamento}" style="margin-top: 9px"/>	
	</br:brPanelGroup>		
	<br:brPanelGroup>
		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
		<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_processamento_envolvidos}:" style="margin-top: 9px"/>	
	</br:brPanelGroup>		
    <br:brPanelGroup>
		<t:dataTable var="result" value="#{apuracaoMensalBean.processamentosEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoMensalBean.processamentosEnvolvidos != null}">
			<t:column style="width: 150px;height:5px;">						
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText value="#{result.processamentosEnvolvidos}" />
			</t:column>
		</t:dataTable>	
	</br:brPanelGroup>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarAg}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarAg}">	
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
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_competencia}:"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalBean.competenciaContabilizacao}"/>	
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_processamento_envolvidos}:"/>	
		</br:brPanelGroup>		

		<br:brPanelGroup>
		</br:brPanelGroup>		
	
	    <br:brPanelGroup>
			<t:dataTable var="result" value="#{apuracaoMensalBean.contabilizacaoEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoMensalBean.contabilizacaoEnvolvidos != null}">
				<t:column style="width: 190px; height:5px;">						
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText value="#{result.contabilizacaoEnvolvidos}"/>
				</t:column>
			</t:dataTable>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
 </br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarAg}">	
	<br:brPanelGrid width="750px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:right;width:150px;float:right;"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.sol_apuracao_mensal_botao_finalizar}"  action="#{apuracaoMensalBean.contabilizaApuracao}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
		
</br:brPanelGrid>
 <br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarPa}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarPa}">		
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
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_competencia}:"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalBean.competenciaContabilizacaoPa}"/>	
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_processamento_envolvidos}:"/>	
		</br:brPanelGroup>		

		<br:brPanelGroup>
		</br:brPanelGroup>		
	
	    <br:brPanelGroup>
			<t:dataTable var="result" value="#{apuracaoMensalBean.contabilizacaoEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoMensalBean.contabilizacaoEnvolvidos != null}">
				<t:column style="width: 190px; height:5px;">						
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText value="#{result.contabilizacaoEnvolvidos}"/>
				</t:column>
			</t:dataTable>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarPa}">	
	<br:brPanelGrid width="750px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:right;width:150px;float:right;"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.sol_apuracao_mensal_botao_finalizar}"  action="#{apuracaoMensalBean.contabilizaApuracaoPa}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
		
</br:brPanelGrid>
 <br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarSemConv}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarSemConv}">		
	 <br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_sem_conv}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_competencia}:"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalBean.competenciaContabilizacaoSemConv}"/>	
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.sol_apuracao_mensal_contabilizacao_apuracao_processamento_envolvidos}:"/>	
		</br:brPanelGroup>		

		<br:brPanelGroup>
		</br:brPanelGroup>		
	
	    <br:brPanelGroup>
			<t:dataTable var="result" value="#{apuracaoMensalBean.contabilizacaoEnvolvidos}" border="0" cellspacing="1" cellpadding="0" width="100%" rendered="#{apuracaoMensalBean.contabilizacaoEnvolvidos != null}">
				<t:column style="width: 190px; height:5px;">						
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText value="#{result.contabilizacaoEnvolvidos}"/>
				</t:column>
			</t:dataTable>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
</br:brPanelGrid>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalBean.exibeFinalizarSemConv}">	
	<br:brPanelGrid width="750px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:right;width:150px;float:right;"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.sol_apuracao_mensal_botao_finalizar}"  action="#{apuracaoMensalBean.contabilizaApuracaoSemConv}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
</br:brPanelGrid>
</brArq:form>