<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="solicitarReprocessamentoPorDependenciaProsseguirForm"
	name="solicitarReprocessamentoPorDependenciaProsseguirForm">
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_informacoes_apuracao}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGroup style="height: 15px;" />
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_competencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{movimentoNaoTributavelBean.dataFormatada}" />

				<br:brPanelGroup style="width: 60px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_dependencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{movimentoNaoTributavelBean.dependencia}" />

				<br:brPanelGroup style="width: 60px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_descricao}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{movimentoNaoTributavelBean.descricao}" />

			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGroup style="height: 15px;" />

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_baseCalculo}:" />
				<br:brOutputText styleClass="HtmlOutputTextBoldBradesco" converter="decimalBrazillianConverter"
					value="#{movimentoNaoTributavelBean.baseCalculo}" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="%" />

				<br:brPanelGroup style="width: 60px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_aliquotaPadrao}:" />
				<br:brOutputText styleClass="HtmlOutputTextBoldBradesco" converter="decimalBrazillianConverter"
					value="#{movimentoNaoTributavelBean.aliquotaPadrao}" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="%" />

				<br:brPanelGroup style="width: 60px;" />

				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextLabelBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_tipoIncidencia}:" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{movimentoNaoTributavelBean.tipoIncidencia}" />

			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.path_movimentoNaoTributavel_label_resultado_pesquisa}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup style="width:750px">
				<t:dataTable id="dataTable"
					value="#{movimentoNaoTributavelBean.listaContas.listaMovNaoTribContaDTO}" var="result"
					rows="50" cellspacing="1" cellpadding="0"
					rowClasses="tabela_celula_normal, tabela_celula_destaque"
					columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita"
					headerClass="tabela_celula_destaque_acentuado" width="750px">
					<t:column width="375px" style="padding-right:5px; padding-left:5px; height:23px;" rendered="#{movimentoNaoTributavelBean.razaoExiste}">
						<f:facet name="header">
			      			<br:brOutputText value="COSIF"/>
						</f:facet>
						<br:brOutputText value="#{result.cosif}" />
					</t:column>
					<t:column width="375px" style="padding-right:5px; padding-left:5px; height:23px;"  rendered="#{!movimentoNaoTributavelBean.razaoExiste}">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.consultarApuracaoParcial_label_conta}"/>
						</f:facet>
						<br:brOutputText value="#{result.cosif}" />
					</t:column>
					<t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center"
						rendered="#{movimentoNaoTributavelBean.razaoExiste}">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_razao}" />
						</f:facet>
						<br:brOutputText value="#{result.razao}" />
					</t:column>
					<t:column style="width: 200px;padding-right:5px; padding-left:5px;text-align:center"
						rendered="#{movimentoNaoTributavelBean.razaoExiste}">
						<f:facet name="header">
							<br:brOutputText value="Conta" />
						</f:facet>
						<br:brOutputText value="#{result.conta}" />
					</t:column>
				  <t:column width="250px" style="padding-right:5px; padding-left:5px"
				  		rendered="#{movimentoNaoTributavelBean.razaoExiste}">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_movimento}"  />
				    </f:facet>
				  <br:brOutputText value="#{result.movimento}" converter="decimalBrazillianConverter"/>
				  </t:column>
					<t:column width="375px" style="padding-right:5px; padding-left:5px">
						<f:facet name="header">
							<br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_receita}" />
						</f:facet>
						<br:brOutputText value="#{result.receita}" converter="decimalBrazillianConverter" />
					</t:column>
				</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>



		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" style="width:750px;height:20px">
			<br:brPanelGroup style="width: 500px; text-align: center;">
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.planilhaApuracao_resultado_grid_total}" />
			</br:brPanelGroup>
			<%--
		<br:brPanelGroup style="width: 250px; text-align: right;">
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" converter="decimalBrazillianConverter" value="#{movimentoNaoTributavelBean.totalMovimento}" />
		</br:brPanelGroup>
		--%>

			<br:brPanelGroup style="width: 250px; text-align: right;">
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
					converter="decimalBrazillianConverter" value="#{movimentoNaoTributavelBean.totalReceita}" />
			</br:brPanelGroup>
		</br:brPanelGrid>










		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable"
					actionListener="#{movimentoNaoTributavelBean.paginarListaContas}"
					rendered="#{movimentoNaoTributavelBean.listaContas.listaMovNaoTribContaDTO != null && movimentoNaoTributavelBean.mostraPaginacaoContas}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco"
							style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco"
							style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.path_movimentoNaoTributavel_botao_voltar}"
					action="#{movimentoNaoTributavelBean.voltarMovimentoNaoTributavelProsseguir}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>





	</br:brPanelGrid>
</brArq:form>