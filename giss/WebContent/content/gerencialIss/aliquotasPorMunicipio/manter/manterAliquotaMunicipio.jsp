<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="manterAliquotaForm" name="manterAliquotaForm" >


<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_informacoesPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{aliquotaISSBean.dtoManter.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{aliquotaISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="15" value="#{aliquotaISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{aliquotaISSBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{aliquotaISSBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>

	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" style="cursor:hand" 
				styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{aliquotaISSBean.pesquisarManterAliquota}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-top:6px;" >
		<br:brPanelGroup>
		</br:brPanelGroup>			
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" rendered="#{aliquotaISSBean.mostrarLista}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_municipio}:" />
		</br:brPanelGroup>			
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0"  rendered="#{aliquotaISSBean.mostrarLista}">	
		<br:brPanelGroup >	
		<t:div  style="overflow-Y:scroll; height:275;display:block">
			<t:dataTable id="dataTable" value="#{aliquotaISSBean.dtoManter.listaAliqMunicipios}" var="result" rowIndexVar="linha"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
			<t:column width="25px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">      
				<t:selectOneRadio id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{aliquotaISSBean.radioListaAliquotaMunicipio}">
					<f:selectItems value="#{aliquotaISSBean.selectItemAliquotaMunicipio}"/>
				</t:selectOneRadio>
			    </f:facet>		
		    	<t:radio for="sorLista" index="#{linha}"  />
			</t:column>
			  <t:column width="175px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.geral_codigo_municipio_ibge}:" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio}"/>
			  </t:column>
			  <t:column width="350px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_municipio}:" />
			    </f:facet>
			    <br:brOutputText value="#{result.descMunicipio}"/>
			  </t:column>	
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_uf}:" />
			    </f:facet>
			    <br:brOutputText value="#{result.siglaUf}"/>
			  </t:column>		
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_aliquota}" />
			    </f:facet>
			    <br:brOutputText value="#{result.aliquota}"/>
			  </t:column>			  
			</t:dataTable>
			</t:div>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_ALT_ALIQUOTA">
				<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" value="Alterar" action="#{aliquotaISSBean.carregarAlterar}" style="margin-right:5px" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_DET_ALIQUOTA">
				<br:brCommandButton id="btnDetalhar" styleClass="HtmlCommandButtonBradesco" value="Detalhar" action="#{aliquotaISSBean.carregarDetalhar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
		</br:brPanelGroup>
	</br:brPanelGrid>
	</br:brPanelGrid>
	


<f:verbatim>
<script language="javascript">

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
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{aliquotaISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
	
	
	
