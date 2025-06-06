<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarDetalhesBalanceteObrigacoesAcessoriasForm" name="consultarDetalhesBalanceteObrigacoesAcessoriasForm">

<h:inputHidden id="hiddenRadioGrid" value="#{consultarBalanceteObrigacoesAcessoriasBean.consultarBalanceteFiscalizacoesIssDTO.itemSelecionadoListaIntermediariaBalancetes}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_incidencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>	
			<f:verbatim> <div id="rolagem" style="width:750px;"> </f:verbatim>
			
	    	
	    	<t:dataTable id="dataTable" value="#{consultarBalanceteObrigacoesAcessoriasBean.consultarBalanceteFiscalizacoesIssDTO.listaIntermediariaBalancetes}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px">
			 	<t:column width="25px" >
					<f:facet name="header">
			      		<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    	</f:facet>		
					<t:selectOneRadio onclick="javascript:habilitarBotoes(document.forms[1], this);" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems value="#{consultarBalanceteObrigacoesAcessoriasBean.consultarBalanceteFiscalizacoesIssDTO.listaControleIntermediariaBalancetes}"/>
					</t:selectOneRadio>
		    		<t:radio for="sor" index="#{result.numeroRegistro}" />
				</t:column>
			  	
			  	<t:column width="70px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_periodo}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.periodo}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="100px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_dependencia}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codDependencia}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="300px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_empresa}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codEmpresa} - #{result.descEmpresa}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="200px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descMunicipio}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="50px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.consultar_balancete_fiscalizacoes_iss_label_lista_uf}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.siglaUf}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			</t:dataTable>
			
			
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{consultarBalanceteObrigacoesAcessoriasBean.paginarListaIntermediaria}" rendered="#{consultarBalanceteObrigacoesAcessoriasBean.consultarBalanceteFiscalizacoesIssDTO.listaIntermediariaBalancetes != null}">
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
	
	<br:brPanelGrid columns="3" border="0" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup style="text-align:left;width:150px">
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_voltar}" action="#{consultarBalanceteObrigacoesAcessoriasBean.voltar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="width:490px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brCommandButton id="btnExcel" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_excel}" action="" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>

			<br:brCommandButton id="btnTxt" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_txt}" action="" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brCommandButton id="btnPdf" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_pdf}" action="" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGrid>
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
	
	<script>
	
		function habilitarBotoes(form, radio){	
			var hidden;

			for(i=0; i<form.elements.length; i++){
				if (form.elements[i].id == 'consultarDetalhesBalanceteObrigacoesAcessoriasForm:btnExcel'){
					form.elements[i].disabled=false;
				}
				if (form.elements[i].id == 'consultarDetalhesBalanceteObrigacoesAcessoriasForm:btnTxt'){
					form.elements[i].disabled=false;
				}
				if (form.elements[i].id == 'consultarDetalhesBalanceteObrigacoesAcessoriasForm:btnPdf'){
					form.elements[i].disabled=false;
				}
				if (form.elements[i].id == 'consultarDetalhesBalanceteObrigacoesAcessoriasForm:hiddenRadioGrid'){		
					hidden = form.elements[i];
					hidden.value = radio.value;		
				}
			}	
		}
	
	</script>
 
 </f:verbatim>

</brArq:form>