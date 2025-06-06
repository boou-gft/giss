<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="consultarInformacoesAliquota" name="consultarInformacoesAliquota" >
<br:brPanelGrid styleClass="mainPanel"  columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="750"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_periodo_comp}:" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase" value="#{consultarInformacoesAliquotaBean.dto.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase',numeros);" onkeyup="proximoCampo(2,'consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase','consultarInformacoesAliquota:txtAnoBase');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase" value="#{consultarInformacoesAliquotaBean.dto.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarInformacoesAliquota','consultarInformacoesAliquota:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="até" />
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase2" value="#{consultarInformacoesAliquotaBean.dto.mesPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase2','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase2',numeros);" onkeyup="proximoCampo(2,'consultarInformacoesAliquota','consultarInformacoesAliquota:txtMesBase2','consultarInformacoesAliquota:txtAnoBase2');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase2" value="#{consultarInformacoesAliquotaBean.dto.anoPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('consultarInformacoesAliquota','consultarInformacoesAliquota:txtAnoBase2', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		
		<br:brSelectOneMenu style="width:180px" id="comboItemServico" value="#{consultarInformacoesAliquotaBean.dto.codLeiCompl}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{consultarInformacoesAliquotaBean.selectItemServico}"/>
		</br:brSelectOneMenu>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.historico_municipio_label_codmunicipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{consultarInformacoesAliquotaBean.dto.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{consultarInformacoesAliquotaBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="15" value="#{consultarInformacoesAliquotaBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{consultarInformacoesAliquotaBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{consultarInformacoesAliquotaBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_pesquisar}" action="#{consultarInformacoesAliquotaBean.pesquisarInfosAliquota}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{consultarInformacoesAliquotaBean.mostrarLista}">	
		<t:div  style="overflow-Y:scroll; height:220;width:750">
		<t:dataTable id="dataTable" value="#{consultarInformacoesAliquotaBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="100%">			

			  <t:column width="450px" style="padding-right:5px; padding-left:5px"> 
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_item_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codLeiCompl} - #{result.descLeiCompl}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_iss_gerencial_aliquota}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.aliquota}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="200px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_competencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataInicioVigencia} - #{result.dataFimVigencia}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
		</t:div>	
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{consultarInformacoesAliquotaBean.mostrarLista}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnTxt"
					styleClass="HtmlCommandButtonBradesco"
					value="TXT"
					actionListener="#{consultarInformacoesAliquotaBean.exportarTxt}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<f:verbatim>&nbsp;&nbsp;</f:verbatim>
			
			<br:brCommandButton id="btnExportarExcel"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{consultarInformacoesAliquotaBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
</br:brPanelGrid>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{consultarInformacoesAliquotaBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
