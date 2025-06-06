<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="solicitarReprocessamentoPorDependenciaForm" name="solicitarReprocessamentoPorDependenciaForm" >
<h:inputHidden id="hiddenRadio" value="#{reprocessamentoPorDependenciaBean.itemSelecionadoLista}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_informacoes_processamento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estadoCombo" value="#{reprocessamentoPorDependenciaBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{reprocessamentoPorDependenciaBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{reprocessamentoPorDependenciaBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{reprocessamentoPorDependenciaBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_data_inicial}:" />												
			
			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesInicial','solicitarReprocessamentoPorDependenciaForm:txtAnoInicial');" 
		    	value="#{reprocessamentoPorDependenciaBean.periodoMesInicial}" size="3" maxlength="2" id="txtMesInicial" onkeypress="aplicamascara('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesInicial',numeros);" onblur="validarData('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesInicial', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorDependenciaBean.periodoAnoInicial}" 
		    	size="6" maxlength="4" id="txtAnoInicial" onkeypress="aplicamascara('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtAnoInicial',numeros);" onblur="validarData('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtAnoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
		</br:brPanelGroup>

	  	<br:brPanelGroup style="width: 80px;" />

	  	<br:brPanelGroup>
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_data_final}:" />												
			
			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesFinal','solicitarReprocessamentoPorDependenciaForm:txtAnoFinal');" 
		    	value="#{reprocessamentoPorDependenciaBean.periodoMesFinal}" size="3" maxlength="2" id="txtMesFinal" onkeypress="aplicamascara('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesFinal',numeros);" onblur="validarData('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtMesFinal', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorDependenciaBean.periodoAnoFinal}" 
		    	size="6" maxlength="4" id="txtAnoFinal" onkeypress="aplicamascara('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtAnoFinal',numeros);" onblur="validarData('solicitarReprocessamentoPorDependenciaForm','solicitarReprocessamentoPorDependenciaForm:txtAnoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
	    </br:brPanelGroup>
	</br:brPanelGrid>
	
	
		
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" width="100%"  style="text-align:right">
		<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_pesquisar}" action="#{reprocessamentoPorDependenciaBean.carregarLista}">
			<brArq:submitCheckClient/>
		</br:brCommandButton>
	</br:brPanelGrid>	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{reprocessamentoPorDependenciaBean.listaMunicipio != null}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{reprocessamentoPorDependenciaBean.listaMunicipio}" var="tabelaMunicipio" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value="" escape="false" />
				    </f:facet>	
				   		<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
							<f:selectItems value="#{reprocessamentoPorDependenciaBean.listaRadioMunicipio}"/>
						</t:selectOneRadio>
						<t:radio for="sorLista" index="#{tabelaMunicipio.itemRadio}"  />
				</t:column>
				<t:column width="100px" style="padding-right:5px; padding-left:5px">
				   <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_codigo}" />
				   </f:facet>
				   <br:brOutputText value="#{tabelaMunicipio.codigo}" style="float:left; margin-left:5 px;"/>
				</t:column>
				<t:column width="350px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.apuracao_reprocessamento_dependencia_nome}" />
				    </f:facet>
				    <br:brOutputText value="#{tabelaMunicipio.nome}"/>
				</t:column>		
			</t:dataTable>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{reprocessamentoPorDependenciaBean.listaMunicipio != null}">	
		<br:brPanelGroup>		
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{reprocessamentoPorDependenciaBean.paginarListaMunicipio}" rendered="#{reprocessamentoPorDependenciaBean.listaMunicipio != null}" >
				<f:facet name="previous">
				    <brArq:pdcCommandButton id="anterior"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_anterior}" title="#{msgs.label_anterior}"/>
				</f:facet>
				<f:facet name="next">
					<brArq:pdcCommandButton id="proxima"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_proxima}" title="#{msgs.label_proxima}"/>
				</f:facet>
			</brArq:pdcDataScroller>			  
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGroup rendered="#{reprocessamentoPorDependenciaBean.listaMunicipio != null}">
	  <f:verbatim><hr class="lin"></f:verbatim>
	</br:brPanelGroup>
	
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="float:right;" rendered="#{reprocessamentoPorDependenciaBean.listaMunicipio != null}">
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_dependencia_prosseguir}" action="#{reprocessamentoPorDependenciaBean.prosseguir}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>		
		</br:brPanelGroup>		
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim> 
<script type="text/javascript">

function habilitaBotaoProsseguir(form, radio){
		
	var botaoProsseguir;
	var hidden;
	
		for(i=0; i<form.elements.length; i++)
		{
			
			
			if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaForm:btnProsseguir'){
				botaoProsseguir = form.elements[i];
			}								
			if (form.elements[i].id == 'solicitarReprocessamentoPorDependenciaForm:hiddenRadio'){		
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
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{reprocessamentoPorDependenciaBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>