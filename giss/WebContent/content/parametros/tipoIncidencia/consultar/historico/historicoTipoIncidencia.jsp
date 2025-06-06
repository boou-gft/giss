<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="historicoTipoIncidenciaForm" name="historicoTipoIncidenciaForm" >
<h:inputHidden id="hiddenRadio" value="#{tipoIncidenciaBean.itemSelecionadoLista}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
	
	<br:brPanelGroup>
		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.historico_conta_contabil_periodo}:" />
	</br:brPanelGroup>		
	
	<br:brPanelGroup>
		<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGroup>	
	
	<br:brPanelGroup>
		<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px" value="#{msgs.historico_conta_contabil_label_de}"/>
		 	<app:calendar  id="calendarioDe" value="#{tipoIncidenciaBean.dataInicialHist}">	
			 	<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_incidencia_periodo_inicial}" server="false" client="true"/>
		 	</app:calendar>
		<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.historico_conta_contabil_label_ate}"/>
			<app:calendar  id="calendarioAte" value="#{tipoIncidenciaBean.dataFinalHist}">
				<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_incidencia_periodo_final}" server="false" client="true"/>
		 	</app:calendar>
		</br:brPanelGroup>				
	</br:brPanelGrid>	
		
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparDados" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_limpar}" action="#{tipoIncidenciaBean.limparDadosHistorico}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnProsseguir" onclick="javascript: return validateForm(document.forms[1]);" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_prosseguir}" actionListener="#{tipoIncidenciaBean.carregaListaHistoricoTipoIncidencia}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{tipoIncidenciaBean.carregaHistorico}">	
		<br:brPanelGroup style="width:750px">	
		<t:dataTable id="dataTable" value="#{tipoIncidenciaBean.listaTipoIncidenciaHistorico}" var="result" 
			rows="50" cellspacing="1" cellpadding="0" 
			rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_direita, alinhamento_esquerda, alinhamento_direita, 
			alinhamento_direita, alinhamento_direita, alinhamento_esquerda" 
			headerClass="tabela_celula_destaque_acentuado">			
			  <t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitaBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{tipoIncidenciaBean.listaControle}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>			  
			  <t:column width="84px" style="padding-right:5px; padding-left:8px; height:23px ">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_tipo_incidencia_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}"/>
			  </t:column>
			  <t:column width="320px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_conta_contabil_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="float:left; margin-left:5 px;"/>
			  </t:column>			 
			   <t:column width="70px" style="padding-right:5px; padding-left:8px">
			    <f:facet name="header">
			      <br:brOutputText style="padding-left:10px" value="#{msgs.historico_conta_contabil_grid_atualizacao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.atualizacao}"/>
			  </t:column>
			   <t:column width="70px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_conta_contabil_grid_alteracao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.alteracao}" />
			  </t:column>
			   <t:column width="70px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_conta_contabil_grid_exclusao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.exclusao}" />
			  </t:column>
			   <t:column width="150px" style="text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_funcional}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoFuncional}"/>
			  </t:column>				  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" width="750px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{tipoIncidenciaBean.carregaHistorico}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{tipoIncidenciaBean.paginarPesquisaHistorico}" rendered="#{tipoIncidenciaBean.listaTipoIncidenciaHistorico != null && tipoIncidenciaBean.mostraBotoes}">
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
	
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" style="text-align:right;" rendered="#{tipoIncidenciaBean.carregaHistorico}">	
		<br:brPanelGrid columns="1" style="width:550px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>		
		<br:brPanelGroup style="text-align:right;" >
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_consultar}" action="#{tipoIncidenciaBean.prosseguirResultadoConsultaHistorico}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
		
<f:verbatim>
<script>

	function habilitaBotoes(form, radio) {
		document.getElementById("historicoTipoIncidenciaForm:btnConsultar").disabled=false;
		document.getElementById("historicoTipoIncidenciaForm:hiddenRadio").value = radio.value;
	}

</script>	
</f:verbatim>	
	
  </br:brPanelGrid>
		<brArq:validatorScript functionName="validateForm"/>
 </brArq:form>