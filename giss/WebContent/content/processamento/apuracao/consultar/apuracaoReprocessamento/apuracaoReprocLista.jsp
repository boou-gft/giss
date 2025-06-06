<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<brArq:form id="apuracaoRepForm" name="apuracaoRepForm">
	<h:inputHidden id="hiddenReprocessamento" value="#{apuracaoRepBean.radioReprocessamento}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
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
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{apuracaoRepBean.estadoFiltro}" onchange="habilitaBotaoConsultar();">
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{apuracaoRepBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{apuracaoRepBean.buscaMunicipio.codigo}" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{apuracaoRepBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{apuracaoRepBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>	
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_competencia}:"/>
			</br:brPanelGroup>
			<%-- Quebra linha --%>
			<br:brSelectOneMenu id="empresa" value="#{apuracaoRepBean.indiceComboEmpresaFiltro}">
				<f:selectItems value="#{apuracaoRepBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{apuracaoRepBean.codDepFiltro}" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>	
		    	<br:brInputText styleClass="HtmlInputTextBradesco" 
		     		onkeyup="proximoCampo(2,'apuracaoRepForm','apuracaoRepForm:txtMes','apuracaoRepForm:txtAno');" 
		     		value="#{apuracaoRepBean.mesFiltro}" size="3" maxlength="2" id="txtMes" onkeypress="aplicamascara('apuracaoRepForm','apuracaoRepForm:txtMes',numeros);" onblur="validarData('apuracaoRepForm','apuracaoRepForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />	
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />		  				      				       
		    	</br:brInputText>	

				<br:brPanelGroup style="margin-left:5px;margin-right:5px;">	
					 <f:verbatim>/</f:verbatim>
		 		</br:brPanelGroup>		
				
		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{apuracaoRepBean.anoFiltro}" 
		      		size="6" maxlength="4" id="txtAno" onkeypress="aplicamascara('apuracaoRepForm','apuracaoRepForm:txtAno',numeros);" onblur="validarData('apuracaoRepForm','apuracaoRepForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />			  				      				      
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />
		    	</br:brInputText>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<t:dataTable id="dataTable" value="#{apuracaoRepBean.listaReprocessamento}" var="result" rows="50" cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_centro,alinhamento_centro, alinhamento_centro, alinhamento_centro" headerClass="tabela_celula_destaque_acentuado" width="750px">
					<t:column width="30px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="" escape="false" />
						</f:facet>
						<t:selectOneRadio onclick="javascript:habilitaBotao(document.forms[1], this);" id="sorLista" disabled="#{result.codigo != apuracaoRepBean.maiorCodigoSolicitacao}" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
							<f:selectItems value="#{apuracaoRepBean.listaCtrlReprocessamento}" />
						</t:selectOneRadio>
						<t:radio for="sorLista" index="#{result.linha}" />
					</t:column>
					<t:column width="60px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.apuracao_reprocessamento_codigo}" />
						</f:facet>
						<br:brOutputText value="#{result.codigo}" />
					</t:column>
					<t:column width="165px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.apuracao_reprocessamento_solicitacao}" />
						</f:facet>
						<br:brOutputText value="#{result.dataSolicitacao}">
							<f:converter converterId="dateBrazillianConverter" />
						</br:brOutputText>
					</t:column>
					<t:column width="165px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.apuracao_reprocessamento_processamento}" />
						</f:facet>
						<br:brOutputText value="#{result.dataProcessamento}" />
					</t:column>
					<t:column width="165px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.apuracao_reprocessamento_periodo_inicial}" />
						</f:facet>
						<br:brOutputText value="#{result.dataInicioApuracao}">
							<f:converter converterId="competenciaConverter" />
						</br:brOutputText>
					</t:column>
					<t:column width="165px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.apuracao_reprocessamento_periodo_final}" />
						</f:facet>
						<br:brOutputText value="#{result.dataFimApuracao}">
							<f:converter converterId="competenciaConverter" />
						</br:brOutputText>
					</t:column>
				</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{apuracaoRepBean.paginarReprocessamento}" rendered="#{apuracaoRepBean.listaReprocessamento != null}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>
		<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_prosseguir}" action="#{apuracaoRepBean.prosseguir}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<f:verbatim>
		<script language="javascript">
	function habilitaBotao(form, radio) {
		var hidden;
		for (i = 0; i < form.elements.length; i++) {
			if (form.elements[i].id == 'apuracaoRepForm:btnProsseguir') {
				form.elements[i].disabled = false;
			}

			if (form.elements[i].id == 'apuracaoRepForm:hiddenReprocessamento') {
				hidden = form.elements[i];
				hidden.value = radio.value;
			}

		}
	}

	var formulario = document.forms[1];
	var valorRadioSelecionado = -1;
	var btn;

	for (i = 0; i < formulario.elements.length; i++) {

		if (formulario.elements[i].id == 'apuracaoRepForm:hiddenReprocessamento') {
			valorRadioSelecionado = formulario.elements[i].value;
		}

		if (formulario.elements[i].id == 'apuracaoRepForm:btnProsseguir') {
			btn = formulario.elements[i];
		}

		if (formulario.elements[i].name == 'sorLista') {
			//Se valor do Hidden for igual ao Radio em foco, checamos o radio
			if (formulario.elements[i].value == valorRadioSelecionado) {
				formulario.elements[i].checked = true;
			} else
				formulario.elements[i].checked = false;

		}

	}

	if (valorRadioSelecionado != -1) {
		btn.disabled = false;
	}
</script>
	</f:verbatim>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean alias="#{BuscaMunicipioBean}" value="#{apuracaoRepBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp"%>
</t:aliasBeansScope>
