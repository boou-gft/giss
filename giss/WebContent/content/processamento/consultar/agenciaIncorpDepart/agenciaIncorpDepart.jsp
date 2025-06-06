<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<brArq:form id="agenciaIncorpDepartForm" name="agenciaIncorpDepartForm">
	<h:inputHidden id="hiddenRadio" value="#{agIncorpDeptoBean.linhaSelecionada}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.agencia_incorpora_departamento_path_subtitulo_informacao} :" />
			</br:brPanelGroup>
			<br:brPanelGrid style="margin-top:20px" />
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
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.oscilacaoNegativa_label_competencia}:" />
				</br:brPanelGroup>
				<%--Quebra Linha--%>
				<br:brSelectOneMenu id="empresa" value="#{agIncorpDeptoBean.indiceComboEmpresaFiltro}">
					<f:selectItems value="#{agIncorpDeptoBean.listaEmpresa}" />
				</br:brSelectOneMenu>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
				<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{agIncorpDeptoBean.codDepFiltro}" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
				<br:brPanelGroup>
					<br:brInputText styleClass="HtmlInputTextBradesco" value="#{agIncorpDeptoBean.mesFiltro}" size="4" maxlength="2" onblur="validarData('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="aplicamascara('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes',numeros);" onkeyup="proximoCampo(2,'agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes','agenciaIncorpDepartForm:txtAno');" id="txtMes">
						<brArq:commonsValidator type="integer" arg="#{msgs.dependencias_encerradas_referencia_mes}" server="false" client="true" />
						<brArq:commonsValidator type="required" arg="#{msgs.dependencias_encerradas_referencia_mes}" server="false" client="true" />
					</br:brInputText>
					<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
					<br:brInputText styleClass="HtmlInputTextBradesco" value="#{agIncorpDeptoBean.anoFiltro}" size="8" maxlength="4" onblur="validarData('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="aplicamascara('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtAno',numeros);" id="txtAno">
						<brArq:commonsValidator type="integer" arg="#{msgs.dependencias_encerradas_referencia_ano}" server="false" client="true" />
						<brArq:commonsValidator type="required" arg="#{msgs.dependencias_encerradas_referencia_ano}" server="false" client="true" />
					</br:brInputText>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<%--
			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.agencia_incorpora_departamento_path_subtitulo_competencia} :" />
			</br:brPanelGroup>
			<br:brPanelGrid columns="3" style="margin-top:5px" cellpadding="0" cellspacing="0">
				<br:brPanelGroup>
					<br:brInputText styleClass="HtmlInputTextBradesco" value="#{agIncorpDeptoBean.mesFiltro}" size="4" maxlength="2" onblur="validarData('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="aplicamascara('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes',numeros);" onkeyup="proximoCampo(2,'agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtMes','agenciaIncorpDepartForm:txtAno');" id="txtMes">
						<brArq:commonsValidator type="integer" arg="#{msgs.dependencias_encerradas_referencia_mes}" server="false" client="true" />
						<brArq:commonsValidator type="required" arg="#{msgs.dependencias_encerradas_referencia_mes}" server="false" client="true" />
					</br:brInputText>
				</br:brPanelGroup>
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-left:5px;margin-right:5px;">
					<br:brPanelGroup>
						<f:verbatim>/</f:verbatim>
					</br:brPanelGroup>
				</br:brPanelGrid>
				<br:brPanelGroup>
					<br:brInputText styleClass="HtmlInputTextBradesco" value="#{agIncorpDeptoBean.anoFiltro}" size="8" maxlength="4" onblur="validarData('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="aplicamascara('agenciaIncorpDepartForm','agenciaIncorpDepartForm:txtAno',numeros);" id="txtAno">
						<brArq:commonsValidator type="integer" arg="#{msgs.dependencias_encerradas_referencia_ano}" server="false" client="true" />
						<brArq:commonsValidator type="required" arg="#{msgs.dependencias_encerradas_referencia_ano}" server="false" client="true" />
					</br:brInputText>
				</br:brPanelGroup>
			</br:brPanelGrid>
			--%>
		</br:brPanelGrid>
		<f:verbatim>
			<hr class="lin">
		</f:verbatim>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup style="text-align:right;width:100%">
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.agencia_incorpora_departamento_path_botao_prosseguir}" action="#{agIncorpDeptoBean.prosseguir}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{agIncorpDeptoBean.mostrarTabela}">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.agencia_incorpora_departamento_path_subtitulo_resultado}" />
			</br:brPanelGroup>
			<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
				<br:brPanelGroup style="width:750px">
					<t:dataTable id="dataTable" value="#{agIncorpDeptoBean.listarAgenciaIncorpDepartamento.listaAgIncorpDepartSaida}" var="result" rows="50" cellspacing="1" cellpadding="0" rowIndexVar="key" rowClasses="tabela_celula_normal, tabela_celula_destaque" columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, 
					alinhamento_direita" headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="30px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
								<f:selectItems value="#{agIncorpDeptoBean.listarDependenciaRadio}" />
							</t:selectOneRadio>
							<t:radio for="sorLista" index="#{result.linha}" />
						</t:column>
						<t:column width="140px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.agencia_incorpora_departamento_path_tabela_dependencia}" />
							</f:facet>
							<br:brOutputText value="#{result.codigoDependencia}" style="float: left;" />
						</t:column>
						<t:column width="300px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.agencia_incorpora_departamento_path_tabela_descricao}" />
							</f:facet>
							<br:brOutputText value="#{result.descricaoDependencia}" />
						</t:column>
						<t:column width="140px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.agencia_incorpora_departamento_path_tabela_receita}" />
							</f:facet>
							<br:brOutputText value="#{result.valorReceita}" converter="decimalBrazillianConverter" />
						</t:column>
						<t:column width="140px" style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText value="#{msgs.agencia_incorpora_departamento_path_tabela_issrecolher}" />
							</f:facet>
							<br:brOutputText value="#{result.valorISSRecolher}" converter="decimalBrazillianConverter" />
						</t:column>
					</t:dataTable>
				</br:brPanelGroup>
				<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" style="width:750px; height:20px">
					<br:brPanelGroup style="width:50px">
					</br:brPanelGroup>
					<br:brPanelGroup style="width:120px; text-align:left">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:0px;" value="#{msgs.agencia_incorpora_departamento_path_tabela_total}" />
					</br:brPanelGroup>
					<br:brPanelGroup style="width:285px">
					</br:brPanelGroup>
					<br:brPanelGroup style="width:140px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:0px;" value="#{agIncorpDeptoBean.totalReceita}" converter="decimalBrazillianConverter" />
					</br:brPanelGroup>
					<br:brPanelGroup style="width:135px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:0px;" value="#{agIncorpDeptoBean.totalISSRecolher}" converter="decimalBrazillianConverter" />
					</br:brPanelGroup>
				</br:brPanelGrid>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
				<br:brPanelGroup>
					<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{agIncorpDeptoBean.paginarLista}" rendered="#{agIncorpDeptoBean.listarAgenciaIncorpDepartamento.listaAgIncorpDepartSaida != null && agIncorpDeptoBean.mostraPagina}">
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
			<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0">
				<br:brPanelGroup style="text-align:left;width:100%">
					<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.agencia_incorpora_departamento_path_botao_voltar}" action="#{agIncorpDeptoBean.voltar}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;width:100%">
					<br:brCommandButton id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.agencia_incorpora_departamento_path_botao_colsultar}" action="#{agIncorpDeptoBean.carregaLista}" disabled="true">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<f:verbatim>
		<script type="text/javascript">
	function habilitaBotaoProsseguir(form, radio) {
		var hidden;
		var btnConsultar;
		for (i = 0; i < form.elements.length; i++) {
			if (form.elements[i].id == 'agenciaIncorpDepartForm:btnConsultar') {
				btnConsultar = form.elements[i];
			}

			if (form.elements[i].id == 'agenciaIncorpDepartForm:hiddenRadio') {
				hidden = form.elements[i];
				hidden.value = radio.value;
			}
		}
		if ((hidden.value != '')) {
			btnConsultar.disabled = false;
		}
	}
</script>
	</f:verbatim>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>