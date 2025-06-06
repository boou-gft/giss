<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<brArq:form id="apuracaoMensalDiferenciada" name="agenciaIncorpDepartForm">
	<h:inputHidden id="hiddenRadio" value="#{apuracaoMensalDiferenciadaBean.radioTelaConsultar}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_label_informacaoes_pesquisa}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
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
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{apuracaoMensalDiferenciadaBean.estadoFiltro}" onchange="habilitaBotaoConsultar();">
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{apuracaoMensalDiferenciadaBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{apuracaoMensalDiferenciadaBean.buscaMunicipio.codigo}" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{apuracaoMensalDiferenciadaBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{apuracaoMensalDiferenciadaBean.buscaMunicipio.descricao}" />
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
			<br:brSelectOneMenu id="empresa" value="#{apuracaoMensalDiferenciadaBean.indiceComboEmpresaFiltro}">
				<f:selectItems value="#{apuracaoMensalDiferenciadaBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{apuracaoMensalDiferenciadaBean.codDepFiltro}" />
			<br:brPanelGroup>
				<br:brInputText id="txtMesCompetencia" value="#{apuracaoMensalDiferenciadaBean.mesFiltro}" onchange="habilitarBotaoProsseguirConsulta(document.forms[1])" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onkeypress="onlyNum()" onfocus="cleanClipboard()" onkeyup="proximoCampo(2,'apuracaoMensalDiferenciada','apuracaoMensalDiferenciada:txtMesCompetencia','apuracaoMensalDiferenciada:txtAnoCompetencia');" onblur="validarData('apuracaoMensalDiferenciada','apuracaoMensalDiferenciada:txtMesCompetencia', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="required" arg="#{msgs.resultadoApuracaoMensal_competencia_mes}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoCompetencia" value="#{apuracaoMensalDiferenciadaBean.anoFiltro}" onchange="habilitarBotaoProsseguirConsulta(document.forms[1])" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onkeypress="onlyNum()" onfocus="cleanClipboard()" onblur="validarData('apuracaoMensalDiferenciada','apuracaoMensalDiferenciada:txtAnoCompetencia', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
					<brArq:commonsValidator type="required" arg="#{msgs.resultadoApuracaoMensal_competencia_ano}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup style="text-align:right;width:100%">
				<br:brCommandButton id="btnConsultar" onclick="javascript:habilitaBotaoConsultar();" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoMensalDiferenciada_btn_consultar}" action="#{apuracaoMensalDiferenciadaBean.carregaLista}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{apuracaoMensalDiferenciadaBean.carregaMunicipios}">
			<br:brPanelGroup style="margin-left:1px">
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracaoMensalDiferenciada_label_municipios}" />
			</br:brPanelGroup>
			<br:brPanelGrid id="panelListaMunicipios" columns="1" width="100%" cellpadding="0" cellspacing="0">
				<br:brPanelGroup style="width:750px">
					<t:dataTable id="dataTableApur" value="#{apuracaoMensalDiferenciadaBean.listaMunicipios}" var="result" rows="50" cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_centro" headerClass="tabela_celula_destaque_acentuado" width="750px" >
						<t:column width="30px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
								<f:selectItems value="#{apuracaoMensalDiferenciadaBean.listaControleCheckRadio}" />
							</t:selectOneRadio>
							<t:radio for="sorLista" index="#{result.linha}" />
						</t:column>
						<t:column width="270px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText style="width:100%; text-align:left; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_grid_codigo}" />
							</f:facet>
							<br:brOutputText style="width:100%; text-align:left" value="#{result.codigo}" />
						</t:column>
						<t:column width="550px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText style="width:100%; text-align:left; margin-left:5px" value="#{msgs.apuracaoMensalDiferenciada_grid_nome}" />
							</f:facet>
							<br:brOutputText style="width:100%; text-align:left" value="#{result.nome}" />
						</t:column>
					</t:dataTable>
				</br:brPanelGroup>
				<br:brPanelGroup style="height: 10px" />
				<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" id="Paginacao" rendered="#{apuracaoMensalDiferenciadaBean.carregaMunicipios}">
					<br:brPanelGroup>
						<brArq:pdcDataScroller id="dataScroller" for="dataTableApur" actionListener="#{apuracaoMensalDiferenciadaBean.paginarMunicipio}">
							<f:facet name="previous">
								<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
							</f:facet>
							<f:facet name="next">
								<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
							</f:facet>
						</brArq:pdcDataScroller>
					</br:brPanelGroup>
				</br:brPanelGrid>
			</br:brPanelGrid>
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>
			<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
				<a4j:outputPanel id="panelBotoes" ajaxRendered="true">
					<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoMensalDiferenciada_btn_prosseguir}" action="#{apuracaoMensalDiferenciadaBean.prosseguir}" disabled="true">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</a4j:outputPanel>
			</br:brPanelGrid>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<f:verbatim>
		<script language="javascript">
	function habilitaBotaoProsseguir(form, radio) {
		var hidden;
		hidden = radio;
		document.getElementById("apuracaoMensalDiferenciada:hiddenRadio").value = hidden.value;
		if (hidden.value != null)
			document.getElementById("apuracaoMensalDiferenciada:btnProsseguir").disabled = false;
	}

	function validaProsseguir() {
		var mes = document.getElementById("apuracaoMensalDiferenciada:txtMes").value;
		var ano = document.getElementById("apuracaoMensalDiferenciada:txtAno").value;
		if (mes.length != 2 && ano.length != 4)
			return false;

	}

	function habilitaBotaoConsultar() {
		document.getElementById("apuracaoMensalDiferenciada:btnConsultar").disabled = "";
		//var combo = document.getElementById("apuracaoMensalDiferenciada:comboEstado").value;

		/*if(combo>0)
			document.getElementById("apuracaoMensalDiferenciada:btnConsultar").disabled = "";
		else
			document.getElementById("apuracaoMensalDiferenciada:btnConsultar").disabled = "true";
		 */

	}
</script>
	</f:verbatim>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean alias="#{BuscaMunicipioBean}" value="#{apuracaoMensalDiferenciadaBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp"%>
</t:aliasBeansScope>
