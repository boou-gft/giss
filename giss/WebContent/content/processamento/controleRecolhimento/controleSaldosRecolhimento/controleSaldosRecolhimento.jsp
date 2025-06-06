<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="conSaldosRecForm" name="conSaldosRecForm" >
<h:inputHidden id="hiddenRadio" value="#{controleSaldosRecolhimento.itemSelecionadoLista}"/>
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.controle_saldos_recolhimento_informacoes_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
	 <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_competencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.competencia}" />
		</br:brPanelGroup>			
	
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.controle_saldos_recolhimento_estado}:" style="margin-right:6px;"/>
	    	</br:brPanelGroup>

			<br:brPanelGroup style="width:190px">		    	
					<br:brSelectOneMenu style="width:180px" id="estado" value="#{controleSaldosRecolhimento.estadoFiltro}" >
						<f:selectItem itemValue="" itemLabel="#{msgs.controle_saldos_recolhimento_selecione}"/>
						<f:selectItems value="#{controleSaldosRecolhimento.listaEstado}"/>
					</br:brSelectOneMenu>
		    </br:brPanelGroup>
		    
			<br:brPanelGroup>
				<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnPesquisar" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" actionListener="#{controleSaldosRecolhimento.carregaListaMunicipios}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>			
			</br:brPanelGroup>		
		    	
		</br:brPanelGrid>		
	 </br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
				
				<br:brPanelGroup style="height: 10px;"/>

			</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{controleSaldosRecolhimento.mostraMunicipios}">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.controle_saldos_recolhimento_informacoes_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraMunicipios}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{controleSaldosRecolhimento.listaMunicipios}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="550px" >
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitaBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{controleSaldosRecolhimento.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manterMunicipio_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="350px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manterMunicipio_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}"/>
			  </t:column>		
			</t:dataTable>			
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="550px" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{controleSaldosRecolhimento.paginarListaMunicipio}" rendered="#{controleSaldosRecolhimento.mostraMunicipios && !empty controleSaldosRecolhimento.listaMunicipios}">
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
	
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraMunicipios}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraMunicipios}">	
		<br:brPanelGroup>																																								 
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.controle_saldos_recolhimento_prosseguir}" action="#{controleSaldosRecolhimento.carregaDependenciasControleSaldoRecolhimento}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
		
	</br:brPanelGrid>	

<f:verbatim>
<script language="javascript">

	function habilitaBotoes(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'conSaldosRecForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}								
			if (form.elements[i].id == 'conSaldosRecForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'conSaldosRecForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>