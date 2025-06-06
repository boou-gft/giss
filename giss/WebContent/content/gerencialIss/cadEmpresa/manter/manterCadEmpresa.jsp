<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="authz"%>

<brArq:form id="manterCodLancamentoForm" name="manterCodLancamentoForm">
	<h:inputHidden id="hiddenProsseguir"
		value="#{empresaISSBean.hiddenProsseguir}" />
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
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

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup></br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.label_iss_gerencial_codigo_empresa}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.label_iss_gerencial_cnpj_empresa}:" />
			</br:brPanelGroup>
			<br:brPanelGroup style="width:20px; margin-bottom:5px">
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brInputText size="17" maxlength="5" id="txtCodigo"
					value="#{empresaISSBean.dtoManter.codEmpresa}"
					onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brInputText id="cnpj" maxlength="18" size="25"
					onfocus="loadMasks()" alt="cnpj"
					onkeypress="return validaTecla('0123456789', event)"
					value="#{empresaISSBean.dtoManter.cnpjFormatado}" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar"
					styleClass="HtmlCommandButtonBradesco" value="Pesquisar"
					action="#{empresaISSBean.pesquisar}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>


		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0"
			columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco"
					value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<t:selectOneRadio id="checkboxRegistro" layout="spread" forceId="true"
			forceIdIndex="true" immediate="true"
			value="#{empresaISSBean.codigosSelecionadosTabela}">
			<f:selectItems value="#{empresaISSBean.selectItemCadastro}" />
		</t:selectOneRadio>
		<t:div style="overflow-Y:scroll; height:390;display:block">
			<br:brPanelGrid columns="1" width="100%" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup>

					<t:dataTable id="dataTable"
						value="#{empresaISSBean.dtoManter.lista}" var="result"
						rowIndexVar="indexLista" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px">
							<f:facet name="header">

							</f:facet>

							<t:radio index="#{indexLista}"
								for=":manterCodLancamentoForm:checkboxRegistro" />
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.label_iss_gerencial_codigo_empresa}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.codEmpresa}"
								style="margin-left:5 px; float:left;" escape="false" />
						</t:column>
						<t:column width="300px">
							<f:facet name="header">
								<h:outputText value="#{msgs.label_iss_gerencial_empresa}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText
								value="#{result.cnpjFormatado} -  #{result.descEmpresa}"
								style="margin-left:5 px; float:left;" escape="false" />
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.label_iss_gerencial_conta_despesa}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.contaDespesaForm}"
								style="margin-left:5 px;float:left;" escape="false" />
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.label_iss_gerencial_conta_provisao}"
									style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"
									escape="false" />
							</f:facet>
							<br:brOutputText value="#{result.contaProvisaoForm}"
								style="margin-left:5 px;float:left;" escape="false" />
						</t:column>

					</t:dataTable>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</t:div>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>
			<br:brPanelGroup>
				<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_INC_CAD_EMP">
					<br:brCommandButton id="btnIncluir"
						styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_incluir}"
						action="#{empresaISSBean.inicializarIncluir}"
						style="margin-right:5px"> 
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</authz:authorize>
				<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_ALT_CAD_EMP">
					<br:brCommandButton id="btnAlterar"
						styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_alterar}"
						action="#{empresaISSBean.inicializarAlterar}"
						style="margin-right:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</authz:authorize>
				<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_EXC_CAD_EMP">
					<br:brCommandButton id="btnExcluir"
						styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_excluir}"
						onclick="	
						if(!confirm('Deseja excluir a Empresa?')){
							setHiddenProssegue(document.forms[1],false);
						}else{
							setHiddenProssegue(document.forms[1],true);
					    };"
						action="#{empresaISSBean.excluirEmpresa}"
						style="margin-right:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</authz:authorize>
				<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_DET_CAD_EMP">
					<br:brCommandButton id="btnDetalhar"
						styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_detalhar}"
						action="#{empresaISSBean.inicializarDetalhar}">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</authz:authorize>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>

	<brArq:validatorScript functionName="validateForm" />
	<f:verbatim>
		<script>
function setHiddenProssegue(form, flag){	
	var hidden;	
	
	for(i=0; i<form.elements.length; i++)
	{
			
		if (form.elements[i].id == 'manterCodLancamentoForm:hiddenProsseguir'){		
			hidden = form.elements[i];
			hidden.value = flag;				
		}		
	}	
}
</script>
	</f:verbatim>

</brArq:form>