<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="apurcaoParcialISSForm" name="apurcaoParcialISSForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoParcial_label_informacoes_pesquisa_apuracao}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_competencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.competencia}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_dependencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.dependencia}" />
		</br:brPanelGroup>	
				
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_descricao}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.descricao}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_base_calculo}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.baseCalculo}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_aliquota_padrao}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.aliquotaPadrao}" />
		</br:brPanelGroup>	
				
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_tipo_incidencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.tipoIncidencia}" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_solicitacao}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.solicitacao}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_data_solicitacao}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.dataSolicitacao}" />
		</br:brPanelGroup>	
				
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:20px"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoParcial_label_data_processamento}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.dataProcessamento}" />
		</br:brPanelGroup>		

		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>


	
	
	<br:brPanelGrid id="panelDataTable" columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{consultarApuracaoParcialBean.listaApuracaoParcialConta != null}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{consultarApuracaoParcialBean.listaApuracaoParcialConta}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_direita, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="100%" >
			  <t:column width="10%" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="COSIF" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}"/>
			  </t:column>
			  <t:column width="5%" style="padding-right:5px; padding-left:5px;text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_razao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.razao}"/>
			  </t:column>
			  <t:column width="10%" style="padding-right:5px; padding-left:5px;text-align:center" >
			    <f:facet name="header">
			      <br:brOutputText value="Conta" />
			    </f:facet>
			    <br:brOutputText value="#{result.conta}"/>
			  </t:column>
			  <t:column width="10%" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_movimento}" />
			    </f:facet>
			    <br:brOutputText value="#{result.movimento}"/>
			  </t:column>	
			  	
			  <t:column width="10%" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_tributavel}" />
			    </f:facet>
			    <br:brOutputText value="#{result.tributavel}"/>
			  </t:column>
			  <t:column width="5%" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_aliquota}" />
			    </f:facet>
			    <br:brOutputText value="#{result.aliquota}"/>
			  </t:column>				  
			  	  
			  <t:column width="10%" style="padding-right:5px; padding-left:5px;text-align:right">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_label_iss}" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorIss}"/>
			  </t:column>
			  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5"  cellpadding="0" cellspacing="1"  rendered="#{consultarApuracaoParcialBean.listaApuracaoParcialConta != null}" width="100%" border="0">	
	
			<br:brPanelGroup >
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.saldos_divergentes_total}" style="width:270px;"/>	
			</br:brPanelGroup>
   	  
		
			<br:brPanelGroup  >
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoParcialBean.totalMovimentoConta}" style="text-align:right; width:110px;"/>	
			</br:brPanelGroup>	
	
			<br:brPanelGroup >
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoParcialBean.totalTributavelConta}" style="text-align:right; width:110px;"/>	
			</br:brPanelGroup>	
	
			<br:brPanelGroup >
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" style="width:40px;"/>	
			</br:brPanelGroup>
		

			<br:brPanelGroup >
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoParcialBean.totalISSFinalConta}" style="text-align:right; width:100px;"/>	
			</br:brPanelGroup>	
	
	</br:brPanelGrid>
	
	<br:brPanelGroup style="height: 10px" />
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" id="Paginacao" rendered="#{consultarApuracaoParcialBean.listaApuracaoParcialConta != null}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable"   >
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

	<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnVoltar" value="#{msgs.consultarApuracaoParcial_label_voltar}" action="AVANCAR_APURACAO_PARCIAL">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>
<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apurcaoParcialISSForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'apurcaoParcialISSForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apurcaoParcialISSForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
