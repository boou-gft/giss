<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirTipoIncidenciaForm" name="incluirTipoIncidenciaForm" >
	<br:brPanelGrid columns="1" width="750px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="height:2px;" />
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" styleClass="mainPanel"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_consultar_manterTipoIncidencia}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup style="height:2px;" />
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="" value="#{msgs.label_consultar_codigo_manterTipoIncidencia}:" />
					
						<br:brPanelGroup style="width:5px;" >
						</br:brPanelGroup>
						
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.codigo}" />	
				
						<br:brPanelGroup style="width:34px;" >
						</br:brPanelGroup>
				
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
					<br:brOutputText styleClass="" value="#{msgs.label_consultar_descricao_manterTipoIncidencia}:"/>
					
					<br:brPanelGroup style="width:5px;" >
					</br:brPanelGroup>
						
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.descricao}" />
					
					<br:brPanelGroup style="width:34px;" />
				
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText styleClass="" value="#{msgs.label_consultar_vigencia_manterTipoIncidencia}:"/>
					
					<br:brPanelGroup style="width:5px;" />
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.datainiciovigenciadesc} a #{tipoIncidenciaBean.datafinalvigenciadesc}" />
						
				</br:brPanelGroup>		
		</br:brPanelGrid>
		
						
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="" value="#{msgs.path_consultar_manterTipoIncidencia_faixaValores}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><br /> </f:verbatim>
				
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
						
			<t:dataTable id="dataTable" value="#{tipoIncidenciaBean.listaFaixasTipoIncidencia}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" border="0" width="750px">
			
			 <t:column width="180px" >
				<f:facet name="header">
			      <br:brOutputText value="#{msgs.label_valorInicial_tipo_incidencia}" style="float:center;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_consultar_cifrao_manterTipoIncidencia}" />
				<br:brOutputText value="#{result.valorinicial}" style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			</t:column>
			    
			  <t:column width="180px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_valorFinal_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_consultar_cifrao_manterTipoIncidencia}" />
			    <br:brOutputText value="#{result.valorfinal}"  style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			  </t:column>
			  
			  <t:column width="180px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_aliquota_tipo_incidencia}"style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valoraliquota}" style="margin-left:60 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			    <br:brOutputText style="margin-left:5 px;" value="#{msgs.label_consultar_porcentagem_manterTipoIncidencia}" />
			  </t:column>
			  
			  <t:column width="180px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_redutor_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_consultar_cifrao_manterTipoIncidencia}" />
			    <br:brOutputText value="#{result.valorRedutor}" style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			  </t:column>		
			</t:dataTable>	
				
		</br:brPanelGroup>
	</br:brPanelGrid>	
			
		
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="text-align:left">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_voltar_consultar_manterTipoIncidencia}" action="voltar_mantertipoincidencia" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>