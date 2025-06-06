<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>


<brArq:form id="consultarApuracaoAliquotaZeradaForm" name="consultarApuracaoAliquotaZeradaForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_competencia}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAliquotaZeradaBean.valoresTabela1.dataApuracao}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_dependencia}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAliquotaZeradaBean.valoresTabela1.dependencia}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_descricao}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAliquotaZeradaBean.valoresTabela1.descricao}"/>
		</br:brPanelGroup>		
		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

		<f:verbatim> <br> </f:verbatim> 
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_resultado_pesquisa}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{consultarApuracaoAliquotaZeradaBean.listResultados}" var="result" rows="50" cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda" headerClass="tabela_celula_destaque_acentuado" width="750px">
			  <t:column width="148px" rendered="#{!consultarApuracaoAliquotaZeradaBean.razaoExiste}">
			    <f:facet name="header">
			    	<br:brOutputText value="#{msgs.consultarApuracaoParcial_label_conta}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"/>
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}" styleClass="tableFontStyle" style="float:center;"/>
			  </t:column>
			  <t:column width="148px" rendered="#{consultarApuracaoAliquotaZeradaBean.razaoExiste}">
			    <f:facet name="header">
			      	<br:brOutputText value="COSIF" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;" rendered="#{consultarApuracaoAliquotaZeradaBean.razaoExiste}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}" styleClass="tableFontStyle" style="float:center;"/>
			  </t:column>
			  <t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarApuracaoAliquotaZeradaBean.razaoExiste}">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoAliquotaZerada_label_razao}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.razao}" styleClass="tableFontStyle" style="float:center;"/>
			  </t:column>
			  <t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarApuracaoAliquotaZeradaBean.razaoExiste}">
			    <f:facet name="header">
			      <br:brOutputText value="Conta"/>
			    </f:facet>
			    <br:brOutputText value="#{result.conta}" styleClass="tableFontStyle" style="float:center;"/>
			  </t:column>
			  <t:column width="350px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.consultarApuracaoAliquotaZerada_label_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="float:left;"/>
			  </t:column>
			  <t:column width="250px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.receitaValor}" styleClass="tableFontStyle" style="float:right;" converter="decimalBrazillianConverter"/>
			  </t:column>  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" rendered = "#{!empty consultarApuracaoAliquotaZeradaBean.listAliquotaZerada}">	
		
		<br:brPanelGroup style="margin-left:32px;width:375px">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_label_total_geral}:"/>
		</br:brPanelGroup>	

		<br:brPanelGroup style="text-align:right;width:342px">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAliquotaZeradaBean.totalGeralResultado}" converter="decimalBrazillianConverter"/>
		</br:brPanelGroup>	
		
	</br:brPanelGrid>	
		
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{consultarApuracaoAliquotaZeradaBean.paginarResultado}" rendered="#{consultarApuracaoAliquotaZeradaBean.listResultados!= null && consultarApuracaoAliquotaZeradaBean.mostraBotoesResultado}">
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
	
<br:brPanelGrid width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.consultarApuracaoAliquotaZerada_botao_voltar}" action="#{consultarApuracaoAliquotaZeradaBean.voltar2}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
 		
</br:brPanelGrid>

	<f:verbatim>
	
<script language="javascript">

	for(i=0; i<document.forms[1].elements.length; i++)
	{
		if (document.forms[1].elements[i].id == 'consultarApuracaoAliquotaZeradaForm:competencia.day'){
			document.forms[1].elements[i].style.visibility="hidden";
		}	
	}	

</script> 
</f:verbatim> 
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
