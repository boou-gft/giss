<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterMunicipioAlterarRecolhimentoForm" name="manterMunicipioAlterarRecolhimentoForm" >
<h:inputHidden id="hiddenRadio" value="#{manterMunicipioBean.codListaPesquisaConta}"/>

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
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_grid_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoMunicipio}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
	    	<br:brPanelGroup style="width: 35px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_recolhimento_nome}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeMunicipio}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
	      	<br:brPanelGroup style="width: 35px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeUnidadeFederativa}" />
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_informacoesPesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.manterMunicipio_label_tipoServico}:" />
			
			<br:brPanelGroup style="width: 8px;" />	
			
    		<br:brSelectOneMenu id="formaPagamento" value="#{manterMunicipioBean.tipoServicoFiltro}">	
				<f:selectItem itemValue="0" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItems value="#{manterMunicipioBean.listaTipoServico}"/>
				<brArq:commonsValidator type="required" arg="#{msgs.manterMunicipio_label_tipoServico}" server="false" client="true"/>
			</br:brSelectOneMenu>		    	    	
		</br:brPanelGroup>	
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar"  styleClass="HtmlCommandButtonBradesco"  onclick="javascript: return validateForm(document.forms[1]);" value="#{msgs.resultadoDependenciasNovasAgencia_pesquisar}" action="#{manterMunicipioBean.pesquisarAgencia}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0"  width="100%" rendered="#{!empty manterMunicipioBean.listaContasTipoServico}">
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracao_reprocessamento_atualizacao_aliquota_padrao}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid> 
		
		
		<br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.apuracao_reprocessamento_aliquota}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" />
			<br:brInputText id="percentualAliquota" maxlength="6" size="10" onblur="vNumero(this,'9(3)V9(2)');" value="#{manterMunicipioBean.percentualAliquotaMassa}"/>						
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" />
			<br:brCommandButton id="btnAtualizarAliquota" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" value="#{msgs.resultado_municipios_novos_contas_btn_atualizar}" action="#{manterMunicipioBean.atualizarAliquota}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
				
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim> 
		</br:brPanelGroup>
	</br:brPanelGrid>


	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" rendered="#{!empty manterMunicipioBean.listaContasTipoServico}">	
		<br:brPanelGroup >
		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
		<br:brOutputTextBold styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		
		</br:brPanelGroup >
		
		<br:brPanelGroup>
			<t:dataTable id="dataTable" value="#{manterMunicipioBean.listaContasTipoServico}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="600px" rowIndexVar="contaIndexKey">	
				<t:column width="25px">
					<f:facet name="header">
				      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotaoFinalizar(document.forms[1], this);" id="sor" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{manterMunicipioBean.listaControleTipoServicoCheckRadio}" />
					</t:selectOneRadio>
			    	<t:radio for="sor" index="#{contaIndexKey}" />
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
			  <t:column width="400px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.manterMunicipio_grid_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="float:left; margin-left:5 px;" />
			  </t:column>			 
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
 	<br:brPanelGrid columns="1" width="600" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{!empty manterMunicipioBean.listaContasTipoServico}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller  id="dataScroller"  for="dataTable" actionListener="#{manterMunicipioBean.paginarListaContasTipoServico}">
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
	
	<br:brPanelGroup>
		<f:verbatim><hr class="lin"></f:verbatim>
	</br:brPanelGroup>

	<br:brPanelGrid columns="3" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_voltar}" action="#{manterMunicipioBean.voltarInformacoesMunicipioAlteracao}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1" style="width:480px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
		<br:brPanelGroup style="text-align:right;width:80px" >
			<br:brCommandButton id="btnProsseguirContas"   styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_prosseguir}" action="#{manterMunicipioBean.carregaDetalheContaMunicipio}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>		
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>

<f:verbatim>
<script>

function habilitarBotaoFinalizar(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterMunicipioAlterarRecolhimentoForm:btnProsseguirContas'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'manterMunicipioAlterarRecolhimentoForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;				
		}		
	}	
}

</script>
 </f:verbatim>
 
</brArq:form>