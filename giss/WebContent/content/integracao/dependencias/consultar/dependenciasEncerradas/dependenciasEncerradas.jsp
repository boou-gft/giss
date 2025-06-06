<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="dependenciasEncerradasForm" name="dependenciasEncerradasForm" >
<h:inputHidden id="hiddenRadio" value="#{dependeciasEncerradasBean.codListaPesquisarDepEncerradas}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
  	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.dependencias_encerradas_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Período:"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="3" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 

	<br:brPanelGroup>
		<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px" value="#{msgs.dependencias_encerradas_referencia_De}"/>
		 	<app:calendar  id="calendarioDe" value="#{dependeciasEncerradasBean.calendarioDe}" >	
			 	<brArq:commonsValidator type="required" message="#{msgs.error_data_inicio_message}"  arg="#{msgs.error_data_inicio_message}" server="false" client="true"/>
		 	</app:calendar>
		<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.dependencias_encerradas_referencia_ate}"/>
			<app:calendar  id="calendarioAte"  value="#{dependeciasEncerradasBean.calendarioAte}">
				<brArq:commonsValidator type="required" message="#{msgs.error_data_fim_message}"  arg="#{msgs.error_data_fim_message}" server="false" client="true"/>
		 	</app:calendar>
		</br:brPanelGroup>	

	</br:brPanelGrid>	
			
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.dependencias_encerradas_btn_prosseguir}"
					actionListener="#{dependeciasEncerradasBean.carregarListaDependenciasEncerradas}"
					onclick="validacao.validarPreenchimentoCampos(this);">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
	</br:brPanelGrid>
    
    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
    
    	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{dependeciasEncerradasBean.mostraDependenciasEncerradas}">	
		<br:brPanelGroup style="width:750px">	
			<t:div styleClass="barraDeRolagem" style="width:750px; overflow-x:scroll">
			<t:dataTable id="dataTable" value="#{dependeciasEncerradasBean.listaDependenciasEncerradas}" var="result" 
				cellspacing="1" cellpadding="0" 
				rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, 
				alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda" 
				headerClass="tabela_celula_destaque_acentuado" width="1000px">
				<t:column width="30px" style="height: 20px; padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{dependeciasEncerradasBean.listaControleCheckRadio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}" rendered="#{result.codigoDependencia != '0'}" />
				</t:column>
				  <t:column width="80px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_dependencia}" />
				    </f:facet>
				    <br:brOutputText value="#{result.codigoDependencia}"/>
				  </t:column>
				  <t:column width="200px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_descricao}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.nomeDependencia}"/>
				  </t:column>
				  <t:column width="250px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_municipio}"/>
				    </f:facet>
				    <br:brOutputText value="#{result.municipio}" />
				  </t:column>
				  <t:column width="40px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_uf}" /> 
				    </f:facet>
				    <br:brOutputText value="#{result.siglaUnidadeFederativa}" />
				  </t:column>
				  <t:column width="100px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_atualizacao}" />
				    </f:facet>
				    <br:brOutputText value="#{result.horaManutencao}" />
				  </t:column>
				  <t:column width="100px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.dependencias_encerradas_grid_exclusao}" />
				    </f:facet>
				    <br:brOutputText value="#{result.dataExclusao}" />
				  </t:column>
				  <t:column width="100px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="Data da Baixa I.M." />
				    </f:facet>
				    <br:brOutputText value="#{result.dataBaixa}" />
				  </t:column>
				</t:dataTable>
				</t:div>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGroup style="height: 10px" />
		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{dependeciasEncerradasBean.mostraDependenciasEncerradas}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>	
			<br:brCommandButton id="btnPlanilhaEletronica" 
								styleClass="HtmlCommandButtonBradesco" 
								value="#{msgs.dependencias_encerradas_btn_planilha_eletronica}" 
								onclick="desbloqTela();return validateForm(document.forms[1]);" 
								actionListener="#{dependeciasEncerradasBean.imprimirPlanilha}"
								disabled="#{dependeciasEncerradasBean.listaDependenciasEncerradas == null}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnProsseguir2" styleClass="HtmlCommandButtonBradesco" disabled="true" value="#{msgs.dependencias_encerradas_btn_prosseguir}" action="#{dependeciasEncerradasBean.prosseguirDetalharDependencia}" onclick="return validateForm(document.forms[1]);" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>		
		</br:brPanelGroup>
	</br:brPanelGrid>
	
  </br:brPanelGrid>
  
 <f:verbatim> 
	
<script language="javascript">
	
	var validacao = {
		validarPreenchimentoCampos:function(btn){
			var form = document.getElementById('dependenciasEncerradasForm');
		
			if(!validateRequired(form)){
				enableCommand(btn);
				return false;
			} else if (validacao.validarDatas()) {
				enableCommand(btn);
				return false;
			}
		},
		validarDatas : function() {
			
			var diaValidadeDe = document.getElementById("dependenciasEncerradasForm:calendarioDe.day").value;
			var mesValidadeDe = document.getElementById("dependenciasEncerradasForm:calendarioDe.month").value;
			var anoValidadeDe = document.getElementById("dependenciasEncerradasForm:calendarioDe.year").value;

			var diaValidadeAte = document.getElementById("dependenciasEncerradasForm:calendarioAte.day").value;
			var mesValidadeAte = document.getElementById("dependenciasEncerradasForm:calendarioAte.month").value;
			var anoValidadeAte = document.getElementById("dependenciasEncerradasForm:calendarioAte.year").value;
			
			var dataInicioFormatada = document.getElementById("dependenciasEncerradasForm:calendarioDe").innerHTML;
			
			var diaInicio = dataInicioFormatada.split("/")[0];
			var mesInicio = dataInicioFormatada.split("/")[1];
			var anoInicio = dataInicioFormatada.split("/")[2];
			
			var dataInicio = new Date(anoInicio + "/" + mesInicio + "/" + diaInicio);
			var dataValidade = new Date(anoValidadeDe + "/" + mesValidadeDe + "/" + diaValidadeDe);

			if(diaValidadeDe == '' || mesValidadeDe == '' || anoValidadeDe == ''){
				alert(replaceAscii("O período deve ser informado completo!"));
				return true;
			}
			if(diaValidadeAte == '' || mesValidadeAte == '' || anoValidadeAte == ''){
				alert(replaceAscii("O período deve ser informado completo!"));
				return true;
			}
			return false;
		}
	};		
	
for(i=0; i<document.forms[1].elements.length; i++)
{
	if (document.forms[1].elements[i].id == 'dependenciasEncerradasForm:referencia.day'){
		document.forms[1].elements[i].style.visibility="hidden";
	}	

}

function habilitarBotaoProsseguir(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'dependenciasEncerradasForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'dependenciasEncerradasForm:btnProsseguir2'){
			form.elements[i].disabled=false;
		}
		if (form.elements[i].id == 'dependenciasEncerradasForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;				
		}		
	}	
}

</script> 
</f:verbatim> 
  
   
  
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
