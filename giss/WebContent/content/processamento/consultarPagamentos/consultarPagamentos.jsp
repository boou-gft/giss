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

<brArq:form id="consultarPagamentos" name="consultarPagamentos" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid style="margin-top:11px" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid style="margin-top:10px" columns="1" cellpadding="0" cellspacing="0" width="100%">
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_competencia}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase" value="#{consultarPagamentosBean.dto.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarPagamentos','consultarPagamentos:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('consultarPagamentos','consultarPagamentos:txtMesBase',numeros);" onkeyup="proximoCampo(2,'consultarPagamentos','consultarPagamentos:txtMesBase','consultarPagamentos:txtAnoBase');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase" value="#{consultarPagamentosBean.dto.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarPagamentos','consultarPagamentos:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup></br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_empresa}:" />
		</br:brPanelGroup>
	
		<br:brSelectOneMenu style="width:370px" id="empresa" value="#{consultarPagamentosBean.dto.empresa}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{consultarPagamentosBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
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
		
		
		<br:brSelectOneMenu style="width:370px" id="produto" value="#{consultarPagamentosBean.dto.codProduto}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItem itemValue="1" itemLabel="#{msgs.label_leasing}"/>
			<f:selectItem itemValue="2" itemLabel="#{msgs.label_fundos}"/>
			<f:selectItem itemValue="3" itemLabel="#{msgs.label_cartoes_anuid}"/>
			<f:selectItem itemValue="4" itemLabel="#{msgs.label_consorcio}"/>
			<f:selectItem itemValue="5" itemLabel="#{msgs.label_cartoes_paliativo}"/>
			<f:selectItem itemValue="6" itemLabel="#{msgs.label_cartoes_comissoes}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brSelectOneMenu style="width:371px" id="status" value="#{consultarPagamentosBean.dto.codStatus}">
			<f:selectItem value="0" itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItem value="1" itemValue="1" itemLabel="#{msgs.label_pendente_envio}"/>
			<f:selectItem value="2" itemValue="2" itemLabel="#{msgs.label_pagto_enviado}"/>
			<f:selectItem value="3" itemValue="3" itemLabel="#{msgs.label_pago}"/>
			<f:selectItem value="4" itemValue="4" itemLabel="#{msgs.label_rejeitado}"/>
			<f:selectItem value="5" itemValue="5" itemLabel="#{msgs.label_provisionado}"/>
			<f:selectItem value="6" itemValue="6" itemLabel="#{msgs.label_prov_inconsistente}"/>
			<f:selectItem value="7" itemValue="7" itemLabel="#{msgs.label_prov_nao_elegivel}"/>
			<f:selectItem value="8" itemValue="8" itemLabel="#{msgs.label_prov_vencido}"/>
			<f:selectItem value="9" itemValue="9" itemLabel="#{msgs.label_cancelado}"/>
		</br:brSelectOneMenu>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" style="margin-top:6px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup></br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>}
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_codigo_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		
			
		<br:brSelectOneMenu style="width:180px" id="estado" value="#{consultarPagamentosBean.dto.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{consultarPagamentosBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodMunicipio" maxlength="10" style="margin-right:1px" size="17" value="#{consultarPagamentosBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton  image="/images/lupa.gif" id="buttonBuscarMunicipio" style="margin-left:1px" onclick="submit();" action="#{consultarPagamentosBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="82" value="#{consultarPagamentosBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_pesquisar}" action="#{consultarPagamentosBean.pesquisarPagtos}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" 
	  		value="#{consultarPagamentosBean.codigosSelecionadosTabela}" 
	  		onclick="validarBloqueioMultiploCheckbox();" >
			<f:selectItems value="#{consultarPagamentosBean.selectItemPgtos}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll;overflow-X:scroll; height:275;width:750;display:block">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{consultarPagamentosBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="1578px" >			
			  <t:column width="23px" >	
			  
		    	<t:checkbox index="#{indexLista}" for=":consultarPagamentos:checkboxRegistro"/>
			  </t:column>	
			  <t:column width="265px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.empresa} - #{result.descEmpresa}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.produto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="90px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.competencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="330px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio} - #{result.municipio}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
		<%-- 	  
			  <t:column width="200px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_base_calc_iss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.baseIss}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
		--%>
			  <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_valor_doiss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.valorIssPgto}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_data_original}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtAgendamento}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="130px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_data_agendamento}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtPagamento}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="360px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_status}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnDetalhe" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_detalhar}" action="#{consultarPagamentosBean.detalhar}" style="margin-right:5px" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
	 			<br:brCommandButton id="btnCancelarSelecionados" styleClass="HtmlCommandButtonBradesco" 
	 				  value="#{msgs.botao_cancelar_selecionados}" action="#{consultarPagamentosBean.cancelarSelecionados}" style="margin-right:5px" > 
	 				<brArq:submitCheckClient/>
	 			</br:brCommandButton>
	 			<br:brCommandButton id="btnCancelarTodos" styleClass="HtmlCommandButtonBradesco" 
	 				  value="#{msgs.botao_cancelar_todos}" action="#{consultarPagamentosBean.cancelarTodos}" style="margin-right:5px" 
	 				  onclick="if (!confirm('Serão cancelados somente os Pendentes de Envio. Deseja prosseguir?')) {desbloquearTela(); return false}" > 
	 				<brArq:submitCheckClient/>
	 			</br:brCommandButton>
			<br:brCommandButton id="btnComprovante" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_comprovante}" 
				  actionListener="#{consultarPagamentosBean.emitirComprovante}" 
				  style="margin-right:5px" 
				  onclick="desbloqTela();" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnComprovanteLote" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_comprovante_lote}" 
				  actionListener="#{consultarPagamentosBean.emitirComprovanteLote}" 
				  style="margin-right:5px" 
				  onclick="desbloqTela();" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<%-- 
			<br:brCommandButton id="btnExportarTxt" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.btn_iss_gerencial_txt}" action="#{consultarPagamentosBean.exportarTxt}" style="margin-right:5px" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			--%>
			<br:brCommandButton id="btnExportarExcel" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.btn_exportar_planilha_eletronica}" action="#{consultarPagamentosBean.imprimirPlanilha}" onclick="desbloqTela();">
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
				document.getElementById("consultarPagamentos:btnCancelarTodos").disabled = true;
			} else {
				document.getElementById("consultarPagamentos:btnCancelarTodos").disabled = false;
			}
		}
	</script>
</f:verbatim>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{consultarPagamentosBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>