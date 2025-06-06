<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="consultarHistoricoMunicipioForm" name="consultarHistoricoMunicipioForm" >


<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_municipios_title_informacoes_pesquisa}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
</br:brPanelGrid>

	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" columns="1" width="100%" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.historico_municipio_label_data_atualizacao}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<app:calendar id="dataHoraAtualizacao" value="#{municipioISSBean.dtoHistorico.dataAtualizacao}"/>
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

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{municipioISSBean.dtoHistorico.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{municipioISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="15" value="#{municipioISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{municipioISSBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{municipioISSBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_pesquisar}" action="#{municipioISSBean.pesquisarHistoricoMunicipio}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<f:verbatim> <br> </f:verbatim>
	<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%" style="margin-top:11px"  rendered="#{municipioISSBean.mostrarLista}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{municipioISSBean.mostrarLista}">	
		<t:div  style="overflow-Y:scroll; height:275;display:block">
		<t:selectOneRadio layout="spread" id="selectTabela" forceId="true" forceIdIndex="false" value="#{municipioISSBean.itemTabelaSelecionado}">
			<f:selectItems value="#{municipioISSBean.listaControleRadio}" />
		</t:selectOneRadio>
		<t:dataTable id="dataTable" value="#{municipioISSBean.dtoHistorico.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">			
			  <t:column width="5%">
				<f:facet name="header">
					<br:brOutputText value="" />
				</f:facet>
				<t:radio index="#{indexLista}" for=":consultarHistoricoMunicipioForm:selectTabela" />
			  </t:column>
			  <t:column width="100px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.historico_municipios_label_codigo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="300px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.historico_municipios_label_municipio}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descMunicipios}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="300px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.historico_municipios_label_atualizazao}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataHoraAtualizacaoFormatado}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px" >
			    <f:facet name="header">
			      <h:outputText value="Exclusão" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataFimVigencia}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px" >
			    <f:facet name="header">
			      <h:outputText value="Cód. Funcional" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.funcionario}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
		</t:div>	
	</br:brPanelGrid>
	
	

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{municipioISSBean.mostrarLista}">	
	<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnDetalhar" styleClass="HtmlCommandButtonBradesco"
				  value="#{msgs.botao_detalhar}" action="#{municipioISSBean.carregarDetalharHistorico}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>


</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{municipioISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
	