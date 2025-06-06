<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="listaTarifasCobradasForm" name="listaTarifasCobradasForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
				
		<br:brPanelGroup >
				<t:div styleClass="barraDeRolagem"  >
						<t:dataTable id="dataTable"
							value="#{listaTarifasCobradasBean.lista}" var="result"
							 cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="100%">
							<f:verbatim>
							</f:verbatim>
							<t:column width="30px">
								<f:facet name="header">
									<t:selectBooleanCheckbox id="todos"
										styleClass="HtmlSelectOneRadioBradesco"
										value="#{listaTarifasCobradasBean.checkTodosIncluir}">
										<a4j:support event="onclick"
											onsubmit="checkGrid(document.forms[1],this);" />
									</t:selectBooleanCheckbox>
								</f:facet>
								<t:selectBooleanCheckbox id="sor"
									styleClass="HtmlSelectOneRadioBradesco"
									value="#{result.checkGridIncluir}">
									<f:selectItems
										value="#{listaTarifasCobradasBean.listaControleCheckRadio}" />
									<a4j:support event="onclick"
										onsubmit="javascript:limparCamposGrid(document.forms[1]);" />
								</t:selectBooleanCheckbox>
							</t:column>
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_codigo_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.codigoPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;text-align:center">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_nome_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.nomePa}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px;text-align:center">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_municipio_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.municipioPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_uf_pa}" />
								</f:facet>
								<br:brOutputText value="#{result.ufPa}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_juncao_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.agenciaRelacionamento}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_nome_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.nomeAgencia}" />
							</t:column>
							
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_municipio_agencia_relacionamento}" />
								</f:facet>
								<br:brOutputText value="#{result.municipioAgRelacionamento}" />
							</t:column>
							
							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_total_receita_periodo}" />
								</f:facet>
								<br:brOutputText value="#{result.receita}" />
							</t:column>
							
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	
	<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
		
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px">
				<br:brCommandButton id="botao_voltarII" 
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_voltar}" action="tarifasCobradas"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:500px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100%" >
		<br:brPanelGrid columns="3">
			<br:brCommandButton id="botao_exportar_planilha_eletronica"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_exportar_planilha_eletronica}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
			<br:brCommandButton id="botao_exportar_txt"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_exportar_txt}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
			<br:brCommandButton id="botao_impressao_pdf"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.botao_impressao_pdf}" 
				onclick="desbloqTela();" style="margin-left:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			
		</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
</br:brPanelGrid>		
  
 <f:verbatim> 
<script language="javascript">
	var form = document.forms[1];

	var objTodos = document.getElementById('listaTarifasCobradasForm:dataTable:todos');
   	if (objTodos != null && objTodos.checked) {
		var objInputs = document.getElementsByTagName("input");
		if (objInputs != null) {
			for (var i = 0; i < objInputs.length; i++) {
				if (objInputs[i].id.indexOf("sor") > -1) {
					objInputs[i].checked = true;
				}
			}
		}
   	}

  function checkGrid(form, checkbox){
	 var checado = false;
	 var hidden;
	 
	 for(i=0; i<form.elements.length; i++){
		 if (form.elements[i].name == 'listaTarifasCobradasForm:dataTable:todos')
		 	checado = form.elements[i].checked;
		 
		 if (form.elements[i].type == 'checkbox')
	     	 form.elements[i].checked = checado;
	     
	     //Limpeza dos campos caso Checkbox for False	 
	     if (form.elements[i].type == 'text'){
	     	if (checado == false)
	     		form.elements[i].value = '';
	     }	 	
	}	
  }
  
  function limparCamposGrid(form){
		 var checado = false;
		 var indexDataTable = 0;
		 
		 for(i=0; i<form.elements.length; i++){
		 	 //Testo se o registro em foco foi checado
			 if (form.elements[i].name == ('listaTarifasCobradasForm:dataTable_' + indexDataTable + ':sor')){
		     	 checado = form.elements[i].checked;
		     }	 

	         //Vamos testar se o registro foi checado, caso positivo testamos se os dados foram preenchidos
			 if ( (form.elements[i].name == ('listaTarifasCobradasForm:dataTable_' + indexDataTable + ':txtItemLei') ) ){
			 	   indexDataTable++;
				   if ( checado == false ) {
				   		form.elements[i].value = '';
				   		var objTodos = document.getElementById('listaTarifasCobradasForm:dataTable:todos');
						if (objTodos != null) {
							objTodos.checked = false;
				   		}
				   }
			  }		 	   
	  	}
	  }	  
  
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>