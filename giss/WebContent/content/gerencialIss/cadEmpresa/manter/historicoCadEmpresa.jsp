<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="manterCodLancamentoForm" name="manterCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{empresaISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

 
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
				value="#{msgs.label_iss_gerencial_codigo_empresa}:" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
				value="#{msgs.label_iss_gerencial_cnpj_empresa}:" />
		</br:brPanelGroup>
		<br:brPanelGroup style="width:20px; margin-bottom:5px">
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brInputText size="17" maxlength="5" id="txtCodigo"
				value="#{empresaISSBean.dtoHistorico.codEmpresa}"
				onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText id="cnpj" maxlength="18" size="25"
				onfocus="loadMasks()" alt="cnpj"
				onkeypress="return validaTecla('0123456789', event)"
				value="#{empresaISSBean.dtoHistorico.cnpjFormatado}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
	   
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_data_atualizacao}:"/>
		</br:brPanelGroup>
		
		
		<br:brPanelGroup>
			<app:calendar id="calendarioDe"
					value="#{empresaISSBean.dtoHistorico.dataAtualizacao}">
					<brArq:commonsValidator type="required"
						message="#{msgs.error_data_inicio_message}"
						arg="#{msgs.error_data_inicio_message}" server="false"
						client="true" />
				</app:calendar>  
	    </br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_pesquisar}" action="#{empresaISSBean.pesquisarHistorico}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{empresaISSBean.mostrarListaEmpresa}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0"  rendered="#{empresaISSBean.mostrarListaEmpresa}">
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectOneRadio id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{empresaISSBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{empresaISSBean.selectItemCadastro}" />
		</t:selectOneRadio>
		<t:div  style="overflow-Y:scroll; height:390;display:block"  rendered="#{empresaISSBean.mostrarListaEmpresa}">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{empresaISSBean.dtoHistorico.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >			
			  <t:column width="25px" >
				<f:facet name="header">
			    
			    </f:facet>		
			  
		    	<t:radio index="#{indexLista}" for=":manterCodLancamentoForm:checkboxRegistro"/>
			  </t:column>
			  <t:column width="80px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_codigo_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codEmpresa}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="300px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_nome_empresa}" style="margin-left:8 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.nomeEmpresa}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="80px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_status}" style="margin-left:8 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100x">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_funcional}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codFuncao}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="190px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_atualizacao}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataManutencaoFormatada}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			   
		</t:dataTable>	
		
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
 		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0"  rendered="#{empresaISSBean.mostrarListaEmpresa}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_DET_CAD_EMP">
				<br:brCommandButton id="btnDetalhar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_detalhar}" action="#{empresaISSBean.inicializarDetHistorico}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>
function setHiddenProssegue(form, flag){	
	var hidden;	
	
	for(i=0; i<form.elements.length; i++)
	{
			
		if (form.elements[i].id == 'manterCodLancamentoForm:hiddenProsseguir'){		
			hidden = form.elements[i];
			hidden.value = flag;				
		}		
	}	
}
</script>
 </f:verbatim>

</brArq:form>