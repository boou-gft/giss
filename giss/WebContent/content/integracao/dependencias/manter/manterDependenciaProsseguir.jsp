<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterDependenciaProsseguirForm" name="manterDependenciaProsseguirForm" >
<h:inputHidden id="hiddenRadio" value="#{dependenciaBean.codListaPesquisar}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="750px" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:750px">
		<t:div styleClass="barraDeRolagem">
		<t:dataTable id="dataTable" value="#{dependenciaBean.listaDependenciasMunicipio}" var="result" 
			cellspacing="1" cellpadding="0" 
			rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, 
			alinhamento_esquerda" 
			headerClass="tabela_celula_destaque_acentuado" width="750px"
			style="width:100%">
			<t:column width="25px" style="height: 20px; padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value=""  escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:radioGridPesquisa(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{dependenciaBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}" rendered="#{result.codigoDependencia != '0'}" />
			</t:column>
			  <t:column width="90px" style="padding-right:5px; float:center; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_prosseguir_grid_dependencia}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoDependencia}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="320px" style="padding-right:5px; float:center; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_prosseguir_grid_descricao}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.descricaoDependencia}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			  </t:column>
			<t:column width="350px" style="padding-right:5px; float:center; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_prosseguir_label_municipio}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio} - #{result.descMunicipio}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			</t:column>
			<t:column width="350px" style="padding-right:5px; float:center; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_prosseguir_label_estado}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.codUF} - #{result.descUF}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			</t:column>
			  <t:column width="100px" style="padding-right:5px; float:center; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_prosseguir_grid_atualizacao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataAtualizacao}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			  </t:column>
			<t:column width="110px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="TRAG sem TRAG?" />
			    </f:facet>
			    <br:brOutputText value="#{result.tragSemTrag eq 'S' ? 'Sim' : 'Não'}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			</t:column>
			</t:dataTable>
			</t:div>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.manter_dependencia_prosseguir_btn_voltar}" action="#{dependenciaBean.voltarManterDependencia}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:507px">
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manter_dependencia_prosseguir_btn_alterar}" action="#{dependenciaBean.alterarDependenciaManter}" disabled="true" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>				
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnExcluir" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" value="#{msgs.manter_dependencia_prosseguir_btn_excluir}" action="#{dependenciaBean.excluirDependenciaManter}" disabled="true" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" value="#{msgs.manter_dependencia_prosseguir_btn_consultar}" action="#{dependenciaBean.consultarDependenciaManter}" disabled="true" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" style="margin-top:200px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>

<f:verbatim>

<script language="javascript">
		
	function radioGridPesquisa(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterDependenciaProsseguirForm:btnAlterar'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterDependenciaProsseguirForm:btnExcluir'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterDependenciaProsseguirForm:btnConsultar'){
				form.elements[i].disabled=false;
			}			
	
			if (form.elements[i].id == 'manterDependenciaProsseguirForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
</script>
</f:verbatim>


<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
