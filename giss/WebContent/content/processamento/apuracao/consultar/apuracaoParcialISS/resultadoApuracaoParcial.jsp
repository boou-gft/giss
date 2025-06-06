<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="resultadoApurcaoParcialISSForm" name="resultadoApurcaoParcialISSForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoParcialBean.radioTelaResultado}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoParcial_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_estado}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_municipio}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_periodo}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.nomeEstado}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.nomeMunicipio}" style="margin-left:20px"/>
		</br:brPanelGroup>
			
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.dataPerido}" style="margin-left:20px"/>
		</br:brPanelGroup>

	</br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>

	
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
		<br:brPanelGroup>
		<t:div styleClass="barraDeRolagem">
			<t:dataTable id="dataTable" 
				value="#{consultarApuracaoParcialBean.listaDependenciaParcial}" 
				var="result" cellspacing="1" cellpadding="0"
				rowIndexVar="apuracaoKey"
				rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				<t:column width="30px">
					<f:facet name="header">
						<br:brOutputText value="" escape="false" />
					</f:facet>
					<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems value="#{consultarApuracaoParcialBean.listaControleCheckRadio}"/>
					</t:selectOneRadio>
		    		<t:radio for="sorLista" index="#{result.linha}"  />
				</t:column>
				<t:column width="100px"
							style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_dependencia}" />
				    </f:facet>
				    <br:brOutputText value="#{result.codDepPa}"/>
				</t:column>
			  	<t:column width="320px"
							style="padding-right:5px; padding-left:5px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultarApuracaoParcial_label_descricao}" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descDepPa}"/>
			  	</t:column>			
			   <t:column width="150px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="Receita" />
			    </f:facet>
			    <br:brOutputText value="#{result.receita}"/>
			  </t:column>			  
			   <t:column width="150px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_iss_a_recolher}" />
			    </f:facet>
			    <br:brOutputText value="#{result.ISSRecolher}"/>
			  </t:column>			    
			</t:dataTable>
		</t:div>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" style="padding-right:5px; padding-left:5px">
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Total das Agências Relacionadas:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalReceita}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalRecolher}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Total dos PAs Relacionados:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalReceitaPa}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalRecolherPa}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_total_geral}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalReceitaGeral}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoParcialBean.totalRecolherGeral}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>
	

	<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0" columns="2">
		<br:brPanelGroup style="text-align:left">
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnVoltar" value="#{msgs.consultarApuracaoParcial_label_voltar}" action="#{consultarApuracaoParcialBean.voltar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguir" action="#{consultarApuracaoParcialBean.avancarApuracaoParcial}" value="#{msgs.consultarApuracaoParcial_btn_prossseguir}" disabled="true" rendered="#{consultarApuracaoParcialBean.listaDependenciaParcial != null}" style="margin-left: 610px;">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
		
	</br:brPanelGrid>
	
</br:brPanelGrid>
<f:verbatim>

<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'resultadoApurcaoParcialISSForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'resultadoApurcaoParcialISSForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'resultadoApurcaoParcialISSForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
