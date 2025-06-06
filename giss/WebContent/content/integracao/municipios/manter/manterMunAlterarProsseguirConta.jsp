<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterMunicipioContasForm" name="manterMunicipioContasForm" >
<h:inputHidden id="hiddenRadio" value="#{manterMunicipioBean.codListaPesquisaConta}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_infoMunicipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoMunicipio}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_nome}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeMunicipio}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeUnidadeFederativa}" />
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>


	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_informacoesPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_tipoServico}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:280px" id="tipoServico" value="#{manterMunicipioBean.tipoServicoFiltro}" onchange="javascript:habilitaProsseguir(document.forms[1]);">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItems value="#{manterMunicipioBean.listaTipoServico}"/>
				<brArq:commonsValidator type="required" arg="#{msgs.manterMunicipio_label_tipoServico}" server="false" client="true"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"></f:verbatim>
	
	<br:brPanelGrid columns="2" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<br:brPanelGrid columns="1" style="width:650px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>			
		<br:brPanelGroup style="text-align:right;" >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguirPesquisa" disabled="true" onclick="javascript:  return validateForm(document.forms[1]); " value="#{msgs.resultadoDependenciasNovasAgencia_pesquisar}" action="#{manterMunicipioBean.carregaListaContasTipoServico}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>		
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup >							
			<t:dataTable id="dataTable" value="#{manterMunicipioBean.listaContasTipoServico}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">	
			 <t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitaBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{manterMunicipioBean.listaControleCheckRadio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manterMunicipio_grid_conta}" />
			    </f:facet>
			    <br:brOutputText value="#{result.conta}"/>
			  </t:column>
			  <t:column width="600px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.manterMunicipio_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" />
			  </t:column>			 		  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>		
	
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{manterMunicipioBean.paginarManterListaContasTipoServico}" rendered="#{manterMunicipioBean.listaContasTipoServico != null &&  manterMunicipioBean.mostraBotoes}">
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
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar2" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_voltar}" action="#{manterMunicipioBean.voltarRespRecolhimentoMunicipio}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>					
		
		<br:brPanelGrid columns="1" style="width:370px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"  value="#{msgs.manterMunicipio_botao_limparCampos}" action="#{manterMunicipioBean.limparCamposContasMunicipio}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguirContas" onclick="javascript: return validateForm(document.forms[1]); " disabled="true" style="margin-left:5px;" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.manterMunicipio_botao_prosseguir}" action="#{manterMunicipioBean.carregaDetalheContaMunicipio}">
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
			if (form.elements[i].id == 'manterMunicipioContasForm:btnProsseguirContas'){
				form.elements[i].disabled=false;
			}								
			if (form.elements[i].id == 'manterMunicipioContasForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaProsseguir(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterMunicipioContasForm:btnProsseguirPesquisa'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
	
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	

	
	