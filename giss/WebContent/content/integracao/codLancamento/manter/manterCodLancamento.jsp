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
<h:inputHidden id="hiddenProsseguir" value="#{codLancamentoBean.hiddenProsseguir}"/>
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
	
	  	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{codLancamentoBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{codLancamentoBean.listaControleRadio}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll; height:390;display:block">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{codLancamentoBean.dtoManter.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >			
			  <t:column width="25px" >
				<f:facet name="header">
			      <t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{codLancamentoBean.checkTodos}">
						<a4j:support event="onclick" action="#{codLancamentoBean.atribuirTodos}" reRender="rolagem, dataTable,paginacao" />
					</t:selectBooleanCheckbox>
			    </f:facet>		
			  
		    	<t:checkbox index="#{indexLista}" for=":manterCodLancamentoForm:checkboxRegistro" />
			  </t:column>
			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_lancamento}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codLancamento}"  style="margin-right:5 px; float:right;" escape="false"/>
			  </t:column>
			  <t:column width="200px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_seg_linha_extrato}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.segLinhaExtrato}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cosif}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_razao_conta_dig}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.razaoContaDig}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_nome_conta}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.nomeConta}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_item_lei_complementar}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codItem}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
 		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_alterar_tipo_servico}" action="#{codLancamentoBean.carregarAlterar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnExcluir" styleClass="HtmlCommandButtonBradesco" onclick="	
						if(!confirm('Deseja excluir o registro?')){
							setHiddenProssegue(document.forms[1],false);
						}else{
							setHiddenProssegue(document.forms[1],true);
					    };" value="#{msgs.label_botao_excluir_tipo_servico}" action="#{codLancamentoBean.excluir}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
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