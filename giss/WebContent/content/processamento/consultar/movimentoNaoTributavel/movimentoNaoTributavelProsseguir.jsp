<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%> 
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="movimentoNaoTributavelProsseguirForm" name="movimentoNaoTributavelProsseguirForm" >
<h:inputHidden id="hiddenRadio" value="#{movimentoNaoTributavelBean.itemSelecionadoListaDependencia}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_movimentoNaoTributavel_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.path_movimentoNaoTributavel_label_estado}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{movimentoNaoTributavelBean.estado}" />
			
			<br:brPanelGroup style="width: 60px;" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.path_movimentoNaoTributavel_label_municipio}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{movimentoNaoTributavelBean.municipio}" />
			
			<br:brPanelGroup style="width: 60px;" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.path_movimentoNaoTributavel_label_competencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{movimentoNaoTributavelBean.dataFormatada}" />
				
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_movimentoNaoTributavel_label_resultado_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
	
	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<t:div styleClass="barraDeRolagem">
		<br:brPanelGroup style="width:750px">	
			<t:dataTable id="dataTable" value="#{movimentoNaoTributavelBean.dependenciaTotal.listaMovNaoTribProsseguirDTO}" 
				var="result" cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita" 
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitaBotaoConsultar(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{movimentoNaoTributavelBean.listaRadioDependencia}"/>
					</t:selectOneRadio>
					<t:radio for="sorLista" index="#{result.linha}"  />
					
				</t:column>
				
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_dependencia}" />
				    </f:facet>
				  <br:brOutputText value="#{result.codDepPa}" style="float:left;"/>
				  </t:column>
				  
				  <t:column width="300px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_descricao}"  />
				    </f:facet>
				  <br:brOutputText value="#{result.descDepPa}" />
				  </t:column>
				  <%--
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_movimento}"/>
				    </f:facet>
				  <br:brOutputText value="#{result.movimento}" converter="decimalBrazillianConverter" />
				  </t:column>
				  --%>
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_receita}" /> 
				    </f:facet>
				  <br:brOutputText value="#{result.receita}" converter="decimalBrazillianConverter"/>
				  </t:column>				 
				</t:dataTable>	
		</br:brPanelGroup>
		</t:div>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" style="width:750px;height:20px">	
		<br:brPanelGroup style="width: 30px; text-align: center;" >
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 152px; text-align: center;" >
		</br:brPanelGroup> 
		<br:brPanelGroup style="width: 288px; " >
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Total das Agências Listadas:" style="margin-left:15px"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 170px; text-align: right;">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{movimentoNaoTributavelBean.totalApurAgencia}" converter="decimalBrazillianConverter"/>
		</br:brPanelGroup>
	
		<br:brPanelGroup style="width: 30px; text-align: center;" >
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 152px; text-align: center;" >
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 288px; " >
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Total dos PAs Listados:" style="margin-left:15px"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 170px; text-align: right;">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{movimentoNaoTributavelBean.totalApurPa}" converter="decimalBrazillianConverter"/>
		</br:brPanelGroup>
	
		<br:brPanelGroup style="width: 30px; text-align: center;" >
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 152px; text-align: center;" >
		</br:brPanelGroup>
	
		<br:brPanelGroup style="width: 288px;" >
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_movimentoNaoTributavel_label_total_municipio}:" style="margin-left:15px"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 170px; text-align: right;">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{movimentoNaoTributavelBean.receitaTotalMunicipio}" converter="decimalBrazillianConverter"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 30px; text-align: center;" >
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 152px; text-align: center;" >
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 288px;" >
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_movimentoNaoTributavel_label_total_geral}:" style="margin-left:15px"/>
		</br:brPanelGroup>	
	
		<br:brPanelGroup style="width: 170px; text-align: right;">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{movimentoNaoTributavelBean.receitaTotalGeral}" converter="decimalBrazillianConverter"/>
		</br:brPanelGroup>
	</br:brPanelGrid> 	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.path_movimentoNaoTributavel_botao_voltar}" action="#{movimentoNaoTributavelBean.voltarMovimentoNaoTributavel}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		<br:brPanelGroup style="text-align:right; width: 100%;">
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.path_movimentoNaoTributavel_botao_consultar}" action="#{movimentoNaoTributavelBean.movimentoNaoTributavelConsultar}" disabled="true">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>

  </br:brPanelGrid>
  
<f:verbatim> 
<script type="text/javascript">



function habilitaBotaoConsultar(form, radio){
		
	var botaoConsultar;
	var hidden;
	
		for(i=0; i<form.elements.length; i++)
		{
			
			
			if (form.elements[i].id == 'movimentoNaoTributavelProsseguirForm:btnConsultar'){
				botaoConsultar = form.elements[i];
			}								
			if (form.elements[i].id == 'movimentoNaoTributavelProsseguirForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	if ((hidden.value != '')){
		botaoConsultar.disabled = false;
	}
}


</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
