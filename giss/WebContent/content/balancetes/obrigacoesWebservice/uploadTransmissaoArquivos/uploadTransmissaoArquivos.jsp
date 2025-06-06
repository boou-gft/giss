<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components"
	prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>


<brArq:form id="uploadTransmissasoArquivosObrigacoesWebserviceForm"
	enctype="multipart/form-data" style="position: relative;"
	name="uploadTransmissasoArquivosObrigacoesWebserviceForm">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
		cellspacing="0">
	</br:brPanelGrid>

	<br:brPanelGrid columns="2" width="750" cellpadding="5" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.label_estado}: " />
			<br:brSelectOneMenu style="width:180px;cursor:hand;" id="estados"
				onclick="verificarCamposPreenchidos()"
				value="#{uploadTransmissaoArquivosBean.estadoSelecionado}">
				<f:selectItem itemValue=""
					itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{uploadTransmissaoArquivosBean.comboEstados}" />
				<a4j:support
					reRender="uploadTransmissasoArquivosObrigacoesWebserviceForm"
					event="onchange"
					action="#{uploadTransmissaoArquivosBean.carregarComboMunicipios}" />
			</br:brSelectOneMenu>
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.geral_municipio}: " />
			<br:brSelectOneMenu style="width:180px;cursor:hand;" id="municipio"
				onclick="verificarCamposPreenchidos()"
				value="#{uploadTransmissaoArquivosBean.municipioSelecionado}">
				<f:selectItem itemValue=""
					itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems
					value="#{uploadTransmissaoArquivosBean.comboMunicipiosPorEstado}" />
				<a4j:support reRender="uploadTransmissasoArquivosObrigacoesWebserviceForm" event="onchange"
					action="#{uploadTransmissaoArquivosBean.carregarDependencias}" />
			</br:brSelectOneMenu>
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.geral_dependencia}: " />
			<br:brSelectOneMenu style="width:180px;cursor:hand;" id="dependencia"
				onclick="verificarCamposPreenchidos()"
				value="#{uploadTransmissaoArquivosBean.dependenciaSelecionada}">
				<f:selectItem itemValue=""
					itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems
					value="#{uploadTransmissaoArquivosBean.comboDependencias}" />
					<a4j:support reRender="uploadTransmissasoArquivosObrigacoesWebserviceForm" event="onchange"
					action="#{uploadTransmissaoArquivosBean.limparFile}" />
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="2" width="330" cellpadding="5"
		cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.label_tipo_arquivo}: " />
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brSelectOneRadio id="tipoArquivo"
				styleClass="HtmlSelectOneRadioBradesco"
				value="#{uploadTransmissaoArquivosBean.tipoArquivo}"
				onclick="verificarCamposPreenchidos()">
				<f:selectItem itemValue="2"
					itemLabel="#{msgs.label_tipo_arquivo_plano_contas}" />
				<f:selectItem itemValue="1"
					itemLabel="#{msgs.label_tipo_arquivo_lancamentos}" />
			<a4j:support reRender="uploadTransmissasoArquivosObrigacoesWebserviceForm" event="onchange"
					action="#{uploadTransmissaoArquivosBean.limparFile}" />	
			</br:brSelectOneRadio>
		</br:brPanelGroup>

	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="750" cellpadding="5"
		cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.label_nome_arquivo}: " />
			<t:inputFileUpload id="nomeArquivo"
				styleClass="HtmlCommandButtonBradesco !important;" size="80"
				onchange="clickUpload();verificarCamposPreenchidos()" 
				value="#{uploadTransmissaoArquivosBean.uploadedFile}"
				disabled="#{uploadTransmissaoArquivosBean.nomeArquivoDesabilitado}">
			</t:inputFileUpload>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" width="750" cellpadding="5"
		cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
				value="#{msgs.label_confirma_transmissao}: " />
			<br:brCommandButton id="btnSim" style="margin-right: 5px" disabled="true"
				styleClass="HtmlCommandButtonBradesco !important;"
				value="#{msgs.btn_sim}"
				action="#{uploadTransmissaoArquivosBean.transmitir}">
				<brArq:submitCheckClient />
			</br:brCommandButton>

			<br:brCommandButton id="btnNao"
				styleClass="HtmlCommandButtonBradesco !important;" disabled="true"
				value="#{msgs.btn_nao}">
				<a4j:support reRender="uploadTransmissasoArquivosObrigacoesWebserviceForm" event="onclick"
					action="#{uploadTransmissaoArquivosBean.limparFile}" />	
				<brArq:submitCheckClient />
			</br:brCommandButton>

		</br:brPanelGroup>
	</br:brPanelGrid>


	<br:brPanelGrid style="width: 100px; height: 50px; left: -500px; position: relative" columns="1">
		<br:brPanelGroup
			style="width: 100px; height: 50px;">
			<br:brInputText id="hidden" style="opacity: 0;" disabled="true"
				value="" size="1">
			</br:brInputText>
		</br:brPanelGroup>

		<br:brPanelGroup
			style="width: 100px; height: 50px; top: -25px; position: relative; z-index:-1000">
			<br:brInputText id="hiddenNomeArquivo" style="opacity: 0;"
				value="#{uploadTransmissaoArquivosBean.nomeArquivo}" size="1">
				<a4j:support reRender="none" event="onclick"
					action="#{uploadTransmissaoArquivosBean.registrarUpload}" />
			</br:brInputText>
		</br:brPanelGroup>

	</br:brPanelGrid>


	<brArq:validatorScript functionName="validateForm" />

	<f:verbatim>
		<script>
		function verificarCamposPreenchidos(){	
			var estado=document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:estados').value;
			var municipio=document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:municipio').value;
			var dependencia=document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:dependencia').value;
			
			var planoContas = document.forms['uploadTransmissasoArquivosObrigacoesWebserviceForm']['uploadTransmissasoArquivosObrigacoesWebserviceForm:tipoArquivo'][0].checked;
			var lancamentos = document.forms['uploadTransmissasoArquivosObrigacoesWebserviceForm']['uploadTransmissasoArquivosObrigacoesWebserviceForm:tipoArquivo'][1].checked;
			
			var nomeArquivo=document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:nomeArquivo');
			
			var habilitaNomeArquivo = estado != '' && municipio != '' && dependencia != '' && (planoContas || lancamentos);
			
			if(habilitaNomeArquivo) {
				nomeArquivo.disabled=false;
			} else {
				nomeArquivo.disabled=true;
			}
			
			var nomeArquivoValue = nomeArquivo.value;
			
			var habilitaBotoes = habilitaNomeArquivo && nomeArquivoValue;
			
			var btnSim = document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:btnSim');
			var btnNao = document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:btnNao');
			
			if(habilitaBotoes) {
				btnSim.disabled=false;
				btnNao.disabled=false;
			} else {
				btnSim.disabled=true;
				btnNao.disabled=true;
			}
			
		}
		
		function clickUpload() {
			var form = document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm');
			var fileName = document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:nomeArquivo').value;
			
			var inputHidden = document.getElementById('uploadTransmissasoArquivosObrigacoesWebserviceForm:hiddenNomeArquivo');
			inputHidden.value = fileName;
			
			inputHidden.click();
		}
		</script>
	</f:verbatim>
</brArq:form>

