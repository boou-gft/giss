<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="formDetalheDepen" name="detalheDepen">
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoMensalBean.radioTelaConta}"/>
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
					value="#{msgs.detalheApuracaoMensal_title_informacoes_apuracao}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>


		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
				<t:dataTable id="dtDependencia" var="dependencia"
					value="#{consultarApuracaoMensalBean.lstDetalDependencias}"
					rows="10" width="750px" rowIndexVar="apuracaoKey">
					<t:column width="100%"
						style="height:23px; padding-right:5px; padding-left:5px">

						<f:verbatim>
							<hr class="lin">
						</f:verbatim>

						<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_competencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.mesCompetenciaFiltro}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_dependencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.dependencia}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_descricao}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.descricao}" />
							</br:brPanelGroup>
						</br:brPanelGrid>

						<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas"
							cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
							</br:brPanelGroup>
						</br:brPanelGrid>

						<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_base_calculo}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.baseCalculo}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_aliquota_padrao}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.aliquotaPadrao}" />
							</br:brPanelGroup>
							<br:brPanelGroup>
								<br:brGraphicImage url="/images/bullet.jpg"
									styleClass="HtmlBullet" />
								<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
									value="#{msgs.detalheApuracaoMensal_tipo_incidencia}:" />
								<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
									value="#{dependencia.tipoIncidencia}" />
							</br:brPanelGroup>
						</br:brPanelGrid>

						<f:verbatim>
							<br />
						</f:verbatim>


						<t:column width="30px">
							<f:facet name="header">
								<br:brOutputText value="" escape="false" />
							</f:facet>
							<t:selectManyCheckbox
								value="#{consultarApuracaoMensalBean.itemSelecionadoDetalhe}"
								onclick="desativarBotao(this)" id="sor" layout="spread"
								forceId="true" forceIdIndex="false">
								<f:selectItems
									value="#{consultarApuracaoMensalBean.listaCheckBoxDetalhe}" />
							</t:selectManyCheckbox>
							<t:checkbox for="sor" index="#{apuracaoKey}" />
							<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Selecione aqui para obter o detalhe desta lista!" />
						</t:column>

						<br:brPanelGrid columns="1" width="100%" cellpadding="0"
							cellspacing="0">
							<br:brPanelGroup>
								<t:div styleClass="barraDeRolagem">
										<t:dataTable id="dataTable"
											value="#{dependencia.listaApuracaoMensalTotalizada}"
											var="result" rows="50" cellspacing="1" cellpadding="0"
											rowClasses="tabela_celula_normal, tabela_celula_destaque"
											columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita,alinhamento_direita,alinhamento_direita"
											headerClass="tabela_celula_destaque_acentuado" width="750px">
											<t:column width="25px" style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
											      <br:brOutputText value="" escape="false" />
											    </f:facet>		
												<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
													<f:selectItems value="#{dependencia.listaControleCheckRadioConta}"/>
												</t:selectOneRadio>
										    	<t:radio for="sorLista" index="#{result.linha}"  />
											</t:column>
											<t:column width="100px"
												style="height:23px; padding-right:5px; padding-left:5px"
												 rendered="#{!dependencia.razaoExiste}">
												<f:facet name="header">
													<br:brOutputText value="Conta" />
												</f:facet>
												<br:brOutputText value="#{result.cosif}" />
											</t:column>
											<t:column width="100px"
												style="height:23px; padding-right:5px; padding-left:5px"
												 rendered="#{dependencia.razaoExiste}">
												<f:facet name="header">
													<br:brOutputText value="#{msgs.label_cosif}" />
												</f:facet>
												<br:brOutputText value="#{result.cosif}" />
											</t:column>
											<t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{dependencia.razaoExiste}">
												<f:facet name="header">
													<h:outputText value="#{msgs.valor_mes_total_razao}" />
												</f:facet>
												<br:brOutputText value="#{result.razao}" />
											</t:column>
											<t:column width="150px"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<h:outputText
														value="#{msgs.apuracao_reprocessamento_movimento}" />
												</f:facet>
												<br:brOutputText value="#{result.receitaApuracaoValor}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="150px"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_tributavel}" />
												</f:facet>
												<br:brOutputText
													value="#{result.receitaTributoApuracaoValor}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="150px"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_aliquota}" />
												</f:facet>
												<br:brOutputText
													value="#{result.percentualAliquotaApuracao}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
											<t:column width="150px"
												style="padding-right:5px; padding-left:5px">
												<f:facet name="header">
													<br:brOutputText
														value="#{msgs.apuracao_reprocessamento_iss}" />
												</f:facet>
												<br:brOutputText value="#{result.tributoApuracaoValor}">
													<f:converter converterId="decimalBrazillianConverter" />
												</br:brOutputText>
											</t:column>
										</t:dataTable>
								</t:div>
							</br:brPanelGroup>
						</br:brPanelGrid>

						<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0"
							rendered="#{!empty consultarApuracaoMensalBean.apuracaoMensalTotalizada.listaApuracaoMensalTotalizada}"
							style="padding-right:5px; padding-left:5px">
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:50px;text-align:left">
								<br:brPanelGroup>
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:110px;text-align:left">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
										value="#{msgs.resultadoApuracaoMensal_total}:" />
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:80px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{dependencia.totalMovimento}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:152px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{dependencia.totalTributavel}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
							<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"
								style="width:307px;text-align:right">
								<br:brPanelGroup>
									<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
										value="#{dependencia.totalISS}"
										converter="decimalBrazillianConverter" />
								</br:brPanelGroup>
							</br:brPanelGrid>
						</br:brPanelGrid>

					</t:column>
				</t:dataTable>
			</br:brPanelGroup>

			<br:brPanelGrid columns="3" width="100%" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup style="text-align:left;width:150px">
					<br:brCommandButton id="btnVoltar"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.detalheApuracaoMensal_btn_voltar}"
						action="#{consultarApuracaoMensalBean.voltarResultado}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="width:450px" />
				<br:brPanelGroup style="width:150px;float:right">
					<br:brPanelGrid columns="2">
						<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguir2" 
							action="#{consultarApuracaoMensalBean.avancarDetalharConta}" 
							value="#{msgs.consultarApuracaoParcial_btn_prossseguir}" disabled="true">
							<brArq:submitCheckClient/>
						</br:brCommandButton>			
						<br:brCommandButton id="btnPDF"
							styleClass="HtmlCommandButtonBradesco"
							value="#{msgs.resultadoApuracaoOscilacaoNegativa_botao_pdf}"
							actionListener="#{consultarApuracaoMensalBean.imprimir}"
							onclick="desbloqTela();" disabled="true">
							<brArq:submitCheckClient />
						</br:brCommandButton>
					</br:brPanelGrid>
				</br:brPanelGroup>
			</br:brPanelGrid>


		</br:brPanelGrid>
	</br:brPanelGrid>
</brArq:form>

<f:verbatim>
	<script language="javascript">
	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'formDetalheDepen:btnProsseguir2'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'formDetalheDepen:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function desativarBotao(chk) {

		var checkboxes = document.getElementsByName('sor');
		var btnPDF = document.getElementById('formDetalheDepen:btnPDF');
		var btnProsseguir = document.getElementById('formDetalheDepen:btnProsseguir2');

		var qtdeSelecionados = 0;

		for ( var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].type === 'checkbox') {
				if (checkboxes[i].checked === true) {
					qtdeSelecionados++;
				}
			}
		}
		btnProsseguir.disabled =  qtdeSelecionados != 1;
		btnPDF.disabled = qtdeSelecionados <= 0;

	}
</script>
</f:verbatim>
