<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>


<brArq:form id="resultadoApuracaoMensal" name="resultadoApuracaoMensal">
	<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoMensalBean.codListaResultado}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.resultadoApuracaoMensal_title_informacoes_processamento}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					value="#{msgs.resultadoApuracaoMensal_competencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{consultarApuracaoMensalBean.filtroApuracaoDependencia.mesApuracaoContabil}/#{consultarApuracaoMensalBean.filtroApuracaoDependencia.anoApuracaoContabil}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			<t:div styleClass="barraDeRolagem">
					<t:dataTable id="dataTable"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.apuracoes}"
						var="result" cellspacing="1" cellpadding="0"
						rowIndexVar="apuracaoKey"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="30px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectManyCheckbox 
								value="#{consultarApuracaoMensalBean.itemSelecionadoDependencia}"
								onclick="validarCheckbox(this)"
								id="sor" layout="spread"
								forceId="true" forceIdIndex="false">
								<f:selectItems
									value="#{consultarApuracaoMensalBean.listaControleCheckbox}" />
							</t:selectManyCheckbox>
							<t:checkbox for="sor" index="#{apuracaoKey}" />
						</t:column>
						<t:column width="100px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.resultadoApuracaoMensal_grid_dependencia}" />
							</f:facet>
							<br:brOutputText value="#{result.codDepPa}" />
						</t:column>
						<t:column width="320px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<h:outputText
									value="#{msgs.resultadoApuracaoMensal_grid_descricao}" />
							</f:facet>
							<br:brOutputText value="#{result.descDepPa}" />
						</t:column>
						<t:column width="100px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="Município" />
							</f:facet>
							<br:brOutputText value="#{result.descMunicipio}" />
						</t:column>
						<t:column width="100px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="Estado" />
							</f:facet>
							<br:brOutputText value="#{result.descUF}" />
						</t:column>
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.resultadoApuracaoMensal_grid_receita}" />
							</f:facet>
							<br:brOutputText value="#{result.municipioReceitaValor}"
								converter="decimalBrazillianConverter" />
						</t:column>
						<t:column width="150px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.resultadoApuracaoMensal_grid_iss_recolher}" />
							</f:facet>
							<br:brOutputText value="#{result.geralReceitaValor}"
								converter="decimalBrazillianConverter" />
						</t:column>
						<t:column width="100px"
							style="padding-right:5px; padding-left:5px">
							<f:facet name="header">
								<br:brOutputText
									value="TRAG sem TRAG?" />
							</f:facet>
							<br:brOutputText value="#{result.tragSemTrag eq 'S' ? 'Sim' : 'Não' }" />
						</t:column>
					</t:dataTable>
				</t:div>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0"rendered="#{!empty consultarApuracaoMensalBean.dependenciaApuracaoMensal.apuracoes}"
						style="padding-right:5px; padding-left:40px">
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="padding-right:5px; padding-left:5px">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"value="Total das Agências Listadas:" />
				</br:brPanelGroup>
			</br:brPanelGrid>			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:468px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.qtdeAgencia}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="padding-right:5px; padding-left:5px">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"value="Total dos PAs Listados:" />
				</br:brPanelGroup>
			</br:brPanelGrid>			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:468px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.qtdePa}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>

		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0"rendered="#{!empty consultarApuracaoMensalBean.dependenciaApuracaoMensal.apuracoes}" style="padding-right:5px; padding-left:5px">
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"value="Total das Agências:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalAgenciaReceitaValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalAgenciaRecolherValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"value="Total dos PAs:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalPaReceitaValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalPaRecolherValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"value="#{msgs.resultadoApuracaoMensal_total_municipio}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalMunucipioReceitaValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalMunucipioRecolherValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0"
			rendered="#{!empty consultarApuracaoMensalBean.dependenciaApuracaoMensal.apuracoes}"
			style="padding-right:5px; padding-left:5px">
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:30px;text-align:left">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:390px;text-align:left">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{msgs.resultadoApuracaoMensal_total_geral}:" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:150px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalGeralReceitaValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
				style="width:140px;text-align:right">
				<br:brPanelGroup>
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoMensalBean.dependenciaApuracaoMensal.totalGeralRecolherValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="5" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup style="text-align:left;width:150px">
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.consultarApuracaoAliquotaZerada_botao_voltar}"
					action="#{consultarApuracaoMensalBean.voltarConsultar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGrid columns="1" style="width:340px" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>			
			<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilha" style="margin-left: 5px"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.resultadoApuracaoOscilacaoNegativa_botao_planilha_eletronica}"
					disabled="#{empty consultarApuracaoMensalBean.dependenciaApuracaoMensal.apuracoes}"
					actionListener="#{consultarApuracaoMensalBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brCommandButton id="btnPDF" style="margin-left: 5px"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.resultadoApuracaoOscilacaoNegativa_botao_pdf}"
					disabled="#{empty consultarApuracaoMensalBean.itemSelecionadoDependencia}"
					actionListener="#{consultarApuracaoMensalBean.imprimirApuracaoMensal}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brCommandButton id="btnConsultar" style="margin-left: 5px"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.resultadoApuracaoOscilacaoNegativa_botao_consultar}"
					action="#{consultarApuracaoMensalBean.avancarDetalhar}"
					disabled="#{empty consultarApuracaoMensalBean.itemSelecionadoDependencia}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>

	<brArq:validatorScript functionName="validateForm" />

	<f:verbatim>
		<script>

	function validarCheckbox(chk) {
		//PODEM SER SELECIONADOS ATÉ 10 CHECKBOXES
		var checkboxes = document.getElementsByName('sor');
		var btnConsultar = document.getElementById('resultadoApuracaoMensal:btnConsultar');
		var btnPDF = document.getElementById('resultadoApuracaoMensal:btnPDF');
		var qtdeCheckboxes = 0;
		var qtdeCheckboxesDesabilitados = 0;
		
		btnConsultar.disabled = false;
		btnPDF.disabled = false;

		for ( var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].type === 'checkbox') {
				if (checkboxes[i].checked === true) {
					qtdeCheckboxes++;
					if (qtdeCheckboxes > 10) {
						chk.checked = false;
						alert('\u00c9 permitida a sele\u00e7\u00e3o de at\u00e9 10 depend\u00eancias');
						return;
					}
				}
				else{
					qtdeCheckboxesDesabilitados++;
				}

				if(qtdeCheckboxesDesabilitados === checkboxes.length){
					btnConsultar.disabled = true;
					btnPDF.disabled = true;
				}
			}
		}
	}
</script>
	</f:verbatim>

</brArq:form>