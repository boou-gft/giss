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

<brArq:form id="consultarHistoricoMinMaxAliquota" name="consultarHistoricoMinMaxAliquota" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"/>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
 	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" width="100%">
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_vigencia_incluir_tipo_incidencia}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup></br:brPanelGroup>	
	
		
		<br:brPanelGroup>
			<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px" value="#{msgs.label_iss_data_de}"/>
		 	<app:calendar  id="calendarioVigenciaInicio" value="#{parametrizarMinMaxAliquotaBean.dto.dataIncioVigenciaAliquota}">	
			 	<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_inicial}" server="false" client="true"/>
		 	</app:calendar>
		 	
		 	<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.label_iss_data_ate}"/>
			<app:calendar  id="calendarioVigenciaFim" value="#{parametrizarMinMaxAliquotaBean.dto.dataFimVigenciaAliquota}">
				<brArq:commonsValidator type="required" arg="#{msgs.historico_tipo_servico_periodo_final}" server="false" client="true"/>
		 	</app:calendar>
		</br:brPanelGroup>	
	</br:brPanelGrid>
  
  	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_pesquisar}" action="#{parametrizarMinMaxAliquotaBean.pesquisarHistoricoAliquota}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
  
  	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
  
 	 
	<t:div  style="overflow-Y:scroll;overflow-X:scroll; height:275;width:750;display:block" rendered="#{parametrizarMinMaxAliquotaBean.mostrarListaHistorico}">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{parametrizarMinMaxAliquotaBean.dto.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >			
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_data_inicio_vigencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataInicioVigencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="160px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_data_fim_vigencia}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataFimVigencia}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_porcentagem_aliquota_minimo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.porcentAliquotaMin}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_porcentagem_aliquota_maximo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.porcentAliquotaMax}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="120px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_aliquota_usuario}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.usuario}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="250px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_aliquota_data_alteracao}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataAlteracao}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
			</br:brPanelGroup>
	
	</br:brPanelGrid>		
	</t:div>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{parametrizarMinMaxAliquotaBean.mostrarListaHistorico}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{parametrizarMinMaxAliquotaBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
  
	
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>