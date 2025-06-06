<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirTipoServicoForm" name="incluirTipoServicoForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_informacao_cadastramento_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_codigo_tipo_servico}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_descricao_tipo_servico}:"/>
		</br:brPanelGroup>
		
	    <br:brPanelGroup>	
	    	<br:brInputText size="15" maxlength="2" id="txtCodigo" value="#{tipoServicoBean.codigo}" onkeyup="aplicamascara('incluirTipoServicoForm', 'incluirTipoServicoForm:txtCodigo',numeros);">  
		    	<brArq:commonsValidator type="required" arg="#{msgs.label_codigo_tipo_servico}" server="false" client="true"/>
		    	<brArq:commonsValidator type="integer" arg="#{msgs.label_codigo_tipo_servico}" server="false" client="true" />
		    </br:brInputText>	
		</br:brPanelGroup>	
								
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
	    <br:brPanelGroup>	
	    	<br:brInputText size="46" maxlength="30" id="txtDescricao" value="#{tipoServicoBean.descricao}" onkeyup="Somaiuscula('Somaiuscula', window.event.keyCode, this);">  
		    	<brArq:commonsValidator type="required" arg="#{msgs.label_descricao_tipo_servico}" server="false" client="true"/>
		    </br:brInputText>	
		</br:brPanelGroup>	
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_limpar_campos_tipo_servico}" action="#{tipoServicoBean.limparDados}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnIncluir" onclick="javascript: return validateForm(document.forms[1]);" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_incluir_tipo_servico}" action="#{tipoServicoBean.incluirTipoServico}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{tipoServicoBean.carregaFaixas}">	
		<br:brPanelGroup >	
					<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
					
		<t:dataTable id="dataTable" value="#{tipoServicoBean.listaGridTipoServico}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">			
			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_tipo_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codigo}"  style="margin-right:5 px; float:right;"/>
			  </t:column>
			  <t:column width="550px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.grid_descricao_tipo_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" style="margin-left:6 px; float:left;" />
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.grid_dt_atualizacao_tipo_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dtAtualizacao}" style="margin-left:18 px;float:left;"/>
			  </t:column>
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
				<f:verbatim>   </f:verbatim>	
 	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{tipoServicoBean.listaGridTipoServico!= null && tipoServicoBean.mostraBotoes}">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{tipoServicoBean.pesquisarIncluir}" >
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
		
</br:brPanelGrid>


<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>

function Somaiuscula(formato, keypress, objeto){
	campo = eval(objeto);
	caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
	if (caracteres.search(String.fromCharCode(keypress))!=1){
		campo.value = campo.value.toUpperCase();
	}
}

</script>
 </f:verbatim>
</brArq:form>
