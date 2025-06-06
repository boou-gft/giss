<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultaLogArquivosObrigacoesWebserviceForm"
	name="consultaLogArquivosObrigacoesWebserviceForm">
	<h:inputHidden id="hiddenRadio"
		value="#{consultaLogArquivosBean.codListaPesquisar}" />

	<br:brPanelGrid columns="1" width="750px" cellpadding="0"
		cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
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
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.label_periodo_de}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
				<app:calendar id="calendarioDe"
					value="#{consultaLogArquivosBean.dataInicial}">
					<brArq:commonsValidator type="required"
						arg="#{msgs.historico_tipo_servico_periodo_inicial}"
						server="false" client="true" />
				</app:calendar>
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					style="margin-right:5px;margin-left:5px" value="#{msgs.geral_ate}" />
				<app:calendar id="calendarioAte"
					value="#{consultaLogArquivosBean.dataFinal}">
					<brArq:commonsValidator type="required"
						arg="#{msgs.historico_tipo_servico_periodo_final}" server="false"
						client="true" />
				</app:calendar>
			</br:brPanelGroup>
		</br:brPanelGrid>


		<br:brPanelGrid columns="1" width="750" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<f:verbatim>
					<hr class="lin">
				</f:verbatim>

				<br:brCommandButton id="btnPesquisar"
					onclick="javascript: return validateForm(document.forms[1]);"
					styleClass="HtmlCommandButtonBradesco !important;"
					style="margin: 8px 0 8px 0" value="#{msgs.botao_pesquisar}"
					actionListener="#{consultaLogArquivosBean.pesquisar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="1400" cellpadding="0"
			cellspacing="0" rendered="#{consultaLogArquivosBean.exibeLista}">
			<br:brPanelGroup style="width:1400px">
				<t:dataTable id="dataTable"
					value="#{consultaLogArquivosBean.listaControleLogs}" var="result"
					rows="50" cellspacing="1" cellpadding="0"
					rowClasses="tabela_celula_normal, tabela_celula_destaque"
					columnClasses="alinhamento_direita, alinhamento_esquerda, alinhamento_direita, 
			alinhamento_direita, alinhamento_direita, alinhamento_esquerda"
					headerClass="tabela_celula_destaque_acentuado">
					<t:column width="25px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="" escape="false" />
						</f:facet>
						<t:selectOneRadio
							onclick="habilitarBotaoDetalhar(document.forms[1], this);"
							id="sorLista" styleClass="HtmlSelectOneRadioBradesco" 
							layout="spread" forceId="true" forceIdIndex="false">
							<f:selectItems
								value="#{consultaLogArquivosBean.listaControleLogsCheckRadio}" />
						</t:selectOneRadio>
						<t:radio for="sorLista" index="#{result.index}" />
					</t:column>
					<t:column width="50px"
						style="padding-right:5px; padding-left:8px; height:23px; text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_remessa}" />
						</f:facet>
						<br:brOutputText value="#{result.remessa}" />
					</t:column>
					<t:column width="80px"
						style="padding-right:5px; padding-left:5px; text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.geral_dependencia}" />
						</f:facet>
						<br:brOutputText value="#{result.codDependencia}" />
					</t:column>
					<t:column width="250px"
						style="padding-right:5px; padding-left:8px; text-align:left">
						<f:facet name="header">
							<br:brOutputText style="padding-left:10px"
								value="#{msgs.label_descricao}" />
						</f:facet>
						<br:brOutputText value="#{result.descDependencia}" />
					</t:column>
					<t:column width="100px"
						style="padding-right:5px; padding-left:5px; text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_municipio}" />
						</f:facet>
						<br:brOutputText value="#{result.codMunicipio} - #{result.municipio}" />
					</t:column>
					<t:column width="120px"
						style="padding-right:5px; padding-left:5px; text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_tipo_arquivo}" />
						</f:facet>
						<br:brOutputText value="#{result.descTipoArquivo}" />
					</t:column>
					<t:column width="265px" style="text-align:left">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_nome_arquivo}" />
						</f:facet>
						<br:brOutputText value="#{result.nomeArquivo}" />
					</t:column>
					<t:column width="120px" style="text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_situacao}" />
						</f:facet>
						<br:brOutputText value="#{result.descSitTransmissao}" />
					</t:column>
					<t:column width="120px" style="text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_data}" />
						</f:facet>
						<br:brOutputText value="#{result.dataRemessa}" />
					</t:column>
					<t:column width="120px" style="text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_hora}" />
						</f:facet>
						<br:brOutputText value="#{result.horaRemessa}" />
					</t:column>
					<t:column width="150px" style="text-align:center">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.label_matricula}" />
						</f:facet>
						<br:brOutputText value="#{result.codUsuarioInclusao}" />
					</t:column>
				</t:dataTable>
				
				<br:brPanelGrid columns="1" width="520" style="text-align:center" cellpadding="0" cellspacing="0">	
				<br:brPanelGroup>
				    <brArq:pdcDataScroller id="dataScrollerBuscaMuni" for="dataTable" actionListener="#{consultaLogArquivosBean.paginarListaControleLogs}" >
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
				
				
			</br:brPanelGroup>

			<br:brPanelGroup >
				<f:verbatim>
					<hr class="lin"  width="1400" style="margin-bottom: 5px">
				</f:verbatim>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brPanelGrid columns="2" width="1400" cellpadding="0"
					cellspacing="0">
					<br:brPanelGrid columns="1" width="700" cellpadding="0" cellspacing="0"
						style="text-align:left">
						<br:brCommandButton id="btnVoltar"
							styleClass="HtmlCommandButtonBradesco"
							value="#{msgs.botao_voltar}"
							action="#{consultaLogArquivosBean.voltarInicio}"
							disabled="false">
							<brArq:submitCheckClient />
						</br:brCommandButton>
					</br:brPanelGrid>

					<br:brPanelGrid columns="1" width="700" cellpadding="0" cellspacing="0"
						style="text-align:right">
						<br:brCommandButton id="btnDetalhar" style="text-align:right"
							styleClass="HtmlCommandButtonBradesco"
							value="#{msgs.botao_detalhar}"
							action="#{consultaLogArquivosBean.detalhar}"
							disabled="true">
							<brArq:submitCheckClient />
						</br:brCommandButton>
					</br:brPanelGrid>
				</br:brPanelGrid>
			</br:brPanelGroup>

			</br:brPanelGrid>
			
	</br:brPanelGrid>

	<brArq:validatorScript functionName="validateForm" />
	<f:verbatim>
		<script>
			function habilitarBotaoDetalhar(form, radio) {
				document.getElementById("consultaLogArquivosObrigacoesWebserviceForm:btnDetalhar").disabled=false;
				
				var hidden = document.getElementById("consultaLogArquivosObrigacoesWebserviceForm:hiddenRadio");
				hidden.value = radio.value;
			}
		</script>
	</f:verbatim>
</brArq:form>