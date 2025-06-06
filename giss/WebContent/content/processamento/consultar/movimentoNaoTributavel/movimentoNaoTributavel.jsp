<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%> 
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="movimentoNaoTributavelForm" name="movimentoNaoTributavelForm" >
<h:inputHidden id="hiddenRadio" value="#{movimentoNaoTributavelBean.itemSelecionadoLista}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid style="margin-top:20px" />
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.path_movimentoNaoTributavel_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:" />
			</br:brPanelGroup>
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{movimentoNaoTributavelBean.estadoFiltro}" onchange="habilitaBotaoConsultar();">
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{movimentoNaoTributavelBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{movimentoNaoTributavelBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{movimentoNaoTributavelBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{movimentoNaoTributavelBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoApuracaoMensal_competencia}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brSelectOneMenu id="empresa" value="#{movimentoNaoTributavelBean.indiceComboEmpresaFiltro}">
				<f:selectItems value="#{movimentoNaoTributavelBean.listaEmpresa}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{movimentoNaoTributavelBean.codDepFiltro}" onkeypress="return validaTecla('0123456789', event);"/>
			<br:brPanelGroup>
				<br:brInputText styleClass="HtmlInputTextBradesco" 
				   	onkeyup="proximoCampo(2,'movimentoNaoTributavelForm','movimentoNaoTributavelForm:txtMes','movimentoNaoTributavelForm:txtAno');"
				    onblur="validarData('movimentoNaoTributavelForm','movimentoNaoTributavelForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');"
				    onkeypress="aplicamascara('movimentoNaoTributavelForm','movimentoNaoTributavelForm:txtMes',numeros);"
				    value="#{movimentoNaoTributavelBean.txtMesCompetencia}" size="3" maxlength="2" id="txtMes" style="margin-right:5px;" >
					<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />	
				</br:brInputText>
				<f:verbatim>/</f:verbatim>
				<br:brInputText styleClass="HtmlInputTextBradesco" value="#{movimentoNaoTributavelBean.txtAnoCompetencia}" 
				    onkeypress="aplicamascara('movimentoNaoTributavelForm','movimentoNaoTributavelForm:txtAno',numeros);"
				    size="6" maxlength="4" id="txtAno" style="margin-left:5px;"/>
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
		</br:brPanelGrid>
	
	
	<br:brPanelGrid style="height:15px" />
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" style="float:right;" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.path_movimentoNaoTributavel_botao_pesquisar}" action="#{movimentoNaoTributavelBean.carregaLista}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" cellpadding="0" cellspacing="0" rendered="#{movimentoNaoTributavelBean.mostraTabela}">
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{movimentoNaoTributavelBean.listaMunicipio}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value="" escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{movimentoNaoTributavelBean.listaRadioMunicipio}"/>
				</t:selectOneRadio>
				<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			
			<t:column width="300px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_codigo}" />
			    </f:facet>
			   <br:brOutputText value="#{result.codigo}" style="float:left;"/>
			</t:column>
			
			<t:column width="420px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.path_movimentoNaoTributavel_label_nome}" />
			    </f:facet>
			    <br:brOutputText value="#{result.nome}"/>
			</t:column>			  
			</t:dataTable>
		</br:brPanelGroup>
	</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{movimentoNaoTributavelBean.paginarListaMunicipio}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima" styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;" value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
		</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" style="float:right;" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracaoMensalDiferenciada_btn_prosseguir}" action="#{movimentoNaoTributavelBean.movimentoNaoTributavelProsseguir}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	</br:brPanelGrid>

</br:brPanelGrid>


<f:verbatim> 
<script type="text/javascript">

function habilitarBotaoPesquisar(form){
	
	var botaoPesquisar;
	var estado;
	
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'movimentoNaoTributavelForm:estado'){		
			estado = form.elements[i];
		}		
		
		if (form.elements[i].id == 'movimentoNaoTributavelForm:btnPesquisar'){
			botaoPesquisar = form.elements[i];
		}	
	}	
	
	if (estado.value != ''){
		botaoPesquisar.disabled = false;
	}
}


function habilitaBotaoProsseguir(form, radio){
		
	var botaoProsseguir;
	var hidden;
	
		for(i=0; i<form.elements.length; i++)
		{
			
			
			if (form.elements[i].id == 'movimentoNaoTributavelForm:btnProsseguir'){
				botaoProsseguir = form.elements[i];
			}								
			if (form.elements[i].id == 'movimentoNaoTributavelForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	if ((hidden.value != '')){
		botaoProsseguir.disabled = false;
	}
}


</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean alias="#{BuscaMunicipioBean}" value="#{movimentoNaoTributavelBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp"%>
</t:aliasBeansScope>