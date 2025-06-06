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
<h:inputHidden id="hiddenRadio" value="#{apuracaoMensalDiferenciadaBean.radioTelaDependencia}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
		
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_title_informacoes_para_processamento}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
		
  	</br:brPanelGrid>	
  	
  	<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
		</br:brPanelGroup>
				
		<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />
				
		</br:brPanelGroup>
		
		<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />
				
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.estado} "></br:brOutputText>			
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.municipio} "></br:brOutputText>	
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{apuracaoMensalDiferenciadaBean.competencia}"></br:brOutputText>	
		</br:brPanelGroup>
  	</br:brPanelGrid>	
  	 
  	
  	<f:verbatim><hr class="lin"> </f:verbatim>
	 
 	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="true">	
	 <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_apuracaoMensalDiferenciada_secondBall_resultado_da_pesquisa}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid id="panelListaMunicipios" columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">		
			<t:dataTable id="dataTable" value="#{apuracaoMensalDiferenciadaBean.listaPesquisa}" var="result" 
				rows="50" cellspacing="1" cellpadding="0" 
				rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, 
				alinhamento_esquerda" 
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
				    <t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{apuracaoMensalDiferenciadaBean.listaControleCheckRadioPesquisa}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />
				</t:column>
				
				  <t:column width="120px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
				    </f:facet>
				    <br:brOutputText value="#{result.dependencia}"/>
				  </t:column>
				  
				  <t:column width="300px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText style="width:100%; text-align:left; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_label_descricao}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.descricao}"/>
				  </t:column>
				  
				  <t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText style="width:100%; text-align:left; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_label_receita}"  />
				    </f:facet>
				    <br:brOutputText style="align:right" style="width:100%;text-align:right" value="#{result.receita}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  
				  <t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText style="width:100%; text-align:left; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_label_iss}"  />
				    </f:facet>
				    <br:brOutputText style="width:100%;text-align:right" value="#{result.issRecolher}" converter="decimalBrazillianConverter"/>
				  </t:column>
				  
				</t:dataTable>	 
		</br:brPanelGroup>
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" rendered="true">	
		<br:brPanelGroup style="width: 450px">
		<br:brOutputText style="align:left; margin-left:5" styleClass="HtmlOutputTextRespostaBradesco" value="Total Município"></br:brOutputText>
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 150px; text-align:right; padding-right:5px;">
		<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"  value="#{apuracaoMensalDiferenciadaBean.totalReceita}"/>
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 150px; text-align:right; padding-right:5px;">
		<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{apuracaoMensalDiferenciadaBean.totalIss}"></br:brOutputText>
		</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<br:brPanelGroup style="height: 10px" />
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" id="Paginacao">	
		<br:brPanelGroup>
		
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{apuracaoMensalDiferenciadaBean.paginarResultadoPesqApuracaoMensalDiferenciada}" >
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
			
		</br:brPanelGrid> 
		
		<f:verbatim><hr class="lin"> </f:verbatim>
  	
  	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >
  	<br:brPanelGroup style="text-align:left;width:100%"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoMensalDiferenciada_btn_voltar}" action="#{apuracaoMensalDiferenciadaBean.voltar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="text-align:right;width:100%"  >
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" disabled="true" value="#{msgs.apuracaoMensalDiferenciada_btn_consultar}" action="#{apuracaoMensalDiferenciadaBean.consultar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid> 
	
		</br:brPanelGrid>
 	</br:brPanelGrid>
 	
 	<f:verbatim>

<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apuracaoMensalDiferenciada:btnConsultar'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'apuracaoMensalDiferenciada:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaBotaoConsultar(){
		
		var combo = document.getElementById("apuracaoMensalDiferenciada:comboEstado").value;
				
				
				if( (combo>0))
				document.getElementById("apuracaoMensalDiferenciada:btnConsultar").disabled = "";

	}
	
	/*function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apurcaoParcialISSForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}*/
	
</script>
</f:verbatim>
 	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>