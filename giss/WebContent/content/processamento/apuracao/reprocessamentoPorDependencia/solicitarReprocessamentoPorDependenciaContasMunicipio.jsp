<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="solicitarReprocessamentoPorDependenciaContasMunicipioForm" name="solicitarReprocessamentoPorDependenciaContasMunicipioForm" >
<h:inputHidden id="hiddenRadio" value="#{reprocessamentoPorDependenciaBean.itemSelecionadoListaContasMunicipio}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_municipios}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	  <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_codigo}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{reprocessamentoPorDependenciaBean.codigoMunicipio}"/>
			<br:brPanelGroup style="width: 20px;" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_nome}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{reprocessamentoPorDependenciaBean.nomeMunicipio} "/>
			<br:brPanelGroup style="width: 20px;" />		
		
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_estado}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{reprocessamentoPorDependenciaBean.estado}"/>
			<br:brPanelGroup style="width: 20px;" />		
		
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_aliquota}:"/>
			<br:brOutputText styleClass="HtmlOutputTextBoldBradesco" value="#{reprocessamentoPorDependenciaBean.aliquota}" converter="decimalBrazillianConverter" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="%" />
		</br:brPanelGroup>
	</br:brPanelGrid>	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:10px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_tipo_servico}:"/>
		
			<br:brSelectOneMenu style="width: 320px;" id="tipoServico" value="#{reprocessamentoPorDependenciaBean.filtroTipoServico}" onchange="habilitarBotaoPesquisar(document.forms[1]);">
			<f:selectItem itemValue="" itemLabel="#{msgs.apuracao_reprocessamento_dependencia_selecione}"/>
			<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaTipoServico}"/>			
			   		<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_pagto_dia_util}" server="false" client="true"/>
			</br:brSelectOneMenu>	
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" style="width: 100%; float:left;">
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_voltar}" action="#{reprocessamentoPorDependenciaBean.voltarReprocessamentoDependenciaProsseguir}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		<br:brPanelGroup style="width: 100%; text-align: right">
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_prosseguir}" action="#{reprocessamentoPorDependenciaBean.prosseguirContaMunicipio2}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>		
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>	


<f:verbatim> 
<script type="text/javascript">

function habilitarBotaoPesquisar(form){
	
	var botaoProsseguir;
	var estado;
	
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaContasMunicipioForm:tipoServico'){		
			estado = form.elements[i];
		}		
		
		if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaContasMunicipioForm:btnProsseguir'){
			botaoProsseguir = form.elements[i];
		}	
	}	
	
	if (estado.value != ''){
		botaoProsseguir.disabled = false;
	}
}


function habilitarBotaoFinalizar(form, radio){
	
	var botaoFinalizar;
	var hidden;

	
		for(i=0; i<form.elements.length; i++)
		{	
			if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaContasMunicipioForm:btnFinalizar'){
				botaoFinalizar = form.elements[i];
			}								
			if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaContasMunicipioForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
		}	
	if ((hidden.value != '')){
		botaoFinalizar.disabled = false;
	}
}
</script>
</f:verbatim>
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>