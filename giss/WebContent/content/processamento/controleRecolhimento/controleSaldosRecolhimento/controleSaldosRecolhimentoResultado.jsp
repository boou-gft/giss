<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="conSaldosRecForm" name="conSaldosRecForm">
<h:inputHidden id="hiddenRadio" value="#{controleSaldosRecolhimento.dependenciaSelecionada}"/>
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.controle_saldos_recolhimento_informacoes_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
  	    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_competencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.competencia}" />
			</br:brPanelGroup>			
		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.estado}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.municipio}" />
			</br:brPanelGroup>			
		</br:brPanelGrid>
	
		<f:verbatim><hr class="lin"> </f:verbatim>
		
		 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_vencimento}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.vencimento}" />
				
				<br:brPanelGroup style="width: 175px;" />
								
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_pagto_dia_util}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.pagtoDiaUtil}" />
			</br:brPanelGroup>
		</br:brPanelGrid>		

		<br:brPanelGroup style="height: 10px;" />

  	    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_forma_pagamento}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.formaPagto}" />
				<br:brPanelGroup style="width: 82px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.controle_saldos_recolhimento_data_recolhimento}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{controleSaldosRecolhimento.dataRecolhimento}" />
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<f:verbatim><hr class="lin"> </f:verbatim>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{controleSaldosRecolhimento.mostraDependencias}" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.controle_saldos_recolhimento_resultado_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup >	
				<t:dataTable id="dataTable" value="#{controleSaldosRecolhimento.listaDependenciaSaldosRecolhimento}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_direita,
							   alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px" >
				<t:column width="30px">
					<f:facet name="header">
						<br:brOutputText value="" />
			    	</f:facet>		
		    		<t:selectOneRadio onclick="javascript:habilitaBotoes(this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems value="#{controleSaldosRecolhimento.listaDependenciasRadio}"/>
					</t:selectOneRadio>
			    	<t:radio for="sorLista" index="#{result.linha}" />
				</t:column>	
				<t:column width="90px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_dependencia}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.dependencia}" style="float:left; margin-left:5 px;"/>
				</t:column>
				  <t:column width="300px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_descricao}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.descricao}" />
				  </t:column>
				   <t:column width="40px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_venc}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.vencimento}" />
				  </t:column>
				   <t:column width="120px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_saldo}"  />
				    </f:facet>
				   <br:brOutputText value="#{result.saldo}" style="float:right; margin-right:5 px;"/> 
				  </t:column>
				   <t:column width="120px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_situacao}"  />
				    </f:facet>
				   <br:brOutputText value="#{result.situacao}" />
				  </t:column>
				   <t:column width="60px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.controle_saldos_recolhimento_email}"  />
				    </f:facet>
				   <br:brOutputText value="#{result.email}" />
				  </t:column>
				</t:dataTable>		
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" width="750px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraDependencias && !empty controleSaldosRecolhimento.listaDependenciaSaldosRecolhimento}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{controleSaldosRecolhimento.paginarListaControleSaldoRecolhimento}" rendered="#{controleSaldosRecolhimento.mostraDependencias}">
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
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:11px" cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraDependencias}">
			<br:brPanelGroup>
				<f:verbatim><hr class="lin"> </f:verbatim>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" rendered="#{controleSaldosRecolhimento.mostraDependencias}">	
			<br:brPanelGroup style="text-align:left;width:150px"  >
				<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.controle_saldos_recolhimento_voltar}" action="#{controleSaldosRecolhimento.voltarPaginaInicial}" >	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
			<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup> 
				</br:brPanelGroup>
			</br:brPanelGrid>	
			<br:brPanelGroup style="text-align:right;width:200px" >
				<br:brCommandButton id="btnMensagem" styleClass="HtmlCommandButtonBradesco" value="#{msgs.controle_saldos_recolhimento_mensagem}" action="#{controleSaldosRecolhimento.enviarMensagem}" disabled="true">	
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
		</br:brPanelGrid>
		
	</br:brPanelGrid>
	
<f:verbatim>
<script language="javascript">

	function habilitaBotoes(objRadio) {
		var hidden = document.getElementById('conSaldosRecForm:hiddenRadio');
		if (objRadio.checked) {
			hidden.value = objRadio.value;
			document.getElementById('conSaldosRecForm:btnMensagem').disabled = false;
		}
  	}

</script>
</f:verbatim>
	
<brArq:validatorScript functionName="validateForm"/>	
</brArq:form>