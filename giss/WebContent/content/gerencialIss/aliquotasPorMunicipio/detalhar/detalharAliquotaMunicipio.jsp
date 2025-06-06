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
<h:inputHidden id="hiddenRadio" value="#{aliquotaISSBean.radioListaAliquotaMunicipio}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >

		<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaISSBean.dtoAlterar.estado}" />
			</br:brPanelGroup>	
			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.geral_codigo_municipio_ibge}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaISSBean.dtoAlterar.codMunicipio}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaISSBean.dtoAlterar.descMunicipio}" />
			</br:brPanelGroup>
				
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	        </br:brPanelGrid>
	
 		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{aliquotaISSBean.dtoAlterar.aliquota}" />
			</br:brPanelGroup>	
			
				
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	        </br:brPanelGrid>
	        
	

	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	

	
	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{aliquotaISSBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{aliquotaISSBean.selectItemLei}" />
		</t:selectManyCheckbox>
		
		<t:div  style="overflow-Y:scroll; height:275;display:block">
					
		<t:dataTable id="dataTable" value="#{aliquotaISSBean.dtoAlterar.listaAlterar}" var="result"  rowIndexVar="linha"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_esquerda,alinhamento_centro"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
			  <t:column width="600px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_lc}"/>
			    </f:facet>
			    <br:brOutputText value="#{result.descLeiCompl}" style="margin-left:5 px; float:left;"/>
			  </t:column>
			  <t:column width="150px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_aliquota}"/>
			    </f:facet>
			  <br:brOutputText value="#{result.aliquota}" style="margin-left:5 px; text-aling:center;" />
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
	
	function habilitaProsseguir(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterAliquotaForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
	
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

	
	
	
