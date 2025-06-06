<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="saldosDivergentesForm" name="saldosDivergentesForm" >
<h:inputHidden id="hiddenRadio" value="#{saldosDivergentesBean.itemSelecionadoLista}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.saldos_divergentes_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.saldos_divergentes_competencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{saldosDivergentesBean.competencia}"/>	
		</br:brPanelGroup>	
	</br:brPanelGrid>	

	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.saldos_divergentes_prosseguir}" 
				action="#{saldosDivergentesBean.carregaListaSaldoDivergentesConta}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	

	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{saldosDivergentesBean.listaSaldosDivergentes !=null}">	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{saldosDivergentesBean.listaSaldosDivergentes.listaSaldoDivergenteContaDTO}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_centro, alinhamento_esquerda, alinhamento_direita, alinhamento_direita"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >		
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value=""  escape="false" />
			    </f:facet>		
				<t:selectOneRadio onclick="javascript:habilitaBotaoConsultarSaldosDivergentes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{saldosDivergentesBean.listaControleCheckRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
			</t:column>
			<t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_conta}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.contaFormatada}" />
			</t:column>
			  <t:column width="380px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_descricao}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" />
			  </t:column>
			  
			   <t:column width="110px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_apuracao_giss}"  />
			    </f:facet>
   			    <br:brOutputText value="#{result.apuracao}" converter="decimalBrazillianConverter" />
			  </t:column>
			   <t:column width="110px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.saldos_divergentes_contabil_sap}"  />
			    </f:facet>
   			    <br:brOutputText value="#{result.contabil}" converter="decimalBrazillianConverter" />
			  </t:column>
			</t:dataTable>		
			
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
	<br:brPanelGrid columns="3"  cellpadding="0" cellspacing="0"  rendered="#{saldosDivergentesBean.listaSaldosDivergentes != null}" width="100%">	
			<br:brPanelGroup style="width=210px;margin-left:70px;margin-right:250px">
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.saldos_divergentes_total}"/>	
			</br:brPanelGroup>


			<br:brPanelGroup style="width=200px" style="align:right">
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{saldosDivergentesBean.totalApuracao}" converter="decimalBrazillianConverter"/>	
			</br:brPanelGroup>	

			<br:brPanelGroup style="width=200px" style="align:right;margin-left:7px">
				<br:brOutputText  styleClass="HtmlOutputFormatBoldBradesco" value="#{saldosDivergentesBean.totalContabil}" converter="decimalBrazillianConverter"/>	
			</br:brPanelGroup>	
			
	</br:brPanelGrid>
	
	
	<f:verbatim><br></f:verbatim>
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" 
		    		actionListener="#{saldosDivergentesBean.pesquisar}" rendered="#{saldosDivergentesBean.listaSaldosDivergentes != null && !empty saldosDivergentesBean.listaSaldosDivergentes}">
			
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
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{saldosDivergentesBean.listaSaldosDivergentes != null}" >
		<br:brPanelGroup> 
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{saldosDivergentesBean.listaSaldosDivergentes != null}">	
		<br:brPanelGroup>
			<br:brCommandButton   id="btnConsultar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.saldos_divergentes_consultar}" 
				action="#{saldosDivergentesBean.consultar}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>	
	