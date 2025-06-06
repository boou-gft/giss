]<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarProcessarContabilidadeForm" name="consultarProcessarContabilidadeForm" >
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
				<br:brInputText id="txtMesCompetencia" value="#{processarContabilidadeMovimentoBean.filtro.mesCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarProcessarContabilidadeForm','consultarProcessarContabilidadeForm:txtMesCompetencia','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('consultarProcessarContabilidadeForm','consultarProcessarContabilidadeForm:txtMesCompetencia',numeros);" onkeyup="proximoCampo(2,'consultarProcessarContabilidadeForm','consultarProcessarContabilidadeForm:txtMesCompetencia','consultarProcessarContabilidadeForm:txtAnoCompetencia');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_competencia}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoCompetencia" value="#{processarContabilidadeMovimentoBean.filtro.anoCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarProcessarContabilidadeForm','consultarProcessarContabilidadeForm:txtAnoCompetencia', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_competencia}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.botao_pesquisar}" action="#{processarContabilidadeMovimentoBean.pesquisar}" >
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
				    <t:dataTable id="dataTable" value="#{processarContabilidadeMovimentoBean.listaConsulta}" var="result" rowIndexVar="indexLista"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px" >
							<f:facet name="header">
								<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
						    </f:facet>		
							<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{processarContabilidadeMovimentoBean.itemSelecionado}">
								<f:selectItems value="#{processarContabilidadeMovimentoBean.listaControle}"/>
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
						<t:column width="250px">
						    <f:facet name="header">
								<br:brOutputText value="#{msgs.label_qtde_registros}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.quantidadeRegistro}"  style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="400px">
						    <f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_valor_iss}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorIss}"  style="margin-left:6 px;float:left;"/>
						</t:column>
					</t:dataTable>	
				</t:div>
				<f:verbatim>  </f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>		
	
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_contabilizar}:" />
			</br:brPanelGroup>
	
			<t:selectOneRadio id="tipoPesquisa" value="#{processarContabilidadeMovimentoBean.filtro.indicadorContabilizacao}"
			 	styleClass="HtmlSelectOneRadioBradesco" >  
				<f:selectItem value="M" itemValue="M" itemLabel="#{msgs.label_mes_atual}" />
				<f:selectItem value="D" itemValue="D" itemLabel="#{msgs.label_data_atual}" />
			</t:selectOneRadio>
		</br:brPanelGrid>
		
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnDiferencasContabeis" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_diferencas_contabeis}" action="#{processarContabilidadeMovimentoBean.gerarDiferencasContabeis}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				
				<br:brCommandButton id="btnProcessar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_processar}" action="#{processarContabilidadeMovimentoBean.processar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<brArq:validatorScript functionName="validateForm"/>
	<f:verbatim>
		<script>
			function habilitarBotoes(form, radio) {
				document.getElementById("consultarProcessarContabilidadeForm:btnDiferencasContabeis").disabled=false;
				document.getElementById("consultarProcessarContabilidadeForm:btnProcessar").disabled=false;
			}
		</script>
	</f:verbatim>
</brArq:form>
