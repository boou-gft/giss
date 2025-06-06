<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="gerarBalanceteObrigacoesAcessoriasForm" name="gerarBalanceteObrigacoesAcessoriasForm">

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

<h:inputHidden id="hdnCondicaoIncluirExcluir" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.condicaoIncluirExcluir}"/>

	<t:selectOneRadio id="fechadoSimulado" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.fechadoSimulado}"
	 	styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">  
		<f:selectItem itemValue="1" itemLabel="" />
		<f:selectItem itemValue="2" itemLabel="" />
	</t:selectOneRadio>

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_parametros}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:20px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_empresa}:" />
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_empresa_fixa}" />
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_estado}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_codigo_municipio}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_municipio}:" />
		</br:brPanelGroup>

		<br:brPanelGroup style="width:200px">
			<br:brSelectOneMenu id="estado" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.estado}" onchange="carregarMunicipiosBalancetesObrigacoesAcessorias();"> 
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.listarEstadosBalancetes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brInputText id="codMunicipio" maxlength="10" size="12" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.codMunicipio}" onkeypress="return validaTecla('0123456789', event);" onchange="carregarMunicipioBalancetesObrigacoesAcessorias();" disabled="#{gerarBalanceteObrigacoesAcessoriasBean.habilitarCodMunicipio}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brSelectOneMenu id="municipio" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.municipio}" onchange="carregarCodMunicipioObrigacoesAcessorias();" disabled="#{gerarBalanceteObrigacoesAcessoriasBean.habilitarCodMunicipio}">
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.listarMunicipiosBalancetes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_grupo_7}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_grupo_8}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_todos_grupos}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:200px">
			<t:selectBooleanCheckbox id="grupo7" style="margin-left:30px" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.grupo7}" styleClass="HtmlSelectBooleanCheckboxBradesco" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<t:selectBooleanCheckbox id="grupo8" style="margin-left:30px" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.grupo8}" styleClass="HtmlSelectBooleanCheckboxBradesco" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<t:selectBooleanCheckbox id="todosGrupos" style="margin-left:30px" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.todosGrupos}" styleClass="HtmlSelectBooleanCheckboxBradesco" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_botao_incluir}" onclick="verificarIncluirObrigacoesAcessorias('#{msgs.gerar_balancete_obrigacoes_acessorias_confirma_inclusao}');" action="#{gerarBalanceteObrigacoesAcessoriasBean.incluir}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brCommandButton id="btnExcluir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_botao_excluir}" onclick="verificarExcluirObrigacoesAcessorias('#{msgs.gerar_balancete_obrigacoes_acessorias_confirma_exclusao}');" action="#{gerarBalanceteObrigacoesAcessoriasBean.excluir}" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:295px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo}:" />
		</br:brPanelGroup>

		<br:brPanelGroup style="width:180px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_fechado}:" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_simulado}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
		</br:brPanelGroup>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup style="width:95px">
				<br:brInputText styleClass="HtmlInputTextBradesco" style="margin-right:5px"
			    	onkeyup="proximoCampo(2,'gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesInicial','gerarBalanceteObrigacoesAcessoriasForm:anoInicial');" 
			    	value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.periodoMesInicial}" size="3" maxlength="2" id="mesInicial" onkeypress="aplicamascara('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesInicial',numeros);" onblur="validarData('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesInicial', 'mes', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_dia}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_mes}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_ano}');">	
		    	</br:brInputText>

		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.periodoAnoInicial}" 
			    	size="6" maxlength="4" id="anoInicial" onkeypress="aplicamascara('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:anoInicial',numeros);" onblur="validarData('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:anoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
		    	</br:brInputText>
		    </br:brPanelGroup>
		    
		    <br:brPanelGroup>
		    	<br:brOutputText style="font-style: bold;margin-left:5px;margin-right:7px" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_ate}:" />
		    </br:brPanelGroup>
		    
		    <br:brPanelGroup style="width:165px">	
		    	<br:brInputText styleClass="HtmlInputTextBradesco" style="margin-right:5px"
			    	onkeyup="proximoCampo(2,'gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesFinal','gerarBalanceteObrigacoesAcessoriasForm:anoFinal');" 
			    	value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.periodoMesFinal}" size="3" maxlength="2" id="mesFinal" onkeypress="aplicamascara('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesFinal',numeros);" onblur="validarData('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:mesFinal', 'mes', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_dia}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_mes}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_ano}');">	
		    	</br:brInputText>

		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.periodoAnoFinal}" 
			    	size="6" maxlength="4" id="anoFinal" onkeypress="aplicamascara('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:anoFinal',numeros);" onblur="validarData('gerarBalanceteObrigacoesAcessoriasForm','gerarBalanceteObrigacoesAcessoriasForm:anoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
		    	</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGroup style="width:285px">
			<br:brPanelGroup style="margin-left:25px;margin-right:55px" id="fechado">
				<t:radio for=":gerarBalanceteObrigacoesAcessoriasForm:fechadoSimulado" index="0" />
			</br:brPanelGroup>

			<br:brPanelGroup id="simulado">
				<t:radio for=":gerarBalanceteObrigacoesAcessoriasForm:fechadoSimulado" index="1" />
			</br:brPanelGroup>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnGerarBalancete" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_obrigacoes_acessorias_botao_gerar_balancete}" action="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalancete}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:12px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>	
			<f:verbatim> <div id="rolagem" style="width:750px;"> </f:verbatim>


	    	<t:dataTable id="dataTable" value="#{gerarBalanceteObrigacoesAcessoriasBean.listarBalancetesParametrizados}" rowIndexVar="parametroKey" var="result" rows="100" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px">
			 	<t:column width="25px" >
					<f:facet name="header">
			      		<br:brOutputText value="" style="font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    	</f:facet>		
					<t:selectOneRadio onclick="habilitarBotaoExcluirObrigacoesAcessorias();" value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.itemSelecionadoListarBalancetesParametrizados}" id="sor" style="cursor:hand" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
						<f:selectItems value="#{gerarBalanceteObrigacoesAcessoriasBean.gerarBalanceteObrigacoesAcessoriasDTO.listaControleBalancetesParametrizados}"/>
					</t:selectOneRadio>
		    		<t:radio for="sor" index="#{parametroKey}" />
				</t:column>
			    
			  	<t:column width="110px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_codigo_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codMunicipio}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="190px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.descMunicipio}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="60px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_sigla_uf}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.siglaUf}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="90px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_grupo_7}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codGrupo7}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="90px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_grupo_8}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codGrupo8}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			  	
			  	<t:column width="100px">
			    	<f:facet name="header">
			      		<br:brOutputText value="#{msgs.gerar_balancete_obrigacoes_acessorias_label_lista_todos_grupos}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    	</f:facet>
			    	<br:brOutputText value="#{result.codDemaisGrupos}" style="margin-left:6 px;float:left;"/>
			  	</t:column>
			</t:dataTable>
			

		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<brArq:pdcDataScroller id="dataScroller" for="dataTable"  actionListener="#{gerarBalanceteObrigacoesAcessoriasBean.paginar}" rendered="#{gerarBalanceteObrigacoesAcessoriasBean.listarBalancetesParametrizados != null}">
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
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brCommandButton id="btnCarregarMunicipios" style="display:none;" action="#{gerarBalanceteObrigacoesAcessoriasBean.carregarMunicipios}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>
	
	<br:brCommandButton id="btnCarregarCodMunicipio" style="display:none;" action="#{gerarBalanceteObrigacoesAcessoriasBean.carregarCodMunicipio}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>

	<br:brCommandButton id="btnCarregarMunicipio" style="display:none;" action="#{gerarBalanceteObrigacoesAcessoriasBean.carregarMunicipio}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>

	<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_limpar}" action="#{gerarBalanceteObrigacoesAcessoriasBean.limpar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>				
	</br:brPanelGrid>
</br:brPanelGrid>

</brArq:form>