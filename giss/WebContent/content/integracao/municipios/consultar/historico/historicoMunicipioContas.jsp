*<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="historicoMunicipioContasForm" name="historicoMunicipioContasForm" >
<h:inputHidden id="hiddenRadio" value="#{historicoMunicipioBean.radioTelaManterContas}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacoes_municipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigo}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_nome}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descricao}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.estado}" />
		</br:brPanelGroup>
		  <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.percentualAliquotaMunicipio}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_municipios_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.historico_consultar_municipios_label_tipo_servico}:" />
		</br:brPanelGroup>					
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:290px" id="tipoServico" value="#{historicoMunicipioBean.tipoServicoFiltro}">
				<f:selectItem itemValue="" itemLabel="#{msgs.historico_municipios_label_selecione}"/>
				<f:selectItems value="#{historicoMunicipioBean.listaTipoServico}"/>
				<brArq:commonsValidator type="required" arg="#{msgs.historico_consultar_municipios_label_tipo_servico}" server="false" client="true" />
				<a4j:support event="onchange" ajaxSingle="true"	action="#{historicoMunicipioBean.limparListaContas}" reRender="dataTable" />													
			</br:brSelectOneMenu>
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{historicoMunicipioBean.carregaListaContas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{historicoMunicipioBean.mostraContasTipoServico}" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_title_incluir_manterTipoIncidencia_resultadoPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{historicoMunicipioBean.listaHistoricoMunicipioConta}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro,alinhamento_centro, alinhamento_direita, 
			alinhamento_esquerda, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitarBotoesHistoricoMunicipioConta(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{historicoMunicipioBean.listaControleCheckRadioContas}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			  <t:column width="175px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cosif}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manterMunicipio_grid_razao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.razao}"/>
			  </t:column>
			  <t:column width="175px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manterMunicipio_grid_conta}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.conta}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="400px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_conta_grid_descricao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricaoDetalhe}"/>
			  </t:column>
			  <t:column width="160px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_conta_grid_codigo_tributo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigoTributo}"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{historicoMunicipioBean.mostraContasTipoServico}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{historicoMunicipioBean.pesquisarResultadoPesquisa}" rendered="#{historicoMunicipioBean.listaHistoricoMunicipioConta != null && historicoMunicipioBean.mostraBotoes}">

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

	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	 
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_consultar_municipios_btn_voltar}" action="#{historicoMunicipioBean.voltarConsultar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:450px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:150px" >
			<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_prosseguir}" action="#{historicoMunicipioBean.prosseguirContaResultado}" disabled="#{historicoMunicipioBean.radioTelaManterContas == -1}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
</br:brPanelGrid>


<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
