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

<brArq:form id="reprocessarApuracaoForm" name="reprocessarApuracaoForm" >
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
				<br:brInputText id="txtMesBase" value="#{reprocessarApuracaoBean.filtro.mesCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('reprocessarApuracaoForm','reprocessarApuracaoForm:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('reprocessarApuracaoForm','reprocessarApuracaoForm:txtMesBase',numeros);" onkeyup="proximoCampo(2,'reprocessarApuracaoForm','reprocessarApuracaoForm:txtMesBase','reprocessarApuracaoForm:txtAnoBase');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoBase" value="#{reprocessarApuracaoBean.filtro.anoCompetencia}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('reprocessarApuracaoForm','reprocessarApuracaoForm:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			
			<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> </br:brPanelGroup>
			</br:brPanelGrid>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_empresa}:" />
			</br:brPanelGroup>
			<br:brPanelGroup> </br:brPanelGroup>
			<br:brSelectOneMenu style="width:365px" id="empresa" value="#{reprocessarApuracaoBean.filtro.codigoEmpresa}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItems value="#{reprocessarApuracaoBean.listaEmpresa}"/>
			</br:brSelectOneMenu>
			
			<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> </br:brPanelGroup>
			</br:brPanelGrid>	
		</br:brPanelGrid>
			
		<br:brPanelGrid style="margin-top:3px" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_produto}:" />
			</br:brPanelGroup>
				
			<br:brSelectOneMenu style="width:365px" id="produto" value="#{reprocessarApuracaoBean.filtro.codigoProduto}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItem itemValue="1" itemLabel="#{msgs.label_leasing}"/>
				<f:selectItem itemValue="2" itemLabel="#{msgs.label_fundos}"/>
				<f:selectItem itemValue="3" itemLabel="#{msgs.label_cartoes_anuid}"/>
				<f:selectItem itemValue="4" itemLabel="#{msgs.label_consorcio}"/>
				<f:selectItem itemValue="5" itemLabel="#{msgs.label_cartoes_paliativo}"/>
				<f:selectItem itemValue="6" itemLabel="#{msgs.label_cartoes_comissoes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGrid>	
		
		<br:brPanelGrid columns="1" style="margin-top:3px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> </br:brPanelGroup>
		</br:brPanelGrid>	
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.botao_pesquisar}" action="#{reprocessarApuracaoBean.pesquisar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> </br:brPanelGroup>
		</br:brPanelGrid>

		<t:div  style="overflow-Y:scroll;overflow-X:scroll;height:300;width:750">
			<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>	
				
			<t:dataTable id="dataTable" value="#{reprocessarApuracaoBean.listaConsulta}" var="result" rowIndexVar="indexLista"
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="2105px" >			
				  <t:column width="25px" >
						<f:facet name="header">
							<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
					    </f:facet>		
						<t:selectOneRadio id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{reprocessarApuracaoBean.itemSelecionado}">
							<f:selectItems value="#{reprocessarApuracaoBean.listaControle}"/>
						</t:selectOneRadio>
				    	<t:radio for="sor" index="#{indexLista}" />
					</t:column>
				  <t:column width="250px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_iss_gerencial_empresa}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.codigoEmpresa} - #{result.nomeEmpresa}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="250px">
				   <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_iss_gerencial_servico_produto}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				   </f:facet>
				     <br:brOutputText value="#{result.codigoProduto} - #{result.nomeProduto}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="50px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.anoMesCompetenciaExibicao}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="150px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_finalidade}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.nomeFinalidade}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="110px">
				   <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_situacao_contabil}" style="margin-right:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.nomeSituacaoContabil}" style="margin-right:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="100px">
				   <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_base_calculo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.valorTotalApuracao}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				  <t:column width="100px">
				   <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_valor_iss}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.valorTotalCredito}" style="margin-left:5 px;float:left;" escape="false"/>
				  </t:column>
				</t:dataTable>
				</br:brPanelGroup>
			</br:brPanelGrid>		
		</t:div>	
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnReprocessar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.label_reprocessar}" action="#{reprocessarApuracaoBean.reprocessar}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>
