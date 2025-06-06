<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="reprocesamentoPorMunicipioContasMunicipioForm" name="reprocesamentoPorMunicipioContasMunicipioForm" >
<h:inputHidden id="hiddenRadio" value="#{reprocessamentoPorMunicipioBean.itemSelecionadoListaContas}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">	

	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_selecao_aliquota}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_municipio}:" />

			<br:brInputText value="#{reprocessamentoPorMunicipioBean.descMunicipio}" disabled="true" size="45" />
			
			<br:brPanelGroup style="width: 2px;" />
			
			<br:brCommandButton image="/images/lupa.gif" id="btnPesquisarMunicipio"  styleClass="HtmlCommandButtonBradesco"  action="#{reprocessamentoPorMunicipioBean.pesquisarMunicipios}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>

			<br:brPanelGroup style="width: 20px;" />

			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_tipo_servico}:" />

			<br:brSelectOneMenu id="tipoServico" value="#{reprocessamentoPorMunicipioBean.filtroTipoServico}" onchange="habilitarBotaoPesquisar(document.forms[1]);">
				<f:selectItem itemValue="" itemLabel="#{msgs.apuracao_reprocessamento_municipio_selecione}"/>
				<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaTipoServico}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>				
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="2" width="100%">
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_voltar}" action="#{reprocessamentoPorMunicipioBean.voltarReprocessamentoMunicipio}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 100%; text-align: right">
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_pesquisar}" action="#{reprocessamentoPorMunicipioBean.carregarListaContasMunicipios}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
</br:brPanelGrid>
<f:verbatim> 
<script type="text/javascript">

function habilitarBotaoPesquisar(form){
	
	var botaoPesquisar;
	var tipoServico;
	
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'reprocesamentoPorMunicipioContasMunicipioForm:tipoServico'){		
			tipoServico = form.elements[i];
		}		
		
		if (form.elements[i].id == 'reprocesamentoPorMunicipioContasMunicipioForm:btnPesquisar'){
			botaoPesquisar = form.elements[i];
		}	
	}	
	
	if (tipoServico.value != ''){
		botaoPesquisar.disabled = false;
	}
}
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>