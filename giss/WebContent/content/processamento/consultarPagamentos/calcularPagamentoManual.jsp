<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="calcularPagamentoManualForm" name="calcularPagamentoManualForm" >
	<h:inputHidden id="inputValorMulta" value="#{pesquisarPagamentoManualBean.dto.valorMulta}"/>
	
<br:brPanelGrid styleClass="mainPanel"  columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
		<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="750" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> </br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_competencia}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brInputText disabled="true" id="txtMesBase" value="#{pesquisarPagamentoManualBean.dto.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('calcularPagamentoManualForm','calcularPagamentoManualForm:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('calcularPagamentoManualForm','calcularPagamentoManualForm:txtMesBase',numeros);" onkeyup="proximoCampo(2,'calcularPagamentoManualForm','calcularPagamentoManualForm:txtMesBase','calcularPagamentoManualForm:txtAnoBase');" />
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText disabled="true" id="txtAnoBase" value="#{pesquisarPagamentoManualBean.dto.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('calcularPagamentoManualForm','calcularPagamentoManualForm:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> </br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_empresa}:" />
		</br:brPanelGroup>
		<br:brPanelGroup> </br:brPanelGroup>
		<br:brSelectOneMenu disabled="true" style="width:365px" id="empresa" value="#{pesquisarPagamentoManualBean.dto.empresa}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{pesquisarPagamentoManualBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		
		<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> </br:brPanelGroup>
		</br:brPanelGrid>	
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="3" style="margin-top:3px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_produto}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_status}:" />
		</br:brPanelGroup>
			
			
		<br:brSelectOneMenu disabled="true" style="width:365px" id="produto" value="#{pesquisarPagamentoManualBean.dto.codProduto}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItem itemValue="1" itemLabel="#{msgs.label_leasing}"/>
			<f:selectItem itemValue="2" itemLabel="#{msgs.label_fundos}"/>
			<f:selectItem itemValue="3" itemLabel="#{msgs.label_cartoes_anuid}"/>
			<f:selectItem itemValue="4" itemLabel="#{msgs.label_consorcio}"/>
			<f:selectItem itemValue="5" itemLabel="#{msgs.label_cartoes_comissoes}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brSelectOneMenu disabled="true" style="width:362px" id="statusPgto" value="#{pesquisarPagamentoManualBean.dto.codStatus}">
			<f:selectItem value="0" itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<%-- <f:selectItem value="1" itemValue="1" itemLabel="#{msgs.label_pendente_envio}"/> --%>
			<%-- <f:selectItem value="2" itemValue="2" itemLabel="#{msgs.label_pagto_enviado}"/> --%>
        	<%-- <f:selectItem value="3" itemValue="3" itemLabel="#{msgs.label_pago}"/> --%>
			<f:selectItem value="4" itemValue="4" itemLabel="#{msgs.label_rejeitado}"/>
			<f:selectItem value="5" itemValue="5" itemLabel="#{msgs.label_com_dados_bancarios_apos_validacao}"/>
			<f:selectItem value="6" itemValue="6" itemLabel="#{msgs.label_prov_inconsistente}"/>
			<f:selectItem value="7" itemValue="7" itemLabel="#{msgs.label_elegivel_apos_validacao}"/>
			<f:selectItem value="8" itemValue="8" itemLabel="#{msgs.label_prov_vencido}"/>
			<f:selectItem value="9" itemValue="9" itemLabel="#{msgs.label_cancelado}"/>
		</br:brSelectOneMenu>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> </br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="5" style="margin-top:3px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_codigo_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		
			
		
		<br:brSelectOneMenu disabled="true" style="width:180px" id="estado" value="#{pesquisarPagamentoManualBean.dto.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{pesquisarPagamentoManualBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText disabled="true" id="inputCodigoMunicipio" maxlength="10" size="15" value="#{pesquisarPagamentoManualBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brPanelGroup/>
		<br:brInputText disabled="true" id="inputMunicipio" maxlength="60" size="80" value="#{pesquisarPagamentoManualBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> </br:brPanelGroup>
	</br:brPanelGrid>
	
	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" 
		value="#{pesquisarPagamentoManualBean.codigosSelecionadosTabela}"
		onclick="validarBloqueioMultiploCheckbox();" >
		<f:selectItems value="#{pesquisarPagamentoManualBean.selectItemPgtoManual}" />
	</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll;overflow-X:scroll;height:300;width:750">
			<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>	
			
		<t:dataTable id="dataTable" value="#{pesquisarPagamentoManualBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="2825px" >			
			  <t:column width="25px" >		
		    	<t:checkbox index="#{indexLista}" for=":calcularPagamentoManualForm:checkboxRegistro" rendered="#{result.exibeDadosBancarios}"/>
			  </t:column>	
			  <t:column width="250px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.empresa} - #{result.descEmpresa}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="185px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_servico_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			     <br:brOutputText value="#{result.codProduto} - #{result.produto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.competencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="350px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.geral_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio} - #{result.municipio}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_iss_pgto}" style="margin-right:5 px; float:right;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorIssPgto}" style="margin-right:5 px;float:right;" escape="false"/>
			  </t:column>
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_acrescimo_juros_multa}" style="margin-right:5 px; float:right;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorAcrescimoJurosMulta}" style="margin-right:5 px;float:right;" escape="false"/>
			  </t:column>
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_perc_atualizacao_monetaria}" style="margin-right:5 px; float:right;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.percentualAtualizacaoMonetaria}" style="margin-right:5 px;float:right;" escape="false"/>
			  </t:column>
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_atualizacao_monetaria}" style="margin-right:5 px; float:right;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorAtualizacaoMonetaria}" style="margin-right:5 px;float:right;" escape="false"/>
			  </t:column>
			    <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_atualizado}" style="margin-right:5 px; float:right;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorIssPgtoAtualizado}" style="margin-right:5 px;float:right;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_data_original}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtOriginal}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="135px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_data_agendamento}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtVencimento}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="360px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_lc_status}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			     <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="110px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_tipo_credito}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			     <br:brOutputText value="#{result.descTipoCredito}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="180px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_dados_para_pgto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.banco} &nbsp #{result.agencia} &nbsp #{result.conta}-#{result.digitoConta}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_elegivel_para_pgto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			   </f:facet>
			    <br:brOutputText value="#{result.elegivelParaPagamento}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>		
	</t:div>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" 
				 value="#{msgs.botao_voltar}" style="float:left" action="#{pesquisarPagamentoManualBean.voltar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
<%-- 			<br:brCommandButton id="btnPgtoIndiv" styleClass="HtmlCommandButtonBradesco" --%>
<%-- 				  value="#{msgs.pagamento_manual_individual_path_title}" action="#{pesquisarPagamentoManualBean.iniciarTelaPgtoManualIndiv}" style="margin-right:5px"> --%>
<%-- 				<brArq:submitCheckClient/> --%>
<%-- 			</br:brCommandButton> --%>
			<br:brCommandButton id="btnAgendarSelecionados" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.label_iss_gerencial_agendar_selecionados}" action="#{pesquisarPagamentoManualBean.agendarSelecionados}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnAgendarTodos" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.label_iss_gerencial_agendar_todos}" action="#{pesquisarPagamentoManualBean.agendarTodos}" style="margin-right:5px" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnExportarExcel" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.btn_exportar_planilha_eletronica}" action="#{pesquisarPagamentoManualBean.imprimirPlanilhaCalculo}" onclick="desbloqTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
</br:brPanelGrid>
<f:verbatim>
	<script>	
		window.onload = validarBloqueioMultiploCheckbox;
		
		function validarBloqueioMultiploCheckbox() {
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
				document.getElementById("calcularPagamentoManualForm:btnAgendarTodos").disabled = true;
			} else {
				if (validarAcrescimoJurosMulta()) {
					document.getElementById("calcularPagamentoManualForm:btnAgendarTodos").disabled = true;
				} else {
					document.getElementById("calcularPagamentoManualForm:btnAgendarTodos").disabled = false;
				}
			}
		}
		
		function validarAcrescimoJurosMulta() {
			var valor = document.getElementById("calcularPagamentoManualForm:inputValorMulta").value;
			
			if (valor != "" && valor != "0,00") {
				return true;
			} else {
				return false;
			}
		}
	</script>
</f:verbatim>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{pesquisarPagamentoManualBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>