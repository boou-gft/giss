]<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="liberarPagamentoMovimentoForm" name="liberarPagamentoMovimentoForm" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_competencia}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brInputText id="txtMesCompetencia" value="#{liberarPagamentoMovimentoBean.filtro.mesCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('liberarPagamentoMovimentoForm','liberarPagamentoMovimentoForm:txtMesCompetencia','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('liberarPagamentoMovimentoForm','liberarPagamentoMovimentoForm:txtMesCompetencia',numeros);" onkeyup="proximoCampo(2,'liberarPagamentoMovimentoForm','liberarPagamentoMovimentoForm:txtMesCompetencia','liberarPagamentoMovimentoForm:txtAnoCompetencia');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_competencia}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoCompetencia" value="#{liberarPagamentoMovimentoBean.filtro.anoCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('liberarPagamentoMovimentoForm','liberarPagamentoMovimentoForm:txtAnoCompetencia', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_competencia}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.botao_pesquisar}" action="#{liberarPagamentoMovimentoBean.pesquisar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{liberarPagamentoMovimentoBean.listaConsulta}" var="result" rowIndexVar="indexLista"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px" >
							<f:facet name="header">
								<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
						    </f:facet>		
							<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{liberarPagamentoMovimentoBean.itemSelecionado}">
								<f:selectItems value="#{liberarPagamentoMovimentoBean.listaControle}"/>
							</t:selectOneRadio>
					    	<t:radio for="sor" index="#{indexLista}" />
						</t:column>
						<t:column width="1000px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_empresa}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.codigoEmpresa}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="1000px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_produto}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.nomeProduto}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="400px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_situacao_pagamento}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.descricaoIdentificadorProcessamentoIss}"  style="margin-left:6 px;float:left;"/>
						</t:column>
					</t:dataTable>	
				</t:div>
				<f:verbatim>  </f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>		

		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnLiberar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_liberar}" action="#{liberarPagamentoMovimentoBean.liberar}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				
				<br:brCommandButton id="btnPlanilhaEletronica" disabled="#{empty liberarPagamentoMovimentoBean.listaConsulta}" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_planilha_eletronica}" action="#{liberarPagamentoMovimentoBean.imprimirPlanilha}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brCommandButton id="btnSemDadosBancarios" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_sem_dado_bancarios}" action="#{liberarPagamentoMovimentoBean.gerarDiferencasContabeis}" style="margin-right:5px;margin-top:5px;">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				
				<br:brCommandButton id="btnConsultarNaoElegiveis" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_consultar_nao_elegiveis}" action="#{liberarPagamentoMovimentoBean.gerarDiferencasContabeis}" style="margin-right:5px;margin-top:5px;">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				
				<br:brCommandButton id="btnConsultarVencidos" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_consultar_vencidos}" action="#{liberarPagamentoMovimentoBean.processar}" style="margin-top:5px;">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<brArq:validatorScript functionName="validateForm"/>
	<f:verbatim>
		<script>
			function habilitarBotoes(form, radio) {
				document.getElementById("liberarPagamentoMovimentoForm:btnLiberar").disabled=false;
				document.getElementById("liberarPagamentoMovimentoForm:btnSemDadosBancarios").disabled=false;
				document.getElementById("liberarPagamentoMovimentoForm:btnConsultarNaoElegiveis").disabled=false;
				document.getElementById("liberarPagamentoMovimentoForm:btnConsultarVencidos").disabled=false;
			}
		</script>
	</f:verbatim>
</brArq:form>
