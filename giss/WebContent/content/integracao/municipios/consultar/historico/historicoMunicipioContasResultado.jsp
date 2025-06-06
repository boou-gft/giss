<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="historicoMunicipioContasResultadoForm" name="historicoMunicipioContasResultadoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" > 
	  <br:brPanelGroup> 
		</br:brPanelGroup> 
  	</br:brPanelGrid>	    		
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacoes_municipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigo}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_nome}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descricao}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.estado}" /> 
		</br:brPanelGroup>
		  <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.percentualAliquotaMunicipio}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacoes_conta}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_tipo_servico}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.tipoServico}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_municipios_conta_label_conta}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.conta}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_municipios_conta_label_razao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.razao}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_municipios_conta_label_codigo_tributo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigoTributo}" />
		</br:brPanelGroup>		 
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{historicoMunicipioBean.mostraContasTipoServico}">
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_title_incluir_manterTipoIncidencia_resultadoPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid> 

	<br:brPanelGrid columns="1" width="440px" cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup>	
		<t:dataTable id="dataTable" value="#{historicoMunicipioBean.listaHistoricoMunicipioContaResutltado}" var="result" 
			rows="50" cellspacing="1" cellpadding="0" 
			rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda" 
			headerClass="tabela_celula_destaque_acentuado" width="440px" >			
			  <t:column width="100px" style="padding-right:5px; padding-left:5px; height:23px ">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_conta_resultado_grid_aliquota}" />
			    </f:facet>
			    <br:brOutputText value="#{result.aliquota}"/>
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_conta_resultado_grid_inicio}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.inicio}"/>
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_conta_resultado_grid_termino}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.termino}" />
			  </t:column>			  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" width="440px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{historicoMunicipioBean.pesquisarContasMunicípio}" rendered="#{historicoMunicipioBean.listaHistoricoMunicipioContaResutltado != null && historicoMunicipioBean.mostraBotoes}">
			   
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
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_voltar}" action="#{historicoMunicipioBean.voltarContas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>
	</br:brPanelGrid>
 
    
    <br:brPanelGrid columns="1" style="height:400px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
    
  </br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm"/>
 </brArq:form>
