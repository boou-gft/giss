]<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterAliquotaForm" name="manterAliquotaForm" >
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
		
		
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-top:10px">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_periodo_competencia}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brInputText id="txtMesInicial" value="#{manterAliquotaBean.filtro.mesInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('manterAliquotaForm','manterAliquotaForm:txtMesInicial','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('manterAliquotaForm','manterAliquotaForm:txtMesInicial',numeros);" onkeyup="proximoCampo(2,'manterAliquotaForm','manterAliquotaForm:txtMesInicial','manterAliquotaForm:txtAnoInicial');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoInicial" value="#{manterAliquotaBean.filtro.anoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('manterAliquotaForm','manterAliquotaForm:txtAnoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_ate}" />
			<br:brPanelGroup>
				<br:brInputText id="txtMesFinal" value="#{manterAliquotaBean.filtro.mesFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('manterAliquotaForm','manterAliquotaForm:txtMesFinal','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onkeypress="aplicamascara('manterAliquotaForm','manterAliquotaForm:txtMesFinal',numeros);" onkeyup="proximoCampo(2,'manterAliquotaForm','manterAliquotaForm:txtMesFinal','manterAliquotaForm:txtAnoFinal');">
					<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
				</br:brInputText>
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText id="txtAnoFinal" value="#{manterAliquotaBean.filtro.anoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('manterAliquotaForm','manterAliquotaForm:txtAnoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onkeypress="onlyNum()" onfocus="cleanClipboard()">
					<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
				</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" style="margin-top:10px">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_item_servico_lc}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup/>
			
			<br:brPanelGroup>
	    		<br:brInputText size="7" maxlength="5" id="codigoItemServico" value="#{manterAliquotaBean.filtro.codigoItemServico}" onkeyup="aplicamascara('manterAliquotaForm', 'manterAliquotaForm:codigoItemServico',numeros);"/>  
			</br:brPanelGroup>	

			<br:brPanelGroup>
				<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >	
					<br:brPanelGroup >
						<t:selectOneRadio id="tipoPesquisa" value="#{manterAliquotaBean.filtro.indicadorPesquisa}" styleClass="HtmlSelectOneRadioBradesco" >  
							<f:selectItem value="GP" itemValue="GP" itemLabel="#{msgs.label_iss_proprio}" />
							<f:selectItem value="GG" itemValue="GG" itemLabel="#{msgs.label_iss_gerencial}" />
						</t:selectOneRadio>
					</br:brPanelGroup>
				</br:brPanelGrid>	
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGrid columns="5" style="margin-top:3px" cellpadding="0" cellspacing="0" style="margin-top:10px">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_estado}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_codigo_municipio}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_municipio}:"/>
			</br:brPanelGroup>		
				
			
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{manterAliquotaBean.filtro.codigoEstado}">
				<f:selectItem itemValue="" itemLabel="#{msgs.label_selecione}"/>
				<f:selectItems value="#{manterAliquotaBean.listaEstados}"/>
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{manterAliquotaBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
			<br:brCommandButton  image="/images/lupa.gif" id="buttonBuscarMunicipio" action="#{manterAliquotaBean.pesquisarMunicipioManterAliquota}">
				 <brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{manterAliquotaBean.buscaMunicipio.descricao}"/>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.botao_pesquisar}" action="#{manterAliquotaBean.pesquisar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty manterAliquotaBean.listaConsulta}">	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div  style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{manterAliquotaBean.listaConsulta}" var="result" rowIndexVar="indexLista"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px" >
							<f:facet name="header">
								<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
						    </f:facet>		
							<t:selectOneRadio onclick="javascript:habilitarBotaoDetalhar(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{manterAliquotaBean.itemSelecionado}">
								<f:selectItems value="#{manterAliquotaBean.listaControle}"/>
							</t:selectOneRadio>
					    	<t:radio for="sor" index="#{indexLista}" />
						</t:column>
						<t:column width="140px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.codigoMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="140px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.nomeMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="140px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						   <br:brOutputText value="#{result.aliquota}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
						<t:column width="140px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_competencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.competenciaFormatada}" style="margin-left:6 px;float:left;"/>
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
	
		<br:brPanelGroup rendered="#{!empty manterAliquotaBean.listaConsulta}">
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>
	
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{!empty manterAliquotaBean.listaConsulta}">	
			<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilhaEletronica" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_planilha_eletronica}" actionListener="#{manterAliquotaBean.exportarExcel}" onclick="desbloqTela();">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnExcluir" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right"
					value="#{msgs.botao_excluir}" action="#{manterAliquotaBean.excluir}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right"
					value="#{msgs.botao_alterar}" action="#{manterAliquotaBean.alterar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right"
					value="#{msgs.botao_incluir}" action="#{manterAliquotaBean.incluir}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<brArq:validatorScript functionName="validateForm"/>
	<f:verbatim>
		<script>
			function habilitarBotaoDetalhar(form, radio) {
				document.getElementById("manterAliquotaForm:btnDetalhar").disabled=false;
			}
		</script>
	</f:verbatim>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{manterAliquotaBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>