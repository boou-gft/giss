<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarApuracaoAposFechamentoForm" name="consultarApuracaoAposFechamentoForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoAposFechamentoBean.radioTela}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_competencia}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brSelectOneMenu id="empresa" value="#{consultarApuracaoAposFechamentoBean.indiceComboEmpresaFiltro}">
				<f:selectItems value="#{consultarApuracaoAposFechamentoBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{consultarApuracaoAposFechamentoBean.codDepFiltro}" />
			<br:brPanelGroup>
				<br:brInputText styleClass="HtmlInputTextBradesco" onkeyup="proximoCampo(2,'consultarApuracaoAposFechamentoForm','consultarApuracaoAposFechamentoForm:txtMes','consultarApuracaoAposFechamentoForm:txtAno');" value="#{consultarApuracaoAposFechamentoBean.mesFiltro}" size="3" maxlength="2" id="txtMes" onkeypress="aplicamascara('consultarApuracaoAposFechamentoForm','consultarApuracaoAposFechamentoForm:txtMes',numeros);" onblur="validarData('consultarApuracaoAposFechamentoForm','consultarApuracaoAposFechamentoForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />	
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />		  				      				       
		    	</br:brInputText>	
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText styleClass="HtmlInputTextBradesco" value="#{consultarApuracaoAposFechamentoBean.anoFiltro}" size="6" maxlength="4" id="txtAno" onkeypress="aplicamascara('consultarApuracaoAposFechamentoForm','consultarApuracaoAposFechamentoForm:txtAno',numeros);" onblur="validarData('consultarApuracaoAposFechamentoForm','consultarApuracaoAposFechamentoForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />			  				      				      
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />
		    	</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGrid>

	<br:brPanelGroup>
		<f:verbatim><hr class="lin"></f:verbatim>
	</br:brPanelGroup>

	<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir2" styleClass="HtmlCommandButtonBradesco" value="#{msgs.consultarApuracaoAposFechamento_botao_prosseguir}" action="#{consultarApuracaoAposFechamentoBean.prosseguir}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
</br:brPanelGrid>

</brArq:form>