<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="listarMunicipioForm" name="listarMunicipioForm" >
<h:inputHidden id="hiddenRadio" value="#{dependenciaBean.codListaPesquisarMunicipioProx}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{dependenciaBean.estadoResultDepNovasMun}" onchange="javascript:habilitaBotaoProsseguir(document.forms[1]);">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{dependenciaBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{dependenciaBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{dependenciaBean.buscaMunicipioDepNova}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{dependenciaBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguirPesquisa" style="cursor:hand" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{dependenciaBean.pesquisarMunicipioIncorpora}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>

	
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{dependenciaBean.mostraMunicipiosIncorpora}">	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_municipio}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="435px" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{dependenciaBean.mostraMunicipiosIncorpora}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{dependenciaBean.listaMunicipios}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="435px" >
			<t:column width="25px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" value="#{dependenciaBean.codigoMunicipioIncorporada}" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
					<f:selectItems value="#{dependenciaBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="90px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="320px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_grid_nome}" />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}" style="padding-right:5px; padding-left:5px; float:left; margin-left:5 px;"/>
			  </t:column>			  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="435" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{dependenciaBean.mostraMunicipiosIncorpora}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{dependenciaBean.paginarListaMunicipios}">
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
	
	<br:brPanelGrid columns="4" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<br:brPanelGroup style="float:left;text-align:left;width:150px"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_voltar}" action="#{dependenciaBean.voltarInformacoesDependenciasNovas}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_prosseguir}" action="#{dependenciaBean.retornarDependenciasNovasAgencia}" disabled="#{dependenciaBean.codigoMunicipioIncorporada == 0}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>	
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

function habilitarBotoes(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'listarMunicipioForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'listarMunicipioForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}
function habilitaBotaoProsseguir(form){

	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'listarMunicipioForm:btnProsseguirPesquisa'){
			form.elements[i].disabled=false;
		}
	}
	
}

</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{dependenciaBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
