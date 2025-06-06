<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultarDetalhesBalanceteFiscalizacoesIssForm" name="consultarDetalhesBalanceteFiscalizacoesIssForm">

<h:inputHidden id="hiddenRadioGrid" value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.itemSelecionadoListaIntermediariaBalancetes}"/>

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
			
	    	
	    	<t:dataTable id="dataTable" value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listaIntermediariaBalancetes}" rowIndexVar="parametroKey" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px">
			 	<t:column width="25px" >
					<f:facet name="header">
			      		<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    	</f:facet>		
					<t:selectManyCheckbox
						onclick="validarCheckbox(document.forms[1], this)"
						value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.itemBalanceteSelecionado}"
						id="sorLista" styleClass="HtmlSelectOneRadioBradesco"
						layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems
							value="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listaControleIntermediariaBalancetes}" />
					</t:selectManyCheckbox>
					<t:checkbox for="sorLista" index="#{parametroKey}" />
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
			    	<br:brOutputText value="#{result.codDependenciaFormatado}" style="margin-left:6 px;float:left;"/>
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
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{consultarBalanceteFiscalizacoesIssBean.paginarListaIntermediaria}" rendered="#{consultarBalanceteFiscalizacoesIssBean.consultarBalanceteFiscalizacoesIssDTO.listaIntermediariaBalancetes != null}">
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
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_voltar}" action="#{consultarBalanceteFiscalizacoesIssBean.voltar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="width:490px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brCommandButton id="btnExcel" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_excel}" actionListener="#{consultarBalanceteFiscalizacoesIssBean.gerarExcel}" onclick="desbloquearTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>

			<br:brCommandButton id="btnTxt" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_txt}" actionListener="#{consultarBalanceteFiscalizacoesIssBean.gerarTxt}" onclick="desbloquearTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brCommandButton id="btnPdf" disabled="true" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_pdf}" actionListener="#{consultarBalanceteFiscalizacoesIssBean.gerarPdf}" onclick="desbloquearTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGrid>
	</br:brPanelGrid>

</br:brPanelGrid>

<f:verbatim>
	
	<script>

	function validarCheckbox(form, chk) {
			var checkboxes = document.getElementsByName('sorLista');
			var objBtnConsultarExcel = document.getElementById(form.name + ':btnExcel');
			var objBtnConsultarTxt = document.getElementById(form.name + ':btnTxt');
			var objBtnConsultarPdf = document.getElementById(form.name + ':btnPdf');
			var qtdeCheckboxes = 0;
			var qtdeCheckboxesDesabilitados = 0;
			
			objBtnConsultarExcel.disabled = false;
			objBtnConsultarTxt.disabled = false;
			objBtnConsultarPdf.disabled = false;
	
			for ( var i = 0; i < checkboxes.length; i++) {
				if (checkboxes[i].type === 'checkbox') {
					if (checkboxes[i].checked === true) {
						qtdeCheckboxes++;
						if (qtdeCheckboxes > 12) {
							chk.checked = false;
							alert('\u00c9 permitida a sele\u00e7\u00e3o de at\u00e9 12 balancetes');
							return;
						}
					}
					else{
						qtdeCheckboxesDesabilitados++;
					}
	
					if(qtdeCheckboxesDesabilitados === checkboxes.length){
						objBtnConsultarExcel.disabled = true;
						objBtnConsultarTxt.disabled = true;
						objBtnConsultarPdf.disabled = true;
					}
				}
			}
		}

		function desbloquearTela(){
			showDiv(false);
		}
	
	</script>
 
 </f:verbatim>

</brArq:form>