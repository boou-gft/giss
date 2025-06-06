<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="resultadoMunicipiosNovosContasForm" name="resultadoMunicipiosNovosContasForm" >
<h:inputHidden id="hiddenRadio" value="#{resultMunicNovoBean.codListaPesquisaRadioConta}"/>
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_recolhimento_informacoes_municipio}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid> 

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_recolhimento_codigo}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.codigo}" />
			</br:brPanelGroup>			
	
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_recolhimento_nome}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.nome}" />
			</br:brPanelGroup>
						
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_recolhimento_uf}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.uf}" />
			</br:brPanelGroup>	
		
		</br:brPanelGrid>

		<f:verbatim><hr class="lin"> </f:verbatim> 
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_recolhimento_informacoes_pesquisa}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0"  width="100%">	
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.resultado_municipios_novos_contas_tipo_servico}:" />
				
				<br:brPanelGroup style="width: 8px;" />	
				
	    		<br:brSelectOneMenu style="width:280px" id="formaPagamento" value="#{resultMunicNovoBean.tipoServico}">	
					<f:selectItem itemValue="0" itemLabel="#{msgs.resultado_municipios_novos_incluir_comboSelecione}"/>
					<f:selectItems value="#{resultMunicNovoBean.listaTipoServico}"/>	
						<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_forma_pagamento}" server="false" client="true"/>
				</br:brSelectOneMenu>		    	    	
			</br:brPanelGroup>	
		
			<br:brPanelGroup style="width: 10px;" />
		
			<br:brPanelGroup>
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" 
					value="#{msgs.resultado_municipios_novos_contas_btn_pesquisar}" action="#{resultMunicNovoBean.pesquisarContas}"  disabled="#{resultMunicNovoBean.exibirCampos}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>	
		</br:brPanelGrid>	

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0"  width="100%" rendered="#{resultMunicNovoBean.mostraContas}">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim> 
		</br:brPanelGroup>
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.apuracao_reprocessamento_atualizacao_aliquota_padrao}:" />
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid> 
		
		
		<br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.apuracao_reprocessamento_aliquota}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" />
			<br:brInputText id="percentualAliquota" maxlength="6" size="10" onblur="vNumero(this,'9(3)V9(2)');" value="#{resultMunicNovoBean.percentualAliquota}"/>						
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="" />
			<br:brCommandButton id="btnAtualizarAliquota" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" value="#{msgs.resultado_municipios_novos_contas_btn_atualizar}" action="#{resultMunicNovoBean.atualizarAliquota}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
				
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"> </f:verbatim> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  rendered="#{resultMunicNovoBean.mostraContas}">
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_resultado_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="600px" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.mostraContas}">	
		<br:brPanelGroup >			
			<t:dataTable id="dataTable" value="#{resultMunicNovoBean.listaContas}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_centro, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="600px" >		
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <br:brOutputText value=""  escape="false" />
			    </f:facet>	
			    
			    <t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{resultMunicNovoBean.listaControlePesquisaContas}"/>
				</t:selectOneRadio>
		    	<t:radio for="sorLista" index="#{result.linha}"  />
				
			</t:column>
			<t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_cosif}"  />
			    </f:facet>
			   <br:brOutputText value="#{result.cosif}"/>
			</t:column>
			<t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultado_municipios_novos_razao}"  />
			    </f:facet>
			   <br:brOutputText value="#{result.razao}"/>
			</t:column>
			<t:column width="120px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultado_municipios_novos_conta}"  />
			    </f:facet>
			   <br:brOutputText value="#{result.conta}"/>
			</t:column>
			  <t:column width="480px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">
			      <h:outputText value="#{msgs.resultado_municipios_novos_conta_descricao}"  />
			    </f:facet>
			    <br:brOutputText value="#{result.descricao}" />
			  </t:column>			  
			</t:dataTable>		
		</br:brPanelGroup>
	</br:brPanelGrid>

 	<br:brPanelGrid columns="1" width="600px" style="text-align:center" cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.mostraContas}">	
		<br:brPanelGroup>
		    <brArq:pdcDataScroller id="dataScroller" for="dataTable" 
		            actionListener="pesquisaListaContas" rendered="#{resultMunicNovoBean.listaContas!= null && resultMunicNovoBean.mostraBotoesContas}">
			 
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
	
	<f:verbatim><hr class="lin"> </f:verbatim> 	
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.resultado_municipios_novos_incluir_btn_voltar}" 
					action="#{resultMunicNovoBean.voltarContasMunicipios}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:625px">
		</br:brPanelGroup>		
		
		<br:brPanelGroup  >
			<br:brCommandButton id="btnProsseguirSeguinte" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" 
					value="#{msgs.resultado_municipios_novos_contas_btn_prosseguir}" action="#{resultMunicNovoBean.carregaFinalizar}" disabled="true" rendered="#{resultMunicNovoBean.listaContas!= null}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
<f:verbatim>
<script language="javascript">	
function habilitarBotoes(form, radio){	
	var hidden=-1;	
	
	for(i=0; i<form.elements.length; i++)
	{
		
		if (form.elements[i].id == 'resultadoMunicipiosNovosContasForm:btnProsseguirSeguinte'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'resultadoMunicipiosNovosContasForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}
</script>
</f:verbatim>
	</br:brPanelGrid>
</brArq:form>