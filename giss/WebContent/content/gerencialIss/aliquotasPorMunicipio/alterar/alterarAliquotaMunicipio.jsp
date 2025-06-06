<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterAliquotaForm" name="manterAliquotaForm" >
<h:inputHidden id="hiddenProsseguir" value="#{aliquotaISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
  <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_estado}:" />
		</br:brPanelGroup>	
	
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage  url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:"/>
		</br:brPanelGroup>
		
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_municipio}:"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
    		<br:brInputText id="descEstado" maxlength="5" size="25" value="#{aliquotaISSBean.dtoAlterar.estado}" onkeypress="return validaTecla('0123456789', event);"  disabled="true"/>  
		</br:brPanelGroup>		
						
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>			
		
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="15" value="#{aliquotaISSBean.dtoAlterar.codMunicipio}" onkeypress="return validaTecla('0123456789', event);"  disabled="true"/>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText id="inputMunicipio" maxlength="70" size="40" value="#{aliquotaISSBean.dtoAlterar.descMunicipio}" disabled="true"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
	    		<br:brInputText size="6" maxlength="4" id="txtAliquotaPadrao"  value="#{aliquotaISSBean.dtoAlterar.aliquota}" disabled="true"/>  
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_iss_gerencial_informacao_item_lc}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_lc}:"/>
		</br:brPanelGroup>
		
		
		
		<br:brSelectOneMenu style="width:180px" id="descItemServico" value="#{aliquotaISSBean.dtoAlterar.codLeiCompl}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItems value="#{aliquotaISSBean.selectItemServico}"/>
			</br:brSelectOneMenu>
		
		
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			
			<br:brCommandButton id="btnPesquisarLC" styleClass="HtmlCommandButtonBradesco" 
				  value="Pesquisar Item LC" action="#{aliquotaISSBean.listarLcAliquota}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{aliquotaISSBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{aliquotaISSBean.selectItemLei}" />
		</t:selectManyCheckbox>
		
		<t:div  style="overflow-Y:scroll; height:275;display:block">
					
		<t:dataTable id="dataTable" value="#{aliquotaISSBean.dtoAlterar.listaAlterar}" var="result"  rowIndexVar="linha"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_centro"
			headerClass="tabela_celula_destaque_acentuado" width="750px">	
			   <t:column width="25px" >
				<f:facet name="header">
			      <t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{aliquotaISSBean.checkTodos}">
						<a4j:support event="onclick" action="#{aliquotaISSBean.atribuirTodos}" reRender="dataTable" />
					</t:selectBooleanCheckbox>
			    </f:facet>		
			  
		    	<t:checkbox index="#{linha}" for=":manterAliquotaForm:checkboxRegistro"/>
			  </t:column>		
			  <t:column width="625px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_lc}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.descLeiCompl}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_aliquota}"/>
			    </f:facet>
			    <br:brInputText id="aliquota" maxlength="4" size="8" value="#{result.aliquota}" onblur="vNumero(this,'9(1)V99')"/>   
			  </t:column>
			 
			</t:dataTable>	
			</t:div>	
		
		
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0">	
	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup style="text-align:left;width:150px"  >
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="manterAliquotaMunicipio" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
			<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>	
			
			<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" onclick="	
								if(!confirm('Deseja Alterar a(s) Aliquota(s)?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };"
				  value="Alterar Aliquotas" action="#{aliquotaISSBean.alterarListaAliquota}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
			
		</br:brPanelGrid>
		
	</br:brPanelGrid>
	<br:brCommandButton style="visibility: hidden" id="botaoCombo" action="#{aliquotaISSBean.atualizaComboItemServico}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>


<f:verbatim>
<script language="javascript">
function clicarBotao(){
	document.getElementById('manterAliquotaForm:botaoCombo').click();
}
	function habilitaBotoes(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterAliquotaForm:btnAlterar'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterAliquotaForm:btnExcluir'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterAliquotaForm:btnConsultar'){
				form.elements[i].disabled=false;
			}								
			if (form.elements[i].id == 'manterAliquotaForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function setHiddenProssegue(form, flag){	
		var hidden;	
		
		for(i=0; i<form.elements.length; i++)
		{
				
			if (form.elements[i].id == 'manterAliquotaForm:hiddenProsseguir'){		
				hidden = form.elements[i];
				hidden.value = flag;				
			}		
		}	
	}
	
	
	
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

	
	
	
