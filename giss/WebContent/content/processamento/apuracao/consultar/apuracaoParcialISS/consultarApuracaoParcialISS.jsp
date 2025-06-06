<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="apurcaoParcialISSForm" name="apurcaoParcialISSForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoParcialBean.radioTelaConsultar}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" >

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoParcial_label_informacoes_pesquisa}:"/>
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
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estadoCombo" value="#{consultarApuracaoParcialBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{consultarApuracaoParcialBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{consultarApuracaoParcialBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{consultarApuracaoParcialBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{consultarApuracaoParcialBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brSelectOneMenu id="empresa" value="#{consultarApuracaoParcialBean.indiceComboEmpresaFiltro}">
			<f:selectItems value="#{consultarApuracaoParcialBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{consultarApuracaoParcialBean.codDepFiltro}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_periodo}:" />
		</br:brPanelGroup>
		
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoParcialBean.dataPerido}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{consultarApuracaoParcialBean.carregarLista}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<br:brPanelGrid id="panelGridEstado" columns="1" cellpadding="0" style="margin-top:6px;" cellspacing="0" rendered="#{consultarApuracaoParcialBean.carregaMunicipios}">
		<br:brPanelGroup id="estado">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoParcial_label_municipio}:" />
		</br:brPanelGroup>			
	</br:brPanelGrid>
	
	<br:brPanelGrid id="panelDataTable" columns="1" width="100%" style="margin-top:5px;" cellpadding="0" cellspacing="0" rendered="#{consultarApuracaoParcialBean.listaMunicipios != null}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{consultarApuracaoParcialBean.listaMunicipios}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="100%" >
			<t:column width="25px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
					<f:selectItems value="#{consultarApuracaoParcialBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="80px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:1 px;"/>
			  </t:column>
			  <t:column width="360px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoParcial_grid_nome}" />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}" style="float:left; margin-left:1 px;"/>
			  </t:column>			  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGroup style="height: 10px" />
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" id="Paginacao">	
		<br:brPanelGroup rendered="#{consultarApuracaoParcialBean.listaMunicipios != null}">
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{consultarApuracaoParcialBean.paginacaoMunicipios}" >
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

	<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0" rendered="#{consultarApuracaoParcialBean.listaMunicipios != null}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguir" value="#{msgs.consultarApuracaoParcial_btn_prossseguir}" disabled="true" rendered="#{consultarApuracaoParcialBean.listaMunicipios  != null}" action="#{consultarApuracaoParcialBean.avancarDependencia}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>
<f:verbatim>

<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apurcaoParcialISSForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'apurcaoParcialISSForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'apurcaoParcialISSForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{consultarApuracaoParcialBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
