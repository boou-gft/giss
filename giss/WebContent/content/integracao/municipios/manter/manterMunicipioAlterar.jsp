<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterMunicipioAlterarForm" name="manterMunicipioAlterarForm">
<h:inputHidden id="hiddenTipoIncidencia" value="#{manterMunicipioBean.tipoIncidenciaFiltro}"/>
<h:inputHidden id="hiddenFormaPagamento" value="#{manterMunicipioBean.formaPagamentoFiltro}"/>
<h:inputHidden id="hiddenDiaUtilPagto" value="#{manterMunicipioBean.diaUtilPagtoFiltro}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_infoMunicipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoMunicipio}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_nome}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeMunicipio}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeUnidadeFederativa}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.percentualAliquota}%" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_infoApuracao}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	 <br:brPanelGrid columns="8" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_vencimento}:" style="margin-right:6px;"/>
		</br:brPanelGroup>

		<br:brPanelGroup>
		 	<br:brInputText value="#{manterMunicipioBean.diaVencimento}" size="3" maxlength="2" id="txtDiaVencimento" onkeyup="aplicamascara('manterMunicipioAlterarForm','manterMunicipioAlterarForm:txtDiaVencimento',numeros);">  
				<brArq:commonsValidator type="integer" arg="#{msgs.manterMunicipio_label_vencimento}" server="false" client="true"/>
				<brArq:commonsValidator type="intRange" min="1" max="31" arg="#{msgs.manterMunicipio_label_vencimento}" server="false" client="true"/>
			</br:brInputText>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_pagto}:" style="margin-right:6px;"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>	
			<br:brSelectOneMenu id="pagto" styleClass="HtmlSelectOneRadioBradesco" value="#{manterMunicipioBean.pagtoDiaUtil}" onchange="javascript:selecionaCampo(document.forms[1], this);">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItem itemValue="1" itemLabel="#{msgs.manterMunicipio_comboSim}"/>
				<f:selectItem itemValue="2" itemLabel="#{msgs.manterMunicipio_comboNao}"/>
			</br:brSelectOneMenu>		
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_formaPagamento}:" style="margin-right:6px;"/>
		</br:brPanelGroup>

		<br:brPanelGroup>				
			<br:brSelectOneMenu id="formaPagamento" styleClass="HtmlSelectOneRadioBradesco" value="#{manterMunicipioBean.descFormaPagamento}" onchange="javascript:selecionaCampo(document.forms[1], this);">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItem itemValue="1" itemLabel="#{msgs.manterMunicipio_comboAntecipa}"/>
				<f:selectItem itemValue="2" itemLabel="#{msgs.manterMunicipio_comboProrroga}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_lei}:" style="margin-right:6px"/>
		</br:brPanelGroup>

		<br:brPanelGroup>				
			<br:brSelectOneMenu id="cbLei" 
								styleClass="HtmlSelectOneRadioBradesco" 
								value="#{manterMunicipioBean.nroLei}">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"  />
				<f:selectItems  value="#{manterMunicipioBean.lstLegislacao}" />
			</br:brSelectOneMenu>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_obs}:" style="margin-right:6px;" />
		</br:brPanelGroup>

		<br:brPanelGroup style="width: 200px">				
			<br:brInputText style="width: 100%" value="#{manterMunicipioBean.inforComplementar}" maxlength="20"/>
		</br:brPanelGroup>

	</br:brPanelGrid>
	

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_parametroCalculo}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	
	<br:brPanelGrid columns="11" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_baseCalculo}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>			
			<br:brInputText value="#{manterMunicipioBean.percentualBaseCalculo}" size="6" maxlength="4" id="txtBaseCalculo" >  
				<brArq:commonsValidator type="integer" arg="#{msgs.manterMunicipio_label_baseCalculo}" server="false" client="true"/>
			</br:brInputText>
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="%" />
		</br:brPanelGroup>
		<br:brPanelGroup style="width:15px;">
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_aliquotaPadrao}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>			
			<br:brInputText value="#{manterMunicipioBean.percentualAliquotaPadrao}" size="6" maxlength="4" id="txtAliquotaPadrao" >  
				<brArq:commonsValidator type="integer" arg="#{msgs.manterMunicipio_label_aliquotaPadrao}" server="false" client="true"/>
				<brArq:commonsValidator type="intRange" min="1" max="100" arg="#{msgs.manterMunicipio_label_aliquotaPadrao}" server="false" client="true"/>
			</br:brInputText>
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="%" />
		</br:brPanelGroup>
		<br:brPanelGroup style="width:15px;">
		</br:brPanelGroup>		

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_tipoIncidencia}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>				
			<br:brSelectOneMenu id="tipoIncidencia" styleClass="HtmlSelectOneRadioBradesco" value="#{manterMunicipioBean.descTipoIncidencia}">
				<f:selectItem itemValue="" itemLabel="#{msgs.manterMunicipio_label_selecionar}"/>
				<f:selectItems value="#{manterMunicipioBean.listaTipoIncidencia}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:15px;">
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_razoes}:" style="margin-right:6px;" />
		</br:brPanelGroup>
		<br:brPanelGroup>				
			<br:brCommandButton image="/images/lupa.gif" id="btnPesquisarContas"  styleClass="HtmlCommandButtonBradesco"  value="" action="#{manterMunicipioBean.abreAlterarRespRecolhimento}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_responsavelRecolhimento}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brSelectOneMenu id="empresa" value="#{manterMunicipioBean.indiceComboEmpresaIncorpora}">
			<f:selectItems value="#{manterMunicipioBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{manterMunicipioBean.codDepIncorpora}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscar" action="#{manterMunicipioBean.carregarDependenciaIncorporaDepNova}">
			<brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputDepend" size="45" disabled="true" value="#{manterMunicipioBean.descDepIncorpora}" />
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>		
		<br:brPanelGroup style="text-align:right;width:90px" >
			<br:brCommandButton id="btnLocDep"   styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_locDependencia}" action="#{manterMunicipioBean.localizarDependenciaManter}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
			
	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_voltar}" action="#{manterMunicipioBean.voltarPaginaInicial}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>					
		
		<br:brPanelGrid columns="1" style="width:360px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.manterMunicipio_botao_limparCampos}" action="#{manterMunicipioBean.limparCamposAlteracao}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px; margin-right:5px;" value="#{msgs.manterMunicipio_botao_finalizar}" action="#{manterMunicipioBean.executaAlterarMunicipioAntes}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>			
	</br:brPanelGrid>
	
</br:brPanelGrid>

<f:verbatim>
<script>

function selecionaCampo(form, campo){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterMunicipioAlterarForm:hiddenTipoIncidencia'){		
			hidden = form.elements[i];
			hidden.value = campo.value;	
		}
		if (form.elements[i].id == 'manterMunicipioAlterarForm:hiddenFormaPagamento'){		
			hidden = form.elements[i];
			hidden.value = campo.value;	
		}
		if (form.elements[i].id == 'manterMunicipioAlterarForm:hiddenDiaUtilPagto'){		
			hidden = form.elements[i];
			hidden.value = campo.value;	
		}
	}	
}
</script>

</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
	
	