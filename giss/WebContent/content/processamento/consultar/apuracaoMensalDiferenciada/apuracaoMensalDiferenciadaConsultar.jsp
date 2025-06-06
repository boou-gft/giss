<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>

<brArq:form id="apuracaoMensalDiferenciada" name="agenciaIncorpDepartForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
		
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_title_informacoes_para_apuracao}:" />
		</br:brPanelGroup>

  	</br:brPanelGrid>	
  
  		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
  	
  	<br:brPanelGrid columns="9" style="margin-top:5px" cellpadding="0" cellspacing="0" >
	  	<br:brPanelGroup style="width: 210"> 
		  <br:brPanelGroup> 
		  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
		  		<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />
		  </br:brPanelGroup>
			
		  <br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
	      </br:brPanelGroup>
			
		  <br:brPanelGroup style="width:50px"> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.competencia} "/>
		  </br:brPanelGroup>
		</br:brPanelGroup>	
			
		<br:brPanelGroup style="width: 210"> 	
			<br:brPanelGroup style="text-align:left">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}:" />			
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:50px"> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.dependencia} "/>
			</br:brPanelGroup>
		</br:brPanelGroup>
		
			
			<br:brPanelGroup style="text-align:left">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_descricao}:" />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.descricao} "/>
			</br:brPanelGroup>		
  	</br:brPanelGrid>	
  	
  	<br:brPanelGrid columns="9" style="margin-top:5px" cellpadding="0" cellspacing="0" >
	  	<br:brPanelGroup style="width: 210">
		  <br:brPanelGroup> 
		  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
		  		<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_base_calculo}:" />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			
			 <br:brPanelGroup> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalDiferenciadaBean.baseCalculo}% " />
			</br:brPanelGroup>
		</br:brPanelGroup>	
				
		<br:brPanelGroup style="width: 210">
			<br:brPanelGroup style="text-align:left">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_aliquota_padrao}:" />				
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:50px"> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalDiferenciadaBean.aliquotaPadrao}% " />
			</br:brPanelGroup>
		</br:brPanelGroup>
		
					
			<br:brPanelGroup style="text-align:left">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_tipo_incidencia}:" />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
		  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoMensalDiferenciadaBean.tipoIncidencia}" />
			</br:brPanelGroup>		
  	</br:brPanelGrid>
  	  	
  	<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
	</br:brPanelGroup>
  
  	<br:brPanelGrid id="panelLista" columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">				
			<t:dataTable id="dataTableTeste" value="#{apuracaoMensalDiferenciadaBean.listarValores}" var="result" 
				rows="50" cellspacing="1" cellpadding="0" 				
				columnClasses="alinhamento_esquerda, alinhamento_esquerda, 
				alinhamento_esquerda, alinhamento_esquerda" width="750px">
				
								
				  <t:column width="190px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brPanelGroup style="text-align:left; width:190px">
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
						<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_valor_inicial}:" />
					  </br:brPanelGroup>
				    </f:facet>
				   <br:brOutputText  value="R$ "/> 
				  <br:brOutputText  value="#{result.faixaInicialValor}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  
				  <t:column width="190px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brPanelGroup style="text-align:left; width:190px">
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
						<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_valor_final}:" />
					  </br:brPanelGroup>
				    </f:facet>
				     <br:brOutputText  value="R$ "/> 
				    <br:brOutputText  value="#{result.faixaFinalValor}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  
				  <t:column width="190px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brPanelGroup style="text-align:left; width:190px">
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_label_aliquota}:" />
					  </br:brPanelGroup>
				    </f:facet>
				    <br:brOutputText value="#{result.aliquotaFaixa}%"/>
				  </t:column>
				  
				    <t:column width="190px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				     	<br:brPanelGroup style="text-align:left; width:190px">
							<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
							<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_label_redutor}:" />
						</br:brPanelGroup>
				    </f:facet>
				     <br:brOutputText  value="R$ "/> 
				    <br:brOutputText value="#{result.redutorValor}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  
				  
				</t:dataTable>	 				
		</br:brPanelGroup>
  	</br:brPanelGrid>	
  	
  	
  	
  	
  	
  	<br:brPanelGroup style="width:750px">
  	<f:verbatim><hr class="lin"> </f:verbatim>
	 </br:brPanelGroup>
	 
 	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="true">	
	 <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_apuracaoMensalDiferenciada_secondBall_resultado_da_pesquisa}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid id="panelListaMunicipios" columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">				
			<t:dataTable id="dataTable" value="#{apuracaoMensalDiferenciadaBean.listaApuracao}" var="result" 
				rows="50" cellspacing="1" cellpadding="0" 
				rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_esquerda, alinhamento_esquerda, 
				alinhamento_esquerda" 
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				
								
				  <t:column width="220px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="" />
				    </f:facet>
				     <f:facet name="footer">
				    <br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Total: "/>
				    </f:facet>
				  </t:column>
				  
				  <t:column width="250px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText style="width:100%; text-align:center; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_grid_movimento}"  />
				    </f:facet>
				     <f:facet name="footer">
				    <br:brOutputText style="width:100%; text-align:right; margin-left:5" value="#{apuracaoMensalDiferenciadaBean.vlrMovimento}" converter="decimalBrazillianConverter"/>
				  	</f:facet>
				  </t:column>
				  
				  <t:column width="250px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText style="width:100%; text-align:center; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_grid_tributavel}"  />
				    </f:facet>
				    <f:facet name="footer">
				 	   <br:brOutputText style="width:100%; text-align:right; margin-left:5"  value="#{apuracaoMensalDiferenciadaBean.vlrTributavel}" converter="decimalBrazillianConverter"/>
				 	</f:facet>
				  </t:column>
				
				</t:dataTable>	 				
		</br:brPanelGroup>
	</br:brPanelGrid> 
		
	 <br:brPanelGroup style="width:750px">
  		<f:verbatim><hr class="lin"> </f:verbatim>
	 </br:brPanelGroup>
  	
  	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >
  	<br:brPanelGroup style="text-align:left;width:100%"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoMensalDiferenciada_btn_voltar}" action="#{apuracaoMensalDiferenciadaBean.voltarProc}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid> 
	
		</br:brPanelGrid>
 	</br:brPanelGrid>
 	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>