<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="valorMesTotalForm" name="valorMesTotalForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	  
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>   
  	</br:brPanelGrid>	 
  	
  	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.valor_mes_total_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.valor_mes_total_competencia}:"/>		
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1" >
		   	 <br:brOutputText styleClass="HtmlOutputTextBradesco" value="#{valorMesTotalBean.mesFiltro}/#{valorMesTotalBean.anoFiltro}" />
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >
			<t:selectOneRadio id="tipoPesquisa" disabled="true" value="#{valorMesTotalBean.filtro}"
			 	styleClass="HtmlSelectOneRadioBradesco">  
				<f:selectItem value="1" itemValue="1" itemLabel="Todos" />
				<f:selectItem value="2" itemValue="2" itemLabel="Por Agência" />
				<f:selectItem value="3" itemValue="3" itemLabel="Por PAs" />
			</t:selectOneRadio>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0"  rendered="#{!empty valorMesTotalBean.listaContasCompetenciaConta.listaDemonstrativoISSDTO}">	
		<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{valorMesTotalBean.listaContasCompetenciaConta.listaDemonstrativoISSDTO}"
							var="result" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_centro, alinhamento_direita, alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="100%">
						
							<t:column width="20%">
								<f:facet name="header">
									<h:outputText value="COSIF"/>
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							<t:column width="20%">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_razao}" />
								</f:facet>
								<br:brOutputText value="#{result.razao}" />
							</t:column>
							<t:column width="20%">
								<f:facet name="header">
									<h:outputText value="Conta"/>
								</f:facet>
								<br:brOutputText value="#{result.conta}" />
							</t:column>
							<t:column width="20%">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_receita}" />
								</f:facet>
								<br:brOutputText value="#{result.receita}"
									converter="decimalBrazillianConverter" />
							</t:column>

							<t:column width="20%">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_iss}" />
								</f:facet>
								<br:brOutputText value="#{result.iss}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5"  cellpadding="0" cellspacing="0"  rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:left">	
			<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.saldos_divergentes_total}" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:left">	
			<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:left">	
			<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 
	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:150px;text-align:right">	
			<br:brPanelGroup>
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{valorMesTotalBean.totalReceita}" converter="decimalBrazillianConverter" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:150px;text-align:right">	
			<br:brPanelGroup>
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{valorMesTotalBean.totalIss}" converter="decimalBrazillianConverter" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>
	

	<br:brPanelGrid columns="1" width="100%" rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}" >
		<br:brPanelGroup> 
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">	
			<br:brPanelGroup style="text-align:left;width:150px">
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.consultarApuracaoAliquotaZerada_botao_voltar}"
					action="#{valorMesTotalBean.voltarConta}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>	
			
			<br:brPanelGrid columns="1" style="width:200px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>
				
			<br:brPanelGroup style="text-align:right;width:100%" >
				<br:brPanelGrid columns="2">
					<br:brCommandButton id="btnPlanilhaEletronica"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.consultarApuracaoAliquotaZerada_botao_planilha_eletronica}"
						actionListener="#{valorMesTotalBean.imprimirPlanilhaEletronicaConta}"
						onclick="desbloqTela();">
						<brArq:submitCheckClient />
					</br:brCommandButton>
					<br:brCommandButton id="btnImprimir"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.consultarApuracaoAliquotaZerada_botao_planilha_imprimir}"
						actionListener="#{valorMesTotalBean.imprimirConta}"
						onclick="desbloqTela();"
						style="margin-left:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGrid>
			</br:brPanelGroup>
		</br:brPanelGrid>	
  </br:brPanelGrid>
<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'valorMesTotalForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'valorMesTotalForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'valorMesTotalForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
