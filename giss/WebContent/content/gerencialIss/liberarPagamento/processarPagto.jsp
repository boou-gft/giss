<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterCodLancamentoForm" name="manterCodLancamentoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{processarPagtoISSBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{processarPagtoISSBean.selectItem}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll; height:390;display:block">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{processarPagtoISSBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="100%" >			
			  <t:column width="25px" >
				<f:facet name="header">
			      <t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{processarPagtoISSBean.checkTodos}">
						<a4j:support event="onclick" action="#{processarPagtoISSBean.atribuirTodos}" reRender="rolagem, dataTable,paginacao" />
					</t:selectBooleanCheckbox>
			    </f:facet>		
			  
		    	<t:checkbox index="#{indexLista}" for=":manterCodLancamentoForm:checkboxRegistro"/>
			  </t:column>	
			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codEmpresa}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.produto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_quantidade_registro}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.qtdeRegistro}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_iss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorReceita}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
	<f:verbatim><hr class="lin"> </f:verbatim>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="Contabilizar:" />
		</br:brPanelGroup>

		<t:selectOneRadio id="tipoPesquisa" value="#{processarPagtoISSBean.dto.indContabilizar}"
				 	styleClass="HtmlSelectOneRadioBradesco" >  
					<f:selectItem value="M" itemValue="M" itemLabel="Mês Atual" />
					<f:selectItem value="D" itemValue="D" itemLabel="Data Atual" />
			</t:selectOneRadio>
	</br:brPanelGrid>
	
	
 		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			
			<br:brCommandButton id="btnAlterar2" styleClass="HtmlCommandButtonBradesco" value="Processar" action="#{processarPagtoISSBean.processar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>