<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterCodLancamentoForm" name="manterCodLancamentoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_lc_status}:"/>
		</br:brPanelGroup>
	
		<br:brPanelGroup>
			<br:brInputText id="txtItem" maxlength="11" size="23" onfocus="loadMasks()" alt="itemleicompl" 
    		onkeypress="return validaTecla('0123456789', event)" value="#{itemServicoLcISSBean.dtoManter.codItemLcFormatado}" />  
		</br:brPanelGroup>	
		
		<t:selectOneRadio id="status" value="#{itemServicoLcISSBean.dtoManter.status}" styleClass="HtmlSelectOneRadioBradesco" >  
			<f:selectItem value="A" itemValue="A" itemLabel="#{msgs.radio_iss_gerencial_ativo}" />
			<f:selectItem value="I" itemValue="I" itemLabel="#{msgs.radio_iss_gerencial_inativo}"/>
		</t:selectOneRadio>

	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_pesquisar}" action="#{itemServicoLcISSBean.pequisar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{itemServicoLcISSBean.codigosSelecionadosTabela}" >
			<f:selectItems value="#{itemServicoLcISSBean.selectItemServicoLC}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll; height:390;display:block">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{itemServicoLcISSBean.dtoManter.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" >			
			  <t:column width="200px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codItemLcFormatado}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="500px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_descricao_item_lei_complementar}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descItemLc}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_lc_status}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			
		</t:dataTable>	
		</br:brPanelGroup>
		</br:brPanelGrid>		
	</t:div>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			   
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{itemServicoLcISSBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>