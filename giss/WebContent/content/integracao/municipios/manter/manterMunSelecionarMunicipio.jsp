<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterMunicipioListaForm" name="manterMunicipioListaForm" >
<h:inputHidden id="hiddenRadio" value="#{manterMunicipioBean.codListaPesquisarMunicipio}"/>

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

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{manterMunicipioBean.estadoResultDepNovasMun}" onchange="javascript:habilitaBotaoProsseguir(document.forms[1]);">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{manterMunicipioBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{manterMunicipioBean.buscaMunicipioIncorp.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{manterMunicipioBean.buscaMunicipioIncorp}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{manterMunicipioBean.buscaMunicipioIncorp.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguirPesquisa" style="cursor:hand" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{manterMunicipioBean.pesquisarMunicipioManterRecolhimento}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="465px" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraMunicipiosIncorpora}">			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputTextBold styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_manteMunicipio_resultadoPesquisaMunicipios}:"/>
		</br:brPanelGroup>

		<br:brPanelGroup>	
			<t:dataTable id="dataTable" value="#{manterMunicipioBean.listaMunicipiosSelecao}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro,alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="465px">	
				<t:column width="25px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:radioGridPesquisaMunicipio(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{manterMunicipioBean.listaMunSelecaoControleCheckRadio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}"  />
			  </t:column>
			  <t:column width="120px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.manter_dependencia_alterar_selecionar_municipio_grid_codigo}" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}" style="float:left; margin-left:5 px;"/>
			  </t:column>
			  <t:column width="320px" style="padding-right:5px; padding-left:5px; height:23px;">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.manter_dependencia_alterar_selecionar_municipio_grid_nome}" />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}" style="float:left; margin-left:5 px;"/>
			  </t:column>			 		  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGroup style="height: 10px" />
	
	 <br:brPanelGrid columns="1" width="440px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{manterMunicipioBean.mostraMunicipiosIncorpora}">	
		<br:brPanelGroup>
		<brArq:pdcDataScroller id="dataScroller"    for="dataTable" actionListener="#{manterMunicipioBean.paginarListaMunicipioSelecao}" rendered="#{manterMunicipioBean.listaMunicipios != null &&  manterMunicipioBean.mostraBotoes}">
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

	<br:brPanelGrid columns="5" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" border="0">	
		<f:verbatim><hr class="lin"> </f:verbatim>
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
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_prosseguir}" action="#{manterMunicipioBean.carregarListaAgencias}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>

<f:verbatim>

<script language="javascript">
	
	function radioGridPesquisaMunicipio(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterMunicipioListaForm:btnProsseguir'){
				form.elements[i].disabled=false;
			}	
			if (form.elements[i].id == 'manterMunicipioListaForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}			
		}	
	}
</script>
</f:verbatim>


<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{manterMunicipioBean.buscaMunicipioIncorp}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>