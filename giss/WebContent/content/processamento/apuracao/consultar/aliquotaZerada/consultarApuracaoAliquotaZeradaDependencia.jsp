<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>

<brArq:form id="consultarApuracaoAliquotaZeradaDependencia"
	name="agenciaIncorpDepartForm">
	<h:inputHidden id="hiddenRadio"
		value="#{consultarApuracaoAliquotaZeradaBean.radioAliquotaZerada}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGroup>
			<f:verbatim>&nbsp</f:verbatim>
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
				value="#{msgs.path_apuracaoMensalDiferenciada_secondBall_resultado_da_pesquisa}" />
		</br:brPanelGroup>

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.apuracaoMensalDiferenciada_title_informacoes_para_processamento}:" />
			</br:brPanelGroup>

			<br:brPanelGroup>
				<f:verbatim>&nbsp</f:verbatim>
			</br:brPanelGroup>

		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0" rendered="true">

			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia1Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia1}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGrid id="panelListaMunicipios" columns="1" width="100%"
				cellpadding="0" cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia1Existe}">
				<br:brPanelGroup style="width:750px">
					<t:div styleClass="barraDeRolagem">
							<t:dataTable id="dataTable1"
								value="#{consultarApuracaoAliquotaZeradaBean.lista1}"
								var="result1"  cellspacing="1" cellpadding="0"
								rowClasses="tabela_celula_normal, tabela_celula_destaque"
								columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
								headerClass="tabela_celula_destaque_acentuado" width="750px">

								<t:column width="30px"
									style="padding-right:5px; padding-left:5px">
									<f:facet name="header">
										<br:brOutputText value="" escape="false" />
									</f:facet>
									<t:selectOneRadio
										onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
										id="sorLista1" styleClass="HtmlSelectOneRadioBradesco"
										layout="spread" forceId="true" forceIdIndex="false" onselect="">
										<f:selectItems
											value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
									</t:selectOneRadio>
									<t:radio for="sorLista1" index="#{result1.linha}"  />
								</t:column>

								<t:column width="140px"
									style="padding-right:5px; padding-left:5px">
									<f:facet name="header">
										<br:brOutputText
											value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
									</f:facet>
									<br:brOutputText value="#{result1.codDepPa}" />
								</t:column>

								<t:column width="350px"
									style="padding-right:5px; padding-left:5px">
									<f:facet name="header">
										<br:brOutputText
											style="width:100%; text-align:left; margin-left:5px"
											value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
									</f:facet>
									<br:brOutputText value="#{result1.descDepPa}" />
								</t:column>

								<t:column width="250px"
									style="padding-right:5px; padding-left:5px">
									<f:facet name="header">
										<br:brOutputText
											style="width:100%; text-align:left; margin-left:5px"
											value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
									</f:facet>
									<br:brOutputText style="align:right"
										style="width:100%;text-align:right"
										value="#{result1.receitaValor}"
										converter="decimalBrazillianConverter" />
								</t:column>
							</t:dataTable>
					</t:div>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia2Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia2}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia2Existe}">
				<t:div styleClass="barraDeRolagem">

						<t:dataTable id="dataTable2"
							value="#{consultarApuracaoAliquotaZeradaBean.lista2}"
							var="result2"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result2.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result2.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result2.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result2.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>



			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia3Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia3}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia3Existe}">

					<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable3"
							value="#{consultarApuracaoAliquotaZeradaBean.lista3}"
							var="result3"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista3" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result3.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result3.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result3.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result3.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
					</t:div>
			</br:brPanelGroup>




			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia4Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia4}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia4Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable4"
							value="#{consultarApuracaoAliquotaZeradaBean.lista4}"
							var="result4"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista4" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result4.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result4.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result4.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result4.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>



			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia5Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia5}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia5Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable5"
							value="#{consultarApuracaoAliquotaZeradaBean.lista5}"
							var="result5"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista5" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result5.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result5.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result5.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result5.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>



			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia6Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia6}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia6Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable6"
							value="#{consultarApuracaoAliquotaZeradaBean.lista6}"
							var="result6"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista6" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result6.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result6.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result6.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result6.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia7Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia7}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia7Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable7"
							value="#{consultarApuracaoAliquotaZeradaBean.lista7}"
							var="result7"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista7" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result7.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result7.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result7.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result7.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>



			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia8Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia8}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia8Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable8"
							value="#{consultarApuracaoAliquotaZeradaBean.lista8}"
							var="result8"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista8" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result8.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result8.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result8.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result8.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia9Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia9}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia9Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable9"
							value="#{consultarApuracaoAliquotaZeradaBean.lista9}"
							var="result9"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista9" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result9.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result9.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result9.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result9.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia10Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia10}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia10Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable10"
							value="#{consultarApuracaoAliquotaZeradaBean.lista10}"
							var="result10"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista10" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result10.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result10.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result10.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result10.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia11Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia11}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia11Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable11"
							value="#{consultarApuracaoAliquotaZeradaBean.lista11}"
							var="result11"  cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista11" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result11.linha}" />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result11.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result11.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result11.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0"
				cellspacing="0"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia12Existe}">
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_estado}:" />
				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_municipio}:" />

				</br:brPanelGroup>

				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
					<br:brOutputText
						value="#{msgs.apuracaoMensalDiferenciada_label_competencia}:" />

				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.estado} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.municipio} "></br:brOutputText>
				</br:brPanelGroup>

				<br:brPanelGroup style="width:200px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.competencia12}"></br:brOutputText>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup style="width:750px"
				rendered="#{consultarApuracaoAliquotaZeradaBean.competencia12Existe}">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable12"
							value="#{consultarApuracaoAliquotaZeradaBean.lista12}"
							var="result12" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="750px">

							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);"
									id="sorLista12" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{consultarApuracaoAliquotaZeradaBean.listaRadioAliquotaZerada}" />
								</t:selectOneRadio>
								<t:radio id="rdLista12" for=":consultarApuracaoAliquotaZeradaDependencia:dataTable1:sorLista1" index="#{result12.linha}"  />
							</t:column>

							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.apuracaoMensalDiferenciada_label_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result12.codDepPa}" />
							</t:column>

							<t:column width="350px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.apuracaoMensalDiferenciada_label_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result12.descDepPa}" />
							</t:column>

							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										style="width:100%; text-align:left; margin-left:5px"
										value="#{msgs.consultarApuracaoAliquotaZerada_label_receita}" />
								</f:facet>
								<br:brOutputText style="align:right"
									style="width:100%;text-align:right"
									value="#{result12.receitaValor}"
									converter="decimalBrazillianConverter" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>


			<br:brPanelGrid columns="2" width="100%" cellpadding="0"
				cellspacing="0"
				rendered="#{!empty consultarApuracaoAliquotaZeradaBean.listAliquotaZerada}">
				<br:brPanelGroup style="margin-left:32px;width:375px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="Total das Agências Listadas:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;width:345px;">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.qtdeAgencia}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="2" width="100%" cellpadding="0"
				cellspacing="0"
				rendered="#{!empty consultarApuracaoAliquotaZeradaBean.listAliquotaZerada}">
				<br:brPanelGroup style="margin-left:32px;width:375px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
						value="Total dos PAs Listados:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;width:345px;">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.qtdePa}"/>
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="2" width="100%" cellpadding="0"
				cellspacing="0"
				rendered="#{!empty consultarApuracaoAliquotaZeradaBean.listAliquotaZerada}">
				<br:brPanelGroup style="margin-left:32px;width:375px">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="Total:" />
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;width:345px">
					<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco"
						value="#{consultarApuracaoAliquotaZeradaBean.totalValor}"
						converter="decimalBrazillianConverter" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<f:verbatim>
				<BR>
			</f:verbatim>

		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="4" width="100%" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup style="text-align:left;width:100%">
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.apuracaoMensalDiferenciada_btn_voltar}"
					action="#{consultarApuracaoAliquotaZeradaBean.voltar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup style="width:450px" />

			<br:brPanelGroup style="text-align:left;width:100%">
				<br:brCommandButton id="btnPlanilhaEletronica"
					styleClass="HtmlCommandButtonBradesco" value="Planilha Eletrônica"
					disabled="#{empty consultarApuracaoAliquotaZeradaBean.listAliquotaZerada}"
					actionListener="#{consultarApuracaoAliquotaZeradaBean.imprimirPlanilhaAliquotas}"
					onclick="desbloqTela()">

					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup style="text-align:right;width:100%">
				<br:brCommandButton id="btnConsultar"
					styleClass="HtmlCommandButtonBradesco" disabled="true"
					value="#{msgs.apuracaoMensalDiferenciada_btn_consultar}"
					action="#{consultarApuracaoAliquotaZeradaBean.consultar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>

	<f:verbatim>
		<script language="javascript">
	function habilitaBotaoProsseguir(form, radio) {
		var hidden;
		for (i = 0; i < form.elements.length; i++) {
			if (form.elements[i].id == 'consultarApuracaoAliquotaZeradaDependencia:btnConsultar') {
				form.elements[i].disabled = false;
			}

			if (form.elements[i].id == 'consultarApuracaoAliquotaZeradaDependencia:hiddenRadio') {
				hidden = form.elements[i];
				hidden.value = radio.value;
			}

		}
	}

	function habilitaBotaoConsultar() {

		var combo = document
				.getElementById("consultarApuracaoAliquotaZeradaDependencia:comboEstado").value;

		if ((combo > 0))
			document
					.getElementById("consultarApuracaoAliquotaZeradaDependencia:btnConsultar").disabled = "";

	}
</script>
	</f:verbatim>

	<brArq:validatorScript functionName="validateForm" />
</brArq:form>