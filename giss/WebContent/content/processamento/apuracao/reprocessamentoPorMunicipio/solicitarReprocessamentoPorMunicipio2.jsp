<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="reprocessamentoMunicipio2Form" name="reprocessamentoMunicipio2Form">
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid style="margin-top:20px" />
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_informacoes_processamento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid style="margin-top:20px" />
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estadoCombo" value="#{reprocessamentoPorMunicipioBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{reprocessamentoPorMunicipioBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>	
		
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_data_inicial}:" />

			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial','reprocessamentoMunicipioForm:txtAnoInicial');" 
		    	value="#{reprocessamentoPorMunicipioBean.periodoMesInicial}" size="3" maxlength="2" id="txtMesInicial" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesInicial', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorMunicipioBean.periodoAnoInicial}" 
		    	size="6" maxlength="4" id="txtAnoInicial" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoInicial',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px"/>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.apuracao_reprocessamento_municipio_data_final}:" />
			
			<br:brInputText styleClass="HtmlInputTextBradesco" 
		    	onkeyup="proximoCampo(2,'reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal','reprocessamentoMunicipioForm:txtAnoFinal');" 
		    	value="#{reprocessamentoPorMunicipioBean.periodoMesFinal}" size="3" maxlength="2" id="txtMesFinal" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtMesFinal', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">	
	    	</br:brInputText>
	    	
	    	<br:brPanelGroup style="width: 5px"/>

	    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{reprocessamentoPorMunicipioBean.periodoAnoFinal}" 
		    	size="6" maxlength="4" id="txtAnoFinal" onkeypress="aplicamascara('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoFinal',numeros);" onblur="validarData('reprocessamentoMunicipioForm','reprocessamentoMunicipioForm:txtAnoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
	    	</br:brInputText>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="float: right">
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_pesquisar}" action="#{reprocessamentoPorMunicipioBean.pesquisarListaMunicipioEstadoPeriodo}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{reprocessamentoPorMunicipioBean.mostraTabela}">
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
			<t:dataTable id="dataTable" value="#{reprocessamentoPorMunicipioBean.listaMunicipiosEstadoPeriodo}" var="result" rows="50" 
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px" rowIndexVar="municipioRowKey">
			<t:column width="30px" style="padding-right:5px; padding-left:5px">
				<f:facet name="header">
			      <t:selectBooleanCheckbox id="todos" value="#{reprocessamentoPorMunicipioBean.checkTodos}">
			      	<a4j:support event="onclick" action="#{reprocessamentoPorMunicipioBean.atribuirMunicipioTodos}" reRender="dataTable, panelBotoes"/>
			      </t:selectBooleanCheckbox>
			    </f:facet>	   	
		   		<t:selectBooleanCheckbox id="sor" styleClass="HtmlSelectOneRadioBradesco" value="#{result.radio}">
					<f:selectItems value="#{reprocessamentoPorMunicipioBean.listaControleCheckRadio}"/>
					<a4j:support event="onclick" action="#{reprocessamentoPorMunicipioBean.atribuirMunicipio}" reRender="dataTable, panelBotoes">
						<a4j:actionparam name="municipioRowParam" value="#{municipioRowKey}" assignTo="#{reprocessamentoPorMunicipioBean.municipioLinhaSelecionada}"/>
					</a4j:support>
				</t:selectBooleanCheckbox>	
			 </t:column>
			 <t:column width="100px" style="padding-right:5px; padding-left:5px">
			 	<f:facet name="header">
			    <br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_codigo}" />
			    </f:facet>
			   	<br:brOutputText value="#{result.codigo}"style="float:left;" />
			 </t:column>
			 <t:column width="350px" style="padding-right:5px; padding-left:5px;">
			 	<f:facet name="header">
			    <br:brOutputText value="#{msgs.apuracao_reprocessamento_municipio_municipio}" />
			    </f:facet>
			    <br:brOutputText value="#{result.municipio}"style="float:left;" />
		     </t:column>		
			 </t:dataTable>	
		</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup >		
		    	<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{reprocessamentoPorMunicipioBean.paginarListaMunicipios}" rendered="#{reprocessamentoPorMunicipioBean.listaMunicipiosEstadoPeriodo != null && reprocessamentoPorMunicipioBean.mostraTabela}" >
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
	
		<br:brPanelGrid id="panelBotoes" columns="1" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_voltar}" action="#{reprocessamentoPorMunicipioBean.voltar}" disabled="false">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
				
				<br:brPanelGroup style="width: 615px;" />
				
				<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.apuracao_reprocessamento_municipio_prosseguir}" action="#{reprocessamentoPorMunicipioBean.prosseguirContasMunicipios}" disabled="#{empty reprocessamentoPorMunicipioBean.listaMunicipioSelecionados}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
			</br:brPanelGroup>		
		</br:brPanelGrid>
	</br:brPanelGrid>
</br:brPanelGrid>

<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{reprocessamentoPorMunicipioBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>