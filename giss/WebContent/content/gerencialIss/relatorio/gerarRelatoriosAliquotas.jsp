]<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="relatorioForm" name="relatorioForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="750"  >
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
			<br:brInputText id="txtMesBase" value="#{aliquotaISSBean.dtoGerarRelatorio.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('relatorioForm','relatorioForm:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('relatorioForm','relatorioForm:txtMesBase',numeros);" onkeyup="proximoCampo(2,'relatorioForm','relatorioForm:txtMesBase','relatorioForm:txtAnoBase');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase" value="#{aliquotaISSBean.dtoGerarRelatorio.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('relatorioForm','relatorioForm:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="até" />
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase2" value="#{aliquotaISSBean.dtoGerarRelatorio.mesPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('relatorioForm','relatorioForm:txtMesBase2','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('relatorioForm','relatorioForm:txtMesBase2',numeros);" onkeyup="proximoCampo(2,'relatorioForm','relatorioForm:txtMesBase2','relatorioForm:txtAnoBase2');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase2" value="#{aliquotaISSBean.dtoGerarRelatorio.anoPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('relatorioForm','relatorioForm:txtAnoBase2', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
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
		
		<br:brSelectOneMenu style="width:180px" id="comboItemServico" value="#{aliquotaISSBean.dtoGerarRelatorio.codLeiCompl}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{aliquotaISSBean.selectItemServico}"/>
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

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{aliquotaISSBean.dtoGerarRelatorio.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{aliquotaISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="15" value="#{aliquotaISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{aliquotaISSBean.pesquisarMunicipioRelatorio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{aliquotaISSBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.gerar_relatorios_btn}" action="#{aliquotaISSBean.gerarRelatoriosDeAliquotas}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
	
	</br:brPanelGrid>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{aliquotaISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
