<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="excluirTipoIncidenciaForm" name="excluirTipoIncidenciaForm" >
	<br:brPanelGrid columns="1" width="750px" cellpadding="0" cellspacing="0">
		
		<br:brPanelGroup style="height:2px;" />
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" styleClass="mainPanel"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_excluir_manterTipoIncidencia}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup style="height:10px;" >
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="" value="#{msgs.label_excluir_codigo_manterTipoIncidencia}:" />
					
						<br:brPanelGroup style="width:5px;" >
						</br:brPanelGroup>
						
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.codigo}" />	
				
						<br:brPanelGroup style="width:34px;" >
						</br:brPanelGroup>
				
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
					<br:brOutputText styleClass="" value="#{msgs.label_excluir_descricao_manterTipoIncidencia}:"/>
					
					<br:brPanelGroup style="width:5px;" >
					</br:brPanelGroup>
						
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.descricao}" />
					
					<br:brPanelGroup style="width:34px;" />
				
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
					<br:brOutputText styleClass="" value="#{msgs.label_excluir_vigencia_manterTipoIncidencia}:"/>
					
					<br:brPanelGroup style="width:5px;" />
					
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{tipoIncidenciaBean.datainiciovigenciadesc} a #{tipoIncidenciaBean.datafinalvigenciadesc}" />
						
				</br:brPanelGroup>		
		</br:brPanelGrid>
		
		
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="" value="#{msgs.path_excluir_manterTipoIncidencia_faixaValores}:"/>
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
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_excluir_cifrao_manterTipoIncidencia}" />
				<br:brOutputText value="#{result.valorinicial}" style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco" />
			</t:column>
			    
			  <t:column width="180px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_valorFinal_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_excluir_cifrao_manterTipoIncidencia}" />
			    <br:brOutputText value="#{result.valorfinal}"  style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			  </t:column>
			  
			  <t:column width="180px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_aliquota_tipo_incidencia}"style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valoraliquota}" style="margin-left:60 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			    <br:brOutputText style="margin-left:5 px;" value="#{msgs.label_excluir_porcentagem_manterTipoIncidencia}" />
			  </t:column>
			  
			  <t:column width="180px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_redutor_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText style="margin-left:10 px;" value="#{msgs.label_excluir_cifrao_manterTipoIncidencia}" />
			    <br:brOutputText value="#{result.valorRedutor}" style="margin-left:15 px;" styleClass="HtmlOutputTextRespostaBradesco"/>
			  </t:column>		
			</t:dataTable>				
				
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
		<br:brPanelGrid columns="1" width="750px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{tipoIncidenciaBean.carregaHistorico}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{tipoIncidenciaBean.paginarFaixasHistorico}" rendered="#{tipoIncidenciaBean.listaFaixasTipoIncidencia != null && tipoIncidenciaBean.mostraBotoes}">
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
	
							
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="text-align:left">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_voltar_excluir_manterTipoIncidencia}" action="voltar_mantertipoincidencia" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
							
			<br:brPanelGroup style="width:635px;" >
			</br:brPanelGroup>
				
				<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_excluir_excluir_manterTipoIncidencia}" actionListener="#{tipoIncidenciaBean.excluirTipoIncidencia}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>