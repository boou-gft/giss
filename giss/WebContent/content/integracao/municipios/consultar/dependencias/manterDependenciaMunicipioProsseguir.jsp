<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterDependenciaMunicipioProsseguir" name="manterDependenciaMunicipioProsseguir" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_municipio_prosseguir_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_municipio_prosseguir_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciasMunicipioBean.estado}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_municipio_prosseguir_label_municipio}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciasMunicipioBean.nome}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid id="panelGridEstado" columns="1" cellpadding="0" style="margin-top:6px;"cellspacing="0">
		<br:brPanelGroup id="estado">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_municipio_label_dependencias_municipio}:" />
		</br:brPanelGroup>			
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="550px" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{dependenciasMunicipioBean.dependenciaMunicipio.lstMunicipios}"
							var="result" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_direita, alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="550px">
							<t:column width="80px"
								style="padding-right:5px; padding-left:5px;height:23px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.manter_dependencia_municipio_prosseguir_grid_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result.codigoDependencia}"
									style="float:left; margin-left:1 px;" />
							</t:column>
							<t:column width="470px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.manter_dependencia_municipio_prosseguir_grid_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result.descricaoDependencia}" />
							</t:column>
							<t:column width="470px"
								style="padding-right:5px; padding-left:5px;text-align: left">
								<f:facet name="header">
									<br:brOutputText
										value="Situação da Dependência" />
								</f:facet>
								<br:brOutputText value="#{result.situacaoDependencia}" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="2" width="75%">
		
		<br:brPanelGroup>
			<br:brOutputLabel value="Total de Dependências Ativas" styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGroup>
		<br:brPanelGrid align="right">
			<br:brPanelGroup>
				<br:brOutputLabel style="margin-right" value="#{dependenciasMunicipioBean.dependenciaMunicipio.qtdeDependenciasAtivas}" styleClass="HtmlOutputTextRespostaBradesco" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup>
			<br:brOutputLabel value="Total de Dependências Encerradas" styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGroup>
		<br:brPanelGrid align="right">
			<br:brPanelGroup>
				<br:brOutputLabel style="margin-right" value="#{dependenciasMunicipioBean.dependenciaMunicipio.qtdeDependenciasEncerradas}" styleClass="HtmlOutputTextRespostaBradesco" />
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="3" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manter_dependencia_municipio_prosseguir_btn_voltar}" action="manterDependenciaMunicipio" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
		<br:brPanelGroup style="width: 550px" />
			<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{dependenciasMunicipioBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:300px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
