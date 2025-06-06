<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="saldosDivergentesForm" name="saldosDivergentesForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.saldos_divergentes_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.saldos_divergentes_competencia}: "/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{saldosDivergentesBean.competencia}"/>	
		</br:brPanelGroup>				
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{saldosDivergentesBean.listaSaldosDivergentesDependencia.listaSaldoDivergenteDependenciaDTO}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >				
			<t:column width="100px" style="padding-right:5px; padding-left:5px;height:23px;text-align:left" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_dependencia}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.dependencia}"/>
			</t:column>
			  <t:column width="380px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_descricao}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" />
			  </t:column>
			  
			   <t:column width="135px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_apuracao_giss}"  />
			    </f:facet>
   			    <br:brOutputText value="#{result.apuracao}" converter="decimalBrazillianConverter"/>
			  </t:column>
			   <t:column width="135px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_contabil_sap}"  />
			    </f:facet>
   			    <br:brOutputText value="#{result.contabil}" converter="decimalBrazillianConverter"/>
			  </t:column>
			</t:dataTable>		
			
		</br:brPanelGroup>
	</br:brPanelGrid>	

	<br:brPanelGrid columns="3"  cellpadding="0" cellspacing="0"  rendered="#{saldosDivergentesBean.listaSaldosDivergentesDependencia != null}">	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:470px;text-align:left;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.saldos_divergentes_total}"/>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:138px;text-align:right;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup  >
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{saldosDivergentesBean.totalApuracaoResultado}" converter="decimalBrazillianConverter"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:141px;text-align:right;padding-right:5px; padding-left:5px">	
			<br:brPanelGroup >
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{saldosDivergentesBean.totalContabilResultado}" converter="decimalBrazillianConverter"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>

	<f:verbatim><br></f:verbatim>
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" 
		    		actionListener="#{saldosDivergentesBean.pesquisarResultado}" rendered="#{saldosDivergentesBean.listaSaldosDivergentesDependencia != null && !empty saldosDivergentesBean.listaSaldosDivergentesDependencia}">
			
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
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.saldos_divergentes_voltar}" 
				action="#{saldosDivergentesBean.pesquisarVoltar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
</br:brPanelGrid>


<f:verbatim>

<script language="javascript">

	var formulario = document.forms[1];
	var valorRadioSelecionado=-1;
	var btn;
	
	for(i=0; i<formulario.elements.length; i++)	{
	
		/* Rotina para receber o valor do Hidden e passa-lo ao Radio do Tipo de Baixa  */
		if (formulario.elements[i].id == 'saldosDivergentesForm:hiddenRadio'){
			valorRadioSelecionado = formulario.elements[i].value;
		}	
		
		if (formulario.elements[i].id == 'saldosDivergentesForm:btnConsultar'){
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
		btn.disabled = false;
	}
	
	function habilitaBotaoConsultar(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'saldosDivergentesForm:btnConsultar'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].name == 'saldosDivergentesForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function validarDataProcessamento(form, msg){	
		var aux = 1;
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'saldosDivergentesForm:dataProcessamento'){
				if (form.elements[i].value == ''){
					aux = 0;
				}
			}
				
			if (form.elements[i].name == 'saldosDivergentesForm:hiddenObrigatoriedade'){		
				hidden = form.elements[i];	
			}
			
		}	
		
		if (aux == 1){
			hidden.value = 'T';
		}else{
			hidden.value = 'F';
			alert(msg);
		
		}
	}
	

	

</script>
</f:verbatim>


<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	
	