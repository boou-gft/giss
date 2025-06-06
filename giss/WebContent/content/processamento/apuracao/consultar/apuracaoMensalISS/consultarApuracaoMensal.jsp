<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<brArq:form id="consultarApuracaoMensal" name="consultarApuracaoMensal">
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoMensalBean.filtroApuracaoDependencia.codigoMunicipio}"/>
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoMensal_title_informacoes_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:" />
			</br:brPanelGroup>
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{consultarApuracaoMensalBean.estadoFiltro}" onchange="habilitaBotaoConsultar();">
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{consultarApuracaoMensalBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{consultarApuracaoMensalBean.buscaMunicipio.codigo}" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{consultarApuracaoMensalBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{consultarApuracaoMensalBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_competencia}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brSelectOneMenu id="empresa" value="#{consultarApuracaoMensalBean.indiceComboEmpresaFiltro}">
				<f:selectItems value="#{consultarApuracaoMensalBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{consultarApuracaoMensalBean.codDepFiltro}" />
			<br:brPanelGroup>
				<br:brInputText id="txtMesCompetencia" value="#{consultarApuracaoMensalBean.filtroApuracaoDependencia.mesApuracaoContabil}" onchange="habilitarBotaoProsseguirConsulta(document.forms[1])" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onkeypress="onlyNum()" onfocus="cleanClipboard()" onkeyup="proximoCampo(2,'consultarApuracaoMensal','consultarApuracaoMensal:txtMesCompetencia','consultarApuracaoMensal:txtAnoCompetencia');" onblur="validarData('consultarApuracaoMensal','consultarApuracaoMensal:txtMesCompetencia', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="required" arg="#{msgs.resultadoApuracaoMensal_competencia_mes}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoCompetencia" value="#{consultarApuracaoMensalBean.filtroApuracaoDependencia.anoApuracaoContabil}" onchange="habilitarBotaoProsseguirConsulta(document.forms[1])" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onkeypress="onlyNum()" onfocus="cleanClipboard()" onblur="validarData('consultarApuracaoMensal','consultarApuracaoMensal:txtAnoCompetencia', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="required" arg="#{msgs.resultadoApuracaoMensal_competencia_ano}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<f:verbatim>
					<hr class="lin">
				</f:verbatim>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_consultar}" action="#{consultarApuracaoMensalBean.carregaLista}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGroup style="height:5px" />
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{consultarApuracaoMensalBean.mostraLista==true}">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_municipio}:" />
			</br:brPanelGroup>
			<br:brPanelGroup style="height:5px" />
			<br:brPanelGroup>
				
				<t:dataTable id="dataTable" value="#{consultarApuracaoMensalBean.listaMunicipios}" var="result" rows="50" cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda" headerClass="tabela_celula_destaque_acentuado" width="750px">
					<t:column width="30px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
			      			<br:brOutputText value="" escape="false" />
			    		</f:facet>		
						<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
							<f:selectItems value="#{consultarApuracaoMensalBean.listaMunicipiosRadio}"/>
						</t:selectOneRadio>
		    			<t:radio for="sorLista" index="#{result.linha}"  />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.resultadoApuracaoMensal_codigo}" />
						</f:facet>
						<br:brOutputText value="#{result.codigo}" />
					</t:column>
					<t:column width="570px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<h:outputText value="#{msgs.resultadoApuracaoMensal_nome}" />
						</f:facet>
						<br:brOutputText value="#{result.nome}" />
					</t:column>
				</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
			<br:brPanelGroup rendered="#{!empty consultarApuracaoMensalBean.listaMunicipios}">
				<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{consultarApuracaoMensalBean.paginar}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{consultarApuracaoMensalBean.mostraLista==true}">
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>
			<a4j:outputPanel id="panelBotoes" ajaxRendered="true">
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.consultarApuracaoMensal_prosseguir}" disabled="true" action="#{consultarApuracaoMensalBean.avancarResultado}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</a4j:outputPanel>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean alias="#{BuscaMunicipioBean}" value="#{consultarApuracaoMensalBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp"%>
</t:aliasBeansScope>
<f:verbatim>

<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'consultarApuracaoMensal:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'consultarApuracaoMensal:hiddenRadio'){		
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