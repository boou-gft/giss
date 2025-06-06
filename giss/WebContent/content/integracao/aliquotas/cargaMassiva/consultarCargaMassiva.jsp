]<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarCargaMassivaForm" name="consultarCargaMassivaForm" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="750"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_informacoes_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_periodo_de}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brInputText id="txtMesInicial" value="#{cargaMassivaBean.filtro.mesInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesInicial','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesInicial',numeros);" onkeyup="proximoCampo(2,'consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesInicial','consultarCargaMassivaForm:txtAnoInicial');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoInicial" value="#{cargaMassivaBean.filtro.anoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarCargaMassivaForm','consultarCargaMassivaForm:txtAnoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_ate}" />
			<br:brPanelGroup>
				<br:brInputText id="txtMesFinal" value="#{cargaMassivaBean.filtro.mesFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesFinal','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesFinal',numeros);" onkeyup="proximoCampo(2,'consultarCargaMassivaForm','consultarCargaMassivaForm:txtMesFinal','consultarCargaMassivaForm:txtAnoFinal');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoFinal" value="#{cargaMassivaBean.filtro.anoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarCargaMassivaForm','consultarCargaMassivaForm:txtAnoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnSolicitarRemessa" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;" 
					  value="#{msgs.botao_solicitar_remessa}" action="#{cargaMassivaBean.solicitarRemessa}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.botao_pesquisar}" action="#{cargaMassivaBean.pesquisar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty cargaMassivaBean.listaConsulta}">	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{cargaMassivaBean.listaConsulta}" var="result" rowIndexVar="indexLista"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px" >
							<f:facet name="header">
								<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
						    </f:facet>		
							<t:selectOneRadio onclick="javascript:habilitarBotaoDetalhar(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{cargaMassivaBean.itemSelecionado}">
								<f:selectItems value="#{cargaMassivaBean.listaControle}"/>
							</t:selectOneRadio>
					    	<t:radio for="sor" index="#{indexLista}" rendered="#{result.situacaoRemessa.codigo != 9 }" />
						</t:column>
						<t:column width="140px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_remessa}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.numeroRemessa}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="1495px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_situacao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.situacaoRemessa.descricao}" rendered="#{result.situacaoRemessa.codigo != 9 }" style="margin-left:6 px;float:left;"/>
						    <br:brOutputText value="#{result.situacaoRemessa.descricao}" rendered="#{result.situacaoRemessa.codigo == 9 }" style="margin-left:6 px;float:left; color:red;"/>
						    <h:inputHidden value="#{result.situacaoRemessa.codigo}" id="codigoSituacaoRemessa"/>
						</t:column>
						<t:column width="50px">
						    <f:facet name="header">
								<br:brOutputText value="#{msgs.label_usuario_carga}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioCarga.codigo}"  style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="120px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_data_hora}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioCarga.data}"  style="margin-left:6 px;float:left;" >
						    	<f:converter converterId="timestampPdcConverter" />
						    </br:brOutputText>
						</t:column>
						<t:column width="50px">
						    <f:facet name="header">
								<br:brOutputText value="#{msgs.label_usuario_conferencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioConferencia.codigo}"  style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="120px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_data_hora}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioConferencia.data}"  style="margin-left:6 px;float:left;" >
						    	<f:converter converterId="timestampPdcConverter" />
						    </br:brOutputText>
						</t:column>
						<t:column width="50px">
						    <f:facet name="header">
								<br:brOutputText value="#{msgs.label_usuario_aprovacao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioAprovacao.codigo}"  style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="120px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_data_hora}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.usuarioAprovacao.data}"  style="margin-left:6 px;float:left;" >
						    	<f:converter converterId="timestampPdcConverter" />
						    </br:brOutputText>
						</t:column>
					</t:dataTable>	
				</t:div>
				<f:verbatim>  </f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>		
	
		<br:brPanelGroup rendered="#{!empty cargaMassivaBean.listaConsulta}">
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{!empty cargaMassivaBean.listaConsulta}">	
			<br:brPanelGroup>
				<br:brCommandButton id="btnDetalhar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_detalhar}" action="#{cargaMassivaBean.detalhar}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<brArq:validatorScript functionName="validateForm"/>
	<f:verbatim>
		<script>
			function habilitarBotaoDetalhar(form, radio) {
				document.getElementById("consultarCargaMassivaForm:btnDetalhar").disabled=false;
			}
		</script>
	</f:verbatim>
</brArq:form>
