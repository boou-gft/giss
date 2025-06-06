<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="reprocessamentoMunicipioForm" name="reprocessamentoMunicipioForm">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_informacoes_processamento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estadoCombo" value="#{reprocessamentoPorMunicipioBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{reprocessamentoPorMunicipioBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>	
		
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_data_inicial}:" />

			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial','reprocessamentoMunicipioForm:txtAnoInicial');" 
		    	value="#{reprocessamentoPorMunicipioBean.periodoMesInicial}" size="3" maxlength="2" id="txtMesInicial" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorMunicipioBean.periodoAnoInicial}" 
		    	size="6" maxlength="4" id="txtAnoInicial" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoInicial',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px"/>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_data_final}:" />
			
			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal','reprocessamentoMunicipioForm:txtAnoFinal');" 
		    	value="#{reprocessamentoPorMunicipioBean.periodoMesFinal}" size="3" maxlength="2" id="txtMesFinal" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorMunicipioBean.periodoAnoFinal}" 
		    	size="6" maxlength="4" id="txtAnoFinal" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoFinal',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="float: right">
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_pesquisar}" action="#{reprocessamentoPorMunicipioBean.pesquisarListaMunicipioEstadoPeriodo}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>		
	</br:brPanelGrid>

</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>