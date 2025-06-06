<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarPercentualTransicaoForm" name="consultarPercentualTransicaoForm" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_resultado_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty parametrizarPercentualTransicaoBean.listaConsulta}">	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
		    <t:dataTable id="dataTable" value="#{parametrizarPercentualTransicaoBean.listaConsulta}" var="result" rows="50" rowIndexVar="indexLista"
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				 <t:column width="25px" >
					<f:facet name="header">
				      <br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
				    </f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotaoProsseguir(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{parametrizarPercentualTransicaoBean.itemSelecionado}">
						<f:selectItems value="#{parametrizarPercentualTransicaoBean.listaControle}"/>
					</t:selectOneRadio>
			    	<t:radio for="sor" index="#{indexLista}"  />
				</t:column>
				    
				  <t:column width="70px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_data_inicio_vigencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.dataInicioVigencia}"  style="margin-left:6 px;float:left;">
				    	<f:converter converterId="dateBrazillianConverter" />
				    </br:brOutputText>
				  </t:column>
				  <t:column width="70px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_data_fim_vigencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.dataFimVigencia}"  style="margin-left:6 px;float:left;">
				    	<f:converter converterId="dateBrazillianConverter" />
				    </br:brOutputText>
				  </t:column>
				  <t:column width="140px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_percentual_municipio_prestador}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.percentualMunicipioPrestador}"  style="margin-left:6 px;float:left;"/>
				  </t:column>
				  <t:column width="140px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_percentual_municipio_tomador}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.percentualMunicipioTomador}"  style="margin-left:6 px;float:left;"/>
				  </t:column>
				  <t:column width="50px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_usuario}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.usuario}"  style="margin-left:6 px;float:left;"/>
				  </t:column>
				  <t:column width="120px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.label_data_alteracao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
				    </f:facet>
				    <br:brOutputText value="#{result.dataAlteracao}"  style="margin-left:6 px;float:left;" >
				    	<f:converter converterId="timestampPdcConverter" />
				    </br:brOutputText>
				  </t:column>
			</t:dataTable>	
			<f:verbatim>  </f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>		

		<f:verbatim><hr class="lin"> </f:verbatim>

		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnIncluir" disabled="false" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_incluir}" action="#{parametrizarPercentualTransicaoBean.prepararInclusao}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnAlterar" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_alterar}" action="#{parametrizarPercentualTransicaoBean.prepararAlteracao}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnExcluir" disabled="true" rendered="false" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_excluir}" action="#{parametrizarPercentualTransicaoBean.excluir}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>		
			
	</br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm"/>
	<f:verbatim>
		<script>
			function habilitarBotaoProsseguir(form, radio) {
				document.getElementById("consultarPercentualTransicaoForm:btnAlterar").disabled=false;
				document.getElementById("consultarPercentualTransicaoForm:btnExcluir").disabled=false;
			}
		</script>
	</f:verbatim>
</brArq:form>