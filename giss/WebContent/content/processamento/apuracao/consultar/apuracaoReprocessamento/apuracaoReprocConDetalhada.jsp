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

	<h:inputHidden id="hiddenApuracao" value="#{apuracaoRepBean.radioApuracao}"/>

	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracao_reprocessamento_info_reprocessamento}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
  	    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
  	    
  	     	    <br:brPanelGroup style= "height:20">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.estado}" />
			</br:brPanelGroup>
			
				<br:brPanelGroup style= "height:20">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_municipio}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.codigo} - #{apuracaoRepBean.municipio}" />
				</br:brPanelGroup>
			
				<br:brPanelGroup style= "height:30">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_competencia}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.dataCompetenciaSaida}"/>
					
				</br:brPanelGroup>
  	    
  	    
			<br:brPanelGroup style= "height:20">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_solicitacao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataSolicitacao}" >
				<f:converter converterId="dateBrazillianConverter"/>
				     </br:brOutputText> 
			</br:brPanelGroup>
			
				<br:brPanelGroup style="height:20">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_processamento}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataProcessamento}"/>
				</br:brPanelGroup>
			
				<br:brPanelGroup style= "height:20">
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_periodo}: " />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataInicioApuracao}">
					     <f:converter converterId="competenciaConverter"/>
				     </br:brOutputText> 
				     <br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="à" style="margin-right: 12" />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{apuracaoRepBean.detalhes.dataFimApuracao}">
					<f:converter converterId="competenciaConverter"/>
				     </br:brOutputText> 
				</br:brPanelGroup>
		</br:brPanelGrid>
		
		<f:verbatim><hr class="lin"></f:verbatim>
		
		
		<br:brPanelGrid columns="1" cellpadding="0" style="margin-top:6px;"cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio}: " />
			</br:brPanelGroup>			
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup >	
	<t:dataTable id="dataTable" value="#{apuracaoRepBean.consultaTotalApuracaoReproc.listaApuracaoReprocessamento}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
				headerClass="tabela_celula_destaque_acentuado" width="750px" >
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value="" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{apuracaoRepBean.listaCtrlTerceiraTela}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />
				</t:column>
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia}" style="text-align:center"/>
				    </f:facet>
				    <br:brOutputText value="#{result.dependencia}" style="width:140;text-align:left"  />
				  </t:column>
				  <t:column width="250px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_descricao}"  style="text-align:center" />
				    </f:facet>
				    <br:brOutputText value="#{result.descricao}"  style="width:250;text-align:left" />
				  </t:column>
				  <t:column width="160px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_receita}"/>
				    </f:facet>
				    <br:brOutputText value="#{result.receitaValor}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  <t:column width="160px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_issrecolher}" />
				    </f:facet>
				    <br:brOutputText value="#{result.issValor}" converter="decimalBrazillianConverter"/>
				  </t:column>	
				</t:dataTable>		
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" style="width: 750px">
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:35px;text-align:left;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:410px;text-align:left;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_total_municipio}:" />
			</br:brPanelGroup>
   	    </br:brPanelGrid> 	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:155px;text-align:right;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup  >
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{apuracaoRepBean.consultaTotalApuracaoReproc.receitaTotalMunicipio}" converter="decimalBrazillianConverter" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:150px;text-align:right;padding-left:5px;padding-right:5px;">	
			<br:brPanelGroup >
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{apuracaoRepBean.consultaTotalApuracaoReproc.issTotalMunicipio}" converter="decimalBrazillianConverter" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" style="width: 750px">	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:35px;text-align:left;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:410px;text-align:left;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_total_geral}:" />
			</br:brPanelGroup>
   	    </br:brPanelGrid> 	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:155px;text-align:right;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup >
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{apuracaoRepBean.consultaTotalApuracaoReproc.receitaTotalGeral}" converter="decimalBrazillianConverter" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:150px;text-align:right;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup >
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{apuracaoRepBean.consultaTotalApuracaoReproc.issTotalGeral}" converter="decimalBrazillianConverter" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{apuracaoRepBean.paginarTerceiraLista}">
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
	
		<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup style="text-align:left;width:150px"  >
				<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_voltar}" action="#{apuracaoRepBean.voltarProsseguir}" >	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
			<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>	
			<br:brPanelGroup style="text-align:right;width:200px" >
				<br:brCommandButton id="btnConsultar"  styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_consultar}" action="#{apuracaoRepBean.consultar}" disabled="true">	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:300px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
	</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

	for(i=0; i<document.forms[1].elements.length; i++)
	{
		if (document.forms[1].elements[i].id == 'apuracaoRepForm:competencia.day'){
			document.forms[1].elements[i].style.visibility="hidden";
		}	
	
	}	
	

	function habilitarBotoes(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apuracaoRepForm:btnConsultar'){
				form.elements[i].disabled=false;
			}
			
			if (form.elements[i].id == 'apuracaoRepForm:hiddenApuracao'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	var formulario = document.forms[1];
	var valorRadioSelecionado=-1;
	var btn;
	
	for(i=0; i<formulario.elements.length; i++)	{
	
		
		if (formulario.elements[i].id == 'apuracaoRepForm:hiddenApuracao'){
			valorRadioSelecionado = formulario.elements[i].value;
		}	
		
		if (formulario.elements[i].id == 'apuracaoRepForm:btnConsultar'){
			btn = formulario.elements[i];
		}	
		
		if (formulario.elements[i].name == 'sorLista'){
			//Se valor do Hidden for igual ao Radio em foco, checamos o radio
			if ( formulario.elements[i].value == valorRadioSelecionado ) {
			   formulario.elements[i].checked = true;
			}
	 		else
			   formulario.elements[i].checked = false;			   		

		}	
		
	}
	
	if (valorRadioSelecionado != -1){
		btn.disabled = true;
		for(i=0; i<formulario.elements.length; i++)	{
		
			if (formulario.elements[i].name == 'sorLista'){
				formulario.elements[i].checked = false;			   		
	
			}	
			
		}
	}

</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>