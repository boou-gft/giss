<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="resultadoConsultaOscilacaoNegativaForm" name="resultadoConsultaOscilacaoNegativaForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid style="margin-top:20px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.dconsultarApuracaoOscilacaoNegativa_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:15px" />
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_competencia}:" />												
			<br:brPanelGroup style="width:5px" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarOscilacaoNegativaBean.dataCompetenciaEnviada}"/>	
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:15px" />
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_dependencia}:" />												
			<br:brPanelGroup style="width:5px" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarOscilacaoNegativaBean.dependencia}"/>
			
			<br:brPanelGroup style="width:80px" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextLabelBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_descricao}:" />												
			<br:brPanelGroup style="width:5px" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarOscilacaoNegativaBean.municipio}"/>	
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid style="margin-top:10px" />
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_resultado_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
	<t:div styleClass="barraDeRolagem">
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{consultarOscilacaoNegativaBean.listaContas}" var="result" rowClasses="tabela_celula_normal, tabela_celula_destaque" columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_direita" headerClass="tabela_celula_destaque_acentuado" width="750px">
			<t:column width="110px" style="padding-left:5px;" rendered="#{consultarOscilacaoNegativaBean.razaoExiste}">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cosif}" escape="false" />
			    </f:facet>
			 	 <br:brOutputText value="#{result.cosif}" style="padding-top:5px; height: 20px" />
			</t:column>	
			<t:column width="110px" style="padding-left:5px;" rendered="#{!consultarOscilacaoNegativaBean.razaoExiste}" >
			    <f:facet name="header">
			      <br:brOutputText value="Conta" escape="false"/>
			    </f:facet>
			 	 <br:brOutputText value="#{result.cosif}" style="padding-top:5px; height: 20px" />
			</t:column>			
			<t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarOscilacaoNegativaBean.razaoExiste}" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoOscilacaoNegativa_label_razao}" escape="false"/>
			    </f:facet>
			 	 <br:brOutputText value="#{result.razao}" style="padding-top:5px; height: 20px" />
			</t:column>
			<t:column style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" rendered="#{consultarOscilacaoNegativaBean.razaoExiste}" >
			    <f:facet name="header">
			      <br:brOutputText value="Conta" escape="false"/>
			    </f:facet>
			 	 <br:brOutputText value="#{result.conta}" style="padding-top:5px; height: 20px" />
			</t:column>
			<t:column width="360px" style="padding-left:5px;text-align:left">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.consultarApuracaoOscilacaoNegativa_label_descricao}" escape="false" />
			    </f:facet>
			     <br:brOutputText value="#{result.descricao}" style="padding-top:5px; height: 20px" />
			</t:column>
			<t:column width="110px" style="padding-left:5px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoOscilacaoNegativa_label_anterior}" />
			    </f:facet>
			     <br:brOutputText value="#{result.anterior}" style="padding-top:5px; height: 20px" converter="decimalBrazillianConverter"/>
			</t:column>  
			<t:column width="110px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoOscilacaoNegativa_label_atual}" />
			    </f:facet>
			    <br:brOutputText value="#{result.atual}" style="padding-top:5px; height: 20px" converter="decimalBrazillianConverter"/>
			</t:column>  
			<t:column width="110px" style="text-align:right">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.consultarApuracaoOscilacaoNegativa_label_oscilacao}" />
			    </f:facet>
			    <br:brOutputText value="#{result.oscilacao}" style="padding-top:5px; height: 20px; margin-left: 50px" converter="decimalBrazillianConverter"/>
			</t:column>
			</t:dataTable>	
		</br:brPanelGroup>
		</t:div>
	</br:brPanelGrid>	
	
	<br:brPanelGroup style="height:5px" />
	
	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:460px;">
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_total_mes}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:90px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalAnterior}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:90px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalAtual}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:110px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalOscilacao}"/>
		</br:brPanelGroup>			
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="width:460px;">
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.consultarApuracaoOscilacaoNegativa_label_total_acumulado}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:90px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalAnteriorAcumulado}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:90px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalAtualAcumulado}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:110px;text-align:right" >
			<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarOscilacaoNegativaBean.totalOscilacaoAcumulado}"/>
		</br:brPanelGroup>			
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" style="float:left;">
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.oscilacaoNegativa_botao_voltar}" action="#{consultarOscilacaoNegativaBean.voltarConsultar}" disabled="false">
				<brArq:submitCheckClient/>
			</br:brCommandButton>	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width: 550px" />	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPlanilhaEletronica" 
								styleClass="HtmlCommandButtonBradesco" 
								value="#{msgs.detalheApuracaoOscilacaoNegativa_botao_planilha_eletronica}" 
								actionListener="#{consultarOscilacaoNegativaBean.imprimirPlanilhaEletronicaDetalhe}"
								onclick="desbloqTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
</br:brPanelGrid>
</brArq:form>