<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="liberarPgtoIssForm" name="liberarPgtoIssForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_competencia}:"/>
		<br:brPanelGroup> </br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase" value="#{liberarPagtoISSBean.dto.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" 
				style="text-align: right" maxlength="2" size="3" disabled="#{!liberarPagtoISSBean.exibirMovimentoRetificacao}" />
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase" value="#{liberarPagtoISSBean.dto.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" 
				style="text-align: right" maxlength="4" size="5" disabled="#{!liberarPagtoISSBean.exibirMovimentoRetificacao}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			
			
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_pesquisar}" action="#{liberarPagtoISSBean.pesquisar}" style="margin-left:10px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
		
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" style="margin-top:20px" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectManyCheckbox id="checkboxRegistro" onclick="javascript:habilitarBotoes();" 
	  		layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{liberarPagtoISSBean.codigosSelecionadosTabela}">
			<f:selectItems value="#{liberarPagtoISSBean.selectItem}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll;overflow-X:scroll; height:275;width:750;display:block"  >
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>	
					
		<t:dataTable id="dataTable" value="#{liberarPagtoISSBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >			
			  <t:column width="15px" >
				<f:facet name="header">
			      <t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{liberarPagtoISSBean.checkTodos}" >
						<a4j:support event="onclick" action="#{liberarPagtoISSBean.atribuirTodos}" reRender="rolagem, dataTable,paginacao" oncomplete="javascript:habilitarBotoes();" />
					</t:selectBooleanCheckbox>
			    </f:facet>		
			  
		    	<t:checkbox index="#{indexLista}" for=":liberarPgtoIssForm:checkboxRegistro"/>
			  </t:column>	
			  <t:column width="300px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.empresa}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="200px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.produto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="235px">
			    <f:facet name="header">
			      <br:brOutputText value="Situação do Pagamento" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descCodStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  
			  <%-- 
			  <t:column width="150x" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_qtde_pgtos}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.qtdePgtos}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_qtde_pgtos_vencidos}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.qtdePgtosVencidos}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_total}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorTotal}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.competencia} " style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_qtde_teds}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.qtdeTeds}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_qtde_t_brad}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.qtdeTransfBradesco}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  --%>
		
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
	
 		
 	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
 		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnLiberar" styleClass="HtmlCommandButtonBradesco" disabled="true"
				value="#{msgs.btn_iss_gerencial_liberar}" action="#{liberarPagtoISSBean.processar}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<%-- 
			<br:brCommandButton id="btnExportarTxt" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_iss_gerencial_txt}" action="#{liberarPagtoISSBean.exportarTxt}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			--%>
			<br:brCommandButton id="btnPlanilhaEletronica" styleClass="HtmlCommandButtonBradesco" onclick="desbloquearTela();" 
				disabled="#{empty liberarPagtoISSBean.dto.lista}"
				value="#{msgs.btn_exportar_planilha_eletronica}" action="#{liberarPagtoISSBean.imprimirPlanilha}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0"  >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPgtosNaoGerados" styleClass="HtmlCommandButtonBradesco" disabled="true"
				value="#{msgs.label_iss_gerencial_sem_dados_bancarios}" action="#{liberarPagtoISSBean.listarPgtosNaoGerados}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnConsultarNaoEleg" styleClass="HtmlCommandButtonBradesco" disabled="true"
				value="#{msgs.label_iss_gerencial_consultar_nao_elegiveis}" action="#{liberarPagtoISSBean.consultarNaoElegiveis}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnConsultarVencidos" styleClass="HtmlCommandButtonBradesco" disabled="true"
				value="#{msgs.label_iss_gerencial_consultar_vencidos}" action="#{liberarPagtoISSBean.consultarVencidos}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	
	
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
	<script>
		window.onload = habilitarBotoes;
		
		function habilitarBotoes() {
			var checkboxes = document.getElementsByName('checkboxRegistro');
			var qtdeCheckboxes = 0;
			
			for ( var i = 0; i < checkboxes.length; i++) {
				if (checkboxes[i].type === 'checkbox') {
					if (checkboxes[i].checked === true) {
						qtdeCheckboxes++;
					}
				}
			}
	
			if (qtdeCheckboxes > 0) {
				document.getElementById("liberarPgtoIssForm:btnLiberar").disabled=false;
				document.getElementById("liberarPgtoIssForm:btnPgtosNaoGerados").disabled=false;
				document.getElementById("liberarPgtoIssForm:btnConsultarNaoEleg").disabled=false;
				document.getElementById("liberarPgtoIssForm:btnConsultarVencidos").disabled=false;
			} else {
				document.getElementById("liberarPgtoIssForm:btnLiberar").disabled=true;
				document.getElementById("liberarPgtoIssForm:btnPgtosNaoGerados").disabled=true;
				document.getElementById("liberarPgtoIssForm:btnConsultarNaoEleg").disabled=true;
				document.getElementById("liberarPgtoIssForm:btnConsultarVencidos").disabled=true;
			}
		}
	</script>
</f:verbatim>
</brArq:form>