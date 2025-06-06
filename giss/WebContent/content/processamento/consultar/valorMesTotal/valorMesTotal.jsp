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
<h:inputHidden id="hiddenRadio" value="#{valorMesTotalBean.radioTelaConta}"/>
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

	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.valor_mes_total_competencia}:"/>		
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="3" >
		    <br:brPanelGroup>	
			    <br:brInputText styleClass="HtmlInputTextBradesco" 
			     onkeyup="proximoCampo(2,'valorMesTotalForm','valorMesTotalForm:txtMes','valorMesTotalForm:txtAno');" 
			     value="#{valorMesTotalBean.mesFiltro}" size="3" maxlength="2" id="txtMes" onkeypress="aplicamascara('valorMesTotalForm','valorMesTotalForm:txtMes',numeros);" onblur="validarData('valorMesTotalForm','valorMesTotalForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
		    		<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />	
		    		<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />		  				      				       
			    </br:brInputText>	
			</br:brPanelGroup>					
	
		      <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-left:5px;margin-right:5px;">
						 <br:brPanelGroup>	
					 		<f:verbatim>/</f:verbatim>
		 				</br:brPanelGroup>		
					</br:brPanelGrid>
			
			<br:brPanelGroup>						
			    <br:brInputText styleClass="HtmlInputTextBradesco" value="#{valorMesTotalBean.anoFiltro}" 
			      size="6" maxlength="4" id="txtAno" onkeypress="aplicamascara('valorMesTotalForm','valorMesTotalForm:txtAno',numeros);" onblur="validarData('valorMesTotalForm','valorMesTotalForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
		    		<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />			  				      				      
		    		<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />
			    </br:brInputText>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >
			<t:selectOneRadio id="tipoPesquisa" value="#{valorMesTotalBean.filtro}"
			 	styleClass="HtmlSelectOneRadioBradesco">  
				<f:selectItem value="1" itemValue="1" itemLabel="Todos" />
				<f:selectItem value="2" itemValue="2" itemLabel="Por Ag ncia" />
				<f:selectItem value="3" itemValue="3" itemLabel="Por PAs" />
			</t:selectOneRadio>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" 
					value="#{msgs.valor_mes_total_prosseguir}" action="#{valorMesTotalBean.carregaListaDemonstrativo}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>
	</br:brPanelGrid>
 
    <br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.valor_mes_total_demonstrativo}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
    
    <br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0" rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" cellpadding="0" cellspacing="0"  rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">	
		<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}"
							var="result" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro,alinhamento_centro, alinhamento_centro, alinhamento_direita, alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="100%">
							<t:column width="25px" style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
							      <br:brOutputText value="" escape="false" />
							    </f:facet>		
								<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems value="#{valorMesTotalBean.listaControleCheckRadio}"/>
								</t:selectOneRadio>
						    	<t:radio for="sorLista" index="#{result.linha}"  />
							</t:column>
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;" rendered="#{!valorMesTotalBean.razaoExiste}">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_conta}"/>
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;height:23px;" rendered="#{valorMesTotalBean.razaoExiste}">
								<f:facet name="header">
									<h:outputText value="COSIF"/>
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							<t:column
								style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{valorMesTotalBean.razaoExiste}">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_razao}" />
								</f:facet>
								<br:brOutputText value="#{result.razao}" />
							</t:column>
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.valor_mes_total_receita}" />
								</f:facet>
								<br:brOutputText value="#{result.receita}"
									converter="decimalBrazillianConverter" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
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
	
	<br:brPanelGrid columns="3"  cellpadding="0" cellspacing="0"  rendered="#{!empty valorMesTotalBean.listaContasCompetencia.listaDemonstrativoISSDTO}">	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:250px;text-align:left">	
			<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.saldos_divergentes_total}" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>
   	    </br:brPanelGrid> 
	
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:250px;text-align:right">	
			<br:brPanelGroup>
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{valorMesTotalBean.totalReceita}" converter="decimalBrazillianConverter" style="padding-right:5px; padding-left:5px"/>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  style="width:250px;text-align:right">	
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
					action="#{valorMesTotalBean.voltar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>	
			
			<br:brPanelGrid columns="1" style="width:300px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>
				
			<br:brPanelGroup style="text-align:right;width:100%" >
				<br:brPanelGrid columns="3">
						<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguir2" action="#{valorMesTotalBean.carregaListaDemonstrativoConta}" value="#{msgs.consultarApuracaoParcial_btn_prossseguir}" disabled="true">
							<brArq:submitCheckClient/>
						</br:brCommandButton>			
					<br:brCommandButton id="btnPlanilhaEletronica"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.consultarApuracaoAliquotaZerada_botao_planilha_eletronica}"
						actionListener="#{valorMesTotalBean.imprimirPlanilhaEletronica}"
						onclick="desbloqTela();">
						<brArq:submitCheckClient />
					</br:brCommandButton>
					<br:brCommandButton id="btnImprimir"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.consultarApuracaoAliquotaZerada_botao_planilha_imprimir}"
						actionListener="#{valorMesTotalBean.imprimir}"
						onclick="desbloqTela();"
						style="margin-left:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGrid>
			</br:brPanelGroup>
		</br:brPanelGrid>	
  </br:brPanelGrid>
  <f:verbatim>
<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'valorMesTotalForm:btnProsseguir2'){
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
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
