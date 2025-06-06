<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirCodLancamentoForm"
	name="incluirCodLancamentoForm">
	<h:inputHidden id="hiddenProsseguir"
		value="#{arquivoEmpresaISSBean.hiddenProsseguir}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold"
					styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.label_iss_gerencial_empresa}" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.label_mes_base}" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />

			<br:brPanelGroup>
			</br:brPanelGroup>

			<br:brSelectOneMenu style="width:180px" id="estado"
				value="#{arquivoEmpresaISSBean.dto.codEmpresa}">
				<f:selectItem itemValue="0"
					itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{arquivoEmpresaISSBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brInputText id="txtMesBase"
					value="#{arquivoEmpresaISSBean.dto.mesBase}"
					styleClass="HtmlInputTextBradesco" style="text-align: right"
					maxlength="2" size="3"
					onblur="validarData('incluirCodLancamentoForm','incluirCodLancamentoForm:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')"
					onchange="habilitaBotaoConsultar()"
					onkeypress="aplicamascara('incluirCodLancamentoForm','incluirCodLancamentoForm:txtMesBase',numeros);"
					onkeyup="proximoCampo(2,'incluirCodLancamentoForm','incluirCodLancamentoForm:txtMesBase','incluirCodLancamentoForm:txtAnoBase');">
					<brArq:commonsValidator type="required"
						arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoBase"
					value="#{arquivoEmpresaISSBean.dto.anoBase}"
					styleClass="HtmlInputTextBradesco" style="text-align: right"
					maxlength="4" size="5"
					onblur="validarData('incluirCodLancamentoForm','incluirCodLancamentoForm:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');"
					onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()"
					onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required"
						arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />

		</br:brPanelGrid>


		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>


				<br:brCommandButton id="btnIncluir"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_pesquisar}"
					action="#{arquivoEmpresaISSBean.pesquisar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<br>
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<t:div
				style="overflow-Y:scroll;overflow-X:scroll; height:275;width:750">
				<t:dataTable id="dataTable"
					value="#{arquivoEmpresaISSBean.dto.lista}" var="result"
					rowIndexVar="indexLista" cellspacing="1" cellpadding="0"
					rowClasses="tabela_celula_normal, tabela_celula_destaque"
					headerClass="tabela_celula_destaque_acentuado" width="3000px">
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" />
						</f:facet>
						<br:brOutputText value="#{result.codEmpresa}" />
					</t:column>
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<h:outputText value="#{msgs.label_iss_gerencial_produto}" />
						</f:facet>
						<br:brOutputText value="#{result.produto}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_periodo_enviado}" />
						</f:facet>
						<br:brOutputText value="#{result.periodoEnviado}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_mes_competencia}" />
						</f:facet>
						<br:brOutputText value="#{result.anoMesFormatado}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_data_recepcao}" />
						</f:facet>
						<br:brOutputText value="#{result.dataRecepcao}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_status_Arquivo}" />
						</f:facet>
						<br:brOutputText value="#{result.statusArquivo}" />
					</t:column>
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_codigo_finalidade}" />
						</f:facet>
						<br:brOutputText value="#{result.codFinalidade}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="Total de Registros" />
						</f:facet>
						<br:brOutputText value="#{result.qtdeRegistros}" />
					</t:column>
					<t:column width="150px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_iss_gerencial_rejeitado}" />
						</f:facet>
						<br:brOutputText value="#{result.rejeitados}" />
					</t:column>
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_porcent_rejeicao}" />
						</f:facet>
						<br:brOutputText value="#{result.porcentRejeicao}" />
					</t:column>
					<t:column width="180px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_receita_rejeitado}" />
						</f:facet>
						<br:brOutputText value="#{result.receitaRejeitados}" />
					</t:column>
					<t:column width="180px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_iss_gerencial_aceitos}" />
						</f:facet>
						<br:brOutputText value="#{result.aceitos}" />
					</t:column>
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_receita_aceita}" />
						</f:facet>
						<br:brOutputText value="#{result.receitaAceitos}" />
					</t:column>
					<t:column width="180px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="Registros Base Negativa" />
						</f:facet>
						<br:brOutputText value="#{result.qtdRegistroBaseNegativa}" />
					</t:column>
					<t:column width="180px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_valor_receita_base_neg}" />
						</f:facet>
						<br:brOutputText value="#{result.valorReceitaBaseNegativa}" />
					</t:column>
					<t:column width="180px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_base_calc_apurada}" />
						</f:facet>
						<br:brOutputText value="#{result.baseCalcApurada}" />
					</t:column>
					<t:column width="200px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText
								value="#{msgs.label_iss_gerencial_valor_calc_iss}" />
						</f:facet>
						<br:brOutputText value="#{result.valorCalcIss}" />
					</t:column>
				</t:dataTable>
			</t:div>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>

			<br:brPanelGroup>
				<br:brCommandButton id="btnTxt"
					styleClass="HtmlCommandButtonBradesco" value="TXT"
					actionListener="#{arquivoEmpresaISSBean.consultarTXT}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>

				<f:verbatim>&nbsp;&nbsp;</f:verbatim>
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{arquivoEmpresaISSBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco" style="align:left"
					value="#{msgs.botao_voltar}"
					action="#{arquivoEmpresaISSBean.voltarConArquivoEmpSem}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>


	<brArq:validatorScript functionName="validateForm" />
	<f:verbatim>
		<script>
			function setHiddenProssegue(form, flag) {
				var hidden;

				for (i = 0; i < form.elements.length; i++) {

					if (form.elements[i].id == 'incluirCodLancamentoForm:hiddenProsseguir') {
						hidden = form.elements[i];
						hidden.value = flag;
					}
				}
			}
			function Somaiuscula(formato, keypress, objeto) {
				campo = eval(objeto);
				caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
				if (caracteres.search(String.fromCharCode(keypress)) != 1) {
					campo.value = campo.value.toUpperCase();
				}
			}

			function validaTecla(valores, event) {

				var BCK = 8, //backspace 

				ETR = 13, //return 

				DEL = 127, //delete 

				//MIN=45, //'-' 

				//LEFT=37, 

				//RIGHT=39, 

				//UP=38, 

				//DOWN=40, 

				key, tecla;

				if (BrowserDetect.browser == 'Firefox' && event.which) {
					tecla = event.which;
				} else if (BrowserDetect.browser == 'Explorer' && event.keyCode) {
					tecla = event.keyCode;
				} else {
					return true;
				}

				key = String.fromCharCode(tecla);

				switch (tecla) {

				case ETR:

				case BCK:

				case DEL:

					//case MIN: 

					//case LEFT: 

					//case RIGHT: 

					//case UP: 

					//case DOWN: 

					return true;

				default:

					if (valores.indexOf(key) != -1) {
						return true;
					}
				}

				return false;
			}
		</script>
	</f:verbatim>
</brArq:form>
