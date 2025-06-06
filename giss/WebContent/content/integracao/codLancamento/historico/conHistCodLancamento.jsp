<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="historicoCodLancamentoForm" name="historicoTipoServicoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.historico_conta_contabil_periodo}:" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cod_lancamento}:" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px" value="#{msgs.historico_conta_contabil_label_de}"/>
			 	<app:calendar  id="calendarioDe" value="#{codLancamentoBean.dtoHist.dataInicial}">	
				 	<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_inicial}" server="false" client="true"/>
			 	</app:calendar>
			<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.historico_conta_contabil_label_ate}"/>
				<app:calendar  id="calendarioAte" value="#{codLancamentoBean.dtoHist.dataFinal}">
					<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_final}" server="false" client="true"/>
			 	</app:calendar>
		</br:brPanelGroup>				
			<br:brPanelGroup>
				<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0" >
					<br:brPanelGroup>
					</br:brPanelGroup>
				</br:brPanelGrid>
			</br:brPanelGroup>	
		<br:brPanelGroup>
   			<br:brInputText size="15" maxlength="5" id="txtCodigo" value="#{codLancamentoBean.dtoHist.codLancamento}" onkeyup="aplicamascara('historicoCodLancamentoForm', 'historicoCodLancamentoForm:txtCodigo',numeros);"/>  
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparDados" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_limpar}" action="#{codLancamentoBean.limparDadosHistorico}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_conta_contabil_prosseguir}" action="#{codLancamentoBean.listarHistorico}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim> <br> </f:verbatim> 
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{codLancamentoBean.mostrarLista}">	
		<br:brPanelGroup >	
		<t:div  style="overflow-Y:scroll; height:380;display:block">
					
				
		<t:dataTable id="dataTable" value="#{codLancamentoBean.dtoHist.lista}" var="result"  
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			headerClass="tabela_celula_destaque_acentuado" width="750px" rowIndexVar="indexLista">

			<t:column width="5%">
				<f:facet name="header">
					<br:brOutputText value="" />
				</f:facet>
			  	<t:selectOneRadio id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{codLancamentoBean.dtoHist.itemSelecionado}">
					<f:selectItems value="#{codLancamentoBean.listaControleRadio}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{indexLista}"  />
			  </t:column>

			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_lancamento}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codLancamento}" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="Item Alterado" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descItem}" escape="false"/>
			  </t:column>
			  <t:column width="200px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_atualizacao}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataAtualizacao}" escape="false"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_hora}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.horaAtualizacao}" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_exclusao}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataExclusao}" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_funcional}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codFuncional}" escape="false"/>
			  </t:column>
			  
			</t:dataTable>	
			</t:div>	
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid width="100%"  rendered="#{codLancamentoBean.mostrarLista}">
		<f:verbatim><hr class="lin"> </f:verbatim>	
	</br:brPanelGrid>
		<br:brPanelGrid width="100%" style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{codLancamentoBean.mostrarLista}">
			<br:brCommandButton id="btnDetalhar"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.btn_detalhar}"
				action="#{codLancamentoBean.detalharHistorico}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
		</br:brPanelGrid>
	</br:brPanelGrid>

	<brArq:validatorScript functionName="validateForm"/>
 </brArq:form>