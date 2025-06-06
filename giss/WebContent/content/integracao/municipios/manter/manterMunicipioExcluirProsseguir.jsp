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
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
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
		  <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.percentualAliquota}" />
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
	

	 <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_tipoServico}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>	
			<br:brSelectOneMenu id="tipoServico" value="#{manterMunicipioBean.tipoServicoFiltro}" onchange="javascript:habilitaProsseguir(document.forms[1], this);">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItems value="#{manterMunicipioBean.listaTipoServico}"/>
		    	<brArq:commonsValidator type="required" arg="#{msgs.manterMunicipio_label_tipoServico}" server="false" client="true"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brCommandButton disabled="true" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_pesquisar}" action="#{manterMunicipioBean.carregaListaContasTipoServicoExclusao}" onclick="javascript: return validateForm(document.forms[1]);">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>

	
	<f:verbatim><br/> </f:verbatim>
		
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup >
				<t:div style="height: 200px; overflow: auto;">
					<t:dataTable id="dataTable"
						value="#{manterMunicipioBean.listaContasTipoServico}" var="result"
						rows="50" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_direita, alinhamento_esquerda,alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px; height:23px;text-align:center">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.label_cosif}" />
							</f:facet>
							<br:brOutputText value="#{result.cosif}" />
						</t:column>
						<t:column
							style="width: 100px;padding-right:5px; padding-left:5px;text-align:center">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.manterMunicipio_grid_razao}" />
							</f:facet>
							<br:brOutputText value="#{result.razao}" />
						</t:column>
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px; height:23px;">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.manterMunicipio_grid_conta}" />
							</f:facet>
							<br:brOutputText value="#{result.conta}" />
						</t:column>
						<t:column width="350px"
							style="padding-right:5px; padding-left:5px; height:23px;">
							<f:facet name="header">
								<h:outputText value="#{msgs.manterMunicipio_grid_descricao}" />
							</f:facet>
							<br:brOutputText value="#{result.descricao}" />
						</t:column>
						<t:column width="50px"
							style="padding-right:5px; padding-left:5px; height:23px;">
							<f:facet name="header">
								<h:outputText value="#{msgs.manterMunicipio_grid_aliquota}" />
							</f:facet>
							<br:brOutputText value="#{result.aliquota}%" />
						</t:column>
						<t:column width="200px"
							style="padding-right:5px; padding-left:5px; height:23px;">
							<f:facet name="header">
								<h:outputText value="#{msgs.manterMunicipio_grid_codigoTributo}" />
							</f:facet>
							<br:brOutputText value="#{result.codigoTributo}" />
						</t:column>
					</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	</br:brPanelGrid>	

	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup>
		 
			<brArq:pdcDataScroller id="dataScroller"  for="dataTable"   actionListener="#{manterMunicipioBean.paginarManterListaContasTipoServico}" rendered="#{manterMunicipioBean.listaContasTipoServico != null &&  manterMunicipioBean.mostraBotoes}">
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
</br:brPanelGrid>

	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_voltar}" action="#{manterMunicipioBean.voltarPaginaDetalheExclusao}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>					
		
		<br:brPanelGrid columns="1" style="width:520px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
					
				
		
	</br:brPanelGrid>
	
</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

	function habilitaProsseguir(form, selectBox){
		var objBtnProsseguir = document.getElementById('manterMunicipioContasForm:btnProsseguir');
		if (selectBox.value != '') {
			objBtnProsseguir.disabled = false;
		} else {
			objBtnProsseguir.disabled = true;
		}
	}
	
	habilitaProsseguir(document.forms[1], document.getElementById('manterMunicipioContasForm:tipoServico'))
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	