<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="apuracaoRepForm" name="apuracaoRepForm" >

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracao_reprocessamento_info_apuracao}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
  	    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" width="100%" align="left">
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_competencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.dataCompetenciaSaida}" />
			</br:brPanelGroup>			
		
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_dependencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.dependencia}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_descricao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.descricao}" />
			</br:brPanelGroup>			
		
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_base_calculo}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.baseCalculo}" />
			</br:brPanelGroup>			
		
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_aliquota_padrao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.aliquotaPadrao}" />
			</br:brPanelGroup>			

			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_tipo_incidencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.tipoIncidencia}" />
			</br:brPanelGroup>			
		
		
		
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_solicitacao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.codigo}" />
			</br:brPanelGroup>			
		
			<br:brPanelGroup style="width: 210; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_data_solicitacao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataSolicitacao}" >
				  <f:converter converterId="dateBrazillianConverter"/>
				     </br:brOutputText> 
			</br:brPanelGroup>			

			<br:brPanelGroup style="width: 250; height: 20; text-align: left">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_data_processamento}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataProcessamento}"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><hr class="lin"> </f:verbatim>
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
			<br:brPanelGroup>	
				<t:dataTable id="dataTable" value="#{apuracaoRepBean.listaApuracao}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_direita, alinhamento_direita"
				headerClass="tabela_celula_destaque_acentuado" width="750px">

					<t:column width="150px" style="padding-right:5px; padding-left:5px; height:23px;">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_conta}" />
					    </f:facet>
					    <br:brOutputText value="#{result.conta}"/>
					</t:column>	
					<t:column width="150px" style="padding-right:5px; padding-left:5px; height:23px;text-align:center" rendered="#{apuracaoRepBean.razaoExiste}">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_razao}" />
					    </f:facet>
					    <br:brOutputText value="#{result.razao}"/>
					</t:column>			  
				    <t:column width="150px" style="padding-right:5px; padding-left:5px">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_movimento}" />
					    </f:facet>
					    <br:brOutputText value="#{result.movimentoValor}" converter="decimalBrazillianConverter"/>
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_tributavel}" />
					    </f:facet>
					    <br:brOutputText value="#{result.tributavelValor}" converter="decimalBrazillianConverter"/>
					</t:column>		
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_aliquota}" />
					    </f:facet>
					    <br:brOutputText value="#{result.aliquota}"/>
					</t:column>			  
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
					    <f:facet name="header">
					      <br:brOutputText value="#{msgs.apuracao_reprocessamento_iss}" />
					    </f:facet>
					    <br:brOutputText value="#{result.issValor}" converter="decimalBrazillianConverter"/>
					</t:column>			  
				</t:dataTable>		
			</br:brPanelGroup>

	  	    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="1" width="750px">
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px; text-align:left">
					<br:brPanelGroup>
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_total}"/>
					</br:brPanelGroup>			
				</br:brPanelGrid>
				
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:149px; text-align:right">			
					<br:brPanelGroup>
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.totalMovimento}" style="margin-right:0px; padding-right:5px; padding-left:5px;"  converter="decimalBrazillianConverter"/>			
			    	</br:brPanelGroup>
				</br:brPanelGrid>
			
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:149px; text-align:right">				
					<br:brPanelGroup>
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.totalTributavel}" style="margin-right:0px; padding-right:5px; padding-left:5px;" converter="decimalBrazillianConverter"/>
					</br:brPanelGroup>			
				</br:brPanelGrid>
			
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:150px;">					
					<br:brPanelGroup>
			    	</br:brPanelGroup>
				</br:brPanelGrid>
				
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:145px; text-align:right">		
					<br:brPanelGroup>
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.totalISS}"  style="margin-right:0px; padding-right:5px; padding-left:5px;" converter="decimalBrazillianConverter"/>
					</br:brPanelGroup>
				</br:brPanelGrid>				
			</br:brPanelGrid>
		</br:brPanelGrid>
	
	 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
			<br:brPanelGroup>
			    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{apuracaoRepBean.pesquisarApuracao}" 
			    					   rendered="#{!empty apuracaoRepBean.listaApuracao}">
				  <f:facet name="previous">
				    <brArq:pdcCommandButton id="anterior"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_anterior}" title="#{msgs.label_anterior}"/>
				  </f:facet>
				  <f:facet name="next">
				    <brArq:pdcCommandButton id="proxima"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_proxima}" title="#{msgs.label_proxima}"/>
				  </f:facet>
				</brArq:pdcDataScroller>			  
			</br:brPanelGroup>
		</br:brPanelGrid>	

		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup style="text-align:left;width:150px"  >
				<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_voltar}" action="#{apuracaoRepBean.voltarConsultar}" >	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>